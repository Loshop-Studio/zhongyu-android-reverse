package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bp */
/* loaded from: classes3.dex */
public final class C4088bp extends AbstractC4123m implements Cloneable {

    /* renamed from: b */
    static ArrayList<C4087bo> f3727b;

    /* renamed from: a */
    public ArrayList<C4087bo> f3728a = null;

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3316a((Collection) this.f3728a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        if (f3727b == null) {
            f3727b = new ArrayList<>();
            f3727b.add(new C4087bo());
        }
        this.f3728a = (ArrayList) c4119k.m3291a((C4119k) f3727b, 0, true);
    }
}
