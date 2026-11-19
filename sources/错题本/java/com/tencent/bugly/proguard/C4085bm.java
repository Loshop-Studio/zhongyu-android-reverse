package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bm */
/* loaded from: classes3.dex */
public final class C4085bm extends AbstractC4123m implements Cloneable {

    /* renamed from: c */
    static ArrayList<String> f3691c;

    /* renamed from: a */
    public String f3692a = "";

    /* renamed from: b */
    public ArrayList<String> f3693b = null;

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3315a(this.f3692a, 0);
        ArrayList<String> arrayList = this.f3693b;
        if (arrayList != null) {
            c4121l.m3316a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3692a = c4119k.m3296b(0, true);
        if (f3691c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f3691c = arrayList;
            arrayList.add("");
        }
        this.f3693b = (ArrayList) c4119k.m3291a((C4119k) f3691c, 1, false);
    }
}
