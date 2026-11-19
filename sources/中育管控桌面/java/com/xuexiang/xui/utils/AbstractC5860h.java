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
/* loaded from: classes3.dex */
public abstract class AbstractC5860h {
    /* renamed from: a */
    public static Object m4397a(Object obj, Class cls) {
        if (cls == null || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public static void m4398b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: c */
    public static int m4399c(AbsListView absListView) {
        ListAdapter listAdapter;
        if (absListView == null || (listAdapter = (ListAdapter) absListView.getAdapter()) == null) {
            return 0;
        }
        int measuredHeight = 0;
        for (int i6 = 0; i6 < listAdapter.getCount(); i6++) {
            View view = listAdapter.getView(i6, null, absListView);
            if (view instanceof ViewGroup) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            }
            view.measure(0, 0);
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight + absListView.getPaddingTop() + absListView.getPaddingBottom();
    }

    /* renamed from: d */
    public static Drawable m4400d(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 0).loadIcon(packageManager);
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static Application m4401e() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("you should init first");
        } catch (ClassNotFoundException e6) {
            e6.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (NoSuchMethodException e8) {
            e8.printStackTrace();
            throw new NullPointerException("you should init first");
        } catch (InvocationTargetException e9) {
            e9.printStackTrace();
            throw new NullPointerException("you should init first");
        }
    }

    /* renamed from: f */
    public static Bitmap m4402f(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: g */
    public static int m4403g(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: h */
    public static int m4404h(ListView listView) {
        ListAdapter adapter;
        int count;
        int iM4399c = m4399c(listView);
        return (listView == null || (adapter = listView.getAdapter()) == null || (count = adapter.getCount()) <= 0) ? iM4399c : iM4399c + (listView.getDividerHeight() * (count - 1));
    }

    /* renamed from: i */
    public static int m4405i(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: j */
    public static int m4406j() {
        return m4403g(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: k */
    public static boolean m4407k(int i6) {
        return Math.sqrt(((((double) (Color.red(i6) * Color.red(i6))) * 0.241d) + (((double) (Color.green(i6) * Color.green(i6))) * 0.691d)) + (((double) (Color.blue(i6) * Color.blue(i6))) * 0.068d)) > 130.0d;
    }

    /* renamed from: l */
    public static void m4408l(View view) {
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
    public static void m4409m(Context context, View view, int i6) {
        if (view == null) {
            return;
        }
        view.setBackground(new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i6)));
    }
}
