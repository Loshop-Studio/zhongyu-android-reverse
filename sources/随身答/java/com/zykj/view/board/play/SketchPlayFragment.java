package com.zykj.view.board.play;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.timepicker.TimeModel;
import com.taobao.sophix.PatchStatus;
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
import kotlinx.coroutines.scheduling.WorkQueueKt;
import p097e7.C7853a;
import p097e7.C7858c0;
import p097e7.C7859d;
import p097e7.C7862f;
import p097e7.C7863g;
import p097e7.C7864h;
import p181m7.AbstractC9026c;
import p243s5.InterfaceC9476d;

@Metadata(m13412d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002¦\u0001\b\u0007\u0018\u0000 ³\u00012\u00020\u0001:\u0001sB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J!\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u001d¢\u0006\u0004\b.\u0010 J\u001f\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u001d¢\u0006\u0004\b2\u00103Jh\u0010>\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\u001d2\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0004\u0018\u0001072%\b\u0002\u0010=\u001a\u001f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u0004\u0018\u000107¢\u0006\u0004\b>\u0010?JC\u0010B\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010@\u001a\u00020\u001d2\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010A2\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010A¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010\u0003J\u0015\u0010E\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bE\u0010\u0012J\r\u0010F\u001a\u00020\u001d¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u0004¢\u0006\u0004\bH\u0010\u0003J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0003J\u001b\u0010K\u001a\u00020\u00042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040A¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u001d¢\u0006\u0004\bN\u0010 J!\u0010P\u001a\u00020\u00042\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000407¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u001d¢\u0006\u0004\bS\u0010 J\u0015\u0010V\u001a\u00020\u00042\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00042\b\b\u0001\u0010X\u001a\u00020\n¢\u0006\u0004\bY\u0010\rJ\u0017\u0010[\u001a\u00020\u00042\b\b\u0001\u0010Z\u001a\u00020\n¢\u0006\u0004\b[\u0010\rJ\u0015\u0010\\\u001a\u00020\u00042\u0006\u0010U\u001a\u00020T¢\u0006\u0004\b\\\u0010WJ\u0015\u0010^\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u001d¢\u0006\u0004\b^\u0010 J\u0015\u0010`\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u001d¢\u0006\u0004\b`\u0010 J0\u0010c\u001a\u00020\u00042!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(a\u0012\u0004\u0012\u00020\u000407¢\u0006\u0004\bc\u0010QJ\u0015\u0010e\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u001d¢\u0006\u0004\be\u0010 J\u0017\u0010g\u001a\u00020\u00042\b\b\u0001\u0010f\u001a\u00020\n¢\u0006\u0004\bg\u0010\rJ\r\u0010h\u001a\u00020/¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u001d¢\u0006\u0004\bj\u0010GJ\r\u0010k\u001a\u00020\n¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020\u0004¢\u0006\u0004\bm\u0010\u0003J!\u0010p\u001a\u00020\u00042\b\b\u0002\u0010n\u001a\u0002042\b\b\u0002\u0010o\u001a\u00020\u001d¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0004¢\u0006\u0004\br\u0010\u0003R\u0018\u0010u\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR&\u0010{\u001a\u0012\u0012\u0004\u0012\u00020w0vj\b\u0012\u0004\u0012\u00020w`x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0082\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0081\u0001R\u0018\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R:\u0010\u009d\u0001\u001a#\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000407\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010 \u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010¥\u0001\u001a\u0012\u0012\r\u0012\u000b ¢\u0001*\u0004\u0018\u000104040¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R!\u0010ª\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b\u0089\u0001\u0010©\u0001R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001¨\u0006´\u0001"}, m13413d2 = {"Lcom/zykj/view/board/play/SketchPlayFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", ExifInterface.GPS_DIRECTION_TRUE, "Q", "C0", "I0", "D0", "", "progress", "R", "(I)V", ExifInterface.LATITUDE_SOUTH, "Le7/a;", "newPlayerConfig", "M", "(Le7/a;)V", "F0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isVisibleToUser", "setUserVisibleHint", "(Z)V", "hidden", "onHiddenChanged", "onResume", "onPause", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "e0", "Landroid/graphics/Bitmap;", "K", "()Landroid/graphics/Bitmap;", "isEnable", "t0", "", "newSpeed", "showToast", "G", "(DZ)V", "", "path", "showLoading", "Lkotlin/Function1;", "", "onFailure", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "isVideo", "onSuccess", "g0", "(Ljava/lang/String;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "resumePlaying", "Lkotlin/Function0;", "k0", "(IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "E0", "r0", "c0", "()Z", "H0", "G0", "onAutoHideAction", "s0", "(Lkotlin/jvm/functions/Function0;)V", "seekBarVisibleManually", "w0", "sketchTapAction", "x0", "(Lkotlin/jvm/functions/Function1;)V", "interceptWhenVideo", "q0", "Landroid/graphics/drawable/Drawable;", "drawable", "u0", "(Landroid/graphics/drawable/Drawable;)V", TypedValues.Custom.S_COLOR, "v0", "colorRes", "z0", "y0", "isVisible", "p0", "state", "l0", "itself", "fullscreenClickListener", "m0", "selected", "o0", "resId", "n0", "L", "()D", "d0", "J", "()I", "F", "tips", "isCancelable", "A0", "(Ljava/lang/String;Z)V", "P", "a", "Le7/a;", "mNewPlayerConfig", "Ljava/util/ArrayList;", "Le7/g;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "mNewPlayerConfigData", "Le7/h;", "c", "Le7/h;", "extraConfig", "d", "Z", "isReady", "e", "Ljava/lang/String;", "progressTime", "f", "totalTime", "g", "I", "mTotalTime", "h", "continueWhenResume", "i", "Le7/f;", "j", "Le7/f;", "playSpeedRatePopup", "Le7/d;", "k", "Le7/d;", "playSettingPopup", "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;", "l", "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;", "mBinding", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "playSpeedRateShowCall", "n", "Lkotlin/jvm/functions/Function0;", "writeFileCallback", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "o", "Landroidx/activity/result/ActivityResultLauncher;", "permissionRequest", "com/zykj/view/board/play/SketchPlayFragment$g", "p", "Lkotlin/Lazy;", "()Lcom/zykj/view/board/play/SketchPlayFragment$g;", "playStatusListener", "Lkotlinx/coroutines/Job;", "q", "Lkotlinx/coroutines/Job;", "autoHideSeekBarJob", "Landroid/app/ProgressDialog;", "r", "Landroid/app/ProgressDialog;", "mProgressDialog", "s", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"SetTextI18n"})
@SourceDebugExtension({"SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n257#2,2:840\n257#2,2:842\n257#2,2:844\n257#2,2:846\n257#2,2:848\n255#2:850\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n*L\n279#1:840,2\n281#1:842,2\n290#1:844,2\n292#1:846,2\n741#1:848,2\n221#1:850\n*E\n"})
/* loaded from: classes5.dex */
public final class SketchPlayFragment extends Fragment {

    /* renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public C7853a mNewPlayerConfig;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean isReady;

    /* renamed from: h, reason: from kotlin metadata */
    public boolean continueWhenResume;

    /* renamed from: i, reason: from kotlin metadata */
    public int progress;

    /* renamed from: j, reason: from kotlin metadata */
    public C7862f playSpeedRatePopup;

    /* renamed from: k, reason: from kotlin metadata */
    public C7859d playSettingPopup;

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
    public C7864h extraConfig = new C7864h(false, false, false, false, null, null, null, WorkQueueKt.MASK, null);

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
        public final String m11755a(long j9) {
            long j10 = TimeConstants.MIN;
            long j11 = j9 / j10;
            long j12 = (j9 - (j10 * j11)) / 1000;
            StringBuffer stringBuffer = new StringBuffer();
            if (j11 >= 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                stringBuffer.append(str + ":");
            }
            if (j12 >= 0) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
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
    public static final /* synthetic */ class C7697b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12408a;

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
            f12408a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$c */
    public static final class C7698c implements InterfaceC9476d {
        public C7698c() {
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: a */
        public void mo2221a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12675f.setProgress(f10);
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: b */
        public void mo2222b(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12676g.setProgress(f10);
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: c */
        public void mo2223c() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12676g.setTouchable(true);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f12675f.setTouchable(true);
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: d */
        public void mo2224d() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12676g.setTouchable(false);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f12675f.setTouchable(false);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$d */
    public static final class C7699d implements SketchProgressView.InterfaceC7728b {
        public C7699d() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        /* renamed from: a */
        public void mo11756a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding.f12677h, Float.valueOf(f10), null, 2, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        /* renamed from: b */
        public void mo11757b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12677h.areaMoveStart();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding.f12677h, Float.valueOf(f10), null, 2, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$e */
    public static final class C7700e implements SketchProgressView.InterfaceC7728b {
        public C7700e() {
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        /* renamed from: a */
        public void mo11756a(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding.f12677h, null, Float.valueOf(f10), 1, null);
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        /* renamed from: b */
        public void mo11757b() {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12677h.areaMoveStart();
        }

        @Override // com.zykj.view.widget.SketchProgressView.InterfaceC7728b
        public void onProgress(float f10) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding.f12677h, null, Float.valueOf(f10), 1, null);
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$f */
    public static final class C7701f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public PlayStatus f12412a;

        public C7701f() {
        }

        /* renamed from: c */
        public static final Unit m11760c(C7701f c7701f, SketchPlayFragment sketchPlayFragment, int i9) {
            PlayStatus playStatus = c7701f.f12412a;
            if (playStatus != null && ((playStatus == PlayStatus.RECORD_START || playStatus == PlayStatus.RECORD_RESUME) && sketchPlayFragment.getViewLifecycleOwner().getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED))) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                if (viewFragmentSketchPlayBinding.f12677h.status() == PlayStatus.RECORD_PAUSE) {
                    sketchPlayFragment.m11718D0();
                } else if (i9 == 0) {
                    sketchPlayFragment.m11719E0();
                }
            }
            sketchPlayFragment.m11731P();
            return Unit.INSTANCE;
        }

        /* renamed from: d */
        public static final Unit m11761d(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ToastUtils.showShort("操作失败", new Object[0]);
            return Unit.INSTANCE;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            SketchPlayFragment.this.progressTime = SketchPlayFragment.INSTANCE.m11755a(i9);
            SketchPlayFragment.this.progress = i9;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12671b.f12784f.setText(SketchPlayFragment.this.progressTime + "/" + SketchPlayFragment.this.totalTime);
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
            this.f12412a = viewFragmentSketchPlayBinding.f12677h.status();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f12677h.waiting();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
            SketchPlayFragment.m11672B0(SketchPlayFragment.this, null, false, 3, null);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f12677h;
            int progress = seekBar.getProgress();
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            mergeSketchPlayView.seekTo(progress, new Function1() { // from class: e7.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C7701f.m11760c(this.f13249a, sketchPlayFragment, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: e7.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.C7701f.m11761d((Throwable) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$g */
    public static final class C7702g implements PlayStatusListener {
        public C7702g() {
        }

        /* renamed from: f */
        public static final void m11767f(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f12671b.f12781c.setImageResource(R$drawable.selector_btn_music_play);
                C7853a c7853a = sketchPlayFragment.mNewPlayerConfig;
                if (c7853a != null) {
                    c7853a.m12337h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: g */
        public static final void m11768g(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f12671b.f12781c.setImageResource(R$drawable.selector_btn_music_play);
                C7853a c7853a = sketchPlayFragment.mNewPlayerConfig;
                if (c7853a != null) {
                    c7853a.m12337h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m11769h(SketchPlayFragment sketchPlayFragment) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f12671b.f12781c.setImageResource(R$drawable.selector_btn_music_pause);
                C7853a c7853a = sketchPlayFragment.mNewPlayerConfig;
                if (c7853a != null) {
                    c7853a.m12337h();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: i */
        public static final void m11770i(SketchPlayFragment sketchPlayFragment) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12671b.f12781c.setImageResource(R$drawable.selector_btn_music_pause);
        }

        /* renamed from: j */
        public static final void m11771j(SketchPlayFragment sketchPlayFragment, long j9) {
            try {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                viewFragmentSketchPlayBinding.f12671b.f12782d.setProgress((int) j9);
                sketchPlayFragment.progressTime = SketchPlayFragment.INSTANCE.m11755a(j9);
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                viewFragmentSketchPlayBinding2.f12671b.f12784f.setText(sketchPlayFragment.progressTime + "/" + sketchPlayFragment.totalTime);
                C7853a c7853a = sketchPlayFragment.mNewPlayerConfig;
                if (c7853a != null) {
                    c7853a.m12337h();
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
            ImageView imageView = viewFragmentSketchPlayBinding.f12671b.f12781c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: e7.z
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7702g.m11767f(sketchPlayFragment);
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
            ImageView imageView = viewFragmentSketchPlayBinding.f12671b.f12781c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: e7.x
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7702g.m11768g(sketchPlayFragment);
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
            ImageView imageView = viewFragmentSketchPlayBinding.f12671b.f12781c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: e7.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7702g.m11769h(sketchPlayFragment);
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
            ImageView imageView = viewFragmentSketchPlayBinding.f12671b.f12781c;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            imageView.post(new Runnable() { // from class: e7.b0
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7702g.m11770i(sketchPlayFragment);
                }
            });
        }

        @Override // com.zykj.merge.sketch.listener.PlayStatusListener
        public void onProgress(final long j9) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            TextView textView = viewFragmentSketchPlayBinding.f12671b.f12784f;
            final SketchPlayFragment sketchPlayFragment = SketchPlayFragment.this;
            textView.post(new Runnable() { // from class: e7.y
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment.C7702g.m11771j(sketchPlayFragment, j9);
                }
            });
        }
    }

    public SketchPlayFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: e7.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SketchPlayFragment.m11692f0(this.f13233a, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.permissionRequest = activityResultLauncherRegisterForActivityResult;
        this.playStatusListener = LazyKt.lazy(new Function0() { // from class: e7.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchPlayFragment.m11699j0(this.f13242a);
            }
        });
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m11672B0(SketchPlayFragment sketchPlayFragment, String str, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = sketchPlayFragment.getString(R$string.progress_content);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        sketchPlayFragment.m11716A0(str, z9);
    }

    /* renamed from: H */
    public static /* synthetic */ void m11676H(SketchPlayFragment sketchPlayFragment, double d10, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = true;
        }
        sketchPlayFragment.m11722G(d10, z9);
    }

    /* renamed from: N */
    public static final Unit m11677N() {
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m11678O() {
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    private final void m11679T() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.playSpeedRatePopup = new C7862f(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.playSettingPopup = new C7859d(fragmentActivityRequireActivity2);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12671b.f12783e.setText("1.0X");
        m11732Q();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        ImageView ivBack = viewFragmentSketchPlayBinding3.f12672c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC9026c.m14393f(ivBack, 0L, new View.OnClickListener() { // from class: e7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11680U(this.f13243a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding4.f12674e;
        Intrinsics.checkNotNullExpressionValue(ivSetting, "ivSetting");
        AbstractC9026c.m14393f(ivSetting, 0L, new View.OnClickListener() { // from class: e7.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11681V(this.f13244a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
        if (viewFragmentSketchPlayBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        ImageView ivRecord = viewFragmentSketchPlayBinding5.f12671b.f12781c;
        Intrinsics.checkNotNullExpressionValue(ivRecord, "ivRecord");
        AbstractC9026c.m14393f(ivRecord, 0L, new View.OnClickListener() { // from class: e7.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11682W(this.f13245a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
        if (viewFragmentSketchPlayBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f12671b.f12782d.setOnSeekBarChangeListener(new C7701f());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
        if (viewFragmentSketchPlayBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding7 = null;
        }
        TextView tvSpeedRate = viewFragmentSketchPlayBinding7.f12671b.f12783e;
        Intrinsics.checkNotNullExpressionValue(tvSpeedRate, "tvSpeedRate");
        AbstractC9026c.m14393f(tvSpeedRate, 0L, new View.OnClickListener() { // from class: e7.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11683X(this.f13246a, view);
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
        if (viewFragmentSketchPlayBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding8 = null;
        }
        viewFragmentSketchPlayBinding8.f12671b.f12780b.setOnClickListener(new View.OnClickListener() { // from class: e7.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11686a0(this.f13247a, view);
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.mBinding;
        if (viewFragmentSketchPlayBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding9;
        }
        viewFragmentSketchPlayBinding2.f12670a.setOnClickListener(new View.OnClickListener() { // from class: e7.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchPlayFragment.m11687b0(this.f13248a, view);
            }
        });
    }

    /* renamed from: U */
    public static final void m11680U(SketchPlayFragment sketchPlayFragment, View view) {
        Function0 function0M12330a;
        C7853a c7853a = sketchPlayFragment.mNewPlayerConfig;
        if (c7853a != null) {
            if (c7853a == null || (function0M12330a = c7853a.m12330a()) == null) {
                return;
            }
            function0M12330a.invoke();
            return;
        }
        FragmentActivity activity = sketchPlayFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: V */
    public static final void m11681V(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.mNewPlayerConfigData.isEmpty()) {
            ToastUtils.showShort(sketchPlayFragment.getString(R$string.no_content), new Object[0]);
            return;
        }
        C7859d c7859d = sketchPlayFragment.playSettingPopup;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (c7859d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playSettingPopup");
            c7859d = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding.f12674e;
        Intrinsics.checkNotNullExpressionValue(ivSetting, "ivSetting");
        c7859d.m12346a(ivSetting, sketchPlayFragment.mNewPlayerConfigData);
    }

    /* renamed from: W */
    public static final void m11682W(SketchPlayFragment sketchPlayFragment, View view) {
        sketchPlayFragment.m11737e0();
    }

    /* renamed from: X */
    public static final void m11683X(final SketchPlayFragment sketchPlayFragment, View view) {
        Function2 function2 = sketchPlayFragment.playSpeedRateShowCall;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (function2 != null) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            TextView tvSpeedRate = viewFragmentSketchPlayBinding.f12671b.f12783e;
            Intrinsics.checkNotNullExpressionValue(tvSpeedRate, "tvSpeedRate");
            function2.invoke(tvSpeedRate, new Function1() { // from class: e7.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchPlayFragment.m11684Y(this.f13234a, ((Double) obj).doubleValue());
                }
            });
            return;
        }
        C7862f c7862f = sketchPlayFragment.playSpeedRatePopup;
        if (c7862f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playSpeedRatePopup");
            c7862f = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        TextView tvSpeedRate2 = viewFragmentSketchPlayBinding3.f12671b.f12783e;
        Intrinsics.checkNotNullExpressionValue(tvSpeedRate2, "tvSpeedRate");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
        }
        c7862f.m12351d(tvSpeedRate2, viewFragmentSketchPlayBinding.f12671b.f12783e.getText().toString(), new Function1() { // from class: e7.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SketchPlayFragment.m11685Z(this.f13235a, (C7858c0) obj);
            }
        });
    }

    /* renamed from: Y */
    public static final Unit m11684Y(SketchPlayFragment sketchPlayFragment, double d10) {
        m11676H(sketchPlayFragment, d10, false, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final Unit m11685Z(SketchPlayFragment sketchPlayFragment, C7858c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m11676H(sketchPlayFragment, it.m12343e(), false, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: a0 */
    public static final void m11686a0(SketchPlayFragment sketchPlayFragment, View view) {
        Function1 function1M12358d = sketchPlayFragment.extraConfig.m12358d();
        if (function1M12358d != null) {
            Intrinsics.checkNotNull(view);
            function1M12358d.invoke(view);
        }
    }

    /* renamed from: b0 */
    public static final void m11687b0(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.extraConfig.m12360f()) {
            sketchPlayFragment.m11726I0();
            Function1 function1M12362h = sketchPlayFragment.extraConfig.m12362h();
            if (function1M12362h != null) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding = null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding.f12671b.f12780b;
                Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
                function1M12362h.invoke(Boolean.valueOf(ivFullscreen.getVisibility() == 0));
            }
        }
    }

    /* renamed from: f0 */
    public static final void m11692f0(SketchPlayFragment sketchPlayFragment, Boolean it) {
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

    /* renamed from: h0 */
    public static /* synthetic */ void m11695h0(SketchPlayFragment sketchPlayFragment, String str, int i9, boolean z9, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        int i11 = i9;
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        sketchPlayFragment.m11738g0(str, i11, z9, (i10 & 8) != 0 ? null : function1, (i10 & 16) != 0 ? null : function12);
    }

    /* renamed from: i0 */
    public static final Unit m11697i0(SketchPlayFragment sketchPlayFragment, boolean z9, String str, int i9, Function1 function1, Function1 function12) {
        LifecycleOwnerKt.getLifecycleScope(sketchPlayFragment).launchWhenStarted(new SketchPlayFragment$play$1$1(z9, sketchPlayFragment, str, i9, function1, function12, null));
        return Unit.INSTANCE;
    }

    /* renamed from: j0 */
    public static final C7702g m11699j0(SketchPlayFragment sketchPlayFragment) {
        return sketchPlayFragment.new C7702g();
    }

    /* renamed from: A0 */
    public final void m11716A0(String tips, boolean isCancelable) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = ProgressDialog.show(requireContext(), "", tips, false, isCancelable);
    }

    /* renamed from: C0 */
    public final void m11717C0() {
        if (this.mTotalTime > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f12671b.f12779a;
            Intrinsics.checkNotNullExpressionValue(groupSeekBar, "groupSeekBar");
            groupSeekBar.setVisibility(0);
            if (this.extraConfig.m12361g()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f12671b.f12780b;
                Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
                ivFullscreen.setVisibility(0);
            }
        }
    }

    /* renamed from: D0 */
    public final void m11718D0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchResumePlaying$1(this, null));
    }

    /* renamed from: E0 */
    public final void m11719E0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$sketchStartPlaying$1(this, null));
    }

    /* renamed from: F */
    public final void m11720F() {
        Job job = this.autoHideSeekBarJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: F0 */
    public final void m11721F0() {
        Job job = this.autoHideSeekBarJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.autoHideSeekBarJob = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$startControlBarJob$1(this, null));
    }

    /* renamed from: G */
    public final void m11722G(double newSpeed, boolean showToast) {
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (!viewFragmentSketchPlayBinding.f12677h.setRate(newSpeed)) {
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
            viewFragmentSketchPlayBinding2.f12671b.f12783e.setText(newSpeed + "X");
            if (showToast) {
                ToastUtils.showShort(getString(R$string.speed_rate_change, String.valueOf(newSpeed)), new Object[0]);
            }
        } catch (Exception unused) {
            if (showToast) {
                ToastUtils.showShort(getString(R$string.device_not_support_speed), new Object[0]);
            }
        }
    }

    /* renamed from: G0 */
    public final void m11723G0() {
        if (this.isReady) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.f12677h.status();
            int i9 = playStatusStatus == null ? -1 : C7697b.f12408a[playStatusStatus.ordinal()];
            if (i9 == 3) {
                m11718D0();
            } else {
                if (i9 != 4) {
                    return;
                }
                m11719E0();
            }
        }
    }

    /* renamed from: H0 */
    public final void m11724H0() {
        if (this.isReady) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            if (viewFragmentSketchPlayBinding.f12677h.status() != PlayStatus.RECORD_START) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding3 = null;
                }
                if (viewFragmentSketchPlayBinding3.f12677h.status() != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
            if (viewFragmentSketchPlayBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f12677h.pause();
        }
    }

    /* renamed from: I */
    public final C7702g m11725I() {
        return (C7702g) this.playStatusListener.getValue();
    }

    /* renamed from: I0 */
    public final void m11726I0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$toggleControlBarVisible$1(this, null));
    }

    /* renamed from: J, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: K */
    public final Bitmap m11728K() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        return viewFragmentSketchPlayBinding.f12677h.getScreenBitmap();
    }

    /* renamed from: L */
    public final double m11729L() {
        C7862f c7862f = this.playSpeedRatePopup;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (c7862f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playSpeedRatePopup");
            c7862f = null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        return c7862f.m12349b(viewFragmentSketchPlayBinding.f12671b.f12783e.getText().toString());
    }

    /* renamed from: M */
    public final void m11730M(C7853a newPlayerConfig) {
        this.mNewPlayerConfigData.clear();
        if (newPlayerConfig.m12335f()) {
            ArrayList arrayList = this.mNewPlayerConfigData;
            int i9 = R$drawable.icon_play_setting_delete;
            String string = requireContext().getString(R$string.delete);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Function0 function0M12331b = newPlayerConfig.m12331b();
            if (function0M12331b == null) {
                function0M12331b = new Function0() { // from class: e7.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SketchPlayFragment.m11677N();
                    }
                };
            }
            arrayList.add(new C7863g(i9, string, function0M12331b));
        }
        if (newPlayerConfig.m12336g()) {
            ArrayList arrayList2 = this.mNewPlayerConfigData;
            int i10 = R$drawable.icon_play_setting_record;
            String string2 = requireContext().getString(R$string.record);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Function0 function0M12332c = newPlayerConfig.m12332c();
            if (function0M12332c == null) {
                function0M12332c = new Function0() { // from class: e7.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SketchPlayFragment.m11678O();
                    }
                };
            }
            arrayList2.add(new C7863g(i10, string2, function0M12332c));
        }
        this.mNewPlayerConfigData.addAll(newPlayerConfig.m12333d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12674e.setVisibility(!this.mNewPlayerConfigData.isEmpty() ? 0 : 8);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
        }
        viewFragmentSketchPlayBinding2.f12672c.setVisibility(newPlayerConfig.m12334e() ? 0 : 8);
    }

    /* renamed from: P */
    public final void m11731P() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    /* renamed from: Q */
    public final void m11732Q() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        Group groupSeekBar = viewFragmentSketchPlayBinding.f12671b.f12779a;
        Intrinsics.checkNotNullExpressionValue(groupSeekBar, "groupSeekBar");
        groupSeekBar.setVisibility(8);
        if (this.extraConfig.m12361g()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding2.f12671b.f12780b;
            Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
            ivFullscreen.setVisibility(8);
        }
    }

    /* renamed from: R */
    public final void m11733R(int progress) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12671b.f12782d.setMax(this.mTotalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        viewFragmentSketchPlayBinding3.f12671b.f12782d.setProgress(progress);
        this.totalTime = INSTANCE.m11755a(this.mTotalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        viewFragmentSketchPlayBinding4.f12671b.f12784f.setText(this.progressTime + "/" + this.totalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
        if (viewFragmentSketchPlayBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding5 = null;
        }
        viewFragmentSketchPlayBinding5.f12677h.removePlayActionListener(m11725I());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
        if (viewFragmentSketchPlayBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding6 = null;
        }
        viewFragmentSketchPlayBinding6.f12677h.addPlayActionListener(m11725I());
        this.isReady = true;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
        if (viewFragmentSketchPlayBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
        }
        viewFragmentSketchPlayBinding2.f12671b.f12781c.setImageResource(R$drawable.selector_btn_music_play);
        m11717C0();
    }

    /* renamed from: S */
    public final void m11734S() {
        Float fValueOf = Float.valueOf(0.0f);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12677h.setAreaMoveListener(new C7698c());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding3 = null;
        }
        int moveMaxWidthTimes = viewFragmentSketchPlayBinding3.f12677h.getMoveMaxWidthTimes();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding4 = null;
        }
        int moveMaxHeightTimes = viewFragmentSketchPlayBinding4.f12677h.getMoveMaxHeightTimes();
        if (moveMaxWidthTimes > 1) {
            C7853a c7853a = this.mNewPlayerConfig;
            if (c7853a != null && c7853a.m12338i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
                if (viewFragmentSketchPlayBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding5 = null;
                }
                viewFragmentSketchPlayBinding5.f12677h.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
                if (viewFragmentSketchPlayBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding6 = null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding6.f12677h, fValueOf, null, 2, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
            if (viewFragmentSketchPlayBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding7 = null;
            }
            viewFragmentSketchPlayBinding7.f12675f.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
            if (viewFragmentSketchPlayBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding8 = null;
            }
            viewFragmentSketchPlayBinding8.f12675f.setThumbTime(1.0f / moveMaxWidthTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.mBinding;
            if (viewFragmentSketchPlayBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding9 = null;
            }
            SketchProgressView sketchProgressView = viewFragmentSketchPlayBinding9.f12675f;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding10 = this.mBinding;
            if (viewFragmentSketchPlayBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding10 = null;
            }
            sketchProgressView.setProgress(viewFragmentSketchPlayBinding10.f12677h.getMoveHorizontalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding11 = this.mBinding;
            if (viewFragmentSketchPlayBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding11 = null;
            }
            viewFragmentSketchPlayBinding11.f12675f.setVisibility(8);
        }
        if (moveMaxHeightTimes > 1) {
            C7853a c7853a2 = this.mNewPlayerConfig;
            if (c7853a2 != null && c7853a2.m12338i()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding12 = this.mBinding;
                if (viewFragmentSketchPlayBinding12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding12 = null;
                }
                viewFragmentSketchPlayBinding12.f12677h.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding13 = this.mBinding;
                if (viewFragmentSketchPlayBinding13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentSketchPlayBinding13 = null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding13.f12677h, null, fValueOf, 1, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding14 = this.mBinding;
            if (viewFragmentSketchPlayBinding14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding14 = null;
            }
            viewFragmentSketchPlayBinding14.f12676g.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding15 = this.mBinding;
            if (viewFragmentSketchPlayBinding15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding15 = null;
            }
            viewFragmentSketchPlayBinding15.f12676g.setThumbTime(1.0f / moveMaxHeightTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding16 = this.mBinding;
            if (viewFragmentSketchPlayBinding16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding16 = null;
            }
            SketchProgressView sketchProgressView2 = viewFragmentSketchPlayBinding16.f12676g;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = this.mBinding;
            if (viewFragmentSketchPlayBinding17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding17 = null;
            }
            sketchProgressView2.setProgress(viewFragmentSketchPlayBinding17.f12677h.getMoveVerticalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = this.mBinding;
            if (viewFragmentSketchPlayBinding18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding18 = null;
            }
            viewFragmentSketchPlayBinding18.f12676g.setVisibility(8);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding19 = this.mBinding;
        if (viewFragmentSketchPlayBinding19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding19 = null;
        }
        viewFragmentSketchPlayBinding19.f12675f.setProgressListener(new C7699d());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding20 = this.mBinding;
        if (viewFragmentSketchPlayBinding20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding20;
        }
        viewFragmentSketchPlayBinding2.f12676g.setProgressListener(new C7700e());
    }

    /* renamed from: c0 */
    public final boolean m11735c0() {
        return this.mTotalTime > 0;
    }

    /* renamed from: d0 */
    public final boolean m11736d0() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        if (viewFragmentSketchPlayBinding.f12677h.status() == PlayStatus.RECORD_START) {
            return true;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
        }
        return viewFragmentSketchPlayBinding2.f12677h.status() == PlayStatus.RECORD_RESUME;
    }

    /* renamed from: e0 */
    public final void m11737e0() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.f12677h.status();
        int i9 = playStatusStatus == null ? -1 : C7697b.f12408a[playStatusStatus.ordinal()];
        if (i9 == 1) {
            this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            viewFragmentSketchPlayBinding3.f12677h.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
            if (viewFragmentSketchPlayBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding4;
            }
            viewFragmentSketchPlayBinding2.f12671b.f12781c.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i9 == 2) {
            this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
            if (viewFragmentSketchPlayBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding5 = null;
            }
            viewFragmentSketchPlayBinding5.f12677h.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
            if (viewFragmentSketchPlayBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding6;
            }
            viewFragmentSketchPlayBinding2.f12671b.f12781c.setImageResource(R$drawable.icon_record_start);
            return;
        }
        if (i9 == 3) {
            this.continueWhenResume = true;
            m11718D0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
            if (viewFragmentSketchPlayBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding7;
            }
            viewFragmentSketchPlayBinding2.f12671b.f12781c.setImageResource(R$drawable.view_icon_record_stop);
            return;
        }
        if (i9 != 4) {
            return;
        }
        this.continueWhenResume = true;
        m11719E0();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
        if (viewFragmentSketchPlayBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding8;
        }
        viewFragmentSketchPlayBinding2.f12671b.f12781c.setImageResource(R$drawable.icon_record_start);
    }

    /* renamed from: g0 */
    public final void m11738g0(final String path, final int progress, final boolean showLoading, final Function1 onFailure, final Function1 onSuccess) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.writeFileCallback = new Function0() { // from class: e7.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchPlayFragment.m11697i0(this.f13236a, showLoading, path, progress, onSuccess, onFailure);
            }
        };
        this.permissionRequest.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: k0 */
    public final void m11739k0(int progress, boolean resumePlaying, Function0 onSuccess, Function0 onFailure) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$seekTo$1(this, progress, resumePlaying, onSuccess, onFailure, null));
    }

    /* renamed from: l0 */
    public final void m11740l0(boolean state) {
        this.extraConfig = C7864h.m12355b(this.extraConfig, false, state, false, false, null, null, null, 125, null);
    }

    /* renamed from: m0 */
    public final void m11741m0(Function1 fullscreenClickListener) {
        Intrinsics.checkNotNullParameter(fullscreenClickListener, "fullscreenClickListener");
        this.extraConfig = C7864h.m12355b(this.extraConfig, false, false, false, false, null, null, fullscreenClickListener, 63, null);
    }

    /* renamed from: n0 */
    public final void m11742n0(int resId) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12671b.f12780b.setImageResource(resId);
    }

    /* renamed from: o0 */
    public final void m11743o0(boolean selected) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new SketchPlayFragment$setFullscreenSelected$1(this, selected, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBindingM11905a = ViewFragmentSketchPlayBinding.m11905a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewFragmentSketchPlayBindingM11905a, "inflate(...)");
        this.mBinding = viewFragmentSketchPlayBindingM11905a;
        if (viewFragmentSketchPlayBindingM11905a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBindingM11905a = null;
        }
        View root = viewFragmentSketchPlayBindingM11905a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m11731P();
        if (this.isReady) {
            m11724H0();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = null;
            if (viewFragmentSketchPlayBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding = null;
            }
            viewFragmentSketchPlayBinding.f12677h.release();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding2 = viewFragmentSketchPlayBinding3;
            }
            viewFragmentSketchPlayBinding2.f12677h.destroy();
        }
        this.isReady = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isAdded() && hidden) {
            m11724H0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m11724H0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.continueWhenResume) {
            m11723G0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11679T();
        C7853a c7853a = this.mNewPlayerConfig;
        if (c7853a != null) {
            m11730M(c7853a);
        }
    }

    /* renamed from: p0 */
    public final void m11744p0(boolean isVisible) {
        this.extraConfig = C7864h.m12355b(this.extraConfig, isVisible, false, false, false, null, null, null, 126, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        ImageView ivFullscreen = viewFragmentSketchPlayBinding.f12671b.f12780b;
        Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
        ivFullscreen.setVisibility(isVisible ? 0 : 8);
    }

    /* renamed from: q0 */
    public final void m11745q0(boolean interceptWhenVideo) {
        this.extraConfig = C7864h.m12355b(this.extraConfig, false, false, false, interceptWhenVideo, null, null, null, 119, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12678i.setCanTouch(!interceptWhenVideo);
    }

    /* renamed from: r0 */
    public final void m11746r0(C7853a newPlayerConfig) {
        Intrinsics.checkNotNullParameter(newPlayerConfig, "newPlayerConfig");
        this.mNewPlayerConfig = newPlayerConfig;
        if (getView() != null) {
            m11730M(newPlayerConfig);
        }
    }

    /* renamed from: s0 */
    public final void m11747s0(Function0 onAutoHideAction) {
        Intrinsics.checkNotNullParameter(onAutoHideAction, "onAutoHideAction");
        this.extraConfig = C7864h.m12355b(this.extraConfig, false, false, false, false, onAutoHideAction, null, null, 111, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isAdded() || isVisibleToUser) {
            return;
        }
        m11724H0();
    }

    /* renamed from: t0 */
    public final void m11748t0(boolean isEnable) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12677h.setScaleEnable(isEnable);
    }

    /* renamed from: u0 */
    public final void m11749u0(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12671b.f12782d.setProgressDrawable(drawable);
    }

    /* renamed from: v0 */
    public final void m11750v0(int color) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12671b.f12782d.getThumb().setColorFilter(ContextCompat.getColor(requireContext(), color), PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: w0 */
    public final void m11751w0(boolean seekBarVisibleManually) {
        this.extraConfig = C7864h.m12355b(this.extraConfig, false, false, seekBarVisibleManually, false, null, null, null, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, null);
    }

    /* renamed from: x0 */
    public final void m11752x0(Function1 sketchTapAction) {
        Intrinsics.checkNotNullParameter(sketchTapAction, "sketchTapAction");
        this.extraConfig = C7864h.m12355b(this.extraConfig, false, false, false, false, null, sketchTapAction, null, 95, null);
    }

    /* renamed from: y0 */
    public final void m11753y0(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12671b.f12783e.setBackground(drawable);
    }

    /* renamed from: z0 */
    public final void m11754z0(int colorRes) {
        C7862f c7862f = this.playSpeedRatePopup;
        if (c7862f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playSpeedRatePopup");
            c7862f = null;
        }
        c7862f.m12350c(colorRes);
    }
}
