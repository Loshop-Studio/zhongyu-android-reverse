package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.BufferOverflow;
import p309qc.C10786q;
import p379vd.AbstractC11613v;
import p379vd.C11614w;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11603l;
import p394wd.AbstractC11726a;
import p394wd.AbstractC11728c;
import p394wd.AbstractC11737l;
import p394wd.InterfaceC11734i;
import p409xc.InterfaceC11829d;
import p410xd.C11839c0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class StateFlowImpl extends AbstractC11726a implements InterfaceC11603l, InterfaceC11594c, InterfaceC11734i {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23874h = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: g */
    public int f23875g;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.StateFlowImpl", m26211f = "StateFlow.kt", m26212l = {389, TypedValues.CycleType.TYPE_CURVE_FIT, 406}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    public static final class C100381 extends ContinuationImpl {

        /* renamed from: c */
        public Object f23876c;

        /* renamed from: d */
        public Object f23877d;

        /* renamed from: e */
        public Object f23878e;

        /* renamed from: f */
        public Object f23879f;

        /* renamed from: g */
        public Object f23880g;

        /* renamed from: h */
        public /* synthetic */ Object f23881h;

        /* renamed from: j */
        public int f23883j;

        public C100381(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23881h = obj;
            this.f23883j |= Integer.MIN_VALUE;
            return StateFlowImpl.this.collect(null, this);
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p379vd.InterfaceC11602k
    /* renamed from: a */
    public boolean mo20854a(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // p394wd.InterfaceC11734i
    /* renamed from: b */
    public InterfaceC11594c mo20855b(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC11613v.m25605d(this, interfaceC9945d, i10, bufferOverflow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r11).m20874b(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (kotlin.jvm.internal.AbstractC9979u.m20289b(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x00ac, B:52:0x00e2], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:42:0x00c1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:40:0x00bb], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:50:0x00dc], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:52:0x00e2, B:36:0x00ac], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [wd.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [wd.a] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    @Override // p379vd.InterfaceC11607p, p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(vd.d, vc.c):java.lang.Object");
    }

    @Override // p379vd.InterfaceC11603l
    /* renamed from: e */
    public boolean mo20870e(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC11737l.f27896a;
        }
        if (obj2 == null) {
            obj2 = AbstractC11737l.f27896a;
        }
        return m20873q(obj, obj2);
    }

    @Override // p379vd.InterfaceC11602k, p379vd.InterfaceC11595d
    public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
        setValue(obj);
        return C10786q.f26013a;
    }

    @Override // p379vd.InterfaceC11602k
    /* renamed from: f */
    public void mo20856f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p379vd.InterfaceC11603l, p379vd.InterfaceC11612u
    public Object getValue() {
        C11839c0 c11839c0 = AbstractC11737l.f27896a;
        Object obj = f23874h.get(this);
        if (obj == c11839c0) {
            return null;
        }
        return obj;
    }

    @Override // p394wd.AbstractC11726a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C11614w mo20857i() {
        return new C11614w();
    }

    @Override // p394wd.AbstractC11726a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C11614w[] mo20858j(int i10) {
        return new C11614w[i10];
    }

    /* renamed from: q */
    public final boolean m20873q(Object obj, Object obj2) {
        int i10;
        AbstractC11728c[] abstractC11728cArrM25959m;
        synchronized (this) {
            Object obj3 = f23874h.get(this);
            if (obj != null && !AbstractC9979u.m20289b(obj3, obj)) {
                return false;
            }
            if (AbstractC9979u.m20289b(obj3, obj2)) {
                return true;
            }
            f23874h.set(this, obj2);
            int i11 = this.f23875g;
            if ((i11 & 1) != 0) {
                this.f23875g = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f23875g = i12;
            AbstractC11728c[] abstractC11728cArrM25959m2 = m25959m();
            C10786q c10786q = C10786q.f26013a;
            while (true) {
                C11614w[] c11614wArr = (C11614w[]) abstractC11728cArrM25959m2;
                if (c11614wArr != null) {
                    for (C11614w c11614w : c11614wArr) {
                        if (c11614w != null) {
                            c11614w.m25610g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f23875g;
                    if (i10 == i12) {
                        this.f23875g = i12 + 1;
                        return true;
                    }
                    abstractC11728cArrM25959m = m25959m();
                    C10786q c10786q2 = C10786q.f26013a;
                }
                abstractC11728cArrM25959m2 = abstractC11728cArrM25959m;
                i12 = i10;
            }
        }
    }

    @Override // p379vd.InterfaceC11603l
    public void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC11737l.f27896a;
        }
        m20873q(null, obj);
    }
}
