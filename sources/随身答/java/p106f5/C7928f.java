package p106f5;

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
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p117g5.InterfaceC8055c;
import p127h5.C8099b;
import p127h5.C8101d;
import p127h5.InterfaceC8100c;
import p147j5.C8215b;
import p169l5.InterfaceC8891e;
import p189n5.C9097c;
import p263u5.AbstractC9694m;
import p263u5.AbstractC9695n;

/* renamed from: f5.f */
/* loaded from: classes4.dex */
public final class C7928f {

    /* renamed from: a */
    public final InterfaceC8891e f13373a;

    /* renamed from: b */
    public final InterfaceC0039c f13374b;

    public C7928f(InterfaceC8891e sourceLoader, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13373a = sourceLoader;
        this.f13374b = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12483a(EzyCommand.CommandSource.CommandInfo.GraphChange data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        m12484b(data);
        return null;
    }

    /* renamed from: b */
    public void m12484b(EzyCommand.CommandSource.CommandInfo.GraphChange data) {
        List<InterfaceC8055c> listMo12796e;
        String strM14637a;
        Object next;
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8055c interfaceC8055cMo210m = this.f13374b.mo210m();
        if (interfaceC8055cMo210m == null || (listMo12796e = interfaceC8055cMo210m.mo12796e()) == null) {
            return;
        }
        for (InterfaceC8055c interfaceC8055c : listMo12796e) {
            if (Intrinsics.areEqual(interfaceC8055c.getId(), data.m8312H())) {
                if ((interfaceC8055c instanceof InterfaceC8100c) && data.hasOutRect()) {
                    EzyRectF.RectF rectFM8313I = data.m8313I();
                    Intrinsics.checkNotNullExpressionValue(rectFM8313I, "data.outRect");
                    ((InterfaceC8100c) interfaceC8055c).mo7862n(AbstractC9694m.m16198f(rectFM8313I));
                }
                if (interfaceC8055c instanceof C8101d) {
                    String content = data.getContent();
                    Intrinsics.checkNotNullExpressionValue(content, "data.content");
                    if (!StringsKt.isBlank(content)) {
                        ((C8101d) interfaceC8055c).m12944J(data.getContent());
                    }
                    if (data.m8316L()) {
                        EzyPaint.Paint paintM8314J = data.m8314J();
                        Intrinsics.checkNotNullExpressionValue(paintM8314J, "data.paint");
                        ((C8101d) interfaceC8055c).m12945K(AbstractC9694m.m16196d(paintM8314J));
                    }
                } else if (interfaceC8055c instanceof C8099b) {
                    List pointsList = data.getPointsList();
                    Intrinsics.checkNotNullExpressionValue(pointsList, "data.pointsList");
                    if (!pointsList.isEmpty()) {
                        C8099b c8099b = (C8099b) interfaceC8055c;
                        List<EzyPointF.PointF> pointsList2 = data.getPointsList();
                        Intrinsics.checkNotNullExpressionValue(pointsList2, "data.pointsList");
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointsList2, 10));
                        for (EzyPointF.PointF it : pointsList2) {
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            arrayList.add(AbstractC9694m.m16197e(it));
                        }
                        c8099b.m12941M(arrayList);
                    }
                    if (data.m8316L()) {
                        EzyPaint.Paint paintM8314J2 = data.m8314J();
                        Intrinsics.checkNotNullExpressionValue(paintM8314J2, "data.paint");
                        ((C8099b) interfaceC8055c).m12940L(AbstractC9694m.m16196d(paintM8314J2));
                    }
                } else if (interfaceC8055c instanceof ImageGraph) {
                    if (data.m8317M()) {
                        EzyMatrix.Matrix matrixM8315K = data.m8315K();
                        Intrinsics.checkNotNullExpressionValue(matrixM8315K, "data.renderMatrix");
                        ((ImageGraph) interfaceC8055c).m7868z(AbstractC9695n.m16202d(matrixM8315K));
                    }
                    String strM8310F = data.m8310F();
                    Intrinsics.checkNotNullExpressionValue(strM8310F, "data.filePath");
                    if (!StringsKt.isBlank(strM8310F)) {
                        String strPath = this.f13373a.path();
                        if (strPath == null || (strM14637a = C9097c.f15322d.m14637a(strPath, DocumentType.IMAGE)) == null) {
                            return;
                        }
                        String absolutePath = new File(strM14637a, data.m8310F()).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "absolutePath");
                        ((ImageGraph) interfaceC8055c).m7871N(absolutePath);
                    }
                }
                this.f13374b.mo202e();
                return;
            }
            if (interfaceC8055c instanceof GroupGraph) {
                GroupGraph groupGraph = (GroupGraph) interfaceC8055c;
                Iterator it2 = groupGraph.mo12796e().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) next;
                    if (Intrinsics.areEqual(interfaceC8055c2.getId(), data.m8312H()) && (interfaceC8055c2 instanceof C8215b)) {
                        break;
                    }
                }
                InterfaceC8055c interfaceC8055c3 = (InterfaceC8055c) next;
                if (interfaceC8055c3 != null) {
                    C8215b c8215b = (C8215b) interfaceC8055c3;
                    if (data.m8316L()) {
                        EzyPaint.Paint paintM8314J3 = data.m8314J();
                        Intrinsics.checkNotNullExpressionValue(paintM8314J3, "data.paint");
                        c8215b.m13245K(AbstractC9694m.m16196d(paintM8314J3), data.m8314J().m9105v(), data.m8314J().m9106w());
                    }
                    groupGraph.mo7860k(true);
                    this.f13374b.mo202e();
                    return;
                }
            }
        }
    }
}
