package p220k7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.shuyu.gsyvideoplayer.cache.CacheFactory;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.player.BasePlayerManager;
import com.shuyu.gsyvideoplayer.player.IPlayerInitSuccessListener;
import com.shuyu.gsyvideoplayer.player.IPlayerManager;
import com.shuyu.gsyvideoplayer.player.PlayerFactory;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;
import java.io.BufferedInputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p236l7.InterfaceC10151a;
import p249m7.C10207a;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* renamed from: k7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9826b implements IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnInfoListener, ICacheManager.ICacheAvailableListener, GSYVideoViewBridge {

    /* renamed from: a */
    public Context f23073a;

    /* renamed from: b */
    public i f23074b;

    /* renamed from: c */
    public Handler f23075c;

    /* renamed from: d */
    public WeakReference f23076d;

    /* renamed from: e */
    public WeakReference f23077e;

    /* renamed from: f */
    public IPlayerInitSuccessListener f23078f;

    /* renamed from: g */
    public List f23079g;

    /* renamed from: i */
    public IPlayerManager f23081i;

    /* renamed from: j */
    public ICacheManager f23082j;

    /* renamed from: m */
    public int f23085m;

    /* renamed from: o */
    public int f23087o;

    /* renamed from: r */
    public boolean f23090r;

    /* renamed from: h */
    public String f23080h = "";

    /* renamed from: k */
    public int f23083k = 0;

    /* renamed from: l */
    public int f23084l = 0;

    /* renamed from: n */
    public int f23086n = -22;

    /* renamed from: p */
    public int f23088p = JosStatusCodes.RTN_CODE_COMMON_ERROR;

    /* renamed from: q */
    public boolean f23089q = false;

    /* renamed from: s */
    public Runnable f23091s = new h();

    /* renamed from: k7.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9826b.this.m19912c();
            if (AbstractC9826b.this.listener() != null) {
                AbstractC9826b.this.listener().onPrepared();
            }
        }
    }

    /* renamed from: k7.b$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9826b.this.m19912c();
            if (AbstractC9826b.this.listener() != null) {
                AbstractC9826b.this.listener().onAutoCompletion();
            }
        }
    }

    /* renamed from: k7.b$c */
    public class c implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f23094c;

        public c(int i10) {
            this.f23094c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC9826b.this.listener() != null) {
                int i10 = this.f23094c;
                AbstractC9826b abstractC9826b = AbstractC9826b.this;
                if (i10 > abstractC9826b.f23087o) {
                    abstractC9826b.listener().onBufferingUpdate(this.f23094c);
                } else {
                    abstractC9826b.listener().onBufferingUpdate(AbstractC9826b.this.f23087o);
                }
            }
        }
    }

    /* renamed from: k7.b$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9826b.this.m19912c();
            if (AbstractC9826b.this.listener() != null) {
                AbstractC9826b.this.listener().onSeekComplete();
            }
        }
    }

    /* renamed from: k7.b$e */
    public class e implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f23097c;

        /* renamed from: d */
        public final /* synthetic */ int f23098d;

        public e(int i10, int i11) {
            this.f23097c = i10;
            this.f23098d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9826b.this.m19912c();
            if (AbstractC9826b.this.listener() != null) {
                AbstractC9826b.this.listener().onError(this.f23097c, this.f23098d);
            }
        }
    }

    /* renamed from: k7.b$f */
    public class f implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f23100c;

        /* renamed from: d */
        public final /* synthetic */ int f23101d;

        public f(int i10, int i11) {
            this.f23100c = i10;
            this.f23101d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9826b abstractC9826b = AbstractC9826b.this;
            if (abstractC9826b.f23090r) {
                int i10 = this.f23100c;
                if (i10 == 701) {
                    abstractC9826b.m19924o();
                } else if (i10 == 702) {
                    abstractC9826b.m19912c();
                }
            }
            if (AbstractC9826b.this.listener() != null) {
                AbstractC9826b.this.listener().onInfo(this.f23100c, this.f23101d);
            }
        }
    }

    /* renamed from: k7.b$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC9826b.this.listener() != null) {
                AbstractC9826b.this.listener().onVideoSizeChanged();
            }
        }
    }

    /* renamed from: k7.b$h */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC9826b.this.listener() != null) {
                Debuger.printfError("time out for error listener");
                AbstractC9826b.this.listener().onError(-192, -192);
            }
        }
    }

    /* renamed from: k7.b$i */
    public class i extends Handler {
        public i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 0) {
                AbstractC9826b.this.m19919j(message);
                AbstractC9826b abstractC9826b = AbstractC9826b.this;
                if (abstractC9826b.f23090r) {
                    abstractC9826b.m19924o();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                AbstractC9826b.this.m19920k(message);
                return;
            }
            IPlayerManager iPlayerManager = AbstractC9826b.this.f23081i;
            if (iPlayerManager != null) {
                iPlayerManager.release();
            }
            ICacheManager iCacheManager = AbstractC9826b.this.f23082j;
            if (iCacheManager != null) {
                iCacheManager.release();
            }
            AbstractC9826b abstractC9826b2 = AbstractC9826b.this;
            abstractC9826b2.f23087o = 0;
            abstractC9826b2.m19922m(false);
            AbstractC9826b.this.m19912c();
        }
    }

    /* renamed from: c */
    public void m19912c() {
        Debuger.printfError("cancelTimeOutBuffer");
        if (this.f23090r) {
            this.f23075c.removeCallbacks(this.f23091s);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean cachePreview(Context context, File file, String str) {
        if (m19915f() != null) {
            return m19915f().cachePreview(context, file, str);
        }
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void clearCache(Context context, File file, String str) {
        m19914e(context, file, str);
    }

    /* renamed from: d */
    public void m19913d(Context context) {
        m19914e(context, null, null);
    }

    /* renamed from: e */
    public void m19914e(Context context, File file, String str) {
        ICacheManager iCacheManager = this.f23082j;
        if (iCacheManager != null) {
            iCacheManager.clearCache(context, file, str);
        } else if (m19915f() != null) {
            m19915f().clearCache(context, file, str);
        }
    }

    /* renamed from: f */
    public ICacheManager m19915f() {
        return CacheFactory.getCacheManager();
    }

    /* renamed from: g */
    public IPlayerManager m19916g() {
        return PlayerFactory.getPlayManager();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getBufferedPercentage() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getBufferedPercentage();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public long getCurrentPosition() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getCurrentVideoHeight() {
        return this.f23084l;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getCurrentVideoWidth() {
        return this.f23083k;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public long getDuration() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getDuration();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getLastState() {
        return this.f23085m;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public long getNetSpeed() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getNetSpeed();
        }
        return 0L;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getPlayPosition() {
        return this.f23086n;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public String getPlayTag() {
        return this.f23080h;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public IPlayerManager getPlayer() {
        return this.f23081i;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getRotateInfoFlag() {
        return 10001;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoHeight() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getVideoHeight();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoSarDen() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoSarNum() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getVideoSarNum();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoWidth() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: h */
    public void m19917h() {
        this.f23074b = new i(Looper.getMainLooper());
        this.f23075c = new Handler();
    }

    /* renamed from: i */
    public void m19918i(Context context) {
        this.f23073a = context.getApplicationContext();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean isCacheFile() {
        ICacheManager iCacheManager = this.f23082j;
        return iCacheManager != null && iCacheManager.hadCached();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean isPlaying() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.isPlaying();
        }
        return false;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean isSurfaceSupportLockCanvas() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            return iPlayerManager.isSurfaceSupportLockCanvas();
        }
        return false;
    }

    /* renamed from: j */
    public final void m19919j(Message message) {
        try {
            this.f23083k = 0;
            this.f23084l = 0;
            IPlayerManager iPlayerManager = this.f23081i;
            if (iPlayerManager != null) {
                iPlayerManager.release();
            }
            this.f23081i = m19916g();
            ICacheManager iCacheManagerM19915f = m19915f();
            this.f23082j = iCacheManagerM19915f;
            if (iCacheManagerM19915f != null) {
                iCacheManagerM19915f.setCacheAvailableListener(this);
            }
            IPlayerManager iPlayerManager2 = this.f23081i;
            if (iPlayerManager2 instanceof BasePlayerManager) {
                ((BasePlayerManager) iPlayerManager2).setPlayerInitSuccessListener(this.f23078f);
            }
            this.f23081i.initVideoPlayer(this.f23073a, message, this.f23079g, this.f23082j);
            m19922m(this.f23089q);
            IMediaPlayer mediaPlayer = this.f23081i.getMediaPlayer();
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setScreenOnWhilePlaying(true);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.prepareAsync();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: k */
    public final void m19920k(Message message) {
        IPlayerManager iPlayerManager;
        if (message.obj == null || (iPlayerManager = this.f23081i) == null) {
            return;
        }
        iPlayerManager.releaseSurface();
    }

    /* renamed from: l */
    public void m19921l(Message message) {
        this.f23074b.sendMessage(message);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public InterfaceC10151a lastListener() {
        WeakReference weakReference = this.f23077e;
        if (weakReference == null) {
            return null;
        }
        return (InterfaceC10151a) weakReference.get();
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public InterfaceC10151a listener() {
        WeakReference weakReference = this.f23076d;
        if (weakReference == null) {
            return null;
        }
        return (InterfaceC10151a) weakReference.get();
    }

    /* renamed from: m */
    public void m19922m(boolean z10) {
        this.f23089q = z10;
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.setNeedMute(z10);
        }
    }

    /* renamed from: n */
    public final void m19923n(Message message) {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.showDisplay(message);
        }
    }

    /* renamed from: o */
    public void m19924o() {
        Debuger.printfError("startTimeOutBuffer");
        this.f23075c.postDelayed(this.f23091s, this.f23088p);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
        this.f23075c.post(new c(i10));
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager.ICacheAvailableListener
    public void onCacheAvailable(File file, String str, int i10) {
        this.f23087o = i10;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        this.f23075c.post(new b());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
        this.f23075c.post(new e(i10, i11));
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
        this.f23075c.post(new f(i10, i11));
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.f23075c.post(new a());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        this.f23075c.post(new d());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
        this.f23083k = iMediaPlayer.getVideoWidth();
        this.f23084l = iMediaPlayer.getVideoHeight();
        this.f23075c.post(new g());
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void pause() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.pause();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(String str, Map map, boolean z10, float f10, boolean z11, File file) {
        prepare(str, map, z10, f10, z11, file, (String) null);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void releaseMediaPlayer() {
        Message message = new Message();
        message.what = 2;
        m19921l(message);
        this.f23080h = "";
        this.f23086n = -22;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void releaseSurface(Surface surface) {
        Message message = new Message();
        message.what = 3;
        message.obj = surface;
        m19921l(message);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void seekTo(long j10) {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.seekTo(j10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setCurrentVideoHeight(int i10) {
        this.f23084l = i10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setCurrentVideoWidth(int i10) {
        this.f23083k = i10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setDisplay(Surface surface) {
        Message message = new Message();
        message.what = 1;
        message.obj = surface;
        m19923n(message);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setLastListener(InterfaceC10151a interfaceC10151a) {
        if (interfaceC10151a == null) {
            this.f23077e = null;
        } else {
            this.f23077e = new WeakReference(interfaceC10151a);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setLastState(int i10) {
        this.f23085m = i10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setListener(InterfaceC10151a interfaceC10151a) {
        if (interfaceC10151a == null) {
            this.f23076d = null;
        } else {
            this.f23076d = new WeakReference(interfaceC10151a);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setPlayPosition(int i10) {
        this.f23086n = i10;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setPlayTag(String str) {
        this.f23080h = str;
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setSpeed(float f10, boolean z10) {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.setSpeed(f10, z10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setSpeedPlaying(float f10, boolean z10) {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.setSpeedPlaying(f10, z10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void start() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.start();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void stop() {
        IPlayerManager iPlayerManager = this.f23081i;
        if (iPlayerManager != null) {
            iPlayerManager.stop();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(String str, Map map, boolean z10, float f10, boolean z11, File file, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = new C10207a(str, map, z10, f10, z11, file, str2);
        m19921l(message);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(BufferedInputStream bufferedInputStream, Map map, boolean z10, float f10, boolean z11, File file) {
        prepare(bufferedInputStream, map, z10, f10, z11, file, (String) null);
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(BufferedInputStream bufferedInputStream, Map map, boolean z10, float f10, boolean z11, File file, String str) {
        if (bufferedInputStream == null) {
            return;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = new C10207a(bufferedInputStream, map, z10, f10, z11, file, (String) null);
        m19921l(message);
    }
}
