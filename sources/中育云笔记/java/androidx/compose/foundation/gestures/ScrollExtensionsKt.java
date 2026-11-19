package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ScrollExtensionsKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m26211f = "ScrollExtensions.kt", m26212l = {38}, m26213m = "animateScrollBy")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 */
    public static final class C13341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13341(InterfaceC11588c<? super C13341> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m26211f = "ScrollExtensions.kt", m26212l = {39}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 */
    public static final class C13352 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref$FloatRef $previousValue;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13352(float f10, AnimationSpec<Float> animationSpec, Ref$FloatRef ref$FloatRef, InterfaceC11588c<? super C13352> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$value = f10;
            this.$animationSpec = animationSpec;
            this.$previousValue = ref$FloatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13352 c13352 = new C13352(this.$value, this.$animationSpec, this.$previousValue, interfaceC11588c);
            c13352.L$0 = obj;
            return c13352;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13352) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final ScrollScope scrollScope = (ScrollScope) this.L$0;
                float f10 = this.$value;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previousValue;
                InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return C10786q.f26013a;
                    }

                    public final void invoke(float f11, float f12) {
                        Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                        float f13 = ref$FloatRef2.f23399c;
                        ref$FloatRef2.f23399c = f13 + scrollScope.scrollBy(f11 - f13);
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animate$default(0.0f, f10, 0.0f, animationSpec, interfaceC9544p, this, 4, null) == objM25952f) {
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
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m26211f = "ScrollExtensions.kt", m26212l = {Opcodes.DSTORE}, m26213m = "scrollBy")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 */
    public static final class C13361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13361(InterfaceC11588c<? super C13361> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.scrollBy(null, 0.0f, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m26211f = "ScrollExtensions.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 */
    public static final class C13372 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Ref$FloatRef $consumed;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13372(Ref$FloatRef ref$FloatRef, float f10, InterfaceC11588c<? super C13372> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$consumed = ref$FloatRef;
            this.$value = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13372 c13372 = new C13372(this.$consumed, this.$value, interfaceC11588c);
            c13372.L$0 = obj;
            return c13372;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13372) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.$consumed.f23399c = scrollScope.scrollBy(this.$value);
            return C10786q.f26013a;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", m26211f = "ScrollExtensions.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2 */
    public static final class C13382 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C13382(InterfaceC11588c<? super C13382> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C13382(interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13382) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, vc.InterfaceC11588c<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C13341
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C13341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref$FloatRef) r7
            kotlin.AbstractC9924b.m20071b(r10)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9924b.m20071b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r3 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.L$0 = r10
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r10
        L55:
            float r7 = r7.f23399c
            java.lang.Float r7 = p409xc.AbstractC11826a.m26207b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f10, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f10, animationSpec, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, vc.InterfaceC11588c<? super java.lang.Float> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C13361
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C13361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref$FloatRef) r7
            kotlin.AbstractC9924b.m20071b(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9924b.m20071b(r9)
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r3 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.L$0 = r9
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r9
        L55:
            float r7 = r7.f23399c
            java.lang.Float r7 = p409xc.AbstractC11826a.m26207b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, vc.c):java.lang.Object");
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll = scrollableState.scroll(mutatePriority, new C13382(null), interfaceC11588c);
        return objScroll == AbstractC11725a.m25952f() ? objScroll : C10786q.f26013a;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, interfaceC11588c);
    }
}
