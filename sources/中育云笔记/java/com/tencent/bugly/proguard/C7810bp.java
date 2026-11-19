package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bp */
/* loaded from: classes5.dex */
public final class C7810bp extends AbstractC7827m implements Cloneable {

    /* renamed from: b */
    static ArrayList<C7809bo> f13967b;

    /* renamed from: a */
    public ArrayList<C7809bo> f13968a = null;

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10910a((Collection) this.f13968a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        if (f13967b == null) {
            f13967b = new ArrayList<>();
            f13967b.add(new C7809bo());
        }
        this.f13968a = (ArrayList) c7825k.m10885a((C7825k) f13967b, 0, true);
    }
}
