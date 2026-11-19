package com.zykj.mistake.feature.collection.filter;

import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.collection.filter.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4645d implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6591a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f6592b;

    /* renamed from: c */
    public final /* synthetic */ int f6593c;

    public /* synthetic */ C4645d(int i, int i8, InterfaceC6471c interfaceC6471c) {
        this.f6591a = i8;
        this.f6592b = interfaceC6471c;
        this.f6593c = i;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f6591a) {
            case 0:
                this.f6592b.invoke(Integer.valueOf(this.f6593c));
                break;
            case 1:
                this.f6592b.invoke(Integer.valueOf(this.f6593c));
                break;
            case 2:
                this.f6592b.invoke(Integer.valueOf(this.f6593c));
                break;
            case 3:
                this.f6592b.invoke(Integer.valueOf(this.f6593c));
                break;
            default:
                this.f6592b.invoke(Integer.valueOf(this.f6593c));
                break;
        }
        return C5443s.f8405a;
    }
}
