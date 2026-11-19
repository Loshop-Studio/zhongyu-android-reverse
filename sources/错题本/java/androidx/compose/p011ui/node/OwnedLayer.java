package androidx.compose.p011ui.node;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\u001cJ\"\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\tH&¢\u0006\u0004\b&\u0010'JW\u0010.\u001a\u00020\u000428\u0010+\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,H&¢\u0006\u0004\b.\u0010/J\u001a\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000200H&ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00042\u0006\u00101\u001a\u000200H&ø\u0001\u0000¢\u0006\u0004\b5\u00103R\u001a\u00109\u001a\u0002008&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "Ld6/s;", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "resize", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "()V", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "(Lr6/e;Lr6/a;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(@NotNull Canvas canvas, @Nullable GraphicsLayer parentLayer);

    @NotNull
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo12365getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo12366inverseTransform58bKbWc(@NotNull float[] matrix);

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo12367isInLayerk4lQ0M(long position);

    void mapBounds(@NotNull MutableRect rect, boolean inverse);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo12368mapOffset8S9VItk(long point, boolean inverse);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo12369movegyyYBs(long position);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo12370resizeozmzZPI(long size);

    void reuseLayer(@NotNull InterfaceC6473e drawBlock, @NotNull InterfaceC6469a invalidateParentLayer);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo12371transform58bKbWc(@NotNull float[] matrix);

    void updateDisplayList();

    void updateLayerProperties(@NotNull ReusableGraphicsLayerScope scope);
}
