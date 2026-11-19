package com.zykj.video.play;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXBitrateItem;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXVodPlayConfig;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import com.zykj.video.play.C8161a;
import com.zykj.video.play.C8162b;
import com.zykj.video.play.controller.TCControllerFloat;
import com.zykj.video.play.controller.TCControllerFullScreen;
import com.zykj.video.play.controller.TCControllerWindow;
import com.zykj.video.play.view.TCDanmuView;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import p132i5.C8758a;
import p143j5.C9020g;
import p154k5.InterfaceC9058c;
import p166l5.C9252b;
import p177m5.C9315d;
import p177m5.C9318g;
import p177m5.InterfaceC9313b;
import p177m5.InterfaceC9314c;
import p188n5.AbstractC9422b;
import p188n5.AbstractC9425e;
import p188n5.AbstractC9427g;
import p188n5.C9423c;

/* loaded from: classes5.dex */
public class SuperPlayerView extends RelativeLayout implements ITXVodPlayListener, ITXLivePlayListener {

    /* renamed from: A */
    public int f14536A;

    /* renamed from: B */
    public long f14537B;

    /* renamed from: C */
    public long f14538C;

    /* renamed from: D */
    public long f14539D;

    /* renamed from: E */
    public boolean f14540E;

    /* renamed from: F */
    public boolean f14541F;

    /* renamed from: G */
    public boolean f14542G;

    /* renamed from: H */
    public boolean f14543H;

    /* renamed from: I */
    public boolean f14544I;

    /* renamed from: J */
    public PLAYER_TYPE f14545J;

    /* renamed from: K */
    public float f14546K;

    /* renamed from: L */
    public InterfaceC9058c f14547L;

    /* renamed from: a */
    public final int f14548a;

    /* renamed from: b */
    public Context f14549b;

    /* renamed from: c */
    public ViewGroup f14550c;

    /* renamed from: d */
    public TXCloudVideoView f14551d;

    /* renamed from: e */
    public TCControllerFullScreen f14552e;

    /* renamed from: f */
    public TCControllerWindow f14553f;

    /* renamed from: g */
    public TCControllerFloat f14554g;

    /* renamed from: h */
    public TCDanmuView f14555h;

    /* renamed from: i */
    public ViewGroup.LayoutParams f14556i;

    /* renamed from: j */
    public ViewGroup.LayoutParams f14557j;

    /* renamed from: k */
    public RelativeLayout.LayoutParams f14558k;

    /* renamed from: l */
    public RelativeLayout.LayoutParams f14559l;

    /* renamed from: m */
    public WindowManager f14560m;

    /* renamed from: n */
    public WindowManager.LayoutParams f14561n;

    /* renamed from: o */
    public C8162b f14562o;

    /* renamed from: p */
    public InterfaceC9313b f14563p;

    /* renamed from: q */
    public TXVodPlayer f14564q;

    /* renamed from: r */
    public TXVodPlayConfig f14565r;

    /* renamed from: s */
    public TXLivePlayer f14566s;

    /* renamed from: t */
    public TXLivePlayConfig f14567t;

    /* renamed from: u */
    public InterfaceC8160f f14568u;

    /* renamed from: v */
    public C9423c f14569v;

    /* renamed from: w */
    public String f14570w;

    /* renamed from: x */
    public int f14571x;

    /* renamed from: y */
    public int f14572y;

    /* renamed from: z */
    public int f14573z;

    public enum PLAYER_TYPE {
        PLAYER_TYPE_NULL,
        PLAYER_TYPE_VOD,
        PLAYER_TYPE_LIVE
    }

    /* renamed from: com.zykj.video.play.SuperPlayerView$a */
    public class RunnableC8155a implements Runnable {
        public RunnableC8155a() {
        }

        @Override // java.lang.Runnable
        public void run() throws NoSuchMethodException, SecurityException {
            if (SuperPlayerView.this.f14572y == 1) {
                SuperPlayerView superPlayerView = SuperPlayerView.this;
                superPlayerView.f14556i = superPlayerView.getLayoutParams();
            }
            try {
                Class<?> cls = SuperPlayerView.this.getLayoutParams().getClass();
                Class cls2 = Integer.TYPE;
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2, cls2);
                SuperPlayerView.this.f14557j = (ViewGroup.LayoutParams) declaredConstructor.newInstance(-1, -1);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: com.zykj.video.play.SuperPlayerView$b */
    public class C8156b implements InterfaceC9314c {

        /* renamed from: a */
        public final /* synthetic */ C8162b f14579a;

        public C8156b(C8162b c8162b) {
            this.f14579a = c8162b;
        }

        @Override // p177m5.InterfaceC9314c
        /* renamed from: a */
        public void mo12403a(int i10, String str) {
            TXCLog.m4994i("SuperPlayerView", "onFail: errorCode = " + i10 + " message = " + str);
            Toast.makeText(SuperPlayerView.this.getContext(), "播放视频文件失败 code = " + i10 + " msg = " + str, 0).show();
        }

        @Override // p177m5.InterfaceC9314c
        /* renamed from: b */
        public void mo12404b(InterfaceC9313b interfaceC9313b, C9315d c9315d) throws JSONException, InterruptedException {
            TXCLog.m4994i("SuperPlayerView", "onSuccess: protocol params = " + c9315d.toString());
            SuperPlayerView.this.f14538C = System.currentTimeMillis();
            SuperPlayerView.this.f14564q.setPlayerView(SuperPlayerView.this.f14551d);
            SuperPlayerView superPlayerView = SuperPlayerView.this;
            superPlayerView.m12386i0(superPlayerView.f14563p);
            SuperPlayerView.this.m12400w0(1);
            SuperPlayerView.this.m12401x0(!TextUtils.isEmpty(this.f14579a.f14604f) ? this.f14579a.f14604f : (SuperPlayerView.this.f14563p.getName() == null || TextUtils.isEmpty(SuperPlayerView.this.f14563p.getName())) ? "" : SuperPlayerView.this.f14563p.getName());
            SuperPlayerView.this.m12402y0(0L, 0L);
            SuperPlayerView.this.f14552e.m12451O(SuperPlayerView.this.f14563p.mo17122b());
            SuperPlayerView.this.f14552e.m12452P(SuperPlayerView.this.f14563p.mo17124d());
        }
    }

    /* renamed from: com.zykj.video.play.SuperPlayerView$c */
    public class C8157c implements InterfaceC9058c {

        /* renamed from: com.zykj.video.play.SuperPlayerView$c$a */
        public class a implements TXLivePlayer.ITXSnapshotListener {
            public a() {
            }

            @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
            public void onSnapshot(Bitmap bitmap) {
                SuperPlayerView.this.m12396s0(bitmap);
            }
        }

        /* renamed from: com.zykj.video.play.SuperPlayerView$c$b */
        public class b implements TXLivePlayer.ITXSnapshotListener {
            public b() {
            }

            @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
            public void onSnapshot(Bitmap bitmap) {
                SuperPlayerView.this.m12396s0(bitmap);
            }
        }

        public C8157c() {
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: a */
        public void mo12405a(float f10) throws JSONException {
            if (SuperPlayerView.this.f14564q != null) {
                SuperPlayerView.this.f14546K = f10;
                SuperPlayerView.this.f14564q.setRate(f10);
            }
            C9252b.m16956a().m16959d("change_speed", 0L, 0);
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: b */
        public void mo12406b(int i10) throws JSONException {
            if (i10 == 1) {
                if (SuperPlayerView.this.f14568u != null) {
                    SuperPlayerView.this.f14568u.mo10503d();
                }
                if (SuperPlayerView.this.f14573z == 1) {
                    mo12414j(3);
                    return;
                }
                return;
            }
            if (i10 == 2) {
                mo12414j(1);
            } else {
                if (i10 != 3) {
                    return;
                }
                SuperPlayerView.this.f14560m.removeView(SuperPlayerView.this.f14554g);
                if (SuperPlayerView.this.f14568u != null) {
                    SuperPlayerView.this.f14568u.mo10501b();
                }
            }
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: c */
        public void mo12407c(boolean z10) throws JSONException {
            if (SuperPlayerView.this.f14564q != null) {
                SuperPlayerView.this.f14564q.setMirror(z10);
            }
            if (z10) {
                C9252b.m16956a().m16959d("mirror", 0L, 0);
            }
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: d */
        public void mo12408d() {
            if (SuperPlayerView.this.f14571x == 1) {
                if (SuperPlayerView.this.f14564q != null) {
                    SuperPlayerView.this.f14564q.snapshot(new a());
                }
            } else if (SuperPlayerView.this.f14571x == 3) {
                Toast.makeText(SuperPlayerView.this.getContext(), "时移直播时暂不支持截图", 0).show();
            } else if (SuperPlayerView.this.f14566s != null) {
                SuperPlayerView.this.f14566s.snapshot(new b());
            }
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: e */
        public void mo12409e() {
            if (SuperPlayerView.this.f14566s != null) {
                SuperPlayerView.this.f14566s.resumeLive();
            }
            SuperPlayerView.this.m12400w0(2);
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: f */
        public void mo12410f(int i10, int i11) {
            SuperPlayerView.this.f14561n.x = i10;
            SuperPlayerView.this.f14561n.y = i11;
            SuperPlayerView.this.f14560m.updateViewLayout(SuperPlayerView.this.f14554g, SuperPlayerView.this.f14561n);
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: g */
        public void mo12411g(C9020g c9020g) throws JSONException, ClassNotFoundException {
            SuperPlayerView.this.f14552e.m12457U(c9020g);
            if (SuperPlayerView.this.f14571x == 1) {
                if (SuperPlayerView.this.f14564q != null) {
                    if (c9020g.f17246e != null) {
                        float currentPlaybackTime = SuperPlayerView.this.f14564q.getCurrentPlaybackTime();
                        SuperPlayerView.this.f14564q.stopPlay(true);
                        TXCLog.m4994i("SuperPlayerView", "onQualitySelect quality.url:" + c9020g.f17246e);
                        SuperPlayerView.this.f14564q.setStartTime(currentPlaybackTime);
                        SuperPlayerView.this.f14564q.startPlay(c9020g.f17246e);
                    } else {
                        TXCLog.m4994i("SuperPlayerView", "setBitrateIndex quality.index:" + c9020g.f17242a);
                        SuperPlayerView.this.f14564q.setBitrateIndex(c9020g.f17242a);
                    }
                }
            } else if (SuperPlayerView.this.f14566s != null && !TextUtils.isEmpty(c9020g.f17246e)) {
                if (SuperPlayerView.this.f14566s.switchStream(c9020g.f17246e) < 0) {
                    Toast.makeText(SuperPlayerView.this.getContext(), "切换" + c9020g.f17245d + "清晰度失败，请稍候重试", 0).show();
                } else {
                    Toast.makeText(SuperPlayerView.this.getContext(), "正在切换到" + c9020g.f17245d + "...", 0).show();
                }
            }
            C9252b.m16956a().m16959d("change_resolution", 0L, 0);
        }

        @Override // p154k5.InterfaceC9058c
        public float getSpeed() {
            return SuperPlayerView.this.f14546K;
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: h */
        public void mo12412h(boolean z10) {
            if (SuperPlayerView.this.f14555h != null) {
                SuperPlayerView.this.f14555h.m12506J(z10);
            }
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: i */
        public void mo12413i(boolean z10) throws JSONException, InterruptedException {
            if (SuperPlayerView.this.f14571x == 1) {
                SuperPlayerView.this.f14543H = true;
                if (SuperPlayerView.this.f14564q != null) {
                    SuperPlayerView.this.f14564q.enableHardwareDecode(z10);
                    SuperPlayerView superPlayerView = SuperPlayerView.this;
                    superPlayerView.f14536A = (int) superPlayerView.f14564q.getCurrentPlaybackTime();
                    TXCLog.m4994i("SuperPlayerView", "save pos:" + SuperPlayerView.this.f14536A);
                    SuperPlayerView.this.m12398u0();
                    if (SuperPlayerView.this.f14563p == null) {
                        SuperPlayerView superPlayerView2 = SuperPlayerView.this;
                        superPlayerView2.m12385h0(superPlayerView2.f14562o);
                    } else {
                        SuperPlayerView superPlayerView3 = SuperPlayerView.this;
                        superPlayerView3.m12386i0(superPlayerView3.f14563p);
                    }
                }
            } else if (SuperPlayerView.this.f14566s != null) {
                SuperPlayerView.this.f14566s.enableHardwareDecode(z10);
                SuperPlayerView superPlayerView4 = SuperPlayerView.this;
                superPlayerView4.m12389l0(superPlayerView4.f14562o);
            }
            if (z10) {
                C9252b.m16956a().m16959d("hw_decode", 0L, 0);
            } else {
                C9252b.m16956a().m16959d("soft_decode", 0L, 0);
            }
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: j */
        public void mo12414j(int i10) throws JSONException {
            if (SuperPlayerView.this.f14572y == i10 || SuperPlayerView.this.f14544I) {
                return;
            }
            if (i10 == 2) {
                SuperPlayerView.this.m12377Z(true);
            } else {
                SuperPlayerView.this.m12377Z(false);
            }
            SuperPlayerView.this.f14552e.hide();
            SuperPlayerView.this.f14553f.hide();
            SuperPlayerView.this.f14554g.hide();
            if (i10 == 2) {
                if (SuperPlayerView.this.f14557j == null) {
                    return;
                }
                SuperPlayerView superPlayerView = SuperPlayerView.this;
                superPlayerView.removeView(superPlayerView.f14553f);
                SuperPlayerView superPlayerView2 = SuperPlayerView.this;
                superPlayerView2.addView(superPlayerView2.f14552e, SuperPlayerView.this.f14559l);
                SuperPlayerView superPlayerView3 = SuperPlayerView.this;
                superPlayerView3.setLayoutParams(superPlayerView3.f14557j);
                SuperPlayerView.this.m12395r0(1);
                if (SuperPlayerView.this.f14568u != null) {
                    SuperPlayerView.this.f14568u.mo10504e();
                }
            } else if (i10 == 1) {
                if (SuperPlayerView.this.f14572y == 3) {
                    try {
                        Context context = SuperPlayerView.this.getContext();
                        if (!(context instanceof Activity)) {
                            Toast.makeText(context, "悬浮播放失败", 0).show();
                            return;
                        }
                        SuperPlayerView.this.f14549b.startActivity(new Intent(SuperPlayerView.this.getContext(), context.getClass()));
                        SuperPlayerView.this.m12383f0();
                        if (SuperPlayerView.this.f14556i == null) {
                            return;
                        }
                        SuperPlayerView.this.f14560m.removeView(SuperPlayerView.this.f14554g);
                        if (SuperPlayerView.this.f14571x == 1) {
                            SuperPlayerView.this.f14564q.setPlayerView(SuperPlayerView.this.f14551d);
                        } else {
                            SuperPlayerView.this.f14566s.setPlayerView(SuperPlayerView.this.f14551d);
                        }
                        SuperPlayerView.this.m12394q0();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (SuperPlayerView.this.f14572y == 2) {
                    if (SuperPlayerView.this.f14556i == null) {
                        return;
                    }
                    SuperPlayerView superPlayerView4 = SuperPlayerView.this;
                    superPlayerView4.removeView(superPlayerView4.f14552e);
                    SuperPlayerView superPlayerView5 = SuperPlayerView.this;
                    superPlayerView5.addView(superPlayerView5.f14553f, SuperPlayerView.this.f14558k);
                    SuperPlayerView superPlayerView6 = SuperPlayerView.this;
                    superPlayerView6.setLayoutParams(superPlayerView6.f14556i);
                    SuperPlayerView.this.m12395r0(2);
                    if (SuperPlayerView.this.f14568u != null) {
                        SuperPlayerView.this.f14568u.mo10500a();
                    }
                }
            } else if (i10 == 3) {
                TXCLog.m4994i("SuperPlayerView", "requestPlayMode Float :" + Build.MANUFACTURER);
                C8161a c8161aM12416a = C8161a.m12416a();
                if (!c8161aM12416a.f14589a) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (!Settings.canDrawOverlays(SuperPlayerView.this.f14549b)) {
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    intent.setData(Uri.parse("package:" + SuperPlayerView.this.f14549b.getPackageName()));
                    SuperPlayerView.this.f14549b.startActivity(intent);
                    return;
                }
                SuperPlayerView.this.m12383f0();
                SuperPlayerView superPlayerView7 = SuperPlayerView.this;
                superPlayerView7.f14560m = (WindowManager) superPlayerView7.f14549b.getApplicationContext().getSystemService("window");
                SuperPlayerView.this.f14561n = new WindowManager.LayoutParams();
                if (i11 >= 26) {
                    SuperPlayerView.this.f14561n.type = 2038;
                } else {
                    SuperPlayerView.this.f14561n.type = 2002;
                }
                SuperPlayerView.this.f14561n.flags = 40;
                SuperPlayerView.this.f14561n.format = -3;
                SuperPlayerView.this.f14561n.gravity = 51;
                C8161a.a aVar = c8161aM12416a.f14590b;
                SuperPlayerView.this.f14561n.x = aVar.f14595a;
                SuperPlayerView.this.f14561n.y = aVar.f14596b;
                SuperPlayerView.this.f14561n.width = aVar.f14597c;
                SuperPlayerView.this.f14561n.height = aVar.f14598d;
                try {
                    SuperPlayerView.this.f14560m.addView(SuperPlayerView.this.f14554g, SuperPlayerView.this.f14561n);
                    TXCloudVideoView floatVideoView = SuperPlayerView.this.f14554g.getFloatVideoView();
                    if (floatVideoView != null) {
                        if (SuperPlayerView.this.f14571x == 1) {
                            SuperPlayerView.this.f14564q.setPlayerView(floatVideoView);
                        } else {
                            SuperPlayerView.this.f14566s.setPlayerView(floatVideoView);
                        }
                        SuperPlayerView.this.m12394q0();
                    }
                    C9252b.m16956a().m16959d("floatmode", 0L, 0);
                } catch (Exception unused) {
                    Toast.makeText(SuperPlayerView.this.getContext(), "悬浮播放失败", 0).show();
                    return;
                }
            }
            SuperPlayerView.this.f14572y = i10;
        }

        @Override // p154k5.InterfaceC9058c
        /* renamed from: k */
        public void mo12415k(int i10) throws JSONException {
            if (SuperPlayerView.this.f14571x == 1) {
                if (SuperPlayerView.this.f14564q != null) {
                    SuperPlayerView.this.f14564q.seek(i10);
                    return;
                }
                return;
            }
            SuperPlayerView.this.m12400w0(3);
            C9252b.m16956a().m16959d("timeshift", 0L, 0);
            if (SuperPlayerView.this.f14566s != null) {
                SuperPlayerView.this.f14566s.seek(i10);
            }
            if (SuperPlayerView.this.f14569v != null) {
                SuperPlayerView.this.f14569v.m17267l();
            }
        }

        @Override // p154k5.InterfaceC9058c
        public void onPause() {
            if (SuperPlayerView.this.f14571x != 1) {
                if (SuperPlayerView.this.f14566s != null) {
                    SuperPlayerView.this.f14566s.pause();
                }
                if (SuperPlayerView.this.f14569v != null) {
                    SuperPlayerView.this.f14569v.m17267l();
                }
            } else if (SuperPlayerView.this.f14564q != null) {
                SuperPlayerView.this.f14564q.pause();
            }
            SuperPlayerView.this.m12399v0(2);
        }

        @Override // p154k5.InterfaceC9058c
        public void onResume() throws InterruptedException {
            if (SuperPlayerView.this.f14573z == 4) {
                if (SuperPlayerView.this.f14545J != PLAYER_TYPE.PLAYER_TYPE_LIVE) {
                    SuperPlayerView superPlayerView = SuperPlayerView.this;
                    superPlayerView.m12388k0(superPlayerView.f14570w);
                } else if (AbstractC9425e.m17271b(SuperPlayerView.this.f14570w)) {
                    SuperPlayerView superPlayerView2 = SuperPlayerView.this;
                    superPlayerView2.m12384g0(superPlayerView2.f14570w, 0);
                } else if (AbstractC9425e.m17270a(SuperPlayerView.this.f14570w)) {
                    SuperPlayerView superPlayerView3 = SuperPlayerView.this;
                    superPlayerView3.m12387j0(superPlayerView3.f14562o);
                    if (SuperPlayerView.this.f14562o.f14601c != null && !SuperPlayerView.this.f14562o.f14601c.isEmpty()) {
                        SuperPlayerView superPlayerView4 = SuperPlayerView.this;
                        superPlayerView4.m12397t0(superPlayerView4.f14570w);
                    }
                }
            } else if (SuperPlayerView.this.f14573z == 2) {
                if (SuperPlayerView.this.f14571x == 1) {
                    if (SuperPlayerView.this.f14564q != null) {
                        SuperPlayerView.this.f14564q.resume();
                    }
                } else if (SuperPlayerView.this.f14566s != null) {
                    SuperPlayerView.this.f14566s.resume();
                }
            }
            SuperPlayerView.this.m12399v0(1);
        }
    }

    /* renamed from: com.zykj.video.play.SuperPlayerView$d */
    public class RunnableC8158d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f14584a;

        public RunnableC8158d(Bitmap bitmap) {
            this.f14584a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            AbstractC9422b.m17255a(SuperPlayerView.this.f14549b, this.f14584a);
        }
    }

    /* renamed from: com.zykj.video.play.SuperPlayerView$e */
    public class RunnableC8159e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PopupWindow f14586a;

        public RunnableC8159e(PopupWindow popupWindow) {
            this.f14586a = popupWindow;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14586a.dismiss();
        }
    }

    /* renamed from: com.zykj.video.play.SuperPlayerView$f */
    public interface InterfaceC8160f {
        /* renamed from: a */
        void mo10500a();

        /* renamed from: b */
        void mo10501b();

        /* renamed from: c */
        void mo10502c();

        /* renamed from: d */
        void mo10503d();

        /* renamed from: e */
        void mo10504e();
    }

    public SuperPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14548a = 24;
        this.f14572y = 2;
        this.f14573z = 1;
        this.f14537B = -1L;
        this.f14538C = -1L;
        this.f14544I = false;
        this.f14545J = PLAYER_TYPE.PLAYER_TYPE_NULL;
        this.f14546K = 1.0f;
        this.f14547L = new C8157c();
        m12379b0(context);
    }

    /* renamed from: Z */
    public final void m12377Z(boolean z10) {
        if (getContext() instanceof Activity) {
            Activity activity = (Activity) getContext();
            if (z10) {
                View decorView = activity.getWindow().getDecorView();
                if (decorView == null) {
                    return;
                }
                decorView.setSystemUiVisibility(4102);
                return;
            }
            View decorView2 = activity.getWindow().getDecorView();
            if (decorView2 == null) {
                return;
            }
            decorView2.setSystemUiVisibility(0);
        }
    }

    /* renamed from: a0 */
    public final void m12378a0(Context context) {
        if (this.f14566s != null) {
            return;
        }
        this.f14566s = new TXLivePlayer(context);
        C8161a c8161aM12416a = C8161a.m12416a();
        TXLivePlayConfig tXLivePlayConfig = new TXLivePlayConfig();
        this.f14567t = tXLivePlayConfig;
        this.f14566s.setConfig(tXLivePlayConfig);
        this.f14566s.setRenderMode(c8161aM12416a.f14592d);
        this.f14566s.setRenderRotation(0);
        this.f14566s.setPlayListener(this);
        this.f14566s.enableHardwareDecode(c8161aM12416a.f14591c);
    }

    /* renamed from: b0 */
    public final void m12379b0(Context context) {
        this.f14549b = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R$layout.superplayer_vod_view, (ViewGroup) null);
        this.f14550c = viewGroup;
        this.f14551d = (TXCloudVideoView) viewGroup.findViewById(R$id.superplayer_cloud_video_view);
        this.f14552e = (TCControllerFullScreen) this.f14550c.findViewById(R$id.superplayer_controller_large);
        this.f14553f = (TCControllerWindow) this.f14550c.findViewById(R$id.superplayer_controller_small);
        this.f14554g = (TCControllerFloat) this.f14550c.findViewById(R$id.superplayer_controller_float);
        this.f14555h = (TCDanmuView) this.f14550c.findViewById(R$id.superplayer_danmuku_view);
        this.f14558k = new RelativeLayout.LayoutParams(-1, -1);
        this.f14559l = new RelativeLayout.LayoutParams(-1, -1);
        this.f14552e.setCallback(this.f14547L);
        this.f14553f.setCallback(this.f14547L);
        this.f14554g.setCallback(this.f14547L);
        removeAllViews();
        this.f14550c.removeView(this.f14555h);
        this.f14550c.removeView(this.f14551d);
        this.f14550c.removeView(this.f14553f);
        this.f14550c.removeView(this.f14552e);
        this.f14550c.removeView(this.f14554g);
        addView(this.f14551d);
        int i10 = this.f14572y;
        if (i10 == 2) {
            addView(this.f14552e);
            this.f14552e.hide();
        } else if (i10 == 1) {
            addView(this.f14553f);
            this.f14553f.hide();
        }
        addView(this.f14555h);
        post(new RunnableC8155a());
        C9252b.m16956a().m16957b(context);
        C9252b.m16956a().m16958c(context);
    }

    /* renamed from: c0 */
    public final void m12380c0(Context context) {
        if (this.f14564q != null) {
            return;
        }
        this.f14564q = new TXVodPlayer(context);
        C8161a c8161aM12416a = C8161a.m12416a();
        this.f14565r = new TXVodPlayConfig();
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            this.f14565r.setCacheFolderPath(externalFilesDir.getPath() + "/txcache");
        }
        this.f14565r.setMaxCacheItems(c8161aM12416a.f14593e);
        this.f14564q.setConfig(this.f14565r);
        this.f14564q.setRenderMode(c8161aM12416a.f14592d);
        this.f14564q.setVodListener(this);
        this.f14564q.enableHardwareDecode(c8161aM12416a.f14591c);
    }

    /* renamed from: d0 */
    public void m12381d0() {
        TCDanmuView tCDanmuView = this.f14555h;
        if (tCDanmuView != null && tCDanmuView.m14136n()) {
            this.f14555h.m14139q();
        }
        m12383f0();
    }

    /* renamed from: e0 */
    public void m12382e0() throws InterruptedException {
        TCDanmuView tCDanmuView = this.f14555h;
        if (tCDanmuView != null && tCDanmuView.m14136n() && this.f14555h.m14135m()) {
            this.f14555h.m14144w();
        }
        m12394q0();
    }

    /* renamed from: f0 */
    public final void m12383f0() {
        TXVodPlayer tXVodPlayer;
        if (this.f14571x != 1 || (tXVodPlayer = this.f14564q) == null) {
            return;
        }
        tXVodPlayer.pause();
    }

    public void finalize() throws Throwable {
        super.finalize();
        try {
            m12390m0();
        } catch (Throwable th) {
            TXCLog.m4991e("SuperPlayerView", Log.getStackTraceString(th));
        }
    }

    /* renamed from: g0 */
    public final void m12384g0(String str, int i10) {
        this.f14570w = str;
        TXLivePlayer tXLivePlayer = this.f14566s;
        if (tXLivePlayer != null) {
            tXLivePlayer.setPlayListener(this);
            int iStartPlay = this.f14566s.startPlay(str, i10);
            if (iStartPlay != 0) {
                TXCLog.m4991e("SuperPlayerView", "playLiveURL videoURL:" + str + ",result:" + iStartPlay);
                return;
            }
            this.f14573z = 1;
            this.f14545J = PLAYER_TYPE.PLAYER_TYPE_LIVE;
            TXCLog.m4991e("SuperPlayerView", "playLiveURL mCurrentPlayState:" + this.f14573z);
        }
    }

    public int getPlayMode() {
        return this.f14572y;
    }

    public int getPlayState() {
        return this.f14573z;
    }

    /* renamed from: h0 */
    public final void m12385h0(C8162b c8162b) throws InterruptedException {
        List list = c8162b.f14601c;
        if (list == null || list.isEmpty()) {
            if (TextUtils.isEmpty(c8162b.f14600b)) {
                return;
            }
            m12388k0(c8162b.f14600b);
        } else {
            for (int i10 = 0; i10 < c8162b.f14601c.size(); i10++) {
                if (i10 == c8162b.f14602d) {
                    m12388k0(((C8162b.a) c8162b.f14601c.get(i10)).f14606b);
                }
            }
        }
    }

    /* renamed from: i0 */
    public final void m12386i0(InterfaceC9313b interfaceC9313b) throws InterruptedException {
        m12388k0(interfaceC9313b.getUrl());
        List<C9020g> listMo17126f = interfaceC9313b.mo17126f();
        if (listMo17126f != null) {
            this.f14552e.setVideoQualityList(listMo17126f);
            this.f14540E = false;
        } else {
            this.f14540E = true;
        }
        C9020g c9020gMo17123c = interfaceC9313b.mo17123c();
        if (c9020gMo17123c != null) {
            this.f14552e.m12457U(c9020gMo17123c);
        }
    }

    /* renamed from: j0 */
    public final void m12387j0(C8162b c8162b) {
        int iIntValue;
        String str = c8162b.f14600b;
        String strSubstring = str.substring(str.indexOf("//") + 2, str.indexOf("."));
        String str2 = C8161a.m12416a().f14594f;
        TXCLog.m4994i("SuperPlayerView", "bizid:" + strSubstring + ",streamid:" + str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf(".")) + ",appid:" + c8162b.f14599a);
        m12384g0(str, 1);
        try {
            iIntValue = Integer.valueOf(strSubstring).intValue();
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            TXCLog.m4991e("SuperPlayerView", "playTimeShiftLiveURL: bizidNum 错误 = " + strSubstring);
            iIntValue = -1;
        }
        this.f14566s.prepareLiveSeek(str2, iIntValue);
    }

    /* renamed from: k0 */
    public final void m12388k0(String str) throws InterruptedException {
        if (str == null || "".equals(str)) {
            return;
        }
        this.f14570w = str;
        if (str.contains(".m3u8")) {
            this.f14540E = true;
        }
        TXVodPlayer tXVodPlayer = this.f14564q;
        if (tXVodPlayer != null) {
            this.f14542G = false;
            tXVodPlayer.setStartTime(0.0f);
            this.f14564q.setAutoPlay(true);
            this.f14564q.setVodListener(this);
            InterfaceC9313b interfaceC9313b = this.f14563p;
            if (interfaceC9313b == null || interfaceC9313b.mo17121a() == null) {
                this.f14564q.setToken(null);
            } else {
                TXCLog.m4989d("SuperPlayerView", "TOKEN: " + this.f14563p.mo17121a());
                this.f14564q.setToken(this.f14563p.mo17121a());
            }
            if (this.f14564q.startPlay(str) == 0) {
                this.f14573z = 1;
                this.f14545J = PLAYER_TYPE.PLAYER_TYPE_VOD;
                TCDanmuView tCDanmuView = this.f14555h;
                if (tCDanmuView != null && tCDanmuView.m14136n() && this.f14555h.m14135m()) {
                    this.f14555h.m14144w();
                }
                TXCLog.m4991e("SuperPlayerView", "playVodURL mCurrentPlayState:" + this.f14573z);
            }
        }
        this.f14541F = false;
    }

    /* renamed from: l0 */
    public void m12389l0(C8162b c8162b) throws JSONException, InterruptedException {
        C9020g c9020g;
        this.f14562o = c8162b;
        m12398u0();
        m12378a0(getContext());
        m12380c0(getContext());
        String str = null;
        this.f14552e.m12451O(null);
        this.f14552e.m12452P(null);
        C9315d c9315d = new C9315d();
        c9315d.f18342a = c8162b.f14599a;
        C8758a c8758a = c8162b.f14603e;
        if (c8758a != null) {
            c9315d.f18343b = c8758a.f16420a;
            c9315d.f18344c = c8758a;
            this.f14563p = new C9318g(c9315d);
        } else {
            this.f14563p = null;
        }
        if (c8162b.f14603e != null) {
            this.f14563p.mo17127g(new C8156b(c8162b));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list = c8162b.f14601c;
        if (list != null && !list.isEmpty()) {
            int i10 = 0;
            for (C8162b.a aVar : c8162b.f14601c) {
                if (i10 == c8162b.f14602d) {
                    str = aVar.f14606b;
                }
                arrayList.add(new C9020g(i10, aVar.f14605a, aVar.f14606b));
                i10++;
            }
            c9020g = (C9020g) arrayList.get(c8162b.f14602d);
        } else if (TextUtils.isEmpty(c8162b.f14600b)) {
            c9020g = null;
        } else {
            c9020g = null;
            str = c8162b.f14600b;
        }
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(getContext(), "播放视频失败，播放连接为空", 0).show();
            return;
        }
        if (AbstractC9425e.m17271b(str)) {
            this.f14537B = System.currentTimeMillis();
            this.f14566s.setPlayerView(this.f14551d);
            m12384g0(str, 0);
        } else if (AbstractC9425e.m17270a(str)) {
            this.f14537B = System.currentTimeMillis();
            this.f14566s.setPlayerView(this.f14551d);
            m12387j0(c8162b);
            List list2 = c8162b.f14601c;
            if (list2 != null && !list2.isEmpty()) {
                m12397t0(str);
            }
        } else {
            this.f14538C = System.currentTimeMillis();
            this.f14564q.setPlayerView(this.f14551d);
            m12388k0(str);
        }
        m12400w0((AbstractC9425e.m17271b(str) || AbstractC9425e.m17270a(str)) ? 2 : 1);
        m12401x0(c8162b.f14604f);
        m12402y0(0L, 0L);
        this.f14552e.setVideoQualityList(arrayList);
        this.f14552e.m12457U(c9020g);
    }

    /* renamed from: m0 */
    public void m12390m0() {
        TCControllerWindow tCControllerWindow = this.f14553f;
        if (tCControllerWindow != null) {
            tCControllerWindow.m12495v();
        }
        TCControllerFullScreen tCControllerFullScreen = this.f14552e;
        if (tCControllerFullScreen != null) {
            tCControllerFullScreen.m12439C();
        }
        TCControllerFloat tCControllerFloat = this.f14554g;
        if (tCControllerFloat != null) {
            tCControllerFloat.m12418b();
        }
    }

    /* renamed from: n0 */
    public final void m12391n0() throws JSONException {
        if (this.f14537B != -1) {
            C9252b.m16956a().m16959d("superlive", (System.currentTimeMillis() - this.f14537B) / 1000, 0);
            this.f14537B = -1L;
        }
        if (this.f14538C != -1) {
            C9252b.m16956a().m16959d("supervod", (System.currentTimeMillis() - this.f14538C) / 1000, this.f14541F ? 1 : 0);
            this.f14538C = -1L;
        }
    }

    /* renamed from: o0 */
    public void m12392o0(int i10) {
        if (i10 == 1) {
            InterfaceC9058c interfaceC9058c = this.f14547L;
            if (interfaceC9058c != null) {
                interfaceC9058c.mo12414j(1);
                return;
            }
            return;
        }
        if (i10 == 3) {
            InterfaceC8160f interfaceC8160f = this.f14568u;
            if (interfaceC8160f != null) {
                interfaceC8160f.mo10502c();
            }
            InterfaceC9058c interfaceC9058c2 = this.f14547L;
            if (interfaceC9058c2 != null) {
                interfaceC9058c2.mo12414j(3);
            }
        }
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXVodPlayListener
    public void onPlayEvent(TXVodPlayer tXVodPlayer, int i10, Bundle bundle) {
        if (i10 != 2005) {
            TXCLog.m4989d("SuperPlayerView", "TXVodPlayer onPlayEvent event: " + i10 + ", " + bundle.getString(TXLiveConstants.EVT_DESCRIPTION));
        }
        if (i10 != 2013) {
            switch (i10) {
                case 2003:
                    if (this.f14543H) {
                        TXCLog.m4994i("SuperPlayerView", "seek pos:" + this.f14536A);
                        this.f14547L.mo12415k(this.f14536A);
                        this.f14543H = false;
                        break;
                    }
                    break;
                case 2004:
                    m12399v0(1);
                    break;
                case 2005:
                    m12402y0(bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS) / 1000, bundle.getInt(TXLiveConstants.EVT_PLAY_DURATION_MS) / 1000);
                    break;
                case 2006:
                    m12399v0(4);
                    break;
            }
        } else {
            this.f14553f.m12494s();
            m12399v0(1);
            if (this.f14540E) {
                ArrayList<TXBitrateItem> supportedBitrates = this.f14564q.getSupportedBitrates();
                if (supportedBitrates == null || supportedBitrates.size() == 0) {
                    return;
                }
                Collections.sort(supportedBitrates);
                ArrayList arrayList = new ArrayList();
                int size = supportedBitrates.size();
                InterfaceC9313b interfaceC9313b = this.f14563p;
                List listMo17125e = interfaceC9313b != null ? interfaceC9313b.mo17125e() : null;
                for (int i11 = 0; i11 < size; i11++) {
                    TXBitrateItem tXBitrateItem = supportedBitrates.get(i11);
                    arrayList.add(listMo17125e != null ? AbstractC9427g.m17279b(tXBitrateItem, this.f14563p.mo17125e()) : AbstractC9427g.m17278a(tXBitrateItem, i11));
                }
                if (!this.f14542G) {
                    this.f14564q.setBitrateIndex(supportedBitrates.get(supportedBitrates.size() - 1).index);
                    this.f14552e.m12457U((C9020g) arrayList.get(arrayList.size() - 1));
                    this.f14542G = true;
                }
                this.f14552e.setVideoQualityList(arrayList);
            }
        }
        if (i10 < 0) {
            this.f14564q.stopPlay(true);
            m12399v0(2);
            Toast.makeText(this.f14549b, bundle.getString(TXLiveConstants.EVT_DESCRIPTION), 0).show();
        }
    }

    /* renamed from: p0 */
    public void m12393p0() throws JSONException {
        TCDanmuView tCDanmuView = this.f14555h;
        if (tCDanmuView != null) {
            tCDanmuView.mo12507u();
            this.f14555h = null;
        }
        m12398u0();
    }

    /* renamed from: q0 */
    public final void m12394q0() {
        TXVodPlayer tXVodPlayer;
        if (this.f14571x != 1 || (tXVodPlayer = this.f14564q) == null) {
            return;
        }
        tXVodPlayer.resume();
    }

    /* renamed from: r0 */
    public final void m12395r0(int i10) {
        if (i10 == 1) {
            ((Activity) this.f14549b).setRequestedOrientation(0);
        } else {
            if (i10 != 2) {
                return;
            }
            ((Activity) this.f14549b).setRequestedOrientation(1);
        }
    }

    /* renamed from: s0 */
    public final void m12396s0(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        PopupWindow popupWindow = new PopupWindow(this.f14549b);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        View viewInflate = LayoutInflater.from(this.f14549b).inflate(R$layout.superplayer_layout_new_vod_snap, (ViewGroup) null);
        ((ImageView) viewInflate.findViewById(R$id.superplayer_iv_snap)).setImageBitmap(bitmap);
        popupWindow.setContentView(viewInflate);
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(this.f14550c, 48, 1800, 300);
        AsyncTask.execute(new RunnableC8158d(bitmap));
        postDelayed(new RunnableC8159e(popupWindow), 3000L);
    }

    public void setPlayerViewCallback(InterfaceC8160f interfaceC8160f) {
        this.f14568u = interfaceC8160f;
    }

    /* renamed from: t0 */
    public final void m12397t0(String str) {
        this.f14567t.setAutoAdjustCacheTime(false);
        this.f14567t.setMaxAutoAdjustCacheTime(5.0f);
        this.f14567t.setMinAutoAdjustCacheTime(5.0f);
        this.f14566s.setConfig(this.f14567t);
        if (this.f14569v == null) {
            this.f14569v = new C9423c(this.f14549b);
        }
        this.f14569v.m17266k(str, this.f14566s);
    }

    /* renamed from: u0 */
    public final void m12398u0() throws JSONException {
        TXVodPlayer tXVodPlayer = this.f14564q;
        if (tXVodPlayer != null) {
            tXVodPlayer.setVodListener(null);
            this.f14564q.stopPlay(false);
        }
        TXLivePlayer tXLivePlayer = this.f14566s;
        if (tXLivePlayer != null) {
            tXLivePlayer.setPlayListener(null);
            this.f14566s.stopPlay(false);
            this.f14551d.removeVideoView();
        }
        C9423c c9423c = this.f14569v;
        if (c9423c != null) {
            c9423c.m17267l();
        }
        this.f14573z = 2;
        TXCLog.m4991e("SuperPlayerView", "stopPlay mCurrentPlayState:" + this.f14573z);
        m12391n0();
    }

    /* renamed from: v0 */
    public final void m12399v0(int i10) {
        this.f14573z = i10;
        this.f14553f.m12490B(i10);
        this.f14552e.m12453Q(i10);
    }

    /* renamed from: w0 */
    public final void m12400w0(int i10) {
        this.f14571x = i10;
        this.f14553f.m12491C(i10);
        this.f14552e.m12454R(i10);
    }

    /* renamed from: x0 */
    public final void m12401x0(String str) {
        this.f14553f.m12492D(str);
        this.f14552e.m12455S(str);
    }

    /* renamed from: y0 */
    public final void m12402y0(long j10, long j11) {
        this.f14553f.m12493E(j10, j11);
        this.f14552e.m12456T(j10, j11);
    }

    @Override // com.tencent.rtmp.ITXVodPlayListener
    public void onNetStatus(TXVodPlayer tXVodPlayer, Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i10, Bundle bundle) throws JSONException {
        if (i10 != 2005) {
            TXCLog.m4989d("SuperPlayerView", "TXLivePlayer onPlayEvent event: " + i10 + ", " + bundle.getString(TXLiveConstants.EVT_DESCRIPTION));
        }
        if (i10 != -2307) {
            if (i10 != -2301) {
                if (i10 == 2013) {
                    m12399v0(1);
                    return;
                }
                if (i10 != 2015) {
                    switch (i10) {
                        case 2004:
                            m12399v0(1);
                            C9423c c9423c = this.f14569v;
                            if (c9423c != null) {
                                c9423c.m17264i();
                                break;
                            }
                            break;
                        case 2005:
                            long j10 = bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS);
                            long j11 = this.f14539D;
                            if (j10 <= j11) {
                                j10 = j11;
                            }
                            this.f14539D = j10;
                            m12402y0(r7 / 1000, j10 / 1000);
                            break;
                        case 2007:
                            m12399v0(3);
                            C9423c c9423c2 = this.f14569v;
                            if (c9423c2 != null) {
                                c9423c2.m17263h();
                                break;
                            }
                            break;
                    }
                    return;
                }
                Toast.makeText(this.f14549b, "清晰度切换成功", 0).show();
                return;
            }
            if (this.f14571x == 3) {
                this.f14547L.mo12409e();
                Toast.makeText(this.f14549b, "时移失败,返回直播", 0).show();
                m12399v0(1);
                return;
            } else {
                m12398u0();
                m12399v0(4);
                if (i10 != -2301) {
                    Toast.makeText(this.f14549b, bundle.getString(TXLiveConstants.EVT_DESCRIPTION), 0).show();
                    return;
                } else {
                    Toast.makeText(this.f14549b, "网络不给力,点击重试", 0).show();
                    return;
                }
            }
        }
        Toast.makeText(this.f14549b, "清晰度切换失败", 0).show();
    }
}
