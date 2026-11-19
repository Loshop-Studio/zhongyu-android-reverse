package p226r9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p226r9.InterfaceC9060e;
import retrofit2.HttpException;

/* renamed from: r9.g */
/* loaded from: classes5.dex */
public final class C9064g extends InterfaceC9060e.a {

    /* renamed from: r9.g$a */
    public static final class a implements InterfaceC9060e {

        /* renamed from: a */
        public final Type f15599a;

        /* renamed from: r9.g$a$a, reason: collision with other inner class name */
        public class C10156a implements InterfaceC9062f {

            /* renamed from: a */
            public final CompletableFuture f15600a;

            public C10156a(CompletableFuture completableFuture) {
                this.f15600a = completableFuture;
            }

            @Override // p226r9.InterfaceC9062f
            /* renamed from: a */
            public void mo15271a(InterfaceC9058d interfaceC9058d, C9057c0 c9057c0) {
                if (c9057c0.m15244d()) {
                    this.f15600a.complete(c9057c0.m15242a());
                } else {
                    this.f15600a.completeExceptionally(new HttpException(c9057c0));
                }
            }

            @Override // p226r9.InterfaceC9062f
            /* renamed from: b */
            public void mo15272b(InterfaceC9058d interfaceC9058d, Throwable th) {
                this.f15600a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f15599a = type;
        }

        @Override // p226r9.InterfaceC9060e
        /* renamed from: a */
        public Type mo15264a() {
            return this.f15599a;
        }

        @Override // p226r9.InterfaceC9060e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo15265b(InterfaceC9058d interfaceC9058d) {
            b bVar = new b(interfaceC9058d);
            interfaceC9058d.mo15247j(new C10156a(bVar));
            return bVar;
        }
    }

    /* renamed from: r9.g$b */
    public static final class b extends CompletableFuture {

        /* renamed from: a */
        public final InterfaceC9058d f15602a;

        public b(InterfaceC9058d interfaceC9058d) {
            this.f15602a = interfaceC9058d;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z9) {
            if (z9) {
                this.f15602a.cancel();
            }
            return super.cancel(z9);
        }
    }

    /* renamed from: r9.g$c */
    public static final class c implements InterfaceC9060e {

        /* renamed from: a */
        public final Type f15603a;

        /* renamed from: r9.g$c$a */
        public class a implements InterfaceC9062f {

            /* renamed from: a */
            public final CompletableFuture f15604a;

            public a(CompletableFuture completableFuture) {
                this.f15604a = completableFuture;
            }

            @Override // p226r9.InterfaceC9062f
            /* renamed from: a */
            public void mo15271a(InterfaceC9058d interfaceC9058d, C9057c0 c9057c0) {
                this.f15604a.complete(c9057c0);
            }

            @Override // p226r9.InterfaceC9062f
            /* renamed from: b */
            public void mo15272b(InterfaceC9058d interfaceC9058d, Throwable th) {
                this.f15604a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f15603a = type;
        }

        @Override // p226r9.InterfaceC9060e
        /* renamed from: a */
        public Type mo15264a() {
            return this.f15603a;
        }

        @Override // p226r9.InterfaceC9060e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo15265b(InterfaceC9058d interfaceC9058d) {
            b bVar = new b(interfaceC9058d);
            interfaceC9058d.mo15247j(new a(bVar));
            return bVar;
        }
    }

    @Override // p226r9.InterfaceC9060e.a
    /* renamed from: a */
    public InterfaceC9060e mo15268a(Type type, Annotation[] annotationArr, C9059d0 c9059d0) {
        if (InterfaceC9060e.a.m15267c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM15266b = InterfaceC9060e.a.m15266b(0, (ParameterizedType) type);
        if (InterfaceC9060e.a.m15267c(typeM15266b) != C9057c0.class) {
            return new a(typeM15266b);
        }
        if (typeM15266b instanceof ParameterizedType) {
            return new c(InterfaceC9060e.a.m15266b(0, (ParameterizedType) typeM15266b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
