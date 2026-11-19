package p154ff;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import je.AbstractC9746z;
import p122df.InterfaceC9040h;

/* renamed from: ff.d */
/* loaded from: classes6.dex */
public final class C9233d implements InterfaceC9040h {

    /* renamed from: a */
    public static final C9233d f21470a = new C9233d();

    @Override // p122df.InterfaceC9040h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(AbstractC9746z abstractC9746z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String strString = abstractC9746z.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
