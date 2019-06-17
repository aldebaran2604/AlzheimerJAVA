SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `usuarios`;
DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `imagenes`;
DROP TABLE IF EXISTS `pacientes`;
DROP TABLE IF EXISTS `usuarios_pacientes`;
DROP TABLE IF EXISTS `examenes`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `usuarios` (
    `id` INTEGER NOT NULL,
    `nombres` VARCHAR(50) NOT NULL,
    `apellido_paterno` VARCHAR(50) NOT NULL,
    `apellido_materno` VARCHAR(50) NOT NULL,
    `fecha_nacimiento` DATE NOT NULL,
    `sexo` VARCHAR(10) NOT NULL,
    `rol_id` INTEGER NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `roles` (
    `id` INTEGER NOT NULL,
    `nombre` VARCHAR(50) NOT NULL,
    `descripcion` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `imagenes` (
    `paciente_id` INTEGER NOT NULL,
    `directorio` TEXT NOT NULL,
    `descripcion` VARCHAR(255) NOT NULL,
    `parentesto` VARCHAR(30) NOT NULL
);

CREATE TABLE `pacientes` (
    `id` INTEGER NOT NULL,
    `nombres` VARCHAR(50) NOT NULL,
    `apellido_paterno` VARCHAR(50) NOT NULL,
    `apellido_materno` VARCHAR(50) NOT NULL,
    `fecha_nacimiento` DATE NOT NULL,
    `sexo` VARCHAR(10) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `usuarios_pacientes` (
    `usuario_id` INTEGER NOT NULL,
    `paciente_id` INTEGER NOT NULL
);

CREATE TABLE `examenes` (
    `id` INTEGER NOT NULL,
    `paciente_id` INTEGER NOT NULL,
    `fecha` DATE NOT NULL,
    `hora_inicio` TIME NOT NULL,
    `hora_final` TIME NOT NULL,
    `total_aciertos` INTEGER NOT NULL,
    `total_errores` INTEGER NOT NULL,
    PRIMARY KEY (`id`)
);

ALTER TABLE `usuarios` ADD FOREIGN KEY (`rol_id`) REFERENCES `roles`(`id`);
ALTER TABLE `imagenes` ADD FOREIGN KEY (`paciente_id`) REFERENCES `pacientes`(`id`);
ALTER TABLE `usuarios_pacientes` ADD FOREIGN KEY (`usuario_id`) REFERENCES `usuarios`(`id`);
ALTER TABLE `usuarios_pacientes` ADD FOREIGN KEY (`paciente_id`) REFERENCES `pacientes`(`id`);
ALTER TABLE `examenes` ADD FOREIGN KEY (`paciente_id`) REFERENCES `pacientes`(`id`);