package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i10, int i11, InterfaceC10570l interfaceC10570l) {
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        try {
            interfaceC10570l.invoke(canvasBeginRecording);
            return picture;
        } finally {
            AbstractC9131s.m16125b(1);
            picture.endRecording();
            AbstractC9131s.m16124a(1);
        }
    }
}
