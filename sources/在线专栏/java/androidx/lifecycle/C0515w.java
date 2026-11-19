package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2552g;
import p087f3.C2605v0;
import p087f3.InterfaceC2557h0;
import p087f3.InterfaceC2578m1;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public final class C0515w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC2750f(m9206c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m9207f = "PausingDispatcher.kt", m9208l = {162}, m9209m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.w$a */
    static final class a<T> extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super T>, Object> {

        /* renamed from: b */
        private /* synthetic */ Object f3450b;

        /* renamed from: c */
        int f3451c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0496f f3452d;

        /* renamed from: e */
        final /* synthetic */ AbstractC0496f.c f3453e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC3474p f3454f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC0496f abstractC0496f, AbstractC0496f.c cVar, InterfaceC3474p interfaceC3474p, InterfaceC3012d interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f3452d = abstractC0496f;
            this.f3453e = cVar;
            this.f3454f = interfaceC3474p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> completion) {
            C2769l.m9241e(completion, "completion");
            a aVar = new a(this.f3452d, this.f3453e, this.f3454f, completion);
            aVar.f3450b = obj;
            return aVar;
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public final Object mo2812d(InterfaceC2557h0 interfaceC2557h0, Object obj) {
            return ((a) create(interfaceC2557h0, (InterfaceC3012d) obj)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f3451c;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.f3450b;
                try {
                    C2920m.m9994b(obj);
                    lifecycleController.m2808c();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.m2808c();
                    throw th;
                }
            }
            C2920m.m9994b(obj);
            InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) ((InterfaceC2557h0) this.f3450b).mo2809e().get(InterfaceC2578m1.f10268P);
            if (interfaceC2578m1 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            C0514v c0514v = new C0514v();
            LifecycleController lifecycleController2 = new LifecycleController(this.f3452d, this.f3453e, c0514v.f3449b, interfaceC2578m1);
            try {
                InterfaceC3474p interfaceC3474p = this.f3454f;
                this.f3450b = lifecycleController2;
                this.f3451c = 1;
                obj = C2552g.m8560g(c0514v, interfaceC3474p, this);
                if (obj == objM10175c) {
                    return objM10175c;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.m2808c();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.m2808c();
                throw th;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static final <T> Object m2907a(@NotNull AbstractC0496f abstractC0496f, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        return m2909c(abstractC0496f, AbstractC0496f.c.CREATED, interfaceC3474p, interfaceC3012d);
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m2908b(@NotNull AbstractC0496f abstractC0496f, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        return m2909c(abstractC0496f, AbstractC0496f.c.RESUMED, interfaceC3474p, interfaceC3012d);
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m2909c(@NotNull AbstractC0496f abstractC0496f, @NotNull AbstractC0496f.c cVar, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        return C2552g.m8560g(C2605v0.m8752c().mo8757L(), new a(abstractC0496f, cVar, interfaceC3474p, null), interfaceC3012d);
    }
}
