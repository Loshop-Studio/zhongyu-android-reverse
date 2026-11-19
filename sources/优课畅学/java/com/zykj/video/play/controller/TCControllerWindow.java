package com.zykj.video.play.controller;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.zykj.video.play.R$color;
import com.zykj.video.play.R$drawable;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;
import com.zykj.video.play.view.TCPointSeekBar;
import com.zykj.video.play.view.TCVideoProgressLayout;
import com.zykj.video.play.view.TCVolumeBrightnessProgressLayout;
import java.util.List;
import p143j5.C9020g;
import p154k5.InterfaceC9057b;
import p154k5.InterfaceC9058c;
import p154k5.RunnableC9056a;
import p188n5.AbstractC9424d;
import p188n5.C9426f;

/* loaded from: classes5.dex */
public class TCControllerWindow extends RelativeLayout implements InterfaceC9057b, View.OnClickListener, AdapterView.OnItemSelectedListener, TCPointSeekBar.InterfaceC8178d {

    /* renamed from: A */
    public long f14666A;

    /* renamed from: B */
    public Bitmap f14667B;

    /* renamed from: C */
    public long f14668C;

    /* renamed from: a */
    public LinearLayout f14669a;

    /* renamed from: b */
    public LinearLayout f14670b;

    /* renamed from: c */
    public ImageView f14671c;

    /* renamed from: d */
    public ImageView f14672d;

    /* renamed from: e */
    public TextView f14673e;

    /* renamed from: f */
    public TextView f14674f;

    /* renamed from: g */
    public ImageView f14675g;

    /* renamed from: h */
    public ImageView f14676h;

    /* renamed from: i */
    public TextView f14677i;

    /* renamed from: j */
    public TextView f14678j;

    /* renamed from: k */
    public TCPointSeekBar f14679k;

    /* renamed from: l */
    public LinearLayout f14680l;

    /* renamed from: m */
    public ProgressBar f14681m;

    /* renamed from: n */
    public Spinner f14682n;

    /* renamed from: o */
    public TCVolumeBrightnessProgressLayout f14683o;

    /* renamed from: p */
    public TCVideoProgressLayout f14684p;

    /* renamed from: q */
    public InterfaceC9058c f14685q;

    /* renamed from: r */
    public RunnableC9056a f14686r;

    /* renamed from: s */
    public GestureDetector f14687s;

    /* renamed from: t */
    public C9426f f14688t;

    /* renamed from: u */
    public boolean f14689u;

    /* renamed from: v */
    public boolean f14690v;

    /* renamed from: w */
    public int f14691w;

    /* renamed from: x */
    public int f14692x;

    /* renamed from: y */
    public long f14693y;

    /* renamed from: z */
    public long f14694z;

    /* renamed from: com.zykj.video.play.controller.TCControllerWindow$a */
    public class C8168a extends GestureDetector.SimpleOnGestureListener {
        public C8168a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TCControllerWindow.this.m12489z();
            TCControllerWindow.this.m12497x();
            if (TCControllerWindow.this.f14686r == null) {
                return true;
            }
            TCControllerWindow tCControllerWindow = TCControllerWindow.this;
            tCControllerWindow.removeCallbacks(tCControllerWindow.f14686r);
            TCControllerWindow tCControllerWindow2 = TCControllerWindow.this;
            tCControllerWindow2.postDelayed(tCControllerWindow2.f14686r, 7000L);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (TCControllerWindow.this.f14688t == null) {
                return true;
            }
            TCControllerWindow.this.f14688t.m17276e(TCControllerWindow.this.getWidth(), TCControllerWindow.this.f14679k.getProgress());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent == null || motionEvent2 == null) {
                return false;
            }
            if (TCControllerWindow.this.f14688t == null || TCControllerWindow.this.f14683o == null) {
                return true;
            }
            TCControllerWindow.this.f14688t.m17272a(TCControllerWindow.this.f14683o.getHeight(), motionEvent, motionEvent2, f10, f11);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            TCControllerWindow.this.m12488y();
            return true;
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerWindow$b */
    public class C8169b implements C9426f.a {
        public C8169b() {
        }

        @Override // p188n5.C9426f.a
        /* renamed from: a */
        public void mo12467a(float f10) {
            if (TCControllerWindow.this.f14683o != null) {
                TCControllerWindow.this.f14683o.setProgress((int) (f10 * 100.0f));
                TCControllerWindow.this.f14683o.setImageResource(R$drawable.superplayer_ic_light_max);
                TCControllerWindow.this.f14683o.m12559b();
            }
        }

        @Override // p188n5.C9426f.a
        /* renamed from: b */
        public void mo12468b(float f10) {
            if (TCControllerWindow.this.f14683o != null) {
                TCControllerWindow.this.f14683o.setImageResource(R$drawable.superplayer_ic_volume_max);
                TCControllerWindow.this.f14683o.setProgress((int) f10);
                TCControllerWindow.this.f14683o.m12559b();
            }
        }

        @Override // p188n5.C9426f.a
        /* renamed from: c */
        public void mo12469c(int i10) {
            TCControllerWindow.this.f14690v = true;
            if (TCControllerWindow.this.f14684p != null) {
                if (i10 > TCControllerWindow.this.f14679k.getMax()) {
                    i10 = TCControllerWindow.this.f14679k.getMax();
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                TCControllerWindow.this.f14684p.setProgress(i10);
                TCControllerWindow.this.f14684p.m12539c();
                float max = i10 / TCControllerWindow.this.f14679k.getMax();
                float f10 = TCControllerWindow.this.f14693y * max;
                if (TCControllerWindow.this.f14691w == 2 || TCControllerWindow.this.f14691w == 3) {
                    TCControllerWindow.this.f14684p.setTimeText(AbstractC9424d.m17269b((long) (TCControllerWindow.this.f14694z > 7200 ? (int) (TCControllerWindow.this.f14694z - ((1.0f - max) * 7200.0f)) : max * TCControllerWindow.this.f14694z)));
                } else {
                    TCControllerWindow.this.f14684p.setTimeText(AbstractC9424d.m17269b((long) f10) + " / " + AbstractC9424d.m17269b(TCControllerWindow.this.f14693y));
                }
            }
            if (TCControllerWindow.this.f14679k != null) {
                TCControllerWindow.this.f14679k.setProgress(i10);
            }
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerWindow$c */
    public class RunnableC8170c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f14697a;

        public RunnableC8170c(Bitmap bitmap) {
            this.f14697a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14697a == null) {
                return;
            }
            if (TCControllerWindow.this.f14675g == null) {
                TCControllerWindow.this.f14667B = this.f14697a;
            } else {
                TCControllerWindow tCControllerWindow = TCControllerWindow.this;
                tCControllerWindow.m12496w(tCControllerWindow.f14675g, TCControllerWindow.this.f14667B);
            }
        }
    }

    /* renamed from: com.zykj.video.play.controller.TCControllerWindow$d */
    public class RunnableC8171d implements Runnable {

        /* renamed from: com.zykj.video.play.controller.TCControllerWindow$d$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TCControllerWindow.this.f14675g.setAlpha(fFloatValue);
                if (fFloatValue == 0.0f) {
                    TCControllerWindow.this.f14675g.setVisibility(8);
                }
            }
        }

        public RunnableC8171d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TCControllerWindow.this.f14675g.getVisibility() != 0) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.start();
        }
    }

    public TCControllerWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14692x = -1;
        m12486t(context);
    }

    /* renamed from: A */
    private void m12470A(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    /* renamed from: t */
    private void m12486t(Context context) {
        m12487u(context);
        this.f14686r = new RunnableC9056a(this);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C8168a());
        this.f14687s = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C9426f c9426f = new C9426f(getContext());
        this.f14688t = c9426f;
        c9426f.m17277f(new C8169b());
    }

    /* renamed from: u */
    private void m12487u(Context context) {
        LayoutInflater.from(context).inflate(R$layout.superplayer_vod_controller_window, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.superplayer_rl_top);
        this.f14669a = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R$id.superplayer_ll_bottom);
        this.f14670b = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.f14680l = (LinearLayout) findViewById(R$id.superplayer_ll_replay);
        this.f14673e = (TextView) findViewById(R$id.superplayer_tv_title);
        this.f14671c = (ImageView) findViewById(R$id.superplayer_iv_pause);
        this.f14677i = (TextView) findViewById(R$id.superplayer_tv_current);
        this.f14678j = (TextView) findViewById(R$id.superplayer_tv_duration);
        TCPointSeekBar tCPointSeekBar = (TCPointSeekBar) findViewById(R$id.superplayer_seekbar_progress);
        this.f14679k = tCPointSeekBar;
        tCPointSeekBar.setProgress(0);
        this.f14679k.setMax(100);
        this.f14672d = (ImageView) findViewById(R$id.superplayer_iv_fullscreen);
        this.f14674f = (TextView) findViewById(R$id.superplayer_tv_back_to_live);
        this.f14681m = (ProgressBar) findViewById(R$id.superplayer_pb_live);
        this.f14682n = (Spinner) findViewById(R$id.sp_speed);
        this.f14674f.setOnClickListener(this);
        this.f14671c.setOnClickListener(this);
        this.f14672d.setOnClickListener(this);
        this.f14669a.setOnClickListener(this);
        this.f14680l.setOnClickListener(this);
        this.f14679k.setOnSeekBarChangeListener(this);
        this.f14682n.setOnItemSelectedListener(this);
        this.f14683o = (TCVolumeBrightnessProgressLayout) findViewById(R$id.superplayer_gesture_progress);
        this.f14684p = (TCVideoProgressLayout) findViewById(R$id.superplayer_video_progress_layout);
        this.f14675g = (ImageView) findViewById(R$id.superplayer_small_iv_background);
        setBackground(this.f14667B);
        this.f14676h = (ImageView) findViewById(R$id.superplayer_small_iv_water_mark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m12488y() {
        if (this.f14689u) {
            hide();
            return;
        }
        m12497x();
        RunnableC9056a runnableC9056a = this.f14686r;
        if (runnableC9056a != null) {
            removeCallbacks(runnableC9056a);
            postDelayed(this.f14686r, 7000L);
        }
        InterfaceC9058c interfaceC9058c = this.f14685q;
        if (interfaceC9058c != null) {
            float speed = interfaceC9058c.getSpeed();
            if (speed == 1.0f) {
                this.f14682n.setSelection(0);
                return;
            }
            if (speed == 1.25f) {
                this.f14682n.setSelection(1);
                return;
            }
            if (speed == 1.5f) {
                this.f14682n.setSelection(2);
            } else if (speed == 2.0f) {
                this.f14682n.setSelection(3);
            } else {
                this.f14682n.setSelection(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m12489z() {
        /*
            r2 = this;
            int r0 = r2.f14692x
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
            k5.c r0 = r2.f14685q
            if (r0 == 0) goto L25
            r0.onResume()
            goto L25
        L17:
            k5.c r0 = r2.f14685q
            if (r0 == 0) goto L1e
            r0.onPause()
        L1e:
            android.widget.LinearLayout r0 = r2.f14680l
            r1 = 8
            r0.setVisibility(r1)
        L25:
            r2.m12497x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.video.play.controller.TCControllerWindow.m12489z():void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/video/play/controller/TCControllerWindow.smali:1032
    }

    /* renamed from: B */
    public void m12490B(int i10) {
        if (i10 == 1) {
            this.f14671c.setImageResource(R$drawable.superplayer_ic_vod_pause_normal);
            m12470A(this.f14681m, false);
            m12470A(this.f14680l, false);
        } else if (i10 == 2) {
            this.f14671c.setImageResource(R$drawable.superplayer_ic_vod_play_normal);
            m12470A(this.f14681m, false);
            m12470A(this.f14680l, false);
        } else if (i10 == 3) {
            this.f14671c.setImageResource(R$drawable.superplayer_ic_vod_pause_normal);
            m12470A(this.f14681m, true);
            m12470A(this.f14680l, false);
        } else if (i10 == 4) {
            this.f14671c.setImageResource(R$drawable.superplayer_ic_vod_play_normal);
            m12470A(this.f14681m, false);
            m12470A(this.f14680l, true);
        }
        this.f14692x = i10;
    }

    /* renamed from: C */
    public void m12491C(int i10) {
        this.f14691w = i10;
        if (i10 == 1) {
            this.f14674f.setVisibility(8);
            this.f14678j.setVisibility(0);
        } else if (i10 == 2) {
            this.f14674f.setVisibility(8);
            this.f14678j.setVisibility(8);
            this.f14679k.setProgress(100);
        } else {
            if (i10 != 3) {
                return;
            }
            if (this.f14670b.getVisibility() == 0) {
                this.f14674f.setVisibility(0);
            }
            this.f14678j.setVisibility(8);
        }
    }

    /* renamed from: D */
    public void m12492D(String str) {
        this.f14673e.setText(str);
    }

    /* renamed from: E */
    public void m12493E(long j10, long j11) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f14666A = j10;
        if (j11 < 0) {
            j11 = 0;
        }
        this.f14693y = j11;
        this.f14677i.setText(AbstractC9424d.m17269b(j10));
        long j12 = this.f14693y;
        float f10 = j12 > 0 ? this.f14666A / j12 : 1.0f;
        long j13 = this.f14666A;
        if (j13 == 0) {
            this.f14694z = 0L;
            f10 = 0.0f;
        }
        int i10 = this.f14691w;
        if (i10 == 2 || i10 == 3) {
            long j14 = this.f14694z;
            if (j14 <= j13) {
                j14 = j13;
            }
            this.f14694z = j14;
            long j15 = j12 - j13;
            if (j12 > 7200) {
                j12 = 7200;
            }
            this.f14693y = j12;
            f10 = 1.0f - (j15 / j12);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            return;
        }
        int iRound = Math.round(f10 * this.f14679k.getMax());
        if (!this.f14690v) {
            if (this.f14691w == 2) {
                TCPointSeekBar tCPointSeekBar = this.f14679k;
                tCPointSeekBar.setProgress(tCPointSeekBar.getMax());
            } else {
                this.f14679k.setProgress(iRound);
            }
        }
        this.f14678j.setText(AbstractC9424d.m17269b(this.f14693y));
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8178d
    /* renamed from: b */
    public void mo12459b(TCPointSeekBar tCPointSeekBar) {
        removeCallbacks(this.f14686r);
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8178d
    /* renamed from: d */
    public void mo12461d(TCPointSeekBar tCPointSeekBar, int i10, boolean z10) {
        TCVideoProgressLayout tCVideoProgressLayout = this.f14684p;
        if (tCVideoProgressLayout == null || !z10) {
            return;
        }
        tCVideoProgressLayout.m12539c();
        float max = i10 / tCPointSeekBar.getMax();
        float f10 = this.f14693y * max;
        int i11 = this.f14691w;
        if (i11 == 2 || i11 == 3) {
            long j10 = this.f14694z;
            this.f14684p.setTimeText(AbstractC9424d.m17269b((long) (j10 > 7200 ? (int) (j10 - ((1.0f - max) * 7200.0f)) : j10 * max)));
        } else {
            this.f14684p.setTimeText(AbstractC9424d.m17269b((long) f10) + " / " + AbstractC9424d.m17269b(this.f14693y));
        }
        this.f14684p.setProgress(i10);
    }

    @Override // com.zykj.video.play.view.TCPointSeekBar.InterfaceC8178d
    /* renamed from: g */
    public void mo12464g(TCPointSeekBar tCPointSeekBar) {
        int progress = tCPointSeekBar.getProgress();
        int max = tCPointSeekBar.getMax();
        int i10 = this.f14691w;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                m12470A(this.f14681m, true);
                long j10 = this.f14694z;
                float f10 = max;
                int i11 = (int) (((progress * j10) * 1.0f) / f10);
                if (j10 > 7200) {
                    i11 = (int) (j10 - ((((max - progress) * 7200) * 1.0f) / f10));
                }
                InterfaceC9058c interfaceC9058c = this.f14685q;
                if (interfaceC9058c != null) {
                    interfaceC9058c.mo12415k(i11);
                }
            }
        } else if (progress >= 0 && progress <= max) {
            m12470A(this.f14680l, false);
            int i12 = (int) (this.f14693y * (progress / max));
            InterfaceC9058c interfaceC9058c2 = this.f14685q;
            if (interfaceC9058c2 != null) {
                interfaceC9058c2.mo12415k(i12);
                this.f14685q.onResume();
            }
        }
        postDelayed(this.f14686r, 7000L);
    }

    @Override // p154k5.InterfaceC9057b
    public void hide() {
        this.f14689u = false;
        this.f14669a.setVisibility(8);
        this.f14670b.setVisibility(8);
        if (this.f14691w == 3) {
            this.f14674f.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC9058c interfaceC9058c;
        if (System.currentTimeMillis() - this.f14668C < 300) {
            return;
        }
        this.f14668C = System.currentTimeMillis();
        int id = view.getId();
        if (id == R$id.superplayer_rl_top) {
            InterfaceC9058c interfaceC9058c2 = this.f14685q;
            if (interfaceC9058c2 != null) {
                interfaceC9058c2.mo12406b(1);
                return;
            }
            return;
        }
        if (id == R$id.superplayer_iv_pause) {
            m12489z();
            return;
        }
        if (id == R$id.superplayer_iv_fullscreen) {
            InterfaceC9058c interfaceC9058c3 = this.f14685q;
            if (interfaceC9058c3 != null) {
                interfaceC9058c3.mo12414j(2);
                return;
            }
            return;
        }
        if (id == R$id.superplayer_ll_replay) {
            InterfaceC9058c interfaceC9058c4 = this.f14685q;
            if (interfaceC9058c4 != null) {
                interfaceC9058c4.onResume();
                return;
            }
            return;
        }
        if (id != R$id.superplayer_tv_back_to_live || (interfaceC9058c = this.f14685q) == null) {
            return;
        }
        interfaceC9058c.mo12409e();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        TextView textView = (TextView) view;
        textView.setTextColor(getResources().getColor(R$color.superplayer_white));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        if (i10 == 0) {
            this.f14685q.mo12405a(1.0f);
            return;
        }
        if (i10 == 1) {
            this.f14685q.mo12405a(1.25f);
            return;
        }
        if (i10 == 2) {
            this.f14685q.mo12405a(1.5f);
        } else if (i10 != 3) {
            this.f14685q.mo12405a(1.0f);
        } else {
            this.f14685q.mo12405a(2.0f);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C9426f c9426f;
        int i10;
        GestureDetector gestureDetector = this.f14687s;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (c9426f = this.f14688t) != null && c9426f.m17275d()) {
            int iM17274c = this.f14688t.m17274c();
            if (iM17274c > this.f14679k.getMax()) {
                iM17274c = this.f14679k.getMax();
            }
            if (iM17274c < 0) {
                iM17274c = 0;
            }
            this.f14679k.setProgress(iM17274c);
            float max = (iM17274c * 1.0f) / this.f14679k.getMax();
            int i11 = this.f14691w;
            if (i11 == 2 || i11 == 3) {
                long j10 = this.f14694z;
                i10 = j10 > 7200 ? (int) (j10 - ((1.0f - max) * 7200.0f)) : (int) (j10 * max);
            } else {
                i10 = (int) (max * this.f14693y);
            }
            InterfaceC9058c interfaceC9058c = this.f14685q;
            if (interfaceC9058c != null) {
                interfaceC9058c.mo12415k(i10);
            }
            this.f14690v = false;
        }
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f14686r);
        } else if (motionEvent.getAction() == 1) {
            postDelayed(this.f14686r, 7000L);
        }
        return true;
    }

    /* renamed from: s */
    public void m12494s() {
        post(new RunnableC8171d());
    }

    public void setBackground(Bitmap bitmap) {
        post(new RunnableC8170c(bitmap));
    }

    public void setCallback(InterfaceC9058c interfaceC9058c) {
        this.f14685q = interfaceC9058c;
    }

    public void setVideoQualityList(List<C9020g> list) {
    }

    /* renamed from: v */
    public void m12495v() {
    }

    /* renamed from: w */
    public final void m12496w(ImageView imageView, Bitmap bitmap) {
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setBackground(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    /* renamed from: x */
    public void m12497x() {
        this.f14689u = true;
        this.f14669a.setVisibility(0);
        this.f14670b.setVisibility(0);
        if (this.f14691w == 3) {
            this.f14674f.setVisibility(0);
        }
    }
}
