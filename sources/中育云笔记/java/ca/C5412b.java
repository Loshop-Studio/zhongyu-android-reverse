package ca;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import na.C10352o;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* renamed from: ca.b */
/* loaded from: classes5.dex */
public final class C5412b extends GroupGraph {

    /* renamed from: r */
    public final InterfaceC9284d f3479r;

    /* renamed from: s */
    public String f3480s;

    /* renamed from: t */
    public Integer f3481t;

    /* renamed from: u */
    public final Path f3482u;

    /* renamed from: v */
    public List f3483v;

    /* renamed from: w */
    public Integer f3484w;

    /* renamed from: x */
    public Paint f3485x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5412b(String id2, RectF outRectF, InterfaceC9284d interfaceC9284d, String str, Integer num) {
        super(id2, outRectF, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        this.f3479r = interfaceC9284d;
        this.f3480s = str;
        this.f3481t = num;
        this.f3482u = new Path();
    }

    /* renamed from: E */
    public final List m2869E() {
        List list;
        if (this.f3484w == null || this.f3483v == null) {
            m2872H();
        }
        if (this.f3484w == null || this.f3483v == null) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        Integer num = this.f3484w;
        if (num != null && num.intValue() == 1 && (list = this.f3483v) != null && list.size() == 3) {
            PointF pointF = new PointF(mo2718g().left, mo2718g().bottom);
            PointF pointF2 = new PointF(mo2718g().right, mo2718g().bottom);
            List<PointF> list2 = this.f3483v;
            if (list2 != null) {
                for (PointF pointF3 : list2) {
                    if (!AbstractC9979u.m20289b(pointF3, pointF) && !AbstractC9979u.m20289b(pointF3, pointF2)) {
                        arrayList.add(new PointF(pointF3.x, pointF3.y));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public final Paint m2870F() {
        return this.f3485x;
    }

    /* renamed from: G */
    public final List m2871G() {
        return this.f3483v;
    }

    /* renamed from: H */
    public final void m2872H() {
        InterfaceC9284d interfaceC9284d = this.f3479r;
        if (interfaceC9284d != null) {
            String strMo2867w = mo2867w();
            AbstractC9979u.m20291d(strMo2867w);
            Integer numMo2868x = mo2868x();
            AbstractC9979u.m20291d(numMo2868x);
            EzySource.GeometrySource.GeometryInfo geometryInfoMo18292d = interfaceC9284d.mo18292d(strMo2867w, numMo2868x.intValue());
            if (geometryInfoMo18292d != null) {
                if (this.f3484w == null) {
                    this.f3484w = Integer.valueOf(geometryInfoMo18292d.m16058p());
                }
                if (this.f3483v == null) {
                    List pointsList = geometryInfoMo18292d.getPointsList();
                    AbstractC9979u.m20293f(pointsList, "it.pointsList");
                    List<EzyPointF.PointF> list = pointsList;
                    ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
                    for (EzyPointF.PointF it : list) {
                        AbstractC9979u.m20293f(it, "it");
                        arrayList.add(AbstractC10350m.m21657e(it));
                    }
                    m2874J(arrayList);
                }
                if (this.f3485x == null) {
                    EzyPaint.Paint paintM16059r = geometryInfoMo18292d.m16059r();
                    AbstractC9979u.m20293f(paintM16059r, "it.paint");
                    Paint paintM21656d = AbstractC10350m.m21656d(paintM16059r);
                    paintM21656d.setStrokeCap(Paint.Cap.ROUND);
                    paintM21656d.setStrokeJoin(Paint.Join.ROUND);
                    m2873I(paintM21656d);
                }
            }
        }
    }

    /* renamed from: I */
    public final void m2873I(Paint paint) {
        this.f3485x = paint;
        m14490C(true);
    }

    /* renamed from: J */
    public final void m2874J(List list) {
        this.f3483v = list;
        m14490C(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        C5412b c5412b = new C5412b(getId(), new RectF(mo2718g()), this.f3479r, mo2867w(), mo2868x());
        Integer num = this.f3484w;
        if (num != null) {
            c5412b.f3484w = Integer.valueOf(num.intValue());
        }
        List list = this.f3483v;
        if (list != null) {
            List<PointF> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            for (PointF pointF : list2) {
                arrayList.add(new PointF(pointF.x, pointF.y));
            }
            c5412b.m2874J(arrayList);
        }
        Paint paint = this.f3485x;
        if (paint != null) {
            c5412b.m2873I(new Paint(paint));
        }
        c5412b.m2729u(mo2714b());
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            c5412b.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return c5412b;
    }

    @Override // p118da.C9007a, ba.AbstractC5179a, ba.InterfaceC5181c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b snapshot = super.getSnapshot();
        Paint paint = this.f3485x;
        if (paint != null) {
            snapshot.m15655R(AbstractC10350m.m21653a(paint, 1.0f, 0.0f));
        }
        List list = this.f3483v;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                snapshot.m15662e(AbstractC10350m.m21654b((PointF) it.next()));
            }
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    /* renamed from: j */
    public RectF mo2721j(Matrix matrix) {
        RectF rectF = new RectF(mo2718g());
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(mo2714b());
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        Paint paint = this.f3485x;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth() / 2;
            rectF.left -= strokeWidth;
            rectF.top -= strokeWidth;
            rectF.right += strokeWidth;
            rectF.bottom += strokeWidth;
        }
        return rectF;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5180b
    /* renamed from: m */
    public void mo2731m(Canvas canvas, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (this.f3484w == null || this.f3483v == null || this.f3485x == null) {
            m2872H();
        }
        m14488A().reset();
        m14488A().postConcat(mo2714b());
        m14488A().postConcat(matrix);
        Paint paint = this.f3485x;
        if (paint != null) {
            this.f3482u.reset();
            Integer num = this.f3484w;
            if (num != null && num.intValue() == 0) {
                this.f3482u.addOval(mo2718g(), Path.Direction.CW);
            } else if (num != null && num.intValue() == 1) {
                List list = this.f3483v;
                if (list != null) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC10978w.m24145w();
                        }
                        PointF pointF = (PointF) obj;
                        if (i10 == 0) {
                            this.f3482u.moveTo(pointF.x, pointF.y);
                        } else {
                            this.f3482u.lineTo(pointF.x, pointF.y);
                        }
                        i10 = i11;
                    }
                }
                this.f3482u.close();
            }
            this.f3482u.transform(m14488A());
            canvas.drawPath(this.f3482u, paint);
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, ca.InterfaceC5413c
    /* renamed from: p */
    public void mo2875p(RectF newRectF) {
        AbstractC9979u.m20294g(newRectF, "newRectF");
        RectF rectF = new RectF(mo2718g());
        super.mo2875p(newRectF);
        if (this.f3484w == null || this.f3483v == null) {
            m2872H();
        }
        Integer num = this.f3484w;
        if (num != null && num.intValue() == 1) {
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, newRectF, Matrix.ScaleToFit.FILL);
            List<PointF> list = this.f3483v;
            if (list != null) {
                for (PointF pointF : list) {
                    pointF.set(C10352o.f24660a.m21672e(pointF, matrix));
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a
    /* renamed from: w */
    public String mo2867w() {
        return this.f3480s;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a
    /* renamed from: x */
    public Integer mo2868x() {
        return this.f3481t;
    }
}
