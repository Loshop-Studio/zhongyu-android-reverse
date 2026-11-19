package p379vd;

import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* renamed from: vd.j */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11601j {

    /* renamed from: a */
    public static final InterfaceC9540l f27499a = new InterfaceC9540l() { // from class: vd.h
        @Override // p181hd.InterfaceC9540l
        public final Object invoke(Object obj) {
            return AbstractC11601j.m25585d(obj);
        }
    };

    /* renamed from: b */
    public static final InterfaceC9544p f27500b = new InterfaceC9544p() { // from class: vd.i
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC11601j.m25584c(obj, obj2));
        }
    };

    /* renamed from: c */
    public static final boolean m25584c(Object obj, Object obj2) {
        return AbstractC9979u.m20289b(obj, obj2);
    }

    /* renamed from: e */
    public static final InterfaceC11594c m25586e(InterfaceC11594c interfaceC11594c) {
        return interfaceC11594c instanceof InterfaceC11612u ? interfaceC11594c : m25589h(interfaceC11594c, f27499a, f27500b);
    }

    /* renamed from: f */
    public static final InterfaceC11594c m25587f(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        InterfaceC9540l interfaceC9540l = f27499a;
        AbstractC9979u.m20292e(interfaceC9544p, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return m25589h(interfaceC11594c, interfaceC9540l, (InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2));
    }

    /* renamed from: g */
    public static final InterfaceC11594c m25588g(InterfaceC11594c interfaceC11594c, InterfaceC9540l interfaceC9540l) {
        return m25589h(interfaceC11594c, interfaceC9540l, f27500b);
    }

    /* renamed from: h */
    public static final InterfaceC11594c m25589h(InterfaceC11594c interfaceC11594c, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        if (interfaceC11594c instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) interfaceC11594c;
            if (distinctFlowImpl.f23601d == interfaceC9540l && distinctFlowImpl.f23602e == interfaceC9544p) {
                return interfaceC11594c;
            }
        }
        return new DistinctFlowImpl(interfaceC11594c, interfaceC9540l, interfaceC9544p);
    }

    /* renamed from: d */
    public static final Object m25585d(Object obj) {
        return obj;
    }
}
