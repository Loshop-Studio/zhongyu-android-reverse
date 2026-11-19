package com.zykj.view.board.play;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.timepicker.TimeModel;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$drawable;
import com.zykj.view.R$string;
import com.zykj.view.board.play.SketchPlayFragment;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import com.zykj.view.widget.SketchProgressView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import kotlinx.coroutines.InterfaceC10045g;
import ma.InterfaceC10216d;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p264nb.C10358a;
import p264nb.C10363c0;
import p264nb.C10364d;
import p264nb.C10367f;
import p264nb.C10368g;
import p264nb.C10369h;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p378vb.AbstractC11571a;

@SuppressLint({"SetTextI18n"})
/* loaded from: classes6.dex */
public final class SketchPlayFragment extends Fragment {

    /* renamed from: v */
    public static final C8869a f20376v = new C8869a(null);

    /* renamed from: d */
    public C10358a f20377d;

    /* renamed from: g */
    public boolean f20380g;

    /* renamed from: k */
    public boolean f20384k;

    /* renamed from: l */
    public int f20385l;

    /* renamed from: m */
    public C10367f f20386m;

    /* renamed from: n */
    public C10364d f20387n;

    /* renamed from: o */
    public ViewFragmentSketchPlayBinding f20388o;

    /* renamed from: p */
    public InterfaceC9544p f20389p;

    /* renamed from: q */
    public InterfaceC9529a f20390q;

    /* renamed from: r */
    public final ActivityResultLauncher f20391r;

    /* renamed from: s */
    public final InterfaceC10773d f20392s;

    /* renamed from: t */
    public InterfaceC10045g f20393t;

    /* renamed from: u */
    public ProgressDialog f20394u;

    /* renamed from: e */
    public ArrayList f20378e = new ArrayList();

    /* renamed from: f */
    public C10369h f20379f = new C10369h(false, false, false, false, null, null, null, 127, null);

    /* renamed from: h */
    public String f20381h = "00:00";

    /* renamed from: i */
    public String f20382i = "00:00";

    /* renamed from: j */
    public int f20383j = -1;

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$a */
    public static final class C8869a {
        public /* synthetic */ C8869a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m17219a(long j10) {
            long j11 = TimeConstants.MIN;
            long j12 = j10 / j11;
            long j13 = (j10 - (j11 * j12)) / 1000;
            StringBuffer stringBuffer = new StringBuffer();
            if (j12 >= 0) {
                C9960c0 c9960c0 = C9960c0.f23411a;
                String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
                AbstractC9979u.m20293f(str, "format(...)");
                stringBuffer.append(str + ":");
            }
            if (j13 >= 0) {
                C9960c0 c9960c02 = C9960c0.f23411a;
                String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
                AbstractC9979u.m20293f(str2, "format(...)");
                stringBuffer.append(str2);
            }
            String string = stringBuffer.toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            return string;
        }

        public C8869a() {
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$b */
    public static final /* synthetic */ class C8870b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20395a;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            try {
                iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayStatus.RECORD_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayStatus.RECORD_WAIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20395a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$c */
    public static final class C8871c implements InterfaceC10216d {
        public C8871c() {
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: a */
        public void mo17143a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20631h.setProgress(f10);
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: b */
        public void mo17144b(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20632i.setProgress(f10);
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: c */
        public void mo17145c() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20632i.setTouchable(true);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f20631h.setTouchable(true);
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: d */
        public void mo17146d() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20632i.setTouchable(false);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f20631h.setTouchable(false);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$d */
    public static final class C8872d implements SketchProgressView.InterfaceC8895b {
        public C8872d() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        /* renamed from: a */
        public void mo17220a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding.f20633j, Float.valueOf(f10), null, 2, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        /* renamed from: b */
        public void mo17221b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20633j.areaMoveStart();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding.f20633j, Float.valueOf(f10), null, 2, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$e */
    public static final class C8873e implements SketchProgressView.InterfaceC8895b {
        public C8873e() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        /* renamed from: a */
        public void mo17220a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding.f20633j, null, Float.valueOf(f10), 1, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        /* renamed from: b */
        public void mo17221b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20633j.areaMoveStart();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8895b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding.f20633j, null, Float.valueOf(f10), 1, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$f */
    public static final class C8874f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: c */
        public PlayStatus f20399c;

        public C8874f() {
        }

        /* renamed from: c */
        public static final C10786q m17224c(C8874f c8874f, SketchPlayFragment sketchPlayFragment, int i10) {
            PlayStatus playStatus = c8874f.f20399c;
            if (playStatus != null && ((playStatus == PlayStatus.RECORD_START || playStatus == PlayStatus.RECORD_RESUME) && sketchPlayFragment.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED))) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                if (viewFragmentSketchPlayBinding.f20633j.status() == PlayStatus.RECORD_PAUSE) {
                    sketchPlayFragment.m17213t0();
                } else if (i10 == 0) {
                    sketchPlayFragment.m17214u0();
                }
            }
            sketchPlayFragment.m17204X();
            return C10786q.f26013a;
        }

        /* renamed from: d */
        public static final C10786q m17225d(Throwable it) {
            AbstractC9979u.m20294g(it, "it");
            ToastUtils.showShort("操作失败", new Object[0]);
            return C10786q.f26013a;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            SketchPlayFragment.this.f20381h = SketchPlayFragment.f20376v.m17219a(i10);
            SketchPlayFragment.this.f20385l = i10;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20627d.f20704h.setText(SketchPlayFragment.this.f20381h + MqttTopic.TOPIC_LEVEL_SEPARATOR + SketchPlayFragment.this.f20382i);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            this.f20399c = viewFragmentSketchPlayBinding.f20633j.status();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f20633j.waiting();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
            SketchPlayFragment.m17192r0(SketchPlayFragment.this, null, false, 3, null);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f20633j;
            int progress = seekBar.getProgress();
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            mergeSketchPlayView.seekTo(progress, new InterfaceC9540l() { // from class: nb.v
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C8874f.m17224c(this.f24721c, sketchPlayFragment, ((Integer) obj).intValue());
                }
            }, new InterfaceC9540l() { // from class: nb.w
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C8874f.m17225d((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$g */
    public static final class C8875g implements PlayStatusListener {
        public C8875g() {
        }

        /* renamed from: f */
        public static final void m17231f(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f20627d.f20701e.setImageResource(R$drawable.selector_btn_music_play);
                C10358a c10358a = sketchPlayFragment.f20377d;
                if (c10358a != null) {
                    c10358a.m21692h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: g */
        public static final void m17232g(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f20627d.f20701e.setImageResource(R$drawable.selector_btn_music_play);
                C10358a c10358a = sketchPlayFragment.f20377d;
                if (c10358a != null) {
                    c10358a.m21692h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m17233h(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f20627d.f20701e.setImageResource(R$drawable.selector_btn_music_pause);
                C10358a c10358a = sketchPlayFragment.f20377d;
                if (c10358a != null) {
                    c10358a.m21692h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: i */
        public static final void m17234i(SketchPlayFragment sketchPlayFragment) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20627d.f20701e.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: j */
        public static final void m17235j(SketchPlayFragment sketchPlayFragment, long j10) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f20627d.f20702f.setProgress((int) j10);
                sketchPlayFragment.f20381h = SketchPlayFragment.f20376v.m17219a(j10);
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.f20388o;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC9979u.m20312y("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                viewFragmentSketchPlayBinding2.f20627d.f20704h.setText(sketchPlayFragment.f20381h + MqttTopic.TOPIC_LEVEL_SEPARATOR + sketchPlayFragment.f20382i);
                C10358a c10358a = sketchPlayFragment.f20377d;
                if (c10358a != null) {
                    c10358a.m21692h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayEnd() {
            SketchPlayFragment.this.f20384k = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f20627d.f20701e;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: nb.z
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8875g.m17231f(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayPause() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f20627d.f20701e;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: nb.x
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8875g.m17232g(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayStart() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f20627d.f20701e;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: nb.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8875g.m17233h(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayWait() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f20627d.f20701e;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: nb.b0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8875g.m17234i(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onProgress(final long j10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            TextView textView = viewFragmentSketchPlayBinding.f20627d.f20704h;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            textView.post(new Runnable() { // from class: nb.y
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8875g.m17235j(sketchPlayFragment, j10);
                }
            });
        }
    }

    public SketchPlayFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: nb.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SketchPlayFragment.m17184k0(this.f24705a, (Boolean) obj);
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f20391r = activityResultLauncherRegisterForActivityResult;
        this.f20392s = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: nb.m
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return SketchPlayFragment.m17188o0(this.f24714c);
            }
        });
    }

    /* renamed from: S */
    public static /* synthetic */ void m17173S(SketchPlayFragment sketchPlayFragment, double d10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        sketchPlayFragment.m17201R(d10, z10);
    }

    /* renamed from: V */
    public static final C10786q m17174V() {
        return C10786q.f26013a;
    }

    /* renamed from: W */
    public static final C10786q m17175W() {
        return C10786q.f26013a;
    }

    /* renamed from: b0 */
    public static final void m17176b0(SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC9529a interfaceC9529aM21685a;
        C10358a c10358a = sketchPlayFragment.f20377d;
        if (c10358a != null) {
            if (c10358a == null || (interfaceC9529aM21685a = c10358a.m21685a()) == null) {
                return;
            }
            interfaceC9529aM21685a.invoke();
            return;
        }
        FragmentActivity activity = sketchPlayFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: c0 */
    public static final void m17177c0(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.f20378e.isEmpty()) {
            ToastUtils.showShort(sketchPlayFragment.getString(R$string.no_content), new Object[0]);
            return;
        }
        C10364d c10364d = sketchPlayFragment.f20387n;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (c10364d == null) {
            AbstractC9979u.m20312y("playSettingPopup");
            c10364d = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.f20388o;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding.f20630g;
        AbstractC9979u.m20293f(ivSetting, "ivSetting");
        c10364d.m21701a(ivSetting, sketchPlayFragment.f20378e);
    }

    /* renamed from: d0 */
    public static final void m17178d0(SketchPlayFragment sketchPlayFragment, View view) {
        sketchPlayFragment.m17208j0();
    }

    /* renamed from: e0 */
    public static final void m17179e0(final SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC9544p interfaceC9544p = sketchPlayFragment.f20389p;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (interfaceC9544p != null) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.f20388o;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            TextView tvSpeedRate = viewFragmentSketchPlayBinding.f20627d.f20703g;
            AbstractC9979u.m20293f(tvSpeedRate, "tvSpeedRate");
            interfaceC9544p.invoke(tvSpeedRate, new InterfaceC9540l() { // from class: nb.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.m17180f0(this.f24712c, ((Double) obj).doubleValue());
                }
            });
            return;
        }
        C10367f c10367f = sketchPlayFragment.f20386m;
        if (c10367f == null) {
            AbstractC9979u.m20312y("playSpeedRatePopup");
            c10367f = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.f20388o;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        TextView tvSpeedRate2 = viewFragmentSketchPlayBinding3.f20627d.f20703g;
        AbstractC9979u.m20293f(tvSpeedRate2, "tvSpeedRate");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = sketchPlayFragment.f20388o;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
        }
        c10367f.m21704b(tvSpeedRate2, viewFragmentSketchPlayBinding.f20627d.f20703g.getText().toString(), new InterfaceC9540l() { // from class: nb.l
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SketchPlayFragment.m17181g0(this.f24713c, (C10363c0) obj);
            }
        });
    }

    /* renamed from: f0 */
    public static final C10786q m17180f0(SketchPlayFragment sketchPlayFragment, double d10) {
        m17173S(sketchPlayFragment, d10, false, 2, null);
        return C10786q.f26013a;
    }

    /* renamed from: g0 */
    public static final C10786q m17181g0(SketchPlayFragment sketchPlayFragment, C10363c0 it) {
        AbstractC9979u.m20294g(it, "it");
        m17173S(sketchPlayFragment, it.m21698e(), false, 2, null);
        return C10786q.f26013a;
    }

    /* renamed from: h0 */
    public static final void m17182h0(SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC9540l interfaceC9540lM21709b = sketchPlayFragment.f20379f.m21709b();
        if (interfaceC9540lM21709b != null) {
            AbstractC9979u.m20291d(view);
            interfaceC9540lM21709b.invoke(view);
        }
    }

    /* renamed from: i0 */
    public static final void m17183i0(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.f20379f.m21711d()) {
            sketchPlayFragment.m17218y0();
            InterfaceC9540l interfaceC9540lM21713f = sketchPlayFragment.f20379f.m21713f();
            if (interfaceC9540lM21713f != null) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding.f20627d.f20700d;
                AbstractC9979u.m20293f(ivFullscreen, "ivFullscreen");
                interfaceC9540lM21713f.invoke(Boolean.valueOf(ivFullscreen.getVisibility() == 0));
            }
        }
    }

    private final void initView() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f20386m = new C10367f(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.f20387n = new C10364d(fragmentActivityRequireActivity2);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f20627d.f20703g.setText("1.0X");
        m17205Y();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        ImageView ivBack = viewFragmentSketchPlayBinding3.f20628e;
        AbstractC9979u.m20293f(ivBack, "ivBack");
        AbstractC11571a.m25475d(ivBack, 0L, new View.OnClickListener() { // from class: nb.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m17176b0(this.f24715c, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f20388o;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding4.f20630g;
        AbstractC9979u.m20293f(ivSetting, "ivSetting");
        AbstractC11571a.m25475d(ivSetting, 0L, new View.OnClickListener() { // from class: nb.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m17177c0(this.f24716c, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f20388o;
        if (viewFragmentSketchPlayBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        ImageView ivRecord = viewFragmentSketchPlayBinding5.f20627d.f20701e;
        AbstractC9979u.m20293f(ivRecord, "ivRecord");
        AbstractC11571a.m25475d(ivRecord, 0L, new View.OnClickListener() { // from class: nb.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m17178d0(this.f24717c, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f20388o;
        if (viewFragmentSketchPlayBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f20627d.f20702f.setOnSeekBarChangeListener(new C8874f());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f20388o;
        if (viewFragmentSketchPlayBinding7 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding7 = null;
        }
        TextView tvSpeedRate = viewFragmentSketchPlayBinding7.f20627d.f20703g;
        AbstractC9979u.m20293f(tvSpeedRate, "tvSpeedRate");
        AbstractC11571a.m25475d(tvSpeedRate, 0L, new View.OnClickListener() { // from class: nb.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m17179e0(this.f24718c, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.f20388o;
        if (viewFragmentSketchPlayBinding8 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding8 = null;
        }
        viewFragmentSketchPlayBinding8.f20627d.f20700d.setOnClickListener(new View.OnClickListener() { // from class: nb.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m17182h0(this.f24719c, view);
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.f20388o;
        if (viewFragmentSketchPlayBinding9 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding9;
        }
        viewFragmentSketchPlayBinding2.f20626c.setOnClickListener(new View.OnClickListener() { // from class: nb.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m17183i0(this.f24720c, view);
            }
        });
    }

    /* renamed from: k0 */
    public static final void m17184k0(SketchPlayFragment sketchPlayFragment, Boolean it) {
        AbstractC9979u.m20294g(it, "it");
        if (!it.booleanValue()) {
            sketchPlayFragment.f20390q = null;
            return;
        }
        InterfaceC9529a interfaceC9529a = sketchPlayFragment.f20390q;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m17185m0(SketchPlayFragment sketchPlayFragment, String str, int i10, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        sketchPlayFragment.m17209l0(str, i12, z10, (i11 & 8) != 0 ? null : interfaceC9540l, (i11 & 16) != 0 ? null : interfaceC9540l2);
    }

    /* renamed from: n0 */
    public static final C10786q m17186n0(SketchPlayFragment sketchPlayFragment, boolean z10, String str, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        LifecycleOwnerKt.getLifecycleScope(sketchPlayFragment).launchWhenStarted(new SketchPlayFragment$play$1$1(z10, sketchPlayFragment, str, i10, interfaceC9540l, interfaceC9540l2, null));
        return C10786q.f26013a;
    }

    /* renamed from: o0 */
    public static final C8875g m17188o0(SketchPlayFragment sketchPlayFragment) {
        return sketchPlayFragment.new C8875g();
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m17192r0(SketchPlayFragment sketchPlayFragment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sketchPlayFragment.getString(R$string.progress_content);
            AbstractC9979u.m20293f(str, "getString(...)");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        sketchPlayFragment.m17211q0(str, z10);
    }

    /* renamed from: R */
    public final void m17201R(double d10, boolean z10) {
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (!viewFragmentSketchPlayBinding.f20633j.setRate(d10)) {
                if (z10) {
                    ToastUtils.showShort(getString(R$string.micro_lesson_not_support_speed), new Object[0]);
                    return;
                }
                return;
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f20627d.f20703g.setText(d10 + "X");
            if (z10) {
                ToastUtils.showShort(getString(R$string.speed_rate_change, String.valueOf(d10)), new Object[0]);
            }
        } catch (Exception unused) {
            if (z10) {
                ToastUtils.showShort(getString(R$string.device_not_support_speed), new Object[0]);
            }
        }
    }

    /* renamed from: T */
    public final C8875g m17202T() {
        return (C8875g) this.f20392s.getValue();
    }

    /* renamed from: U */
    public final void m17203U(C10358a c10358a) {
        this.f20378e.clear();
        if (c10358a.m21690f()) {
            ArrayList arrayList = this.f20378e;
            int i10 = R$drawable.icon_play_setting_delete;
            String string = requireContext().getString(R$string.delete);
            AbstractC9979u.m20293f(string, "getString(...)");
            InterfaceC9529a interfaceC9529aM21686b = c10358a.m21686b();
            if (interfaceC9529aM21686b == null) {
                interfaceC9529aM21686b = new InterfaceC9529a() { // from class: nb.t
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return SketchPlayFragment.m17174V();
                    }
                };
            }
            arrayList.add(new C10368g(i10, string, interfaceC9529aM21686b));
        }
        if (c10358a.m21691g()) {
            ArrayList arrayList2 = this.f20378e;
            int i11 = R$drawable.icon_play_setting_record;
            String string2 = requireContext().getString(R$string.record);
            AbstractC9979u.m20293f(string2, "getString(...)");
            InterfaceC9529a interfaceC9529aM21687c = c10358a.m21687c();
            if (interfaceC9529aM21687c == null) {
                interfaceC9529aM21687c = new InterfaceC9529a() { // from class: nb.u
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return SketchPlayFragment.m17175W();
                    }
                };
            }
            arrayList2.add(new C10368g(i11, string2, interfaceC9529aM21687c));
        }
        this.f20378e.addAll(c10358a.m21688d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f20630g.setVisibility(!this.f20378e.isEmpty() ? 0 : 8);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
        }
        viewFragmentSketchPlayBinding2.f20628e.setVisibility(c10358a.m21689e() ? 0 : 8);
    }

    /* renamed from: X */
    public final void m17204X() {
        ProgressDialog progressDialog = this.f20394u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f20394u = null;
    }

    /* renamed from: Y */
    public final void m17205Y() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        Group groupSeekBar = viewFragmentSketchPlayBinding.f20627d.f20699c;
        AbstractC9979u.m20293f(groupSeekBar, "groupSeekBar");
        groupSeekBar.setVisibility(8);
        if (this.f20379f.m21712e()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f20627d.f20700d;
            AbstractC9979u.m20293f(ivFullscreen, "ivFullscreen");
            ivFullscreen.setVisibility(8);
        }
    }

    /* renamed from: Z */
    public final void m17206Z(int i10) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f20627d.f20702f.setMax(this.f20383j);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        viewFragmentSketchPlayBinding3.f20627d.f20702f.setProgress(i10);
        this.f20382i = f20376v.m17219a(this.f20383j);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f20388o;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        viewFragmentSketchPlayBinding4.f20627d.f20704h.setText(this.f20381h + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f20382i);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f20388o;
        if (viewFragmentSketchPlayBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        viewFragmentSketchPlayBinding5.f20633j.removePlayActionListener(m17202T());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f20388o;
        if (viewFragmentSketchPlayBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f20633j.addPlayActionListener(m17202T());
        this.f20380g = true;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f20388o;
        if (viewFragmentSketchPlayBinding7 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
        }
        viewFragmentSketchPlayBinding2.f20627d.f20701e.setImageResource(R$drawable.selector_btn_music_play);
        m17212s0();
    }

    /* renamed from: a0 */
    public final void m17207a0() {
        Float fValueOf = Float.valueOf(0.0f);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f20633j.setAreaMoveListener(new C8871c());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        int moveMaxWidthTimes = viewFragmentSketchPlayBinding3.f20633j.getMoveMaxWidthTimes();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f20388o;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        int moveMaxHeightTimes = viewFragmentSketchPlayBinding4.f20633j.getMoveMaxHeightTimes();
        if (moveMaxWidthTimes > 1) {
            C10358a c10358a = this.f20377d;
            if (c10358a != null && c10358a.m21693i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f20388o;
                if (viewFragmentSketchPlayBinding5 == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding5 = null;
                }
                viewFragmentSketchPlayBinding5.f20633j.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f20388o;
                if (viewFragmentSketchPlayBinding6 == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding6 = null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding6.f20633j, fValueOf, null, 2, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f20388o;
            if (viewFragmentSketchPlayBinding7 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding7 = null;
            }
            viewFragmentSketchPlayBinding7.f20631h.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.f20388o;
            if (viewFragmentSketchPlayBinding8 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding8 = null;
            }
            viewFragmentSketchPlayBinding8.f20631h.setThumbTime(1.0f / moveMaxWidthTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.f20388o;
            if (viewFragmentSketchPlayBinding9 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding9 = null;
            }
            SketchProgressView sketchProgressView = viewFragmentSketchPlayBinding9.f20631h;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding10 = this.f20388o;
            if (viewFragmentSketchPlayBinding10 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding10 = null;
            }
            sketchProgressView.setProgress(viewFragmentSketchPlayBinding10.f20633j.getMoveHorizontalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding11 = this.f20388o;
            if (viewFragmentSketchPlayBinding11 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding11 = null;
            }
            viewFragmentSketchPlayBinding11.f20631h.setVisibility(8);
        }
        if (moveMaxHeightTimes > 1) {
            C10358a c10358a2 = this.f20377d;
            if (c10358a2 != null && c10358a2.m21693i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding12 = this.f20388o;
                if (viewFragmentSketchPlayBinding12 == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding12 = null;
                }
                viewFragmentSketchPlayBinding12.f20633j.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding13 = this.f20388o;
                if (viewFragmentSketchPlayBinding13 == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding13 = null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding13.f20633j, null, fValueOf, 1, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding14 = this.f20388o;
            if (viewFragmentSketchPlayBinding14 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding14 = null;
            }
            viewFragmentSketchPlayBinding14.f20632i.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding15 = this.f20388o;
            if (viewFragmentSketchPlayBinding15 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding15 = null;
            }
            viewFragmentSketchPlayBinding15.f20632i.setThumbTime(1.0f / moveMaxHeightTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding16 = this.f20388o;
            if (viewFragmentSketchPlayBinding16 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding16 = null;
            }
            SketchProgressView sketchProgressView2 = viewFragmentSketchPlayBinding16.f20632i;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = this.f20388o;
            if (viewFragmentSketchPlayBinding17 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding17 = null;
            }
            sketchProgressView2.setProgress(viewFragmentSketchPlayBinding17.f20633j.getMoveVerticalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = this.f20388o;
            if (viewFragmentSketchPlayBinding18 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding18 = null;
            }
            viewFragmentSketchPlayBinding18.f20632i.setVisibility(8);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding19 = this.f20388o;
        if (viewFragmentSketchPlayBinding19 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding19 = null;
        }
        viewFragmentSketchPlayBinding19.f20631h.setProgressListener(new C8872d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding20 = this.f20388o;
        if (viewFragmentSketchPlayBinding20 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding20;
        }
        viewFragmentSketchPlayBinding2.f20632i.setProgressListener(new C8873e());
    }

    /* renamed from: j0 */
    public final void m17208j0() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.f20633j.status();
        int i10 = playStatusStatus == null ? -1 : C8870b.f20395a[playStatusStatus.ordinal()];
        if (i10 == 1) {
            this.f20384k = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            viewFragmentSketchPlayBinding3.f20633j.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f20388o;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f20627d.f20701e.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 2) {
            this.f20384k = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f20388o;
            if (viewFragmentSketchPlayBinding5 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding5 = null;
            }
            viewFragmentSketchPlayBinding5.f20633j.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f20388o;
            if (viewFragmentSketchPlayBinding6 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding6;
            }
            viewFragmentSketchPlayBinding2.f20627d.f20701e.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 3) {
            this.f20384k = true;
            m17213t0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f20388o;
            if (viewFragmentSketchPlayBinding7 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
            }
            viewFragmentSketchPlayBinding2.f20627d.f20701e.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i10 != 4) {
            return;
        }
        this.f20384k = true;
        m17214u0();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.f20388o;
        if (viewFragmentSketchPlayBinding8 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding8;
        }
        viewFragmentSketchPlayBinding2.f20627d.f20701e.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: l0 */
    public final void m17209l0(final String path, final int i10, final boolean z10, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        AbstractC9979u.m20294g(path, "path");
        this.f20390q = new InterfaceC9529a() { // from class: nb.j
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return SketchPlayFragment.m17186n0(this.f24706c, z10, path, i10, interfaceC9540l2, interfaceC9540l);
            }
        };
        this.f20391r.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBindingM17356a = ViewFragmentSketchPlayBinding.m17356a(inflater, viewGroup, false);
        AbstractC9979u.m20293f(viewFragmentSketchPlayBindingM17356a, "inflate(...)");
        this.f20388o = viewFragmentSketchPlayBindingM17356a;
        if (viewFragmentSketchPlayBindingM17356a == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBindingM17356a = null;
        }
        View root = viewFragmentSketchPlayBindingM17356a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m17204X();
        if (this.f20380g) {
            m17217x0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f20633j.release();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f20633j.destroy();
        }
        this.f20380g = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (isAdded() && z10) {
            m17217x0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m17217x0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f20384k) {
            m17216w0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        C10358a c10358a = this.f20377d;
        if (c10358a != null) {
            m17203U(c10358a);
        }
    }

    /* renamed from: p0 */
    public final void m17210p0(C10358a newPlayerConfig) {
        AbstractC9979u.m20294g(newPlayerConfig, "newPlayerConfig");
        this.f20377d = newPlayerConfig;
        if (getView() != null) {
            m17203U(newPlayerConfig);
        }
    }

    /* renamed from: q0 */
    public final void m17211q0(String tips, boolean z10) {
        AbstractC9979u.m20294g(tips, "tips");
        ProgressDialog progressDialog = this.f20394u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f20394u = ProgressDialog.show(requireContext(), "", tips, false, z10);
    }

    /* renamed from: s0 */
    public final void m17212s0() {
        if (this.f20383j > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f20627d.f20699c;
            AbstractC9979u.m20293f(groupSeekBar, "groupSeekBar");
            groupSeekBar.setVisibility(0);
            if (this.f20379f.m21712e()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC9979u.m20312y("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f20627d.f20700d;
                AbstractC9979u.m20293f(ivFullscreen, "ivFullscreen");
                ivFullscreen.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (!isAdded() || z10) {
            return;
        }
        m17217x0();
    }

    /* renamed from: t0 */
    public final void m17213t0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchResumePlaying$1(this, null));
    }

    /* renamed from: u0 */
    public final void m17214u0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchStartPlaying$1(this, null));
    }

    /* renamed from: v0 */
    public final void m17215v0() {
        InterfaceC10045g interfaceC10045g = this.f20393t;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f20393t = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$startControlBarJob$1(this, null));
    }

    /* renamed from: w0 */
    public final void m17216w0() {
        if (this.f20380g) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.f20633j.status();
            int i10 = playStatusStatus == null ? -1 : C8870b.f20395a[playStatusStatus.ordinal()];
            if (i10 == 3) {
                m17213t0();
            } else {
                if (i10 != 4) {
                    return;
                }
                m17214u0();
            }
        }
    }

    /* renamed from: x0 */
    public final void m17217x0() {
        if (this.f20380g) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20388o;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (viewFragmentSketchPlayBinding.f20633j.status() != PlayStatus.RECORD_START) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20388o;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentSketchPlayBinding3 = null;
                }
                if (viewFragmentSketchPlayBinding3.f20633j.status() != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f20388o;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f20633j.pause();
        }
    }

    /* renamed from: y0 */
    public final void m17218y0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$toggleControlBarVisible$1(this, null));
    }
}
