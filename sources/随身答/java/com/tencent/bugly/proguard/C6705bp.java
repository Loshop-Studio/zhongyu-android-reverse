package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bp */
/* loaded from: classes4.dex */
public final class C6705bp extends AbstractC6722m implements Cloneable {

    /* renamed from: b */
    static ArrayList<C6704bo> f6102b;

    /* renamed from: a */
    public ArrayList<C6704bo> f6103a = null;

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5399a((Collection) this.f6103a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        if (f6102b == null) {
            f6102b = new ArrayList<>();
            f6102b.add(new C6704bo());
        }
        this.f6103a = (ArrayList) c6720k.m5374a((C6720k) f6102b, 0, true);
    }
}
