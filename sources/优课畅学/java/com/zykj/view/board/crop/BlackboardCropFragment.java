package com.zykj.view.board.crop;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.crop.CropManager;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$drawable;
import com.zykj.view.R$string;
import com.zykj.view.board.crop.BlackboardCropFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardCropBinding;
import com.zykj.view.widget.DoubleSeekBar;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0027a;
import p007a6.C0041o;
import p123h7.C8736p;
import p221q5.C9802a;
import p265u5.DialogC10189d;
import p296x3.InterfaceC10495c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class BlackboardCropFragment extends Fragment {

    /* renamed from: a */
    public boolean f15133a;

    /* renamed from: b */
    public String f15134b = "00:00";

    /* renamed from: c */
    public String f15135c = "00:00";

    /* renamed from: d */
    public CropManager f15136d;

    /* renamed from: e */
    public DialogC10189d f15137e;

    /* renamed from: f */
    public C9802a f15138f;

    /* renamed from: g */
    public MergeSketchPlayView f15139g;

    /* renamed from: h */
    public String f15140h;

    /* renamed from: i */
    public ViewFragmentBlackboardCropBinding f15141i;

    /* renamed from: j */
    public ProgressDialog f15142j;

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$a */
    public static final /* synthetic */ class C8229a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15143a;

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
            f15143a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$b */
    public static final class C8230b implements DoubleSeekBar.InterfaceC8260b {
        public C8230b() {
        }

        /* renamed from: g */
        public static final C8736p m12978g(final BlackboardCropFragment blackboardCropFragment, int i10) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new Runnable() { // from class: q5.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C8230b.m12979h(blackboardCropFragment);
                    }
                });
            }
            return C8736p.f16368a;
        }

        /* renamed from: h */
        public static final void m12979h(BlackboardCropFragment blackboardCropFragment) {
            blackboardCropFragment.m12971F();
        }

        /* renamed from: i */
        public static final C8736p m12980i(Throwable it) {
            AbstractC9133u.m16133g(it, "it");
            return C8736p.f16368a;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8260b
        /* renamed from: a */
        public void mo12981a(DoubleSeekBar seekBar) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                CropManager cropManager = BlackboardCropFragment.this.f15136d;
                if (cropManager == null) {
                    AbstractC9133u.m16151y("cropManager");
                    cropManager = null;
                }
                seekBar.setProgress(cropManager.calculateRecentTime((long) seekBar.getProgress()));
                seekBar.setMaskProgress(seekBar.getProgress());
            }
            BlackboardCropFragment.this.f15134b = C0041o.f109a.m114a((long) seekBar.getMaskProgress());
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15341f.setText(BlackboardCropFragment.this.f15134b + "/" + BlackboardCropFragment.this.f15135c);
            BlackboardCropFragment.m12949e0(BlackboardCropFragment.this, null, false, 3, null);
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f15139g;
            if (mergeSketchPlayView != null) {
                int progress = (int) seekBar.getProgress();
                final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                mergeSketchPlayView.m9533m(progress, new InterfaceC10570l() { // from class: q5.v
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C8230b.m12978g(blackboardCropFragment, ((Integer) obj).intValue());
                    }
                }, new InterfaceC10570l() { // from class: q5.w
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C8230b.m12980i((Throwable) obj);
                    }
                });
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8260b
        /* renamed from: b */
        public void mo12982b(DoubleSeekBar seekBar, float f10) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            BlackboardCropFragment.this.f15134b = C0041o.f109a.m114a((long) f10);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15341f.setText(BlackboardCropFragment.this.f15134b + "/" + BlackboardCropFragment.this.f15135c);
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8260b
        /* renamed from: c */
        public void mo12983c(DoubleSeekBar seekBar) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f15139g;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.m9529i();
            }
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$c */
    public static final class C8231c implements DoubleSeekBar.InterfaceC8259a {
        public C8231c() {
        }

        /* renamed from: g */
        public static final C8736p m12987g(final BlackboardCropFragment blackboardCropFragment, int i10) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new Runnable() { // from class: q5.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C8231c.m12988h(blackboardCropFragment);
                    }
                });
            }
            return C8736p.f16368a;
        }

        /* renamed from: h */
        public static final void m12988h(BlackboardCropFragment blackboardCropFragment) {
            blackboardCropFragment.m12971F();
        }

        /* renamed from: i */
        public static final C8736p m12989i(Throwable it) {
            AbstractC9133u.m16133g(it, "it");
            return C8736p.f16368a;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8259a
        /* renamed from: a */
        public void mo12990a(DoubleSeekBar seekBar) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            CropManager cropManager = BlackboardCropFragment.this.f15136d;
            if (cropManager == null) {
                AbstractC9133u.m16151y("cropManager");
                cropManager = null;
            }
            seekBar.setMaskProgress(cropManager.calculateRecentTime((long) seekBar.getMaskProgress()));
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                seekBar.setProgress(seekBar.getMaskProgress());
                BlackboardCropFragment.this.f15134b = C0041o.f109a.m114a((long) seekBar.getMaskProgress());
                ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
                if (viewFragmentBlackboardCropBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentBlackboardCropBinding = null;
                }
                viewFragmentBlackboardCropBinding.f15341f.setText(BlackboardCropFragment.this.f15134b + "/" + BlackboardCropFragment.this.f15135c);
                BlackboardCropFragment.m12949e0(BlackboardCropFragment.this, null, false, 3, null);
                MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f15139g;
                if (mergeSketchPlayView != null) {
                    int progress = (int) seekBar.getProgress();
                    final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                    mergeSketchPlayView.m9533m(progress, new InterfaceC10570l() { // from class: q5.y
                        @Override // p300x7.InterfaceC10570l
                        public final Object invoke(Object obj) {
                            return BlackboardCropFragment.C8231c.m12987g(blackboardCropFragment, ((Integer) obj).intValue());
                        }
                    }, new InterfaceC10570l() { // from class: q5.z
                        @Override // p300x7.InterfaceC10570l
                        public final Object invoke(Object obj) {
                            return BlackboardCropFragment.C8231c.m12989i((Throwable) obj);
                        }
                    });
                }
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8259a
        /* renamed from: b */
        public void mo12991b(DoubleSeekBar seekBar, float f10) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8259a
        /* renamed from: c */
        public void mo12992c(DoubleSeekBar seekBar) {
            AbstractC9133u.m16133g(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f15139g;
            if ((mergeSketchPlayView != null ? mergeSketchPlayView.m9536p() : null) != PlayStatus.RECORD_START) {
                MergeSketchPlayView mergeSketchPlayView2 = BlackboardCropFragment.this.f15139g;
                if ((mergeSketchPlayView2 != null ? mergeSketchPlayView2.m9536p() : null) != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            MergeSketchPlayView mergeSketchPlayView3 = BlackboardCropFragment.this.f15139g;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.m9529i();
            }
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$d */
    public static final class C8232d implements InterfaceC10495c {
        public C8232d() {
        }

        /* renamed from: g */
        public static final void m12998g(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.selector_btn_music_play);
        }

        /* renamed from: h */
        public static final void m12999h(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.selector_btn_music_play);
        }

        /* renamed from: i */
        public static final void m13000i(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: j */
        public static final void m13001j(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: k */
        public static final void m13002k(BlackboardCropFragment blackboardCropFragment, long j10) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = null;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f15338c.setProgress(j10);
            blackboardCropFragment.f15134b = C0041o.f109a.m114a(j10);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding2 = viewFragmentBlackboardCropBinding3;
            }
            viewFragmentBlackboardCropBinding2.f15341f.setText(blackboardCropFragment.f15134b + "/" + blackboardCropFragment.f15135c);
        }

        @Override // p296x3.InterfaceC10495c
        /* renamed from: a */
        public void mo13003a() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f15337b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: q5.b0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C8232d.m13001j(blackboardCropFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onPlayEnd() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f15337b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: q5.d0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C8232d.m12998g(blackboardCropFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onPlayPause() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f15337b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: q5.c0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C8232d.m12999h(blackboardCropFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onPlayStart() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f15337b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: q5.f0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C8232d.m13000i(blackboardCropFragment);
                }
            });
        }

        @Override // p296x3.InterfaceC10495c
        public void onProgress(final long j10) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f15141i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            TextView textView = viewFragmentBlackboardCropBinding.f15341f;
            if (textView != null) {
                final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                textView.post(new Runnable() { // from class: q5.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C8232d.m13002k(blackboardCropFragment, j10);
                    }
                });
            }
        }
    }

    /* renamed from: G */
    private final void m12928G() {
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        this.f15137e = new DialogC10189d(contextRequireContext, 0, 2, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.f15141i;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        ImageView ivBack = viewFragmentBlackboardCropBinding2.f15336a;
        AbstractC9133u.m16132f(ivBack, "ivBack");
        AbstractC0027a.m65d(ivBack, 0L, new View.OnClickListener() { // from class: q5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m12933L(this.f19601a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.f15141i;
        if (viewFragmentBlackboardCropBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding3 = null;
        }
        viewFragmentBlackboardCropBinding3.f15337b.setOnClickListener(new View.OnClickListener() { // from class: q5.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m12935N(this.f19621a, view);
            }
        });
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = this.f15141i;
        if (viewFragmentBlackboardCropBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding4 = null;
        }
        viewFragmentBlackboardCropBinding4.f15338c.setSeekChangeListener(new C8230b());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = this.f15141i;
        if (viewFragmentBlackboardCropBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding5 = null;
        }
        viewFragmentBlackboardCropBinding5.f15338c.setMaskChangeListener(new C8231c());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = this.f15141i;
        if (viewFragmentBlackboardCropBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        TextView tvConfirm = viewFragmentBlackboardCropBinding.f15340e;
        AbstractC9133u.m16132f(tvConfirm, "tvConfirm");
        AbstractC0027a.m65d(tvConfirm, 0L, new View.OnClickListener() { // from class: q5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m12929H(this.f19622a, view);
            }
        }, 1, null);
    }

    /* renamed from: H */
    public static final void m12929H(final BlackboardCropFragment blackboardCropFragment, View view) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
        DialogC10189d dialogC10189d = null;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        final boolean z10 = ((long) viewFragmentBlackboardCropBinding.f15338c.getMaskProgress()) == 0;
        String str = z10 ? "确定要删除全部微课吗，删除后无法恢复" : "即将删除选中内容，删除后无法恢复";
        DialogC10189d dialogC10189d2 = blackboardCropFragment.f15137e;
        if (dialogC10189d2 == null) {
            AbstractC9133u.m16151y("tipDialog");
        } else {
            dialogC10189d = dialogC10189d2;
        }
        dialogC10189d.m19049g(str, true, new InterfaceC10559a() { // from class: q5.o
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BlackboardCropFragment.m12930I(this.f19623a, z10);
            }
        }, true);
    }

    /* renamed from: I */
    public static final C8736p m12930I(final BlackboardCropFragment blackboardCropFragment, final boolean z10) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        m12949e0(blackboardCropFragment, null, false, 3, null);
        CropManager cropManager = blackboardCropFragment.f15136d;
        if (cropManager == null) {
            AbstractC9133u.m16151y("cropManager");
            cropManager = null;
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding2;
        }
        cropManager.cropByTime((long) viewFragmentBlackboardCropBinding.f15338c.getMaskProgress(), new InterfaceC10570l() { // from class: q5.e
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BlackboardCropFragment.m12931J(this.f19607a, z10, (String) obj);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: J */
    public static final C8736p m12931J(final BlackboardCropFragment blackboardCropFragment, final boolean z10, String e10) {
        AbstractC9133u.m16133g(e10, "e");
        if (e10.length() > 0) {
            ToastUtils.m2403s(e10, new Object[0]);
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f15340e.post(new Runnable() { // from class: q5.j
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardCropFragment.m12932K(this.f19617a, z10);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: K */
    public static final void m12932K(BlackboardCropFragment blackboardCropFragment, boolean z10) {
        InterfaceC10570l interfaceC10570lM18355b;
        blackboardCropFragment.m12971F();
        C9802a c9802a = blackboardCropFragment.f15138f;
        if (c9802a == null || (interfaceC10570lM18355b = c9802a.m18355b()) == null) {
            return;
        }
        interfaceC10570lM18355b.invoke(Boolean.valueOf(z10));
    }

    /* renamed from: L */
    public static final void m12933L(final BlackboardCropFragment blackboardCropFragment, View view) {
        InterfaceC10559a interfaceC10559aM18354a;
        C9802a c9802a = blackboardCropFragment.f15138f;
        if (c9802a == null || (interfaceC10559aM18354a = c9802a.m18354a()) == null) {
            interfaceC10559aM18354a = new InterfaceC10559a() { // from class: q5.p
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BlackboardCropFragment.m12934M(this.f19625a);
                }
            };
        }
        interfaceC10559aM18354a.invoke();
    }

    /* renamed from: M */
    public static final C8736p m12934M(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C8736p.f16368a;
    }

    /* renamed from: N */
    public static final void m12935N(final BlackboardCropFragment blackboardCropFragment, View view) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        PlayStatus playStatusM9536p = mergeSketchPlayView != null ? mergeSketchPlayView.m9536p() : null;
        int i10 = playStatusM9536p == null ? -1 : C8229a.f15143a[playStatusM9536p.ordinal()];
        if (i10 == 1) {
            MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.f15139g;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.m9529i();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding2 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding2;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 2) {
            MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.f15139g;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.m9529i();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding3;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 3) {
            MergeSketchPlayView mergeSketchPlayView4 = blackboardCropFragment.f15139g;
            if (mergeSketchPlayView4 != null) {
                mergeSketchPlayView4.m9532l();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding4 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding4;
            }
            viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i10 != 4) {
            return;
        }
        m12949e0(blackboardCropFragment, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView5 = blackboardCropFragment.f15139g;
        if (mergeSketchPlayView5 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding5 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding5 = null;
            }
            mergeSketchPlayView5.m9533m((int) viewFragmentBlackboardCropBinding5.f15338c.getMaskProgress(), new InterfaceC10570l() { // from class: q5.q
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m12936O(this.f19626a, ((Integer) obj).intValue());
                }
            }, new InterfaceC10570l() { // from class: q5.r
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m12938Q((Throwable) obj);
                }
            });
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        viewFragmentBlackboardCropBinding.f15337b.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: O */
    public static final C8736p m12936O(final BlackboardCropFragment blackboardCropFragment, int i10) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.post(new Runnable() { // from class: q5.c
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.m12937P(this.f19603a);
                }
            });
        }
        return C8736p.f16368a;
    }

    /* renamed from: P */
    public static final void m12937P(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.m12971F();
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.m9532l();
        }
    }

    /* renamed from: Q */
    public static final C8736p m12938Q(Throwable it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: S */
    public static final C8736p m12939S(final BlackboardCropFragment blackboardCropFragment, final int i10) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        String path = mergeSketchPlayView != null ? mergeSketchPlayView.getPath() : null;
        AbstractC9133u.m16130d(path);
        blackboardCropFragment.f15136d = new CropManager(path);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        DoubleSeekBar doubleSeekBar = viewFragmentBlackboardCropBinding2.f15338c;
        CropManager cropManager = blackboardCropFragment.f15136d;
        if (cropManager == null) {
            AbstractC9133u.m16151y("cropManager");
            cropManager = null;
        }
        doubleSeekBar.setKeyPointList(cropManager.getCommandDelayTimeList());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding3;
        }
        viewFragmentBlackboardCropBinding.f15341f.post(new Runnable() { // from class: q5.f
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardCropFragment.m12940T(i10, blackboardCropFragment);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: T */
    public static final void m12940T(int i10, final BlackboardCropFragment blackboardCropFragment) {
        DialogC10189d dialogC10189d;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        if (i10 <= 0) {
            DialogC10189d dialogC10189d2 = blackboardCropFragment.f15137e;
            if (dialogC10189d2 == null) {
                AbstractC9133u.m16151y("tipDialog");
                dialogC10189d = null;
            } else {
                dialogC10189d = dialogC10189d2;
            }
            String string = blackboardCropFragment.getString(R$string.crop_duration_no_support);
            AbstractC9133u.m16132f(string, "getString(...)");
            DialogC10189d.m19048h(dialogC10189d, string, false, new InterfaceC10559a() { // from class: q5.i
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BlackboardCropFragment.m12943W(this.f19616a);
                }
            }, false, 8, null);
            blackboardCropFragment.m12971F();
            return;
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        viewFragmentBlackboardCropBinding2.f15338c.setMax(i10);
        C0041o c0041o = C0041o.f109a;
        blackboardCropFragment.f15135c = c0041o.m114a(i10);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding3 = null;
        }
        viewFragmentBlackboardCropBinding3.f15341f.setText(blackboardCropFragment.f15134b + "/" + blackboardCropFragment.f15135c);
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f15139g;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.m9523a(blackboardCropFragment.new C8232d());
        }
        blackboardCropFragment.f15133a = true;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding4 = null;
        }
        viewFragmentBlackboardCropBinding4.f15337b.setImageResource(R$drawable.selector_btn_music_play);
        MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.f15139g;
        if (mergeSketchPlayView2 != null) {
            mergeSketchPlayView2.m9529i();
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding5 = null;
        }
        DoubleSeekBar doubleSeekBar = viewFragmentBlackboardCropBinding5.f15338c;
        CropManager cropManager = blackboardCropFragment.f15136d;
        if (cropManager == null) {
            AbstractC9133u.m16151y("cropManager");
            cropManager = null;
        }
        doubleSeekBar.setMaskProgress(cropManager.calculateRecentTime(0L));
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding6 = null;
        }
        DoubleSeekBar doubleSeekBar2 = viewFragmentBlackboardCropBinding6.f15338c;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding7 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding7 = null;
        }
        doubleSeekBar2.setProgress(viewFragmentBlackboardCropBinding7.f15338c.getMaskProgress());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding8 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding8 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding8 = null;
        }
        blackboardCropFragment.f15134b = c0041o.m114a((long) viewFragmentBlackboardCropBinding8.f15338c.getMaskProgress());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding9 = blackboardCropFragment.f15141i;
        if (viewFragmentBlackboardCropBinding9 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding9 = null;
        }
        viewFragmentBlackboardCropBinding9.f15341f.setText(blackboardCropFragment.f15134b + "/" + blackboardCropFragment.f15135c);
        MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.f15139g;
        if (mergeSketchPlayView3 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding10 = blackboardCropFragment.f15141i;
            if (viewFragmentBlackboardCropBinding10 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding10;
            }
            mergeSketchPlayView3.m9533m((int) viewFragmentBlackboardCropBinding.f15338c.getProgress(), new InterfaceC10570l() { // from class: q5.g
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m12941U(this.f19614a, ((Integer) obj).intValue());
                }
            }, new InterfaceC10570l() { // from class: q5.h
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m12942V(this.f19615a, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: U */
    public static final C8736p m12941U(BlackboardCropFragment blackboardCropFragment, int i10) {
        blackboardCropFragment.m12971F();
        return C8736p.f16368a;
    }

    /* renamed from: V */
    public static final C8736p m12942V(BlackboardCropFragment blackboardCropFragment, Throwable it) {
        AbstractC9133u.m16133g(it, "it");
        blackboardCropFragment.m12971F();
        return C8736p.f16368a;
    }

    /* renamed from: W */
    public static final C8736p m12943W(final BlackboardCropFragment blackboardCropFragment) {
        InterfaceC10559a interfaceC10559aM18357d;
        C9802a c9802a = blackboardCropFragment.f15138f;
        if (c9802a == null || (interfaceC10559aM18357d = c9802a.m18357d()) == null) {
            interfaceC10559aM18357d = new InterfaceC10559a() { // from class: q5.l
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BlackboardCropFragment.m12944X(this.f19620a);
                }
            };
        }
        interfaceC10559aM18357d.invoke();
        return C8736p.f16368a;
    }

    /* renamed from: X */
    public static final C8736p m12944X(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C8736p.f16368a;
    }

    /* renamed from: Y */
    public static final C8736p m12945Y(Throwable it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: Z */
    public static final void m12946Z(final BlackboardCropFragment blackboardCropFragment) {
        DialogC10189d dialogC10189d = blackboardCropFragment.f15137e;
        if (dialogC10189d == null) {
            AbstractC9133u.m16151y("tipDialog");
            dialogC10189d = null;
        }
        String string = blackboardCropFragment.getString(R$string.crop_version_no_support);
        AbstractC9133u.m16132f(string, "getString(...)");
        DialogC10189d.m19048h(dialogC10189d, string, false, new InterfaceC10559a() { // from class: q5.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BlackboardCropFragment.m12947a0(this.f19605a);
            }
        }, false, 8, null);
    }

    /* renamed from: a0 */
    public static final C8736p m12947a0(final BlackboardCropFragment blackboardCropFragment) {
        InterfaceC10559a interfaceC10559aM18356c;
        C9802a c9802a = blackboardCropFragment.f15138f;
        if (c9802a == null || (interfaceC10559aM18356c = c9802a.m18356c()) == null) {
            interfaceC10559aM18356c = new InterfaceC10559a() { // from class: q5.k
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BlackboardCropFragment.m12948b0(this.f19619a);
                }
            };
        }
        interfaceC10559aM18356c.invoke();
        return C8736p.f16368a;
    }

    /* renamed from: b0 */
    public static final C8736p m12948b0(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C8736p.f16368a;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m12949e0(BlackboardCropFragment blackboardCropFragment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = blackboardCropFragment.getString(R$string.progress_content);
            AbstractC9133u.m16132f(str, "getString(...)");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        blackboardCropFragment.m12974d0(str, z10);
    }

    /* renamed from: F */
    public final void m12971F() {
        ProgressDialog progressDialog = this.f15142j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f15142j = null;
    }

    /* renamed from: R */
    public final void m12972R(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f15140h = path;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        this.f15139g = new MergeSketchPlayView(contextRequireContext, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.f15141i;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f15339d.addView(this.f15139g);
        MergeSketchPlayView mergeSketchPlayView = this.f15139g;
        AbstractC9133u.m16130d(mergeSketchPlayView);
        MergeSketchPlayView mergeSketchPlayView2 = this.f15139g;
        AbstractC9133u.m16130d(mergeSketchPlayView2);
        ViewGroup.LayoutParams layoutParams = mergeSketchPlayView2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        mergeSketchPlayView.setLayoutParams(layoutParams);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.f15141i;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        if (viewFragmentBlackboardCropBinding2.f15339d.getChildCount() == 2) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.f15141i;
            if (viewFragmentBlackboardCropBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardCropBinding3 = null;
            }
            viewFragmentBlackboardCropBinding3.f15339d.removeViewAt(0);
        }
        if (!new File(path, SourceSave.PAGE_ROUTER_FILE_NAME).exists()) {
            MergeSketchPlayView mergeSketchPlayView3 = this.f15139g;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.post(new Runnable() { // from class: q5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.m12946Z(this.f19628a);
                    }
                });
                return;
            }
            return;
        }
        m12949e0(this, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView4 = this.f15139g;
        if (mergeSketchPlayView4 != null) {
            mergeSketchPlayView4.m9528h(path, new InterfaceC10570l() { // from class: q5.s
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m12939S(this.f19627a, ((Integer) obj).intValue());
                }
            }, new InterfaceC10570l() { // from class: q5.t
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m12945Y((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: c0 */
    public final void m12973c0(C9802a blackboardCropConfig) {
        AbstractC9133u.m16133g(blackboardCropConfig, "blackboardCropConfig");
        this.f15138f = blackboardCropConfig;
    }

    /* renamed from: d0 */
    public final void m12974d0(String tips, boolean z10) {
        AbstractC9133u.m16133g(tips, "tips");
        ProgressDialog progressDialog = this.f15142j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f15142j = ProgressDialog.show(requireContext(), "", tips, false, z10);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m12928G();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBindingM13260a = ViewFragmentBlackboardCropBinding.m13260a(inflater);
        AbstractC9133u.m16130d(viewFragmentBlackboardCropBindingM13260a);
        this.f15141i = viewFragmentBlackboardCropBindingM13260a;
        View root = viewFragmentBlackboardCropBindingM13260a.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m12971F();
        if (this.f15133a) {
            MergeSketchPlayView mergeSketchPlayView = this.f15139g;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.m9529i();
            }
            MergeSketchPlayView mergeSketchPlayView2 = this.f15139g;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.m9530j();
            }
            MergeSketchPlayView mergeSketchPlayView3 = this.f15139g;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.m9527g();
            }
        }
        this.f15133a = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        MergeSketchPlayView mergeSketchPlayView;
        super.onHiddenChanged(z10);
        if (isAdded() && z10 && (mergeSketchPlayView = this.f15139g) != null) {
            mergeSketchPlayView.m9529i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        MergeSketchPlayView mergeSketchPlayView;
        super.onPause();
        if (!this.f15133a || (mergeSketchPlayView = this.f15139g) == null) {
            return;
        }
        mergeSketchPlayView.m9529i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        MergeSketchPlayView mergeSketchPlayView;
        super.onResume();
        if (!this.f15133a || (mergeSketchPlayView = this.f15139g) == null) {
            return;
        }
        mergeSketchPlayView.m9529i();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        MergeSketchPlayView mergeSketchPlayView;
        super.setUserVisibleHint(z10);
        if (!isAdded() || z10 || (mergeSketchPlayView = this.f15139g) == null) {
            return;
        }
        mergeSketchPlayView.m9529i();
    }
}
