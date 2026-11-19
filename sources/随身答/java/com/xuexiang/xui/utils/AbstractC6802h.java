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

/* renamed from: com.xuexiang.xui.utils.h */
/* loaded from: classes4.dex */
public abstract class AbstractC6802h {
    /* renamed from: a */
    public static Object m6489a(Object obj, Class cls) {
        if (cls == null || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public static int m6490b(AbsListView absListView) {
        ListAdapter listAdapter;
        if (absListView == null || (listAdapter = (ListAdapter) absListView.getAdapter()) == null) {
            return 0;
        }
        int measuredHeight = 0;
        for (int i9 = 0; i9 < listAdapter.getCount(); i9++) {
            View view = listAdapter.getView(i9, null, absListView);
            if (view instanceof ViewGroup) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            }
            view.measure(0, 0);
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight + absListView.getPaddingTop() + absListView.getPaddingBottom();
    }

    /* renamed from: c */
    public static Drawable m6491c(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static Application m6492d() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("you should init first");
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (NoSuchMethodException e12) {
            e12.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (InvocationTargetException e13) {
            e13.printStackTrace();
            throw new NullPointerException("you should init first");
        }
    }

    /* renamed from: e */
    public static Bitmap m6493e(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: f */
    public static int m6494f(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public static int m6495g(ListView listView) {
        ListAdapter adapter;
        int count;
        int iM6490b = m6490b(listView);
        return (listView == null || (adapter = listView.getAdapter()) == null || (count = adapter.getCount()) <= 0) ? iM6490b : iM6490b + (listView.getDividerHeight() * (count - 1));
    }

    /* renamed from: h */
    public static int m6496h(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: i */
    public static int m6497i() {
        return m6494f(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: j */
    public static boolean m6498j(int i9) {
        return Math.sqrt(((((double) (Color.red(i9) * Color.red(i9))) * 0.241d) + (((double) (Color.green(i9) * Color.green(i9))) * 0.691d)) + (((double) (Color.blue(i9) * Color.blue(i9))) * 0.068d)) > 130.0d;
    }

    /* renamed from: k */
    public static void m6499k(View view) {
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
    public static void m6500l(Context context, View view, int i9) {
        view.setBackgroundDrawable(new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i9)));
    }
}
