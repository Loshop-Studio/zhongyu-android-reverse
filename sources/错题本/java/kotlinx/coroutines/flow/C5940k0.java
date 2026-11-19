package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.C5935q;

/* renamed from: kotlinx.coroutines.flow.k0 */
/* loaded from: classes4.dex */
public final class C5940k0 implements InterfaceC5917i0 {

    /* renamed from: a */
    public final /* synthetic */ int f9419a;

    @Override // kotlinx.coroutines.flow.InterfaceC5917i0
    /* renamed from: a */
    public final InterfaceC5910f mo5558a(C5935q c5935q) {
        switch (this.f9419a) {
            case 0:
                return new C5903b0(new StartedLazily$command$1(c5935q, null));
            default:
                return new C5916i(SharingCommand.START, 0);
        }
    }

    public final String toString() {
        switch (this.f9419a) {
            case 0:
                return "SharingStarted.Lazily";
            default:
                return "SharingStarted.Eagerly";
        }
    }
}
