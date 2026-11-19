package androidx.compose.runtime;

import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", m26211f = "Recomposer.kt", m26212l = {93, 95}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2 */
    public static final class C25722 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9545q $block;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", m26211f = "Recomposer.kt", m26212l = {C7843ab.b.API_MYNA_STOP}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ Recomposer $recomposer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Recomposer recomposer, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$recomposer = recomposer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$recomposer, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Recomposer recomposer = this.$recomposer;
                    this.label = 1;
                    if (recomposer.runRecomposeAndApplyChanges(this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25722(InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super C25722> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9545q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C25722 c25722 = new C25722(this.$block, interfaceC11588c);
            c25722.L$0 = obj;
            return c25722;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Recomposer recomposer;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                recomposer = new Recomposer(interfaceC11122i0.getCoroutineContext());
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(recomposer, null), 3, null);
                InterfaceC9545q interfaceC9545q = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = interfaceC9545q.invoke(interfaceC11122i0, recomposer, this);
                if (obj != objM25952f) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                AbstractC9924b.m20071b(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.L$0;
            AbstractC9924b.m20071b(obj);
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == objM25952f ? objM25952f : obj;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C25722) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <R> Object withRunningRecomposer(InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC10006d.m20748e(new C25722(interfaceC9545q, null), interfaceC11588c);
    }
}
