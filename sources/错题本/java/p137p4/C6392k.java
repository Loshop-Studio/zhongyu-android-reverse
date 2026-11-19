package p137p4;

import android.support.v4.media.AbstractC0037f;
import coil3.network.AbstractC3315g;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: p4.k */
/* loaded from: classes3.dex */
public final class C6392k extends AbstractC3315g {

    /* renamed from: b */
    public final String f10483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6392k(String content) {
        super(10);
        AbstractC5830k.m5330g(content, "content");
        this.f10483b = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6392k) && AbstractC5830k.m5325b(this.f10483b, ((C6392k) obj).f10483b);
    }

    @Override // coil3.network.AbstractC3315g
    public final int hashCode() {
        return this.f10483b.hashCode();
    }

    @Override // coil3.network.AbstractC3315g
    public final String toString() {
        return AbstractC0037f.m86k("Text(content=", this.f10483b, ")");
    }
}
