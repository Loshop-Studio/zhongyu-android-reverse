package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.media.MediaPlayer;
import androidx.core.view.PointerIconCompat;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.edit.BasePageControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyRectF;
import ga.C9283c;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10214b;
import na.AbstractC10344g;
import na.AbstractC10351n;
import na.AbstractC10353p;
import na.C10341d;
import na.C10349l;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p194ia.C9619c;
import p194ia.C9621e;
import p210jc.C9710a;
import p307q9.C10762b;
import p309qc.C10786q;
import p322r9.C10917a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p362u9.C11373a;
import p377v9.C11551b;
import p390w9.C11719h;
import p422y9.AbstractC11936o;
import p422y9.C11922a;
import p422y9.C11932k;
import p422y9.InterfaceC11934m;
import p437z9.AbstractC12027a;
import p437z9.C12028b;

/* loaded from: classes5.dex */
public abstract class BasePageControl implements InterfaceC11934m {

    /* renamed from: m */
    public static final C8435a f18512m = new C8435a(null);

    /* renamed from: a */
    public final BoardControl f18513a;

    /* renamed from: b */
    public PageEntity f18514b;

    /* renamed from: c */
    public final C9621e f18515c;

    /* renamed from: d */
    public final C9619c f18516d;

    /* renamed from: e */
    public final C9283c f18517e;

    /* renamed from: f */
    public final C11373a f18518f;

    /* renamed from: g */
    public final C11551b f18519g;

    /* renamed from: h */
    public final C11932k f18520h;

    /* renamed from: i */
    public final C11922a f18521i;

    /* renamed from: j */
    public C10917a f18522j;

    /* renamed from: k */
    public final ArrayList f18523k;

    /* renamed from: l */
    public final ArrayList f18524l;

    /* renamed from: com.zykj.blackboard.core.edit.BasePageControl$a */
    public static final class C8435a {
        public /* synthetic */ C8435a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8435a() {
        }
    }

    /* renamed from: com.zykj.blackboard.core.edit.BasePageControl$b */
    public static final class C8436b implements InterfaceC10214b {

        /* renamed from: a */
        public final /* synthetic */ PageEntity f18525a;

        public C8436b(PageEntity pageEntity) {
            this.f18525a = pageEntity;
        }

        @Override // ma.InterfaceC10214b
        /* renamed from: a */
        public void mo14413a(CommandInfoEntity entity) {
            AbstractC9979u.m20294g(entity, "entity");
            if (this.f18525a.m14243h()) {
                return;
            }
            this.f18525a.m14246k(((CommandRecordEntity) entity.m14056f().m19036d()).m14066b());
            this.f18525a.m14245j(true);
            this.f18525a.m14247l(((CommandRecordEntity) entity.m14056f().m19036d()).m14065a().m19024m(entity.m14055e()));
            this.f18525a.m14244i();
        }
    }

    public BasePageControl(BoardControl boardControl, C11719h renderLayer, PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9979u.m20294g(boardControl, "boardControl");
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        this.f18513a = boardControl;
        C9621e c9621e = new C9621e();
        this.f18515c = c9621e;
        C9619c c9619c = new C9619c(c9621e);
        this.f18516d = c9619c;
        C9283c c9283c = new C9283c();
        this.f18517e = c9283c;
        C11373a c11373a = new C11373a();
        this.f18518f = c11373a;
        C11551b c11551b = new C11551b(c11373a, renderLayer, boardControl.getConfig());
        c11551b.m25437W(new InterfaceC9540l() { // from class: com.zykj.blackboard.core.edit.BasePageControl$graphControl$1$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m14414a(InterfaceC5181c deleteGraph) {
                AbstractC9979u.m20294g(deleteGraph, "deleteGraph");
                if (!(deleteGraph instanceof ImageGraph) || this.f18526c.mo14479u()) {
                    return;
                }
                ImageGraph imageGraph = (ImageGraph) deleteGraph;
                if (imageGraph.m2863E() == null) {
                    imageGraph.m2865G();
                }
                String strM2863E = imageGraph.m2863E();
                if (strM2863E != null) {
                    this.f18526c.m14396S().remove(strM2863E);
                }
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14414a((InterfaceC5181c) obj);
                return C10786q.f26013a;
            }
        });
        this.f18519g = c11551b;
        C11932k c11932k = new C11932k(c11551b);
        this.f18520h = c11932k;
        this.f18521i = new C11922a();
        this.f18522j = new C10917a(c11551b, boardControl.getConfig(), c11373a, c9283c, c9619c, c11932k);
        this.f18523k = new ArrayList();
        this.f18524l = new ArrayList();
        if (pageEntity == null) {
            m14403Z(m14406b0());
            m14386I();
        } else {
            m14409f0(pageEntity);
            m14403Z(pageEntity);
        }
    }

    /* renamed from: c0 */
    public static final void m14384c0(BasePageControl this$0) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        if (this$0.mo14479u()) {
            this$0.stopRecord();
        }
        HeaderEntity headerEntity = (HeaderEntity) this$0.m14397T().m14240e().m19036d();
        if (headerEntity == null) {
            return;
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m14154k().m19036d();
        if (moveConfigEntity != null) {
            moveConfigEntity.m14231j(this$0.f18513a.getConfig().m22919z());
            moveConfigEntity.m14230i();
        } else {
            MoveConfigEntity moveConfigEntityM21636e = AbstractC10344g.m21636e(this$0.f18513a.getConfig().m22919z());
            moveConfigEntityM21636e.m14230i();
            headerEntity.m14154k().m19043o(moveConfigEntityM21636e);
            headerEntity.m14160q();
        }
    }

    /* renamed from: g0 */
    public static final void m14385g0(BasePageControl this$0, InterfaceC9529a callback) throws IOException {
        boolean z10;
        boolean z11;
        List listMo2717f;
        List listMo2717f2;
        List listMo2717f3;
        EzyMatrix.Matrix matrixM15588f;
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM15590m;
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(callback, "$callback");
        LogUtils.m3886d("页面BasePageControl=>show():开始加载画板----[" + this$0.getFileName() + "]:show -> start}");
        this$0.f18517e.m18304h(true);
        this$0.f18519g.mo25452l(false);
        C10349l c10349l = C10349l.f24656a;
        String absolutePath = new File(new File(this$0.f18513a.m14436n(), this$0.getFileName()), "snapshot.bin").getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "File(\n                  …           ).absolutePath");
        EzyPageSnapshot.PageSnapshot pageSnapshotM21652e = c10349l.m21652e(absolutePath);
        int childGraphCount = (pageSnapshotM21652e == null || (graphSnapshotM15590m = pageSnapshotM21652e.m15590m()) == null) ? 0 : graphSnapshotM15590m.getChildGraphCount();
        if (pageSnapshotM21652e != null) {
            z10 = pageSnapshotM21652e.m15590m().getChildGraphCount() <= 0;
            z11 = !z10;
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = (pageSnapshotM21652e == null || (matrixM15588f = pageSnapshotM21652e.m15588f()) == null || !AbstractC10351n.m21662d(matrixM15588f)) ? false : true;
        boolean z13 = (pageSnapshotM21652e == null || !z11 || z12) ? false : true;
        boolean z14 = pageSnapshotM21652e != null && z11 && z12;
        if (z14) {
            LogUtils.m3888i("页面BasePageControl.kt -> MatrixAutoRepair，矩阵正常，未触发自动修复，pageDir=" + this$0.m14398U() + "，page=" + this$0.getFileName() + "，snapshotGraphCount=" + childGraphCount);
        } else if (z13) {
            LogUtils.m3888i("页面BasePageControl.kt -> MatrixAutoRepair，检测到相机矩阵异常，触发自动修复，pageDir=" + this$0.m14398U() + "，page=" + this$0.getFileName() + "，snapshotGraphCount=" + childGraphCount);
            this$0.f18513a.m14437o();
        }
        LogUtils.m3886d(" 页面BasePageControl=>show():当时是否存在快照" + z14);
        if (z14) {
            LogUtils.m3886d("页面BasePageControl[" + this$0.getFileName() + "]:show -> 从快照进行加载}");
            C11373a c11373a = this$0.f18518f;
            AbstractC9979u.m20291d(pageSnapshotM21652e);
            EzyMatrix.Matrix matrixM15588f2 = pageSnapshotM21652e.m15588f();
            AbstractC9979u.m20293f(matrixM15588f2, "localGraphSnapshot!!.cameraMatrix");
            c11373a.m25319j(AbstractC10351n.m21665g(matrixM15588f2));
            C9283c c9283c = this$0.f18517e;
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM15590m2 = pageSnapshotM21652e.m15590m();
            AbstractC9979u.m20293f(graphSnapshotM15590m2, "localGraphSnapshot.graphSnapshot");
            AbstractC5179a abstractC5179aM21648a = c10349l.m21648a(c9283c, graphSnapshotM15590m2);
            if (abstractC5179aM21648a != null) {
                this$0.f18519g.mo25419E(abstractC5179aM21648a);
            }
            if (this$0.m14397T().m14243h()) {
                LogUtils.m3888i("页面BasePageControl [" + this$0.getFileName() + "]:show -> 存在未保存数据库数据，继续从数据库加载}");
                AbstractC12027a abstractC12027aM26637a = C12028b.f28398a.m26637a(6, this$0.f18517e, this$0.f18518f, this$0.f18519g);
                boolean z15 = false;
                for (CommandRecordEntity commandRecordEntity : ((RecordEntity) this$0.m14397T().m14242g().m19036d()).m14258b()) {
                    if (z15) {
                        for (CommandInfoEntity info : commandRecordEntity.m14065a()) {
                            AbstractC9979u.m20293f(info, "info");
                            abstractC12027aM26637a.mo256d(info);
                        }
                    } else if (AbstractC9979u.m20289b(commandRecordEntity.m14066b(), this$0.m14397T().m14237b())) {
                        int iM14238c = this$0.m14397T().m14238c();
                        int iM24138p = AbstractC10978w.m24138p(commandRecordEntity.m14065a());
                        if (iM14238c <= iM24138p) {
                            while (true) {
                                Object obj = commandRecordEntity.m14065a().get(iM14238c);
                                AbstractC9979u.m20293f(obj, "it.commandInfoEntity[i]");
                                abstractC12027aM26637a.mo256d((CommandInfoEntity) obj);
                                if (iM14238c == iM24138p) {
                                    break;
                                } else {
                                    iM14238c++;
                                }
                            }
                        }
                        z15 = true;
                    }
                }
            }
        } else {
            LogUtils.m3886d("页面BasePageControl[" + this$0.getFileName() + "]:show -> 从命令行加载}");
            AbstractC12027a abstractC12027aM26637a2 = C12028b.f28398a.m26637a(6, this$0.f18517e, this$0.f18518f, this$0.f18519g);
            Iterator<TARGET> it = ((RecordEntity) this$0.m14397T().m14242g().m19036d()).m14258b().iterator();
            while (it.hasNext()) {
                for (CommandInfoEntity info2 : ((CommandRecordEntity) it.next()).m14065a()) {
                    AbstractC9979u.m20293f(info2, "info");
                    abstractC12027aM26637a2.mo256d(info2);
                }
            }
            if (z10) {
                InterfaceC5181c interfaceC5181cMo25454n = this$0.f18519g.mo25454n();
                if (((interfaceC5181cMo25454n == null || (listMo2717f2 = interfaceC5181cMo25454n.mo2717f()) == null) ? 0 : listMo2717f2.size()) > 0) {
                    this$0.f18513a.m14437o();
                }
            }
            if (z13) {
                InterfaceC5181c interfaceC5181cMo25454n2 = this$0.f18519g.mo25454n();
                int size = (interfaceC5181cMo25454n2 == null || (listMo2717f = interfaceC5181cMo25454n2.mo2717f()) == null) ? 0 : listMo2717f.size();
                if (size > 0) {
                    LogUtils.m3888i("页面BasePageControl.kt -> MatrixAutoRepair，自动修复完成，已从命令重建并将保存新快照，pageDir=" + this$0.m14398U() + "，page=" + this$0.getFileName() + "，repairedGraphCount=" + size);
                } else {
                    LogUtils.m3887e("页面BasePageControl.kt -> MatrixAutoRepair，自动修复失败，从命令重建后仍无图元，pageDir=" + this$0.m14398U() + "，page=" + this$0.getFileName() + "，repairedGraphCount=" + size);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("页面BasePageControl[");
        sb2.append(this$0.getFileName());
        sb2.append("]:show -> 初始化完毕, g:");
        InterfaceC5181c interfaceC5181cMo25454n3 = this$0.f18519g.mo25454n();
        sb2.append((interfaceC5181cMo25454n3 == null || (listMo2717f3 = interfaceC5181cMo25454n3.mo2717f()) == null) ? null : Integer.valueOf(listMo2717f3.size()));
        LogUtils.m3886d(sb2.toString());
        this$0.f18519g.mo25452l(true);
        this$0.f18519g.mo25447g();
        this$0.f18519g.m25440Z();
        this$0.m14407d0();
        this$0.f18517e.m18304h(false);
        this$0.f18517e.m18302f();
        callback.invoke();
        LogUtils.m3888i("页面BasePageControl[" + this$0.getFileName() + "]:show -> end}");
    }

    /* renamed from: I */
    public final void m14386I() {
        CommandRecord commandRecordM18860c = this.f18516d.m18860c();
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m15793k().m15814r(-3.4028235E38f).m15817u(-3.4028235E38f).m15816t(Float.MAX_VALUE).m15812p(Float.MAX_VALUE).build();
        AbstractC9979u.m20293f(rectFBuild, "newBuilder().setLeft(-Fl…(Float.MAX_VALUE).build()");
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(commandRecordM18860c.m14593B("", graphEnum, rectFBuild, System.currentTimeMillis()).m14052b());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9979u.m20293f(graphData, "graphData");
        AbstractC5179a abstractC5179aMo14497c = graphBuildFactory.mo14497c(graphData, this.f18517e);
        if (abstractC5179aMo14497c != null) {
            this.f18519g.mo25446f(graphData.m15000F(), abstractC5179aMo14497c);
        }
    }

    /* renamed from: J */
    public final long m14387J(PageEntity pageEntity) {
        Iterator<TARGET> it = ((RecordEntity) pageEntity.m14242g().m19036d()).m14257a().iterator();
        long jM13977c = 0;
        while (it.hasNext()) {
            for (AudioInfoEntity audioInfoEntity : ((AudioRecordEntity) it.next()).m14003a()) {
                if (audioInfoEntity.m13981g()) {
                    jM13977c += audioInfoEntity.m13977c() + audioInfoEntity.m13978d();
                }
            }
        }
        return jM13977c;
    }

    /* renamed from: K */
    public final long m14388K(PageEntity pageEntity) {
        Iterator<TARGET> it = ((RecordEntity) pageEntity.m14242g().m19036d()).m14258b().iterator();
        long jM14053c = 0;
        while (it.hasNext()) {
            for (CommandInfoEntity commandInfoEntity : ((CommandRecordEntity) it.next()).m14065a()) {
                if (commandInfoEntity.m14057g()) {
                    jM14053c += commandInfoEntity.m14053c() + commandInfoEntity.m14054d();
                }
            }
        }
        return jM14053c;
    }

    /* renamed from: L */
    public final PageEntity m14389L(BlackBoardEntity blackBoardEntity) throws IllegalAccessException, IllegalArgumentException {
        String string = UUID.randomUUID().toString();
        AbstractC9979u.m20293f(string, "randomUUID().toString()");
        LogUtils.m3888i("BasePageControl:createPageEntity [" + string + "]:创建新Entity");
        m14409f0(new PageEntity(0L, string, false, null, 0, 28, null));
        ToOne toOneM14240e = m14397T().m14240e();
        HeaderEntity headerEntity = new HeaderEntity(0L, 6, 0, 0, 0L, 0L, 0L, null, 0, 0, PointerIconCompat.TYPE_GRAB, null);
        headerEntity.m14161r(System.currentTimeMillis());
        headerEntity.m14163t(0L);
        C10762b config = this.f18513a.getConfig();
        headerEntity.m14168y(config.m22869M());
        headerEntity.m14164u(config.m22914u());
        headerEntity.m14162s(config.m22896h());
        headerEntity.m14166w(config.m22896h());
        ToOne toOneM14154k = headerEntity.m14154k();
        MoveConfigEntity moveConfigEntityM21636e = AbstractC10344g.m21636e(config.m22919z());
        moveConfigEntityM21636e.m14230i();
        toOneM14154k.m19043o(moveConfigEntityM21636e);
        ToOne toOneM14148e = headerEntity.m14148e();
        BackgroundLineConfigEntity backgroundLineConfigEntityM21635d = AbstractC10344g.m21635d(config.m22900j());
        backgroundLineConfigEntityM21635d.m14034f();
        toOneM14148e.m19043o(backgroundLineConfigEntityM21635d);
        ToOne toOneM14153j = headerEntity.m14153j();
        BackgroundLineConfigEntity backgroundLineConfigEntityM21635d2 = AbstractC10344g.m21635d(config.m22900j());
        backgroundLineConfigEntityM21635d2.m14034f();
        toOneM14153j.m19043o(backgroundLineConfigEntityM21635d2);
        ToOne toOneM14144a = headerEntity.m14144a();
        config.m22894g();
        toOneM14144a.m19043o(null);
        headerEntity.m14155l().m19043o(m14397T());
        headerEntity.m14160q();
        toOneM14240e.m19043o(headerEntity);
        ToOne toOneM14242g = m14397T().m14242g();
        RecordEntity recordEntity = new RecordEntity(0L, 1, null);
        recordEntity.m14263g().m19043o(m14397T());
        recordEntity.m14266j();
        toOneM14242g.m19043o(recordEntity);
        m14397T().m14236a().m19043o(blackBoardEntity);
        m14397T().m14244i();
        LogUtils.m3888i("BasePageControl:createPageEntity [" + string + "]:创建完成,id:" + m14397T().m14241f());
        return m14397T();
    }

    /* renamed from: M */
    public final C10917a m14390M() {
        return this.f18522j;
    }

    /* renamed from: N */
    public final C11922a m14391N() {
        return this.f18521i;
    }

    /* renamed from: O */
    public final BoardControl m14392O() {
        return this.f18513a;
    }

    /* renamed from: P */
    public final C11551b m14393P() {
        return this.f18519g;
    }

    /* renamed from: Q */
    public final C11932k m14394Q() {
        return this.f18520h;
    }

    /* renamed from: R */
    public final C11373a m14395R() {
        return this.f18518f;
    }

    /* renamed from: S */
    public final ArrayList m14396S() {
        return this.f18524l;
    }

    /* renamed from: T */
    public final PageEntity m14397T() {
        PageEntity pageEntity = this.f18514b;
        if (pageEntity != null) {
            return pageEntity;
        }
        AbstractC9979u.m20312y("pageEntity");
        return null;
    }

    /* renamed from: U */
    public final String m14398U() {
        String absolutePath = new File(this.f18513a.m14436n(), m14397T().m14239d()).getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "File(boardControl.getBoa…ity.dirName).absolutePath");
        return absolutePath;
    }

    /* renamed from: V */
    public final ArrayList m14399V() {
        return this.f18523k;
    }

    /* renamed from: W */
    public final C9619c m14400W() {
        return this.f18516d;
    }

    /* renamed from: X */
    public final C9283c m14401X() {
        return this.f18517e;
    }

    /* renamed from: Y */
    public final C9621e m14402Y() {
        return this.f18515c;
    }

    /* renamed from: Z */
    public final void m14403Z(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9979u.m20294g(pageEntity, "pageEntity");
        m14404a0(pageEntity);
        mo14453D(this.f18522j.m23780t());
        mo14453D(new C8436b(pageEntity));
        C9619c c9619c = this.f18516d;
        Object objM19036d = pageEntity.m14242g().m19036d();
        AbstractC9979u.m20293f(objM19036d, "pageEntity.recordEntity.target");
        c9619c.m18861d((RecordEntity) objM19036d);
        this.f18517e.m18303g(m14398U());
        this.f18521i.m26475a(C9619c.f22151d.m18862a(m14398U(), DocumentType.AUDIO));
        m14410h0(pageEntity);
        m14411i0(pageEntity);
    }

    /* renamed from: a0 */
    public final void m14404a0(PageEntity pageEntity) {
        BackgroundLineConfig backgroundLineConfigM21633b;
        BackgroundLineConfig backgroundLineConfigM21633b2;
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.m14240e().m19036d();
        if (headerEntity == null) {
            return;
        }
        this.f18519g.m25435U(headerEntity.m14147d());
        this.f18519g.mo25444d(headerEntity.m14152i());
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.m14148e().m19036d();
        if (backgroundLineConfigEntity != null && (backgroundLineConfigM21633b2 = AbstractC10344g.m21633b(backgroundLineConfigEntity)) != null) {
            this.f18519g.m25436V(backgroundLineConfigM21633b2);
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.m14153j().m19036d();
        if (backgroundLineConfigEntity2 != null && (backgroundLineConfigM21633b = AbstractC10344g.m21633b(backgroundLineConfigEntity2)) != null) {
            this.f18519g.mo25459s(backgroundLineConfigM21633b);
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m14154k().m19036d();
        if (moveConfigEntity != null) {
            this.f18513a.getConfig().m22919z().m22929h(moveConfigEntity);
        }
        this.f18518f.m25320k(AbstractC11936o.m26495c(headerEntity.m14159p(), headerEntity.m14150g(), this.f18513a.getConfig().m22869M(), this.f18513a.getConfig().m22914u(), false, 0, 0, 112, null));
    }

    @Override // p422y9.InterfaceC11934m
    /* renamed from: b */
    public void mo14405b(final InterfaceC9529a callback) {
        AbstractC9979u.m20294g(callback, "callback");
        new Thread(new Runnable() { // from class: y9.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                BasePageControl.m14385g0(this.f28262c, callback);
            }
        }).start();
    }

    /* renamed from: b0 */
    public final PageEntity m14406b0() {
        C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(BlackBoardEntity.class);
        AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c9710aM18954g.m19229o();
        AbstractC9979u.m20293f(builder, "builder");
        builder.m19013g(BlackBoardEntity_.f18099h, this.f18513a.m14436n());
        Query queryM19011e = builder.m19011e();
        AbstractC9979u.m20293f(queryM19011e, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM19011e.m19005n();
        if (blackBoardEntity != null) {
            return m14389L(blackBoardEntity);
        }
        LogUtils.m3888i("BasePageControl:initPageEntity [" + getFileName() + "] 没找到boardEntity:" + this.f18513a.m14436n());
        throw new NullPointerException("empty boardEntity: " + this.f18513a.m14436n());
    }

    /* renamed from: d0 */
    public final void m14407d0() {
        InterfaceC5181c interfaceC5181cMo25454n = this.f18519g.mo25454n();
        if (interfaceC5181cMo25454n != null) {
            this.f18520h.m26483d((AbstractC5179a) interfaceC5181cMo25454n, this.f18519g.m25426L(), this.f18519g.m25427M());
        }
    }

    /* renamed from: e0 */
    public final void m14408e0(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix) {
        AbstractC9979u.m20294g(originMatrix, "originMatrix");
        AbstractC9979u.m20294g(lastMatrix, "lastMatrix");
        this.f18516d.m18860c().m14613x(originMatrix, lastMatrix, System.currentTimeMillis());
    }

    /* renamed from: f0 */
    public final void m14409f0(PageEntity pageEntity) {
        AbstractC9979u.m20294g(pageEntity, "<set-?>");
        this.f18514b = pageEntity;
    }

    @Override // p422y9.InterfaceC11934m
    public String getFileName() {
        return m14397T().m14239d();
    }

    /* renamed from: h0 */
    public final void m14410h0(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        ToMany toManyM14003a;
        AudioInfoEntity audioInfoEntity;
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) AbstractC10947g0.m23957z0(((RecordEntity) pageEntity.m14242g().m19036d()).m14257a());
        if (audioRecordEntity == null || (toManyM14003a = audioRecordEntity.m14003a()) == null || (audioInfoEntity = (AudioInfoEntity) AbstractC10947g0.m23957z0(toManyM14003a)) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM14710u = EzyCommand.CommandSource.CommandInfo.AudioStart.m14710u(audioInfoEntity.m13976b());
        File file = new File(C9619c.f22151d.m18862a(m14398U(), DocumentType.AUDIO), audioStartM14710u.getFileName());
        if (file.exists()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            long duration = mediaPlayer.getDuration();
            if (audioStartM14710u.m14712m() != duration) {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C8450b c8450bM14708o = EzyCommand.CommandSource.CommandInfo.AudioStart.m14708o();
                c8450bM14708o.m14733r(audioStartM14710u.getFileName());
                c8450bM14708o.m14731p(duration);
                byte[] byteArray = c8450bM14708o.build().toByteArray();
                AbstractC9979u.m20293f(byteArray, "builder.build().toByteArray()");
                audioInfoEntity.m13983i(byteArray);
                audioInfoEntity.m13984j(duration);
                audioInfoEntity.m13982h();
            }
        }
    }

    @Override // p422y9.InterfaceC11934m
    public void hide() throws Throwable {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM25439Y = this.f18519g.m25439Y();
        if (graphSnapshotM25439Y != null) {
            EzyPageSnapshot.PageSnapshot.C8498b c8498bM15586o = EzyPageSnapshot.PageSnapshot.m15586o();
            c8498bM15586o.m15707y(graphSnapshotM25439Y);
            c8498bM15586o.m15705w(AbstractC10351n.m21664f(this.f18518f.m25313d(), 0L));
            AbstractC10353p.a aVar = AbstractC10353p.f24663a;
            String strM14398U = m14398U();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c8498bM15586o.build();
            AbstractC9979u.m20293f(pageSnapshotBuild, "builder.build()");
            aVar.m21674b(strM14398U, "snapshot.bin", pageSnapshotBuild);
            if (m14397T().m14243h()) {
                m14397T().m14245j(false);
                m14397T().m14246k("");
                m14397T().m14247l(-1);
                m14397T().m14244i();
            }
        }
        this.f18519g.m25431Q();
    }

    /* renamed from: i0 */
    public final void m14411i0(PageEntity pageEntity) {
        long jM14149f = ((HeaderEntity) pageEntity.m14240e().m19036d()).m14149f();
        long jM14388K = m14388K(pageEntity);
        long jM14387J = m14387J(pageEntity);
        if (jM14149f >= jM14388K && jM14149f >= jM14387J) {
            this.f18515c.m18868d(jM14149f);
            this.f18515c.m18871g(jM14149f - jM14387J);
            this.f18515c.m18872h(jM14149f - jM14388K);
        } else if (jM14388K > jM14387J) {
            this.f18515c.m18868d(jM14388K);
            this.f18515c.m18871g(jM14388K - jM14387J);
        } else if (jM14387J > jM14388K) {
            this.f18515c.m18868d(jM14387J);
            this.f18516d.m18860c().m14610e0(jM14387J - jM14388K);
        }
    }

    @Override // p422y9.InterfaceC11934m
    public void onDelete() {
        C10341d.f24644a.m21625e(m14397T());
    }

    @Override // p422y9.InterfaceC11934m
    public void release() {
        new Thread(new Runnable() { // from class: y9.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException {
                BasePageControl.m14384c0(this.f28264c);
            }
        }).start();
        mo14451B(this.f18522j.m23780t());
        this.f18519g.m25431Q();
    }

    @Override // p422y9.InterfaceC11934m
    /* renamed from: w */
    public long mo14412w() {
        return this.f18515c.m18867c(System.currentTimeMillis());
    }
}
