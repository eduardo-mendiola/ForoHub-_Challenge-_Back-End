-- Creación de la tabla Respuesta
CREATE TABLE Respuesta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    mensaje TEXT NOT NULL,
    topico INT,
    fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    autor INT,
    solucion BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (topico) REFERENCES Topico(id),
    FOREIGN KEY (autor) REFERENCES Usuario(id)
);