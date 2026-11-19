package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8812w0;

@RequiresApi(34)
/* loaded from: classes.dex */
final class EditorInfoApi34 {
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC8809v.m14774q(AbstractC1840p.m889a(), AbstractC1891t.m897a(), AbstractC1842q.m891a(), AbstractC1844r.m893a(), AbstractC1893u.m899a(), AbstractC1895v.m901a(), AbstractC1897w.m903a()));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC8812w0.m14791i(AbstractC1840p.m889a(), AbstractC1891t.m897a(), AbstractC1842q.m891a(), AbstractC1844r.m893a()));
    }
}
