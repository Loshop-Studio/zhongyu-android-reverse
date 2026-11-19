package com.zykj.mistake.feature.collection.filter;

import p045d6.C5443s;
import p137p4.C6382a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.collection.filter.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4649f implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6603a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f6604b;

    /* renamed from: c */
    public final /* synthetic */ C6382a f6605c;

    public /* synthetic */ C4649f(InterfaceC6471c interfaceC6471c, C6382a c6382a, int i) {
        this.f6603a = i;
        this.f6604b = interfaceC6471c;
        this.f6605c = c6382a;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f6603a) {
            case 0:
                this.f6604b.invoke(Long.valueOf(this.f6605c.f10444a));
                break;
            default:
                this.f6604b.invoke(Long.valueOf(this.f6605c.f10444a));
                break;
        }
        return C5443s.f8405a;
    }
}
