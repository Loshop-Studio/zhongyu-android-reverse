package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m17801f = "PointerMoveDetector.kt", m17802l = {41}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2 */
    public static final class C17022 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m17801f = "PointerMoveDetector.kt", m17802l = {44}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC9100d $currentContext;
            final /* synthetic */ InterfaceC10570l $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9100d interfaceC9100d, PointerEventPass pointerEventPass, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$currentContext = interfaceC9100d;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = interfaceC10570l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                    java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                    int r1 = r7.label
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r3 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.AbstractC9079b.m15926b(r8)
                    goto L43
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    kotlin.AbstractC9079b.m15926b(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r8
                L2c:
                    kotlin.coroutines.d r8 = r7.$currentContext
                    boolean r8 = p135i8.AbstractC8823b1.m14819o(r8)
                    if (r8 == 0) goto La3
                    androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p013ui.input.pointer.PointerEvent) r8
                    int r4 = r8.m25444getType7fucELk()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p013ui.input.pointer.PointerEventType.Companion
                    int r6 = r5.m25457getMove7fucELk()
                    boolean r6 = androidx.compose.p013ui.input.pointer.PointerEventType.m25451equalsimpl0(r4, r6)
                    if (r6 == 0) goto L57
                    r6 = r2
                    goto L5f
                L57:
                    int r6 = r5.m25455getEnter7fucELk()
                    boolean r6 = androidx.compose.p013ui.input.pointer.PointerEventType.m25451equalsimpl0(r4, r6)
                L5f:
                    if (r6 == 0) goto L63
                    r4 = r2
                    goto L6b
                L63:
                    int r5 = r5.m25456getExit7fucELk()
                    boolean r4 = androidx.compose.p013ui.input.pointer.PointerEventType.m25451equalsimpl0(r4, r5)
                L6b:
                    if (r4 == 0) goto L2c
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = p134i7.AbstractC8778f0.m14566l0(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                    long r4 = r8.m25502getPositionF1C5BW0()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r4)
                    long r4 = r8.m24045unboximpl()
                    java.lang.Object r6 = r1.f17473a
                    boolean r4 = androidx.compose.p013ui.geometry.Offset.m24031equalsimpl(r4, r6)
                    if (r4 != 0) goto L8c
                    goto L8d
                L8c:
                    r8 = 0
                L8d:
                    if (r8 == 0) goto L2c
                    x7.l r4 = r7.$onMove
                    long r5 = r8.m24045unboximpl()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r5)
                    r1.f17473a = r8
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r5)
                    r4.invoke(r8)
                    goto L2c
                La3:
                    h7.p r8 = p123h7.C8736p.f16368a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.C17022.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17022(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C17022> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C17022(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17022) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9100d context = getContext();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == objM17291f) {
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

    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C17022(pointerInputScope, pointerEventPass, interfaceC10570l, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, interfaceC10570l, interfaceC9324c);
    }
}
