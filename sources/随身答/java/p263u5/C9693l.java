package p263u5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p127h5.C8099b;
import p127h5.C8101d;
import p137i5.C8134a;
import p147j5.C8214a;
import p147j5.C8215b;
import p169l5.InterfaceC8891e;
import p189n5.C9097c;

/* renamed from: u5.l */
/* loaded from: classes4.dex */
public final class C9693l {

    /* renamed from: a */
    public static final C9693l f17131a = new C9693l();

    /* renamed from: u5.l$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17132a;

        static {
            int[] iArr = new int[EzyGraphEnum.GraphEnum.values().length];
            iArr[EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.ordinal()] = 1;
            iArr[EzyGraphEnum.GraphEnum.IMAGE_GRAPH.ordinal()] = 2;
            iArr[EzyGraphEnum.GraphEnum.STROKE_GRAPH.ordinal()] = 3;
            iArr[EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH.ordinal()] = 4;
            iArr[EzyGraphEnum.GraphEnum.GROUP_GRAPH.ordinal()] = 5;
            iArr[EzyGraphEnum.GraphEnum.TEXT_GRAPH.ordinal()] = 6;
            iArr[EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH.ordinal()] = 7;
            f17132a = iArr;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [g5.a, j5.b, j5.c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [g5.a, j5.a, j5.c] */
    /* JADX WARN: Type inference failed for: r0v17, types: [g5.a, h5.d] */
    /* JADX WARN: Type inference failed for: r0v20, types: [g5.a, h5.b] */
    /* renamed from: a */
    public final AbstractC8053a m16188a(InterfaceC8891e interfaceC8891e, EzyPageSnapshot.PageSnapshot.GraphSnapshot pageSnapshot) {
        AbstractC8053a c8134a;
        String strPath;
        ImageGraph imageGraph;
        ImageGraph imageGraph2;
        InterfaceC8891e sourceLoad = interfaceC8891e;
        Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
        Intrinsics.checkNotNullParameter(pageSnapshot, "pageSnapshot");
        EzyGraphEnum.GraphEnum graphEnumM9005M = pageSnapshot.m9005M();
        AbstractC8053a abstractC8053a = null;
        absolutePath = null;
        absolutePath = null;
        String absolutePath = null;
        switch (graphEnumM9005M == null ? -1 : a.f17132a[graphEnumM9005M.ordinal()]) {
            case 1:
                String strM9007O = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q, "pageSnapshot.outRect");
                c8134a = new C8134a(strM9007O, AbstractC9694m.m16198f(rectFM9009Q), null, null, 12, null);
                C9693l c9693l = f17131a;
                EzyMatrix.Matrix matrixM9008P = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P, "pageSnapshot.matrix");
                c8134a.m12805t(c9693l.m16189b(matrixM9008P));
                abstractC8053a = c8134a;
                break;
            case 2:
                String strM9007O2 = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O2, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q2 = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q2, "pageSnapshot.outRect");
                RectF rectFM16198f = AbstractC9694m.m16198f(rectFM9009Q2);
                String strM9013U = pageSnapshot.m9013U();
                Intrinsics.checkNotNullExpressionValue(strM9013U, "pageSnapshot.sourceFileName");
                sourceLoad = interfaceC8891e;
                ImageGraph imageGraph3 = new ImageGraph(strM9007O2, rectFM16198f, sourceLoad, strM9013U, pageSnapshot.m9014V());
                C9693l c9693l2 = f17131a;
                EzyMatrix.Matrix matrixM9008P2 = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P2, "pageSnapshot.matrix");
                imageGraph3.m12805t(c9693l2.m16189b(matrixM9008P2));
                String filePath = pageSnapshot.m9004L();
                if (filePath != null) {
                    Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
                    if (filePath.length() != 0 && (strPath = sourceLoad.path()) != null) {
                        absolutePath = new File(C9097c.f15322d.m14637a(strPath, DocumentType.IMAGE), filePath).getAbsolutePath();
                    }
                }
                imageGraph3.m12935K(absolutePath);
                imageGraph = imageGraph3;
                abstractC8053a = imageGraph;
                break;
            case 3:
                String strM9007O3 = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O3, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q3 = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q3, "pageSnapshot.outRect");
                ?? c8215b = new C8215b(strM9007O3, AbstractC9694m.m16198f(rectFM9009Q3), interfaceC8891e, pageSnapshot.m9013U(), Integer.valueOf(pageSnapshot.m9014V()));
                C9693l c9693l3 = f17131a;
                EzyMatrix.Matrix matrixM9008P3 = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P3, "pageSnapshot.matrix");
                c8215b.m12805t(c9693l3.m16189b(matrixM9008P3));
                imageGraph2 = c8215b;
                if (pageSnapshot.m9016X()) {
                    EzyPaint.Paint paintM9010R = pageSnapshot.m9010R();
                    Intrinsics.checkNotNullExpressionValue(paintM9010R, "pageSnapshot.paint");
                    c8215b.m13245K(AbstractC9694m.m16196d(paintM9010R), pageSnapshot.m9010R().m9105v(), pageSnapshot.m9010R().m9106w());
                    imageGraph2 = c8215b;
                }
                sourceLoad = interfaceC8891e;
                imageGraph = imageGraph2;
                abstractC8053a = imageGraph;
                break;
            case 4:
                String strM9007O4 = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O4, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q4 = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q4, "pageSnapshot.outRect");
                ?? c8214a = new C8214a(strM9007O4, AbstractC9694m.m16198f(rectFM9009Q4), interfaceC8891e, pageSnapshot.m9013U(), Integer.valueOf(pageSnapshot.m9014V()));
                C9693l c9693l4 = f17131a;
                EzyMatrix.Matrix matrixM9008P4 = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P4, "pageSnapshot.matrix");
                c8214a.m12805t(c9693l4.m16189b(matrixM9008P4));
                imageGraph2 = c8214a;
                if (pageSnapshot.m9016X()) {
                    EzyPaint.Paint paintM9010R2 = pageSnapshot.m9010R();
                    Intrinsics.checkNotNullExpressionValue(paintM9010R2, "pageSnapshot.paint");
                    c8214a.m13245K(AbstractC9694m.m16196d(paintM9010R2), pageSnapshot.m9010R().m9105v(), pageSnapshot.m9010R().m9106w());
                    imageGraph2 = c8214a;
                }
                sourceLoad = interfaceC8891e;
                imageGraph = imageGraph2;
                abstractC8053a = imageGraph;
                break;
            case 5:
                String strM9007O5 = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O5, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q5 = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q5, "pageSnapshot.outRect");
                c8134a = new GroupGraph(strM9007O5, AbstractC9694m.m16198f(rectFM9009Q5), null, null, 12, null);
                C9693l c9693l5 = f17131a;
                EzyMatrix.Matrix matrixM9008P5 = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P5, "pageSnapshot.matrix");
                c8134a.m12805t(c9693l5.m16189b(matrixM9008P5));
                sourceLoad = interfaceC8891e;
                abstractC8053a = c8134a;
                break;
            case 6:
                String strM9007O6 = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O6, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q6 = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q6, "pageSnapshot.outRect");
                sourceLoad = interfaceC8891e;
                ?? c8101d = new C8101d(strM9007O6, AbstractC9694m.m16198f(rectFM9009Q6), sourceLoad, pageSnapshot.m9013U(), Integer.valueOf(pageSnapshot.m9014V()));
                C9693l c9693l6 = f17131a;
                EzyMatrix.Matrix matrixM9008P6 = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P6, "pageSnapshot.matrix");
                c8101d.m12805t(c9693l6.m16189b(matrixM9008P6));
                EzyPaint.Paint paintM9010R3 = pageSnapshot.m9010R();
                Intrinsics.checkNotNullExpressionValue(paintM9010R3, "pageSnapshot.paint");
                c8101d.m12945K(AbstractC9694m.m16196d(paintM9010R3));
                c8101d.m12944J(pageSnapshot.getContent());
                imageGraph = c8101d;
                abstractC8053a = imageGraph;
                break;
            case 7:
                String strM9007O7 = pageSnapshot.m9007O();
                Intrinsics.checkNotNullExpressionValue(strM9007O7, "pageSnapshot.id");
                EzyRectF.RectF rectFM9009Q7 = pageSnapshot.m9009Q();
                Intrinsics.checkNotNullExpressionValue(rectFM9009Q7, "pageSnapshot.outRect");
                ?? c8099b = new C8099b(strM9007O7, AbstractC9694m.m16198f(rectFM9009Q7), sourceLoad, pageSnapshot.m9013U(), Integer.valueOf(pageSnapshot.m9014V()));
                C9693l c9693l7 = f17131a;
                EzyMatrix.Matrix matrixM9008P7 = pageSnapshot.m9008P();
                Intrinsics.checkNotNullExpressionValue(matrixM9008P7, "pageSnapshot.matrix");
                c8099b.m12805t(c9693l7.m16189b(matrixM9008P7));
                EzyPaint.Paint paintM9010R4 = pageSnapshot.m9010R();
                Intrinsics.checkNotNullExpressionValue(paintM9010R4, "pageSnapshot.paint");
                c8099b.m12940L(AbstractC9694m.m16196d(paintM9010R4));
                List<EzyPointF.PointF> listM9012T = pageSnapshot.m9012T();
                Intrinsics.checkNotNullExpressionValue(listM9012T, "pageSnapshot.pointListList");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM9012T, 10));
                for (EzyPointF.PointF it : listM9012T) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(AbstractC9694m.m16197e(it));
                }
                c8099b.m12941M(arrayList);
                imageGraph2 = c8099b;
                sourceLoad = interfaceC8891e;
                imageGraph = imageGraph2;
                abstractC8053a = imageGraph;
                break;
        }
        for (EzyPageSnapshot.PageSnapshot.GraphSnapshot childPageSnapshot : pageSnapshot.getChildGraphList()) {
            Intrinsics.checkNotNullExpressionValue(childPageSnapshot, "childPageSnapshot");
            AbstractC8053a abstractC8053aM16188a = m16188a(sourceLoad, childPageSnapshot);
            if (abstractC8053aM16188a != null && abstractC8053a != null) {
                abstractC8053a.mo7864r(abstractC8053aM16188a);
            }
        }
        return abstractC8053a;
    }

    /* renamed from: b */
    public final Matrix m16189b(EzyMatrix.Matrix matrix) {
        float[] fArr = {matrix.getScaleX(), matrix.m8853C(), matrix.m8855E(), matrix.m8854D(), matrix.getScaleY(), matrix.m8856F(), matrix.m8861z(), matrix.m8851A(), matrix.m8852B()};
        Matrix matrix2 = new Matrix();
        matrix2.setValues(fArr);
        return matrix2;
    }

    /* renamed from: c */
    public final Path m16190c(List pointList) {
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Path path = new Path();
        Iterator it = pointList.iterator();
        float x9 = 0.0f;
        float y9 = 0.0f;
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            if (Intrinsics.areEqual(touchEvent, CollectionsKt.first(pointList))) {
                path.moveTo(touchEvent.getX(), touchEvent.getY());
                path.lineTo(touchEvent.getX(), touchEvent.getY());
            } else if (Intrinsics.areEqual(touchEvent, CollectionsKt.last(pointList))) {
                float f10 = 2;
                path.quadTo(x9, y9, (touchEvent.getX() + x9) / f10, (touchEvent.getY() + y9) / f10);
                path.lineTo(touchEvent.getX(), touchEvent.getY());
            } else {
                float f11 = 2;
                path.quadTo(x9, y9, (touchEvent.getX() + x9) / f11, (touchEvent.getY() + y9) / f11);
            }
            x9 = touchEvent.getX();
            y9 = touchEvent.getY();
        }
        return path;
    }

    /* renamed from: d */
    public final RectF m16191d(List pointList) {
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        RectF rectF = new RectF();
        if (pointList.isEmpty()) {
            return rectF;
        }
        PointF pointF = new PointF(((EzyTouchEvent.TouchEvent) CollectionsKt.first(pointList)).getX(), ((EzyTouchEvent.TouchEvent) CollectionsKt.first(pointList)).getY());
        Iterator it = pointList.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            if (pointF.x != touchEvent.getX() || pointF.y != touchEvent.getY()) {
                z9 = false;
            }
        }
        if (!z9) {
            m16190c(pointList).computeBounds(rectF, true);
            return rectF;
        }
        float f10 = pointF.x;
        float f11 = 1;
        float f12 = pointF.y;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        return rectF;
    }

    /* renamed from: e */
    public final EzyPageSnapshot.PageSnapshot m16192e(String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (!new File(filePath).exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        EzyPageSnapshot.PageSnapshot pageSnapshotM8971z = EzyPageSnapshot.PageSnapshot.m8971z(fileInputStream);
        fileInputStream.close();
        return pageSnapshotM8971z;
    }
}
