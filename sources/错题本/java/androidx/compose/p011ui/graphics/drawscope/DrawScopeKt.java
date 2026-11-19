package androidx.compose.p011ui.graphics.drawscope;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.DegreesKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\f\u001aA\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001aB\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aB\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001aJ\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aB\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0015\u001ab\u0010$\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020 2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aB\u0010)\u001a\u00020\u0007*\u00020\u00002\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010!\u001a\u00020 2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a(\u0010+\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b+\u0010,\u001aF\u00100\u001a\u00020\u0007*\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b0\u00101\u001aP\u0010;\u001a\u00020\u0007*\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020*2\u0006\u00108\u001a\u0002072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\\\u0010;\u001a\u00020\u0007*\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020*2\u0006\u00108\u001a\u0002072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m5110d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "left", "top", "right", "bottom", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "inset", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFLr6/c;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLr6/c;)V", "horizontal", "vertical", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLr6/c;)V", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLr6/c;)V", "rotate", "radians", "rotateRad-Rg1IO4c", "rotateRad", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLr6/c;)V", "scale", "scale-Rg1IO4c", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILr6/c;)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILr6/c;)V", "clipPath", "Landroidx/compose/ui/graphics/Canvas;", "drawIntoCanvas", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lr6/c;)V", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transformBlock", "drawBlock", "withTransform", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lr6/c;Lr6/c;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "canvas", "Landroidx/compose/ui/geometry/Size;", "size", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLr6/c;)V", "draw", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "draw-ymL40Pk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;Lr6/c;)V", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1008:1\n68#1,7:1009\n249#1,14:1016\n249#1,14:1030\n249#1,14:1044\n249#1,14:1058\n249#1,14:1072\n249#1,14:1092\n305#1,26:1106\n57#2:1086\n61#2:1089\n60#3:1087\n70#3:1090\n22#4:1088\n22#4:1091\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n108#1:1009,7\n138#1:1016,14\n153#1:1030,14\n172#1:1044,14\n185#1:1058,14\n209#1:1072,14\n225#1:1092,14\n275#1:1106,26\n205#1:1086\n206#1:1089\n205#1:1087\n206#1:1090\n205#1:1088\n206#1:1091\n*E\n"})
/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m11273clipPathKD09W0M(@NotNull DrawScope drawScope, @NotNull Path path, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11156clipPathmtrdDE(path, i);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m11274clipPathKD09W0M$default(DrawScope drawScope, Path path, int i, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11156clipPathmtrdDE(path, i);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m11275clipRectrOu3jXo(@NotNull DrawScope drawScope, float f, float f7, float f8, float f9, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11157clipRectN_I0leg(f, f7, f8, f9, i);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m11276clipRectrOu3jXo$default(DrawScope drawScope, float f, float f7, float f8, float f9, int i, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        float f10 = (i8 & 1) != 0 ? 0.0f : f;
        float f11 = (i8 & 2) != 0 ? 0.0f : f7;
        if ((i8 & 4) != 0) {
            f8 = Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() >> 32));
        }
        float f12 = f8;
        if ((i8 & 8) != 0) {
            f9 = Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() & 4294967295L));
        }
        float f13 = f9;
        if ((i8 & 16) != 0) {
            i = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        }
        int i9 = i;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11157clipRectN_I0leg(f10, f11, f12, f13, i9);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m11277drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j7, InterfaceC6471c interfaceC6471c) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo11154getSizeNHjbRc = drawScope.getDrawContext().mo11154getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo11155setSizeuvyYCjk(j7);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m11278drawymL40Pk(@NotNull DrawScope drawScope, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long j7, @Nullable GraphicsLayer graphicsLayer, @NotNull InterfaceC6471c interfaceC6471c) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo11154getSizeNHjbRc = drawScope.getDrawContext().mo11154getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo11155setSizeuvyYCjk(j7);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m11279drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j7, GraphicsLayer graphicsLayer, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo11154getSizeNHjbRc = drawScope.getDrawContext().mo11154getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo11155setSizeuvyYCjk(j7);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope, @NotNull InterfaceC6471c interfaceC6471c) {
        interfaceC6471c.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@NotNull DrawScope drawScope, float f, float f7, float f8, float f9, @NotNull InterfaceC6471c interfaceC6471c) {
        drawScope.getDrawContext().getTransform().inset(f, f7, f8, f9);
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(-f, -f7, -f8, -f9);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f, float f7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f, f7, f, f7);
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            float f8 = -f;
            float f9 = -f7;
            drawScope.getDrawContext().getTransform().inset(f8, f9, f8, f9);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m11280rotateRg1IO4c(@NotNull DrawScope drawScope, float f, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11160rotateUv8p0NA(f, j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m11281rotateRg1IO4c$default(DrawScope drawScope, float f, long j7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = drawScope.mo11232getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11160rotateUv8p0NA(f, j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m11282rotateRadRg1IO4c(@NotNull DrawScope drawScope, float f, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11160rotateUv8p0NA(DegreesKt.degrees(f), j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m11283rotateRadRg1IO4c$default(DrawScope drawScope, float f, long j7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = drawScope.mo11232getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11160rotateUv8p0NA(DegreesKt.degrees(f), j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m11284scaleFgt4K4Q(@NotNull DrawScope drawScope, float f, float f7, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11161scale0AR0LA0(f, f7, j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m11285scaleFgt4K4Q$default(DrawScope drawScope, float f, float f7, long j7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 4) != 0) {
            j7 = drawScope.mo11232getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11161scale0AR0LA0(f, f7, j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m11286scaleRg1IO4c(@NotNull DrawScope drawScope, float f, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11161scale0AR0LA0(f, f, j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m11287scaleRg1IO4c$default(DrawScope drawScope, float f, long j7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = drawScope.mo11232getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11161scale0AR0LA0(f, f, j7);
            interfaceC6471c.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    public static final void translate(@NotNull DrawScope drawScope, float f, float f7, @NotNull InterfaceC6471c interfaceC6471c) {
        drawScope.getDrawContext().getTransform().translate(f, f7);
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f7);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f, float f7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f, f7);
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f7);
        }
    }

    public static final void withTransform(@NotNull DrawScope drawScope, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            interfaceC6471c.invoke(drawContext.getTransform());
            interfaceC6471c2.invoke(drawScope);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    public static final void inset(@NotNull DrawScope drawScope, float f, @NotNull InterfaceC6471c interfaceC6471c) {
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            float f7 = -f;
            drawScope.getDrawContext().getTransform().inset(f7, f7, f7, f7);
        }
    }

    public static final void inset(@NotNull DrawScope drawScope, float f, float f7, @NotNull InterfaceC6471c interfaceC6471c) {
        drawScope.getDrawContext().getTransform().inset(f, f7, f, f7);
        try {
            interfaceC6471c.invoke(drawScope);
        } finally {
            float f8 = -f;
            float f9 = -f7;
            drawScope.getDrawContext().getTransform().inset(f8, f9, f8, f9);
        }
    }
}
