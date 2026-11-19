package com.tendcloud.tenddata;

import com.tendcloud.tenddata.AbstractC7860as;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.tendcloud.tenddata.au */
/* loaded from: classes5.dex */
public class C7862au extends C7861at {
    @Override // com.tendcloud.tenddata.C7861at, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11229a(InterfaceC7878bj interfaceC7878bj) {
        return C7861at.m11250b(interfaceC7878bj) == 13 ? AbstractC7860as.b.MATCHED : AbstractC7860as.b.NOT_MATCHED;
    }

    @Override // com.tendcloud.tenddata.C7861at, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public AbstractC7860as mo11242c() {
        return new C7862au();
    }

    @Override // com.tendcloud.tenddata.C7861at, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7879bk mo11231a(InterfaceC7879bk interfaceC7879bk) {
        super.mo11231a(interfaceC7879bk);
        interfaceC7879bk.mo11270a("Sec-WebSocket-Version", AgooConstants.ACK_FLAG_NULL);
        return interfaceC7879bk;
    }
}
