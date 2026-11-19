package p377v9;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import java.util.List;
import p348t9.C11257d;

/* renamed from: v9.c */
/* loaded from: classes5.dex */
public interface InterfaceC11552c {

    /* renamed from: v9.c$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m25467a(InterfaceC11552c interfaceC11552c, Matrix matrix, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cameraChangeEnd");
            }
            if ((i10 & 1) != 0) {
                matrix = null;
            }
            interfaceC11552c.mo25418D(matrix);
        }

        /* renamed from: b */
        public static /* synthetic */ void m25468b(InterfaceC11552c interfaceC11552c, RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleEnd");
            }
            if ((i10 & 32) != 0) {
                pointF = null;
            }
            interfaceC11552c.mo25462v(rectF, matrix, rectF2, c11257d, list, pointF);
        }

        /* renamed from: c */
        public static /* synthetic */ void m25469c(InterfaceC11552c interfaceC11552c, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleStart");
            }
            interfaceC11552c.mo25448h(groupGraph, rectF, matrix, rectF2, c11257d, list, (i10 & 64) != 0 ? null : pointF);
        }

        /* renamed from: d */
        public static /* synthetic */ void m25470d(InterfaceC11552c interfaceC11552c, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandling");
            }
            interfaceC11552c.mo25422H(groupGraph, rectF, matrix, rectF2, c11257d, list, (i10 & 64) != 0 ? null : pointF);
        }
    }

    /* renamed from: A */
    void mo25415A(C5414d c5414d);

    /* renamed from: B */
    void mo25416B(Path path, Paint paint, Matrix matrix);

    /* renamed from: C */
    void mo25417C(String str, String str2, Paint paint, RectF rectF);

    /* renamed from: D */
    void mo25418D(Matrix matrix);

    /* renamed from: E */
    void mo25419E(InterfaceC5181c interfaceC5181c);

    /* renamed from: F */
    void mo25420F(float f10, float f11, float f12, float f13);

    /* renamed from: G */
    RectF mo25421G();

    /* renamed from: H */
    void mo25422H(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF);

    /* renamed from: I */
    boolean mo25423I();

    /* renamed from: a */
    void mo25441a(ImageGraph imageGraph);

    /* renamed from: b */
    String mo25442b();

    /* renamed from: c */
    boolean mo25443c();

    /* renamed from: d */
    void mo25444d(int i10);

    /* renamed from: e */
    void mo25445e();

    /* renamed from: f */
    void mo25446f(String str, InterfaceC5181c interfaceC5181c);

    /* renamed from: g */
    void mo25447g();

    /* renamed from: h */
    void mo25448h(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF);

    /* renamed from: i */
    void mo25449i(C5414d c5414d, RectF rectF, Matrix matrix);

    /* renamed from: j */
    void mo25450j(List list);

    /* renamed from: k */
    void mo25451k(List list, Matrix matrix);

    /* renamed from: l */
    void mo25452l(boolean z10);

    /* renamed from: m */
    void mo25453m(RectF rectF, List list);

    /* renamed from: n */
    InterfaceC5181c mo25454n();

    /* renamed from: o */
    void mo25455o();

    /* renamed from: p */
    void mo25456p(List list);

    /* renamed from: q */
    RectF mo25457q();

    /* renamed from: r */
    void mo25458r(Matrix matrix);

    /* renamed from: s */
    void mo25459s(BackgroundLineConfig backgroundLineConfig);

    /* renamed from: t */
    void mo25460t(RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF);

    /* renamed from: u */
    void mo25461u(C5414d c5414d, RectF rectF, Matrix matrix);

    /* renamed from: v */
    void mo25462v(RectF rectF, Matrix matrix, RectF rectF2, C11257d c11257d, List list, PointF pointF);

    /* renamed from: w */
    void mo25463w(String str, RectF rectF, Matrix matrix, String str2);

    /* renamed from: x */
    void mo25464x(List list);

    /* renamed from: y */
    void mo25465y(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z10);

    /* renamed from: z */
    void mo25466z(List list, Matrix matrix);
}
