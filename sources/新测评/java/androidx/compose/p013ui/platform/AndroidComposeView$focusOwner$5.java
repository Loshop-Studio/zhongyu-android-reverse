package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$5 extends FunctionReferenceImpl implements Function0<Rect> {
    public AndroidComposeView$focusOwner$5(Object obj) {
        super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Rect invoke() {
        return ((AndroidComposeView) this.receiver).onFetchFocusRect();
    }
}
