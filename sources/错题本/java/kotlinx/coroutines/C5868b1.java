package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.b1 */
/* loaded from: classes4.dex */
public final class C5868b1 implements InterfaceC5999s0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9282b = AtomicIntegerFieldUpdater.newUpdater(C5868b1.class, "_isCompleting$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9283c = AtomicReferenceFieldUpdater.newUpdater(C5868b1.class, Object.class, "_rootCause$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9284d = AtomicReferenceFieldUpdater.newUpdater(C5868b1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a */
    public final C5897f1 f9285a;

    public C5868b1(C5897f1 c5897f1, Throwable th) {
        this.f9285a = c5897f1;
        this._rootCause$volatile = th;
    }

    /* renamed from: a */
    public final void m5428a(Throwable th) {
        Throwable thM5430c = m5430c();
        if (thM5430c == null) {
            f9283c.set(this, th);
            return;
        }
        if (th == thM5430c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9284d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // kotlinx.coroutines.InterfaceC5999s0
    /* renamed from: b */
    public final C5897f1 mo5429b() {
        return this.f9285a;
    }

    /* renamed from: c */
    public final Throwable m5430c() {
        return (Throwable) f9283c.get(this);
    }

    /* renamed from: d */
    public final boolean m5431d() {
        return m5430c() != null;
    }

    /* renamed from: e */
    public final ArrayList m5432e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9284d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM5430c = m5430c();
        if (thM5430c != null) {
            arrayList.add(0, thM5430c);
        }
        if (th != null && !th.equals(thM5430c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC6014x.f9524h);
        return arrayList;
    }

    @Override // kotlinx.coroutines.InterfaceC5999s0
    public final boolean isActive() {
        return m5430c() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m5431d());
        sb.append(", completing=");
        sb.append(f9282b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m5430c());
        sb.append(", exceptions=");
        sb.append(f9284d.get(this));
        sb.append(", list=");
        sb.append(this.f9285a);
        sb.append(']');
        return sb.toString();
    }
}
