package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", m17801f = "ExposedDropdownMenu.android.kt", m17802l = {1426}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ String $anchorType;
    final /* synthetic */ InterfaceC10559a $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", m17801f = "ExposedDropdownMenu.android.kt", m17802l = {1430, 1434}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1 */
    public static final class C21491 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ InterfaceC10559a $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21491(String str, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C21491> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$anchorType = str;
            this.$onExpandedChange = interfaceC10559a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C21491 c21491 = new C21491(this.$anchorType, this.$onExpandedChange, interfaceC9324c);
            c21491.L$0 = obj;
            return c21491;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C21491) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.AbstractC9079b.m15926b(r11)
                r7 = r10
                goto L5f
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r11)
                r7 = r10
                goto L3e
            L24:
                kotlin.AbstractC9079b.m15926b(r11)
                java.lang.Object r11 = r10.L$0
                r4 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r4
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p013ui.input.pointer.PointerEventPass.Initial
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
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11
                java.lang.String r3 = r7.$anchorType
                androidx.compose.material3.MenuAnchorType$Companion r4 = androidx.compose.material3.MenuAnchorType.Companion
                java.lang.String r4 = r4.m22220getSecondaryEditableMg6Rgbw()
                boolean r3 = androidx.compose.material3.MenuAnchorType.m22214equalsimpl0(r3, r4)
                if (r3 == 0) goto L51
                r11.consume()
            L51:
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p013ui.input.pointer.PointerEventPass.Initial
                r3 = 0
                r7.L$0 = r3
                r7.label = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r10)
                if (r11 != r0) goto L5f
            L5e:
                return r0
            L5f:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11
                if (r11 == 0) goto L68
                x7.a r11 = r7.$onExpandedChange
                r11.invoke()
            L68:
                h7.p r11 = p123h7.C8736p.f16368a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1.C21491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(String str, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super ExposedDropdownMenu_androidKt$expandable$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$anchorType = str;
        this.$onExpandedChange = interfaceC10559a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.$anchorType, this.$onExpandedChange, interfaceC9324c);
        exposedDropdownMenu_androidKt$expandable$1.L$0 = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(pointerInputScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C21491 c21491 = new C21491(this.$anchorType, this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c21491, this) == objM17291f) {
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
