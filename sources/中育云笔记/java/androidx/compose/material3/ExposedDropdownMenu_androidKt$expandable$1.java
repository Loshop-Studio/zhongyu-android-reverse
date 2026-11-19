package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", m26211f = "ExposedDropdownMenu.android.kt", m26212l = {1426}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ String $anchorType;
    final /* synthetic */ InterfaceC9529a $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", m26211f = "ExposedDropdownMenu.android.kt", m26212l = {1430, 1434}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1 */
    public static final class C21791 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ InterfaceC9529a $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21791(String str, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C21791> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$anchorType = str;
            this.$onExpandedChange = interfaceC9529a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C21791 c21791 = new C21791(this.$anchorType, this.$onExpandedChange, interfaceC11588c);
            c21791.L$0 = obj;
            return c21791;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C21791) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.AbstractC9924b.m20071b(r11)
                r7 = r10
                goto L5f
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r11)
                r7 = r10
                goto L3e
            L24:
                kotlin.AbstractC9924b.m20071b(r11)
                java.lang.Object r11 = r10.L$0
                r4 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r4
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                r10.L$0 = r4
                r10.label = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3d
                goto L5e
            L3d:
                r1 = r4
            L3e:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11
                java.lang.String r3 = r7.$anchorType
                androidx.compose.material3.MenuAnchorType$Companion r4 = androidx.compose.material3.MenuAnchorType.Companion
                java.lang.String r4 = r4.m28822getSecondaryEditableMg6Rgbw()
                boolean r3 = androidx.compose.material3.MenuAnchorType.m28816equalsimpl0(r3, r4)
                if (r3 == 0) goto L51
                r11.consume()
            L51:
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                r3 = 0
                r7.L$0 = r3
                r7.label = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r10)
                if (r11 != r0) goto L5f
            L5e:
                return r0
            L5f:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11
                if (r11 == 0) goto L68
                hd.a r11 = r7.$onExpandedChange
                r11.invoke()
            L68:
                qc.q r11 = p309qc.C10786q.f26013a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1.C21791.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(String str, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super ExposedDropdownMenu_androidKt$expandable$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$anchorType = str;
        this.$onExpandedChange = interfaceC9529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.$anchorType, this.$onExpandedChange, interfaceC11588c);
        exposedDropdownMenu_androidKt$expandable$1.L$0 = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C21791 c21791 = new C21791(this.$anchorType, this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c21791, this) == objM25952f) {
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
