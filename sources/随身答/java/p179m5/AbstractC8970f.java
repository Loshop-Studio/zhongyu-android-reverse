package p179m5;

import android.graphics.Rect;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BackgroundLineConfig;
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
import p006a5.C0038b;
import p023b5.C5120j;
import p034c5.C5230b;
import p084d5.AbstractC7752l;
import p117g5.AbstractC8053a;
import p169l5.C8887a;
import p243s5.InterfaceC9480h;
import p263u5.AbstractC9688g;
import p263u5.AbstractC9695n;
import p263u5.C9693l;
import p272v4.C9763b;
import p272v4.C9765d;
import p272v4.C9766e;
import p282w4.C9821a;
import p282w4.C9824d;
import p282w4.InterfaceC9823c;
import p312z4.C9998a;

/* renamed from: m5.f */
/* loaded from: classes4.dex */
public abstract class AbstractC8970f implements InterfaceC8977m {

    /* renamed from: a */
    public final InterfaceC8976l f15039a;

    /* renamed from: b */
    public final C5120j f15040b;

    /* renamed from: c */
    public String f15041c;

    /* renamed from: d */
    public String f15042d;

    /* renamed from: e */
    public final C8887a f15043e;

    /* renamed from: f */
    public final C9998a f15044f;

    /* renamed from: g */
    public final C9763b f15045g;

    /* renamed from: h */
    public final C0038b f15046h;

    /* renamed from: i */
    public C9766e f15047i;

    /* renamed from: j */
    public final C8972h f15048j;

    /* renamed from: k */
    public final AudioCommandThread f15049k;

    /* renamed from: l */
    public ScheduledExecutorService f15050l;

    /* renamed from: m */
    public long f15051m;

    /* renamed from: n */
    public int f15052n;

    /* renamed from: o */
    public BackgroundLineConfig f15053o;

    /* renamed from: p */
    public C9821a f15054p;

    /* renamed from: q */
    public final InterfaceC9480h f15055q;

    /* renamed from: r */
    public final ExecutorService f15056r;

    public AbstractC8970f(InterfaceC8976l playControl, C5120j renderLayer) {
        Intrinsics.checkNotNullParameter(playControl, "playControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f15039a = playControl;
        this.f15040b = renderLayer;
        this.f15041c = "";
        this.f15042d = "";
        C8887a c8887a = new C8887a();
        this.f15043e = c8887a;
        C9998a c9998a = new C9998a();
        this.f15044f = c9998a;
        C9763b c9763b = new C9763b(renderLayer.m2186e().width(), renderLayer.m2186e().height());
        c9763b.m16498l0(EzyModeEnum.ModeEnum.ACTION_SEE);
        this.f15045g = c9763b;
        C0038b c0038b = new C0038b(c9998a, renderLayer, c9763b);
        this.f15046h = c0038b;
        this.f15047i = new C9766e();
        C8972h c8972h = new C8972h();
        this.f15048j = c8972h;
        AudioCommandThread audioCommandThread = new AudioCommandThread();
        this.f15049k = audioCommandThread;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(1)");
        this.f15050l = scheduledExecutorServiceNewScheduledThreadPool;
        this.f15053o = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        this.f15054p = new C9821a(c0038b, c9763b, c9998a, c8887a, null, null, 48, null);
        c8972h.m12321p(this.f15047i);
        audioCommandThread.m12321p(this.f15047i);
        this.f15055q = new a();
        this.f15056r = Executors.newSingleThreadExecutor();
    }

    /* renamed from: w */
    public static final void m14306w(AbstractC8970f this$0, Function0 callBack) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " show"));
        C9693l c9693l = C9693l.f17131a;
        String absolutePath = new File(this$0.f15041c, "snapshot.bin").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(mPageDirPath, BaseP…T_FILE_NAME).absolutePath");
        EzyPageSnapshot.PageSnapshot pageSnapshotM16192e = c9693l.m16192e(absolutePath);
        if (pageSnapshotM16192e != null) {
            C9998a c9998a = this$0.f15044f;
            EzyMatrix.Matrix matrixM8973n = pageSnapshotM16192e.m8973n();
            Intrinsics.checkNotNullExpressionValue(matrixM8973n, "this.cameraMatrix");
            c9998a.m17352j(AbstractC9695n.m16202d(matrixM8973n));
            C8887a c8887a = this$0.f15043e;
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM8975u = pageSnapshotM16192e.m8975u();
            Intrinsics.checkNotNullExpressionValue(graphSnapshotM8975u, "this.graphSnapshot");
            AbstractC8053a abstractC8053aM16188a = c9693l.m16188a(c8887a, graphSnapshotM8975u);
            if (abstractC8053aM16188a != null) {
                this$0.f15046h.mo221x(abstractC8053aM16188a);
            }
        }
        this$0.f15046h.mo200c(this$0.f15052n);
        this$0.f15046h.mo215r(this$0.f15053o);
        this$0.f15046h.m197X();
        this$0.f15046h.mo202e();
        callBack.invoke();
    }

    @Override // p179m5.InterfaceC8975k
    /* renamed from: b */
    public void mo14307b(final Function0 callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f15056r.submit(new Runnable() { // from class: m5.e
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                AbstractC8970f.m14306w(this.f15037a, callBack);
            }
        });
    }

    @Override // p179m5.InterfaceC8977m
    /* renamed from: f */
    public void mo14308f(InterfaceC9480h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15048j.m12312d().add(listener);
    }

    @Override // p179m5.InterfaceC8975k
    /* renamed from: h */
    public void mo14309h(String pageName) throws HighVersionException, IOException, LowVersionException {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        String absolutePath = new File(this.f15039a.mo7908b(), pageName).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(playControl.getRoot…), pageName).absolutePath");
        this.f15041c = absolutePath;
        this.f15042d = pageName;
        this.f15043e.m13817g(absolutePath);
        EzyHeader.Header headerM2361i = C5230b.f2464a.m2361i(this.f15041c);
        if (headerM2361i.getVersion() > 6) {
            throw new HighVersionException("version=" + headerM2361i.getVersion() + " supportLastVersion=6");
        }
        if (headerM2361i.getVersion() < 6) {
            throw new LowVersionException("version=" + headerM2361i.getVersion() + " supportLastVersion=6");
        }
        this.f15051m = headerM2361i.m8730L();
        InterfaceC9823c interfaceC9823cM16700s = this.f15054p.m16700s();
        if (interfaceC9823cM16700s instanceof C9824d) {
            ((C9824d) interfaceC9823cM16700s).m16725K(this.f15051m > 0);
        }
        Rect rectM2186e = this.f15040b.m2186e();
        this.f15044f.m17353k(AbstractC7752l.m12103b(headerM2361i.getWidth(), headerM2361i.getHeight(), rectM2186e.width(), rectM2186e.height(), this.f15051m > 0, headerM2361i.m8733O().m8811z(), headerM2361i.m8733O().m8810y()));
        this.f15048j.m14333F(headerM2361i.getVersion());
        this.f15046h.m192S(headerM2361i.m8727H());
        this.f15052n = headerM2361i.m8731M();
        C0038b c0038b = this.f15046h;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM8728I = headerM2361i.m8728I();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM8728I, "header.defaultBackgroundLineConfig");
        c0038b.m193T(AbstractC9688g.m16173c(backgroundLineConfigM8728I));
        EzyHeader.BackgroundLineConfig backgroundLineConfigM8732N = headerM2361i.m8732N();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM8732N, "header.lastBackgroundLineConfig");
        this.f15053o = AbstractC9688g.m16173c(backgroundLineConfigM8732N);
        C9765d c9765dM16519z = this.f15054p.mo16692k().m16519z();
        EzyHeader.MoveConfig moveConfigM8733O = headerM2361i.m8733O();
        Intrinsics.checkNotNullExpressionValue(moveConfigM8733O, "header.moveConfig");
        m14310k(c9765dM16519z, moveConfigM8733O);
        this.f15046h.m195V(new RectF(0.0f, 0.0f, headerM2361i.getWidth(), headerM2361i.getHeight()));
    }

    @Override // p179m5.InterfaceC8975k
    public void hide() {
        this.f15046h.m188O();
    }

    /* renamed from: k */
    public final void m14310k(C9765d c9765d, EzyHeader.MoveConfig moveConfig) {
        c9765d.m16533l(moveConfig.m8809x());
        c9765d.m16536o(moveConfig.m8803C());
        c9765d.m16530i(moveConfig.m8808w());
        c9765d.m16535n(moveConfig.m8802B());
        c9765d.m16534m(moveConfig.m8801A());
        c9765d.m16532k(moveConfig.m8811z());
        c9765d.m16531j(moveConfig.m8810y());
    }

    /* renamed from: l */
    public final C9821a m14311l() {
        return this.f15054p;
    }

    /* renamed from: m */
    public final AudioCommandThread m14312m() {
        return this.f15049k;
    }

    /* renamed from: n */
    public final C8887a m14313n() {
        return this.f15043e;
    }

    /* renamed from: o */
    public final C8972h m14314o() {
        return this.f15048j;
    }

    /* renamed from: p */
    public final C0038b m14315p() {
        return this.f15046h;
    }

    /* renamed from: q */
    public final String m14316q() {
        return this.f15041c;
    }

    /* renamed from: r */
    public final C9998a m14317r() {
        return this.f15044f;
    }

    @Override // p179m5.InterfaceC8975k
    public void release() throws IllegalStateException {
        if (!this.f15050l.isShutdown()) {
            this.f15050l.shutdown();
        }
        this.f15048j.mo7896s();
        this.f15049k.mo7896s();
        this.f15046h.m188O();
        this.f15043e.m13818h();
    }

    /* renamed from: s */
    public final C9766e m14318s() {
        return this.f15047i;
    }

    @Override // p179m5.InterfaceC8977m
    public PlayStatus status() {
        return this.f15048j.m12316h();
    }

    /* renamed from: t */
    public final long m14319t() {
        return this.f15051m;
    }

    /* renamed from: u */
    public final void m14320u() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        if (this.f15050l.isShutdown()) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "{\n            Executors.…edThreadPool(2)\n        }");
        } else {
            this.f15050l.shutdown();
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "{\n            execute.sh…edThreadPool(2)\n        }");
        }
        ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
        this.f15050l = scheduledExecutorService;
        C8972h c8972h = this.f15048j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledExecutorService.scheduleAtFixedRate(c8972h, 0L, 16L, timeUnit);
        this.f15050l.scheduleAtFixedRate(this.f15049k, 0L, 16L, timeUnit);
    }

    /* renamed from: v */
    public final void m14321v(boolean z9) {
        InterfaceC9823c interfaceC9823cM16700s = this.f15054p.m16700s();
        if (interfaceC9823cM16700s instanceof C9824d) {
            ((C9824d) interfaceC9823cM16700s).m16725K(z9);
        }
    }

    /* renamed from: m5.f$a */
    public static final class a implements InterfaceC9480h {
        public a() {
        }

        @Override // p243s5.InterfaceC9480h
        public void onPlayEnd() {
            AbstractC8970f.this.m14321v(false);
        }

        @Override // p243s5.InterfaceC9480h
        public void onPlayPause() {
            AbstractC8970f.this.m14321v(false);
        }

        @Override // p243s5.InterfaceC9480h
        public void onPlayResume() {
            AbstractC8970f.this.m14321v(true);
        }

        @Override // p243s5.InterfaceC9480h
        public void onPlayStart() {
            AbstractC8970f.this.m14321v(true);
        }

        @Override // p243s5.InterfaceC9480h
        public void onProgress(long j9) {
        }
    }
}
