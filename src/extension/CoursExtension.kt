package zortek.openclassroom.extension

import zortek.openclassroom.model.Cours

fun Cours.debug() = System.out.println("Je suis une fonction de debug de Cours : " +  toString());
