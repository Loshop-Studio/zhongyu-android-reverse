package p322r9;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyRectF;
import com.zykj.board.EzyTouchEvent;
import ga.InterfaceC9284d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10215c;
import ma.InterfaceC10216d;
import ma.InterfaceC10217e;
import na.AbstractC10350m;
import na.AbstractC10351n;
import na.C10347j;
import p181hd.InterfaceC9540l;
import p194ia.C9619c;
import p307q9.C10762b;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p362u9.C11373a;
import p377v9.C11551b;
import p377v9.InterfaceC11552c;
import p422y9.C11932k;

/* renamed from: r9.a */
/* loaded from: classes5.dex */
public final class C10917a implements InterfaceC10918b {

    /* renamed from: a */
    public final C11551b f26348a;

    /* renamed from: b */
    public final C10762b f26349b;

    /* renamed from: c */
    public final C11373a f26350c;

    /* renamed from: d */
    public final InterfaceC9284d f26351d;

    /* renamed from: e */
    public final C9619c f26352e;

    /* renamed from: f */
    public final C11932k f26353f;

    /* renamed from: g */
    public InterfaceC10919c f26354g;

    /* renamed from: h */
    public final C10921e f26355h;

    /* renamed from: i */
    public InterfaceC10217e f26356i;

    /* renamed from: j */
    public InterfaceC10216d f26357j;

    /* renamed from: k */
    public ArrayList f26358k;

    /* renamed from: l */
    public InterfaceC9540l f26359l;

    public C10917a(C11551b graphControl, C10762b boardConfig, C11373a matrixAdapter, InterfaceC9284d sourceLoader, C9619c c9619c, C11932k c11932k) {
        AbstractC9979u.m20294g(graphControl, "graphControl");
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        this.f26348a = graphControl;
        this.f26349b = boardConfig;
        this.f26350c = matrixAdapter;
        this.f26351d = sourceLoader;
        this.f26352e = c9619c;
        this.f26353f = c11932k;
        C10921e c10921e = new C10921e();
        this.f26355h = c10921e;
        this.f26358k = new ArrayList();
        c10921e.m23814e(this);
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: a */
    public InterfaceC11552c mo23761a() {
        return this.f26348a;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: b */
    public void mo23762b(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix, List matrixList) {
        CommandRecord commandRecordM18860c;
        AbstractC9979u.m20294g(originMatrix, "originMatrix");
        AbstractC9979u.m20294g(lastMatrix, "lastMatrix");
        AbstractC9979u.m20294g(matrixList, "matrixList");
        C9619c c9619c = this.f26352e;
        if (c9619c == null || (commandRecordM18860c = c9619c.m18860c()) == null) {
            return;
        }
        commandRecordM18860c.m14614z(originMatrix, lastMatrix, matrixList, System.currentTimeMillis());
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: c */
    public void mo23763c(List graphList, List matrixList) {
        CommandRecord commandRecordM18860c;
        AbstractC9979u.m20294g(graphList, "graphList");
        AbstractC9979u.m20294g(matrixList, "matrixList");
        C9619c c9619c = this.f26352e;
        if (c9619c == null || (commandRecordM18860c = c9619c.m18860c()) == null) {
            return;
        }
        List list = graphList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5181c) it.next()).mo2719h().build());
        }
        commandRecordM18860c.m14598L(arrayList, matrixList, System.currentTimeMillis());
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: d */
    public InterfaceC10217e mo23764d() {
        return this.f26356i;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: e */
    public AbstractC5179a mo23765e(EzyGraphEnum.GraphEnum graphType, List eventList, EzyPaint.Paint paint, String parentGraphId, String graphId) {
        CommandRecord commandRecordM18860c;
        CommandInfoEntity commandInfoEntityM14594C;
        AbstractC9979u.m20294g(graphType, "graphType");
        AbstractC9979u.m20294g(eventList, "eventList");
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        AbstractC9979u.m20294g(graphId, "graphId");
        C9619c c9619c = this.f26352e;
        if (c9619c == null || (commandRecordM18860c = c9619c.m18860c()) == null || (commandInfoEntityM14594C = commandRecordM18860c.m14594C(parentGraphId, graphType, eventList, paint, graphId, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandInfoEntityM14594C.m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        return graphBuildFactory.mo14497c(graphData, this.f26351d);
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: f */
    public void mo23766f(List eventList, EzyPaint.Paint paint) {
        CommandRecord commandRecordM18860c;
        AbstractC9979u.m20294g(eventList, "eventList");
        AbstractC9979u.m20294g(paint, "paint");
        C9619c c9619c = this.f26352e;
        if (c9619c == null || (commandRecordM18860c = c9619c.m18860c()) == null) {
            return;
        }
        commandRecordM18860c.m14604V(eventList, paint, System.currentTimeMillis());
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: g */
    public C11373a mo23767g() {
        return this.f26350c;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: h */
    public void mo23768h(InterfaceC5181c graph, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2) throws ExecutionException, InterruptedException {
        CommandRecord commandRecordM18860c;
        ArrayList arrayList;
        AbstractC9979u.m20294g(graph, "graph");
        AbstractC9979u.m20294g(graphEnum, "graphEnum");
        C9619c c9619c = this.f26352e;
        if (c9619c == null || (commandRecordM18860c = c9619c.m18860c()) == null) {
            return;
        }
        String id2 = graph.getId();
        EzyRectF.RectF rectFM21655c = rectF != null ? AbstractC10350m.m21655c(rectF) : null;
        EzyPaint.Paint paintM21653a = paint != null ? AbstractC10350m.m21653a(paint, 1.0f, 0.0f) : null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC10350m.m21654b((PointF) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        commandRecordM18860c.m14601Q(id2, graphEnum, rectFM21655c, str, paintM21653a, arrayList, matrix != null ? AbstractC10351n.m21664f(matrix, System.currentTimeMillis()) : null, str2, System.currentTimeMillis());
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: i */
    public InterfaceC9540l mo23769i() {
        return this.f26359l;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: j */
    public C10762b mo23770j() {
        return this.f26349b;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: k */
    public void mo23771k(float f10, float f11, float f12, float f13, Paint paint, String content, InterfaceC9540l interfaceC9540l) {
        C9619c c9619c;
        CommandRecord commandRecordM18860c;
        CommandInfoEntity commandInfoEntityM14599N;
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(content, "content");
        String strMo25442b = this.f26348a.mo25442b();
        if (strMo25442b == null || (c9619c = this.f26352e) == null || (commandRecordM18860c = c9619c.m18860c()) == null || (commandInfoEntityM14599N = commandRecordM18860c.m14599N(strMo25442b, f10, f11, AbstractC10350m.m21653a(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandInfoEntityM14599N.m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        AbstractC5179a abstractC5179aMo14497c = graphBuildFactory.mo14497c(graphData, this.f26351d);
        if (abstractC5179aMo14497c != null) {
            float[] fArr = {f12, f13};
            AbstractC10351n.m21660b(mo23767g().m25311b()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            mo23763c(AbstractC10976v.m24126e(abstractC5179aMo14497c), AbstractC10978w.m24141s(AbstractC10351n.m21664f(matrix, System.currentTimeMillis())));
            abstractC5179aMo14497c.mo2716e(matrix);
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(abstractC5179aMo14497c);
            }
        }
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: l */
    public void mo23772l() {
        C11932k c11932k;
        InterfaceC5181c interfaceC5181cMo25454n = this.f26348a.mo25454n();
        if (interfaceC5181cMo25454n == null || (c11932k = this.f26353f) == null) {
            return;
        }
        c11932k.m26483d((AbstractC5179a) interfaceC5181cMo25454n, this.f26348a.m25426L(), this.f26348a.m25427M());
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: m */
    public void mo23773m(float f10, float f11, float f12, float f13, int i10, List pointList, Paint paint, InterfaceC9540l interfaceC9540l) {
        C9619c c9619c;
        CommandRecord commandRecordM18860c;
        CommandInfoEntity commandInfoEntityM14597J;
        AbstractC9979u.m20294g(pointList, "pointList");
        AbstractC9979u.m20294g(paint, "paint");
        String strMo25442b = this.f26348a.mo25442b();
        if (strMo25442b == null || (c9619c = this.f26352e) == null || (commandRecordM18860c = c9619c.m18860c()) == null || (commandInfoEntityM14597J = commandRecordM18860c.m14597J(strMo25442b, f10, f11, i10, pointList, AbstractC10350m.m21653a(paint, 1.0f, 0.0f), System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandInfoEntityM14597J.m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        AbstractC5179a abstractC5179aMo14497c = graphBuildFactory.mo14497c(graphData, this.f26351d);
        if (abstractC5179aMo14497c != null) {
            float[] fArr = {f12, f13};
            AbstractC10351n.m21660b(mo23767g().m25311b()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            mo23763c(AbstractC10976v.m24126e(abstractC5179aMo14497c), AbstractC10978w.m24141s(AbstractC10351n.m21664f(matrix, System.currentTimeMillis())));
            abstractC5179aMo14497c.mo2716e(matrix);
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(abstractC5179aMo14497c);
            }
        }
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: n */
    public InterfaceC5181c mo23774n(String parentGraphId) throws ExecutionException, InterruptedException {
        CommandRecord commandRecordM18860c;
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        C9619c c9619c = this.f26352e;
        if (c9619c == null || (commandRecordM18860c = c9619c.m18860c()) == null) {
            return null;
        }
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.GROUP_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m15793k().build();
        AbstractC9979u.m20293f(rectFBuild, "newBuilder().build()");
        CommandInfoEntity commandInfoEntityM14593B = commandRecordM18860c.m14593B(parentGraphId, graphEnum, rectFBuild, System.currentTimeMillis());
        if (commandInfoEntityM14593B == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandInfoEntityM14593B.m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        AbstractC5179a abstractC5179aMo14497c = graphBuildFactory.mo14497c(graphData, this.f26351d);
        if (abstractC5179aMo14497c == null) {
            return null;
        }
        this.f26348a.mo25446f(graphData.m15000F(), abstractC5179aMo14497c);
        return abstractC5179aMo14497c;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: o */
    public void mo23775o(List graphList, long j10) {
        CommandRecord commandRecordM18860c;
        AbstractC9979u.m20294g(graphList, "graphList");
        C9619c c9619c = this.f26352e;
        if (c9619c != null && (commandRecordM18860c = c9619c.m18860c()) != null) {
            List list = graphList;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC5181c) it.next()).mo2719h().build());
            }
            commandRecordM18860c.m14608b0(arrayList, j10);
        }
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it2.next();
            ArrayList arrayList2 = this.f26358k;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((InterfaceC10215c) obj).mo16936a(interfaceC5181c);
            }
        }
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: p */
    public InterfaceC10216d mo23776p() {
        return this.f26357j;
    }

    @Override // p322r9.InterfaceC10918b
    /* renamed from: q */
    public InterfaceC9284d mo23777q() {
        return this.f26351d;
    }

    /* renamed from: r */
    public final InterfaceC10919c m23778r() {
        return this.f26355h.m23812c(this);
    }

    /* renamed from: s */
    public final ArrayList m23779s() {
        return this.f26358k;
    }

    /* renamed from: t */
    public final C10921e m23780t() {
        return this.f26355h;
    }

    /* renamed from: u */
    public final void m23781u(MotionEvent motionEvent) {
        InterfaceC10919c interfaceC10919c;
        AbstractC9979u.m20294g(motionEvent, "motionEvent");
        EzyTouchEvent.TouchEvent touchEventM21643b = C10347j.f24654a.m21643b(motionEvent, AbstractC10351n.m21660b(this.f26350c.m25311b()));
        int action = touchEventM21643b.getAction();
        if (action == 0) {
            InterfaceC10919c interfaceC10919cM23811b = this.f26355h.m23811b(this);
            this.f26354g = interfaceC10919cM23811b;
            if (interfaceC10919cM23811b != null) {
                interfaceC10919cM23811b.mo13723e(touchEventM21643b);
                return;
            }
            return;
        }
        if (action == 1) {
            InterfaceC10919c interfaceC10919c2 = this.f26354g;
            if (interfaceC10919c2 != null) {
                interfaceC10919c2.mo13720b(touchEventM21643b);
            }
            this.f26354g = null;
            return;
        }
        if (action == 2) {
            InterfaceC10919c interfaceC10919c3 = this.f26354g;
            if (interfaceC10919c3 != null) {
                interfaceC10919c3.mo13722d(touchEventM21643b);
                return;
            }
            return;
        }
        if (action != 5) {
            if (action == 6 && (interfaceC10919c = this.f26354g) != null) {
                interfaceC10919c.mo13721c(touchEventM21643b);
                return;
            }
            return;
        }
        InterfaceC10919c interfaceC10919c4 = this.f26354g;
        if (interfaceC10919c4 != null) {
            interfaceC10919c4.mo13719a(touchEventM21643b);
        }
    }

    /* renamed from: v */
    public final void m23782v(InterfaceC10216d interfaceC10216d) {
        this.f26357j = interfaceC10216d;
    }

    /* renamed from: w */
    public final void m23783w(InterfaceC9540l interfaceC9540l) {
        this.f26359l = interfaceC9540l;
    }

    /* renamed from: x */
    public final void m23784x(InterfaceC10217e interfaceC10217e) {
        this.f26356i = interfaceC10217e;
    }

    public /* synthetic */ C10917a(C11551b c11551b, C10762b c10762b, C11373a c11373a, InterfaceC9284d interfaceC9284d, C9619c c9619c, C11932k c11932k, int i10, AbstractC9972n abstractC9972n) {
        this(c11551b, c10762b, c11373a, interfaceC9284d, (i10 & 16) != 0 ? null : c9619c, (i10 & 32) != 0 ? null : c11932k);
    }
}
