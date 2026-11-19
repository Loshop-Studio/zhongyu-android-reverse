package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10983y0;

@RequiresApi(34)
/* loaded from: classes.dex */
final class EditorInfoApi34 {
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC10978w.m24139q(AbstractC1870p.m966a(), AbstractC1921t.m974a(), AbstractC1872q.m968a(), AbstractC1874r.m970a(), AbstractC1923u.m976a(), AbstractC1925v.m978a(), AbstractC1927w.m980a()));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC10983y0.m24164j(AbstractC1870p.m966a(), AbstractC1921t.m974a(), AbstractC1872q.m968a(), AbstractC1874r.m970a()));
    }
}
