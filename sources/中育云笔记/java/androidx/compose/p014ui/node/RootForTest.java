package androidx.compose.p014ui.node;

import android.view.KeyEvent;
import androidx.compose.p014ui.semantics.SemanticsOwner;
import androidx.compose.p014ui.text.input.TextInputService;
import androidx.compose.p014ui.unit.Density;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public interface RootForTest {
    @InterfaceC10770a
    static /* synthetic */ void getTextInputService$annotations() {
    }

    default void forceAccessibilityForTesting(boolean z10) {
    }

    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    TextInputService getTextInputService();

    default void measureAndLayoutForTest() {
    }

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo32572sendKeyEventZmokQxo(KeyEvent keyEvent);

    default void setAccessibilityEventBatchIntervalMillis(long j10) {
    }
}
