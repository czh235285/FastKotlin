package c.core.sample.ui.fragment

import android.view.View
import c.core.ex.anko.generateView
import c.core.sample.base.AnkoFragment
import c.core.sample.ui.layout.ThirdFragmentUI

class ThirdFragment private constructor() : AnkoFragment() {
    val ui = ThirdFragmentUI()

    override fun ankoLayout(): View {
        return ui.generateView(this)
    }

    override fun afterInitView() = Unit

    companion object {
        val instance: ThirdFragment = ThirdFragment()
    }
}
