package p093k5;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import p065g5.AbstractC6427k;
import p086j5.AbstractC6598a;
import p086j5.C6600c;
import p086j5.C6601d;
import p093k5.InterfaceC6698u;

/* renamed from: k5.k */
/* loaded from: classes4.dex */
public final class C6688k implements InterfaceC6686i {

    /* renamed from: a */
    public final InterfaceC6698u f8879a;

    /* renamed from: b */
    public final C6601d f8880b;

    /* renamed from: c */
    public final long f8881c;

    /* renamed from: d */
    public long f8882d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f8883e;

    /* renamed from: f */
    public final BlockingQueue f8884f;

    /* renamed from: k5.k$a */
    public static final class a extends AbstractC6598a {

        /* renamed from: e */
        public final /* synthetic */ InterfaceC6698u.b f8885e;

        /* renamed from: f */
        public final /* synthetic */ C6688k f8886f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC6698u.b bVar, C6688k c6688k) {
            super(str, false, 2, null);
            this.f8885e = bVar;
            this.f8886f = c6688k;
        }

        @Override // p086j5.AbstractC6598a
        /* renamed from: f */
        public long mo7526f() throws InterruptedException {
            InterfaceC6698u.a aVar;
            try {
                aVar = this.f8885e.mo7715f();
            } catch (Throwable th) {
                aVar = new InterfaceC6698u.a(this.f8885e, null, th, 2, null);
            }
            if (!this.f8886f.f8883e.contains(this.f8885e)) {
                return -1L;
            }
            this.f8886f.f8884f.put(aVar);
            return -1L;
        }
    }

    public C6688k(InterfaceC6698u routePlanner, C6601d taskRunner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f8879a = routePlanner;
        this.f8880b = taskRunner;
        this.f8881c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f8882d = Long.MIN_VALUE;
        this.f8883e = new CopyOnWriteArrayList();
        this.f8884f = taskRunner.m7555h().mo7560a(new LinkedBlockingDeque());
    }

    @Override // p093k5.InterfaceC6686i
    /* renamed from: a */
    public C6692o mo7759a() throws IOException {
        InterfaceC6698u.a aVarM7769g;
        long j6;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f8883e.isEmpty() && !InterfaceC6698u.m7860d(mo7760b(), null, 1, null)) {
                    m7768f();
                    Intrinsics.checkNotNull(iOException);
                    throw iOException;
                }
                if (mo7760b().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jMo7564e = this.f8880b.m7555h().mo7564e();
                long j7 = this.f8882d - jMo7564e;
                if (this.f8883e.isEmpty() || j7 <= 0) {
                    aVarM7769g = m7769g();
                    j6 = this.f8881c;
                    this.f8882d = jMo7564e + j6;
                } else {
                    j6 = j7;
                    aVarM7769g = null;
                }
                if (aVarM7769g != null || (aVarM7769g = m7767e(j6, TimeUnit.NANOSECONDS)) != null) {
                    if (aVarM7769g.m7866f()) {
                        m7768f();
                        if (!aVarM7769g.m7864d().isReady()) {
                            aVarM7769g = aVarM7769g.m7864d().mo7712c();
                        }
                        if (aVarM7769g.m7866f()) {
                            return aVarM7769g.m7864d().mo7710a();
                        }
                    }
                    Throwable thM7865e = aVarM7769g.m7865e();
                    if (thM7865e != null) {
                        if (!(thM7865e instanceof IOException)) {
                            throw thM7865e;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thM7865e;
                        } else {
                            ExceptionsKt.addSuppressed(iOException, thM7865e);
                        }
                    }
                    InterfaceC6698u.b bVarM7863c = aVarM7769g.m7863c();
                    if (bVarM7863c != null) {
                        mo7760b().mo7771b().addFirst(bVarM7863c);
                    }
                }
            } finally {
                m7768f();
            }
        }
    }

    @Override // p093k5.InterfaceC6686i
    /* renamed from: b */
    public InterfaceC6698u mo7760b() {
        return this.f8879a;
    }

    /* renamed from: e */
    public final InterfaceC6698u.a m7767e(long j6, TimeUnit timeUnit) {
        InterfaceC6698u.a aVar;
        if (this.f8883e.isEmpty() || (aVar = (InterfaceC6698u.a) this.f8884f.poll(j6, timeUnit)) == null) {
            return null;
        }
        this.f8883e.remove(aVar.m7864d());
        return aVar;
    }

    /* renamed from: f */
    public final void m7768f() {
        Iterator it = this.f8883e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC6698u.b bVar = (InterfaceC6698u.b) it.next();
            bVar.cancel();
            InterfaceC6698u.b bVarRetry = bVar.retry();
            if (bVarRetry != null) {
                mo7760b().mo7771b().addLast(bVarRetry);
            }
        }
        this.f8883e.clear();
    }

    /* renamed from: g */
    public final InterfaceC6698u.a m7769g() {
        InterfaceC6698u.b c6687j;
        if (InterfaceC6698u.m7860d(mo7760b(), null, 1, null)) {
            try {
                c6687j = mo7760b().mo7772c();
            } catch (Throwable th) {
                c6687j = new C6687j(th);
            }
            if (c6687j.isReady()) {
                return new InterfaceC6698u.a(c6687j, null, null, 6, null);
            }
            if (c6687j instanceof C6687j) {
                return ((C6687j) c6687j).m7762d();
            }
            this.f8883e.add(c6687j);
            C6600c.m7532m(this.f8880b.m7558k(), new a(AbstractC6427k.f8101c + " connect " + mo7760b().mo7770a().m6486l().m6830o(), c6687j, this), 0L, 2, null);
        }
        return null;
    }
}
