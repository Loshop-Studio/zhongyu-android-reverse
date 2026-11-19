package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.DegreesKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9131s;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m24867clipPathKD09W0M(DrawScope drawScope, Path path, int i10, InterfaceC10570l interfaceC10570l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24750clipPathmtrdDE(path, i10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m24868clipPathKD09W0M$default(DrawScope drawScope, Path path, int i10, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24750clipPathmtrdDE(path, i10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m24869clipRectrOu3jXo(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, InterfaceC10570l interfaceC10570l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24751clipRectN_I0leg(f10, f11, f12, f13, i10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m24870clipRectrOu3jXo$default(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() >> 32));
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() & 4294967295L));
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = ClipOp.Companion.m24265getIntersectrtfAjoo();
        }
        int i12 = i10;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24751clipRectN_I0leg(f14, f15, f16, f17, i12);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    @InterfaceC8721a
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m24871drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, InterfaceC10570l interfaceC10570l) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo24748getSizeNHjbRc = drawScope.getDrawContext().mo24748getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo24749setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m24872drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, GraphicsLayer graphicsLayer, InterfaceC10570l interfaceC10570l) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo24748getSizeNHjbRc = drawScope.getDrawContext().mo24748getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo24749setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m24873drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, GraphicsLayer graphicsLayer, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long jMo24748getSizeNHjbRc = drawScope.getDrawContext().mo24748getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo24749setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            AbstractC9131s.m16124a(1);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, InterfaceC10570l interfaceC10570l) {
        interfaceC10570l.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f10, float f11, float f12, float f13, InterfaceC10570l interfaceC10570l) {
        drawScope.getDrawContext().getTransform().inset(f10, f11, f12, f13);
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawScope.getDrawContext().getTransform().inset(-f10, -f11, -f12, -f13);
            AbstractC9131s.m16124a(1);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f10, float f11, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            float f12 = -f10;
            float f13 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m24874rotateRg1IO4c(DrawScope drawScope, float f10, long j10, InterfaceC10570l interfaceC10570l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24754rotateUv8p0NA(f10, j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m24875rotateRg1IO4c$default(DrawScope drawScope, float f10, long j10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo24826getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24754rotateUv8p0NA(f10, j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m24876rotateRadRg1IO4c(DrawScope drawScope, float f10, long j10, InterfaceC10570l interfaceC10570l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24754rotateUv8p0NA(DegreesKt.degrees(f10), j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m24877rotateRadRg1IO4c$default(DrawScope drawScope, float f10, long j10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo24826getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24754rotateUv8p0NA(DegreesKt.degrees(f10), j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m24878scaleFgt4K4Q(DrawScope drawScope, float f10, float f11, long j10, InterfaceC10570l interfaceC10570l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24755scale0AR0LA0(f10, f11, j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m24879scaleFgt4K4Q$default(DrawScope drawScope, float f10, float f11, long j10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = drawScope.mo24826getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24755scale0AR0LA0(f10, f11, j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m24880scaleRg1IO4c(DrawScope drawScope, float f10, long j10, InterfaceC10570l interfaceC10570l) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24755scale0AR0LA0(f10, f10, j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m24881scaleRg1IO4c$default(DrawScope drawScope, float f10, long j10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo24826getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24755scale0AR0LA0(f10, f10, j10);
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    public static final void translate(DrawScope drawScope, float f10, float f11, InterfaceC10570l interfaceC10570l) {
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawScope.getDrawContext().getTransform().translate(-f10, -f11);
            AbstractC9131s.m16124a(1);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f10, float f11, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawScope.getDrawContext().getTransform().translate(-f10, -f11);
            AbstractC9131s.m16124a(1);
        }
    }

    public static final void withTransform(DrawScope drawScope, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            interfaceC10570l.invoke(drawContext.getTransform());
            interfaceC10570l2.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            drawContext.getCanvas().restore();
            drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            AbstractC9131s.m16124a(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f10, InterfaceC10570l interfaceC10570l) {
        drawScope.getDrawContext().getTransform().inset(f10, f10, f10, f10);
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            float f11 = -f10;
            drawScope.getDrawContext().getTransform().inset(f11, f11, f11, f11);
            AbstractC9131s.m16124a(1);
        }
    }

    public static final void inset(DrawScope drawScope, float f10, float f11, InterfaceC10570l interfaceC10570l) {
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        try {
            interfaceC10570l.invoke(drawScope);
        } finally {
            AbstractC9131s.m16125b(1);
            float f12 = -f10;
            float f13 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
            AbstractC9131s.m16124a(1);
        }
    }
}
