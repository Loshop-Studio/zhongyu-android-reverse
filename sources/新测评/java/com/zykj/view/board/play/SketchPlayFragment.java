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
import androidx.autofill.HintConstants;
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
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.Job;
import p027b8.AbstractC5046c;
import p035c5.InterfaceC5121d;
import p246t7.C9464a;
import p246t7.C9469c0;
import p246t7.C9470d;
import p246t7.C9473f;
import p246t7.C9474g;
import p246t7.C9475h;

@Metadata(m13557d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001{\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J!\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0003J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.Jh\u00109\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u001d2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0004\u0018\u0001022%\b\u0002\u00108\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u0004\u0018\u000102¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0004¢\u0006\u0004\b;\u0010\u0003J\u0015\u0010<\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b<\u0010\u0012J\r\u0010=\u001a\u00020\u0004¢\u0006\u0004\b=\u0010\u0003J\r\u0010>\u001a\u00020\u0004¢\u0006\u0004\b>\u0010\u0003J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\u00042\b\b\u0002\u0010B\u001a\u00020/2\b\b\u0002\u0010C\u001a\u00020\u001d¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0004¢\u0006\u0004\bF\u0010\u0003R\u0018\u0010I\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR&\u0010O\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010UR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010]R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR6\u0010q\u001a\"\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000402\u0012\u0004\u0012\u00020\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\"\u0010z\u001a\u0010\u0012\f\u0012\n w*\u0004\u0018\u00010/0/0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001b\u0010\u007f\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b]\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0089\u0001"}, m13558d2 = {"Lcom/zykj/view/board/play/SketchPlayFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "P", "M", "h0", "n0", "i0", "", "progress", "N", "(I)V", "O", "Lt7/a;", "newPlayerConfig", "J", "(Lt7/a;)V", "k0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isVisibleToUser", "setUserVisibleHint", "(Z)V", "hidden", "onHiddenChanged", "onResume", "onPause", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Y", "", "newSpeed", "showToast", "F", "(DZ)V", "", "path", "showLoading", "Lkotlin/Function1;", "", "onFailure", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "isVideo", "onSuccess", "a0", "(Ljava/lang/String;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "j0", "e0", "m0", "l0", "", "H", "()F", "tips", "isCancelable", "f0", "(Ljava/lang/String;Z)V", "hideProgress", "a", "Lt7/a;", "mNewPlayerConfig", "Ljava/util/ArrayList;", "Lt7/g;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "mNewPlayerConfigData", "Lt7/h;", "c", "Lt7/h;", "extraConfig", "d", "Z", "isReady", "e", "Ljava/lang/String;", "progressTime", "f", "totalTime", "g", "I", "mTotalTime", "h", "continueWhenResume", "i", "Lt7/f;", "j", "Lt7/f;", "playSpeedRatePopup", "Lt7/d;", "k", "Lt7/d;", "playSettingPopup", "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;", "l", "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;", "mBinding", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "playSpeedRateShowCall", "Lkotlin/Function0;", "n", "Lkotlin/jvm/functions/Function0;", "writeFileCallback", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "o", "Landroidx/activity/result/ActivityResultLauncher;", "permissionRequest", "com/zykj/view/board/play/SketchPlayFragment$g", "p", "Lkotlin/Lazy;", "()Lcom/zykj/view/board/play/SketchPlayFragment$g;", "playStatusListener", "Lkotlinx/coroutines/Job;", "q", "Lkotlinx/coroutines/Job;", "autoHideSeekBarJob", "Landroid/app/ProgressDialog;", "r", "Landroid/app/ProgressDialog;", "mProgressDialog", "s", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SuppressLint({"SetTextI18n"})
@SourceDebugExtension({"SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n257#2,2:840\n257#2,2:842\n257#2,2:844\n257#2,2:846\n257#2,2:848\n255#2:850\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n*L\n279#1:840,2\n281#1:842,2\n290#1:844,2\n292#1:846,2\n741#1:848,2\n221#1:850\n*E\n"})
/* loaded from: classes5.dex */
public final class SketchPlayFragment extends Fragment {

    /* renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public C9464a mNewPlayerConfig;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean isReady;

    /* renamed from: h, reason: from kotlin metadata */
    public boolean continueWhenResume;

    /* renamed from: i, reason: from kotlin metadata */
    public int progress;

    /* renamed from: j, reason: from kotlin metadata */
    public C9473f playSpeedRatePopup;

    /* renamed from: k, reason: from kotlin metadata */
    public C9470d playSettingPopup;

    /* renamed from: l, reason: from kotlin metadata */
    public ViewFragmentSketchPlayBinding mBinding;

    /* renamed from: m, reason: from kotlin metadata */
    public Function2 playSpeedRateShowCall;

    /* renamed from: n, reason: from kotlin metadata */
    public Function0 writeFileCallback;

    /* renamed from: o, reason: from kotlin metadata */
    public final ActivityResultLauncher permissionRequest;

    /* renamed from: p, reason: from kotlin metadata */
    public final Lazy playStatusListener;

    /* renamed from: q, reason: from kotlin metadata */
    public Job autoHideSeekBarJob;

    /* renamed from: r, reason: from kotlin metadata */
    public ProgressDialog mProgressDialog;

    /* renamed from: b, reason: from kotlin metadata */
    public ArrayList mNewPlayerConfigData = new ArrayList();

    /* renamed from: c, reason: from kotlin metadata */
    public C9475h extraConfig = new C9475h(false, false, false, false, null, null, null, 127, null);

    /* renamed from: e, reason: from kotlin metadata */
    public String progressTime = "00:00";

    /* renamed from: f, reason: from kotlin metadata */
    public String totalTime = "00:00";

    /* renamed from: g, reason: from kotlin metadata */
    public int mTotalTime = -1;

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m11275a(long j10) {
            long j11 = TimeConstants.MIN;
            long j12 = j10 / j11;
            long j13 = (j10 - (j11 * j12)) / 1000;
            StringBuffer stringBuffer = new StringBuffer();
            if (j12 >= 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                stringBuffer.append(str + ":");
            }
            if (j13 >= 0) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                stringBuffer.append(str2);
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$b */
    public static final /* synthetic */ class C7247b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11186a;

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
            f11186a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$c */
    public static final class C7248c implements InterfaceC5121d {
        public C7248c() {
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: a */
        public void mo2776a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11431f.setProgress(f10);
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: b */
        public void mo2777b(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11432g.setProgress(f10);
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: c */
        public void mo2778c() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11432g.setTouchable(true);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f11431f.setTouchable(true);
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: d */
        public void mo2779d() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11432g.setTouchable(false);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f11431f.setTouchable(false);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$d */
    public static final class C7249d implements SketchProgressView.InterfaceC7272b {
        public C7249d() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        /* renamed from: a */
        public void mo2533a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding.f11433h, Float.valueOf(f10), null, 2, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        /* renamed from: b */
        public void mo2534b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11433h.areaMoveStart();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding.f11433h, Float.valueOf(f10), null, 2, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$e */
    public static final class C7250e implements SketchProgressView.InterfaceC7272b {
        public C7250e() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        /* renamed from: a */
        public void mo2533a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding.f11433h, null, Float.valueOf(f10), 1, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        /* renamed from: b */
        public void mo2534b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11433h.areaMoveStart();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7272b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding.f11433h, null, Float.valueOf(f10), 1, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$f */
    public static final class C7251f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public PlayStatus f11190a;

        public C7251f() {
        }

        /* renamed from: c */
        public static final Unit m11278c(C7251f c7251f, SketchPlayFragment sketchPlayFragment, int i10) {
            PlayStatus playStatus = c7251f.f11190a;
            if (playStatus != null && ((playStatus == PlayStatus.RECORD_START || playStatus == PlayStatus.RECORD_RESUME) && sketchPlayFragment.getViewLifecycleOwner().getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED))) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                if (viewFragmentSketchPlayBinding.f11433h.status() == PlayStatus.RECORD_PAUSE) {
                    sketchPlayFragment.m11269i0();
                } else if (i10 == 0) {
                    sketchPlayFragment.m11270j0();
                }
            }
            sketchPlayFragment.hideProgress();
            return Unit.INSTANCE;
        }

        /* renamed from: d */
        public static final Unit m11279d(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ToastUtils.showShort("操作失败", new Object[0]);
            return Unit.INSTANCE;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            SketchPlayFragment.this.progressTime = SketchPlayFragment.INSTANCE.m11275a(i10);
            SketchPlayFragment.this.progress = i10;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11427b.f11540f.setText(SketchPlayFragment.this.progressTime + "/" + SketchPlayFragment.this.totalTime);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            this.f11190a = viewFragmentSketchPlayBinding.f11433h.status();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f11433h.waiting();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
            SketchPlayFragment.m11237g0(SketchPlayFragment.this, null, false, 3, null);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f11433h;
            int progress = seekBar.getProgress();
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            mergeSketchPlayView.seekTo(progress, new Function1() { // from class: t7.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C7251f.m11278c(this.f16582a, sketchPlayFragment, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: t7.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C7251f.m11279d((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$g */
    public static final class C7252g implements PlayStatusListener {
        public C7252g() {
        }

        /* renamed from: f */
        public static final void m11285f(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f11427b.f11537c.setImageResource(R$drawable.selector_btn_music_play);
                C9464a c9464a = sketchPlayFragment.mNewPlayerConfig;
                if (c9464a != null) {
                    c9464a.m15840h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: g */
        public static final void m11286g(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f11427b.f11537c.setImageResource(R$drawable.selector_btn_music_play);
                C9464a c9464a = sketchPlayFragment.mNewPlayerConfig;
                if (c9464a != null) {
                    c9464a.m15840h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m11287h(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f11427b.f11537c.setImageResource(R$drawable.selector_btn_music_pause);
                C9464a c9464a = sketchPlayFragment.mNewPlayerConfig;
                if (c9464a != null) {
                    c9464a.m15840h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: i */
        public static final void m11288i(SketchPlayFragment sketchPlayFragment) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11427b.f11537c.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: j */
        public static final void m11289j(SketchPlayFragment sketchPlayFragment, long j10) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f11427b.f11538d.setProgress((int) j10);
                sketchPlayFragment.progressTime = SketchPlayFragment.INSTANCE.m11275a(j10);
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                viewFragmentSketchPlayBinding2.f11427b.f11540f.setText(sketchPlayFragment.progressTime + "/" + sketchPlayFragment.totalTime);
                C9464a c9464a = sketchPlayFragment.mNewPlayerConfig;
                if (c9464a != null) {
                    c9464a.m15840h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayEnd() {
            SketchPlayFragment.this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f11427b.f11537c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: t7.z
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7252g.m11285f(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayPause() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f11427b.f11537c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: t7.x
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7252g.m11286g(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayStart() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f11427b.f11537c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: t7.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7252g.m11287h(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onPlayWait() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            ImageView imageView = viewFragmentSketchPlayBinding.f11427b.f11537c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: t7.b0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7252g.m11288i(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onProgress(final long j10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            TextView textView = viewFragmentSketchPlayBinding.f11427b.f11540f;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            textView.post(new Runnable() { // from class: t7.y
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7252g.m11289j(sketchPlayFragment, j10);
                }
            });
        }
    }

    public SketchPlayFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: t7.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SketchPlayFragment.m11228Z(this.f16566a, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.permissionRequest = activityResultLauncherRegisterForActivityResult;
        this.playStatusListener = LazyKt.lazy(new Function0() { // from class: t7.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchPlayFragment.m11233d0(this.f16575a);
            }
        });
    }

    /* renamed from: G */
    public static /* synthetic */ void m11216G(SketchPlayFragment sketchPlayFragment, double d10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        sketchPlayFragment.m11257F(d10, z9);
    }

    /* renamed from: K */
    public static final Unit m11217K() {
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m11218L() {
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    private final void m11219P() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.playSpeedRatePopup = new C9473f(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.playSettingPopup = new C9470d(fragmentActivityRequireActivity2);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f11427b.f11539e.setText("1.0X");
        m11261M();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        ImageView ivBack = viewFragmentSketchPlayBinding3.f11428c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC5046c.m2530f(ivBack, 0L, new View.OnClickListener() { // from class: t7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11220Q(this.f16576a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding4.f11430e;
        Intrinsics.checkNotNullExpressionValue(ivSetting, "ivSetting");
        AbstractC5046c.m2530f(ivSetting, 0L, new View.OnClickListener() { // from class: t7.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11221R(this.f16577a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
        if (viewFragmentSketchPlayBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        ImageView ivRecord = viewFragmentSketchPlayBinding5.f11427b.f11537c;
        Intrinsics.checkNotNullExpressionValue(ivRecord, "ivRecord");
        AbstractC5046c.m2530f(ivRecord, 0L, new View.OnClickListener() { // from class: t7.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11222S(this.f16578a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
        if (viewFragmentSketchPlayBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f11427b.f11538d.setOnSeekBarChangeListener(new C7251f());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
        if (viewFragmentSketchPlayBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding7 = null;
        }
        TextView tvSpeedRate = viewFragmentSketchPlayBinding7.f11427b.f11539e;
        Intrinsics.checkNotNullExpressionValue(tvSpeedRate, "tvSpeedRate");
        AbstractC5046c.m2530f(tvSpeedRate, 0L, new View.OnClickListener() { // from class: t7.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11223T(this.f16579a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
        if (viewFragmentSketchPlayBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding8 = null;
        }
        viewFragmentSketchPlayBinding8.f11427b.f11536b.setOnClickListener(new View.OnClickListener() { // from class: t7.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11226W(this.f16580a, view);
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.mBinding;
        if (viewFragmentSketchPlayBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding9;
        }
        viewFragmentSketchPlayBinding2.f11426a.setOnClickListener(new View.OnClickListener() { // from class: t7.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11227X(this.f16581a, view);
            }
        });
    }

    /* renamed from: Q */
    public static final void m11220Q(SketchPlayFragment sketchPlayFragment, View view) {
        Function0 function0M15833a;
        C9464a c9464a = sketchPlayFragment.mNewPlayerConfig;
        if (c9464a != null) {
            if (c9464a == null || (function0M15833a = c9464a.m15833a()) == null) {
                return;
            }
            function0M15833a.invoke();
            return;
        }
        FragmentActivity activity = sketchPlayFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: R */
    public static final void m11221R(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.mNewPlayerConfigData.isEmpty()) {
            ToastUtils.showShort(sketchPlayFragment.getString(R$string.no_content), new Object[0]);
            return;
        }
        C9470d c9470d = sketchPlayFragment.playSettingPopup;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (c9470d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playSettingPopup");
            c9470d = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding.f11430e;
        Intrinsics.checkNotNullExpressionValue(ivSetting, "ivSetting");
        c9470d.m15849a(ivSetting, sketchPlayFragment.mNewPlayerConfigData);
    }

    /* renamed from: S */
    public static final void m11222S(SketchPlayFragment sketchPlayFragment, View view) {
        sketchPlayFragment.m11264Y();
    }

    /* renamed from: T */
    public static final void m11223T(final SketchPlayFragment sketchPlayFragment, View view) {
        Function2 function2 = sketchPlayFragment.playSpeedRateShowCall;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (function2 != null) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            TextView tvSpeedRate = viewFragmentSketchPlayBinding.f11427b.f11539e;
            Intrinsics.checkNotNullExpressionValue(tvSpeedRate, "tvSpeedRate");
            function2.invoke(tvSpeedRate, new Function1() { // from class: t7.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.m11224U(this.f16567a, ((Double) obj).doubleValue());
                }
            });
            return;
        }
        C9473f c9473f = sketchPlayFragment.playSpeedRatePopup;
        if (c9473f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playSpeedRatePopup");
            c9473f = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        TextView tvSpeedRate2 = viewFragmentSketchPlayBinding3.f11427b.f11539e;
        Intrinsics.checkNotNullExpressionValue(tvSpeedRate2, "tvSpeedRate");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
        }
        c9473f.m15852b(tvSpeedRate2, viewFragmentSketchPlayBinding.f11427b.f11539e.getText().toString(), new Function1() { // from class: t7.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SketchPlayFragment.m11225V(this.f16568a, (C9469c0) obj);
            }
        });
    }

    /* renamed from: U */
    public static final Unit m11224U(SketchPlayFragment sketchPlayFragment, double d10) {
        m11216G(sketchPlayFragment, d10, false, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m11225V(SketchPlayFragment sketchPlayFragment, C9469c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m11216G(sketchPlayFragment, it.m15846e(), false, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final void m11226W(SketchPlayFragment sketchPlayFragment, View view) {
        Function1 function1M15857b = sketchPlayFragment.extraConfig.m15857b();
        if (function1M15857b != null) {
            Intrinsics.checkNotNull(view);
            function1M15857b.invoke(view);
        }
    }

    /* renamed from: X */
    public static final void m11227X(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.extraConfig.m15859d()) {
            sketchPlayFragment.m11274n0();
            Function1 function1M15861f = sketchPlayFragment.extraConfig.m15861f();
            if (function1M15861f != null) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding.f11427b.f11536b;
                Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
                function1M15861f.invoke(Boolean.valueOf(ivFullscreen.getVisibility() == 0));
            }
        }
    }

    /* renamed from: Z */
    public static final void m11228Z(SketchPlayFragment sketchPlayFragment, Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.booleanValue()) {
            sketchPlayFragment.writeFileCallback = null;
            return;
        }
        Function0 function0 = sketchPlayFragment.writeFileCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m11229b0(SketchPlayFragment sketchPlayFragment, String str, int i10, boolean z9, Function1 function1, Function1 function12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            z9 = true;
        }
        sketchPlayFragment.m11265a0(str, i12, z9, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? null : function12);
    }

    /* renamed from: c0 */
    public static final Unit m11231c0(SketchPlayFragment sketchPlayFragment, boolean z9, String str, int i10, Function1 function1, Function1 function12) {
        LifecycleOwnerKt.getLifecycleScope(sketchPlayFragment).launchWhenStarted(new SketchPlayFragment$play$1$1(z9, sketchPlayFragment, str, i10, function1, function12, null));
        return Unit.INSTANCE;
    }

    /* renamed from: d0 */
    public static final C7252g m11233d0(SketchPlayFragment sketchPlayFragment) {
        return sketchPlayFragment.new C7252g();
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m11237g0(SketchPlayFragment sketchPlayFragment, String str, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sketchPlayFragment.getString(R$string.progress_content);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        sketchPlayFragment.m11267f0(str, z9);
    }

    /* renamed from: F */
    public final void m11257F(double newSpeed, boolean showToast) {
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (!viewFragmentSketchPlayBinding.f11433h.setRate(newSpeed)) {
                if (showToast) {
                    ToastUtils.showShort(getString(R$string.micro_lesson_not_support_speed), new Object[0]);
                    return;
                }
                return;
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f11427b.f11539e.setText(newSpeed + "X");
            if (showToast) {
                ToastUtils.showShort(getString(R$string.speed_rate_change, String.valueOf(newSpeed)), new Object[0]);
            }
        } catch (Exception unused) {
            if (showToast) {
                ToastUtils.showShort(getString(R$string.device_not_support_speed), new Object[0]);
            }
        }
    }

    /* renamed from: H */
    public final float m11258H() {
        return this.progress / this.mTotalTime;
    }

    /* renamed from: I */
    public final C7252g m11259I() {
        return (C7252g) this.playStatusListener.getValue();
    }

    /* renamed from: J */
    public final void m11260J(C9464a newPlayerConfig) {
        this.mNewPlayerConfigData.clear();
        if (newPlayerConfig.m15838f()) {
            ArrayList arrayList = this.mNewPlayerConfigData;
            int i10 = R$drawable.icon_play_setting_delete;
            String string = requireContext().getString(R$string.delete);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Function0 function0M15834b = newPlayerConfig.m15834b();
            if (function0M15834b == null) {
                function0M15834b = new Function0() { // from class: t7.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SketchPlayFragment.m11217K();
                    }
                };
            }
            arrayList.add(new C9474g(i10, string, function0M15834b));
        }
        if (newPlayerConfig.m15839g()) {
            ArrayList arrayList2 = this.mNewPlayerConfigData;
            int i11 = R$drawable.icon_play_setting_record;
            String string2 = requireContext().getString(R$string.record);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Function0 function0M15835c = newPlayerConfig.m15835c();
            if (function0M15835c == null) {
                function0M15835c = new Function0() { // from class: t7.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SketchPlayFragment.m11218L();
                    }
                };
            }
            arrayList2.add(new C9474g(i11, string2, function0M15835c));
        }
        this.mNewPlayerConfigData.addAll(newPlayerConfig.m15836d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f11430e.setVisibility(!this.mNewPlayerConfigData.isEmpty() ? 0 : 8);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
        }
        viewFragmentSketchPlayBinding2.f11428c.setVisibility(newPlayerConfig.m15837e() ? 0 : 8);
    }

    /* renamed from: M */
    public final void m11261M() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        Group groupSeekBar = viewFragmentSketchPlayBinding.f11427b.f11535a;
        Intrinsics.checkNotNullExpressionValue(groupSeekBar, "groupSeekBar");
        groupSeekBar.setVisibility(8);
        if (this.extraConfig.m15860e()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f11427b.f11536b;
            Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
            ivFullscreen.setVisibility(8);
        }
    }

    /* renamed from: N */
    public final void m11262N(int progress) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f11427b.f11538d.setMax(this.mTotalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        viewFragmentSketchPlayBinding3.f11427b.f11538d.setProgress(progress);
        this.totalTime = INSTANCE.m11275a(this.mTotalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        viewFragmentSketchPlayBinding4.f11427b.f11540f.setText(this.progressTime + "/" + this.totalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
        if (viewFragmentSketchPlayBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        viewFragmentSketchPlayBinding5.f11433h.removePlayActionListener(m11259I());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
        if (viewFragmentSketchPlayBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f11433h.addPlayActionListener(m11259I());
        this.isReady = true;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
        if (viewFragmentSketchPlayBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
        }
        viewFragmentSketchPlayBinding2.f11427b.f11537c.setImageResource(R$drawable.selector_btn_music_play);
        m11268h0();
    }

    /* renamed from: O */
    public final void m11263O() {
        Float fValueOf = Float.valueOf(0.0f);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f11433h.setAreaMoveListener(new C7248c());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        int moveMaxWidthTimes = viewFragmentSketchPlayBinding3.f11433h.getMoveMaxWidthTimes();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        int moveMaxHeightTimes = viewFragmentSketchPlayBinding4.f11433h.getMoveMaxHeightTimes();
        if (moveMaxWidthTimes > 1) {
            C9464a c9464a = this.mNewPlayerConfig;
            if (c9464a != null && c9464a.m15841i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
                if (viewFragmentSketchPlayBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding5 = null;
                }
                viewFragmentSketchPlayBinding5.f11433h.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
                if (viewFragmentSketchPlayBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding6 = null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding6.f11433h, fValueOf, null, 2, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
            if (viewFragmentSketchPlayBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding7 = null;
            }
            viewFragmentSketchPlayBinding7.f11431f.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
            if (viewFragmentSketchPlayBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding8 = null;
            }
            viewFragmentSketchPlayBinding8.f11431f.setThumbTime(1.0f / moveMaxWidthTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.mBinding;
            if (viewFragmentSketchPlayBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding9 = null;
            }
            SketchProgressView sketchProgressView = viewFragmentSketchPlayBinding9.f11431f;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding10 = this.mBinding;
            if (viewFragmentSketchPlayBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding10 = null;
            }
            sketchProgressView.setProgress(viewFragmentSketchPlayBinding10.f11433h.getMoveHorizontalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding11 = this.mBinding;
            if (viewFragmentSketchPlayBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding11 = null;
            }
            viewFragmentSketchPlayBinding11.f11431f.setVisibility(8);
        }
        if (moveMaxHeightTimes > 1) {
            C9464a c9464a2 = this.mNewPlayerConfig;
            if (c9464a2 != null && c9464a2.m15841i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding12 = this.mBinding;
                if (viewFragmentSketchPlayBinding12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding12 = null;
                }
                viewFragmentSketchPlayBinding12.f11433h.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding13 = this.mBinding;
                if (viewFragmentSketchPlayBinding13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding13 = null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding13.f11433h, null, fValueOf, 1, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding14 = this.mBinding;
            if (viewFragmentSketchPlayBinding14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding14 = null;
            }
            viewFragmentSketchPlayBinding14.f11432g.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding15 = this.mBinding;
            if (viewFragmentSketchPlayBinding15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding15 = null;
            }
            viewFragmentSketchPlayBinding15.f11432g.setThumbTime(1.0f / moveMaxHeightTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding16 = this.mBinding;
            if (viewFragmentSketchPlayBinding16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding16 = null;
            }
            SketchProgressView sketchProgressView2 = viewFragmentSketchPlayBinding16.f11432g;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = this.mBinding;
            if (viewFragmentSketchPlayBinding17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding17 = null;
            }
            sketchProgressView2.setProgress(viewFragmentSketchPlayBinding17.f11433h.getMoveVerticalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = this.mBinding;
            if (viewFragmentSketchPlayBinding18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding18 = null;
            }
            viewFragmentSketchPlayBinding18.f11432g.setVisibility(8);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding19 = this.mBinding;
        if (viewFragmentSketchPlayBinding19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding19 = null;
        }
        viewFragmentSketchPlayBinding19.f11431f.setProgressListener(new C7249d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding20 = this.mBinding;
        if (viewFragmentSketchPlayBinding20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding20;
        }
        viewFragmentSketchPlayBinding2.f11432g.setProgressListener(new C7250e());
    }

    /* renamed from: Y */
    public final void m11264Y() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.f11433h.status();
        int i10 = playStatusStatus == null ? -1 : C7247b.f11186a[playStatusStatus.ordinal()];
        if (i10 == 1) {
            this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            viewFragmentSketchPlayBinding3.f11433h.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
            if (viewFragmentSketchPlayBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f11427b.f11537c.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 2) {
            this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
            if (viewFragmentSketchPlayBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding5 = null;
            }
            viewFragmentSketchPlayBinding5.f11433h.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
            if (viewFragmentSketchPlayBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding6;
            }
            viewFragmentSketchPlayBinding2.f11427b.f11537c.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i10 == 3) {
            this.continueWhenResume = true;
            m11269i0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
            if (viewFragmentSketchPlayBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
            }
            viewFragmentSketchPlayBinding2.f11427b.f11537c.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i10 != 4) {
            return;
        }
        this.continueWhenResume = true;
        m11270j0();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
        if (viewFragmentSketchPlayBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding8;
        }
        viewFragmentSketchPlayBinding2.f11427b.f11537c.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: a0 */
    public final void m11265a0(final String path, final int progress, final boolean showLoading, final Function1 onFailure, final Function1 onSuccess) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.writeFileCallback = new Function0() { // from class: t7.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchPlayFragment.m11231c0(this.f16569a, showLoading, path, progress, onSuccess, onFailure);
            }
        };
        this.permissionRequest.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: e0 */
    public final void m11266e0(C9464a newPlayerConfig) {
        Intrinsics.checkNotNullParameter(newPlayerConfig, "newPlayerConfig");
        this.mNewPlayerConfig = newPlayerConfig;
        if (getView() != null) {
            m11260J(newPlayerConfig);
        }
    }

    /* renamed from: f0 */
    public final void m11267f0(String tips, boolean isCancelable) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = ProgressDialog.show(requireContext(), "", tips, false, isCancelable);
    }

    /* renamed from: h0 */
    public final void m11268h0() {
        if (this.mTotalTime > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f11427b.f11535a;
            Intrinsics.checkNotNullExpressionValue(groupSeekBar, "groupSeekBar");
            groupSeekBar.setVisibility(0);
            if (this.extraConfig.m15860e()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f11427b.f11536b;
                Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
                ivFullscreen.setVisibility(0);
            }
        }
    }

    public final void hideProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    /* renamed from: i0 */
    public final void m11269i0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchResumePlaying$1(this, null));
    }

    /* renamed from: j0 */
    public final void m11270j0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchStartPlaying$1(this, null));
    }

    /* renamed from: k0 */
    public final void m11271k0() {
        Job job = this.autoHideSeekBarJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.autoHideSeekBarJob = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$startControlBarJob$1(this, null));
    }

    /* renamed from: l0 */
    public final void m11272l0() {
        if (this.isReady) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.f11433h.status();
            int i10 = playStatusStatus == null ? -1 : C7247b.f11186a[playStatusStatus.ordinal()];
            if (i10 == 3) {
                m11269i0();
            } else {
                if (i10 != 4) {
                    return;
                }
                m11270j0();
            }
        }
    }

    /* renamed from: m0 */
    public final void m11273m0() {
        if (this.isReady) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (viewFragmentSketchPlayBinding.f11433h.status() != PlayStatus.RECORD_START) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding3 = null;
                }
                if (viewFragmentSketchPlayBinding3.f11433h.status() != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
            if (viewFragmentSketchPlayBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f11433h.pause();
        }
    }

    /* renamed from: n0 */
    public final void m11274n0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$toggleControlBarVisible$1(this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBindingM11415a = ViewFragmentSketchPlayBinding.m11415a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewFragmentSketchPlayBindingM11415a, "inflate(...)");
        this.mBinding = viewFragmentSketchPlayBindingM11415a;
        if (viewFragmentSketchPlayBindingM11415a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBindingM11415a = null;
        }
        View root = viewFragmentSketchPlayBindingM11415a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hideProgress();
        if (this.isReady) {
            m11273m0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f11433h.release();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f11433h.destroy();
        }
        this.isReady = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isAdded() && hidden) {
            m11273m0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m11273m0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.continueWhenResume) {
            m11272l0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11219P();
        C9464a c9464a = this.mNewPlayerConfig;
        if (c9464a != null) {
            m11260J(c9464a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isAdded() || isVisibleToUser) {
            return;
        }
        m11273m0();
    }
}
