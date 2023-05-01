CREATE TABLE
IF NOT EXISTS public.days
(
    date character varying COLLATE pg_catalog."default",
    outfit jsonb,
    user_email character varying COLLATE pg_catalog."default",
    CONSTRAINT unique_date UNIQUE
(date)
)

TABLESPACE pg_default;

ALTER TABLE
IF EXISTS public.days
    OWNER to postgres;