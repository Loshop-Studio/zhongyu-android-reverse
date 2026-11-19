package p296pd;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10968r;

/* renamed from: pd.n */
/* loaded from: classes6.dex */
public abstract class AbstractC10666n extends AbstractC10663k {

    /* renamed from: pd.n$a */
    public static final class a implements InterfaceC10659g {

        /* renamed from: a */
        public final /* synthetic */ Iterator f25704a;

        public a(Iterator it) {
            this.f25704a = it;
        }

        @Override // p296pd.InterfaceC10659g
        public Iterator iterator() {
            return this.f25704a;
        }
    }

    /* renamed from: e */
    public static InterfaceC10659g m22561e(Iterator it) {
        AbstractC9979u.m20294g(it, "<this>");
        return m22562f(new a(it));
    }

    /* renamed from: f */
    public static final InterfaceC10659g m22562f(InterfaceC10659g interfaceC10659g) {
        AbstractC9979u.m20294g(interfaceC10659g, "<this>");
        return interfaceC10659g instanceof C10653a ? interfaceC10659g : new C10653a(interfaceC10659g);
    }

    /* renamed from: g */
    public static InterfaceC10659g m22563g() {
        return C10656d.f25684a;
    }

    /* renamed from: h */
    public static InterfaceC10659g m22564h(final InterfaceC9529a nextFunction) {
        AbstractC9979u.m20294g(nextFunction, "nextFunction");
        return m22562f(new C10658f(nextFunction, new InterfaceC9540l() { // from class: pd.m
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10666n.m22566j(nextFunction, obj);
            }
        }));
    }

    /* renamed from: i */
    public static InterfaceC10659g m22565i(final Object obj, InterfaceC9540l nextFunction) {
        AbstractC9979u.m20294g(nextFunction, "nextFunction");
        return obj == null ? C10656d.f25684a : new C10658f(new InterfaceC9529a() { // from class: pd.l
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AbstractC10666n.m22567k(obj);
            }
        }, nextFunction);
    }

    /* renamed from: j */
    public static final Object m22566j(InterfaceC9529a interfaceC9529a, Object it) {
        AbstractC9979u.m20294g(it, "it");
        return interfaceC9529a.invoke();
    }

    /* renamed from: l */
    public static InterfaceC10659g m22568l(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return AbstractC10968r.m24082i0(elements);
    }

    /* renamed from: k */
    public static final Object m22567k(Object obj) {
        return obj;
    }
}
