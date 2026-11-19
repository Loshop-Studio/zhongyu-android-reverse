package com.zykj.mistake.feature.collection.list;

import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.feature.notebook.list.C4981u0;
import p045d6.C5443s;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.collection.list.b0 */
/* loaded from: classes3.dex */
public final class C4702b0 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6750a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f6751b;

    /* renamed from: c */
    public final /* synthetic */ Object f6752c;

    /* renamed from: d */
    public final /* synthetic */ Object f6753d;

    public /* synthetic */ C4702b0(int i, Object obj, Object obj2, InterfaceC6471c interfaceC6471c) {
        this.f6750a = i;
        this.f6752c = obj;
        this.f6751b = interfaceC6471c;
        this.f6753d = obj2;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f6750a) {
            case 0:
                if (!((C4723v) this.f6752c).f6784k) {
                    this.f6751b.invoke(new C4719r(((C4701b) this.f6753d).f6746a));
                }
                break;
            default:
                if (!((C4941e1) this.f6752c).f7509i) {
                    this.f6751b.invoke(new C4981u0(((C6383b) this.f6753d).f10446a));
                }
                break;
        }
        return C5443s.f8405a;
    }
}
