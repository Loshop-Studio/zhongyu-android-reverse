package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", m17801f = "SearchBar.android.kt", m17802l = {202}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBar$2$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    final /* synthetic */ MutatorMutex $mutatorMutex;
    final /* synthetic */ InterfaceC10570l $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", m17801f = "SearchBar.android.kt", m17802l = {TbsListener.ErrorCode.UNZIP_DIR_ERROR, TbsListener.ErrorCode.INCR_UPDATE_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1 */
    public static final class C22731 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
        final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
        final /* synthetic */ MutableFloatState $finalBackProgress;
        final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
        final /* synthetic */ InterfaceC10570l $onExpandedChange;
        final /* synthetic */ InterfaceC9266c $progress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22731(MutableFloatState mutableFloatState, InterfaceC9266c interfaceC9266c, Animatable<Float, AnimationVector1D> animatable, InterfaceC10570l interfaceC10570l, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC9324c<? super C22731> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$finalBackProgress = mutableFloatState;
            this.$progress = interfaceC9266c;
            this.$animationProgress = animatable;
            this.$onExpandedChange = interfaceC10570l;
            this.$firstBackEvent = mutableState;
            this.$currentBackEvent = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C22731(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, interfaceC9324c);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r12.label
                r2 = 2143289344(0x7fc00000, float:NaN)
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                kotlin.AbstractC9079b.m15926b(r13)
                r9 = r12
                goto L78
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.util.concurrent.CancellationException -> L5d
                goto L40
            L21:
                kotlin.AbstractC9079b.m15926b(r13)
                androidx.compose.runtime.MutableFloatState r13 = r12.$finalBackProgress     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.setFloatValue(r2)     // Catch: java.util.concurrent.CancellationException -> L5d
                l8.c r13 = r12.$progress     // Catch: java.util.concurrent.CancellationException -> L5d
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
                x7.l r13 = r12.$onExpandedChange     // Catch: java.util.concurrent.CancellationException -> L5d
                r1 = 0
                java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                r13.invoke(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
                r9 = r12
                goto L88
            L5d:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = p201o7.AbstractC9536a.m17797b(r13)
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
                h7.p r13 = p123h7.C8736p.f16368a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1.C22731.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C22731) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$2$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable, InterfaceC10570l interfaceC10570l, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC9324c<? super SearchBar_androidKt$SearchBar$2$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$mutatorMutex = mutatorMutex;
        this.$finalBackProgress = mutableFloatState;
        this.$animationProgress = animatable;
        this.$onExpandedChange = interfaceC10570l;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, interfaceC9324c);
        searchBar_androidKt$SearchBar$2$1.L$0 = obj;
        return searchBar_androidKt$SearchBar$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c interfaceC9266c = (InterfaceC9266c) this.L$0;
            MutatorMutex mutatorMutex = this.$mutatorMutex;
            C22731 c22731 = new C22731(this.$finalBackProgress, interfaceC9266c, this.$animationProgress, this.$onExpandedChange, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, c22731, this, 1, null) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9266c interfaceC9266c, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((SearchBar_androidKt$SearchBar$2$1) create(interfaceC9266c, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
