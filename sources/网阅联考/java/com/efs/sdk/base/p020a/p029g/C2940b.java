package com.efs.sdk.base.p020a.p029g;

import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p034c.C2955a;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.b */
/* loaded from: classes2.dex */
public final class C2940b implements ILogEncryptAction {
    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] decrypt(String str, byte[] bArr) {
        try {
            return C2955a.m2206a(bArr, str);
        } catch (Exception e4) {
            C2957d.m2214b("efs.base", "aes decrypt error", e4);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] encrypt(String str, byte[] bArr) {
        try {
            return C2955a.m2207b(bArr, str);
        } catch (Exception e4) {
            C2957d.m2214b("efs.base", "aes encrypt error", e4);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final int getDeVal() {
        return 2;
    }
}
