/*
 * @file MyView.kt
 * @author dkalita
 *
 * Copyright (c) 2004-2015. Parallels IP Holdings GmbH. All rights reserved.
 * http://www.parallels.com
 */
package com.example.android.navigationdrawer

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.TextView

public class MyView : TextView {
    public constructor(context: Context) : super(context) {
    }

    public constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
    }

    public constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        setText("Hello Kotlin")
    }
}
