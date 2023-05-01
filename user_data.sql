-- Table: public.user_data

-- DROP TABLE IF EXISTS public.user_data;

CREATE TABLE
IF NOT EXISTS public.user_data
(
    id integer NOT NULL DEFAULT nextval
('user_data_id_seq'::regclass),
    name character varying
(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying
(255) COLLATE pg_catalog."default" NOT NULL,
    password character varying
(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT user_data_pkey PRIMARY KEY
(id),
    CONSTRAINT user_data_email_key UNIQUE
(email)
)

TABLESPACE pg_default;

ALTER TABLE
IF EXISTS public.user_data
    OWNER to postgres;