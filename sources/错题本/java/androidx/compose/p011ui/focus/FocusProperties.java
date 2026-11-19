package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001RB\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tRB\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\"\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR$\u0010(\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR$\u0010+\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR$\u0010.\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR$\u00101\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bRF\u00107\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0002¢\u0006\u0002\b42\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0002¢\u0006\u0002\b48V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tRF\u0010:\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0002¢\u0006\u0002\b42\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0002¢\u0006\u0002\b48V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006;À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "Landroidx/compose/ui/focus/FocusRequester;", "value", "getEnter", "()Lr6/c;", "setEnter", "(Lr6/c;)V", "getEnter$annotations", "()V", "enter", "getExit", "setExit", "getExit$annotations", "exit", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "<anonymous parameter 0>", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "getPrevious", "setPrevious", "previous", "getUp", "setUp", "up", "getDown", "setDown", "down", "getLeft", "setLeft", "left", "getRight", "setRight", "right", "getStart", "setStart", "start", "getEnd", "setEnd", "end", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "getOnEnter", "setOnEnter", "onEnter", "getOnExit", "setOnExit", "onExit", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface FocusProperties {
    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    @NotNull
    default FocusRequester getDown() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getEnd() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @ExperimentalComposeUiApi
    @NotNull
    default InterfaceC6471c getEnter() {
        return new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m10347invoke3ESFkO8(((FocusDirection) obj).getValue());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m10347invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.getDefault();
            }
        };
    }

    @ExperimentalComposeUiApi
    @NotNull
    default InterfaceC6471c getExit() {
        return new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m10348invoke3ESFkO8(((FocusDirection) obj).getValue());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m10348invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.getDefault();
            }
        };
    }

    @NotNull
    default FocusRequester getLeft() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getNext() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default InterfaceC6471c getOnEnter() {
        return new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusProperties$onEnter$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C5443s.f8405a;
            }
        };
    }

    @NotNull
    default InterfaceC6471c getOnExit() {
        return new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusProperties$onExit$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C5443s.f8405a;
            }
        };
    }

    @NotNull
    default FocusRequester getPrevious() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getRight() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getStart() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getUp() {
        return FocusRequester.INSTANCE.getDefault();
    }

    void setCanFocus(boolean z8);

    default void setDown(@NotNull FocusRequester focusRequester) {
    }

    default void setEnd(@NotNull FocusRequester focusRequester) {
    }

    @Deprecated(message = "Use onEnter instead", replaceWith = @ReplaceWith(expression = "onEnter", imports = {}))
    @ExperimentalComposeUiApi
    default void setEnter(@NotNull InterfaceC6471c interfaceC6471c) {
        setOnEnter(FocusPropertiesKt.toUsingEnterExitScope(interfaceC6471c));
    }

    @Deprecated(message = "Use onExit instead", replaceWith = @ReplaceWith(expression = "onExit", imports = {}))
    @ExperimentalComposeUiApi
    default void setExit(@NotNull InterfaceC6471c interfaceC6471c) {
        setOnExit(FocusPropertiesKt.toUsingEnterExitScope(interfaceC6471c));
    }

    default void setLeft(@NotNull FocusRequester focusRequester) {
    }

    default void setNext(@NotNull FocusRequester focusRequester) {
    }

    default void setPrevious(@NotNull FocusRequester focusRequester) {
    }

    default void setRight(@NotNull FocusRequester focusRequester) {
    }

    default void setStart(@NotNull FocusRequester focusRequester) {
    }

    default void setUp(@NotNull FocusRequester focusRequester) {
    }

    default void setOnEnter(@NotNull InterfaceC6471c interfaceC6471c) {
    }

    default void setOnExit(@NotNull InterfaceC6471c interfaceC6471c) {
    }
}
