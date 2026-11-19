package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.focus.FocusRequester;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;
    private FocusRequester down;
    private FocusRequester end;
    private FocusRequester left;
    private FocusRequester next;
    private InterfaceC9540l onEnter;
    private InterfaceC9540l onExit;
    private FocusRequester previous;
    private FocusRequester right;
    private FocusRequester start;

    /* renamed from: up */
    private FocusRequester f1144up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.f1144up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.onEnter = new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onEnter$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C10786q.f26013a;
            }
        };
        this.onExit = new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$onExit$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C10786q.f26013a;
            }
        };
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public InterfaceC9540l getOnEnter() {
        return this.onEnter;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public InterfaceC9540l getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public FocusRequester getUp() {
        return this.f1144up;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setCanFocus(boolean z10) {
        this.canFocus = z10;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setDown(FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setEnd(FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setLeft(FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setNext(FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setOnEnter(InterfaceC9540l interfaceC9540l) {
        this.onEnter = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setOnExit(InterfaceC9540l interfaceC9540l) {
        this.onExit = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setPrevious(FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setRight(FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setStart(FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.p014ui.focus.FocusProperties
    public void setUp(FocusRequester focusRequester) {
        this.f1144up = focusRequester;
    }
}
