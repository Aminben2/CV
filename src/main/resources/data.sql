INSERT INTO country (id, "name") VALUES
(1, 'United States'),
(2, 'United Kingdom'),
(3, 'Canada');

INSERT INTO "language" (id, language_code) VALUES
(1, 'en'), -- English
(2, 'fr'), -- French
(3, 'es'); -- Spanish

INSERT INTO city (id, "name", country_id) VALUES
(1, 'New York', 1),
(2, 'London', 2),
(3, 'Toronto', 3);

INSERT INTO client (id, "name") VALUES
(1, 'Client A'),
(2, 'Client B'),
(3, 'Client C');

INSERT INTO employer (id, "name") VALUES
(1, 'Employer X'),
(2, 'Employer Y'),
(3, 'Employer Z');

INSERT INTO project (id, "name", description) VALUES
(1, 'Project 1', 'Description of Project 1'),
(2, 'Project 2', 'Description of Project 2'),
(3, 'Project 3', 'Description of Project 3');

INSERT INTO sector (id, "name", description) VALUES
(1, 'Sector A', 'Description of Sector A'),
(2, 'Sector B', 'Description of Sector B'),
(3, 'Sector C', 'Description of Sector C');

INSERT INTO certificate (id, "name", description) VALUES
(1, 'Certificate A', 'Description of Certificate A'),
(2, 'Certificate B', 'Description of Certificate B'),
(3, 'Certificate C', 'Description of Certificate C');

INSERT INTO experience_type (id, "name") VALUES
(1, 'Type A'),
(2, 'Type B'),
(3, 'Type C');

INSERT INTO institution (id, "name", city_id) VALUES
(1, 'Institution X', 1),
(2, 'Institution Y', 2),
(3, 'Institution Z', 3);

INSERT INTO "degree" (id, institution_id, title, sector_id) VALUES
(1, 1, 'Bachelor of Science', 1),
(2, 2, 'Bachelor of Arts', 2),
(3, 3, 'Bachelor of Engineering', 3);

INSERT INTO address (id, postal_code, address_description, city_id) VALUES
(1, 10001, 'Address 1', 1),
(2, 20000, 'Address 2', 2),
(3, 30000, 'Address 3', 3);


INSERT INTO education (id, start_date, end_date, degree_id) VALUES
(1, '2020-01-01', '2024-01-01', 1),
(2, '2018-09-01', '2020-06-01', 2),
(3, '2015-09-01', '2018-06-01', 3);

INSERT INTO resume (id, given_name, family_name, formatted_name, birth_date, email, phone_number, address_id, primary_language_id) VALUES
(1, 'John', 'Doe', 'John Doe', '1990-01-01', 'john.doe@example.com', '+1234567890', 1, 1),
(2, 'Jane', 'Smith', 'Jane Smith', '1992-05-15', 'jane.smith@example.com', '+1987654321', 2, 2),
(3, 'Michael', 'Johnson', 'Michael Johnson', '1985-12-10', 'michael.johnson@example.com', '+1122334455', 3, 3);



INSERT INTO language_proficiency (id, language_id, resume_id, listening_level, reading_level, writing_level, interaction_level, production_level) VALUES
(1, 1, 1, 'A1' , 'A1', 'A1', 'C2', 'C1'),
(2, 2, 2, 'A2', 'A2', 'A1', 'B2', 'B1'),
(3, 3, 3, 'A1', 'A2', 'A2', 'A1', 'A1');



INSERT INTO resume_countries (resume_id, countries_id) VALUES
(1, 1),
(2, 2),
(3, 3);

INSERT INTO public.resume_certificates (resume_id, certificates_id) VALUES
(1, 1),
(2, 2),
(3, 3);

INSERT INTO experience (id, title, description, start_date, end_date, city_id, client_id, employer_id, experience_type_id, project_id, resume_id) VALUES
(1, 'Software Engineer', 'Description of experience 1', '2015-01-01', '2020-01-01', 1, 1, 1, 1, 1, 1),
(2, 'Project Manager', 'Description of experience 2', '2018-01-01', '2022-01-01', 2, 2, 2, 2, 2, 2),
(3, 'Marketing Specialist', 'Description of experience 3', '2010-01-01', '2015-01-01', 3, 3, 3, 3, 3, 3);

INSERT INTO public.resume_educations (resume_id, educations_id) VALUES
(1, 1),
(2, 2),
(3, 3);

INSERT INTO skill (id, resume_id, description) VALUES
(1, 1, 'Java Programming'),
(2, 2, 'French Translation'),
(3, 3, 'Marketing Strategy');

