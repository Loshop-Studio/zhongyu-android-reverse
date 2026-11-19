package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a<\u0010\b\u001a\u00020\u0000*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\u000b\u001a#\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\b\u0010\r\u001aP\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u0010\u001aT\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0011\"\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\u0013\u001a1\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0011\"\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u0014\u001a8\u0010\u0017\u001a\u00020\u00162'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u001a\"\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010$\u001a\u00020#8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "block", "pointerInput", "(Landroidx/compose/ui/Modifier;Lr6/e;)Landroidx/compose/ui/Modifier;", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lr6/e;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lr6/e;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lr6/e;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;", "pointerInputHandler", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "SuspendingPointerInputModifierNode", "(Lr6/e;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "", "PointerInputModifierNoParamError", "Ljava/lang/String;", "getPointerInputModifierNoParamError$annotations", "()V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "EmptyPointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "WITH_TIMEOUT_MICRO_DELAY_MILLIS", "J", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SuspendingPointerInputFilterKt {

    @NotNull
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(EmptyList.INSTANCE);

    @NotNull
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function is deprecated. Use 'SuspendingPointerInputModifierNode' with thePointerInputEventHandler instead.", replaceWith = @ReplaceWith(expression = "SuspendingPointerInputModifierNode { pointerInputEventHandler }", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode"}))
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(InterfaceC6473e interfaceC6473e) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, interfaceC6473e);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = PointerInputModifierNoParamError)
    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull InterfaceC6473e interfaceC6473e) {
        throw new IllegalStateException(PointerInputModifierNoParamError);
    }

    @NotNull
    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(@NotNull PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable Object obj, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @Nullable Object obj, @Nullable Object obj2, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    @NotNull
    public static final Modifier pointerInput(@NotNull Modifier modifier, @NotNull Object[] objArr, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3, null));
    }
}
