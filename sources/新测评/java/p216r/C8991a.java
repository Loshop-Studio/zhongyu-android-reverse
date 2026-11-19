package p216r;

import coil3.util.AbstractC5214d;
import kotlin.jvm.internal.Intrinsics;
import p137k.C7848t;
import p290y.C9892k;

/* renamed from: r.a */
/* loaded from: classes3.dex */
public final class C8991a implements InterfaceC8993c {
    @Override // p216r.InterfaceC8993c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo15095a(C7848t c7848t, C9892k c9892k) {
        if (!Intrinsics.areEqual(c7848t.m13309c(), "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c7848t);
        sb.append(':');
        sb.append(AbstractC5214d.m3227d(c9892k.m16700c().getResources().getConfiguration()));
        return sb.toString();
    }
}
