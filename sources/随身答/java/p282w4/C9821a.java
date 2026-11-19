package p282w4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
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
import p006a5.C0038b;
import p006a5.InterfaceC0039c;
import p084d5.C7748h;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;
import p189n5.C9097c;
import p243s5.InterfaceC9475c;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9477e;
import p243s5.InterfaceC9478f;
import p263u5.AbstractC9694m;
import p263u5.AbstractC9695n;
import p263u5.C9691j;
import p272v4.C9763b;
import p312z4.C9998a;

/* renamed from: w4.a */
/* loaded from: classes4.dex */
public final class C9821a implements InterfaceC9822b {

    /* renamed from: a */
    public final C0038b f17495a;

    /* renamed from: b */
    public final C9763b f17496b;

    /* renamed from: c */
    public final C9998a f17497c;

    /* renamed from: d */
    public final InterfaceC8891e f17498d;

    /* renamed from: e */
    public final C9097c f17499e;

    /* renamed from: f */
    public final C7748h f17500f;

    /* renamed from: g */
    public InterfaceC9823c f17501g;

    /* renamed from: h */
    public final C9825e f17502h;

    /* renamed from: i */
    public InterfaceC9478f f17503i;

    /* renamed from: j */
    public InterfaceC9477e f17504j;

    /* renamed from: k */
    public InterfaceC9476d f17505k;

    /* renamed from: l */
    public ArrayList f17506l;

    /* renamed from: m */
    public Function1 f17507m;

    public C9821a(C0038b graphControl, C9763b boardConfig, C9998a matrixAdapter, InterfaceC8891e sourceLoader, C9097c c9097c, C7748h c7748h) {
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        this.f17495a = graphControl;
        this.f17496b = boardConfig;
        this.f17497c = matrixAdapter;
        this.f17498d = sourceLoader;
        this.f17499e = c9097c;
        this.f17500f = c7748h;
        C9825e c9825e = new C9825e();
        this.f17502h = c9825e;
        this.f17506l = new ArrayList();
        c9825e.m16737e(this);
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: a */
    public InterfaceC0039c mo16682a() {
        return this.f17495a;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: b */
    public void mo16683b(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix, List matrixList) {
        CommandRecord commandRecordM14635c;
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        C9097c c9097c = this.f17499e;
        if (c9097c == null || (commandRecordM14635c = c9097c.m14635c()) == null) {
            return;
        }
        commandRecordM14635c.m7990z(originMatrix, lastMatrix, matrixList, System.currentTimeMillis());
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: c */
    public void mo16684c(List graphList, List matrixList) {
        CommandRecord commandRecordM14635c;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        C9097c c9097c = this.f17499e;
        if (c9097c == null || (commandRecordM14635c = c9097c.m14635c()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8055c) it.next()).mo12798g().build());
        }
        commandRecordM14635c.m7974L(arrayList, matrixList, System.currentTimeMillis());
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: d */
    public InterfaceC9477e mo16685d() {
        return this.f17504j;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: e */
    public InterfaceC9478f mo16686e() {
        return this.f17503i;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: f */
    public AbstractC8053a mo16687f(EzyGraphEnum.GraphEnum graphType, List eventList, EzyPaint.Paint paint, String parentGraphId, String graphId) {
        CommandRecord commandRecordM14635c;
        CommandInfoEntity commandInfoEntityM7970C;
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        C9097c c9097c = this.f17499e;
        if (c9097c == null || (commandRecordM14635c = c9097c.m14635c()) == null || (commandInfoEntityM7970C = commandRecordM14635c.m7970C(parentGraphId, graphType, eventList, paint, graphId, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntityM7970C.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        return graphBuildFactory.mo7873c(graphData, this.f17498d);
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: g */
    public void mo16688g(List eventList, EzyPaint.Paint paint) {
        CommandRecord commandRecordM14635c;
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        C9097c c9097c = this.f17499e;
        if (c9097c == null || (commandRecordM14635c = c9097c.m14635c()) == null) {
            return;
        }
        commandRecordM14635c.m7980V(eventList, paint, System.currentTimeMillis());
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: h */
    public void mo16689h(InterfaceC8055c graph, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2) throws ExecutionException, InterruptedException {
        CommandRecord commandRecordM14635c;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graphEnum, "graphEnum");
        C9097c c9097c = this.f17499e;
        if (c9097c == null || (commandRecordM14635c = c9097c.m14635c()) == null) {
            return;
        }
        String id = graph.getId();
        EzyRectF.RectF rectFM16195c = rectF != null ? AbstractC9694m.m16195c(rectF) : null;
        EzyPaint.Paint paintM16193a = paint != null ? AbstractC9694m.m16193a(paint, 1.0f, 0.0f) : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC9694m.m16194b((PointF) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        commandRecordM14635c.m7977Q(id, graphEnum, rectFM16195c, str, paintM16193a, arrayList, matrix != null ? AbstractC9695n.m16201c(matrix, System.currentTimeMillis()) : null, str2, System.currentTimeMillis());
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: i */
    public C9998a mo16690i() {
        return this.f17497c;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: j */
    public Function1 mo16691j() {
        return this.f17507m;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: k */
    public C9763b mo16692k() {
        return this.f17496b;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: l */
    public void mo16693l() {
        C7748h c7748h;
        InterfaceC8055c interfaceC8055cMo210m = this.f17495a.mo210m();
        if (interfaceC8055cMo210m == null || (c7748h = this.f17500f) == null) {
            return;
        }
        c7748h.m12092c((AbstractC8053a) interfaceC8055cMo210m, this.f17495a.getBackgroundColor(), this.f17495a.m184K());
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: m */
    public InterfaceC8055c mo16694m(String parentGraphId) throws ExecutionException, InterruptedException {
        CommandRecord commandRecordM14635c;
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        C9097c c9097c = this.f17499e;
        if (c9097c == null || (commandRecordM14635c = c9097c.m14635c()) == null) {
            return null;
        }
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.GROUP_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m9175t().build();
        Intrinsics.checkNotNullExpressionValue(rectFBuild, "newBuilder().build()");
        CommandInfoEntity commandInfoEntityM7969B = commandRecordM14635c.m7969B(parentGraphId, graphEnum, rectFBuild, System.currentTimeMillis());
        if (commandInfoEntityM7969B == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntityM7969B.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8053a abstractC8053aMo7873c = graphBuildFactory.mo7873c(graphData, this.f17498d);
        if (abstractC8053aMo7873c == null) {
            return null;
        }
        this.f17495a.mo222y(graphData.m8383I(), abstractC8053aMo7873c);
        return abstractC8053aMo7873c;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: n */
    public void mo16695n(List graphList, long j9) {
        CommandRecord commandRecordM14635c;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        C9097c c9097c = this.f17499e;
        if (c9097c != null && (commandRecordM14635c = c9097c.m14635c()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC8055c) it.next()).mo12798g().build());
            }
            commandRecordM14635c.m7984b0(arrayList, j9);
        }
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it2.next();
            ArrayList arrayList2 = this.f17506l;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                ((InterfaceC9475c) obj).mo11371a(interfaceC8055c);
            }
        }
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: o */
    public InterfaceC9476d mo16696o() {
        return this.f17505k;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: p */
    public void mo16697p(float f10, float f11, float f12, float f13, Paint paint, String content, Function1 function1) {
        C9097c c9097c;
        CommandRecord commandRecordM14635c;
        CommandInfoEntity commandInfoEntityM7975N;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(content, "content");
        String strMo199b = this.f17495a.mo199b();
        if (strMo199b == null || (c9097c = this.f17499e) == null || (commandRecordM14635c = c9097c.m14635c()) == null || (commandInfoEntityM7975N = commandRecordM14635c.m7975N(strMo199b, f10, f11, AbstractC9694m.m16193a(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntityM7975N.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8053a abstractC8053aMo7873c = graphBuildFactory.mo7873c(graphData, this.f17498d);
        if (abstractC8053aMo7873c != null) {
            float[] fArr = {f12, f13};
            AbstractC9695n.m16200b(mo16690i().m17344b()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            mo16684c(CollectionsKt.listOf(abstractC8053aMo7873c), CollectionsKt.mutableListOf(AbstractC9695n.m16201c(matrix, System.currentTimeMillis())));
            abstractC8053aMo7873c.mo7858d(matrix);
            if (function1 != null) {
                function1.invoke(abstractC8053aMo7873c);
            }
        }
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: q */
    public InterfaceC8891e mo16698q() {
        return this.f17498d;
    }

    @Override // p282w4.InterfaceC9822b
    /* renamed from: r */
    public void mo16699r(float f10, float f11, float f12, float f13, int i9, List pointList, Paint paint, Function1 function1) {
        C9097c c9097c;
        CommandRecord commandRecordM14635c;
        CommandInfoEntity commandInfoEntityM7973J;
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        String strMo199b = this.f17495a.mo199b();
        if (strMo199b == null || (c9097c = this.f17499e) == null || (commandRecordM14635c = c9097c.m14635c()) == null || (commandInfoEntityM7973J = commandRecordM14635c.m7973J(strMo199b, f10, f11, i9, pointList, AbstractC9694m.m16193a(paint, 1.0f, 0.0f), System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntityM7973J.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8053a abstractC8053aMo7873c = graphBuildFactory.mo7873c(graphData, this.f17498d);
        if (abstractC8053aMo7873c != null) {
            float[] fArr = {f12, f13};
            AbstractC9695n.m16200b(mo16690i().m17344b()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            mo16684c(CollectionsKt.listOf(abstractC8053aMo7873c), CollectionsKt.mutableListOf(AbstractC9695n.m16201c(matrix, System.currentTimeMillis())));
            abstractC8053aMo7873c.mo7858d(matrix);
            if (function1 != null) {
                function1.invoke(abstractC8053aMo7873c);
            }
        }
    }

    /* renamed from: s */
    public final InterfaceC9823c m16700s() {
        return this.f17502h.m16735c(this);
    }

    /* renamed from: t */
    public final ArrayList m16701t() {
        return this.f17506l;
    }

    /* renamed from: u */
    public final C9825e m16702u() {
        return this.f17502h;
    }

    /* renamed from: v */
    public final void m16703v(InterfaceC9823c interfaceC9823c, MotionEvent motionEvent) {
        if (interfaceC9823c instanceof NewSelectAction) {
            ((NewSelectAction) interfaceC9823c).m7225T(motionEvent);
        }
    }

    /* renamed from: w */
    public final void m16704w(MotionEvent motionEvent) {
        InterfaceC9823c interfaceC9823c;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        EzyTouchEvent.TouchEvent touchEventM16182b = C9691j.f17129a.m16182b(motionEvent, AbstractC9695n.m16200b(this.f17497c.m17344b()));
        int action = touchEventM16182b.getAction();
        if (action == 0) {
            InterfaceC9823c interfaceC9823cM16734b = this.f17502h.m16734b(this);
            this.f17501g = interfaceC9823cM16734b;
            if (interfaceC9823cM16734b != null) {
                interfaceC9823cM16734b.mo7081e(touchEventM16182b);
            }
        } else if (action == 1) {
            InterfaceC9823c interfaceC9823c2 = this.f17501g;
            if (interfaceC9823c2 != null) {
                interfaceC9823c2.mo7078b(touchEventM16182b);
            }
            m16703v(this.f17501g, motionEvent);
            this.f17501g = null;
        } else if (action == 2) {
            InterfaceC9823c interfaceC9823c3 = this.f17501g;
            if (interfaceC9823c3 != null) {
                interfaceC9823c3.mo7080d(touchEventM16182b);
            }
        } else if (action == 5) {
            InterfaceC9823c interfaceC9823c4 = this.f17501g;
            if (interfaceC9823c4 != null) {
                interfaceC9823c4.mo7077a(touchEventM16182b);
            }
        } else if (action == 6 && (interfaceC9823c = this.f17501g) != null) {
            interfaceC9823c.mo7079c(touchEventM16182b);
        }
        m16703v(this.f17501g, motionEvent);
    }

    /* renamed from: x */
    public final void m16705x(InterfaceC9476d interfaceC9476d) {
        this.f17505k = interfaceC9476d;
    }

    /* renamed from: y */
    public final void m16706y(InterfaceC9477e interfaceC9477e) {
        this.f17504j = interfaceC9477e;
    }

    /* renamed from: z */
    public final void m16707z(InterfaceC9478f interfaceC9478f) {
        this.f17503i = interfaceC9478f;
    }

    public /* synthetic */ C9821a(C0038b c0038b, C9763b c9763b, C9998a c9998a, InterfaceC8891e interfaceC8891e, C9097c c9097c, C7748h c7748h, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0038b, c9763b, c9998a, interfaceC8891e, (i9 & 16) != 0 ? null : c9097c, (i9 & 32) != 0 ? null : c7748h);
    }
}
