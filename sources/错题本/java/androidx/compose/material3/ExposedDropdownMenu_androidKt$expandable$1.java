package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", m5303f = "ExposedDropdownMenu.android.kt", m5304i = {}, m5305l = {1426}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $anchorType;
    final /* synthetic */ InterfaceC6469a $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", m5303f = "ExposedDropdownMenu.android.kt", m5304i = {0}, m5305l = {1430, 1434}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1 */
    public static final class C16591 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ InterfaceC6469a $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16591(String str, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super C16591> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$anchorType = str;
            this.$onExpandedChange = interfaceC6469a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C16591 c16591 = new C16591(this.$anchorType, this.$onExpandedChange, interfaceC5631c);
            c16591.L$0 = obj;
            return c16591;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C16591) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                kotlin.AbstractC5774b.m5119b(r11)
                r7 = r10
                goto L5d
            L11:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L19:
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC5774b.m5119b(r11)
                r7 = r10
                goto L3c
            L22:
                kotlin.AbstractC5774b.m5119b(r11)
                java.lang.Object r11 = r10.L$0
                r4 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r4
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                r10.L$0 = r4
                r10.label = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3b
                goto L5c
            L3b:
                r1 = r4
            L3c:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
                java.lang.String r3 = r7.$anchorType
                androidx.compose.material3.MenuAnchorType$Companion r4 = androidx.compose.material3.MenuAnchorType.INSTANCE
                java.lang.String r4 = r4.m8626getSecondaryEditableMg6Rgbw()
                boolean r3 = androidx.compose.material3.MenuAnchorType.m8620equalsimpl0(r3, r4)
                if (r3 == 0) goto L4f
                r11.consume()
            L4f:
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                r3 = 0
                r7.L$0 = r3
                r7.label = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r10)
                if (r11 != r0) goto L5d
            L5c:
                return r0
            L5d:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
                if (r11 == 0) goto L66
                r6.a r11 = r7.$onExpandedChange
                r11.invoke()
            L66:
                d6.s r11 = p045d6.C5443s.f8405a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1.C16591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(String str, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super ExposedDropdownMenu_androidKt$expandable$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$anchorType = str;
        this.$onExpandedChange = interfaceC6469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.$anchorType, this.$onExpandedChange, interfaceC5631c);
        exposedDropdownMenu_androidKt$expandable$1.L$0 = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C16591 c16591 = new C16591(this.$anchorType, this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c16591, this) == coroutineSingletons) {
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
