package p080j3;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p080j3.InterfaceC3809c;
import p117r2.C4522y;

/* renamed from: j3.j */
/* loaded from: classes2.dex */
public final class C3823j extends InterfaceC3809c.a {

    /* renamed from: a */
    public final Executor f4648a;

    /* renamed from: j3.j$a */
    public class a implements InterfaceC3809c {

        /* renamed from: a */
        public final /* synthetic */ Type f4649a;

        /* renamed from: b */
        public final /* synthetic */ Executor f4650b;

        public a(Type type, Executor executor) {
            this.f4649a = type;
            this.f4650b = executor;
        }

        @Override // p080j3.InterfaceC3809c
        /* renamed from: b */
        public Type mo4999b() {
            return this.f4649a;
        }

        @Override // p080j3.InterfaceC3809c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3807b mo4998a(InterfaceC3807b interfaceC3807b) {
            Executor executor = this.f4650b;
            return executor == null ? interfaceC3807b : new b(executor, interfaceC3807b);
        }
    }

    /* renamed from: j3.j$b */
    public static final class b implements InterfaceC3807b {

        /* renamed from: a */
        public final Executor f4652a;

        /* renamed from: b */
        public final InterfaceC3807b f4653b;

        /* renamed from: j3.j$b$a */
        public class a implements InterfaceC3811d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC3811d f4654a;

            public a(InterfaceC3811d interfaceC3811d) {
                this.f4654a = interfaceC3811d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m5076e(InterfaceC3811d interfaceC3811d, Throwable th) {
                interfaceC3811d.mo5016b(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m5077f(InterfaceC3811d interfaceC3811d, C3812d0 c3812d0) {
                if (b.this.f4653b.mo4983T()) {
                    interfaceC3811d.mo5016b(b.this, new IOException("Canceled"));
                } else {
                    interfaceC3811d.mo5015a(b.this, c3812d0);
                }
            }

            @Override // p080j3.InterfaceC3811d
            /* renamed from: a */
            public void mo5015a(InterfaceC3807b interfaceC3807b, final C3812d0 c3812d0) {
                Executor executor = b.this.f4652a;
                final InterfaceC3811d interfaceC3811d = this.f4654a;
                executor.execute(new Runnable() { // from class: j3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4656a.m5077f(interfaceC3811d, c3812d0);
                    }
                });
            }

            @Override // p080j3.InterfaceC3811d
            /* renamed from: b */
            public void mo5016b(InterfaceC3807b interfaceC3807b, final Throwable th) {
                Executor executor = b.this.f4652a;
                final InterfaceC3811d interfaceC3811d = this.f4654a;
                executor.execute(new Runnable() { // from class: j3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4659a.m5076e(interfaceC3811d, th);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC3807b interfaceC3807b) {
            this.f4652a = executor;
            this.f4653b = interfaceC3807b;
        }

        @Override // p080j3.InterfaceC3807b
        /* renamed from: S */
        public C4522y mo4982S() {
            return this.f4653b.mo4982S();
        }

        @Override // p080j3.InterfaceC3807b
        /* renamed from: T */
        public boolean mo4983T() {
            return this.f4653b.mo4983T();
        }

        @Override // p080j3.InterfaceC3807b
        /* renamed from: U */
        public void mo4984U(InterfaceC3811d interfaceC3811d) {
            Objects.requireNonNull(interfaceC3811d, "callback == null");
            this.f4653b.mo4984U(new a(interfaceC3811d));
        }

        @Override // p080j3.InterfaceC3807b
        public void cancel() {
            this.f4653b.cancel();
        }

        @Override // p080j3.InterfaceC3807b
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public InterfaceC3807b m11782clone() {
            return new b(this.f4652a, this.f4653b.m11782clone());
        }
    }

    public C3823j(Executor executor) {
        this.f4648a = executor;
    }

    @Override // p080j3.InterfaceC3809c.a
    /* renamed from: a */
    public InterfaceC3809c mo5002a(Type type, Annotation[] annotationArr, C3814e0 c3814e0) {
        if (InterfaceC3809c.a.m5001c(type) != InterfaceC3807b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(AbstractC3822i0.m5059g(0, (ParameterizedType) type), AbstractC3822i0.m5064l(annotationArr, InterfaceC3818g0.class) ? null : this.f4648a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
