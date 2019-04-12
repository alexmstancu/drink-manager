USE `drink-manager`;

CREATE TABLE `drink` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(100),
    `year` INT(4),
    `country` VARCHAR(50),
    `color` VARCHAR(20),
    `sweetness` VARCHAR(25),
    `alcohol` INT,
    `drink_type` VARCHAR(16),
    `strength` VARCHAR(30),
    `flavor` VARCHAR(100),
    `region` VARCHAR(50),
    PRIMARY KEY (`id`)
) ENGINE=InnoDB;