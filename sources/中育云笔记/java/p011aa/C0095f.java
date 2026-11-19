package p011aa;

import ba.InterfaceC5181c;
import ca.C5412b;
import ca.C5414d;
import ca.InterfaceC5413c;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import ga.InterfaceC9284d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import na.AbstractC10351n;
import p134ea.C9112b;
import p194ia.C9619c;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10980x;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.f */
/* loaded from: classes5.dex */
public final class C0095f {

    /* renamed from: a */
    public final InterfaceC9284d f98a;

    /* renamed from: b */
    public final InterfaceC11552c f99b;

    public C0095f(InterfaceC9284d sourceLoader, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f98a = sourceLoader;
        this.f99b = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m261a(EzyCommand.CommandSource.CommandInfo.GraphChange data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        m262b(data);
        return null;
    }

    /* renamed from: b */
    public void m262b(EzyCommand.CommandSource.CommandInfo.GraphChange data) {
        List<InterfaceC5181c> listMo2717f;
        String strM18862a;
        Object next;
        AbstractC9979u.m20294g(data, "data");
        InterfaceC5181c interfaceC5181cMo25454n = this.f99b.mo25454n();
        if (interfaceC5181cMo25454n == null || (listMo2717f = interfaceC5181cMo25454n.mo2717f()) == null) {
            return;
        }
        for (InterfaceC5181c interfaceC5181c : listMo2717f) {
            if (AbstractC9979u.m20289b(interfaceC5181c.getId(), data.m14931E())) {
                if ((interfaceC5181c instanceof InterfaceC5413c) && data.hasOutRect()) {
                    EzyRectF.RectF rectFM14932F = data.m14932F();
                    AbstractC9979u.m20293f(rectFM14932F, "data.outRect");
                    ((InterfaceC5413c) interfaceC5181c).mo2875p(AbstractC10350m.m21658f(rectFM14932F));
                }
                if (interfaceC5181c instanceof C5414d) {
                    String content = data.getContent();
                    AbstractC9979u.m20293f(content, "data.content");
                    if (!AbstractC10793c0.m23132h0(content)) {
                        ((C5414d) interfaceC5181c).m2879G(data.getContent());
                    }
                    if (data.m14935I()) {
                        EzyPaint.Paint paintM14933G = data.m14933G();
                        AbstractC9979u.m20293f(paintM14933G, "data.paint");
                        ((C5414d) interfaceC5181c).m2880H(AbstractC10350m.m21656d(paintM14933G));
                    }
                } else if (interfaceC5181c instanceof C5412b) {
                    List pointsList = data.getPointsList();
                    AbstractC9979u.m20293f(pointsList, "data.pointsList");
                    if (!pointsList.isEmpty()) {
                        C5412b c5412b = (C5412b) interfaceC5181c;
                        List pointsList2 = data.getPointsList();
                        AbstractC9979u.m20293f(pointsList2, "data.pointsList");
                        List<EzyPointF.PointF> list = pointsList2;
                        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
                        for (EzyPointF.PointF it : list) {
                            AbstractC9979u.m20293f(it, "it");
                            arrayList.add(AbstractC10350m.m21657e(it));
                        }
                        c5412b.m2874J(arrayList);
                    }
                    if (data.m14935I()) {
                        EzyPaint.Paint paintM14933G2 = data.m14933G();
                        AbstractC9979u.m20293f(paintM14933G2, "data.paint");
                        ((C5412b) interfaceC5181c).m2873I(AbstractC10350m.m21656d(paintM14933G2));
                    }
                } else if (interfaceC5181c instanceof ImageGraph) {
                    if (data.m14936J()) {
                        EzyMatrix.Matrix matrixM14934H = data.m14934H();
                        AbstractC9979u.m20293f(matrixM14934H, "data.renderMatrix");
                        ((ImageGraph) interfaceC5181c).m14492z(AbstractC10351n.m21665g(matrixM14934H));
                    }
                    String strM14929C = data.m14929C();
                    AbstractC9979u.m20293f(strM14929C, "data.filePath");
                    if (!AbstractC10793c0.m23132h0(strM14929C)) {
                        String strPath = this.f98a.path();
                        if (strPath == null || (strM18862a = C9619c.f22151d.m18862a(strPath, DocumentType.IMAGE)) == null) {
                            return;
                        }
                        String absolutePath = new File(strM18862a, data.m14929C()).getAbsolutePath();
                        AbstractC9979u.m20293f(absolutePath, "absolutePath");
                        ((ImageGraph) interfaceC5181c).m14495K(absolutePath);
                    }
                }
                this.f99b.mo25447g();
                return;
            }
            if (interfaceC5181c instanceof GroupGraph) {
                GroupGraph groupGraph = (GroupGraph) interfaceC5181c;
                Iterator it2 = groupGraph.mo2717f().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) next;
                    if (AbstractC9979u.m20289b(interfaceC5181c2.getId(), data.m14931E()) && (interfaceC5181c2 instanceof C9112b)) {
                        break;
                    }
                }
                InterfaceC5181c interfaceC5181c3 = (InterfaceC5181c) next;
                if (interfaceC5181c3 != null) {
                    C9112b c9112b = (C9112b) interfaceC5181c3;
                    if (data.m14935I()) {
                        EzyPaint.Paint paintM14933G3 = data.m14933G();
                        AbstractC9979u.m20293f(paintM14933G3, "data.paint");
                        c9112b.m17923L(AbstractC10350m.m21656d(paintM14933G3), data.m14933G().m15721n(), data.m14933G().m15722o());
                    }
                    groupGraph.mo2876l(true);
                    this.f99b.mo25447g();
                    return;
                }
            }
        }
    }
}
