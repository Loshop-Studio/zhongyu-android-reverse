package com.xuexiang.xui.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Utils {
    private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls) {
        if (cls == null || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }

    public static <T> T checkNotNull(T t3, String str) {
        Objects.requireNonNull(t3, str);
        return t3;
    }

    public static void checkNull(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }

    public static void clearImageView(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof ImageView) {
                clearImgMemory((ImageView) view);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                clearImageView(viewGroup.getChildAt(i4));
            }
        }
    }

    public static void clearImgMemory(ImageView imageView) {
        Bitmap bitmap;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        imageView.setImageBitmap(null);
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static void closeIOQuietly(Closeable... closeableArr) throws IOException {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static int getAbsListViewHeightBasedOnChildren(AbsListView absListView) {
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

    public static Drawable getAppIcon(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationInfo(context.getPackageName(), 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static Application getApplicationByReflect() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
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

    public static Bitmap getBitmap(String str) {
        if (isFileExist(str)) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    public static Bitmap getBitmapFromDrawable(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static int getInternalDimensionSize(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int getListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter;
        int count;
        int absListViewHeightBasedOnChildren = getAbsListViewHeightBasedOnChildren(listView);
        return (listView == null || (adapter = listView.getAdapter()) == null || (count = adapter.getCount()) <= 0) ? absListViewHeightBasedOnChildren : absListViewHeightBasedOnChildren + (listView.getDividerHeight() * (count - 1));
    }

    public static int getNumberDigits(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        return (int) (Math.log10(i4) + 1.0d);
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        return context == null ? getStatusBarHeight() : getInternalDimensionSize(context.getResources(), STATUS_BAR_HEIGHT_RES_NAME);
    }

    public static boolean isFileExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static boolean isLight(int i4) {
        return Math.sqrt(((((double) (Color.red(i4) * Color.red(i4))) * 0.241d) + (((double) (Color.green(i4) * Color.green(i4))) * 0.691d)) + (((double) (Color.blue(i4) * Color.blue(i4))) * 0.068d)) > 130.0d;
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isSupportColorAttrs() {
        return true;
    }

    public static void recycleBackground(View view) {
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

    public static Bitmap rotate(Bitmap bitmap, int i4) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i4);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void setBackground(Context context, View view, int i4) {
        if (view == null) {
            return;
        }
        view.setBackground(new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i4)));
    }

    public static ColorFilter setDrawableTintColor(Drawable drawable, int i4) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(Color.argb(255, 0, 0, 0), i4);
        if (drawable != null) {
            drawable.setColorFilter(lightingColorFilter);
        }
        return lightingColorFilter;
    }

    public static Bitmap zoom(Bitmap bitmap, int i4, int i5) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i4 / width, i5 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static int getStatusBarHeight() {
        return getInternalDimensionSize(Resources.getSystem(), STATUS_BAR_HEIGHT_RES_NAME);
    }

    public static Bitmap getBitmapFromDrawable(Drawable drawable, int i4) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i4, PorterDuff.Mode.SRC_IN);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapCopy).drawColor(i4, PorterDuff.Mode.SRC_IN);
        return bitmapCopy;
    }
}
