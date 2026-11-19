package com.efs.sdk.base.p035a.p044g;

import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p049c.C1327a;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.b */
/* loaded from: classes.dex */
public final class C1312b implements ILogEncryptAction {
    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] decrypt(String str, byte[] bArr) {
        try {
            return C1327a.m5565a(bArr, str);
        } catch (Exception e4) {
            C1329d.m5573b("efs.base", "aes decrypt error", e4);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] encrypt(String str, byte[] bArr) {
        try {
            return C1327a.m5566b(bArr, str);
        } catch (Exception e4) {
            C1329d.m5573b("efs.base", "aes encrypt error", e4);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final int getDeVal() {
        return 2;
    }
}
