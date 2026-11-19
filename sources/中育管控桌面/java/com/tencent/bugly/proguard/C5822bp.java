package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bp */
/* loaded from: classes3.dex */
public final class C5822bp extends AbstractC5839m implements Cloneable {

    /* renamed from: b */
    static ArrayList<C5821bo> f4246b;

    /* renamed from: a */
    public ArrayList<C5821bo> f4247a = null;

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4225a((Collection) this.f4247a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        if (f4246b == null) {
            f4246b = new ArrayList<>();
            f4246b.add(new C5821bo());
        }
        this.f4247a = (ArrayList) c5837k.m4200a((C5837k) f4246b, 0, true);
    }
}
