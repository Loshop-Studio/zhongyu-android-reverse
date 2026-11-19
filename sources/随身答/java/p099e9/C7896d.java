package p099e9;

import java.io.IOException;
import p038c9.InterfaceC5280f;
import p172l8.AbstractC8927z;

/* renamed from: e9.d */
/* loaded from: classes5.dex */
public final class C7896d implements InterfaceC5280f {

    /* renamed from: a */
    public static final C7896d f13274a = new C7896d();

    @Override // p038c9.InterfaceC5280f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(AbstractC8927z abstractC8927z) throws IOException {
        String strString = abstractC8927z.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
