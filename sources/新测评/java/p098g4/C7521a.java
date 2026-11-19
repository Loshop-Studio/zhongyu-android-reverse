package p098g4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyRectF;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5120c;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5122e;
import p035c5.InterfaceC5123f;
import p077e5.AbstractC7351l;
import p077e5.AbstractC7352m;
import p077e5.C7348i;
import p131j4.C7792a;
import p142k4.C7879b;
import p142k4.InterfaceC7880c;
import p177n4.C8626f;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;
import p285x4.C9850c;

/* renamed from: g4.a */
/* loaded from: classes4.dex */
public final class C7521a implements InterfaceC7522b {

    /* renamed from: a */
    public final C7879b f12383a;

    /* renamed from: b */
    public final BoardConfig f12384b;

    /* renamed from: c */
    public final C7792a f12385c;

    /* renamed from: d */
    public final InterfaceC9668d f12386d;

    /* renamed from: e */
    public final C9850c f12387e;

    /* renamed from: f */
    public final C8626f f12388f;

    /* renamed from: g */
    public InterfaceC7523c f12389g;

    /* renamed from: h */
    public final C7525e f12390h;

    /* renamed from: i */
    public InterfaceC5123f f12391i;

    /* renamed from: j */
    public InterfaceC5122e f12392j;

    /* renamed from: k */
    public InterfaceC5121d f12393k;

    /* renamed from: l */
    public ArrayList f12394l;

    /* renamed from: m */
    public Function1 f12395m;

    public C7521a(C7879b graphControl, BoardConfig boardConfig, C7792a matrixAdapter, InterfaceC9668d sourceLoader, C9850c c9850c, C8626f c8626f) {
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        this.f12383a = graphControl;
        this.f12384b = boardConfig;
        this.f12385c = matrixAdapter;
        this.f12386d = sourceLoader;
        this.f12387e = c9850c;
        this.f12388f = c8626f;
        C7525e c7525e = new C7525e();
        this.f12390h = c7525e;
        this.f12394l = new ArrayList();
        c7525e.m12290d(this);
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: a */
    public InterfaceC7880c mo12236a() {
        return this.f12383a;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: b */
    public void mo12237b(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix, List matrixList) {
        CommandRecord commandRecordM16495b;
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        C9850c c9850c = this.f12387e;
        if (c9850c == null || (commandRecordM16495b = c9850c.m16495b()) == null) {
            return;
        }
        commandRecordM16495b.m6877z(originMatrix, lastMatrix, matrixList, System.currentTimeMillis());
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: c */
    public void mo12238c(List graphList, List matrixList) {
        CommandRecord commandRecordM16495b;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        C9850c c9850c = this.f12387e;
        if (c9850c == null || (commandRecordM16495b = c9850c.m16495b()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8888c) it.next()).mo14997h().build());
        }
        commandRecordM16495b.m6862L(arrayList, matrixList, System.currentTimeMillis());
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: d */
    public InterfaceC5122e mo12239d() {
        return this.f12392j;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: e */
    public InterfaceC5123f mo12240e() {
        return this.f12391i;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: f */
    public AbstractC8886a mo12241f(EzyGraphEnum.GraphEnum graphType, List eventList, EzyPaint.Paint paint, String parentGraphId, String graphId) {
        CommandRecord commandRecordM16495b;
        CommandInfoEntity commandInfoEntityM6858C;
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        C9850c c9850c = this.f12387e;
        if (c9850c == null || (commandRecordM16495b = c9850c.m16495b()) == null || (commandInfoEntityM6858C = commandRecordM16495b.m6858C(parentGraphId, graphType, eventList, paint, graphId, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandInfoEntityM6858C.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        return graphBuildFactory.mo6761f(graphData, this.f12386d);
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: g */
    public void mo12242g(List eventList, EzyPaint.Paint paint) {
        CommandRecord commandRecordM16495b;
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        C9850c c9850c = this.f12387e;
        if (c9850c == null || (commandRecordM16495b = c9850c.m16495b()) == null) {
            return;
        }
        commandRecordM16495b.m6867U(eventList, paint, System.currentTimeMillis());
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: h */
    public C7792a mo12243h() {
        return this.f12385c;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: i */
    public void mo12244i(InterfaceC8888c graph, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2) throws ExecutionException, InterruptedException {
        CommandRecord commandRecordM16495b;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graphEnum, "graphEnum");
        C9850c c9850c = this.f12387e;
        if (c9850c == null || (commandRecordM16495b = c9850c.m16495b()) == null) {
            return;
        }
        String id = graph.getId();
        EzyRectF.RectF rectFM11772c = rectF != null ? AbstractC7351l.m11772c(rectF) : null;
        EzyPaint.Paint paintM11770a = paint != null ? AbstractC7351l.m11770a(paint, 1.0f, 0.0f) : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC7351l.m11771b((PointF) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        commandRecordM16495b.m6865Q(id, graphEnum, rectFM11772c, str, paintM11770a, arrayList, matrix != null ? AbstractC7352m.m11778c(matrix, System.currentTimeMillis()) : null, str2, System.currentTimeMillis());
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: j */
    public Function1 mo12245j() {
        return this.f12395m;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: k */
    public BoardConfig mo12246k() {
        return this.f12384b;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: l */
    public void mo12247l() {
        C8626f c8626f;
        InterfaceC8888c interfaceC8888cMo13449n = this.f12383a.mo13449n();
        if (interfaceC8888cMo13449n == null || (c8626f = this.f12388f) == null) {
            return;
        }
        c8626f.m14200c((AbstractC8886a) interfaceC8888cMo13449n, this.f12383a.getBackgroundColor(), this.f12383a.m13423J());
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: m */
    public InterfaceC8888c mo12248m(String parentGraphId) throws ExecutionException, InterruptedException {
        CommandRecord commandRecordM16495b;
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        C9850c c9850c = this.f12387e;
        if (c9850c == null || (commandRecordM16495b = c9850c.m16495b()) == null) {
            return null;
        }
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.GROUP_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m8043q().build();
        Intrinsics.checkNotNullExpressionValue(rectFBuild, "newBuilder().build()");
        CommandInfoEntity commandInfoEntityM6857B = commandRecordM16495b.m6857B(parentGraphId, graphEnum, rectFBuild, System.currentTimeMillis());
        if (commandInfoEntityM6857B == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandInfoEntityM6857B.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8886a abstractC8886aMo6761f = graphBuildFactory.mo6761f(graphData, this.f12386d);
        if (abstractC8886aMo6761f == null) {
            return null;
        }
        this.f12383a.mo13460y(graphData.m7265F(), abstractC8886aMo6761f);
        return abstractC8886aMo6761f;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: n */
    public void mo12249n(List graphList, long j10) {
        CommandRecord commandRecordM16495b;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        C9850c c9850c = this.f12387e;
        if (c9850c != null && (commandRecordM16495b = c9850c.m16495b()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC8888c) it.next()).mo14997h().build());
            }
            commandRecordM16495b.m6871a0(arrayList, j10);
        }
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it2.next();
            ArrayList arrayList2 = this.f12394l;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((InterfaceC5120c) obj).mo2775a(interfaceC8888c);
            }
        }
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: o */
    public InterfaceC5121d mo12250o() {
        return this.f12393k;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: p */
    public void mo12251p(float f10, float f11, float f12, float f13, Paint paint, String content, Function1 function1) {
        C9850c c9850c;
        CommandRecord commandRecordM16495b;
        CommandInfoEntity commandInfoEntityM6863N;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(content, "content");
        String strMo13437b = this.f12383a.mo13437b();
        if (strMo13437b == null || (c9850c = this.f12387e) == null || (commandRecordM16495b = c9850c.m16495b()) == null || (commandInfoEntityM6863N = commandRecordM16495b.m6863N(strMo13437b, f10, f11, AbstractC7351l.m11770a(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandInfoEntityM6863N.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8886a abstractC8886aMo6761f = graphBuildFactory.mo6761f(graphData, this.f12386d);
        if (abstractC8886aMo6761f != null) {
            float[] fArr = {f12, f13};
            AbstractC7352m.m11777b(mo12243h().m13188b()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            mo12238c(CollectionsKt.listOf(abstractC8886aMo6761f), CollectionsKt.mutableListOf(AbstractC7352m.m11778c(matrix, System.currentTimeMillis())));
            abstractC8886aMo6761f.mo6747e(matrix);
            if (function1 != null) {
                function1.invoke(abstractC8886aMo6761f);
            }
        }
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: q */
    public InterfaceC9668d mo12252q() {
        return this.f12386d;
    }

    @Override // p098g4.InterfaceC7522b
    /* renamed from: r */
    public void mo12253r(float f10, float f11, float f12, float f13, int i10, List pointList, Paint paint, Function1 function1) {
        C9850c c9850c;
        CommandRecord commandRecordM16495b;
        CommandInfoEntity commandInfoEntityM6861J;
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        String strMo13437b = this.f12383a.mo13437b();
        if (strMo13437b == null || (c9850c = this.f12387e) == null || (commandRecordM16495b = c9850c.m16495b()) == null || (commandInfoEntityM6861J = commandRecordM16495b.m6861J(strMo13437b, f10, f11, i10, pointList, AbstractC7351l.m11770a(paint, 1.0f, 0.0f), System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandInfoEntityM6861J.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8886a abstractC8886aMo6761f = graphBuildFactory.mo6761f(graphData, this.f12386d);
        if (abstractC8886aMo6761f != null) {
            float[] fArr = {f12, f13};
            AbstractC7352m.m11777b(mo12243h().m13188b()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            mo12238c(CollectionsKt.listOf(abstractC8886aMo6761f), CollectionsKt.mutableListOf(AbstractC7352m.m11778c(matrix, System.currentTimeMillis())));
            abstractC8886aMo6761f.mo6747e(matrix);
            if (function1 != null) {
                function1.invoke(abstractC8886aMo6761f);
            }
        }
    }

    /* renamed from: s */
    public final InterfaceC7523c m12254s() {
        return this.f12390h.m12289c(this);
    }

    /* renamed from: t */
    public final ArrayList m12255t() {
        return this.f12394l;
    }

    /* renamed from: u */
    public final C7525e m12256u() {
        return this.f12390h;
    }

    /* renamed from: v */
    public final void m12257v(InterfaceC7523c interfaceC7523c, MotionEvent motionEvent) {
        if (interfaceC7523c instanceof NewSelectAction) {
            ((NewSelectAction) interfaceC7523c).m6129T(motionEvent);
        }
    }

    /* renamed from: w */
    public final void m12258w(MotionEvent motionEvent) {
        InterfaceC7523c interfaceC7523c;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        EzyTouchEvent.TouchEvent touchEventM11761b = C7348i.f11916a.m11761b(motionEvent, AbstractC7352m.m11777b(this.f12385c.m13188b()));
        int action = touchEventM11761b.getAction();
        if (action == 0) {
            InterfaceC7523c interfaceC7523cM12288b = this.f12390h.m12288b(this);
            this.f12389g = interfaceC7523cM12288b;
            if (interfaceC7523cM12288b != null) {
                interfaceC7523cM12288b.mo5986e(touchEventM11761b);
            }
        } else if (action == 1) {
            InterfaceC7523c interfaceC7523c2 = this.f12389g;
            if (interfaceC7523c2 != null) {
                interfaceC7523c2.mo5983b(touchEventM11761b);
            }
            m12257v(this.f12389g, motionEvent);
            this.f12389g = null;
        } else if (action == 2) {
            InterfaceC7523c interfaceC7523c3 = this.f12389g;
            if (interfaceC7523c3 != null) {
                interfaceC7523c3.mo5985d(touchEventM11761b);
            }
        } else if (action == 5) {
            InterfaceC7523c interfaceC7523c4 = this.f12389g;
            if (interfaceC7523c4 != null) {
                interfaceC7523c4.mo5982a(touchEventM11761b);
            }
        } else if (action == 6 && (interfaceC7523c = this.f12389g) != null) {
            interfaceC7523c.mo5984c(touchEventM11761b);
        }
        m12257v(this.f12389g, motionEvent);
    }

    /* renamed from: x */
    public final void m12259x(InterfaceC5121d interfaceC5121d) {
        this.f12393k = interfaceC5121d;
    }

    /* renamed from: y */
    public final void m12260y(InterfaceC5122e interfaceC5122e) {
        this.f12392j = interfaceC5122e;
    }

    /* renamed from: z */
    public final void m12261z(InterfaceC5123f interfaceC5123f) {
        this.f12391i = interfaceC5123f;
    }

    public /* synthetic */ C7521a(C7879b c7879b, BoardConfig boardConfig, C7792a c7792a, InterfaceC9668d interfaceC9668d, C9850c c9850c, C8626f c8626f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7879b, boardConfig, c7792a, interfaceC9668d, (i10 & 16) != 0 ? null : c9850c, (i10 & 32) != 0 ? null : c8626f);
    }
}
