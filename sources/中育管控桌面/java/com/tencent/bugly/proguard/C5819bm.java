package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bm */
/* loaded from: classes3.dex */
public final class C5819bm extends AbstractC5839m implements Cloneable {

    /* renamed from: c */
    static ArrayList<String> f4210c;

    /* renamed from: a */
    public String f4211a = "";

    /* renamed from: b */
    public ArrayList<String> f4212b = null;

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4224a(this.f4211a, 0);
        ArrayList<String> arrayList = this.f4212b;
        if (arrayList != null) {
            c5838l.m4225a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4211a = c5837k.m4205b(0, true);
        if (f4210c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f4210c = arrayList;
            arrayList.add("");
        }
        this.f4212b = (ArrayList) c5837k.m4200a((C5837k) f4210c, 1, false);
    }
}
