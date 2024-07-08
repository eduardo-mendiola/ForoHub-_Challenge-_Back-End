CREATE TABLE Usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    perfiles INT,
    activo TINYINT DEFAULT 1,
    FOREIGN KEY (perfiles) REFERENCES Perfil(id)
);
