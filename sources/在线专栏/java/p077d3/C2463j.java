package p077d3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2730l;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2487m;
import p171x2.InterfaceC3470l;
import p175y2.InterfaceC3498a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d3.j */
/* loaded from: classes.dex */
public class C2463j extends C2462i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: d3.j$a */
    public static final class a<T> implements Iterable<T>, InterfaceC3498a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2457d f10039a;

        public a(InterfaceC2457d interfaceC2457d) {
            this.f10039a = interfaceC2457d;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return this.f10039a.iterator();
        }
    }

    @NotNull
    /* renamed from: c */
    public static <T> Iterable<T> m8212c(@NotNull InterfaceC2457d<? extends T> interfaceC2457d) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        return new a(interfaceC2457d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: d */
    public static <T> InterfaceC2457d<T> m8213d(@NotNull InterfaceC2457d<? extends T> interfaceC2457d, int i4) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        if (i4 >= 0) {
            return i4 == 0 ? interfaceC2457d : interfaceC2457d instanceof InterfaceC2456c ? ((InterfaceC2456c) interfaceC2457d).mo8202a(i4) : new C2455b(interfaceC2457d, i4);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: e */
    public static final <T, A extends Appendable> A m8214e(@NotNull InterfaceC2457d<? extends T> interfaceC2457d, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable InterfaceC3470l<? super T, ? extends CharSequence> interfaceC3470l) throws IOException {
        C2769l.m9241e(interfaceC2457d, "<this>");
        C2769l.m9241e(buffer, "buffer");
        C2769l.m9241e(separator, "separator");
        C2769l.m9241e(prefix, "prefix");
        C2769l.m9241e(postfix, "postfix");
        C2769l.m9241e(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t3 : interfaceC2457d) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            C2487m.m8324a(buffer, t3, interfaceC3470l);
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    /* renamed from: f */
    public static final <T> String m8215f(@NotNull InterfaceC2457d<? extends T> interfaceC2457d, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i4, @NotNull CharSequence truncated, @Nullable InterfaceC3470l<? super T, ? extends CharSequence> interfaceC3470l) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        C2769l.m9241e(separator, "separator");
        C2769l.m9241e(prefix, "prefix");
        C2769l.m9241e(postfix, "postfix");
        C2769l.m9241e(truncated, "truncated");
        String string = ((StringBuilder) m8214e(interfaceC2457d, new StringBuilder(), separator, prefix, postfix, i4, truncated, interfaceC3470l)).toString();
        C2769l.m9240d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* renamed from: g */
    public static /* synthetic */ String m8216g(InterfaceC2457d interfaceC2457d, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, InterfaceC3470l interfaceC3470l, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        int i6 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            interfaceC3470l = null;
        }
        return m8215f(interfaceC2457d, charSequence, charSequence5, charSequence6, i6, charSequence7, interfaceC3470l);
    }

    @NotNull
    /* renamed from: h */
    public static <T, R> InterfaceC2457d<R> m8217h(@NotNull InterfaceC2457d<? extends T> interfaceC2457d, @NotNull InterfaceC3470l<? super T, ? extends R> transform) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        C2769l.m9241e(transform, "transform");
        return new C2464k(interfaceC2457d, transform);
    }

    @NotNull
    /* renamed from: i */
    public static final <T, C extends Collection<? super T>> C m8218i(@NotNull InterfaceC2457d<? extends T> interfaceC2457d, @NotNull C destination) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        C2769l.m9241e(destination, "destination");
        Iterator<? extends T> it = interfaceC2457d.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    /* renamed from: j */
    public static <T> List<T> m8219j(@NotNull InterfaceC2457d<? extends T> interfaceC2457d) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        return C2730l.m9145l(m8220k(interfaceC2457d));
    }

    @NotNull
    /* renamed from: k */
    public static final <T> List<T> m8220k(@NotNull InterfaceC2457d<? extends T> interfaceC2457d) {
        C2769l.m9241e(interfaceC2457d, "<this>");
        return (List) m8218i(interfaceC2457d, new ArrayList());
    }
}
