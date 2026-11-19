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
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$drawable;
import com.zykj.view.R$string;
import com.zykj.view.board.crop.BlackboardCropFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardCropBinding;
import com.zykj.view.widget.DoubleSeekBar;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p223ka.AbstractC9830a;
import p294pb.DialogC10643d;
import p309qc.C10786q;
import p378vb.AbstractC11571a;
import p378vb.C11585o;

/* loaded from: classes6.dex */
public final class BlackboardCropFragment extends Fragment {

    /* renamed from: d */
    public boolean f20349d;

    /* renamed from: e */
    public String f20350e = "00:00";

    /* renamed from: f */
    public String f20351f = "00:00";

    /* renamed from: g */
    public DialogC10643d f20352g;

    /* renamed from: h */
    public MergeSketchPlayView f20353h;

    /* renamed from: i */
    public ViewFragmentBlackboardCropBinding f20354i;

    /* renamed from: j */
    public ProgressDialog f20355j;

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$a */
    public static final /* synthetic */ class C8863a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20356a;

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
            f20356a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$b */
    public static final class C8864b implements DoubleSeekBar.InterfaceC8892b {
        public C8864b() {
        }

        /* renamed from: g */
        public static final C10786q m17071g(final BlackboardCropFragment blackboardCropFragment, int i10) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f20353h;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new Runnable() { // from class: lb.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C8864b.m17072h(blackboardCropFragment);
                    }
                });
            }
            return C10786q.f26013a;
        }

        /* renamed from: h */
        public static final void m17072h(BlackboardCropFragment blackboardCropFragment) {
            blackboardCropFragment.m17066E();
        }

        /* renamed from: i */
        public static final C10786q m17073i(Throwable it) {
            AbstractC9979u.m20294g(it, "it");
            return C10786q.f26013a;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8892b
        /* renamed from: a */
        public void mo17074a(DoubleSeekBar seekBar) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                BlackboardCropFragment.m17064y(BlackboardCropFragment.this);
                AbstractC9979u.m20312y("cropManager");
                seekBar.getProgress();
                throw null;
            }
            BlackboardCropFragment.this.f20350e = C11585o.f27488a.m25521a((long) seekBar.getMaskProgress());
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f20354i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f20552h.setText(BlackboardCropFragment.this.f20350e + MqttTopic.TOPIC_LEVEL_SEPARATOR + BlackboardCropFragment.this.f20351f);
            BlackboardCropFragment.m17053Q(BlackboardCropFragment.this, null, false, 3, null);
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f20353h;
            if (mergeSketchPlayView != null) {
                int progress = (int) seekBar.getProgress();
                final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                mergeSketchPlayView.seekTo(progress, new InterfaceC9540l() { // from class: lb.k
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C8864b.m17071g(blackboardCropFragment, ((Integer) obj).intValue());
                    }
                }, new InterfaceC9540l() { // from class: lb.l
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C8864b.m17073i((Throwable) obj);
                    }
                });
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8892b
        /* renamed from: b */
        public void mo17075b(DoubleSeekBar seekBar, float f10) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            BlackboardCropFragment.this.f20350e = C11585o.f27488a.m25521a((long) f10);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.f20354i;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f20552h.setText(BlackboardCropFragment.this.f20350e + MqttTopic.TOPIC_LEVEL_SEPARATOR + BlackboardCropFragment.this.f20351f);
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8892b
        /* renamed from: c */
        public void mo17076c(DoubleSeekBar seekBar) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f20353h;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.pause();
            }
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$c */
    public static final class C8865c implements DoubleSeekBar.InterfaceC8891a {
        public C8865c() {
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8891a
        /* renamed from: a */
        public void mo17077a(DoubleSeekBar seekBar) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            BlackboardCropFragment.m17064y(BlackboardCropFragment.this);
            AbstractC9979u.m20312y("cropManager");
            seekBar.getMaskProgress();
            throw null;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8891a
        /* renamed from: b */
        public void mo17078b(DoubleSeekBar seekBar, float f10) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC8891a
        /* renamed from: c */
        public void mo17079c(DoubleSeekBar seekBar) {
            AbstractC9979u.m20294g(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.f20353h;
            if ((mergeSketchPlayView != null ? mergeSketchPlayView.status() : null) != PlayStatus.RECORD_START) {
                MergeSketchPlayView mergeSketchPlayView2 = BlackboardCropFragment.this.f20353h;
                if ((mergeSketchPlayView2 != null ? mergeSketchPlayView2.status() : null) != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            MergeSketchPlayView mergeSketchPlayView3 = BlackboardCropFragment.this.f20353h;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.pause();
            }
        }
    }

    /* renamed from: F */
    public static final void m17043F(final BlackboardCropFragment blackboardCropFragment, View view) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f20354i;
        DialogC10643d dialogC10643d = null;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        final boolean z10 = ((long) viewFragmentBlackboardCropBinding.f20549e.getMaskProgress()) == 0;
        String str = z10 ? "确定要删除全部微课吗，删除后无法恢复" : "即将删除选中内容，删除后无法恢复";
        DialogC10643d dialogC10643d2 = blackboardCropFragment.f20352g;
        if (dialogC10643d2 == null) {
            AbstractC9979u.m20312y("tipDialog");
        } else {
            dialogC10643d = dialogC10643d2;
        }
        dialogC10643d.m22517g(str, true, new InterfaceC9529a() { // from class: lb.d
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BlackboardCropFragment.m17044G(this.f24217c, z10);
            }
        }, true);
    }

    /* renamed from: G */
    public static final C10786q m17044G(final BlackboardCropFragment blackboardCropFragment, final boolean z10) {
        m17053Q(blackboardCropFragment, null, false, 3, null);
        blackboardCropFragment.getClass();
        AbstractC9979u.m20312y("cropManager");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f20354i;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f20549e.getMaskProgress();
        new InterfaceC9540l() { // from class: lb.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BlackboardCropFragment.m17045H(this.f24222c, z10, (String) obj);
            }
        };
        throw null;
    }

    /* renamed from: H */
    public static final C10786q m17045H(final BlackboardCropFragment blackboardCropFragment, final boolean z10, String e10) {
        AbstractC9979u.m20294g(e10, "e");
        if (e10.length() > 0) {
            ToastUtils.showShort(e10, new Object[0]);
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.f20354i;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f20551g.post(new Runnable() { // from class: lb.j
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardCropFragment.m17046I(this.f24224c, z10);
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: I */
    public static final void m17046I(BlackboardCropFragment blackboardCropFragment, boolean z10) {
        blackboardCropFragment.m17066E();
    }

    /* renamed from: J */
    public static final void m17047J(final BlackboardCropFragment blackboardCropFragment, View view) {
        blackboardCropFragment.getClass();
        new InterfaceC9529a() { // from class: lb.e
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BlackboardCropFragment.m17048K(this.f24219c);
            }
        }.invoke();
    }

    /* renamed from: K */
    public static final C10786q m17048K(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C10786q.f26013a;
    }

    /* renamed from: L */
    public static final void m17049L(final BlackboardCropFragment blackboardCropFragment, View view) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f20353h;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        PlayStatus playStatusStatus = mergeSketchPlayView != null ? mergeSketchPlayView.status() : null;
        int i10 = playStatusStatus == null ? -1 : C8863a.f20356a[playStatusStatus.ordinal()];
        if (i10 == 1) {
            MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.f20353h;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.pause();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.f20354i;
            if (viewFragmentBlackboardCropBinding2 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding2;
            }
            viewFragmentBlackboardCropBinding.f20548d.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 2) {
            MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.f20353h;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.pause();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.f20354i;
            if (viewFragmentBlackboardCropBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding3;
            }
            viewFragmentBlackboardCropBinding.f20548d.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 3) {
            MergeSketchPlayView mergeSketchPlayView4 = blackboardCropFragment.f20353h;
            if (mergeSketchPlayView4 != null) {
                mergeSketchPlayView4.resume();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.f20354i;
            if (viewFragmentBlackboardCropBinding4 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding4;
            }
            viewFragmentBlackboardCropBinding.f20548d.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i10 != 4) {
            return;
        }
        m17053Q(blackboardCropFragment, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView5 = blackboardCropFragment.f20353h;
        if (mergeSketchPlayView5 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.f20354i;
            if (viewFragmentBlackboardCropBinding5 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardCropBinding5 = null;
            }
            mergeSketchPlayView5.seekTo((int) viewFragmentBlackboardCropBinding5.f20549e.getMaskProgress(), new InterfaceC9540l() { // from class: lb.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m17050M(this.f24220c, ((Integer) obj).intValue());
                }
            }, new InterfaceC9540l() { // from class: lb.g
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m17052O((Throwable) obj);
                }
            });
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.f20354i;
        if (viewFragmentBlackboardCropBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        viewFragmentBlackboardCropBinding.f20548d.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: M */
    public static final C10786q m17050M(final BlackboardCropFragment blackboardCropFragment, int i10) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f20353h;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.post(new Runnable() { // from class: lb.h
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.m17051N(this.f24221c);
                }
            });
        }
        return C10786q.f26013a;
    }

    /* renamed from: N */
    public static final void m17051N(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.m17066E();
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.f20353h;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.resume();
        }
    }

    /* renamed from: O */
    public static final C10786q m17052O(Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m17053Q(BlackboardCropFragment blackboardCropFragment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = blackboardCropFragment.getString(R$string.progress_content);
            AbstractC9979u.m20293f(str, "getString(...)");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        blackboardCropFragment.m17067P(str, z10);
    }

    private final void initView() {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        this.f20352g = new DialogC10643d(contextRequireContext, 0, 2, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.f20354i;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        ImageView ivBack = viewFragmentBlackboardCropBinding2.f20547c;
        AbstractC9979u.m20293f(ivBack, "ivBack");
        AbstractC11571a.m25475d(ivBack, 0L, new View.OnClickListener() { // from class: lb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m17047J(this.f24214c, view);
            }
        }, 1, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.f20354i;
        if (viewFragmentBlackboardCropBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding3 = null;
        }
        viewFragmentBlackboardCropBinding3.f20548d.setOnClickListener(new View.OnClickListener() { // from class: lb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m17049L(this.f24215c, view);
            }
        });
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = this.f20354i;
        if (viewFragmentBlackboardCropBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding4 = null;
        }
        viewFragmentBlackboardCropBinding4.f20549e.setSeekChangeListener(new C8864b());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = this.f20354i;
        if (viewFragmentBlackboardCropBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardCropBinding5 = null;
        }
        viewFragmentBlackboardCropBinding5.f20549e.setMaskChangeListener(new C8865c());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = this.f20354i;
        if (viewFragmentBlackboardCropBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        TextView tvConfirm = viewFragmentBlackboardCropBinding.f20551g;
        AbstractC9979u.m20293f(tvConfirm, "tvConfirm");
        AbstractC11571a.m25475d(tvConfirm, 0L, new View.OnClickListener() { // from class: lb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m17043F(this.f24216c, view);
            }
        }, 1, null);
    }

    /* renamed from: y */
    public static final /* synthetic */ AbstractC9830a m17064y(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.getClass();
        return null;
    }

    /* renamed from: E */
    public final void m17066E() {
        ProgressDialog progressDialog = this.f20355j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f20355j = null;
    }

    /* renamed from: P */
    public final void m17067P(String tips, boolean z10) {
        AbstractC9979u.m20294g(tips, "tips");
        ProgressDialog progressDialog = this.f20355j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f20355j = ProgressDialog.show(requireContext(), "", tips, false, z10);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBindingM17332a = ViewFragmentBlackboardCropBinding.m17332a(inflater);
        AbstractC9979u.m20291d(viewFragmentBlackboardCropBindingM17332a);
        this.f20354i = viewFragmentBlackboardCropBindingM17332a;
        View root = viewFragmentBlackboardCropBindingM17332a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m17066E();
        if (this.f20349d) {
            MergeSketchPlayView mergeSketchPlayView = this.f20353h;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.pause();
            }
            MergeSketchPlayView mergeSketchPlayView2 = this.f20353h;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.release();
            }
            MergeSketchPlayView mergeSketchPlayView3 = this.f20353h;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.destroy();
            }
        }
        this.f20349d = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        MergeSketchPlayView mergeSketchPlayView;
        super.onHiddenChanged(z10);
        if (isAdded() && z10 && (mergeSketchPlayView = this.f20353h) != null) {
            mergeSketchPlayView.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        MergeSketchPlayView mergeSketchPlayView;
        super.onPause();
        if (!this.f20349d || (mergeSketchPlayView = this.f20353h) == null) {
            return;
        }
        mergeSketchPlayView.pause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        MergeSketchPlayView mergeSketchPlayView;
        super.onResume();
        if (!this.f20349d || (mergeSketchPlayView = this.f20353h) == null) {
            return;
        }
        mergeSketchPlayView.pause();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        MergeSketchPlayView mergeSketchPlayView;
        super.setUserVisibleHint(z10);
        if (!isAdded() || z10 || (mergeSketchPlayView = this.f20353h) == null) {
            return;
        }
        mergeSketchPlayView.pause();
    }
}
