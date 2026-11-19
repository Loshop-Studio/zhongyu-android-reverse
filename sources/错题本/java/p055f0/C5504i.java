package p055f0;

import android.support.v4.media.AbstractC0037f;

/* renamed from: f0.i */
/* loaded from: classes2.dex */
public final class C5504i {

    /* renamed from: a */
    public final String f8518a;

    public C5504i(String str) {
        this.f8518a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5504i) {
            return this.f8518a.equals(((C5504i) obj).f8518a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8518a.hashCode();
    }

    public final String toString() {
        return AbstractC0037f.m91p(new StringBuilder("StringHeaderFactory{value='"), this.f8518a, "'}");
    }
}
