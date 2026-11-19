package p019b0;

import kotlin.NoWhenBranchMatchedException;
import p019b0.InterfaceC4940c;
import p290y.C9885d;
import p290y.C9896o;
import p290y.InterfaceC9889h;

/* renamed from: b0.b */
/* loaded from: classes3.dex */
public final class C4939b implements InterfaceC4940c {

    /* renamed from: a */
    public final InterfaceC4941d f2348a;

    /* renamed from: b */
    public final InterfaceC9889h f2349b;

    /* renamed from: b0.b$a */
    public static final class a implements InterfaceC4940c.a {
        @Override // p019b0.InterfaceC4940c.a
        /* renamed from: a */
        public InterfaceC4940c mo2327a(InterfaceC4941d interfaceC4941d, InterfaceC9889h interfaceC9889h) {
            return new C4939b(interfaceC4941d, interfaceC9889h);
        }
    }

    public C4939b(InterfaceC4941d interfaceC4941d, InterfaceC9889h interfaceC9889h) {
        this.f2348a = interfaceC4941d;
        this.f2349b = interfaceC9889h;
    }

    @Override // p019b0.InterfaceC4940c
    /* renamed from: a */
    public void mo2326a() {
        InterfaceC9889h interfaceC9889h = this.f2349b;
        if (interfaceC9889h instanceof C9896o) {
            this.f2348a.mo13a(((C9896o) interfaceC9889h).getImage());
        } else {
            if (!(interfaceC9889h instanceof C9885d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f2348a.mo14b(((C9885d) interfaceC9889h).getImage());
        }
    }
}
