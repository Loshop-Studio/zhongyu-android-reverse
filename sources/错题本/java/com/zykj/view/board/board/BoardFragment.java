package com.zykj.view.board.board;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.C2766k;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleOwnerKt;
import android.view.MotionEvent;
import android.view.RepeatOnLifecycleKt;
import android.view.View;
import android.view.ViewGroup;
import android.view.result.ActivityResultCallback;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import com.blankj.utilcode.util.AbstractC3387g;
import com.blankj.utilcode.util.C3404x;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.proxy.ImageCropView;
import com.zykj.blackboard.proxy.TextEditView;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum;
import com.zykj.view.C5280R;
import com.zykj.view.board.board.BoardEvent;
import com.zykj.view.board.board.ExpandStatus;
import com.zykj.view.board.board.GraphType;
import com.zykj.view.board.board.MainToolType;
import com.zykj.view.board.board.PenType;
import com.zykj.view.databinding.ViewFragmentBoardBinding;
import com.zykj.view.databinding.ViewIncludeBackgroundColorBinding;
import com.zykj.view.databinding.ViewIncludeImageAddBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.databinding.ViewIncludeSelectTypeBinding;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import com.zykj.view.databinding.ViewItemSketchRecordBinding;
import com.zykj.view.utils.CustomColorManager;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.utils.ImagePicker;
import com.zykj.view.utils.LatestColorManager;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import com.zykj.view.widget.radio.WithSelectedRadioButton;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC5773a;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5908e;
import kotlinx.coroutines.flow.C5956v;
import kotlinx.coroutines.flow.InterfaceC5905c0;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 r2\u00020\u0001:\u0001rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJS\u0010%\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020!2\u0018\b\u0002\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000e\u0018\u00010#¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b)\u0010(J%\u0010,\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0*2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b,\u0010-Jo\u00106\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020!2&\b\u0002\u00104\u001a \b\u0001\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e02\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001002$\u00105\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e02\u0012\u0006\u0012\u0004\u0018\u00010300¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000e¢\u0006\u0004\b8\u0010\u0003J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0*¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0*¢\u0006\u0004\b;\u0010:J\r\u0010<\u001a\u00020\u000e¢\u0006\u0004\b<\u0010\u0003J\u000f\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u000eH\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\u000eH\u0002¢\u0006\u0004\b@\u0010\u0003J\u000f\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010\u0003J\u000f\u0010D\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010\u0003J\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010\u0003J\u000f\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010\u0003J\u000f\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u000eH\u0002¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u000eH\u0002¢\u0006\u0004\bJ\u0010\u0003J\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020!H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010\u0003J\u000f\u0010O\u001a\u00020\u000eH\u0002¢\u0006\u0004\bO\u0010\u0003J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010e\u001a\u0010\u0012\f\u0012\n d*\u0004\u0018\u00010\u001e0\u001e0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0011\u0010g\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bg\u0010hR$\u0010o\u001a\u00020i2\u0006\u0010j\u001a\u00020i8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010\u001f\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Ld6/s;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "showProgress", "hideProgress", "Lcom/zykj/view/board/board/BoardViewConfig;", "boardViewConfig", "setBoardViewConfig", "(Lcom/zykj/view/board/board/BoardViewConfig;)V", "Lcom/zykj/view/board/board/BoardCallbackConfig;", "boardCallbackConfig", "setBoardCallbackConfig", "(Lcom/zykj/view/board/board/BoardCallbackConfig;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "filename", "", "isSelected", "Lkotlin/Function1;", "imagePathCallback", "addBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLr6/c;)V", "addFullBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;Z)V", "addBitmapMaxHeight", "", "pathList", "addBitmapList", "(Ljava/util/List;Z)V", "needClear", "isContentThumbnail", "Lkotlin/Function2;", "", "Lh6/c;", "", "error", "callback", "getSavePath", "(ZZLr6/e;Lr6/e;)V", "cleanBoardCache", "getRecordingImagePathList", "()Ljava/util/List;", "getPathListByImageGraph", "resetRevoke", "initView", "initClickListener", "loadSketchData", "initBasicData", "initMainClickListener", "initSelectListener", "initPenClickListener", "initEraserClickListener", "initGraphClickListener", "initBackgroundClickListener", "initExtraClickListener", "initDismissCustomColorPaletteOnSketchTouch", "initProgressBarTouchListener", "initObserver", "isOpen", "startToolAnimate", "(Z)V", "startGallery", "startCapture", "Lcom/zykj/view/board/board/BoardSketchConfig;", "boardSketchConfig", "setBoardSketchConfig", "(Lcom/zykj/view/board/board/BoardSketchConfig;)V", "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;", "Lcom/zykj/view/board/board/BoardViewModel;", "mViewModel$delegate", "Ld6/e;", "getMViewModel", "()Lcom/zykj/view/board/board/BoardViewModel;", "mViewModel", "Lcom/zykj/view/utils/ImagePicker;", "mImagePicker", "Lcom/zykj/view/utils/ImagePicker;", "Lkotlin/Function0;", "audioCallback", "Lr6/a;", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "audioPermissionRequest", "Landroidx/activity/result/ActivityResultLauncher;", "isImageOutOfCount", "()Z", "Lcom/zykj/view/board/board/SimpleUIState;", "value", "getUiState", "()Lcom/zykj/view/board/board/SimpleUIState;", "setUiState", "(Lcom/zykj/view/board/board/SimpleUIState;)V", "uiState", "getPath", "()Ljava/lang/String;", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,1030:1\n1#2:1031\n1321#3,2:1032\n1332#3,3:1034\n1332#3,3:1037\n1332#3,3:1040\n1332#3,3:1043\n29#4:1046\n85#4,18:1047\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n*L\n378#1:1032,2\n391#1:1034,3\n398#1:1037,3\n415#1:1040,3\n466#1:1043,3\n781#1:1046\n781#1:1047,18\n*E\n"})
/* loaded from: classes3.dex */
public final class BoardFragment extends Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private InterfaceC6469a audioCallback;

    @NotNull
    private final ActivityResultLauncher<String> audioPermissionRequest;
    private ViewFragmentBoardBinding mBinding;

    /* renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e mViewModel = AbstractC5773a.m5117b(new C2766k(21));

    @NotNull
    private final ImagePicker mImagePicker = new ImagePicker(this, null, 2, 0 == true ? 1 : 0);

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/zykj/view/board/board/BoardFragment;", "path", "", "boardViewConfig", "Lcom/zykj/view/board/board/BoardViewConfig;", "boardSketchConfig", "Lcom/zykj/view/board/board/BoardSketchConfig;", "boardCallbackConfig", "Lcom/zykj/view/board/board/BoardCallbackConfig;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public static /* synthetic */ BoardFragment newInstance$default(Companion companion, String str, BoardViewConfig boardViewConfig, BoardSketchConfig boardSketchConfig, BoardCallbackConfig boardCallbackConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.newInstance(str, boardViewConfig, boardSketchConfig, boardCallbackConfig);
        }

        @NotNull
        public final BoardFragment newInstance(@NotNull String path, @NotNull BoardViewConfig boardViewConfig, @NotNull BoardSketchConfig boardSketchConfig, @NotNull BoardCallbackConfig boardCallbackConfig) {
            AbstractC5830k.m5330g(path, "path");
            AbstractC5830k.m5330g(boardViewConfig, "boardViewConfig");
            AbstractC5830k.m5330g(boardSketchConfig, "boardSketchConfig");
            AbstractC5830k.m5330g(boardCallbackConfig, "boardCallbackConfig");
            BoardFragment boardFragment = new BoardFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            boardFragment.setArguments(bundle);
            boardFragment.setBoardViewConfig(boardViewConfig);
            boardFragment.setBoardSketchConfig(boardSketchConfig);
            boardFragment.setBoardCallbackConfig(boardCallbackConfig);
            return boardFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$getSavePath$1", m5303f = "BoardFragment.kt", m5304i = {0, 1}, m5305l = {977, 980}, m5306m = "invokeSuspend", m5307n = {"it", "it"}, m5308s = {"L$0", "L$0"})
    /* renamed from: com.zykj.view.board.board.BoardFragment$getSavePath$1 */
    public static final class C52811 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $callback;
        final /* synthetic */ InterfaceC6473e $error;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52811(InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, InterfaceC5631c<? super C52811> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$error = interfaceC6473e;
            this.$callback = interfaceC6473e2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C52811 c52811 = new C52811(this.$error, this.$callback, interfaceC5631c);
            c52811.L$0 = obj;
            return c52811;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            if (r6.invoke(null, r5) == r1) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r5.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                kotlin.AbstractC5774b.m5119b(r6)
                goto L4c
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.AbstractC5774b.m5119b(r6)
                goto L3e
            L20:
                kotlin.AbstractC5774b.m5119b(r6)
                r6.e r6 = r5.$error
                if (r6 == 0) goto L32
                r5.L$0 = r0
                r5.label = r4
                java.lang.Object r6 = r6.invoke(r0, r5)
                if (r6 != r1) goto L3e
                goto L4b
            L32:
                java.lang.String r6 = r0.getMessage()
                if (r6 == 0) goto L3e
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.blankj.utilcode.util.C3404x.m2356a(r6, r0)
            L3e:
                r6.e r6 = r5.$callback
                r0 = 0
                r5.L$0 = r0
                r5.label = r3
                java.lang.Object r6 = r6.invoke(r0, r5)
                if (r6 != r1) goto L4c
            L4b:
                return r1
            L4c:
                d6.s r6 = p045d6.C5443s.f8405a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardFragment.C52811.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/view/board/board/BoardFragment$getSavePath$1.smali:211
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(Throwable th, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52811) create(th, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"com/zykj/view/board/board/BoardFragment$initBasicData$3", "Lcom/zykj/blackboard/proxy/ImageCropView;", "", "imageLocalPath", "Lkotlin/Function1;", "Ld6/s;", "doneCallback", "Lkotlin/Function0;", "cancelCallback", "showCropView", "(Ljava/lang/String;Lr6/c;Lr6/a;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.view.board.board.BoardFragment$initBasicData$3 */
    public static final class C52833 implements ImageCropView {
        public C52833() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s showCropView$lambda$0(InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, Uri uri) {
            String absolutePath;
            if (uri != null) {
                File fileM2317r = AbstractC3382c.m2317r(uri);
                if (fileM2317r == null || (absolutePath = fileM2317r.getAbsolutePath()) == null) {
                    absolutePath = "";
                }
                interfaceC6471c.invoke(absolutePath);
            } else {
                interfaceC6469a.invoke();
            }
            return C5443s.f8405a;
        }

        @Override // com.zykj.blackboard.proxy.ImageCropView
        public void showCropView(String imageLocalPath, InterfaceC6471c doneCallback, InterfaceC6469a cancelCallback) {
            AbstractC5830k.m5330g(imageLocalPath, "imageLocalPath");
            AbstractC5830k.m5330g(doneCallback, "doneCallback");
            AbstractC5830k.m5330g(cancelCallback, "cancelCallback");
            ImagePicker imagePicker = BoardFragment.this.mImagePicker;
            Uri uriM2302c = AbstractC3382c.m2302c(new File(imageLocalPath));
            AbstractC5830k.m5329f(uriM2302c, "file2Uri(...)");
            imagePicker.startCrop(uriM2302c, new C5317o(doneCallback, cancelCallback, 2));
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {597}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1 */
    public static final class C52851 extends SuspendLambda implements InterfaceC6473e {
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
        @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BoardFragment this$0;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {600}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68751 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/BoardEvent;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C68761 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68761(BoardFragment boardFragment, InterfaceC5631c<? super C68761> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68761 c68761 = new C68761(this.this$0, interfaceC5631c);
                        c68761.L$0 = obj;
                        return c68761;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(BoardEvent boardEvent, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68761) create(boardEvent, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        BoardEvent boardEvent = (BoardEvent) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        if (!(boardEvent instanceof BoardEvent.ExpandAnimate)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.startToolAnimate(((BoardEvent.ExpandAnimate) boardEvent).isOpen());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68751(BoardFragment boardFragment, InterfaceC5631c<? super C68751> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new C68751(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5905c0 event = this.this$0.getMViewModel().getEvent();
                        C68761 c68761 = new C68761(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(event, c68761, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68751) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$10", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {747}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$10, reason: invalid class name */
            public static final class AnonymousClass10 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/ExpandState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/ExpandState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$10$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$10$1, reason: invalid class name and collision with other inner class name */
                public static final class C68771 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68771(BoardFragment boardFragment, InterfaceC5631c<? super C68771> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68771 c68771 = new C68771(this.this$0, interfaceC5631c);
                        c68771.L$0 = obj;
                        return c68771;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(ExpandState expandState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68771) create(expandState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        ExpandState expandState = (ExpandState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding != null) {
                            viewFragmentBoardBinding.ivExpansion.setImageResource(expandState.getExpandStatus().getIcon());
                            return C5443s.f8405a;
                        }
                        AbstractC5830k.m5339p("mBinding");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass10(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass10> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass10(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 expandState = this.this$0.getMViewModel().getExpandState();
                        C68771 c68771 = new C68771(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(expandState, c68771, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass10) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$11", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {754}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$11, reason: invalid class name */
            public static final class AnonymousClass11 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordState;", "record", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/RecordState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$11$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$11$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$11$1\n*L\n762#1:1031,2\n764#1:1033,2\n766#1:1035,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$11$1, reason: invalid class name and collision with other inner class name */
                public static final class C68781 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68781(BoardFragment boardFragment, InterfaceC5631c<? super C68781> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68781 c68781 = new C68781(this.this$0, interfaceC5631c);
                        c68781.L$0 = obj;
                        return c68781;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(RecordState recordState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68781) create(recordState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        RecordState recordState = (RecordState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding.includeRecord;
                        viewItemSketchRecordAudioBinding.ivRecord.setImageResource(recordState.getRecordStatus().getIcon());
                        viewItemSketchRecordAudioBinding.ivAudio.setSelected(recordState.isMicrophoneOn());
                        viewItemSketchRecordAudioBinding.tvProgress.setText(recordState.getProgress());
                        LinearLayoutCompat llCrop = viewItemSketchRecordAudioBinding.llCrop;
                        AbstractC5830k.m5329f(llCrop, "llCrop");
                        llCrop.setVisibility(recordState.getRecordStatus().getIsCropVisible() ? 0 : 8);
                        LinearLayoutCompat llOption = viewItemSketchRecordAudioBinding.llOption;
                        AbstractC5830k.m5329f(llOption, "llOption");
                        llOption.setVisibility(recordState.getRecordStatus().getIsFunctionVisible() ? 0 : 8);
                        LinearLayoutCompat llRecord = viewItemSketchRecordAudioBinding.llRecord;
                        AbstractC5830k.m5329f(llRecord, "llRecord");
                        llRecord.setVisibility(recordState.getRecordStatus().getIsRecordVisible() ? 0 : 8);
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass11(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass11> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass11(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 recordState = this.this$0.getMViewModel().getRecordState();
                        C68781 c68781 = new C68781(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(recordState, c68781, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass11) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/MainToolState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$2$1\n*L\n613#1:1031,2\n614#1:1033,2\n615#1:1035,2\n616#1:1037,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1, reason: invalid class name and collision with other inner class name */
                public static final class C68791 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68791(BoardFragment boardFragment, InterfaceC5631c<? super C68791> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68791 c68791 = new C68791(this.this$0, interfaceC5631c);
                        c68791.L$0 = obj;
                        return c68791;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(MainToolState mainToolState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68791) create(mainToolState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        MainToolState mainToolState = (MainToolState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.includeMenu;
                        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.ivWithdraw;
                        AbstractC5830k.m5329f(ivWithdraw, "ivWithdraw");
                        ivWithdraw.setVisibility(mainToolState.getRevokeVisible() ? 0 : 8);
                        AppCompatImageView ivRecover = viewIncludeMenuBinding.ivRecover;
                        AbstractC5830k.m5329f(ivRecover, "ivRecover");
                        ivRecover.setVisibility(mainToolState.getRevokeVisible() ? 0 : 8);
                        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.ivEnlarge;
                        AbstractC5830k.m5329f(ivEnlarge, "ivEnlarge");
                        ivEnlarge.setVisibility(mainToolState.getZoomVisible() ? 0 : 8);
                        AppCompatImageView ivReduce = viewIncludeMenuBinding.ivReduce;
                        AbstractC5830k.m5329f(ivReduce, "ivReduce");
                        ivReduce.setVisibility(mainToolState.getZoomVisible() ? 0 : 8);
                        viewIncludeMenuBinding.ivWithdraw.setEnabled(mainToolState.isWithdrawEnable());
                        viewIncludeMenuBinding.ivRecover.setEnabled(mainToolState.isRecoverEnable());
                        viewIncludeMenuBinding.ivTouch.setSelected(mainToolState.isTouchable());
                        viewIncludeMenuBinding.ivSelect.setSelected(mainToolState.getMainToolType().getIsSelectChecked());
                        viewIncludeMenuBinding.ivPen.setSelected(mainToolState.getMainToolType().getIsPenChecked());
                        viewIncludeMenuBinding.ivEraser.setSelected(mainToolState.getMainToolType().getIsEraserChecked());
                        viewIncludeMenuBinding.ivImageAdd.setSelected(mainToolState.getMainToolType().getIsGraphChecked());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass2(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 mainToolState = this.this$0.getMViewModel().getMainToolState();
                        C68791 c68791 = new C68791(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(mainToolState, c68791, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {633}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/SelectToolState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/SelectToolState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1, reason: invalid class name and collision with other inner class name */
                public static final class C68801 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68801(BoardFragment boardFragment, InterfaceC5631c<? super C68801> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68801 c68801 = new C68801(this.this$0, interfaceC5631c);
                        c68801.L$0 = obj;
                        return c68801;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(SelectToolState selectToolState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68801) create(selectToolState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        SelectToolState selectToolState = (SelectToolState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding = viewFragmentBoardBinding.includeSelect;
                        viewIncludeSelectTypeBinding.ivSelectPen.setSelected(selectToolState.getPenSelected());
                        viewIncludeSelectTypeBinding.ivSelectHighlighter.setSelected(selectToolState.getHighlighterSelected());
                        viewIncludeSelectTypeBinding.ivSelectImage.setSelected(selectToolState.getImageSelected());
                        viewIncludeSelectTypeBinding.ivSelectText.setSelected(selectToolState.getTextSelected());
                        viewIncludeSelectTypeBinding.ivSelectGeometry.setSelected(selectToolState.getGeometrySelected());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass3> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass3(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 selectToolState = this.this$0.getMViewModel().getSelectToolState();
                        C68801 c68801 = new C68801(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(selectToolState, c68801, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {646}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/PenToolState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/PenToolState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$4$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$4$1\n*L\n648#1:1031,2\n649#1:1033,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1, reason: invalid class name and collision with other inner class name */
                public static final class C68811 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68811(BoardFragment boardFragment, InterfaceC5631c<? super C68811> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68811 c68811 = new C68811(this.this$0, interfaceC5631c);
                        c68811.L$0 = obj;
                        return c68811;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(PenToolState penToolState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68811) create(penToolState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        PenToolState penToolState = (PenToolState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludePenBinding viewIncludePenBinding = viewFragmentBoardBinding.includePen;
                        RadioButton rbPenDottedLine = viewIncludePenBinding.rbPenDottedLine;
                        AbstractC5830k.m5329f(rbPenDottedLine, "rbPenDottedLine");
                        rbPenDottedLine.setVisibility(penToolState.getDotVisible() ? 0 : 8);
                        RadioButton rbPenHighlighter = viewIncludePenBinding.rbPenHighlighter;
                        AbstractC5830k.m5329f(rbPenHighlighter, "rbPenHighlighter");
                        rbPenHighlighter.setVisibility(penToolState.getHighlighterVisible() ? 0 : 8);
                        RadioGroup rgPenType = viewIncludePenBinding.rgPenType;
                        AbstractC5830k.m5329f(rgPenType, "rgPenType");
                        ExtKt.checkAt(rgPenType, penToolState.getPenType().getOrdinal());
                        RadioGroup rgPenSize = viewIncludePenBinding.rgPenSize;
                        AbstractC5830k.m5329f(rgPenSize, "rgPenSize");
                        ExtKt.checkAt(rgPenSize, penToolState.getPenSizeLevel());
                        RadioGroup rgPenColor = viewIncludePenBinding.rgPenColor;
                        AbstractC5830k.m5329f(rgPenColor, "rgPenColor");
                        ExtKt.checkAt(rgPenColor, penToolState.getPenColor().getOrdinal());
                        viewIncludePenBinding.rbCustomColor.setColor(penToolState.getPenCustomColor());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass4> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass4(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 penToolState = this.this$0.getMViewModel().getPenToolState();
                        C68811 c68811 = new C68811(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(penToolState, c68811, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass4) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {667}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m5110d2 = {"<anonymous>", "", "extraUIState", "Lcom/zykj/view/board/board/ExtraUIState;", "penToolState", "Lcom/zykj/view/board/board/PenToolState;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1, reason: invalid class name and collision with other inner class name */
                public static final class C68821 extends SuspendLambda implements InterfaceC6474f {
                    /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C68821(InterfaceC5631c<? super C68821> interfaceC5631c) {
                        super(3, interfaceC5631c);
                    }

                    @Override // p152r6.InterfaceC6474f
                    public final Object invoke(ExtraUIState extraUIState, PenToolState penToolState, InterfaceC5631c<? super Boolean> interfaceC5631c) {
                        C68821 c68821 = new C68821(interfaceC5631c);
                        c68821.L$0 = extraUIState;
                        c68821.L$1 = penToolState;
                        return c68821.invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        ExtraUIState extraUIState = (ExtraUIState) this.L$0;
                        PenToolState penToolState = (PenToolState) this.L$1;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        return Boolean.valueOf(extraUIState.getMinorToolType().getPenVisible() && penToolState.isShowCustomColor());
                    }
                }

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "isShow", "Ld6/s;", "<anonymous>", "(Z)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$2", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2\n*L\n668#1:1031,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ boolean Z$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC5631c);
                        anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                        return anonymousClass2;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return invoke(((Boolean) obj).booleanValue(), (InterfaceC5631c<? super C5443s>) obj2);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        boolean z8 = this.Z$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        CustomColorFrameLayout flCustomColor = viewFragmentBoardBinding.flCustomColor;
                        AbstractC5830k.m5329f(flCustomColor, "flCustomColor");
                        flCustomColor.setVisibility(z8 ? 0 : 8);
                        if (z8) {
                            ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.this$0.mBinding;
                            if (viewFragmentBoardBinding2 == null) {
                                AbstractC5830k.m5339p("mBinding");
                                throw null;
                            }
                            viewFragmentBoardBinding2.flCustomColor.refresh();
                        }
                        return C5443s.f8405a;
                    }

                    public final Object invoke(boolean z8, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass2) create(Boolean.valueOf(z8), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass5> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass5(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5910f c5956v = new C5956v(this.this$0.getMViewModel().getExtraUIState(), this.this$0.getMViewModel().getPenToolState(), new C68821(null));
                        if (!(c5956v instanceof InterfaceC5944m0)) {
                            c5956v = new C5908e(c5956v, AbstractC5914h.f9374a);
                        }
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(c5956v, anonymousClass2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass5) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {679}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/EraserToolState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/EraserToolState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1, reason: invalid class name and collision with other inner class name */
                public static final class C68831 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68831(BoardFragment boardFragment, InterfaceC5631c<? super C68831> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68831 c68831 = new C68831(this.this$0, interfaceC5631c);
                        c68831.L$0 = obj;
                        return c68831;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(EraserToolState eraserToolState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68831) create(eraserToolState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        EraserToolState eraserToolState = (EraserToolState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        RadioGroup rgEraserSize = viewFragmentBoardBinding.includeEraser.rgEraserSize;
                        AbstractC5830k.m5329f(rgEraserSize, "rgEraserSize");
                        ExtKt.checkAt(rgEraserSize, eraserToolState.getEraserType().getOrdinal());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass6> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass6(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 eraserToolState = this.this$0.getMViewModel().getEraserToolState();
                        C68831 c68831 = new C68831(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(eraserToolState, c68831, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass6) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {688}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7, reason: invalid class name */
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphToolState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/GraphToolState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n*L\n690#1:1031,2\n691#1:1033,2\n692#1:1035,2\n693#1:1037,2\n694#1:1039,2\n695#1:1041,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1, reason: invalid class name and collision with other inner class name */
                public static final class C68841 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68841(BoardFragment boardFragment, InterfaceC5631c<? super C68841> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68841 c68841 = new C68841(this.this$0, interfaceC5631c);
                        c68841.L$0 = obj;
                        return c68841;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(GraphToolState graphToolState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68841) create(graphToolState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        GraphToolState graphToolState = (GraphToolState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.includeGraph;
                        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.ivImageCamera;
                        AbstractC5830k.m5329f(ivImageCamera, "ivImageCamera");
                        ivImageCamera.setVisibility(graphToolState.getCameraVisible() ? 0 : 8);
                        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.ivImageGallery;
                        AbstractC5830k.m5329f(ivImageGallery, "ivImageGallery");
                        ivImageGallery.setVisibility(graphToolState.getGalleryVisible() ? 0 : 8);
                        AppCompatImageView ivText = viewIncludeImageAddBinding.ivText;
                        AbstractC5830k.m5329f(ivText, "ivText");
                        ivText.setVisibility(graphToolState.getTextVisible() ? 0 : 8);
                        AppCompatImageView ivRectangle = viewIncludeImageAddBinding.ivRectangle;
                        AbstractC5830k.m5329f(ivRectangle, "ivRectangle");
                        ivRectangle.setVisibility(graphToolState.getGraphVisible() ? 0 : 8);
                        AppCompatImageView ivOval = viewIncludeImageAddBinding.ivOval;
                        AbstractC5830k.m5329f(ivOval, "ivOval");
                        ivOval.setVisibility(graphToolState.getGraphVisible() ? 0 : 8);
                        ImageView ivTriangle = viewIncludeImageAddBinding.ivTriangle;
                        AbstractC5830k.m5329f(ivTriangle, "ivTriangle");
                        ivTriangle.setVisibility(graphToolState.getGraphVisible() ? 0 : 8);
                        viewIncludeImageAddBinding.ivRectangle.setSelected(graphToolState.getGraphType().getIsRectangleChecked());
                        viewIncludeImageAddBinding.ivOval.setSelected(graphToolState.getGraphType().getIsOvalChecked());
                        viewIncludeImageAddBinding.ivTriangle.setSelected(graphToolState.getGraphType().getIsTriangleChecked());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass7> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass7(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 graphToolState = this.this$0.getMViewModel().getGraphToolState();
                        C68841 c68841 = new C68841(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(graphToolState, c68841, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass7) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {TypedValues.TransitionType.TYPE_STAGGERED}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8, reason: invalid class name */
            public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundToolState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/BackgroundToolState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$8$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$8$1\n*L\n708#1:1031,2\n709#1:1033,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1, reason: invalid class name and collision with other inner class name */
                public static final class C68851 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68851(BoardFragment boardFragment, InterfaceC5631c<? super C68851> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68851 c68851 = new C68851(this.this$0, interfaceC5631c);
                        c68851.L$0 = obj;
                        return c68851;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(BackgroundToolState backgroundToolState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68851) create(backgroundToolState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        BackgroundToolState backgroundToolState = (BackgroundToolState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding = viewFragmentBoardBinding.includeBackground;
                        WithSelectedRadioButton rbBackgroundLine = viewIncludeBackgroundColorBinding.rbBackgroundLine;
                        AbstractC5830k.m5329f(rbBackgroundLine, "rbBackgroundLine");
                        rbBackgroundLine.setVisibility(backgroundToolState.getBackgroundLineVisible() ? 0 : 8);
                        WithSelectedRadioButton rbBackgroundInterweave = viewIncludeBackgroundColorBinding.rbBackgroundInterweave;
                        AbstractC5830k.m5329f(rbBackgroundInterweave, "rbBackgroundInterweave");
                        rbBackgroundInterweave.setVisibility(backgroundToolState.getBackgroundLineVisible() ? 0 : 8);
                        RadioGroup rgBackgroundColor = viewIncludeBackgroundColorBinding.rgBackgroundColor;
                        AbstractC5830k.m5329f(rgBackgroundColor, "rgBackgroundColor");
                        ExtKt.checkAt(rgBackgroundColor, backgroundToolState.getBackgroundType().getOrdinal());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass8> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass8(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 backgroundToolState = this.this$0.getMViewModel().getBackgroundToolState();
                        C68851 c68851 = new C68851(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(backgroundToolState, c68851, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass8) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {717}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9, reason: invalid class name */
            public static final class AnonymousClass9 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ BoardFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/board/ExtraUIState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/board/ExtraUIState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n257#2,2:1043\n257#2,2:1045\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n*L\n718#1:1031,2\n719#1:1033,2\n720#1:1035,2\n721#1:1037,2\n722#1:1039,2\n725#1:1041,2\n727#1:1043,2\n730#1:1045,2\n*E\n"})
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1, reason: invalid class name and collision with other inner class name */
                public static final class C68861 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ BoardFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68861(BoardFragment boardFragment, InterfaceC5631c<? super C68861> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68861 c68861 = new C68861(this.this$0, interfaceC5631c);
                        c68861.L$0 = obj;
                        return c68861;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(ExtraUIState extraUIState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68861) create(extraUIState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        ExtraUIState extraUIState = (ExtraUIState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.this$0.mBinding;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root = viewFragmentBoardBinding.includeSelect.getRoot();
                        AbstractC5830k.m5329f(root, "getRoot(...)");
                        root.setVisibility(extraUIState.getMinorToolType().getSelectVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding2 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root2 = viewFragmentBoardBinding2.includePen.getRoot();
                        AbstractC5830k.m5329f(root2, "getRoot(...)");
                        root2.setVisibility(extraUIState.getMinorToolType().getPenVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding3 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root3 = viewFragmentBoardBinding3.includeEraser.getRoot();
                        AbstractC5830k.m5329f(root3, "getRoot(...)");
                        root3.setVisibility(extraUIState.getMinorToolType().getEraserVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding4 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root4 = viewFragmentBoardBinding4.includeGraph.getRoot();
                        AbstractC5830k.m5329f(root4, "getRoot(...)");
                        root4.setVisibility(extraUIState.getMinorToolType().getGraphVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding5 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root5 = viewFragmentBoardBinding5.includeBackground.getRoot();
                        AbstractC5830k.m5329f(root5, "getRoot(...)");
                        root5.setVisibility(extraUIState.getMinorToolType().getBackgroundVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding6 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root6 = viewFragmentBoardBinding6.includeCommit.getRoot();
                        AbstractC5830k.m5329f(root6, "getRoot(...)");
                        root6.setVisibility(extraUIState.getConfirmButtonType().getIsCommitVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding7 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        View root7 = viewFragmentBoardBinding7.includeRecord.getRoot();
                        AbstractC5830k.m5329f(root7, "getRoot(...)");
                        root7.setVisibility(extraUIState.getConfirmButtonType().getIsRecordVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding8 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding8 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        LinearLayoutCompat llDeleteDraft = viewFragmentBoardBinding8.includeRecord.llDeleteDraft;
                        AbstractC5830k.m5329f(llDeleteDraft, "llDeleteDraft");
                        llDeleteDraft.setVisibility(extraUIState.isDeleteDraftVisible() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding9 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding9 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        SketchProgressView sketchProgressView = viewFragmentBoardBinding9.sketchProgressVertical;
                        sketchProgressView.setTouchable(extraUIState.isVerticalProgressTouchable());
                        sketchProgressView.setProgress(extraUIState.getVerticalProgress());
                        sketchProgressView.setThumbTime(extraUIState.getVerticalThumbTime());
                        ViewFragmentBoardBinding viewFragmentBoardBinding10 = this.this$0.mBinding;
                        if (viewFragmentBoardBinding10 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        SketchProgressView sketchProgressView2 = viewFragmentBoardBinding10.sketchProgressHorizontal;
                        sketchProgressView2.setTouchable(extraUIState.isHorizontalProgressTouchable());
                        sketchProgressView2.setProgress(extraUIState.getHorizontalProgress());
                        sketchProgressView2.setThumbTime(extraUIState.getHorizontalThumbTime());
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass9(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass9> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass9(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 extraUIState = this.this$0.getMViewModel().getExtraUIState();
                        C68861 c68861 = new C68861(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(extraUIState, c68861, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass9) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BoardFragment boardFragment, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new C68751(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass2(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass3(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass4(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass5(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass6(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass7(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass8(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass9(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass10(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass11(this.this$0, null), 3);
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        public C52851(InterfaceC5631c<? super C52851> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return BoardFragment.this.new C52851(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                LifecycleOwner viewLifecycleOwner = BoardFragment.this.getViewLifecycleOwner();
                AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BoardFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C52851) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoardFragment() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.zykj.view.board.board.g
            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BoardFragment.audioPermissionRequest$lambda$1(this.f8236a, (Boolean) obj);
            }
        });
        AbstractC5830k.m5329f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.audioPermissionRequest = activityResultLauncherRegisterForActivityResult;
    }

    public static /* synthetic */ void addBitmap$default(BoardFragment boardFragment, Bitmap bitmap, String str, String str2, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            z8 = false;
        }
        if ((i & 16) != 0) {
            interfaceC6471c = null;
        }
        boardFragment.addBitmap(bitmap, str, str2, z8, interfaceC6471c);
    }

    public static /* synthetic */ void addBitmapList$default(BoardFragment boardFragment, List list, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        boardFragment.addBitmapList(list, z8);
    }

    public static /* synthetic */ void addBitmapMaxHeight$default(BoardFragment boardFragment, Bitmap bitmap, String str, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z8 = false;
        }
        boardFragment.addBitmapMaxHeight(bitmap, str, z8);
    }

    public static /* synthetic */ void addFullBitmap$default(BoardFragment boardFragment, Bitmap bitmap, String str, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z8 = false;
        }
        boardFragment.addFullBitmap(bitmap, str, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void audioPermissionRequest$lambda$1(BoardFragment boardFragment, Boolean it) {
        InterfaceC6469a interfaceC6469a;
        AbstractC5830k.m5330g(it, "it");
        if (it.booleanValue() && (interfaceC6469a = boardFragment.audioCallback) != null) {
            interfaceC6469a.invoke();
        }
        boardFragment.audioCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoardViewModel getMViewModel() {
        return (BoardViewModel) this.mViewModel.getValue();
    }

    private final String getPath() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    public static /* synthetic */ void getSavePath$default(BoardFragment boardFragment, boolean z8, boolean z9, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if ((i & 2) != 0) {
            z9 = false;
        }
        if ((i & 4) != 0) {
            interfaceC6473e = null;
        }
        boardFragment.getSavePath(z8, z9, interfaceC6473e, interfaceC6473e2);
    }

    private final void initBackgroundClickListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgBackgroundColor = viewFragmentBoardBinding.includeBackground.rgBackgroundColor;
        AbstractC5830k.m5329f(rgBackgroundColor, "rgBackgroundColor");
        int i = 0;
        for (Object obj : ViewGroupKt.getChildren(rgBackgroundColor)) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj).setOnClickListener(new ViewOnClickListenerC5305c(this, i, 0));
            i = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBackgroundClickListener$lambda$45$lambda$44(BoardFragment boardFragment, int i, View view) {
        boardFragment.getMViewModel().updateBackgroundLevel(i);
    }

    private final void initBasicData() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding.sketchView.post(new Runnable() { // from class: com.zykj.view.board.board.i
            @Override // java.lang.Runnable
            public final void run() {
                BoardFragment.initBasicData$lambda$6(this.f8238a);
            }
        });
        getMViewModel().setTextEditView(new TextEditView() { // from class: com.zykj.view.board.board.BoardFragment.initBasicData.2
            @Override // com.zykj.blackboard.proxy.TextEditView
            public void showEditView(String initText, InterfaceC6471c afterTextChangedCallback, InterfaceC6471c doneCallback, InterfaceC6469a cancelCallback) {
                AbstractC5830k.m5330g(initText, "initText");
                AbstractC5830k.m5330g(afterTextChangedCallback, "afterTextChangedCallback");
                AbstractC5830k.m5330g(doneCallback, "doneCallback");
                AbstractC5830k.m5330g(cancelCallback, "cancelCallback");
                Context contextRequireContext = BoardFragment.this.requireContext();
                AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
                DialogKt.showTextEditDialog(contextRequireContext, initText, afterTextChangedCallback, cancelCallback, doneCallback);
            }
        });
        getMViewModel().setImageCropView(new C52833());
        getMViewModel().setCustomColorView(new CustomColorView() { // from class: com.zykj.view.board.board.BoardFragment.initBasicData.4
            @Override // com.zykj.blackboard.proxy.CustomColorView
            public void dispatchTouchEvent(MotionEvent event) {
                AbstractC5830k.m5330g(event, "event");
                ViewFragmentBoardBinding viewFragmentBoardBinding2 = BoardFragment.this.mBinding;
                if (viewFragmentBoardBinding2 != null) {
                    viewFragmentBoardBinding2.flBoardCustomColor.dispatchTouchEvent(event);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public void draw(Canvas canvas) {
                AbstractC5830k.m5330g(canvas, "canvas");
                ViewFragmentBoardBinding viewFragmentBoardBinding2 = BoardFragment.this.mBinding;
                if (viewFragmentBoardBinding2 != null) {
                    viewFragmentBoardBinding2.flBoardCustomColor.draw(canvas);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public InterfaceC6471c getChangeColor() {
                ViewFragmentBoardBinding viewFragmentBoardBinding2 = BoardFragment.this.mBinding;
                if (viewFragmentBoardBinding2 != null) {
                    return viewFragmentBoardBinding2.flBoardCustomColor.getOnColorChangeListener();
                }
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public float getHeight() {
                return BoardFragment.this.requireContext().getResources().getDimension(C5280R.dimen.view_138);
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public float getWidth() {
                return BoardFragment.this.requireContext().getResources().getDimension(C5280R.dimen.view_174);
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public void initColor(Integer color) {
                ViewFragmentBoardBinding viewFragmentBoardBinding2 = BoardFragment.this.mBinding;
                if (viewFragmentBoardBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentBoardBinding2.flBoardCustomColor.setSelectColor(color);
                ViewFragmentBoardBinding viewFragmentBoardBinding3 = BoardFragment.this.mBinding;
                if (viewFragmentBoardBinding3 != null) {
                    viewFragmentBoardBinding3.flBoardCustomColor.refresh();
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public boolean isColorExist(int color) {
                return CustomColorManager.INSTANCE.isColorExist(color);
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public void onColorUsed(Integer color) {
                if (color != null) {
                    LatestColorManager.INSTANCE.putNewColor(color.intValue());
                }
            }

            @Override // com.zykj.blackboard.proxy.CustomColorView
            public void setChangeColor(InterfaceC6471c interfaceC6471c) {
                ViewFragmentBoardBinding viewFragmentBoardBinding2 = BoardFragment.this.mBinding;
                if (viewFragmentBoardBinding2 != null) {
                    viewFragmentBoardBinding2.flBoardCustomColor.setOnColorChangeListener(interfaceC6471c);
                } else {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBasicData$lambda$6(BoardFragment boardFragment) {
        BoardViewModel mViewModel = boardFragment.getMViewModel();
        ViewFragmentBoardBinding viewFragmentBoardBinding = boardFragment.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        float width = viewFragmentBoardBinding.sketchView.getWidth();
        if (boardFragment.mBinding != null) {
            mViewModel.initZoomPointF(width, r4.sketchView.getHeight());
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    private final void initClickListener() {
        initMainClickListener();
        initSelectListener();
        initPenClickListener();
        initEraserClickListener();
        initGraphClickListener();
        initBackgroundClickListener();
        initExtraClickListener();
        initProgressBarTouchListener();
        initDismissCustomColorPaletteOnSketchTouch();
    }

    private final void initDismissCustomColorPaletteOnSketchTouch() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding != null) {
            viewFragmentBoardBinding.flSketchBoardTouch.setOnBeforeTouchDispatchToChildren(new C5308f(this, 2));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initDismissCustomColorPaletteOnSketchTouch$lambda$63(BoardFragment boardFragment) {
        boardFragment.getMViewModel().dismissPanelsForCanvasTouch();
        return C5443s.f8405a;
    }

    private final void initEraserClickListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgEraserSize = viewFragmentBoardBinding.includeEraser.rgEraserSize;
        AbstractC5830k.m5329f(rgEraserSize, "rgEraserSize");
        int i = 0;
        for (Object obj : ViewGroupKt.getChildren(rgEraserSize)) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj).setOnClickListener(new ViewOnClickListenerC5305c(this, i, 2));
            i = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEraserClickListener$lambda$33$lambda$32(BoardFragment boardFragment, int i, View view) {
        boardFragment.getMViewModel().updateEraserSizeLevel(i);
    }

    private final void initExtraClickListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding.ivBack.setOnClickListener(new ViewOnClickListenerC5304b(this, 7));
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.mBinding;
        if (viewFragmentBoardBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding2.ivExpansion.setOnClickListener(new ViewOnClickListenerC5304b(this, 8));
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding3.includeRecord;
        AppCompatImageView ivRecord = viewItemSketchRecordAudioBinding.ivRecord;
        AbstractC5830k.m5329f(ivRecord, "ivRecord");
        ExtKt.singleClick$default(ivRecord, 0L, new ViewOnClickListenerC5304b(this, 9), 1, null);
        viewItemSketchRecordAudioBinding.ivAudio.setOnClickListener(new ViewOnClickListenerC5304b(this, 10));
        final int i = 0;
        viewItemSketchRecordAudioBinding.llCrop.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.board.d

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f8230b;

            {
                this.f8230b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$53(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    case 1:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$55(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    case 2:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$57(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    default:
                        BoardFragment.initExtraClickListener$lambda$62$lambda$61(this.f8230b, (ViewItemSketchRecordBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                }
            }
        });
        final int i8 = 1;
        viewItemSketchRecordAudioBinding.llPreview.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.board.d

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f8230b;

            {
                this.f8230b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$53(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    case 1:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$55(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    case 2:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$57(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    default:
                        BoardFragment.initExtraClickListener$lambda$62$lambda$61(this.f8230b, (ViewItemSketchRecordBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                }
            }
        });
        final int i9 = 2;
        viewItemSketchRecordAudioBinding.llUpload.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.board.d

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f8230b;

            {
                this.f8230b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$53(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    case 1:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$55(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    case 2:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$57(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                    default:
                        BoardFragment.initExtraClickListener$lambda$62$lambda$61(this.f8230b, (ViewItemSketchRecordBinding) viewItemSketchRecordAudioBinding, view);
                        break;
                }
            }
        });
        viewItemSketchRecordAudioBinding.llDeleteDraft.setOnClickListener(new ViewOnClickListenerC5304b(this, 11));
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final ViewItemSketchRecordBinding viewItemSketchRecordBinding = viewFragmentBoardBinding4.includeCommit;
        final int i10 = 3;
        viewItemSketchRecordBinding.tvCommit.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.board.d

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f8230b;

            {
                this.f8230b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$53(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordBinding, view);
                        break;
                    case 1:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$55(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordBinding, view);
                        break;
                    case 2:
                        BoardFragment.initExtraClickListener$lambda$59$lambda$57(this.f8230b, (ViewItemSketchRecordAudioBinding) viewItemSketchRecordBinding, view);
                        break;
                    default:
                        BoardFragment.initExtraClickListener$lambda$62$lambda$61(this.f8230b, (ViewItemSketchRecordBinding) viewItemSketchRecordBinding, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$47(BoardFragment boardFragment, View view) {
        InterfaceC6471c onBackClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onBackClick = boardCallbackConfig.getOnBackClick()) == null) {
            return;
        }
        AbstractC5830k.m5327d(view);
        onBackClick.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$48(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().handleExpandClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$59$lambda$50(BoardFragment boardFragment, View view) {
        boardFragment.audioCallback = new C5308f(boardFragment, 3);
        boardFragment.audioPermissionRequest.launch("android.permission.RECORD_AUDIO");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initExtraClickListener$lambda$59$lambda$50$lambda$49(BoardFragment boardFragment) {
        boardFragment.getMViewModel().switchRecordState();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$59$lambda$51(BoardFragment boardFragment, View view) {
        BoardViewModel.updateMicroPhone$default(boardFragment.getMViewModel(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$59$lambda$53(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC6471c onCropClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onCropClick = boardCallbackConfig.getOnCropClick()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.llCrop.setEnabled(false);
        BoardViewModel.getSavePath$default(boardFragment.getMViewModel(), false, false, new BoardFragment$initExtraClickListener$3$3$1$1(onCropClick, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$3$1$2(onCropClick, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$59$lambda$55(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC6471c onPreviewClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onPreviewClick = boardCallbackConfig.getOnPreviewClick()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.llPreview.setEnabled(false);
        BoardViewModel.getSavePath$default(boardFragment.getMViewModel(), false, false, new BoardFragment$initExtraClickListener$3$4$1$1(onPreviewClick, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$4$1$2(onPreviewClick, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$59$lambda$57(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC6473e onCommitClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onCommitClick = boardCallbackConfig.getOnCommitClick()) == null) {
            return;
        }
        AbstractC6014x.m5651v(LifecycleOwnerKt.getLifecycleScope(boardFragment), null, null, new BoardFragment$initExtraClickListener$3$5$1$1(viewItemSketchRecordAudioBinding, onCommitClick, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$59$lambda$58(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dropDraftCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$62$lambda$61(BoardFragment boardFragment, ViewItemSketchRecordBinding viewItemSketchRecordBinding, View view) {
        InterfaceC6473e onCommitClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onCommitClick = boardCallbackConfig.getOnCommitClick()) == null) {
            return;
        }
        AbstractC6014x.m5651v(LifecycleOwnerKt.getLifecycleScope(boardFragment), null, null, new BoardFragment$initExtraClickListener$4$1$1$1(viewItemSketchRecordBinding, onCommitClick, null), 3);
    }

    private final void initGraphClickListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.includeGraph;
        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.ivImageGallery;
        AbstractC5830k.m5329f(ivImageGallery, "ivImageGallery");
        ExtKt.singleClick$default(ivImageGallery, 0L, new ViewOnClickListenerC5304b(this, 12), 1, null);
        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.ivImageCamera;
        AbstractC5830k.m5329f(ivImageCamera, "ivImageCamera");
        ExtKt.singleClick$default(ivImageCamera, 0L, new ViewOnClickListenerC5304b(this, 14), 1, null);
        AppCompatImageView ivText = viewIncludeImageAddBinding.ivText;
        AbstractC5830k.m5329f(ivText, "ivText");
        ExtKt.singleClick$default(ivText, 0L, new ViewOnClickListenerC5304b(this, 15), 1, null);
        viewIncludeImageAddBinding.ivRectangle.setOnClickListener(new ViewOnClickListenerC5304b(this, 16));
        viewIncludeImageAddBinding.ivOval.setOnClickListener(new ViewOnClickListenerC5304b(this, 17));
        viewIncludeImageAddBinding.ivTriangle.setOnClickListener(new ViewOnClickListenerC5304b(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGraphClickListener$lambda$43$lambda$35(BoardFragment boardFragment, View view) {
        InterfaceC6471c onGalleryClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onGalleryClick = boardCallbackConfig.getOnGalleryClick()) == null) {
            boardFragment.startGallery();
        } else {
            onGalleryClick.invoke(new C5308f(boardFragment, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initGraphClickListener$lambda$43$lambda$35$lambda$34(BoardFragment boardFragment) {
        boardFragment.startGallery();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGraphClickListener$lambda$43$lambda$37(BoardFragment boardFragment, View view) {
        InterfaceC6471c onCameraClick;
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (onCameraClick = boardCallbackConfig.getOnCameraClick()) == null) {
            boardFragment.startCapture();
        } else {
            onCameraClick.invoke(new C5308f(boardFragment, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initGraphClickListener$lambda$43$lambda$37$lambda$36(BoardFragment boardFragment) {
        boardFragment.startCapture();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGraphClickListener$lambda$43$lambda$39(BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        DialogKt.showTextEditDialog$default(contextRequireContext, null, null, null, new C5303a(boardFragment, 2), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initGraphClickListener$lambda$43$lambda$39$lambda$38(BoardFragment boardFragment, String it) {
        AbstractC5830k.m5330g(it, "it");
        boardFragment.getMViewModel().addText(it);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGraphClickListener$lambda$43$lambda$40(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().updateGraphType(GraphType.Rectangle.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGraphClickListener$lambda$43$lambda$41(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().updateGraphType(GraphType.Oval.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGraphClickListener$lambda$43$lambda$42(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().updateGraphType(GraphType.Triangle.INSTANCE);
    }

    private final void initMainClickListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.includeMenu;
        viewIncludeMenuBinding.ivWithdraw.setOnClickListener(new ViewOnClickListenerC5304b(this, 24));
        viewIncludeMenuBinding.ivRecover.setOnClickListener(new ViewOnClickListenerC5304b(this, 26));
        viewIncludeMenuBinding.ivSelect.setOnClickListener(new ViewOnClickListenerC5304b(this, 27));
        viewIncludeMenuBinding.ivTouch.setOnClickListener(new ViewOnClickListenerC5304b(this, 0));
        viewIncludeMenuBinding.ivEnlarge.setOnClickListener(new ViewOnClickListenerC5304b(this, 1));
        viewIncludeMenuBinding.ivReduce.setOnClickListener(new ViewOnClickListenerC5304b(this, 2));
        viewIncludeMenuBinding.ivPen.setOnClickListener(new ViewOnClickListenerC5304b(this, 3));
        viewIncludeMenuBinding.ivEraser.setOnClickListener(new ViewOnClickListenerC5304b(this, 4));
        viewIncludeMenuBinding.ivImageAdd.setOnClickListener(new ViewOnClickListenerC5304b(this, 5));
        viewIncludeMenuBinding.ivBackgroundColor.setOnClickListener(new ViewOnClickListenerC5304b(this, 6));
        viewIncludeMenuBinding.ivDelete.setOnClickListener(new ViewOnClickListenerC5304b(this, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$10(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        BoardViewModel.updateTouchable$default(boardFragment.getMViewModel(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$11(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().updateZoomLevel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$12(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().updateZoomLevel(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$13(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().updateModeType(MainToolType.Pen.INSTANCE);
        boardFragment.getMViewModel().switchPenTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$14(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().updateModeType(MainToolType.Eraser.INSTANCE);
        boardFragment.getMViewModel().switchEraserTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$15(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().switchGraphTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$16(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().switchBackgroundTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$18(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        Context contextRequireContext = boardFragment.requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        DialogKt.showAskForCleanDialog(contextRequireContext, new C5308f(boardFragment, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initMainClickListener$lambda$19$lambda$18$lambda$17(BoardFragment boardFragment) {
        boardFragment.getMViewModel().cleanPage();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$7(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().startRevoke(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$8(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().startRevoke(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$19$lambda$9(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForToolbarClick();
        boardFragment.getMViewModel().updateModeType(MainToolType.Select.INSTANCE);
        boardFragment.getMViewModel().switchSelectTool();
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC6014x.m5651v(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C52851(null), 3);
    }

    private final void initPenClickListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenType = viewFragmentBoardBinding.includePen.rgPenType;
        AbstractC5830k.m5329f(rgPenType, "rgPenType");
        Iterator it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new ViewOnClickListenerC5304b(this, 13));
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.mBinding;
        if (viewFragmentBoardBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenSize = viewFragmentBoardBinding2.includePen.rgPenSize;
        AbstractC5830k.m5329f(rgPenSize, "rgPenSize");
        int i = 0;
        int i8 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgPenSize)) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj).setOnClickListener(new ViewOnClickListenerC5305c(this, i8, 1));
            i8 = i9;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenColor = viewFragmentBoardBinding3.includePen.rgPenColor;
        AbstractC5830k.m5329f(rgPenColor, "rgPenColor");
        for (Object obj2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i10 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj2).setOnClickListener(new ViewOnClickListenerC5305c(this, i, 3));
            i = i10;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding4.flCustomColor.setOnColorChangeListener(new C5303a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPenClickListener$lambda$26$lambda$25(BoardFragment boardFragment, View view) {
        int id = view.getId();
        if (id == C5280R.id.rb_pen_custom) {
            boardFragment.getMViewModel().updatePenType(PenType.Custom.INSTANCE);
            return;
        }
        if (id == C5280R.id.rb_pen_line) {
            boardFragment.getMViewModel().updatePenType(PenType.Line.INSTANCE);
            return;
        }
        if (id == C5280R.id.rb_pen_dotted_line) {
            boardFragment.getMViewModel().updatePenType(PenType.DottedLine.INSTANCE);
        } else if (id == C5280R.id.rb_pen_cursor) {
            boardFragment.getMViewModel().updatePenType(PenType.Cursor.INSTANCE);
        } else if (id == C5280R.id.rb_pen_highlighter) {
            boardFragment.getMViewModel().updatePenType(PenType.Highlighter.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPenClickListener$lambda$28$lambda$27(BoardFragment boardFragment, int i, View view) {
        boardFragment.getMViewModel().updatePenSizeLevel(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPenClickListener$lambda$30$lambda$29(BoardFragment boardFragment, int i, View view) {
        boardFragment.getMViewModel().updatePenColorLevel(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initPenClickListener$lambda$31(BoardFragment boardFragment, int i) {
        boardFragment.getMViewModel().updatePenCustomColor(i);
        return C5443s.f8405a;
    }

    private final void initProgressBarTouchListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        SketchProgressView sketchProgressVertical = viewFragmentBoardBinding.sketchProgressVertical;
        AbstractC5830k.m5329f(sketchProgressVertical, "sketchProgressVertical");
        ExtKt.setProgressListener(sketchProgressVertical, new C5308f(this, 5), new C5303a(this, 4), new C5303a(this, 5));
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.mBinding;
        if (viewFragmentBoardBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        SketchProgressView sketchProgressHorizontal = viewFragmentBoardBinding2.sketchProgressHorizontal;
        AbstractC5830k.m5329f(sketchProgressHorizontal, "sketchProgressHorizontal");
        ExtKt.setProgressListener(sketchProgressHorizontal, new C5308f(this, 6), new C5303a(this, 6), new C5303a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initProgressBarTouchListener$lambda$64(BoardFragment boardFragment) {
        boardFragment.getMViewModel().areaMoveStart();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initProgressBarTouchListener$lambda$65(BoardFragment boardFragment, float f) {
        BoardViewModel.areaMoving$default(boardFragment.getMViewModel(), null, Float.valueOf(f), 1, null);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initProgressBarTouchListener$lambda$66(BoardFragment boardFragment, float f) {
        BoardViewModel.areaMoveEnd$default(boardFragment.getMViewModel(), null, Float.valueOf(f), 1, null);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initProgressBarTouchListener$lambda$67(BoardFragment boardFragment) {
        boardFragment.getMViewModel().areaMoveStart();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initProgressBarTouchListener$lambda$68(BoardFragment boardFragment, float f) {
        BoardViewModel.areaMoving$default(boardFragment.getMViewModel(), Float.valueOf(f), null, 2, null);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initProgressBarTouchListener$lambda$69(BoardFragment boardFragment, float f) {
        BoardViewModel.areaMoveEnd$default(boardFragment.getMViewModel(), Float.valueOf(f), null, 2, null);
        return C5443s.f8405a;
    }

    private final void initSelectListener() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding.includeSelect.ivSelectPen.setOnClickListener(new ViewOnClickListenerC5304b(this, 19));
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.mBinding;
        if (viewFragmentBoardBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding2.includeSelect.ivSelectHighlighter.setOnClickListener(new ViewOnClickListenerC5304b(this, 20));
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding3.includeSelect.ivSelectImage.setOnClickListener(new ViewOnClickListenerC5304b(this, 21));
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding4.includeSelect.ivSelectText.setOnClickListener(new ViewOnClickListenerC5304b(this, 22));
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 != null) {
            viewFragmentBoardBinding5.includeSelect.ivSelectGeometry.setOnClickListener(new ViewOnClickListenerC5304b(this, 23));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectListener$lambda$20(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForSelectToolbarItemClick();
        boardFragment.getMViewModel().updateSelectTypeByEnum(SelectGraphEnum.STROKE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectListener$lambda$21(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForSelectToolbarItemClick();
        boardFragment.getMViewModel().updateSelectTypeByEnum(SelectGraphEnum.STROKE_HIGHLIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectListener$lambda$22(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForSelectToolbarItemClick();
        boardFragment.getMViewModel().updateSelectTypeByEnum(SelectGraphEnum.IMAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectListener$lambda$23(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForSelectToolbarItemClick();
        boardFragment.getMViewModel().updateSelectTypeByEnum(SelectGraphEnum.TEXT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectListener$lambda$24(BoardFragment boardFragment, View view) {
        boardFragment.getMViewModel().dismissPanelsForSelectToolbarItemClick();
        boardFragment.getMViewModel().updateSelectTypeByEnum(SelectGraphEnum.GEOMETRY);
    }

    private final void initView() throws FileNotFoundException {
        initBasicData();
        initClickListener();
        initObserver();
        loadSketchData();
    }

    private final void loadSketchData() throws FileNotFoundException {
        File externalCacheDir;
        String absolutePath;
        BoardCallbackConfig boardCallbackConfig = getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig == null || boardCallbackConfig.getNeedLoading()) {
            showProgress();
        }
        String path = getPath();
        if (path.length() == 0) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                throw new FileNotFoundException("unknown board path");
            }
            path = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        AbstractC3387g.m2338a(AbstractC0037f.m85j("页面BoardFragment，开始加载画板数据，画板路径", path));
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBoardBinding.sketchView;
        AbstractC5830k.m5327d(path);
        sketchRecorderView.ready(path, new InterfaceC6474f() { // from class: com.zykj.view.board.board.h
            @Override // p152r6.InterfaceC6474f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                long jLongValue = ((Long) obj3).longValue();
                return BoardFragment.loadSketchData$lambda$4(this.f8237a, (IBoardControl) obj, zBooleanValue, jLongValue);
            }
        }, new C5303a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s loadSketchData$lambda$4(BoardFragment boardFragment, IBoardControl iBoardControl, boolean z8, long j7) {
        AbstractC5830k.m5330g(iBoardControl, "iBoardControl");
        AbstractC3387g.m2338a("页面BoardFragment，画板数据加载成功，是否缓存" + z8 + "，加载耗时为" + j7);
        boardFragment.getMViewModel().initBoardControl(iBoardControl, z8, j7);
        boardFragment.hideProgress();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s loadSketchData$lambda$5(BoardFragment boardFragment, Throwable it) {
        InterfaceC6469a onLoadFailed;
        AbstractC5830k.m5330g(it, "it");
        AbstractC3387g.m2338a(AbstractC0037f.m85j("页面BoardFragment，画板数据加载失败，message: ", it.getMessage()));
        boardFragment.hideProgress();
        BoardCallbackConfig boardCallbackConfig = boardFragment.getMViewModel().getBoardCallbackConfig();
        if (boardCallbackConfig != null && (onLoadFailed = boardCallbackConfig.getOnLoadFailed()) != null) {
            onLoadFailed.invoke();
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BoardViewModel mViewModel_delegate$lambda$0() {
        return new BoardViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBoardSketchConfig(BoardSketchConfig boardSketchConfig) {
        getMViewModel().initSketchConfig(boardSketchConfig);
    }

    private final void startCapture() {
        if (getMViewModel().isImageOutOfCount()) {
            C3404x.m2356a("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            ImagePicker.startSystemCamera$default(this.mImagePicker, null, true, new C5303a(this, 0), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startCapture$lambda$75(BoardFragment boardFragment, Uri uri) {
        C5443s c5443s = C5443s.f8405a;
        if (uri == null) {
            return c5443s;
        }
        File fileM2318s = AbstractC3382c.m2318s(uri);
        addBitmap$default(boardFragment, null, fileM2318s.getAbsolutePath(), null, true, new C5307e(fileM2318s, 1), 5, null);
        return c5443s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startCapture$lambda$75$lambda$74(File file, String str) {
        AbstractC3385e.m2333e(file);
        return C5443s.f8405a;
    }

    private final void startGallery() {
        if (getMViewModel().isImageOutOfCount()) {
            C3404x.m2356a("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            this.mImagePicker.startGallery(true, new C5303a(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startGallery$lambda$73(BoardFragment boardFragment, Uri uri) {
        C5443s c5443s = C5443s.f8405a;
        if (uri == null) {
            return c5443s;
        }
        File fileM2318s = AbstractC3382c.m2318s(uri);
        addBitmap$default(boardFragment, null, fileM2318s.getAbsolutePath(), null, true, new C5307e(fileM2318s, 0), 5, null);
        return c5443s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startGallery$lambda$73$lambda$72(File file, String str) {
        AbstractC3385e.m2333e(file);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startToolAnimate(final boolean isOpen) {
        float f;
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBoardBinding.ivExpansion.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.zykj.view.board.board.BoardFragment$startToolAnimate$lambda$71$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.this$0.mBinding;
                if (viewFragmentBoardBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentBoardBinding2.ivExpansion.setEnabled(true);
                this.this$0.getMViewModel().updateExpandState(isOpen);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        float f7 = 0.0f;
        if (isOpen) {
            if (this.mBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            f = -r5.includeMenu.getRoot().getWidth();
        } else {
            f = 0.0f;
        }
        if (!isOpen) {
            if (this.mBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            f7 = -r12.includeMenu.getRoot().getWidth();
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = this.mBinding;
        if (viewFragmentBoardBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentBoardBinding2.includeMenu.getRoot(), "translationX", f, f7));
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding3.toolPanel, "translationX", f, f7));
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding4.ivExpansion, "translationX", f, f7));
        animatorSet.start();
    }

    public final void addBitmap(@Nullable Bitmap bitmap, @Nullable String path, @NotNull String filename, boolean isSelected, @Nullable InterfaceC6471c imagePathCallback) {
        AbstractC5830k.m5330g(filename, "filename");
        BoardViewModel.addImageGraph$default(getMViewModel(), bitmap, path, null, isSelected, filename, imagePathCallback, 4, null);
    }

    public final void addBitmapList(@NotNull List<String> pathList, boolean isSelected) {
        AbstractC5830k.m5330g(pathList, "pathList");
        getMViewModel().addBitmapList(pathList, isSelected);
    }

    public final void addBitmapMaxHeight(@Nullable Bitmap bitmap, @Nullable String path, boolean isSelected) {
        BoardViewModel.addImageGraph$default(getMViewModel(), bitmap, path, EzyScaleTypeEnum$ScaleTypeEnum.MODE_MATRIX_HEIGHT, isSelected, null, null, 48, null);
    }

    public final void addFullBitmap(@Nullable Bitmap bitmap, @Nullable String path, boolean isSelected) {
        BoardViewModel.addImageGraph$default(getMViewModel(), bitmap, path, EzyScaleTypeEnum$ScaleTypeEnum.MODE_MIN_VALUE, isSelected, null, null, 48, null);
    }

    public final void cleanBoardCache() {
        BoardBox.INSTANCE.clearLocalData(getPath(), getContext());
    }

    @NotNull
    public final List<String> getPathListByImageGraph() {
        return getMViewModel().getPathListByImageGraph();
    }

    @NotNull
    public final List<String> getRecordingImagePathList() {
        return getMViewModel().getRecordingImagePathList();
    }

    public final void getSavePath(boolean needClear, boolean isContentThumbnail, @Nullable InterfaceC6473e error, @NotNull InterfaceC6473e callback) {
        AbstractC5830k.m5330g(callback, "callback");
        getMViewModel().getSavePath(needClear, isContentThumbnail, new C52811(error, callback, null), callback);
    }

    @NotNull
    public final SimpleUIState getUiState() {
        return new SimpleUIState(((MainToolState) getMViewModel().getMainToolState().getValue()).getMainToolType(), ((ExtraUIState) getMViewModel().getExtraUIState().getValue()).getMinorToolType(), ((ExpandState) getMViewModel().getExpandState().getValue()).getExpandStatus());
    }

    public final void hideProgress() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding != null) {
            viewFragmentBoardBinding.loadingLayout.setVisibility(8);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    public final boolean isImageOutOfCount() {
        return getMViewModel().isImageOutOfCount();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(inflater, "inflater");
        ViewFragmentBoardBinding viewFragmentBoardBindingInflate = ViewFragmentBoardBinding.inflate(inflater);
        AbstractC5830k.m5327d(viewFragmentBoardBindingInflate);
        this.mBinding = viewFragmentBoardBindingInflate;
        View root = viewFragmentBoardBindingInflate.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hideProgress();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws FileNotFoundException {
        AbstractC5830k.m5330g(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    public final void resetRevoke() {
        getMViewModel().resetRevoke();
    }

    public final void setBoardCallbackConfig(@NotNull BoardCallbackConfig boardCallbackConfig) {
        AbstractC5830k.m5330g(boardCallbackConfig, "boardCallbackConfig");
        getMViewModel().initCallbackConfig(boardCallbackConfig);
    }

    public final void setBoardViewConfig(@NotNull BoardViewConfig boardViewConfig) {
        AbstractC5830k.m5330g(boardViewConfig, "boardViewConfig");
        getMViewModel().updateUIByViewConfig(boardViewConfig);
    }

    public final void setUiState(@NotNull SimpleUIState value) {
        AbstractC5830k.m5330g(value, "value");
        getMViewModel().updateModeType(value.getMainToolType());
        getMViewModel().updateMinorToolType(value.getMinorToolType());
        getMViewModel().updateExpandState(AbstractC5830k.m5325b(value.getExpandStatus(), ExpandStatus.Expanded.INSTANCE));
    }

    public final void showProgress() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding != null) {
            viewFragmentBoardBinding.loadingLayout.setVisibility(0);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }
}
