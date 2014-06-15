package com.codelious.combinaciones.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.codelious.combinaciones.dao.SeccionDAO;
import com.codelious.combinaciones.model.SeccionDTO;
import com.codelious.combinaciones.records.RelSubSeccionRecord;

public class SeccionController {

	private SeccionDAO seccionDao = new SeccionDAO();

	public SeccionController() {
		super();

		// obiene todas las secciones a relacionar
		SeccionDTO[] listaSecciones = seccionDao.readAll();
		System.out.println("listaSecciones # " + listaSecciones.length);

		// transforma el arreglo en arrayList
		ArrayList<SeccionDTO> listaSeccionesArray = new ArrayList<SeccionDTO>(
				Arrays.asList(listaSecciones));

		// combina las relaciones
		ArrayList<ArrayList<SeccionDTO>> listaRelaciones = combinarRelaciones(listaSeccionesArray);

		// crear lista records con relaciones
		RelSubSeccionRecord[] records = new RelSubSeccionRecord[listaRelaciones
				.size()];

		// mostrar las relaciones combinadas
		System.out.println("Relaciones Combinadas # " + listaRelaciones.size());
		for (int i = 0; i < listaRelaciones.size(); i++) {

			// obteniendo la relacion
			ArrayList<SeccionDTO> relacion = listaRelaciones.get(i);

			// nuevo record
			RelSubSeccionRecord record = new RelSubSeccionRecord(i, 1, relacion
					.get(0).getId(), relacion.get(0).getListaLlaves()[0],
					relacion.get(1).getId(),
					relacion.get(1).getListaLlaves()[0]);

			records[i] = record;

		}

		for (int i = 0; i < records.length; i++) {
			RelSubSeccionRecord record = records[i];
			System.out.println("record-> [" + record.getRelSubSeccionId()
					+ "][" + record.getSeccionPadreId() + "]["
					+ record.getSeccionAId() + "][" + record.getLlaveA() + "]["
					+ record.getSeccionBId() + "][" + record.getLlaveB() + "]");
		}

	}

	private ArrayList<ArrayList<SeccionDTO>> combinarRelaciones(
			ArrayList<SeccionDTO> listaSecciones) {

		ArrayList<ArrayList<SeccionDTO>> listaRelaciones = new ArrayList<ArrayList<SeccionDTO>>();

		// recorriendo la lista de secciones
		for (int i = 0; i < listaSecciones.size(); i++) {

			// extrayendo el primer elemento de la relacion
			SeccionDTO elem1 = listaSecciones.get(i);

			for (int j = 0; j < listaSecciones.size(); j++) {

				// extrayendo el segundo elemento de la relacion
				SeccionDTO elem2 = listaSecciones.get(j);

				// no se debe relacionar asi mismo ni repetir en ningun orden
				if (!elem1.getId().equals(elem2.getId())) {

					// nueva relacion de 2 elementos
					ArrayList<SeccionDTO> relacion = new ArrayList<SeccionDTO>();
					relacion.add(0, elem1);
					relacion.add(1, elem2);

					// busca en lista de combinaciones
					int existe = 0;
					for (int k = 0; k < listaRelaciones.size(); k++) {
						if (listaRelaciones.get(k).contains(elem1)
								&& listaRelaciones.get(k).contains(elem2)) {
							existe++;
						}
					}
					// si no se encuentra la combinacion entonces se agrega a la
					// lista
					if (existe == 0) {
						listaRelaciones.add(relacion);
					}
				}
			}
		}
		return listaRelaciones;
	}

	private List<List<Integer>> combinarHijos(List<Integer> listaIds) {

		List<List<Integer>> listaCombinada = new ArrayList<List<Integer>>();

		// recorriendo la lista de Ids
		for (int i = 0; i < listaIds.size(); i++) {

			// extrayendo el primer elemento de la combinacion
			Integer elem1 = listaIds.get(i);

			for (int j = 0; j < listaIds.size(); j++) {

				// extrayendo el segundo elemento de la combinacion
				Integer elem2 = listaIds.get(j);

				// no se debe combinar asi mismo ni repetir en ningun orden
				if (!elem1.equals(elem2)) {

					// nueva lista de 2 elementos para combinacion
					List<Integer> comb = new ArrayList<Integer>();
					comb.add(elem1);
					comb.add(elem2);

					// busca en lista de combinaciones
					int existe = 0;
					for (int k = 0; k < listaCombinada.size(); k++) {
						if (listaCombinada.get(k).contains(elem1)
								&& listaCombinada.get(k).contains(elem2)) {
							existe++;
						}
					}

					// si no se encuentra la combinacion entonces se agrega a la
					// lista
					if (existe == 0) {
						listaCombinada.add(comb);
					}
				}
			}

		}

		return listaCombinada;

	}
}
