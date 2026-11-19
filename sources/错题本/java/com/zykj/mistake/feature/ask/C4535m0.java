package com.zykj.mistake.feature.ask;

import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.ask.m0 */
/* loaded from: classes3.dex */
public final class C4535m0 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6270a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f6271b;

    /* renamed from: c */
    public final /* synthetic */ C4536n f6272c;

    /* renamed from: d */
    public final /* synthetic */ C4549y f6273d;

    public /* synthetic */ C4535m0(InterfaceC6471c interfaceC6471c, C4536n c4536n, C4549y c4549y, int i) {
        this.f6270a = i;
        this.f6271b = interfaceC6471c;
        this.f6272c = c4536n;
        this.f6273d = c4549y;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f6270a) {
            case 0:
                this.f6271b.invoke(new C4543s(this.f6272c.f6274a, this.f6273d.f6307a));
                break;
            case 1:
                this.f6271b.invoke(new C4543s(this.f6272c.f6274a, this.f6273d.f6307a));
                break;
            default:
                this.f6271b.invoke(new C4543s(this.f6272c.f6274a, this.f6273d.f6307a));
                break;
        }
        return C5443s.f8405a;
    }
}
