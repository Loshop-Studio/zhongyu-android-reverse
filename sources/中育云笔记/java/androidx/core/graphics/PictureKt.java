package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i10, int i11, InterfaceC9540l interfaceC9540l) {
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        try {
            interfaceC9540l.invoke(canvasBeginRecording);
            return picture;
        } finally {
            AbstractC9977s.m20286b(1);
            picture.endRecording();
            AbstractC9977s.m20285a(1);
        }
    }
}
