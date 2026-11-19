package p080j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p080j3.InterfaceC3809c;
import retrofit2.HttpException;

/* renamed from: j3.h */
/* loaded from: classes2.dex */
public final class C3819h extends InterfaceC3809c.a {

    /* renamed from: a */
    public static final InterfaceC3809c.a f4632a = new C3819h();

    /* renamed from: j3.h$a */
    public static final class a implements InterfaceC3809c {

        /* renamed from: a */
        public final Type f4633a;

        /* renamed from: j3.h$a$a, reason: collision with other inner class name */
        public class C4760a implements InterfaceC3811d {

            /* renamed from: a */
            public final CompletableFuture f4634a;

            public C4760a(CompletableFuture completableFuture) {
                this.f4634a = completableFuture;
            }

            @Override // p080j3.InterfaceC3811d
            /* renamed from: a */
            public void mo5015a(InterfaceC3807b interfaceC3807b, C3812d0 c3812d0) {
                if (c3812d0.m5023e()) {
                    this.f4634a.complete(c3812d0.m5020a());
                } else {
                    this.f4634a.completeExceptionally(new HttpException(c3812d0));
                }
            }

            @Override // p080j3.InterfaceC3811d
            /* renamed from: b */
            public void mo5016b(InterfaceC3807b interfaceC3807b, Throwable th) {
                this.f4634a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f4633a = type;
        }

        @Override // p080j3.InterfaceC3809c
        /* renamed from: b */
        public Type mo4999b() {
            return this.f4633a;
        }

        @Override // p080j3.InterfaceC3809c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo4998a(InterfaceC3807b interfaceC3807b) {
            b bVar = new b(interfaceC3807b);
            interfaceC3807b.mo4984U(new C4760a(bVar));
            return bVar;
        }
    }

    /* renamed from: j3.h$b */
    public static final class b extends CompletableFuture {

        /* renamed from: a */
        public final InterfaceC3807b f4636a;

        public b(InterfaceC3807b interfaceC3807b) {
            this.f4636a = interfaceC3807b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z3) {
            if (z3) {
                this.f4636a.cancel();
            }
            return super.cancel(z3);
        }
    }

    /* renamed from: j3.h$c */
    public static final class c implements InterfaceC3809c {

        /* renamed from: a */
        public final Type f4637a;

        /* renamed from: j3.h$c$a */
        public class a implements InterfaceC3811d {

            /* renamed from: a */
            public final CompletableFuture f4638a;

            public a(CompletableFuture completableFuture) {
                this.f4638a = completableFuture;
            }

            @Override // p080j3.InterfaceC3811d
            /* renamed from: a */
            public void mo5015a(InterfaceC3807b interfaceC3807b, C3812d0 c3812d0) {
                this.f4638a.complete(c3812d0);
            }

            @Override // p080j3.InterfaceC3811d
            /* renamed from: b */
            public void mo5016b(InterfaceC3807b interfaceC3807b, Throwable th) {
                this.f4638a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f4637a = type;
        }

        @Override // p080j3.InterfaceC3809c
        /* renamed from: b */
        public Type mo4999b() {
            return this.f4637a;
        }

        @Override // p080j3.InterfaceC3809c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo4998a(InterfaceC3807b interfaceC3807b) {
            b bVar = new b(interfaceC3807b);
            interfaceC3807b.mo4984U(new a(bVar));
            return bVar;
        }
    }

    @Override // p080j3.InterfaceC3809c.a
    /* renamed from: a */
    public InterfaceC3809c mo5002a(Type type, Annotation[] annotationArr, C3814e0 c3814e0) {
        if (InterfaceC3809c.a.m5001c(type) != AbstractC3813e.m5025a()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM5000b = InterfaceC3809c.a.m5000b(0, (ParameterizedType) type);
        if (InterfaceC3809c.a.m5001c(typeM5000b) != C3812d0.class) {
            return new a(typeM5000b);
        }
        if (typeM5000b instanceof ParameterizedType) {
            return new c(InterfaceC3809c.a.m5000b(0, (ParameterizedType) typeM5000b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
