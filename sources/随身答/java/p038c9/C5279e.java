package p038c9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p038c9.InterfaceC5276c;
import retrofit2.HttpException;

/* renamed from: c9.e */
/* loaded from: classes5.dex */
public final class C5279e extends InterfaceC5276c.a {

    /* renamed from: a */
    public static final InterfaceC5276c.a f2531a = new C5279e();

    /* renamed from: c9.e$a */
    public static final class a implements InterfaceC5276c {

        /* renamed from: a */
        public final Type f2532a;

        /* renamed from: c9.e$a$a, reason: collision with other inner class name */
        public class C10050a implements InterfaceC5278d {

            /* renamed from: a */
            public final CompletableFuture f2533a;

            public C10050a(CompletableFuture completableFuture) {
                this.f2533a = completableFuture;
            }

            @Override // p038c9.InterfaceC5278d
            /* renamed from: a */
            public void mo236a(InterfaceC5274b interfaceC5274b, Throwable th) {
                this.f2533a.completeExceptionally(th);
            }

            @Override // p038c9.InterfaceC5278d
            /* renamed from: b */
            public void mo237b(InterfaceC5274b interfaceC5274b, C5298x c5298x) {
                if (c5298x.m2524f()) {
                    this.f2533a.complete(c5298x.m2520a());
                } else {
                    this.f2533a.completeExceptionally(new HttpException(c5298x));
                }
            }
        }

        public a(Type type) {
            this.f2532a = type;
        }

        @Override // p038c9.InterfaceC5276c
        /* renamed from: a */
        public Type mo228a() {
            return this.f2532a;
        }

        @Override // p038c9.InterfaceC5276c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo229b(InterfaceC5274b interfaceC5274b) {
            b bVar = new b(interfaceC5274b);
            interfaceC5274b.mo234c(new C10050a(bVar));
            return bVar;
        }
    }

    /* renamed from: c9.e$b */
    public static final class b extends CompletableFuture {

        /* renamed from: a */
        public final InterfaceC5274b f2535a;

        public b(InterfaceC5274b interfaceC5274b) {
            this.f2535a = interfaceC5274b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z9) {
            if (z9) {
                this.f2535a.cancel();
            }
            return super.cancel(z9);
        }
    }

    /* renamed from: c9.e$c */
    public static final class c implements InterfaceC5276c {

        /* renamed from: a */
        public final Type f2536a;

        /* renamed from: c9.e$c$a */
        public class a implements InterfaceC5278d {

            /* renamed from: a */
            public final CompletableFuture f2537a;

            public a(CompletableFuture completableFuture) {
                this.f2537a = completableFuture;
            }

            @Override // p038c9.InterfaceC5278d
            /* renamed from: a */
            public void mo236a(InterfaceC5274b interfaceC5274b, Throwable th) {
                this.f2537a.completeExceptionally(th);
            }

            @Override // p038c9.InterfaceC5278d
            /* renamed from: b */
            public void mo237b(InterfaceC5274b interfaceC5274b, C5298x c5298x) {
                this.f2537a.complete(c5298x);
            }
        }

        public c(Type type) {
            this.f2536a = type;
        }

        @Override // p038c9.InterfaceC5276c
        /* renamed from: a */
        public Type mo228a() {
            return this.f2536a;
        }

        @Override // p038c9.InterfaceC5276c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo229b(InterfaceC5274b interfaceC5274b) {
            b bVar = new b(interfaceC5274b);
            interfaceC5274b.mo234c(new a(bVar));
            return bVar;
        }
    }

    @Override // p038c9.InterfaceC5276c.a
    /* renamed from: a */
    public InterfaceC5276c mo231a(Type type, Annotation[] annotationArr, C5299y c5299y) {
        if (InterfaceC5276c.a.m2424c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM2423b = InterfaceC5276c.a.m2423b(0, (ParameterizedType) type);
        if (InterfaceC5276c.a.m2424c(typeM2423b) != C5298x.class) {
            return new a(typeM2423b);
        }
        if (typeM2423b instanceof ParameterizedType) {
            return new c(InterfaceC5276c.a.m2423b(0, (ParameterizedType) typeM2423b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
