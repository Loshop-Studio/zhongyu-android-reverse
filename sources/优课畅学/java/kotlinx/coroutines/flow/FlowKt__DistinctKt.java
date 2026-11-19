package kotlinx.coroutines.flow;

import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a */
    public static final InterfaceC10570l f17741a = new InterfaceC10570l() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // p300x7.InterfaceC10570l
        public final Object invoke(Object obj) {
            return obj;
        }
    };

    /* renamed from: b */
    public static final InterfaceC10574p f17742b = new InterfaceC10574p() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // p300x7.InterfaceC10574p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC9133u.m16128b(obj, obj2));
        }
    };

    /* renamed from: a */
    public static final InterfaceC9266c m16589a(InterfaceC9266c interfaceC9266c) {
        return interfaceC9266c instanceof InterfaceC9280q ? interfaceC9266c : m16592d(interfaceC9266c, f17741a, f17742b);
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16590b(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        InterfaceC10570l interfaceC10570l = f17741a;
        AbstractC9133u.m16131e(interfaceC10574p, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return m16592d(interfaceC9266c, interfaceC10570l, (InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2));
    }

    /* renamed from: c */
    public static final InterfaceC9266c m16591c(InterfaceC9266c interfaceC9266c, InterfaceC10570l interfaceC10570l) {
        return m16592d(interfaceC9266c, interfaceC10570l, f17742b);
    }

    /* renamed from: d */
    public static final InterfaceC9266c m16592d(InterfaceC9266c interfaceC9266c, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        if (interfaceC9266c instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) interfaceC9266c;
            if (distinctFlowImpl.f17693b == interfaceC10570l && distinctFlowImpl.f17694c == interfaceC10574p) {
                return interfaceC9266c;
            }
        }
        return new DistinctFlowImpl(interfaceC9266c, interfaceC10570l, interfaceC10574p);
    }
}
