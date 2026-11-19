package coil3.compose.internal;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6009v;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcoil3/compose/internal/ContentPainterNode;", "Lcoil3/compose/internal/AbstractContentPainterNode;", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ContentPainterNode extends AbstractContentPainterNode {

    /* renamed from: f */
    public final AsyncImagePainter f1875f;

    public ContentPainterNode(AsyncImagePainter asyncImagePainter, Alignment alignment, ContentScale contentScale, float f, boolean z8, ConstraintsSizeResolver constraintsSizeResolver) {
        super(alignment, contentScale, f, z8, constraintsSizeResolver);
        this.f1875f = asyncImagePainter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public final Painter getPainter() {
        return this.f1875f;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        InterfaceC6009v coroutineScope = getCoroutineScope();
        AsyncImagePainter asyncImagePainter = this.f1875f;
        asyncImagePainter.f1825g = coroutineScope;
        asyncImagePainter.onRemembered();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.f1875f.onForgotten();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        this.f1875f.m2179d(null);
    }
}
