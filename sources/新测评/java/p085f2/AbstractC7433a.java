package p085f2;

import p129j2.AbstractC7782b;
import p140k2.AbstractC7871b;

/* renamed from: f2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7433a {
    /* renamed from: a */
    public static C7434b m11981a(String str) {
        C7434b c7434b = new C7434b();
        if (str == null || str.length() != 24) {
            c7434b.m11982a(false);
            return c7434b;
        }
        try {
            byte[] bArrM13392a = AbstractC7871b.m13392a(str, 2);
            if (bArrM13392a.length == 18) {
                byte[] bArr = new byte[4];
                System.arraycopy(bArrM13392a, 0, bArr, 0, 4);
                byte b10 = bArrM13392a[8];
                try {
                    c7434b.m11982a(true);
                    c7434b.m11985d(AbstractC7782b.m13157a(bArr));
                    c7434b.m11986e(b10);
                } catch (Exception unused) {
                }
            }
            return c7434b;
        } catch (Exception unused2) {
            c7434b.m11982a(false);
            return c7434b;
        }
    }
}
