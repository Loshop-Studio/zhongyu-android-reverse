package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;
import p011b0.C1020c;

/* renamed from: androidx.core.view.d */
/* loaded from: classes.dex */
public final class C0341d {

    /* renamed from: a */
    private final Object f2733a;

    private C0341d(Object obj) {
        this.f2733a = obj;
    }

    /* renamed from: e */
    static C0341d m1922e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0341d(obj);
    }

    /* renamed from: a */
    public int m1923a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2733a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int m1924b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2733a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m1925c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2733a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m1926d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2733a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0341d.class != obj.getClass()) {
            return false;
        }
        return C1020c.m4773a(this.f2733a, ((C0341d) obj).f2733a);
    }

    public int hashCode() {
        Object obj = this.f2733a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2733a + "}";
    }
}
