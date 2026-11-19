package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.multiprocess.AbstractC0835c;
import androidx.work.multiprocess.InterfaceC0833a;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p105j1.C2690a;
import p169x0.C3453v;
import p169x0.InterfaceC3448q;
import p173y0.C3494i;

/* renamed from: androidx.work.multiprocess.d */
/* loaded from: classes.dex */
public class BinderC0836d extends InterfaceC0833a.a {

    /* renamed from: b */
    static byte[] f4917b = new byte[0];

    /* renamed from: a */
    private final C3494i f4918a;

    /* renamed from: androidx.work.multiprocess.d$a */
    class a extends AbstractC0835c<InterfaceC3448q.b.c> {
        a(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(InterfaceC3448q.b.c cVar) {
            return BinderC0836d.f4917b;
        }
    }

    /* renamed from: androidx.work.multiprocess.d$b */
    class b extends AbstractC0835c<InterfaceC3448q.b.c> {
        b(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(InterfaceC3448q.b.c cVar) {
            return BinderC0836d.f4917b;
        }
    }

    /* renamed from: androidx.work.multiprocess.d$c */
    class c extends AbstractC0835c<InterfaceC3448q.b.c> {
        c(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(InterfaceC3448q.b.c cVar) {
            return BinderC0836d.f4917b;
        }
    }

    /* renamed from: androidx.work.multiprocess.d$d */
    class d extends AbstractC0835c<InterfaceC3448q.b.c> {
        d(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(InterfaceC3448q.b.c cVar) {
            return BinderC0836d.f4917b;
        }
    }

    /* renamed from: androidx.work.multiprocess.d$e */
    class e extends AbstractC0835c<InterfaceC3448q.b.c> {
        e(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(InterfaceC3448q.b.c cVar) {
            return BinderC0836d.f4917b;
        }
    }

    /* renamed from: androidx.work.multiprocess.d$f */
    class f extends AbstractC0835c<InterfaceC3448q.b.c> {
        f(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(InterfaceC3448q.b.c cVar) {
            return BinderC0836d.f4917b;
        }
    }

    /* renamed from: androidx.work.multiprocess.d$g */
    class g extends AbstractC0835c<List<C3453v>> {
        g(Executor executor, InterfaceC0834b interfaceC0834b, ListenableFuture listenableFuture) {
            super(executor, interfaceC0834b, listenableFuture);
        }

        @Override // androidx.work.multiprocess.AbstractC0835c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo4299b(List<C3453v> list) {
            return C2690a.m9001a(new ParcelableWorkInfos(list));
        }
    }

    BinderC0836d(Context context) {
        this.f4918a = C3494i.m10599n(context);
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: b */
    public void mo4287b(String str, InterfaceC0834b interfaceC0834b) {
        try {
            new e(this.f4918a.m10615u().mo8915c(), interfaceC0834b, this.f4918a.m10605i(str).mo10514a()).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: f */
    public void mo4288f(String str, InterfaceC0834b interfaceC0834b) {
        try {
            new c(this.f4918a.m10615u().mo8915c(), interfaceC0834b, this.f4918a.mo10528b(UUID.fromString(str)).mo10514a()).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: h */
    public void mo4289h(byte[] bArr, InterfaceC0834b interfaceC0834b) {
        try {
            new a(this.f4918a.m10615u().mo8915c(), interfaceC0834b, this.f4918a.mo10529c(((ParcelableWorkRequests) C2690a.m9002b(bArr, ParcelableWorkRequests.CREATOR)).m4333a()).mo10514a()).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: j */
    public void mo4290j(InterfaceC0834b interfaceC0834b) {
        try {
            new f(this.f4918a.m10615u().mo8915c(), interfaceC0834b, this.f4918a.mo10527a().mo10514a()).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: q */
    public void mo4291q(String str, InterfaceC0834b interfaceC0834b) {
        try {
            new d(this.f4918a.m10615u().mo8915c(), interfaceC0834b, this.f4918a.m10604h(str).mo10514a()).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: v */
    public void mo4292v(byte[] bArr, InterfaceC0834b interfaceC0834b) {
        try {
            new g(this.f4918a.m10615u().mo8915c(), interfaceC0834b, this.f4918a.m10614t(((ParcelableWorkQuery) C2690a.m9002b(bArr, ParcelableWorkQuery.CREATOR)).m4327a())).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC0833a
    /* renamed from: x */
    public void mo4293x(byte[] bArr, InterfaceC0834b interfaceC0834b) {
        try {
            new b(this.f4918a.m10615u().mo8915c(), interfaceC0834b, ((ParcelableWorkContinuationImpl) C2690a.m9002b(bArr, ParcelableWorkContinuationImpl.CREATOR)).m4313b(this.f4918a).m10580a().mo10514a()).m4298a();
        } catch (Throwable th) {
            AbstractC0835c.a.m4300a(interfaceC0834b, th);
        }
    }
}
