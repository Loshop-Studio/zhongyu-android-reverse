package kotlinx.coroutines.flow;

import p123h7.C8736p;
import p169l8.C9265b;
import p169l8.C9274k;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__BuildersKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$a */
    public static final class C9170a implements InterfaceC9266c {

        /* renamed from: a */
        public final /* synthetic */ Object f17709a;

        public C9170a(Object obj) {
            this.f17709a = obj;
        }

        @Override // p169l8.InterfaceC9266c
        public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
            Object objEmit = interfaceC9267d.emit(this.f17709a, interfaceC9324c);
            return objEmit == AbstractC9434a.m17291f() ? objEmit : C8736p.f16368a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9266c m16571a(InterfaceC10574p interfaceC10574p) {
        return new CallbackFlowBuilder(interfaceC10574p, null, 0, null, 14, null);
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16572b(InterfaceC10574p interfaceC10574p) {
        return new C9265b(interfaceC10574p, null, 0, null, 14, null);
    }

    /* renamed from: c */
    public static final InterfaceC9266c m16573c(InterfaceC10574p interfaceC10574p) {
        return new C9274k(interfaceC10574p);
    }

    /* renamed from: d */
    public static final InterfaceC9266c m16574d(Object obj) {
        return new C9170a(obj);
    }

    /* renamed from: e */
    public static final InterfaceC9266c m16575e(Object... objArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(objArr);
    }
}
