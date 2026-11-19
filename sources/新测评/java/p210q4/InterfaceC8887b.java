package p210q4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import kotlin.jvm.functions.Function1;

/* renamed from: q4.b */
/* loaded from: classes4.dex */
public interface InterfaceC8887b {

    /* renamed from: q4.b$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m15006a(InterfaceC8887b interfaceC8887b, Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw");
            }
            if ((i10 & 4) != 0) {
                function1 = null;
            }
            Function1 function12 = function1;
            if ((i10 & 8) != 0) {
                z9 = true;
            }
            boolean z11 = z9;
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            interfaceC8887b.mo6751q(canvas, matrix, function12, z11, z10);
        }
    }

    /* renamed from: m */
    void mo6749m(Canvas canvas, Matrix matrix);

    /* renamed from: q */
    void mo6751q(Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10);
}
