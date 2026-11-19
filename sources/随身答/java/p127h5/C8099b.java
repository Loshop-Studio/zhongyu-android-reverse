package p127h5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9694m;
import p263u5.C9696o;

/* renamed from: h5.b */
/* loaded from: classes4.dex */
public final class C8099b extends GroupGraph {

    /* renamed from: s */
    public final InterfaceC8891e f13812s;

    /* renamed from: t */
    public String f13813t;

    /* renamed from: u */
    public Integer f13814u;

    /* renamed from: v */
    public final Path f13815v;

    /* renamed from: w */
    public List f13816w;

    /* renamed from: x */
    public Integer f13817x;

    /* renamed from: y */
    public Paint f13818y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8099b(String id, RectF outRectF, InterfaceC8891e interfaceC8891e, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f13812s = interfaceC8891e;
        this.f13813t = str;
        this.f13814u = num;
        this.f13815v = new Path();
    }

    /* renamed from: H */
    public final List m12936H() {
        List list;
        if (this.f13817x == null || this.f13816w == null) {
            m12939K();
        }
        if (this.f13817x == null || this.f13816w == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Integer num = this.f13817x;
        if (num != null && num.intValue() == 1 && (list = this.f13816w) != null && list.size() == 3) {
            PointF pointF = new PointF(mo12797f().left, mo12797f().bottom);
            PointF pointF2 = new PointF(mo12797f().right, mo12797f().bottom);
            List<PointF> list2 = this.f13816w;
            if (list2 != null) {
                for (PointF pointF3 : list2) {
                    if (!Intrinsics.areEqual(pointF3, pointF) && !Intrinsics.areEqual(pointF3, pointF2)) {
                        arrayList.add(new PointF(pointF3.x, pointF3.y));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public final Paint m12937I() {
        return this.f13818y;
    }

    /* renamed from: J */
    public final List m12938J() {
        return this.f13816w;
    }

    /* renamed from: K */
    public final void m12939K() {
        InterfaceC8891e interfaceC8891e = this.f13812s;
        if (interfaceC8891e != null) {
            String strMo7865v = mo7865v();
            Intrinsics.checkNotNull(strMo7865v);
            Integer numMo7866w = mo7866w();
            Intrinsics.checkNotNull(numMo7866w);
            EzySource.GeometrySource.GeometryInfo geometryInfoMo13814d = interfaceC8891e.mo13814d(strMo7865v, numMo7866w.intValue());
            if (geometryInfoMo13814d != null) {
                if (this.f13817x == null) {
                    this.f13817x = Integer.valueOf(geometryInfoMo13814d.m9432x());
                }
                if (this.f13816w == null) {
                    List<EzyPointF.PointF> pointsList = geometryInfoMo13814d.getPointsList();
                    Intrinsics.checkNotNullExpressionValue(pointsList, "it.pointsList");
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointsList, 10));
                    for (EzyPointF.PointF it : pointsList) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        arrayList.add(AbstractC9694m.m16197e(it));
                    }
                    m12941M(arrayList);
                }
                if (this.f13818y == null) {
                    EzyPaint.Paint paintM9433y = geometryInfoMo13814d.m9433y();
                    Intrinsics.checkNotNullExpressionValue(paintM9433y, "it.paint");
                    Paint paintM16196d = AbstractC9694m.m16196d(paintM9433y);
                    paintM16196d.setStrokeCap(Paint.Cap.ROUND);
                    paintM16196d.setStrokeJoin(Paint.Join.ROUND);
                    m12940L(paintM16196d);
                }
            }
        }
    }

    /* renamed from: L */
    public final void m12940L(Paint paint) {
        this.f13818y = paint;
        m7854D(true);
    }

    /* renamed from: M */
    public final void m12941M(List list) {
        this.f13816w = list;
        m7854D(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        C8099b c8099b = new C8099b(getId(), new RectF(mo12797f()), this.f13812s, mo7865v(), mo7866w());
        Integer num = this.f13817x;
        if (num != null) {
            c8099b.f13817x = Integer.valueOf(num.intValue());
        }
        List<PointF> list = this.f13816w;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (PointF pointF : list) {
                arrayList.add(new PointF(pointF.x, pointF.y));
            }
            c8099b.m12941M(arrayList);
        }
        Paint paint = this.f13818y;
        if (paint != null) {
            c8099b.m12940L(new Paint(paint));
        }
        c8099b.m12805t(mo12794b());
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            c8099b.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return c8099b;
    }

    @Override // p137i5.C8134a, p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b snapshot = super.getSnapshot();
        Paint paint = this.f13818y;
        if (paint != null) {
            snapshot.m9037P(AbstractC9694m.m16193a(paint, 1.0f, 0.0f));
        }
        List list = this.f13816w;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                snapshot.m9043d(AbstractC9694m.m16194b((PointF) it.next()));
            }
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    /* renamed from: i */
    public RectF mo12799i(Matrix matrix) {
        RectF rectF = new RectF(mo12797f());
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(mo12794b());
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        Paint paint = this.f13818y;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth() / 2;
            rectF.left -= strokeWidth;
            rectF.top -= strokeWidth;
            rectF.right += strokeWidth;
            rectF.bottom += strokeWidth;
        }
        return rectF;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8054b
    /* renamed from: l */
    public void mo7861l(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f13817x == null || this.f13816w == null || this.f13818y == null) {
            m12939K();
        }
        m7853C().reset();
        m7853C().postConcat(mo12794b());
        m7853C().postConcat(matrix);
        Paint paint = this.f13818y;
        if (paint != null) {
            this.f13815v.reset();
            Integer num = this.f13817x;
            if (num != null && num.intValue() == 0) {
                this.f13815v.addOval(mo12797f(), Path.Direction.CW);
            } else if (num != null && num.intValue() == 1) {
                List list = this.f13816w;
                if (list != null) {
                    int i9 = 0;
                    for (Object obj : list) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        PointF pointF = (PointF) obj;
                        if (i9 == 0) {
                            this.f13815v.moveTo(pointF.x, pointF.y);
                        } else {
                            this.f13815v.lineTo(pointF.x, pointF.y);
                        }
                        i9 = i10;
                    }
                }
                this.f13815v.close();
            }
            this.f13815v.transform(m7853C());
            canvas.drawPath(this.f13815v, paint);
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p127h5.InterfaceC8100c
    /* renamed from: n */
    public void mo7862n(RectF newRectF) {
        Intrinsics.checkNotNullParameter(newRectF, "newRectF");
        RectF rectF = new RectF(mo12797f());
        super.mo7862n(newRectF);
        if (this.f13817x == null || this.f13816w == null) {
            m12939K();
        }
        Integer num = this.f13817x;
        if (num != null && num.intValue() == 1) {
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, newRectF, Matrix.ScaleToFit.FILL);
            List<PointF> list = this.f13816w;
            if (list != null) {
                for (PointF pointF : list) {
                    pointF.set(C9696o.f17133a.m16207e(pointF, matrix));
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a
    /* renamed from: v */
    public String mo7865v() {
        return this.f13813t;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a
    /* renamed from: w */
    public Integer mo7866w() {
        return this.f13814u;
    }
}
