package p021b6;

import java.io.IOException;
import p058f5.AbstractC6364e0;
import p200z5.InterfaceC7966h;

/* renamed from: b6.d */
/* loaded from: classes4.dex */
public final class C4446d implements InterfaceC7966h {

    /* renamed from: a */
    public static final C4446d f1324a = new C4446d();

    @Override // p200z5.InterfaceC7966h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(AbstractC6364e0 abstractC6364e0) throws IOException {
        String strString = abstractC6364e0.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
