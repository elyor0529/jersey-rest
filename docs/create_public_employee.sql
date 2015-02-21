CREATE TABLE employee
(
    employee_id INT NOT NULL,
    full_name VARCHAR(50),
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    position_id INT,
    position_title VARCHAR(50),
    store_id INT,
    department_id INT,
    birth_date TIMESTAMP,
    hire_date TIMESTAMP,
    end_date TIMESTAMP,
    salary DOUBLE PRECISION,
    supervisor_id INT,
    education_level VARCHAR(50),
    marital_status VARCHAR(1),
    gender VARCHAR(1),
    management_role VARCHAR(20)
);
