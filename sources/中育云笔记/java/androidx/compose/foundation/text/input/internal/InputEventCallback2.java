package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.p014ui.text.input.EditCommand;
import java.util.List;

/* loaded from: classes.dex */
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection recordingInputConnection);

    void onEditCommands(List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo28016onImeActionKlQnJC8(int i10);

    void onKeyEvent(KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15);
}
