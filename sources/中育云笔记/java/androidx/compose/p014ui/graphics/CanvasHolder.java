package androidx.compose.p014ui.graphics;

import android.graphics.Canvas;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class CanvasHolder {
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }

    public final void drawInto(Canvas canvas, InterfaceC9540l interfaceC9540l) {
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        interfaceC9540l.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }
}
