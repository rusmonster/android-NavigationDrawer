package com.example.android.navigationdrawer

import android.app.Activity
import android.content.Intent

/*
 * @file Sample.java
 * @author dkalita
 *
 * Copyright (c) 2004-2015. Parallels IP Holdings GmbH. All rights reserved.
 * http://www.parallels.com
 */

public class Sample(_titleResId: Int, val descriptionResId: Int, val intent: Intent) {

	public val titleResId: Int
		get() = R.string.hi_all

	public val newIntVal: Int = _titleResId

	public constructor(activity: Activity, titleResId: Int, descriptionResId: Int, activityClass: Class<out Activity>)
		: this(titleResId, descriptionResId, Intent(activity, activityClass)) {
	}
}