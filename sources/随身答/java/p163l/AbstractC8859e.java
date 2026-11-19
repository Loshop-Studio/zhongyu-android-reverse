package p163l;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.p012ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p012ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.painter.BitmapPainterKt;
import androidx.compose.p012ui.graphics.painter.Painter;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import p151k.AbstractC8243n;
import p151k.C8230a;
import p151k.C8237h;
import p151k.InterfaceC8239j;

/* renamed from: l.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8859e {
    /* renamed from: a */
    public static final Painter m13712a(InterfaceC8239j interfaceC8239j, Context context, int i9) {
        return interfaceC8239j instanceof C8230a ? BitmapPainterKt.m22083BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((C8230a) interfaceC8239j).m13266b()), 0L, 0L, i9, 6, null) : interfaceC8239j instanceof C8237h ? new DrawablePainter(AbstractC8243n.m13268a(interfaceC8239j, context.getResources()).mutate()) : new ImagePainter(interfaceC8239j);
    }

    /* renamed from: b */
    public static /* synthetic */ Painter m13713b(InterfaceC8239j interfaceC8239j, Context context, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = DrawScope.INSTANCE.m21963getDefaultFilterQualityfv9h1I();
        }
        return m13712a(interfaceC8239j, context, i9);
    }

    /* renamed from: c */
    public static final Canvas m13714c(androidx.compose.p012ui.graphics.Canvas canvas) {
        return AndroidCanvas_androidKt.getNativeCanvas(canvas);
    }
}
