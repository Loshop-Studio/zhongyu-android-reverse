package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m26211f = "AnimateAsState.kt", m26212l = {418}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ InterfaceC10000a $channel;
    final /* synthetic */ State<InterfaceC9540l> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m26211f = "AnimateAsState.kt", m26212l = {427}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 */
    public static final class C11141 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<InterfaceC9540l> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11141(T t10, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends InterfaceC9540l> state2, InterfaceC11588c<? super C11141> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$newTarget = t10;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C11141(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C11141 c11141;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (AbstractC9979u.m20289b(this.$newTarget, this.$animatable.getTargetValue())) {
                    return C10786q.f26013a;
                }
                Animatable<T, V> animatable = this.$animatable;
                T t10 = this.$newTarget;
                AnimationSpec animationSpecAnimateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                this.label = 1;
                c11141 = this;
                if (Animatable.animateTo$default(animatable, t10, animationSpecAnimateValueAsState$lambda$6, null, null, c11141, 12, null) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                c11141 = this;
            }
            InterfaceC9540l interfaceC9540lAnimateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(c11141.$listener$delegate);
            if (interfaceC9540lAnimateValueAsState$lambda$4 != null) {
                interfaceC9540lAnimateValueAsState$lambda$4.invoke(c11141.$animatable.getValue());
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11141) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3$1(InterfaceC10000a interfaceC10000a, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends InterfaceC9540l> state2, InterfaceC11588c<? super AnimateAsStateKt$animateValueAsState$3$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$channel = interfaceC10000a;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC11588c);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r11.L$1
            ud.e r1 = (p365ud.InterfaceC11390e) r1
            java.lang.Object r3 = r11.L$0
            sd.i0 r3 = (sd.InterfaceC11122i0) r3
            kotlin.AbstractC9924b.m20071b(r12)
            goto L3a
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.AbstractC9924b.m20071b(r12)
            java.lang.Object r12 = r11.L$0
            sd.i0 r12 = (sd.InterfaceC11122i0) r12
            kotlinx.coroutines.channels.a r1 = r11.$channel
            ud.e r1 = r1.iterator()
            r3 = r12
        L2d:
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = r1.mo20669a(r11)
            if (r12 != r0) goto L3a
            return r0
        L3a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6a
            java.lang.Object r12 = r1.next()
            kotlinx.coroutines.channels.a r4 = r11.$channel
            java.lang.Object r4 = r4.mo20641j()
            java.lang.Object r4 = kotlinx.coroutines.channels.C10002c.m20728f(r4)
            if (r4 != 0) goto L54
            r6 = r12
            goto L55
        L54:
            r6 = r4
        L55:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable<T, V> r7 = r11.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r8 = r11.$animSpec$delegate
            androidx.compose.runtime.State<hd.l> r9 = r11.$listener$delegate
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = 3
            r8 = 0
            r4 = 0
            r6 = r5
            r5 = 0
            sd.AbstractC11109f.m24706d(r3, r4, r5, r6, r7, r8)
            goto L2d
        L6a:
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
