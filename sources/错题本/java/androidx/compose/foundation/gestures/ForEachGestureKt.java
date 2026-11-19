package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\r\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0086@¢\u0006\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function2;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "block", "forEachGesture", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "allPointersUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)Z", "awaitAllPointersUp", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;", "awaitEachGesture", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,120:1\n329#2:121\n329#2:140\n102#3,2:122\n34#3,6:124\n104#3:130\n102#3,2:131\n34#3,6:133\n104#3:139\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:121\n98#1:140\n71#1:122,2\n71#1:124,6\n71#1:130\n85#1:131,2\n85#1:133,6\n85#1:139\n*E\n"})
/* loaded from: classes.dex */
public final class ForEachGestureKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", m5303f = "ForEachGesture.kt", m5304i = {}, m5305l = {75}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 */
    public static final class C08702 extends RestrictedSuspendLambda implements InterfaceC6473e {
        private /* synthetic */ Object L$0;
        int label;

        public C08702(InterfaceC5631c<? super C08702> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08702 c08702 = new C08702(interfaceC5631c);
            c08702.L$0 = obj;
            return c08702;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08702) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitAllPointersUp$default(awaitPointerEventScope, null, this, 1, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ForEachGestureKt", m5303f = "ForEachGesture.kt", m5304i = {0, 0}, m5305l = {84}, m5306m = "awaitAllPointersUp", m5307n = {"$this$awaitAllPointersUp", "pass"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 */
    public static final class C08713 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C08713(InterfaceC5631c<? super C08713> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m5303f = "ForEachGesture.kt", m5304i = {0, 1, 2}, m5305l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 105, 110}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, m5308s = {"L$0", "L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 */
    public static final class C08722 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ InterfaceC5636h $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08722(InterfaceC5636h interfaceC5636h, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C08722> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$currentContext = interfaceC5636h;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08722 c08722 = new C08722(this.$currentContext, this.$block, interfaceC5631c);
            c08722.L$0 = obj;
            return c08722;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C08722) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0027). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:12:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r9)
                goto L27
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.util.concurrent.CancellationException -> L29
            L27:
                r9 = r1
                goto L3a
            L29:
                r9 = move-exception
                goto L5f
            L2b:
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.util.concurrent.CancellationException -> L29
                goto L50
            L33:
                kotlin.AbstractC5774b.m5119b(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r9
            L3a:
                h6.h r1 = r8.$currentContext
                boolean r1 = kotlinx.coroutines.AbstractC6014x.m5647r(r1)
                if (r1 == 0) goto L73
                r6.e r1 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L5b
                r8.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L5b
                r8.label = r5     // Catch: java.util.concurrent.CancellationException -> L5b
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5b
                if (r1 != r0) goto L4f
                goto L71
            L4f:
                r1 = r9
            L50:
                r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L29
                r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L29
                java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L29
                if (r9 != r0) goto L27
                goto L71
            L5b:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L5f:
                h6.h r6 = r8.$currentContext
                boolean r6 = kotlinx.coroutines.AbstractC6014x.m5647r(r6)
                if (r6 == 0) goto L72
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)
                if (r9 != r0) goto L27
            L71:
                return r0
            L72:
                throw r9
            L73:
                d6.s r9 = p045d6.C5443s.f8405a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.C08722.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ForEachGestureKt", m5303f = "ForEachGesture.kt", m5304i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m5305l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, 56}, m5306m = "forEachGesture", m5307n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, m5308s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 */
    public static final class C08731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C08731(InterfaceC5631c<? super C08731> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    public static final boolean allPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z8 = true;
                break;
            }
            i++;
        }
        return !z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:19:0x0050). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r7, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerEventPass r8, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.C08713
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.C08713) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC5774b.m5119b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L50
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.AbstractC5774b.m5119b(r9)
            boolean r9 = allPointersUp(r7)
            if (r9 != 0) goto L6d
        L43:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r7.awaitPointerEvent(r8, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p011ui.input.pointer.PointerEvent) r9
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
            r4 = 0
        L5b:
            if (r4 >= r2) goto L6d
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L6a
            goto L43
        L6a:
            int r4 = r4 + 1
            goto L5b
        L6d:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, interfaceC5631c);
    }

    @Nullable
    public static final Object awaitEachGesture(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C08722(interfaceC5631c.getContext(), interfaceC6473e, null), interfaceC5631c);
        return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : C5443s.f8405a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [h6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008f -> B:18:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a9 -> B:18:0x0050). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.input.pointer.PointerInputScope r8, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r9, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.C08731
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.C08731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L65
            if (r2 == r5) goto L55
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.L$2
            h6.h r8 = (p075h6.InterfaceC5636h) r8
            java.lang.Object r9 = r0.L$1
            r6.e r9 = (p152r6.InterfaceC6473e) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p011ui.input.pointer.PointerInputScope) r2
            kotlin.AbstractC5774b.m5119b(r10)
            goto L50
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.L$2
            h6.h r8 = (p075h6.InterfaceC5636h) r8
            java.lang.Object r9 = r0.L$1
            r6.e r9 = (p152r6.InterfaceC6473e) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p011ui.input.pointer.PointerInputScope) r2
            kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.util.concurrent.CancellationException -> L53
        L50:
            r10 = r8
            r8 = r2
            goto L6c
        L53:
            r10 = move-exception
            goto L97
        L55:
            java.lang.Object r8 = r0.L$2
            h6.h r8 = (p075h6.InterfaceC5636h) r8
            java.lang.Object r9 = r0.L$1
            r6.e r9 = (p152r6.InterfaceC6473e) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p011ui.input.pointer.PointerInputScope) r2
            kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.util.concurrent.CancellationException -> L53
            goto L83
        L65:
            kotlin.AbstractC5774b.m5119b(r10)
            h6.h r10 = r0.getContext()
        L6c:
            boolean r2 = kotlinx.coroutines.AbstractC6014x.m5647r(r10)
            if (r2 == 0) goto Lad
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L92
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L92
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L92
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L92
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L92
            if (r2 != r1) goto L81
            goto Lab
        L81:
            r2 = r8
            r8 = r10
        L83:
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L53
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L53
            r0.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L53
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r10 != r1) goto L50
            goto Lab
        L92:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L97:
            boolean r6 = kotlinx.coroutines.AbstractC6014x.m5647r(r8)
            if (r6 == 0) goto Lac
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L50
        Lab:
            return r1
        Lac:
            throw r10
        Lad:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, r6.e, h6.c):java.lang.Object");
    }

    @Nullable
    public static final Object awaitAllPointersUp(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C08702(null), interfaceC5631c);
        return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : C5443s.f8405a;
    }
}
