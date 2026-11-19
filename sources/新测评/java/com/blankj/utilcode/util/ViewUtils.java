package com.blankj.utilcode.util;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;

/* loaded from: classes3.dex */
public class ViewUtils {
    public static void fixScrollViewTopping(View view) {
        view.setFocusable(false);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setFocusable(false);
            if (childAt instanceof ViewGroup) {
                fixScrollViewTopping(childAt);
            }
        }
    }

    public static boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Utils.getApp().getResources().getConfiguration().getLocales().get(0)) == 1;
    }

    public static View layoutId2View(@LayoutRes int i10) {
        return ((LayoutInflater) Utils.getApp().getSystemService("layout_inflater")).inflate(i10, (ViewGroup) null);
    }

    public static void runOnUiThread(Runnable runnable) {
        UtilsBridge.runOnUiThread(runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10) {
        UtilsBridge.runOnUiThreadDelayed(runnable, j10);
    }

    public static void setViewEnabled(View view, boolean z9) {
        setViewEnabled(view, z9, null);
    }

    public static void setViewEnabled(View view, boolean z9, View... viewArr) {
        if (view == null) {
            return;
        }
        if (viewArr != null) {
            for (View view2 : viewArr) {
                if (view == view2) {
                    return;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                setViewEnabled(viewGroup.getChildAt(i10), z9, viewArr);
            }
        }
        view.setEnabled(z9);
    }
}
