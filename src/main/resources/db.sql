CREATE EXTENSION "uuid-ossp";
SELECT uuid_generate_v4();

DROP TABLE IF EXISTS ttolibrary;
CREATE TABLE IF NOT EXISTS ttolibrary (
  id      UUID PRIMARY KEY,
  name    VARCHAR(128),
  created DATE,
  user1   VARCHAR(16)
);

DROP TABLE IF EXISTS ttd;
CREATE TABLE IF NOT EXISTS ttd (
  id       UUID PRIMARY KEY,
  name     VARCHAR(1536),
  ttdcode  INT,
  ts       VARCHAR(2048),
  numnodes INT,
  updated  TIMESTAMP,
  created  TIMESTAMP
);

DROP TABLE IF EXISTS crystal_structures;
CREATE TABLE IF NOT EXISTS crystal_structures (
  id                   UUID PRIMARY KEY,
  cf_structural        VARCHAR(256),
  cf_sum               VARCHAR(128),
  chem_name_systematic VARCHAR(1024),
  created              TIMESTAMP,
  remark               VARCHAR(8),
  updated              TIMESTAMP
);

DROP TABLE IF EXISTS ref_structure_databases;
CREATE TABLE IF NOT EXISTS ref_structure_databases (
  id   INT PRIMARY KEY,
  name VARCHAR(128)
);

DROP TABLE IF EXISTS ref_representation_type;
CREATE TABLE IF NOT EXISTS ref_representation_type (
  rep_code   INT PRIMARY KEY,
  rep_name   VARCHAR(64),
  rep_method INT
);

DROP TABLE IF EXISTS tto;
CREATE TABLE IF NOT EXISTS tto (
  id           UUID PRIMARY KEY,
  refcode      VARCHAR(8) NOT NULL,
  dimen        CHARACTER  NOT NULL,
  ttdid        UUID,
  ttolibraryid UUID,
  ttdcode      INT,
  z            INT,
  reprtypecode INT,
  fwc          INT,
  structureid  UUID,
  created      TIMESTAMP,
  msrc         SMALLINT,
  CONSTRAINT fk_ttd
  FOREIGN KEY (ttdid)
  REFERENCES ttd (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_ttolibrary
  FOREIGN KEY (ttolibraryid)
  REFERENCES ttolibrary (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_reprtypecode
  FOREIGN KEY (reprtypecode)
  REFERENCES ref_representation_type (rep_code)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_structure_cr
  FOREIGN KEY (structureid)
  REFERENCES crystal_structures (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
);

DROP TABLE IF EXISTS link_database_structure;
CREATE TABLE IF NOT EXISTS link_database_structure (
  id           UUID PRIMARY KEY,
  refcode      VARCHAR(8),
  structure_id UUID,
  csd_id       INT,
  created      TIMESTAMP,
  CONSTRAINT fk_structure
  FOREIGN KEY (structure_id)
  REFERENCES crystal_structures (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_csd
  FOREIGN KEY (csd_id)
  REFERENCES ref_structure_databases (id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
);