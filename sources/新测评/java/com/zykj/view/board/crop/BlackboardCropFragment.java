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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p027b8.AbstractC5046c;
import p027b8.C5066w;
import p268v7.DialogC9713d;
import p305z4.AbstractC9977a;

@Metadata(m13557d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m13558d2 = {"Lcom/zykj/view/board/crop/BlackboardCropFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "s", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isVisibleToUser", "setUserVisibleHint", "(Z)V", "hidden", "onHiddenChanged", "onResume", "onPause", "onDestroyView", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "tips", "isCancelable", "D", "(Ljava/lang/String;Z)V", "hideProgress", "a", "Z", "isReady", "b", "Ljava/lang/String;", "progressTime", "c", "totalTime", "Lv7/d;", "d", "Lv7/d;", "tipDialog", "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "e", "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "sketchView", "Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;", "f", "Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;", "mBinding", "Landroid/app/ProgressDialog;", "g", "Landroid/app/ProgressDialog;", "mProgressDialog", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBlackboardCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardCropFragment.kt\ncom/zykj/view/board/crop/BlackboardCropFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
/* loaded from: classes5.dex */
public final class BlackboardCropFragment extends Fragment {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean isReady;

    /* renamed from: b, reason: from kotlin metadata */
    public String progressTime = "00:00";

    /* renamed from: c, reason: from kotlin metadata */
    public String totalTime = "00:00";

    /* renamed from: d, reason: from kotlin metadata */
    public DialogC9713d tipDialog;

    /* renamed from: e, reason: from kotlin metadata */
    public MergeSketchPlayView sketchView;

    /* renamed from: f, reason: from kotlin metadata */
    public ViewFragmentBlackboardCropBinding mBinding;

    /* renamed from: g, reason: from kotlin metadata */
    public ProgressDialog mProgressDialog;

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$a */
    public static final /* synthetic */ class C7235a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11135a;

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
            f11135a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$b */
    public static final class C7236b implements DoubleSeekBar.InterfaceC7269b {
        public C7236b() {
        }

        /* renamed from: g */
        public static final Unit m11079g(final BlackboardCropFragment blackboardCropFragment, int i10) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new Runnable() { // from class: r7.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C7236b.m11080h(blackboardCropFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* renamed from: h */
        public static final void m11080h(BlackboardCropFragment blackboardCropFragment) {
            blackboardCropFragment.hideProgress();
        }

        /* renamed from: i */
        public static final Unit m11081i(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7269b
        /* renamed from: a */
        public void mo11082a(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                BlackboardCropFragment.m11061m(BlackboardCropFragment.this);
                Intrinsics.throwUninitializedPropertyAccessException("cropManager");
                seekBar.getProgress();
                throw null;
            }
            BlackboardCropFragment.this.progressTime = C5066w.f2629a.m2603a((long) seekBar.getMaskProgress());
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f11343f.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
            BlackboardCropFragment.m11050E(BlackboardCropFragment.this, null, false, 3, null);
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView != null) {
                int progress = (int) seekBar.getProgress();
                final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                mergeSketchPlayView.seekTo(progress, new Function1() { // from class: r7.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C7236b.m11079g(blackboardCropFragment, ((Integer) obj).intValue());
                    }
                }, new Function1() { // from class: r7.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C7236b.m11081i((Throwable) obj);
                    }
                });
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7269b
        /* renamed from: b */
        public void mo11083b(DoubleSeekBar seekBar, float f10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            BlackboardCropFragment.this.progressTime = C5066w.f2629a.m2603a((long) f10);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f11343f.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7269b
        /* renamed from: c */
        public void mo11084c(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.pause();
            }
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$c */
    public static final class C7237c implements DoubleSeekBar.InterfaceC7268a {
        public C7237c() {
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7268a
        /* renamed from: a */
        public void mo11085a(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            BlackboardCropFragment.m11061m(BlackboardCropFragment.this);
            Intrinsics.throwUninitializedPropertyAccessException("cropManager");
            seekBar.getMaskProgress();
            throw null;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7268a
        /* renamed from: b */
        public void mo11086b(DoubleSeekBar seekBar, float f10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7268a
        /* renamed from: c */
        public void mo11087c(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if ((mergeSketchPlayView != null ? mergeSketchPlayView.status() : null) != PlayStatus.RECORD_START) {
                MergeSketchPlayView mergeSketchPlayView2 = BlackboardCropFragment.this.sketchView;
                if ((mergeSketchPlayView2 != null ? mergeSketchPlayView2.status() : null) != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            MergeSketchPlayView mergeSketchPlayView3 = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.pause();
            }
        }
    }

    /* renamed from: A */
    public static final Unit m11047A(final BlackboardCropFragment blackboardCropFragment, int i10) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.post(new Runnable() { // from class: r7.h
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.m11048B(this.f15504a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final void m11048B(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.hideProgress();
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.resume();
        }
    }

    /* renamed from: C */
    public static final Unit m11049C(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static /* synthetic */ void m11050E(BlackboardCropFragment blackboardCropFragment, String str, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = blackboardCropFragment.getString(R$string.progress_content);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        blackboardCropFragment.m11075D(str, z9);
    }

    /* renamed from: m */
    public static final /* synthetic */ AbstractC9977a m11061m(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.getClass();
        return null;
    }

    /* renamed from: s */
    private final void m11067s() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        this.tipDialog = new DialogC9713d(contextRequireContext, 0, 2, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        ImageView ivBack = viewFragmentBlackboardCropBinding2.f11338a;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC5046c.m2530f(ivBack, 0L, new View.OnClickListener() { // from class: r7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m11072x(this.f15497a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.mBinding;
        if (viewFragmentBlackboardCropBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding3 = null;
        }
        viewFragmentBlackboardCropBinding3.f11339b.setOnClickListener(new View.OnClickListener() { // from class: r7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m11074z(this.f15498a, view);
            }
        });
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = this.mBinding;
        if (viewFragmentBlackboardCropBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding4 = null;
        }
        viewFragmentBlackboardCropBinding4.f11340c.setSeekChangeListener(new C7236b());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = this.mBinding;
        if (viewFragmentBlackboardCropBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding5 = null;
        }
        viewFragmentBlackboardCropBinding5.f11340c.setMaskChangeListener(new C7237c());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = this.mBinding;
        if (viewFragmentBlackboardCropBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        TextView tvConfirm = viewFragmentBlackboardCropBinding.f11342e;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        AbstractC5046c.m2530f(tvConfirm, 0L, new View.OnClickListener() { // from class: r7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m11068t(this.f15499a, view);
            }
        }, 1, null);
    }

    /* renamed from: t */
    public static final void m11068t(final BlackboardCropFragment blackboardCropFragment, View view) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        DialogC9713d dialogC9713d = null;
        if (viewFragmentBlackboardCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        final boolean z9 = ((long) viewFragmentBlackboardCropBinding.f11340c.getMaskProgress()) == 0;
        String str = z9 ? "确定要删除全部微课吗，删除后无法恢复" : "即将删除选中内容，删除后无法恢复";
        DialogC9713d dialogC9713d2 = blackboardCropFragment.tipDialog;
        if (dialogC9713d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipDialog");
        } else {
            dialogC9713d = dialogC9713d2;
        }
        dialogC9713d.m16233g(str, true, new Function0() { // from class: r7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackboardCropFragment.m11069u(this.f15500a, z9);
            }
        }, true);
    }

    /* renamed from: u */
    public static final Unit m11069u(final BlackboardCropFragment blackboardCropFragment, final boolean z9) {
        m11050E(blackboardCropFragment, null, false, 3, null);
        blackboardCropFragment.getClass();
        Intrinsics.throwUninitializedPropertyAccessException("cropManager");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f11340c.getMaskProgress();
        new Function1() { // from class: r7.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardCropFragment.m11070v(this.f15505a, z9, (String) obj);
            }
        };
        throw null;
    }

    /* renamed from: v */
    public static final Unit m11070v(final BlackboardCropFragment blackboardCropFragment, final boolean z9, String e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10.length() > 0) {
            ToastUtils.showShort(e10, new Object[0]);
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f11342e.post(new Runnable() { // from class: r7.j
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardCropFragment.m11071w(this.f15507a, z9);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final void m11071w(BlackboardCropFragment blackboardCropFragment, boolean z9) {
        blackboardCropFragment.hideProgress();
    }

    /* renamed from: x */
    public static final void m11072x(final BlackboardCropFragment blackboardCropFragment, View view) {
        blackboardCropFragment.getClass();
        new Function0() { // from class: r7.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackboardCropFragment.m11073y(this.f15502a);
            }
        }.invoke();
    }

    /* renamed from: y */
    public static final Unit m11073y(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m11074z(final BlackboardCropFragment blackboardCropFragment, View view) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        PlayStatus playStatusStatus = mergeSketchPlayView != null ? mergeSketchPlayView.status() : null;
        int i10 = playStatusStatus == null ? -1 : C7235a.f11135a[playStatusStatus.ordinal()];
        if (i10 == 1) {
            MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.pause();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding2;
            }
            viewFragmentBlackboardCropBinding.f11339b.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 2) {
            MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.pause();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding3;
            }
            viewFragmentBlackboardCropBinding.f11339b.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 3) {
            MergeSketchPlayView mergeSketchPlayView4 = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView4 != null) {
                mergeSketchPlayView4.resume();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding4;
            }
            viewFragmentBlackboardCropBinding.f11339b.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i10 != 4) {
            return;
        }
        m11050E(blackboardCropFragment, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView5 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView5 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding5 = null;
            }
            mergeSketchPlayView5.seekTo((int) viewFragmentBlackboardCropBinding5.f11340c.getMaskProgress(), new Function1() { // from class: r7.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11047A(this.f15503a, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: r7.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11049C((Throwable) obj);
                }
            });
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        viewFragmentBlackboardCropBinding.f11339b.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: D */
    public final void m11075D(String tips, boolean isCancelable) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = ProgressDialog.show(requireContext(), "", tips, false, isCancelable);
    }

    public final void hideProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        m11067s();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBindingM11388a = ViewFragmentBlackboardCropBinding.m11388a(inflater);
        Intrinsics.checkNotNull(viewFragmentBlackboardCropBindingM11388a);
        this.mBinding = viewFragmentBlackboardCropBindingM11388a;
        View root = viewFragmentBlackboardCropBindingM11388a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hideProgress();
        if (this.isReady) {
            MergeSketchPlayView mergeSketchPlayView = this.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.pause();
            }
            MergeSketchPlayView mergeSketchPlayView2 = this.sketchView;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.release();
            }
            MergeSketchPlayView mergeSketchPlayView3 = this.sketchView;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.destroy();
            }
        }
        this.isReady = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        MergeSketchPlayView mergeSketchPlayView;
        super.onHiddenChanged(hidden);
        if (isAdded() && hidden && (mergeSketchPlayView = this.sketchView) != null) {
            mergeSketchPlayView.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        MergeSketchPlayView mergeSketchPlayView;
        super.onPause();
        if (!this.isReady || (mergeSketchPlayView = this.sketchView) == null) {
            return;
        }
        mergeSketchPlayView.pause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        MergeSketchPlayView mergeSketchPlayView;
        super.onResume();
        if (!this.isReady || (mergeSketchPlayView = this.sketchView) == null) {
            return;
        }
        mergeSketchPlayView.pause();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        MergeSketchPlayView mergeSketchPlayView;
        super.setUserVisibleHint(isVisibleToUser);
        if (!isAdded() || isVisibleToUser || (mergeSketchPlayView = this.sketchView) == null) {
            return;
        }
        mergeSketchPlayView.pause();
    }
}
