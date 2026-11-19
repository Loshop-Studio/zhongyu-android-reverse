package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bm */
/* loaded from: classes5.dex */
public final class C7807bm extends AbstractC7827m implements Cloneable {

    /* renamed from: c */
    static ArrayList<String> f13931c;

    /* renamed from: a */
    public String f13932a = "";

    /* renamed from: b */
    public ArrayList<String> f13933b = null;

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10909a(this.f13932a, 0);
        ArrayList<String> arrayList = this.f13933b;
        if (arrayList != null) {
            c7826l.m10910a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f13932a = c7825k.m10890b(0, true);
        if (f13931c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f13931c = arrayList;
            arrayList.add("");
        }
        this.f13933b = (ArrayList) c7825k.m10885a((C7825k) f13931c, 1, false);
    }
}
