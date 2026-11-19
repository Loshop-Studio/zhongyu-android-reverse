package coil3.compose;

import androidx.compose.p009ui.layout.ContentScale;
import coil3.compose.AsyncImagePainter;
import p015b0.InterfaceC4398d;
import p187y.AbstractC7876i;
import p187y.InterfaceC7877j;

/* renamed from: coil3.compose.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4557b {

    /* renamed from: a */
    public static final a f1575a = new a();

    /* renamed from: coil3.compose.b$a */
    public static final class a implements InterfaceC4398d {
    }

    /* renamed from: a */
    public static final CrossfadePainter m1772a(AsyncImagePainter.InterfaceC4553c interfaceC4553c, AsyncImagePainter.InterfaceC4553c interfaceC4553c2, ContentScale contentScale) {
        InterfaceC7877j interfaceC7877jM1758b;
        if (!(interfaceC4553c2 instanceof AsyncImagePainter.InterfaceC4553c.d)) {
            if (interfaceC4553c2 instanceof AsyncImagePainter.InterfaceC4553c.b) {
                interfaceC7877jM1758b = ((AsyncImagePainter.InterfaceC4553c.b) interfaceC4553c2).m1758b();
            }
            return null;
        }
        interfaceC7877jM1758b = ((AsyncImagePainter.InterfaceC4553c.d) interfaceC4553c2).m1759b();
        AbstractC7876i.m9656o(interfaceC7877jM1758b.mo9568a()).mo1404a(f1575a, interfaceC7877jM1758b);
        return null;
    }
}
