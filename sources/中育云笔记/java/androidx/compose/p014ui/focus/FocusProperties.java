package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.ExperimentalComposeUiApi;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public interface FocusProperties {
    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @ExperimentalComposeUiApi
    default InterfaceC9540l getEnter() {
        return new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m30543invoke3ESFkO8(((FocusDirection) obj).m30517unboximpl());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m30543invoke3ESFkO8(int i10) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    @ExperimentalComposeUiApi
    default InterfaceC9540l getExit() {
        return new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m30544invoke3ESFkO8(((FocusDirection) obj).m30517unboximpl());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m30544invoke3ESFkO8(int i10) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    default InterfaceC9540l getOnEnter() {
        return new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusProperties$onEnter$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C10786q.f26013a;
            }
        };
    }

    default InterfaceC9540l getOnExit() {
        return new InterfaceC9540l() { // from class: androidx.compose.ui.focus.FocusProperties$onExit$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C10786q.f26013a;
            }
        };
    }

    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean z10);

    default void setDown(FocusRequester focusRequester) {
    }

    default void setEnd(FocusRequester focusRequester) {
    }

    @InterfaceC10770a
    @ExperimentalComposeUiApi
    default void setEnter(InterfaceC9540l interfaceC9540l) {
        setOnEnter(FocusPropertiesKt.toUsingEnterExitScope(interfaceC9540l));
    }

    @InterfaceC10770a
    @ExperimentalComposeUiApi
    default void setExit(InterfaceC9540l interfaceC9540l) {
        setOnExit(FocusPropertiesKt.toUsingEnterExitScope(interfaceC9540l));
    }

    default void setLeft(FocusRequester focusRequester) {
    }

    default void setNext(FocusRequester focusRequester) {
    }

    default void setPrevious(FocusRequester focusRequester) {
    }

    default void setRight(FocusRequester focusRequester) {
    }

    default void setStart(FocusRequester focusRequester) {
    }

    default void setUp(FocusRequester focusRequester) {
    }

    default void setOnEnter(InterfaceC9540l interfaceC9540l) {
    }

    default void setOnExit(InterfaceC9540l interfaceC9540l) {
    }
}
