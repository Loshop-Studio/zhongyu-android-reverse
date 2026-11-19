package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.media.MediaPlayer;
import androidx.core.view.PointerIconCompat;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
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
import p035c5.InterfaceC5119b;
import p077e5.AbstractC7345f;
import p077e5.AbstractC7352m;
import p077e5.AbstractC7354o;
import p077e5.C7342c;
import p098g4.C7521a;
import p131j4.C7792a;
import p142k4.C7879b;
import p155l4.C8505j;
import p177n4.AbstractC8630j;
import p177n4.C8621a;
import p177n4.C8626f;
import p177n4.InterfaceC8628h;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p214q8.C8980a;
import p265v4.C9667c;
import p285x4.C9850c;
import p285x4.C9852e;

/* loaded from: classes4.dex */
public abstract class BasePageControl implements InterfaceC8628h {

    /* renamed from: m */
    public static final C6738a f7669m = new C6738a(null);

    /* renamed from: a */
    public final BoardControl f7670a;

    /* renamed from: b */
    public PageEntity f7671b;

    /* renamed from: c */
    public final C9852e f7672c;

    /* renamed from: d */
    public final C9850c f7673d;

    /* renamed from: e */
    public final C9667c f7674e;

    /* renamed from: f */
    public final C7792a f7675f;

    /* renamed from: g */
    public final C7879b f7676g;

    /* renamed from: h */
    public final C8626f f7677h;

    /* renamed from: i */
    public final C8621a f7678i;

    /* renamed from: j */
    public C7521a f7679j;

    /* renamed from: k */
    public final ArrayList f7680k;

    /* renamed from: l */
    public final ArrayList f7681l;

    /* renamed from: com.zykj.blackboard.core.edit.BasePageControl$a */
    public static final class C6738a {
        public /* synthetic */ C6738a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6738a() {
        }
    }

    /* renamed from: com.zykj.blackboard.core.edit.BasePageControl$b */
    public static final class C6739b implements InterfaceC5119b {

        /* renamed from: a */
        public final /* synthetic */ PageEntity f7682a;

        public C6739b(PageEntity pageEntity) {
            this.f7682a = pageEntity;
        }

        @Override // p035c5.InterfaceC5119b
        /* renamed from: a */
        public void mo2774a(CommandInfoEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            if (this.f7682a.getIsChange()) {
                return;
            }
            this.f7682a.m6517k(((CommandRecordEntity) entity.m6332f().m13064j()).getFileName());
            this.f7682a.m6516j(true);
            this.f7682a.m6518l(((CommandRecordEntity) entity.m6332f().m13064j()).m6341a().m13053r(entity.getId()));
            this.f7682a.m6515i();
        }
    }

    public BasePageControl(BoardControl boardControl, C8505j renderLayer, PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f7670a = boardControl;
        C9852e c9852e = new C9852e();
        this.f7672c = c9852e;
        C9850c c9850c = new C9850c(c9852e);
        this.f7673d = c9850c;
        C9667c c9667c = new C9667c();
        this.f7674e = c9667c;
        C7792a c7792a = new C7792a();
        this.f7675f = c7792a;
        C7879b c7879b = new C7879b(c7792a, renderLayer, boardControl.getConfig());
        c7879b.m13432S(new Function1<InterfaceC8888c, Unit>() { // from class: com.zykj.blackboard.core.edit.BasePageControl$graphControl$1$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m6681a(InterfaceC8888c deleteGraph) {
                Intrinsics.checkNotNullParameter(deleteGraph, "deleteGraph");
                if (!(deleteGraph instanceof ImageGraph) || this.f7683a.mo6733w()) {
                    return;
                }
                ImageGraph imageGraph = (ImageGraph) deleteGraph;
                if (imageGraph.m15149I() == null) {
                    imageGraph.m15151K();
                }
                String strM15149I = imageGraph.m15149I();
                if (strM15149I != null) {
                    this.f7683a.m6664R().remove(strM15149I);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8888c interfaceC8888c) {
                m6681a(interfaceC8888c);
                return Unit.INSTANCE;
            }
        });
        this.f7676g = c7879b;
        C8626f c8626f = new C8626f(c7879b);
        this.f7677h = c8626f;
        this.f7678i = new C8621a();
        this.f7679j = new C7521a(c7879b, boardControl.getConfig(), c7792a, c9667c, c9850c, c8626f);
        this.f7680k = new ArrayList();
        this.f7681l = new ArrayList();
        if (pageEntity == null) {
            m6671Y(m6673a0());
            m6654H();
        } else {
            m6677e0(pageEntity);
            m6671Y(pageEntity);
        }
    }

    /* renamed from: b0 */
    public static final void m6652b0(BasePageControl this$0) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mo6733w()) {
            this$0.stopRecord();
        }
        HeaderEntity headerEntity = (HeaderEntity) this$0.m6665S().m6511e().m13064j();
        if (headerEntity == null) {
            return;
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m6427k().m13064j();
        if (moveConfigEntity != null) {
            moveConfigEntity.m6502j(this$0.f7670a.getConfig().getMoveActionConfig());
            moveConfigEntity.m6501i();
        } else {
            MoveConfigEntity moveConfigEntityM11754e = AbstractC7345f.m11754e(this$0.f7670a.getConfig().getMoveActionConfig());
            moveConfigEntityM11754e.m6501i();
            headerEntity.m6427k().m13071t(moveConfigEntityM11754e);
            headerEntity.m6433q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6653f0(com.zykj.blackboard.core.edit.BasePageControl r10, kotlin.jvm.functions.Function0 r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BasePageControl.m6653f0(com.zykj.blackboard.core.edit.BasePageControl, kotlin.jvm.functions.Function0):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/edit/BasePageControl.smali:490
    }

    /* renamed from: H */
    public final void m6654H() {
        CommandRecord commandRecordM16495b = this.f7673d.m16495b();
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m8043q().m8064s(-3.4028235E38f).m8067v(-3.4028235E38f).m8066u(Float.MAX_VALUE).m8062q(Float.MAX_VALUE).build();
        Intrinsics.checkNotNullExpressionValue(rectFBuild, "newBuilder().setLeft(-Fl…(Float.MAX_VALUE).build()");
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(commandRecordM16495b.m6857B("", graphEnum, rectFBuild, System.currentTimeMillis()).getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(graphData, "graphData");
        AbstractC8886a abstractC8886aMo6761f = graphBuildFactory.mo6761f(graphData, this.f7674e);
        if (abstractC8886aMo6761f != null) {
            this.f7676g.mo13460y(graphData.m7265F(), abstractC8886aMo6761f);
        }
    }

    /* renamed from: I */
    public final long m6655I(PageEntity pageEntity) {
        Iterator<TARGET> it = ((RecordEntity) pageEntity.m6513g().m13064j()).m6527a().iterator();
        long delayTime = 0;
        while (it.hasNext()) {
            for (AudioInfoEntity audioInfoEntity : ((AudioRecordEntity) it.next()).m6281a()) {
                if (audioInfoEntity.getIsPlay()) {
                    delayTime += audioInfoEntity.getDelayTime() + audioInfoEntity.getDuration();
                }
            }
        }
        return delayTime;
    }

    /* renamed from: J */
    public final long m6656J(PageEntity pageEntity) {
        Iterator<TARGET> it = ((RecordEntity) pageEntity.m6513g().m13064j()).m6528b().iterator();
        long delayTime = 0;
        while (it.hasNext()) {
            for (CommandInfoEntity commandInfoEntity : ((CommandRecordEntity) it.next()).m6341a()) {
                if (commandInfoEntity.getIsPlay()) {
                    delayTime += commandInfoEntity.getDelayTime() + commandInfoEntity.getDuration();
                }
            }
        }
        return delayTime;
    }

    /* renamed from: K */
    public final PageEntity m6657K(BlackBoardEntity blackBoardEntity) throws IllegalAccessException, IllegalArgumentException {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LogUtils.m3239i("BasePageControl:createPageEntity [" + string + "]:创建新Entity");
        m6677e0(new PageEntity(0L, string, false, null, 0, 28, null));
        ToOne toOneM6511e = m6665S().m6511e();
        HeaderEntity headerEntity = new HeaderEntity(0L, 6, 0, 0, 0L, 0L, 0L, null, 0, 0, PointerIconCompat.TYPE_GRAB, null);
        headerEntity.m6434r(System.currentTimeMillis());
        headerEntity.m6436t(0L);
        BoardConfig config = this.f7670a.getConfig();
        headerEntity.m6440x(config.getWidth());
        headerEntity.m6437u(config.getHeight());
        headerEntity.m6435s(config.getBackgroundColor());
        headerEntity.m6439w(config.getBackgroundColor());
        ToOne toOneM6427k = headerEntity.m6427k();
        MoveConfigEntity moveConfigEntityM11754e = AbstractC7345f.m11754e(config.getMoveActionConfig());
        moveConfigEntityM11754e.m6501i();
        toOneM6427k.m13071t(moveConfigEntityM11754e);
        ToOne toOneM6421e = headerEntity.m6421e();
        BackgroundLineConfigEntity backgroundLineConfigEntityM11753d = AbstractC7345f.m11753d(config.getBackgroundLineConfig());
        backgroundLineConfigEntityM11753d.m6311f();
        toOneM6421e.m13071t(backgroundLineConfigEntityM11753d);
        ToOne toOneM6426j = headerEntity.m6426j();
        BackgroundLineConfigEntity backgroundLineConfigEntityM11753d2 = AbstractC7345f.m11753d(config.getBackgroundLineConfig());
        backgroundLineConfigEntityM11753d2.m6311f();
        toOneM6426j.m13071t(backgroundLineConfigEntityM11753d2);
        ToOne toOneM6417a = headerEntity.m6417a();
        config.getAuthor();
        toOneM6417a.m13071t(null);
        headerEntity.m6428l().m13071t(m6665S());
        headerEntity.m6433q();
        toOneM6511e.m13071t(headerEntity);
        ToOne toOneM6513g = m6665S().m6513g();
        RecordEntity recordEntity = new RecordEntity(0L, 1, null);
        recordEntity.m6533g().m13071t(m6665S());
        recordEntity.m6536j();
        toOneM6513g.m13071t(recordEntity);
        m6665S().m6507a().m13071t(blackBoardEntity);
        m6665S().m6515i();
        LogUtils.m3239i("BasePageControl:createPageEntity [" + string + "]:创建完成,id:" + m6665S().getId());
        return m6665S();
    }

    /* renamed from: L */
    public final C7521a m6658L() {
        return this.f7679j;
    }

    /* renamed from: M */
    public final C8621a m6659M() {
        return this.f7678i;
    }

    /* renamed from: N */
    public final BoardControl m6660N() {
        return this.f7670a;
    }

    /* renamed from: O */
    public final C7879b m6661O() {
        return this.f7676g;
    }

    /* renamed from: P */
    public final C8626f m6662P() {
        return this.f7677h;
    }

    /* renamed from: Q */
    public final C7792a m6663Q() {
        return this.f7675f;
    }

    /* renamed from: R */
    public final ArrayList m6664R() {
        return this.f7681l;
    }

    /* renamed from: S */
    public final PageEntity m6665S() {
        PageEntity pageEntity = this.f7671b;
        if (pageEntity != null) {
            return pageEntity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageEntity");
        return null;
    }

    /* renamed from: T */
    public final String m6666T() {
        String absolutePath = new File(this.f7670a.m6691h(), m6665S().getDirName()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(boardControl.getBoa…ity.dirName).absolutePath");
        return absolutePath;
    }

    /* renamed from: U */
    public final ArrayList m6667U() {
        return this.f7680k;
    }

    /* renamed from: V */
    public final C9850c m6668V() {
        return this.f7673d;
    }

    /* renamed from: W */
    public final C9667c m6669W() {
        return this.f7674e;
    }

    /* renamed from: X */
    public final C9852e m6670X() {
        return this.f7672c;
    }

    /* renamed from: Y */
    public final void m6671Y(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        m6672Z(pageEntity);
        mo6719k(this.f7679j.m12256u());
        mo6719k(new C6739b(pageEntity));
        C9850c c9850c = this.f7673d;
        Object objM13064j = pageEntity.m6513g().m13064j();
        Intrinsics.checkNotNullExpressionValue(objM13064j, "pageEntity.recordEntity.target");
        c9850c.m16496c((RecordEntity) objM13064j);
        this.f7674e.m16180g(m6666T());
        this.f7678i.m14193a(C9850c.f17405d.m16497a(m6666T(), DocumentType.AUDIO));
        m6678g0(pageEntity);
        m6679h0(pageEntity);
    }

    /* renamed from: Z */
    public final void m6672Z(PageEntity pageEntity) {
        BackgroundLineConfig backgroundLineConfigM11751b;
        BackgroundLineConfig backgroundLineConfigM11751b2;
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.m6511e().m13064j();
        if (headerEntity == null) {
            return;
        }
        this.f7676g.m13430Q(headerEntity.getDefaultBackgroundColor());
        this.f7676g.mo13438c(headerEntity.getLastBackgroundColor());
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.m6421e().m13064j();
        if (backgroundLineConfigEntity != null && (backgroundLineConfigM11751b2 = AbstractC7345f.m11751b(backgroundLineConfigEntity)) != null) {
            this.f7676g.m13431R(backgroundLineConfigM11751b2);
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.m6426j().m13064j();
        if (backgroundLineConfigEntity2 != null && (backgroundLineConfigM11751b = AbstractC7345f.m11751b(backgroundLineConfigEntity2)) != null) {
            this.f7676g.mo13455t(backgroundLineConfigM11751b);
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m6427k().m13064j();
        if (moveConfigEntity != null) {
            this.f7670a.getConfig().getMoveActionConfig().m12000h(moveConfigEntity);
        }
        this.f7675f.m13197k(AbstractC8630j.m14213c(headerEntity.getWidth(), headerEntity.getHeight(), this.f7670a.getConfig().getWidth(), this.f7670a.getConfig().getHeight(), false, 0, 0, 112, null));
    }

    /* renamed from: a0 */
    public final PageEntity m6673a0() {
        C8980a c8980aM12981h = C7342c.f11908a.m11744b().m12981h(BlackBoardEntity.class);
        Intrinsics.checkNotNullExpressionValue(c8980aM12981h, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c8980aM12981h.m15047n();
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        builder.m13041g(BlackBoardEntity_.f7256f, this.f7670a.m6691h());
        Query queryM13039a = builder.m13039a();
        Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM13039a.m13033p();
        if (blackBoardEntity != null) {
            return m6657K(blackBoardEntity);
        }
        LogUtils.m3239i("BasePageControl:initPageEntity [" + getFileName() + "] 没找到boardEntity:" + this.f7670a.m6691h());
        throw new NullPointerException("empty boardEntity: " + this.f7670a.m6691h());
    }

    @Override // p177n4.InterfaceC8628h
    /* renamed from: b */
    public void mo6674b(final Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        new Thread(new Runnable() { // from class: n4.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                BasePageControl.m6653f0(this.f14276a, callback);
            }
        }).start();
    }

    /* renamed from: c0 */
    public final void m6675c0() {
        InterfaceC8888c interfaceC8888cMo13449n = this.f7676g.mo13449n();
        if (interfaceC8888cMo13449n != null) {
            this.f7677h.m14200c((AbstractC8886a) interfaceC8888cMo13449n, this.f7676g.getBackgroundColor(), this.f7676g.m13423J());
        }
    }

    /* renamed from: d0 */
    public final void m6676d0(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix) {
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        this.f7673d.m16495b().m6876x(originMatrix, lastMatrix, System.currentTimeMillis());
    }

    /* renamed from: e0 */
    public final void m6677e0(PageEntity pageEntity) {
        Intrinsics.checkNotNullParameter(pageEntity, "<set-?>");
        this.f7671b = pageEntity;
    }

    /* renamed from: g0 */
    public final void m6678g0(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        ToMany toManyM6281a;
        AudioInfoEntity audioInfoEntity;
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) CollectionsKt.lastOrNull((List) ((RecordEntity) pageEntity.m6513g().m13064j()).m6527a());
        if (audioRecordEntity == null || (toManyM6281a = audioRecordEntity.m6281a()) == null || (audioInfoEntity = (AudioInfoEntity) CollectionsKt.lastOrNull((List) toManyM6281a)) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM6975x = EzyCommand.CommandSource.CommandInfo.AudioStart.m6975x(audioInfoEntity.getData());
        File file = new File(C9850c.f17405d.m16497a(m6666T(), DocumentType.AUDIO), audioStartM6975x.getFileName());
        if (file.exists()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            long duration = mediaPlayer.getDuration();
            if (audioStartM6975x.m6977r() != duration) {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C6753b c6753bM6973t = EzyCommand.CommandSource.CommandInfo.AudioStart.m6973t();
                c6753bM6973t.m6998s(audioStartM6975x.getFileName());
                c6753bM6973t.m6996q(duration);
                byte[] byteArray = c6753bM6973t.build().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "builder.build().toByteArray()");
                audioInfoEntity.m6261i(byteArray);
                audioInfoEntity.m6262j(duration);
                audioInfoEntity.m6260h();
            }
        }
    }

    @Override // p177n4.InterfaceC8628h
    public String getFileName() {
        return m6665S().getDirName();
    }

    /* renamed from: h0 */
    public final void m6679h0(PageEntity pageEntity) {
        long duration = ((HeaderEntity) pageEntity.m6511e().m13064j()).getDuration();
        long jM6656J = m6656J(pageEntity);
        long jM6655I = m6655I(pageEntity);
        if (duration >= jM6656J && duration >= jM6655I) {
            this.f7672c.m16503d(duration);
            this.f7672c.m16506g(duration - jM6655I);
            this.f7672c.m16507h(duration - jM6656J);
        } else if (jM6656J > jM6655I) {
            this.f7672c.m16503d(jM6656J);
            this.f7672c.m16506g(jM6656J - jM6655I);
        } else if (jM6655I > jM6656J) {
            this.f7672c.m16503d(jM6655I);
            this.f7673d.m16495b().m6873d0(jM6655I - jM6656J);
        }
    }

    @Override // p177n4.InterfaceC8628h
    public void hide() throws Throwable {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM13434U = this.f7676g.m13434U();
        if (graphSnapshotM13434U != null) {
            EzyPageSnapshot.PageSnapshot.C6801b c6801bM7839t = EzyPageSnapshot.PageSnapshot.m7839t();
            c6801bM7839t.m7957z(graphSnapshotM13434U);
            c6801bM7839t.m7955x(AbstractC7352m.m11778c(this.f7675f.m13190d(), 0L));
            AbstractC7354o.a aVar = AbstractC7354o.f11923a;
            String strM6666T = m6666T();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c6801bM7839t.build();
            Intrinsics.checkNotNullExpressionValue(pageSnapshotBuild, "builder.build()");
            aVar.m11785a(strM6666T, "snapshot.bin", pageSnapshotBuild);
            if (m6665S().getIsChange()) {
                m6665S().m6516j(false);
                m6665S().m6517k("");
                m6665S().m6518l(-1);
                m6665S().m6515i();
            }
        }
        this.f7676g.m13426M();
    }

    @Override // p177n4.InterfaceC8628h
    public void onDelete() {
        C7342c.f11908a.m11743a(m6665S());
    }

    @Override // p177n4.InterfaceC8628h
    public void release() {
        new Thread(new Runnable() { // from class: n4.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException {
                BasePageControl.m6652b0(this.f14278a);
            }
        }).start();
        mo6705B(this.f7679j.m12256u());
        this.f7676g.m13426M();
    }

    @Override // p177n4.InterfaceC8628h
    /* renamed from: x */
    public long mo6680x() {
        return this.f7672c.m16502c(System.currentTimeMillis());
    }
}
