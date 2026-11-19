package com.xuexiang.xui.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.xuexiang.xui.utils.g */
/* loaded from: classes2.dex */
public abstract class AbstractC3532g {
    /* renamed from: a */
    public static Object m4079a(Object obj, Class cls) {
        if (cls == null || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public static int m4080b(AbsListView absListView) {
        ListAdapter listAdapter;
        if (absListView == null || (listAdapter = (ListAdapter) absListView.getAdapter()) == null) {
            return 0;
        }
        int measuredHeight = 0;
        for (int i4 = 0; i4 < listAdapter.getCount(); i4++) {
            View view = listAdapter.getView(i4, null, absListView);
            if (view instanceof ViewGroup) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            }
            view.measure(0, 0);
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight + absListView.getPaddingTop() + absListView.getPaddingBottom();
    }

    /* renamed from: c */
    public static Drawable m4081c(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static Application m4082d() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("you should init first");
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (InvocationTargetException e7) {
            e7.printStackTrace();
            throw new NullPointerException("you should init first");
        }
    }

    /* renamed from: e */
    public static Bitmap m4083e(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: f */
    public static int m4084f(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public static int m4085g(ListView listView) {
        ListAdapter adapter;
        int count;
        int iM4080b = m4080b(listView);
        return (listView == null || (adapter = listView.getAdapter()) == null || (count = adapter.getCount()) <= 0) ? iM4080b : iM4080b + (listView.getDividerHeight() * (count - 1));
    }

    /* renamed from: h */
    public static int m4086h(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: i */
    public static int m4087i() {
        return m4084f(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: j */
    public static boolean m4088j(int i4) {
        return Math.sqrt(((((double) (Color.red(i4) * Color.red(i4))) * 0.241d) + (((double) (Color.green(i4) * Color.green(i4))) * 0.691d)) + (((double) (Color.blue(i4) * Color.blue(i4))) * 0.068d)) > 130.0d;
    }

    /* renamed from: k */
    public static void m4089k(View view) {
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

    /* renamed from: l */
    public static void m4090l(Context context, View view, int i4) {
        view.setBackgroundDrawable(new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i4)));
    }
}
