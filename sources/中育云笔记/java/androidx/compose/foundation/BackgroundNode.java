package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.OutlineKt;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.ObserverModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNodeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    private float alpha;
    private Brush brush;
    private long color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private long lastSize;
    private Shape shape;
    private Outline tmpOutline;

    public /* synthetic */ BackgroundNode(long j10, Brush brush, float f10, Shape shape, AbstractC9972n abstractC9972n) {
        this(j10, brush, f10, shape);
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2;
        Outline outline = getOutline(contentDrawScope);
        if (Color.m30879equalsimpl0(this.color, Color.Companion.m30914getUnspecified0d7_KjU())) {
            contentDrawScope2 = contentDrawScope;
        } else {
            contentDrawScope2 = contentDrawScope;
            OutlineKt.m31137drawOutlinewDX37Ww$default(contentDrawScope2, outline, this.color, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m31135drawOutlinehn5TExg$default(contentDrawScope2, outline, brush, this.alpha, null, null, 0, 56, null);
        }
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m30879equalsimpl0(this.color, Color.Companion.m30914getUnspecified0d7_KjU())) {
            DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, Opcodes.IAND, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m31422drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final Outline getOutline(final ContentDrawScope contentDrawScope) {
        Outline outline;
        if (Size.m30702equalsimpl0(contentDrawScope.mo31429getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && AbstractC9979u.m20289b(this.lastShape, this.shape)) {
            outline = this.lastOutline;
            AbstractC9979u.m20291d(outline);
        } else {
            ObserverModifierNodeKt.observeReads(this, new InterfaceC9529a() { // from class: androidx.compose.foundation.BackgroundNode.getOutline.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m26953invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26953invoke() {
                    BackgroundNode backgroundNode = BackgroundNode.this;
                    backgroundNode.tmpOutline = backgroundNode.getShape().mo27009createOutlinePq9zytI(contentDrawScope.mo31429getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
                }
            });
            outline = this.tmpOutline;
            this.tmpOutline = null;
        }
        this.lastOutline = outline;
        this.lastSize = contentDrawScope.mo31429getSizeNHjbRc();
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
        AbstractC9979u.m20291d(outline);
        return outline;
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m26951getColor0d7_KjU() {
        return this.color;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.p014ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.lastSize = Size.Companion.m30714getUnspecifiedNHjbRc();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public final void setBrush(Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m26952setColor8_81llA(long j10) {
        this.color = j10;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    private BackgroundNode(long j10, Brush brush, float f10, Shape shape) {
        this.color = j10;
        this.brush = brush;
        this.alpha = f10;
        this.shape = shape;
        this.lastSize = Size.Companion.m30714getUnspecifiedNHjbRc();
    }
}
