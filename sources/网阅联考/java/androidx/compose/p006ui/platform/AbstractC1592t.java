package androidx.compose.p006ui.platform;

import androidx.compose.p006ui.text.AnnotatedString;

/* renamed from: androidx.compose.ui.platform.t */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1592t {
    /* renamed from: a */
    public static boolean m809a(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        if (text != null) {
            return text.length() > 0;
        }
        return false;
    }
}
