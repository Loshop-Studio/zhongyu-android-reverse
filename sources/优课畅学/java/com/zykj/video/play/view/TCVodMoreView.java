package com.zykj.video.play.view;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import com.zykj.video.play.C8161a;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;

/* loaded from: classes5.dex */
public class TCVodMoreView extends RelativeLayout implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public Context f14761a;

    /* renamed from: b */
    public SeekBar f14762b;

    /* renamed from: c */
    public SeekBar f14763c;

    /* renamed from: d */
    public Switch f14764d;

    /* renamed from: e */
    public Switch f14765e;

    /* renamed from: f */
    public InterfaceC8187c f14766f;

    /* renamed from: g */
    public AudioManager f14767g;

    /* renamed from: h */
    public RadioGroup f14768h;

    /* renamed from: i */
    public RadioButton f14769i;

    /* renamed from: j */
    public RadioButton f14770j;

    /* renamed from: k */
    public RadioButton f14771k;

    /* renamed from: l */
    public RadioButton f14772l;

    /* renamed from: m */
    public LinearLayout f14773m;

    /* renamed from: n */
    public LinearLayout f14774n;

    /* renamed from: o */
    public SeekBar.OnSeekBarChangeListener f14775o;

    /* renamed from: p */
    public SeekBar.OnSeekBarChangeListener f14776p;

    /* renamed from: com.zykj.video.play.view.TCVodMoreView$a */
    public class C8185a implements SeekBar.OnSeekBarChangeListener {
        public C8185a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TCVodMoreView.this.m12548i(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.zykj.video.play.view.TCVodMoreView$b */
    public class C8186b implements SeekBar.OnSeekBarChangeListener {
        public C8186b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TCVodMoreView.this.m12544e(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.zykj.video.play.view.TCVodMoreView$c */
    public interface InterfaceC8187c {
        /* renamed from: a */
        void mo12458a(float f10);

        /* renamed from: c */
        void mo12460c(boolean z10);

        /* renamed from: e */
        void mo12462e(boolean z10);

        float getSpeed();
    }

    public TCVodMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14775o = new C8185a();
        this.f14776p = new C8186b();
        m12543d(context);
    }

    /* renamed from: c */
    public static float m12542c(Activity activity) {
        return activity.getWindow().getAttributes().screenBrightness;
    }

    /* renamed from: d */
    public final void m12543d(Context context) {
        this.f14761a = context;
        LayoutInflater.from(context).inflate(R$layout.superplayer_more_popup_view, this);
        this.f14773m = (LinearLayout) findViewById(R$id.superplayer_ll_speed);
        this.f14768h = (RadioGroup) findViewById(R$id.superplayer_rg);
        this.f14769i = (RadioButton) findViewById(R$id.superplayer_rb_speed1);
        this.f14770j = (RadioButton) findViewById(R$id.superplayer_rb_speed125);
        this.f14771k = (RadioButton) findViewById(R$id.superplayer_rb_speed15);
        this.f14772l = (RadioButton) findViewById(R$id.superplayer_rb_speed2);
        this.f14768h.setOnCheckedChangeListener(this);
        this.f14762b = (SeekBar) findViewById(R$id.superplayer_sb_audio);
        this.f14763c = (SeekBar) findViewById(R$id.superplayer_sb_light);
        this.f14774n = (LinearLayout) findViewById(R$id.superplayer_ll_mirror);
        this.f14764d = (Switch) findViewById(R$id.superplayer_switch_mirror);
        this.f14765e = (Switch) findViewById(R$id.superplayer_switch_accelerate);
        this.f14765e.setChecked(C8161a.m12416a().f14591c);
        this.f14762b.setOnSeekBarChangeListener(this.f14775o);
        this.f14763c.setOnSeekBarChangeListener(this.f14776p);
        this.f14764d.setOnCheckedChangeListener(this);
        this.f14765e.setOnCheckedChangeListener(this);
        this.f14767g = (AudioManager) context.getSystemService("audio");
        m12546g();
        m12545f();
    }

    /* renamed from: e */
    public final void m12544e(int i10) {
        Window window = ((Activity) this.f14761a).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        float f10 = (i10 * 1.0f) / 100.0f;
        attributes.screenBrightness = f10;
        if (f10 > 1.0f) {
            attributes.screenBrightness = 1.0f;
        }
        if (attributes.screenBrightness <= 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        window.setAttributes(attributes);
        this.f14763c.setProgress(i10);
    }

    /* renamed from: f */
    public final void m12545f() {
        Window window = ((Activity) this.f14761a).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.screenBrightness == -1.0f) {
            attributes.screenBrightness = m12542c((Activity) this.f14761a);
            window.setAttributes(attributes);
            float f10 = attributes.screenBrightness;
            if (f10 == -1.0f) {
                this.f14763c.setProgress(100);
            } else {
                this.f14763c.setProgress((int) (f10 * 100.0f));
            }
        }
    }

    /* renamed from: g */
    public final void m12546g() {
        this.f14762b.setProgress((int) ((this.f14767g.getStreamVolume(3) / this.f14767g.getStreamMaxVolume(3)) * this.f14762b.getMax()));
    }

    /* renamed from: h */
    public void m12547h(int i10) {
        if (i10 == 1) {
            this.f14773m.setVisibility(0);
            this.f14774n.setVisibility(0);
        } else {
            this.f14773m.setVisibility(8);
            this.f14774n.setVisibility(8);
        }
    }

    /* renamed from: i */
    public final void m12548i(int i10) {
        AudioManager audioManager;
        float max = i10 / this.f14762b.getMax();
        if (max < 0.0f || max > 1.0f || (audioManager = this.f14767g) == null) {
            return;
        }
        this.f14767g.setStreamVolume(3, (int) (max * audioManager.getStreamMaxVolume(3)), 0);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.getId() == R$id.superplayer_switch_mirror) {
            InterfaceC8187c interfaceC8187c = this.f14766f;
            if (interfaceC8187c != null) {
                interfaceC8187c.mo12462e(z10);
                return;
            }
            return;
        }
        if (compoundButton.getId() == R$id.superplayer_switch_accelerate) {
            C8161a c8161aM12416a = C8161a.m12416a();
            boolean z11 = !c8161aM12416a.f14591c;
            c8161aM12416a.f14591c = z11;
            this.f14765e.setChecked(z11);
            InterfaceC8187c interfaceC8187c2 = this.f14766f;
            if (interfaceC8187c2 != null) {
                interfaceC8187c2.mo12460c(c8161aM12416a.f14591c);
            }
        }
    }

    public void setCallback(InterfaceC8187c interfaceC8187c) {
        this.f14766f = interfaceC8187c;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        InterfaceC8187c interfaceC8187c;
        super.setVisibility(i10);
        if (i10 != 0 || (interfaceC8187c = this.f14766f) == null) {
            return;
        }
        float speed = interfaceC8187c.getSpeed();
        if (speed == 1.0f) {
            this.f14769i.setChecked(true);
            return;
        }
        if (speed == 1.25f) {
            this.f14770j.setChecked(true);
            return;
        }
        if (speed == 1.5f) {
            this.f14771k.setChecked(true);
        } else if (speed == 2.0f) {
            this.f14772l.setChecked(true);
        } else {
            this.f14769i.setChecked(true);
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i10) {
        if (i10 == R$id.superplayer_rb_speed1) {
            this.f14769i.setChecked(true);
            InterfaceC8187c interfaceC8187c = this.f14766f;
            if (interfaceC8187c != null) {
                interfaceC8187c.mo12458a(1.0f);
                return;
            }
            return;
        }
        if (i10 == R$id.superplayer_rb_speed125) {
            this.f14770j.setChecked(true);
            InterfaceC8187c interfaceC8187c2 = this.f14766f;
            if (interfaceC8187c2 != null) {
                interfaceC8187c2.mo12458a(1.25f);
                return;
            }
            return;
        }
        if (i10 == R$id.superplayer_rb_speed15) {
            this.f14771k.setChecked(true);
            InterfaceC8187c interfaceC8187c3 = this.f14766f;
            if (interfaceC8187c3 != null) {
                interfaceC8187c3.mo12458a(1.5f);
                return;
            }
            return;
        }
        if (i10 == R$id.superplayer_rb_speed2) {
            this.f14772l.setChecked(true);
            InterfaceC8187c interfaceC8187c4 = this.f14766f;
            if (interfaceC8187c4 != null) {
                interfaceC8187c4.mo12458a(2.0f);
            }
        }
    }
}
