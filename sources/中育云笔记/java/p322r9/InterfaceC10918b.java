package p322r9;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import ga.InterfaceC9284d;
import java.util.List;
import ma.InterfaceC10216d;
import ma.InterfaceC10217e;
import p181hd.InterfaceC9540l;
import p307q9.C10762b;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* renamed from: r9.b */
/* loaded from: classes5.dex */
public interface InterfaceC10918b {

    /* renamed from: r9.b$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m23785a(InterfaceC10918b interfaceC10918b, InterfaceC5181c interfaceC5181c, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2, int i10, Object obj) {
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
            interfaceC10918b.mo23768h(interfaceC5181c, graphEnum, rectF, str, paint, list, matrix, str2);
        }
    }

    /* renamed from: a */
    InterfaceC11552c mo23761a();

    /* renamed from: b */
    void mo23762b(EzyMatrix.Matrix matrix, EzyMatrix.Matrix matrix2, List list);

    /* renamed from: c */
    void mo23763c(List list, List list2);

    /* renamed from: d */
    InterfaceC10217e mo23764d();

    /* renamed from: e */
    AbstractC5179a mo23765e(EzyGraphEnum.GraphEnum graphEnum, List list, EzyPaint.Paint paint, String str, String str2);

    /* renamed from: f */
    void mo23766f(List list, EzyPaint.Paint paint);

    /* renamed from: g */
    C11373a mo23767g();

    /* renamed from: h */
    void mo23768h(InterfaceC5181c interfaceC5181c, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2);

    /* renamed from: i */
    InterfaceC9540l mo23769i();

    /* renamed from: j */
    C10762b mo23770j();

    /* renamed from: k */
    void mo23771k(float f10, float f11, float f12, float f13, Paint paint, String str, InterfaceC9540l interfaceC9540l);

    /* renamed from: l */
    void mo23772l();

    /* renamed from: m */
    void mo23773m(float f10, float f11, float f12, float f13, int i10, List list, Paint paint, InterfaceC9540l interfaceC9540l);

    /* renamed from: n */
    InterfaceC5181c mo23774n(String str);

    /* renamed from: o */
    void mo23775o(List list, long j10);

    /* renamed from: p */
    InterfaceC10216d mo23776p();

    /* renamed from: q */
    InterfaceC9284d mo23777q();
}
