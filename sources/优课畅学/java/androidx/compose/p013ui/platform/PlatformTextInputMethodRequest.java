package androidx.compose.p013ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes2.dex */
public interface PlatformTextInputMethodRequest {
    InputConnection createInputConnection(EditorInfo editorInfo);
}
