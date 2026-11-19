package p077e5;

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
import p210q4.AbstractC8886a;
import p221r4.C9006b;
import p221r4.C9008d;
import p232s4.C9136a;
import p243t4.C9382a;
import p243t4.C9383b;
import p265v4.InterfaceC9668d;
import p285x4.C9850c;

/* renamed from: e5.k */
/* loaded from: classes4.dex */
public final class C7350k {

    /* renamed from: a */
    public static final C7350k f11918a = new C7350k();

    /* renamed from: e5.k$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11919a;

        static {
            int[] iArr = new int[EzyGraphEnum.GraphEnum.values().length];
            iArr[EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.ordinal()] = 1;
            iArr[EzyGraphEnum.GraphEnum.IMAGE_GRAPH.ordinal()] = 2;
            iArr[EzyGraphEnum.GraphEnum.STROKE_GRAPH.ordinal()] = 3;
            iArr[EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH.ordinal()] = 4;
            iArr[EzyGraphEnum.GraphEnum.GROUP_GRAPH.ordinal()] = 5;
            iArr[EzyGraphEnum.GraphEnum.TEXT_GRAPH.ordinal()] = 6;
            iArr[EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH.ordinal()] = 7;
            f11919a = iArr;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [q4.a, t4.b, t4.c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [q4.a, t4.a, t4.c] */
    /* JADX WARN: Type inference failed for: r0v17, types: [q4.a, r4.d] */
    /* JADX WARN: Type inference failed for: r0v20, types: [q4.a, r4.b] */
    /* renamed from: a */
    public final AbstractC8886a m11765a(InterfaceC9668d interfaceC9668d, EzyPageSnapshot.PageSnapshot.GraphSnapshot pageSnapshot) {
        AbstractC8886a c9136a;
        String strPath;
        ImageGraph imageGraph;
        ImageGraph imageGraph2;
        InterfaceC9668d sourceLoad = interfaceC9668d;
        Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
        Intrinsics.checkNotNullParameter(pageSnapshot, "pageSnapshot");
        EzyGraphEnum.GraphEnum graphEnumM7874J = pageSnapshot.m7874J();
        AbstractC8886a abstractC8886a = null;
        absolutePath = null;
        absolutePath = null;
        String absolutePath = null;
        switch (graphEnumM7874J == null ? -1 : a.f11919a[graphEnumM7874J.ordinal()]) {
            case 1:
                String strM7876L = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N, "pageSnapshot.outRect");
                c9136a = new C9136a(strM7876L, AbstractC7351l.m11775f(rectFM7878N), null, null, 12, null);
                C7350k c7350k = f11918a;
                EzyMatrix.Matrix matrixM7877M = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M, "pageSnapshot.matrix");
                c9136a.m15004u(c7350k.m11766b(matrixM7877M));
                abstractC8886a = c9136a;
                break;
            case 2:
                String strM7876L2 = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L2, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N2 = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N2, "pageSnapshot.outRect");
                RectF rectFM11775f = AbstractC7351l.m11775f(rectFM7878N2);
                String strM7882R = pageSnapshot.m7882R();
                Intrinsics.checkNotNullExpressionValue(strM7882R, "pageSnapshot.sourceFileName");
                sourceLoad = interfaceC9668d;
                ImageGraph imageGraph3 = new ImageGraph(strM7876L2, rectFM11775f, sourceLoad, strM7882R, pageSnapshot.m7883S());
                C7350k c7350k2 = f11918a;
                EzyMatrix.Matrix matrixM7877M2 = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M2, "pageSnapshot.matrix");
                imageGraph3.m15004u(c7350k2.m11766b(matrixM7877M2));
                String filePath = pageSnapshot.m7873I();
                if (filePath != null) {
                    Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
                    if (filePath.length() != 0 && (strPath = sourceLoad.path()) != null) {
                        absolutePath = new File(C9850c.f17405d.m16497a(strPath, DocumentType.IMAGE), filePath).getAbsolutePath();
                    }
                }
                imageGraph3.m15152L(absolutePath);
                imageGraph = imageGraph3;
                abstractC8886a = imageGraph;
                break;
            case 3:
                String strM7876L3 = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L3, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N3 = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N3, "pageSnapshot.outRect");
                ?? c9383b = new C9383b(strM7876L3, AbstractC7351l.m11775f(rectFM7878N3), interfaceC9668d, pageSnapshot.m7882R(), Integer.valueOf(pageSnapshot.m7883S()));
                C7350k c7350k3 = f11918a;
                EzyMatrix.Matrix matrixM7877M3 = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M3, "pageSnapshot.matrix");
                c9383b.m15004u(c7350k3.m11766b(matrixM7877M3));
                imageGraph2 = c9383b;
                if (pageSnapshot.hasPaint()) {
                    EzyPaint.Paint paintM7879O = pageSnapshot.m7879O();
                    Intrinsics.checkNotNullExpressionValue(paintM7879O, "pageSnapshot.paint");
                    c9383b.m15694L(AbstractC7351l.m11773d(paintM7879O), pageSnapshot.m7879O().m7970s(), pageSnapshot.m7879O().m7971t());
                    imageGraph2 = c9383b;
                }
                sourceLoad = interfaceC9668d;
                imageGraph = imageGraph2;
                abstractC8886a = imageGraph;
                break;
            case 4:
                String strM7876L4 = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L4, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N4 = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N4, "pageSnapshot.outRect");
                ?? c9382a = new C9382a(strM7876L4, AbstractC7351l.m11775f(rectFM7878N4), interfaceC9668d, pageSnapshot.m7882R(), Integer.valueOf(pageSnapshot.m7883S()));
                C7350k c7350k4 = f11918a;
                EzyMatrix.Matrix matrixM7877M4 = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M4, "pageSnapshot.matrix");
                c9382a.m15004u(c7350k4.m11766b(matrixM7877M4));
                imageGraph2 = c9382a;
                if (pageSnapshot.hasPaint()) {
                    EzyPaint.Paint paintM7879O2 = pageSnapshot.m7879O();
                    Intrinsics.checkNotNullExpressionValue(paintM7879O2, "pageSnapshot.paint");
                    c9382a.m15694L(AbstractC7351l.m11773d(paintM7879O2), pageSnapshot.m7879O().m7970s(), pageSnapshot.m7879O().m7971t());
                    imageGraph2 = c9382a;
                }
                sourceLoad = interfaceC9668d;
                imageGraph = imageGraph2;
                abstractC8886a = imageGraph;
                break;
            case 5:
                String strM7876L5 = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L5, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N5 = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N5, "pageSnapshot.outRect");
                c9136a = new GroupGraph(strM7876L5, AbstractC7351l.m11775f(rectFM7878N5), null, null, 12, null);
                C7350k c7350k5 = f11918a;
                EzyMatrix.Matrix matrixM7877M5 = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M5, "pageSnapshot.matrix");
                c9136a.m15004u(c7350k5.m11766b(matrixM7877M5));
                sourceLoad = interfaceC9668d;
                abstractC8886a = c9136a;
                break;
            case 6:
                String strM7876L6 = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L6, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N6 = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N6, "pageSnapshot.outRect");
                sourceLoad = interfaceC9668d;
                ?? c9008d = new C9008d(strM7876L6, AbstractC7351l.m11775f(rectFM7878N6), sourceLoad, pageSnapshot.m7882R(), Integer.valueOf(pageSnapshot.m7883S()));
                C7350k c7350k6 = f11918a;
                EzyMatrix.Matrix matrixM7877M6 = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M6, "pageSnapshot.matrix");
                c9008d.m15004u(c7350k6.m11766b(matrixM7877M6));
                EzyPaint.Paint paintM7879O3 = pageSnapshot.m7879O();
                Intrinsics.checkNotNullExpressionValue(paintM7879O3, "pageSnapshot.paint");
                c9008d.m15162L(AbstractC7351l.m11773d(paintM7879O3));
                c9008d.m15161K(pageSnapshot.getContent());
                imageGraph = c9008d;
                abstractC8886a = imageGraph;
                break;
            case 7:
                String strM7876L7 = pageSnapshot.m7876L();
                Intrinsics.checkNotNullExpressionValue(strM7876L7, "pageSnapshot.id");
                EzyRectF.RectF rectFM7878N7 = pageSnapshot.m7878N();
                Intrinsics.checkNotNullExpressionValue(rectFM7878N7, "pageSnapshot.outRect");
                ?? c9006b = new C9006b(strM7876L7, AbstractC7351l.m11775f(rectFM7878N7), sourceLoad, pageSnapshot.m7882R(), Integer.valueOf(pageSnapshot.m7883S()));
                C7350k c7350k7 = f11918a;
                EzyMatrix.Matrix matrixM7877M7 = pageSnapshot.m7877M();
                Intrinsics.checkNotNullExpressionValue(matrixM7877M7, "pageSnapshot.matrix");
                c9006b.m15004u(c7350k7.m11766b(matrixM7877M7));
                EzyPaint.Paint paintM7879O4 = pageSnapshot.m7879O();
                Intrinsics.checkNotNullExpressionValue(paintM7879O4, "pageSnapshot.paint");
                c9006b.m15157M(AbstractC7351l.m11773d(paintM7879O4));
                List<EzyPointF.PointF> listM7881Q = pageSnapshot.m7881Q();
                Intrinsics.checkNotNullExpressionValue(listM7881Q, "pageSnapshot.pointListList");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM7881Q, 10));
                for (EzyPointF.PointF it : listM7881Q) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(AbstractC7351l.m11774e(it));
                }
                c9006b.m15158N(arrayList);
                imageGraph2 = c9006b;
                sourceLoad = interfaceC9668d;
                imageGraph = imageGraph2;
                abstractC8886a = imageGraph;
                break;
        }
        for (EzyPageSnapshot.PageSnapshot.GraphSnapshot childPageSnapshot : pageSnapshot.getChildGraphList()) {
            Intrinsics.checkNotNullExpressionValue(childPageSnapshot, "childPageSnapshot");
            AbstractC8886a abstractC8886aM11765a = m11765a(sourceLoad, childPageSnapshot);
            if (abstractC8886aM11765a != null && abstractC8886a != null) {
                abstractC8886a.mo6753s(abstractC8886aM11765a);
            }
        }
        return abstractC8886a;
    }

    /* renamed from: b */
    public final Matrix m11766b(EzyMatrix.Matrix matrix) {
        float[] fArr = {matrix.getScaleX(), matrix.m7732z(), matrix.m7723B(), matrix.m7722A(), matrix.getScaleY(), matrix.m7724C(), matrix.m7729w(), matrix.m7730x(), matrix.m7731y()};
        Matrix matrix2 = new Matrix();
        matrix2.setValues(fArr);
        return matrix2;
    }

    /* renamed from: c */
    public final Path m11767c(List pointList) {
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
    public final RectF m11768d(List pointList) {
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
            m11767c(pointList).computeBounds(rectF, true);
            return rectF;
        }
        float f10 = pointF.x;
        float f11 = 1;
        float f12 = pointF.y;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        return rectF;
    }

    /* renamed from: e */
    public final EzyPageSnapshot.PageSnapshot m11769e(String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (!new File(filePath).exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        EzyPageSnapshot.PageSnapshot pageSnapshotM7840w = EzyPageSnapshot.PageSnapshot.m7840w(fileInputStream);
        fileInputStream.close();
        return pageSnapshotM7840w;
    }
}
