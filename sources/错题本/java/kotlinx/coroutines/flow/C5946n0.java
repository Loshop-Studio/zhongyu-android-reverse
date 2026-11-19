package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC5919a;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import kotlinx.coroutines.flow.internal.AbstractC5921c;
import kotlinx.coroutines.flow.internal.InterfaceC5929k;
import p045d6.C5443s;
import p054e7.C5486r;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.n0 */
/* loaded from: classes4.dex */
public final class C5946n0 extends AbstractC5919a implements InterfaceC5959y, InterfaceC5910f, InterfaceC5929k {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9426f = AtomicReferenceFieldUpdater.newUpdater(C5946n0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e */
    public int f9427e;

    public C5946n0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5958x
    /* renamed from: a */
    public final boolean mo5527a(Object obj) {
        m5570j(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5929k
    /* renamed from: b */
    public final InterfaceC5910f mo5520b(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? AbstractC5914h.m5555k(this, interfaceC5636h, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5958x
    /* renamed from: c */
    public final void mo5528c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x0115, B:59:0x0116], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:28:0x0096, B:30:0x009e, B:33:0x00a5, B:34:0x00a9, B:36:0x00ac, B:46:0x00cd, B:49:0x00dd, B:50:0x00f9, B:56:0x010d, B:53:0x0100, B:55:0x0106, B:38:0x00b2, B:42:0x00b9, B:21:0x0063, B:24:0x0076, B:27:0x0087), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:28:0x0096, B:30:0x009e, B:33:0x00a5, B:34:0x00a9, B:36:0x00ac, B:46:0x00cd, B:49:0x00dd, B:50:0x00f9, B:56:0x010d, B:53:0x0100, B:55:0x0106, B:38:0x00b2, B:42:0x00b9, B:21:0x0063, B:24:0x0076, B:27:0x0087), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:28:0x0096, B:30:0x009e, B:33:0x00a5, B:34:0x00a9, B:36:0x00ac, B:46:0x00cd, B:49:0x00dd, B:50:0x00f9, B:56:0x010d, B:53:0x0100, B:55:0x0106, B:38:0x00b2, B:42:0x00b9, B:21:0x0063, B:24:0x0076, B:27:0x0087), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00dc -> B:28:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.InterfaceC5912g r18, p075h6.InterfaceC5631c r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5946n0.collect(kotlinx.coroutines.flow.g, h6.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5919a
    /* renamed from: e */
    public final AbstractC5921c mo5529e() {
        return new C5948o0();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5958x, kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        m5570j(obj);
        return C5443s.f8405a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5919a
    /* renamed from: f */
    public final AbstractC5921c[] mo5530f() {
        return new C5948o0[2];
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5944m0
    public final Object getValue() {
        C5486r c5486r = AbstractC5920b.f9388b;
        Object obj = f9426f.get(this);
        if (obj == c5486r) {
            return null;
        }
        return obj;
    }

    /* renamed from: i */
    public final boolean m5569i(Object obj, Object obj2) {
        C5486r c5486r = AbstractC5920b.f9388b;
        if (obj == null) {
            obj = c5486r;
        }
        if (obj2 == null) {
            obj2 = c5486r;
        }
        return m5571k(obj, obj2);
    }

    /* renamed from: j */
    public final void m5570j(Object obj) {
        if (obj == null) {
            obj = AbstractC5920b.f9388b;
        }
        m5571k(null, obj);
    }

    /* renamed from: k */
    public final boolean m5571k(Object obj, Object obj2) {
        int i;
        AbstractC5921c[] abstractC5921cArr;
        C5486r c5486r;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9426f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC5830k.m5325b(obj3, obj)) {
                return false;
            }
            if (AbstractC5830k.m5325b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f9427e;
            if ((i8 & 1) != 0) {
                this.f9427e = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f9427e = i9;
            AbstractC5921c[] abstractC5921cArr2 = this.f9383a;
            while (true) {
                C5948o0[] c5948o0Arr = (C5948o0[]) abstractC5921cArr2;
                if (c5948o0Arr != null) {
                    for (C5948o0 c5948o0 : c5948o0Arr) {
                        if (c5948o0 != null) {
                            AtomicReference atomicReference = c5948o0.f9431a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c5486r = AbstractC5914h.f9377d)) {
                                    C5486r c5486r2 = AbstractC5914h.f9376c;
                                    if (obj4 != c5486r2) {
                                        while (!atomicReference.compareAndSet(obj4, c5486r2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C5961g) obj4).resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c5486r)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f9427e;
                    if (i == i9) {
                        this.f9427e = i9 + 1;
                        return true;
                    }
                    abstractC5921cArr = this.f9383a;
                }
                abstractC5921cArr2 = abstractC5921cArr;
                i9 = i;
            }
        }
    }
}
