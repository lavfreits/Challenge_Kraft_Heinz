-- Gerado por Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   em:        2023-05-31 23:53:48 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE USER rm97497 IDENTIFIED BY ACCOUNT UNLOCK ;

-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE rm97497.t_desperdicio (
    qt_tx_dis               NUMBER NOT NULL,
    dt_medicao              DATE NOT NULL,
    qt_meta_desperdicio     NUMBER NOT NULL,
    dt_meta                 DATE NOT NULL,
    ds_possui_iniciativa    VARCHAR2(3 BYTE) NOT NULL,
    ds_iniciativa           VARCHAR2(100 BYTE) NOT NULL,
    dt_conclusao_iniciativa DATE NOT NULL
)
LOGGING;

CREATE UNIQUE INDEX rm97497.t_desperdicio_pk ON
    rm97497.t_desperdicio (
        qt_tx_dis
    ASC );

ALTER TABLE rm97497.t_desperdicio ADD CONSTRAINT t_desperdicio_pk PRIMARY KEY ( qt_tx_dis );

CREATE TABLE rm97497.t_monitoramento (
    mr_indicador                  NUMBER NOT NULL,
    dt_referencia                 DATE NOT NULL,
    t_reduc_agua_qt_uagua_lt      NUMBER NOT NULL,
    t_refeicoes_qt_refei_b        NUMBER NOT NULL,
    t_reducao_acucar_qt_racucar_m FLOAT(2) NOT NULL,
    t_desperdicio_qt_tx_dis       NUMBER NOT NULL
)
LOGGING;

CREATE UNIQUE INDEX rm97497.t_monitoramento__idx ON
    rm97497.t_monitoramento (
        t_reducao_acucar_qt_racucar_m
    ASC );

CREATE UNIQUE INDEX rm97497.t_monitoramento__idxv1 ON
    rm97497.t_monitoramento (
        t_desperdicio_qt_tx_dis
    ASC );

CREATE UNIQUE INDEX rm97497.t_monitoramento__idxv2 ON
    rm97497.t_monitoramento (
        t_reduc_agua_qt_uagua_lt
    ASC );

CREATE UNIQUE INDEX rm97497.t_monitoramento__idxv3 ON
    rm97497.t_monitoramento (
        t_refeicoes_qt_refei_b
    ASC );

CREATE UNIQUE INDEX rm97497.t_monitoramento_pk ON
    rm97497.t_monitoramento (
        mr_indicador
    ASC );

ALTER TABLE rm97497.t_monitoramento ADD CONSTRAINT t_monitoramento_pk PRIMARY KEY ( mr_indicador );

CREATE TABLE rm97497.t_reduc_agua (
    qt_uagua_lt             NUMBER NOT NULL,
    qt_meta_reducao_lt      NUMBER NOT NULL,
    dt_medicao              DATE NOT NULL,
    dt_meta                 DATE NOT NULL,
    ds_pssui_iniciat        VARCHAR2(3 BYTE) NOT NULL,
    ds_iniciativa           VARCHAR2(100 BYTE) NOT NULL,
    dt_conclusao_iniciativa DATE NOT NULL
)
LOGGING;

CREATE UNIQUE INDEX rm97497.t_reduc_agua_pk ON
    rm97497.t_reduc_agua (
        qt_uagua_lt
    ASC );

ALTER TABLE rm97497.t_reduc_agua ADD CONSTRAINT t_reduc_agua_pk PRIMARY KEY ( qt_uagua_lt );

CREATE TABLE rm97497.t_reducao_acucar (
    qt_racucar_m               FLOAT(2) NOT NULL,
    qt_meta_reduc_acucar_total VARCHAR2(20 BYTE) NOT NULL,
    dt_medicao                 DATE NOT NULL,
    dt_meta                    DATE NOT NULL,
    ds_possui_iniciativas      VARCHAR2(3 BYTE) NOT NULL,
    ds_iniciativa              VARCHAR2(100 BYTE) NOT NULL,
    dt_conclusao_iniciativa    DATE NOT NULL
)
LOGGING;

CREATE UNIQUE INDEX rm97497.t_reducao_acucar_pk ON
    rm97497.t_reducao_acucar (
        qt_racucar_m
    ASC );

ALTER TABLE rm97497.t_reducao_acucar ADD CONSTRAINT t_reducao_acucar_pk PRIMARY KEY ( qt_racucar_m );

CREATE TABLE rm97497.t_refeicoes (
    qt_refei_b                   NUMBER NOT NULL,
    qt_mrefeicoes_totais_bilhoes NUMBER NOT NULL,
    dt_medicao                   DATE NOT NULL,
    dt_meta                      DATE NOT NULL,
    ds_possui_iniciativas        VARCHAR2(3 BYTE) NOT NULL,
    ds_iniciativa                VARCHAR2(100 BYTE) NOT NULL,
    dt_conclusao_iniciativa      DATE NOT NULL
)
LOGGING;

CREATE UNIQUE INDEX rm97497.t_refeicoes_pk ON
    rm97497.t_refeicoes (
        qt_refei_b
    ASC );

ALTER TABLE rm97497.t_refeicoes ADD CONSTRAINT t_refeicoes_pk PRIMARY KEY ( qt_refei_b );

ALTER TABLE rm97497.t_monitoramento
    ADD CONSTRAINT t_monit_t_desperdicio_fk FOREIGN KEY ( mr_indicador )
        REFERENCES rm97497.t_desperdicio ( qt_tx_dis )
    NOT DEFERRABLE;

ALTER TABLE rm97497.t_monitoramento
    ADD CONSTRAINT t_monit_t_red_acucar_fk FOREIGN KEY ( t_reducao_acucar_qt_racucar_m )
        REFERENCES rm97497.t_reducao_acucar ( qt_racucar_m )
    NOT DEFERRABLE;

ALTER TABLE rm97497.t_monitoramento
    ADD CONSTRAINT t_monit_t_red_agua_fk FOREIGN KEY ( t_reduc_agua_qt_uagua_lt )
        REFERENCES rm97497.t_reduc_agua ( qt_uagua_lt )
    NOT DEFERRABLE;

ALTER TABLE rm97497.t_monitoramento
    ADD CONSTRAINT t_monit_t_refeicoes_fk FOREIGN KEY ( t_refeicoes_qt_refei_b )
        REFERENCES rm97497.t_refeicoes ( qt_refei_b )
    NOT DEFERRABLE;



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             9
-- ALTER TABLE                              9
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              1
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
