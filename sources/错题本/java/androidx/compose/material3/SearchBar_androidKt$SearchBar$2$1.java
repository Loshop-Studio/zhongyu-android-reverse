package androidx.compose.material3;

import android.view.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC5910f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"Lkotlinx/coroutines/flow/f;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "progress", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", m5303f = "SearchBar.android.kt", m5304i = {}, m5305l = {ComposerKt.compositionLocalMapKey}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    final /* synthetic */ MutatorMutex $mutatorMutex;
    final /* synthetic */ InterfaceC6471c $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "<anonymous>", "()V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", m5303f = "SearchBar.android.kt", m5304i = {}, m5305l = {205, 216}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1 */
    public static final class C17831 extends SuspendLambda implements InterfaceC6471c {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
        final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
        final /* synthetic */ MutableFloatState $finalBackProgress;
        final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
        final /* synthetic */ InterfaceC6471c $onExpandedChange;
        final /* synthetic */ InterfaceC5910f $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17831(MutableFloatState mutableFloatState, InterfaceC5910f interfaceC5910f, Animatable<Float, AnimationVector1D> animatable, InterfaceC6471c interfaceC6471c, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC5631c<? super C17831> interfaceC5631c) {
            super(1, interfaceC5631c);
            this.$finalBackProgress = mutableFloatState;
            this.$progress = interfaceC5910f;
            this.$animationProgress = animatable;
            this.$onExpandedChange = interfaceC6471c;
            this.$firstBackEvent = mutableState;
            this.$currentBackEvent = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@NotNull InterfaceC5631c<?> interfaceC5631c) {
            return new C17831(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6471c
        @Nullable
        public final Object invoke(@Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C17831) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r9, 12, null) != r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 2143289344(0x7fc00000, float:NaN)
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.AbstractC5774b.m5119b(r13)
                r9 = r12
                goto L74
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                kotlin.AbstractC5774b.m5119b(r13)     // Catch: java.util.concurrent.CancellationException -> L58
                goto L3e
            L1f:
                kotlin.AbstractC5774b.m5119b(r13)
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L58
                r13.setFloatValue(r2)     // Catch: java.util.concurrent.CancellationException -> L58
                kotlinx.coroutines.flow.f r13 = r12.$progress     // Catch: java.util.concurrent.CancellationException -> L58
                androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1$1 r1 = new androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1$1     // Catch: java.util.concurrent.CancellationException -> L58
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r5 = r12.$firstBackEvent     // Catch: java.util.concurrent.CancellationException -> L58
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r6 = r12.$currentBackEvent     // Catch: java.util.concurrent.CancellationException -> L58
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7 = r12.$animationProgress     // Catch: java.util.concurrent.CancellationException -> L58
                r1.<init>()     // Catch: java.util.concurrent.CancellationException -> L58
                r12.label = r4     // Catch: java.util.concurrent.CancellationException -> L58
                java.lang.Object r13 = r13.collect(r1, r12)     // Catch: java.util.concurrent.CancellationException -> L58
                if (r13 != r0) goto L3e
                r9 = r12
                goto L73
            L3e:
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L58
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r1 = r12.$animationProgress     // Catch: java.util.concurrent.CancellationException -> L58
                java.lang.Object r1 = r1.getValue()     // Catch: java.util.concurrent.CancellationException -> L58
                java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.util.concurrent.CancellationException -> L58
                float r1 = r1.floatValue()     // Catch: java.util.concurrent.CancellationException -> L58
                r13.setFloatValue(r1)     // Catch: java.util.concurrent.CancellationException -> L58
                r6.c r13 = r12.$onExpandedChange     // Catch: java.util.concurrent.CancellationException -> L58
                java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.util.concurrent.CancellationException -> L58
                r13.invoke(r1)     // Catch: java.util.concurrent.CancellationException -> L58
                r9 = r12
                goto L84
            L58:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
                java.lang.Float r5 = new java.lang.Float
                r13 = 1065353216(0x3f800000, float:1.0)
                r5.<init>(r13)
                androidx.compose.animation.core.FiniteAnimationSpec r6 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p()
                r12.label = r3
                r7 = 0
                r8 = 0
                r10 = 12
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L74
            L73:
                return r0
            L74:
                androidx.compose.runtime.MutableFloatState r13 = r9.$finalBackProgress
                r13.setFloatValue(r2)
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r13 = r9.$firstBackEvent
                r0 = 0
                r13.setValue(r0)
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r13 = r9.$currentBackEvent
                r13.setValue(r0)
            L84:
                d6.s r13 = p045d6.C5443s.f8405a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1.C17831.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$2$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable, InterfaceC6471c interfaceC6471c, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC5631c<? super SearchBar_androidKt$SearchBar$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$mutatorMutex = mutatorMutex;
        this.$finalBackProgress = mutableFloatState;
        this.$animationProgress = animatable;
        this.$onExpandedChange = interfaceC6471c;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, interfaceC5631c);
        searchBar_androidKt$SearchBar$2$1.L$0 = obj;
        return searchBar_androidKt$SearchBar$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC5910f interfaceC5910f = (InterfaceC5910f) this.L$0;
            MutatorMutex mutatorMutex = this.$mutatorMutex;
            C17831 c17831 = new C17831(this.$finalBackProgress, interfaceC5910f, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, c17831, this, 1, null) == coroutineSingletons) {
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
    @Nullable
    public final Object invoke(@NotNull InterfaceC5910f interfaceC5910f, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((SearchBar_androidKt$SearchBar$2$1) create(interfaceC5910f, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
