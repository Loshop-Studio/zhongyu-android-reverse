package p150l;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.painter.BitmapPainterKt;
import androidx.compose.p013ui.graphics.painter.Painter;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import p137k.AbstractC7843o;
import p137k.C7829a;
import p137k.C7836h;
import p137k.InterfaceC7838j;

/* renamed from: l.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8477e {
    /* renamed from: a */
    public static final Painter m13857a(InterfaceC7838j interfaceC7838j, Context context, int i10) {
        return interfaceC7838j instanceof C7829a ? BitmapPainterKt.m21650BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((C7829a) interfaceC7838j).m13297b()), 0L, 0L, i10, 6, null) : interfaceC7838j instanceof C7836h ? new DrawablePainter(AbstractC7843o.m13299a(interfaceC7838j, context.getResources()).mutate()) : new ImagePainter(interfaceC7838j);
    }

    /* renamed from: b */
    public static /* synthetic */ Painter m13858b(InterfaceC7838j interfaceC7838j, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I();
        }
        return m13857a(interfaceC7838j, context, i10);
    }

    /* renamed from: c */
    public static final Canvas m13859c(androidx.compose.p013ui.graphics.Canvas canvas) {
        return AndroidCanvas_androidKt.getNativeCanvas(canvas);
    }
}
