package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bm */
/* loaded from: classes4.dex */
public final class C6702bm extends AbstractC6722m implements Cloneable {

    /* renamed from: c */
    static ArrayList<String> f6066c;

    /* renamed from: a */
    public String f6067a = "";

    /* renamed from: b */
    public ArrayList<String> f6068b = null;

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5398a(this.f6067a, 0);
        ArrayList<String> arrayList = this.f6068b;
        if (arrayList != null) {
            c6721l.m5399a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6067a = c6720k.m5379b(0, true);
        if (f6066c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f6066c = arrayList;
            arrayList.add("");
        }
        this.f6068b = (ArrayList) c6720k.m5374a((C6720k) f6066c, 1, false);
    }
}
