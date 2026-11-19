package ca;

import ca.InterfaceC5284e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

/* renamed from: ca.g */
/* loaded from: classes5.dex */
public final class C5288g extends InterfaceC5284e.a {

    /* renamed from: ca.g$a */
    public static final class a implements InterfaceC5284e {

        /* renamed from: a */
        public final Type f2493a;

        /* renamed from: ca.g$a$a, reason: collision with other inner class name */
        public class C10786a implements InterfaceC5286f {

            /* renamed from: a */
            public final CompletableFuture f2494a;

            public C10786a(CompletableFuture completableFuture) {
                this.f2494a = completableFuture;
            }

            @Override // ca.InterfaceC5286f
            /* renamed from: a */
            public void mo2273a(InterfaceC5282d interfaceC5282d, Throwable th) {
                this.f2494a.completeExceptionally(th);
            }

            @Override // ca.InterfaceC5286f
            /* renamed from: b */
            public void mo2274b(InterfaceC5282d interfaceC5282d, C5281c0 c5281c0) {
                if (c5281c0.m2246e()) {
                    this.f2494a.complete(c5281c0.m2243a());
                } else {
                    this.f2494a.completeExceptionally(new HttpException(c5281c0));
                }
            }
        }

        public a(Type type) {
            this.f2493a = type;
        }

        @Override // ca.InterfaceC5284e
        /* renamed from: a */
        public Type mo2266a() {
            return this.f2493a;
        }

        @Override // ca.InterfaceC5284e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo2267b(InterfaceC5282d interfaceC5282d) {
            b bVar = new b(interfaceC5282d);
            interfaceC5282d.mo2249d(new C10786a(bVar));
            return bVar;
        }
    }

    /* renamed from: ca.g$b */
    public static final class b extends CompletableFuture {

        /* renamed from: a */
        public final InterfaceC5282d f2496a;

        public b(InterfaceC5282d interfaceC5282d) {
            this.f2496a = interfaceC5282d;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f2496a.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* renamed from: ca.g$c */
    public static final class c implements InterfaceC5284e {

        /* renamed from: a */
        public final Type f2497a;

        /* renamed from: ca.g$c$a */
        public class a implements InterfaceC5286f {

            /* renamed from: a */
            public final CompletableFuture f2498a;

            public a(CompletableFuture completableFuture) {
                this.f2498a = completableFuture;
            }

            @Override // ca.InterfaceC5286f
            /* renamed from: a */
            public void mo2273a(InterfaceC5282d interfaceC5282d, Throwable th) {
                this.f2498a.completeExceptionally(th);
            }

            @Override // ca.InterfaceC5286f
            /* renamed from: b */
            public void mo2274b(InterfaceC5282d interfaceC5282d, C5281c0 c5281c0) {
                this.f2498a.complete(c5281c0);
            }
        }

        public c(Type type) {
            this.f2497a = type;
        }

        @Override // ca.InterfaceC5284e
        /* renamed from: a */
        public Type mo2266a() {
            return this.f2497a;
        }

        @Override // ca.InterfaceC5284e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo2267b(InterfaceC5282d interfaceC5282d) {
            b bVar = new b(interfaceC5282d);
            interfaceC5282d.mo2249d(new a(bVar));
            return bVar;
        }
    }

    @Override // ca.InterfaceC5284e.a
    /* renamed from: a */
    public InterfaceC5284e mo2270a(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
        if (InterfaceC5284e.a.m2269c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM2268b = InterfaceC5284e.a.m2268b(0, (ParameterizedType) type);
        if (InterfaceC5284e.a.m2269c(typeM2268b) != C5281c0.class) {
            return new a(typeM2268b);
        }
        if (typeM2268b instanceof ParameterizedType) {
            return new c(InterfaceC5284e.a.m2268b(0, (ParameterizedType) typeM2268b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
