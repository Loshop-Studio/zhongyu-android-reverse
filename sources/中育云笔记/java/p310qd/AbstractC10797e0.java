package p310qd;

import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: qd.e0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10797e0 extends AbstractC10795d0 {
    /* renamed from: f1 */
    public static String m23169f1(String str, int i10) {
        AbstractC9979u.m20294g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(AbstractC10410o.m21756i(i10, str.length()));
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: g1 */
    public static char m23170g1(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: h1 */
    public static char m23171h1(CharSequence charSequence) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(AbstractC10793c0.m23118Z(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: i1 */
    public static String m23172i1(String str, int i10) {
        AbstractC9979u.m20294g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, AbstractC10410o.m21756i(i10, str.length()));
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: j1 */
    public static Collection m23173j1(CharSequence charSequence, Collection destination) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        AbstractC9979u.m20294g(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }
}
