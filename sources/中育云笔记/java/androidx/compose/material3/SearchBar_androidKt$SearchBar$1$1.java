package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1", m26211f = "SearchBar.android.kt", m26212l = {191}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBar$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$1$1(Animatable<Float, AnimationVector1D> animatable, boolean z10, MutableFloatState mutableFloatState, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, InterfaceC11588c<? super SearchBar_androidKt$SearchBar$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$animationProgress = animatable;
        this.$expanded = z10;
        this.$finalBackProgress = mutableFloatState;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SearchBar_androidKt$SearchBar$1$1(this.$animationProgress, this.$expanded, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
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
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.AbstractC9924b.m20071b(r13)
            goto L66
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            kotlin.AbstractC9924b.m20071b(r13)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r13 <= 0) goto L43
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto L43
            androidx.compose.animation.core.FiniteAnimationSpec r13 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationPredictiveBackExitFloatSpec$p()
        L41:
            r6 = r13
            goto L51
        L43:
            boolean r13 = r12.$expanded
            if (r13 == 0) goto L4c
            androidx.compose.animation.core.FiniteAnimationSpec r13 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationEnterFloatSpec$p()
            goto L41
        L4c:
            androidx.compose.animation.core.FiniteAnimationSpec r13 = androidx.compose.material3.SearchBar_androidKt.access$getAnimationExitFloatSpec$p()
            goto L41
        L51:
            boolean r13 = r12.$expanded
            if (r13 == 0) goto L56
            r1 = r3
        L56:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.$animationProgress
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 != 0) goto L68
        L66:
            r9 = r12
            goto L7d
        L68:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.$animationProgress
            java.lang.Float r5 = p409xc.AbstractC11826a.m26207b(r1)
            r12.label = r2
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L7d
            return r0
        L7d:
            boolean r13 = r9.$expanded
            if (r13 != 0) goto L93
            androidx.compose.runtime.MutableFloatState r13 = r9.$finalBackProgress
            r0 = 2143289344(0x7fc00000, float:NaN)
            r13.setFloatValue(r0)
            androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r13 = r9.$firstBackEvent
            r0 = 0
            r13.setValue(r0)
            androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r13 = r9.$currentBackEvent
            r13.setValue(r0)
        L93:
            qc.q r13 = p309qc.C10786q.f26013a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SearchBar_androidKt$SearchBar$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
