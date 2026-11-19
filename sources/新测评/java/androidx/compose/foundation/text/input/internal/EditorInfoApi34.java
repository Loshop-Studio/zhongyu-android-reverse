package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

@RequiresApi(34)
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "()V", "setHandwritingGestures", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class EditorInfoApi34 {
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.listOf((Object[]) new Class[]{AbstractC1811p.m1116a(), AbstractC1862t.m1124a(), AbstractC1813q.m1118a(), AbstractC1815r.m1120a(), AbstractC1864u.m1126a(), AbstractC1866v.m1128a(), AbstractC1868w.m1130a()}));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.setOf((Object[]) new Class[]{AbstractC1811p.m1116a(), AbstractC1862t.m1124a(), AbstractC1813q.m1118a(), AbstractC1815r.m1120a()}));
    }
}
