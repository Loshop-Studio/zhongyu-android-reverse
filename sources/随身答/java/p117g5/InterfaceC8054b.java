package p117g5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import kotlin.jvm.functions.Function1;

/* renamed from: g5.b */
/* loaded from: classes4.dex */
public interface InterfaceC8054b {

    /* renamed from: g5.b$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m12807a(InterfaceC8054b interfaceC8054b, Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw");
            }
            if ((i9 & 4) != 0) {
                function1 = null;
            }
            Function1 function12 = function1;
            if ((i9 & 8) != 0) {
                z9 = true;
            }
            boolean z11 = z9;
            if ((i9 & 16) != 0) {
                z10 = false;
            }
            interfaceC8054b.mo7863p(canvas, matrix, function12, z11, z10);
        }
    }

    /* renamed from: l */
    void mo7861l(Canvas canvas, Matrix matrix);

    /* renamed from: p */
    void mo7863p(Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10);
}
