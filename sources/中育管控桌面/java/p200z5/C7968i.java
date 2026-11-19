package p200z5;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p058f5.C6358b0;
import p200z5.C7968i;
import p200z5.InterfaceC7960e;

/* renamed from: z5.i */
/* loaded from: classes4.dex */
public final class C7968i extends InterfaceC7960e.a {

    /* renamed from: a */
    public final Executor f10770a;

    /* renamed from: z5.i$a */
    public class a implements InterfaceC7960e {

        /* renamed from: a */
        public final /* synthetic */ Type f10771a;

        /* renamed from: b */
        public final /* synthetic */ Executor f10772b;

        public a(Type type, Executor executor) {
            this.f10771a = type;
            this.f10772b = executor;
        }

        @Override // p200z5.InterfaceC7960e
        /* renamed from: a */
        public Type mo9808a() {
            return this.f10771a;
        }

        @Override // p200z5.InterfaceC7960e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC7958d mo9809b(InterfaceC7958d interfaceC7958d) {
            Executor executor = this.f10772b;
            return executor == null ? interfaceC7958d : new b(executor, interfaceC7958d);
        }
    }

    /* renamed from: z5.i$b */
    public static final class b implements InterfaceC7958d {

        /* renamed from: a */
        public final Executor f10774a;

        /* renamed from: b */
        public final InterfaceC7958d f10775b;

        /* renamed from: z5.i$b$a */
        public class a implements InterfaceC7962f {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC7962f f10776a;

            public a(InterfaceC7962f interfaceC7962f) {
                this.f10776a = interfaceC7962f;
            }

            /* renamed from: d */
            public static /* synthetic */ void m9844d(a aVar, InterfaceC7962f interfaceC7962f, C7957c0 c7957c0) {
                if (b.this.f10775b.isCanceled()) {
                    interfaceC7962f.mo9122b(b.this, new IOException("Canceled"));
                } else {
                    interfaceC7962f.mo9121a(b.this, c7957c0);
                }
            }

            @Override // p200z5.InterfaceC7962f
            /* renamed from: a */
            public void mo9121a(InterfaceC7958d interfaceC7958d, final C7957c0 c7957c0) {
                Executor executor = b.this.f10774a;
                final InterfaceC7962f interfaceC7962f = this.f10776a;
                executor.execute(new Runnable() { // from class: z5.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7968i.b.a.m9844d(this.f10778a, interfaceC7962f, c7957c0);
                    }
                });
            }

            @Override // p200z5.InterfaceC7962f
            /* renamed from: b */
            public void mo9122b(InterfaceC7958d interfaceC7958d, final Throwable th) {
                Executor executor = b.this.f10774a;
                final InterfaceC7962f interfaceC7962f = this.f10776a;
                executor.execute(new Runnable() { // from class: z5.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC7962f.mo9122b(C7968i.b.this, th);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC7958d interfaceC7958d) {
            this.f10774a = executor;
            this.f10775b = interfaceC7958d;
        }

        @Override // p200z5.InterfaceC7958d
        /* renamed from: a */
        public C6358b0 mo9790a() {
            return this.f10775b.mo9790a();
        }

        @Override // p200z5.InterfaceC7958d
        public void cancel() {
            this.f10775b.cancel();
        }

        @Override // p200z5.InterfaceC7958d
        /* renamed from: g */
        public void mo9791g(InterfaceC7962f interfaceC7962f) {
            Objects.requireNonNull(interfaceC7962f, "callback == null");
            this.f10775b.mo9791g(new a(interfaceC7962f));
        }

        @Override // p200z5.InterfaceC7958d
        public boolean isCanceled() {
            return this.f10775b.isCanceled();
        }

        @Override // p200z5.InterfaceC7958d
        public InterfaceC7958d clone() {
            return new b(this.f10774a, this.f10775b.clone());
        }
    }

    public C7968i(Executor executor) {
        this.f10770a = executor;
    }

    @Override // p200z5.InterfaceC7960e.a
    /* renamed from: a */
    public InterfaceC7960e mo9812a(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
        if (InterfaceC7960e.a.m9811c(type) != InterfaceC7958d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(AbstractC7967h0.m9827g(0, (ParameterizedType) type), AbstractC7967h0.m9832l(annotationArr, InterfaceC7963f0.class) ? null : this.f10770a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
