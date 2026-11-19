package com.zykj.view.board.play;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.C2766k;
import android.view.CoroutineLiveDataKt;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleOwnerKt;
import android.view.View;
import android.view.ViewGroup;
import android.view.result.ActivityResultCallback;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.C2856d;
import com.blankj.utilcode.util.C3404x;
import com.google.android.material.timepicker.TimeModel;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.widget.SketchProgressView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.AbstractC5773a;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u009d\u0001\b\u0007\u0018\u0000 ©\u00012\u00020\u0001:\u0002©\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0011J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\r¢\u0006\u0004\b#\u0010$Jh\u00101\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010*2%\b\u0002\u00100\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000f\u0018\u00010*¢\u0006\u0004\b1\u00102JC\u00105\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u00103\u001a\u00020\r2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001042\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u000104¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u0010\u0003J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\r¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000f¢\u0006\u0004\b>\u0010\u0003J\r\u0010?\u001a\u00020\u000f¢\u0006\u0004\b?\u0010\u0003J\u001b\u0010A\u001a\u00020\u000f2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f04¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\r¢\u0006\u0004\bD\u0010\u0011J!\u0010F\u001a\u00020\u000f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0*¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\r¢\u0006\u0004\bI\u0010\u0011J\u0015\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000f2\b\b\u0001\u0010N\u001a\u00020'¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u000f2\b\b\u0001\u0010Q\u001a\u00020'¢\u0006\u0004\bR\u0010PJ\u0015\u0010S\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bS\u0010MJ\u0015\u0010U\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\r¢\u0006\u0004\bU\u0010\u0011J\u0015\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\r¢\u0006\u0004\bW\u0010\u0011J0\u0010Z\u001a\u00020\u000f2!\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020\u000f0*¢\u0006\u0004\bZ\u0010GJ\u0015\u0010\\\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\r¢\u0006\u0004\b\\\u0010\u0011J\u0017\u0010^\u001a\u00020\u000f2\b\b\u0001\u0010]\u001a\u00020'¢\u0006\u0004\b^\u0010PJ\r\u0010_\u001a\u00020 ¢\u0006\u0004\b_\u0010`J3\u0010c\u001a\u00020\u000f2$\u0010b\u001a \u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0*\u0012\u0004\u0012\u00020\u000f0a¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\r¢\u0006\u0004\be\u0010=J\r\u0010f\u001a\u00020'¢\u0006\u0004\bf\u0010gJ\r\u0010i\u001a\u00020h¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u000f¢\u0006\u0004\bk\u0010\u0003J!\u0010n\u001a\u00020\u000f2\b\b\u0002\u0010l\u001a\u00020%2\b\b\u0002\u0010m\u001a\u00020\r¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0003J\u000f\u0010q\u001a\u00020\u000fH\u0002¢\u0006\u0004\bq\u0010\u0003J\u000f\u0010r\u001a\u00020\u000fH\u0002¢\u0006\u0004\br\u0010\u0003J\u000f\u0010s\u001a\u00020\u000fH\u0002¢\u0006\u0004\bs\u0010\u0003J\u000f\u0010t\u001a\u00020\u000fH\u0002¢\u0006\u0004\bt\u0010\u0003J\u000f\u0010u\u001a\u00020\u000fH\u0002¢\u0006\u0004\bu\u0010\u0003J\u0019\u0010v\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bv\u0010PJ\u000f\u0010w\u001a\u00020\u000fH\u0002¢\u0006\u0004\bw\u0010\u0003J\u0017\u0010x\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bx\u0010;J\u000f\u0010y\u001a\u00020\u000fH\u0002¢\u0006\u0004\by\u0010\u0003R\u0018\u0010z\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R'\u0010\u007f\u001a\u0012\u0012\u0004\u0012\u00020}0|j\b\u0012\u0004\u0012\u00020}`~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0085\u0001R\u0017\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u008a\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R9\u0010\u0095\u0001\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0*\u0012\u0004\u0012\u00020\u000f\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R!\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009b\u0001\u001a\u0012\u0012\r\u0012\u000b \u009a\u0001*\u0004\u0018\u00010%0%0\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010¢\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001¨\u0006ª\u0001"}, m5110d2 = {"Lcom/zykj/view/board/play/SketchPlayFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isVisibleToUser", "Ld6/s;", "setUserVisibleHint", "(Z)V", MessageClient.INTENT_KEY, "onHiddenChanged", "onResume", "onPause", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "performClickStartPlay", "Landroid/graphics/Bitmap;", "getScreenBitmap", "()Landroid/graphics/Bitmap;", "isEnable", "setScaleEnable", "", "newSpeed", "showToast", "changeSpeed", "(DZ)V", "", "path", "", "progress", "showLoading", "Lkotlin/Function1;", "", "onFailure", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "isVideo", "onSuccess", "play", "(Ljava/lang/String;IZLr6/c;Lr6/c;)V", "resumePlaying", "Lkotlin/Function0;", "seekTo", "(IZLr6/a;Lr6/a;)V", "sketchStartPlaying", "Lcom/zykj/view/board/play/NewPlayerConfig;", "newPlayerConfig", "setNewPlayerConfig", "(Lcom/zykj/view/board/play/NewPlayerConfig;)V", "isCanPlay", "()Z", "stopPlay", "startPlay", "onAutoHideAction", "setOnAutoHideAction", "(Lr6/a;)V", "seekBarVisibleManually", "setSeekBarVisibleManually", "sketchTapAction", "setSketchTapAction", "(Lr6/c;)V", "interceptWhenVideo", "setInterceptWhenVideo", "Landroid/graphics/drawable/Drawable;", "drawable", "setSeekBarProgressColor", "(Landroid/graphics/drawable/Drawable;)V", TypedValues.Custom.S_COLOR, "setSeekBarThumbColor", "(I)V", "colorRes", "setSpeedRateItemColor", "setSpeedRateBackgroundDrawable", "isVisible", "setFullscreenVisible", "state", "setAutoHideSeekBarState", "itself", "fullscreenClickListener", "setFullscreenClickListener", "selected", "setFullscreenSelected", "resId", "setFullscreenRes", "getSpeedRate", "()D", "Lkotlin/Function2;", "showCallback", "setCustomSpeedWindow", "(Lr6/e;)V", "isPlaying", "getProgress", "()I", "", "getFloatProgress", "()F", "cancelAutoHideJob", "tips", "isCancelable", "showProgress", "(Ljava/lang/String;Z)V", "hideProgress", "initView", "hideSeekBar", "showSeekBar", "toggleControlBarVisible", "sketchResumePlaying", "initPlaySketch", "initStaticSketch", "handleConfig", "startControlBarJob", "mNewPlayerConfig", "Lcom/zykj/view/board/play/NewPlayerConfig;", "Ljava/util/ArrayList;", "Lcom/zykj/view/board/play/PlayerConfigSetting;", "Lkotlin/collections/ArrayList;", "mNewPlayerConfigData", "Ljava/util/ArrayList;", "Lcom/zykj/view/board/play/SketchPlayExtraConfig;", "extraConfig", "Lcom/zykj/view/board/play/SketchPlayExtraConfig;", "isReady", "Z", "progressTime", "Ljava/lang/String;", "totalTime", "mTotalTime", "I", "continueWhenResume", "Lcom/zykj/view/board/play/PlaySpeedRatePopup;", "playSpeedRatePopup", "Lcom/zykj/view/board/play/PlaySpeedRatePopup;", "Lcom/zykj/view/board/play/PlaySettingPopup;", "playSettingPopup", "Lcom/zykj/view/board/play/PlaySettingPopup;", "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;", "playSpeedRateShowCall", "Lr6/e;", "writeFileCallback", "Lr6/a;", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "permissionRequest", "Landroidx/activity/result/ActivityResultLauncher;", "com/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1", "playStatusListener$delegate", "Ld6/e;", "getPlayStatusListener", "()Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;", "playStatusListener", "Lkotlinx/coroutines/w0;", "autoHideSeekBarJob", "Lkotlinx/coroutines/w0;", "Landroid/app/ProgressDialog;", "mProgressDialog", "Landroid/app/ProgressDialog;", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"SetTextI18n"})
@SourceDebugExtension({"SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n257#2,2:840\n257#2,2:842\n257#2,2:844\n257#2,2:846\n257#2,2:848\n255#2:850\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment\n*L\n279#1:840,2\n281#1:842,2\n290#1:844,2\n292#1:846,2\n741#1:848,2\n221#1:850\n*E\n"})
/* loaded from: classes3.dex */
public final class SketchPlayFragment extends Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private InterfaceC6013w0 autoHideSeekBarJob;
    private boolean continueWhenResume;
    private boolean isReady;
    private ViewFragmentSketchPlayBinding mBinding;

    @Nullable
    private NewPlayerConfig mNewPlayerConfig;

    @Nullable
    private ProgressDialog mProgressDialog;

    @NotNull
    private final ActivityResultLauncher<String> permissionRequest;
    private PlaySettingPopup playSettingPopup;
    private PlaySpeedRatePopup playSpeedRatePopup;

    @Nullable
    private InterfaceC6473e playSpeedRateShowCall;

    /* renamed from: playStatusListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e playStatusListener;
    private int progress;

    @Nullable
    private InterfaceC6469a writeFileCallback;

    @NotNull
    private ArrayList<PlayerConfigSetting> mNewPlayerConfigData = new ArrayList<>();

    @NotNull
    private SketchPlayExtraConfig extraConfig = new SketchPlayExtraConfig(false, false, false, false, null, null, null, 127, null);

    @NotNull
    private String progressTime = "00:00";

    @NotNull
    private String totalTime = "00:00";
    private int mTotalTime = -1;

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/view/board/play/SketchPlayFragment$Companion;", "", "<init>", "()V", "formatTime", "", "ms", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final String formatTime(long ms) {
            long j7 = 60000;
            long j8 = ms / j7;
            long j9 = (ms - (j7 * j8)) / 1000;
            StringBuffer stringBuffer = new StringBuffer();
            if (j8 >= 0) {
                stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1)).concat(":"));
            }
            if (j9 >= 0) {
                stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j9)}, 1)));
            }
            String string = stringBuffer.toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

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
            try {
                iArr[PlayStatus.RECORD_WAIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m5109d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"com/zykj/view/board/play/SketchPlayFragment$initView$4", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "seekBar", "", "progress", "", "fromUser", "Ld6/s;", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "Lcom/zykj/merge/sketch/constant/PlayStatus;", "lastPlayStatus", "Lcom/zykj/merge/sketch/constant/PlayStatus;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$initView$4 */
    public static final class C53444 implements SeekBar.OnSeekBarChangeListener {
        private PlayStatus lastPlayStatus;

        public C53444() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s onStopTrackingTouch$lambda$0(C53444 c53444, SketchPlayFragment sketchPlayFragment, int i) {
            PlayStatus playStatus = c53444.lastPlayStatus;
            if (playStatus != null && ((playStatus == PlayStatus.RECORD_START || playStatus == PlayStatus.RECORD_RESUME) && sketchPlayFragment.getViewLifecycleOwner().getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED))) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                if (viewFragmentSketchPlayBinding.sketchView.status() == PlayStatus.RECORD_PAUSE) {
                    sketchPlayFragment.sketchResumePlaying();
                } else if (i == 0) {
                    sketchPlayFragment.sketchStartPlaying();
                }
            }
            sketchPlayFragment.hideProgress();
            return C5443s.f8405a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s onStopTrackingTouch$lambda$1(Throwable it) {
            AbstractC5830k.m5330g(it, "it");
            C3404x.m2356a("操作失败", new Object[0]);
            return C5443s.f8405a;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @SuppressLint({"SetTextI18n"})
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            SketchPlayFragment.this.progressTime = SketchPlayFragment.INSTANCE.formatTime(progress);
            SketchPlayFragment.this.progress = progress;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.controlBar.tvTime.setText(SketchPlayFragment.this.progressTime + "/" + SketchPlayFragment.this.totalTime);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            this.lastPlayStatus = viewFragmentSketchPlayBinding.sketchView.status();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding2 != null) {
                viewFragmentSketchPlayBinding2.sketchView.waiting();
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            AbstractC5830k.m5330g(seekBar, "seekBar");
            SketchPlayFragment.showProgress$default(SketchPlayFragment.this, null, false, 3, null);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.sketchView.seekTo(seekBar.getProgress(), new C2856d(16, this, SketchPlayFragment.this), new C4959k1(21));
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$seekTo$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$seekTo$1 */
    public static final class C53451 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6469a $onFailure;
        final /* synthetic */ InterfaceC6469a $onSuccess;
        final /* synthetic */ int $progress;
        final /* synthetic */ boolean $resumePlaying;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53451(int i, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC5631c<? super C53451> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$progress = i;
            this.$resumePlaying = z8;
            this.$onSuccess = interfaceC6469a;
            this.$onFailure = interfaceC6469a2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s invokeSuspend$lambda$0(boolean z8, SketchPlayFragment sketchPlayFragment, InterfaceC6469a interfaceC6469a, int i) {
            if (z8) {
                sketchPlayFragment.sketchResumePlaying();
            }
            if (interfaceC6469a != null) {
                interfaceC6469a.invoke();
            }
            return C5443s.f8405a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s invokeSuspend$lambda$1(InterfaceC6469a interfaceC6469a, Throwable th) {
            if (interfaceC6469a != null) {
                interfaceC6469a.invoke();
            }
            return C5443s.f8405a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchPlayFragment.this.new C53451(this.$progress, this.$resumePlaying, this.$onSuccess, this.$onFailure, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding != null) {
                viewFragmentSketchPlayBinding.sketchView.seekTo(this.$progress, new C5359h(this.$resumePlaying, SketchPlayFragment.this, this.$onSuccess, 1), new C5362k(this.$onFailure, 0));
                return C5443s.f8405a;
            }
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53451) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$setFullscreenSelected$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$setFullscreenSelected$1 */
    public static final class C53461 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $selected;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53461(boolean z8, InterfaceC5631c<? super C53461> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$selected = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchPlayFragment.this.new C53461(this.$selected, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding != null) {
                viewFragmentSketchPlayBinding.controlBar.ivFullscreen.setSelected(this.$selected);
                return C5443s.f8405a;
            }
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53461) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$sketchResumePlaying$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$sketchResumePlaying$1 */
    public static final class C53471 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C53471(InterfaceC5631c<? super C53471> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchPlayFragment.this.new C53471(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.sketchView.resume();
            if (SketchPlayFragment.this.extraConfig.getAutoHideSeekBar()) {
                SketchPlayFragment.this.startControlBarJob();
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53471) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$sketchStartPlaying$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$sketchStartPlaying$1 */
    public static final class C53481 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C53481(InterfaceC5631c<? super C53481> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchPlayFragment.this.new C53481(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.sketchView.start();
            if (SketchPlayFragment.this.extraConfig.getAutoHideSeekBar()) {
                SketchPlayFragment.this.startControlBarJob();
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53481) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$startControlBarJob$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {801}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$startControlBarJob$1 */
    public static final class C53491 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C53491(InterfaceC5631c<? super C53491> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchPlayFragment.this.new C53491(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.label = 1;
                if (AbstractC6014x.m5638i(CoroutineLiveDataKt.DEFAULT_TIMEOUT, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            SketchPlayFragment.this.hideSeekBar();
            InterfaceC6469a onAutoHideAction = SketchPlayFragment.this.extraConfig.getOnAutoHideAction();
            if (onAutoHideAction != null) {
                onAutoHideAction.invoke();
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53491) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n255#2:840\n255#2:841\n257#2,2:842\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1\n*L\n324#1:840\n332#1:841\n331#1:842,2\n*E\n"})
    /* renamed from: com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1 */
    public static final class C53501 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C53501(InterfaceC5631c<? super C53501> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchPlayFragment.this.new C53501(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (SketchPlayFragment.this.mTotalTime > 0) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                Group groupSeekBar = viewFragmentSketchPlayBinding.controlBar.groupSeekBar;
                AbstractC5830k.m5329f(groupSeekBar, "groupSeekBar");
                if (groupSeekBar.getVisibility() == 0) {
                    SketchPlayFragment.this.hideSeekBar();
                } else {
                    SketchPlayFragment.this.showSeekBar();
                }
            } else if (SketchPlayFragment.this.extraConfig.getShowFullscreenButton()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding2.controlBar.ivFullscreen;
                AbstractC5830k.m5329f(ivFullscreen, "ivFullscreen");
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding3 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                ImageView ivFullscreen2 = viewFragmentSketchPlayBinding3.controlBar.ivFullscreen;
                AbstractC5830k.m5329f(ivFullscreen2, "ivFullscreen");
                ivFullscreen.setVisibility(ivFullscreen2.getVisibility() == 0 ? 8 : 0);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53501) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public SketchPlayFragment() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.zykj.view.board.play.a
            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SketchPlayFragment.permissionRequest$lambda$11(this.f8282a, (Boolean) obj);
            }
        });
        AbstractC5830k.m5329f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.permissionRequest = activityResultLauncherRegisterForActivityResult;
        this.playStatusListener = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.view.board.play.d
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                return SketchPlayFragment.playStatusListener_delegate$lambda$12(this.f8290a);
            }
        });
    }

    public static /* synthetic */ void changeSpeed$default(SketchPlayFragment sketchPlayFragment, double d9, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = true;
        }
        sketchPlayFragment.changeSpeed(d9, z8);
    }

    private final SketchPlayFragment$playStatusListener$2$1 getPlayStatusListener() {
        return (SketchPlayFragment$playStatusListener$2$1) this.playStatusListener.getValue();
    }

    private final void handleConfig(NewPlayerConfig newPlayerConfig) {
        this.mNewPlayerConfigData.clear();
        if (newPlayerConfig.getNeedDelete()) {
            ArrayList<PlayerConfigSetting> arrayList = this.mNewPlayerConfigData;
            int i = C5280R.drawable.icon_play_setting_delete;
            String string = requireContext().getString(C5280R.string.delete);
            AbstractC5830k.m5329f(string, "getString(...)");
            InterfaceC6469a callbackForDelete = newPlayerConfig.getCallbackForDelete();
            if (callbackForDelete == null) {
                callbackForDelete = new C2766k(29);
            }
            arrayList.add(new PlayerConfigSetting(i, string, callbackForDelete));
        }
        if (newPlayerConfig.getNeedRecord()) {
            ArrayList<PlayerConfigSetting> arrayList2 = this.mNewPlayerConfigData;
            int i8 = C5280R.drawable.icon_play_setting_record;
            String string2 = requireContext().getString(C5280R.string.record);
            AbstractC5830k.m5329f(string2, "getString(...)");
            InterfaceC6469a callbackForRecord = newPlayerConfig.getCallbackForRecord();
            if (callbackForRecord == null) {
                callbackForRecord = new C5353b(0);
            }
            arrayList2.add(new PlayerConfigSetting(i8, string2, callbackForRecord));
        }
        this.mNewPlayerConfigData.addAll(newPlayerConfig.getExtrasForSetting());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding.ivSetting.setVisibility(!this.mNewPlayerConfigData.isEmpty() ? 0 : 8);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
        if (viewFragmentSketchPlayBinding2 != null) {
            viewFragmentSketchPlayBinding2.ivBack.setVisibility(newPlayerConfig.getNeedBack() ? 0 : 8);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSeekBar() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        Group groupSeekBar = viewFragmentSketchPlayBinding.controlBar.groupSeekBar;
        AbstractC5830k.m5329f(groupSeekBar, "groupSeekBar");
        groupSeekBar.setVisibility(8);
        if (this.extraConfig.getShowFullscreenButton()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding2.controlBar.ivFullscreen;
            AbstractC5830k.m5329f(ivFullscreen, "ivFullscreen");
            ivFullscreen.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initPlaySketch(int progress) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding.controlBar.seekBar.setMax(this.mTotalTime);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding2.controlBar.seekBar.setProgress(progress);
        String time = INSTANCE.formatTime(this.mTotalTime);
        this.totalTime = time;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding3.controlBar.tvTime.setText(this.progressTime + "/" + time);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding4.sketchView.removePlayActionListener(getPlayStatusListener());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
        if (viewFragmentSketchPlayBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding5.sketchView.addPlayActionListener(getPlayStatusListener());
        this.isReady = true;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
        if (viewFragmentSketchPlayBinding6 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding6.controlBar.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_play);
        showSeekBar();
    }

    public static /* synthetic */ void initPlaySketch$default(SketchPlayFragment sketchPlayFragment, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        sketchPlayFragment.initPlaySketch(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initStaticSketch() {
        Float fValueOf = Float.valueOf(0.0f);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding.sketchView.setAreaMoveListener(new IAreaMoveListener() { // from class: com.zykj.view.board.play.SketchPlayFragment.initStaticSketch.1
            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onHorizontalMove(float progress) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding2 != null) {
                    viewFragmentSketchPlayBinding2.sketchProgressHorizontal.setProgress(progress);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onMoveEnd() {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentSketchPlayBinding2.sketchProgressVertical.setTouchable(true);
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding3 != null) {
                    viewFragmentSketchPlayBinding3.sketchProgressHorizontal.setTouchable(true);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onMoveStart() {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentSketchPlayBinding2.sketchProgressVertical.setTouchable(false);
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding3 != null) {
                    viewFragmentSketchPlayBinding3.sketchProgressHorizontal.setTouchable(false);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onVerticalMove(float progress) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding2 != null) {
                    viewFragmentSketchPlayBinding2.sketchProgressVertical.setProgress(progress);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        int moveMaxWidthTimes = viewFragmentSketchPlayBinding2.sketchView.getMoveMaxWidthTimes();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        int moveMaxHeightTimes = viewFragmentSketchPlayBinding3.sketchView.getMoveMaxHeightTimes();
        if (moveMaxWidthTimes > 1) {
            NewPlayerConfig newPlayerConfig = this.mNewPlayerConfig;
            if (newPlayerConfig != null && newPlayerConfig.getIsMoveReset()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
                if (viewFragmentSketchPlayBinding4 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentSketchPlayBinding4.sketchView.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
                if (viewFragmentSketchPlayBinding5 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding5.sketchView, fValueOf, null, 2, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
            if (viewFragmentSketchPlayBinding6 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding6.sketchProgressHorizontal.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
            if (viewFragmentSketchPlayBinding7 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding7.sketchProgressHorizontal.setThumbTime(1.0f / moveMaxWidthTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
            if (viewFragmentSketchPlayBinding8 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            SketchProgressView sketchProgressView = viewFragmentSketchPlayBinding8.sketchProgressHorizontal;
            if (viewFragmentSketchPlayBinding8 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            sketchProgressView.setProgress(viewFragmentSketchPlayBinding8.sketchView.getMoveHorizontalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding9 = this.mBinding;
            if (viewFragmentSketchPlayBinding9 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding9.sketchProgressHorizontal.setVisibility(8);
        }
        if (moveMaxHeightTimes > 1) {
            NewPlayerConfig newPlayerConfig2 = this.mNewPlayerConfig;
            if (newPlayerConfig2 != null && newPlayerConfig2.getIsMoveReset()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding10 = this.mBinding;
                if (viewFragmentSketchPlayBinding10 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentSketchPlayBinding10.sketchView.areaMoveStart();
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding11 = this.mBinding;
                if (viewFragmentSketchPlayBinding11 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding11.sketchView, null, fValueOf, 1, null);
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding12 = this.mBinding;
            if (viewFragmentSketchPlayBinding12 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding12.sketchProgressVertical.setVisibility(0);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding13 = this.mBinding;
            if (viewFragmentSketchPlayBinding13 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding13.sketchProgressVertical.setThumbTime(1.0f / moveMaxHeightTimes);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding14 = this.mBinding;
            if (viewFragmentSketchPlayBinding14 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            SketchProgressView sketchProgressView2 = viewFragmentSketchPlayBinding14.sketchProgressVertical;
            if (viewFragmentSketchPlayBinding14 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            sketchProgressView2.setProgress(viewFragmentSketchPlayBinding14.sketchView.getMoveVerticalProgress());
        } else {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding15 = this.mBinding;
            if (viewFragmentSketchPlayBinding15 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding15.sketchProgressVertical.setVisibility(8);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding16 = this.mBinding;
        if (viewFragmentSketchPlayBinding16 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding16.sketchProgressHorizontal.setProgressListener(new SketchProgressView.ProgressListener() { // from class: com.zykj.view.board.play.SketchPlayFragment.initStaticSketch.2
            @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
            public void onProgress(float progress) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding17 != null) {
                    MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding17.sketchView, Float.valueOf(progress), null, 2, null);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
            public void onTouchEnd(float progress) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding17 != null) {
                    MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding17.sketchView, Float.valueOf(progress), null, 2, null);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
            public void onTouchStart() {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = SketchPlayFragment.this.mBinding;
                if (viewFragmentSketchPlayBinding17 != null) {
                    viewFragmentSketchPlayBinding17.sketchView.areaMoveStart();
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding17 = this.mBinding;
        if (viewFragmentSketchPlayBinding17 != null) {
            viewFragmentSketchPlayBinding17.sketchProgressVertical.setProgressListener(new SketchProgressView.ProgressListener() { // from class: com.zykj.view.board.play.SketchPlayFragment.initStaticSketch.3
                @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
                public void onProgress(float progress) {
                    ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = SketchPlayFragment.this.mBinding;
                    if (viewFragmentSketchPlayBinding18 != null) {
                        MergeSketchPlayView.areaMoving$default(viewFragmentSketchPlayBinding18.sketchView, null, Float.valueOf(progress), 1, null);
                    } else {
                        AbstractC5830k.m5339p("mBinding");
                        throw null;
                    }
                }

                @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
                public void onTouchEnd(float progress) {
                    ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = SketchPlayFragment.this.mBinding;
                    if (viewFragmentSketchPlayBinding18 != null) {
                        MergeSketchPlayView.areaMoveEnd$default(viewFragmentSketchPlayBinding18.sketchView, null, Float.valueOf(progress), 1, null);
                    } else {
                        AbstractC5830k.m5339p("mBinding");
                        throw null;
                    }
                }

                @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
                public void onTouchStart() {
                    ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding18 = SketchPlayFragment.this.mBinding;
                    if (viewFragmentSketchPlayBinding18 != null) {
                        viewFragmentSketchPlayBinding18.sketchView.areaMoveStart();
                    } else {
                        AbstractC5830k.m5339p("mBinding");
                        throw null;
                    }
                }
            });
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    private final void initView() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.playSpeedRatePopup = new PlaySpeedRatePopup(fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        AbstractC5830k.m5329f(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.playSettingPopup = new PlaySettingPopup(fragmentActivityRequireActivity2);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding.controlBar.tvSpeedRate.setText(SpeedRate.DEFAULT_SPEED_LABEL);
        hideSeekBar();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivBack = viewFragmentSketchPlayBinding2.ivBack;
        AbstractC5830k.m5329f(ivBack, "ivBack");
        final int i = 0;
        ExtKt.singleClick$default(ivBack, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.play.f

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8294b;

            {
                this.f8294b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        SketchPlayFragment.initView$lambda$1(this.f8294b, view);
                        break;
                    case 1:
                        SketchPlayFragment.initView$lambda$2(this.f8294b, view);
                        break;
                    case 2:
                        this.f8294b.performClickStartPlay();
                        break;
                    case 3:
                        SketchPlayFragment.initView$lambda$7(this.f8294b, view);
                        break;
                    case 4:
                        SketchPlayFragment.initView$lambda$8(this.f8294b, view);
                        break;
                    default:
                        SketchPlayFragment.initView$lambda$9(this.f8294b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding3.ivSetting;
        AbstractC5830k.m5329f(ivSetting, "ivSetting");
        final int i8 = 1;
        ExtKt.singleClick$default(ivSetting, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.play.f

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8294b;

            {
                this.f8294b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        SketchPlayFragment.initView$lambda$1(this.f8294b, view);
                        break;
                    case 1:
                        SketchPlayFragment.initView$lambda$2(this.f8294b, view);
                        break;
                    case 2:
                        this.f8294b.performClickStartPlay();
                        break;
                    case 3:
                        SketchPlayFragment.initView$lambda$7(this.f8294b, view);
                        break;
                    case 4:
                        SketchPlayFragment.initView$lambda$8(this.f8294b, view);
                        break;
                    default:
                        SketchPlayFragment.initView$lambda$9(this.f8294b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
        if (viewFragmentSketchPlayBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivRecord = viewFragmentSketchPlayBinding4.controlBar.ivRecord;
        AbstractC5830k.m5329f(ivRecord, "ivRecord");
        final int i9 = 2;
        ExtKt.singleClick$default(ivRecord, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.play.f

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8294b;

            {
                this.f8294b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        SketchPlayFragment.initView$lambda$1(this.f8294b, view);
                        break;
                    case 1:
                        SketchPlayFragment.initView$lambda$2(this.f8294b, view);
                        break;
                    case 2:
                        this.f8294b.performClickStartPlay();
                        break;
                    case 3:
                        SketchPlayFragment.initView$lambda$7(this.f8294b, view);
                        break;
                    case 4:
                        SketchPlayFragment.initView$lambda$8(this.f8294b, view);
                        break;
                    default:
                        SketchPlayFragment.initView$lambda$9(this.f8294b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
        if (viewFragmentSketchPlayBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSketchPlayBinding5.controlBar.seekBar.setOnSeekBarChangeListener(new C53444());
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
        if (viewFragmentSketchPlayBinding6 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        TextView tvSpeedRate = viewFragmentSketchPlayBinding6.controlBar.tvSpeedRate;
        AbstractC5830k.m5329f(tvSpeedRate, "tvSpeedRate");
        final int i10 = 3;
        ExtKt.singleClick$default(tvSpeedRate, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.play.f

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8294b;

            {
                this.f8294b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        SketchPlayFragment.initView$lambda$1(this.f8294b, view);
                        break;
                    case 1:
                        SketchPlayFragment.initView$lambda$2(this.f8294b, view);
                        break;
                    case 2:
                        this.f8294b.performClickStartPlay();
                        break;
                    case 3:
                        SketchPlayFragment.initView$lambda$7(this.f8294b, view);
                        break;
                    case 4:
                        SketchPlayFragment.initView$lambda$8(this.f8294b, view);
                        break;
                    default:
                        SketchPlayFragment.initView$lambda$9(this.f8294b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
        if (viewFragmentSketchPlayBinding7 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i11 = 4;
        viewFragmentSketchPlayBinding7.controlBar.ivFullscreen.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.play.f

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8294b;

            {
                this.f8294b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        SketchPlayFragment.initView$lambda$1(this.f8294b, view);
                        break;
                    case 1:
                        SketchPlayFragment.initView$lambda$2(this.f8294b, view);
                        break;
                    case 2:
                        this.f8294b.performClickStartPlay();
                        break;
                    case 3:
                        SketchPlayFragment.initView$lambda$7(this.f8294b, view);
                        break;
                    case 4:
                        SketchPlayFragment.initView$lambda$8(this.f8294b, view);
                        break;
                    default:
                        SketchPlayFragment.initView$lambda$9(this.f8294b, view);
                        break;
                }
            }
        });
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding8 = this.mBinding;
        if (viewFragmentSketchPlayBinding8 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i12 = 5;
        viewFragmentSketchPlayBinding8.clRoot.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.play.f

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8294b;

            {
                this.f8294b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        SketchPlayFragment.initView$lambda$1(this.f8294b, view);
                        break;
                    case 1:
                        SketchPlayFragment.initView$lambda$2(this.f8294b, view);
                        break;
                    case 2:
                        this.f8294b.performClickStartPlay();
                        break;
                    case 3:
                        SketchPlayFragment.initView$lambda$7(this.f8294b, view);
                        break;
                    case 4:
                        SketchPlayFragment.initView$lambda$8(this.f8294b, view);
                        break;
                    default:
                        SketchPlayFragment.initView$lambda$9(this.f8294b, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC6469a callbackForBack;
        NewPlayerConfig newPlayerConfig = sketchPlayFragment.mNewPlayerConfig;
        if (newPlayerConfig != null) {
            if (newPlayerConfig == null || (callbackForBack = newPlayerConfig.getCallbackForBack()) == null) {
                return;
            }
            callbackForBack.invoke();
            return;
        }
        FragmentActivity activity = sketchPlayFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.mNewPlayerConfigData.isEmpty()) {
            C3404x.m2356a(sketchPlayFragment.getString(C5280R.string.no_content), new Object[0]);
            return;
        }
        PlaySettingPopup playSettingPopup = sketchPlayFragment.playSettingPopup;
        if (playSettingPopup == null) {
            AbstractC5830k.m5339p("playSettingPopup");
            throw null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivSetting = viewFragmentSketchPlayBinding.ivSetting;
        AbstractC5830k.m5329f(ivSetting, "ivSetting");
        playSettingPopup.showPopup(ivSetting, sketchPlayFragment.mNewPlayerConfigData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(final SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC6473e interfaceC6473e = sketchPlayFragment.playSpeedRateShowCall;
        if (interfaceC6473e != null) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            TextView tvSpeedRate = viewFragmentSketchPlayBinding.controlBar.tvSpeedRate;
            AbstractC5830k.m5329f(tvSpeedRate, "tvSpeedRate");
            final int i = 0;
            interfaceC6473e.invoke(tvSpeedRate, new InterfaceC6471c(sketchPlayFragment) { // from class: com.zykj.view.board.play.e

                /* renamed from: b */
                public final /* synthetic */ SketchPlayFragment f8292b;

                {
                    this.f8292b = sketchPlayFragment;
                }

                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            return SketchPlayFragment.initView$lambda$7$lambda$4(this.f8292b, ((Double) obj).doubleValue());
                        default:
                            return SketchPlayFragment.initView$lambda$7$lambda$6$lambda$5(this.f8292b, (SpeedRate) obj);
                    }
                }
            });
            return;
        }
        PlaySpeedRatePopup playSpeedRatePopup = sketchPlayFragment.playSpeedRatePopup;
        if (playSpeedRatePopup == null) {
            AbstractC5830k.m5339p("playSpeedRatePopup");
            throw null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        TextView tvSpeedRate2 = viewFragmentSketchPlayBinding2.controlBar.tvSpeedRate;
        AbstractC5830k.m5329f(tvSpeedRate2, "tvSpeedRate");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i8 = 1;
        playSpeedRatePopup.showPopup(tvSpeedRate2, viewFragmentSketchPlayBinding3.controlBar.tvSpeedRate.getText().toString(), new InterfaceC6471c(sketchPlayFragment) { // from class: com.zykj.view.board.play.e

            /* renamed from: b */
            public final /* synthetic */ SketchPlayFragment f8292b;

            {
                this.f8292b = sketchPlayFragment;
            }

            @Override // p152r6.InterfaceC6471c
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        return SketchPlayFragment.initView$lambda$7$lambda$4(this.f8292b, ((Double) obj).doubleValue());
                    default:
                        return SketchPlayFragment.initView$lambda$7$lambda$6$lambda$5(this.f8292b, (SpeedRate) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$7$lambda$4(SketchPlayFragment sketchPlayFragment, double d9) {
        changeSpeed$default(sketchPlayFragment, d9, false, 2, null);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initView$lambda$7$lambda$6$lambda$5(SketchPlayFragment sketchPlayFragment, SpeedRate it) {
        AbstractC5830k.m5330g(it, "it");
        changeSpeed$default(sketchPlayFragment, it.getSpeed(), false, 2, null);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(SketchPlayFragment sketchPlayFragment, View view) {
        InterfaceC6471c fullscreenClickListener = sketchPlayFragment.extraConfig.getFullscreenClickListener();
        if (fullscreenClickListener != null) {
            AbstractC5830k.m5327d(view);
            fullscreenClickListener.invoke(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(SketchPlayFragment sketchPlayFragment, View view) {
        if (sketchPlayFragment.extraConfig.getSeekBarVisibleManually()) {
            sketchPlayFragment.toggleControlBarVisible();
            InterfaceC6471c sketchTapAction = sketchPlayFragment.extraConfig.getSketchTapAction();
            if (sketchTapAction != null) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
                if (viewFragmentSketchPlayBinding == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding.controlBar.ivFullscreen;
                AbstractC5830k.m5329f(ivFullscreen, "ivFullscreen");
                sketchTapAction.invoke(Boolean.valueOf(ivFullscreen.getVisibility() == 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionRequest$lambda$11(SketchPlayFragment sketchPlayFragment, Boolean it) {
        AbstractC5830k.m5330g(it, "it");
        if (!it.booleanValue()) {
            sketchPlayFragment.writeFileCallback = null;
            return;
        }
        InterfaceC6469a interfaceC6469a = sketchPlayFragment.writeFileCallback;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
    }

    public static /* synthetic */ void play$default(SketchPlayFragment sketchPlayFragment, String str, int i, boolean z8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        int i9 = i;
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        sketchPlayFragment.play(str, i9, z8, (i8 & 8) != 0 ? null : interfaceC6471c, (i8 & 16) != 0 ? null : interfaceC6471c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s play$lambda$10(SketchPlayFragment sketchPlayFragment, boolean z8, String str, int i, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        LifecycleOwnerKt.getLifecycleScope(sketchPlayFragment).launchWhenStarted(new SketchPlayFragment$play$1$1(z8, sketchPlayFragment, str, i, interfaceC6471c, interfaceC6471c2, null));
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SketchPlayFragment$playStatusListener$2$1 playStatusListener_delegate$lambda$12(SketchPlayFragment sketchPlayFragment) {
        return new SketchPlayFragment$playStatusListener$2$1(sketchPlayFragment);
    }

    public static /* synthetic */ void seekTo$default(SketchPlayFragment sketchPlayFragment, int i, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            interfaceC6469a = null;
        }
        if ((i8 & 8) != 0) {
            interfaceC6469a2 = null;
        }
        sketchPlayFragment.seekTo(i, z8, interfaceC6469a, interfaceC6469a2);
    }

    public static /* synthetic */ void showProgress$default(SketchPlayFragment sketchPlayFragment, String str, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sketchPlayFragment.getString(C5280R.string.progress_content);
            AbstractC5830k.m5329f(str, "getString(...)");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        sketchPlayFragment.showProgress(str, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSeekBar() {
        if (this.mTotalTime > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.controlBar.groupSeekBar;
            AbstractC5830k.m5329f(groupSeekBar, "groupSeekBar");
            groupSeekBar.setVisibility(0);
            if (this.extraConfig.getShowFullscreenButton()) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
                if (viewFragmentSketchPlayBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                ImageView ivFullscreen = viewFragmentSketchPlayBinding2.controlBar.ivFullscreen;
                AbstractC5830k.m5329f(ivFullscreen, "ivFullscreen");
                ivFullscreen.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sketchResumePlaying() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C53471(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startControlBarJob() {
        InterfaceC6013w0 interfaceC6013w0 = this.autoHideSeekBarJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.autoHideSeekBarJob = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C53491(null));
    }

    private final void toggleControlBarVisible() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C53501(null));
    }

    public final void cancelAutoHideJob() {
        InterfaceC6013w0 interfaceC6013w0 = this.autoHideSeekBarJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
    }

    public final void changeSpeed(double newSpeed, boolean showToast) {
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            if (!viewFragmentSketchPlayBinding.sketchView.setRate(newSpeed)) {
                if (showToast) {
                    C3404x.m2356a(getString(C5280R.string.micro_lesson_not_support_speed), new Object[0]);
                    return;
                }
                return;
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding2.controlBar.tvSpeedRate.setText(newSpeed + "X");
            if (showToast) {
                C3404x.m2356a(getString(C5280R.string.speed_rate_change, String.valueOf(newSpeed)), new Object[0]);
            }
        } catch (Exception unused) {
            if (showToast) {
                C3404x.m2356a(getString(C5280R.string.device_not_support_speed), new Object[0]);
            }
        }
    }

    public final float getFloatProgress() {
        return this.progress / this.mTotalTime;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    public final Bitmap getScreenBitmap() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            return viewFragmentSketchPlayBinding.sketchView.getScreenBitmap();
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    public final double getSpeedRate() {
        PlaySpeedRatePopup playSpeedRatePopup = this.playSpeedRatePopup;
        if (playSpeedRatePopup == null) {
            AbstractC5830k.m5339p("playSpeedRatePopup");
            throw null;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            return playSpeedRatePopup.getCurrentSpeedRate(viewFragmentSketchPlayBinding.controlBar.tvSpeedRate.getText().toString());
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    public final void hideProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    public final boolean isCanPlay() {
        return this.mTotalTime > 0;
    }

    public final boolean isPlaying() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        if (viewFragmentSketchPlayBinding.sketchView.status() == PlayStatus.RECORD_START) {
            return true;
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
        if (viewFragmentSketchPlayBinding2 != null) {
            return viewFragmentSketchPlayBinding2.sketchView.status() == PlayStatus.RECORD_RESUME;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(inflater, "inflater");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBindingInflate = ViewFragmentSketchPlayBinding.inflate(inflater, container, false);
        AbstractC5830k.m5329f(viewFragmentSketchPlayBindingInflate, "inflate(...)");
        this.mBinding = viewFragmentSketchPlayBindingInflate;
        View root = viewFragmentSketchPlayBindingInflate.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hideProgress();
        if (this.isReady) {
            stopPlay();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.sketchView.release();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding2.sketchView.destroy();
        }
        this.isReady = false;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isAdded() && hidden) {
            stopPlay();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopPlay();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.continueWhenResume) {
            startPlay();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        NewPlayerConfig newPlayerConfig = this.mNewPlayerConfig;
        if (newPlayerConfig != null) {
            handleConfig(newPlayerConfig);
        }
    }

    public final void performClickStartPlay() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.sketchView.status();
        int i = playStatusStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[playStatusStatus.ordinal()];
        if (i == 1) {
            this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding2.sketchView.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 != null) {
                viewFragmentSketchPlayBinding3.controlBar.ivRecord.setImageResource(C5280R.drawable.icon_record_start);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        if (i == 2) {
            this.continueWhenResume = false;
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.mBinding;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding4.sketchView.pause();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding5 = this.mBinding;
            if (viewFragmentSketchPlayBinding5 != null) {
                viewFragmentSketchPlayBinding5.controlBar.ivRecord.setImageResource(C5280R.drawable.icon_record_start);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        if (i == 3) {
            this.continueWhenResume = true;
            sketchResumePlaying();
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding6 = this.mBinding;
            if (viewFragmentSketchPlayBinding6 != null) {
                viewFragmentSketchPlayBinding6.controlBar.ivRecord.setImageResource(C5280R.drawable.view_icon_record_stop);
                return;
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
        if (i != 4) {
            return;
        }
        this.continueWhenResume = true;
        sketchStartPlaying();
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding7 = this.mBinding;
        if (viewFragmentSketchPlayBinding7 != null) {
            viewFragmentSketchPlayBinding7.controlBar.ivRecord.setImageResource(C5280R.drawable.icon_record_start);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void play(@NotNull final String path, final int progress, final boolean showLoading, @Nullable final InterfaceC6471c onFailure, @Nullable final InterfaceC6471c onSuccess) {
        AbstractC5830k.m5330g(path, "path");
        this.writeFileCallback = new InterfaceC6469a() { // from class: com.zykj.view.board.play.c
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                return SketchPlayFragment.play$lambda$10(this.f8284a, showLoading, path, progress, onSuccess, onFailure);
            }
        };
        this.permissionRequest.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public final void seekTo(int progress, boolean resumePlaying, @Nullable InterfaceC6469a onSuccess, @Nullable InterfaceC6469a onFailure) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C53451(progress, resumePlaying, onSuccess, onFailure, null));
    }

    public final void setAutoHideSeekBarState(boolean state) {
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, false, state, false, false, null, null, null, 125, null);
    }

    public final void setCustomSpeedWindow(@NotNull InterfaceC6473e showCallback) {
        AbstractC5830k.m5330g(showCallback, "showCallback");
        this.playSpeedRateShowCall = showCallback;
    }

    public final void setFullscreenClickListener(@NotNull InterfaceC6471c fullscreenClickListener) {
        AbstractC5830k.m5330g(fullscreenClickListener, "fullscreenClickListener");
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, false, false, false, false, null, null, fullscreenClickListener, 63, null);
    }

    public final void setFullscreenRes(@DrawableRes int resId) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.ivFullscreen.setImageResource(resId);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void setFullscreenSelected(boolean selected) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C53461(selected, null));
    }

    public final void setFullscreenVisible(boolean isVisible) {
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, isVisible, false, false, false, null, null, null, 126, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivFullscreen = viewFragmentSketchPlayBinding.controlBar.ivFullscreen;
        AbstractC5830k.m5329f(ivFullscreen, "ivFullscreen");
        ivFullscreen.setVisibility(isVisible ? 0 : 8);
    }

    public final void setInterceptWhenVideo(boolean interceptWhenVideo) {
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, false, false, false, interceptWhenVideo, null, null, null, 119, null);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.touchSwitchView.setCanTouch(!interceptWhenVideo);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void setNewPlayerConfig(@NotNull NewPlayerConfig newPlayerConfig) {
        AbstractC5830k.m5330g(newPlayerConfig, "newPlayerConfig");
        this.mNewPlayerConfig = newPlayerConfig;
        if (getView() != null) {
            handleConfig(newPlayerConfig);
        }
    }

    public final void setOnAutoHideAction(@NotNull InterfaceC6469a onAutoHideAction) {
        AbstractC5830k.m5330g(onAutoHideAction, "onAutoHideAction");
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, false, false, false, false, onAutoHideAction, null, null, 111, null);
    }

    public final void setScaleEnable(boolean isEnable) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.sketchView.setScaleEnable(isEnable);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void setSeekBarProgressColor(@NotNull Drawable drawable) {
        AbstractC5830k.m5330g(drawable, "drawable");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.seekBar.setProgressDrawable(drawable);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void setSeekBarThumbColor(@ColorRes int color) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.seekBar.getThumb().setColorFilter(ContextCompat.getColor(requireContext(), color), PorterDuff.Mode.SRC_ATOP);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void setSeekBarVisibleManually(boolean seekBarVisibleManually) {
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, false, false, seekBarVisibleManually, false, null, null, null, 123, null);
    }

    public final void setSketchTapAction(@NotNull InterfaceC6471c sketchTapAction) {
        AbstractC5830k.m5330g(sketchTapAction, "sketchTapAction");
        this.extraConfig = SketchPlayExtraConfig.copy$default(this.extraConfig, false, false, false, false, null, sketchTapAction, null, 95, null);
    }

    public final void setSpeedRateBackgroundDrawable(@NotNull Drawable drawable) {
        AbstractC5830k.m5330g(drawable, "drawable");
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.tvSpeedRate.setBackground(drawable);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final void setSpeedRateItemColor(@ColorRes int colorRes) {
        PlaySpeedRatePopup playSpeedRatePopup = this.playSpeedRatePopup;
        if (playSpeedRatePopup != null) {
            playSpeedRatePopup.setItemTextColor(colorRes);
        } else {
            AbstractC5830k.m5339p("playSpeedRatePopup");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isAdded() || isVisibleToUser) {
            return;
        }
        stopPlay();
    }

    public final void showProgress(@NotNull String tips, boolean isCancelable) {
        AbstractC5830k.m5330g(tips, "tips");
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = ProgressDialog.show(requireContext(), "", tips, false, isCancelable);
    }

    public final void sketchStartPlaying() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C53481(null));
    }

    public final void startPlay() {
        if (this.isReady) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            PlayStatus playStatusStatus = viewFragmentSketchPlayBinding.sketchView.status();
            int i = playStatusStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[playStatusStatus.ordinal()];
            if (i == 3) {
                sketchResumePlaying();
            } else {
                if (i != 4) {
                    return;
                }
                sketchStartPlaying();
            }
        }
    }

    public final void stopPlay() {
        if (this.isReady) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            if (viewFragmentSketchPlayBinding.sketchView.status() != PlayStatus.RECORD_START) {
                ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.mBinding;
                if (viewFragmentSketchPlayBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                if (viewFragmentSketchPlayBinding2.sketchView.status() != PlayStatus.RECORD_RESUME) {
                    return;
                }
            }
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.mBinding;
            if (viewFragmentSketchPlayBinding3 != null) {
                viewFragmentSketchPlayBinding3.sketchView.pause();
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }
    }
}
