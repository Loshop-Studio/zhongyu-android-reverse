package coil3.compose;

import android.content.Context;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.painter.BitmapPainterKt;
import androidx.compose.p011ui.graphics.painter.Painter;
import coil3.AbstractC3330o;
import coil3.C3241a;
import coil3.C3294e;
import coil3.InterfaceC3305k;
import com.google.accompanist.drawablepainter.DrawablePainter;

/* renamed from: coil3.compose.l */
/* loaded from: classes2.dex */
public abstract class AbstractC3255l {
    /* renamed from: a */
    public static final Painter m2188a(InterfaceC3305k interfaceC3305k, Context context, int i) {
        return interfaceC3305k instanceof C3241a ? BitmapPainterKt.m11356BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((C3241a) interfaceC3305k).f1813a), 0L, 0L, i, 6, null) : interfaceC3305k instanceof C3294e ? new DrawablePainter(AbstractC3330o.m2264b(interfaceC3305k, context.getResources()).mutate()) : new ImagePainter(interfaceC3305k);
    }
}
