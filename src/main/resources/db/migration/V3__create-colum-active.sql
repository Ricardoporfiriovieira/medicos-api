ALTER TABLE med_aplication.med_aplication ADD COLUMN active boolean;
UPDATE med_aplication.med_aplication SET active = true;