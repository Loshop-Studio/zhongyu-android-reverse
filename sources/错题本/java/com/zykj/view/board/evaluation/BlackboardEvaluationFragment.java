package com.zykj.view.board.evaluation;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置、文件流、位图。

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.C2766k;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.C2856d;
import androidx.navigation.serialization.C2872b;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import com.blankj.utilcode.util.C3404x;
import com.canhub.cropper.DialogInterfaceOnClickListenerC3445p;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.WithdrawListener;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.board.EzyModeEnum$ModeEnum;
import com.zykj.board.EzyPositionEnum$PositionEnum;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import com.zykj.view.C5280R;
import com.zykj.view.board.board.DialogInterfaceOnClickListenerC5319q;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardEvaluationBinding;
import com.zykj.view.dialog.TextEditDialog;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.utils.ImagePicker;
import com.zykj.view.utils.SPDataKt;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5781c0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0095\u00012\u00020\u0001:\u0002\u0095\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J9\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00062\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0006\u0018\u00010$¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0006¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0003¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010\u0003J!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020,H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010C\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010\u0003J\u0017\u0010D\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bD\u0010#J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010\u0003J\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0019H\u0002¢\u0006\u0004\bI\u00107J\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010\u0003J\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010\u0003J\u001f\u0010O\u001a\u00020\u00062\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020LH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0014H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\b]\u0010WJ\u000f\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J'\u0010c\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0019H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0014H\u0002¢\u0006\u0004\bk\u0010fJ\u0017\u0010l\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010WJ\u0017\u0010m\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010q\u001a\u00020\u00062\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u00062\u0006\u0010s\u001a\u00020%H\u0002¢\u0006\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u0082\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R%\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0088\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0013\u0010\u0094\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u001f¨\u0006\u0096\u0001"}, m5110d2 = {"Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ld6/s;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "", "isBoardAsWidth", "Landroid/graphics/Bitmap;", "getScreenshot", "(IIIIZ)Landroid/graphics/Bitmap;", "isPageNotEmpty", "()Z", "Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;", "config", "setConfig", "(Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;)V", "Lkotlin/Function1;", "", "pageSlideListener", "setOnPageSlideListener", "(Lr6/c;)V", "bitmap", "addImage", "(Landroid/graphics/Bitmap;)V", "", "tips", "isCancelable", "showProgress", "(Ljava/lang/String;Z)V", "hideProgress", "initData", "initView", "initTranslationConfig", "canDoEdit", "switchTouchMode", "(Z)V", "initClickListener", "initBlackboard", "initBoardConfig", "Landroid/content/Context;", "context", "sourcePath", "Ljava/io/File;", "createOpaqueCropTempFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "initPageControl", "capture", "askForErase", "executeConfig", "setCurrentActionUI", "(Landroid/view/View;)V", "hideEvaluationPenColorPanel", "toggleColorPanel", "activatePenTool", "initEvaluationPenColorStrips", "alignEvaluationPenColorPanelToPen", "Landroid/widget/RadioGroup;", "source", "syncTarget", "attachPenColorListeners", "(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V", "penColorToolbarGroup", "()Landroid/widget/RadioGroup;", "penColorSlotCount", "()I", "slotIndex", "penColorIntAtToolbarSlot", "(I)I", "Landroid/content/SharedPreferences;", "prefs", "resolveSavedPenColorSlot", "(Landroid/content/SharedPreferences;)I", TypedValues.Custom.S_COLOR, "indexOfToolbarSlotMatchingColor", "Lcom/zykj/blackboard/proxy/CustomColorView;", "buildEvaluationSelectCustomColorView", "()Lcom/zykj/blackboard/proxy/CustomColorView;", "persist", "notifySdkSelectCallback", "applyEvaluationPenColorAtSlot", "(IZZ)V", "syncEvaluationPenColorFromEditedGraph", "(I)V", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "setSelectEditColorChangeListenerCompat", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "syncEvaluationPenRadiosAtSlot", "normalizeEvaluationPenColor", "isEvaluationAllowedPenColor", "(I)Z", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "handleDrag", "(Landroid/view/MotionEvent;)V", "y", "calculateTranslationY", "(F)V", "Lcom/zykj/view/utils/ImagePicker;", "imagePicker", "Lcom/zykj/view/utils/ImagePicker;", "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "boardControl", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "Lcom/zykj/blackboard/core/edit/IPageControl;", "pageControl", "Lcom/zykj/blackboard/core/edit/IPageControl;", "Lcom/zykj/blackboard/bean/BoardConfig;", "path", "Ljava/lang/String;", "fragmentConfig", "Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;", "evaluationSelectColorChangeCallback", "Lr6/c;", "suppressPenColorSync", "Z", "Landroid/graphics/Rect;", "dragRect", "Landroid/graphics/Rect;", "defaultTranslateTop", "F", "defaultTranslateBottom", "Landroid/app/ProgressDialog;", "mProgressDialog", "Landroid/app/ProgressDialog;", "isImageOutOfCount", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1042:1\n311#2:1043\n327#2,4:1044\n312#2:1048\n311#2:1049\n327#2,4:1050\n312#2:1054\n257#2,2:1061\n257#2,2:1063\n278#2,2:1065\n257#2,2:1067\n257#2,2:1069\n257#2,2:1071\n257#2,2:1073\n257#2,2:1075\n257#2,2:1077\n257#2,2:1079\n255#2:1081\n257#2,2:1082\n83#3,6:1055\n1310#4,2:1084\n1#5:1086\n346#6,8:1087\n*S KotlinDebug\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n*L\n130#1:1043\n130#1:1044,4\n130#1:1048\n144#1:1049\n144#1:1050,4\n144#1:1054\n672#1:1061,2\n674#1:1063,2\n676#1:1065,2\n678#1:1067,2\n680#1:1069,2\n682#1:1071,2\n684#1:1073,2\n686#1:1075,2\n688#1:1077,2\n723#1:1079,2\n738#1:1081\n743#1:1082,2\n512#1:1055,6\n931#1:1084,2\n798#1:1087,8\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackboardEvaluationFragment extends Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Integer> EVALUATION_SELECT_EDIT_COLOR_LIST = AbstractC5806u.m5287z(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#007DFE")), Integer.valueOf(Color.parseColor("#FE3720")));

    @NotNull
    private static final String KEY_PEN_COLOR_ARGB_LEGACY = "pen_color_argb";

    @NotNull
    private static final String KEY_PEN_COLOR_SLOT = "pen_color_slot_index";

    @NotNull
    private static final String KEY_TEXT_COLOR_ARGB = "text_color_argb";

    @NotNull
    private static final String PREF_EVALUATION_PEN = "blackboard_evaluation_pen";

    @Nullable
    private BoardConfig boardConfig;

    @Nullable
    private IBoardControl boardControl;
    private float defaultTranslateBottom;
    private float defaultTranslateTop;

    @Nullable
    private InterfaceC6471c evaluationSelectColorChangeCallback;

    @Nullable
    private BlackboardEvaluationConfig fragmentConfig;
    private ViewFragmentBlackboardEvaluationBinding mBinding;

    @Nullable
    private ProgressDialog mProgressDialog;

    @Nullable
    private IPageControl pageControl;

    @Nullable
    private InterfaceC6471c pageSlideListener;

    @Nullable
    private String path;
    private boolean suppressPenColorSync;

    @NotNull
    private final ImagePicker imagePicker = new ImagePicker(this, null, 2, 0 == true ? 1 : 0);

    @NotNull
    private Rect dragRect = new Rect();

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$Companion;", "", "<init>", "()V", "PREF_EVALUATION_PEN", "", "KEY_PEN_COLOR_SLOT", "KEY_PEN_COLOR_ARGB_LEGACY", "KEY_TEXT_COLOR_ARGB", "EVALUATION_SELECT_EDIT_COLOR_LIST", "", "", "newInstance", "Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;", "path", "config", "Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final BlackboardEvaluationFragment newInstance(@NotNull String path, @NotNull BlackboardEvaluationConfig config) {
            AbstractC5830k.m5330g(path, "path");
            AbstractC5830k.m5330g(config, "config");
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            BlackboardEvaluationFragment blackboardEvaluationFragment = new BlackboardEvaluationFragment();
            blackboardEvaluationFragment.fragmentConfig = config;
            blackboardEvaluationFragment.setArguments(bundle);
            return blackboardEvaluationFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR@\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, m5110d2 = {"com/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1", "Lcom/zykj/blackboard/proxy/CustomColorView;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", TypedValues.Custom.S_COLOR, "initColor", "(Ljava/lang/Integer;)V", "", "isColorExist", "(I)Z", "onColorUsed", "Lkotlin/Function1;", "value", "getChangeColor", "()Lr6/c;", "setChangeColor", "(Lr6/c;)V", "changeColor", "", "getWidth", "()F", "width", "getHeight", "height", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1 */
    public static final class C53291 implements CustomColorView {
        public C53291() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s _set_changeColor_$lambda$1$lambda$0(InterfaceC6471c interfaceC6471c, BlackboardEvaluationFragment blackboardEvaluationFragment, int i) {
            interfaceC6471c.invoke(Integer.valueOf(i));
            blackboardEvaluationFragment.syncEvaluationPenColorFromEditedGraph(i);
            return C5443s.f8405a;
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public void dispatchTouchEvent(MotionEvent event) {
            AbstractC5830k.m5330g(event, "event");
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = BlackboardEvaluationFragment.this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding != null) {
                viewFragmentBlackboardEvaluationBinding.flEvaluationPenColorProxy.dispatchTouchEvent(event);
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public void draw(Canvas canvas) {
            AbstractC5830k.m5330g(canvas, "canvas");
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = BlackboardEvaluationFragment.this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding != null) {
                viewFragmentBlackboardEvaluationBinding.flEvaluationPenColorProxy.draw(canvas);
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public InterfaceC6471c getChangeColor() {
            return BlackboardEvaluationFragment.this.evaluationSelectColorChangeCallback;
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public float getHeight() {
            return BlackboardEvaluationFragment.this.getResources().getDimension(C5280R.dimen.evaluation_pen_color_strip_height);
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public float getWidth() {
            return BlackboardEvaluationFragment.this.getResources().getDimension(C5280R.dimen.evaluation_pen_color_strip_width);
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public void initColor(Integer color) {
            if (color == null) {
                return;
            }
            BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
            int iIndexOfToolbarSlotMatchingColor = blackboardEvaluationFragment.indexOfToolbarSlotMatchingColor(blackboardEvaluationFragment.normalizeEvaluationPenColor(color.intValue()));
            BlackboardEvaluationFragment.this.applyEvaluationPenColorAtSlot(iIndexOfToolbarSlotMatchingColor, true, true);
            BlackboardEvaluationFragment.this.syncEvaluationPenRadiosAtSlot(iIndexOfToolbarSlotMatchingColor);
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public boolean isColorExist(int color) {
            return BlackboardEvaluationFragment.this.isEvaluationAllowedPenColor(color);
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public void onColorUsed(Integer color) {
        }

        @Override // com.zykj.blackboard.proxy.CustomColorView
        public void setChangeColor(InterfaceC6471c interfaceC6471c) {
            BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
            blackboardEvaluationFragment.evaluationSelectColorChangeCallback = interfaceC6471c != null ? new C2856d(15, interfaceC6471c, blackboardEvaluationFragment) : null;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"com/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2", "Lcom/zykj/blackboard/listener/WithdrawListener;", "", "canWithdraw", "canRecover", "Ld6/s;", "onWithdraw", "(ZZ)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$initPageControl$2 */
    public static final class C53312 implements WithdrawListener {
        public C53312() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWithdraw$lambda$0(BlackboardEvaluationFragment blackboardEvaluationFragment, boolean z8, boolean z9) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardEvaluationBinding.ivWithdraw.setEnabled(z8);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding2 != null) {
                viewFragmentBlackboardEvaluationBinding2.ivRecover.setEnabled(z9);
            } else {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
        }

        @Override // com.zykj.blackboard.listener.WithdrawListener
        public void onWithdraw(final boolean canWithdraw, final boolean canRecover) {
            FragmentActivity activity = BlackboardEvaluationFragment.this.getActivity();
            if (activity != null) {
                final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: com.zykj.view.board.evaluation.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.C53312.onWithdraw$lambda$0(blackboardEvaluationFragment, canWithdraw, canRecover);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void activatePenTool(boolean toggleColorPanel) throws Resources.NotFoundException {
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_WRITING);
            BoardConfig.setDottedLine$default(boardConfig, false, 0.0f, 0.0f, 6, null);
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivPen = viewFragmentBlackboardEvaluationBinding.ivPen;
        AbstractC5830k.m5329f(ivPen, "ivPen");
        setCurrentActionUI(ivPen);
        if (toggleColorPanel) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            View root = viewFragmentBlackboardEvaluationBinding2.includePenColorToolbar.getRoot();
            AbstractC5830k.m5329f(root, "getRoot(...)");
            boolean z8 = root.getVisibility() == 0;
            if (!z8) {
                root.setTranslationX(0.0f);
                root.setTranslationY(0.0f);
            }
            root.setVisibility(z8 ? 8 : 0);
            if (z8) {
                return;
            }
            alignEvaluationPenColorPanelToPen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addImage$lambda$41$lambda$40(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        MoveActionConfig moveActionConfig;
        float f = imageGraph.getRenderRectF().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.sketchView.getHeight();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        float maxHeightTimes = f / ((((boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null) ? 2 : moveActionConfig.getMaxHeightTimes()) - 1) * height);
        IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
        if (iPageControl != null) {
            iPageControl.areaMoveStart();
        }
        IPageControl iPageControl2 = blackboardEvaluationFragment.pageControl;
        if (iPageControl2 != null) {
            IPageControl.DefaultImpls.areaMoveEnd$default(iPageControl2, null, Float.valueOf(maxHeightTimes), 1, null);
        }
        InterfaceC6471c interfaceC6471c = blackboardEvaluationFragment.pageSlideListener;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Float.valueOf(maxHeightTimes));
        }
    }

    private final void alignEvaluationPenColorPanelToPen() throws Resources.NotFoundException {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final View root = viewFragmentBlackboardEvaluationBinding.includePenColorToolbar.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final LinearLayout llEvaluationTools = viewFragmentBlackboardEvaluationBinding2.llEvaluationTools;
        AbstractC5830k.m5329f(llEvaluationTools, "llEvaluationTools");
        final int dimensionPixelSize = getResources().getDimensionPixelSize(C5280R.dimen.view_3);
        root.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.zykj.view.board.evaluation.BlackboardEvaluationFragment.alignEvaluationPenColorPanelToPen.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (root.getWidth() != 0 && root.getHeight() != 0) {
                    BlackboardEvaluationFragment.alignEvaluationPenColorPanelToPen$applyAlignment(root, dimensionPixelSize, this, llEvaluationTools);
                    root.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alignEvaluationPenColorPanelToPen$applyAlignment(View view, int i, BlackboardEvaluationFragment blackboardEvaluationFragment, LinearLayout linearLayout) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding.ivPen.getGlobalVisibleRect(rect);
        linearLayout.getGlobalVisibleRect(new Rect());
        view.getGlobalVisibleRect(new Rect());
        view.setTranslationX(rect.left - r5.left);
        view.setTranslationY((r4.bottom + i) - r5.top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyEvaluationPenColorAtSlot(int slotIndex, boolean persist, boolean notifySdkSelectCallback) {
        InterfaceC6471c interfaceC6471c;
        int iPenColorIntAtToolbarSlot = penColorIntAtToolbarSlot(slotIndex);
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            boardConfig.setPaintColor(iPenColorIntAtToolbarSlot);
            boardConfig.setBeelinePaintColor(iPenColorIntAtToolbarSlot);
        }
        if (persist) {
            int iPenColorSlotCount = penColorSlotCount();
            requireContext().getSharedPreferences(PREF_EVALUATION_PEN, 0).edit().putInt(KEY_PEN_COLOR_SLOT, iPenColorSlotCount > 0 ? AbstractC5806u.m5274m(slotIndex, 0, iPenColorSlotCount - 1) : 0).apply();
        }
        if (!notifySdkSelectCallback || (interfaceC6471c = this.evaluationSelectColorChangeCallback) == null) {
            return;
        }
        interfaceC6471c.invoke(Integer.valueOf(iPenColorIntAtToolbarSlot));
    }

    private final void askForErase() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i = 1;
            new AlertDialog.Builder(activity, C5280R.style.Theme_AppCompat_Light_Dialog_Alert).setMessage(C5280R.string.clear_canvas).setPositiveButton(getString(C5280R.string.sure), new DialogInterfaceOnClickListenerC3445p(this, i)).setNegativeButton(getString(C5280R.string.cancel), new DialogInterfaceOnClickListenerC5319q(i)).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void askForErase$lambda$44$lambda$42(BlackboardEvaluationFragment blackboardEvaluationFragment, DialogInterface dialogInterface, int i) {
        IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
        if (iPageControl != null) {
            IPageControl.DefaultImpls.cleanPage$default(iPageControl, null, 1, null);
        }
    }

    private final void attachPenColorListeners(RadioGroup source, final RadioGroup syncTarget) {
        source.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zykj.view.board.evaluation.f
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                BlackboardEvaluationFragment.attachPenColorListeners$lambda$55(this.f8277a, syncTarget, radioGroup, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPenColorListeners$lambda$55(BlackboardEvaluationFragment blackboardEvaluationFragment, RadioGroup radioGroup, RadioGroup radioGroup2, int i) {
        if (blackboardEvaluationFragment.suppressPenColorSync) {
            return;
        }
        int i8 = -1;
        if (i == -1) {
            return;
        }
        Iterator it = AbstractC5806u.m5260N(0, radioGroup2.getChildCount()).iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iNextInt = ((AbstractC5781c0) it).nextInt();
            if (i9 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            if (radioGroup2.getChildAt(iNextInt).getId() == i) {
                i8 = i9;
                break;
            }
            i9++;
        }
        if (i8 < 0 || i8 >= blackboardEvaluationFragment.penColorSlotCount()) {
            return;
        }
        blackboardEvaluationFragment.suppressPenColorSync = true;
        View childAt = radioGroup.getChildAt(i8);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton != null) {
            radioGroup.check(radioButton.getId());
        }
        blackboardEvaluationFragment.suppressPenColorSync = false;
        blackboardEvaluationFragment.applyEvaluationPenColorAtSlot(i8, true, true);
    }

    private final CustomColorView buildEvaluationSelectCustomColorView() {
        return new C53291();
    }

    private final void calculateTranslationY(float y2) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding.ivDrag.getGlobalVisibleRect(rect);
        float fCenterY = y2 - this.dragRect.centerY();
        float f = this.defaultTranslateTop;
        float f7 = this.defaultTranslateBottom;
        BlackboardEvaluationConfig blackboardEvaluationConfig = this.fragmentConfig;
        float bottomOffset = f7 - (blackboardEvaluationConfig != null ? blackboardEvaluationConfig.getBottomOffset() : 0.0f);
        if (fCenterY < f) {
            fCenterY = f;
        }
        if (fCenterY <= bottomOffset) {
            bottomOffset = fCenterY;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 != null) {
            viewFragmentBlackboardEvaluationBinding2.viewRoot.setTranslationY(bottomOffset);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    private final void capture() {
        Integer maxImageCount;
        IPageControl iPageControl = this.pageControl;
        int imageGraphCount = iPageControl != null ? iPageControl.getImageGraphCount() : 0;
        BlackboardEvaluationConfig blackboardEvaluationConfig = this.fragmentConfig;
        if (imageGraphCount >= ((blackboardEvaluationConfig == null || (maxImageCount = blackboardEvaluationConfig.getMaxImageCount()) == null) ? 3 : maxImageCount.intValue())) {
            C3404x.m2356a("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            ImagePicker.startSystemCamera$default(this.imagePicker, null, true, new C5338e(this, 1), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s capture$lambda$39(BlackboardEvaluationFragment blackboardEvaluationFragment, Uri uri) {
        C5443s c5443s = C5443s.f8405a;
        if (uri != null) {
            File fileM2318s = AbstractC3382c.m2318s(uri);
            IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
            if (iPageControl != null) {
                String absolutePath = fileM2318s.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
                ImageGraph imageGraphAddSpecialImage = iPageControl.addSpecialImage(absolutePath);
                if (imageGraphAddSpecialImage != null) {
                    AbstractC3385e.m2333e(fileM2318s);
                    ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
                    if (viewFragmentBlackboardEvaluationBinding != null) {
                        viewFragmentBlackboardEvaluationBinding.sketchView.post(new RunnableC5334a(imageGraphAddSpecialImage, blackboardEvaluationFragment, 1));
                        return c5443s;
                    }
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
            }
        }
        return c5443s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$39$lambda$38$lambda$37(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        MoveActionConfig moveActionConfig;
        float f = imageGraph.getRenderRectF().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.sketchView.getHeight();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        float maxHeightTimes = f / ((((boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null) ? 2 : moveActionConfig.getMaxHeightTimes()) - 1) * height);
        IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
        if (iPageControl != null) {
            iPageControl.areaMoveStart();
        }
        IPageControl iPageControl2 = blackboardEvaluationFragment.pageControl;
        if (iPageControl2 != null) {
            IPageControl.DefaultImpls.areaMoveEnd$default(iPageControl2, null, Float.valueOf(maxHeightTimes), 1, null);
        }
        InterfaceC6471c interfaceC6471c = blackboardEvaluationFragment.pageSlideListener;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Float.valueOf(maxHeightTimes));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File createOpaqueCropTempFile(Context context, String sourcePath) throws IOException {
        Bitmap bitmapDecodeFile;
        if (!new File(sourcePath).exists() || (bitmapDecodeFile = BitmapFactory.decodeFile(sourcePath)) == null) {
            return null;
        }
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        if (width > 0 && height > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, (Paint) null);
            bitmapDecodeFile.recycle();
            File file = new File(context.getCacheDir(), "eval_crop_opaque_" + UUID.randomUUID() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream);
                fileOutputStream.close();
                bitmapCreateBitmap.recycle();
                if (zCompress) {
                    return file;
                }
                AbstractC3385e.m2333e(file);
                return null;
            } finally {
            }
        }
        bitmapDecodeFile.recycle();
        return null;
    }

    private final void executeConfig(BlackboardEvaluationConfig config) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.ivDottedLine;
        AbstractC5830k.m5329f(ivDottedLine, "ivDottedLine");
        ivDottedLine.setVisibility(config.getNeedDottedLine() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding2.ivCamera;
        AbstractC5830k.m5329f(ivCamera, "ivCamera");
        ivCamera.setVisibility(config.getNeedCamera() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivDrag = viewFragmentBlackboardEvaluationBinding3.ivDrag;
        AbstractC5830k.m5329f(ivDrag, "ivDrag");
        ivDrag.setVisibility(!config.getEnableMove() ? 4 : 0);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivWithdraw = viewFragmentBlackboardEvaluationBinding4.ivWithdraw;
        AbstractC5830k.m5329f(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(config.getNeedWithdraw() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivRecover = viewFragmentBlackboardEvaluationBinding5.ivRecover;
        AbstractC5830k.m5329f(ivRecover, "ivRecover");
        ivRecover.setVisibility(config.getNeedRecover() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivSelect = viewFragmentBlackboardEvaluationBinding6.ivSelect;
        AbstractC5830k.m5329f(ivSelect, "ivSelect");
        ivSelect.setVisibility(config.getNeedSelect() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding7.ivText;
        AbstractC5830k.m5329f(ivText, "ivText");
        ivText.setVisibility(config.getNeedText() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivQuestion = viewFragmentBlackboardEvaluationBinding8.ivQuestion;
        AbstractC5830k.m5329f(ivQuestion, "ivQuestion");
        ivQuestion.setVisibility(config.getNeedQuestion() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivAnswer = viewFragmentBlackboardEvaluationBinding9.ivAnswer;
        AbstractC5830k.m5329f(ivAnswer, "ivAnswer");
        ivAnswer.setVisibility(config.getNeedAnswer() ? 0 : 8);
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            Integer maxVerticalTime = config.getMaxVerticalTime();
            if (maxVerticalTime != null) {
                boardConfig.getMoveActionConfig().setMaxHeightTimes(maxVerticalTime.intValue());
            }
            Integer maxImageCount = config.getMaxImageCount();
            if (maxImageCount != null) {
                boardConfig.setMaxImageSize(maxImageCount.intValue());
            }
            boardConfig.setAddTextOriginalTextSize(config.getDefaultTextSize());
        }
    }

    public static /* synthetic */ Bitmap getScreenshot$default(BlackboardEvaluationFragment blackboardEvaluationFragment, int i, int i8, int i9, int i10, boolean z8, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z8 = false;
        }
        return blackboardEvaluationFragment.getScreenshot(i, i8, i9, i10, z8);
    }

    private final void handleDrag(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            calculateTranslationY(event.getRawY());
        } else if (action == 1) {
            calculateTranslationY(event.getRawY());
        } else {
            if (action != 2) {
                return;
            }
            calculateTranslationY(event.getRawY());
        }
    }

    private final void hideEvaluationPenColorPanel() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        View root = viewFragmentBlackboardEvaluationBinding.includePenColorToolbar.getRoot();
        root.setTranslationX(0.0f);
        root.setTranslationY(0.0f);
        root.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int indexOfToolbarSlotMatchingColor(int color) {
        int i = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupPenColorToolbarGroup = penColorToolbarGroup();
        int childCount = radioGroupPenColorToolbarGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = radioGroupPenColorToolbarGroup.getChildAt(i8);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getColor() & ViewCompat.MEASURED_SIZE_MASK) == i) {
                return i8;
            }
        }
        return 0;
    }

    private final void initBlackboard() {
        String absolutePath;
        File externalCacheDir;
        if (this.path == null) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            this.path = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        switchTouchMode(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBlackboardEvaluationBinding.sketchView;
        String str = this.path;
        AbstractC5830k.m5327d(str);
        sketchRecorderView.ready(str, new C2872b(this, 7), new C5338e(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initBlackboard$lambda$32(BlackboardEvaluationFragment blackboardEvaluationFragment, IBoardControl boardControl, boolean z8, long j7) throws Resources.NotFoundException, SecurityException {
        AbstractC5830k.m5330g(boardControl, "boardControl");
        blackboardEvaluationFragment.boardControl = boardControl;
        blackboardEvaluationFragment.initBoardConfig();
        blackboardEvaluationFragment.initPageControl();
        BlackboardEvaluationConfig blackboardEvaluationConfig = blackboardEvaluationFragment.fragmentConfig;
        if (blackboardEvaluationConfig != null) {
            blackboardEvaluationFragment.executeConfig(blackboardEvaluationConfig);
        }
        blackboardEvaluationFragment.activatePenTool(false);
        blackboardEvaluationFragment.switchTouchMode(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding != null) {
            viewFragmentBlackboardEvaluationBinding.tvHint.setVisibility(8);
            return C5443s.f8405a;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initBlackboard$lambda$33(BlackboardEvaluationFragment blackboardEvaluationFragment, Throwable it) {
        AbstractC5830k.m5330g(it, "it");
        C3404x.m2356a("加载失败,清除缓存后再试", new Object[0]);
        blackboardEvaluationFragment.switchTouchMode(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding != null) {
            viewFragmentBlackboardEvaluationBinding.tvHint.setVisibility(8);
            return C5443s.f8405a;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    private final void initBoardConfig() throws SecurityException {
        IBoardControl iBoardControl = this.boardControl;
        this.boardConfig = iBoardControl != null ? iBoardControl.getBoardConfig() : null;
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences(PREF_EVALUATION_PEN, 0);
        AbstractC5830k.m5327d(sharedPreferences);
        int iResolveSavedPenColorSlot = resolveSavedPenColorSlot(sharedPreferences);
        int iPenColorIntAtToolbarSlot = penColorIntAtToolbarSlot(iResolveSavedPenColorSlot);
        int i = sharedPreferences.getInt(KEY_TEXT_COLOR_ARGB, ViewCompat.MEASURED_STATE_MASK);
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            Boolean spTouchable = SPDataKt.getSpTouchable();
            boardConfig.setFingerDraw(spTouchable != null ? spTouchable.booleanValue() : true);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardEvaluationBinding.ivTouch.setSelected(boardConfig.getIsFingerDraw());
            boardConfig.setMaxImageSize(2);
            boardConfig.setImageBackground(true);
            boardConfig.setPaintWidth(3.0f);
            boardConfig.setBeelinePaintWidth(3.0f);
            boardConfig.setPaintColor(iPenColorIntAtToolbarSlot);
            boardConfig.setBeelinePaintColor(iPenColorIntAtToolbarSlot);
            boardConfig.setSelectEditColorList(EVALUATION_SELECT_EDIT_COLOR_LIST);
            boardConfig.setSelectCustomColorView(buildEvaluationSelectCustomColorView());
            setSelectEditColorChangeListenerCompat(boardConfig);
            boardConfig.setBackgroundColor(-1);
            MoveActionConfig moveActionConfig = boardConfig.getMoveActionConfig();
            moveActionConfig.setMoveActionEnable(true);
            moveActionConfig.setVerticalTranslate(true);
            moveActionConfig.setMaxHeightTimes(3);
            moveActionConfig.setMaxWidthTimes(1);
            boardConfig.setAddTextOriginalTextColor(i);
            boardConfig.setAddTextOriginalTextSize(68.0f);
            boardConfig.setAddTextOriginalTextMinSize(68.0f);
            boardConfig.setAddTextOriginalTextMaxSize(88.0f);
            boardConfig.setImageCropView(new BlackboardEvaluationFragment$initBoardConfig$1$2(this));
        }
        syncEvaluationPenRadiosAtSlot(iResolveSavedPenColorSlot);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initClickListener() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i = 11;
        viewFragmentBlackboardEvaluationBinding.ivWithdraw.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i8 = 2;
        viewFragmentBlackboardEvaluationBinding2.ivRecover.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i8) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i9 = 3;
        viewFragmentBlackboardEvaluationBinding3.ivSelect.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i9) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i10 = 4;
        viewFragmentBlackboardEvaluationBinding4.ivTouch.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i11 = 5;
        viewFragmentBlackboardEvaluationBinding5.ivPen.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i11) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i12 = 6;
        viewFragmentBlackboardEvaluationBinding6.ivLine.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i12) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i13 = 7;
        viewFragmentBlackboardEvaluationBinding7.ivDottedLine.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i13) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i14 = 8;
        viewFragmentBlackboardEvaluationBinding8.ivEraser.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i14) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding9.ivCamera;
        AbstractC5830k.m5329f(ivCamera, "ivCamera");
        final int i15 = 9;
        ExtKt.singleClick$default(ivCamera, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i15) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding10 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding10 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivQuestion = viewFragmentBlackboardEvaluationBinding10.ivQuestion;
        AbstractC5830k.m5329f(ivQuestion, "ivQuestion");
        final int i16 = 10;
        ExtKt.singleClick$default(ivQuestion, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i16) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding11 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding11 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivAnswer = viewFragmentBlackboardEvaluationBinding11.ivAnswer;
        AbstractC5830k.m5329f(ivAnswer, "ivAnswer");
        final int i17 = 12;
        ExtKt.singleClick$default(ivAnswer, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i17) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding12 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding12 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding12.ivText;
        AbstractC5830k.m5329f(ivText, "ivText");
        final int i18 = 13;
        ExtKt.singleClick$default(ivText, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i18) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding13 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding13 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i19 = 0;
        viewFragmentBlackboardEvaluationBinding13.ivDelete.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i19) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding14 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding14 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i20 = 1;
        viewFragmentBlackboardEvaluationBinding14.ivEvaSubmit.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.board.evaluation.b

            /* renamed from: b */
            public final /* synthetic */ BlackboardEvaluationFragment f8271b;

            {
                this.f8271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                switch (i20) {
                    case 0:
                        BlackboardEvaluationFragment.initClickListener$lambda$28(this.f8271b, view);
                        break;
                    case 1:
                        BlackboardEvaluationFragment.initClickListener$lambda$29(this.f8271b, view);
                        break;
                    case 2:
                        BlackboardEvaluationFragment.initClickListener$lambda$8(this.f8271b, view);
                        break;
                    case 3:
                        BlackboardEvaluationFragment.initClickListener$lambda$10(this.f8271b, view);
                        break;
                    case 4:
                        BlackboardEvaluationFragment.initClickListener$lambda$12(this.f8271b, view);
                        break;
                    case 5:
                        this.f8271b.activatePenTool(true);
                        break;
                    case 6:
                        BlackboardEvaluationFragment.initClickListener$lambda$15(this.f8271b, view);
                        break;
                    case 7:
                        BlackboardEvaluationFragment.initClickListener$lambda$17(this.f8271b, view);
                        break;
                    case 8:
                        BlackboardEvaluationFragment.initClickListener$lambda$19(this.f8271b, view);
                        break;
                    case 9:
                        BlackboardEvaluationFragment.initClickListener$lambda$20(this.f8271b, view);
                        break;
                    case 10:
                        BlackboardEvaluationFragment.initClickListener$lambda$21(this.f8271b, view);
                        break;
                    case 11:
                        BlackboardEvaluationFragment.initClickListener$lambda$7(this.f8271b, view);
                        break;
                    case 12:
                        BlackboardEvaluationFragment.initClickListener$lambda$22(this.f8271b, view);
                        break;
                    default:
                        BlackboardEvaluationFragment.initClickListener$lambda$27(this.f8271b, view);
                        break;
                }
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding15 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding15 != null) {
            viewFragmentBlackboardEvaluationBinding15.ivDrag.setOnTouchListener(new View.OnTouchListener() { // from class: com.zykj.view.board.evaluation.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BlackboardEvaluationFragment.initClickListener$lambda$30(this.f8272a, view, motionEvent);
                }
            });
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$10(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_NEW_SELECT);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.ivSelect;
            AbstractC5830k.m5329f(ivSelect, "ivSelect");
            blackboardEvaluationFragment.setCurrentActionUI(ivSelect);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$12(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setFingerDraw(!boardConfig.getIsFingerDraw());
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardEvaluationBinding.ivTouch.setSelected(boardConfig.getIsFingerDraw());
            SPDataKt.setSpTouchable(Boolean.valueOf(boardConfig.getIsFingerDraw()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$15(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_WRITING_BEELINE);
            boardConfig.setDottedLine(true, 30.0f, 0.0f);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            ImageView ivLine = viewFragmentBlackboardEvaluationBinding.ivLine;
            AbstractC5830k.m5329f(ivLine, "ivLine");
            blackboardEvaluationFragment.setCurrentActionUI(ivLine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$17(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_WRITING_BEELINE);
            BoardConfig.setDottedLine$default(boardConfig, true, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.ivDottedLine;
            AbstractC5830k.m5329f(ivDottedLine, "ivDottedLine");
            blackboardEvaluationFragment.setCurrentActionUI(ivDottedLine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$19(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_ERASER_WRITING);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            ImageView ivEraser = viewFragmentBlackboardEvaluationBinding.ivEraser;
            AbstractC5830k.m5329f(ivEraser, "ivEraser");
            blackboardEvaluationFragment.setCurrentActionUI(ivEraser);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$20(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        blackboardEvaluationFragment.capture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$21(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC6469a onImportQuestionClick;
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BlackboardEvaluationConfig blackboardEvaluationConfig = blackboardEvaluationFragment.fragmentConfig;
        if (blackboardEvaluationConfig == null || (onImportQuestionClick = blackboardEvaluationConfig.getOnImportQuestionClick()) == null) {
            return;
        }
        onImportQuestionClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$22(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC6469a onImportAnswerClick;
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BlackboardEvaluationConfig blackboardEvaluationConfig = blackboardEvaluationFragment.fragmentConfig;
        if (blackboardEvaluationConfig == null || (onImportAnswerClick = blackboardEvaluationConfig.getOnImportAnswerClick()) == null) {
            return;
        }
        onImportAnswerClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$27(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        FragmentActivity fragmentActivityRequireActivity = blackboardEvaluationFragment.requireActivity();
        AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
        new TextEditDialog(fragmentActivityRequireActivity, 0, 2, null).showDialog("", new C4959k1(19), new C5338e(blackboardEvaluationFragment, 3), new C2766k(23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initClickListener$lambda$27$lambda$23(String it) {
        AbstractC5830k.m5330g(it, "it");
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initClickListener$lambda$27$lambda$25(BlackboardEvaluationFragment blackboardEvaluationFragment, String content) {
        TextGraph textGraphAddText;
        AbstractC5830k.m5330g(content, "content");
        IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
        if (iPageControl != null && (textGraphAddText = iPageControl.addText(content, EzyPositionEnum$PositionEnum.TOP_CENTER, 20)) != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.ivSelect;
            AbstractC5830k.m5329f(ivSelect, "ivSelect");
            blackboardEvaluationFragment.setCurrentActionUI(ivSelect);
            IPageControl iPageControl2 = blackboardEvaluationFragment.pageControl;
            if (iPageControl2 != null) {
                iPageControl2.newSelectGraph(AbstractC5806u.m5286y(textGraphAddText.getId()));
            }
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$28(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        blackboardEvaluationFragment.askForErase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$29(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC6469a callbackForSubmit;
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        BlackboardEvaluationConfig blackboardEvaluationConfig = blackboardEvaluationFragment.fragmentConfig;
        if (blackboardEvaluationConfig == null || (callbackForSubmit = blackboardEvaluationConfig.getCallbackForSubmit()) == null) {
            return;
        }
        callbackForSubmit.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initClickListener$lambda$30(BlackboardEvaluationFragment blackboardEvaluationFragment, View view, MotionEvent motionEvent) {
        AbstractC5830k.m5327d(motionEvent);
        blackboardEvaluationFragment.handleDrag(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$7(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
        if (iPageControl != null) {
            iPageControl.withdraw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListener$lambda$8(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.hideEvaluationPenColorPanel();
        IPageControl iPageControl = blackboardEvaluationFragment.pageControl;
        if (iPageControl != null) {
            iPageControl.recover();
        }
    }

    private final void initData() {
        Bundle arguments = getArguments();
        this.path = arguments != null ? arguments.getString("path") : null;
    }

    private final void initEvaluationPenColorStrips() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenColor = viewFragmentBlackboardEvaluationBinding.includePenColorToolbar.rgPenColor;
        AbstractC5830k.m5329f(rgPenColor, "rgPenColor");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenColorProxy = viewFragmentBlackboardEvaluationBinding2.includePenColorSelectProxy.rgPenColorProxy;
        AbstractC5830k.m5329f(rgPenColorProxy, "rgPenColorProxy");
        attachPenColorListeners(rgPenColor, rgPenColorProxy);
        attachPenColorListeners(rgPenColorProxy, rgPenColor);
    }

    private final void initPageControl() {
        IBoardControl iBoardControl = this.boardControl;
        IPageControl currentPage = iBoardControl != null ? iBoardControl.getCurrentPage() : null;
        this.pageControl = currentPage;
        if (currentPage == null) {
            IBoardControl iBoardControl2 = this.boardControl;
            this.pageControl = iBoardControl2 != null ? IBoardControl.DefaultImpls.createPage$default(iBoardControl2, false, null, 3, null) : null;
        }
        IPageControl iPageControl = this.pageControl;
        if (iPageControl != null) {
            iPageControl.setAreaMoveListener(new IAreaMoveListener() { // from class: com.zykj.view.board.evaluation.BlackboardEvaluationFragment.initPageControl.1
                @Override // com.zykj.blackboard.listener.IAreaMoveListener
                public void onHorizontalMove(float progress) {
                    Log.i("BlackboardEvaluation", "onHorizontalMove -> " + progress);
                }

                @Override // com.zykj.blackboard.listener.IAreaMoveListener
                public void onMoveEnd() {
                }

                @Override // com.zykj.blackboard.listener.IAreaMoveListener
                public void onMoveStart() {
                }

                @Override // com.zykj.blackboard.listener.IAreaMoveListener
                public void onVerticalMove(float progress) {
                    InterfaceC6471c interfaceC6471c = BlackboardEvaluationFragment.this.pageSlideListener;
                    if (interfaceC6471c != null) {
                        interfaceC6471c.invoke(Float.valueOf(progress));
                    }
                    Log.i("BlackboardEvaluation", "onVerticalMove -> " + progress);
                }
            });
        }
        IPageControl iPageControl2 = this.pageControl;
        if (iPageControl2 != null) {
            iPageControl2.addWithdrawListener(new C53312());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding.ivWithdraw.setEnabled(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding2.ivRecover.setEnabled(false);
        IPageControl iPageControl3 = this.pageControl;
        if (iPageControl3 != null) {
            iPageControl3.setGeometrySelectListener(new IGeometrySelectListener() { // from class: com.zykj.view.board.evaluation.BlackboardEvaluationFragment.initPageControl.3
                @Override // com.zykj.blackboard.listener.IGeometrySelectListener
                public void geometryColorChange(int newColor) {
                    BlackboardEvaluationFragment.this.syncEvaluationPenColorFromEditedGraph(newColor);
                }
            });
        }
        IPageControl iPageControl4 = this.pageControl;
        if (iPageControl4 != null) {
            iPageControl4.setTextSelectListener(new ITextSelectListener() { // from class: com.zykj.view.board.evaluation.BlackboardEvaluationFragment.initPageControl.4
                @Override // com.zykj.blackboard.listener.ITextSelectListener
                public void textColorChange(int newColor) {
                    BoardConfig boardConfig = BlackboardEvaluationFragment.this.boardConfig;
                    if (boardConfig != null) {
                        boardConfig.setAddTextOriginalTextColor(newColor);
                    }
                    BlackboardEvaluationFragment.this.requireContext().getSharedPreferences(BlackboardEvaluationFragment.PREF_EVALUATION_PEN, 0).edit().putInt(BlackboardEvaluationFragment.KEY_TEXT_COLOR_ARGB, newColor).apply();
                }

                @Override // com.zykj.blackboard.listener.ITextSelectListener
                public void textSelected(int selectedColor, float selectedSize) {
                }

                @Override // com.zykj.blackboard.listener.ITextSelectListener
                public void textSelectedCancel() {
                }

                @Override // com.zykj.blackboard.listener.ITextSelectListener
                public void textSizeChange(float newSize) {
                    BoardConfig boardConfig = BlackboardEvaluationFragment.this.boardConfig;
                    if (boardConfig != null) {
                        boardConfig.setAddTextOriginalTextSize(newSize);
                    }
                }
            });
        }
    }

    private final void initTranslationConfig() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding != null) {
            viewFragmentBlackboardEvaluationBinding.ivDrag.post(new RunnableC5337d(this, 0));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTranslationConfig$lambda$6(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding.ivDrag.getGlobalVisibleRect(blackboardEvaluationFragment.dragRect);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 != null) {
            viewFragmentBlackboardEvaluationBinding2.viewRoot.post(new RunnableC5337d(blackboardEvaluationFragment, 1));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTranslationConfig$lambda$6$lambda$5(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        int i;
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding.viewRoot.getGlobalVisibleRect(rect);
        Log.i("initTranslationConfig", rect + " " + blackboardEvaluationFragment.dragRect);
        blackboardEvaluationFragment.defaultTranslateTop = 0.0f;
        blackboardEvaluationFragment.defaultTranslateBottom = (float) (rect.bottom - blackboardEvaluationFragment.dragRect.bottom);
        WindowManager windowManager = (WindowManager) AbstractC3382c.m2303d().getSystemService("window");
        if (windowManager == null) {
            i = -1;
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            i = point.y;
        }
        float f = i;
        BlackboardEvaluationConfig blackboardEvaluationConfig = blackboardEvaluationFragment.fragmentConfig;
        blackboardEvaluationFragment.calculateTranslationY(f * (blackboardEvaluationConfig != null ? blackboardEvaluationConfig.getDefaultLocationRatio() : 0.5f));
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 != null) {
            viewFragmentBlackboardEvaluationBinding2.viewRoot.setVisibility(0);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    private final void initView() {
        initClickListener();
        initEvaluationPenColorStrips();
        initBlackboard();
        initTranslationConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEvaluationAllowedPenColor(int color) {
        int i = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupPenColorToolbarGroup = penColorToolbarGroup();
        int childCount = radioGroupPenColorToolbarGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = radioGroupPenColorToolbarGroup.getChildAt(i8);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getColor() & ViewCompat.MEASURED_SIZE_MASK) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int normalizeEvaluationPenColor(int color) {
        int i = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupPenColorToolbarGroup = penColorToolbarGroup();
        int childCount = radioGroupPenColorToolbarGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = radioGroupPenColorToolbarGroup.getChildAt(i8);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getColor() & ViewCompat.MEASURED_SIZE_MASK) == i) {
                return (color & ViewCompat.MEASURED_STATE_MASK) | (16777215 & normalColorRadioButton.getColor());
            }
        }
        return penColorIntAtToolbarSlot(0);
    }

    private final int penColorIntAtToolbarSlot(int slotIndex) {
        RadioGroup radioGroupPenColorToolbarGroup = penColorToolbarGroup();
        int childCount = radioGroupPenColorToolbarGroup.getChildCount();
        if (childCount == 0) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        View childAt = radioGroupPenColorToolbarGroup.getChildAt(AbstractC5806u.m5274m(slotIndex, 0, childCount - 1));
        NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
        return normalColorRadioButton == null ? ViewCompat.MEASURED_STATE_MASK : normalColorRadioButton.getColor();
    }

    private final int penColorSlotCount() {
        int childCount = penColorToolbarGroup().getChildCount();
        if (childCount < 0) {
            return 0;
        }
        return childCount;
    }

    private final RadioGroup penColorToolbarGroup() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenColor = viewFragmentBlackboardEvaluationBinding.includePenColorToolbar.rgPenColor;
        AbstractC5830k.m5329f(rgPenColor, "rgPenColor");
        return rgPenColor;
    }

    private final int resolveSavedPenColorSlot(SharedPreferences prefs) {
        if (prefs.contains(KEY_PEN_COLOR_SLOT)) {
            int i = prefs.getInt(KEY_PEN_COLOR_SLOT, 0);
            int iPenColorSlotCount = penColorSlotCount() - 1;
            if (iPenColorSlotCount < 0) {
                iPenColorSlotCount = 0;
            }
            return AbstractC5806u.m5274m(i, 0, iPenColorSlotCount);
        }
        if (!prefs.contains(KEY_PEN_COLOR_ARGB_LEGACY)) {
            return 0;
        }
        int iIndexOfToolbarSlotMatchingColor = indexOfToolbarSlotMatchingColor(prefs.getInt(KEY_PEN_COLOR_ARGB_LEGACY, ViewCompat.MEASURED_STATE_MASK));
        prefs.edit().putInt(KEY_PEN_COLOR_SLOT, iIndexOfToolbarSlotMatchingColor).remove(KEY_PEN_COLOR_ARGB_LEGACY).apply();
        return iIndexOfToolbarSlotMatchingColor;
    }

    private final void setCurrentActionUI(View view) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding.ivSelect.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding2.ivPen.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding3.ivEraser.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding4.ivLine.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardEvaluationBinding5.ivDottedLine.setSelected(false);
        view.setSelected(true);
    }

    private final void setSelectEditColorChangeListenerCompat(BoardConfig boardConfig) throws SecurityException {
        Method method;
        Method[] methods = boardConfig.getClass().getMethods();
        AbstractC5830k.m5329f(methods, "getMethods(...)");
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methods[i];
            if (AbstractC5830k.m5325b(method.getName(), "setSelectEditColorChangeListener") && method.getParameterTypes().length == 1) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            return;
        }
        try {
            Result.m13956constructorimpl(method.invoke(boardConfig, new C5338e(this, 2)));
        } catch (Throwable th) {
            Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s setSelectEditColorChangeListenerCompat$lambda$59$lambda$58(BlackboardEvaluationFragment blackboardEvaluationFragment, int i) {
        blackboardEvaluationFragment.syncEvaluationPenColorFromEditedGraph(i);
        return C5443s.f8405a;
    }

    public static /* synthetic */ void showProgress$default(BlackboardEvaluationFragment blackboardEvaluationFragment, String str, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blackboardEvaluationFragment.getString(C5280R.string.progress_content);
            AbstractC5830k.m5329f(str, "getString(...)");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        blackboardEvaluationFragment.showProgress(str, z8);
    }

    private final void switchTouchMode(boolean canDoEdit) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding != null) {
            viewFragmentBlackboardEvaluationBinding.viewRoot.setCanTouch(canDoEdit);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncEvaluationPenColorFromEditedGraph(int color) {
        int iIndexOfToolbarSlotMatchingColor = indexOfToolbarSlotMatchingColor(normalizeEvaluationPenColor(color));
        applyEvaluationPenColorAtSlot(iIndexOfToolbarSlotMatchingColor, true, false);
        syncEvaluationPenRadiosAtSlot(iIndexOfToolbarSlotMatchingColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncEvaluationPenRadiosAtSlot(int slotIndex) {
        int iPenColorSlotCount = penColorSlotCount();
        if (iPenColorSlotCount == 0) {
            return;
        }
        int iM5274m = AbstractC5806u.m5274m(slotIndex, 0, iPenColorSlotCount - 1);
        this.suppressPenColorSync = true;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        View childAt = viewFragmentBlackboardEvaluationBinding.includePenColorToolbar.rgPenColor.getChildAt(iM5274m);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardEvaluationBinding2.includePenColorToolbar.rgPenColor.check(radioButton.getId());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        View childAt2 = viewFragmentBlackboardEvaluationBinding3.includePenColorSelectProxy.rgPenColorProxy.getChildAt(iM5274m);
        RadioButton radioButton2 = childAt2 instanceof RadioButton ? (RadioButton) childAt2 : null;
        if (radioButton2 != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding4 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentBlackboardEvaluationBinding4.includePenColorSelectProxy.rgPenColorProxy.check(radioButton2.getId());
        }
        this.suppressPenColorSync = false;
    }

    public final void addImage(@NotNull Bitmap bitmap) {
        ImageGraph imageGraphAddSpecialImage;
        Integer maxImageCount;
        AbstractC5830k.m5330g(bitmap, "bitmap");
        IPageControl iPageControl = this.pageControl;
        int imageGraphCount = iPageControl != null ? iPageControl.getImageGraphCount() : 0;
        BlackboardEvaluationConfig blackboardEvaluationConfig = this.fragmentConfig;
        if (imageGraphCount >= ((blackboardEvaluationConfig == null || (maxImageCount = blackboardEvaluationConfig.getMaxImageCount()) == null) ? 3 : maxImageCount.intValue())) {
            C3404x.m2356a("图片数量已达上限，不可继续插入", new Object[0]);
            return;
        }
        IPageControl iPageControl2 = this.pageControl;
        if (iPageControl2 == null || (imageGraphAddSpecialImage = iPageControl2.addSpecialImage(bitmap)) == null) {
            return;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding != null) {
            viewFragmentBlackboardEvaluationBinding.sketchView.post(new RunnableC5334a(imageGraphAddSpecialImage, this, 0));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    @Nullable
    public final Bitmap getScreenshot(int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isBoardAsWidth) {
        IPageControl iPageControl = this.pageControl;
        if (iPageControl != null) {
            return IPageControl.DefaultImpls.minScreenshot$default(iPageControl, horizontalOffset, verticalOffset, minWidth, minHeight, isBoardAsWidth, true, false, null, 192, null);
        }
        return null;
    }

    public final void hideProgress() {
        ProgressDialog progressDialog = this.mProgressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.mProgressDialog = null;
    }

    public final boolean isImageOutOfCount() {
        Integer maxImageCount;
        IPageControl iPageControl = this.pageControl;
        int imageGraphCount = iPageControl != null ? iPageControl.getImageGraphCount() : 0;
        BlackboardEvaluationConfig blackboardEvaluationConfig = this.fragmentConfig;
        return imageGraphCount >= ((blackboardEvaluationConfig == null || (maxImageCount = blackboardEvaluationConfig.getMaxImageCount()) == null) ? 3 : maxImageCount.intValue());
    }

    public final boolean isPageNotEmpty() {
        IPageControl iPageControl = this.pageControl;
        return iPageControl != null && iPageControl.isPageNotEmpty();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(inflater, "inflater");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBindingInflate = ViewFragmentBlackboardEvaluationBinding.inflate(inflater);
        BlackboardEvaluationConfig blackboardEvaluationConfig = this.fragmentConfig;
        int iIntValue = -1;
        if (blackboardEvaluationConfig == null || !blackboardEvaluationConfig.getEnableMove()) {
            BlackboardEvaluationConfig blackboardEvaluationConfig2 = this.fragmentConfig;
            float defaultLocationRatio = 1.0f - (blackboardEvaluationConfig2 != null ? blackboardEvaluationConfig2.getDefaultLocationRatio() : 0.5f);
            WindowManager windowManager = (WindowManager) AbstractC3382c.m2303d().getSystemService("window");
            if (windowManager != null) {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                iIntValue = point.y;
            }
            float dimensionPixelSize = (iIntValue * defaultLocationRatio) - getResources().getDimensionPixelSize(C5280R.dimen.view_9);
            SketchRecorderView sketchView = viewFragmentBlackboardEvaluationBindingInflate.sketchView;
            AbstractC5830k.m5329f(sketchView, "sketchView");
            ViewGroup.LayoutParams layoutParams = sketchView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = (int) dimensionPixelSize;
            sketchView.setLayoutParams(layoutParams);
        } else {
            Integer numValueOf = container != null ? Integer.valueOf(container.getHeight()) : null;
            SketchRecorderView sketchView2 = viewFragmentBlackboardEvaluationBindingInflate.sketchView;
            AbstractC5830k.m5329f(sketchView2, "sketchView");
            ViewGroup.LayoutParams layoutParams2 = sketchView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (numValueOf != null && numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue() - getResources().getDimensionPixelSize(C5280R.dimen.view_38);
            }
            layoutParams2.height = iIntValue;
            sketchView2.setLayoutParams(layoutParams2);
        }
        AbstractC5830k.m5327d(viewFragmentBlackboardEvaluationBindingInflate);
        this.mBinding = viewFragmentBlackboardEvaluationBindingInflate;
        View root = viewFragmentBlackboardEvaluationBindingInflate.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.boardControl = null;
        this.boardConfig = null;
        this.pageControl = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Deprecated(message = "默认位置会闪，不建议使用")
    public final void setConfig(@NotNull BlackboardEvaluationConfig config) {
        AbstractC5830k.m5330g(config, "config");
        this.fragmentConfig = config;
        if (getView() != null) {
            executeConfig(config);
        }
    }

    public final void setOnPageSlideListener(@Nullable InterfaceC6471c pageSlideListener) {
        this.pageSlideListener = pageSlideListener;
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
