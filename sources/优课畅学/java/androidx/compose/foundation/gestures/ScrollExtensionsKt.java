package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class ScrollExtensionsKt {

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m17801f = "ScrollExtensions.kt", m17802l = {38}, m17803m = "animateScrollBy")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 */
    public static final class C13041 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13041(InterfaceC9324c<? super C13041> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m17801f = "ScrollExtensions.kt", m17802l = {39}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 */
    public static final class C13052 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref$FloatRef $previousValue;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13052(float f10, AnimationSpec<Float> animationSpec, Ref$FloatRef ref$FloatRef, InterfaceC9324c<? super C13052> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$value = f10;
            this.$animationSpec = animationSpec;
            this.$previousValue = ref$FloatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13052 c13052 = new C13052(this.$value, this.$animationSpec, this.$previousValue, interfaceC9324c);
            c13052.L$0 = obj;
            return c13052;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(ScrollScope scrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13052) create(scrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final ScrollScope scrollScope = (ScrollScope) this.L$0;
                float f10 = this.$value;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previousValue;
                InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return C8736p.f16368a;
                    }

                    public final void invoke(float f11, float f12) {
                        Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                        float f13 = ref$FloatRef2.f17470a;
                        ref$FloatRef2.f17470a = f13 + scrollScope.scrollBy(f11 - f13);
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animate$default(0.0f, f10, 0.0f, animationSpec, interfaceC10574p, this, 4, null) == objM17291f) {
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
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m17801f = "ScrollExtensions.kt", m17802l = {C3721BR.versionName}, m17803m = "scrollBy")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 */
    public static final class C13061 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13061(InterfaceC9324c<? super C13061> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.scrollBy(null, 0.0f, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m17801f = "ScrollExtensions.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 */
    public static final class C13072 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Ref$FloatRef $consumed;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13072(Ref$FloatRef ref$FloatRef, float f10, InterfaceC9324c<? super C13072> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$consumed = ref$FloatRef;
            this.$value = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13072 c13072 = new C13072(this.$consumed, this.$value, interfaceC9324c);
            c13072.L$0 = obj;
            return c13072;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(ScrollScope scrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13072) create(scrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.$consumed.f17470a = scrollScope.scrollBy(this.$value);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", m17801f = "ScrollExtensions.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2 */
    public static final class C13082 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C13082(InterfaceC9324c<? super C13082> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C13082(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(ScrollScope scrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13082) create(scrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, p179m7.InterfaceC9324c<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C13041
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C13041) r0
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref$FloatRef) r7
            kotlin.AbstractC9079b.m15926b(r10)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9079b.m15926b(r10)
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
            float r7 = r7.f17470a
            java.lang.Float r7 = p201o7.AbstractC9536a.m17797b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f10, AnimationSpec animationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f10, animationSpec, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, p179m7.InterfaceC9324c<? super java.lang.Float> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C13061
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C13061) r0
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref$FloatRef) r7
            kotlin.AbstractC9079b.m15926b(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9079b.m15926b(r9)
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
            float r7 = r7.f17470a
            java.lang.Float r7 = p201o7.AbstractC9536a.m17797b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, m7.c):java.lang.Object");
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objScroll = scrollableState.scroll(mutatePriority, new C13082(null), interfaceC9324c);
        return objScroll == AbstractC9434a.m17291f() ? objScroll : C8736p.f16368a;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, interfaceC9324c);
    }
}
