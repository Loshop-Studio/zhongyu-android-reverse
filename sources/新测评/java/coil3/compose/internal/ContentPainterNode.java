package coil3.compose.internal;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.runtime.internal.StabilityInferred;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m13558d2 = {"Lcoil3/compose/internal/ContentPainterNode;", "Lcoil3/compose/internal/AbstractContentPainterNode;", "Lcoil3/compose/AsyncImagePainter;", "painter", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Lcoil3/compose/ConstraintsSizeResolver;", "constraintSizeResolver", "<init>", "(Lcoil3/compose/AsyncImagePainter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLjava/lang/String;Lcoil3/compose/ConstraintsSizeResolver;)V", "", "onAttach", "()V", "onDetach", "onReset", "h", "Lcoil3/compose/AsyncImagePainter;", "()Lcoil3/compose/AsyncImagePainter;", "coil-compose-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class ContentPainterNode extends AbstractContentPainterNode {

    /* renamed from: h, reason: from kotlin metadata */
    public final AsyncImagePainter painter;

    public ContentPainterNode(AsyncImagePainter asyncImagePainter, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, boolean z9, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        super(alignment, contentScale, f10, colorFilter, z9, str, constraintsSizeResolver);
        this.painter = asyncImagePainter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    /* renamed from: h, reason: from getter */
    public AsyncImagePainter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        getPainter().m2914u(getCoroutineScope());
        getPainter().onRemembered();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        getPainter().onForgotten();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        getPainter().m2916w(null);
    }
}
