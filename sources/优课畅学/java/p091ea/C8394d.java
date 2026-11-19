package p091ea;

import ca.InterfaceC5290h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p136i9.AbstractC8905e0;

/* renamed from: ea.d */
/* loaded from: classes5.dex */
public final class C8394d implements InterfaceC5290h {

    /* renamed from: a */
    public static final C8394d f15918a = new C8394d();

    @Override // ca.InterfaceC5290h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(AbstractC8905e0 abstractC8905e0) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String strString = abstractC8905e0.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
