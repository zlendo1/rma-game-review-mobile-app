package ba.unsa.etf.gamespirala.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import ba.unsa.etf.gamespirala.R

object HomeFragmentDirections {
    fun actionHomeToDetails(gameTitle: String): NavDirections =
        object : NavDirections {
            override val actionId: Int
                get() = R.id.action_home_to_gameDetails

            override val arguments: Bundle
                get() {
                    val bundle = Bundle()
                    bundle.putString("game_title", gameTitle)

                    return bundle
                }
        }
}