package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", m26211f = "SearchBar.android.kt", m26212l = {ComposerKt.compositionLocalMapKey}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBar$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    final /* synthetic */ MutatorMutex $mutatorMutex;
    final /* synthetic */ InterfaceC9540l $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", m26211f = "SearchBar.android.kt", m26212l = {205, 216}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1 */
    public static final class C23031 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
        final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
        final /* synthetic */ MutableFloatState $finalBackProgress;
        final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
        final /* synthetic */ InterfaceC9540l $onExpandedChange;
        final /* synthetic */ InterfaceC11594c $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23031(MutableFloatState mutableFloatState, InterfaceC11594c interfaceC11594c, Animatable<Float, AnimationVector1D> animatable, InterfaceC9540l interfaceC9540l, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC11588c<? super C23031> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$finalBackProgress = mutableFloatState;
            this.$progress = interfaceC11594c;
            this.$animationProgress = animatable;
            this.$onExpandedChange = interfaceC9540l;
            this.$firstBackEvent = mutableState;
            this.$currentBackEvent = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C23031(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r9, 12, null) != r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r12.label
                r2 = 2143289344(0x7fc00000, float:NaN)
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                kotlin.AbstractC9924b.m20071b(r13)
                r9 = r12
                goto L78
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.util.concurrent.CancellationException -> L5d
                goto L40
            L21:
                kotlin.AbstractC9924b.m20071b(r13)
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.setFloatValue(r2)     // Catch: java.util.concurrent.CancellationException -> L5d
                vd.c r13 = r12.$progress     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1$1 r1 = new androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1$1     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r5 = r12.$firstBackEvent     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r6 = r12.$currentBackEvent     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7 = r12.$animationProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                r1.<init>()     // Catch: java.util.concurrent.CancellationException -> L5d
                r12.label = r4     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r13 = r13.collect(r1, r12)     // Catch: java.util.concurrent.CancellationException -> L5d
                if (r13 != r0) goto L40
                r9 = r12
                goto L77
            L40:
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r1 = r12.$animationProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r1 = r1.getValue()     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.util.concurrent.CancellationException -> L5d
                float r1 = r1.floatValue()     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.setFloatValue(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                hd.l r13 = r12.$onExpandedChange     // Catch: java.util.concurrent.CancellationException -> L5d
                r1 = 0
                java.lang.Boolean r1 = p409xc.AbstractC11826a.m26206a(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.invoke(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                r9 = r12
                goto L88
            L5d:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = p409xc.AbstractC11826a.m26207b(r13)
                androidx.compose.animation.core.FiniteAnimationSpec r6 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p()
                r12.label = r3
                r7 = 0
                r8 = 0
                r10 = 12
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L78
            L77:
                return r0
            L78:
                androidx.compose.runtime.MutableFloatState r13 = r9.$finalBackProgress
                r13.setFloatValue(r2)
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r13 = r9.$firstBackEvent
                r0 = 0
                r13.setValue(r0)
                androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r13 = r9.$currentBackEvent
                r13.setValue(r0)
            L88:
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1.C23031.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C23031) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$2$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable, InterfaceC9540l interfaceC9540l, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC11588c<? super SearchBar_androidKt$SearchBar$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$mutatorMutex = mutatorMutex;
        this.$finalBackProgress = mutableFloatState;
        this.$animationProgress = animatable;
        this.$onExpandedChange = interfaceC9540l;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, interfaceC11588c);
        searchBar_androidKt$SearchBar$2$1.L$0 = obj;
        return searchBar_androidKt$SearchBar$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interfaceC11594c = (InterfaceC11594c) this.L$0;
            MutatorMutex mutatorMutex = this.$mutatorMutex;
            C23031 c23031 = new C23031(this.$finalBackProgress, interfaceC11594c, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, c23031, this, 1, null) == objM25952f) {
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
    public final Object invoke(InterfaceC11594c interfaceC11594c, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SearchBar_androidKt$SearchBar$2$1) create(interfaceC11594c, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
