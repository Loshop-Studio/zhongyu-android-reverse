package coil3.compose;

import androidx.compose.p012ui.layout.ContentScale;
import coil3.compose.AsyncImagePainter;
import p079d0.InterfaceC7735d;
import p297y.AbstractC9928i;
import p297y.InterfaceC9929j;

/* renamed from: coil3.compose.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5311b {

    /* renamed from: a */
    public static final a f2822a = new a();

    /* renamed from: coil3.compose.b$a */
    public static final class a implements InterfaceC7735d {
    }

    /* renamed from: a */
    public static final CrossfadePainter m2672a(AsyncImagePainter.InterfaceC5307c interfaceC5307c, AsyncImagePainter.InterfaceC5307c interfaceC5307c2, ContentScale contentScale) {
        InterfaceC9929j interfaceC9929jM2654d;
        if (!(interfaceC5307c2 instanceof AsyncImagePainter.InterfaceC5307c.d)) {
            if (interfaceC5307c2 instanceof AsyncImagePainter.InterfaceC5307c.b) {
                interfaceC9929jM2654d = ((AsyncImagePainter.InterfaceC5307c.b) interfaceC5307c2).m2654d();
            }
            return null;
        }
        interfaceC9929jM2654d = ((AsyncImagePainter.InterfaceC5307c.d) interfaceC5307c2).m2656b();
        AbstractC9928i.m17102o(interfaceC9929jM2654d.mo17012a()).mo12080a(f2822a, interfaceC9929jM2654d);
        return null;
    }
}
