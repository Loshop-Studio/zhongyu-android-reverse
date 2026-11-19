package p101f8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8676o;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* renamed from: f8.q */
/* loaded from: classes5.dex */
public abstract class AbstractC8479q extends AbstractC8477o {

    /* renamed from: f8.q$a */
    public static final class a implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8469g f16077a;

        public a(InterfaceC8469g interfaceC8469g) {
            this.f16077a = interfaceC8469g;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f16077a.iterator();
        }
    }

    /* renamed from: A */
    public static Object m13838A(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        Iterator it = interfaceC8469g.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: B */
    public static InterfaceC8469g m13839B(InterfaceC8469g interfaceC8469g, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        return new C8483u(interfaceC8469g, transform);
    }

    /* renamed from: C */
    public static InterfaceC8469g m13840C(InterfaceC8469g interfaceC8469g, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        return m13851t(new C8483u(interfaceC8469g, transform));
    }

    /* renamed from: D */
    public static InterfaceC8469g m13841D(InterfaceC8469g interfaceC8469g, int i10) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? AbstractC8476n.m13832g() : interfaceC8469g instanceof InterfaceC8465c ? ((InterfaceC8465c) interfaceC8469g).mo13809b(i10) : new C8481s(interfaceC8469g, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: E */
    public static InterfaceC8469g m13842E(InterfaceC8469g interfaceC8469g, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        return new C8482t(interfaceC8469g, predicate);
    }

    /* renamed from: F */
    public static List m13843F(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        Iterator it = interfaceC8469g.iterator();
        if (!it.hasNext()) {
            return AbstractC8809v.m14771n();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC8807u.m14755e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: n */
    public static Iterable m13845n(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        return new a(interfaceC8469g);
    }

    /* renamed from: o */
    public static boolean m13846o(InterfaceC8469g interfaceC8469g, Object obj) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        return m13854w(interfaceC8469g, obj) >= 0;
    }

    /* renamed from: p */
    public static int m13847p(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        Iterator it = interfaceC8469g.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC8809v.m14779v();
            }
        }
        return i10;
    }

    /* renamed from: q */
    public static InterfaceC8469g m13848q(InterfaceC8469g interfaceC8469g, int i10) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? interfaceC8469g : interfaceC8469g instanceof InterfaceC8465c ? ((InterfaceC8465c) interfaceC8469g).mo13808a(i10) : new C8464b(interfaceC8469g, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: r */
    public static InterfaceC8469g m13849r(InterfaceC8469g interfaceC8469g, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        return new C8467e(interfaceC8469g, true, predicate);
    }

    /* renamed from: s */
    public static final InterfaceC8469g m13850s(InterfaceC8469g interfaceC8469g, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        return new C8467e(interfaceC8469g, false, predicate);
    }

    /* renamed from: t */
    public static InterfaceC8469g m13851t(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        InterfaceC8469g interfaceC8469gM13850s = m13850s(interfaceC8469g, new InterfaceC10570l() { // from class: f8.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC8479q.m13852u(obj));
            }
        });
        AbstractC9133u.m16131e(interfaceC8469gM13850s, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return interfaceC8469gM13850s;
    }

    /* renamed from: u */
    public static final boolean m13852u(Object obj) {
        return obj == null;
    }

    /* renamed from: v */
    public static Object m13853v(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        Iterator it = interfaceC8469g.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: w */
    public static final int m13854w(InterfaceC8469g interfaceC8469g, Object obj) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        int i10 = 0;
        for (Object obj2 : interfaceC8469g) {
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            if (AbstractC9133u.m16128b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: x */
    public static final Appendable m13855x(InterfaceC8469g interfaceC8469g, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) throws IOException {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(buffer, "buffer");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : interfaceC8469g) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC8676o.m14073a(buffer, obj, interfaceC10570l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: y */
    public static final String m13856y(InterfaceC8469g interfaceC8469g, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        return ((StringBuilder) m13855x(interfaceC8469g, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC10570l)).toString();
    }

    /* renamed from: z */
    public static /* synthetic */ String m13857z(InterfaceC8469g interfaceC8469g, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC10570l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return m13856y(interfaceC8469g, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC10570l2);
    }
}
