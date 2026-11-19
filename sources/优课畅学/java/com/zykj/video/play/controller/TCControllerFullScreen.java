package com.zykj.video.play.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.rtmp.TXImageSprite;
import com.zykj.video.play.R$drawable;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;
import com.zykj.video.play.view.TCPointSeekBar;
import com.zykj.video.play.view.TCVideoProgressLayout;
import com.zykj.video.play.view.TCVodMoreView;
import com.zykj.video.play.view.TCVodQualityView;
import com.zykj.video.play.view.TCVolumeBrightnessProgressLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p143j5.C9015b;
import p143j5.C9017d;
import p143j5.C9020g;
import p154k5.InterfaceC9057b;
import p154k5.InterfaceC9058c;
import p154k5.RunnableC9056a;
import p166l5.C9252b;
import p188n5.AbstractC9424d;
import p188n5.C9426f;

/* loaded from: classes5.dex */
public class TCControllerFullScreen extends RelativeLayout implements InterfaceC9057b, View.OnClickListener, TCVodMoreView.InterfaceC8187c, TCVodQualityView.InterfaceC8189b, TCPointSeekBar.InterfaceC8178d, TCPointSeekBar.InterfaceC8179e {

    /* renamed from: A */
    public C9426f f14616A;

    /* renamed from: B */
    public boolean f14617B;

    /* renamed from: C */
    public boolean f14618C;

    /* renamed from: D */
    public int f14619D;

    /* renamed from: E */
    public int f14620E;

    /* renamed from: F */
    public long f14621F;

    /* renamed from: G */
    public long f14622G;

    /* renamed from: H */
    public long f14623H;

    /* renamed from: I */
    public boolean f14624I;

    /* renamed from: J */
    public boolean f14625J;

    /* renamed from: K */
    public TXImageSprite f14626K;

    /* renamed from: L */
    public List f14627L;

    /* renamed from: M */
    public int f14628M;

    /* renamed from: N */
    public C9020g f14629N;

    /* renamed from: O */
    public List f14630O;

    /* renamed from: P */
    public boolean f14631P;

    /* renamed from: a */
    public RelativeLayout f14632a;

    /* renamed from: b */
    public LinearLayout f14633b;

    /* renamed from: c */
    public ImageView f14634c;

    /* renamed from: d */
    public TextView f14635d;

    /* renamed from: e */
    public TextView f14636e;

    /* renamed from: f */
    public ImageView f14637f;

    /* renamed from: g */
    public TextView f14638g;

    /* renamed from: h */
    public TextView f14639h;

    /* renamed from: i */
    public TCPointSeekBar f14640i;

    /* renamed from: j */
    public LinearLayout f14641j;

    /* renamed from: k */
    public ProgressBar f14642k;

    /* renamed from: l */
    public TCVolumeBrightnessProgressLayout f14643l;

    /* renamed from: m */
    public TCVideoProgressLayout f14644m;

    /* renamed from: n */
    public TextView f14645n;

    /* renamed from: o */
    public ImageView f14646o;

    /* renamed from: p */
    public ImageView f14647p;

    /* renamed from: q */
    public ImageView f14648q;

    /* renamed from: r */
    public ImageView f14649r;

    /* renamed from: s */
    public ImageView f14650s;

    /* renamed from: t */
    public TCVodQualityView f14651t;

    /* renamed from: u */
    public TCVodMoreView f14652u;

    /* renamed from: v */
    public TextView f14653v;

    /* renamed from: w */
    public InterfaceC9058c f14654w;

    /* renamed from: x */
    public RunnableC9056a f14655x;

    /* renamed from: y */
    public RunnableC8167e f14656y;

    /* renamed from: z */
    public GestureDetector f14657z;

    /* renamed from: com.zykj.video.play.controller.TCControllerFullScreen$a */
    public class C8163a extends GestureDetector.SimpleOnGestureListener {
        public C8163a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (TCControllerFullScreen.this.f14625J) {
                return false;
            }
            TCControllerFullScreen.this.m12449M();
            TCControllerFullScreen.this.m12443G();
            if (TCControllerFullScreen.this.f14655x == null) {
                return true;
            }
            TCControllerFullScreen tCControllerFullScreen = TCControllerFullScreen.this;
            tCControllerFullScreen.removeCallbacks(tCControllerFullScreen.f14655x);
            TCControllerFullScreen tCControllerFullScreen2 = TCControllerFullScreen.this;
            tCControllerFullScreen2.postDelayed(tCControllerFullScreen2.f14655x, 7000L);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (!TCControllerFullScreen.this.f14625J && TCControllerFullScreen.this.f14616A != null) {
                TCControllerFullScreen.this.f14616A.m17276e(TCControllerFullScreen.this.getWidth(), TCControllerFullScreen.this.f14640i.getProgress());
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (TCControllerFullScreen.this.f14625J || motionEvent == null || motionEvent2 == null) {
                return false;
            }
            if (TCControllerFullScreen.this.f14616A == null || TCControllerFullScreen.this.f14643l == null) {
                return true;
            }
            TCControllerFullScreen.this.f14616A.m17272a(TCControllerFullScreen.this.f14643l.getHeight(), motionEvent, motionEvent2, f10, f11);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            TCControllerFullScreen.this.m12446J();
            return true;
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerFullScreen$b */
    public class C8164b implements C9426f.a {
        public C8164b() {
        }

        @Override // p188n5.C9426f.a
        /* renamed from: a */
        public void mo12467a(float f10) {
            if (TCControllerFullScreen.this.f14643l != null) {
                TCControllerFullScreen.this.f14643l.setProgress((int) (f10 * 100.0f));
                TCControllerFullScreen.this.f14643l.setImageResource(R$drawable.superplayer_ic_light_max);
                TCControllerFullScreen.this.f14643l.m12559b();
            }
        }

        @Override // p188n5.C9426f.a
        /* renamed from: b */
        public void mo12468b(float f10) {
            if (TCControllerFullScreen.this.f14643l != null) {
                TCControllerFullScreen.this.f14643l.setImageResource(R$drawable.superplayer_ic_volume_max);
                TCControllerFullScreen.this.f14643l.setProgress((int) f10);
                TCControllerFullScreen.this.f14643l.m12559b();
            }
        }

        @Override // p188n5.C9426f.a
        /* renamed from: c */
        public void mo12469c(int i10) {
            TCControllerFullScreen.this.f14618C = true;
            if (TCControllerFullScreen.this.f14644m != null) {
                if (i10 > TCControllerFullScreen.this.f14640i.getMax()) {
                    i10 = TCControllerFullScreen.this.f14640i.getMax();
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                TCControllerFullScreen.this.f14644m.setProgress(i10);
                TCControllerFullScreen.this.f14644m.m12539c();
                float max = i10 / TCControllerFullScreen.this.f14640i.getMax();
                float f10 = TCControllerFullScreen.this.f14621F * max;
                if (TCControllerFullScreen.this.f14619D == 2 || TCControllerFullScreen.this.f14619D == 3) {
                    TCControllerFullScreen.this.f14644m.setTimeText(AbstractC9424d.m17269b((long) (TCControllerFullScreen.this.f14622G > 7200 ? (int) (TCControllerFullScreen.this.f14622G - ((1.0f - max) * 7200.0f)) : max * TCControllerFullScreen.this.f14622G)));
                } else {
                    TCControllerFullScreen.this.f14644m.setTimeText(AbstractC9424d.m17269b((long) f10) + " / " + AbstractC9424d.m17269b(TCControllerFullScreen.this.f14621F));
                }
                TCControllerFullScreen.this.setThumbnail(i10);
            }
            if (TCControllerFullScreen.this.f14640i != null) {
                TCControllerFullScreen.this.f14640i.setProgress(i10);
            }
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerFullScreen$c */
    public class RunnableC8165c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f14660a;

        /* renamed from: b */
        public final /* synthetic */ int f14661b;

        public RunnableC8165c(View view, int i10) {
            this.f14660a = view;
            this.f14661b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            this.f14660a.getLocationInWindow(iArr);
            int i10 = iArr[0];
            C9017d c9017d = (C9017d) TCControllerFullScreen.this.f14627L.get(this.f14661b);
            String str = c9017d.f17233a;
            TCControllerFullScreen.this.f14653v.setText(AbstractC9424d.m17269b((long) c9017d.f17234b) + " " + str);
            TCControllerFullScreen.this.f14653v.setVisibility(0);
            TCControllerFullScreen.this.m12466z(i10);
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerFullScreen$d */
    public class RunnableC8166d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f14663a;

        public RunnableC8166d(int i10) {
            this.f14663a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int width = TCControllerFullScreen.this.f14653v.getWidth();
            int i10 = this.f14663a - (width / 2);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TCControllerFullScreen.this.f14653v.getLayoutParams();
            layoutParams.leftMargin = i10;
            if (i10 < 0) {
                layoutParams.leftMargin = 0;
            }
            int i11 = TCControllerFullScreen.this.getResources().getDisplayMetrics().widthPixels;
            if (i10 + width > i11) {
                layoutParams.leftMargin = i11 - width;
            }
            TCControllerFullScreen.this.f14653v.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerFullScreen$e */
    public static class RunnableC8167e implements Runnable {

        /* renamed from: a */
        public WeakReference f14665a;

        public RunnableC8167e(TCControllerFullScreen tCControllerFullScreen) {
            this.f14665a = new WeakReference(tCControllerFullScreen);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference weakReference = this.f14665a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((TCControllerFullScreen) this.f14665a.get()).f14649r.setVisibility(8);
        }
    }

    public TCControllerFullScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14620E = -1;
        this.f14628M = -1;
        m12437A(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnail(int i10) {
        Bitmap thumbnail;
        float max = this.f14621F * (i10 / this.f14640i.getMax());
        TXImageSprite tXImageSprite = this.f14626K;
        if (tXImageSprite == null || (thumbnail = tXImageSprite.getThumbnail(max)) == null) {
            return;
        }
        this.f14644m.setThumbnail(thumbnail);
    }

    /* renamed from: A */
    public final void m12437A(Context context) {
        m12438B(context);
        this.f14655x = new RunnableC9056a(this);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C8163a());
        this.f14657z = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C9426f c9426f = new C9426f(getContext());
        this.f14616A = c9426f;
        c9426f.m17277f(new C8164b());
    }

    /* renamed from: B */
    public final void m12438B(Context context) {
        this.f14656y = new RunnableC8167e(this);
        LayoutInflater.from(context).inflate(R$layout.superplayer_vod_controller_fullscreen, this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.superplayer_rl_top);
        this.f14632a = relativeLayout;
        relativeLayout.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.superplayer_ll_bottom);
        this.f14633b = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f14641j = (LinearLayout) findViewById(R$id.superplayer_ll_replay);
        this.f14646o = (ImageView) findViewById(R$id.superplayer_iv_back);
        this.f14649r = (ImageView) findViewById(R$id.superplayer_iv_lock);
        this.f14635d = (TextView) findViewById(R$id.superplayer_tv_title);
        this.f14634c = (ImageView) findViewById(R$id.superplayer_iv_pause);
        this.f14647p = (ImageView) findViewById(R$id.superplayer_iv_danmuku);
        this.f14650s = (ImageView) findViewById(R$id.superplayer_iv_more);
        this.f14648q = (ImageView) findViewById(R$id.superplayer_iv_snapshot);
        this.f14638g = (TextView) findViewById(R$id.superplayer_tv_current);
        this.f14639h = (TextView) findViewById(R$id.superplayer_tv_duration);
        TCPointSeekBar tCPointSeekBar = (TCPointSeekBar) findViewById(R$id.superplayer_seekbar_progress);
        this.f14640i = tCPointSeekBar;
        tCPointSeekBar.setProgress(0);
        this.f14640i.setOnPointClickListener(this);
        this.f14640i.setOnSeekBarChangeListener(this);
        this.f14645n = (TextView) findViewById(R$id.superplayer_tv_quality);
        this.f14636e = (TextView) findViewById(R$id.superplayer_tv_back_to_live);
        this.f14642k = (ProgressBar) findViewById(R$id.superplayer_pb_live);
        TCVodQualityView tCVodQualityView = (TCVodQualityView) findViewById(R$id.superplayer_vod_quality);
        this.f14651t = tCVodQualityView;
        tCVodQualityView.setCallback(this);
        TCVodMoreView tCVodMoreView = (TCVodMoreView) findViewById(R$id.superplayer_vod_more);
        this.f14652u = tCVodMoreView;
        tCVodMoreView.setCallback(this);
        this.f14636e.setOnClickListener(this);
        this.f14641j.setOnClickListener(this);
        this.f14649r.setOnClickListener(this);
        this.f14646o.setOnClickListener(this);
        this.f14634c.setOnClickListener(this);
        this.f14647p.setOnClickListener(this);
        this.f14648q.setOnClickListener(this);
        this.f14650s.setOnClickListener(this);
        this.f14645n.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R$id.superplayer_large_tv_vtt_text);
        this.f14653v = textView;
        textView.setOnClickListener(this);
        C9020g c9020g = this.f14629N;
        if (c9020g != null) {
            this.f14645n.setText(c9020g.f17245d);
        }
        this.f14643l = (TCVolumeBrightnessProgressLayout) findViewById(R$id.superplayer_gesture_progress);
        this.f14644m = (TCVideoProgressLayout) findViewById(R$id.superplayer_video_progress_layout);
        this.f14637f = (ImageView) findViewById(R$id.superplayer_large_iv_water_mark);
    }

    /* renamed from: C */
    public void m12439C() {
        m12440D();
    }

    /* renamed from: D */
    public final void m12440D() {
        TXImageSprite tXImageSprite = this.f14626K;
        if (tXImageSprite != null) {
            tXImageSprite.release();
            this.f14626K = null;
        }
    }

    /* renamed from: E */
    public final void m12441E() {
        m12450N(this.f14641j, false);
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.onResume();
        }
    }

    /* renamed from: F */
    public final void m12442F() {
        List list = this.f14627L;
        float f10 = list != null ? ((C9017d) list.get(this.f14628M)).f17234b : 0.0f;
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12415k((int) f10);
            this.f14654w.onResume();
        }
        this.f14653v.setVisibility(8);
        m12450N(this.f14641j, false);
    }

    /* renamed from: G */
    public void m12443G() {
        this.f14617B = true;
        this.f14632a.setVisibility(0);
        this.f14633b.setVisibility(0);
        RunnableC8167e runnableC8167e = this.f14656y;
        if (runnableC8167e != null) {
            removeCallbacks(runnableC8167e);
        }
        this.f14649r.setVisibility(0);
        if (this.f14619D == 3 && this.f14633b.getVisibility() == 0) {
            this.f14636e.setVisibility(0);
        }
        ArrayList arrayList = new ArrayList();
        List list = this.f14627L;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TCPointSeekBar.C8180f((int) ((((C9017d) it.next()).f17234b / this.f14621F) * this.f14640i.getMax()), -1));
            }
        }
        this.f14640i.setPointList(arrayList);
    }

    /* renamed from: H */
    public final void m12444H() {
        hide();
        this.f14652u.setVisibility(0);
    }

    /* renamed from: I */
    public final void m12445I() {
        String str;
        List list = this.f14630O;
        if (list == null || list.size() == 0) {
            return;
        }
        int i10 = 0;
        if (this.f14630O.size() == 1 && (this.f14630O.get(0) == null || TextUtils.isEmpty(((C9020g) this.f14630O.get(0)).f17245d))) {
            return;
        }
        this.f14651t.setVisibility(0);
        if (!this.f14631P && this.f14629N != null) {
            while (true) {
                if (i10 < this.f14630O.size()) {
                    C9020g c9020g = (C9020g) this.f14630O.get(i10);
                    if (c9020g != null && (str = c9020g.f17245d) != null && str.equals(this.f14629N.f17245d)) {
                        this.f14651t.setDefaultSelectedQuality(i10);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            this.f14631P = true;
        }
        this.f14651t.setVideoQualityList(this.f14630O);
    }

    /* renamed from: J */
    public final void m12446J() {
        if (this.f14625J) {
            this.f14649r.setVisibility(0);
            RunnableC8167e runnableC8167e = this.f14656y;
            if (runnableC8167e != null) {
                removeCallbacks(runnableC8167e);
                postDelayed(this.f14656y, 7000L);
            }
        } else if (this.f14617B) {
            hide();
        } else {
            m12443G();
            RunnableC9056a runnableC9056a = this.f14655x;
            if (runnableC9056a != null) {
                removeCallbacks(runnableC9056a);
                postDelayed(this.f14655x, 7000L);
            }
        }
        if (this.f14652u.getVisibility() == 0) {
            this.f14652u.setVisibility(8);
        }
    }

    /* renamed from: K */
    public final void m12447K() {
        boolean z10 = this.f14624I;
        this.f14624I = !z10;
        if (z10) {
            this.f14647p.setImageResource(R$drawable.superplayer_ic_danmuku_off);
        } else {
            this.f14647p.setImageResource(R$drawable.superplayer_ic_danmuku_on);
        }
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12412h(this.f14624I);
        }
    }

    /* renamed from: L */
    public final void m12448L() {
        this.f14625J = !this.f14625J;
        this.f14649r.setVisibility(0);
        RunnableC8167e runnableC8167e = this.f14656y;
        if (runnableC8167e != null) {
            removeCallbacks(runnableC8167e);
            postDelayed(this.f14656y, 7000L);
        }
        if (!this.f14625J) {
            this.f14649r.setImageResource(R$drawable.superplayer_ic_player_unlock);
            m12443G();
        } else {
            this.f14649r.setImageResource(R$drawable.superplayer_ic_player_lock);
            hide();
            this.f14649r.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12449M() {
        /*
            r2 = this;
            int r0 = r2.f14620E
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto Lf
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 4
            if (r0 == r1) goto Lf
            goto L25
        Lf:
            k5.c r0 = r2.f14654w
            if (r0 == 0) goto L25
            r0.onResume()
            goto L25
        L17:
            k5.c r0 = r2.f14654w
            if (r0 == 0) goto L1e
            r0.onPause()
        L1e:
            android.widget.LinearLayout r0 = r2.f14641j
            r1 = 8
            r0.setVisibility(r1)
        L25:
            r2.m12443G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.video.play.controller.TCControllerFullScreen.m12449M():void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/video/play/controller/TCControllerFullScreen.smali:2085
    }

    /* renamed from: N */
    public final void m12450N(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    /* renamed from: O */
    public void m12451O(C9015b c9015b) throws JSONException {
        List list;
        if (this.f14626K != null) {
            m12440D();
        }
        this.f14644m.setProgressVisibility(c9015b == null || (list = c9015b.f17222a) == null || list.size() == 0);
        if (this.f14619D == 1) {
            TXImageSprite tXImageSprite = new TXImageSprite(getContext());
            this.f14626K = tXImageSprite;
            if (c9015b == null) {
                tXImageSprite.setVTTUrlAndImageUrls(null, null);
            } else {
                C9252b.m16956a().m16959d("image_sprite", 0L, 0);
                this.f14626K.setVTTUrlAndImageUrls(c9015b.f17223b, c9015b.f17222a);
            }
        }
    }

    /* renamed from: P */
    public void m12452P(List list) {
        this.f14627L = list;
    }

    /* renamed from: Q */
    public void m12453Q(int i10) {
        if (i10 == 1) {
            this.f14634c.setImageResource(R$drawable.superplayer_ic_vod_pause_normal);
            m12450N(this.f14642k, false);
            m12450N(this.f14641j, false);
        } else if (i10 == 2) {
            this.f14634c.setImageResource(R$drawable.superplayer_ic_vod_play_normal);
            m12450N(this.f14641j, false);
        } else if (i10 == 3) {
            this.f14634c.setImageResource(R$drawable.superplayer_ic_vod_pause_normal);
            m12450N(this.f14642k, true);
            m12450N(this.f14641j, false);
        } else if (i10 == 4) {
            this.f14634c.setImageResource(R$drawable.superplayer_ic_vod_play_normal);
            m12450N(this.f14641j, true);
        }
        this.f14620E = i10;
    }

    /* renamed from: R */
    public void m12454R(int i10) {
        this.f14619D = i10;
        if (i10 == 1) {
            this.f14636e.setVisibility(8);
            this.f14652u.m12547h(1);
            this.f14639h.setVisibility(0);
        } else {
            if (i10 == 2) {
                this.f14636e.setVisibility(8);
                this.f14639h.setVisibility(8);
                this.f14652u.m12547h(2);
                this.f14640i.setProgress(100);
                return;
            }
            if (i10 != 3) {
                return;
            }
            if (this.f14633b.getVisibility() == 0) {
                this.f14636e.setVisibility(0);
            }
            this.f14639h.setVisibility(8);
            this.f14652u.m12547h(3);
        }
    }

    /* renamed from: S */
    public void m12455S(String str) {
        this.f14635d.setText(str);
    }

    /* renamed from: T */
    public void m12456T(long j10, long j11) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f14623H = j10;
        if (j11 < 0) {
            j11 = 0;
        }
        this.f14621F = j11;
        this.f14638g.setText(AbstractC9424d.m17269b(j10));
        long j12 = this.f14621F;
        float f10 = j12 > 0 ? this.f14623H / j12 : 1.0f;
        long j13 = this.f14623H;
        if (j13 == 0) {
            this.f14622G = 0L;
            f10 = 0.0f;
        }
        int i10 = this.f14619D;
        if (i10 == 2 || i10 == 3) {
            long j14 = this.f14622G;
            if (j14 <= j13) {
                j14 = j13;
            }
            this.f14622G = j14;
            long j15 = j12 - j13;
            if (j12 > 7200) {
                j12 = 7200;
            }
            this.f14621F = j12;
            f10 = 1.0f - (j15 / j12);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            return;
        }
        int iRound = Math.round(f10 * this.f14640i.getMax());
        if (!this.f14618C) {
            this.f14640i.setProgress(iRound);
        }
        this.f14639h.setText(AbstractC9424d.m17269b(this.f14621F));
    }

    /* renamed from: U */
    public void m12457U(C9020g c9020g) {
        String str;
        if (c9020g == null) {
            this.f14645n.setText("");
            return;
        }
        this.f14629N = c9020g;
        TextView textView = this.f14645n;
        if (textView != null) {
            textView.setText(c9020g.f17245d);
        }
        List list = this.f14630O;
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < this.f14630O.size(); i10++) {
            C9020g c9020g2 = (C9020g) this.f14630O.get(i10);
            if (c9020g2 != null && (str = c9020g2.f17245d) != null && str.equals(this.f14629N.f17245d)) {
                this.f14651t.setDefaultSelectedQuality(i10);
                return;
            }
        }
    }

    @Override // com.zykj.video.play.view.TCVodMoreView.InterfaceC8187c
    /* renamed from: a */
    public void mo12458a(float f10) {
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12405a(f10);
        }
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8178d
    /* renamed from: b */
    public void mo12459b(TCPointSeekBar tCPointSeekBar) {
        removeCallbacks(this.f14655x);
    }

    @Override // com.zykj.video.play.view.TCVodMoreView.InterfaceC8187c
    /* renamed from: c */
    public void mo12460c(boolean z10) {
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12413i(z10);
        }
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8178d
    /* renamed from: d */
    public void mo12461d(TCPointSeekBar tCPointSeekBar, int i10, boolean z10) {
        TCVideoProgressLayout tCVideoProgressLayout = this.f14644m;
        if (tCVideoProgressLayout != null && z10) {
            tCVideoProgressLayout.m12539c();
            float max = i10 / tCPointSeekBar.getMax();
            float f10 = this.f14621F * max;
            int i11 = this.f14619D;
            if (i11 == 2 || i11 == 3) {
                long j10 = this.f14622G;
                this.f14644m.setTimeText(AbstractC9424d.m17269b((long) (j10 > 7200 ? (int) (j10 - ((1.0f - max) * 7200.0f)) : j10 * max)));
            } else {
                this.f14644m.setTimeText(AbstractC9424d.m17269b((long) f10) + " / " + AbstractC9424d.m17269b(this.f14621F));
            }
            this.f14644m.setProgress(i10);
        }
        if (z10 && this.f14619D == 1) {
            setThumbnail(i10);
        }
    }

    @Override // com.zykj.video.play.view.TCVodMoreView.InterfaceC8187c
    /* renamed from: e */
    public void mo12462e(boolean z10) {
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12407c(z10);
        }
    }

    @Override // com.zykj.video.play.view.TCVodQualityView.InterfaceC8189b
    /* renamed from: f */
    public void mo12463f(C9020g c9020g) {
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12411g(c9020g);
        }
        this.f14651t.setVisibility(8);
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8178d
    /* renamed from: g */
    public void mo12464g(TCPointSeekBar tCPointSeekBar) {
        int progress = tCPointSeekBar.getProgress();
        int max = tCPointSeekBar.getMax();
        int i10 = this.f14619D;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                m12450N(this.f14642k, true);
                long j10 = this.f14622G;
                float f10 = max;
                int i11 = (int) (((progress * j10) * 1.0f) / f10);
                if (j10 > 7200) {
                    i11 = (int) (j10 - ((((max - progress) * 7200) * 1.0f) / f10));
                }
                InterfaceC9058c interfaceC9058c = this.f14654w;
                if (interfaceC9058c != null) {
                    interfaceC9058c.mo12415k(i11);
                }
            }
        } else if (progress >= 0 && progress <= max) {
            m12450N(this.f14641j, false);
            int i12 = (int) (this.f14621F * (progress / max));
            InterfaceC9058c interfaceC9058c2 = this.f14654w;
            if (interfaceC9058c2 != null) {
                interfaceC9058c2.mo12415k(i12);
                this.f14654w.onResume();
            }
        }
        postDelayed(this.f14655x, 7000L);
    }

    @Override // com.zykj.video.play.view.TCVodMoreView.InterfaceC8187c
    public float getSpeed() {
        InterfaceC9058c interfaceC9058c = this.f14654w;
        if (interfaceC9058c != null) {
            return interfaceC9058c.getSpeed();
        }
        return 1.0f;
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8179e
    /* renamed from: h */
    public void mo12465h(View view, int i10) throws JSONException {
        if (this.f14656y != null) {
            removeCallbacks(this.f14655x);
            postDelayed(this.f14655x, 7000L);
        }
        if (this.f14627L != null) {
            C9252b.m16956a().m16959d("player_point", 0L, 0);
            this.f14628M = i10;
            view.post(new RunnableC8165c(view, i10));
        }
    }

    @Override // p154k5.InterfaceC9057b
    public void hide() {
        this.f14617B = false;
        this.f14632a.setVisibility(8);
        this.f14633b.setVisibility(8);
        this.f14651t.setVisibility(8);
        this.f14653v.setVisibility(8);
        this.f14649r.setVisibility(8);
        if (this.f14619D == 3) {
            this.f14636e.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.superplayer_iv_back || id == R$id.superplayer_tv_title) {
            InterfaceC9058c interfaceC9058c = this.f14654w;
            if (interfaceC9058c != null) {
                interfaceC9058c.mo12406b(2);
                return;
            }
            return;
        }
        if (id == R$id.superplayer_iv_pause) {
            m12449M();
            return;
        }
        if (id == R$id.superplayer_iv_danmuku) {
            m12447K();
            return;
        }
        if (id == R$id.superplayer_iv_snapshot) {
            InterfaceC9058c interfaceC9058c2 = this.f14654w;
            if (interfaceC9058c2 != null) {
                interfaceC9058c2.mo12408d();
                return;
            }
            return;
        }
        if (id == R$id.superplayer_iv_more) {
            m12444H();
            return;
        }
        if (id == R$id.superplayer_tv_quality) {
            m12445I();
            return;
        }
        if (id == R$id.superplayer_iv_lock) {
            m12448L();
            return;
        }
        if (id == R$id.superplayer_ll_replay) {
            m12441E();
            return;
        }
        if (id != R$id.superplayer_tv_back_to_live) {
            if (id == R$id.superplayer_large_tv_vtt_text) {
                m12442F();
            }
        } else {
            InterfaceC9058c interfaceC9058c3 = this.f14654w;
            if (interfaceC9058c3 != null) {
                interfaceC9058c3.mo12409e();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C9426f c9426f;
        int i10;
        GestureDetector gestureDetector = this.f14657z;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.f14625J && motionEvent.getAction() == 1 && (c9426f = this.f14616A) != null && c9426f.m17275d()) {
            int iM17274c = this.f14616A.m17274c();
            if (iM17274c > this.f14640i.getMax()) {
                iM17274c = this.f14640i.getMax();
            }
            if (iM17274c < 0) {
                iM17274c = 0;
            }
            this.f14640i.setProgress(iM17274c);
            float max = (iM17274c * 1.0f) / this.f14640i.getMax();
            int i11 = this.f14619D;
            if (i11 == 2 || i11 == 3) {
                long j10 = this.f14622G;
                i10 = j10 > 7200 ? (int) (j10 - ((1.0f - max) * 7200.0f)) : (int) (j10 * max);
            } else {
                i10 = (int) (max * this.f14621F);
            }
            InterfaceC9058c interfaceC9058c = this.f14654w;
            if (interfaceC9058c != null) {
                interfaceC9058c.mo12415k(i10);
            }
            this.f14618C = false;
        }
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f14655x);
        } else if (motionEvent.getAction() == 1) {
            postDelayed(this.f14655x, 7000L);
        }
        return true;
    }

    public void setBackground(Bitmap bitmap) {
    }

    public void setCallback(InterfaceC9058c interfaceC9058c) {
        this.f14654w = interfaceC9058c;
    }

    public void setVideoQualityList(List<C9020g> list) {
        this.f14630O = list;
        this.f14631P = false;
    }

    /* renamed from: z */
    public final void m12466z(int i10) {
        this.f14653v.post(new RunnableC8166d(i10));
    }
}
