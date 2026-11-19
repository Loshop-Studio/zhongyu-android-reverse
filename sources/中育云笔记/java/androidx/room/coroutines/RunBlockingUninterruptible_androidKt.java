package androidx.room.coroutines;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11113g;
import sd.AbstractC11165u;
import sd.C11119h1;
import sd.InterfaceC11122i0;
import sd.InterfaceC11159s;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class RunBlockingUninterruptible_androidKt {

    @InterfaceC11829d(m26210c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", m26211f = "RunBlockingUninterruptible.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 */
    public static final class C45061 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", m26211f = "RunBlockingUninterruptible.android.kt", m26212l = {52}, m26213m = "invokeSuspend")
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9544p $block;
            final /* synthetic */ InterfaceC11159s $deferred;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC11159s interfaceC11159s, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$deferred = interfaceC11159s;
                this.$block = interfaceC9544p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deferred, this.$block, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC11159s interfaceC11159s;
                Object objM20054c;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    InterfaceC11159s interfaceC11159s2 = this.$deferred;
                    InterfaceC9544p interfaceC9544p = this.$block;
                    try {
                        Result.C9921a c9921a = Result.f23263d;
                        this.L$0 = interfaceC11159s2;
                        this.label = 1;
                        obj = interfaceC9544p.invoke(interfaceC11122i0, this);
                        if (obj == objM25952f) {
                            return objM25952f;
                        }
                        interfaceC11159s = interfaceC11159s2;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC11159s = interfaceC11159s2;
                        Result.C9921a c9921a2 = Result.f23263d;
                        objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
                        AbstractC11165u.m24808c(interfaceC11159s, objM20054c);
                        return C10786q.f26013a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC11159s = (InterfaceC11159s) this.L$0;
                    try {
                        AbstractC9924b.m20071b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.C9921a c9921a22 = Result.f23263d;
                        objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
                        AbstractC11165u.m24808c(interfaceC11159s, objM20054c);
                        return C10786q.f26013a;
                    }
                }
                objM20054c = Result.m20054c(obj);
                AbstractC11165u.m24808c(interfaceC11159s, objM20054c);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", m26211f = "RunBlockingUninterruptible.android.kt", m26212l = {Opcodes.ASTORE}, m26213m = "invokeSuspend")
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11159s $deferred;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC11159s interfaceC11159s, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$deferred = interfaceC11159s;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass2(this.$deferred, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    return obj;
                }
                AbstractC9924b.m20071b(obj);
                InterfaceC11159s interfaceC11159s = this.$deferred;
                this.label = 1;
                Object objMo24760z = interfaceC11159s.mo24760z(this);
                return objMo24760z == objM25952f ? objM25952f : objMo24760z;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super T> interfaceC11588c) {
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45061(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C45061> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C45061 c45061 = new C45061(this.$block, interfaceC11588c);
            c45061.L$0 = obj;
            return c45061;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC9945d.b bVar = ((InterfaceC11122i0) this.L$0).getCoroutineContext().get(InterfaceC9944c.f23354a0);
            AbstractC9979u.m20291d(bVar);
            InterfaceC9944c interfaceC9944c = (InterfaceC9944c) bVar;
            InterfaceC11159s interfaceC11159sM24807b = AbstractC11165u.m24807b(null, 1, null);
            AbstractC11109f.m24705c(C11119h1.f26784c, interfaceC9944c, CoroutineStart.f23479f, new AnonymousClass1(interfaceC11159sM24807b, this.$block, null));
            while (!interfaceC11159sM24807b.isCompleted()) {
                try {
                    return AbstractC11109f.m24707e(interfaceC9944c, new AnonymousClass2(interfaceC11159sM24807b, null));
                } catch (InterruptedException unused) {
                }
            }
            return interfaceC11159sM24807b.mo24759e();
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super T> interfaceC11588c) {
            return ((C45061) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <T> T runBlockingUninterruptible(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        Thread.interrupted();
        return (T) AbstractC11113g.m24717b(null, new C45061(block, null), 1, null);
    }
}
