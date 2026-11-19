package coil3.compose.internal;

import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.FilterQuality;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.node.DrawModifierNodeKt;
import androidx.compose.p012ui.node.LayoutModifierNodeKt;
import androidx.compose.p012ui.node.ModifierNodeElement;
import androidx.compose.p012ui.node.SemanticsModifierNodeKt;
import androidx.compose.p012ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.InterfaceC5328e;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p163l.InterfaceC8856b;
import p297y.C9924e;
import p307z.InterfaceC9977g;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\f*\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, m13413d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/ContentPainterNode;", "Ly/e;", "request", "Lcoil3/e;", "imageLoader", "Ll/b;", "modelEqualityDelegate", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$c;", "transform", "", "onState", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "clipToBounds", "Lcoil3/compose/AsyncImagePreviewHandler;", "previewHandler", "", "contentDescription", "<init>", "(Ly/e;Lcoil3/e;Ll/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLcoil3/compose/AsyncImagePreviewHandler;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()Lcoil3/compose/internal/ContentPainterNode;", "node", "b", "(Lcoil3/compose/internal/ContentPainterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ly/e;", "Lcoil3/e;", "c", "Ll/b;", "d", "Lkotlin/jvm/functions/Function1;", "e", "f", "I", "g", "Landroidx/compose/ui/Alignment;", "h", "Landroidx/compose/ui/layout/ContentScale;", "i", "F", "j", "Landroidx/compose/ui/graphics/ColorFilter;", "k", "Z", "l", "Lcoil3/compose/AsyncImagePreviewHandler;", "m", "Ljava/lang/String;", "coil-compose-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ContentPainterElement extends ModifierNodeElement<ContentPainterNode> {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final C9924e request;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final InterfaceC5328e imageLoader;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final InterfaceC8856b modelEqualityDelegate;

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

    public /* synthetic */ ContentPainterElement(C9924e c9924e, InterfaceC5328e interfaceC5328e, InterfaceC8856b interfaceC8856b, Function1 function1, Function1 function12, int i9, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, boolean z9, AsyncImagePreviewHandler asyncImagePreviewHandler, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(c9924e, interfaceC5328e, interfaceC8856b, function1, function12, i9, alignment, contentScale, f10, colorFilter, z9, asyncImagePreviewHandler, str);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentPainterNode getNode() {
        AsyncImagePainter.C5306b c5306b = new AsyncImagePainter.C5306b(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(c5306b);
        asyncImagePainter.m2643v(this.transform);
        asyncImagePainter.m2639q(this.onState);
        asyncImagePainter.m2636n(this.contentScale);
        asyncImagePainter.m2638p(this.filterQuality);
        asyncImagePainter.m2640s(this.previewHandler);
        asyncImagePainter.m2644w(c5306b);
        InterfaceC9977g interfaceC9977gM17040x = this.request.m17040x();
        return new ContentPainterNode(asyncImagePainter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription, interfaceC9977gM17040x instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) interfaceC9977gM17040x : null);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void update(ContentPainterNode node) {
        long intrinsicSize = node.getPainter().getIntrinsicSize();
        ConstraintsSizeResolver constraintSizeResolver = node.getConstraintSizeResolver();
        AsyncImagePainter.C5306b c5306b = new AsyncImagePainter.C5306b(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter painter = node.getPainter();
        painter.m2643v(this.transform);
        painter.m2639q(this.onState);
        painter.m2636n(this.contentScale);
        painter.m2638p(this.filterQuality);
        painter.m2640s(this.previewHandler);
        painter.m2644w(c5306b);
        boolean zM21233equalsimpl0 = Size.m21233equalsimpl0(intrinsicSize, painter.getIntrinsicSize());
        node.setAlignment(this.alignment);
        InterfaceC9977g interfaceC9977gM17040x = this.request.m17040x();
        node.m2679f(interfaceC9977gM17040x instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) interfaceC9977gM17040x : null);
        node.setContentScale(this.contentScale);
        node.setAlpha(this.alpha);
        node.setColorFilter(this.colorFilter);
        node.m2678e(this.clipToBounds);
        if (!Intrinsics.areEqual(node.getContentDescription(), this.contentDescription)) {
            node.m2680g(this.contentDescription);
            SemanticsModifierNodeKt.invalidateSemantics(node);
        }
        boolean zAreEqual = Intrinsics.areEqual(constraintSizeResolver, node.getConstraintSizeResolver());
        if (!zM21233equalsimpl0 || !zAreEqual) {
            LayoutModifierNodeKt.invalidateMeasurement(node);
        }
        DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) other;
        return Intrinsics.areEqual(this.request, contentPainterElement.request) && Intrinsics.areEqual(this.imageLoader, contentPainterElement.imageLoader) && Intrinsics.areEqual(this.modelEqualityDelegate, contentPainterElement.modelEqualityDelegate) && Intrinsics.areEqual(this.transform, contentPainterElement.transform) && Intrinsics.areEqual(this.onState, contentPainterElement.onState) && FilterQuality.m21503equalsimpl0(this.filterQuality, contentPainterElement.filterQuality) && Intrinsics.areEqual(this.alignment, contentPainterElement.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterElement.contentScale) && Float.compare(this.alpha, contentPainterElement.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, contentPainterElement.colorFilter) && this.clipToBounds == contentPainterElement.clipToBounds && Intrinsics.areEqual(this.previewHandler, contentPainterElement.previewHandler) && Intrinsics.areEqual(this.contentDescription, contentPainterElement.contentDescription);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((this.request.hashCode() * 31) + this.imageLoader.hashCode()) * 31) + this.modelEqualityDelegate.hashCode()) * 31) + this.transform.hashCode()) * 31;
        Function1 function1 = this.onState;
        int iHashCode2 = (((((((((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + FilterQuality.m21504hashCodeimpl(this.filterQuality)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        int iHashCode3 = (((iHashCode2 + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31) + Boolean.hashCode(this.clipToBounds)) * 31;
        AsyncImagePreviewHandler asyncImagePreviewHandler = this.previewHandler;
        int iHashCode4 = (iHashCode3 + (asyncImagePreviewHandler == null ? 0 : asyncImagePreviewHandler.hashCode())) * 31;
        String str = this.contentDescription;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("request", this.request);
        inspectorInfo.getProperties().set("imageLoader", this.imageLoader);
        inspectorInfo.getProperties().set("modelEqualityDelegate", this.modelEqualityDelegate);
        inspectorInfo.getProperties().set("transform", this.transform);
        inspectorInfo.getProperties().set("onState", this.onState);
        inspectorInfo.getProperties().set("filterQuality", FilterQuality.m21500boximpl(this.filterQuality));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
        inspectorInfo.getProperties().set("clipToBounds", Boolean.valueOf(this.clipToBounds));
        inspectorInfo.getProperties().set("previewHandler", this.previewHandler);
        inspectorInfo.getProperties().set("contentDescription", this.contentDescription);
    }

    public String toString() {
        return "ContentPainterElement(request=" + this.request + ", imageLoader=" + this.imageLoader + ", modelEqualityDelegate=" + this.modelEqualityDelegate + ", transform=" + this.transform + ", onState=" + this.onState + ", filterQuality=" + FilterQuality.m21505toStringimpl(this.filterQuality) + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", clipToBounds=" + this.clipToBounds + ", previewHandler=" + this.previewHandler + ", contentDescription=" + this.contentDescription + ")";
    }

    public ContentPainterElement(C9924e c9924e, InterfaceC5328e interfaceC5328e, InterfaceC8856b interfaceC8856b, Function1 function1, Function1 function12, int i9, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, boolean z9, AsyncImagePreviewHandler asyncImagePreviewHandler, String str) {
        this.request = c9924e;
        this.imageLoader = interfaceC5328e;
        this.modelEqualityDelegate = interfaceC8856b;
        this.transform = function1;
        this.onState = function12;
        this.filterQuality = i9;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
        this.clipToBounds = z9;
        this.previewHandler = asyncImagePreviewHandler;
        this.contentDescription = str;
    }
}
