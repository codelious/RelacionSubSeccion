package com.codelious.combinaciones.dao;

import com.codelious.combinaciones.model.SeccionDTO;

public class SeccionDAO {

	public SeccionDTO[] readAll() {

		// simulando acceso a db

		SeccionDTO seccionA = new SeccionDTO(1, "A", new String[] { "LlaveA" });
		SeccionDTO seccionB = new SeccionDTO(2, "B", new String[] { "LlaveB" });
		SeccionDTO seccionC = new SeccionDTO(3, "C", new String[] { "LlaveC" });
		SeccionDTO seccionD = new SeccionDTO(4, "D", new String[] { "LlaveD" });
		SeccionDTO seccionE = new SeccionDTO(5, "E", new String[] { "LlaveD" });
		SeccionDTO seccionF = new SeccionDTO(6, "F", new String[] { "LlaveD" });
		SeccionDTO seccionG = new SeccionDTO(7, "G", new String[] { "LlaveD" });
		SeccionDTO seccionH = new SeccionDTO(8, "H", new String[] { "LlaveD" });
		SeccionDTO seccionI = new SeccionDTO(9, "I", new String[] { "LlaveD" });
		SeccionDTO seccionJ = new SeccionDTO(10, "J", new String[] { "LlaveD" });
		SeccionDTO seccionK = new SeccionDTO(11, "K", new String[] { "LlaveD" });

		SeccionDTO[] listaSecciones = new SeccionDTO[] { seccionA, seccionB,
				seccionC, seccionD, seccionE, seccionF, seccionG, seccionH,
				seccionI, seccionJ, seccionK };

		return listaSecciones;

	}

}
