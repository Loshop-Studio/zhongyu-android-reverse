package p092l3;

import java.io.IOException;
import p080j3.InterfaceC3821i;
import p117r2.AbstractC4498b0;

/* renamed from: l3.d */
/* loaded from: classes2.dex */
public final class C4344d implements InterfaceC3821i {

    /* renamed from: a */
    public static final C4344d f4853a = new C4344d();

    @Override // p080j3.InterfaceC3821i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Character mo4967a(AbstractC4498b0 abstractC4498b0) throws IOException {
        String strM5841g = abstractC4498b0.m5841g();
        if (strM5841g.length() == 1) {
            return Character.valueOf(strM5841g.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strM5841g.length());
    }
}
