package p260v;

import coil3.network.InterfaceC5208b;
import coil3.network.internal.UtilsKt;
import kotlin.coroutines.Continuation;
import p249u.C9524j;
import p249u.C9526l;
import p290y.C9892k;

/* renamed from: v.a */
/* loaded from: classes3.dex */
public final class C9622a implements InterfaceC5208b {
    @Override // coil3.network.InterfaceC5208b
    /* renamed from: a */
    public Object mo3142a(C9526l c9526l, C9524j c9524j, C9526l c9526l2, C9892k c9892k, Continuation continuation) {
        return (c9526l2.m15892d() != 304 || c9526l == null) ? new InterfaceC5208b.c(c9526l2) : new InterfaceC5208b.c(C9526l.m15889b(c9526l2, 0, 0L, 0L, UtilsKt.m3158d(c9526l.m15893e(), c9526l2.m15893e()), null, null, 39, null));
    }

    @Override // coil3.network.InterfaceC5208b
    /* renamed from: b */
    public Object mo3143b(C9526l c9526l, C9524j c9524j, C9892k c9892k, Continuation continuation) {
        return new InterfaceC5208b.b(c9526l);
    }
}
