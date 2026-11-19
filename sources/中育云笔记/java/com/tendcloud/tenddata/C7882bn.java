package com.tendcloud.tenddata;

/* renamed from: com.tendcloud.tenddata.bn */
/* loaded from: classes5.dex */
public class C7882bn extends C7884bp implements InterfaceC7886br {

    /* renamed from: a */
    private short f14424a;

    /* renamed from: b */
    private String f14425b;

    @Override // com.tendcloud.tenddata.InterfaceC7885bq
    /* renamed from: a */
    public String mo11271a() {
        return this.f14425b;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7885bq
    /* renamed from: b */
    public short mo11272b() {
        return this.f14424a;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7886br
    public void setHttpStatus(short s10) {
        this.f14424a = s10;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7886br
    public void setHttpStatusMessage(String str) {
        this.f14425b = str;
    }
}
