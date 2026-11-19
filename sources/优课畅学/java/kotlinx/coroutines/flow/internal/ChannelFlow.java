package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.AbstractC9079b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8825c0;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9071g;
import p157k8.InterfaceC9073i;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.InterfaceC9336i;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class ChannelFlow implements InterfaceC9336i {

    /* renamed from: a */
    public final InterfaceC9100d f17989a;

    /* renamed from: b */
    public final int f17990b;

    /* renamed from: c */
    public final BufferOverflow f17991c;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m17801f = "ChannelFlow.kt", m17802l = {119}, m17803m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 */
    public static final class C91992 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f17992a;

        /* renamed from: b */
        public /* synthetic */ Object f17993b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9267d f17994c;

        /* renamed from: d */
        public final /* synthetic */ ChannelFlow f17995d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C91992(InterfaceC9267d interfaceC9267d, ChannelFlow channelFlow, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f17994c = interfaceC9267d;
            this.f17995d = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C91992 c91992 = new C91992(this.f17994c, this.f17995d, interfaceC9324c);
            c91992.f17993b = obj;
            return c91992;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C91992) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f17992a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f17993b;
                InterfaceC9267d interfaceC9267d = this.f17994c;
                InterfaceC9073i interfaceC9073iMo16700n = this.f17995d.mo16700n(interfaceC8822b0);
                this.f17992a = 1;
                if (AbstractC9268e.m17030t(interfaceC9267d, interfaceC9073iMo16700n, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public ChannelFlow(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        this.f17989a = interfaceC9100d;
        this.f17990b = i10;
        this.f17991c = bufferOverflow;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m16695g(ChannelFlow channelFlow, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C91992(interfaceC9267d, channelFlow, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // p180m8.InterfaceC9336i
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p169l8.InterfaceC9266c mo16671c(kotlin.coroutines.InterfaceC9100d r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            kotlin.coroutines.d r0 = r1.f17989a
            kotlin.coroutines.d r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.f17603a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f17990b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f17991c
        L25:
            kotlin.coroutines.d r0 = r1.f17989a
            boolean r0 = kotlin.jvm.internal.AbstractC9133u.m16128b(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f17990b
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.f17991c
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.mo16570j(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.mo16671c(kotlin.coroutines.d, int, kotlinx.coroutines.channels.BufferOverflow):l8.c");
    }

    @Override // p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        return m16695g(this, interfaceC9267d, interfaceC9324c);
    }

    /* renamed from: f */
    public String mo16696f() {
        return null;
    }

    /* renamed from: i */
    public abstract Object mo16569i(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c);

    /* renamed from: j */
    public abstract ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow);

    /* renamed from: k */
    public InterfaceC9266c mo16697k() {
        return null;
    }

    /* renamed from: l */
    public final InterfaceC10574p m16698l() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    /* renamed from: m */
    public final int m16699m() {
        int i10 = this.f17990b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    /* renamed from: n */
    public InterfaceC9073i mo16700n(InterfaceC8822b0 interfaceC8822b0) {
        return ProduceKt.m16524d(interfaceC8822b0, this.f17989a, m16699m(), this.f17991c, CoroutineStart.f17554c, null, m16698l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo16696f = mo16696f();
        if (strMo16696f != null) {
            arrayList.add(strMo16696f);
        }
        if (this.f17989a != EmptyCoroutineContext.f17438a) {
            arrayList.add("context=" + this.f17989a);
        }
        if (this.f17990b != -3) {
            arrayList.add("capacity=" + this.f17990b);
        }
        if (this.f17991c != BufferOverflow.f17603a) {
            arrayList.add("onBufferOverflow=" + this.f17991c);
        }
        return AbstractC8825c0.m14820a(this) + '[' + AbstractC8778f0.m14576v0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
