package androidx.compose.p013ui.graphics;

import android.graphics.Canvas;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class CanvasHolder {
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }

    public final void drawInto(Canvas canvas, InterfaceC10570l interfaceC10570l) {
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        interfaceC10570l.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }
}
