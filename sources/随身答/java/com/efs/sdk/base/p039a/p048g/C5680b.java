package com.efs.sdk.base.p039a.p048g;

import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p053c.C5695a;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.a.g.b */
/* loaded from: classes3.dex */
public final class C5680b implements ILogEncryptAction {
    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] decrypt(String str, byte[] bArr) {
        try {
            return C5695a.m4175a(bArr, str);
        } catch (Exception e10) {
            C5697d.m4183b("efs.base", "aes decrypt error", e10);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final byte[] encrypt(String str, byte[] bArr) {
        try {
            return C5695a.m4176b(bArr, str);
        } catch (Exception e10) {
            C5697d.m4183b("efs.base", "aes encrypt error", e10);
            return null;
        }
    }

    @Override // com.efs.sdk.base.processor.action.ILogEncryptAction
    public final int getDeVal() {
        return 2;
    }
}
