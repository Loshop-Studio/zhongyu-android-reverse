package p078i4;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import com.zykj.huiwei.launcher.app.App;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6531a {

    /* renamed from: a */
    public static final a f8362a = new a(null);

    /* renamed from: b */
    public static List f8363b;

    /* renamed from: i4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Resources m7292a(Resources resources, int i6) throws IllegalAccessException, SecurityException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            m7293b(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i6);
            return resources;
        }

        /* renamed from: b */
        public final void m7293b(Resources resources, float f6) throws IllegalAccessException, SecurityException, IllegalArgumentException {
            resources.getDisplayMetrics().xdpi = f6;
            App.INSTANCE.m5206a().getResources().getDisplayMetrics().xdpi = f6;
            m7295d(resources, f6);
        }

        /* renamed from: c */
        public final void m7294c(Resources resources, float f6) throws IllegalAccessException, IllegalArgumentException {
            List list = AbstractC6531a.f8363b;
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object obj = ((Field) it.next()).get(resources);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.util.DisplayMetrics");
                    ((DisplayMetrics) obj).xdpi = f6;
                } catch (Exception e6) {
                    Log.e("AdaptScreenUtils", "applyMetricsFields: " + e6);
                }
            }
        }

        /* renamed from: d */
        public final void m7295d(Resources resources, float f6) throws IllegalAccessException, SecurityException, IllegalArgumentException {
            if (AbstractC6531a.f8363b != null) {
                m7294c(resources, f6);
                return;
            }
            AbstractC6531a.f8363b = new ArrayList();
            Class<?> superclass = resources.getClass();
            Intrinsics.checkNotNull(superclass);
            Field[] declaredFields = superclass.getDeclaredFields();
            while (true) {
                Intrinsics.checkNotNull(declaredFields);
                if (declaredFields.length == 0) {
                    return;
                }
                Iterator it = ArrayIteratorKt.iterator(declaredFields);
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                        field.setAccessible(true);
                        Intrinsics.checkNotNull(field);
                        DisplayMetrics displayMetricsM7296e = m7296e(resources, field);
                        if (displayMetricsM7296e != null) {
                            List list = AbstractC6531a.f8363b;
                            Intrinsics.checkNotNull(list);
                            list.add(field);
                            displayMetricsM7296e.xdpi = f6;
                        }
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    return;
                } else {
                    declaredFields = superclass.getDeclaredFields();
                }
            }
        }

        /* renamed from: e */
        public final DisplayMetrics m7296e(Resources resources, Field field) throws IllegalAccessException, IllegalArgumentException {
            try {
                Object obj = field.get(resources);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.util.DisplayMetrics");
                return (DisplayMetrics) obj;
            } catch (Exception e6) {
                Log.e("AdaptScreenUtils", "getMetricsFromField: " + e6);
                return null;
            }
        }

        /* renamed from: f */
        public final int m7297f(float f6) {
            return (int) (((f6 * App.INSTANCE.m5206a().getResources().getDisplayMetrics().xdpi) / 72.0f) + 0.5d);
        }

        public a() {
        }
    }
}
