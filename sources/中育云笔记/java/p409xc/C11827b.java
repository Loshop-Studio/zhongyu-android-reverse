package p409xc;

import kotlin.coroutines.InterfaceC9945d;
import vc.InterfaceC11588c;

/* renamed from: xc.b */
/* loaded from: classes6.dex */
public final class C11827b implements InterfaceC11588c {

    /* renamed from: c */
    public static final C11827b f28068c = new C11827b();

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // vc.InterfaceC11588c
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
