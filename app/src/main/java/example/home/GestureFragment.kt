package example.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.style.base.BaseFragment
import com.style.framework.R
import example.drag.DragActivity
import example.drag.ScrollingActivity
import example.drag.ScrollingParallaxActivity
import example.drag.SwipeMenuActivity
import example.gesture.DispatchGestureActivity
import example.gesture.SimpleGestureActivity
import example.gesture.TestGestureActivity
import example.softInput.StatusBarStyleMainActivity
import example.viewPagerCards.fragments.CardFragmentActivity
import example.viewPagerCards.views.CardActivity
import kotlinx.android.synthetic.main.fragment_home_gesture.*

class GestureFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_gesture, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        refreshLayout.setEnablePureScrollMode(true)
        view_gesture_direction.setOnClickListener { skip(SimpleGestureActivity::class.java) }
        view_slide_finish.setOnClickListener { skip(DispatchGestureActivity::class.java) }
        view_slide_bottom_finish.setOnClickListener { skip(TestGestureActivity::class.java) }
        view_status_bar_style.setOnClickListener { skip(StatusBarStyleMainActivity::class.java) }
        view_drag_recycler_view.setOnClickListener { skip(DragActivity::class.java) }
        btn_swipe_menu.setOnClickListener { skip(SwipeMenuActivity::class.java) }
        btn_collapseMode_pin.setOnClickListener { skip(ScrollingActivity::class.java) }
        btn_collapseMode_parallax.setOnClickListener { skip(ScrollingParallaxActivity::class.java) }
        btn_view_pager_card_views.setOnClickListener { skip(CardActivity::class.java) }
        btn_view_pager_card_fragments.setOnClickListener { skip(CardFragmentActivity::class.java) }
    }
}