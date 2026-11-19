package p283p;

import coil3.util.AbstractC5491d;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.C9766t;
import p380w.C11634n;

/* renamed from: p.a */
/* loaded from: classes3.dex */
public final class C10590a implements InterfaceC10592c {
    @Override // p283p.InterfaceC10592c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo22414a(C9766t c9766t, C11634n c11634n) {
        if (!AbstractC9979u.m20289b(c9766t.m19685c(), "android.resource")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c9766t);
        sb2.append(':');
        sb2.append(AbstractC5491d.m3321d(c11634n.m25743c().getResources().getConfiguration()));
        return sb2.toString();
    }
}
