package na;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ca.C5412b;
import ca.C5414d;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import com.zykj.board.EzyTouchEvent;
import ga.InterfaceC9284d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p118da.C9007a;
import p134ea.C9111a;
import p134ea.C9112b;
import p194ia.C9619c;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;

/* renamed from: na.l */
/* loaded from: classes5.dex */
public final class C10349l {

    /* renamed from: a */
    public static final C10349l f24656a = new C10349l();

    /* renamed from: na.l$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24657a;

        static {
            int[] iArr = new int[EzyGraphEnum.GraphEnum.values().length];
            iArr[EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.ordinal()] = 1;
            iArr[EzyGraphEnum.GraphEnum.IMAGE_GRAPH.ordinal()] = 2;
            iArr[EzyGraphEnum.GraphEnum.STROKE_GRAPH.ordinal()] = 3;
            iArr[EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH.ordinal()] = 4;
            iArr[EzyGraphEnum.GraphEnum.GROUP_GRAPH.ordinal()] = 5;
            iArr[EzyGraphEnum.GraphEnum.TEXT_GRAPH.ordinal()] = 6;
            iArr[EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH.ordinal()] = 7;
            f24657a = iArr;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [ba.a, ea.b, ea.c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ba.a, ea.a, ea.c] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ba.a, ca.d] */
    /* JADX WARN: Type inference failed for: r0v20, types: [ba.a, ca.b] */
    /* renamed from: a */
    public final AbstractC5179a m21648a(InterfaceC9284d interfaceC9284d, EzyPageSnapshot.PageSnapshot.GraphSnapshot pageSnapshot) {
        AbstractC5179a c9007a;
        String strPath;
        ImageGraph imageGraph;
        ImageGraph imageGraph2;
        InterfaceC9284d sourceLoad = interfaceC9284d;
        AbstractC9979u.m20294g(sourceLoad, "sourceLoad");
        AbstractC9979u.m20294g(pageSnapshot, "pageSnapshot");
        EzyGraphEnum.GraphEnum graphEnumM15621J = pageSnapshot.m15621J();
        AbstractC5179a abstractC5179a = null;
        absolutePath = null;
        absolutePath = null;
        String absolutePath = null;
        switch (graphEnumM15621J == null ? -1 : a.f24657a[graphEnumM15621J.ordinal()]) {
            case 1:
                String strM15623L = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N, "pageSnapshot.outRect");
                c9007a = new C9007a(strM15623L, AbstractC10350m.m21658f(rectFM15625N), null, null, 12, null);
                C10349l c10349l = f24656a;
                EzyMatrix.Matrix matrixM15624M = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M, "pageSnapshot.matrix");
                c9007a.m2729u(c10349l.m21649b(matrixM15624M));
                abstractC5179a = c9007a;
                break;
            case 2:
                String strM15623L2 = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L2, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N2 = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N2, "pageSnapshot.outRect");
                RectF rectFM21658f = AbstractC10350m.m21658f(rectFM15625N2);
                String strM15629R = pageSnapshot.m15629R();
                AbstractC9979u.m20293f(strM15629R, "pageSnapshot.sourceFileName");
                sourceLoad = interfaceC9284d;
                ImageGraph imageGraph3 = new ImageGraph(strM15623L2, rectFM21658f, sourceLoad, strM15629R, pageSnapshot.m15630S());
                C10349l c10349l2 = f24656a;
                EzyMatrix.Matrix matrixM15624M2 = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M2, "pageSnapshot.matrix");
                imageGraph3.m2729u(c10349l2.m21649b(matrixM15624M2));
                String filePath = pageSnapshot.m15620I();
                if (filePath != null) {
                    AbstractC9979u.m20293f(filePath, "filePath");
                    if (filePath.length() != 0 && (strPath = sourceLoad.path()) != null) {
                        absolutePath = new File(C9619c.f22151d.m18862a(strPath, DocumentType.IMAGE), filePath).getAbsolutePath();
                    }
                }
                imageGraph3.m2866H(absolutePath);
                imageGraph = imageGraph3;
                abstractC5179a = imageGraph;
                break;
            case 3:
                String strM15623L3 = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L3, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N3 = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N3, "pageSnapshot.outRect");
                ?? c9112b = new C9112b(strM15623L3, AbstractC10350m.m21658f(rectFM15625N3), interfaceC9284d, pageSnapshot.m15629R(), Integer.valueOf(pageSnapshot.m15630S()));
                C10349l c10349l3 = f24656a;
                EzyMatrix.Matrix matrixM15624M3 = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M3, "pageSnapshot.matrix");
                c9112b.m2729u(c10349l3.m21649b(matrixM15624M3));
                imageGraph2 = c9112b;
                if (pageSnapshot.m15632U()) {
                    EzyPaint.Paint paintM15626O = pageSnapshot.m15626O();
                    AbstractC9979u.m20293f(paintM15626O, "pageSnapshot.paint");
                    c9112b.m17923L(AbstractC10350m.m21656d(paintM15626O), pageSnapshot.m15626O().m15721n(), pageSnapshot.m15626O().m15722o());
                    imageGraph2 = c9112b;
                }
                sourceLoad = interfaceC9284d;
                imageGraph = imageGraph2;
                abstractC5179a = imageGraph;
                break;
            case 4:
                String strM15623L4 = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L4, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N4 = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N4, "pageSnapshot.outRect");
                ?? c9111a = new C9111a(strM15623L4, AbstractC10350m.m21658f(rectFM15625N4), interfaceC9284d, pageSnapshot.m15629R(), Integer.valueOf(pageSnapshot.m15630S()));
                C10349l c10349l4 = f24656a;
                EzyMatrix.Matrix matrixM15624M4 = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M4, "pageSnapshot.matrix");
                c9111a.m2729u(c10349l4.m21649b(matrixM15624M4));
                imageGraph2 = c9111a;
                if (pageSnapshot.m15632U()) {
                    EzyPaint.Paint paintM15626O2 = pageSnapshot.m15626O();
                    AbstractC9979u.m20293f(paintM15626O2, "pageSnapshot.paint");
                    c9111a.m17923L(AbstractC10350m.m21656d(paintM15626O2), pageSnapshot.m15626O().m15721n(), pageSnapshot.m15626O().m15722o());
                    imageGraph2 = c9111a;
                }
                sourceLoad = interfaceC9284d;
                imageGraph = imageGraph2;
                abstractC5179a = imageGraph;
                break;
            case 5:
                String strM15623L5 = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L5, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N5 = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N5, "pageSnapshot.outRect");
                c9007a = new GroupGraph(strM15623L5, AbstractC10350m.m21658f(rectFM15625N5), null, null, 12, null);
                C10349l c10349l5 = f24656a;
                EzyMatrix.Matrix matrixM15624M5 = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M5, "pageSnapshot.matrix");
                c9007a.m2729u(c10349l5.m21649b(matrixM15624M5));
                sourceLoad = interfaceC9284d;
                abstractC5179a = c9007a;
                break;
            case 6:
                String strM15623L6 = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L6, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N6 = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N6, "pageSnapshot.outRect");
                sourceLoad = interfaceC9284d;
                ?? c5414d = new C5414d(strM15623L6, AbstractC10350m.m21658f(rectFM15625N6), sourceLoad, pageSnapshot.m15629R(), Integer.valueOf(pageSnapshot.m15630S()));
                C10349l c10349l6 = f24656a;
                EzyMatrix.Matrix matrixM15624M6 = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M6, "pageSnapshot.matrix");
                c5414d.m2729u(c10349l6.m21649b(matrixM15624M6));
                EzyPaint.Paint paintM15626O3 = pageSnapshot.m15626O();
                AbstractC9979u.m20293f(paintM15626O3, "pageSnapshot.paint");
                c5414d.m2880H(AbstractC10350m.m21656d(paintM15626O3));
                c5414d.m2879G(pageSnapshot.getContent());
                imageGraph = c5414d;
                abstractC5179a = imageGraph;
                break;
            case 7:
                String strM15623L7 = pageSnapshot.m15623L();
                AbstractC9979u.m20293f(strM15623L7, "pageSnapshot.id");
                EzyRectF.RectF rectFM15625N7 = pageSnapshot.m15625N();
                AbstractC9979u.m20293f(rectFM15625N7, "pageSnapshot.outRect");
                ?? c5412b = new C5412b(strM15623L7, AbstractC10350m.m21658f(rectFM15625N7), sourceLoad, pageSnapshot.m15629R(), Integer.valueOf(pageSnapshot.m15630S()));
                C10349l c10349l7 = f24656a;
                EzyMatrix.Matrix matrixM15624M7 = pageSnapshot.m15624M();
                AbstractC9979u.m20293f(matrixM15624M7, "pageSnapshot.matrix");
                c5412b.m2729u(c10349l7.m21649b(matrixM15624M7));
                EzyPaint.Paint paintM15626O4 = pageSnapshot.m15626O();
                AbstractC9979u.m20293f(paintM15626O4, "pageSnapshot.paint");
                c5412b.m2873I(AbstractC10350m.m21656d(paintM15626O4));
                List listM15628Q = pageSnapshot.m15628Q();
                AbstractC9979u.m20293f(listM15628Q, "pageSnapshot.pointListList");
                List<EzyPointF.PointF> list = listM15628Q;
                ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
                for (EzyPointF.PointF it : list) {
                    AbstractC9979u.m20293f(it, "it");
                    arrayList.add(AbstractC10350m.m21657e(it));
                }
                c5412b.m2874J(arrayList);
                imageGraph2 = c5412b;
                sourceLoad = interfaceC9284d;
                imageGraph = imageGraph2;
                abstractC5179a = imageGraph;
                break;
        }
        for (EzyPageSnapshot.PageSnapshot.GraphSnapshot childPageSnapshot : pageSnapshot.getChildGraphList()) {
            AbstractC9979u.m20293f(childPageSnapshot, "childPageSnapshot");
            AbstractC5179a abstractC5179aM21648a = m21648a(sourceLoad, childPageSnapshot);
            if (abstractC5179aM21648a != null && abstractC5179a != null) {
                abstractC5179a.mo2727s(abstractC5179aM21648a);
            }
        }
        return abstractC5179a;
    }

    /* renamed from: b */
    public final Matrix m21649b(EzyMatrix.Matrix matrix) {
        float[] fArr = {matrix.getScaleX(), matrix.m15476y(), matrix.m15467A(), matrix.m15477z(), matrix.getScaleY(), matrix.m15468C(), matrix.m15473t(), matrix.m15474u(), matrix.m15475v()};
        Matrix matrix2 = new Matrix();
        matrix2.setValues(fArr);
        return matrix2;
    }

    /* renamed from: c */
    public final Path m21650c(List pointList) {
        AbstractC9979u.m20294g(pointList, "pointList");
        Path path = new Path();
        Iterator it = pointList.iterator();
        float x10 = 0.0f;
        float y10 = 0.0f;
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            if (AbstractC9979u.m20289b(touchEvent, AbstractC10947g0.m23944m0(pointList))) {
                path.moveTo(touchEvent.getX(), touchEvent.getY());
                path.lineTo(touchEvent.getX(), touchEvent.getY());
            } else if (AbstractC9979u.m20289b(touchEvent, AbstractC10947g0.m23956y0(pointList))) {
                float f10 = 2;
                path.quadTo(x10, y10, (touchEvent.getX() + x10) / f10, (touchEvent.getY() + y10) / f10);
                path.lineTo(touchEvent.getX(), touchEvent.getY());
            } else {
                float f11 = 2;
                path.quadTo(x10, y10, (touchEvent.getX() + x10) / f11, (touchEvent.getY() + y10) / f11);
            }
            x10 = touchEvent.getX();
            y10 = touchEvent.getY();
        }
        return path;
    }

    /* renamed from: d */
    public final RectF m21651d(List pointList) {
        AbstractC9979u.m20294g(pointList, "pointList");
        RectF rectF = new RectF();
        if (pointList.isEmpty()) {
            return rectF;
        }
        PointF pointF = new PointF(((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23944m0(pointList)).getX(), ((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23944m0(pointList)).getY());
        Iterator it = pointList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            if (pointF.x != touchEvent.getX() || pointF.y != touchEvent.getY()) {
                z10 = false;
            }
        }
        if (!z10) {
            m21650c(pointList).computeBounds(rectF, true);
            return rectF;
        }
        float f10 = pointF.x;
        float f11 = 1;
        float f12 = pointF.y;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        return rectF;
    }

    /* renamed from: e */
    public final EzyPageSnapshot.PageSnapshot m21652e(String filePath) throws IOException {
        AbstractC9979u.m20294g(filePath, "filePath");
        if (!new File(filePath).exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        EzyPageSnapshot.PageSnapshot pageSnapshotM15587t = EzyPageSnapshot.PageSnapshot.m15587t(fileInputStream);
        fileInputStream.close();
        return pageSnapshotM15587t;
    }
}
