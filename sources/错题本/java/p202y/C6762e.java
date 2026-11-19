package p202y;

import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import io.reactivex.internal.operators.observable.C5712h;

/* renamed from: y.e */
/* loaded from: classes2.dex */
public final class C6762e {

    /* renamed from: e */
    public static final C5712h f11430e = new C5712h(10);

    /* renamed from: a */
    public final Object f11431a;

    /* renamed from: b */
    public final InterfaceC6761d f11432b;

    /* renamed from: c */
    public final String f11433c;

    /* renamed from: d */
    public volatile byte[] f11434d;

    public C6762e(String str, Object obj, InterfaceC6761d interfaceC6761d) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f11433c = str;
        this.f11431a = obj;
        this.f11432b = interfaceC6761d;
    }

    /* renamed from: a */
    public static C6762e m6435a(Object obj, String str) {
        return new C6762e(str, obj, f11430e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6762e) {
            return this.f11433c.equals(((C6762e) obj).f11433c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11433c.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m91p(new StringBuilder("Option{key='"), this.f11433c, "'}");
    }
}
