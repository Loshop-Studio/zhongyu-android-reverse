package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.media.MediaPlayer;
import androidx.core.view.PointerIconCompat;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a5.C0038b;
import p023b5.C5120j;
import p026b8.C5206a;
import p084d5.AbstractC7752l;
import p084d5.C7741a;
import p084d5.C7748h;
import p084d5.InterfaceC7750j;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.C8889c;
import p189n5.C9097c;
import p189n5.C9099e;
import p243s5.InterfaceC9474b;
import p263u5.AbstractC9688g;
import p263u5.AbstractC9695n;
import p263u5.AbstractC9697p;
import p263u5.C9685d;
import p272v4.C9763b;
import p282w4.C9821a;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public abstract class BasePageControl implements InterfaceC7750j {

    /* renamed from: m */
    public static final C7055a f8951m = new C7055a(null);

    /* renamed from: a */
    public final BoardControl f8952a;

    /* renamed from: b */
    public PageEntity f8953b;

    /* renamed from: c */
    public final C9099e f8954c;

    /* renamed from: d */
    public final C9097c f8955d;

    /* renamed from: e */
    public final C8889c f8956e;

    /* renamed from: f */
    public final C9998a f8957f;

    /* renamed from: g */
    public final C0038b f8958g;

    /* renamed from: h */
    public final C7748h f8959h;

    /* renamed from: i */
    public final C7741a f8960i;

    /* renamed from: j */
    public C9821a f8961j;

    /* renamed from: k */
    public final ArrayList f8962k;

    /* renamed from: l */
    public final ArrayList f8963l;

    /* renamed from: com.zykj.blackboard.core.edit.BasePageControl$a */
    public static final class C7055a {
        public /* synthetic */ C7055a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C7055a() {
        }
    }

    /* renamed from: com.zykj.blackboard.core.edit.BasePageControl$b */
    public static final class C7056b implements InterfaceC9474b {

        /* renamed from: a */
        public final /* synthetic */ PageEntity f8964a;

        public C7056b(PageEntity pageEntity) {
            this.f8964a = pageEntity;
        }

        @Override // p243s5.InterfaceC9474b
        /* renamed from: a */
        public void mo2219a(CommandInfoEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            if (this.f8964a.getIsChange()) {
                return;
            }
            this.f8964a.m7619k(((CommandRecordEntity) entity.m7429f().m13183g()).getFileName());
            this.f8964a.m7618j(true);
            this.f8964a.m7620l(((CommandRecordEntity) entity.m7429f().m13183g()).m7438a().m13175u(entity.getId()));
            this.f8964a.m7617i();
        }
    }

    public BasePageControl(BoardControl boardControl, C5120j renderLayer, PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f8952a = boardControl;
        C9099e c9099e = new C9099e();
        this.f8954c = c9099e;
        C9097c c9097c = new C9097c(c9099e);
        this.f8955d = c9097c;
        C8889c c8889c = new C8889c();
        this.f8956e = c8889c;
        C9998a c9998a = new C9998a();
        this.f8957f = c9998a;
        C0038b c0038b = new C0038b(c9998a, renderLayer, boardControl.getConfig());
        c0038b.m194U(new Function1<InterfaceC8055c, Unit>() { // from class: com.zykj.blackboard.core.edit.BasePageControl$graphControl$1$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m7785a(InterfaceC8055c deleteGraph) {
                Intrinsics.checkNotNullParameter(deleteGraph, "deleteGraph");
                if (!(deleteGraph instanceof ImageGraph) || this.f8965a.mo7844w()) {
                    return;
                }
                ImageGraph imageGraph = (ImageGraph) deleteGraph;
                if (imageGraph.m12932H() == null) {
                    imageGraph.m12934J();
                }
                String strM12932H = imageGraph.m12932H();
                if (strM12932H != null) {
                    this.f8965a.m7768S().remove(strM12932H);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8055c interfaceC8055c) {
                m7785a(interfaceC8055c);
                return Unit.INSTANCE;
            }
        });
        this.f8958g = c0038b;
        C7748h c7748h = new C7748h(c0038b);
        this.f8959h = c7748h;
        this.f8960i = new C7741a();
        this.f8961j = new C9821a(c0038b, boardControl.getConfig(), c9998a, c8889c, c9097c, c7748h);
        this.f8962k = new ArrayList();
        this.f8963l = new ArrayList();
        if (pageEntity == null) {
            m7775Z(m7778b0());
            m7758I();
        } else {
            m7781f0(pageEntity);
            m7775Z(pageEntity);
        }
    }

    /* renamed from: c0 */
    public static final void m7756c0(BasePageControl this$0) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mo7844w()) {
            this$0.stopRecord();
        }
        HeaderEntity headerEntity = (HeaderEntity) this$0.m7769T().m7613e().m13183g();
        if (headerEntity == null) {
            return;
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m7527k().m13183g();
        if (moveConfigEntity != null) {
            moveConfigEntity.m7604j(this$0.f8952a.getConfig().m16519z());
            moveConfigEntity.m7603i();
        } else {
            MoveConfigEntity moveConfigEntityM16175e = AbstractC9688g.m16175e(this$0.f8952a.getConfig().m16519z());
            moveConfigEntityM16175e.m7603i();
            headerEntity.m7527k().m13190w(moveConfigEntityM16175e);
            headerEntity.m7533q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7757g0(com.zykj.blackboard.core.edit.BasePageControl r10, kotlin.jvm.functions.Function0 r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BasePageControl.m7757g0(com.zykj.blackboard.core.edit.BasePageControl, kotlin.jvm.functions.Function0):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/edit/BasePageControl.smali:490
    }

    /* renamed from: I */
    public final void m7758I() {
        CommandRecord commandRecordM14635c = this.f8955d.m14635c();
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m9175t().m9196s(-3.4028235E38f).m9199v(-3.4028235E38f).m9198u(Float.MAX_VALUE).m9194q(Float.MAX_VALUE).build();
        Intrinsics.checkNotNullExpressionValue(rectFBuild, "newBuilder().setLeft(-Fl…(Float.MAX_VALUE).build()");
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandRecordM14635c.m7969B("", graphEnum, rectFBuild, System.currentTimeMillis()).getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8053a abstractC8053aMo7873c = graphBuildFactory.mo7873c(graphData, this.f8956e);
        if (abstractC8053aMo7873c != null) {
            this.f8958g.mo222y(graphData.m8383I(), abstractC8053aMo7873c);
        }
    }

    /* renamed from: J */
    public final long m7759J(PageEntity pageEntity) {
        Iterator<TARGET> it = ((RecordEntity) pageEntity.m7615g().m13183g()).m7629a().iterator();
        long delayTime = 0;
        while (it.hasNext()) {
            for (AudioInfoEntity audioInfoEntity : ((AudioRecordEntity) it.next()).m7373a()) {
                if (audioInfoEntity.getIsPlay()) {
                    delayTime += audioInfoEntity.getDelayTime() + audioInfoEntity.getDuration();
                }
            }
        }
        return delayTime;
    }

    /* renamed from: K */
    public final long m7760K(PageEntity pageEntity) {
        Iterator<TARGET> it = ((RecordEntity) pageEntity.m7615g().m13183g()).m7630b().iterator();
        long delayTime = 0;
        while (it.hasNext()) {
            for (CommandInfoEntity commandInfoEntity : ((CommandRecordEntity) it.next()).m7438a()) {
                if (commandInfoEntity.getIsPlay()) {
                    delayTime += commandInfoEntity.getDelayTime() + commandInfoEntity.getDuration();
                }
            }
        }
        return delayTime;
    }

    /* renamed from: L */
    public final PageEntity m7761L(BlackBoardEntity blackBoardEntity) throws IllegalAccessException, IllegalArgumentException {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LogUtils.m2956i("BasePageControl:createPageEntity [" + string + "]:创建新Entity");
        m7781f0(new PageEntity(0L, string, false, null, 0, 28, null));
        ToOne toOneM7613e = m7769T().m7613e();
        HeaderEntity headerEntity = new HeaderEntity(0L, 6, 0, 0, 0L, 0L, 0L, null, 0, 0, PointerIconCompat.TYPE_GRAB, null);
        headerEntity.m7534r(System.currentTimeMillis());
        headerEntity.m7536t(0L);
        C9763b config = this.f8952a.getConfig();
        headerEntity.m7541y(config.m16465P());
        headerEntity.m7537u(config.m16514u());
        headerEntity.m7535s(config.m16489h());
        headerEntity.m7539w(config.m16489h());
        ToOne toOneM7527k = headerEntity.m7527k();
        MoveConfigEntity moveConfigEntityM16175e = AbstractC9688g.m16175e(config.m16519z());
        moveConfigEntityM16175e.m7603i();
        toOneM7527k.m13190w(moveConfigEntityM16175e);
        ToOne toOneM7521e = headerEntity.m7521e();
        BackgroundLineConfigEntity backgroundLineConfigEntityM16174d = AbstractC9688g.m16174d(config.m16493j());
        backgroundLineConfigEntityM16174d.m7404f();
        toOneM7521e.m13190w(backgroundLineConfigEntityM16174d);
        ToOne toOneM7526j = headerEntity.m7526j();
        BackgroundLineConfigEntity backgroundLineConfigEntityM16174d2 = AbstractC9688g.m16174d(config.m16493j());
        backgroundLineConfigEntityM16174d2.m7404f();
        toOneM7526j.m13190w(backgroundLineConfigEntityM16174d2);
        ToOne toOneM7517a = headerEntity.m7517a();
        config.m16487g();
        toOneM7517a.m13190w(null);
        headerEntity.m7528l().m13190w(m7769T());
        headerEntity.m7533q();
        toOneM7613e.m13190w(headerEntity);
        ToOne toOneM7615g = m7769T().m7615g();
        RecordEntity recordEntity = new RecordEntity(0L, 1, null);
        recordEntity.m7635g().m13190w(m7769T());
        recordEntity.m7638j();
        toOneM7615g.m13190w(recordEntity);
        m7769T().m7609a().m13190w(blackBoardEntity);
        m7769T().m7617i();
        LogUtils.m2956i("BasePageControl:createPageEntity [" + string + "]:创建完成,id:" + m7769T().getId());
        return m7769T();
    }

    /* renamed from: M */
    public final C9821a m7762M() {
        return this.f8961j;
    }

    /* renamed from: N */
    public final C7741a m7763N() {
        return this.f8960i;
    }

    /* renamed from: O */
    public final BoardControl m7764O() {
        return this.f8952a;
    }

    /* renamed from: P */
    public final C0038b m7765P() {
        return this.f8958g;
    }

    /* renamed from: Q */
    public final C7748h m7766Q() {
        return this.f8959h;
    }

    /* renamed from: R */
    public final C9998a m7767R() {
        return this.f8957f;
    }

    /* renamed from: S */
    public final ArrayList m7768S() {
        return this.f8963l;
    }

    /* renamed from: T */
    public final PageEntity m7769T() {
        PageEntity pageEntity = this.f8953b;
        if (pageEntity != null) {
            return pageEntity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageEntity");
        return null;
    }

    /* renamed from: U */
    public final String m7770U() {
        String absolutePath = new File(this.f8952a.m7800k(), m7769T().getDirName()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(boardControl.getBoa…ity.dirName).absolutePath");
        return absolutePath;
    }

    /* renamed from: V */
    public final ArrayList m7771V() {
        return this.f8962k;
    }

    /* renamed from: W */
    public final C9097c m7772W() {
        return this.f8955d;
    }

    /* renamed from: X */
    public final C8889c m7773X() {
        return this.f8956e;
    }

    /* renamed from: Y */
    public final C9099e m7774Y() {
        return this.f8954c;
    }

    /* renamed from: Z */
    public final void m7775Z(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        m7776a0(pageEntity);
        mo7826i(this.f8961j.m16702u());
        mo7826i(new C7056b(pageEntity));
        C9097c c9097c = this.f8955d;
        Object objM13183g = pageEntity.m7615g().m13183g();
        Intrinsics.checkNotNullExpressionValue(objM13183g, "pageEntity.recordEntity.target");
        c9097c.m14636d((RecordEntity) objM13183g);
        this.f8956e.m13826g(m7770U());
        this.f8960i.m12085a(C9097c.f15322d.m14637a(m7770U(), DocumentType.AUDIO));
        m7782h0(pageEntity);
        m7783i0(pageEntity);
    }

    /* renamed from: a0 */
    public final void m7776a0(PageEntity pageEntity) {
        BackgroundLineConfig backgroundLineConfigM16172b;
        BackgroundLineConfig backgroundLineConfigM16172b2;
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.m7613e().m13183g();
        if (headerEntity == null) {
            return;
        }
        this.f8958g.m192S(headerEntity.getDefaultBackgroundColor());
        this.f8958g.mo200c(headerEntity.getLastBackgroundColor());
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.m7521e().m13183g();
        if (backgroundLineConfigEntity != null && (backgroundLineConfigM16172b2 = AbstractC9688g.m16172b(backgroundLineConfigEntity)) != null) {
            this.f8958g.m193T(backgroundLineConfigM16172b2);
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.m7526j().m13183g();
        if (backgroundLineConfigEntity2 != null && (backgroundLineConfigM16172b = AbstractC9688g.m16172b(backgroundLineConfigEntity2)) != null) {
            this.f8958g.mo215r(backgroundLineConfigM16172b);
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m7527k().m13183g();
        if (moveConfigEntity != null) {
            this.f8952a.getConfig().m16519z().m16529h(moveConfigEntity);
        }
        this.f8957f.m17353k(AbstractC7752l.m12104c(headerEntity.getWidth(), headerEntity.getHeight(), this.f8952a.getConfig().m16465P(), this.f8952a.getConfig().m16514u(), false, 0, 0, 112, null));
    }

    @Override // p084d5.InterfaceC7750j
    /* renamed from: b */
    public void mo7777b(final Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        new Thread(new Runnable() { // from class: d5.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                BasePageControl.m7757g0(this.f13045a, callback);
            }
        }).start();
    }

    /* renamed from: b0 */
    public final PageEntity m7778b0() {
        C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(BlackBoardEntity.class);
        Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c5206aM13101h.m2257n();
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        builder.m13160g(BlackBoardEntity_.f8538f, this.f8952a.m7800k());
        Query queryM13158a = builder.m13158a();
        Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM13158a.m13152p();
        if (blackBoardEntity != null) {
            return m7761L(blackBoardEntity);
        }
        LogUtils.m2956i("BasePageControl:initPageEntity [" + getFileName() + "] 没找到boardEntity:" + this.f8952a.m7800k());
        throw new NullPointerException("empty boardEntity: " + this.f8952a.m7800k());
    }

    /* renamed from: d0 */
    public final void m7779d0() {
        InterfaceC8055c interfaceC8055cMo210m = this.f8958g.mo210m();
        if (interfaceC8055cMo210m != null) {
            this.f8959h.m12092c((AbstractC8053a) interfaceC8055cMo210m, this.f8958g.getBackgroundColor(), this.f8958g.m184K());
        }
    }

    /* renamed from: e0 */
    public final void m7780e0(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix) {
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        this.f8955d.m14635c().m7989x(originMatrix, lastMatrix, System.currentTimeMillis());
    }

    /* renamed from: f0 */
    public final void m7781f0(PageEntity pageEntity) {
        Intrinsics.checkNotNullParameter(pageEntity, "<set-?>");
        this.f8953b = pageEntity;
    }

    @Override // p084d5.InterfaceC7750j
    public String getFileName() {
        return m7769T().getDirName();
    }

    /* renamed from: h0 */
    public final void m7782h0(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        ToMany toManyM7373a;
        AudioInfoEntity audioInfoEntity;
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) CollectionsKt.lastOrNull((List) ((RecordEntity) pageEntity.m7615g().m13183g()).m7629a());
        if (audioRecordEntity == null || (toManyM7373a = audioRecordEntity.m7373a()) == null || (audioInfoEntity = (AudioInfoEntity) CollectionsKt.lastOrNull((List) toManyM7373a)) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM8083A = EzyCommand.CommandSource.CommandInfo.AudioStart.m8083A(audioInfoEntity.getData());
        File file = new File(C9097c.f15322d.m14637a(m7770U(), DocumentType.AUDIO), audioStartM8083A.getFileName());
        if (file.exists()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            long duration = mediaPlayer.getDuration();
            if (audioStartM8083A.m8094u() != duration) {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C7072b c7072bM8090w = EzyCommand.CommandSource.CommandInfo.AudioStart.m8090w();
                c7072bM8090w.m8114s(audioStartM8083A.getFileName());
                c7072bM8090w.m8112q(duration);
                byte[] byteArray = c7072bM8090w.build().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "builder.build().toByteArray()");
                audioInfoEntity.m7355i(byteArray);
                audioInfoEntity.m7356j(duration);
                audioInfoEntity.m7354h();
            }
        }
    }

    @Override // p084d5.InterfaceC7750j
    public void hide() throws Throwable {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM196W = this.f8958g.m196W();
        if (graphSnapshotM196W != null) {
            EzyPageSnapshot.PageSnapshot.C7120b c7120bM8970w = EzyPageSnapshot.PageSnapshot.m8970w();
            c7120bM8970w.m9089z(graphSnapshotM196W);
            c7120bM8970w.m9087x(AbstractC9695n.m16201c(this.f8957f.m17346d(), 0L));
            AbstractC9697p.a aVar = AbstractC9697p.f17136a;
            String strM7770U = m7770U();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c7120bM8970w.build();
            Intrinsics.checkNotNullExpressionValue(pageSnapshotBuild, "builder.build()");
            aVar.m16209b(strM7770U, "snapshot.bin", pageSnapshotBuild);
            if (m7769T().getIsChange()) {
                m7769T().m7618j(false);
                m7769T().m7619k("");
                m7769T().m7620l(-1);
                m7769T().m7617i();
            }
        }
        this.f8958g.m188O();
    }

    /* renamed from: i0 */
    public final void m7783i0(PageEntity pageEntity) {
        long duration = ((HeaderEntity) pageEntity.m7613e().m13183g()).getDuration();
        long jM7760K = m7760K(pageEntity);
        long jM7759J = m7759J(pageEntity);
        if (duration >= jM7760K && duration >= jM7759J) {
            this.f8954c.m14643d(duration);
            this.f8954c.m14646g(duration - jM7759J);
            this.f8954c.m14647h(duration - jM7760K);
        } else if (jM7760K > jM7759J) {
            this.f8954c.m14643d(jM7760K);
            this.f8954c.m14646g(jM7760K - jM7759J);
        } else if (jM7759J > jM7760K) {
            this.f8954c.m14643d(jM7759J);
            this.f8955d.m14635c().m7986e0(jM7759J - jM7760K);
        }
    }

    @Override // p084d5.InterfaceC7750j
    public void onDelete() {
        C9685d.f17121a.m16164e(m7769T());
    }

    @Override // p084d5.InterfaceC7750j
    public void release() {
        new Thread(new Runnable() { // from class: d5.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException {
                BasePageControl.m7756c0(this.f13047a);
            }
        }).start();
        mo7825h(this.f8961j.m16702u());
        this.f8958g.m188O();
    }

    @Override // p084d5.InterfaceC7750j
    /* renamed from: x */
    public long mo7784x() {
        return this.f8954c.m14642c(System.currentTimeMillis());
    }
}
