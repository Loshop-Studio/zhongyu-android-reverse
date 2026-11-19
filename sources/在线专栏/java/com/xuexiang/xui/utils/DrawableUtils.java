package com.xuexiang.xui.utils;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.security.InvalidParameterException;
import p073d.C2443a;
import p156u.C3403a;

/* loaded from: classes.dex */
public final class DrawableUtils {
    private static final Canvas CANVAS = new Canvas();
    private static final String TAG = "DrawableUtils";

    private DrawableUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(ResUtils.getResources(), bitmap);
    }

    public static Bitmap createBitmapFromView(View view, float f4) {
        int height;
        Drawable drawable;
        if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null && (drawable instanceof BitmapDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        view.clearFocus();
        int i4 = 0;
        if (view instanceof ScrollView) {
            height = 0;
            while (true) {
                ScrollView scrollView = (ScrollView) view;
                if (i4 >= scrollView.getChildCount()) {
                    break;
                }
                height += scrollView.getChildAt(i4).getHeight();
                i4++;
            }
        } else if (view instanceof NestedScrollView) {
            height = 0;
            while (true) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (i4 >= nestedScrollView.getChildCount()) {
                    break;
                }
                height += nestedScrollView.getChildAt(i4).getHeight();
                i4++;
            }
        } else {
            height = view.getHeight();
        }
        Bitmap bitmapCreateBitmapSafely = createBitmapSafely((int) (view.getWidth() * f4), (int) (height * f4), Bitmap.Config.ARGB_8888, 1);
        if (bitmapCreateBitmapSafely != null) {
            Canvas canvas = CANVAS;
            synchronized (canvas) {
                canvas.setBitmap(bitmapCreateBitmapSafely);
                canvas.save();
                canvas.drawColor(-1);
                canvas.scale(f4, f4);
                view.draw(canvas);
                canvas.restore();
                canvas.setBitmap(null);
            }
        }
        return bitmapCreateBitmapSafely;
    }

    public static Bitmap createBitmapFromWebView(WebView webView) {
        return createBitmapFromWebView(webView, 1.0f);
    }

    public static Bitmap createBitmapSafely(int i4, int i5, Bitmap.Config config, int i6) {
        if (i4 > 0 && i5 > 0) {
            try {
                return Bitmap.createBitmap(i4, i5, config);
            } catch (OutOfMemoryError e4) {
                e4.printStackTrace();
                if (i6 > 0) {
                    System.gc();
                    return createBitmapSafely(i4, i5, config, i6 - 1);
                }
            }
        }
        return null;
    }

    public static BitmapDrawable createCircleDrawableWithText(Resources resources, int i4, int i5, String str, float f4, int i6) {
        if (i4 <= 0) {
            throw new InvalidParameterException("bitmap size must be > 0!");
        }
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new InvalidParameterException("text size must be > 0!");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i5);
        float f5 = i4 / 2;
        canvas.drawCircle(f5, f5, f5, paint);
        paint.setColor(i6);
        paint.setTextSize(f4);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, f5, getBaselineDistance(paint) + f5, paint);
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    public static GradientDrawable createCircleGradientDrawable(int i4, int i5, int i6, float f4, float f5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{i4, i5});
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius(i6);
        gradientDrawable.setGradientCenter(f4, f5);
        return gradientDrawable;
    }

    public static BitmapDrawable createDrawableWithSize(Resources resources, int i4, int i5, int i6, int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (i7 == 0) {
            i7 = 0;
        }
        if (i6 > 0) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(i7);
            RectF rectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, i4, i5);
            float f4 = i6;
            canvas.drawRoundRect(rectF, f4, f4, paint);
        } else {
            canvas.drawColor(i7);
        }
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    public static LayerDrawable createItemSeparatorBg(int i4, int i5, int i6, boolean z3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(i4);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable2.getPaint().setColor(i5);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2});
        layerDrawable.setLayerInset(1, 0, z3 ? i6 : 0, 0, z3 ? 0 : i6);
        return layerDrawable;
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static float getBaselineDistance(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f4 = fontMetrics.bottom;
        return ((f4 - fontMetrics.top) / 2.0f) - f4;
    }

    public static Bitmap getBitmapByDrawableId(Context context, int i4) {
        return drawable2Bitmap(ResUtils.getDrawable(context, i4));
    }

    public static StateListDrawable getDrawable(int i4) {
        return getDrawable(i4, ColorUtils.getRandomColor());
    }

    public static GradientDrawable getSolidRectDrawable(int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i4);
        gradientDrawable.setColor(i5);
        gradientDrawable.setGradientType(1);
        return gradientDrawable;
    }

    public static StateListDrawable getStateListDrawable(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_pressed}, drawable);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, drawable2);
        stateListDrawable.addState(new int[0], getSolidRectDrawable(10, -7829368));
        return stateListDrawable;
    }

    public static Drawable getSupportRTLDrawable(Drawable drawable) {
        return getSupportRTLDrawable(drawable, false);
    }

    public static Drawable getVectorDrawable(Context context, int i4) {
        try {
            return C2443a.m8169d(context, i4);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    public static Drawable rotate(Drawable drawable, int i4, float f4, float f5, boolean z3) {
        return bitmap2Drawable(rotate(drawable2Bitmap(drawable), i4, f4, f5, z3));
    }

    public static ColorFilter setDrawableTintColor(Drawable drawable, int i4) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(Color.argb(255, 0, 0, 0), i4);
        if (drawable != null) {
            drawable.setColorFilter(lightingColorFilter);
        }
        return lightingColorFilter;
    }

    public static Drawable setTint(Drawable drawable, int i4) {
        if (drawable != null) {
            C3403a.m10397n(drawable, i4);
        }
        return drawable;
    }

    public static Drawable setTintList(Drawable drawable, ColorStateList colorStateList) {
        if (drawable != null) {
            C3403a.m10398o(drawable, colorStateList);
        }
        return drawable;
    }

    public static Bitmap vectorDrawableToBitmap(Context context, int i4) {
        Drawable vectorDrawable = getVectorDrawable(context, i4);
        if (vectorDrawable != null) {
            return drawable2Bitmap(vectorDrawable);
        }
        return null;
    }

    public static Bitmap createBitmapFromWebView(WebView webView, float f4) {
        webView.clearFocus();
        int contentHeight = (int) (webView.getContentHeight() * webView.getScale());
        Bitmap bitmapCreateBitmapSafely = createBitmapSafely((int) (webView.getWidth() * f4), (int) (contentHeight * f4), Bitmap.Config.ARGB_8888, 1);
        int height = webView.getHeight();
        if (bitmapCreateBitmapSafely != null) {
            Canvas canvas = CANVAS;
            synchronized (canvas) {
                canvas.setBitmap(bitmapCreateBitmapSafely);
                canvas.drawColor(-1);
                canvas.scale(f4, f4);
                while (contentHeight > 0) {
                    contentHeight = contentHeight < height ? 0 : contentHeight - height;
                    canvas.save();
                    canvas.clipRect(0, contentHeight, canvas.getWidth(), contentHeight + height);
                    webView.scrollTo(0, contentHeight);
                    webView.draw(canvas);
                    canvas.restore();
                }
                canvas.setBitmap(null);
            }
        }
        return bitmapCreateBitmapSafely;
    }

    public static StateListDrawable getDrawable(int i4, int i5) {
        return getDrawable(i4, ColorUtils.darker(i5, 0.8f), i5);
    }

    public static Drawable getSupportRTLDrawable(Drawable drawable, boolean z3) {
        return ResUtils.isRtl() ? rotate(drawable, 180, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, z3) : drawable;
    }

    public static Bitmap rotate(Bitmap bitmap, int i4, float f4, float f5, boolean z3) {
        if (isEmptyBitmap(bitmap) || bitmap.isRecycled()) {
            return null;
        }
        if (i4 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i4, f4, f5);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static StateListDrawable getDrawable(int i4, int i5, int i6) {
        return getStateListDrawable(getSolidRectDrawable(i4, i5), getSolidRectDrawable(i4, i6));
    }

    public static Bitmap createBitmapSafely(Bitmap bitmap, int i4, int i5, int i6, int i7, int i8) {
        if (i4 >= 0 && i5 >= 0 && i6 > 0 && i7 > 0) {
            try {
                return Bitmap.createBitmap(bitmap, i4, i5, i6, i7);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            } catch (OutOfMemoryError e5) {
                e5.printStackTrace();
                if (i8 <= 0) {
                    return null;
                }
                System.gc();
                return createBitmapSafely(bitmap, i4, i5, i6, i7, i8 - 1);
            }
        }
        return null;
    }

    public static Bitmap createBitmapFromView(View view) {
        return createBitmapFromView(view, 1.0f);
    }

    public static Bitmap createBitmapFromView(View view, int i4, int i5, int i6, int i7) {
        Bitmap bitmapCreateBitmapSafely;
        Bitmap bitmapCreateBitmapFromView = createBitmapFromView(view);
        if (bitmapCreateBitmapFromView == null || (bitmapCreateBitmapSafely = createBitmapSafely((view.getWidth() - i6) - i4, (view.getHeight() - i5) - i7, Bitmap.Config.ARGB_8888, 1)) == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmapSafely);
        Rect rect = new Rect(i4, i5, view.getWidth() - i6, view.getHeight() - i7);
        Rect rect2 = new Rect(0, 0, (view.getWidth() - i6) - i4, (view.getHeight() - i5) - i7);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmapCreateBitmapFromView, rect, rect2, (Paint) null);
        bitmapCreateBitmapFromView.recycle();
        return bitmapCreateBitmapSafely;
    }
}
