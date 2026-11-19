package com.zykj.view.board.crop;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$drawable;
import com.zykj.view.R$string;
import com.zykj.view.board.crop.BlackboardCropFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardCropBinding;
import com.zykj.view.widget.DoubleSeekBar;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p036c7.C5234a;
import p119g7.DialogC8070d;
import p181m7.AbstractC9026c;
import p181m7.C9041r;
import p213p5.C9323b;

@Metadata(m13412d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0003R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010+\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010*R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m13413d2 = {"Lcom/zykj/view/board/crop/BlackboardCropFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "D", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isVisibleToUser", "setUserVisibleHint", "(Z)V", "hidden", "onHiddenChanged", "onResume", "onPause", "onDestroyView", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "path", "O", "(Ljava/lang/String;)V", "Lc7/a;", "blackboardCropConfig", "Z", "(Lc7/a;)V", "tips", "isCancelable", "a0", "(Ljava/lang/String;Z)V", "C", "a", "isReady", "b", "Ljava/lang/String;", "progressTime", "c", "totalTime", "Lp5/b;", "d", "Lp5/b;", "cropManager", "Lg7/d;", "e", "Lg7/d;", "tipDialog", "f", "Lc7/a;", "mBlackboardCropConfig", "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "g", "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "sketchView", "h", "mPath", "Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;", "i", "Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;", "mBinding", "Landroid/app/ProgressDialog;", "j", "Landroid/app/ProgressDialog;", "mProgressDialog", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public C9323b cropManager;

    /* renamed from: e, reason: from kotlin metadata */
    public DialogC8070d tipDialog;

    /* renamed from: f, reason: from kotlin metadata */
    public C5234a mBlackboardCropConfig;

    /* renamed from: g, reason: from kotlin metadata */
    public MergeSketchPlayView sketchView;

    /* renamed from: h, reason: from kotlin metadata */
    public String mPath;

    /* renamed from: i, reason: from kotlin metadata */
    public ViewFragmentBlackboardCropBinding mBinding;

    /* renamed from: j, reason: from kotlin metadata */
    public ProgressDialog mProgressDialog;

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$a */
    public static final /* synthetic */ class C7684a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12357a;

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
            f12357a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$b */
    public static final class C7685b implements DoubleSeekBar.InterfaceC7725b {
        public C7685b() {
        }

        /* renamed from: g */
        public static final Unit m11532g(final BlackboardCropFragment blackboardCropFragment, int i9) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new Runnable() { // from class: c7.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C7685b.m11533h(blackboardCropFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* renamed from: h */
        public static final void m11533h(BlackboardCropFragment blackboardCropFragment) {
            blackboardCropFragment.m11525C();
        }

        /* renamed from: i */
        public static final Unit m11534i(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7725b
        /* renamed from: a */
        public void mo11535a(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                C9323b c9323b = BlackboardCropFragment.this.cropManager;
                if (c9323b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropManager");
                    c9323b = null;
                }
                seekBar.setProgress(c9323b.m15206b((long) seekBar.getProgress()));
                seekBar.setMaskProgress(seekBar.getProgress());
            }
            BlackboardCropFragment.this.progressTime = C9041r.f15220a.m14452a((long) seekBar.getMaskProgress());
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12587f.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
            BlackboardCropFragment.m11500b0(BlackboardCropFragment.this, null, false, 3, null);
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView != null) {
                int progress = (int) seekBar.getProgress();
                final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                mergeSketchPlayView.seekTo(progress, new Function1() { // from class: c7.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C7685b.m11532g(blackboardCropFragment, ((Integer) obj).intValue());
                    }
                }, new Function1() { // from class: c7.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackboardCropFragment.C7685b.m11534i((Throwable) obj);
                    }
                });
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7725b
        /* renamed from: b */
        public void mo11536b(DoubleSeekBar seekBar, float f10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            BlackboardCropFragment.this.progressTime = C9041r.f15220a.m14452a((long) f10);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12587f.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7725b
        /* renamed from: c */
        public void mo11537c(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.pause();
            }
        }
    }

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$c */
    public static final class C7686c implements DoubleSeekBar.InterfaceC7724a {
        public C7686c() {
        }

        /* renamed from: g */
        public static final Unit m11541g(final BlackboardCropFragment blackboardCropFragment, int i9) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new Runnable() { // from class: c7.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C7686c.m11542h(blackboardCropFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* renamed from: h */
        public static final void m11542h(BlackboardCropFragment blackboardCropFragment) {
            blackboardCropFragment.m11525C();
        }

        /* renamed from: i */
        public static final Unit m11543i(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7724a
        /* renamed from: a */
        public void mo11544a(DoubleSeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            C9323b c9323b = BlackboardCropFragment.this.cropManager;
            if (c9323b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropManager");
                c9323b = null;
            }
            seekBar.setMaskProgress(c9323b.m15206b((long) seekBar.getMaskProgress()));
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                seekBar.setProgress(seekBar.getMaskProgress());
                BlackboardCropFragment.this.progressTime = C9041r.f15220a.m14452a((long) seekBar.getMaskProgress());
                ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
                if (viewFragmentBlackboardCropBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentBlackboardCropBinding = null;
                }
                viewFragmentBlackboardCropBinding.f12587f.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
                BlackboardCropFragment.m11500b0(BlackboardCropFragment.this, null, false, 3, null);
                MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
                if (mergeSketchPlayView != null) {
                    int progress = (int) seekBar.getProgress();
                    final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                    mergeSketchPlayView.seekTo(progress, new Function1() { // from class: c7.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BlackboardCropFragment.C7686c.m11541g(blackboardCropFragment, ((Integer) obj).intValue());
                        }
                    }, new Function1() { // from class: c7.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BlackboardCropFragment.C7686c.m11543i((Throwable) obj);
                        }
                    });
                }
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7724a
        /* renamed from: b */
        public void mo11545b(DoubleSeekBar seekBar, float f10) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.InterfaceC7724a
        /* renamed from: c */
        public void mo11546c(DoubleSeekBar seekBar) {
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

    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$d */
    public static final class C7687d implements PlayStatusListener {
        public C7687d() {
        }

        /* renamed from: f */
        public static final void m11552f(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.selector_btn_music_play);
        }

        /* renamed from: g */
        public static final void m11553g(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.selector_btn_music_play);
        }

        /* renamed from: h */
        public static final void m11554h(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: i */
        public static final void m11555i(BlackboardCropFragment blackboardCropFragment) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: j */
        public static final void m11556j(BlackboardCropFragment blackboardCropFragment, long j9) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = null;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            viewFragmentBlackboardCropBinding.f12584c.setProgress(j9);
            blackboardCropFragment.progressTime = C9041r.f15220a.m14452a(j9);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardCropBinding2 = viewFragmentBlackboardCropBinding3;
            }
            viewFragmentBlackboardCropBinding2.f12587f.setText(blackboardCropFragment.progressTime + "/" + blackboardCropFragment.totalTime);
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayEnd() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f12583b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: c7.d0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C7687d.m11552f(blackboardCropFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayPause() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f12583b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: c7.c0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C7687d.m11553g(blackboardCropFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayStart() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f12583b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: c7.f0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C7687d.m11554h(blackboardCropFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayWait() {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            ImageView imageView = viewFragmentBlackboardCropBinding.f12583b;
            final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
            imageView.post(new Runnable() { // from class: c7.b0
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.C7687d.m11555i(blackboardCropFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onProgress(final long j9) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding = null;
            }
            TextView textView = viewFragmentBlackboardCropBinding.f12587f;
            if (textView != null) {
                final BlackboardCropFragment blackboardCropFragment = BlackboardCropFragment.this;
                textView.post(new Runnable() { // from class: c7.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.C7687d.m11556j(blackboardCropFragment, j9);
                    }
                });
            }
        }
    }

    /* renamed from: D */
    private final void m11479D() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        this.tipDialog = new DialogC8070d(contextRequireContext, 0, 2, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        ImageView ivBack = viewFragmentBlackboardCropBinding2.f12582a;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC9026c.m14393f(ivBack, 0L, new View.OnClickListener() { // from class: c7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m11484I(this.f2478a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.mBinding;
        if (viewFragmentBlackboardCropBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding3 = null;
        }
        viewFragmentBlackboardCropBinding3.f12583b.setOnClickListener(new View.OnClickListener() { // from class: c7.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m11486K(this.f2498a, view);
            }
        });
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = this.mBinding;
        if (viewFragmentBlackboardCropBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding4 = null;
        }
        viewFragmentBlackboardCropBinding4.f12584c.setSeekChangeListener(new C7685b());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = this.mBinding;
        if (viewFragmentBlackboardCropBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding5 = null;
        }
        viewFragmentBlackboardCropBinding5.f12584c.setMaskChangeListener(new C7686c());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = this.mBinding;
        if (viewFragmentBlackboardCropBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        TextView tvConfirm = viewFragmentBlackboardCropBinding.f12586e;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        AbstractC9026c.m14393f(tvConfirm, 0L, new View.OnClickListener() { // from class: c7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardCropFragment.m11480E(this.f2499a, view);
            }
        }, 1, null);
    }

    /* renamed from: E */
    public static final void m11480E(final BlackboardCropFragment blackboardCropFragment, View view) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        DialogC8070d dialogC8070d = null;
        if (viewFragmentBlackboardCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        final boolean z9 = ((long) viewFragmentBlackboardCropBinding.f12584c.getMaskProgress()) == 0;
        String str = z9 ? "确定要删除全部微课吗，删除后无法恢复" : "即将删除选中内容，删除后无法恢复";
        DialogC8070d dialogC8070d2 = blackboardCropFragment.tipDialog;
        if (dialogC8070d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipDialog");
        } else {
            dialogC8070d = dialogC8070d2;
        }
        dialogC8070d.m12878g(str, true, new Function0() { // from class: c7.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackboardCropFragment.m11481F(this.f2500a, z9);
            }
        }, true);
    }

    /* renamed from: F */
    public static final Unit m11481F(final BlackboardCropFragment blackboardCropFragment, final boolean z9) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        m11500b0(blackboardCropFragment, null, false, 3, null);
        C9323b c9323b = blackboardCropFragment.cropManager;
        if (c9323b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropManager");
            c9323b = null;
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding2;
        }
        c9323b.m15209e((long) viewFragmentBlackboardCropBinding.f12584c.getMaskProgress(), new Function1() { // from class: c7.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardCropFragment.m11482G(this.f2484a, z9, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m11482G(final BlackboardCropFragment blackboardCropFragment, final boolean z9, String e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10.length() > 0) {
            ToastUtils.showShort(e10, new Object[0]);
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f12586e.post(new Runnable() { // from class: c7.j
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardCropFragment.m11483H(this.f2494a, z9);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final void m11483H(BlackboardCropFragment blackboardCropFragment, boolean z9) {
        Function1 function1M2401b;
        blackboardCropFragment.m11525C();
        C5234a c5234a = blackboardCropFragment.mBlackboardCropConfig;
        if (c5234a == null || (function1M2401b = c5234a.m2401b()) == null) {
            return;
        }
        function1M2401b.invoke(Boolean.valueOf(z9));
    }

    /* renamed from: I */
    public static final void m11484I(final BlackboardCropFragment blackboardCropFragment, View view) {
        Function0 function0M2400a;
        C5234a c5234a = blackboardCropFragment.mBlackboardCropConfig;
        if (c5234a == null || (function0M2400a = c5234a.m2400a()) == null) {
            function0M2400a = new Function0() { // from class: c7.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BlackboardCropFragment.m11485J(this.f2502a);
                }
            };
        }
        function0M2400a.invoke();
    }

    /* renamed from: J */
    public static final Unit m11485J(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final void m11486K(final BlackboardCropFragment blackboardCropFragment, View view) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        PlayStatus playStatusStatus = mergeSketchPlayView != null ? mergeSketchPlayView.status() : null;
        int i9 = playStatusStatus == null ? -1 : C7684a.f12357a[playStatusStatus.ordinal()];
        if (i9 == 1) {
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
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i9 == 2) {
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
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i9 == 3) {
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
            viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i9 != 4) {
            return;
        }
        m11500b0(blackboardCropFragment, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView5 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView5 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding5 = null;
            }
            mergeSketchPlayView5.seekTo((int) viewFragmentBlackboardCropBinding5.f12584c.getMaskProgress(), new Function1() { // from class: c7.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11487L(this.f2503a, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: c7.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11489N((Throwable) obj);
                }
            });
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding6;
        }
        viewFragmentBlackboardCropBinding.f12583b.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: L */
    public static final Unit m11487L(final BlackboardCropFragment blackboardCropFragment, int i9) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.post(new Runnable() { // from class: c7.c
                @Override // java.lang.Runnable
                public final void run() {
                    BlackboardCropFragment.m11488M(this.f2480a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final void m11488M(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.m11525C();
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.resume();
        }
    }

    /* renamed from: N */
    public static final Unit m11489N(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final Unit m11490P(final BlackboardCropFragment blackboardCropFragment, final int i9) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        String path = mergeSketchPlayView != null ? mergeSketchPlayView.getPath() : null;
        Intrinsics.checkNotNull(path);
        blackboardCropFragment.cropManager = new C9323b(path);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        DoubleSeekBar doubleSeekBar = viewFragmentBlackboardCropBinding2.f12584c;
        C9323b c9323b = blackboardCropFragment.cropManager;
        C9323b c9323b2 = c9323b;
        if (c9323b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropManager");
            c9323b2 = null;
        }
        doubleSeekBar.setKeyPointList(c9323b2.m15215l());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding3;
        }
        viewFragmentBlackboardCropBinding.f12587f.post(new Runnable() { // from class: c7.f
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardCropFragment.m11491Q(i9, blackboardCropFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final void m11491Q(int i9, final BlackboardCropFragment blackboardCropFragment) {
        DialogC8070d dialogC8070d;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = null;
        if (i9 <= 0) {
            DialogC8070d dialogC8070d2 = blackboardCropFragment.tipDialog;
            if (dialogC8070d2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tipDialog");
                dialogC8070d = null;
            } else {
                dialogC8070d = dialogC8070d2;
            }
            String string = blackboardCropFragment.getString(R$string.crop_duration_no_support);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            DialogC8070d.m12877h(dialogC8070d, string, false, new Function0() { // from class: c7.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BlackboardCropFragment.m11494T(this.f2493a);
                }
            }, false, 8, null);
            blackboardCropFragment.m11525C();
            return;
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        viewFragmentBlackboardCropBinding2.f12584c.setMax(i9);
        C9041r c9041r = C9041r.f15220a;
        blackboardCropFragment.totalTime = c9041r.m14452a(i9);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding3 = null;
        }
        viewFragmentBlackboardCropBinding3.f12587f.setText(blackboardCropFragment.progressTime + "/" + blackboardCropFragment.totalTime);
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.addPlayActionListener(blackboardCropFragment.new C7687d());
        }
        blackboardCropFragment.isReady = true;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding4 = null;
        }
        viewFragmentBlackboardCropBinding4.f12583b.setImageResource(R$drawable.selector_btn_music_play);
        MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView2 != null) {
            mergeSketchPlayView2.pause();
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding5 = null;
        }
        DoubleSeekBar doubleSeekBar = viewFragmentBlackboardCropBinding5.f12584c;
        C9323b c9323b = blackboardCropFragment.cropManager;
        if (c9323b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropManager");
            c9323b = null;
        }
        doubleSeekBar.setMaskProgress(c9323b.m15206b(0L));
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding6 = null;
        }
        DoubleSeekBar doubleSeekBar2 = viewFragmentBlackboardCropBinding6.f12584c;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding7 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding7 = null;
        }
        doubleSeekBar2.setProgress(viewFragmentBlackboardCropBinding7.f12584c.getMaskProgress());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding8 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding8 = null;
        }
        blackboardCropFragment.progressTime = c9041r.m14452a((long) viewFragmentBlackboardCropBinding8.f12584c.getMaskProgress());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding9 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding9 = null;
        }
        viewFragmentBlackboardCropBinding9.f12587f.setText(blackboardCropFragment.progressTime + "/" + blackboardCropFragment.totalTime);
        MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView3 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding10 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardCropBinding = viewFragmentBlackboardCropBinding10;
            }
            mergeSketchPlayView3.seekTo((int) viewFragmentBlackboardCropBinding.f12584c.getProgress(), new Function1() { // from class: c7.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11492R(this.f2491a, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: c7.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11493S(this.f2492a, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: R */
    public static final Unit m11492R(BlackboardCropFragment blackboardCropFragment, int i9) {
        blackboardCropFragment.m11525C();
        return Unit.INSTANCE;
    }

    /* renamed from: S */
    public static final Unit m11493S(BlackboardCropFragment blackboardCropFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        blackboardCropFragment.m11525C();
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    public static final Unit m11494T(final BlackboardCropFragment blackboardCropFragment) {
        Function0 function0M2403d;
        C5234a c5234a = blackboardCropFragment.mBlackboardCropConfig;
        if (c5234a == null || (function0M2403d = c5234a.m2403d()) == null) {
            function0M2403d = new Function0() { // from class: c7.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BlackboardCropFragment.m11495U(this.f2497a);
                }
            };
        }
        function0M2403d.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m11495U(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m11496V(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final void m11497W(final BlackboardCropFragment blackboardCropFragment) {
        DialogC8070d dialogC8070d = blackboardCropFragment.tipDialog;
        if (dialogC8070d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipDialog");
            dialogC8070d = null;
        }
        String string = blackboardCropFragment.getString(R$string.crop_version_no_support);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        DialogC8070d.m12877h(dialogC8070d, string, false, new Function0() { // from class: c7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackboardCropFragment.m11498X(this.f2482a);
            }
        }, false, 8, null);
    }

    /* renamed from: X */
    public static final Unit m11498X(final BlackboardCropFragment blackboardCropFragment) {
        Function0 function0M2402c;
        C5234a c5234a = blackboardCropFragment.mBlackboardCropConfig;
        if (c5234a == null || (function0M2402c = c5234a.m2402c()) == null) {
            function0M2402c = new Function0() { // from class: c7.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BlackboardCropFragment.m11499Y(this.f2496a);
                }
            };
        }
        function0M2402c.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m11499Y(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m11500b0(BlackboardCropFragment blackboardCropFragment, String str, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = blackboardCropFragment.getString(R$string.progress_content);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        blackboardCropFragment.m11528a0(str, z9);
    }

    /* renamed from: C */
    public final void m11525C() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    /* renamed from: O */
    public final void m11526O(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.mPath = path;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.sketchView = new MergeSketchPlayView(contextRequireContext, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding = null;
        }
        viewFragmentBlackboardCropBinding.f12585d.addView(this.sketchView);
        MergeSketchPlayView mergeSketchPlayView = this.sketchView;
        Intrinsics.checkNotNull(mergeSketchPlayView);
        MergeSketchPlayView mergeSketchPlayView2 = this.sketchView;
        Intrinsics.checkNotNull(mergeSketchPlayView2);
        ViewGroup.LayoutParams layoutParams = mergeSketchPlayView2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        mergeSketchPlayView.setLayoutParams(layoutParams);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardCropBinding2 = null;
        }
        if (viewFragmentBlackboardCropBinding2.f12585d.getChildCount() == 2) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.mBinding;
            if (viewFragmentBlackboardCropBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardCropBinding3 = null;
            }
            viewFragmentBlackboardCropBinding3.f12585d.removeViewAt(0);
        }
        if (!new File(path, "page_router.bin").exists()) {
            MergeSketchPlayView mergeSketchPlayView3 = this.sketchView;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.post(new Runnable() { // from class: c7.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardCropFragment.m11497W(this.f2505a);
                    }
                });
                return;
            }
            return;
        }
        m11500b0(this, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView4 = this.sketchView;
        if (mergeSketchPlayView4 != null) {
            mergeSketchPlayView4.loadData(path, new Function1() { // from class: c7.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11490P(this.f2504a, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: c7.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardCropFragment.m11496V((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: Z */
    public final void m11527Z(C5234a blackboardCropConfig) {
        Intrinsics.checkNotNullParameter(blackboardCropConfig, "blackboardCropConfig");
        this.mBlackboardCropConfig = blackboardCropConfig;
    }

    /* renamed from: a0 */
    public final void m11528a0(String tips, boolean isCancelable) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = ProgressDialog.show(requireContext(), "", tips, false, isCancelable);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        m11479D();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBindingM11878a = ViewFragmentBlackboardCropBinding.m11878a(inflater);
        Intrinsics.checkNotNull(viewFragmentBlackboardCropBindingM11878a);
        this.mBinding = viewFragmentBlackboardCropBindingM11878a;
        View root = viewFragmentBlackboardCropBindingM11878a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m11525C();
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
