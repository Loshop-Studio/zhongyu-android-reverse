package p310qd;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: qd.o */
/* loaded from: classes6.dex */
public abstract class AbstractC10808o {
    /* renamed from: a */
    public static void m23208a(Appendable appendable, Object obj, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(appendable, "<this>");
        if (interfaceC9540l != null) {
            appendable.append((CharSequence) interfaceC9540l.invoke(obj));
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
