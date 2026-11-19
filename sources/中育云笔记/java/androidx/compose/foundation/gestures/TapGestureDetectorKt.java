package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventKt;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final InterfaceC9545q NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m26211f = "TapGestureDetector.kt", m26212l = {291}, m26213m = "awaitFirstDown")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 */
    public static final class C13472 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13472(InterfaceC11588c<? super C13472> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m26211f = "TapGestureDetector.kt", m26212l = {304}, m26213m = "awaitPrimaryFirstDown")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 */
    public static final class C13481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13481(InterfaceC11588c<? super C13481> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitPrimaryFirstDown(null, false, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m26211f = "TapGestureDetector.kt", m26212l = {227}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 */
    public static final class C13492 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13492(PointerInputChange pointerInputChange, InterfaceC11588c<? super C13492> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$firstUp = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13492 c13492 = new C13492(this.$firstUp, interfaceC11588c);
            c13492.L$0 = obj;
            return c13492;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super PointerInputChange> interfaceC11588c) {
            return ((C13492) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.J$0
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                kotlin.AbstractC9924b.m20071b(r12)
                java.lang.Object r12 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r12
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r11.$firstUp
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.ViewConfiguration r1 = r12.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.L$0 = r5
                r11.J$0 = r3
                r11.label = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13492.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m26211f = "TapGestureDetector.kt", m26212l = {209}, m26213m = "consumeUntilUp")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 */
    public static final class C13501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13501(InterfaceC11588c<? super C13501> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.consumeUntilUp(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m26211f = "TapGestureDetector.kt", m26212l = {247}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2 */
    public static final class C13512 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9545q $onPress;
        final /* synthetic */ InterfaceC9540l $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m26211f = "TapGestureDetector.kt", m26212l = {251, 257}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC9545q $onPress;
            final /* synthetic */ InterfaceC9540l $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m26211f = "TapGestureDetector.kt", m26212l = {254}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120671 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ InterfaceC9545q $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120671(InterfaceC9545q interfaceC9545q, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC11588c<? super C120671> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$onPress = interfaceC9545q;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C120671(this.$onPress, this.$pressScope, this.$down, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC9545q interfaceC9545q = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM30626boximpl = Offset.m30626boximpl(this.$down.m32104getPositionF1C5BW0());
                        this.label = 1;
                        if (interfaceC9545q.invoke(pressGestureScopeImpl, offsetM30626boximpl, this) == objM25952f) {
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
                    return ((C120671) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass2(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.cancel();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass3> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass3(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.release();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC11122i0 interfaceC11122i0, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$coroutineScope = interfaceC11122i0;
                this.$onPress = interfaceC9545q;
                this.$onTap = interfaceC9540l;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
            
                if (r0 == r6) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                /*
                    r16 = this;
                    r3 = r16
                    java.lang.Object r6 = p393wc.AbstractC11725a.m25952f()
                    int r0 = r3.label
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L35
                    if (r0 == r8) goto L25
                    if (r0 != r7) goto L1d
                    java.lang.Object r0 = r3.L$0
                    kotlinx.coroutines.g r0 = (kotlinx.coroutines.InterfaceC10045g) r0
                    kotlin.AbstractC9924b.m20071b(r17)
                    r11 = r0
                    r0 = r17
                    goto L8d
                L1d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L25:
                    java.lang.Object r0 = r3.L$1
                    kotlinx.coroutines.g r0 = (kotlinx.coroutines.InterfaceC10045g) r0
                    java.lang.Object r1 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.AbstractC9924b.m20071b(r17)
                    r11 = r0
                    r0 = r1
                    r1 = r17
                    goto L62
                L35:
                    kotlin.AbstractC9924b.m20071b(r17)
                    java.lang.Object r0 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r0
                    sd.i0 r10 = r3.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior()
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r13.<init>(r1, r9)
                    r14 = 1
                    r15 = 0
                    r11 = 0
                    kotlinx.coroutines.g r10 = sd.AbstractC11109f.m24706d(r10, r11, r12, r13, r14, r15)
                    r3.L$0 = r0
                    r3.L$1 = r10
                    r3.label = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L61
                    goto L8c
                L61:
                    r11 = r10
                L62:
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r1
                    r1.consume()
                    hd.q r2 = r3.$onPress
                    hd.q r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                    if (r2 == r4) goto L80
                    sd.i0 r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                    hd.q r2 = r3.$onPress
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r3.$pressScope
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                L80:
                    r3.L$0 = r11
                    r3.L$1 = r9
                    r3.label = r7
                    java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L8d
                L8c:
                    return r6
                L8d:
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r0
                    if (r0 != 0) goto La1
                    sd.i0 r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r3.$pressScope
                    r13.<init>(r0, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                    goto Lc2
                La1:
                    r0.consume()
                    sd.i0 r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r13.<init>(r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                    hd.l r1 = r3.$onTap
                    if (r1 == 0) goto Lc2
                    long r4 = r0.m32104getPositionF1C5BW0()
                    androidx.compose.ui.geometry.Offset r0 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r4)
                    r1.invoke(r0)
                Lc2:
                    qc.q r0 = p309qc.C10786q.f26013a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13512.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13512(PointerInputScope pointerInputScope, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super C13512> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = interfaceC9545q;
            this.$onTap = interfaceC9540l;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13512 c13512 = new C13512(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, interfaceC11588c);
            c13512.L$0 = obj;
            return c13512;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC11122i0, this.$onPress, this.$onTap, this.$pressScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objM25952f) {
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
            return ((C13512) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m26211f = "TapGestureDetector.kt", m26212l = {104}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2 */
    public static final class C13522 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $onDoubleTap;
        final /* synthetic */ InterfaceC9540l $onLongPress;
        final /* synthetic */ InterfaceC9545q $onPress;
        final /* synthetic */ InterfaceC9540l $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m26211f = "TapGestureDetector.kt", m26212l = {PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, 116, 119, 122, Opcodes.FCMPL, Opcodes.GOTO, Opcodes.RET, Opcodes.GETFIELD}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC9540l $onDoubleTap;
            final /* synthetic */ InterfaceC9540l $onLongPress;
            final /* synthetic */ InterfaceC9545q $onPress;
            final /* synthetic */ InterfaceC9540l $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m26211f = "TapGestureDetector.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_10}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120681 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ InterfaceC9545q $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120681(InterfaceC9545q interfaceC9545q, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC11588c<? super C120681> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$onPress = interfaceC9545q;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C120681(this.$onPress, this.$pressScope, this.$down, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC9545q interfaceC9545q = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM30626boximpl = Offset.m30626boximpl(this.$down.m32104getPositionF1C5BW0());
                        this.label = 1;
                        if (interfaceC9545q.invoke(pressGestureScopeImpl, offsetM30626boximpl, this) == objM25952f) {
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
                    return ((C120681) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass2(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.release();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass3> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass3(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.cancel();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass4> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass4(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.release();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", m26211f = "TapGestureDetector.kt", m26212l = {157, Opcodes.IFLE}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC10045g $cancelOrReleaseJob;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(InterfaceC10045g interfaceC10045g, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass5> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$cancelOrReleaseJob = interfaceC10045g;
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, interfaceC11588c);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                
                    if (r5.reset(r4) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r4.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.AbstractC9924b.m20071b(r5)
                        goto L37
                    L12:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1a:
                        kotlin.AbstractC9924b.m20071b(r5)
                        goto L2c
                    L1e:
                        kotlin.AbstractC9924b.m20071b(r5)
                        kotlinx.coroutines.g r5 = r4.$cancelOrReleaseJob
                        r4.label = r3
                        java.lang.Object r5 = r5.mo20458v(r4)
                        if (r5 != r0) goto L2c
                        goto L36
                    L2c:
                        androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4.$pressScope
                        r4.label = r2
                        java.lang.Object r5 = r5.reset(r4)
                        if (r5 != r0) goto L37
                    L36:
                        return r0
                    L37:
                        qc.q r5 = p309qc.C10786q.f26013a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13522.AnonymousClass1.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass5) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", m26211f = "TapGestureDetector.kt", m26212l = {Opcodes.IF_ICMPLT}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC9545q $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(InterfaceC9545q interfaceC9545q, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC11588c<? super AnonymousClass6> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$onPress = interfaceC9545q;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC9545q interfaceC9545q = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM30626boximpl = Offset.m30626boximpl(this.$secondDown.m32104getPositionF1C5BW0());
                        this.label = 1;
                        if (interfaceC9545q.invoke(pressGestureScopeImpl, offsetM30626boximpl, this) == objM25952f) {
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
                    return ((AnonymousClass6) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass7> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass7(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.release();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass7) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", m26211f = "TapGestureDetector.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass8> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass8(this.$pressScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    this.$pressScope.cancel();
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass8) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC11122i0 interfaceC11122i0, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$coroutineScope = interfaceC11122i0;
                this.$onPress = interfaceC9545q;
                this.$onLongPress = interfaceC9540l;
                this.$onDoubleTap = interfaceC9540l2;
                this.$onTap = interfaceC9540l3;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
            
                if (r1 == r6) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
            
                if (androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(r2, r22) == r6) goto L80;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 728
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13522.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13522(PointerInputScope pointerInputScope, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11588c<? super C13522> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onPress = interfaceC9545q;
            this.$onLongPress = interfaceC9540l;
            this.$onDoubleTap = interfaceC9540l2;
            this.$onTap = interfaceC9540l3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13522 c13522 = new C13522(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, interfaceC11588c);
            c13522.L$0 = obj;
            return c13522;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                PointerInputScope pointerInputScope = this.$this_detectTapGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC11122i0, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objM25952f) {
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
            return ((C13522) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", m26211f = "TapGestureDetector.kt", m26212l = {TypedValues.PositionType.TYPE_DRAWPATH, TypedValues.PositionType.TYPE_PERCENT_HEIGHT}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1 */
    public static final class C13531 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ InterfaceC10045g $resetJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13531(InterfaceC10045g interfaceC10045g, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C13531> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$resetJob = interfaceC10045g;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13531 c13531 = new C13531(this.$resetJob, this.$block, interfaceC11588c);
            c13531.L$0 = obj;
            return c13531;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r5)
                goto L49
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.L$0
                sd.i0 r1 = (sd.InterfaceC11122i0) r1
                kotlin.AbstractC9924b.m20071b(r5)
                goto L3b
            L22:
                kotlin.AbstractC9924b.m20071b(r5)
                java.lang.Object r5 = r4.L$0
                r1 = r5
                sd.i0 r1 = (sd.InterfaceC11122i0) r1
                boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled
                if (r5 == 0) goto L3b
                kotlinx.coroutines.g r5 = r4.$resetJob
                r4.L$0 = r1
                r4.label = r3
                java.lang.Object r5 = r5.mo20458v(r4)
                if (r5 != r0) goto L3b
                goto L48
            L3b:
                hd.p r5 = r4.$block
                r3 = 0
                r4.L$0 = r3
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13531.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13531) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m26211f = "TapGestureDetector.kt", m26212l = {384}, m26213m = "waitForLongPress")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 */
    public static final class C13541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13541(InterfaceC11588c<? super C13541> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForLongPress(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", m26211f = "TapGestureDetector.kt", m26212l = {386, 409}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 */
    public static final class C13552 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ PointerEventPass $pass;
        final /* synthetic */ Ref$ObjectRef<LongPressResult> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13552(PointerEventPass pointerEventPass, Ref$ObjectRef<LongPressResult> ref$ObjectRef, InterfaceC11588c<? super C13552> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$pass = pointerEventPass;
            this.$result = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13552 c13552 = new C13552(this.$pass, this.$result, interfaceC11588c);
            c13552.L$0 = obj;
            return c13552;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13552) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            r13.$result.f23402c = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        
            r14 = r14.getChanges();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r6 >= r5) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r7.isConsumed() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (androidx.compose.p014ui.input.pointer.PointerEventKt.m32049isOutOfBoundsjwHxaWs(r7, r1.mo32012getSizeYbymL2g(), r1.mo32011getExtendedTouchPaddingNHjbRc()) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            r13.$result.f23402c = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            r14 = androidx.compose.p014ui.input.pointer.PointerEventPass.Final;
            r13.L$0 = r1;
            r13.label = 2;
            r14 = r1.awaitPointerEvent(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (r14 != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            r13.$result.f23402c = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        
            return p309qc.C10786q.f26013a;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:34:0x00aa). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13552.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m26211f = "TapGestureDetector.kt", m26212l = {352, 366}, m26213m = "waitForUpOrCancellation")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 */
    public static final class C13562 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13562(InterfaceC11588c<? super C13562> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    @InterfaceC10770a
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z10, InterfaceC11588c interfaceC11588c) {
        return awaitFirstDown(awaitPointerEventScope, z10, PointerEventPass.Main, interfaceC11588c);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, interfaceC11588c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitPrimaryFirstDown(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.p014ui.input.pointer.PointerEventPass r7, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13481
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.AbstractC9924b.m20071b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L51
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.AbstractC9924b.m20071b(r8)
        L42:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p014ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown(r8, r6, r3)
            if (r2 == 0) goto L42
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, z10, pointerEventPass, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, InterfaceC11588c<? super PointerInputChange> interfaceC11588c) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C13492(pointerInputChange, null), interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:19:0x0053->B:20:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13501
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9924b.m20071b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.AbstractC9924b.m20071b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p014ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p014ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L53:
            if (r6 >= r4) goto L61
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L53
        L61:
            java.util.List r9 = r9.getChanges()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L6c:
            if (r5 >= r2) goto L7e
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L7b
            goto L38
        L7b:
            int r5 = r5 + 1
            goto L6c
        L7e:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, vc.c):java.lang.Object");
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C13512(pointerInputScope, interfaceC9545q, interfaceC9540l, new PressGestureScopeImpl(pointerInputScope), null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9545q = NoPressGesture;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        return detectTapAndPress(pointerInputScope, interfaceC9545q, interfaceC9540l, interfaceC11588c);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l3, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C13522(pointerInputScope, interfaceC9545q, interfaceC9540l2, interfaceC9540l, interfaceC9540l3, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l3, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9545q = NoPressGesture;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l3 = null;
        }
        return detectTapGestures(pointerInputScope, interfaceC9540l, interfaceC9540l2, interfaceC9545q, interfaceC9540l3, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineStart getCoroutineStartForCurrentDispatchBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? CoroutineStart.f23479f : CoroutineStart.f23476c;
    }

    private static /* synthetic */ void getCoroutineStartForCurrentDispatchBehavior$annotations() {
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    @InterfaceC10770a
    @ExperimentalTapGestureDetectorBehaviorApi
    public static /* synthetic */ void getDetectTapGesturesEnableNewDispatchingBehavior$annotations() {
    }

    private static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z10, boolean z11) {
        if (z11) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (!PointerType.m32175equalsimpl0(changes.get(i10).m32107getTypeT8wyACA(), PointerType.Companion.m32180getMouseT8wyACA())) {
                        break;
                    }
                    i10++;
                } else if (!PointerEvent_androidKt.m32077isPrimaryPressedaHzCxE(pointerEvent.m32044getButtonsry648PA())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            PointerInputChange pointerInputChange = changes2.get(i11);
            if (!(z10 ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
        }
        return isChangedToDown(pointerEvent, z10, z11);
    }

    private static final InterfaceC10045g launchAwaitingReset(InterfaceC11122i0 interfaceC11122i0, InterfaceC10045g interfaceC10045g, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p) {
        return AbstractC11117h.m24726d(interfaceC11122i0, null, coroutineStart, new C13531(interfaceC10045g, interfaceC9544p, null), 1, null);
    }

    public static /* synthetic */ InterfaceC10045g launchAwaitingReset$default(InterfaceC11122i0 interfaceC11122i0, InterfaceC10045g interfaceC10045g, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineStart = getCoroutineStartForCurrentDispatchBehavior();
        }
        return launchAwaitingReset(interfaceC11122i0, interfaceC10045g, coroutineStart, interfaceC9544p);
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final void setDetectTapGesturesEnableNewDispatchingBehavior(boolean z10) {
        ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForLongPress(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.p014ui.input.pointer.PointerEventPass r8, vc.InterfaceC11588c<? super androidx.compose.foundation.gestures.LongPressResult> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13541
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            goto L5b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.AbstractC9924b.m20071b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
            r9.f23402c = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            long r4 = r2.getLongPressTimeoutMillis()     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.L$0 = r9     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.label = r3     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            java.lang.Object r7 = r7.withTimeout(r4, r2, r0)     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r7 = r9
        L5b:
            java.lang.Object r7 = r7.f23402c
            return r7
        L5e:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, interfaceC11588c);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, interfaceC11588c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.p014ui.input.pointer.PointerEventPass r9, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13472
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13472) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.AbstractC9924b.m20071b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.AbstractC9924b.m20071b(r10)
        L42:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p014ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, pointerEventPass, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.p014ui.input.pointer.PointerEventPass r18, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, vc.c):java.lang.Object");
    }
}
