package androidx.compose.foundation.text;

import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m26211f = "PointerMoveDetector.kt", m26212l = {41}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2 */
    public static final class C17322 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m26211f = "PointerMoveDetector.kt", m26212l = {44}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9945d $currentContext;
            final /* synthetic */ InterfaceC9540l $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9945d interfaceC9945d, PointerEventPass pointerEventPass, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$currentContext = interfaceC9945d;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = interfaceC9540l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:14:0x0043). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                    int r1 = r7.label
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r3 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L43
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    kotlin.AbstractC9924b.m20071b(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r8
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r8
                L2c:
                    kotlin.coroutines.d r8 = r7.$currentContext
                    boolean r8 = sd.AbstractC11147o1.m24780n(r8)
                    if (r8 == 0) goto La3
                    androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p014ui.input.pointer.PointerEvent) r8
                    int r4 = r8.m32046getType7fucELk()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p014ui.input.pointer.PointerEventType.Companion
                    int r6 = r5.m32059getMove7fucELk()
                    boolean r6 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r4, r6)
                    if (r6 == 0) goto L57
                    r6 = r2
                    goto L5f
                L57:
                    int r6 = r5.m32057getEnter7fucELk()
                    boolean r6 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r4, r6)
                L5f:
                    if (r6 == 0) goto L63
                    r4 = r2
                    goto L6b
                L63:
                    int r5 = r5.m32058getExit7fucELk()
                    boolean r4 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r4, r5)
                L6b:
                    if (r4 == 0) goto L2c
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = p325rc.AbstractC10947g0.m23944m0(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
                    long r4 = r8.m32104getPositionF1C5BW0()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r4)
                    long r4 = r8.m30647unboximpl()
                    java.lang.Object r6 = r1.f23402c
                    boolean r4 = androidx.compose.p014ui.geometry.Offset.m30633equalsimpl(r4, r6)
                    if (r4 != 0) goto L8c
                    goto L8d
                L8c:
                    r8 = 0
                L8d:
                    if (r8 == 0) goto L2c
                    hd.l r4 = r7.$onMove
                    long r5 = r8.m30647unboximpl()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r5)
                    r1.f23402c = r8
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r5)
                    r4.invoke(r8)
                    goto L2c
                La3:
                    qc.q r8 = p309qc.C10786q.f26013a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.C17322.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17322(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C17322> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C17322(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC9945d context = getContext();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == objM25952f) {
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
            return ((C17322) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C17322(pointerInputScope, pointerEventPass, interfaceC9540l, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, interfaceC9540l, interfaceC11588c);
    }
}
