package p038c9;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p038c9.C5281g;
import p038c9.InterfaceC5276c;
import p172l8.C8924w;

/* renamed from: c9.g */
/* loaded from: classes5.dex */
public final class C5281g extends InterfaceC5276c.a {

    /* renamed from: a */
    public final Executor f2539a;

    /* renamed from: c9.g$a */
    public class a implements InterfaceC5276c {

        /* renamed from: a */
        public final /* synthetic */ Type f2540a;

        /* renamed from: b */
        public final /* synthetic */ Executor f2541b;

        public a(Type type, Executor executor) {
            this.f2540a = type;
            this.f2541b = executor;
        }

        @Override // p038c9.InterfaceC5276c
        /* renamed from: a */
        public Type mo228a() {
            return this.f2540a;
        }

        @Override // p038c9.InterfaceC5276c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5274b mo229b(InterfaceC5274b interfaceC5274b) {
            Executor executor = this.f2541b;
            return executor == null ? interfaceC5274b : new b(executor, interfaceC5274b);
        }
    }

    /* renamed from: c9.g$b */
    public static final class b implements InterfaceC5274b {

        /* renamed from: a */
        public final Executor f2543a;

        /* renamed from: b */
        public final InterfaceC5274b f2544b;

        /* renamed from: c9.g$b$a */
        public class a implements InterfaceC5278d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC5278d f2545a;

            public a(InterfaceC5278d interfaceC5278d) {
                this.f2545a = interfaceC5278d;
            }

            /* renamed from: d */
            public static /* synthetic */ void m2452d(a aVar, InterfaceC5278d interfaceC5278d, C5298x c5298x) {
                if (b.this.f2544b.isCanceled()) {
                    interfaceC5278d.mo236a(b.this, new IOException("Canceled"));
                } else {
                    interfaceC5278d.mo237b(b.this, c5298x);
                }
            }

            @Override // p038c9.InterfaceC5278d
            /* renamed from: a */
            public void mo236a(InterfaceC5274b interfaceC5274b, final Throwable th) {
                Executor executor = b.this.f2543a;
                final InterfaceC5278d interfaceC5278d = this.f2545a;
                executor.execute(new Runnable() { // from class: c9.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC5278d.mo236a(C5281g.b.this, th);
                    }
                });
            }

            @Override // p038c9.InterfaceC5278d
            /* renamed from: b */
            public void mo237b(InterfaceC5274b interfaceC5274b, final C5298x c5298x) {
                Executor executor = b.this.f2543a;
                final InterfaceC5278d interfaceC5278d = this.f2545a;
                executor.execute(new Runnable() { // from class: c9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5281g.b.a.m2452d(this.f2547a, interfaceC5278d, c5298x);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC5274b interfaceC5274b) {
            this.f2543a = executor;
            this.f2544b = interfaceC5274b;
        }

        @Override // p038c9.InterfaceC5274b
        /* renamed from: a */
        public C8924w mo233a() {
            return this.f2544b.mo233a();
        }

        @Override // p038c9.InterfaceC5274b
        /* renamed from: c */
        public void mo234c(InterfaceC5278d interfaceC5278d) {
            Objects.requireNonNull(interfaceC5278d, "callback == null");
            this.f2544b.mo234c(new a(interfaceC5278d));
        }

        @Override // p038c9.InterfaceC5274b
        public void cancel() {
            this.f2544b.cancel();
        }

        @Override // p038c9.InterfaceC5274b
        public boolean isCanceled() {
            return this.f2544b.isCanceled();
        }

        @Override // p038c9.InterfaceC5274b
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public InterfaceC5274b m24657clone() {
            return new b(this.f2543a, this.f2544b.m24657clone());
        }
    }

    public C5281g(Executor executor) {
        this.f2539a = executor;
    }

    @Override // p038c9.InterfaceC5276c.a
    /* renamed from: a */
    public InterfaceC5276c mo231a(Type type, Annotation[] annotationArr, C5299y c5299y) {
        if (InterfaceC5276c.a.m2424c(type) != InterfaceC5274b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(AbstractC5277c0.m2431g(0, (ParameterizedType) type), AbstractC5277c0.m2436l(annotationArr, InterfaceC5273a0.class) ? null : this.f2539a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
