package tv.cjump.jni;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public class NativeBitmapFactory {

    /* renamed from: a */
    public static Field f20243a = null;

    /* renamed from: b */
    public static boolean f20244b = false;

    /* renamed from: c */
    public static boolean f20245c = false;

    /* renamed from: a */
    public static Bitmap m18957a(int i10, int i11, Bitmap.Config config) {
        return m18958b(i10, i11, config, config.equals(Bitmap.Config.ARGB_8888));
    }

    /* renamed from: b */
    public static Bitmap m18958b(int i10, int i11, Bitmap.Config config, boolean z10) {
        return (!f20244b || f20243a == null) ? Bitmap.createBitmap(i10, i11, config) : m18959c(i10, i11, config, z10);
    }

    /* renamed from: c */
    public static Bitmap m18959c(int i10, int i11, Bitmap.Config config, boolean z10) {
        return createBitmap(i10, i11, m18960d(config), z10);
    }

    private static native Bitmap createBitmap(int i10, int i11, int i12, boolean z10);

    private static native Bitmap createBitmap19(int i10, int i11, int i12, boolean z10);

    /* renamed from: d */
    public static int m18960d(Bitmap.Config config) {
        try {
            Field field = f20243a;
            if (field == null) {
                return 0;
            }
            return field.getInt(config);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: e */
    public static void m18961e() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Bitmap.Config.class.getDeclaredField("nativeInt");
            f20243a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            f20243a = null;
            e10.printStackTrace();
        }
    }

    /* renamed from: f */
    public static boolean m18962f() {
        return f20244b && f20243a != null;
    }

    /* renamed from: g */
    public static void m18963g() throws NoSuchFieldException, SecurityException {
        if (f20245c) {
            return;
        }
        if (!DeviceUtils.m18954g() && !DeviceUtils.m18955h()) {
            f20245c = true;
            f20244b = false;
            return;
        }
        if (f20244b) {
            return;
        }
        try {
            f20245c = true;
            f20244b = false;
        } catch (Error e10) {
            e10.printStackTrace();
            f20245c = true;
            f20244b = false;
        } catch (Exception e11) {
            e11.printStackTrace();
            f20245c = true;
            f20244b = false;
        }
        if (f20244b) {
            if (init()) {
                m18961e();
                if (!m18965i()) {
                    release();
                    f20245c = true;
                    f20244b = false;
                }
            } else {
                release();
                f20245c = true;
                f20244b = false;
            }
        }
        Log.e("NativeBitmapFactory", "loaded" + f20244b);
    }

    /* renamed from: h */
    public static void m18964h() {
        if (f20244b) {
            release();
        }
        f20243a = null;
        f20244b = false;
    }

    /* renamed from: i */
    public static boolean m18965i() {
        if (f20243a == null) {
            return false;
        }
        Bitmap bitmapM18959c = null;
        try {
            try {
                bitmapM18959c = m18959c(2, 2, Bitmap.Config.ARGB_8888, true);
                boolean zIsPremultiplied = bitmapM18959c != null && bitmapM18959c.getWidth() == 2 && bitmapM18959c.getHeight() == 2;
                if (zIsPremultiplied) {
                    if (!bitmapM18959c.isPremultiplied()) {
                        bitmapM18959c.setPremultiplied(true);
                    }
                    Canvas canvas = new Canvas(bitmapM18959c);
                    Paint paint = new Paint();
                    paint.setColor(SupportMenu.CATEGORY_MASK);
                    paint.setTextSize(20.0f);
                    canvas.drawRect(0.0f, 0.0f, bitmapM18959c.getWidth(), bitmapM18959c.getHeight(), paint);
                    canvas.drawText("TestLib", 0.0f, 0.0f, paint);
                    zIsPremultiplied = bitmapM18959c.isPremultiplied();
                }
                if (bitmapM18959c != null) {
                    bitmapM18959c.recycle();
                }
                return zIsPremultiplied;
            } catch (Error unused) {
                if (bitmapM18959c != null) {
                    bitmapM18959c.recycle();
                }
                return false;
            } catch (Exception e10) {
                Log.e("NativeBitmapFactory", "exception:" + e10.toString());
                if (bitmapM18959c != null) {
                    bitmapM18959c.recycle();
                }
                return false;
            }
        } catch (Throwable th) {
            if (bitmapM18959c != null) {
                bitmapM18959c.recycle();
            }
            throw th;
        }
    }

    private static native boolean init();

    private static native boolean release();
}
