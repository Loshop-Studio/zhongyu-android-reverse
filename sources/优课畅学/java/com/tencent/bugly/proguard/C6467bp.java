package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bp */
/* loaded from: classes4.dex */
public final class C6467bp extends AbstractC6484m implements Cloneable {

    /* renamed from: b */
    static ArrayList<C6466bo> f4868b;

    /* renamed from: a */
    public ArrayList<C6466bo> f4869a = null;

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4580a((Collection) this.f4869a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        if (f4868b == null) {
            f4868b = new ArrayList<>();
            f4868b.add(new C6466bo());
        }
        this.f4869a = (ArrayList) c6482k.m4555a((C6482k) f4868b, 0, true);
    }
}
