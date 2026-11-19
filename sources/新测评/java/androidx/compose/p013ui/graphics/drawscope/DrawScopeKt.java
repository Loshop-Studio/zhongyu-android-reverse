package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.DegreesKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ab\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aP\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\\\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a!\u0010#\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u001a.\u0010$\u001a\u00020\u0001*\u00020\u00022\u0006\u0010$\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a:\u0010$\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aF\u0010$\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aB\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aB\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010,\u001aB\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u00100\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u0010,\u001aJ\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a:\u00106\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a?\u00107\u001a\u00020\u0001*\u00020\u00022\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, m13558d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "draw", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw-ymL40Pk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1008:1\n68#1,7:1009\n249#1,14:1016\n249#1,14:1030\n249#1,14:1044\n249#1,14:1058\n249#1,14:1072\n249#1,14:1092\n305#1,26:1106\n57#2:1086\n61#2:1089\n60#3:1087\n70#3:1090\n22#4:1088\n22#4:1091\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n108#1:1009,7\n138#1:1016,14\n153#1:1030,14\n172#1:1044,14\n185#1:1058,14\n209#1:1072,14\n225#1:1092,14\n275#1:1106,26\n205#1:1086\n206#1:1089\n205#1:1087\n206#1:1090\n205#1:1088\n206#1:1091\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m21567clipPathKD09W0M(DrawScope drawScope, Path path, int i10, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21450clipPathmtrdDE(path, i10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m21568clipPathKD09W0M$default(DrawScope drawScope, Path path, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m20965getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21450clipPathmtrdDE(path, i10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m21569clipRectrOu3jXo(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21451clipRectN_I0leg(f10, f11, f12, f13, i10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m21570clipRectrOu3jXo$default(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, Function1 function1, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = Float.intBitsToFloat((int) (drawScope.mo21527getSizeNHjbRc() >> 32));
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Float.intBitsToFloat((int) (drawScope.mo21527getSizeNHjbRc() & 4294967295L));
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = ClipOp.INSTANCE.m20965getIntersectrtfAjoo();
        }
        int i12 = i10;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21451clipRectN_I0leg(f14, f15, f16, f17, i12);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m21571drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, Function1<? super DrawScope, Unit> function1) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo21448getSizeNHjbRc = drawScope.getDrawContext().mo21448getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo21449setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m21572drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo21448getSizeNHjbRc = drawScope.getDrawContext().mo21448getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo21449setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m21573drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, GraphicsLayer graphicsLayer, Function1 function1, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo21448getSizeNHjbRc = drawScope.getDrawContext().mo21448getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo21449setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, Function1<? super Canvas, Unit> function1) {
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f10, float f11, float f12, float f13, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f10, f11, f12, f13);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawScope.getDrawContext().getTransform().inset(-f10, -f11, -f12, -f13);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            float f12 = -f10;
            float f13 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m21574rotateRg1IO4c(DrawScope drawScope, float f10, long j10, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21454rotateUv8p0NA(f10, j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m21575rotateRg1IO4c$default(DrawScope drawScope, float f10, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo21526getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21454rotateUv8p0NA(f10, j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m21576rotateRadRg1IO4c(DrawScope drawScope, float f10, long j10, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21454rotateUv8p0NA(DegreesKt.degrees(f10), j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m21577rotateRadRg1IO4c$default(DrawScope drawScope, float f10, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo21526getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21454rotateUv8p0NA(DegreesKt.degrees(f10), j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m21578scaleFgt4K4Q(DrawScope drawScope, float f10, float f11, long j10, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21455scale0AR0LA0(f10, f11, j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m21579scaleFgt4K4Q$default(DrawScope drawScope, float f10, float f11, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = drawScope.mo21526getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21455scale0AR0LA0(f10, f11, j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m21580scaleRg1IO4c(DrawScope drawScope, float f10, long j10, Function1<? super DrawScope, Unit> function1) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21455scale0AR0LA0(f10, f10, j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m21581scaleRg1IO4c$default(DrawScope drawScope, float f10, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo21526getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21455scale0AR0LA0(f10, f10, j10);
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void translate(DrawScope drawScope, float f10, float f11, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawScope.getDrawContext().getTransform().translate(-f10, -f11);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawScope.getDrawContext().getTransform().translate(-f10, -f11);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withTransform(DrawScope drawScope, Function1<? super DrawTransform, Unit> function1, Function1<? super DrawScope, Unit> function12) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            function1.invoke(drawContext.getTransform());
            function12.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f10, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f10, f10, f10, f10);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            float f11 = -f10;
            drawScope.getDrawContext().getTransform().inset(f11, f11, f11, f11);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f10, float f11, Function1<? super DrawScope, Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        try {
            function1.invoke(drawScope);
        } finally {
            InlineMarker.finallyStart(1);
            float f12 = -f10;
            float f13 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
            InlineMarker.finallyEnd(1);
        }
    }
}
