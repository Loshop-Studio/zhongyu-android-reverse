package ba;

import android.graphics.Canvas;
import android.graphics.Matrix;
import p181hd.InterfaceC9540l;

/* renamed from: ba.b */
/* loaded from: classes5.dex */
public interface InterfaceC5180b {

    /* renamed from: ba.b$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m2732a(InterfaceC5180b interfaceC5180b, Canvas canvas, Matrix matrix, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw");
            }
            if ((i10 & 4) != 0) {
                interfaceC9540l = null;
            }
            InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = false;
            }
            interfaceC5180b.mo2724o(canvas, matrix, interfaceC9540l2, z12, z11);
        }
    }

    /* renamed from: m */
    void mo2731m(Canvas canvas, Matrix matrix);

    /* renamed from: o */
    void mo2724o(Canvas canvas, Matrix matrix, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11);
}
