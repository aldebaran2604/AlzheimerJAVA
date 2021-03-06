SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `usuarios`;
DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `imagenes`;
DROP TABLE IF EXISTS `pacientes`;
DROP TABLE IF EXISTS `consultas`;
DROP TABLE IF EXISTS `examenes`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `usuarios` (
    `id` INTEGER AUTO_INCREMENT NOT NULL,
    `nombre_usuario` VARCHAR(20) NOT NULL,
    `nombres` VARCHAR(50) NOT NULL,
    `apellido_paterno` VARCHAR(50) NOT NULL,
    `apellido_materno` VARCHAR(50) NOT NULL,
    `fecha_nacimiento` DATE NOT NULL,
    `sexo` SMALLINT(1) NOT NULL,
    `rol_id` INTEGER NOT NULL,
    `password` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `roles` (
    `id` INTEGER AUTO_INCREMENT NOT NULL,
    `nombre` VARCHAR(50) NOT NULL,
    `descripcion` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `imagenes` (
    `id` INTEGER AUTO_INCREMENT NOT NULL,
    `paciente_id` INTEGER NOT NULL,
    `directorio` VARCHAR(255) NOT NULL,
    `descripcion` VARCHAR(255) NOT NULL,
    `parentesco` VARCHAR(30) NOT NULL,
     PRIMARY KEY (`id`)
);

#CREATE TABLE `parentesco` (
#  `id` INTEGER NOT NULL AUTO_INCREMENT,
#  `descripcion` VARCHAR(50) NOT NULL,
#  PRIMARY KEY (`id`)
#);

CREATE TABLE `pacientes` (
    `id` INTEGER AUTO_INCREMENT NOT NULL,
    `nombres` VARCHAR(50) NOT NULL,
    `apellido_paterno` VARCHAR(50) NOT NULL,
    `apellido_materno` VARCHAR(50) NOT NULL,
    `fecha_nacimiento` DATE NOT NULL,
    `sexo` SMALLINT(1) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `consultas` (
    `id` INTEGER AUTO_INCREMENT NOT NULL,
    `usuario_id` INTEGER NOT NULL,
    `paciente_id` INTEGER NOT NULL,
    `fecha` DATE NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `examenes` (
    `id` INTEGER AUTO_INCREMENT NOT NULL,
    `consulta_id` INTEGER NOT NULL,
    `fecha` DATE NOT NULL,
    `hora_inicio` TIME NOT NULL,
    `hora_final` TIME NOT NULL,
    `total_aciertos` INTEGER NOT NULL,
    `total_errores` INTEGER NOT NULL,
    PRIMARY KEY (`id`)
);

ALTER TABLE `usuarios` ADD FOREIGN KEY (`rol_id`) REFERENCES `roles`(`id`);
ALTER TABLE `imagenes` ADD FOREIGN KEY (`paciente_id`) REFERENCES `pacientes`(`id`);
ALTER TABLE `consultas` ADD FOREIGN KEY (`usuario_id`) REFERENCES `usuarios`(`id`);
ALTER TABLE `consultas` ADD FOREIGN KEY (`paciente_id`) REFERENCES `pacientes`(`id`);
ALTER TABLE `examenes` ADD FOREIGN KEY (`consulta_id`) REFERENCES `consultas`(`id`);
