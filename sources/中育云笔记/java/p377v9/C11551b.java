package p377v9;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10354q;
import p181hd.InterfaceC9540l;
import p307q9.C10762b;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10980x;
import p337s9.C11083d;
import p348t9.C11257d;
import p362u9.C11373a;
import p390w9.C11719h;

/* renamed from: v9.b */
/* loaded from: classes5.dex */
public final class C11551b implements InterfaceC11552c {

    /* renamed from: a */
    public final C11373a f27423a;

    /* renamed from: b */
    public final C11719h f27424b;

    /* renamed from: c */
    public final C10762b f27425c;

    /* renamed from: d */
    public InterfaceC5181c f27426d;

    /* renamed from: e */
    public DrawControl f27427e;

    /* renamed from: f */
    public RectF f27428f;

    /* renamed from: g */
    public Matrix f27429g;

    /* renamed from: h */
    public boolean f27430h;

    /* renamed from: i */
    public Paint f27431i;

    /* renamed from: j */
    public float f27432j;

    /* renamed from: k */
    public boolean f27433k;

    /* renamed from: l */
    public int f27434l;

    /* renamed from: m */
    public final BackgroundLineConfig f27435m;

    /* renamed from: n */
    public InterfaceC9540l f27436n;

    /* renamed from: o */
    public final C11083d f27437o;

    public C11551b(C11373a matrixAdapter, C11719h renderLayer, C10762b boardConfig) {
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        this.f27423a = matrixAdapter;
        this.f27424b = renderLayer;
        this.f27425c = boardConfig;
        this.f27427e = new DrawControl(boardConfig);
        this.f27429g = new Matrix();
        this.f27430h = true;
        this.f27433k = true;
        this.f27435m = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        matrixAdapter.m25321l(renderLayer.m25948e());
        this.f27427e.m13924O(matrixAdapter);
        this.f27427e.m13925P(renderLayer);
        this.f27437o = new C11083d(this.f27427e);
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: A */
    public void mo25415A(C5414d graph) {
        InterfaceC5181c interfaceC5181c;
        AbstractC9979u.m20294g(graph, "graph");
        LogUtils.m3888i("GraphControl:textHandleStart");
        if (this.f27433k && (interfaceC5181c = this.f27426d) != null) {
            RectF rectF = this.f27428f;
            this.f27427e.m13928S(interfaceC5181c, graph, rectF != null ? this.f27430h ? C10354q.f24664a.m21675a(rectF, this.f27429g, this.f27432j) : C10354q.f24664a.m21676b(rectF, this.f27429g, this.f27432j) : null, this.f27431i);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: B */
    public void mo25416B(Path path, Paint paint, Matrix matrix) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(paint, "paint");
        this.f27427e.m13947u(path, paint, matrix);
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: C */
    public void mo25417C(String graphId, String content, Paint paint, RectF originRectF) {
        List<InterfaceC5181c> listMo2717f;
        AbstractC9979u.m20294g(graphId, "graphId");
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(originRectF, "originRectF");
        LogUtils.m3888i("GraphControl:changeTextGraph -> graphId: " + graphId);
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c == null || (listMo2717f = interfaceC5181c.mo2717f()) == null) {
            return;
        }
        for (InterfaceC5181c interfaceC5181c2 : listMo2717f) {
            if (AbstractC9979u.m20289b(interfaceC5181c2.getId(), graphId) && (interfaceC5181c2 instanceof C5414d)) {
                C5414d c5414d = (C5414d) interfaceC5181c2;
                c5414d.m2879G(content);
                c5414d.m2880H(paint);
                c5414d.mo2875p(originRectF);
                if (mo25423I()) {
                    DrawControl drawControl = this.f27427e;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC5181c interfaceC5181c3 = this.f27426d;
                    if (interfaceC5181c3 != null) {
                        arrayList.add(interfaceC5181c3);
                    }
                    drawControl.m13945s(arrayList);
                    RectF rectF = this.f27428f;
                    if (rectF != null) {
                        Path pathM21675a = this.f27430h ? C10354q.f24664a.m21675a(rectF, this.f27429g, this.f27432j) : C10354q.f24664a.m21676b(rectF, this.f27429g, this.f27432j);
                        this.f27427e.m13921L();
                        this.f27427e.m13920K(pathM21675a, this.f27431i);
                    }
                }
            }
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: D */
    public void mo25418D(Matrix matrix) {
        LogUtils.m3888i("GraphControl:cameraChangeEnd");
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            if (matrix != null) {
                this.f27423a.m25310a(matrix);
            }
            if (this.f27433k) {
                this.f27427e.m13934g(interfaceC5181c);
            }
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: E */
    public void mo25419E(InterfaceC5181c rootGraph) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GraphControl:init -> ");
        sb2.append(rootGraph.getId());
        sb2.append(": ");
        List listMo2717f = rootGraph.mo2717f();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listMo2717f, 10));
        Iterator it = listMo2717f.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5181c) it.next()).getId());
        }
        sb2.append(arrayList);
        LogUtils.m3888i(sb2.toString());
        this.f27426d = rootGraph;
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: F */
    public void mo25420F(float f10, float f11, float f12, float f13) {
        this.f27437o.m24657a(f10, f11, f12, f13);
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: G */
    public RectF mo25421G() {
        return new RectF(this.f27427e.m13950x());
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: H */
    public void mo25422H(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(groupGraph, "groupGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        if (this.f27426d != null) {
            this.f27437o.m24661e(groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: I */
    public boolean mo25423I() {
        return this.f27433k;
    }

    /* renamed from: J */
    public void m25424J(InterfaceC5181c graph, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "graph");
        AbstractC9979u.m20294g(matrix, "matrix");
        graph.mo2716e(matrix);
    }

    /* renamed from: K */
    public Bitmap m25425K() {
        InterfaceC5181c interfaceC5181c;
        if (!mo25423I() || (interfaceC5181c = this.f27426d) == null) {
            return null;
        }
        return this.f27427e.m13939l(interfaceC5181c);
    }

    /* renamed from: L */
    public int m25426L() {
        return this.f27427e.m13948v();
    }

    /* renamed from: M */
    public BackgroundLineConfig m25427M() {
        return this.f27427e.m13949w();
    }

    /* renamed from: N */
    public int m25428N() {
        return this.f27434l;
    }

    /* renamed from: O */
    public BackgroundLineConfig m25429O() {
        return this.f27435m;
    }

    /* renamed from: P */
    public int m25430P() {
        List listMo2717f;
        InterfaceC5181c interfaceC5181c = this.f27426d;
        int i10 = 0;
        if (interfaceC5181c != null && (listMo2717f = interfaceC5181c.mo2717f()) != null) {
            Iterator it = listMo2717f.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5181c) it.next()) instanceof ImageGraph) {
                    i10++;
                }
            }
        }
        return i10;
    }

    /* renamed from: Q */
    public void m25431Q() {
        LogUtils.m3888i("GraphControl:release");
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            interfaceC5181c.onDestroy();
        }
        this.f27427e.m13916G();
    }

    /* renamed from: R */
    public void m25432R() {
        LogUtils.m3888i("GraphControl:reset");
        m25433S();
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            interfaceC5181c.onDestroy();
        }
        this.f27426d = null;
        this.f27427e.m13918I();
    }

    /* renamed from: S */
    public final void m25433S() {
        mo25444d(this.f27434l);
        mo25459s(this.f27435m);
    }

    /* renamed from: T */
    public Bitmap m25434T() {
        InterfaceC5181c interfaceC5181c;
        if (!mo25423I() || (interfaceC5181c = this.f27426d) == null) {
            return null;
        }
        return this.f27427e.m13919J(interfaceC5181c);
    }

    /* renamed from: U */
    public void m25435U(int i10) {
        this.f27434l = i10;
        this.f27427e.m13922M(i10);
    }

    /* renamed from: V */
    public void m25436V(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        BackgroundLineConfig backgroundLineConfig2 = this.f27435m;
        backgroundLineConfig2.m13717g(backgroundLineConfig.m13713c());
        backgroundLineConfig2.m13715e(backgroundLineConfig.m13711a());
        backgroundLineConfig2.m13716f(backgroundLineConfig.m13712b());
        this.f27427e.m13923N(backgroundLineConfig);
    }

    /* renamed from: W */
    public final void m25437W(InterfaceC9540l interfaceC9540l) {
        this.f27436n = interfaceC9540l;
    }

    /* renamed from: X */
    public void m25438X(RectF rectF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        this.f27427e.m13950x().set(rectF);
    }

    /* renamed from: Y */
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m25439Y() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b snapshot;
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c == null || (snapshot = interfaceC5181c.getSnapshot()) == null) {
            return null;
        }
        return snapshot.build();
    }

    /* renamed from: Z */
    public void m25440Z() {
        this.f27427e.m13932W(this.f27423a.m25311b());
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: a */
    public void mo25441a(ImageGraph graph) {
        AbstractC9979u.m20294g(graph, "graph");
        LogUtils.m3888i("GraphControl:addImageGraph -> graphId:" + graph.getId());
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            if (interfaceC5181c != null) {
                interfaceC5181c.mo2713a(graph);
            }
            mo25447g();
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: b */
    public String mo25442b() {
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            return interfaceC5181c.getId();
        }
        return null;
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: c */
    public boolean mo25443c() {
        return this.f27427e.m13910A();
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: d */
    public void mo25444d(int i10) {
        LogUtils.m3888i("GraphControl:updateBackground -> color:" + i10);
        this.f27427e.m13922M(i10);
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: e */
    public void mo25445e() {
        if (this.f27433k) {
            this.f27428f = null;
            this.f27429g.reset();
            this.f27427e.m13921L();
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: f */
    public void mo25446f(String str, InterfaceC5181c graph) {
        AbstractC5179a abstractC5179aMo2723n;
        AbstractC9979u.m20294g(graph, "graph");
        LogUtils.m3888i("GraphControl:addGraph -> [" + graph.graphType() + "] parentId:" + str + ", graphId:" + graph.getId());
        if (str == null || AbstractC10793c0.m23132h0(str)) {
            this.f27426d = graph;
            if (this.f27433k) {
                this.f27427e.m13933f(graph);
                return;
            }
            return;
        }
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c == null || interfaceC5181c == null || (abstractC5179aMo2723n = interfaceC5181c.mo2723n(str)) == null) {
            return;
        }
        abstractC5179aMo2723n.mo2727s(graph);
        if (this.f27433k) {
            this.f27427e.m13933f(graph);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: g */
    public synchronized void mo25447g() {
        try {
            if (this.f27433k) {
                LogUtils.m3888i("GraphControl:reDrawFixView -> cameraMatrix=" + this.f27423a.m25313d());
                DrawControl drawControl = this.f27427e;
                ArrayList arrayList = new ArrayList();
                InterfaceC5181c interfaceC5181c = this.f27426d;
                if (interfaceC5181c != null) {
                    arrayList.add(interfaceC5181c);
                }
                drawControl.m13945s(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: h */
    public void mo25448h(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(groupGraph, "groupGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            this.f27437o.m24660d(interfaceC5181c, groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: i */
    public void mo25449i(C5414d graph, RectF rectF, Matrix matrix) {
        Path pathM21675a;
        AbstractC9979u.m20294g(graph, "graph");
        if (this.f27433k) {
            if (rectF != null) {
                this.f27428f = rectF;
                this.f27429g.set(matrix);
                pathM21675a = this.f27430h ? C10354q.f24664a.m21675a(rectF, this.f27429g, this.f27432j) : C10354q.f24664a.m21676b(rectF, this.f27429g, this.f27432j);
            } else {
                pathM21675a = null;
            }
            this.f27427e.m13926Q(graph, pathM21675a, this.f27431i);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: j */
    public void mo25450j(List graphList) {
        AbstractC9979u.m20294g(graphList, "graphList");
        if (mo25423I()) {
            this.f27427e.m13944r(graphList);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: k */
    public void mo25451k(List graphList, Matrix matrix) {
        AbstractC9979u.m20294g(graphList, "graphList");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (this.f27433k) {
            DrawControl drawControl = this.f27427e;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(AbstractC10351n.m21660b(this.f27423a.m25311b()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.f27423a.m25311b());
            drawControl.m13929T(matrix2);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: l */
    public void mo25452l(boolean z10) {
        this.f27433k = z10;
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: m */
    public void mo25453m(RectF rectF, List graphList) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(graphList, "graphList");
        if (this.f27433k && !rectF.isEmpty()) {
            this.f27427e.m13917H(rectF, graphList);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: n */
    public InterfaceC5181c mo25454n() {
        return this.f27426d;
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: o */
    public void mo25455o() {
        InterfaceC5181c interfaceC5181c;
        LogUtils.m3888i("GraphControl:cameraChangeStart ");
        if (this.f27433k && (interfaceC5181c = this.f27426d) != null) {
            this.f27427e.m13935h(interfaceC5181c);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: p */
    public void mo25456p(List graphList) {
        InterfaceC5181c interfaceC5181c;
        AbstractC9979u.m20294g(graphList, "graphList");
        if (graphList.isEmpty() || (interfaceC5181c = this.f27426d) == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GraphControl:delete -> root:");
        sb2.append(interfaceC5181c.getId());
        sb2.append(": ");
        List<InterfaceC5181c> list = graphList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5181c) it.next()).getId());
        }
        sb2.append(arrayList);
        LogUtils.m3888i(sb2.toString());
        interfaceC5181c.mo2722k(graphList);
        for (InterfaceC5181c interfaceC5181c2 : list) {
            InterfaceC9540l interfaceC9540l = this.f27436n;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(interfaceC5181c2);
            }
        }
        if (this.f27433k) {
            this.f27427e.m13940m(interfaceC5181c);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: q */
    public RectF mo25457q() {
        return new RectF(this.f27424b.m25948e());
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: r */
    public void mo25458r(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        if (this.f27433k && this.f27426d != null) {
            DrawControl drawControl = this.f27427e;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(AbstractC10351n.m21660b(this.f27423a.m25314e()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.f27423a.m25314e());
            drawControl.m13936i(matrix2);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: s */
    public void mo25459s(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        this.f27427e.m13923N(backgroundLineConfig);
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: t */
    public void mo25460t(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        this.f27437o.m24658b(selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: u */
    public void mo25461u(C5414d graph, RectF rectF, Matrix matrix) {
        InterfaceC5181c interfaceC5181c;
        Path pathM21675a;
        AbstractC9979u.m20294g(graph, "graph");
        LogUtils.m3888i("GraphControl:textHandleEnd");
        if (this.f27433k && (interfaceC5181c = this.f27426d) != null) {
            if (rectF != null) {
                this.f27428f = rectF;
                this.f27429g.set(matrix);
                pathM21675a = this.f27430h ? C10354q.f24664a.m21675a(rectF, this.f27429g, this.f27432j) : C10354q.f24664a.m21676b(rectF, this.f27429g, this.f27432j);
            } else {
                pathM21675a = null;
            }
            this.f27427e.m13927R(interfaceC5181c, pathM21675a, this.f27431i);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: v */
    public void mo25462v(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c != null) {
            this.f27437o.m24659c(interfaceC5181c, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: w */
    public void mo25463w(String graphId, RectF originRectF, Matrix renderMatrix, String filePath) {
        List<InterfaceC5181c> listMo2717f;
        AbstractC9979u.m20294g(graphId, "graphId");
        AbstractC9979u.m20294g(originRectF, "originRectF");
        AbstractC9979u.m20294g(renderMatrix, "renderMatrix");
        AbstractC9979u.m20294g(filePath, "filePath");
        LogUtils.m3888i("GraphControl:changeImageGraph -> graphId: " + graphId);
        InterfaceC5181c interfaceC5181c = this.f27426d;
        if (interfaceC5181c == null || (listMo2717f = interfaceC5181c.mo2717f()) == null) {
            return;
        }
        for (InterfaceC5181c interfaceC5181c2 : listMo2717f) {
            if (AbstractC9979u.m20289b(interfaceC5181c2.getId(), graphId) && (interfaceC5181c2 instanceof ImageGraph)) {
                ImageGraph imageGraph = (ImageGraph) interfaceC5181c2;
                imageGraph.mo2875p(originRectF);
                imageGraph.m14492z(renderMatrix);
                imageGraph.m14495K(filePath);
                if (mo25423I()) {
                    DrawControl drawControl = this.f27427e;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC5181c interfaceC5181c3 = this.f27426d;
                    if (interfaceC5181c3 != null) {
                        arrayList.add(interfaceC5181c3);
                    }
                    drawControl.m13945s(arrayList);
                }
            }
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: x */
    public void mo25464x(List graphList) {
        InterfaceC5181c interfaceC5181c;
        AbstractC9979u.m20294g(graphList, "graphList");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GraphControl:translationStart -> graph:");
        List list = graphList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5181c) it.next()).getId());
        }
        sb2.append(arrayList);
        LogUtils.m3888i(sb2.toString());
        if (this.f27433k && (interfaceC5181c = this.f27426d) != null) {
            RectF rectF = this.f27428f;
            this.f27427e.m13931V(interfaceC5181c, graphList, rectF != null ? this.f27430h ? C10354q.f24664a.m21675a(rectF, this.f27429g, this.f27432j) : C10354q.f24664a.m21676b(rectF, this.f27429g, this.f27432j) : null, this.f27431i);
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: y */
    public void mo25465y(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z10) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (this.f27433k) {
            this.f27428f = rectF;
            this.f27431i = paint;
            this.f27432j = f10;
            this.f27429g.set(matrix);
            this.f27430h = z10;
            if (this.f27426d != null) {
                Path pathM21675a = z10 ? C10354q.f24664a.m21675a(rectF, matrix, f10) : C10354q.f24664a.m21676b(rectF, matrix, f10);
                this.f27427e.m13921L();
                this.f27427e.m13920K(pathM21675a, paint);
            }
        }
    }

    @Override // p377v9.InterfaceC11552c
    /* renamed from: z */
    public void mo25466z(List graphList, Matrix matrix) {
        AbstractC9979u.m20294g(graphList, "graphList");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GraphControl:translationEnd -> matrix:");
        sb2.append(matrix);
        sb2.append(" graph:");
        List<InterfaceC5181c> list = graphList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5181c) it.next()).getId());
        }
        sb2.append(arrayList);
        LogUtils.m3888i(sb2.toString());
        for (InterfaceC5181c interfaceC5181c : list) {
            Matrix matrix2 = new Matrix();
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            C10786q c10786q = C10786q.f26013a;
            m25424J(interfaceC5181c, matrix2);
        }
        if (this.f27433k) {
            if (this.f27428f != null) {
                Matrix matrix3 = this.f27429g;
                Matrix matrix4 = new Matrix();
                if (matrix != null) {
                    matrix4.postConcat(AbstractC10351n.m21660b(this.f27423a.m25311b()));
                    matrix4.postConcat(matrix);
                    matrix4.postConcat(this.f27423a.m25311b());
                }
                matrix3.postConcat(matrix4);
            }
            InterfaceC5181c interfaceC5181c2 = this.f27426d;
            if (interfaceC5181c2 != null) {
                RectF rectF = this.f27428f;
                this.f27427e.m13930U(interfaceC5181c2, rectF != null ? this.f27430h ? C10354q.f24664a.m21675a(rectF, this.f27429g, this.f27432j) : C10354q.f24664a.m21676b(rectF, this.f27429g, this.f27432j) : null, this.f27431i);
            }
        }
    }
}
