package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.AbstractC0246h;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "Ld6/s;", "setHandwritingGestures", "(Landroid/view/inputmethod/EditorInfo;)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class EditorInfoApi34 {

    @NotNull
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(@NotNull EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC5806u.m5287z(AbstractC0246h.m504m(), AbstractC0246h.m488A(), AbstractC0246h.m513v(), AbstractC0246h.m516y(), AbstractC0246h.m489B(), AbstractC0246h.m490C(), AbstractC0246h.m491D()));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC5802q.m5207h0(new Class[]{AbstractC0246h.m504m(), AbstractC0246h.m488A(), AbstractC0246h.m513v(), AbstractC0246h.m516y()}));
    }
}
