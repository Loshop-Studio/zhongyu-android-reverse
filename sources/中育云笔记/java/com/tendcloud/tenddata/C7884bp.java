package com.tendcloud.tenddata;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.bp */
/* loaded from: classes5.dex */
public class C7884bp implements InterfaceC7880bl {

    /* renamed from: a */
    private byte[] f14426a;

    /* renamed from: b */
    private TreeMap<String, String> f14427b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // com.tendcloud.tenddata.InterfaceC7883bo
    /* renamed from: a */
    public String mo11273a(String str) {
        String str2 = this.f14427b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7883bo
    /* renamed from: b */
    public boolean mo11274b(String str) {
        return this.f14427b.containsKey(str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7883bo
    /* renamed from: c */
    public Iterator<String> mo11275c() {
        return Collections.unmodifiableSet(this.f14427b.keySet()).iterator();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7883bo
    /* renamed from: d */
    public byte[] mo11276d() {
        return this.f14426a;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7880bl
    public void setContent(byte[] bArr) {
        this.f14426a = bArr;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7880bl
    /* renamed from: a */
    public void mo11270a(String str, String str2) {
        this.f14427b.put(str, str2);
    }
}
