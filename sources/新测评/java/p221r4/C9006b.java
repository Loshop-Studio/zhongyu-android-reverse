package p221r4;

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
import p077e5.AbstractC7351l;
import p077e5.C7353n;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;

/* renamed from: r4.b */
/* loaded from: classes4.dex */
public final class C9006b extends GroupGraph {

    /* renamed from: s */
    public final InterfaceC9668d f15420s;

    /* renamed from: t */
    public String f15421t;

    /* renamed from: u */
    public Integer f15422u;

    /* renamed from: v */
    public final Path f15423v;

    /* renamed from: w */
    public List f15424w;

    /* renamed from: x */
    public Integer f15425x;

    /* renamed from: y */
    public Paint f15426y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9006b(String id, RectF outRectF, InterfaceC9668d interfaceC9668d, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f15420s = interfaceC9668d;
        this.f15421t = str;
        this.f15422u = num;
        this.f15423v = new Path();
    }

    /* renamed from: I */
    public final List m15153I() {
        List list;
        if (this.f15425x == null || this.f15424w == null) {
            m15156L();
        }
        if (this.f15425x == null || this.f15424w == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Integer num = this.f15425x;
        if (num != null && num.intValue() == 1 && (list = this.f15424w) != null && list.size() == 3) {
            PointF pointF = new PointF(mo14996g().left, mo14996g().bottom);
            PointF pointF2 = new PointF(mo14996g().right, mo14996g().bottom);
            List<PointF> list2 = this.f15424w;
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

    /* renamed from: J */
    public final Paint m15154J() {
        return this.f15426y;
    }

    /* renamed from: K */
    public final List m15155K() {
        return this.f15424w;
    }

    /* renamed from: L */
    public final void m15156L() {
        InterfaceC9668d interfaceC9668d = this.f15420s;
        if (interfaceC9668d != null) {
            String strMo6754w = mo6754w();
            Intrinsics.checkNotNull(strMo6754w);
            Integer numMo6755x = mo6755x();
            Intrinsics.checkNotNull(numMo6755x);
            EzySource.GeometrySource.GeometryInfo geometryInfoMo16169d = interfaceC9668d.mo16169d(strMo6754w, numMo6755x.intValue());
            if (geometryInfoMo16169d != null) {
                if (this.f15425x == null) {
                    this.f15425x = Integer.valueOf(geometryInfoMo16169d.m8286u());
                }
                if (this.f15424w == null) {
                    List<EzyPointF.PointF> pointsList = geometryInfoMo16169d.getPointsList();
                    Intrinsics.checkNotNullExpressionValue(pointsList, "it.pointsList");
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointsList, 10));
                    for (EzyPointF.PointF it : pointsList) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        arrayList.add(AbstractC7351l.m11774e(it));
                    }
                    m15158N(arrayList);
                }
                if (this.f15426y == null) {
                    EzyPaint.Paint paintM8287v = geometryInfoMo16169d.m8287v();
                    Intrinsics.checkNotNullExpressionValue(paintM8287v, "it.paint");
                    Paint paintM11773d = AbstractC7351l.m11773d(paintM8287v);
                    paintM11773d.setStrokeCap(Paint.Cap.ROUND);
                    paintM11773d.setStrokeJoin(Paint.Join.ROUND);
                    m15157M(paintM11773d);
                }
            }
        }
    }

    /* renamed from: M */
    public final void m15157M(Paint paint) {
        this.f15426y = paint;
        m6742E(true);
    }

    /* renamed from: N */
    public final void m15158N(List list) {
        this.f15424w = list;
        m6742E(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        C9006b c9006b = new C9006b(getId(), new RectF(mo14996g()), this.f15420s, mo6754w(), mo6755x());
        Integer num = this.f15425x;
        if (num != null) {
            c9006b.f15425x = Integer.valueOf(num.intValue());
        }
        List<PointF> list = this.f15424w;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (PointF pointF : list) {
                arrayList.add(new PointF(pointF.x, pointF.y));
            }
            c9006b.m15158N(arrayList);
        }
        Paint paint = this.f15426y;
        if (paint != null) {
            c9006b.m15157M(new Paint(paint));
        }
        c9006b.m15004u(mo14993b());
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            c9006b.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return c9006b;
    }

    @Override // p232s4.C9136a, p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b snapshot = super.getSnapshot();
        Paint paint = this.f15426y;
        if (paint != null) {
            snapshot.m7905P(AbstractC7351l.m11770a(paint, 1.0f, 0.0f));
        }
        List list = this.f15424w;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                snapshot.m7911c(AbstractC7351l.m11771b((PointF) it.next()));
            }
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    /* renamed from: j */
    public RectF mo14999j(Matrix matrix) {
        RectF rectF = new RectF(mo14996g());
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(mo14993b());
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        Paint paint = this.f15426y;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth() / 2;
            rectF.left -= strokeWidth;
            rectF.top -= strokeWidth;
            rectF.right += strokeWidth;
            rectF.bottom += strokeWidth;
        }
        return rectF;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8887b
    /* renamed from: m */
    public void mo6749m(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f15425x == null || this.f15424w == null || this.f15426y == null) {
            m15156L();
        }
        m6741D().reset();
        m6741D().postConcat(mo14993b());
        m6741D().postConcat(matrix);
        Paint paint = this.f15426y;
        if (paint != null) {
            this.f15423v.reset();
            Integer num = this.f15425x;
            if (num != null && num.intValue() == 0) {
                this.f15423v.addOval(mo14996g(), Path.Direction.CW);
            } else if (num != null && num.intValue() == 1) {
                List list = this.f15424w;
                if (list != null) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        PointF pointF = (PointF) obj;
                        if (i10 == 0) {
                            this.f15423v.moveTo(pointF.x, pointF.y);
                        } else {
                            this.f15423v.lineTo(pointF.x, pointF.y);
                        }
                        i10 = i11;
                    }
                }
                this.f15423v.close();
            }
            this.f15423v.transform(m6741D());
            canvas.drawPath(this.f15423v, paint);
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p221r4.InterfaceC9007c
    /* renamed from: o */
    public void mo6750o(RectF newRectF) {
        Intrinsics.checkNotNullParameter(newRectF, "newRectF");
        RectF rectF = new RectF(mo14996g());
        super.mo6750o(newRectF);
        if (this.f15425x == null || this.f15424w == null) {
            m15156L();
        }
        Integer num = this.f15425x;
        if (num != null && num.intValue() == 1) {
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, newRectF, Matrix.ScaleToFit.FILL);
            List<PointF> list = this.f15424w;
            if (list != null) {
                for (PointF pointF : list) {
                    pointF.set(C7353n.f11920a.m11784e(pointF, matrix));
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a
    /* renamed from: w */
    public String mo6754w() {
        return this.f15421t;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a
    /* renamed from: x */
    public Integer mo6755x() {
        return this.f15422u;
    }
}
