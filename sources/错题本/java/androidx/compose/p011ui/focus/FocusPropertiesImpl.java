package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0018\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001b\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\"\u0010\u001e\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\"\u0010!\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\"\u0010$\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R3\u0010+\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'¢\u0006\u0002\b*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R3\u00101\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'¢\u0006\u0002\b*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100¨\u00064"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "canFocus", "Z", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "Landroidx/compose/ui/focus/FocusRequester;", "next", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", "up", "getUp", "setUp", "down", "getDown", "setDown", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "start", "getStart", "setStart", "end", "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "onEnter", "Lr6/c;", "getOnEnter", "()Lr6/c;", "setOnEnter", "(Lr6/c;)V", "onExit", "getOnExit", "setOnExit", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;

    @NotNull
    private FocusRequester down;

    @NotNull
    private FocusRequester end;

    @NotNull
    private FocusRequester left;

    @NotNull
    private FocusRequester next;

    @NotNull
    private InterfaceC6471c onEnter;

    @NotNull
    private InterfaceC6471c onExit;

    @NotNull
    private FocusRequester previous;

    @NotNull
    private FocusRequester right;

    @NotNull
    private FocusRequester start;

    @NotNull
    private FocusRequester up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.onEnter = new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C5443s.f8405a;
            }
        };
        this.onExit = new InterfaceC6471c() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C5443s.f8405a;
            }
        };
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public InterfaceC6471c getOnEnter() {
        return this.onEnter;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public InterfaceC6471c getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    @NotNull
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setCanFocus(boolean z8) {
        this.canFocus = z8;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setDown(@NotNull FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setEnd(@NotNull FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setLeft(@NotNull FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setNext(@NotNull FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setOnEnter(@NotNull InterfaceC6471c interfaceC6471c) {
        this.onEnter = interfaceC6471c;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setOnExit(@NotNull InterfaceC6471c interfaceC6471c) {
        this.onExit = interfaceC6471c;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setPrevious(@NotNull FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setRight(@NotNull FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setStart(@NotNull FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.p011ui.focus.FocusProperties
    public void setUp(@NotNull FocusRequester focusRequester) {
        this.up = focusRequester;
    }
}
