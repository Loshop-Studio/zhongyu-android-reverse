package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.InterfaceC5876e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u000b\u001a*\u0010\u0013\u001a\u00020\u0012*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\t*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017\u001a>\u0010\u001a\u001a\u00020\u0012*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0082@¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "canPan", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lr6/c;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlinx/coroutines/channels/e;", "Landroidx/compose/foundation/gestures/TransformEvent;", "channel", "Landroidx/compose/foundation/gestures/ScrollConfig;", "scrollConfig", "Ld6/s;", "detectZoomByCtrlMouseScroll", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/e;Landroidx/compose/foundation/gestures/ScrollConfig;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitFirstCtrlMouseScroll", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lh6/c;)Ljava/lang/Object;", "awaitCtrlMouseScrollOrNull", "panZoomLock", "detectZoom", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/e;Lr6/c;Lh6/c;)Ljava/lang/Object;", "", "SCROLL_FACTOR", "F", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n329#2:400\n1#3:401\n34#4,6:402\n102#4,2:408\n34#4,6:410\n104#4:416\n34#4,6:417\n102#4,2:423\n34#4,6:425\n104#4:431\n102#4,2:432\n34#4,6:434\n104#4:440\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n268#1:400\n322#1:402,6\n340#1:408,2\n340#1:410,6\n340#1:416\n376#1:417,6\n387#1:423,2\n387#1:425,6\n387#1:431\n388#1:432,2\n388#1:434,6\n388#1:440\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableKt", m5303f = "Transformable.kt", m5304i = {0, 0}, m5305l = {312}, m5306m = "awaitCtrlMouseScrollOrNull", m5307n = {"$this$awaitCtrlMouseScrollOrNull", "scrollConfig"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 */
    public static final class C09131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09131(InterfaceC5631c<? super C09131> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.awaitCtrlMouseScrollOrNull(null, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableKt", m5303f = "Transformable.kt", m5304i = {0, 0}, m5305l = {299}, m5306m = "awaitFirstCtrlMouseScroll", m5307n = {"$this$awaitFirstCtrlMouseScroll", "scrollConfig"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 */
    public static final class C09141 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09141(InterfaceC5631c<? super C09141> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.awaitFirstCtrlMouseScroll(null, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableKt", m5303f = "Transformable.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m5305l = {337, 339, 385}, m5306m = "detectZoom", m5307n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", NotificationCompat.CATEGORY_EVENT, "panZoomLock", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, m5308s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 */
    public static final class C09151 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C09151(InterfaceC5631c<? super C09151> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", m5303f = "Transformable.kt", m5304i = {0, 1}, m5305l = {272, 284}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, m5308s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n69#2:400\n70#3:401\n22#4:402\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n*L\n276#1:400\n276#1:401\n276#1:402\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2 */
    public static final class C09162 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC5876e $channel;
        final /* synthetic */ InterfaceC5636h $currentContext;
        final /* synthetic */ ScrollConfig $scrollConfig;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09162(InterfaceC5636h interfaceC5636h, ScrollConfig scrollConfig, InterfaceC5876e interfaceC5876e, InterfaceC5631c<? super C09162> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$currentContext = interfaceC5636h;
            this.$scrollConfig = scrollConfig;
            this.$channel = interfaceC5876e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09162 c09162 = new C09162(this.$currentContext, this.$scrollConfig, this.$channel, interfaceC5631c);
            c09162.L$0 = obj;
            return c09162;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09162) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0010, B:26:0x008a, B:28:0x008e, B:23:0x0053, B:19:0x0039, B:22:0x0046, B:14:0x0025), top: B:35:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0087 -> B:26:0x008a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r13)     // Catch: java.lang.Throwable -> L15
                goto L8a
            L15:
                r0 = move-exception
                r13 = r0
                goto L9b
            L19:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L21:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r13)     // Catch: java.lang.Throwable -> L15
                goto L46
            L29:
                kotlin.AbstractC5774b.m5119b(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r13
                r1 = r13
            L31:
                h6.h r13 = r12.$currentContext
                boolean r13 = kotlinx.coroutines.AbstractC6014x.m5647r(r13)
                if (r13 == 0) goto La3
                androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L15
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L15
                r12.label = r3     // Catch: java.lang.Throwable -> L15
                java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitFirstCtrlMouseScroll(r1, r13, r12)     // Catch: java.lang.Throwable -> L15
                if (r13 != r0) goto L46
                goto L89
            L46:
                androidx.compose.ui.geometry.Offset r13 = (androidx.compose.p011ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L15
                long r4 = r13.m10451unboximpl()     // Catch: java.lang.Throwable -> L15
                kotlinx.coroutines.channels.e r13 = r12.$channel     // Catch: java.lang.Throwable -> L15
                androidx.compose.foundation.gestures.TransformEvent$TransformStarted r6 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE     // Catch: java.lang.Throwable -> L15
                r13.mo5481a(r6)     // Catch: java.lang.Throwable -> L15
            L53:
                r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r4 = r4 & r6
                int r13 = (int) r4     // Catch: java.lang.Throwable -> L15
                float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch: java.lang.Throwable -> L15
                r4 = 1141391360(0x44084000, float:545.0)
                float r13 = r13 / r4
                r4 = 1073741824(0x40000000, float:2.0)
                double r4 = (double) r4     // Catch: java.lang.Throwable -> L15
                double r6 = (double) r13     // Catch: java.lang.Throwable -> L15
                double r4 = java.lang.Math.pow(r4, r6)     // Catch: java.lang.Throwable -> L15
                float r7 = (float) r4     // Catch: java.lang.Throwable -> L15
                kotlinx.coroutines.channels.e r13 = r12.$channel     // Catch: java.lang.Throwable -> L15
                androidx.compose.foundation.gestures.TransformEvent$TransformDelta r6 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta     // Catch: java.lang.Throwable -> L15
                androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p011ui.geometry.Offset.INSTANCE     // Catch: java.lang.Throwable -> L15
                long r8 = r4.m10457getZeroF1C5BW0()     // Catch: java.lang.Throwable -> L15
                r10 = 0
                r11 = 0
                r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L15
                r13.mo5481a(r6)     // Catch: java.lang.Throwable -> L15
                androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L15
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L15
                r12.label = r2     // Catch: java.lang.Throwable -> L15
                java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitCtrlMouseScrollOrNull(r1, r13, r12)     // Catch: java.lang.Throwable -> L15
                if (r13 != r0) goto L8a
            L89:
                return r0
            L8a:
                androidx.compose.ui.geometry.Offset r13 = (androidx.compose.p011ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L15
                if (r13 == 0) goto L93
                long r4 = r13.m10451unboximpl()     // Catch: java.lang.Throwable -> L15
                goto L53
            L93:
                kotlinx.coroutines.channels.e r13 = r12.$channel
                androidx.compose.foundation.gestures.TransformEvent$TransformStopped r4 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
                r13.mo5481a(r4)
                goto L31
            L9b:
                kotlinx.coroutines.channels.e r0 = r12.$channel
                androidx.compose.foundation.gestures.TransformEvent$TransformStopped r1 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
                r0.mo5481a(r1)
                throw r13
            La3:
                d6.s r13 = p045d6.C5443s.f8405a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.C09162.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitCtrlMouseScrollOrNull(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, p075h6.InterfaceC5631c<? super androidx.compose.p011ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt.C09131
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt.C09131) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.gestures.ScrollConfig r6 = (androidx.compose.foundation.gestures.ScrollConfig) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.AbstractC5774b.m5119b(r7)
            goto L49
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.AbstractC5774b.m5119b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = androidx.compose.p011ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r3, r0, r4, r3)
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.p011ui.input.pointer.PointerEvent) r7
            int r0 = r7.getKeyboardModifiers()
            boolean r0 = androidx.compose.p011ui.input.pointer.PointerEvent_androidKt.m11875isCtrlPressed5xRPYO0(r0)
            if (r0 == 0) goto L97
            int r0 = r7.getType()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r1 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
            int r1 = r1.m11866getScroll7fucELk()
            boolean r0 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r0, r1)
            if (r0 != 0) goto L66
            goto L97
        L66:
            long r0 = r5.mo11816getSizeYbymL2g()
            long r5 = r6.mo6925calculateMouseWheelScroll8xgXZGE(r5, r7, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p011ui.geometry.Offset.INSTANCE
            long r0 = r0.m10457getZeroF1C5BW0()
            boolean r0 = androidx.compose.p011ui.geometry.Offset.m10438equalsimpl0(r5, r0)
            if (r0 == 0) goto L7b
            return r3
        L7b:
            java.util.List r7 = r7.getChanges()
            int r0 = r7.size()
            r1 = 0
        L84:
            if (r1 >= r0) goto L92
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r2
            r2.consume()
            int r1 = r1 + 1
            goto L84
        L92:
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r5)
            return r5
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitCtrlMouseScrollOrNull(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, h6.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstCtrlMouseScroll(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, p075h6.InterfaceC5631c<? super androidx.compose.p011ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt.C09141
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt.C09141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.AbstractC5774b.m5119b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L4a
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.AbstractC5774b.m5119b(r7)
        L3d:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = awaitCtrlMouseScrollOrNull(r5, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.p011ui.geometry.Offset) r7
            if (r7 == 0) goto L3d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b0, code lost:
    
        if (r6 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b7 A[EDGE_INSN: B:103:0x02b7->B:92:0x02b7 BREAK  A[LOOP:0: B:86:0x02a2->B:91:0x02b4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0286 -> B:85:0x0295). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r30, boolean r31, kotlinx.coroutines.channels.InterfaceC5876e r32, p152r6.InterfaceC6471c r33, p075h6.InterfaceC5631c<? super p045d6.C5443s> r34) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.channels.e, r6.c, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectZoomByCtrlMouseScroll(PointerInputScope pointerInputScope, InterfaceC5876e interfaceC5876e, ScrollConfig scrollConfig, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C09162(interfaceC5631c.getContext(), scrollConfig, interfaceC5876e, null), interfaceC5631c);
        return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : C5443s.f8405a;
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull TransformableState transformableState, boolean z8, boolean z9) {
        return transformable(modifier, transformableState, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m7065invokek4lQ0M(((Offset) obj).m10451unboximpl());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m7065invokek4lQ0M(long j7) {
                return Boolean.TRUE;
            }
        }, z8, z9);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            z9 = true;
        }
        return transformable(modifier, transformableState, z8, z9);
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull TransformableState transformableState, @NotNull InterfaceC6471c interfaceC6471c, boolean z8, boolean z9) {
        return modifier.then(new TransformableElement(transformableState, interfaceC6471c, z8, z9));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, InterfaceC6471c interfaceC6471c, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 4) != 0) {
            z8 = false;
        }
        if ((i & 8) != 0) {
            z9 = true;
        }
        return transformable(modifier, transformableState, interfaceC6471c, z8, z9);
    }
}
