package androidx.compose.foundation;

import androidx.compose.p013ui.draw.CacheDrawModifierNode;
import androidx.compose.p013ui.draw.CacheDrawScope;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.draw.DrawResult;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f10, Brush brush, Shape shape, AbstractC9126n abstractC9126n) {
        this(f10, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.p013ui.draw.DrawResult drawGenericBorder(androidx.compose.p013ui.draw.CacheDrawScope r43, final androidx.compose.p013ui.graphics.Brush r44, final androidx.compose.ui.graphics.Outline.Generic r45, boolean r46, float r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m20367drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j10, final long j11, final boolean z10, final float f10) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM24085getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m24085getTopLeftCornerRadiuskKHJgLs();
            final float f11 = f10 / 2;
            final Stroke stroke = new Stroke(f10, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new InterfaceC10570l() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ContentDrawScope) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    if (z10) {
                        DrawScope.m24822drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM24085getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM24085getTopLeftCornerRadiuskKHJgLs >> 32));
                    float f12 = f11;
                    if (fIntBitsToFloat >= f12) {
                        DrawScope.m24822drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j10, j11, BorderKt.m20365shrinkKibmq7A(jM24085getTopLeftCornerRadiuskKHJgLs, f12), 0.0f, stroke, null, 0, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, null);
                        return;
                    }
                    float f13 = f10;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() >> 32)) - f10;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() & 4294967295L)) - f10;
                    int iM24264getDifferencertfAjoo = ClipOp.Companion.m24264getDifferencertfAjoo();
                    Brush brush2 = brush;
                    long j12 = jM24085getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo24751clipRectN_I0leg(f13, f13, fIntBitsToFloat2, fIntBitsToFloat3, iM24264getDifferencertfAjoo);
                        DrawScope.m24822drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j12, 0.0f, null, null, 0, 246, null);
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        AbstractC9133u.m16130d(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f10, z10);
        return cacheDrawScope.onDrawWithContent(new InterfaceC10570l() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m24816drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m20368getWidthD9Ej5fM() {
        return this.width;
    }

    public final void setBrush(Brush brush) {
        if (AbstractC9133u.m16128b(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(Shape shape) {
        if (AbstractC9133u.m16128b(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m20369setWidth0680j_4(float f10) {
        if (C3156Dp.m26904equalsimpl0(this.width, f10)) {
            return;
        }
        this.width = f10;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f10, Brush brush, Shape shape) {
        this.width = f10;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo20497toPx0680j_4(this.this$0.m20368getWidthD9Ej5fM()) < 0.0f || Size.m24103getMinDimensionimpl(cacheDrawScope.m23889getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f11 = 2;
                float fMin = Math.min(C3156Dp.m26904equalsimpl0(this.this$0.m20368getWidthD9Ej5fM(), C3156Dp.Companion.m26917getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo20497toPx0680j_4(this.this$0.m20368getWidthD9Ej5fM())), (float) Math.ceil(Size.m24103getMinDimensionimpl(cacheDrawScope.m23889getSizeNHjbRc()) / f11));
                float f12 = fMin / f11;
                long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
                long jM24095constructorimpl = Size.m24095constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m23889getSizeNHjbRc() >> 32)) - fMin) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m23889getSizeNHjbRc() & 4294967295L)) - fMin)));
                boolean z10 = f11 * fMin > Size.m24103getMinDimensionimpl(cacheDrawScope.m23889getSizeNHjbRc());
                Outline outlineMo20407createOutlinePq9zytI = this.this$0.getShape().mo20407createOutlinePq9zytI(cacheDrawScope.m23889getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo20407createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo20407createOutlinePq9zytI, z10, fMin);
                }
                if (outlineMo20407createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m20367drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo20407createOutlinePq9zytI, jM24027constructorimpl, jM24095constructorimpl, z10, fMin);
                }
                if (outlineMo20407createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m20364drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jM24027constructorimpl, jM24095constructorimpl, z10, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }
}
