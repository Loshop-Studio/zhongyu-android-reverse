package androidx.room.coroutines;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineStart;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8836g;
import p135i8.AbstractC8875t;
import p135i8.C8876t0;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8869r;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class RunBlockingUninterruptible_androidKt {

    @InterfaceC9539d(m17800c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", m17801f = "RunBlockingUninterruptible.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 */
    public static final class C45581 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", m17801f = "RunBlockingUninterruptible.android.kt", m17802l = {52}, m17803m = "invokeSuspend")
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC10574p $block;
            final /* synthetic */ InterfaceC8869r $deferred;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC8869r interfaceC8869r, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$deferred = interfaceC8869r;
                this.$block = interfaceC10574p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deferred, this.$block, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC8869r interfaceC8869r;
                Object objM15909b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                    InterfaceC8869r interfaceC8869r2 = this.$deferred;
                    InterfaceC10574p interfaceC10574p = this.$block;
                    try {
                        Result.C9076a c9076a = Result.f17350b;
                        this.L$0 = interfaceC8869r2;
                        this.label = 1;
                        obj = interfaceC10574p.invoke(interfaceC8822b0, this);
                        if (obj == objM17291f) {
                            return objM17291f;
                        }
                        interfaceC8869r = interfaceC8869r2;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC8869r = interfaceC8869r2;
                        Result.C9076a c9076a2 = Result.f17350b;
                        objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
                        AbstractC8875t.m14914c(interfaceC8869r, objM15909b);
                        return C8736p.f16368a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC8869r = (InterfaceC8869r) this.L$0;
                    try {
                        AbstractC9079b.m15926b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.C9076a c9076a22 = Result.f17350b;
                        objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
                        AbstractC8875t.m14914c(interfaceC8869r, objM15909b);
                        return C8736p.f16368a;
                    }
                }
                objM15909b = Result.m15909b(obj);
                AbstractC8875t.m14914c(interfaceC8869r, objM15909b);
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", m17801f = "RunBlockingUninterruptible.android.kt", m17802l = {C3721BR.versionViewModel}, m17803m = "invokeSuspend")
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC8869r $deferred;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC8869r interfaceC8869r, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$deferred = interfaceC8869r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass2(this.$deferred, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super T> interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    return obj;
                }
                AbstractC9079b.m15926b(obj);
                InterfaceC8869r interfaceC8869r = this.$deferred;
                this.label = 1;
                Object objMo14833u = interfaceC8869r.mo14833u(this);
                return objMo14833u == objM17291f ? objM17291f : objMo14833u;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45581(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C45581> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C45581 c45581 = new C45581(this.$block, interfaceC9324c);
            c45581.L$0 = obj;
            return c45581;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super T> interfaceC9324c) {
            return ((C45581) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC9100d.b bVar = ((InterfaceC8822b0) this.L$0).getCoroutineContext().get(InterfaceC9099c.f17441b0);
            AbstractC9133u.m16130d(bVar);
            InterfaceC9099c interfaceC9099c = (InterfaceC9099c) bVar;
            InterfaceC8869r interfaceC8869rM14913b = AbstractC8875t.m14913b(null, 1, null);
            AbstractC8833f.m14844c(C8876t0.f16535a, interfaceC9099c, CoroutineStart.f17555d, new AnonymousClass1(interfaceC8869rM14913b, this.$block, null));
            while (!interfaceC8869rM14913b.mo16289l()) {
                try {
                    return AbstractC8833f.m14846e(interfaceC9099c, new AnonymousClass2(interfaceC8869rM14913b, null));
                } catch (InterruptedException unused) {
                }
            }
            return interfaceC8869rM14913b.mo14832c();
        }
    }

    public static final <T> T runBlockingUninterruptible(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        Thread.interrupted();
        return (T) AbstractC8836g.m14852b(null, new C45581(block, null), 1, null);
    }
}
