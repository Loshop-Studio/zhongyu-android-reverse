package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.PointerType;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final InterfaceC10575q NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m17801f = "TapGestureDetector.kt", m17802l = {291}, m17803m = "awaitFirstDown")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 */
    public static final class C13172 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13172(InterfaceC9324c<? super C13172> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m17801f = "TapGestureDetector.kt", m17802l = {304}, m17803m = "awaitPrimaryFirstDown")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 */
    public static final class C13181 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13181(InterfaceC9324c<? super C13181> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitPrimaryFirstDown(null, false, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m17801f = "TapGestureDetector.kt", m17802l = {TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 */
    public static final class C13192 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13192(PointerInputChange pointerInputChange, InterfaceC9324c<? super C13192> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$firstUp = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13192 c13192 = new C13192(this.$firstUp, interfaceC9324c);
            c13192.L$0 = obj;
            return c13192;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super PointerInputChange> interfaceC9324c) {
            return ((C13192) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.J$0
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                kotlin.AbstractC9079b.m15926b(r12)
                java.lang.Object r12 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r12
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
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13192.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m17801f = "TapGestureDetector.kt", m17802l = {TbsListener.ErrorCode.DEXOPT_EXCEPTION}, m17803m = "consumeUntilUp")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 */
    public static final class C13201 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13201(InterfaceC9324c<? super C13201> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.consumeUntilUp(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m17801f = "TapGestureDetector.kt", m17802l = {247}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2 */
    public static final class C13212 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10575q $onPress;
        final /* synthetic */ InterfaceC10570l $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m17801f = "TapGestureDetector.kt", m17802l = {251, 257}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC10575q $onPress;
            final /* synthetic */ InterfaceC10570l $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m17801f = "TapGestureDetector.kt", m17802l = {254}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107591 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ InterfaceC10575q $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107591(InterfaceC10575q interfaceC10575q, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC9324c<? super C107591> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$onPress = interfaceC10575q;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new C107591(this.$onPress, this.$pressScope, this.$down, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((C107591) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC10575q interfaceC10575q = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM24024boximpl = Offset.m24024boximpl(this.$down.m25502getPositionF1C5BW0());
                        this.label = 1;
                        if (interfaceC10575q.invoke(pressGestureScopeImpl, offsetM24024boximpl, this) == objM17291f) {
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

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass2(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.cancel();
                    return C8736p.f16368a;
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass3> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass3(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.release();
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC8822b0 interfaceC8822b0, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$$this$coroutineScope = interfaceC8822b0;
                this.$onPress = interfaceC10575q;
                this.$onTap = interfaceC10570l;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                    java.lang.Object r6 = p190n7.AbstractC9434a.m17291f()
                    int r0 = r3.label
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L35
                    if (r0 == r8) goto L25
                    if (r0 != r7) goto L1d
                    java.lang.Object r0 = r3.L$0
                    kotlinx.coroutines.n r0 = (kotlinx.coroutines.InterfaceC9212n) r0
                    kotlin.AbstractC9079b.m15926b(r17)
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
                    kotlinx.coroutines.n r0 = (kotlinx.coroutines.InterfaceC9212n) r0
                    java.lang.Object r1 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.AbstractC9079b.m15926b(r17)
                    r11 = r0
                    r0 = r1
                    r1 = r17
                    goto L62
                L35:
                    kotlin.AbstractC9079b.m15926b(r17)
                    java.lang.Object r0 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r0
                    i8.b0 r10 = r3.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior()
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r13.<init>(r1, r9)
                    r14 = 1
                    r15 = 0
                    r11 = 0
                    kotlinx.coroutines.n r10 = p135i8.AbstractC8833f.m14845d(r10, r11, r12, r13, r14, r15)
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
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r1
                    r1.consume()
                    x7.q r2 = r3.$onPress
                    x7.q r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                    if (r2 == r4) goto L80
                    i8.b0 r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                    x7.q r2 = r3.$onPress
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
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r0
                    if (r0 != 0) goto La1
                    i8.b0 r10 = r3.$$this$coroutineScope
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
                    i8.b0 r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r13.<init>(r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.launchAwaitingReset$default(r10, r11, r12, r13, r14, r15)
                    x7.l r1 = r3.$onTap
                    if (r1 == 0) goto Lc2
                    long r4 = r0.m25502getPositionF1C5BW0()
                    androidx.compose.ui.geometry.Offset r0 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r4)
                    r1.invoke(r0)
                Lc2:
                    h7.p r0 = p123h7.C8736p.f16368a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13212.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13212(PointerInputScope pointerInputScope, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super C13212> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = interfaceC10575q;
            this.$onTap = interfaceC10570l;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13212 c13212 = new C13212(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, interfaceC9324c);
            c13212.L$0 = obj;
            return c13212;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13212) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8822b0, this.$onPress, this.$onTap, this.$pressScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m17801f = "TapGestureDetector.kt", m17802l = {104}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2 */
    public static final class C13222 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $onDoubleTap;
        final /* synthetic */ InterfaceC10570l $onLongPress;
        final /* synthetic */ InterfaceC10575q $onPress;
        final /* synthetic */ InterfaceC10570l $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m17801f = "TapGestureDetector.kt", m17802l = {TbsListener.ErrorCode.DISK_FULL, 116, 119, 122, 149, 167, 169, TXLiveConstants.RENDER_ROTATION_180}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC10570l $onDoubleTap;
            final /* synthetic */ InterfaceC10570l $onLongPress;
            final /* synthetic */ InterfaceC10575q $onPress;
            final /* synthetic */ InterfaceC10570l $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m17801f = "TapGestureDetector.kt", m17802l = {110}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107601 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ InterfaceC10575q $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107601(InterfaceC10575q interfaceC10575q, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC9324c<? super C107601> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$onPress = interfaceC10575q;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new C107601(this.$onPress, this.$pressScope, this.$down, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((C107601) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC10575q interfaceC10575q = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM24024boximpl = Offset.m24024boximpl(this.$down.m25502getPositionF1C5BW0());
                        this.label = 1;
                        if (interfaceC10575q.invoke(pressGestureScopeImpl, offsetM24024boximpl, this) == objM17291f) {
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

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass2(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.release();
                    return C8736p.f16368a;
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass3> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass3(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.cancel();
                    return C8736p.f16368a;
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass4> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass4(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass4) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.release();
                    return C8736p.f16368a;
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", m17801f = "TapGestureDetector.kt", m17802l = {157, 158}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ InterfaceC9212n $cancelOrReleaseJob;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(InterfaceC9212n interfaceC9212n, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass5> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$cancelOrReleaseJob = interfaceC9212n;
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass5) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                        java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                        int r1 = r4.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.AbstractC9079b.m15926b(r5)
                        goto L37
                    L12:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1a:
                        kotlin.AbstractC9079b.m15926b(r5)
                        goto L2c
                    L1e:
                        kotlin.AbstractC9079b.m15926b(r5)
                        kotlinx.coroutines.n r5 = r4.$cancelOrReleaseJob
                        r4.label = r3
                        java.lang.Object r5 = r5.mo16291n(r4)
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
                        h7.p r5 = p123h7.C8736p.f16368a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13222.AnonymousClass1.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", m17801f = "TapGestureDetector.kt", m17802l = {161}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ InterfaceC10575q $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(InterfaceC10575q interfaceC10575q, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, InterfaceC9324c<? super AnonymousClass6> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$onPress = interfaceC10575q;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass6) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC10575q interfaceC10575q = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM24024boximpl = Offset.m24024boximpl(this.$secondDown.m25502getPositionF1C5BW0());
                        this.label = 1;
                        if (interfaceC10575q.invoke(pressGestureScopeImpl, offsetM24024boximpl, this) == objM17291f) {
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

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass7> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass7(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass7) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.release();
                    return C8736p.f16368a;
                }
            }

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", m17801f = "TapGestureDetector.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass8> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass8(this.$pressScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass8) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    this.$pressScope.cancel();
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC8822b0 interfaceC8822b0, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, PressGestureScopeImpl pressGestureScopeImpl, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$$this$coroutineScope = interfaceC8822b0;
                this.$onPress = interfaceC10575q;
                this.$onLongPress = interfaceC10570l;
                this.$onDoubleTap = interfaceC10570l2;
                this.$onTap = interfaceC10570l3;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13222.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13222(PointerInputScope pointerInputScope, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC9324c<? super C13222> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onPress = interfaceC10575q;
            this.$onLongPress = interfaceC10570l;
            this.$onDoubleTap = interfaceC10570l2;
            this.$onTap = interfaceC10570l3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13222 c13222 = new C13222(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, interfaceC9324c);
            c13222.L$0 = obj;
            return c13222;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13222) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                PointerInputScope pointerInputScope = this.$this_detectTapGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC8822b0, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", m17801f = "TapGestureDetector.kt", m17802l = {502, 504}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1 */
    public static final class C13231 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ InterfaceC9212n $resetJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13231(InterfaceC9212n interfaceC9212n, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C13231> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$resetJob = interfaceC9212n;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13231 c13231 = new C13231(this.$resetJob, this.$block, interfaceC9324c);
            c13231.L$0 = obj;
            return c13231;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13231) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r5)
                goto L49
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.L$0
                i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                kotlin.AbstractC9079b.m15926b(r5)
                goto L3b
            L22:
                kotlin.AbstractC9079b.m15926b(r5)
                java.lang.Object r5 = r4.L$0
                r1 = r5
                i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled
                if (r5 == 0) goto L3b
                kotlinx.coroutines.n r5 = r4.$resetJob
                r4.L$0 = r1
                r4.label = r3
                java.lang.Object r5 = r5.mo16291n(r4)
                if (r5 != r0) goto L3b
                goto L48
            L3b:
                x7.p r5 = r4.$block
                r3 = 0
                r4.L$0 = r3
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13231.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m17801f = "TapGestureDetector.kt", m17802l = {384}, m17803m = "waitForLongPress")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 */
    public static final class C13241 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13241(InterfaceC9324c<? super C13241> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForLongPress(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", m17801f = "TapGestureDetector.kt", m17802l = {386, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 */
    public static final class C13252 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ PointerEventPass $pass;
        final /* synthetic */ Ref$ObjectRef<LongPressResult> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13252(PointerEventPass pointerEventPass, Ref$ObjectRef<LongPressResult> ref$ObjectRef, InterfaceC9324c<? super C13252> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$pass = pointerEventPass;
            this.$result = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13252 c13252 = new C13252(this.$pass, this.$result, interfaceC9324c);
            c13252.L$0 = obj;
            return c13252;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13252) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            r13.$result.f17473a = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            r14 = r14.getChanges();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r6 >= r5) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (r7.isConsumed() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (androidx.compose.p013ui.input.pointer.PointerEventKt.m25447isOutOfBoundsjwHxaWs(r7, r1.mo25410getSizeYbymL2g(), r1.mo25409getExtendedTouchPaddingNHjbRc()) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            r13.$result.f17473a = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        
            r14 = androidx.compose.p013ui.input.pointer.PointerEventPass.Final;
            r13.L$0 = r1;
            r13.label = 2;
            r14 = r1.awaitPointerEvent(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        
            if (r14 != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
        
            r13.$result.f17473a = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
        
            return p123h7.C8736p.f16368a;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ce A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a1 -> B:34:0x00a4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r13.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r14)
                goto La4
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r14)
                goto L40
            L28:
                kotlin.AbstractC9079b.m15926b(r14)
                java.lang.Object r14 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r14
            L2f:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = r13.$pass
                r13.L$0 = r14
                r13.label = r4
                java.lang.Object r1 = r14.awaitPointerEvent(r1, r13)
                if (r1 != r0) goto L3d
                goto La3
            L3d:
                r12 = r1
                r1 = r14
                r14 = r12
            L40:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p013ui.input.pointer.PointerEvent) r14
                java.util.List r5 = r14.getChanges()
                int r6 = r5.size()
                r7 = r3
            L4b:
                if (r7 >= r6) goto Lce
                java.lang.Object r8 = r5.get(r7)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                boolean r8 = androidx.compose.p013ui.input.pointer.PointerEventKt.changedToUp(r8)
                if (r8 != 0) goto Lca
                boolean r5 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14)
                if (r5 == 0) goto L67
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r14 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Success r0 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
                r14.f17473a = r0
                goto Le1
            L67:
                java.util.List r14 = r14.getChanges()
                int r5 = r14.size()
                r6 = r3
            L70:
                if (r6 >= r5) goto L97
                java.lang.Object r7 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r7
                boolean r8 = r7.isConsumed()
                if (r8 != 0) goto L90
                long r8 = r1.mo25410getSizeYbymL2g()
                long r10 = r1.mo25409getExtendedTouchPaddingNHjbRc()
                boolean r7 = androidx.compose.p013ui.input.pointer.PointerEventKt.m25447isOutOfBoundsjwHxaWs(r7, r8, r10)
                if (r7 == 0) goto L8d
                goto L90
            L8d:
                int r6 = r6 + 1
                goto L70
            L90:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r14 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Canceled r0 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
                r14.f17473a = r0
                goto Le1
            L97:
                androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.p013ui.input.pointer.PointerEventPass.Final
                r13.L$0 = r1
                r13.label = r2
                java.lang.Object r14 = r1.awaitPointerEvent(r14, r13)
                if (r14 != r0) goto La4
            La3:
                return r0
            La4:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p013ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.getChanges()
                int r5 = r14.size()
                r6 = r3
            Laf:
                if (r6 >= r5) goto Lc7
                java.lang.Object r7 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r7
                boolean r7 = r7.isConsumed()
                if (r7 == 0) goto Lc4
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r14 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Canceled r0 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
                r14.f17473a = r0
                goto Le1
            Lc4:
                int r6 = r6 + 1
                goto Laf
            Lc7:
                r14 = r1
                goto L2f
            Lca:
                int r7 = r7 + 1
                goto L4b
            Lce:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.LongPressResult> r0 = r13.$result
                androidx.compose.foundation.gestures.LongPressResult$Released r1 = new androidx.compose.foundation.gestures.LongPressResult$Released
                java.util.List r14 = r14.getChanges()
                java.lang.Object r14 = r14.get(r3)
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r14
                r1.<init>(r14)
                r0.f17473a = r1
            Le1:
                h7.p r14 = p123h7.C8736p.f16368a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C13252.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m17801f = "TapGestureDetector.kt", m17802l = {352, 366}, m17803m = "waitForUpOrCancellation")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 */
    public static final class C13262 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13262(InterfaceC9324c<? super C13262> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    @InterfaceC8721a
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z10, InterfaceC9324c interfaceC9324c) {
        return awaitFirstDown(awaitPointerEventScope, z10, PointerEventPass.Main, interfaceC9324c);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, interfaceC9324c);
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
    public static final java.lang.Object awaitPrimaryFirstDown(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.p013ui.input.pointer.PointerEventPass r7, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13181
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13181) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.p013ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.AbstractC9079b.m15926b(r8)
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
            kotlin.AbstractC9079b.m15926b(r8)
        L42:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p013ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown(r8, r6, r3)
            if (r2 == 0) goto L42
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, PointerEventPass pointerEventPass, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, z10, pointerEventPass, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, InterfaceC9324c<? super PointerInputChange> interfaceC9324c) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C13192(pointerInputChange, null), interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13201
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13201) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9079b.m15926b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.AbstractC9079b.m15926b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p013ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p013ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, m7.c):java.lang.Object");
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C13212(pointerInputScope, interfaceC10575q, interfaceC10570l, new PressGestureScopeImpl(pointerInputScope), null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10575q = NoPressGesture;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l = null;
        }
        return detectTapAndPress(pointerInputScope, interfaceC10575q, interfaceC10570l, interfaceC9324c);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l3, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C13222(pointerInputScope, interfaceC10575q, interfaceC10570l2, interfaceC10570l, interfaceC10570l3, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l3, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10575q = NoPressGesture;
        }
        if ((i10 & 8) != 0) {
            interfaceC10570l3 = null;
        }
        return detectTapGestures(pointerInputScope, interfaceC10570l, interfaceC10570l2, interfaceC10575q, interfaceC10570l3, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineStart getCoroutineStartForCurrentDispatchBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? CoroutineStart.f17555d : CoroutineStart.f17552a;
    }

    private static /* synthetic */ void getCoroutineStartForCurrentDispatchBehavior$annotations() {
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    @InterfaceC8721a
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
                    if (!PointerType.m25573equalsimpl0(changes.get(i10).m25505getTypeT8wyACA(), PointerType.Companion.m25578getMouseT8wyACA())) {
                        break;
                    }
                    i10++;
                } else if (!PointerEvent_androidKt.m25475isPrimaryPressedaHzCxE(pointerEvent.m25442getButtonsry648PA())) {
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

    private static final InterfaceC9212n launchAwaitingReset(InterfaceC8822b0 interfaceC8822b0, InterfaceC9212n interfaceC9212n, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p) {
        return AbstractC8839h.m14861d(interfaceC8822b0, null, coroutineStart, new C13231(interfaceC9212n, interfaceC10574p, null), 1, null);
    }

    public static /* synthetic */ InterfaceC9212n launchAwaitingReset$default(InterfaceC8822b0 interfaceC8822b0, InterfaceC9212n interfaceC9212n, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineStart = getCoroutineStartForCurrentDispatchBehavior();
        }
        return launchAwaitingReset(interfaceC8822b0, interfaceC9212n, coroutineStart, interfaceC10574p);
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
    public static final java.lang.Object waitForLongPress(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.p013ui.input.pointer.PointerEventPass r8, p179m7.InterfaceC9324c<? super androidx.compose.foundation.gestures.LongPressResult> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13241
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13241) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            goto L5b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.AbstractC9079b.m15926b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
            r9.f17473a = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            long r4 = r2.getLongPressTimeoutMillis()     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.L$0 = r9     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.label = r3     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            java.lang.Object r7 = r7.withTimeout(r4, r2, r0)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r7 = r9
        L5b:
            java.lang.Object r7 = r7.f17473a
            return r7
        L5e:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, interfaceC9324c);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, interfaceC9324c);
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
    public static final java.lang.Object awaitFirstDown(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.p013ui.input.pointer.PointerEventPass r9, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C13172
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C13172) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.p013ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.AbstractC9079b.m15926b(r10)
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
            kotlin.AbstractC9079b.m15926b(r10)
        L42:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p013ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, PointerEventPass pointerEventPass, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, pointerEventPass, interfaceC9324c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.p013ui.input.pointer.PointerEventPass r18, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, m7.c):java.lang.Object");
    }
}
