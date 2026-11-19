package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import anet.channel.strategy.dispatch.DispatchConstants;

/* renamed from: com.xuexiang.xui.utils.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8042h {
    /* renamed from: a */
    public static int m12227a(AbsListView absListView) {
        ListAdapter listAdapter;
        if (absListView == null || (listAdapter = (ListAdapter) absListView.getAdapter()) == null) {
            return 0;
        }
        int measuredHeight = 0;
        for (int i10 = 0; i10 < listAdapter.getCount(); i10++) {
            View view = listAdapter.getView(i10, null, absListView);
            if (view instanceof ViewGroup) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            }
            view.measure(0, 0);
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight + absListView.getPaddingTop() + absListView.getPaddingBottom();
    }

    /* renamed from: b */
    public static Drawable m12228b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static Bitmap m12229c(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: d */
    public static int m12230d(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m12231e(ListView listView) {
        ListAdapter adapter;
        int count;
        int iM12227a = m12227a(listView);
        return (listView == null || (adapter = listView.getAdapter()) == null || (count = adapter.getCount()) <= 0) ? iM12227a : iM12227a + (listView.getDividerHeight() * (count - 1));
    }

    /* renamed from: f */
    public static int m12232f(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: g */
    public static int m12233g() {
        return m12230d(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: h */
    public static boolean m12234h(int i10) {
        return Math.sqrt(((((double) (Color.red(i10) * Color.red(i10))) * 0.241d) + (((double) (Color.green(i10) * Color.green(i10))) * 0.691d)) + (((double) (Color.blue(i10) * Color.blue(i10))) * 0.068d)) > 130.0d;
    }

    /* renamed from: i */
    public static boolean m12235i(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: j */
    public static void m12236j(View view) {
        Bitmap bitmap;
        Drawable background = view.getBackground();
        view.setBackgroundResource(0);
        if (background != null && (background instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) background).getBitmap()) != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (background != null) {
            background.setCallback(null);
        }
    }

    /* renamed from: k */
    public static void m12237k(Context context, View view, int i10) {
        view.setBackgroundDrawable(new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i10)));
    }

    /* renamed from: l */
    public static ColorFilter m12238l(Drawable drawable, int i10) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(Color.argb(255, 0, 0, 0), i10);
        if (drawable != null) {
            drawable.setColorFilter(lightingColorFilter);
        }
        return lightingColorFilter;
    }
}
