package p113g8;

import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: g8.e0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8665e0 extends AbstractC8663d0 {
    /* renamed from: X0 */
    public static String m14030X0(String str, int i10) {
        AbstractC9133u.m16133g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(AbstractC8323h.m13513h(i10, str.length()));
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: Y0 */
    public static char m14031Y0(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: Z0 */
    public static char m14032Z0(CharSequence charSequence) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(AbstractC8661c0.m13985Z(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: a1 */
    public static String m14033a1(String str, int i10) {
        AbstractC9133u.m16133g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, AbstractC8323h.m13513h(i10, str.length()));
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: b1 */
    public static Collection m14034b1(CharSequence charSequence, Collection destination) {
        AbstractC9133u.m16133g(charSequence, "<this>");
        AbstractC9133u.m16133g(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }
}
