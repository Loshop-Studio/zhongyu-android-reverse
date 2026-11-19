package p125n7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.AbstractC6044y;

/* renamed from: n7.p */
/* loaded from: classes4.dex */
public final class C6241p extends AbstractC6250y {

    /* renamed from: a */
    public final boolean f9987a;

    /* renamed from: b */
    public final String f9988b;

    public C6241p(String body, boolean z8) {
        AbstractC5830k.m5330g(body, "body");
        this.f9987a = z8;
        this.f9988b = body.toString();
    }

    @Override // p125n7.AbstractC6250y
    /* renamed from: a */
    public final String mo5854a() {
        return this.f9988b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6241p.class != obj.getClass()) {
            return false;
        }
        C6241p c6241p = (C6241p) obj;
        return this.f9987a == c6241p.f9987a && AbstractC5830k.m5325b(this.f9988b, c6241p.f9988b);
    }

    public final int hashCode() {
        return this.f9988b.hashCode() + (Boolean.hashCode(this.f9987a) * 31);
    }

    @Override // p125n7.AbstractC6250y
    public final String toString() {
        boolean z8 = this.f9987a;
        String str = this.f9988b;
        if (!z8) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC6044y.m5728a(sb, str);
        return sb.toString();
    }
}
