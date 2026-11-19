package p098g4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5122e;
import p035c5.InterfaceC5123f;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;

/* renamed from: g4.b */
/* loaded from: classes4.dex */
public interface InterfaceC7522b {

    /* renamed from: g4.b$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m12262a(InterfaceC7522b interfaceC7522b, InterfaceC8888c interfaceC8888c, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeGraph");
            }
            if ((i10 & 4) != 0) {
                rectF = null;
            }
            if ((i10 & 8) != 0) {
                str = null;
            }
            if ((i10 & 16) != 0) {
                paint = null;
            }
            if ((i10 & 32) != 0) {
                list = null;
            }
            if ((i10 & 64) != 0) {
                matrix = null;
            }
            if ((i10 & 128) != 0) {
                str2 = null;
            }
            interfaceC7522b.mo12244i(interfaceC8888c, graphEnum, rectF, str, paint, list, matrix, str2);
        }
    }

    /* renamed from: a */
    InterfaceC7880c mo12236a();

    /* renamed from: b */
    void mo12237b(EzyMatrix.Matrix matrix, EzyMatrix.Matrix matrix2, List list);

    /* renamed from: c */
    void mo12238c(List list, List list2);

    /* renamed from: d */
    InterfaceC5122e mo12239d();

    /* renamed from: e */
    InterfaceC5123f mo12240e();

    /* renamed from: f */
    AbstractC8886a mo12241f(EzyGraphEnum.GraphEnum graphEnum, List list, EzyPaint.Paint paint, String str, String str2);

    /* renamed from: g */
    void mo12242g(List list, EzyPaint.Paint paint);

    /* renamed from: h */
    C7792a mo12243h();

    /* renamed from: i */
    void mo12244i(InterfaceC8888c interfaceC8888c, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2);

    /* renamed from: j */
    Function1 mo12245j();

    /* renamed from: k */
    BoardConfig mo12246k();

    /* renamed from: l */
    void mo12247l();

    /* renamed from: m */
    InterfaceC8888c mo12248m(String str);

    /* renamed from: n */
    void mo12249n(List list, long j10);

    /* renamed from: o */
    InterfaceC5121d mo12250o();

    /* renamed from: p */
    void mo12251p(float f10, float f11, float f12, float f13, Paint paint, String str, Function1 function1);

    /* renamed from: q */
    InterfaceC9668d mo12252q();

    /* renamed from: r */
    void mo12253r(float f10, float f11, float f12, float f13, int i10, List list, Paint paint, Function1 function1);
}
