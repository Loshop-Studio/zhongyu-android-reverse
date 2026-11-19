package p006a5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
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
import p023b5.C5120j;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p263u5.AbstractC9695n;
import p263u5.C9698q;
import p272v4.C9763b;
import p292x4.C9881e;
import p302y4.C9950c;
import p302y4.C9952e;
import p312z4.C9998a;

/* renamed from: a5.b */
/* loaded from: classes4.dex */
public final class C0038b implements InterfaceC0039c {

    /* renamed from: a */
    public final C9998a f114a;

    /* renamed from: b */
    public final C5120j f115b;

    /* renamed from: c */
    public final C9763b f116c;

    /* renamed from: d */
    public InterfaceC8055c f117d;

    /* renamed from: e */
    public DrawControl f118e;

    /* renamed from: f */
    public RectF f119f;

    /* renamed from: g */
    public Matrix f120g;

    /* renamed from: h */
    public boolean f121h;

    /* renamed from: i */
    public Paint f122i;

    /* renamed from: j */
    public float f123j;

    /* renamed from: k */
    public boolean f124k;

    /* renamed from: l */
    public int f125l;

    /* renamed from: m */
    public final BackgroundLineConfig f126m;

    /* renamed from: n */
    public Function1 f127n;

    /* renamed from: o */
    public final C9881e f128o;

    public C0038b(C9998a matrixAdapter, C5120j renderLayer, C9763b boardConfig) {
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        this.f114a = matrixAdapter;
        this.f115b = renderLayer;
        this.f116c = boardConfig;
        this.f118e = new DrawControl(boardConfig);
        this.f120g = new Matrix();
        this.f121h = true;
        this.f124k = true;
        this.f126m = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        matrixAdapter.m17354l(renderLayer.m2186e());
        this.f118e.m7309P(matrixAdapter);
        this.f118e.m7310Q(renderLayer);
        this.f128o = new C9881e(this.f118e);
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: A */
    public void mo174A(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(groupGraph, "groupGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        if (this.f117d != null) {
            this.f128o.m16920e(groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: B */
    public void mo175B(Path path, Paint paint, Matrix matrix) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f118e.m7334w(path, paint, matrix);
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: C */
    public void mo176C(String graphId, String content, Paint paint, RectF originRectF) {
        List<InterfaceC8055c> listMo12796e;
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(originRectF, "originRectF");
        LogUtils.m2956i("GraphControl:changeTextGraph -> graphId: " + graphId);
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c == null || (listMo12796e = interfaceC8055c.mo12796e()) == null) {
            return;
        }
        for (InterfaceC8055c interfaceC8055c2 : listMo12796e) {
            if (Intrinsics.areEqual(interfaceC8055c2.getId(), graphId) && (interfaceC8055c2 instanceof C8101d)) {
                C8101d c8101d = (C8101d) interfaceC8055c2;
                c8101d.m12944J(content);
                c8101d.m12945K(paint);
                c8101d.mo7862n(originRectF);
                if (mo181H()) {
                    DrawControl drawControl = this.f118e;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC8055c interfaceC8055c3 = this.f117d;
                    if (interfaceC8055c3 != null) {
                        arrayList.add(interfaceC8055c3);
                    }
                    drawControl.m7332u(arrayList);
                    RectF rectF = this.f119f;
                    if (rectF != null) {
                        Path pathM16210a = this.f121h ? C9698q.f17137a.m16210a(rectF, this.f120g, this.f123j) : C9698q.f17137a.m16211b(rectF, this.f120g, this.f123j);
                        this.f118e.m7306M();
                        this.f118e.m7305L(pathM16210a, this.f122i);
                    }
                }
            }
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: D */
    public void mo177D(Matrix matrix) {
        LogUtils.m2956i("GraphControl:cameraChangeEnd");
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            if (matrix != null) {
                this.f114a.m17343a(matrix);
            }
            if (this.f124k) {
                this.f118e.m7319g(interfaceC8055c);
            }
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: E */
    public void mo178E(C8101d graph) {
        InterfaceC8055c interfaceC8055c;
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m2956i("GraphControl:textHandleStart");
        if (this.f124k && (interfaceC8055c = this.f117d) != null) {
            RectF rectF = this.f119f;
            this.f118e.m7313T(interfaceC8055c, graph, rectF != null ? this.f121h ? C9698q.f17137a.m16210a(rectF, this.f120g, this.f123j) : C9698q.f17137a.m16211b(rectF, this.f120g, this.f123j) : null, this.f122i);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: F */
    public void mo179F(float f10, float f11, float f12, float f13) {
        this.f128o.m16916a(f10, f11, f12, f13);
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: G */
    public RectF mo180G() {
        return new RectF(this.f118e.m7337z());
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: H */
    public boolean mo181H() {
        return this.f124k;
    }

    /* renamed from: I */
    public void m182I(InterfaceC8055c graph, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        graph.mo7858d(matrix);
    }

    /* renamed from: J */
    public Bitmap m183J() {
        InterfaceC8055c interfaceC8055c;
        if (!mo181H() || (interfaceC8055c = this.f117d) == null) {
            return null;
        }
        return this.f118e.m7324l(interfaceC8055c);
    }

    /* renamed from: K */
    public BackgroundLineConfig m184K() {
        return this.f118e.m7336y();
    }

    /* renamed from: L */
    public int m185L() {
        return this.f125l;
    }

    /* renamed from: M */
    public BackgroundLineConfig m186M() {
        return this.f126m;
    }

    /* renamed from: N */
    public int m187N() {
        List listMo12796e;
        InterfaceC8055c interfaceC8055c = this.f117d;
        int i9 = 0;
        if (interfaceC8055c != null && (listMo12796e = interfaceC8055c.mo12796e()) != null) {
            Iterator it = listMo12796e.iterator();
            while (it.hasNext()) {
                if (((InterfaceC8055c) it.next()) instanceof ImageGraph) {
                    i9++;
                }
            }
        }
        return i9;
    }

    /* renamed from: O */
    public void m188O() {
        LogUtils.m2956i("GraphControl:release");
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            interfaceC8055c.onDestroy();
        }
        this.f118e.m7301H();
    }

    /* renamed from: P */
    public void m189P() {
        LogUtils.m2956i("GraphControl:reset");
        m190Q();
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            interfaceC8055c.onDestroy();
        }
        this.f117d = null;
        this.f118e.m7303J();
    }

    /* renamed from: Q */
    public final void m190Q() {
        mo200c(this.f125l);
        mo215r(this.f126m);
    }

    /* renamed from: R */
    public Bitmap m191R() {
        InterfaceC8055c interfaceC8055c;
        if (!mo181H() || (interfaceC8055c = this.f117d) == null) {
            return null;
        }
        return this.f118e.m7304K(interfaceC8055c);
    }

    /* renamed from: S */
    public void m192S(int i9) {
        this.f125l = i9;
        this.f118e.m7307N(i9);
    }

    /* renamed from: T */
    public void m193T(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        BackgroundLineConfig backgroundLineConfig2 = this.f126m;
        backgroundLineConfig2.m7075g(backgroundLineConfig.m7071c());
        backgroundLineConfig2.m7073e(backgroundLineConfig.m7069a());
        backgroundLineConfig2.m7074f(backgroundLineConfig.m7070b());
        this.f118e.m7308O(backgroundLineConfig);
    }

    /* renamed from: U */
    public final void m194U(Function1 function1) {
        this.f127n = function1;
    }

    /* renamed from: V */
    public void m195V(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.f118e.m7337z().set(rectF);
    }

    /* renamed from: W */
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m196W() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b snapshot;
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c == null || (snapshot = interfaceC8055c.getSnapshot()) == null) {
            return null;
        }
        return snapshot.build();
    }

    /* renamed from: X */
    public void m197X() {
        this.f118e.m7317X(this.f114a.m17344b());
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: a */
    public void mo198a(ImageGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m2956i("GraphControl:addImageGraph -> graphId:" + graph.getId());
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            if (interfaceC8055c != null) {
                interfaceC8055c.mo12793a(graph);
            }
            mo202e();
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: b */
    public String mo199b() {
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            return interfaceC8055c.getId();
        }
        return null;
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: c */
    public void mo200c(int i9) {
        LogUtils.m2956i("GraphControl:updateBackground -> color:" + i9);
        this.f118e.m7307N(i9);
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: d */
    public void mo201d() {
        if (this.f124k) {
            this.f119f = null;
            this.f120g.reset();
            this.f118e.m7306M();
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: e */
    public synchronized void mo202e() {
        try {
            if (this.f124k) {
                LogUtils.m2956i("GraphControl:reDrawFixView -> cameraMatrix=" + this.f114a.m17346d());
                DrawControl drawControl = this.f118e;
                ArrayList arrayList = new ArrayList();
                InterfaceC8055c interfaceC8055c = this.f117d;
                if (interfaceC8055c != null) {
                    arrayList.add(interfaceC8055c);
                }
                drawControl.m7332u(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: f */
    public void mo203f(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        if (mo181H()) {
            this.f118e.m7331t(graphList);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: g */
    public void mo204g(C8101d graph, RectF rectF, Matrix matrix) {
        InterfaceC8055c interfaceC8055c;
        Path pathM16210a;
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m2956i("GraphControl:textHandleEnd");
        if (this.f124k && (interfaceC8055c = this.f117d) != null) {
            if (rectF != null) {
                this.f119f = rectF;
                this.f120g.set(matrix);
                pathM16210a = this.f121h ? C9698q.f17137a.m16210a(rectF, this.f120g, this.f123j) : C9698q.f17137a.m16211b(rectF, this.f120g, this.f123j);
            } else {
                pathM16210a = null;
            }
            this.f118e.m7312S(interfaceC8055c, pathM16210a, this.f122i);
        }
    }

    @Override // p006a5.InterfaceC0039c
    public int getBackgroundColor() {
        return this.f118e.m7335x();
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: h */
    public void mo205h(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f128o.m16917b(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: i */
    public void mo206i(List graphList, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f124k) {
            DrawControl drawControl = this.f118e;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(AbstractC9695n.m16200b(this.f114a.m17344b()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.f114a.m17344b());
            drawControl.m7314U(matrix2);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: j */
    public void mo207j(boolean z9) {
        this.f124k = z9;
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: k */
    public void mo208k(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(groupGraph, "groupGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            this.f128o.m16919d(interfaceC8055c, groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: l */
    public void mo209l(RectF rectF, List graphList) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        if (this.f124k && !rectF.isEmpty()) {
            this.f118e.m7302I(rectF, graphList);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: m */
    public InterfaceC8055c mo210m() {
        return this.f117d;
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: n */
    public void mo211n() {
        InterfaceC8055c interfaceC8055c;
        LogUtils.m2956i("GraphControl:cameraChangeStart ");
        if (this.f124k && (interfaceC8055c = this.f117d) != null) {
            this.f118e.m7320h(interfaceC8055c);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: o */
    public void mo212o(List graphList) {
        InterfaceC8055c interfaceC8055c;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        if (graphList.isEmpty() || (interfaceC8055c = this.f117d) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:delete -> root:");
        sb.append(interfaceC8055c.getId());
        sb.append(": ");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8055c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m2956i(sb.toString());
        interfaceC8055c.mo12800j(graphList);
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) it2.next();
            Function1 function1 = this.f127n;
            if (function1 != null) {
                function1.invoke(interfaceC8055c2);
            }
        }
        if (this.f124k) {
            this.f118e.m7325m(interfaceC8055c);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: p */
    public RectF mo213p() {
        return new RectF(this.f115b.m2186e());
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: q */
    public void mo214q(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f124k && this.f117d != null) {
            DrawControl drawControl = this.f118e;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(AbstractC9695n.m16200b(this.f114a.m17347e()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.f114a.m17347e());
            drawControl.m7321i(matrix2);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: r */
    public void mo215r(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f118e.m7308O(backgroundLineConfig);
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: s */
    public void mo216s(C8101d graph, RectF rectF, Matrix matrix) {
        Path pathM16210a;
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (this.f124k) {
            if (rectF != null) {
                this.f119f = rectF;
                this.f120g.set(matrix);
                pathM16210a = this.f121h ? C9698q.f17137a.m16210a(rectF, this.f120g, this.f123j) : C9698q.f17137a.m16211b(rectF, this.f120g, this.f123j);
            } else {
                pathM16210a = null;
            }
            this.f118e.m7311R(graph, pathM16210a, this.f122i);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: t */
    public void mo217t(String graphId, RectF originRectF, Matrix renderMatrix, String filePath) {
        List<InterfaceC8055c> listMo12796e;
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(originRectF, "originRectF");
        Intrinsics.checkNotNullParameter(renderMatrix, "renderMatrix");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        LogUtils.m2956i("GraphControl:changeImageGraph -> graphId: " + graphId);
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c == null || (listMo12796e = interfaceC8055c.mo12796e()) == null) {
            return;
        }
        for (InterfaceC8055c interfaceC8055c2 : listMo12796e) {
            if (Intrinsics.areEqual(interfaceC8055c2.getId(), graphId) && (interfaceC8055c2 instanceof ImageGraph)) {
                ImageGraph imageGraph = (ImageGraph) interfaceC8055c2;
                imageGraph.mo7862n(originRectF);
                imageGraph.m7868z(renderMatrix);
                imageGraph.m7871N(filePath);
                if (mo181H()) {
                    DrawControl drawControl = this.f118e;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC8055c interfaceC8055c3 = this.f117d;
                    if (interfaceC8055c3 != null) {
                        arrayList.add(interfaceC8055c3);
                    }
                    drawControl.m7332u(arrayList);
                }
            }
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: u */
    public void mo218u(List graphList) {
        InterfaceC8055c interfaceC8055c;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:translationStart -> graph:");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8055c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m2956i(sb.toString());
        if (this.f124k && (interfaceC8055c = this.f117d) != null) {
            RectF rectF = this.f119f;
            this.f118e.m7316W(interfaceC8055c, graphList, rectF != null ? this.f121h ? C9698q.f17137a.m16210a(rectF, this.f120g, this.f123j) : C9698q.f17137a.m16211b(rectF, this.f120g, this.f123j) : null, this.f122i);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: v */
    public void mo219v(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c != null) {
            this.f128o.m16918c(interfaceC8055c, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: w */
    public void mo220w(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z9) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f124k) {
            this.f119f = rectF;
            this.f122i = paint;
            this.f123j = f10;
            this.f120g.set(matrix);
            this.f121h = z9;
            if (this.f117d != null) {
                Path pathM16210a = z9 ? C9698q.f17137a.m16210a(rectF, matrix, f10) : C9698q.f17137a.m16211b(rectF, matrix, f10);
                this.f118e.m7306M();
                this.f118e.m7305L(pathM16210a, paint);
            }
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: x */
    public void mo221x(InterfaceC8055c rootGraph) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:init -> ");
        sb.append(rootGraph.getId());
        sb.append(": ");
        List listMo12796e = rootGraph.mo12796e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo12796e, 10));
        Iterator it = listMo12796e.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8055c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m2956i(sb.toString());
        this.f117d = rootGraph;
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: y */
    public void mo222y(String str, InterfaceC8055c graph) {
        AbstractC8053a abstractC8053aMo12801m;
        Intrinsics.checkNotNullParameter(graph, "graph");
        LogUtils.m2956i("GraphControl:addGraph -> [" + graph.graphType() + "] parentId:" + str + ", graphId:" + graph.getId());
        if (str == null || StringsKt.isBlank(str)) {
            this.f117d = graph;
            if (this.f124k) {
                this.f118e.m7318f(graph);
                return;
            }
            return;
        }
        InterfaceC8055c interfaceC8055c = this.f117d;
        if (interfaceC8055c == null || interfaceC8055c == null || (abstractC8053aMo12801m = interfaceC8055c.mo12801m(str)) == null) {
            return;
        }
        abstractC8053aMo12801m.mo7864r(graph);
        if (this.f124k) {
            this.f118e.m7318f(graph);
        }
    }

    @Override // p006a5.InterfaceC0039c
    /* renamed from: z */
    public void mo223z(List graphList, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:translationEnd -> matrix:");
        sb.append(matrix);
        sb.append(" graph:");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(graphList, 10));
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8055c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m2956i(sb.toString());
        Iterator it2 = graphList.iterator();
        while (it2.hasNext()) {
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it2.next();
            Matrix matrix2 = new Matrix();
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            Unit unit = Unit.INSTANCE;
            m182I(interfaceC8055c, matrix2);
        }
        if (this.f124k) {
            if (this.f119f != null) {
                Matrix matrix3 = this.f120g;
                Matrix matrix4 = new Matrix();
                if (matrix != null) {
                    matrix4.postConcat(AbstractC9695n.m16200b(this.f114a.m17344b()));
                    matrix4.postConcat(matrix);
                    matrix4.postConcat(this.f114a.m17344b());
                }
                matrix3.postConcat(matrix4);
            }
            InterfaceC8055c interfaceC8055c2 = this.f117d;
            if (interfaceC8055c2 != null) {
                RectF rectF = this.f119f;
                this.f118e.m7315V(interfaceC8055c2, rectF != null ? this.f121h ? C9698q.f17137a.m16210a(rectF, this.f120g, this.f123j) : C9698q.f17137a.m16211b(rectF, this.f120g, this.f123j) : null, this.f122i);
            }
        }
    }
}
