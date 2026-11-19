package com.p041ta.utdid2.device;

import p140k2.AbstractC7870a;
import p140k2.AbstractC7871b;
import p140k2.AbstractC7875f;

/* renamed from: com.ta.utdid2.device.e */
/* loaded from: classes4.dex */
class C6344e {
    /* renamed from: g */
    public String m4519g(String str) {
        return AbstractC7870a.m13391e(str);
    }

    /* renamed from: h */
    public String m4520h(String str) {
        String strM13391e = AbstractC7870a.m13391e(str);
        if (!AbstractC7875f.m13409c(strM13391e)) {
            try {
                return new String(AbstractC7871b.m13392a(strM13391e, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
