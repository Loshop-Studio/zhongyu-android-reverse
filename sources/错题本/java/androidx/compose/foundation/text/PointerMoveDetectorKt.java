package androidx.compose.foundation.text;

import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pointerEventPass", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Ld6/s;", "onMove", "detectMoves", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lr6/c;Lh6/c;)Ljava/lang/Object;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m5303f = "PointerMoveDetector.kt", m5304i = {}, m5305l = {41}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,61:1\n329#2:62\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:62\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2 */
    public static final class C12722 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6471c $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m5303f = "PointerMoveDetector.kt", m5304i = {0, 0}, m5305l = {44}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope", "previousPosition"}, m5308s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC5636h $currentContext;
            final /* synthetic */ InterfaceC6471c $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC5636h interfaceC5636h, PointerEventPass pointerEventPass, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$currentContext = interfaceC5636h;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = interfaceC6471c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
            /* JADX WARN: Type inference failed for: r8v15, types: [T, androidx.compose.ui.geometry.Offset] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003e -> B:14:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r7.label
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r7.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r3 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.AbstractC5774b.m5119b(r8)
                    goto L41
                L15:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1d:
                    kotlin.AbstractC5774b.m5119b(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r8
                L2a:
                    h6.h r8 = r7.$currentContext
                    boolean r8 = kotlinx.coroutines.AbstractC6014x.m5647r(r8)
                    if (r8 == 0) goto La1
                    androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                    if (r8 != r0) goto L41
                    return r0
                L41:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p011ui.input.pointer.PointerEvent) r8
                    int r4 = r8.getType()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
                    int r6 = r5.m11863getMove7fucELk()
                    boolean r6 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r4, r6)
                    if (r6 == 0) goto L55
                    r6 = r2
                    goto L5d
                L55:
                    int r6 = r5.m11861getEnter7fucELk()
                    boolean r6 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r4, r6)
                L5d:
                    if (r6 == 0) goto L61
                    r4 = r2
                    goto L69
                L61:
                    int r5 = r5.m11862getExit7fucELk()
                    boolean r4 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r4, r5)
                L69:
                    if (r4 == 0) goto L2a
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = kotlin.collections.AbstractC5805t.m5228h0(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r8
                    long r4 = r8.getPosition()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r4)
                    long r4 = r8.m10451unboximpl()
                    T r6 = r1.element
                    boolean r4 = androidx.compose.p011ui.geometry.Offset.m10437equalsimpl(r4, r6)
                    if (r4 != 0) goto L8a
                    goto L8b
                L8a:
                    r8 = 0
                L8b:
                    if (r8 == 0) goto L2a
                    r6.c r4 = r7.$onMove
                    long r5 = r8.m10451unboximpl()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r5)
                    r1.element = r8
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p011ui.geometry.Offset.m10430boximpl(r5)
                    r4.invoke(r8)
                    goto L2a
                La1:
                    d6.s r8 = p045d6.C5443s.f8405a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.C12722.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12722(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C12722> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = interfaceC6471c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C12722(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5636h context = getContext();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C12722) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Nullable
    public static final Object detectMoves(@NotNull PointerInputScope pointerInputScope, @NotNull PointerEventPass pointerEventPass, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C12722(pointerInputScope, pointerEventPass, interfaceC6471c, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC6471c interfaceC6471c, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, interfaceC6471c, interfaceC5631c);
    }
}
