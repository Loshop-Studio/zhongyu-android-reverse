package p178ha;

import android.graphics.Rect;
import android.graphics.RectF;
import ba.AbstractC5179a;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.play.AudioCommandThread;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.exception.HighVersionException;
import com.zykj.blackboard.exception.LowVersionException;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPageSnapshot;
import ga.C9281a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10220h;
import na.AbstractC10344g;
import na.AbstractC10351n;
import na.C10349l;
import p181hd.InterfaceC9529a;
import p307q9.C10762b;
import p307q9.C10764d;
import p307q9.C10765e;
import p322r9.C10917a;
import p322r9.C10920d;
import p322r9.InterfaceC10919c;
import p362u9.C11373a;
import p377v9.C11551b;
import p390w9.C11719h;
import p406x9.C11814b;
import p422y9.AbstractC11936o;

/* renamed from: ha.f */
/* loaded from: classes5.dex */
public abstract class AbstractC9509f implements InterfaceC9516m {

    /* renamed from: a */
    public final InterfaceC9515l f21993a;

    /* renamed from: b */
    public final C11719h f21994b;

    /* renamed from: c */
    public String f21995c;

    /* renamed from: d */
    public String f21996d;

    /* renamed from: e */
    public final C9281a f21997e;

    /* renamed from: f */
    public final C11373a f21998f;

    /* renamed from: g */
    public final C10762b f21999g;

    /* renamed from: h */
    public final C11551b f22000h;

    /* renamed from: i */
    public C10765e f22001i;

    /* renamed from: j */
    public final C9511h f22002j;

    /* renamed from: k */
    public final AudioCommandThread f22003k;

    /* renamed from: l */
    public ScheduledExecutorService f22004l;

    /* renamed from: m */
    public long f22005m;

    /* renamed from: n */
    public int f22006n;

    /* renamed from: o */
    public BackgroundLineConfig f22007o;

    /* renamed from: p */
    public C10917a f22008p;

    /* renamed from: q */
    public final InterfaceC10220h f22009q;

    /* renamed from: r */
    public final ExecutorService f22010r;

    public AbstractC9509f(InterfaceC9515l playControl, C11719h renderLayer) {
        AbstractC9979u.m20294g(playControl, "playControl");
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        this.f21993a = playControl;
        this.f21994b = renderLayer;
        this.f21995c = "";
        this.f21996d = "";
        C9281a c9281a = new C9281a();
        this.f21997e = c9281a;
        C11373a c11373a = new C11373a();
        this.f21998f = c11373a;
        C10762b c10762b = new C10762b(renderLayer.m25948e().width(), renderLayer.m25948e().height());
        c10762b.m22897h0(EzyModeEnum.ModeEnum.ACTION_SEE);
        this.f21999g = c10762b;
        C11551b c11551b = new C11551b(c11373a, renderLayer, c10762b);
        this.f22000h = c11551b;
        this.f22001i = new C10765e();
        C9511h c9511h = new C9511h();
        this.f22002j = c9511h;
        AudioCommandThread audioCommandThread = new AudioCommandThread();
        this.f22003k = audioCommandThread;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        AbstractC9979u.m20293f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(1)");
        this.f22004l = scheduledExecutorServiceNewScheduledThreadPool;
        this.f22007o = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        this.f22008p = new C10917a(c11551b, c10762b, c11373a, c9281a, null, null, 48, null);
        c9511h.m26654p(this.f22001i);
        audioCommandThread.m26654p(this.f22001i);
        this.f22009q = new a();
        this.f22010r = Executors.newSingleThreadExecutor();
    }

    /* renamed from: w */
    public static final void m18732w(AbstractC9509f this$0, InterfaceC9529a callBack) throws IOException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(callBack, "$callBack");
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " show"));
        C10349l c10349l = C10349l.f24656a;
        String absolutePath = new File(this$0.f21995c, "snapshot.bin").getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "File(mPageDirPath, BaseP…T_FILE_NAME).absolutePath");
        EzyPageSnapshot.PageSnapshot pageSnapshotM21652e = c10349l.m21652e(absolutePath);
        if (pageSnapshotM21652e != null) {
            C11373a c11373a = this$0.f21998f;
            EzyMatrix.Matrix matrixM15588f = pageSnapshotM21652e.m15588f();
            AbstractC9979u.m20293f(matrixM15588f, "this.cameraMatrix");
            c11373a.m25319j(AbstractC10351n.m21665g(matrixM15588f));
            C9281a c9281a = this$0.f21997e;
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM15590m = pageSnapshotM21652e.m15590m();
            AbstractC9979u.m20293f(graphSnapshotM15590m, "this.graphSnapshot");
            AbstractC5179a abstractC5179aM21648a = c10349l.m21648a(c9281a, graphSnapshotM15590m);
            if (abstractC5179aM21648a != null) {
                this$0.f22000h.mo25419E(abstractC5179aM21648a);
            }
        }
        this$0.f22000h.mo25444d(this$0.f22006n);
        this$0.f22000h.mo25459s(this$0.f22007o);
        this$0.f22000h.m25440Z();
        this$0.f22000h.mo25447g();
        callBack.invoke();
    }

    @Override // p178ha.InterfaceC9514k
    /* renamed from: b */
    public void mo18733b(final InterfaceC9529a callBack) {
        AbstractC9979u.m20294g(callBack, "callBack");
        this.f22010r.submit(new Runnable() { // from class: ha.e
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                AbstractC9509f.m18732w(this.f21991c, callBack);
            }
        });
    }

    @Override // p178ha.InterfaceC9516m
    /* renamed from: d */
    public void mo18734d(InterfaceC10220h listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f22002j.m26645d().add(listener);
    }

    @Override // p178ha.InterfaceC9514k
    /* renamed from: h */
    public void mo18735h(String pageName) throws HighVersionException, IOException, LowVersionException {
        AbstractC9979u.m20294g(pageName, "pageName");
        String absolutePath = new File(this.f21993a.mo14532b(), pageName).getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "File(playControl.getRoot…), pageName).absolutePath");
        this.f21995c = absolutePath;
        this.f21996d = pageName;
        this.f21997e.m18295g(absolutePath);
        EzyHeader.Header headerM26151j = C11814b.f28049a.m26151j(this.f21995c);
        if (headerM26151j.getVersion() > 6) {
            throw new HighVersionException("version=" + headerM26151j.getVersion() + " supportLastVersion=6");
        }
        if (headerM26151j.getVersion() < 6) {
            throw new LowVersionException("version=" + headerM26151j.getVersion() + " supportLastVersion=6");
        }
        this.f22005m = headerM26151j.m15346I();
        InterfaceC10919c interfaceC10919cM23778r = this.f22008p.m23778r();
        if (interfaceC10919cM23778r instanceof C10920d) {
            ((C10920d) interfaceC10919cM23778r).m23802K(this.f22005m > 0);
        }
        Rect rectM25948e = this.f21994b.m25948e();
        this.f21998f.m25320k(AbstractC11936o.m26494b(headerM26151j.getWidth(), headerM26151j.getHeight(), rectM25948e.width(), rectM25948e.height(), this.f22005m > 0, headerM26151j.m15349L().m15424t(), headerM26151j.m15349L().m15423r()));
        this.f22002j.m18761F(headerM26151j.getVersion());
        this.f22000h.m25435U(headerM26151j.m15343E());
        this.f22006n = headerM26151j.m15347J();
        C11551b c11551b = this.f22000h;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM15344F = headerM26151j.m15344F();
        AbstractC9979u.m20293f(backgroundLineConfigM15344F, "header.defaultBackgroundLineConfig");
        c11551b.m25436V(AbstractC10344g.m21634c(backgroundLineConfigM15344F));
        EzyHeader.BackgroundLineConfig backgroundLineConfigM15348K = headerM26151j.m15348K();
        AbstractC9979u.m20293f(backgroundLineConfigM15348K, "header.lastBackgroundLineConfig");
        this.f22007o = AbstractC10344g.m21634c(backgroundLineConfigM15348K);
        C10764d c10764dM22919z = this.f22008p.mo23770j().m22919z();
        EzyHeader.MoveConfig moveConfigM15349L = headerM26151j.m15349L();
        AbstractC9979u.m20293f(moveConfigM15349L, "header.moveConfig");
        m18736k(c10764dM22919z, moveConfigM15349L);
        this.f22000h.m25438X(new RectF(0.0f, 0.0f, headerM26151j.getWidth(), headerM26151j.getHeight()));
    }

    @Override // p178ha.InterfaceC9514k
    public void hide() {
        this.f22000h.m25431Q();
    }

    /* renamed from: k */
    public final void m18736k(C10764d c10764d, EzyHeader.MoveConfig moveConfig) {
        c10764d.m22933l(moveConfig.m15422p());
        c10764d.m22936o(moveConfig.m15427y());
        c10764d.m22930i(moveConfig.m15421o());
        c10764d.m22935n(moveConfig.m15426v());
        c10764d.m22934m(moveConfig.m15425u());
        c10764d.m22932k(moveConfig.m15424t());
        c10764d.m22931j(moveConfig.m15423r());
    }

    /* renamed from: l */
    public final C10917a m18737l() {
        return this.f22008p;
    }

    /* renamed from: m */
    public final AudioCommandThread m18738m() {
        return this.f22003k;
    }

    /* renamed from: n */
    public final C9281a m18739n() {
        return this.f21997e;
    }

    /* renamed from: o */
    public final C9511h m18740o() {
        return this.f22002j;
    }

    /* renamed from: p */
    public final C11551b m18741p() {
        return this.f22000h;
    }

    /* renamed from: q */
    public final String m18742q() {
        return this.f21995c;
    }

    /* renamed from: r */
    public final C11373a m18743r() {
        return this.f21998f;
    }

    @Override // p178ha.InterfaceC9514k
    public void release() throws IllegalStateException {
        if (!this.f22004l.isShutdown()) {
            this.f22004l.shutdown();
        }
        this.f22002j.mo14520s();
        this.f22003k.mo14520s();
        this.f22000h.m25431Q();
        this.f21997e.m18296h();
    }

    /* renamed from: s */
    public final C10765e m18744s() {
        return this.f22001i;
    }

    @Override // p178ha.InterfaceC9516m
    public PlayStatus status() {
        return this.f22002j.m26649h();
    }

    /* renamed from: t */
    public final long m18745t() {
        return this.f22005m;
    }

    /* renamed from: u */
    public final void m18746u() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        if (this.f22004l.isShutdown()) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            AbstractC9979u.m20293f(scheduledExecutorServiceNewScheduledThreadPool, "{\n            Executors.…edThreadPool(2)\n        }");
        } else {
            this.f22004l.shutdown();
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            AbstractC9979u.m20293f(scheduledExecutorServiceNewScheduledThreadPool, "{\n            execute.sh…edThreadPool(2)\n        }");
        }
        ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
        this.f22004l = scheduledExecutorService;
        C9511h c9511h = this.f22002j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledExecutorService.scheduleAtFixedRate(c9511h, 0L, 16L, timeUnit);
        this.f22004l.scheduleAtFixedRate(this.f22003k, 0L, 16L, timeUnit);
    }

    /* renamed from: v */
    public final void m18747v(boolean z10) {
        InterfaceC10919c interfaceC10919cM23778r = this.f22008p.m23778r();
        if (interfaceC10919cM23778r instanceof C10920d) {
            ((C10920d) interfaceC10919cM23778r).m23802K(z10);
        }
    }

    /* renamed from: ha.f$a */
    public static final class a implements InterfaceC10220h {
        public a() {
        }

        @Override // ma.InterfaceC10220h
        public void onPlayEnd() {
            AbstractC9509f.this.m18747v(false);
        }

        @Override // ma.InterfaceC10220h
        public void onPlayPause() {
            AbstractC9509f.this.m18747v(false);
        }

        @Override // ma.InterfaceC10220h
        public void onPlayResume() {
            AbstractC9509f.this.m18747v(true);
        }

        @Override // ma.InterfaceC10220h
        public void onPlayStart() {
            AbstractC9509f.this.m18747v(true);
        }

        @Override // ma.InterfaceC10220h
        public void onProgress(long j10) {
        }
    }
}
