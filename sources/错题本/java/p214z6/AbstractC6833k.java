package p214z6;

import androidx.navigation.C2827b;
import coil3.network.AbstractC3315g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5803r;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.C5842c;
import p124n6.C6224i;
import p152r6.InterfaceC6471c;

/* renamed from: z6.k */
/* loaded from: classes2.dex */
public abstract class AbstractC6833k extends AbstractC6834l {
    /* renamed from: t */
    public static InterfaceC6830h m6493t(Iterator it) {
        AbstractC5830k.m5330g(it, "<this>");
        return new C6823a(new C5803r(it, 4));
    }

    /* renamed from: u */
    public static C6828f m6494u(C6224i c6224i, InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        return new C6828f(c6224i, true, predicate);
    }

    /* renamed from: v */
    public static InterfaceC6830h m6495v(Object obj, InterfaceC6471c nextFunction) {
        AbstractC5830k.m5330g(nextFunction, "nextFunction");
        return obj == null ? C6826d.f11565a : new C5842c(new C2827b(obj, 21), nextFunction);
    }

    /* renamed from: w */
    public static String m6496w(InterfaceC6830h interfaceC6830h, String str) {
        AbstractC5830k.m5330g(interfaceC6830h, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : interfaceC6830h) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC3315g.m2235c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* renamed from: x */
    public static Object m6497x(InterfaceC6830h interfaceC6830h) {
        AbstractC5830k.m5330g(interfaceC6830h, "<this>");
        Iterator it = interfaceC6830h.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: y */
    public static C6837o m6498y(InterfaceC6830h interfaceC6830h, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(interfaceC6830h, "<this>");
        return new C6837o(interfaceC6830h, interfaceC6471c, 1);
    }

    /* renamed from: z */
    public static List m6499z(InterfaceC6830h interfaceC6830h) {
        AbstractC5830k.m5330g(interfaceC6830h, "<this>");
        Iterator it = interfaceC6830h.iterator();
        if (!it.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC5806u.m5286y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
