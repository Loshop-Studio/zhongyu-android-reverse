package p082e3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p171x2.InterfaceC3470l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.m */
/* loaded from: classes.dex */
public class C2487m {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> void m8324a(@NotNull Appendable appendable, T t3, @Nullable InterfaceC3470l<? super T, ? extends CharSequence> interfaceC3470l) {
        C2769l.m9241e(appendable, "<this>");
        if (interfaceC3470l != null) {
            appendable.append(interfaceC3470l.invoke(t3));
            return;
        }
        if (t3 == 0 ? true : t3 instanceof CharSequence) {
            appendable.append((CharSequence) t3);
        } else if (t3 instanceof Character) {
            appendable.append(((Character) t3).charValue());
        } else {
            appendable.append(String.valueOf(t3));
        }
    }
}
