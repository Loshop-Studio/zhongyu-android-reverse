package com.zykj.mistake.feature.notebook.detail;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4833m implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f7108a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f7109b;

    public /* synthetic */ C4833m(InterfaceC6471c interfaceC6471c, int i) {
        this.f7108a = i;
        this.f7109b = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7108a) {
            case 0:
                this.f7109b.invoke(new C4884u2((String) obj, (String) obj2));
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                String path = (String) obj2;
                AbstractC5830k.m5330g(path, "path");
                this.f7109b.invoke(new C4795f3(iIntValue, path));
                break;
        }
        return C5443s.f8405a;
    }
}
