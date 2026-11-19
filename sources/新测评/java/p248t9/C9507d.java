package p248t9;

import java.io.IOException;
import p011a9.AbstractC0063z;
import p226r9.InterfaceC9066h;

/* renamed from: t9.d */
/* loaded from: classes5.dex */
public final class C9507d implements InterfaceC9066h {

    /* renamed from: a */
    public static final C9507d f16607a = new C9507d();

    @Override // p226r9.InterfaceC9066h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(AbstractC0063z abstractC0063z) throws IOException {
        String strString = abstractC0063z.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
