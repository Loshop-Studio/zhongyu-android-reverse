package p116l2;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.reflect.Field;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p076d2.C2453b;

/* renamed from: l2.g */
/* loaded from: classes.dex */
public final class C2846g {

    /* renamed from: a */
    @NotNull
    public static final C2846g f10951a = new C2846g();

    /* renamed from: b */
    private static boolean f10952b;

    /* renamed from: c */
    @Nullable
    private static Field f10953c;

    private C2846g() {
    }

    /* renamed from: b */
    private final DisplayMetrics m9549b(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        DisplayMetrics displayMetricsM9550c = m9550c(resources);
        if (displayMetricsM9550c != null) {
            return displayMetricsM9550c;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C2769l.m9240d(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    /* renamed from: c */
    private final DisplayMetrics m9550c(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object obj;
        DisplayMetrics displayMetrics = null;
        if (f10952b) {
            Field field = f10953c;
            if (field == null) {
                return null;
            }
            if (field == null) {
                obj = null;
            } else {
                try {
                    obj = field.get(resources);
                } catch (Exception unused) {
                    return null;
                }
            }
            if (obj != null) {
                return (DisplayMetrics) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.util.DisplayMetrics");
        }
        if (C2769l.m9237a("HwResources", resources.getClass().getSimpleName())) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mMetrics");
                f10953c = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field field2 = f10953c;
                Object obj2 = field2 == null ? null : field2.get(resources);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.util.DisplayMetrics");
                }
                displayMetrics = (DisplayMetrics) obj2;
            } catch (Exception unused2) {
                Log.e("AdaptScreenUtils", "no field of mTmpMetrics in resources.");
            }
        }
        f10952b = true;
        return displayMetrics;
    }

    /* renamed from: d */
    private final void m9551d(float f4) {
        C2453b.m8199a().getResources().getDisplayMetrics().xdpi = f4;
    }

    @NotNull
    /* renamed from: a */
    public final Resources m9552a(@NotNull Resources resources, int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        C2769l.m9241e(resources, "resources");
        float f4 = (r0.widthPixels * 72.0f) / i4;
        m9549b(resources).xdpi = f4;
        m9551d(f4);
        return resources;
    }
}
