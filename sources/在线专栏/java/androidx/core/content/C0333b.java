package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import p011b0.C1025h;

/* renamed from: androidx.core.content.b */
/* loaded from: classes.dex */
public final class C0333b {

    /* renamed from: a */
    private final String f2672a;

    /* renamed from: b */
    private final LocusId f2673b;

    /* renamed from: androidx.core.content.b$a */
    private static class a {
        /* renamed from: a */
        static LocusId m1828a(String str) {
            return new LocusId(str);
        }
    }

    public C0333b(String str) {
        this.f2672a = (String) C1025h.m4784h(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2673b = a.m1828a(str);
        } else {
            this.f2673b = null;
        }
    }

    /* renamed from: b */
    private String m1825b() {
        return this.f2672a.length() + "_chars";
    }

    /* renamed from: a */
    public String m1826a() {
        return this.f2672a;
    }

    /* renamed from: c */
    public LocusId m1827c() {
        return this.f2673b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0333b.class != obj.getClass()) {
            return false;
        }
        C0333b c0333b = (C0333b) obj;
        String str = this.f2672a;
        return str == null ? c0333b.f2672a == null : str.equals(c0333b.f2672a);
    }

    public int hashCode() {
        String str = this.f2672a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m1825b() + "]";
    }
}
