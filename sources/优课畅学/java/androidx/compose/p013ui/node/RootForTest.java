package androidx.compose.p013ui.node;

import android.view.KeyEvent;
import androidx.compose.p013ui.semantics.SemanticsOwner;
import androidx.compose.p013ui.text.input.TextInputService;
import androidx.compose.p013ui.unit.Density;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public interface RootForTest {
    @InterfaceC8721a
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
    boolean mo25970sendKeyEventZmokQxo(KeyEvent keyEvent);

    default void setAccessibilityEventBatchIntervalMillis(long j10) {
    }
}
