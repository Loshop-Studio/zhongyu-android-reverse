package com.zykj.blackboard.core.edit;

// RE note 管理 Blackboard 页面编辑状态及页面快照。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.AbstractC8326b;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.blackboard.utils.OutOfMaxImageCountException;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10214b;
import ma.InterfaceC10215c;
import ma.InterfaceC10216d;
import ma.InterfaceC10217e;
import ma.InterfaceC10219g;
import ma.InterfaceC10221i;
import ma.InterfaceC10223k;
import na.AbstractC10344g;
import na.AbstractC10350m;
import na.AbstractC10351n;
import na.AbstractC10353p;
import na.C10346i;
import na.C10357t;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p194ia.C9619c;
import p194ia.InterfaceC9618b;
import p309qc.C10786q;
import p322r9.InterfaceC10919c;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p377v9.C11551b;
import p390w9.C11719h;
import p422y9.AbstractC11936o;
import p422y9.C11933l;

/* loaded from: classes5.dex */
public final class PageControl extends BasePageControl {
    public /* synthetic */ PageControl(BoardControl boardControl, C11719h c11719h, PageEntity pageEntity, int i10, AbstractC9972n abstractC9972n) {
        this(boardControl, c11719h, (i10 & 4) != 0 ? null : pageEntity);
    }

    /* renamed from: k0 */
    public static /* synthetic */ ImageGraph m14448k0(PageControl pageControl, File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return pageControl.m14465j0(file, positionEnum, scaleTypeEnum, num, num2, z10);
    }

    /* renamed from: m0 */
    public static /* synthetic */ ImageGraph m14449m0(PageControl pageControl, String str, String str2, float f10, float f11, Matrix matrix, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return pageControl.m14468l0(str, str2, f10, f11, matrix, z10);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: A */
    public ImageGraph mo14450A(String path) throws Throwable {
        String strM14635b;
        AbstractC9979u.m20294g(path, "path");
        if (mo14482y() >= m14392O().getConfig().m22917x()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM26500h = AbstractC11936o.m26500h(this, path);
        if (fileM26500h == null || (strM14635b = FileValidateUtils.m14635b(FileValidateUtils.f18689a, fileM26500h, null, 2, null)) == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (m14393P().mo25454n() == null) {
            return null;
        }
        String name = fileM26500h.getName();
        AbstractC9979u.m20293f(name, "newFile.name");
        Matrix matrixM14471n0 = m14471n0(f10, f11);
        matrixM14471n0.postConcat(m14395R().m25313d());
        C10786q c10786q = C10786q.f26013a;
        ImageGraph imageGraphM14449m0 = m14449m0(this, name, strM14635b, f10, f11, matrixM14471n0, false, 32, null);
        m14407d0();
        return imageGraphM14449m0;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: B */
    public void mo14451B(InterfaceC10214b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        m14400W().m18860c().m14611g0(listener);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: C */
    public void mo14452C(InterfaceC10217e interfaceC10217e) {
        m14390M().m23784x(interfaceC10217e);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: D */
    public void mo14453D(InterfaceC10214b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        m14400W().m18860c().m14607a0(listener);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: E */
    public ImageGraph mo14454E(Bitmap bitmap, String filename, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z10, boolean z11) throws OutOfMaxImageCountException {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(filename, "filename");
        AbstractC9979u.m20294g(position, "position");
        AbstractC9979u.m20294g(scaleType, "scaleType");
        if (mo14482y() >= m14392O().getConfig().m22917x()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM26499g = AbstractC11936o.m26499g(this, bitmap, z11, filename);
        if (fileM26499g == null) {
            return null;
        }
        return m14465j0(fileM26499g, position, scaleType, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), z10);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: F */
    public void mo14455F(List graphIdList) {
        AbstractC9979u.m20294g(graphIdList, "graphIdList");
        m14392O().getConfig().m22897h0(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
        InterfaceC10919c interfaceC10919cM23778r = m14390M().m23778r();
        AbstractC9979u.m20292e(interfaceC10919cM23778r, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) interfaceC10919cM23778r).m13867U(graphIdList);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: a */
    public void mo14456a(MotionEvent motionEvent) {
        AbstractC9979u.m20294g(motionEvent, "motionEvent");
        m14390M().m23781u(motionEvent);
    }

    @Override // p422y9.InterfaceC11935n
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC10919c interfaceC10919cM23778r = m14390M().m23778r();
        if (interfaceC10919cM23778r instanceof AbstractC8326b) {
            ((AbstractC8326b) interfaceC10919cM23778r).m13841m(f10, f11);
        }
    }

    @Override // p422y9.InterfaceC11935n
    public void areaMoveStart() {
        InterfaceC10919c interfaceC10919cM23778r = m14390M().m23778r();
        if (interfaceC10919cM23778r instanceof AbstractC8326b) {
            ((AbstractC8326b) interfaceC10919cM23778r).m13842n();
        }
    }

    @Override // p422y9.InterfaceC11935n
    public void areaMoving(Float f10, Float f11) {
        InterfaceC10919c interfaceC10919cM23778r = m14390M().m23778r();
        if (interfaceC10919cM23778r instanceof AbstractC8326b) {
            ((AbstractC8326b) interfaceC10919cM23778r).m13843o(f10, f11);
        }
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: c */
    public List mo14457c() {
        List listMo2717f;
        InterfaceC5181c interfaceC5181cMo25454n = m14393P().mo25454n();
        if (interfaceC5181cMo25454n == null || (listMo2717f = interfaceC5181cMo25454n.mo2717f()) == null) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo2717f) {
            if (obj instanceof ImageGraph) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ImageGraph imageGraph = (ImageGraph) obj2;
            if (imageGraph.m2863E() == null) {
                imageGraph.m2865G();
            }
            String strM2863E = imageGraph.m2863E();
            if (strM2863E == null) {
                strM2863E = "";
            }
            arrayList2.add(strM2863E);
        }
        return arrayList2;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: d */
    public void mo14458d() {
        if (mo14479u()) {
            m14391N().m26478d(new InterfaceC9540l() { // from class: com.zykj.blackboard.core.edit.PageControl$turnOnMicro$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, IllegalArgumentException {
                    invoke((String) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(String fileName) throws IllegalAccessException, IllegalArgumentException {
                    AbstractC9979u.m20294g(fileName, "fileName");
                    this.f18545c.m14400W().m18858a().m14551e(fileName, 0L, System.currentTimeMillis());
                }
            });
        }
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: e */
    public ImageGraph mo14459e(String path, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z10) throws Throwable {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(position, "position");
        AbstractC9979u.m20294g(scaleType, "scaleType");
        if (mo14482y() >= m14392O().getConfig().m22917x()) {
            throw new OutOfMaxImageCountException();
        }
        File fileM26500h = AbstractC11936o.m26500h(this, path);
        if (fileM26500h == null) {
            return null;
        }
        return m14448k0(this, fileM26500h, position, scaleType, null, null, z10, 24, null);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: f */
    public void mo14460f() {
        m14394Q().m26481b();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: g */
    public void mo14461g(int i10, BackgroundLineConfig backgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        int iM25426L = m14393P().m25426L();
        BackgroundLineConfig backgroundLineConfigM25427M = m14393P().m25427M();
        if (iM25426L != i10 || !AbstractC9979u.m20289b(backgroundLineConfigM25427M, backgroundLineConfig)) {
            C10346i c10346i = C10346i.f24652a;
            c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
            c10346i.m21640b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        m14393P().mo25444d(i10);
        m14393P().mo25459s(backgroundLineConfig);
        m14393P().mo25447g();
        m14400W().m18860c().m14596H(i10, i10, backgroundLineConfigM25427M, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity headerEntity = (HeaderEntity) m14397T().m14240e().m19036d();
        if (headerEntity != null) {
            headerEntity.m14166w(i10);
            ToOne toOneM14153j = headerEntity.m14153j();
            BackgroundLineConfigEntity backgroundLineConfigEntityM21635d = AbstractC10344g.m21635d(backgroundLineConfig);
            backgroundLineConfigEntityM21635d.m14034f();
            toOneM14153j.m19043o(backgroundLineConfigEntityM21635d);
            headerEntity.m14160q();
        }
        m14407d0();
    }

    @Override // p422y9.InterfaceC11935n
    public int getBackgroundColor() {
        return m14393P().m25426L();
    }

    @Override // p422y9.InterfaceC11935n
    public float getMoveHorizontalProgress() {
        InterfaceC10919c interfaceC10919cM23778r = m14390M().m23778r();
        if (interfaceC10919cM23778r instanceof AbstractC8326b) {
            return ((AbstractC8326b) interfaceC10919cM23778r).m13849u();
        }
        return 0.0f;
    }

    @Override // p422y9.InterfaceC11935n
    public float getMoveVerticalProgress() {
        InterfaceC10919c interfaceC10919cM23778r = m14390M().m23778r();
        Log.i("MoveProgress", String.valueOf(interfaceC10919cM23778r));
        if (interfaceC10919cM23778r instanceof AbstractC8326b) {
            return ((AbstractC8326b) interfaceC10919cM23778r).m13850w();
        }
        return 0.0f;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: h */
    public void mo14462h(InterfaceC10219g listener) {
        AbstractC9979u.m20294g(listener, "listener");
        m14391N().m26477c(listener);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: i */
    public boolean mo14463i() {
        return m14391N().m26476b();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: j */
    public float mo14464j() {
        return AbstractC10351n.m21659a(m14395R().m25313d());
    }

    /* renamed from: j0 */
    public final ImageGraph m14465j0(File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z10) {
        String strM14635b = FileValidateUtils.m14635b(FileValidateUtils.f18689a, file, null, 2, null);
        if (strM14635b == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "localFile.absolutePath");
        Float[] fArrM26498f = AbstractC11936o.m26498f(this, absolutePath, scaleTypeEnum, num, num2);
        String name = file.getName();
        AbstractC9979u.m20293f(name, "localFile.name");
        ImageGraph imageGraphM14468l0 = m14468l0(name, strM14635b, fArrM26498f[0].floatValue(), fArrM26498f[1].floatValue(), AbstractC11936o.m26497e(this, fArrM26498f[0].floatValue(), fArrM26498f[1].floatValue(), positionEnum, 0, 8, null), z10);
        m14407d0();
        return imageGraphM14468l0;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: k */
    public void mo14466k(InterfaceC10221i recordListener) {
        AbstractC9979u.m20294g(recordListener, "recordListener");
        m14402Y().m18870f(recordListener);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: l */
    public void mo14467l(InterfaceC10215c listener) {
        AbstractC9979u.m20294g(listener, "listener");
        m14390M().m23779s().add(listener);
    }

    /* renamed from: l0 */
    public final ImageGraph m14468l0(String str, String str2, float f10, float f11, Matrix matrix, boolean z10) {
        CommandInfoEntity commandInfoEntityM14595D;
        String strMo25442b = m14393P().mo25442b();
        if (strMo25442b == null || (commandInfoEntityM14595D = m14400W().m18860c().m14595D(strMo25442b, str, EzyGraphEnum.GraphEnum.IMAGE_GRAPH, str2, (int) f10, (int) f11, System.currentTimeMillis(), m14392O().getConfig().m22873Q())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandInfoEntityM14595D.m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        AbstractC5179a abstractC5179aMo14497c = graphBuildFactory.mo14497c(graphData, m14401X());
        if (abstractC5179aMo14497c == null) {
            return null;
        }
        Matrix matrix2 = new Matrix(matrix);
        if (!z10) {
            matrix2.postConcat(AbstractC10351n.m21660b(m14395R().m25311b()));
        }
        m14390M().mo23763c(AbstractC10978w.m24129g(abstractC5179aMo14497c), AbstractC10978w.m24141s(AbstractC10351n.m21664f(matrix2, System.currentTimeMillis())));
        abstractC5179aMo14497c.mo2716e(matrix2);
        C10346i c10346i = C10346i.f24652a;
        c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
        if (m14392O().getConfig().m22873Q()) {
            C11551b c11551bM14393P = m14393P();
            AbstractC9979u.m20292e(abstractC5179aMo14497c, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
            c11551bM14393P.mo25441a((ImageGraph) abstractC5179aMo14497c);
        } else {
            m14393P().mo25446f(graphData.m15000F(), abstractC5179aMo14497c);
        }
        String absolutePath = new File(C9619c.f22151d.m18862a(m14398U(), DocumentType.IMAGE), str).getAbsolutePath();
        if (mo14479u()) {
            m14399V().add(absolutePath);
        } else {
            m14396S().add(absolutePath);
        }
        AbstractC9979u.m20292e(abstractC5179aMo14497c, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
        return (ImageGraph) abstractC5179aMo14497c;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: m */
    public boolean mo14469m() {
        C10346i c10346i = C10346i.f24652a;
        c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        C11933l c11933lM26484e = m14394Q().m26484e();
        if (c11933lM26484e == null) {
            return false;
        }
        m14400W().m18860c().m14606Y(c11933lM26484e.m26487c(), c11933lM26484e.m26485a(), System.currentTimeMillis());
        return true;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: n */
    public void mo14470n(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        m14390M().m23783w(listener);
    }

    /* renamed from: n0 */
    public final Matrix m14471n0(float f10, float f11) {
        float fMax;
        List<InterfaceC5181c> listMo2717f;
        float fMin = Math.min(f10, m14392O().getConfig().m22869M());
        float f12 = fMin / f10;
        float f13 = (f11 * fMin) / f10;
        Matrix matrix = new Matrix();
        matrix.setScale(f12, f12);
        matrix.postConcat(AbstractC11936o.m26497e(this, fMin, f13, EzyPositionEnum.PositionEnum.TOP_CENTER, 0, 8, null));
        InterfaceC5181c interfaceC5181cMo25454n = m14393P().mo25454n();
        if (interfaceC5181cMo25454n == null || (listMo2717f = interfaceC5181cMo25454n.mo2717f()) == null) {
            fMax = 0.0f;
        } else {
            fMax = 0.0f;
            for (InterfaceC5181c interfaceC5181c : listMo2717f) {
                if (interfaceC5181c instanceof ImageGraph) {
                    fMax = Math.max(interfaceC5181c.mo2715d().bottom, fMax);
                }
            }
        }
        matrix.postTranslate(0.0f, fMax);
        return matrix;
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: o */
    public C5414d mo14472o(String content, EzyPositionEnum.PositionEnum position, int i10) {
        CommandInfoEntity commandInfoEntityM14599N;
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(position, "position");
        Paint paint = new Paint();
        paint.setColor(m14392O().getConfig().m22884b());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(m14392O().getConfig().m22890e());
        paint.setDither(true);
        paint.setAntiAlias(true);
        float fWidth = m14392O().getConfig().m22892f().width();
        float fHeight = m14392O().getConfig().m22892f().height();
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C10357t.f24666a.m21684a(content, paint, fWidth).size();
        float f10 = size > fHeight ? size : fHeight;
        String strMo25442b = m14393P().mo25442b();
        if (strMo25442b == null || (commandInfoEntityM14599N = m14400W().m18860c().m14599N(strMo25442b, fWidth, f10, AbstractC10350m.m21653a(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandInfoEntityM14599N.m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        AbstractC5179a abstractC5179aMo14497c = graphBuildFactory.mo14497c(graphData, m14401X());
        if (abstractC5179aMo14497c == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(AbstractC11936o.m26496d(this, fWidth, f10, position, i10));
        matrix.postConcat(AbstractC10351n.m21660b(m14395R().m25311b()));
        m14390M().mo23763c(AbstractC10978w.m24129g(abstractC5179aMo14497c), AbstractC10978w.m24141s(AbstractC10351n.m21664f(matrix, System.currentTimeMillis())));
        abstractC5179aMo14497c.mo2716e(matrix);
        m14393P().mo25446f(strMo25442b, abstractC5179aMo14497c);
        return (C5414d) abstractC5179aMo14497c;
    }

    /* renamed from: o0 */
    public final void m14473o0(InterfaceC9529a interfaceC9529a) throws Throwable {
        List listMo2717f;
        if (mo14479u()) {
            stopRecord();
        }
        Bitmap bitmap = (Bitmap) interfaceC9529a.invoke();
        if (bitmap != null) {
            AbstractC10353p.f24663a.m21673a(m14398U(), "screenshot.png", bitmap);
        }
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM25439Y = m14393P().m25439Y();
        if (graphSnapshotM25439Y != null) {
            EzyPageSnapshot.PageSnapshot.C8498b c8498bM15586o = EzyPageSnapshot.PageSnapshot.m15586o();
            c8498bM15586o.m15707y(graphSnapshotM25439Y);
            c8498bM15586o.m15705w(AbstractC10351n.m21664f(m14395R().m25313d(), 0L));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[PageControl]:saveData -> [");
            sb2.append(getFileName());
            sb2.append("] s:");
            sb2.append(graphSnapshotM25439Y.getChildGraphList().size());
            sb2.append(", g:");
            InterfaceC5181c interfaceC5181cMo25454n = m14393P().mo25454n();
            sb2.append((interfaceC5181cMo25454n == null || (listMo2717f = interfaceC5181cMo25454n.mo2717f()) == null) ? null : Integer.valueOf(listMo2717f.size()));
            sb2.append("cm:");
            sb2.append(c8498bM15586o.m15693k().getScaleX());
            LogUtils.m3888i(sb2.toString());
            AbstractC10353p.a aVar = AbstractC10353p.f24663a;
            String strM14398U = m14398U();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c8498bM15586o.build();
            AbstractC9979u.m20293f(pageSnapshotBuild, "builder.build()");
            aVar.m21674b(strM14398U, "snapshot.bin", pageSnapshotBuild);
        }
        HeaderEntity headerEntity = (HeaderEntity) m14397T().m14240e().m19036d();
        if (headerEntity != null) {
            headerEntity.m14167x(System.currentTimeMillis());
            headerEntity.m14163t(m14402Y().m18867c(System.currentTimeMillis()));
            headerEntity.m14162s(m14393P().m25428N());
            headerEntity.m14166w(m14393P().m25426L());
            ToOne toOneM14148e = headerEntity.m14148e();
            BackgroundLineConfigEntity backgroundLineConfigEntityM21635d = AbstractC10344g.m21635d(m14393P().m25429O());
            backgroundLineConfigEntityM21635d.m14034f();
            toOneM14148e.m19043o(backgroundLineConfigEntityM21635d);
            ToOne toOneM14153j = headerEntity.m14153j();
            BackgroundLineConfigEntity backgroundLineConfigEntityM21635d2 = AbstractC10344g.m21635d(m14393P().m25427M());
            backgroundLineConfigEntityM21635d2.m14034f();
            toOneM14153j.m19043o(backgroundLineConfigEntityM21635d2);
            ToOne toOneM14154k = headerEntity.m14154k();
            MoveConfigEntity moveConfigEntityM21636e = AbstractC10344g.m21636e(m14392O().getConfig().m22919z());
            moveConfigEntityM21636e.m14230i();
            toOneM14154k.m19043o(moveConfigEntityM21636e);
            headerEntity.m14160q();
        }
        if (m14397T().m14243h()) {
            m14397T().m14245j(false);
            m14397T().m14246k("");
            m14397T().m14247l(-1);
            m14397T().m14244i();
        }
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: p */
    public void mo14474p(float f10, float f11, float f12) {
        Matrix matrix = new Matrix(m14395R().m25313d());
        float fM21659a = AbstractC10351n.m21659a(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.postScale(fM21659a, fM21659a, f10, f11);
        matrix.postConcat(AbstractC10351n.m21660b(matrix2));
        matrix.postScale(f12, f12, f10, f11);
        Matrix matrixM25313d = m14395R().m25313d();
        m14395R().m25319j(matrix);
        m14408e0(AbstractC10351n.m21664f(matrixM25313d, 0L), AbstractC10351n.m21664f(m14395R().m25313d(), 0L));
        C10346i c10346i = C10346i.f24652a;
        c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.WRITE_NEW_GROUP);
        m14393P().mo25447g();
        m14393P().m25440Z();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: q */
    public void mo14475q(boolean z10) {
        m14402Y().m18873i(System.currentTimeMillis());
        if (z10) {
            mo14458d();
        }
        m14399V().addAll(m14396S());
        m14396S().clear();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: r */
    public void mo14476r() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        m14391N().m26479e(new InterfaceC9544p() { // from class: com.zykj.blackboard.core.edit.PageControl$turnOffMicro$1
            {
                super(2);
            }

            /* renamed from: a */
            public final void m14486a(String fileName, long j10) {
                AbstractC9979u.m20294g(fileName, "fileName");
                this.f18544c.m14400W().m18858a().m14556j(fileName, j10);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m14486a((String) obj, ((Number) obj2).longValue());
                return C10786q.f26013a;
            }
        });
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: s */
    public void mo14477s() throws Throwable {
        m14473o0(new InterfaceC9529a() { // from class: com.zykj.blackboard.core.edit.PageControl$saveWithContentThumbnail$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bitmap invoke() {
                return this.f18543c.m14393P().m25425K();
            }
        });
    }

    @Override // p422y9.InterfaceC11935n
    public void save() throws Throwable {
        m14473o0(new InterfaceC9529a() { // from class: com.zykj.blackboard.core.edit.PageControl.save.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bitmap invoke() {
                return PageControl.this.m14393P().m25434T();
            }
        });
    }

    @Override // p422y9.InterfaceC11935n
    public void setAreaMoveListener(InterfaceC10216d interfaceC10216d) {
        m14390M().m23782v(interfaceC10216d);
    }

    @Override // p422y9.InterfaceC11935n
    public void stopRecord() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (mo14463i()) {
            mo14476r();
        }
        m14400W().m18860c().m14610e0(InterfaceC9618b.a.m18857a(m14402Y(), System.currentTimeMillis(), false, 2, null));
        m14402Y().m18874k(System.currentTimeMillis());
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: t */
    public boolean mo14478t() {
        return m14390M().m23780t().m23813d().m13744R() && m14400W().m18859b();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: u */
    public boolean mo14479u() {
        return m14402Y().m18869e();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: v */
    public void mo14480v(InterfaceC5181c interfaceC5181c) {
        List listMo2717f;
        InterfaceC5181c interfaceC5181cMo25454n = m14393P().mo25454n();
        if (interfaceC5181cMo25454n == null || (listMo2717f = interfaceC5181cMo25454n.mo2717f()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo2717f) {
            if (!AbstractC9979u.m20289b((InterfaceC5181c) obj, interfaceC5181c)) {
                arrayList.add(obj);
            }
        }
        m14390M().mo23775o(arrayList, System.currentTimeMillis());
        C10346i c10346i = C10346i.f24652a;
        c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        m14393P().mo25456p(AbstractC9962d0.m20252c(arrayList));
        m14407d0();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: x */
    public void mo14481x(InterfaceC10223k listener) {
        AbstractC9979u.m20294g(listener, "listener");
        m14394Q().m26480a(listener);
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: y */
    public int mo14482y() {
        return m14393P().m25430P();
    }

    @Override // p422y9.InterfaceC11935n
    /* renamed from: z */
    public boolean mo14483z() {
        C10346i c10346i = C10346i.f24652a;
        c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        C11933l c11933lM26482c = m14394Q().m26482c();
        if (c11933lM26482c == null) {
            return false;
        }
        m14400W().m18860c().m14606Y(c11933lM26482c.m26487c(), c11933lM26482c.m26485a(), System.currentTimeMillis());
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControl(BoardControl boardControl, C11719h renderLayer, PageEntity pageEntity) {
        super(boardControl, renderLayer, pageEntity);
        AbstractC9979u.m20294g(boardControl, "boardControl");
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
    }
}
