package p122df;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p122df.InterfaceC9034e;
import retrofit2.HttpException;

/* renamed from: df.g */
/* loaded from: classes6.dex */
public final class C9038g extends InterfaceC9034e.a {

    /* renamed from: df.g$a */
    public static final class a implements InterfaceC9034e {

        /* renamed from: a */
        public final Type f21102a;

        /* renamed from: df.g$a$a, reason: collision with other inner class name */
        public class C12135a implements InterfaceC9036f {

            /* renamed from: a */
            public final CompletableFuture f21103a;

            public C12135a(CompletableFuture completableFuture) {
                this.f21103a = completableFuture;
            }

            @Override // p122df.InterfaceC9036f
            /* renamed from: a */
            public void mo17734a(InterfaceC9032d interfaceC9032d, Throwable th) {
                this.f21103a.completeExceptionally(th);
            }

            @Override // p122df.InterfaceC9036f
            /* renamed from: b */
            public void mo17735b(InterfaceC9032d interfaceC9032d, C9031c0 c9031c0) {
                if (c9031c0.m17707e()) {
                    this.f21103a.complete(c9031c0.m17704a());
                } else {
                    this.f21103a.completeExceptionally(new HttpException(c9031c0));
                }
            }
        }

        public a(Type type) {
            this.f21102a = type;
        }

        @Override // p122df.InterfaceC9034e
        /* renamed from: b */
        public Type mo17728b() {
            return this.f21102a;
        }

        @Override // p122df.InterfaceC9034e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo17727a(InterfaceC9032d interfaceC9032d) {
            b bVar = new b(interfaceC9032d);
            interfaceC9032d.mo17710c(new C12135a(bVar));
            return bVar;
        }
    }

    /* renamed from: df.g$b */
    public static final class b extends CompletableFuture {

        /* renamed from: c */
        public final InterfaceC9032d f21105c;

        public b(InterfaceC9032d interfaceC9032d) {
            this.f21105c = interfaceC9032d;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f21105c.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* renamed from: df.g$c */
    public static final class c implements InterfaceC9034e {

        /* renamed from: a */
        public final Type f21106a;

        /* renamed from: df.g$c$a */
        public class a implements InterfaceC9036f {

            /* renamed from: a */
            public final CompletableFuture f21107a;

            public a(CompletableFuture completableFuture) {
                this.f21107a = completableFuture;
            }

            @Override // p122df.InterfaceC9036f
            /* renamed from: a */
            public void mo17734a(InterfaceC9032d interfaceC9032d, Throwable th) {
                this.f21107a.completeExceptionally(th);
            }

            @Override // p122df.InterfaceC9036f
            /* renamed from: b */
            public void mo17735b(InterfaceC9032d interfaceC9032d, C9031c0 c9031c0) {
                this.f21107a.complete(c9031c0);
            }
        }

        public c(Type type) {
            this.f21106a = type;
        }

        @Override // p122df.InterfaceC9034e
        /* renamed from: b */
        public Type mo17728b() {
            return this.f21106a;
        }

        @Override // p122df.InterfaceC9034e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo17727a(InterfaceC9032d interfaceC9032d) {
            b bVar = new b(interfaceC9032d);
            interfaceC9032d.mo17710c(new a(bVar));
            return bVar;
        }
    }

    @Override // p122df.InterfaceC9034e.a
    /* renamed from: a */
    public InterfaceC9034e mo17731a(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        if (InterfaceC9034e.a.m17730c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM17729b = InterfaceC9034e.a.m17729b(0, (ParameterizedType) type);
        if (InterfaceC9034e.a.m17730c(typeM17729b) != C9031c0.class) {
            return new a(typeM17729b);
        }
        if (typeM17729b instanceof ParameterizedType) {
            return new c(InterfaceC9034e.a.m17729b(0, (ParameterizedType) typeM17729b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
