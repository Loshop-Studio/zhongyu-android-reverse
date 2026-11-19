package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bp */
/* loaded from: classes4.dex */
public final class C6445bp extends AbstractC6462m implements Cloneable {

    /* renamed from: b */
    static ArrayList<C6444bo> f5525b;

    /* renamed from: a */
    public ArrayList<C6444bo> f5526a = null;

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5220a((Collection) this.f5526a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        if (f5525b == null) {
            f5525b = new ArrayList<>();
            f5525b.add(new C6444bo());
        }
        this.f5526a = (ArrayList) c6460k.m5195a((C6460k) f5525b, 0, true);
    }
}
