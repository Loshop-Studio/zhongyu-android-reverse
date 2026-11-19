package p122df;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import je.C9743w;
import p122df.C9042i;
import p122df.InterfaceC9034e;

/* renamed from: df.i */
/* loaded from: classes6.dex */
public final class C9042i extends InterfaceC9034e.a {

    /* renamed from: a */
    public final Executor f21118a;

    /* renamed from: df.i$a */
    public class a implements InterfaceC9034e {

        /* renamed from: a */
        public final /* synthetic */ Type f21119a;

        /* renamed from: b */
        public final /* synthetic */ Executor f21120b;

        public a(Type type, Executor executor) {
            this.f21119a = type;
            this.f21120b = executor;
        }

        @Override // p122df.InterfaceC9034e
        /* renamed from: b */
        public Type mo17728b() {
            return this.f21119a;
        }

        @Override // p122df.InterfaceC9034e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9032d mo17727a(InterfaceC9032d interfaceC9032d) {
            Executor executor = this.f21120b;
            return executor == null ? interfaceC9032d : new b(executor, interfaceC9032d);
        }
    }

    /* renamed from: df.i$b */
    public static final class b implements InterfaceC9032d {

        /* renamed from: c */
        public final Executor f21122c;

        /* renamed from: d */
        public final InterfaceC9032d f21123d;

        /* renamed from: df.i$b$a */
        public class a implements InterfaceC9036f {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC9036f f21124a;

            public a(InterfaceC9036f interfaceC9036f) {
                this.f21124a = interfaceC9036f;
            }

            /* renamed from: d */
            public static /* synthetic */ void m17762d(a aVar, InterfaceC9036f interfaceC9036f, C9031c0 c9031c0) {
                if (b.this.f21123d.isCanceled()) {
                    interfaceC9036f.mo17734a(b.this, new IOException("Canceled"));
                } else {
                    interfaceC9036f.mo17735b(b.this, c9031c0);
                }
            }

            @Override // p122df.InterfaceC9036f
            /* renamed from: a */
            public void mo17734a(InterfaceC9032d interfaceC9032d, final Throwable th) {
                Executor executor = b.this.f21122c;
                final InterfaceC9036f interfaceC9036f = this.f21124a;
                executor.execute(new Runnable() { // from class: df.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9036f.mo17734a(C9042i.b.this, th);
                    }
                });
            }

            @Override // p122df.InterfaceC9036f
            /* renamed from: b */
            public void mo17735b(InterfaceC9032d interfaceC9032d, final C9031c0 c9031c0) {
                Executor executor = b.this.f21122c;
                final InterfaceC9036f interfaceC9036f = this.f21124a;
                executor.execute(new Runnable() { // from class: df.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9042i.b.a.m17762d(this.f21126c, interfaceC9036f, c9031c0);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC9032d interfaceC9032d) {
            this.f21122c = executor;
            this.f21123d = interfaceC9032d;
        }

        @Override // p122df.InterfaceC9032d
        /* renamed from: c */
        public void mo17710c(InterfaceC9036f interfaceC9036f) {
            Objects.requireNonNull(interfaceC9036f, "callback == null");
            this.f21123d.mo17710c(new a(interfaceC9036f));
        }

        @Override // p122df.InterfaceC9032d
        public void cancel() {
            this.f21123d.cancel();
        }

        @Override // p122df.InterfaceC9032d
        public boolean isCanceled() {
            return this.f21123d.isCanceled();
        }

        @Override // p122df.InterfaceC9032d
        public C9743w request() {
            return this.f21123d.request();
        }

        @Override // p122df.InterfaceC9032d
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public InterfaceC9032d m34158clone() {
            return new b(this.f21122c, this.f21123d.m34158clone());
        }
    }

    public C9042i(Executor executor) {
        this.f21118a = executor;
    }

    @Override // p122df.InterfaceC9034e.a
    /* renamed from: a */
    public InterfaceC9034e mo17731a(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        if (InterfaceC9034e.a.m17730c(type) != InterfaceC9032d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(AbstractC9041h0.m17745g(0, (ParameterizedType) type), AbstractC9041h0.m17750l(annotationArr, InterfaceC9037f0.class) ? null : this.f21118a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
