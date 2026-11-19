package ca;

import ca.C5292i;
import ca.InterfaceC5284e;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p136i9.C8899b0;

/* renamed from: ca.i */
/* loaded from: classes5.dex */
public final class C5292i extends InterfaceC5284e.a {

    /* renamed from: a */
    public final Executor f2509a;

    /* renamed from: ca.i$a */
    public class a implements InterfaceC5284e {

        /* renamed from: a */
        public final /* synthetic */ Type f2510a;

        /* renamed from: b */
        public final /* synthetic */ Executor f2511b;

        public a(Type type, Executor executor) {
            this.f2510a = type;
            this.f2511b = executor;
        }

        @Override // ca.InterfaceC5284e
        /* renamed from: a */
        public Type mo2266a() {
            return this.f2510a;
        }

        @Override // ca.InterfaceC5284e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5282d mo2267b(InterfaceC5282d interfaceC5282d) {
            Executor executor = this.f2511b;
            return executor == null ? interfaceC5282d : new b(executor, interfaceC5282d);
        }
    }

    /* renamed from: ca.i$b */
    public static final class b implements InterfaceC5282d {

        /* renamed from: a */
        public final Executor f2513a;

        /* renamed from: b */
        public final InterfaceC5282d f2514b;

        /* renamed from: ca.i$b$a */
        public class a implements InterfaceC5286f {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC5286f f2515a;

            public a(InterfaceC5286f interfaceC5286f) {
                this.f2515a = interfaceC5286f;
            }

            /* renamed from: d */
            public static /* synthetic */ void m2304d(a aVar, InterfaceC5286f interfaceC5286f, C5281c0 c5281c0) {
                if (b.this.f2514b.isCanceled()) {
                    interfaceC5286f.mo2273a(b.this, new IOException("Canceled"));
                } else {
                    interfaceC5286f.mo2274b(b.this, c5281c0);
                }
            }

            @Override // ca.InterfaceC5286f
            /* renamed from: a */
            public void mo2273a(InterfaceC5282d interfaceC5282d, final Throwable th) {
                Executor executor = b.this.f2513a;
                final InterfaceC5286f interfaceC5286f = this.f2515a;
                executor.execute(new Runnable() { // from class: ca.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC5286f.mo2273a(C5292i.b.this, th);
                    }
                });
            }

            @Override // ca.InterfaceC5286f
            /* renamed from: b */
            public void mo2274b(InterfaceC5282d interfaceC5282d, final C5281c0 c5281c0) {
                Executor executor = b.this.f2513a;
                final InterfaceC5286f interfaceC5286f = this.f2515a;
                executor.execute(new Runnable() { // from class: ca.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5292i.b.a.m2304d(this.f2517a, interfaceC5286f, c5281c0);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC5282d interfaceC5282d) {
            this.f2513a = executor;
            this.f2514b = interfaceC5282d;
        }

        @Override // ca.InterfaceC5282d
        /* renamed from: a */
        public C8899b0 mo2248a() {
            return this.f2514b.mo2248a();
        }

        @Override // ca.InterfaceC5282d
        public void cancel() {
            this.f2514b.cancel();
        }

        @Override // ca.InterfaceC5282d
        /* renamed from: d */
        public void mo2249d(InterfaceC5286f interfaceC5286f) {
            Objects.requireNonNull(interfaceC5286f, "callback == null");
            this.f2514b.mo2249d(new a(interfaceC5286f));
        }

        @Override // ca.InterfaceC5282d
        public boolean isCanceled() {
            return this.f2514b.isCanceled();
        }

        @Override // ca.InterfaceC5282d
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public InterfaceC5282d m27378clone() {
            return new b(this.f2513a, this.f2514b.m27378clone());
        }
    }

    public C5292i(Executor executor) {
        this.f2509a = executor;
    }

    @Override // ca.InterfaceC5284e.a
    /* renamed from: a */
    public InterfaceC5284e mo2270a(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
        if (InterfaceC5284e.a.m2269c(type) != InterfaceC5282d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(AbstractC5291h0.m2287g(0, (ParameterizedType) type), AbstractC5291h0.m2292l(annotationArr, InterfaceC5287f0.class) ? null : this.f2509a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
