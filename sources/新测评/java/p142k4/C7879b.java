package p142k4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p077e5.AbstractC7352m;
import p077e5.C7355p;
import p109h4.C7627e;
import p120i4.C7663c;
import p120i4.C7665e;
import p131j4.C7792a;
import p155l4.C8505j;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;

/* renamed from: k4.b */
/* loaded from: classes4.dex */
public final class C7879b implements InterfaceC7880c {

    /* renamed from: a */
    public final C7792a f13656a;

    /* renamed from: b */
    public final C8505j f13657b;

    /* renamed from: c */
    public final BoardConfig f13658c;

    /* renamed from: d */
    public InterfaceC8888c f13659d;

    /* renamed from: e */
    public DrawControl f13660e;

    /* renamed from: f */
    public RectF f13661f;

    /* renamed from: g */
    public Matrix f13662g;

    /* renamed from: h */
    public boolean f13663h;

    /* renamed from: i */
    public Paint f13664i;

    /* renamed from: j */
    public float f13665j;

    /* renamed from: k */
    public boolean f13666k;

    /* renamed from: l */
    public int f13667l;

    /* renamed from: m */
    public final BackgroundLineConfig f13668m;

    /* renamed from: n */
    public Function1 f13669n;

    /* renamed from: o */
    public final C7627e f13670o;

    public C7879b(C7792a matrixAdapter, C8505j renderLayer, BoardConfig boardConfig) {
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        this.f13656a = matrixAdapter;
        this.f13657b = renderLayer;
        this.f13658c = boardConfig;
        this.f13660e = new DrawControl(boardConfig);
        this.f13662g = new Matrix();
        this.f13663h = true;
        this.f13666k = true;
        this.f13668m = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        matrixAdapter.m13198l(renderLayer.m13979e());
        this.f13660e.m6213P(matrixAdapter);
        this.f13660e.m6214Q(renderLayer);
        this.f13670o = new C7627e(this.f13660e);
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: A */
    public void mo13414A(Path path, Paint paint, Matrix matrix) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f13660e.m6237v(path, paint, matrix);
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: B */
    public void mo13415B(String graphId, String content, Paint paint, RectF originRectF) {
        List<InterfaceC8888c> listMo14995f;
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(originRectF, "originRectF");
        LogUtils.m3239i("GraphControl:changeTextGraph -> graphId: " + graphId);
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c == null || (listMo14995f = interfaceC8888c.mo14995f()) == null) {
            return;
        }
        for (InterfaceC8888c interfaceC8888c2 : listMo14995f) {
            if (Intrinsics.areEqual(interfaceC8888c2.getId(), graphId) && (interfaceC8888c2 instanceof C9008d)) {
                C9008d c9008d = (C9008d) interfaceC8888c2;
                c9008d.m15161K(content);
                c9008d.m15162L(paint);
                c9008d.mo6750o(originRectF);
                if (mo13421H()) {
                    DrawControl drawControl = this.f13660e;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC8888c interfaceC8888c3 = this.f13659d;
                    if (interfaceC8888c3 != null) {
                        arrayList.add(interfaceC8888c3);
                    }
                    drawControl.m6235t(arrayList);
                    RectF rectF = this.f13661f;
                    if (rectF != null) {
                        Path pathM11786a = this.f13663h ? C7355p.f11924a.m11786a(rectF, this.f13662g, this.f13665j) : C7355p.f11924a.m11787b(rectF, this.f13662g, this.f13665j);
                        this.f13660e.m6210M();
                        this.f13660e.m6209L(pathM11786a, this.f13664i);
                    }
                }
            }
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: C */
    public void mo13416C(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            this.f13670o.m12591c(interfaceC8888c, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: D */
    public void mo13417D(Matrix matrix) {
        LogUtils.m3239i("GraphControl:cameraChangeEnd");
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            if (matrix != null) {
                this.f13656a.m13187a(matrix);
            }
            if (this.f13666k) {
                this.f13660e.m6223g(interfaceC8888c);
            }
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: E */
    public void mo13418E(C9008d graph) {
        InterfaceC8888c interfaceC8888c;
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m3239i("GraphControl:textHandleStart");
        if (this.f13666k && (interfaceC8888c = this.f13659d) != null) {
            RectF rectF = this.f13661f;
            this.f13660e.m6217T(interfaceC8888c, graph, rectF != null ? this.f13663h ? C7355p.f11924a.m11786a(rectF, this.f13662g, this.f13665j) : C7355p.f11924a.m11787b(rectF, this.f13662g, this.f13665j) : null, this.f13664i);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: F */
    public void mo13419F(float f10, float f11, float f12, float f13) {
        this.f13670o.m12589a(f10, f11, f12, f13);
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: G */
    public RectF mo13420G() {
        return new RectF(this.f13660e.m6241z());
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: H */
    public boolean mo13421H() {
        return this.f13666k;
    }

    /* renamed from: I */
    public void m13422I(InterfaceC8888c graph, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        graph.mo6747e(matrix);
    }

    /* renamed from: J */
    public BackgroundLineConfig m13423J() {
        return this.f13660e.m6239x();
    }

    /* renamed from: K */
    public int m13424K() {
        List listMo14995f;
        InterfaceC8888c interfaceC8888c = this.f13659d;
        int i10 = 0;
        if (interfaceC8888c != null && (listMo14995f = interfaceC8888c.mo14995f()) != null) {
            Iterator it = listMo14995f.iterator();
            while (it.hasNext()) {
                if (((InterfaceC8888c) it.next()) instanceof ImageGraph) {
                    i10++;
                }
            }
        }
        return i10;
    }

    /* renamed from: L */
    public Bitmap m13425L(int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11, InterfaceC8888c interfaceC8888c) {
        InterfaceC8888c interfaceC8888c2 = this.f13659d;
        if (interfaceC8888c2 != null) {
            return this.f13660e.m6240y(interfaceC8888c2, i10, i11, i12, i13, z9, z10, z11, interfaceC8888c);
        }
        return null;
    }

    /* renamed from: M */
    public void m13426M() {
        LogUtils.m3239i("GraphControl:release");
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            interfaceC8888c.onDestroy();
        }
        this.f13660e.m6205H();
    }

    /* renamed from: N */
    public void m13427N() {
        LogUtils.m3239i("GraphControl:reset");
        m13428O();
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            interfaceC8888c.onDestroy();
        }
        this.f13659d = null;
        this.f13660e.m6207J();
    }

    /* renamed from: O */
    public final void m13428O() {
        mo13438c(this.f13667l);
        mo13455t(this.f13668m);
    }

    /* renamed from: P */
    public Bitmap m13429P() {
        InterfaceC8888c interfaceC8888c;
        if (!mo13421H() || (interfaceC8888c = this.f13659d) == null) {
            return null;
        }
        return this.f13660e.m6208K(interfaceC8888c);
    }

    /* renamed from: Q */
    public void m13430Q(int i10) {
        this.f13667l = i10;
        this.f13660e.m6211N(i10);
    }

    /* renamed from: R */
    public void m13431R(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        BackgroundLineConfig backgroundLineConfig2 = this.f13668m;
        backgroundLineConfig2.m5980g(backgroundLineConfig.m5976c());
        backgroundLineConfig2.m5978e(backgroundLineConfig.m5974a());
        backgroundLineConfig2.m5979f(backgroundLineConfig.m5975b());
        this.f13660e.m6212O(backgroundLineConfig);
    }

    /* renamed from: S */
    public final void m13432S(Function1 function1) {
        this.f13669n = function1;
    }

    /* renamed from: T */
    public void m13433T(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.f13660e.m6241z().set(rectF);
    }

    /* renamed from: U */
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m13434U() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b snapshot;
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c == null || (snapshot = interfaceC8888c.getSnapshot()) == null) {
            return null;
        }
        return snapshot.build();
    }

    /* renamed from: V */
    public void m13435V() {
        this.f13660e.m6221X(this.f13656a.m13188b());
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: a */
    public void mo13436a(ImageGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m3239i("GraphControl:addImageGraph -> graphId:" + graph.getId());
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            if (interfaceC8888c != null) {
                interfaceC8888c.mo14992a(graph);
            }
            mo13440e();
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: b */
    public String mo13437b() {
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            return interfaceC8888c.getId();
        }
        return null;
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: c */
    public void mo13438c(int i10) {
        LogUtils.m3239i("GraphControl:updateBackground -> color:" + i10);
        this.f13660e.m6211N(i10);
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: d */
    public void mo13439d() {
        if (this.f13666k) {
            this.f13661f = null;
            this.f13662g.reset();
            this.f13660e.m6210M();
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: e */
    public synchronized void mo13440e() {
        try {
            if (this.f13666k) {
                LogUtils.m3239i("GraphControl:reDrawFixView -> cameraMatrix=" + this.f13656a.m13190d());
                DrawControl drawControl = this.f13660e;
                ArrayList arrayList = new ArrayList();
                InterfaceC8888c interfaceC8888c = this.f13659d;
                if (interfaceC8888c != null) {
                    arrayList.add(interfaceC8888c);
                }
                drawControl.m6235t(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: f */
    public void mo13441f(C9008d graph, RectF rectF, Matrix matrix) {
        InterfaceC8888c interfaceC8888c;
        Path pathM11786a;
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m3239i("GraphControl:textHandleEnd");
        if (this.f13666k && (interfaceC8888c = this.f13659d) != null) {
            if (rectF != null) {
                this.f13661f = rectF;
                this.f13662g.set(matrix);
                pathM11786a = this.f13663h ? C7355p.f11924a.m11786a(rectF, this.f13662g, this.f13665j) : C7355p.f11924a.m11787b(rectF, this.f13662g, this.f13665j);
            } else {
                pathM11786a = null;
            }
            this.f13660e.m6216S(interfaceC8888c, pathM11786a, this.f13664i);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: g */
    public void mo13442g(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        if (mo13421H()) {
            this.f13660e.m6234s(graphList);
        }
    }

    @Override // p142k4.InterfaceC7880c
    public int getBackgroundColor() {
        return this.f13660e.m6238w();
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: h */
    public void mo13443h(List graphList, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f13666k) {
            DrawControl drawControl = this.f13660e;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(AbstractC7352m.m11777b(this.f13656a.m13188b()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.f13656a.m13188b());
            drawControl.m6218U(matrix2);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: i */
    public void mo13444i(boolean z9) {
        this.f13666k = z9;
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: j */
    public void mo13445j(RectF rectF, List graphList) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        if (this.f13666k && !rectF.isEmpty()) {
            this.f13660e.m6206I(rectF, graphList);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: k */
    public void mo13446k(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(groupGraph, "groupGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        if (this.f13659d != null) {
            this.f13670o.m12593e(groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: l */
    public void mo13447l(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(groupGraph, "groupGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c != null) {
            this.f13670o.m12592d(interfaceC8888c, groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: m */
    public void mo13448m(C9008d graph, RectF rectF, Matrix matrix) {
        Path pathM11786a;
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (this.f13666k) {
            if (rectF != null) {
                this.f13661f = rectF;
                this.f13662g.set(matrix);
                pathM11786a = this.f13663h ? C7355p.f11924a.m11786a(rectF, this.f13662g, this.f13665j) : C7355p.f11924a.m11787b(rectF, this.f13662g, this.f13665j);
            } else {
                pathM11786a = null;
            }
            this.f13660e.m6215R(graph, pathM11786a, this.f13664i);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: n */
    public InterfaceC8888c mo13449n() {
        return this.f13659d;
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: o */
    public void mo13450o() {
        InterfaceC8888c interfaceC8888c;
        LogUtils.m3239i("GraphControl:cameraChangeStart ");
        if (this.f13666k && (interfaceC8888c = this.f13659d) != null) {
            this.f13660e.m6224h(interfaceC8888c);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: p */
    public void mo13451p(InterfaceC8888c rootGraph) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:init -> ");
        sb.append(rootGraph.getId());
        sb.append(": ");
        List listMo14995f = rootGraph.mo14995f();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo14995f, 10));
        Iterator it = listMo14995f.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8888c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m3239i(sb.toString());
        this.f13659d = rootGraph;
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: q */
    public void mo13452q(List graphList) {
        InterfaceC8888c interfaceC8888c;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        if (graphList.isEmpty() || (interfaceC8888c = this.f13659d) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:delete -> root:");
        sb.append(interfaceC8888c.getId());
        sb.append(": ");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8888c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m3239i(sb.toString());
        interfaceC8888c.mo15000k(graphList);
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) it2.next();
            Function1 function1 = this.f13669n;
            if (function1 != null) {
                function1.invoke(interfaceC8888c2);
            }
        }
        if (this.f13666k) {
            this.f13660e.m6228l(interfaceC8888c);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: r */
    public RectF mo13453r() {
        return new RectF(this.f13657b.m13979e());
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: s */
    public void mo13454s(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f13666k && this.f13659d != null) {
            DrawControl drawControl = this.f13660e;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(AbstractC7352m.m11777b(this.f13656a.m13191e()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.f13656a.m13191e());
            drawControl.m6225i(matrix2);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: t */
    public void mo13455t(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f13660e.m6212O(backgroundLineConfig);
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: u */
    public void mo13456u(String graphId, RectF originRectF, Matrix renderMatrix, String filePath) {
        List<InterfaceC8888c> listMo14995f;
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(originRectF, "originRectF");
        Intrinsics.checkNotNullParameter(renderMatrix, "renderMatrix");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        LogUtils.m3239i("GraphControl:changeImageGraph -> graphId: " + graphId);
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c == null || (listMo14995f = interfaceC8888c.mo14995f()) == null) {
            return;
        }
        for (InterfaceC8888c interfaceC8888c2 : listMo14995f) {
            if (Intrinsics.areEqual(interfaceC8888c2.getId(), graphId) && (interfaceC8888c2 instanceof ImageGraph)) {
                ImageGraph imageGraph = (ImageGraph) interfaceC8888c2;
                imageGraph.mo6750o(originRectF);
                imageGraph.m6738A(renderMatrix);
                imageGraph.m6759O(filePath);
                if (mo13421H()) {
                    DrawControl drawControl = this.f13660e;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC8888c interfaceC8888c3 = this.f13659d;
                    if (interfaceC8888c3 != null) {
                        arrayList.add(interfaceC8888c3);
                    }
                    drawControl.m6235t(arrayList);
                }
            }
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: v */
    public void mo13457v(List graphList) {
        InterfaceC8888c interfaceC8888c;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:translationStart -> graph:");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8888c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m3239i(sb.toString());
        if (this.f13666k && (interfaceC8888c = this.f13659d) != null) {
            RectF rectF = this.f13661f;
            this.f13660e.m6220W(interfaceC8888c, graphList, rectF != null ? this.f13663h ? C7355p.f11924a.m11786a(rectF, this.f13662g, this.f13665j) : C7355p.f11924a.m11787b(rectF, this.f13662g, this.f13665j) : null, this.f13664i);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: w */
    public void mo13458w(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z9) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f13666k) {
            this.f13661f = rectF;
            this.f13664i = paint;
            this.f13665j = f10;
            this.f13662g.set(matrix);
            this.f13663h = z9;
            if (this.f13659d != null) {
                Path pathM11786a = z9 ? C7355p.f11924a.m11786a(rectF, matrix, f10) : C7355p.f11924a.m11787b(rectF, matrix, f10);
                this.f13660e.m6210M();
                this.f13660e.m6209L(pathM11786a, paint);
            }
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: x */
    public void mo13459x(List graphList, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:translationEnd -> matrix:");
        sb.append(matrix);
        sb.append(" graph:");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8888c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m3239i(sb.toString());
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it2.next();
            Matrix matrix2 = new Matrix();
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            Unit unit = Unit.INSTANCE;
            m13422I(interfaceC8888c, matrix2);
        }
        if (this.f13666k) {
            if (this.f13661f != null) {
                Matrix matrix3 = this.f13662g;
                Matrix matrix4 = new Matrix();
                if (matrix != null) {
                    matrix4.postConcat(AbstractC7352m.m11777b(this.f13656a.m13188b()));
                    matrix4.postConcat(matrix);
                    matrix4.postConcat(this.f13656a.m13188b());
                }
                matrix3.postConcat(matrix4);
            }
            InterfaceC8888c interfaceC8888c2 = this.f13659d;
            if (interfaceC8888c2 != null) {
                RectF rectF = this.f13661f;
                this.f13660e.m6219V(interfaceC8888c2, rectF != null ? this.f13663h ? C7355p.f11924a.m11786a(rectF, this.f13662g, this.f13665j) : C7355p.f11924a.m11787b(rectF, this.f13662g, this.f13665j) : null, this.f13664i);
            }
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: y */
    public void mo13460y(String str, InterfaceC8888c graph) {
        AbstractC8886a abstractC8886aMo15001n;
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m3239i("GraphControl:addGraph -> [" + graph.graphType() + "] parentId:" + str + ", graphId:" + graph.getId());
        if (str == null || StringsKt.isBlank(str)) {
            this.f13659d = graph;
            if (this.f13666k) {
                this.f13660e.m6222f(graph);
                return;
            }
            return;
        }
        InterfaceC8888c interfaceC8888c = this.f13659d;
        if (interfaceC8888c == null || interfaceC8888c == null || (abstractC8886aMo15001n = interfaceC8888c.mo15001n(str)) == null) {
            return;
        }
        abstractC8886aMo15001n.mo6753s(graph);
        if (this.f13666k) {
            this.f13660e.m6222f(graph);
        }
    }

    @Override // p142k4.InterfaceC7880c
    /* renamed from: z */
    public void mo13461z(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f13670o.m12590b(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }
}
