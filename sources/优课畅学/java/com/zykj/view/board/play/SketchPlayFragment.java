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
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.timepicker.TimeModel;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$drawable;
import com.zykj.view.R$string;
import com.zykj.view.board.play.SketchPlayFragment;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import com.zykj.view.widget.SketchProgressView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import kotlinx.coroutines.InterfaceC9212n;
import p007a6.AbstractC0027a;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p243s5.C10014a;
import p243s5.C10019c0;
import p243s5.C10020d;
import p243s5.C10023f;
import p243s5.C10024g;
import p243s5.C10025h;
import p296x3.InterfaceC10495c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@SuppressLint({"SetTextI18n"})
/* loaded from: classes5.dex */
public final class SketchPlayFragment extends Fragment {

    /* renamed from: s */
    public static final C8236a f15165s = new C8236a(null);

    /* renamed from: a */
    public C10014a f15166a;

    /* renamed from: d */
    public boolean f15169d;

    /* renamed from: h */
    public boolean f15173h;

    /* renamed from: i */
    public int f15174i;

    /* renamed from: j */
    public C10023f f15175j;

    /* renamed from: k */
    public C10020d f15176k;

    /* renamed from: l */
    public ViewFragmentSketchPlayBinding f15177l;

    /* renamed from: m */
    public InterfaceC10574p f15178m;

    /* renamed from: n */
    public InterfaceC10559a f15179n;

    /* renamed from: o */
    public final ActivityResultLauncher f15180o;

    /* renamed from: p */
    public final InterfaceC8724d f15181p;

    /* renamed from: q */
    public InterfaceC9212n f15182q;

    /* renamed from: r */
    public ProgressDialog f15183r;

    /* renamed from: b */
    public ArrayList f15167b = new ArrayList();

    /* renamed from: c */
    public C10025h f15168c = new C10025h(false, false, false, false, null, null, null, 127, null);

    /* renamed from: e */
    public String f15170e = "00:00";

    /* renamed from: f */
    public String f15171f = "00:00";

    /* renamed from: g */
    public int f15172g = -1;

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$a */
    public static final class C8236a {
        public /* synthetic */ C8236a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final String m13147a(long j10) {
            long j11 = 60000;
            long j12 = j10 / j11;
            long j13 = (j10 - (j11 * j12)) / 1000;
            StringBuffer stringBuffer = new StringBuffer();
            if (j12 >= 0) {
                C9114c0 c9114c0 = C9114c0.f17482a;
                String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
                AbstractC9133u.m16132f(str, "format(...)");
                stringBuffer.append(str + ":");
            }
            if (j13 >= 0) {
                C9114c0 c9114c02 = C9114c0.f17482a;
                String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
                AbstractC9133u.m16132f(str2, "format(...)");
                stringBuffer.append(str2);
            }
            String string = stringBuffer.toString();
            AbstractC9133u.m16132f(string, "toString(...)");
            return string;
        }

        public C8236a() {
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$b */
    public static final /* synthetic */ class C8237b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15184a;

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
            f15184a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$c */
    public static final class C8238c implements IAreaMoveListener {
        public C8238c() {
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onHorizontalMove(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15420f.setProgress(f10);
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onMoveEnd() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15421g.setTouchable(true);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f15420f.setTouchable(true);
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onMoveStart() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15421g.setTouchable(false);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f15420f.setTouchable(false);
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onVerticalMove(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15421g.setProgress(f10);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$d */
    public static final class C8239d implements SketchProgressView.InterfaceC8263b {
        public C8239d() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        /* renamed from: a */
        public void mo67a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.m9521c(viewFragmentSketchPlayBinding.f15422h, Float.valueOf(f10), null, 2, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        /* renamed from: b */
        public void mo68b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15422h.m9525d();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.m9522f(viewFragmentSketchPlayBinding.f15422h, Float.valueOf(f10), null, 2, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$e */
    public static final class C8240e implements SketchProgressView.InterfaceC8263b {
        public C8240e() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        /* renamed from: a */
        public void mo67a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.m9521c(viewFragmentSketchPlayBinding.f15422h, null, Float.valueOf(f10), 1, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        /* renamed from: b */
        public void mo68b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15422h.m9525d();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC8263b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.m9522f(viewFragmentSketchPlayBinding.f15422h, null, Float.valueOf(f10), 1, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$f */
    public static final class C8241f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public PlayStatus f15188a;

        public C8241f() {
        }

        /* renamed from: c */
        public static final C8736p m13150c(C8241f c8241f, SketchPlayFragment sketchPlayFragment, int i10) {
            PlayStatus playStatus = c8241f.f15188a;
            if (playStatus != null && ((playStatus == PlayStatus.RECORD_START || playStatus == PlayStatus.RECORD_RESUME) && sketchPlayFragment.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED))) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                if (viewFragmentSketchPlayBinding.f15422h.m9536p() == PlayStatus.RECORD_PAUSE) {
                    sketchPlayFragment.m13141l0();
                } else if (i10 == 0) {
                    sketchPlayFragment.m13142m0();
                }
            }
            sketchPlayFragment.m13132O();
            return C8736p.f16368a;
        }

        /* renamed from: d */
        public static final C8736p m13151d(Throwable it) {
            AbstractC9133u.m16133g(it, "it");
            ToastUtils.m2403s("操作失败", new Object[0]);
            return C8736p.f16368a;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            SketchPlayFragment.this.f15170e = SketchPlayFragment.f15165s.m13147a(i10);
            SketchPlayFragment.this.f15174i = i10;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15416b.f15493f.setText(SketchPlayFragment.this.f15170e + "/" + SketchPlayFragment.this.f15171f);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            this.f15188a = viewFragmentSketchPlayBinding.f15422h.m9536p();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f15422h.m9537q();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
            SketchPlayFragment.m13112j0(SketchPlayFragment.this, null, false, 3, null);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f15422h;
            int progress = seekBar.getProgress();
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            mergeSketchPlayView.m9533m(progress, new InterfaceC10570l() { // from class: s5.v
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C8241f.m13150c(this.f20083a, sketchPlayFragment, ((Integer) obj).intValue());
                }
            }, new InterfaceC10570l() { // from class: s5.w
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C8241f.m13151d((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$g */
    public static final class C8242g implements InterfaceC10495c {
        public C8242g() {
        }

        /* renamed from: g */
        public static final void m13157g(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f15416b.f15490c.setImageResource(R$drawable.selector_btn_music_play);
                C10014a c10014a = sketchPlayFragment.f15166a;
                if (c10014a != null) {
                    c10014a.m18718h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m13158h(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f15416b.f15490c.setImageResource(R$drawable.selector_btn_music_play);
                C10014a c10014a = sketchPlayFragment.f15166a;
                if (c10014a != null) {
                    c10014a.m18718h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: i */
        public static final void m13159i(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f15416b.f15490c.setImageResource(R$drawable.selector_btn_music_pause);
                C10014a c10014a = sketchPlayFragment.f15166a;
                if (c10014a != null) {
                    c10014a.m18718h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: j */
        public static final void m13160j(SketchPlayFragment sketchPlayFragment) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15416b.f15490c.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: k */
        public static final void m13161k(SketchPlayFragment sketchPlayFragment, long j10) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f15416b.f15491d.setProgress((int) j10);
                sketchPlayFragment.f15170e = SketchPlayFragment.f15165s.m13147a(j10);
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.f15177l;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC9133u.m16151y("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                viewFragmentSketchPlayBinding2.f15416b.f15493f.setText(sketchPlayFragment.f15170e + "/" + sketchPlayFragment.f15171f);
                C10014a c10014a = sketchPlayFragment.f15166a;
                if (c10014a != null) {
                    c10014a.m18718h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // p296x3.InterfaceC10495c
        /* renamed from: a */
        public void mo13003a() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f15416b.f15490c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: s5.b0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8242g.m13160j(sketchPlayFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onPlayEnd() {
            SketchPlayFragment.this.f15173h = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f15416b.f15490c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: s5.z
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8242g.m13157g(sketchPlayFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onPlayPause() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f15416b.f15490c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: s5.x
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8242g.m13158h(sketchPlayFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onPlayStart() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f15416b.f15490c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: s5.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8242g.m13159i(sketchPlayFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onProgress(final long j10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            TextView textView = viewFragmentSketchPlayBinding.f15416b.f15493f;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            textView.post(new Runnable() { // from class: s5.y
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C8242g.m13161k(sketchPlayFragment, j10);
                }
            });
        }
    }

    public SketchPlayFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: s5.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SketchPlayFragment.m13103c0(this.f20067a, (Boolean) obj);
            }
        });
        AbstractC9133u.m16132f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f15180o = activityResultLauncherRegisterForActivityResult;
        this.f15181p = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: s5.m
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SketchPlayFragment.m13108g0(this.f20076a);
            }
        });
    }

    /* renamed from: J */
    public static /* synthetic */ void m13091J(SketchPlayFragment sketchPlayFragment, double d10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        sketchPlayFragment.m13129I(d10, z10);
    }

    /* renamed from: M */
    public static final C8736p m13092M() {
        return C8736p.f16368a;
    }

    /* renamed from: N */
    public static final C8736p m13093N() {
        return C8736p.f16368a;
    }

    /* renamed from: S */
    private final void m13094S() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f15175j = new C10023f(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        AbstractC9133u.m16132f(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.f15176k = new C10020d(fragmentActivityRequireActivity2);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f15416b.f15492e.setText("1.0X");
        m13133P();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        ImageView ivBack = viewFragmentSketchPlayBinding3.f15417c;
        AbstractC9133u.m16132f(ivBack, "ivBack");
        AbstractC0027a.m65d(ivBack, 0L, new View.OnClickListener() { // from class: s5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m13095T(this.f20077a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f15177l;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding4.f15419e;
        AbstractC9133u.m16132f(ivSetting, "ivSetting");
        AbstractC0027a.m65d(ivSetting, 0L, new View.OnClickListener() { // from class: s5.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m13096U(this.f20078a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f15177l;
        if (viewFragmentSketchPlayBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        ImageView ivRecord = viewFragmentSketchPlayBinding5.f15416b.f15490c;
        AbstractC9133u.m16132f(ivRecord, "ivRecord");
        AbstractC0027a.m65d(ivRecord, 0L, new View.OnClickListener() { // from class: s5.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m13097V(this.f20079a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f15177l;
        if (viewFragmentSketchPlayBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f15416b.f15491d.setOnSeekBarChangeListener(new C8241f());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f15177l;
        if (viewFragmentSketchPlayBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding7 = null;
        }
        TextView tvSpeedRate = viewFragmentSketchPlayBinding7.f15416b.f15492e;
        AbstractC9133u.m16132f(tvSpeedRate, "tvSpeedRate");
        AbstractC0027a.m65d(tvSpeedRate, 0L, new View.OnClickListener() { // from class: s5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m13098W(this.f20080a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.f15177l;
        if (viewFragmentSketchPlayBinding8 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding8 = null;
        }
        viewFragmentSketchPlayBinding8.f15416b.f15489b.setOnClickListener(new View.OnClickListener() { // from class: s5.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m13101Z(this.f20081a, view);
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.f15177l;
        if (viewFragmentSketchPlayBinding9 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding9;
        }
        viewFragmentSketchPlayBinding2.f15415a.setOnClickListener(new View.OnClickListener() { // from class: s5.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m13102a0(this.f20082a, view);
            }
        });
    }

    /* renamed from: T */
    public static final void m13095T(SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC10559a interfaceC10559aM18711a;
        C10014a c10014a = sketchPlayFragment.f15166a;
        if (c10014a != null) {
            if (c10014a == null || (interfaceC10559aM18711a = c10014a.m18711a()) == null) {
                return;
            }
            interfaceC10559aM18711a.invoke();
            return;
        }
        FragmentActivity activity = sketchPlayFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: U */
    public static final void m13096U(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.f15167b.isEmpty()) {
            ToastUtils.m2403s(sketchPlayFragment.getString(R$string.no_content), new Object[0]);
            return;
        }
        C10020d c10020d = sketchPlayFragment.f15176k;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (c10020d == null) {
            AbstractC9133u.m16151y("playSettingPopup");
            c10020d = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.f15177l;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding.f15419e;
        AbstractC9133u.m16132f(ivSetting, "ivSetting");
        c10020d.m18727a(ivSetting, sketchPlayFragment.f15167b);
    }

    /* renamed from: V */
    public static final void m13097V(SketchPlayFragment sketchPlayFragment, View view) {
        sketchPlayFragment.m13136b0();
    }

    /* renamed from: W */
    public static final void m13098W(final SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC10574p interfaceC10574p = sketchPlayFragment.f15178m;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (interfaceC10574p != null) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.f15177l;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            TextView tvSpeedRate = viewFragmentSketchPlayBinding.f15416b.f15492e;
            AbstractC9133u.m16132f(tvSpeedRate, "tvSpeedRate");
            interfaceC10574p.invoke(tvSpeedRate, new InterfaceC10570l() { // from class: s5.j
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.m13099X(this.f20068a, ((Double) obj).doubleValue());
                }
            });
            return;
        }
        C10023f c10023f = sketchPlayFragment.f15175j;
        if (c10023f == null) {
            AbstractC9133u.m16151y("playSpeedRatePopup");
            c10023f = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.f15177l;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        TextView tvSpeedRate2 = viewFragmentSketchPlayBinding3.f15416b.f15492e;
        AbstractC9133u.m16132f(tvSpeedRate2, "tvSpeedRate");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = sketchPlayFragment.f15177l;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
        }
        c10023f.m18730b(tvSpeedRate2, viewFragmentSketchPlayBinding.f15416b.f15492e.getText().toString(), new InterfaceC10570l() { // from class: s5.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SketchPlayFragment.m13100Y(this.f20069a, (C10019c0) obj);
            }
        });
    }

    /* renamed from: X */
    public static final C8736p m13099X(SketchPlayFragment sketchPlayFragment, double d10) {
        m13091J(sketchPlayFragment, d10, false, 2, null);
        return C8736p.f16368a;
    }

    /* renamed from: Y */
    public static final C8736p m13100Y(SketchPlayFragment sketchPlayFragment, C10019c0 it) {
        AbstractC9133u.m16133g(it, "it");
        m13091J(sketchPlayFragment, it.m18724e(), false, 2, null);
        return C8736p.f16368a;
    }

    /* renamed from: Z */
    public static final void m13101Z(SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC10570l interfaceC10570lM18735b = sketchPlayFragment.f15168c.m18735b();
        if (interfaceC10570lM18735b != null) {
            AbstractC9133u.m16130d(view);
            interfaceC10570lM18735b.invoke(view);
        }
    }

    /* renamed from: a0 */
    public static final void m13102a0(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.f15168c.m18737d()) {
            sketchPlayFragment.m13146q0();
            InterfaceC10570l interfaceC10570lM18739f = sketchPlayFragment.f15168c.m18739f();
            if (interfaceC10570lM18739f != null) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding.f15416b.f15489b;
                AbstractC9133u.m16132f(ivFullscreen, "ivFullscreen");
                interfaceC10570lM18739f.invoke(Boolean.valueOf(ivFullscreen.getVisibility() == 0));
            }
        }
    }

    /* renamed from: c0 */
    public static final void m13103c0(SketchPlayFragment sketchPlayFragment, Boolean it) {
        AbstractC9133u.m16133g(it, "it");
        if (!it.booleanValue()) {
            sketchPlayFragment.f15179n = null;
            return;
        }
        InterfaceC10559a interfaceC10559a = sketchPlayFragment.f15179n;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m13104e0(SketchPlayFragment sketchPlayFragment, String str, int i10, boolean z10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        sketchPlayFragment.m13137d0(str, i12, z10, (i11 & 8) != 0 ? null : interfaceC10570l, (i11 & 16) != 0 ? null : interfaceC10570l2);
    }

    /* renamed from: f0 */
    public static final C8736p m13106f0(SketchPlayFragment sketchPlayFragment, boolean z10, String str, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        LifecycleOwnerKt.getLifecycleScope(sketchPlayFragment).launchWhenStarted(new SketchPlayFragment$play$1$1(z10, sketchPlayFragment, str, i10, interfaceC10570l, interfaceC10570l2, null));
        return C8736p.f16368a;
    }

    /* renamed from: g0 */
    public static final C8242g m13108g0(SketchPlayFragment sketchPlayFragment) {
        return sketchPlayFragment.new C8242g();
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m13112j0(SketchPlayFragment sketchPlayFragment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sketchPlayFragment.getString(R$string.progress_content);
            AbstractC9133u.m16132f(str, "getString(...)");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        sketchPlayFragment.m13139i0(str, z10);
    }

    /* renamed from: I */
    public final void m13129I(double d10, boolean z10) {
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (!viewFragmentSketchPlayBinding.f15422h.m9534n(d10)) {
                if (z10) {
                    ToastUtils.m2403s(getString(R$string.micro_lesson_not_support_speed), new Object[0]);
                    return;
                }
                return;
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f15416b.f15492e.setText(d10 + "X");
            if (z10) {
                ToastUtils.m2403s(getString(R$string.speed_rate_change, String.valueOf(d10)), new Object[0]);
            }
        } catch (Exception unused) {
            if (z10) {
                ToastUtils.m2403s(getString(R$string.device_not_support_speed), new Object[0]);
            }
        }
    }

    /* renamed from: K */
    public final C8242g m13130K() {
        return (C8242g) this.f15181p.getValue();
    }

    /* renamed from: L */
    public final void m13131L(C10014a c10014a) {
        this.f15167b.clear();
        if (c10014a.m18716f()) {
            ArrayList arrayList = this.f15167b;
            int i10 = R$drawable.icon_play_setting_delete;
            String string = requireContext().getString(R$string.delete);
            AbstractC9133u.m16132f(string, "getString(...)");
            InterfaceC10559a interfaceC10559aM18712b = c10014a.m18712b();
            if (interfaceC10559aM18712b == null) {
                interfaceC10559aM18712b = new InterfaceC10559a() { // from class: s5.t
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return SketchPlayFragment.m13092M();
                    }
                };
            }
            arrayList.add(new C10024g(i10, string, interfaceC10559aM18712b));
        }
        if (c10014a.m18717g()) {
            ArrayList arrayList2 = this.f15167b;
            int i11 = R$drawable.icon_play_setting_record;
            String string2 = requireContext().getString(R$string.record);
            AbstractC9133u.m16132f(string2, "getString(...)");
            InterfaceC10559a interfaceC10559aM18713c = c10014a.m18713c();
            if (interfaceC10559aM18713c == null) {
                interfaceC10559aM18713c = new InterfaceC10559a() { // from class: s5.u
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return SketchPlayFragment.m13093N();
                    }
                };
            }
            arrayList2.add(new C10024g(i11, string2, interfaceC10559aM18713c));
        }
        this.f15167b.addAll(c10014a.m18714d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f15419e.setVisibility(!this.f15167b.isEmpty() ? 0 : 8);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
        }
        viewFragmentSketchPlayBinding2.f15417c.setVisibility(c10014a.m18715e() ? 0 : 8);
    }

    /* renamed from: O */
    public final void m13132O() {
        ProgressDialog progressDialog = this.f15183r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f15183r = null;
    }

    /* renamed from: P */
    public final void m13133P() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        Group groupSeekBar = viewFragmentSketchPlayBinding.f15416b.f15488a;
        AbstractC9133u.m16132f(groupSeekBar, "groupSeekBar");
        groupSeekBar.setVisibility(8);
        if (this.f15168c.m18738e()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f15416b.f15489b;
            AbstractC9133u.m16132f(ivFullscreen, "ivFullscreen");
            ivFullscreen.setVisibility(8);
        }
    }

    /* renamed from: Q */
    public final void m13134Q(int i10) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f15416b.f15491d.setMax(this.f15172g);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        viewFragmentSketchPlayBinding3.f15416b.f15491d.setProgress(i10);
        this.f15171f = f15165s.m13147a(this.f15172g);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f15177l;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        viewFragmentSketchPlayBinding4.f15416b.f15493f.setText(this.f15170e + "/" + this.f15171f);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f15177l;
        if (viewFragmentSketchPlayBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        viewFragmentSketchPlayBinding5.f15422h.m9531k(m13130K());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f15177l;
        if (viewFragmentSketchPlayBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f15422h.m9523a(m13130K());
        this.f15169d = true;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f15177l;
        if (viewFragmentSketchPlayBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
        }
        viewFragmentSketchPlayBinding2.f15416b.f15490c.setImageResource(R$drawable.selector_btn_music_play);
        m13140k0();
    }

    /* renamed from: R */
    public final void m13135R() {
        Float fValueOf = Float.valueOf(0.0f);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f15422h.setAreaMoveListener(new C8238c());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        int moveMaxWidthTimes = viewFragmentSketchPlayBinding3.f15422h.getMoveMaxWidthTimes();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f15177l;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        int moveMaxHeightTimes = viewFragmentSketchPlayBinding4.f15422h.getMoveMaxHeightTimes();
        if (moveMaxWidthTimes > 1) {
            C10014a c10014a = this.f15166a;
            if (c10014a != null && c10014a.m18719i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f15177l;
                if (viewFragmentSketchPlayBinding5 == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding5 = null;
                }
                viewFragmentSketchPlayBinding5.f15422h.m9525d();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f15177l;
                if (viewFragmentSketchPlayBinding6 == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding6 = null;
                }
                MergeSketchPlayView.m9521c(viewFragmentSketchPlayBinding6.f15422h, fValueOf, null, 2, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f15177l;
            if (viewFragmentSketchPlayBinding7 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding7 = null;
            }
            viewFragmentSketchPlayBinding7.f15420f.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.f15177l;
            if (viewFragmentSketchPlayBinding8 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding8 = null;
            }
            viewFragmentSketchPlayBinding8.f15420f.setThumbTime(1.0f / moveMaxWidthTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.f15177l;
            if (viewFragmentSketchPlayBinding9 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding9 = null;
            }
            SketchProgressView sketchProgressView = viewFragmentSketchPlayBinding9.f15420f;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding10 = this.f15177l;
            if (viewFragmentSketchPlayBinding10 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding10 = null;
            }
            sketchProgressView.setProgress(viewFragmentSketchPlayBinding10.f15422h.getMoveHorizontalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding11 = this.f15177l;
            if (viewFragmentSketchPlayBinding11 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding11 = null;
            }
            viewFragmentSketchPlayBinding11.f15420f.setVisibility(8);
        }
        if (moveMaxHeightTimes > 1) {
            C10014a c10014a2 = this.f15166a;
            if (c10014a2 != null && c10014a2.m18719i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding12 = this.f15177l;
                if (viewFragmentSketchPlayBinding12 == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding12 = null;
                }
                viewFragmentSketchPlayBinding12.f15422h.m9525d();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding13 = this.f15177l;
                if (viewFragmentSketchPlayBinding13 == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding13 = null;
                }
                MergeSketchPlayView.m9521c(viewFragmentSketchPlayBinding13.f15422h, null, fValueOf, 1, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding14 = this.f15177l;
            if (viewFragmentSketchPlayBinding14 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding14 = null;
            }
            viewFragmentSketchPlayBinding14.f15421g.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding15 = this.f15177l;
            if (viewFragmentSketchPlayBinding15 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding15 = null;
            }
            viewFragmentSketchPlayBinding15.f15421g.setThumbTime(1.0f / moveMaxHeightTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding16 = this.f15177l;
            if (viewFragmentSketchPlayBinding16 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding16 = null;
            }
            SketchProgressView sketchProgressView2 = viewFragmentSketchPlayBinding16.f15421g;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = this.f15177l;
            if (viewFragmentSketchPlayBinding17 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding17 = null;
            }
            sketchProgressView2.setProgress(viewFragmentSketchPlayBinding17.f15422h.getMoveVerticalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = this.f15177l;
            if (viewFragmentSketchPlayBinding18 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding18 = null;
            }
            viewFragmentSketchPlayBinding18.f15421g.setVisibility(8);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding19 = this.f15177l;
        if (viewFragmentSketchPlayBinding19 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding19 = null;
        }
        viewFragmentSketchPlayBinding19.f15420f.setProgressListener(new C8239d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding20 = this.f15177l;
        if (viewFragmentSketchPlayBinding20 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding20;
        }
        viewFragmentSketchPlayBinding2.f15421g.setProgressListener(new C8240e());
    }

    /* renamed from: b0 */
    public final void m13136b0() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        PlayStatus playStatusM9536p = viewFragmentSketchPlayBinding.f15422h.m9536p();
        int i10 = playStatusM9536p == null ? -1 : C8237b.f15184a[playStatusM9536p.ordinal()];
        if (i10 == 1) {
            this.f15173h = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            viewFragmentSketchPlayBinding3.f15422h.m9529i();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f15177l;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f15416b.f15490c.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 2) {
            this.f15173h = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.f15177l;
            if (viewFragmentSketchPlayBinding5 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding5 = null;
            }
            viewFragmentSketchPlayBinding5.f15422h.m9529i();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.f15177l;
            if (viewFragmentSketchPlayBinding6 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding6;
            }
            viewFragmentSketchPlayBinding2.f15416b.f15490c.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 3) {
            this.f15173h = true;
            m13141l0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.f15177l;
            if (viewFragmentSketchPlayBinding7 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
            }
            viewFragmentSketchPlayBinding2.f15416b.f15490c.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i10 != 4) {
            return;
        }
        this.f15173h = true;
        m13142m0();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.f15177l;
        if (viewFragmentSketchPlayBinding8 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding8;
        }
        viewFragmentSketchPlayBinding2.f15416b.f15490c.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: d0 */
    public final void m13137d0(final String path, final int i10, final boolean z10, final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2) {
        AbstractC9133u.m16133g(path, "path");
        this.f15179n = new InterfaceC10559a() { // from class: s5.l
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SketchPlayFragment.m13106f0(this.f20070a, z10, path, i10, interfaceC10570l2, interfaceC10570l);
            }
        };
        this.f15180o.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: h0 */
    public final void m13138h0(C10014a newPlayerConfig) {
        AbstractC9133u.m16133g(newPlayerConfig, "newPlayerConfig");
        this.f15166a = newPlayerConfig;
        if (getView() != null) {
            m13131L(newPlayerConfig);
        }
    }

    /* renamed from: i0 */
    public final void m13139i0(String tips, boolean z10) {
        AbstractC9133u.m16133g(tips, "tips");
        ProgressDialog progressDialog = this.f15183r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f15183r = ProgressDialog.show(requireContext(), "", tips, false, z10);
    }

    /* renamed from: k0 */
    public final void m13140k0() {
        if (this.f15172g > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f15416b.f15488a;
            AbstractC9133u.m16132f(groupSeekBar, "groupSeekBar");
            groupSeekBar.setVisibility(0);
            if (this.f15168c.m18738e()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC9133u.m16151y("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f15416b.f15489b;
                AbstractC9133u.m16132f(ivFullscreen, "ivFullscreen");
                ivFullscreen.setVisibility(0);
            }
        }
    }

    /* renamed from: l0 */
    public final void m13141l0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchResumePlaying$1(this, null));
    }

    /* renamed from: m0 */
    public final void m13142m0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchStartPlaying$1(this, null));
    }

    /* renamed from: n0 */
    public final void m13143n0() {
        InterfaceC9212n interfaceC9212n = this.f15182q;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f15182q = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$startControlBarJob$1(this, null));
    }

    /* renamed from: o0 */
    public final void m13144o0() {
        if (this.f15169d) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            PlayStatus playStatusM9536p = viewFragmentSketchPlayBinding.f15422h.m9536p();
            int i10 = playStatusM9536p == null ? -1 : C8237b.f15184a[playStatusM9536p.ordinal()];
            if (i10 == 3) {
                m13141l0();
            } else {
                if (i10 != 4) {
                    return;
                }
                m13142m0();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBindingM13284a = ViewFragmentSketchPlayBinding.m13284a(inflater, viewGroup, false);
        AbstractC9133u.m16132f(viewFragmentSketchPlayBindingM13284a, "inflate(...)");
        this.f15177l = viewFragmentSketchPlayBindingM13284a;
        if (viewFragmentSketchPlayBindingM13284a == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBindingM13284a = null;
        }
        View root = viewFragmentSketchPlayBindingM13284a.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m13132O();
        if (this.f15169d) {
            m13145p0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f15422h.m9530j();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f15422h.m9527g();
        }
        this.f15169d = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (isAdded() && z10) {
            m13145p0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m13145p0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f15173h) {
            m13144o0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        m13094S();
        C10014a c10014a = this.f15166a;
        if (c10014a != null) {
            m13131L(c10014a);
        }
    }

    /* renamed from: p0 */
    public final void m13145p0() {
        if (this.f15169d) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15177l;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (viewFragmentSketchPlayBinding.f15422h.m9536p() != PlayStatus.RECORD_START) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15177l;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentSketchPlayBinding3 = null;
                }
                if (viewFragmentSketchPlayBinding3.f15422h.m9536p() != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f15177l;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f15422h.m9529i();
        }
    }

    /* renamed from: q0 */
    public final void m13146q0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$toggleControlBarVisible$1(this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (!isAdded() || z10) {
            return;
        }
        m13145p0();
    }
}
