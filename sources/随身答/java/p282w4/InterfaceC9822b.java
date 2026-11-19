package p282w4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p006a5.InterfaceC0039c;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9477e;
import p243s5.InterfaceC9478f;
import p272v4.C9763b;
import p312z4.C9998a;

/* renamed from: w4.b */
/* loaded from: classes4.dex */
public interface InterfaceC9822b {

    /* renamed from: w4.b$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m16708a(InterfaceC9822b interfaceC9822b, InterfaceC8055c interfaceC8055c, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeGraph");
            }
            if ((i9 & 4) != 0) {
                rectF = null;
            }
            if ((i9 & 8) != 0) {
                str = null;
            }
            if ((i9 & 16) != 0) {
                paint = null;
            }
            if ((i9 & 32) != 0) {
                list = null;
            }
            if ((i9 & 64) != 0) {
                matrix = null;
            }
            if ((i9 & 128) != 0) {
                str2 = null;
            }
            interfaceC9822b.mo16689h(interfaceC8055c, graphEnum, rectF, str, paint, list, matrix, str2);
        }
    }

    /* renamed from: a */
    InterfaceC0039c mo16682a();

    /* renamed from: b */
    void mo16683b(EzyMatrix.Matrix matrix, EzyMatrix.Matrix matrix2, List list);

    /* renamed from: c */
    void mo16684c(List list, List list2);

    /* renamed from: d */
    InterfaceC9477e mo16685d();

    /* renamed from: e */
    InterfaceC9478f mo16686e();

    /* renamed from: f */
    AbstractC8053a mo16687f(EzyGraphEnum.GraphEnum graphEnum, List list, EzyPaint.Paint paint, String str, String str2);

    /* renamed from: g */
    void mo16688g(List list, EzyPaint.Paint paint);

    /* renamed from: h */
    void mo16689h(InterfaceC8055c interfaceC8055c, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2);

    /* renamed from: i */
    C9998a mo16690i();

    /* renamed from: j */
    Function1 mo16691j();

    /* renamed from: k */
    C9763b mo16692k();

    /* renamed from: l */
    void mo16693l();

    /* renamed from: m */
    InterfaceC8055c mo16694m(String str);

    /* renamed from: n */
    void mo16695n(List list, long j9);

    /* renamed from: o */
    InterfaceC9476d mo16696o();

    /* renamed from: p */
    void mo16697p(float f10, float f11, float f12, float f13, Paint paint, String str, Function1 function1);

    /* renamed from: q */
    InterfaceC8891e mo16698q();

    /* renamed from: r */
    void mo16699r(float f10, float f11, float f12, float f13, int i9, List list, Paint paint, Function1 function1);
}
