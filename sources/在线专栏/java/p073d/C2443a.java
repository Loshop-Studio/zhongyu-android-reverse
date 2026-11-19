package p073d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0237w;
import androidx.core.content.C0332a;
import java.util.WeakHashMap;
import p148s.C3363a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: d.a */
/* loaded from: classes.dex */
public final class C2443a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f10000a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<a>> f10001b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f10002c = new Object();

    /* renamed from: d.a$a */
    private static class a {

        /* renamed from: a */
        final ColorStateList f10003a;

        /* renamed from: b */
        final Configuration f10004b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f10003a = colorStateList;
            this.f10004b = configuration;
        }
    }

    /* renamed from: a */
    private static void m8166a(Context context, int i4, ColorStateList colorStateList) {
        synchronized (f10002c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = f10001b;
            SparseArray<a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i4, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m8167b(Context context, int i4) {
        a aVar;
        synchronized (f10002c) {
            SparseArray<a> sparseArray = f10001b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i4)) != null) {
                if (aVar.f10004b.equals(context.getResources().getConfiguration())) {
                    return aVar.f10003a;
                }
                sparseArray.remove(i4);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m8168c(Context context, int i4) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i4);
        }
        ColorStateList colorStateListM8167b = m8167b(context, i4);
        if (colorStateListM8167b != null) {
            return colorStateListM8167b;
        }
        ColorStateList colorStateListM8171f = m8171f(context, i4);
        if (colorStateListM8171f == null) {
            return C0332a.m1805c(context, i4);
        }
        m8166a(context, i4, colorStateListM8171f);
        return colorStateListM8171f;
    }

    /* renamed from: d */
    public static Drawable m8169d(Context context, int i4) {
        return C0237w.m1017h().m1026j(context, i4);
    }

    /* renamed from: e */
    private static TypedValue m8170e() {
        ThreadLocal<TypedValue> threadLocal = f10000a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m8171f(Context context, int i4) throws Resources.NotFoundException {
        if (m8172g(context, i4)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C3363a.m10184a(resources, resources.getXml(i4), context.getTheme());
        } catch (Exception e4) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m8172g(Context context, int i4) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        TypedValue typedValueM8170e = m8170e();
        resources.getValue(i4, typedValueM8170e, true);
        int i5 = typedValueM8170e.type;
        return i5 >= 28 && i5 <= 31;
    }
}
