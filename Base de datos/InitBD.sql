INSERT INTO `grupo15`.`departamento` (`id_departamento`, `departamento`) VALUES ('1', 'tecnologia');
INSERT INTO `grupo15`.`departamento` (`id_departamento`, `departamento`) VALUES ('2', 'turismo');

INSERT INTO `grupo15`.`carrera` (`id_carrera`, `carrera`, `id_departamento`) VALUES ('1', 'sistemas', '1');
INSERT INTO `grupo15`.`carrera` (`id_carrera`, `carrera`, `id_departamento`) VALUES ('2', 'geologia', '2');

INSERT INTO `grupo15`.`materia` (`id_materia`, `codigo_materia`, `materia`, `id_carrera`) VALUES ('1', '2345', 'oo1', '1');
INSERT INTO `grupo15`.`materia` (`id_materia`, `codigo_materia`, `materia`, `id_carrera`) VALUES ('2', '4567', 'oo2', '2');

INSERT INTO `grupo15`.`edificio` (`id_edificio`, `edificio`) VALUES ('1', 'Hernandez');
INSERT INTO `grupo15`.`edificio` (`id_edificio`, `edificio`) VALUES ('2', 'Scalabrini');

INSERT INTO `grupo15`.`aula` (`id_aula`, `numero`, `id_edificio`) VALUES ('1', '20', '1');
INSERT INTO `grupo15`.`aula` (`id_aula`, `numero`, `id_edificio`) VALUES ('2', '11', '1');

INSERT INTO `grupo15`.`tradicional` (`cantidad_bancos`, `pizarron`, `tiene_proyectos`, `id_tradicional`) VALUES ('50', 'tiza', b'1', b'1');

INSERT INTO `grupo15`.`laboratorio` (`cantidad_pc`, `cantidad_sillas`, `id_laboratorio`) VALUES ('30', '60', '2');



SELECT * FROM grupo15.departamento;
SELECT * FROM grupo15.carrera;
SELECT * FROM grupo15.materia;
SELECT * FROM grupo15.edificio;
SELECT * FROM grupo15.aula;
SELECT * FROM grupo15.tradicional;
SELECT * FROM grupo15.laboratorio;
