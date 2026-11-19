package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p365ud.InterfaceC11395j;
import p365ud.InterfaceC11397l;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.InterfaceC11734i;
import p409xc.InterfaceC11829d;
import sd.AbstractC11126j0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class ChannelFlow implements InterfaceC11734i {

    /* renamed from: c */
    public final InterfaceC9945d f23901c;

    /* renamed from: d */
    public final int f23902d;

    /* renamed from: e */
    public final BufferOverflow f23903e;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m26211f = "ChannelFlow.kt", m26212l = {119}, m26213m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 */
    public static final class C100412 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f23904c;

        /* renamed from: d */
        public /* synthetic */ Object f23905d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC11595d f23906e;

        /* renamed from: f */
        public final /* synthetic */ ChannelFlow f23907f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C100412(InterfaceC11595d interfaceC11595d, ChannelFlow channelFlow, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f23906e = interfaceC11595d;
            this.f23907f = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C100412 c100412 = new C100412(this.f23906e, this.f23907f, interfaceC11588c);
            c100412.f23905d = obj;
            return c100412;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f23904c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f23905d;
                InterfaceC11595d interfaceC11595d = this.f23906e;
                InterfaceC11397l interfaceC11397lMo20884m = this.f23907f.mo20884m(interfaceC11122i0);
                this.f23904c = 1;
                if (AbstractC11596e.m25569s(interfaceC11595d, interfaceC11397lMo20884m, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C100412) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ChannelFlow(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        this.f23901c = interfaceC9945d;
        this.f23902d = i10;
        this.f23903e = bufferOverflow;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m20879g(ChannelFlow channelFlow, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C100412(interfaceC11595d, channelFlow, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // p394wd.InterfaceC11734i
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p379vd.InterfaceC11594c mo20855b(kotlin.coroutines.InterfaceC9945d r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            kotlin.coroutines.d r0 = r1.f23901c
            kotlin.coroutines.d r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.f23519c
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f23902d
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
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f23903e
        L25:
            kotlin.coroutines.d r0 = r1.f23901c
            boolean r0 = kotlin.jvm.internal.AbstractC9979u.m20289b(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f23902d
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.f23903e
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.mo20758i(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.mo20855b(kotlin.coroutines.d, int, kotlinx.coroutines.channels.BufferOverflow):vd.c");
    }

    /* renamed from: c */
    public String mo20880c() {
        return null;
    }

    @Override // p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return m20879g(this, interfaceC11595d, interfaceC11588c);
    }

    /* renamed from: h */
    public abstract Object mo20757h(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c);

    /* renamed from: i */
    public abstract ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow);

    /* renamed from: j */
    public InterfaceC11594c mo20881j() {
        return null;
    }

    /* renamed from: k */
    public final InterfaceC9544p m20882k() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    /* renamed from: l */
    public final int m20883l() {
        int i10 = this.f23902d;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    /* renamed from: m */
    public InterfaceC11397l mo20884m(InterfaceC11122i0 interfaceC11122i0) {
        return ProduceKt.m20717e(interfaceC11122i0, this.f23901c, m20883l(), this.f23903e, CoroutineStart.f23478e, null, m20882k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo20880c = mo20880c();
        if (strMo20880c != null) {
            arrayList.add(strMo20880c);
        }
        if (this.f23901c != EmptyCoroutineContext.f23351c) {
            arrayList.add("context=" + this.f23901c);
        }
        if (this.f23902d != -3) {
            arrayList.add("capacity=" + this.f23902d);
        }
        if (this.f23903e != BufferOverflow.f23519c) {
            arrayList.add("onBufferOverflow=" + this.f23903e);
        }
        return AbstractC11126j0.m24738a(this) + '[' + AbstractC10947g0.m23954w0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
