package androidx.compose.p014ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection recordingInputConnection);

    void onEditCommands(List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo33164onImeActionKlQnJC8(int i10);

    void onKeyEvent(KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15);
}
