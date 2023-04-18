DROP TABLE IF EXISTS departamentos;
DROP TABLE IF EXISTS empleados;

CREATE TABLE IF NOT EXISTS departamentos (
						codigo INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
                        presupuesto INT DEFAULT NULL,
						PRIMARY KEY(codigo)
						);
                        
CREATE TABLE IF NOT EXISTS empleados (
						dni VARCHAR(8) NOT NULL,
						nombre VARCHAR(100) DEFAULT NULL,
						apellidos VARCHAR(255) DEFAULT NULL,
						departamento INT DEFAULT NULL,
						PRIMARY KEY(dni),
						CONSTRAINT empleados_fk FOREIGN KEY (departamento) REFERENCES departamentos (codigo)
                        ON DELETE CASCADE ON UPDATE CASCADE
						);
                        

INSERT INTO departamentos (nombre, presupuesto) VALUES ('QUIMICA', 500000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('FISICA', 500000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('INFORMATICA', 400000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('MATEMATICAS', 300000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('GIMNASIA', 200000);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345678', 'Aitor', 'Iglesias Pubill', 1);
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345679', 'Pablo', 'Hernandez Gomez', 1);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345671', 'Camila', 'Garcia Perez', 2);
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345672', 'Javier', 'Perez Hernandez', 2);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345673', 'Fran', 'Ostras Pubill', 3);
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345674', 'Jose', 'Ugli Opla', 3);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345675', 'Isa', 'Puledo Ocula', 4);
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345676', 'Paola', 'Sanchez Fernandez', 4);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345677', 'Marc', 'Saez Crespo', 5);
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('12345687', 'Victor', 'Iglesias Pubill', 5);

