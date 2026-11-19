package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.ExperimentalComposeUiApi;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

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
    default InterfaceC10570l getEnter() {
        return new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m23941invoke3ESFkO8(((FocusDirection) obj).m23915unboximpl());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m23941invoke3ESFkO8(int i10) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    @ExperimentalComposeUiApi
    default InterfaceC10570l getExit() {
        return new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m23942invoke3ESFkO8(((FocusDirection) obj).m23915unboximpl());
            }

            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m23942invoke3ESFkO8(int i10) {
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

    default InterfaceC10570l getOnEnter() {
        return new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusProperties$onEnter$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C8736p.f16368a;
            }
        };
    }

    default InterfaceC10570l getOnExit() {
        return new InterfaceC10570l() { // from class: androidx.compose.ui.focus.FocusProperties$onExit$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return C8736p.f16368a;
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

    @InterfaceC8721a
    @ExperimentalComposeUiApi
    default void setEnter(InterfaceC10570l interfaceC10570l) {
        setOnEnter(FocusPropertiesKt.toUsingEnterExitScope(interfaceC10570l));
    }

    @InterfaceC8721a
    @ExperimentalComposeUiApi
    default void setExit(InterfaceC10570l interfaceC10570l) {
        setOnExit(FocusPropertiesKt.toUsingEnterExitScope(interfaceC10570l));
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

    default void setOnEnter(InterfaceC10570l interfaceC10570l) {
    }

    default void setOnExit(InterfaceC10570l interfaceC10570l) {
    }
}
