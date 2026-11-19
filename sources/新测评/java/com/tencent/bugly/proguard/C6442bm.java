package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bm */
/* loaded from: classes4.dex */
public final class C6442bm extends AbstractC6462m implements Cloneable {

    /* renamed from: c */
    static ArrayList<String> f5489c;

    /* renamed from: a */
    public String f5490a = "";

    /* renamed from: b */
    public ArrayList<String> f5491b = null;

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5219a(this.f5490a, 0);
        ArrayList<String> arrayList = this.f5491b;
        if (arrayList != null) {
            c6461l.m5220a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5490a = c6460k.m5200b(0, true);
        if (f5489c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f5489c = arrayList;
            arrayList.add("");
        }
        this.f5491b = (ArrayList) c6460k.m5195a((C6460k) f5489c, 1, false);
    }
}
