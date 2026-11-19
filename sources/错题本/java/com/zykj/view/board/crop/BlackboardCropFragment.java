package com.zykj.view.board.crop;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.interop.RunnableC0303c;
import androidx.camera.video.internal.audio.RunnableC0491f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C3404x;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.crop.CropManager;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.feature.notebook.detail.C4887v;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewFragmentBlackboardCropBinding;
import com.zykj.view.dialog.CommonTipDialog;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.utils.TimeFormatUtils;
import com.zykj.view.widget.DoubleSeekBar;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010\u0003R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010*R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, m5110d2 = {"Lcom/zykj/view/board/crop/BlackboardCropFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isVisibleToUser", "Ld6/s;", "setUserVisibleHint", "(Z)V", MessageClient.INTENT_KEY, "onHiddenChanged", "onResume", "onPause", "onDestroyView", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "path", "load", "(Ljava/lang/String;)V", "Lcom/zykj/view/board/crop/BlackboardCropConfig;", "blackboardCropConfig", "setBlackboardCropConfig", "(Lcom/zykj/view/board/crop/BlackboardCropConfig;)V", "tips", "isCancelable", "showProgress", "(Ljava/lang/String;Z)V", "hideProgress", "initView", "isReady", "Z", "progressTime", "Ljava/lang/String;", "totalTime", "Lcom/zykj/blackboard/crop/CropManager;", "cropManager", "Lcom/zykj/blackboard/crop/CropManager;", "Lcom/zykj/view/dialog/CommonTipDialog;", "tipDialog", "Lcom/zykj/view/dialog/CommonTipDialog;", "mBlackboardCropConfig", "Lcom/zykj/view/board/crop/BlackboardCropConfig;", "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "sketchView", "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;", "mPath", "Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;", "Landroid/app/ProgressDialog;", "mProgressDialog", "Landroid/app/ProgressDialog;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBlackboardCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardCropFragment.kt\ncom/zykj/view/board/crop/BlackboardCropFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackboardCropFragment extends Fragment {
    private CropManager cropManager;
    private boolean isReady;
    private ViewFragmentBlackboardCropBinding mBinding;

    @Nullable
    private BlackboardCropConfig mBlackboardCropConfig;

    @Nullable
    private String mPath;

    @Nullable
    private ProgressDialog mProgressDialog;

    @Nullable
    private MergeSketchPlayView sketchView;
    private CommonTipDialog tipDialog;

    @NotNull
    private String progressTime = "00:00";

    @NotNull
    private String totalTime = "00:00";

    @Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m5110d2 = {"com/zykj/view/board/crop/BlackboardCropFragment$initView$3", "Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;", "Lcom/zykj/view/widget/DoubleSeekBar;", "seekBar", "", "progress", "Ld6/s;", "onSeeking", "(Lcom/zykj/view/widget/DoubleSeekBar;F)V", "onStartTrackingTouch", "(Lcom/zykj/view/widget/DoubleSeekBar;)V", "onStopTrackingTouch", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$initView$3 */
    public static final class C53203 implements DoubleSeekBar.OnSeekChangeListener {
        public C53203() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s onStopTrackingTouch$lambda$1(BlackboardCropFragment blackboardCropFragment, int i) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new RunnableC5324c(2, blackboardCropFragment));
            }
            return C5443s.f8405a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s onStopTrackingTouch$lambda$2(Throwable it) {
            AbstractC5830k.m5330g(it, "it");
            return C5443s.f8405a;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.OnSeekChangeListener
        public void onSeeking(DoubleSeekBar seekBar, float progress) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            BlackboardCropFragment.this.progressTime = TimeFormatUtils.INSTANCE.formatTime((long) progress);
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardCropBinding.tvTime.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.OnSeekChangeListener
        public void onStartTrackingTouch(DoubleSeekBar seekBar) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.pause();
            }
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.OnSeekChangeListener
        public void onStopTrackingTouch(DoubleSeekBar seekBar) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                if (BlackboardCropFragment.this.cropManager == null) {
                    AbstractC5830k.m5339p("cropManager");
                    throw null;
                }
                seekBar.setProgress(r0.calculateRecentTime((long) seekBar.getProgress()));
                seekBar.setMaskProgress(seekBar.getProgress());
            }
            BlackboardCropFragment.this.progressTime = TimeFormatUtils.INSTANCE.formatTime((long) seekBar.getMaskProgress());
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
            if (viewFragmentBlackboardCropBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardCropBinding.tvTime.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
            BlackboardCropFragment.showProgress$default(BlackboardCropFragment.this, null, false, 3, null);
            MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.seekTo((int) seekBar.getProgress(), new C5323b(4, BlackboardCropFragment.this), new C4959k1(17));
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m5110d2 = {"com/zykj/view/board/crop/BlackboardCropFragment$initView$4", "Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;", "Lcom/zykj/view/widget/DoubleSeekBar;", "seekBar", "", "progress", "Ld6/s;", "onSeeking", "(Lcom/zykj/view/widget/DoubleSeekBar;F)V", "onStartTrackingTouch", "(Lcom/zykj/view/widget/DoubleSeekBar;)V", "onStopTrackingTouch", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.view.board.crop.BlackboardCropFragment$initView$4 */
    public static final class C53214 implements DoubleSeekBar.OnMaskChangeListener {
        public C53214() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s onStopTrackingTouch$lambda$1(BlackboardCropFragment blackboardCropFragment, int i) {
            MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView != null) {
                mergeSketchPlayView.post(new RunnableC5324c(3, blackboardCropFragment));
            }
            return C5443s.f8405a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s onStopTrackingTouch$lambda$2(Throwable it) {
            AbstractC5830k.m5330g(it, "it");
            return C5443s.f8405a;
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.OnMaskChangeListener
        public void onSeeking(DoubleSeekBar seekBar, float progress) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
        }

        @Override // com.zykj.view.widget.DoubleSeekBar.OnMaskChangeListener
        public void onStartTrackingTouch(DoubleSeekBar seekBar) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
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

        @Override // com.zykj.view.widget.DoubleSeekBar.OnMaskChangeListener
        public void onStopTrackingTouch(DoubleSeekBar seekBar) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            if (BlackboardCropFragment.this.cropManager == null) {
                AbstractC5830k.m5339p("cropManager");
                throw null;
            }
            seekBar.setMaskProgress(r0.calculateRecentTime((long) seekBar.getMaskProgress()));
            if (seekBar.getProgress() < seekBar.getMaskProgress()) {
                seekBar.setProgress(seekBar.getMaskProgress());
                BlackboardCropFragment.this.progressTime = TimeFormatUtils.INSTANCE.formatTime((long) seekBar.getMaskProgress());
                ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = BlackboardCropFragment.this.mBinding;
                if (viewFragmentBlackboardCropBinding == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentBlackboardCropBinding.tvTime.setText(BlackboardCropFragment.this.progressTime + "/" + BlackboardCropFragment.this.totalTime);
                BlackboardCropFragment.showProgress$default(BlackboardCropFragment.this, null, false, 3, null);
                MergeSketchPlayView mergeSketchPlayView = BlackboardCropFragment.this.sketchView;
                if (mergeSketchPlayView != null) {
                    mergeSketchPlayView.seekTo((int) seekBar.getProgress(), new C5323b(5, BlackboardCropFragment.this), new C4959k1(18));
                }
            }
        }
    }

    private final void initView() {
        Context contextRequireContext = requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        this.tipDialog = new CommonTipDialog(contextRequireContext, 0, 2, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivBack = viewFragmentBlackboardCropBinding.ivBack;
        AbstractC5830k.m5329f(ivBack, "ivBack");
        final int i = 0;
        ExtKt.singleClick$default(ivBack, 0L, new View.OnClickListener() { // from class: com.zykj.view.board.crop.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        BlackboardCropFragment.initView$lambda$2(this, view);
                        break;
                    case 1:
                        BlackboardCropFragment.initView$lambda$6(this, view);
                        break;
                    default:
                        BlackboardCropFragment.initView$lambda$10(this, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i8 = 1;
        viewFragmentBlackboardCropBinding2.ivRecord.setOnClickListener(new View.OnClickListener() { // from class: com.zykj.view.board.crop.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        BlackboardCropFragment.initView$lambda$2(this, view);
                        break;
                    case 1:
                        BlackboardCropFragment.initView$lambda$6(this, view);
                        break;
                    default:
                        BlackboardCropFragment.initView$lambda$10(this, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.mBinding;
        if (viewFragmentBlackboardCropBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding3.seekBar.setSeekChangeListener(new C53203());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = this.mBinding;
        if (viewFragmentBlackboardCropBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding4.seekBar.setMaskChangeListener(new C53214());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = this.mBinding;
        if (viewFragmentBlackboardCropBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        TextView tvConfirm = viewFragmentBlackboardCropBinding5.tvConfirm;
        AbstractC5830k.m5329f(tvConfirm, "tvConfirm");
        final int i9 = 2;
        ExtKt.singleClick$default(tvConfirm, 0L, new View.OnClickListener() { // from class: com.zykj.view.board.crop.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        BlackboardCropFragment.initView$lambda$2(this, view);
                        break;
                    case 1:
                        BlackboardCropFragment.initView$lambda$6(this, view);
                        break;
                    default:
                        BlackboardCropFragment.initView$lambda$10(this, view);
                        break;
                }
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(final BlackboardCropFragment blackboardCropFragment, View view) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final boolean z8 = ((long) viewFragmentBlackboardCropBinding.seekBar.getMaskProgress()) == 0;
        String str = z8 ? "确定要删除全部微课吗，删除后无法恢复" : "即将删除选中内容，删除后无法恢复";
        CommonTipDialog commonTipDialog = blackboardCropFragment.tipDialog;
        if (commonTipDialog != null) {
            commonTipDialog.showDialog(str, true, new InterfaceC6469a() { // from class: com.zykj.view.board.crop.e
                @Override // p152r6.InterfaceC6469a
                public final Object invoke() {
                    return BlackboardCropFragment.initView$lambda$10$lambda$9(this.f8262a, z8);
                }
            }, true);
        } else {
            AbstractC5830k.m5339p("tipDialog");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$10$lambda$9(BlackboardCropFragment blackboardCropFragment, boolean z8) {
        showProgress$default(blackboardCropFragment, null, false, 3, null);
        CropManager cropManager = blackboardCropFragment.cropManager;
        if (cropManager == null) {
            AbstractC5830k.m5339p("cropManager");
            throw null;
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding != null) {
            cropManager.cropByTime((long) viewFragmentBlackboardCropBinding.seekBar.getMaskProgress(), new C4887v(blackboardCropFragment, z8, 3));
            return C5443s.f8405a;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$10$lambda$9$lambda$8(BlackboardCropFragment blackboardCropFragment, boolean z8, String e) {
        AbstractC5830k.m5330g(e, "e");
        if (e.length() > 0) {
            C3404x.m2356a(e, new Object[0]);
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding != null) {
            viewFragmentBlackboardCropBinding.tvConfirm.post(new RunnableC0303c(blackboardCropFragment, z8, 4));
            return C5443s.f8405a;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10$lambda$9$lambda$8$lambda$7(BlackboardCropFragment blackboardCropFragment, boolean z8) {
        InterfaceC6471c callbackForConfirm;
        blackboardCropFragment.hideProgress();
        BlackboardCropConfig blackboardCropConfig = blackboardCropFragment.mBlackboardCropConfig;
        if (blackboardCropConfig == null || (callbackForConfirm = blackboardCropConfig.getCallbackForConfirm()) == null) {
            return;
        }
        callbackForConfirm.invoke(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BlackboardCropFragment blackboardCropFragment, View view) {
        InterfaceC6469a c5322a;
        BlackboardCropConfig blackboardCropConfig = blackboardCropFragment.mBlackboardCropConfig;
        if (blackboardCropConfig == null || (c5322a = blackboardCropConfig.getCallbackForBack()) == null) {
            c5322a = new C5322a(2, blackboardCropFragment);
        }
        c5322a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$2$lambda$1(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(BlackboardCropFragment blackboardCropFragment, View view) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        PlayStatus playStatusStatus = mergeSketchPlayView != null ? mergeSketchPlayView.status() : null;
        int i = playStatusStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[playStatusStatus.ordinal()];
        if (i == 1) {
            MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView2 != null) {
                mergeSketchPlayView2.pause();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding != null) {
                viewFragmentBlackboardCropBinding.ivRecord.setImageResource(C5280R.drawable.icon_record_start);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        if (i == 2) {
            MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView3 != null) {
                mergeSketchPlayView3.pause();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding2 != null) {
                viewFragmentBlackboardCropBinding2.ivRecord.setImageResource(C5280R.drawable.icon_record_start);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        if (i == 3) {
            MergeSketchPlayView mergeSketchPlayView4 = blackboardCropFragment.sketchView;
            if (mergeSketchPlayView4 != null) {
                mergeSketchPlayView4.resume();
            }
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding3 != null) {
                viewFragmentBlackboardCropBinding3.ivRecord.setImageResource(C5280R.drawable.view_icon_record_stop);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        if (i != 4) {
            return;
        }
        showProgress$default(blackboardCropFragment, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView5 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView5 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding4 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            mergeSketchPlayView5.seekTo((int) viewFragmentBlackboardCropBinding4.seekBar.getMaskProgress(), new C5323b(3, blackboardCropFragment), new C4959k1(16));
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding5 != null) {
            viewFragmentBlackboardCropBinding5.ivRecord.setImageResource(C5280R.drawable.icon_record_start);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$6$lambda$4(BlackboardCropFragment blackboardCropFragment, int i) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.post(new RunnableC5324c(1, blackboardCropFragment));
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6$lambda$4$lambda$3(BlackboardCropFragment blackboardCropFragment) {
        blackboardCropFragment.hideProgress();
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$6$lambda$5(Throwable it) {
        AbstractC5830k.m5330g(it, "it");
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$17(BlackboardCropFragment blackboardCropFragment, int i) {
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        String path = mergeSketchPlayView != null ? mergeSketchPlayView.getPath() : null;
        AbstractC5830k.m5327d(path);
        CropManager cropManager = new CropManager(path);
        blackboardCropFragment.cropManager = cropManager;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.seekBar.setKeyPointList(cropManager.getCommandDelayTimeList());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding2 != null) {
            viewFragmentBlackboardCropBinding2.tvTime.post(new RunnableC0491f(i, blackboardCropFragment));
            return C5443s.f8405a;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$17$lambda$16(int i, BlackboardCropFragment blackboardCropFragment) {
        if (i <= 0) {
            CommonTipDialog commonTipDialog = blackboardCropFragment.tipDialog;
            if (commonTipDialog == null) {
                AbstractC5830k.m5339p("tipDialog");
                throw null;
            }
            String string = blackboardCropFragment.getString(C5280R.string.crop_duration_no_support);
            AbstractC5830k.m5329f(string, "getString(...)");
            CommonTipDialog.showDialog$default(commonTipDialog, string, false, new C5322a(3, blackboardCropFragment), false, 8, null);
            blackboardCropFragment.hideProgress();
            return;
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.seekBar.setMax(i);
        TimeFormatUtils timeFormatUtils = TimeFormatUtils.INSTANCE;
        String time = timeFormatUtils.formatTime(i);
        blackboardCropFragment.totalTime = time;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding2.tvTime.setText(blackboardCropFragment.progressTime + "/" + time);
        MergeSketchPlayView mergeSketchPlayView = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView != null) {
            mergeSketchPlayView.addPlayActionListener(new BlackboardCropFragment$load$2$1$1(blackboardCropFragment));
        }
        blackboardCropFragment.isReady = true;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding3.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_play);
        MergeSketchPlayView mergeSketchPlayView2 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView2 != null) {
            mergeSketchPlayView2.pause();
        }
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding4 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        DoubleSeekBar doubleSeekBar = viewFragmentBlackboardCropBinding4.seekBar;
        if (blackboardCropFragment.cropManager == null) {
            AbstractC5830k.m5339p("cropManager");
            throw null;
        }
        doubleSeekBar.setMaskProgress(r3.calculateRecentTime(0L));
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding5 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        DoubleSeekBar doubleSeekBar2 = viewFragmentBlackboardCropBinding5.seekBar;
        doubleSeekBar2.setProgress(doubleSeekBar2.getMaskProgress());
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding6 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding6 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        String time2 = timeFormatUtils.formatTime((long) viewFragmentBlackboardCropBinding6.seekBar.getMaskProgress());
        blackboardCropFragment.progressTime = time2;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding7 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding7 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding7.tvTime.setText(time2 + "/" + blackboardCropFragment.totalTime);
        MergeSketchPlayView mergeSketchPlayView3 = blackboardCropFragment.sketchView;
        if (mergeSketchPlayView3 != null) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding8 = blackboardCropFragment.mBinding;
            if (viewFragmentBlackboardCropBinding8 != null) {
                mergeSketchPlayView3.seekTo((int) viewFragmentBlackboardCropBinding8.seekBar.getProgress(), new C5323b(1, blackboardCropFragment), new C5323b(2, blackboardCropFragment));
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$17$lambda$16$lambda$12(BlackboardCropFragment blackboardCropFragment, int i) {
        blackboardCropFragment.hideProgress();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$17$lambda$16$lambda$13(BlackboardCropFragment blackboardCropFragment, Throwable it) {
        AbstractC5830k.m5330g(it, "it");
        blackboardCropFragment.hideProgress();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$17$lambda$16$lambda$15(BlackboardCropFragment blackboardCropFragment) {
        InterfaceC6469a c5322a;
        BlackboardCropConfig blackboardCropConfig = blackboardCropFragment.mBlackboardCropConfig;
        if (blackboardCropConfig == null || (c5322a = blackboardCropConfig.getCallbackForNoTime()) == null) {
            c5322a = new C5322a(0, blackboardCropFragment);
        }
        c5322a.invoke();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$17$lambda$16$lambda$15$lambda$14(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$18(Throwable it) {
        AbstractC5830k.m5330g(it, "it");
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$21(BlackboardCropFragment blackboardCropFragment) {
        CommonTipDialog commonTipDialog = blackboardCropFragment.tipDialog;
        if (commonTipDialog == null) {
            AbstractC5830k.m5339p("tipDialog");
            throw null;
        }
        String string = blackboardCropFragment.getString(C5280R.string.crop_version_no_support);
        AbstractC5830k.m5329f(string, "getString(...)");
        CommonTipDialog.showDialog$default(commonTipDialog, string, false, new C5322a(4, blackboardCropFragment), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$21$lambda$20(BlackboardCropFragment blackboardCropFragment) {
        InterfaceC6469a c5322a;
        BlackboardCropConfig blackboardCropConfig = blackboardCropFragment.mBlackboardCropConfig;
        if (blackboardCropConfig == null || (c5322a = blackboardCropConfig.getCallbackForNoSupport()) == null) {
            c5322a = new C5322a(1, blackboardCropFragment);
        }
        c5322a.invoke();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s load$lambda$21$lambda$20$lambda$19(BlackboardCropFragment blackboardCropFragment) {
        FragmentActivity activity = blackboardCropFragment.getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C5443s.f8405a;
    }

    public static /* synthetic */ void showProgress$default(BlackboardCropFragment blackboardCropFragment, String str, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blackboardCropFragment.getString(C5280R.string.progress_content);
            AbstractC5830k.m5329f(str, "getString(...)");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        blackboardCropFragment.showProgress(str, z8);
    }

    public final void hideProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    public final void load(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        this.mPath = path;
        Context contextRequireContext = requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        MergeSketchPlayView mergeSketchPlayView = new MergeSketchPlayView(contextRequireContext, null);
        this.sketchView = mergeSketchPlayView;
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.sketchView.addView(mergeSketchPlayView);
        MergeSketchPlayView mergeSketchPlayView2 = this.sketchView;
        AbstractC5830k.m5327d(mergeSketchPlayView2);
        MergeSketchPlayView mergeSketchPlayView3 = this.sketchView;
        AbstractC5830k.m5327d(mergeSketchPlayView3);
        ViewGroup.LayoutParams layoutParams = mergeSketchPlayView3.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        mergeSketchPlayView2.setLayoutParams(layoutParams);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = this.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        if (viewFragmentBlackboardCropBinding2.sketchView.getChildCount() == 2) {
            ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding3 = this.mBinding;
            if (viewFragmentBlackboardCropBinding3 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardCropBinding3.sketchView.removeViewAt(0);
        }
        if (!new File(path, SourceSave.PAGE_ROUTER_FILE_NAME).exists()) {
            MergeSketchPlayView mergeSketchPlayView4 = this.sketchView;
            if (mergeSketchPlayView4 != null) {
                mergeSketchPlayView4.post(new RunnableC5324c(0, this));
                return;
            }
            return;
        }
        showProgress$default(this, null, false, 3, null);
        MergeSketchPlayView mergeSketchPlayView5 = this.sketchView;
        if (mergeSketchPlayView5 != null) {
            mergeSketchPlayView5.loadData(path, new C5323b(0, this), new C4959k1(15));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(inflater, "inflater");
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBindingInflate = ViewFragmentBlackboardCropBinding.inflate(inflater);
        AbstractC5830k.m5327d(viewFragmentBlackboardCropBindingInflate);
        this.mBinding = viewFragmentBlackboardCropBindingInflate;
        View root = viewFragmentBlackboardCropBindingInflate.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
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

    public final void setBlackboardCropConfig(@NotNull BlackboardCropConfig blackboardCropConfig) {
        AbstractC5830k.m5330g(blackboardCropConfig, "blackboardCropConfig");
        this.mBlackboardCropConfig = blackboardCropConfig;
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

    public final void showProgress(@NotNull String tips, boolean isCancelable) {
        AbstractC5830k.m5330g(tips, "tips");
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = ProgressDialog.show(requireContext(), "", tips, false, isCancelable);
    }
}
