package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m17801f = "AnimateAsState.kt", m17802l = {TbsListener.ErrorCode.INFO_CORE_EXIST_NOT_LOAD}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ InterfaceC9158a $channel;
    final /* synthetic */ State<InterfaceC10570l> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m17801f = "AnimateAsState.kt", m17802l = {427}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 */
    public static final class C10841 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<InterfaceC10570l> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10841(T t10, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends InterfaceC10570l> state2, InterfaceC9324c<? super C10841> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$newTarget = t10;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C10841(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C10841) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C10841 c10841;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                if (AbstractC9133u.m16128b(this.$newTarget, this.$animatable.getTargetValue())) {
                    return C8736p.f16368a;
                }
                Animatable<T, V> animatable = this.$animatable;
                T t10 = this.$newTarget;
                AnimationSpec animationSpecAnimateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                this.label = 1;
                c10841 = this;
                if (Animatable.animateTo$default(animatable, t10, animationSpecAnimateValueAsState$lambda$6, null, null, c10841, 12, null) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                c10841 = this;
            }
            InterfaceC10570l interfaceC10570lAnimateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(c10841.$listener$delegate);
            if (interfaceC10570lAnimateValueAsState$lambda$4 != null) {
                interfaceC10570lAnimateValueAsState$lambda$4.invoke(c10841.$animatable.getValue());
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3$1(InterfaceC9158a interfaceC9158a, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends InterfaceC10570l> state2, InterfaceC9324c<? super AnimateAsStateKt$animateValueAsState$3$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$channel = interfaceC9158a;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC9324c);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r11.L$1
            k8.b r1 = (p157k8.InterfaceC9066b) r1
            java.lang.Object r3 = r11.L$0
            i8.b0 r3 = (p135i8.InterfaceC8822b0) r3
            kotlin.AbstractC9079b.m15926b(r12)
            goto L3a
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.AbstractC9079b.m15926b(r12)
            java.lang.Object r12 = r11.L$0
            i8.b0 r12 = (p135i8.InterfaceC8822b0) r12
            kotlinx.coroutines.channels.a r1 = r11.$channel
            k8.b r1 = r1.iterator()
            r3 = r12
        L2d:
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = r1.mo15880a(r11)
            if (r12 != r0) goto L3a
            return r0
        L3a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6a
            java.lang.Object r12 = r1.next()
            kotlinx.coroutines.channels.a r4 = r11.$channel
            java.lang.Object r4 = r4.mo15878o()
            java.lang.Object r4 = kotlinx.coroutines.channels.C9160c.m16535f(r4)
            if (r4 != 0) goto L54
            r6 = r12
            goto L55
        L54:
            r6 = r4
        L55:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable<T, V> r7 = r11.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r8 = r11.$animSpec$delegate
            androidx.compose.runtime.State<x7.l> r9 = r11.$listener$delegate
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = 3
            r8 = 0
            r4 = 0
            r6 = r5
            r5 = 0
            p135i8.AbstractC8833f.m14845d(r3, r4, r5, r6, r7, r8)
            goto L2d
        L6a:
            h7.p r12 = p123h7.C8736p.f16368a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
