package androidx.compose.foundation;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.draw.CacheDrawModifierNode;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.RoundRectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u001c\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010,\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m5110d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/unit/Dp;", "widthParameter", "Landroidx/compose/ui/graphics/Brush;", "brushParameter", "Landroidx/compose/ui/graphics/Shape;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "brush", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "Landroidx/compose/ui/draw/DrawResult;", "drawGenericBorder", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/foundation/BorderCache;", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "width", "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,468:1\n56#2,6:469\n30#3:475\n80#4:476\n60#4:489\n70#4:493\n85#4:499\n90#4:501\n60#4:529\n70#4:532\n365#5,11:477\n376#5:491\n377#5,4:494\n381#5,2:502\n379#5,6:504\n387#5,3:511\n392#5,2:523\n394#5:556\n395#5,2:565\n57#6:488\n61#6:492\n57#6:528\n61#6:531\n22#7:490\n22#7:530\n54#8:498\n59#8:500\n1#9:510\n536#10,9:514\n545#10,8:557\n120#11,3:525\n167#11,6:533\n249#11,14:539\n124#11,3:553\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n240#1:469,6\n240#1:475\n240#1:476\n247#1:489\n247#1:493\n247#1:499\n247#1:501\n262#1:529\n262#1:532\n247#1:477,11\n247#1:491\n247#1:494,4\n247#1:502,2\n247#1:504,6\n247#1:511,3\n247#1:523,2\n247#1:556\n247#1:565,2\n247#1:488\n247#1:492\n262#1:528\n262#1:531\n247#1:490\n262#1:530\n247#1:498\n247#1:500\n247#1:510\n247#1:514,9\n247#1:557,8\n250#1:525,3\n262#1:533,6\n262#1:539,14\n250#1:553,3\n*E\n"})
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;

    @Nullable
    private BorderCache borderCache;

    @NotNull
    private Brush brush;

    @NotNull
    private final CacheDrawModifierNode drawWithCacheModifierNode;

    @NotNull
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, AbstractC5824e abstractC5824e) {
        this(f, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.p011ui.draw.DrawResult drawGenericBorder(androidx.compose.p011ui.draw.CacheDrawScope r43, final androidx.compose.p011ui.graphics.Brush r44, final androidx.compose.ui.graphics.Outline.Generic r45, boolean r46, float r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m6773drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j7, final long j8, final boolean z8, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM10491getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m10491getTopLeftCornerRadiuskKHJgLs();
            final float f7 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new InterfaceC6471c() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ContentDrawScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    if (z8) {
                        DrawScope.m11228drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM10491getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10491getTopLeftCornerRadiuskKHJgLs >> 32));
                    float f8 = f7;
                    if (fIntBitsToFloat >= f8) {
                        DrawScope.m11228drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j7, j8, BorderKt.m6771shrinkKibmq7A(jM10491getTopLeftCornerRadiuskKHJgLs, f8), 0.0f, stroke, null, 0, 208, null);
                        return;
                    }
                    float f9 = f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() >> 32)) - f;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() & 4294967295L)) - f;
                    int iM10670getDifferencertfAjoo = ClipOp.INSTANCE.m10670getDifferencertfAjoo();
                    Brush brush2 = brush;
                    long j9 = jM10491getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo11157clipRectN_I0leg(f9, f9, fIntBitsToFloat2, fIntBitsToFloat3, iM10670getDifferencertfAjoo);
                        DrawScope.m11228drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j9, 0.0f, null, null, 0, 246, null);
                    } finally {
                        AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        AbstractC5830k.m5327d(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z8);
        return cacheDrawScope.onDrawWithContent(new InterfaceC6471c() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m11222drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void setBrush(@NotNull Brush brush) {
        if (AbstractC5830k.m5325b(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(@NotNull Shape shape) {
        if (AbstractC5830k.m5325b(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m6775setWidth0680j_4(float f) {
        if (C2331Dp.m13310equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new InterfaceC6471c() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo6903toPx0680j_4(this.this$0.getWidth()) < 0.0f || Size.m10509getMinDimensionimpl(cacheDrawScope.m10295getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f7 = 2;
                float fMin = Math.min(C2331Dp.m13310equalsimpl0(this.this$0.getWidth(), C2331Dp.INSTANCE.m13323getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo6903toPx0680j_4(this.this$0.getWidth())), (float) Math.ceil(Size.m10509getMinDimensionimpl(cacheDrawScope.m10295getSizeNHjbRc()) / f7));
                float f8 = fMin / f7;
                long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
                long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m10295getSizeNHjbRc() >> 32)) - fMin) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m10295getSizeNHjbRc() & 4294967295L)) - fMin)));
                boolean z8 = f7 * fMin > Size.m10509getMinDimensionimpl(cacheDrawScope.m10295getSizeNHjbRc());
                Outline outlineMo6813createOutlinePq9zytI = this.this$0.getShape().mo6813createOutlinePq9zytI(cacheDrawScope.m10295getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo6813createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo6813createOutlinePq9zytI, z8, fMin);
                }
                if (outlineMo6813createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m6773drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo6813createOutlinePq9zytI, jM10433constructorimpl, jM10501constructorimpl, z8, fMin);
                }
                if (outlineMo6813createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m6770drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jM10433constructorimpl, jM10501constructorimpl, z8, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }
}
