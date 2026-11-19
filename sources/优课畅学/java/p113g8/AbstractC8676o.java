package p113g8;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* renamed from: g8.o */
/* loaded from: classes5.dex */
public abstract class AbstractC8676o {
    /* renamed from: a */
    public static void m14073a(Appendable appendable, Object obj, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(appendable, "<this>");
        if (interfaceC10570l != null) {
            appendable.append((CharSequence) interfaceC10570l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
