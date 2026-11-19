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
public abstract class AbstractC6878h {
    /* renamed from: a */
    public static Object m6490a(Object obj, Class cls) {
        if (cls == null || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public static void m6491b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: c */
    public static int m6492c(AbsListView absListView) {
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

    /* renamed from: d */
    public static Drawable m6493d(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 0).loadIcon(packageManager);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static Application m6494e() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
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

    /* renamed from: f */
    public static Bitmap m6495f(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: g */
    public static int m6496g(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: h */
    public static int m6497h(ListView listView) {
        ListAdapter adapter;
        int count;
        int iM6492c = m6492c(listView);
        return (listView == null || (adapter = listView.getAdapter()) == null || (count = adapter.getCount()) <= 0) ? iM6492c : iM6492c + (listView.getDividerHeight() * (count - 1));
    }

    /* renamed from: i */
    public static int m6498i(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: j */
    public static int m6499j() {
        return m6496g(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: k */
    public static boolean m6500k(int i10) {
        return Math.sqrt(((((double) (Color.red(i10) * Color.red(i10))) * 0.241d) + (((double) (Color.green(i10) * Color.green(i10))) * 0.691d)) + (((double) (Color.blue(i10) * Color.blue(i10))) * 0.068d)) > 130.0d;
    }

    /* renamed from: l */
    public static void m6501l(View view) {
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

    /* renamed from: m */
    public static void m6502m(Context context, View view, int i10) {
        if (view == null) {
            return;
        }
        view.setBackground(new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i10)));
    }
}
