package p096l;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.p009ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p009ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.graphics.painter.BitmapPainterKt;
import androidx.compose.p009ui.graphics.painter.Painter;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import p087k.AbstractC6616o;
import p087k.C6602a;
import p087k.C6609h;
import p087k.InterfaceC6611j;

/* renamed from: l.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7262d {
    /* renamed from: a */
    public static final Painter m8181a(InterfaceC6611j interfaceC6611j, Context context, int i6) {
        return interfaceC6611j instanceof C6602a ? BitmapPainterKt.m14573BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((C6602a) interfaceC6611j).m7566b()), 0L, 0L, i6, 6, null) : interfaceC6611j instanceof C6609h ? new DrawablePainter(AbstractC6616o.m7568a(interfaceC6611j, context.getResources()).mutate()) : new ImagePainter(interfaceC6611j);
    }

    /* renamed from: b */
    public static /* synthetic */ Painter m8182b(InterfaceC6611j interfaceC6611j, Context context, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = DrawScope.INSTANCE.m14453getDefaultFilterQualityfv9h1I();
        }
        return m8181a(interfaceC6611j, context, i6);
    }

    /* renamed from: c */
    public static final Canvas m8183c(androidx.compose.p009ui.graphics.Canvas canvas) {
        return AndroidCanvas_androidKt.getNativeCanvas(canvas);
    }
}
