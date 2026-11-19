package coil3.network;

import androidx.collection.AbstractC0584a;
import coil3.C3304j;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.network.l */
/* loaded from: classes2.dex */
public final class C3323l {

    /* renamed from: a */
    public final String f2020a;

    /* renamed from: b */
    public final String f2021b;

    /* renamed from: c */
    public final C3322k f2022c;

    /* renamed from: d */
    public final C3304j f2023d;

    public C3323l(String str, String str2, C3322k c3322k, C3304j c3304j) {
        this.f2020a = str;
        this.f2021b = str2;
        this.f2022c = c3322k;
        this.f2023d = c3304j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3323l)) {
            return false;
        }
        C3323l c3323l = (C3323l) obj;
        return AbstractC5830k.m5325b(this.f2020a, c3323l.f2020a) && AbstractC5830k.m5325b(this.f2021b, c3323l.f2021b) && AbstractC5830k.m5325b(this.f2022c, c3323l.f2022c) && AbstractC5830k.m5325b(this.f2023d, c3323l.f2023d);
    }

    public final int hashCode() {
        return this.f2023d.f1996a.hashCode() + ((this.f2022c.f2019a.hashCode() + AbstractC0584a.m903d(this.f2020a.hashCode() * 31, 31, this.f2021b)) * 961);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f2020a + ", method=" + this.f2021b + ", headers=" + this.f2022c + ", body=null, extras=" + this.f2023d + ')';
    }
}
