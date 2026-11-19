package p296pd;

import id.InterfaceC9624a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p310qd.AbstractC10808o;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

/* renamed from: pd.q */
/* loaded from: classes6.dex */
public abstract class AbstractC10669q extends AbstractC10667o {

    /* renamed from: pd.q$a */
    public static final class a implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10659g f25705c;

        public a(InterfaceC10659g interfaceC10659g) {
            this.f25705c = interfaceC10659g;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f25705c.iterator();
        }
    }

    /* renamed from: A */
    public static Object m22569A(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        Iterator it = interfaceC10659g.iterator();
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
    public static InterfaceC10659g m22570B(InterfaceC10659g interfaceC10659g, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        return new C10673u(interfaceC10659g, transform);
    }

    /* renamed from: C */
    public static InterfaceC10659g m22571C(InterfaceC10659g interfaceC10659g, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        return m22582t(new C10673u(interfaceC10659g, transform));
    }

    /* renamed from: D */
    public static InterfaceC10659g m22572D(InterfaceC10659g interfaceC10659g, int i10) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? AbstractC10666n.m22563g() : interfaceC10659g instanceof InterfaceC10655c ? ((InterfaceC10655c) interfaceC10659g).mo22540b(i10) : new C10671s(interfaceC10659g, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: E */
    public static InterfaceC10659g m22573E(InterfaceC10659g interfaceC10659g, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        return new C10672t(interfaceC10659g, predicate);
    }

    /* renamed from: F */
    public static List m22574F(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        Iterator it = interfaceC10659g.iterator();
        if (!it.hasNext()) {
            return AbstractC10978w.m24136n();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC10976v.m24126e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: n */
    public static Iterable m22576n(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        return new a(interfaceC10659g);
    }

    /* renamed from: o */
    public static boolean m22577o(InterfaceC10659g interfaceC10659g, Object obj) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        return m22585w(interfaceC10659g, obj) >= 0;
    }

    /* renamed from: p */
    public static int m22578p(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        Iterator it = interfaceC10659g.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC10978w.m24144v();
            }
        }
        return i10;
    }

    /* renamed from: q */
    public static InterfaceC10659g m22579q(InterfaceC10659g interfaceC10659g, int i10) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? interfaceC10659g : interfaceC10659g instanceof InterfaceC10655c ? ((InterfaceC10655c) interfaceC10659g).mo22539a(i10) : new C10654b(interfaceC10659g, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: r */
    public static InterfaceC10659g m22580r(InterfaceC10659g interfaceC10659g, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        return new C10657e(interfaceC10659g, true, predicate);
    }

    /* renamed from: s */
    public static final InterfaceC10659g m22581s(InterfaceC10659g interfaceC10659g, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        return new C10657e(interfaceC10659g, false, predicate);
    }

    /* renamed from: t */
    public static InterfaceC10659g m22582t(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        InterfaceC10659g interfaceC10659gM22581s = m22581s(interfaceC10659g, new InterfaceC9540l() { // from class: pd.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC10669q.m22583u(obj));
            }
        });
        AbstractC9979u.m20292e(interfaceC10659gM22581s, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return interfaceC10659gM22581s;
    }

    /* renamed from: u */
    public static final boolean m22583u(Object obj) {
        return obj == null;
    }

    /* renamed from: v */
    public static Object m22584v(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        Iterator it = interfaceC10659g.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: w */
    public static final int m22585w(InterfaceC10659g interfaceC10659g, Object obj) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        int i10 = 0;
        for (Object obj2 : interfaceC10659g) {
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            if (AbstractC9979u.m20289b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: x */
    public static final Appendable m22586x(InterfaceC10659g interfaceC10659g, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l interfaceC9540l) throws IOException {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(buffer, "buffer");
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : interfaceC10659g) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC10808o.m23208a(buffer, obj, interfaceC9540l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: y */
    public static final String m22587y(InterfaceC10659g interfaceC10659g, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        return ((StringBuilder) m22586x(interfaceC10659g, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9540l)).toString();
    }

    /* renamed from: z */
    public static /* synthetic */ String m22588z(InterfaceC10659g interfaceC10659g, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
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
            interfaceC9540l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        return m22587y(interfaceC10659g, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC9540l2);
    }
}
