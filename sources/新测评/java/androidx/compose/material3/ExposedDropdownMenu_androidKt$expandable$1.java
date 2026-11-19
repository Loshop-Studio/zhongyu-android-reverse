package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", m13596f = "ExposedDropdownMenu.android.kt", m13597i = {}, m13598l = {1426}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $anchorType;
    final /* synthetic */ Function0<Unit> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", m13596f = "ExposedDropdownMenu.android.kt", m13597i = {0}, m13598l = {1430, 1434}, m13599m = "invokeSuspend", m13600n = {"$this$awaitEachGesture"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1 */
    public static final class C21201 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ Function0<Unit> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21201(String str, Function0<Unit> function0, Continuation<? super C21201> continuation) {
            super(2, continuation);
            this.$anchorType = str;
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C21201 c21201 = new C21201(this.$anchorType, this.$onExpandedChange, continuation);
            c21201.L$0 = obj;
            return c21201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C21201) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r11)
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
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                goto L3e
            L24:
                kotlin.ResultKt.throwOnFailure(r11)
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
                androidx.compose.material3.MenuAnchorType$Companion r4 = androidx.compose.material3.MenuAnchorType.INSTANCE
                java.lang.String r4 = r4.m18963getSecondaryEditableMg6Rgbw()
                boolean r3 = androidx.compose.material3.MenuAnchorType.m18957equalsimpl0(r3, r4)
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
                kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.$onExpandedChange
                r11.invoke()
            L68:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1.C21201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(String str, Function0<Unit> function0, Continuation<? super ExposedDropdownMenu_androidKt$expandable$1> continuation) {
        super(2, continuation);
        this.$anchorType = str;
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.$anchorType, this.$onExpandedChange, continuation);
        exposedDropdownMenu_androidKt$expandable$1.L$0 = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C21201 c21201 = new C21201(this.$anchorType, this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c21201, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
