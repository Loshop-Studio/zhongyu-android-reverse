package p000a.p005b.p007d.p008a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p000a.p005b.p014h.C0090k0;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.d.a.a */
/* loaded from: classes.dex */
public final class C0034a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f211a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<Object>> f212b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f213c = new Object();

    /* renamed from: a */
    public static Drawable m129a(Context context, int i) {
        return C0090k0.m349d().m356f(context, i);
    }
}
