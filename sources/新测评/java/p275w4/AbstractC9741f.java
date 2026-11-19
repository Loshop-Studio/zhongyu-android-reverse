package p275w4;

import android.graphics.Rect;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.play.AudioCommandThread;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.exception.HighVersionException;
import com.zykj.blackboard.exception.LowVersionException;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPageSnapshot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5125h;
import p077e5.AbstractC7345f;
import p077e5.AbstractC7352m;
import p077e5.C7350k;
import p087f4.C7438c;
import p087f4.C7439d;
import p098g4.C7521a;
import p098g4.C7524d;
import p098g4.InterfaceC7523c;
import p131j4.C7792a;
import p142k4.C7879b;
import p155l4.C8505j;
import p166m4.C8550b;
import p177n4.AbstractC8630j;
import p210q4.AbstractC8886a;
import p265v4.C9665a;

/* renamed from: w4.f */
/* loaded from: classes4.dex */
public abstract class AbstractC9741f implements InterfaceC9748m {

    /* renamed from: a */
    public final InterfaceC9747l f17121a;

    /* renamed from: b */
    public final C8505j f17122b;

    /* renamed from: c */
    public String f17123c;

    /* renamed from: d */
    public String f17124d;

    /* renamed from: e */
    public final C9665a f17125e;

    /* renamed from: f */
    public final C7792a f17126f;

    /* renamed from: g */
    public final BoardConfig f17127g;

    /* renamed from: h */
    public final C7879b f17128h;

    /* renamed from: i */
    public C7439d f17129i;

    /* renamed from: j */
    public final C9743h f17130j;

    /* renamed from: k */
    public final AudioCommandThread f17131k;

    /* renamed from: l */
    public ScheduledExecutorService f17132l;

    /* renamed from: m */
    public long f17133m;

    /* renamed from: n */
    public int f17134n;

    /* renamed from: o */
    public BackgroundLineConfig f17135o;

    /* renamed from: p */
    public C7521a f17136p;

    /* renamed from: q */
    public final InterfaceC5125h f17137q;

    /* renamed from: r */
    public final ExecutorService f17138r;

    public AbstractC9741f(InterfaceC9747l playControl, C8505j renderLayer) {
        Intrinsics.checkNotNullParameter(playControl, "playControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f17121a = playControl;
        this.f17122b = renderLayer;
        this.f17123c = "";
        this.f17124d = "";
        C9665a c9665a = new C9665a();
        this.f17125e = c9665a;
        C7792a c7792a = new C7792a();
        this.f17126f = c7792a;
        BoardConfig boardConfig = new BoardConfig(renderLayer.m13979e().width(), renderLayer.m13979e().height());
        boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_SEE);
        this.f17127g = boardConfig;
        C7879b c7879b = new C7879b(c7792a, renderLayer, boardConfig);
        this.f17128h = c7879b;
        this.f17129i = new C7439d();
        C9743h c9743h = new C9743h();
        this.f17130j = c9743h;
        AudioCommandThread audioCommandThread = new AudioCommandThread();
        this.f17131k = audioCommandThread;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(1)");
        this.f17132l = scheduledExecutorServiceNewScheduledThreadPool;
        this.f17135o = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        this.f17136p = new C7521a(c7879b, boardConfig, c7792a, c9665a, null, null, 48, null);
        c9743h.m14330p(this.f17129i);
        audioCommandThread.m14330p(this.f17129i);
        this.f17137q = new a();
        this.f17138r = Executors.newSingleThreadExecutor();
    }

    /* renamed from: w */
    public static final void m16312w(AbstractC9741f this$0, Function0 callBack) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " show"));
        C7350k c7350k = C7350k.f11918a;
        String absolutePath = new File(this$0.f17123c, "snapshot.bin").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(mPageDirPath, BaseP…T_FILE_NAME).absolutePath");
        EzyPageSnapshot.PageSnapshot pageSnapshotM11769e = c7350k.m11769e(absolutePath);
        if (pageSnapshotM11769e != null) {
            C7792a c7792a = this$0.f17126f;
            EzyMatrix.Matrix matrixM7841m = pageSnapshotM11769e.m7841m();
            Intrinsics.checkNotNullExpressionValue(matrixM7841m, "this.cameraMatrix");
            c7792a.m13196j(AbstractC7352m.m11779d(matrixM7841m));
            C9665a c9665a = this$0.f17125e;
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM7843r = pageSnapshotM11769e.m7843r();
            Intrinsics.checkNotNullExpressionValue(graphSnapshotM7843r, "this.graphSnapshot");
            AbstractC8886a abstractC8886aM11765a = c7350k.m11765a(c9665a, graphSnapshotM7843r);
            if (abstractC8886aM11765a != null) {
                this$0.f17128h.mo13451p(abstractC8886aM11765a);
            }
        }
        this$0.f17128h.mo13438c(this$0.f17134n);
        this$0.f17128h.mo13455t(this$0.f17135o);
        this$0.f17128h.m13435V();
        this$0.f17128h.mo13440e();
        callBack.invoke();
    }

    @Override // p275w4.InterfaceC9746k
    /* renamed from: b */
    public void mo16313b(final Function0 callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f17138r.submit(new Runnable() { // from class: w4.e
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                AbstractC9741f.m16312w(this.f17119a, callBack);
            }
        });
    }

    @Override // p275w4.InterfaceC9748m
    /* renamed from: f */
    public void mo16314f(InterfaceC5125h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17130j.m14321d().add(listener);
    }

    @Override // p275w4.InterfaceC9746k
    /* renamed from: h */
    public void mo16315h(String pageName) throws HighVersionException, IOException, LowVersionException {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        String absolutePath = new File(this.f17121a.mo6796b(), pageName).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(playControl.getRoot…), pageName).absolutePath");
        this.f17123c = absolutePath;
        this.f17124d = pageName;
        this.f17125e.m16172g(absolutePath);
        EzyHeader.Header headerM14079i = C8550b.f14183a.m14079i(this.f17123c);
        if (headerM14079i.getVersion() > 6) {
            throw new HighVersionException("version=" + headerM14079i.getVersion() + " supportLastVersion=6");
        }
        if (headerM14079i.getVersion() < 6) {
            throw new LowVersionException("version=" + headerM14079i.getVersion() + " supportLastVersion=6");
        }
        this.f17133m = headerM14079i.m7606I();
        InterfaceC7523c interfaceC7523cM12254s = this.f17136p.m12254s();
        if (interfaceC7523cM12254s instanceof C7524d) {
            ((C7524d) interfaceC7523cM12254s).m12279K(this.f17133m > 0);
        }
        Rect rectM13979e = this.f17122b.m13979e();
        this.f17126f.m13197k(AbstractC8630j.m14212b(headerM14079i.getWidth(), headerM14079i.getHeight(), rectM13979e.width(), rectM13979e.height(), this.f17133m > 0, headerM14079i.m7609L().m7679w(), headerM14079i.m7609L().m7678v()));
        this.f17130j.m16339F(headerM14079i.getVersion());
        this.f17128h.m13430Q(headerM14079i.m7603E());
        this.f17134n = headerM14079i.m7607J();
        C7879b c7879b = this.f17128h;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM7604F = headerM14079i.m7604F();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM7604F, "header.defaultBackgroundLineConfig");
        c7879b.m13431R(AbstractC7345f.m11752c(backgroundLineConfigM7604F));
        EzyHeader.BackgroundLineConfig backgroundLineConfigM7608K = headerM14079i.m7608K();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM7608K, "header.lastBackgroundLineConfig");
        this.f17135o = AbstractC7345f.m11752c(backgroundLineConfigM7608K);
        C7438c moveActionConfig = this.f17136p.mo12246k().getMoveActionConfig();
        EzyHeader.MoveConfig moveConfigM7609L = headerM14079i.m7609L();
        Intrinsics.checkNotNullExpressionValue(moveConfigM7609L, "header.moveConfig");
        m16316k(moveActionConfig, moveConfigM7609L);
        this.f17128h.m13433T(new RectF(0.0f, 0.0f, headerM14079i.getWidth(), headerM14079i.getHeight()));
    }

    @Override // p275w4.InterfaceC9746k
    public void hide() {
        this.f17128h.m13426M();
    }

    /* renamed from: k */
    public final void m16316k(C7438c c7438c, EzyHeader.MoveConfig moveConfig) {
        c7438c.m12004l(moveConfig.m7677u());
        c7438c.m12007o(moveConfig.m7682z());
        c7438c.m12001i(moveConfig.m7676t());
        c7438c.m12006n(moveConfig.m7681y());
        c7438c.m12005m(moveConfig.m7680x());
        c7438c.m12003k(moveConfig.m7679w());
        c7438c.m12002j(moveConfig.m7678v());
    }

    /* renamed from: l */
    public final C7521a m16317l() {
        return this.f17136p;
    }

    /* renamed from: m */
    public final AudioCommandThread m16318m() {
        return this.f17131k;
    }

    /* renamed from: n */
    public final C9665a m16319n() {
        return this.f17125e;
    }

    /* renamed from: o */
    public final C9743h m16320o() {
        return this.f17130j;
    }

    /* renamed from: p */
    public final C7879b m16321p() {
        return this.f17128h;
    }

    /* renamed from: q */
    public final String m16322q() {
        return this.f17123c;
    }

    /* renamed from: r */
    public final C7792a m16323r() {
        return this.f17126f;
    }

    @Override // p275w4.InterfaceC9746k
    public void release() throws IllegalStateException {
        if (!this.f17132l.isShutdown()) {
            this.f17132l.shutdown();
        }
        this.f17130j.mo6784s();
        this.f17131k.mo6784s();
        this.f17128h.m13426M();
        this.f17125e.m16173h();
    }

    /* renamed from: s */
    public final C7439d m16324s() {
        return this.f17129i;
    }

    @Override // p275w4.InterfaceC9748m
    public PlayStatus status() {
        return this.f17130j.m14325h();
    }

    /* renamed from: t */
    public final long m16325t() {
        return this.f17133m;
    }

    /* renamed from: u */
    public final void m16326u() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        if (this.f17132l.isShutdown()) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "{\n            Executors.…edThreadPool(2)\n        }");
        } else {
            this.f17132l.shutdown();
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "{\n            execute.sh…edThreadPool(2)\n        }");
        }
        ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
        this.f17132l = scheduledExecutorService;
        C9743h c9743h = this.f17130j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledExecutorService.scheduleAtFixedRate(c9743h, 0L, 16L, timeUnit);
        this.f17132l.scheduleAtFixedRate(this.f17131k, 0L, 16L, timeUnit);
    }

    /* renamed from: v */
    public final void m16327v(boolean z9) {
        InterfaceC7523c interfaceC7523cM12254s = this.f17136p.m12254s();
        if (interfaceC7523cM12254s instanceof C7524d) {
            ((C7524d) interfaceC7523cM12254s).m12279K(z9);
        }
    }

    /* renamed from: w4.f$a */
    public static final class a implements InterfaceC5125h {
        public a() {
        }

        @Override // p035c5.InterfaceC5125h
        public void onPlayEnd() {
            AbstractC9741f.this.m16327v(false);
        }

        @Override // p035c5.InterfaceC5125h
        public void onPlayPause() {
            AbstractC9741f.this.m16327v(false);
        }

        @Override // p035c5.InterfaceC5125h
        public void onPlayResume() {
            AbstractC9741f.this.m16327v(true);
        }

        @Override // p035c5.InterfaceC5125h
        public void onPlayStart() {
            AbstractC9741f.this.m16327v(true);
        }

        @Override // p035c5.InterfaceC5125h
        public void onProgress(long j10) {
        }
    }
}
