package p199p4;

import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p077e5.AbstractC7351l;
import p077e5.AbstractC7352m;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p210q4.InterfaceC8888c;
import p221r4.C9006b;
import p221r4.C9008d;
import p221r4.InterfaceC9007c;
import p243t4.C9383b;
import p265v4.InterfaceC9668d;
import p285x4.C9850c;

/* renamed from: p4.f */
/* loaded from: classes4.dex */
public final class C8828f {

    /* renamed from: a */
    public final InterfaceC9668d f15025a;

    /* renamed from: b */
    public final InterfaceC7880c f15026b;

    public C8828f(InterfaceC9668d sourceLoader, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15025a = sourceLoader;
        this.f15026b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14792a(EzyCommand.CommandSource.CommandInfo.GraphChange data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        m14793b(data);
        return null;
    }

    /* renamed from: b */
    public void m14793b(EzyCommand.CommandSource.CommandInfo.GraphChange data) {
        List<InterfaceC8888c> listMo14995f;
        String strM16497a;
        Object next;
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8888c interfaceC8888cMo13449n = this.f15026b.mo13449n();
        if (interfaceC8888cMo13449n == null || (listMo14995f = interfaceC8888cMo13449n.mo14995f()) == null) {
            return;
        }
        for (InterfaceC8888c interfaceC8888c : listMo14995f) {
            if (Intrinsics.areEqual(interfaceC8888c.getId(), data.m7196E())) {
                if ((interfaceC8888c instanceof InterfaceC9007c) && data.hasOutRect()) {
                    EzyRectF.RectF rectFM7197F = data.m7197F();
                    Intrinsics.checkNotNullExpressionValue(rectFM7197F, "data.outRect");
                    ((InterfaceC9007c) interfaceC8888c).mo6750o(AbstractC7351l.m11775f(rectFM7197F));
                }
                if (interfaceC8888c instanceof C9008d) {
                    String content = data.getContent();
                    Intrinsics.checkNotNullExpressionValue(content, "data.content");
                    if (!StringsKt.isBlank(content)) {
                        ((C9008d) interfaceC8888c).m15161K(data.getContent());
                    }
                    if (data.hasPaint()) {
                        EzyPaint.Paint paintM7198G = data.m7198G();
                        Intrinsics.checkNotNullExpressionValue(paintM7198G, "data.paint");
                        ((C9008d) interfaceC8888c).m15162L(AbstractC7351l.m11773d(paintM7198G));
                    }
                } else if (interfaceC8888c instanceof C9006b) {
                    List pointsList = data.getPointsList();
                    Intrinsics.checkNotNullExpressionValue(pointsList, "data.pointsList");
                    if (!pointsList.isEmpty()) {
                        C9006b c9006b = (C9006b) interfaceC8888c;
                        List<EzyPointF.PointF> pointsList2 = data.getPointsList();
                        Intrinsics.checkNotNullExpressionValue(pointsList2, "data.pointsList");
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointsList2, 10));
                        for (EzyPointF.PointF it : pointsList2) {
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            arrayList.add(AbstractC7351l.m11774e(it));
                        }
                        c9006b.m15158N(arrayList);
                    }
                    if (data.hasPaint()) {
                        EzyPaint.Paint paintM7198G2 = data.m7198G();
                        Intrinsics.checkNotNullExpressionValue(paintM7198G2, "data.paint");
                        ((C9006b) interfaceC8888c).m15157M(AbstractC7351l.m11773d(paintM7198G2));
                    }
                } else if (interfaceC8888c instanceof ImageGraph) {
                    if (data.m7200I()) {
                        EzyMatrix.Matrix matrixM7199H = data.m7199H();
                        Intrinsics.checkNotNullExpressionValue(matrixM7199H, "data.renderMatrix");
                        ((ImageGraph) interfaceC8888c).m6738A(AbstractC7352m.m11779d(matrixM7199H));
                    }
                    String strM7194C = data.m7194C();
                    Intrinsics.checkNotNullExpressionValue(strM7194C, "data.filePath");
                    if (!StringsKt.isBlank(strM7194C)) {
                        String strPath = this.f15025a.path();
                        if (strPath == null || (strM16497a = C9850c.f17405d.m16497a(strPath, DocumentType.IMAGE)) == null) {
                            return;
                        }
                        String absolutePath = new File(strM16497a, data.m7194C()).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "absolutePath");
                        ((ImageGraph) interfaceC8888c).m6759O(absolutePath);
                    }
                }
                this.f15026b.mo13440e();
                return;
            }
            if (interfaceC8888c instanceof GroupGraph) {
                GroupGraph groupGraph = (GroupGraph) interfaceC8888c;
                Iterator it2 = groupGraph.mo14995f().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) next;
                    if (Intrinsics.areEqual(interfaceC8888c2.getId(), data.m7196E()) && (interfaceC8888c2 instanceof C9383b)) {
                        break;
                    }
                }
                InterfaceC8888c interfaceC8888c3 = (InterfaceC8888c) next;
                if (interfaceC8888c3 != null) {
                    C9383b c9383b = (C9383b) interfaceC8888c3;
                    if (data.hasPaint()) {
                        EzyPaint.Paint paintM7198G3 = data.m7198G();
                        Intrinsics.checkNotNullExpressionValue(paintM7198G3, "data.paint");
                        c9383b.m15694L(AbstractC7351l.m11773d(paintM7198G3), data.m7198G().m7970s(), data.m7198G().m7971t());
                    }
                    groupGraph.mo6748l(true);
                    this.f15026b.mo13440e();
                    return;
                }
            }
        }
    }
}
