package com.tendcloud.tenddata;

/* renamed from: com.tendcloud.tenddata.bm */
/* loaded from: classes5.dex */
public class C7881bm extends C7884bp implements InterfaceC7879bk {

    /* renamed from: a */
    private String f14423a = "*";

    @Override // com.tendcloud.tenddata.InterfaceC7878bj
    /* renamed from: a */
    public String mo11269a() {
        return this.f14423a;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7879bk
    public void setResourceDescriptor(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f14423a = str;
    }
}
