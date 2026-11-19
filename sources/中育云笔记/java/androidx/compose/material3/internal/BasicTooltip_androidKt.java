package androidx.compose.material3.internal;

import android.content.res.Resources;
import androidx.compose.foundation.C1224R;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TooltipState;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.C2890xe3d9cdbd;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.res.StringResources_androidKt;
import androidx.compose.p014ui.semantics.LiveRegionMode;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.window.AndroidPopup_androidKt;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.p014ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class BasicTooltip_androidKt {

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", m26211f = "BasicTooltip.android.kt", m26212l = {Opcodes.IF_ICMPGE}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1 */
    public static final class C24781 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {Opcodes.IF_ICMPGT}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {171, Opcodes.RETURN, 197}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120841 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                final /* synthetic */ TooltipState $state;
                long J$0;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {Opcodes.GETSTATIC}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C120851 extends RestrictedSuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ PointerEventPass $pass;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C120851(PointerEventPass pointerEventPass, InterfaceC11588c<? super C120851> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$pass = pointerEventPass;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        C120851 c120851 = new C120851(this.$pass, interfaceC11588c);
                        c120851.L$0 = obj;
                        return c120851;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super PointerInputChange> interfaceC11588c) {
                        return ((C120851) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                            return obj;
                        }
                        AbstractC9924b.m20071b(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = this.$pass;
                        this.label = 1;
                        Object objWaitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, this);
                        return objWaitForUpOrCancellation == objM25952f ? objM25952f : objWaitForUpOrCancellation;
                    }
                }

                @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", m26211f = "BasicTooltip.android.kt", m26212l = {Opcodes.INVOKEINTERFACE, Opcodes.NEW, Opcodes.NEW}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ InterfaceC11603l $isLongPressedFlow;
                    final /* synthetic */ TooltipState $state;
                    Object L$0;
                    int label;

                    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", m26211f = "BasicTooltip.android.kt", m26212l = {}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    public static final class C120861 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ TooltipState $state;
                        /* synthetic */ boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C120861(TooltipState tooltipState, InterfaceC11588c<? super C120861> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            C120861 c120861 = new C120861(this.$state, interfaceC11588c);
                            c120861.Z$0 = ((Boolean) obj).booleanValue();
                            return c120861;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c<? super C10786q>) obj2);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            AbstractC11725a.m25952f();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                            if (!this.Z$0) {
                                this.$state.dismiss();
                            }
                            return C10786q.f26013a;
                        }

                        public final Object invoke(boolean z10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C120861) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(InterfaceC11603l interfaceC11603l, TooltipState tooltipState, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$isLongPressedFlow = interfaceC11603l;
                        this.$state = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass2(this.$isLongPressedFlow, this.$state, interfaceC11588c);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
                    
                        if (p379vd.AbstractC11596e.m25559i(r7, r1, r6) == r0) goto L26;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0 */
                    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.material3.TooltipState] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                        /*
                            r6 = this;
                            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                            int r1 = r6.label
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L2c
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L22
                            if (r1 == r3) goto L1a
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1a:
                            java.lang.Object r0 = r6.L$0
                            java.lang.Throwable r0 = (java.lang.Throwable) r0
                            kotlin.AbstractC9924b.m20071b(r7)
                            goto L6f
                        L22:
                            kotlin.AbstractC9924b.m20071b(r7)
                            goto L57
                        L26:
                            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L2a
                            goto L45
                        L2a:
                            r7 = move-exception
                            goto L5a
                        L2c:
                            kotlin.AbstractC9924b.m20071b(r7)
                            vd.l r7 = r6.$isLongPressedFlow     // Catch: java.lang.Throwable -> L2a
                            java.lang.Boolean r1 = p409xc.AbstractC11826a.m26206a(r5)     // Catch: java.lang.Throwable -> L2a
                            r7.mo20854a(r1)     // Catch: java.lang.Throwable -> L2a
                            androidx.compose.material3.TooltipState r7 = r6.$state     // Catch: java.lang.Throwable -> L2a
                            androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.PreventUserInput     // Catch: java.lang.Throwable -> L2a
                            r6.label = r5     // Catch: java.lang.Throwable -> L2a
                            java.lang.Object r7 = r7.show(r1, r6)     // Catch: java.lang.Throwable -> L2a
                            if (r7 != r0) goto L45
                            goto L6d
                        L45:
                            vd.l r7 = r6.$isLongPressedFlow
                            androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1 r1 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1
                            androidx.compose.material3.TooltipState r3 = r6.$state
                            r1.<init>(r3, r2)
                            r6.label = r4
                            java.lang.Object r7 = p379vd.AbstractC11596e.m25559i(r7, r1, r6)
                            if (r7 != r0) goto L57
                            goto L6d
                        L57:
                            qc.q r7 = p309qc.C10786q.f26013a
                            return r7
                        L5a:
                            vd.l r1 = r6.$isLongPressedFlow
                            androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1 r4 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1
                            androidx.compose.material3.TooltipState r5 = r6.$state
                            r4.<init>(r5, r2)
                            r6.L$0 = r7
                            r6.label = r3
                            java.lang.Object r1 = p379vd.AbstractC11596e.m25559i(r1, r4, r6)
                            if (r1 != r0) goto L6e
                        L6d:
                            return r0
                        L6e:
                            r0 = r7
                        L6f:
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.C24781.AnonymousClass1.C120841.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120841(InterfaceC11122i0 interfaceC11122i0, TooltipState tooltipState, InterfaceC11588c<? super C120841> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$$this$coroutineScope = interfaceC11122i0;
                    this.$state = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    C120841 c120841 = new C120841(this.$$this$coroutineScope, this.$state, interfaceC11588c);
                    c120841.L$0 = obj;
                    return c120841;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C120841) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
                
                    if (r0 == r6) goto L36;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [vd.k] */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 246
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.C24781.AnonymousClass1.C120841.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C120841 c120841 = new C120841(interfaceC11122i0, this.$state, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c120841, this) == objM25952f) {
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
        public C24781(TooltipState tooltipState, InterfaceC11588c<? super C24781> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C24781 c24781 = new C24781(this.$state, interfaceC11588c);
            c24781.L$0 = obj;
            return c24781;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24781) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
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

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2", m26211f = "BasicTooltip.android.kt", m26212l = {ComposerKt.reuseKey}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2 */
    public static final class C24792 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1", m26211f = "BasicTooltip.android.kt", m26212l = {208}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {212}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120871 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                final /* synthetic */ TooltipState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {217}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C120881 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ TooltipState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C120881(TooltipState tooltipState, InterfaceC11588c<? super C120881> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$state = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new C120881(this.$state, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            TooltipState tooltipState = this.$state;
                            MutatePriority mutatePriority = MutatePriority.UserInput;
                            this.label = 1;
                            if (tooltipState.show(mutatePriority, this) == objM25952f) {
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
                        return ((C120881) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120871(InterfaceC11122i0 interfaceC11122i0, TooltipState tooltipState, InterfaceC11588c<? super C120871> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$$this$coroutineScope = interfaceC11122i0;
                    this.$state = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    C120871 c120871 = new C120871(this.$$this$coroutineScope, this.$state, interfaceC11588c);
                    c120871.L$0 = obj;
                    return c120871;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C120871) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r12.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r12.L$1
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r1
                        java.lang.Object r3 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r3
                        kotlin.AbstractC9924b.m20071b(r13)
                        goto L36
                    L17:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1f:
                        kotlin.AbstractC9924b.m20071b(r13)
                        java.lang.Object r13 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r13
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p014ui.input.pointer.PointerEventPass.Main
                        r3 = r13
                    L29:
                        r12.L$0 = r3
                        r12.L$1 = r1
                        r12.label = r2
                        java.lang.Object r13 = r3.awaitPointerEvent(r1, r12)
                        if (r13 != r0) goto L36
                        return r0
                    L36:
                        androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p014ui.input.pointer.PointerEvent) r13
                        java.util.List r4 = r13.getChanges()
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r4
                        int r4 = r4.m32107getTypeT8wyACA()
                        androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.p014ui.input.pointer.PointerType.Companion
                        int r5 = r5.m32180getMouseT8wyACA()
                        boolean r4 = androidx.compose.p014ui.input.pointer.PointerType.m32175equalsimpl0(r4, r5)
                        if (r4 == 0) goto L29
                        int r13 = r13.m32046getType7fucELk()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p014ui.input.pointer.PointerEventType.Companion
                        int r5 = r4.m32057getEnter7fucELk()
                        boolean r5 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r13, r5)
                        if (r5 == 0) goto L75
                        sd.i0 r6 = r12.$$this$coroutineScope
                        androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1 r9 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1
                        androidx.compose.material3.TooltipState r13 = r12.$state
                        r4 = 0
                        r9.<init>(r13, r4)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        sd.AbstractC11109f.m24706d(r6, r7, r8, r9, r10, r11)
                        goto L29
                    L75:
                        int r4 = r4.m32058getExit7fucELk()
                        boolean r13 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r13, r4)
                        if (r13 == 0) goto L29
                        androidx.compose.material3.TooltipState r13 = r12.$state
                        r13.dismiss()
                        goto L29
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.C24792.AnonymousClass1.C120871.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C120871 c120871 = new C120871(interfaceC11122i0, this.$state, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c120871, this) == objM25952f) {
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
        public C24792(TooltipState tooltipState, InterfaceC11588c<? super C24792> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C24792 c24792 = new C24792(this.$state, interfaceC11588c);
            c24792.L$0 = obj;
            return c24792;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24792) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ff  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(final androidx.compose.p014ui.window.PopupPositionProvider r19, final p181hd.InterfaceC9544p r20, androidx.compose.material3.TooltipState r21, androidx.compose.p014ui.Modifier r22, boolean r23, boolean r24, final p181hd.InterfaceC9544p r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, hd.p, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, boolean, boolean, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final TooltipState tooltipState, final InterfaceC11122i0 interfaceC11122i0, final boolean z10, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) throws Resources.NotFoundException {
        PopupPositionProvider popupPositionProvider2;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-273292979);
        if ((i10 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i11 = (composerStartRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i10;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.changed(tooltipState) : composerStartRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC11122i0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273292979, i11, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.android.kt:135)");
            }
            boolean z11 = false;
            final String strStringResource = StringResources_androidKt.stringResource(C1224R.string.tooltip_description, composerStartRestartGroup, 0);
            if ((i11 & 112) == 32 || ((i11 & 64) != 0 && composerStartRestartGroup.changedInstance(tooltipState))) {
                z11 = true;
            }
            boolean zChangedInstance = z11 | composerStartRestartGroup.changedInstance(interfaceC11122i0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1

                    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1 */
                    public static final class C24731 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ TooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C24731(TooltipState tooltipState, InterfaceC11588c<? super C24731> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C24731(this.$state, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            AbstractC11725a.m25952f();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                            this.$state.dismiss();
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C24731) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m29506invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m29506invoke() {
                        if (tooltipState.isVisible()) {
                            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C24731(tooltipState, null), 3, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (InterfaceC9529a) objRememberedValue, new PopupProperties(z10, false, false, false, 14, (AbstractC9972n) null), ComposableLambdaKt.rememberComposableLambda(610617071, true, new InterfaceC9544p() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.TooltipPopup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(610617071, i12, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.android.kt:146)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    boolean zChanged = composer2.changed(strStringResource);
                    final String str = strStringResource;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m32746setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m32719getAssertive0phEisY());
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (InterfaceC9540l) objRememberedValue2, 1, null);
                    InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    interfaceC9544p2.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.TooltipPopup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) throws Resources.NotFoundException {
                    BasicTooltip_androidKt.TooltipPopup(popupPositionProvider, tooltipState, interfaceC11122i0, z10, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void WrappedAnchor(final boolean z10, final TooltipState tooltipState, Modifier modifier, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1848240995);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? composerStartRestartGroup.changed(tooltipState) : composerStartRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1848240995, i12, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.android.kt:115)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            Modifier modifierAnchorSemantics = anchorSemantics(handleGestures(modifier, z10, tooltipState), StringResources_androidKt.stringResource(C1224R.string.tooltip_label, composerStartRestartGroup, 0), z10, tooltipState, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.WrappedAnchor.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    BasicTooltip_androidKt.WrappedAnchor(z10, tooltipState, modifier2, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z10, final TooltipState tooltipState, final InterfaceC11122i0 interfaceC11122i0) {
        return z10 ? SemanticsModifierKt.semantics(modifier, true, new InterfaceC9540l() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.anchorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                String str2 = str;
                final InterfaceC11122i0 interfaceC11122i02 = interfaceC11122i0;
                final TooltipState tooltipState2 = tooltipState;
                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new InterfaceC9529a() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.anchorSemantics.1.1

                    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1", m26211f = "BasicTooltip.android.kt", m26212l = {241}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C120831 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ TooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C120831(TooltipState tooltipState, InterfaceC11588c<? super C120831> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C120831(this.$state, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                TooltipState tooltipState = this.$state;
                                this.label = 1;
                                if (TooltipState.show$default(tooltipState, null, this, 1, null) == objM25952f) {
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
                            return ((C120831) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        AbstractC11117h.m24726d(interfaceC11122i02, null, null, new C120831(tooltipState2, null), 3, null);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z10, TooltipState tooltipState) {
        return z10 ? modifier.then(new SuspendPointerInputElement(tooltipState, null, null, new C2890xe3d9cdbd(new C24781(tooltipState, null)), 6, null)).then(new SuspendPointerInputElement(tooltipState, null, null, new C2890xe3d9cdbd(new C24792(tooltipState, null)), 6, null)) : modifier;
    }
}
