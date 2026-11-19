package p124n6;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: n6.a */
/* loaded from: classes2.dex */
public final class C6216a {

    /* renamed from: a */
    public final File f9945a;

    /* renamed from: b */
    public final List f9946b;

    public C6216a(File file, List segments) {
        AbstractC5830k.m5330g(segments, "segments");
        this.f9945a = file;
        this.f9946b = segments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6216a)) {
            return false;
        }
        C6216a c6216a = (C6216a) obj;
        return AbstractC5830k.m5325b(this.f9945a, c6216a.f9945a) && AbstractC5830k.m5325b(this.f9946b, c6216a.f9946b);
    }

    public final int hashCode() {
        return this.f9946b.hashCode() + (this.f9945a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f9945a + ", segments=" + this.f9946b + ')';
    }
}
