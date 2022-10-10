package nl.hva.task01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import nl.hva.task01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var places = arrayListOf<Place>()
    private val placeAdapter = PlaceAdapter(places)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initViews() {
        binding.rvPlaces.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
        binding.rvPlaces.adapter = placeAdapter

        places.addAll(generatePlaces())
        placeAdapter.notifyDataSetChanged()
    }

    /**
     * Give back an arraylist with places. For now hardcoded. Later in the course we
     * are going to work with dynamic data.
     */
    private fun generatePlaces(): ArrayList<Place> {
        return arrayListOf(
            Place("Amsterdam Dam", R.drawable.amsterdam_dam),
            Place("Amsterdam Weesperplein", R.drawable.amsterdam_weesperplein),
            Place("Rotterdam Euromast", R.drawable.rotterdam_euromast),
            Place("Den Haag Binnenhof", R.drawable.den_haag_binnenhof),
            Place("Utrecht Dom", R.drawable.utrecht_dom),
            Place("Groningen Martinitoren", R.drawable.groningen_martinitoren),
            Place("Maastricht Vrijthof", R.drawable.maastricht_vrijthof),
            Place("New York Vrijheidsbeeld", R.drawable.new_york_vrijheidsbeeld),
            Place("San Francisco Golden Gate", R.drawable.san_francisco_golden_gate),
            Place("Yellowstone Old Faithful", R.drawable.yellowstone_old_faithful),
            Place("Yosemite Half Dome", R.drawable.yosemite_half_dome),
            Place("Washington White House", R.drawable.washington_white_house),
            Place("Ottawa Parliament Hill", R.drawable.ottawa_parliament_hill),
            Place("Londen Tower Bridge", R.drawable.london_tower_bridge),
            Place("Brussel Manneken Pis", R.drawable.brussel_manneken_pis),
            Place("Berlijn Reichstag", R.drawable.berlijn_reichstag),
            Place("Parijs Eiffeltoren", R.drawable.parijs_eiffeltoren),
            Place("Barcelona Sagrada Familia", R.drawable.barcelona_sagrada_familia),
            Place("Rome Colosseum", R.drawable.rome_colosseum),
            Place("Pompeii", R.drawable.pompeii),
            Place("Kopenhagen", R.drawable.kopenhagen),
            Place("Oslo", R.drawable.oslo),
            Place("Stockholm", R.drawable.stockholm),
            Place("Helsinki", R.drawable.helsinki),
            Place("Moskou Rode Plein", R.drawable.moskou_rode_plein),
            Place("Beijing Verboden Stad", R.drawable.beijing_verboden_stad),
            Place("Kaapstad Tafelberg", R.drawable.kaapstad_tafelberg),
            Place("Rio de Janeiro Copacabana", R.drawable.rio_de_janeiro_copacabana),
            Place("Sydney Opera", R.drawable.sydney_opera),
            Place("Hawaii Honolulu", R.drawable.hawaii),
            Place("Alaska Denali", R.drawable.alaska_denali)
        )
    }
}