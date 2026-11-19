package p200z5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p200z5.InterfaceC7960e;
import retrofit2.HttpException;

/* renamed from: z5.g */
/* loaded from: classes4.dex */
public final class C7964g extends InterfaceC7960e.a {

    /* renamed from: z5.g$a */
    public static final class a implements InterfaceC7960e {

        /* renamed from: a */
        public final Type f10754a;

        /* renamed from: z5.g$a$a, reason: collision with other inner class name */
        public class C8043a implements InterfaceC7962f {

            /* renamed from: a */
            public final CompletableFuture f10755a;

            public C8043a(CompletableFuture completableFuture) {
                this.f10755a = completableFuture;
            }

            @Override // p200z5.InterfaceC7962f
            /* renamed from: a */
            public void mo9121a(InterfaceC7958d interfaceC7958d, C7957c0 c7957c0) {
                if (c7957c0.m9788e()) {
                    this.f10755a.complete(c7957c0.m9785a());
                } else {
                    this.f10755a.completeExceptionally(new HttpException(c7957c0));
                }
            }

            @Override // p200z5.InterfaceC7962f
            /* renamed from: b */
            public void mo9122b(InterfaceC7958d interfaceC7958d, Throwable th) {
                this.f10755a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f10754a = type;
        }

        @Override // p200z5.InterfaceC7960e
        /* renamed from: a */
        public Type mo9808a() {
            return this.f10754a;
        }

        @Override // p200z5.InterfaceC7960e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo9809b(InterfaceC7958d interfaceC7958d) {
            b bVar = new b(interfaceC7958d);
            interfaceC7958d.mo9791g(new C8043a(bVar));
            return bVar;
        }
    }

    /* renamed from: z5.g$b */
    public static final class b extends CompletableFuture {

        /* renamed from: a */
        public final InterfaceC7958d f10757a;

        public b(InterfaceC7958d interfaceC7958d) {
            this.f10757a = interfaceC7958d;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            if (z6) {
                this.f10757a.cancel();
            }
            return super.cancel(z6);
        }
    }

    /* renamed from: z5.g$c */
    public static final class c implements InterfaceC7960e {

        /* renamed from: a */
        public final Type f10758a;

        /* renamed from: z5.g$c$a */
        public class a implements InterfaceC7962f {

            /* renamed from: a */
            public final CompletableFuture f10759a;

            public a(CompletableFuture completableFuture) {
                this.f10759a = completableFuture;
            }

            @Override // p200z5.InterfaceC7962f
            /* renamed from: a */
            public void mo9121a(InterfaceC7958d interfaceC7958d, C7957c0 c7957c0) {
                this.f10759a.complete(c7957c0);
            }

            @Override // p200z5.InterfaceC7962f
            /* renamed from: b */
            public void mo9122b(InterfaceC7958d interfaceC7958d, Throwable th) {
                this.f10759a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f10758a = type;
        }

        @Override // p200z5.InterfaceC7960e
        /* renamed from: a */
        public Type mo9808a() {
            return this.f10758a;
        }

        @Override // p200z5.InterfaceC7960e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo9809b(InterfaceC7958d interfaceC7958d) {
            b bVar = new b(interfaceC7958d);
            interfaceC7958d.mo9791g(new a(bVar));
            return bVar;
        }
    }

    @Override // p200z5.InterfaceC7960e.a
    /* renamed from: a */
    public InterfaceC7960e mo9812a(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
        if (InterfaceC7960e.a.m9811c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM9810b = InterfaceC7960e.a.m9810b(0, (ParameterizedType) type);
        if (InterfaceC7960e.a.m9811c(typeM9810b) != C7957c0.class) {
            return new a(typeM9810b);
        }
        if (typeM9810b instanceof ParameterizedType) {
            return new c(InterfaceC7960e.a.m9810b(0, (ParameterizedType) typeM9810b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
