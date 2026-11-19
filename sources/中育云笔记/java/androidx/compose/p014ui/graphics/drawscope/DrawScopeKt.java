package androidx.compose.p014ui.graphics.drawscope;

import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.DegreesKt;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m31469clipPathKD09W0M(DrawScope drawScope, Path path, int i10, InterfaceC9540l interfaceC9540l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31352clipPathmtrdDE(path, i10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m31470clipPathKD09W0M$default(DrawScope drawScope, Path path, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ClipOp.Companion.m30867getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31352clipPathmtrdDE(path, i10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m31471clipRectrOu3jXo(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, InterfaceC9540l interfaceC9540l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31353clipRectN_I0leg(f10, f11, f12, f13, i10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m31472clipRectrOu3jXo$default(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32));
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L));
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = ClipOp.Companion.m30867getIntersectrtfAjoo();
        }
        int i12 = i10;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31353clipRectN_I0leg(f14, f15, f16, f17, i12);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    @InterfaceC10770a
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m31473drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, InterfaceC9540l interfaceC9540l) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo31350getSizeNHjbRc = drawScope.getDrawContext().mo31350getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo31351setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m31474drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, GraphicsLayer graphicsLayer, InterfaceC9540l interfaceC9540l) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo31350getSizeNHjbRc = drawScope.getDrawContext().mo31350getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo31351setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m31475drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, GraphicsLayer graphicsLayer, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo31350getSizeNHjbRc = drawScope.getDrawContext().mo31350getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo31351setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, InterfaceC9540l interfaceC9540l) {
        interfaceC9540l.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f10, float f11, float f12, float f13, InterfaceC9540l interfaceC9540l) {
        drawScope.getDrawContext().getTransform().inset(f10, f11, f12, f13);
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawScope.getDrawContext().getTransform().inset(-f10, -f11, -f12, -f13);
            AbstractC9977s.m20285a(1);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f10, float f11, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            float f12 = -f10;
            float f13 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m31476rotateRg1IO4c(DrawScope drawScope, float f10, long j10, InterfaceC9540l interfaceC9540l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31356rotateUv8p0NA(f10, j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m31477rotateRg1IO4c$default(DrawScope drawScope, float f10, long j10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo31428getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31356rotateUv8p0NA(f10, j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m31478rotateRadRg1IO4c(DrawScope drawScope, float f10, long j10, InterfaceC9540l interfaceC9540l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31356rotateUv8p0NA(DegreesKt.degrees(f10), j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m31479rotateRadRg1IO4c$default(DrawScope drawScope, float f10, long j10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo31428getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31356rotateUv8p0NA(DegreesKt.degrees(f10), j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m31480scaleFgt4K4Q(DrawScope drawScope, float f10, float f11, long j10, InterfaceC9540l interfaceC9540l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31357scale0AR0LA0(f10, f11, j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m31481scaleFgt4K4Q$default(DrawScope drawScope, float f10, float f11, long j10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = drawScope.mo31428getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31357scale0AR0LA0(f10, f11, j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m31482scaleRg1IO4c(DrawScope drawScope, float f10, long j10, InterfaceC9540l interfaceC9540l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31357scale0AR0LA0(f10, f10, j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m31483scaleRg1IO4c$default(DrawScope drawScope, float f10, long j10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo31428getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31357scale0AR0LA0(f10, f10, j10);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final void translate(DrawScope drawScope, float f10, float f11, InterfaceC9540l interfaceC9540l) {
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawScope.getDrawContext().getTransform().translate(-f10, -f11);
            AbstractC9977s.m20285a(1);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f10, float f11, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawScope.getDrawContext().getTransform().translate(-f10, -f11);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final void withTransform(DrawScope drawScope, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            interfaceC9540l.invoke(drawContext.getTransform());
            interfaceC9540l2.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f10, InterfaceC9540l interfaceC9540l) {
        drawScope.getDrawContext().getTransform().inset(f10, f10, f10, f10);
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            float f11 = -f10;
            drawScope.getDrawContext().getTransform().inset(f11, f11, f11, f11);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f10, float f11, InterfaceC9540l interfaceC9540l) {
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        try {
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            float f12 = -f10;
            float f13 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
            AbstractC9977s.m20285a(1);
        }
    }
}
