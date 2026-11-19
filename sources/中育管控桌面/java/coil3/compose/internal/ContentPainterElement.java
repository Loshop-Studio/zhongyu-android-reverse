package coil3.compose.internal;

import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.FilterQuality;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.node.DrawModifierNodeKt;
import androidx.compose.p009ui.node.LayoutModifierNodeKt;
import androidx.compose.p009ui.node.ModifierNodeElement;
import androidx.compose.p009ui.node.SemanticsModifierNodeKt;
import androidx.compose.p009ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import coil3.InterfaceC4574e;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p096l.InterfaceC7259a;
import p187y.C7872e;
import p194z.InterfaceC7925g;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0006\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, m7880d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/ContentPainterNode;", "a", "()Lcoil3/compose/internal/ContentPainterNode;", "node", "", "b", "(Lcoil3/compose/internal/ContentPainterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly/e;", "Ly/e;", "request", "Lcoil3/e;", "Lcoil3/e;", "imageLoader", "Ll/a;", "c", "Ll/a;", "modelEqualityDelegate", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$c;", "d", "Lkotlin/jvm/functions/Function1;", "transform", "e", "onState", "Landroidx/compose/ui/graphics/FilterQuality;", "f", "I", "filterQuality", "Landroidx/compose/ui/Alignment;", "g", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "h", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "i", "F", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "j", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "k", "Z", "clipToBounds", "Lcoil3/compose/AsyncImagePreviewHandler;", "l", "Lcoil3/compose/AsyncImagePreviewHandler;", "previewHandler", "m", "Ljava/lang/String;", "contentDescription", "coil-compose-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentPainterElement extends ModifierNodeElement<ContentPainterNode> {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final C7872e request;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final InterfaceC4574e imageLoader;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final InterfaceC7259a modelEqualityDelegate;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final Function1 transform;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final Function1 onState;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final int filterQuality;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    public final Alignment alignment;

    /* renamed from: h, reason: from kotlin metadata and from toString */
    public final ContentScale contentScale;

    /* renamed from: i, reason: from kotlin metadata and from toString */
    public final float alpha;

    /* renamed from: j, reason: from kotlin metadata and from toString */
    public final ColorFilter colorFilter;

    /* renamed from: k, reason: from kotlin metadata and from toString */
    public final boolean clipToBounds;

    /* renamed from: l, reason: from kotlin metadata and from toString */
    public final AsyncImagePreviewHandler previewHandler;

    /* renamed from: m, reason: from kotlin metadata and from toString */
    public final String contentDescription;

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentPainterNode getNode() {
        AsyncImagePainter.C4552b c4552b = new AsyncImagePainter.C4552b(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(c4552b);
        asyncImagePainter.m1749v(this.transform);
        asyncImagePainter.m1745q(this.onState);
        asyncImagePainter.m1742n(this.contentScale);
        asyncImagePainter.m1744p(this.filterQuality);
        asyncImagePainter.m1746s(this.previewHandler);
        asyncImagePainter.m1750w(c4552b);
        InterfaceC7925g interfaceC7925gM9595x = this.request.m9595x();
        return new ContentPainterNode(asyncImagePainter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription, interfaceC7925gM9595x instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) interfaceC7925gM9595x : null);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void update(ContentPainterNode node) {
        long intrinsicSize = node.getPainter().getIntrinsicSize();
        ConstraintsSizeResolver constraintSizeResolver = node.getConstraintSizeResolver();
        AsyncImagePainter.C4552b c4552b = new AsyncImagePainter.C4552b(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter painter = node.getPainter();
        painter.m1749v(this.transform);
        painter.m1745q(this.onState);
        painter.m1742n(this.contentScale);
        painter.m1744p(this.filterQuality);
        painter.m1746s(this.previewHandler);
        painter.m1750w(c4552b);
        boolean zM13723equalsimpl0 = Size.m13723equalsimpl0(intrinsicSize, painter.getIntrinsicSize());
        node.setAlignment(this.alignment);
        InterfaceC7925g interfaceC7925gM9595x = this.request.m9595x();
        node.m1779f(interfaceC7925gM9595x instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) interfaceC7925gM9595x : null);
        node.setContentScale(this.contentScale);
        node.setAlpha(this.alpha);
        node.setColorFilter(this.colorFilter);
        node.m1778e(this.clipToBounds);
        if (!Intrinsics.areEqual(node.getContentDescription(), this.contentDescription)) {
            node.m1780g(this.contentDescription);
            SemanticsModifierNodeKt.invalidateSemantics(node);
        }
        boolean zAreEqual = Intrinsics.areEqual(constraintSizeResolver, node.getConstraintSizeResolver());
        if (!zM13723equalsimpl0 || !zAreEqual) {
            LayoutModifierNodeKt.invalidateMeasurement(node);
        }
        DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) other;
        return Intrinsics.areEqual(this.request, contentPainterElement.request) && Intrinsics.areEqual(this.imageLoader, contentPainterElement.imageLoader) && Intrinsics.areEqual(this.modelEqualityDelegate, contentPainterElement.modelEqualityDelegate) && Intrinsics.areEqual(this.transform, contentPainterElement.transform) && Intrinsics.areEqual(this.onState, contentPainterElement.onState) && FilterQuality.m13993equalsimpl0(this.filterQuality, contentPainterElement.filterQuality) && Intrinsics.areEqual(this.alignment, contentPainterElement.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterElement.contentScale) && Float.compare(this.alpha, contentPainterElement.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, contentPainterElement.colorFilter) && this.clipToBounds == contentPainterElement.clipToBounds && Intrinsics.areEqual(this.previewHandler, contentPainterElement.previewHandler) && Intrinsics.areEqual(this.contentDescription, contentPainterElement.contentDescription);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((this.request.hashCode() * 31) + this.imageLoader.hashCode()) * 31) + this.modelEqualityDelegate.hashCode()) * 31) + this.transform.hashCode()) * 31;
        Function1 function1 = this.onState;
        int iHashCode2 = (((((((((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + FilterQuality.m13994hashCodeimpl(this.filterQuality)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        int iHashCode3 = (((iHashCode2 + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31) + Boolean.hashCode(this.clipToBounds)) * 31;
        AsyncImagePreviewHandler asyncImagePreviewHandler = this.previewHandler;
        int iHashCode4 = (iHashCode3 + (asyncImagePreviewHandler == null ? 0 : asyncImagePreviewHandler.hashCode())) * 31;
        String str = this.contentDescription;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.p009ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("request", this.request);
        inspectorInfo.getProperties().set("imageLoader", this.imageLoader);
        inspectorInfo.getProperties().set("modelEqualityDelegate", this.modelEqualityDelegate);
        inspectorInfo.getProperties().set("transform", this.transform);
        inspectorInfo.getProperties().set("onState", this.onState);
        inspectorInfo.getProperties().set("filterQuality", FilterQuality.m13990boximpl(this.filterQuality));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
        inspectorInfo.getProperties().set("clipToBounds", Boolean.valueOf(this.clipToBounds));
        inspectorInfo.getProperties().set("previewHandler", this.previewHandler);
        inspectorInfo.getProperties().set("contentDescription", this.contentDescription);
    }

    public String toString() {
        return "ContentPainterElement(request=" + this.request + ", imageLoader=" + this.imageLoader + ", modelEqualityDelegate=" + this.modelEqualityDelegate + ", transform=" + this.transform + ", onState=" + this.onState + ", filterQuality=" + FilterQuality.m13995toStringimpl(this.filterQuality) + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", clipToBounds=" + this.clipToBounds + ", previewHandler=" + this.previewHandler + ", contentDescription=" + this.contentDescription + ")";
    }
}
