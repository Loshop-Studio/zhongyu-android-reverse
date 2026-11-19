package p142k4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import java.util.List;
import p120i4.C7663c;
import p120i4.C7665e;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;

/* renamed from: k4.c */
/* loaded from: classes4.dex */
public interface InterfaceC7880c {

    /* renamed from: k4.c$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m13462a(InterfaceC7880c interfaceC7880c, Matrix matrix, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cameraChangeEnd");
            }
            if ((i10 & 1) != 0) {
                matrix = null;
            }
            interfaceC7880c.mo13417D(matrix);
        }

        /* renamed from: b */
        public static /* synthetic */ void m13463b(InterfaceC7880c interfaceC7880c, RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleEnd");
            }
            interfaceC7880c.mo13416C(rectF, matrix, rectF2, c7665e, c7663c, list, (i10 & 64) != 0 ? null : pointF);
        }

        /* renamed from: c */
        public static /* synthetic */ void m13464c(InterfaceC7880c interfaceC7880c, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleStart");
            }
            interfaceC7880c.mo13447l(groupGraph, rectF, matrix, rectF2, c7665e, c7663c, list, (i10 & 128) != 0 ? null : pointF);
        }

        /* renamed from: d */
        public static /* synthetic */ void m13465d(InterfaceC7880c interfaceC7880c, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandling");
            }
            interfaceC7880c.mo13446k(groupGraph, rectF, matrix, rectF2, c7665e, c7663c, list, (i10 & 128) != 0 ? null : pointF);
        }
    }

    /* renamed from: A */
    void mo13414A(Path path, Paint paint, Matrix matrix);

    /* renamed from: B */
    void mo13415B(String str, String str2, Paint paint, RectF rectF);

    /* renamed from: C */
    void mo13416C(RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF);

    /* renamed from: D */
    void mo13417D(Matrix matrix);

    /* renamed from: E */
    void mo13418E(C9008d c9008d);

    /* renamed from: F */
    void mo13419F(float f10, float f11, float f12, float f13);

    /* renamed from: G */
    RectF mo13420G();

    /* renamed from: H */
    boolean mo13421H();

    /* renamed from: a */
    void mo13436a(ImageGraph imageGraph);

    /* renamed from: b */
    String mo13437b();

    /* renamed from: c */
    void mo13438c(int i10);

    /* renamed from: d */
    void mo13439d();

    /* renamed from: e */
    void mo13440e();

    /* renamed from: f */
    void mo13441f(C9008d c9008d, RectF rectF, Matrix matrix);

    /* renamed from: g */
    void mo13442g(List list);

    int getBackgroundColor();

    /* renamed from: h */
    void mo13443h(List list, Matrix matrix);

    /* renamed from: i */
    void mo13444i(boolean z9);

    /* renamed from: j */
    void mo13445j(RectF rectF, List list);

    /* renamed from: k */
    void mo13446k(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF);

    /* renamed from: l */
    void mo13447l(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF);

    /* renamed from: m */
    void mo13448m(C9008d c9008d, RectF rectF, Matrix matrix);

    /* renamed from: n */
    InterfaceC8888c mo13449n();

    /* renamed from: o */
    void mo13450o();

    /* renamed from: p */
    void mo13451p(InterfaceC8888c interfaceC8888c);

    /* renamed from: q */
    void mo13452q(List list);

    /* renamed from: r */
    RectF mo13453r();

    /* renamed from: s */
    void mo13454s(Matrix matrix);

    /* renamed from: t */
    void mo13455t(BackgroundLineConfig backgroundLineConfig);

    /* renamed from: u */
    void mo13456u(String str, RectF rectF, Matrix matrix, String str2);

    /* renamed from: v */
    void mo13457v(List list);

    /* renamed from: w */
    void mo13458w(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z9);

    /* renamed from: x */
    void mo13459x(List list, Matrix matrix);

    /* renamed from: y */
    void mo13460y(String str, InterfaceC8888c interfaceC8888c);

    /* renamed from: z */
    void mo13461z(RectF rectF, Matrix matrix, RectF rectF2, C7665e c7665e, C7663c c7663c, List list, PointF pointF);
}
