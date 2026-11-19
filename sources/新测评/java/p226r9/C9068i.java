package p226r9;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p011a9.C0060w;
import p226r9.C9068i;
import p226r9.InterfaceC9060e;

/* renamed from: r9.i */
/* loaded from: classes5.dex */
public final class C9068i extends InterfaceC9060e.a {

    /* renamed from: a */
    public final Executor f15615a;

    /* renamed from: r9.i$a */
    public class a implements InterfaceC9060e {

        /* renamed from: a */
        public final /* synthetic */ Type f15616a;

        /* renamed from: b */
        public final /* synthetic */ Executor f15617b;

        public a(Type type, Executor executor) {
            this.f15616a = type;
            this.f15617b = executor;
        }

        @Override // p226r9.InterfaceC9060e
        /* renamed from: a */
        public Type mo15264a() {
            return this.f15616a;
        }

        @Override // p226r9.InterfaceC9060e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9058d mo15265b(InterfaceC9058d interfaceC9058d) {
            Executor executor = this.f15617b;
            return executor == null ? interfaceC9058d : new b(executor, interfaceC9058d);
        }
    }

    /* renamed from: r9.i$b */
    public static final class b implements InterfaceC9058d {

        /* renamed from: a */
        public final Executor f15619a;

        /* renamed from: b */
        public final InterfaceC9058d f15620b;

        /* renamed from: r9.i$b$a */
        public class a implements InterfaceC9062f {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC9062f f15621a;

            public a(InterfaceC9062f interfaceC9062f) {
                this.f15621a = interfaceC9062f;
            }

            /* renamed from: d */
            public static /* synthetic */ void m15302d(a aVar, InterfaceC9062f interfaceC9062f, C9057c0 c9057c0) {
                if (b.this.f15620b.isCanceled()) {
                    interfaceC9062f.mo15272b(b.this, new IOException("Canceled"));
                } else {
                    interfaceC9062f.mo15271a(b.this, c9057c0);
                }
            }

            @Override // p226r9.InterfaceC9062f
            /* renamed from: a */
            public void mo15271a(InterfaceC9058d interfaceC9058d, final C9057c0 c9057c0) {
                Executor executor = b.this.f15619a;
                final InterfaceC9062f interfaceC9062f = this.f15621a;
                executor.execute(new Runnable() { // from class: r9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9068i.b.a.m15302d(this.f15623a, interfaceC9062f, c9057c0);
                    }
                });
            }

            @Override // p226r9.InterfaceC9062f
            /* renamed from: b */
            public void mo15272b(InterfaceC9058d interfaceC9058d, final Throwable th) {
                Executor executor = b.this.f15619a;
                final InterfaceC9062f interfaceC9062f = this.f15621a;
                executor.execute(new Runnable() { // from class: r9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9062f.mo15272b(C9068i.b.this, th);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC9058d interfaceC9058d) {
            this.f15619a = executor;
            this.f15620b = interfaceC9058d;
        }

        @Override // p226r9.InterfaceC9058d
        /* renamed from: a */
        public C0060w mo15246a() {
            return this.f15620b.mo15246a();
        }

        @Override // p226r9.InterfaceC9058d
        public void cancel() {
            this.f15620b.cancel();
        }

        @Override // p226r9.InterfaceC9058d
        public boolean isCanceled() {
            return this.f15620b.isCanceled();
        }

        @Override // p226r9.InterfaceC9058d
        /* renamed from: j */
        public void mo15247j(InterfaceC9062f interfaceC9062f) {
            Objects.requireNonNull(interfaceC9062f, "callback == null");
            this.f15620b.mo15247j(new a(interfaceC9062f));
        }

        @Override // p226r9.InterfaceC9058d
        public InterfaceC9058d clone() {
            return new b(this.f15619a, this.f15620b.clone());
        }
    }

    public C9068i(Executor executor) {
        this.f15615a = executor;
    }

    @Override // p226r9.InterfaceC9060e.a
    /* renamed from: a */
    public InterfaceC9060e mo15268a(Type type, Annotation[] annotationArr, C9059d0 c9059d0) {
        if (InterfaceC9060e.a.m15267c(type) != InterfaceC9058d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(AbstractC9067h0.m15285g(0, (ParameterizedType) type), AbstractC9067h0.m15290l(annotationArr, InterfaceC9063f0.class) ? null : this.f15615a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
