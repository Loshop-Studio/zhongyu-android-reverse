package androidx.compose.foundation;

import androidx.compose.p014ui.draw.CacheDrawModifierNode;
import androidx.compose.p014ui.draw.CacheDrawScope;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.draw.DrawResult;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.Stroke;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f10, Brush brush, Shape shape, AbstractC9972n abstractC9972n) {
        this(f10, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.p014ui.draw.DrawResult drawGenericBorder(androidx.compose.p014ui.draw.CacheDrawScope r43, final androidx.compose.p014ui.graphics.Brush r44, final androidx.compose.ui.graphics.Outline.Generic r45, boolean r46, float r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m26969drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j10, final long j11, final boolean z10, final float f10) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM30687getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m30687getTopLeftCornerRadiuskKHJgLs();
            final float f11 = f10 / 2;
            final Stroke stroke = new Stroke(f10, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ContentDrawScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    if (z10) {
                        DrawScope.m31424drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM30687getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM30687getTopLeftCornerRadiuskKHJgLs >> 32));
                    float f12 = f11;
                    if (fIntBitsToFloat >= f12) {
                        DrawScope.m31424drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j10, j11, BorderKt.m26967shrinkKibmq7A(jM30687getTopLeftCornerRadiuskKHJgLs, f12), 0.0f, stroke, null, 0, 208, null);
                        return;
                    }
                    float f13 = f10;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() >> 32)) - f10;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() & 4294967295L)) - f10;
                    int iM30866getDifferencertfAjoo = ClipOp.Companion.m30866getDifferencertfAjoo();
                    Brush brush2 = brush;
                    long j12 = jM30687getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo31353clipRectN_I0leg(f13, f13, fIntBitsToFloat2, fIntBitsToFloat3, iM30866getDifferencertfAjoo);
                        DrawScope.m31424drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j12, 0.0f, null, null, 0, 246, null);
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        AbstractC9979u.m20291d(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f10, z10);
        return cacheDrawScope.onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m31418drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
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
    public final float m26970getWidthD9Ej5fM() {
        return this.width;
    }

    public final void setBrush(Brush brush) {
        if (AbstractC9979u.m20289b(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(Shape shape) {
        if (AbstractC9979u.m20289b(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m26971setWidth0680j_4(float f10) {
        if (C3186Dp.m33506equalsimpl0(this.width, f10)) {
            return;
        }
        this.width = f10;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f10, Brush brush, Shape shape) {
        this.width = f10;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo27099toPx0680j_4(this.this$0.m26970getWidthD9Ej5fM()) < 0.0f || Size.m30705getMinDimensionimpl(cacheDrawScope.m30491getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f11 = 2;
                float fMin = Math.min(C3186Dp.m33506equalsimpl0(this.this$0.m26970getWidthD9Ej5fM(), C3186Dp.Companion.m33519getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo27099toPx0680j_4(this.this$0.m26970getWidthD9Ej5fM())), (float) Math.ceil(Size.m30705getMinDimensionimpl(cacheDrawScope.m30491getSizeNHjbRc()) / f11));
                float f12 = fMin / f11;
                long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
                long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m30491getSizeNHjbRc() >> 32)) - fMin) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m30491getSizeNHjbRc() & 4294967295L)) - fMin)));
                boolean z10 = f11 * fMin > Size.m30705getMinDimensionimpl(cacheDrawScope.m30491getSizeNHjbRc());
                Outline outlineMo27009createOutlinePq9zytI = this.this$0.getShape().mo27009createOutlinePq9zytI(cacheDrawScope.m30491getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo27009createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo27009createOutlinePq9zytI, z10, fMin);
                }
                if (outlineMo27009createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m26969drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo27009createOutlinePq9zytI, jM30629constructorimpl, jM30697constructorimpl, z10, fMin);
                }
                if (outlineMo27009createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m26966drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jM30629constructorimpl, jM30697constructorimpl, z10, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }
}
