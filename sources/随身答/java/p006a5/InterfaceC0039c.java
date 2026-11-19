package p006a5;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import java.util.List;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p302y4.C9950c;
import p302y4.C9952e;

/* renamed from: a5.c */
/* loaded from: classes4.dex */
public interface InterfaceC0039c {

    /* renamed from: a5.c$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m224a(InterfaceC0039c interfaceC0039c, Matrix matrix, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cameraChangeEnd");
            }
            if ((i9 & 1) != 0) {
                matrix = null;
            }
            interfaceC0039c.mo177D(matrix);
        }

        /* renamed from: b */
        public static /* synthetic */ void m225b(InterfaceC0039c interfaceC0039c, RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleEnd");
            }
            interfaceC0039c.mo219v(rectF, matrix, rectF2, c9952e, c9950c, list, (i9 & 64) != 0 ? null : pointF);
        }

        /* renamed from: c */
        public static /* synthetic */ void m226c(InterfaceC0039c interfaceC0039c, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleStart");
            }
            interfaceC0039c.mo208k(groupGraph, rectF, matrix, rectF2, c9952e, c9950c, list, (i9 & 128) != 0 ? null : pointF);
        }

        /* renamed from: d */
        public static /* synthetic */ void m227d(InterfaceC0039c interfaceC0039c, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandling");
            }
            interfaceC0039c.mo174A(groupGraph, rectF, matrix, rectF2, c9952e, c9950c, list, (i9 & 128) != 0 ? null : pointF);
        }
    }

    /* renamed from: A */
    void mo174A(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF);

    /* renamed from: B */
    void mo175B(Path path, Paint paint, Matrix matrix);

    /* renamed from: C */
    void mo176C(String str, String str2, Paint paint, RectF rectF);

    /* renamed from: D */
    void mo177D(Matrix matrix);

    /* renamed from: E */
    void mo178E(C8101d c8101d);

    /* renamed from: F */
    void mo179F(float f10, float f11, float f12, float f13);

    /* renamed from: G */
    RectF mo180G();

    /* renamed from: H */
    boolean mo181H();

    /* renamed from: a */
    void mo198a(ImageGraph imageGraph);

    /* renamed from: b */
    String mo199b();

    /* renamed from: c */
    void mo200c(int i9);

    /* renamed from: d */
    void mo201d();

    /* renamed from: e */
    void mo202e();

    /* renamed from: f */
    void mo203f(List list);

    /* renamed from: g */
    void mo204g(C8101d c8101d, RectF rectF, Matrix matrix);

    int getBackgroundColor();

    /* renamed from: h */
    void mo205h(RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF);

    /* renamed from: i */
    void mo206i(List list, Matrix matrix);

    /* renamed from: j */
    void mo207j(boolean z9);

    /* renamed from: k */
    void mo208k(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF);

    /* renamed from: l */
    void mo209l(RectF rectF, List list);

    /* renamed from: m */
    InterfaceC8055c mo210m();

    /* renamed from: n */
    void mo211n();

    /* renamed from: o */
    void mo212o(List list);

    /* renamed from: p */
    RectF mo213p();

    /* renamed from: q */
    void mo214q(Matrix matrix);

    /* renamed from: r */
    void mo215r(BackgroundLineConfig backgroundLineConfig);

    /* renamed from: s */
    void mo216s(C8101d c8101d, RectF rectF, Matrix matrix);

    /* renamed from: t */
    void mo217t(String str, RectF rectF, Matrix matrix, String str2);

    /* renamed from: u */
    void mo218u(List list);

    /* renamed from: v */
    void mo219v(RectF rectF, Matrix matrix, RectF rectF2, C9952e c9952e, C9950c c9950c, List list, PointF pointF);

    /* renamed from: w */
    void mo220w(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z9);

    /* renamed from: x */
    void mo221x(InterfaceC8055c interfaceC8055c);

    /* renamed from: y */
    void mo222y(String str, InterfaceC8055c interfaceC8055c);

    /* renamed from: z */
    void mo223z(List list, Matrix matrix);
}
