package coil3.compose.internal;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.FilterQuality;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.node.DrawModifierNodeKt;
import androidx.compose.p011ui.node.LayoutModifierNodeKt;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.InterfaceC3308n;
import coil3.compose.AsyncImagePainter;
import coil3.compose.C3246c;
import coil3.compose.C3247d;
import coil3.compose.C3253j;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;
import p154s.C6532f;
import p162t.InterfaceC6577g;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m5110d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil3/compose/internal/ContentPainterNode;", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class ContentPainterElement extends ModifierNodeElement<ContentPainterNode> {

    /* renamed from: a */
    public final C6532f f1864a;

    /* renamed from: b */
    public final InterfaceC3308n f1865b;

    /* renamed from: c */
    public final C3246c f1866c;

    /* renamed from: d */
    public final InterfaceC6471c f1867d;

    /* renamed from: e */
    public final InterfaceC6471c f1868e;

    /* renamed from: f */
    public final int f1869f;

    /* renamed from: g */
    public final Alignment f1870g;

    /* renamed from: h */
    public final ContentScale f1871h;

    /* renamed from: i */
    public final float f1872i = 1.0f;

    /* renamed from: j */
    public final boolean f1873j = true;

    /* renamed from: k */
    public final C3253j f1874k;

    public ContentPainterElement(C6532f c6532f, InterfaceC3308n interfaceC3308n, C3246c c3246c, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Alignment alignment, ContentScale contentScale, C3253j c3253j) {
        this.f1864a = c6532f;
        this.f1865b = interfaceC3308n;
        this.f1866c = c3246c;
        this.f1867d = interfaceC6471c;
        this.f1868e = interfaceC6471c2;
        this.f1869f = i;
        this.f1870g = alignment;
        this.f1871h = contentScale;
        this.f1874k = c3253j;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    /* renamed from: create */
    public final Modifier.Node getNode() {
        C3246c c3246c = this.f1866c;
        InterfaceC3308n interfaceC3308n = this.f1865b;
        C6532f c6532f = this.f1864a;
        C3247d c3247d = new C3247d(interfaceC3308n, c6532f, c3246c);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(c3247d);
        asyncImagePainter.f1826h = this.f1867d;
        asyncImagePainter.f1827i = this.f1868e;
        asyncImagePainter.f1828j = this.f1871h;
        asyncImagePainter.f1829k = this.f1869f;
        asyncImagePainter.f1830l = this.f1874k;
        asyncImagePainter.m2179d(c3247d);
        InterfaceC6577g interfaceC6577g = c6532f.f10875o;
        return new ContentPainterNode(asyncImagePainter, this.f1870g, this.f1871h, this.f1872i, this.f1873j, interfaceC6577g instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) interfaceC6577g : null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return AbstractC5830k.m5325b(this.f1864a, contentPainterElement.f1864a) && AbstractC5830k.m5325b(this.f1865b, contentPainterElement.f1865b) && AbstractC5830k.m5325b(this.f1866c, contentPainterElement.f1866c) && AbstractC5830k.m5325b(this.f1867d, contentPainterElement.f1867d) && AbstractC5830k.m5325b(this.f1868e, contentPainterElement.f1868e) && FilterQuality.m10776equalsimpl0(this.f1869f, contentPainterElement.f1869f) && AbstractC5830k.m5325b(this.f1870g, contentPainterElement.f1870g) && AbstractC5830k.m5325b(this.f1871h, contentPainterElement.f1871h) && Float.compare(this.f1872i, contentPainterElement.f1872i) == 0 && this.f1873j == contentPainterElement.f1873j && AbstractC5830k.m5325b(this.f1874k, contentPainterElement.f1874k);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = (this.f1867d.hashCode() + ((this.f1866c.hashCode() + ((this.f1865b.hashCode() + (this.f1864a.hashCode() * 31)) * 31)) * 31)) * 31;
        InterfaceC6471c interfaceC6471c = this.f1868e;
        int iM908i = AbstractC0584a.m908i(this.f1873j, AbstractC0584a.m901b(this.f1872i, (this.f1871h.hashCode() + ((this.f1870g.hashCode() + ((FilterQuality.m10777hashCodeimpl(this.f1869f) + ((iHashCode + (interfaceC6471c == null ? 0 : interfaceC6471c.hashCode())) * 31)) * 31)) * 31)) * 31, 961), 31);
        C3253j c3253j = this.f1874k;
        return (iM908i + (c3253j != null ? c3253j.hashCode() : 0)) * 31;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("request", this.f1864a);
        inspectorInfo.getProperties().set("imageLoader", this.f1865b);
        inspectorInfo.getProperties().set("modelEqualityDelegate", this.f1866c);
        inspectorInfo.getProperties().set("transform", this.f1867d);
        inspectorInfo.getProperties().set("onState", this.f1868e);
        inspectorInfo.getProperties().set("filterQuality", FilterQuality.m10773boximpl(this.f1869f));
        inspectorInfo.getProperties().set("alignment", this.f1870g);
        inspectorInfo.getProperties().set("contentScale", this.f1871h);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f1872i));
        inspectorInfo.getProperties().set("colorFilter", null);
        AbstractC0584a.m910k(this.f1873j, inspectorInfo.getProperties(), "clipToBounds", inspectorInfo).set("previewHandler", this.f1874k);
        inspectorInfo.getProperties().set("contentDescription", null);
    }

    public final String toString() {
        return "ContentPainterElement(request=" + this.f1864a + ", imageLoader=" + this.f1865b + ", modelEqualityDelegate=" + this.f1866c + ", transform=" + this.f1867d + ", onState=" + this.f1868e + ", filterQuality=" + FilterQuality.m10778toStringimpl(this.f1869f) + ", alignment=" + this.f1870g + ", contentScale=" + this.f1871h + ", alpha=" + this.f1872i + ", colorFilter=null, clipToBounds=" + this.f1873j + ", previewHandler=" + this.f1874k + ", contentDescription=null)";
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ContentPainterNode contentPainterNode = (ContentPainterNode) node;
        long intrinsicSize = contentPainterNode.f1875f.getIntrinsicSize();
        ConstraintsSizeResolver constraintsSizeResolver = contentPainterNode.f1863e;
        C3246c c3246c = this.f1866c;
        InterfaceC3308n interfaceC3308n = this.f1865b;
        C6532f c6532f = this.f1864a;
        C3247d c3247d = new C3247d(interfaceC3308n, c6532f, c3246c);
        AsyncImagePainter asyncImagePainter = contentPainterNode.f1875f;
        asyncImagePainter.f1826h = this.f1867d;
        asyncImagePainter.f1827i = this.f1868e;
        ContentScale contentScale = this.f1871h;
        asyncImagePainter.f1828j = contentScale;
        asyncImagePainter.f1829k = this.f1869f;
        asyncImagePainter.f1830l = this.f1874k;
        asyncImagePainter.m2179d(c3247d);
        boolean zM10506equalsimpl0 = Size.m10506equalsimpl0(intrinsicSize, asyncImagePainter.getIntrinsicSize());
        contentPainterNode.f1859a = this.f1870g;
        InterfaceC6577g interfaceC6577g = c6532f.f10875o;
        contentPainterNode.f1863e = interfaceC6577g instanceof ConstraintsSizeResolver ? (ConstraintsSizeResolver) interfaceC6577g : null;
        contentPainterNode.f1860b = contentScale;
        contentPainterNode.f1861c = this.f1872i;
        contentPainterNode.f1862d = this.f1873j;
        boolean zM5325b = AbstractC5830k.m5325b(constraintsSizeResolver, contentPainterNode.f1863e);
        if (!zM10506equalsimpl0 || !zM5325b) {
            LayoutModifierNodeKt.invalidateMeasurement(contentPainterNode);
        }
        DrawModifierNodeKt.invalidateDraw(contentPainterNode);
    }
}
