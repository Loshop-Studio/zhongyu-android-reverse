package p101f8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: f8.n */
/* loaded from: classes5.dex */
public abstract class AbstractC8476n extends AbstractC8473k {

    /* renamed from: f8.n$a */
    public static final class a implements InterfaceC8469g {

        /* renamed from: a */
        public final /* synthetic */ Iterator f16076a;

        public a(Iterator it) {
            this.f16076a = it;
        }

        @Override // p101f8.InterfaceC8469g
        public Iterator iterator() {
            return this.f16076a;
        }
    }

    /* renamed from: e */
    public static InterfaceC8469g m13830e(Iterator it) {
        AbstractC9133u.m16133g(it, "<this>");
        return m13831f(new a(it));
    }

    /* renamed from: f */
    public static final InterfaceC8469g m13831f(InterfaceC8469g interfaceC8469g) {
        AbstractC9133u.m16133g(interfaceC8469g, "<this>");
        return interfaceC8469g instanceof C8463a ? interfaceC8469g : new C8463a(interfaceC8469g);
    }

    /* renamed from: g */
    public static InterfaceC8469g m13832g() {
        return C8466d.f16056a;
    }

    /* renamed from: h */
    public static InterfaceC8469g m13833h(final Object obj, InterfaceC10570l nextFunction) {
        AbstractC9133u.m16133g(nextFunction, "nextFunction");
        return obj == null ? C8466d.f16056a : new C8468f(new InterfaceC10559a() { // from class: f8.l
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AbstractC8476n.m13836k(obj);
            }
        }, nextFunction);
    }

    /* renamed from: i */
    public static InterfaceC8469g m13834i(final InterfaceC10559a nextFunction) {
        AbstractC9133u.m16133g(nextFunction, "nextFunction");
        return m13831f(new C8468f(nextFunction, new InterfaceC10570l() { // from class: f8.m
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AbstractC8476n.m13835j(nextFunction, obj);
            }
        }));
    }

    /* renamed from: j */
    public static final Object m13835j(InterfaceC10559a interfaceC10559a, Object it) {
        AbstractC9133u.m16133g(it, "it");
        return interfaceC10559a.invoke();
    }

    /* renamed from: l */
    public static InterfaceC8469g m13837l(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return AbstractC8801r.m14713j0(elements);
    }

    /* renamed from: k */
    public static final Object m13836k(Object obj) {
        return obj;
    }
}
