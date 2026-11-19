package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p134i7.AbstractC8807u;
import p169l8.AbstractC9281r;
import p169l8.C9282s;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9328a;
import p180m8.AbstractC9330c;
import p180m8.AbstractC9339l;
import p180m8.InterfaceC9336i;
import p191n8.C9442d0;
import p201o7.InterfaceC9539d;

/* loaded from: classes5.dex */
public final class StateFlowImpl extends AbstractC9328a implements InterfaceC9271h, InterfaceC9266c, InterfaceC9336i {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17962f = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e */
    public int f17963e;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.StateFlowImpl", m17801f = "StateFlow.kt", m17802l = {384, 396, 401}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    public static final class C91961 extends ContinuationImpl {

        /* renamed from: a */
        public Object f17964a;

        /* renamed from: b */
        public Object f17965b;

        /* renamed from: c */
        public Object f17966c;

        /* renamed from: d */
        public Object f17967d;

        /* renamed from: e */
        public Object f17968e;

        /* renamed from: f */
        public /* synthetic */ Object f17969f;

        /* renamed from: h */
        public int f17971h;

        public C91961(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17969f = obj;
            this.f17971h |= Integer.MIN_VALUE;
            return StateFlowImpl.this.collect(null, this);
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p169l8.InterfaceC9270g
    /* renamed from: a */
    public boolean mo16670a(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // p180m8.InterfaceC9336i
    /* renamed from: c */
    public InterfaceC9266c mo16671c(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC9281r.m17057d(this, interfaceC9100d, i10, bufferOverflow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r11).m16690c(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (kotlin.jvm.internal.AbstractC9133u.m16128b(r11, r12) == false) goto L42;
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
    /* JADX WARN: Type inference failed for: r6v2, types: [m8.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [m8.a] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    @Override // p169l8.InterfaceC9275l, p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r11, p179m7.InterfaceC9324c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(l8.d, m7.c):java.lang.Object");
    }

    @Override // p169l8.InterfaceC9275l
    /* renamed from: d */
    public List mo16672d() {
        return AbstractC8807u.m14755e(getValue());
    }

    @Override // p169l8.InterfaceC9271h
    /* renamed from: e */
    public boolean mo16686e(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC9339l.f18395a;
        }
        if (obj2 == null) {
            obj2 = AbstractC9339l.f18395a;
        }
        return m16689r(obj, obj2);
    }

    @Override // p169l8.InterfaceC9270g, p169l8.InterfaceC9267d
    public Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
        setValue(obj);
        return C8736p.f16368a;
    }

    @Override // p169l8.InterfaceC9271h, p169l8.InterfaceC9280q
    public Object getValue() {
        C9442d0 c9442d0 = AbstractC9339l.f18395a;
        Object obj = f17962f.get(this);
        if (obj == c9442d0) {
            return null;
        }
        return obj;
    }

    @Override // p169l8.InterfaceC9270g
    /* renamed from: h */
    public void mo16673h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p180m8.AbstractC9328a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C9282s mo16674j() {
        return new C9282s();
    }

    @Override // p180m8.AbstractC9328a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C9282s[] mo16675k(int i10) {
        return new C9282s[i10];
    }

    /* renamed from: r */
    public final boolean m16689r(Object obj, Object obj2) {
        int i10;
        AbstractC9330c[] abstractC9330cArrM17162n;
        synchronized (this) {
            Object obj3 = f17962f.get(this);
            if (obj != null && !AbstractC9133u.m16128b(obj3, obj)) {
                return false;
            }
            if (AbstractC9133u.m16128b(obj3, obj2)) {
                return true;
            }
            f17962f.set(this, obj2);
            int i11 = this.f17963e;
            if ((i11 & 1) != 0) {
                this.f17963e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f17963e = i12;
            AbstractC9330c[] abstractC9330cArrM17162n2 = m17162n();
            C8736p c8736p = C8736p.f16368a;
            while (true) {
                C9282s[] c9282sArr = (C9282s[]) abstractC9330cArrM17162n2;
                if (c9282sArr != null) {
                    for (C9282s c9282s : c9282sArr) {
                        if (c9282s != null) {
                            c9282s.m17062g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f17963e;
                    if (i10 == i12) {
                        this.f17963e = i12 + 1;
                        return true;
                    }
                    abstractC9330cArrM17162n = m17162n();
                    C8736p c8736p2 = C8736p.f16368a;
                }
                abstractC9330cArrM17162n2 = abstractC9330cArrM17162n;
                i12 = i10;
            }
        }
    }

    @Override // p169l8.InterfaceC9271h
    public void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC9339l.f18395a;
        }
        m16689r(null, obj);
    }
}
