package com.eidev.santandertravel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListPoiActivity : AppCompatActivity() {

    private lateinit var poiList: ArrayList<Poi>
    private lateinit var poisAdapter: PoisAdapter
    private lateinit var poisRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_poi)

        poisRecyclerView = findViewById(R.id.pois_recycler_view)
        poiList = createMockupPois()
        poisAdapter = PoisAdapter(poiList)
        poisRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poisAdapter
            setHasFixedSize(false)
        }

    }

    private fun createMockupPois(): ArrayList<Poi> {
        return arrayListOf(
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://i.ytimg.com/vi/cS11tYGoZFs/maxresdefault.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/481px-Cat03.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            ),
            Poi(
                name = "test",
                shortDetail = "test",
                punctuation = 5,
                urlPicture = "https://www.vanguardia.com/binrepository/716x477/0c0/0d0/none/12204/ITOC/web_ecolo001_big_ce_VL142422_MG22138284.jpg"
            )

        )
    }
}