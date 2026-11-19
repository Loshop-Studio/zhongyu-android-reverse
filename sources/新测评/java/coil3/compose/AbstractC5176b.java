package coil3.compose;

import androidx.compose.p013ui.layout.ContentScale;
import coil3.compose.AsyncImagePainter;
import p019b0.InterfaceC4941d;
import p290y.AbstractC9888g;
import p290y.InterfaceC9889h;

/* renamed from: coil3.compose.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5176b {

    /* renamed from: a */
    public static final a f2891a = new a();

    /* renamed from: coil3.compose.b$a */
    public static final class a implements InterfaceC4941d {
    }

    /* renamed from: a */
    public static final CrossfadePainter m2944a(AsyncImagePainter.InterfaceC5172c interfaceC5172c, AsyncImagePainter.InterfaceC5172c interfaceC5172c2, ContentScale contentScale) {
        InterfaceC9889h interfaceC9889hM2926d;
        if (!(interfaceC5172c2 instanceof AsyncImagePainter.InterfaceC5172c.d)) {
            if (interfaceC5172c2 instanceof AsyncImagePainter.InterfaceC5172c.b) {
                interfaceC9889hM2926d = ((AsyncImagePainter.InterfaceC5172c.b) interfaceC5172c2).m2926d();
            }
            return null;
        }
        interfaceC9889hM2926d = ((AsyncImagePainter.InterfaceC5172c.d) interfaceC5172c2).m2928b();
        AbstractC9888g.m16697k(interfaceC9889hM2926d.mo16611a()).mo2327a(f2891a, interfaceC9889hM2926d);
        return null;
    }
}
