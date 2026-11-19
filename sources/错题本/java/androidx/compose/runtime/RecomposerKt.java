package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aT\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002<\u0010\n\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001¢\u0006\u0002\b\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m5110d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/v;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "recomposer", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "withRunningRecomposer", "(Lr6/f;Lh6/c;)Ljava/lang/Object;", "", "RecomposerCompoundHashKey", "I", "ProduceAnotherFrame", "Ljava/lang/Object;", "FramePending", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;

    @NotNull
    private static final Object ProduceAnotherFrame = new Object();

    @NotNull
    private static final Object FramePending = new Object();

    @Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5110d2 = {"R", "Lkotlinx/coroutines/v;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", m5303f = "Recomposer.kt", m5304i = {0}, m5305l = {93, 95}, m5306m = "invokeSuspend", m5307n = {"recomposer"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2 */
    public static final class C20132 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6474f $block;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"R", "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", m5303f = "Recomposer.kt", m5304i = {}, m5305l = {92}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ Recomposer $recomposer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Recomposer recomposer, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$recomposer = recomposer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$recomposer, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    Recomposer recomposer = this.$recomposer;
                    this.label = 1;
                    if (recomposer.runRecomposeAndApplyChanges(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20132(InterfaceC6474f interfaceC6474f, InterfaceC5631c<? super C20132> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$block = interfaceC6474f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C20132 c20132 = new C20132(this.$block, interfaceC5631c);
            c20132.L$0 = obj;
            return c20132;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Recomposer recomposer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                recomposer = new Recomposer(interfaceC6009v.getCoroutineContext());
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass1(recomposer, null), 3);
                InterfaceC6474f interfaceC6474f = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = interfaceC6474f.invoke(interfaceC6009v, recomposer, this);
                if (obj != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                AbstractC5774b.m5119b(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.L$0;
            AbstractC5774b.m5119b(obj);
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == coroutineSingletons ? coroutineSingletons : obj;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super R> interfaceC5631c) {
            return ((C20132) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Nullable
    public static final <R> Object withRunningRecomposer(@NotNull InterfaceC6474f interfaceC6474f, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        return AbstractC6014x.m5637h(new C20132(interfaceC6474f, null), interfaceC5631c);
    }
}
