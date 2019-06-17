package com.example.annonces_immobillieres


class Announces(list:ArrayList<Announce> ) {
    val listAnnonces = list

     fun add_annonce( a:Announce) {

        listAnnonces.add(a)


    }






    companion object {
        val instance = Announces(
            arrayListOf(
                Announce(
                    "Villa",
                    "Alger",
                    "villa top",
                    "15-01-2019",
                    "3.100000",
                    "4.200000",
                    "abderrahmane",
                    "0551466583",
                    "fa_lebdiri@esi.dz",
                    R.drawable.dar1
                ),
                Announce(
                    "appartement",
                    "Alger",
                    "villa top",
                    "15-01-2019",
                    "3.100000",
                    "4.200000",
                    "abderrahmane",
                    "0551466583",
                    "fa_lebdiri@esi.dz",
                    R.drawable.dar2

                ),
                Announce(
                    "Tiraase",
                    "Alger",
                    "villa top",
                    "15-01-2019",
                    "3.100000",
                    "4.200000",
                    "abderrahmane",
                    "0551466583",
                    "fa_lebdiri@esi.dz",
                    R.drawable.dar3
                ),
                Announce(
                    "Villa",
                    "Alger",
                    "villa top",
                    "15-01-2019",
                    "3.100000",
                    "4.200000",
                    "abderrahmane",
                    "0551466583",
                    "fa_lebdiri@esi.dz",
                    R.drawable.dar4
                ),
                Announce(
                    "Villa",
                    "Alger",
                    "villa top",
                    "15-01-2019",
                    "3.100000",
                    "4.200000",
                    "abderrahmane",
                    "0551466583",
                    "fa_lebdiri@esi.dz",
                    R.drawable.dar5
                ),
                Announce(
                    "Villa",
                    "Alger",
                    "villa top",
                    "15-01-2019",
                    "3.100000",
                    "4.200000",
                    "abderrahmane",
                    "0551466583",
                    "fa_lebdiri@esi.dz",
                    R.drawable.dar6
                )
            )
        )

    }





}
