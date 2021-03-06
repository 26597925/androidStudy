package com.style.base

import android.os.Build
import android.support.annotation.StringRes
import android.text.Html
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.style.framework.R


abstract class BaseTitleBarActivity : BaseActivity() {

    private lateinit var statusBar: View
    private lateinit var tvTitleBase: TextView
    private lateinit var titleBar: LinearLayout

    override fun setContentView(contentView: View) {
        super.setContentView(contentView)
        initTitleBar(contentView)
    }

    open fun initTitleBar(mContentView: View) {
        titleBar = mContentView.findViewById(R.id.title_bar)
        statusBar = mContentView.findViewById(R.id.status_bar)
        val ivBaseToolbarReturn = mContentView.findViewById<ImageView>(R.id.iv_base_toolbar_Return)
        tvTitleBase = mContentView.findViewById(R.id.tv_base_toolbar_title)
        ivBaseToolbarReturn.setOnClickListener { v -> onClickTitleBack() }
    }

    fun setTransparentStatusBarHeight(height: Int) {
        statusBar.layoutParams.height = height
    }

    open fun onClickTitleBack() {
        onBackPressed()
    }

    fun setToolbarTitle(title: String) {
        tvTitleBase.text = title
    }

    fun setToolbarTitle(@StringRes resId: Int) {
        tvTitleBase.text = getContext().getString(resId)
    }
}
