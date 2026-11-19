package com.zykj.view.board.evaluation;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置、文件流、位图。

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.view.R$dimen;
import com.zykj.view.R$string;
import com.zykj.view.R$style;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardEvaluationBinding;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p148io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p027b8.AbstractC5046c;
import p027b8.AbstractC5065v;
import p027b8.C5060q;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5122e;
import p035c5.InterfaceC5123f;
import p035c5.InterfaceC5127j;
import p066d5.InterfaceC7289a;
import p066d5.InterfaceC7290b;
import p087f4.C7438c;
import p177n4.InterfaceC8629i;
import p221r4.C9008d;
import p235s7.C9317a;
import p268v7.DialogC9721l;

@Metadata(m13557d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0099\u00012\u00020\u0001:\u0001qB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0003J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020-2\u0006\u00100\u001a\u00020-H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020-H\u0002¢\u0006\u0004\b8\u00102J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J'\u0010>\u001a\u00020\u00042\u0006\u00100\u001a\u00020-2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00042\u0006\u00107\u001a\u00020-H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00042\u0006\u00100\u001a\u00020-H\u0002¢\u0006\u0004\bF\u0010AJ\u0017\u0010G\u001a\u00020-2\u0006\u00107\u001a\u00020-H\u0002¢\u0006\u0004\bG\u00102J\u0017\u0010H\u001a\u00020\b2\u0006\u00107\u001a\u00020-H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010T\u001a\u00020\u00042\b\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bT\u0010UJ+\u0010Z\u001a\u00020\u001d2\u0006\u0010W\u001a\u00020V2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bZ\u0010[J!\u0010\\\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010\u0003J9\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010_\u001a\u00020-2\u0006\u0010`\u001a\u00020-2\u0006\u0010a\u001a\u00020-2\u0006\u0010b\u001a\u00020-2\b\b\u0002\u0010c\u001a\u00020\b¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020\b¢\u0006\u0004\bg\u0010hJ#\u0010k\u001a\u00020\u00042\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u0004\u0018\u00010i¢\u0006\u0004\bk\u0010lJ\u0015\u0010n\u001a\u00020\u00042\u0006\u0010m\u001a\u00020d¢\u0006\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010w\u001a\u00020t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u008a\u0001\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u0018R\u001a\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0095\u0001\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0092\u0001R&\u0010j\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0089\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010h¨\u0006\u009a\u0001"}, m13558d2 = {"Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "M0", "S0", "P0", "", "canDoEdit", "f1", "(Z)V", "t0", "p0", "s0", "Landroid/content/Context;", "context", "", "sourcePath", "Ljava/io/File;", "j0", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "O0", "g0", "Z", "Ls7/a;", "config", "k0", "(Ls7/a;)V", "Landroid/view/View;", "view", "b1", "(Landroid/view/View;)V", "n0", "toggleColorPanel", ExifInterface.GPS_DIRECTION_TRUE, "N0", ExifInterface.LONGITUDE_WEST, "Landroid/widget/RadioGroup;", "source", "syncTarget", "c0", "(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V", "Z0", "()Landroid/widget/RadioGroup;", "", "Y0", "()I", "slotIndex", "X0", "(I)I", "Landroid/content/SharedPreferences;", "prefs", "a1", "(Landroid/content/SharedPreferences;)I", TypedValues.Custom.S_COLOR, "o0", "Ld5/a;", "e0", "()Ld5/a;", "persist", "notifySdkSelectCallback", "Y", "(IZZ)V", "g1", "(I)V", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "d1", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "h1", "W0", "T0", "(I)Z", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "m0", "(Landroid/view/MotionEvent;)V", "", "y", "f0", "(F)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "isBoardAsWidth", "Landroid/graphics/Bitmap;", "l0", "(IIIIZ)Landroid/graphics/Bitmap;", "V0", "()Z", "Lkotlin/Function1;", "pageSlideListener", "c1", "(Lkotlin/jvm/functions/Function1;)V", "bitmap", "U", "(Landroid/graphics/Bitmap;)V", "Lb8/q;", "a", "Lb8/q;", "imagePicker", "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;", "b", "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;", "mBinding", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "c", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "boardControl", "Ln4/i;", "d", "Ln4/i;", "pageControl", "e", "Lcom/zykj/blackboard/bean/BoardConfig;", "f", "Ljava/lang/String;", "path", "g", "Ls7/a;", "fragmentConfig", "h", "Lkotlin/jvm/functions/Function1;", "evaluationSelectColorChangeCallback", "i", "suppressPenColorSync", "Landroid/graphics/Rect;", "j", "Landroid/graphics/Rect;", "dragRect", "k", "F", "defaultTranslateTop", "l", "defaultTranslateBottom", "m", "U0", "isImageOutOfCount", "n", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1042:1\n311#2:1043\n327#2,4:1044\n312#2:1048\n311#2:1049\n327#2,4:1050\n312#2:1054\n257#2,2:1061\n257#2,2:1063\n278#2,2:1065\n257#2,2:1067\n257#2,2:1069\n257#2,2:1071\n257#2,2:1073\n257#2,2:1075\n257#2,2:1077\n257#2,2:1079\n255#2:1081\n257#2,2:1082\n83#3,6:1055\n1310#4,2:1084\n1#5:1086\n346#6,8:1087\n*S KotlinDebug\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n*L\n130#1:1043\n130#1:1044,4\n130#1:1048\n144#1:1049\n144#1:1050,4\n144#1:1054\n672#1:1061,2\n674#1:1063,2\n676#1:1065,2\n678#1:1067,2\n680#1:1069,2\n682#1:1071,2\n684#1:1073,2\n686#1:1075,2\n688#1:1077,2\n723#1:1079,2\n738#1:1081\n743#1:1082,2\n512#1:1055,6\n931#1:1084,2\n798#1:1087,8\n*E\n"})
/* loaded from: classes5.dex */
public final class BlackboardEvaluationFragment extends Fragment {

    /* renamed from: n, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o */
    public static final List f11139o = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#007DFE")), Integer.valueOf(Color.parseColor("#FE3720"))});

    /* renamed from: b, reason: from kotlin metadata */
    public ViewFragmentBlackboardEvaluationBinding mBinding;

    /* renamed from: c, reason: from kotlin metadata */
    public IBoardControl boardControl;

    /* renamed from: d, reason: from kotlin metadata */
    public InterfaceC8629i pageControl;

    /* renamed from: e, reason: from kotlin metadata */
    public BoardConfig boardConfig;

    /* renamed from: f, reason: from kotlin metadata */
    public String path;

    /* renamed from: g, reason: from kotlin metadata */
    public C9317a fragmentConfig;

    /* renamed from: h, reason: from kotlin metadata */
    public Function1 evaluationSelectColorChangeCallback;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean suppressPenColorSync;

    /* renamed from: k, reason: from kotlin metadata */
    public float defaultTranslateTop;

    /* renamed from: l, reason: from kotlin metadata */
    public float defaultTranslateBottom;

    /* renamed from: m, reason: from kotlin metadata */
    public Function1 pageSlideListener;

    /* renamed from: a, reason: from kotlin metadata */
    public final C5060q imagePicker = new C5060q(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: j, reason: from kotlin metadata */
    public Rect dragRect = new Rect();

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BlackboardEvaluationFragment m11198a(String path, C9317a config) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(config, "config");
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            BlackboardEvaluationFragment blackboardEvaluationFragment = new BlackboardEvaluationFragment();
            blackboardEvaluationFragment.fragmentConfig = config;
            blackboardEvaluationFragment.setArguments(bundle);
            return blackboardEvaluationFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$b */
    public static final class ViewTreeObserverOnPreDrawListenerC7239b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f11153a;

        /* renamed from: b */
        public final /* synthetic */ int f11154b;

        /* renamed from: c */
        public final /* synthetic */ BlackboardEvaluationFragment f11155c;

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f11156d;

        public ViewTreeObserverOnPreDrawListenerC7239b(View view, int i10, BlackboardEvaluationFragment blackboardEvaluationFragment, LinearLayout linearLayout) {
            this.f11153a = view;
            this.f11154b = i10;
            this.f11155c = blackboardEvaluationFragment;
            this.f11156d = linearLayout;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f11153a.getWidth() != 0 && this.f11153a.getHeight() != 0) {
                BlackboardEvaluationFragment.m11124X(this.f11153a, this.f11154b, this.f11155c, this.f11156d);
                this.f11153a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$c */
    public static final class C7240c implements InterfaceC7289a {
        public C7240c() {
        }

        /* renamed from: f */
        public static final Unit m11200f(Function1 function1, BlackboardEvaluationFragment blackboardEvaluationFragment, int i10) {
            function1.invoke(Integer.valueOf(i10));
            blackboardEvaluationFragment.m11188g1(i10);
            return Unit.INSTANCE;
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: a */
        public void mo10823a(Integer num) {
            if (num == null) {
                return;
            }
            BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
            int iM11195o0 = blackboardEvaluationFragment.m11195o0(blackboardEvaluationFragment.m11173W0(num.intValue()));
            BlackboardEvaluationFragment.this.m11175Y(iM11195o0, true, true);
            BlackboardEvaluationFragment.this.m11189h1(iM11195o0);
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: b */
        public void mo10824b(Integer num) {
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: c */
        public boolean mo10825c(int i10) {
            return BlackboardEvaluationFragment.this.m11168T0(i10);
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: d */
        public void mo10826d(final Function1 function1) {
            final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
            blackboardEvaluationFragment.evaluationSelectColorChangeCallback = function1 != null ? new Function1() { // from class: s7.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.C7240c.m11200f(function1, blackboardEvaluationFragment, ((Integer) obj).intValue());
                }
            } : null;
        }

        @Override // p066d5.InterfaceC7289a
        public void dispatchTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = BlackboardEvaluationFragment.this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f11348a.dispatchTouchEvent(event);
        }

        @Override // p066d5.InterfaceC7289a
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = BlackboardEvaluationFragment.this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f11348a.draw(canvas);
        }

        @Override // p066d5.InterfaceC7289a
        public float getHeight() {
            return BlackboardEvaluationFragment.this.getResources().getDimension(R$dimen.evaluation_pen_color_strip_height);
        }

        @Override // p066d5.InterfaceC7289a
        public float getWidth() {
            return BlackboardEvaluationFragment.this.getResources().getDimension(R$dimen.evaluation_pen_color_strip_width);
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$d */
    public static final class C7241d implements InterfaceC7290b {
        public C7241d() {
        }

        /* renamed from: c */
        public static final Unit m11202c(File file, Function1 function1, Function0 function0, Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
            String absolutePath;
            if (file != null) {
                FileUtils.delete(file);
            }
            if (uri != null) {
                File fileUri2File = UriUtils.uri2File(uri);
                if (fileUri2File == null || (absolutePath = fileUri2File.getAbsolutePath()) == null) {
                    absolutePath = "";
                }
                function1.invoke(absolutePath);
            } else {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // p066d5.InterfaceC7290b
        /* renamed from: a */
        public void mo10822a(String imageLocalPath, final Function1 doneCallback, final Function0 cancelCallback) {
            Uri uriFile2Uri;
            Intrinsics.checkNotNullParameter(imageLocalPath, "imageLocalPath");
            Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
            Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
            Context context = BlackboardEvaluationFragment.this.getContext();
            if (context == null || StringsKt.isBlank(imageLocalPath)) {
                cancelCallback.invoke();
                return;
            }
            final File fileM11190j0 = BlackboardEvaluationFragment.this.m11190j0(context, imageLocalPath);
            if (fileM11190j0 == null || (uriFile2Uri = UriUtils.file2Uri(fileM11190j0)) == null) {
                uriFile2Uri = UriUtils.file2Uri(new File(imageLocalPath));
            }
            if (uriFile2Uri != null) {
                BlackboardEvaluationFragment.this.imagePicker.m2568y(uriFile2Uri, new Function1() { // from class: s7.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackboardEvaluationFragment.C7241d.m11202c(fileM11190j0, doneCallback, cancelCallback, (Uri) obj);
                    }
                });
                return;
            }
            if (fileM11190j0 != null) {
                FileUtils.delete(fileM11190j0);
            }
            cancelCallback.invoke();
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$e */
    public static final class C7242e implements InterfaceC5121d {
        public C7242e() {
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: a */
        public void mo2776a(float f10) {
            Log.i("BlackboardEvaluation", "onHorizontalMove -> " + f10);
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: b */
        public void mo2777b(float f10) {
            Function1 function1 = BlackboardEvaluationFragment.this.pageSlideListener;
            if (function1 != null) {
                function1.invoke(Float.valueOf(f10));
            }
            Log.i("BlackboardEvaluation", "onVerticalMove -> " + f10);
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: c */
        public void mo2778c() {
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: d */
        public void mo2779d() {
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$f */
    public static final class C7243f implements InterfaceC5127j {
        public C7243f() {
        }

        /* renamed from: c */
        public static final void m11204c(BlackboardEvaluationFragment blackboardEvaluationFragment, boolean z9, boolean z10) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f11365r.setEnabled(z9);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
            }
            viewFragmentBlackboardEvaluationBinding2.f11361n.setEnabled(z10);
        }

        @Override // p035c5.InterfaceC5127j
        /* renamed from: a */
        public void mo2787a(final boolean z9, final boolean z10) {
            FragmentActivity activity = BlackboardEvaluationFragment.this.getActivity();
            if (activity != null) {
                final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: s7.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.C7243f.m11204c(blackboardEvaluationFragment, z9, z10);
                    }
                });
            }
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$g */
    public static final class C7244g implements InterfaceC5122e {
        public C7244g() {
        }

        @Override // p035c5.InterfaceC5122e
        /* renamed from: a */
        public void mo2780a(int i10) {
            BlackboardEvaluationFragment.this.m11188g1(i10);
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$h */
    public static final class C7245h implements InterfaceC5123f {
        public C7245h() {
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: a */
        public void mo2781a(float f10) {
            BoardConfig boardConfig = BlackboardEvaluationFragment.this.boardConfig;
            if (boardConfig != null) {
                boardConfig.setAddTextOriginalTextSize(f10);
            }
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: b */
        public void mo2782b() {
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: c */
        public void mo2783c(int i10, float f10) {
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: d */
        public void mo2784d(int i10) {
            BoardConfig boardConfig = BlackboardEvaluationFragment.this.boardConfig;
            if (boardConfig != null) {
                boardConfig.setAddTextOriginalTextColor(i10);
            }
            BlackboardEvaluationFragment.this.requireContext().getSharedPreferences("blackboard_evaluation_pen", 0).edit().putInt("text_color_argb", i10).apply();
        }
    }

    /* renamed from: A0 */
    public static final void m11089A0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        blackboardEvaluationFragment.m11187g0();
    }

    /* renamed from: B0 */
    public static final void m11091B0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        Function0 function0M15560q;
        blackboardEvaluationFragment.m11194n0();
        C9317a c9317a = blackboardEvaluationFragment.fragmentConfig;
        if (c9317a == null || (function0M15560q = c9317a.m15560q()) == null) {
            return;
        }
        function0M15560q.invoke();
    }

    /* renamed from: C0 */
    public static final void m11093C0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        Function0 function0M15559p;
        blackboardEvaluationFragment.m11194n0();
        C9317a c9317a = blackboardEvaluationFragment.fragmentConfig;
        if (c9317a == null || (function0M15559p = c9317a.m15559p()) == null) {
            return;
        }
        function0M15559p.invoke();
    }

    /* renamed from: D0 */
    public static final void m11095D0(final BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        FragmentActivity fragmentActivityRequireActivity = blackboardEvaluationFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        new DialogC9721l(fragmentActivityRequireActivity, 0, 2, null).m16252s("", new Function1() { // from class: s7.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m11097E0((String) obj);
            }
        }, new Function1() { // from class: s7.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m11099F0(this.f16203a, (String) obj);
            }
        }, new Function0() { // from class: s7.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackboardEvaluationFragment.m11101G0();
            }
        });
    }

    /* renamed from: E0 */
    public static final Unit m11097E0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: F0 */
    public static final Unit m11099F0(BlackboardEvaluationFragment blackboardEvaluationFragment, String content) {
        C9008d c9008dMo6728r;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null && (c9008dMo6728r = interfaceC8629i.mo6728r(content, EzyPositionEnum.PositionEnum.TOP_CENTER, 20)) != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f11362o;
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m11180b1(ivSelect);
            InterfaceC8629i interfaceC8629i2 = blackboardEvaluationFragment.pageControl;
            if (interfaceC8629i2 != null) {
                interfaceC8629i2.mo6708E(CollectionsKt.listOf(c9008dMo6728r.getId()));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: G0 */
    public static final Unit m11101G0() {
        return Unit.INSTANCE;
    }

    /* renamed from: H0 */
    public static final void m11103H0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        blackboardEvaluationFragment.m11177Z();
    }

    /* renamed from: I0 */
    public static final void m11105I0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        Function0 function0M15545b;
        blackboardEvaluationFragment.m11194n0();
        C9317a c9317a = blackboardEvaluationFragment.fragmentConfig;
        if (c9317a == null || (function0M15545b = c9317a.m15545b()) == null) {
            return;
        }
        function0M15545b.invoke();
    }

    /* renamed from: J0 */
    public static final boolean m11107J0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNull(motionEvent);
        blackboardEvaluationFragment.m11193m0(motionEvent);
        return true;
    }

    /* renamed from: K0 */
    public static final void m11109K0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null) {
            interfaceC8629i.mo6727q();
        }
    }

    /* renamed from: L0 */
    public static final void m11111L0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null) {
            interfaceC8629i.mo6735z();
        }
    }

    /* renamed from: M0 */
    private final void m11113M0() {
        Bundle arguments = getArguments();
        this.path = arguments != null ? arguments.getString("path") : null;
    }

    /* renamed from: Q0 */
    public static final void m11118Q0(final BlackboardEvaluationFragment blackboardEvaluationFragment) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11355h.getGlobalVisibleRect(blackboardEvaluationFragment.dragRect);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f11369v.post(new Runnable() { // from class: s7.n
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m11120R0(this.f16202a);
            }
        });
    }

    /* renamed from: R0 */
    public static final void m11120R0(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11369v.getGlobalVisibleRect(rect);
        Log.i("initTranslationConfig", rect + " " + blackboardEvaluationFragment.dragRect);
        blackboardEvaluationFragment.defaultTranslateTop = 0.0f;
        blackboardEvaluationFragment.defaultTranslateBottom = (float) (rect.bottom - blackboardEvaluationFragment.dragRect.bottom);
        float screenHeight = (float) ScreenUtils.getScreenHeight();
        C9317a c9317a = blackboardEvaluationFragment.fragmentConfig;
        blackboardEvaluationFragment.m11185f0(screenHeight * (c9317a != null ? c9317a.m15546c() : 0.5f));
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f11369v.setVisibility(0);
    }

    /* renamed from: S0 */
    private final void m11122S0() {
        m11151t0();
        m11164N0();
        m11196p0();
        m11166P0();
    }

    /* renamed from: V */
    public static final void m11123V(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        C7438c moveActionConfig;
        float f10 = imageGraph.mo14994d().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.f11367t.getHeight();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        float fM11994b = f10 / (height * (((boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null) ? 2 : moveActionConfig.m11994b()) - 1));
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null) {
            interfaceC8629i.areaMoveStart();
        }
        InterfaceC8629i interfaceC8629i2 = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i2 != null) {
            InterfaceC8629i.a.m14208d(interfaceC8629i2, null, Float.valueOf(fM11994b), 1, null);
        }
        Function1 function1 = blackboardEvaluationFragment.pageSlideListener;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fM11994b));
        }
    }

    /* renamed from: X */
    public static final void m11124X(View view, int i10, BlackboardEvaluationFragment blackboardEvaluationFragment, LinearLayout linearLayout) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11359l.getGlobalVisibleRect(rect);
        linearLayout.getGlobalVisibleRect(new Rect());
        view.getGlobalVisibleRect(new Rect());
        view.setTranslationX(rect.left - r5.left);
        view.setTranslationY((r4.bottom + i10) - r5.top);
    }

    /* renamed from: a0 */
    public static final void m11125a0(BlackboardEvaluationFragment blackboardEvaluationFragment, DialogInterface dialogInterface, int i10) {
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null) {
            InterfaceC8629i.a.m14209e(interfaceC8629i, null, 1, null);
        }
    }

    /* renamed from: b0 */
    public static final void m11126b0(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: d0 */
    public static final void m11129d0(BlackboardEvaluationFragment blackboardEvaluationFragment, RadioGroup radioGroup, RadioGroup radioGroup2, int i10) {
        if (blackboardEvaluationFragment.suppressPenColorSync) {
            return;
        }
        int i11 = -1;
        if (i10 == -1) {
            return;
        }
        Iterator<Integer> it = RangesKt.until(0, radioGroup2.getChildCount()).iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iNextInt = ((IntIterator) it).nextInt();
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (radioGroup2.getChildAt(iNextInt).getId() == i10) {
                i11 = i12;
                break;
            }
            i12++;
        }
        if (i11 < 0 || i11 >= blackboardEvaluationFragment.m11176Y0()) {
            return;
        }
        blackboardEvaluationFragment.suppressPenColorSync = true;
        View childAt = radioGroup.getChildAt(i11);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton != null) {
            radioGroup.check(radioButton.getId());
        }
        blackboardEvaluationFragment.suppressPenColorSync = false;
        blackboardEvaluationFragment.m11175Y(i11, true, true);
    }

    /* renamed from: e1 */
    public static final Unit m11131e1(BlackboardEvaluationFragment blackboardEvaluationFragment, int i10) {
        blackboardEvaluationFragment.m11188g1(i10);
        return Unit.INSTANCE;
    }

    /* renamed from: h0 */
    public static final Unit m11135h0(final BlackboardEvaluationFragment blackboardEvaluationFragment, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null) {
            String absolutePath = fileUri2FileNoCacheCopy.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            final ImageGraph imageGraphMo6704A = interfaceC8629i.mo6704A(absolutePath);
            if (imageGraphMo6704A != null) {
                FileUtils.delete(fileUri2FileNoCacheCopy);
                ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
                if (viewFragmentBlackboardEvaluationBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentBlackboardEvaluationBinding = null;
                }
                viewFragmentBlackboardEvaluationBinding.f11367t.post(new Runnable() { // from class: s7.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.m11137i0(imageGraphMo6704A, blackboardEvaluationFragment);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i0 */
    public static final void m11137i0(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        C7438c moveActionConfig;
        float f10 = imageGraph.mo14994d().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.f11367t.getHeight();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        float fM11994b = f10 / (height * (((boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null) ? 2 : moveActionConfig.m11994b()) - 1));
        InterfaceC8629i interfaceC8629i = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i != null) {
            interfaceC8629i.areaMoveStart();
        }
        InterfaceC8629i interfaceC8629i2 = blackboardEvaluationFragment.pageControl;
        if (interfaceC8629i2 != null) {
            InterfaceC8629i.a.m14208d(interfaceC8629i2, null, Float.valueOf(fM11994b), 1, null);
        }
        Function1 function1 = blackboardEvaluationFragment.pageSlideListener;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fM11994b));
        }
    }

    /* renamed from: q0 */
    public static final Unit m11146q0(BlackboardEvaluationFragment blackboardEvaluationFragment, IBoardControl boardControl, boolean z9, long j10) throws Resources.NotFoundException, SecurityException {
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        blackboardEvaluationFragment.boardControl = boardControl;
        blackboardEvaluationFragment.m11197s0();
        blackboardEvaluationFragment.m11165O0();
        C9317a c9317a = blackboardEvaluationFragment.fragmentConfig;
        if (c9317a != null) {
            blackboardEvaluationFragment.m11191k0(c9317a);
        }
        blackboardEvaluationFragment.m11167T(false);
        blackboardEvaluationFragment.m11186f1(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11368u.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* renamed from: r0 */
    public static final Unit m11148r0(BlackboardEvaluationFragment blackboardEvaluationFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToastUtils.showShort("加载失败,清除缓存后再试", new Object[0]);
        blackboardEvaluationFragment.m11186f1(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11368u.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* renamed from: t0 */
    private final void m11151t0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11365r.setOnClickListener(new View.OnClickListener() { // from class: s7.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11109K0(this.f16209a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f11361n.setOnClickListener(new View.OnClickListener() { // from class: s7.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11111L0(this.f16180a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f11362o.setOnClickListener(new View.OnClickListener() { // from class: s7.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11153u0(this.f16182a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f11364q.setOnClickListener(new View.OnClickListener() { // from class: s7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11155v0(this.f16179a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding6 = null;
        }
        viewFragmentBlackboardEvaluationBinding6.f11359l.setOnClickListener(new View.OnClickListener() { // from class: s7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                BlackboardEvaluationFragment.m11157w0(this.f16181a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding7 = null;
        }
        viewFragmentBlackboardEvaluationBinding7.f11358k.setOnClickListener(new View.OnClickListener() { // from class: s7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11159x0(this.f16183a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding8 = null;
        }
        viewFragmentBlackboardEvaluationBinding8.f11354g.setOnClickListener(new View.OnClickListener() { // from class: s7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11161y0(this.f16186a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding9 = null;
        }
        viewFragmentBlackboardEvaluationBinding9.f11356i.setOnClickListener(new View.OnClickListener() { // from class: s7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11163z0(this.f16190a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding10 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding10 = null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding10.f11352e;
        Intrinsics.checkNotNullExpressionValue(ivCamera, "ivCamera");
        AbstractC5046c.m2530f(ivCamera, 0L, new View.OnClickListener() { // from class: s7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11089A0(this.f16194a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding11 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding11 = null;
        }
        ImageView ivQuestion = viewFragmentBlackboardEvaluationBinding11.f11360m;
        Intrinsics.checkNotNullExpressionValue(ivQuestion, "ivQuestion");
        AbstractC5046c.m2530f(ivQuestion, 0L, new View.OnClickListener() { // from class: s7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11091B0(this.f16195a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding12 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding12 = null;
        }
        ImageView ivAnswer = viewFragmentBlackboardEvaluationBinding12.f11351d;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        AbstractC5046c.m2530f(ivAnswer, 0L, new View.OnClickListener() { // from class: s7.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11093C0(this.f16210a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding13 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding13 = null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding13.f11363p;
        Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
        AbstractC5046c.m2530f(ivText, 0L, new View.OnClickListener() { // from class: s7.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11095D0(this.f16211a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding14 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding14 = null;
        }
        viewFragmentBlackboardEvaluationBinding14.f11353f.setOnClickListener(new View.OnClickListener() { // from class: s7.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11103H0(this.f16212a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding15 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding15 = null;
        }
        viewFragmentBlackboardEvaluationBinding15.f11357j.setOnClickListener(new View.OnClickListener() { // from class: s7.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11105I0(this.f16176a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding16 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding16;
        }
        viewFragmentBlackboardEvaluationBinding2.f11355h.setOnTouchListener(new View.OnTouchListener() { // from class: s7.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BlackboardEvaluationFragment.m11107J0(this.f16178a, view, motionEvent);
            }
        });
    }

    /* renamed from: u0 */
    public static final void m11153u0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f11362o;
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m11180b1(ivSelect);
        }
    }

    /* renamed from: v0 */
    public static final void m11155v0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setFingerDraw(!boardConfig.getIsFingerDraw());
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f11364q.setSelected(boardConfig.getIsFingerDraw());
            AbstractC5065v.m2602u(Boolean.valueOf(boardConfig.getIsFingerDraw()));
        }
    }

    /* renamed from: w0 */
    public static final void m11157w0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) throws Resources.NotFoundException {
        blackboardEvaluationFragment.m11167T(true);
    }

    /* renamed from: x0 */
    public static final void m11159x0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            boardConfig.setDottedLine(true, 30.0f, 0.0f);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivLine = viewFragmentBlackboardEvaluationBinding.f11358k;
            Intrinsics.checkNotNullExpressionValue(ivLine, "ivLine");
            blackboardEvaluationFragment.m11180b1(ivLine);
        }
    }

    /* renamed from: y0 */
    public static final void m11161y0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            BoardConfig.setDottedLine$default(boardConfig, true, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.f11354g;
            Intrinsics.checkNotNullExpressionValue(ivDottedLine, "ivDottedLine");
            blackboardEvaluationFragment.m11180b1(ivDottedLine);
        }
    }

    /* renamed from: z0 */
    public static final void m11163z0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11194n0();
        BoardConfig boardConfig = blackboardEvaluationFragment.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivEraser = viewFragmentBlackboardEvaluationBinding.f11356i;
            Intrinsics.checkNotNullExpressionValue(ivEraser, "ivEraser");
            blackboardEvaluationFragment.m11180b1(ivEraser);
        }
    }

    /* renamed from: N0 */
    public final void m11164N0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        RadioGroup rgPenColor = viewFragmentBlackboardEvaluationBinding.f11350c.f11467d;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        RadioGroup rgPenColorProxy = viewFragmentBlackboardEvaluationBinding2.f11349b.f11475d;
        Intrinsics.checkNotNullExpressionValue(rgPenColorProxy, "rgPenColorProxy");
        m11181c0(rgPenColor, rgPenColorProxy);
        m11181c0(rgPenColorProxy, rgPenColor);
    }

    /* renamed from: O0 */
    public final void m11165O0() {
        IBoardControl iBoardControl = this.boardControl;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        InterfaceC8629i interfaceC8629iMo6686a = iBoardControl != null ? iBoardControl.mo6686a() : null;
        this.pageControl = interfaceC8629iMo6686a;
        if (interfaceC8629iMo6686a == null) {
            IBoardControl iBoardControl2 = this.boardControl;
            this.pageControl = iBoardControl2 != null ? IBoardControl.DefaultImpls.m6700a(iBoardControl2, false, null, 3, null) : null;
        }
        InterfaceC8629i interfaceC8629i = this.pageControl;
        if (interfaceC8629i != null) {
            interfaceC8629i.setAreaMoveListener(new C7242e());
        }
        InterfaceC8629i interfaceC8629i2 = this.pageControl;
        if (interfaceC8629i2 != null) {
            interfaceC8629i2.mo6715h(new C7243f());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding2 = null;
        }
        viewFragmentBlackboardEvaluationBinding2.f11365r.setEnabled(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding.f11361n.setEnabled(false);
        InterfaceC8629i interfaceC8629i3 = this.pageControl;
        if (interfaceC8629i3 != null) {
            interfaceC8629i3.mo6732v(new C7244g());
        }
        InterfaceC8629i interfaceC8629i4 = this.pageControl;
        if (interfaceC8629i4 != null) {
            interfaceC8629i4.mo6707D(new C7245h());
        }
    }

    /* renamed from: P0 */
    public final void m11166P0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11355h.post(new Runnable() { // from class: s7.b
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m11118Q0(this.f16177a);
            }
        });
    }

    /* renamed from: T */
    public final void m11167T(boolean toggleColorPanel) throws Resources.NotFoundException {
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_WRITING);
            BoardConfig.setDottedLine$default(boardConfig, false, 0.0f, 0.0f, 6, null);
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        ImageView ivPen = viewFragmentBlackboardEvaluationBinding.f11359l;
        Intrinsics.checkNotNullExpressionValue(ivPen, "ivPen");
        m11180b1(ivPen);
        if (toggleColorPanel) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
            }
            View root = viewFragmentBlackboardEvaluationBinding2.f11350c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            boolean z9 = root.getVisibility() == 0;
            if (!z9) {
                root.setTranslationX(0.0f);
                root.setTranslationY(0.0f);
            }
            root.setVisibility(z9 ? 8 : 0);
            if (z9) {
                return;
            }
            m11172W();
        }
    }

    /* renamed from: T0 */
    public final boolean m11168T0(int color) {
        int i10 = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupM11178Z0 = m11178Z0();
        int childCount = radioGroupM11178Z0.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = radioGroupM11178Z0.getChildAt(i11);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String() & ViewCompat.MEASURED_SIZE_MASK) == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    public final void m11169U(Bitmap bitmap) {
        final ImageGraph imageGraphMo6710c;
        Integer numM15549f;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        InterfaceC8629i interfaceC8629i = this.pageControl;
        int iMo6734y = interfaceC8629i != null ? interfaceC8629i.mo6734y() : 0;
        C9317a c9317a = this.fragmentConfig;
        if (iMo6734y >= ((c9317a == null || (numM15549f = c9317a.m15549f()) == null) ? 3 : numM15549f.intValue())) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return;
        }
        InterfaceC8629i interfaceC8629i2 = this.pageControl;
        if (interfaceC8629i2 == null || (imageGraphMo6710c = interfaceC8629i2.mo6710c(bitmap)) == null) {
            return;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11367t.post(new Runnable() { // from class: s7.l
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m11123V(imageGraphMo6710c, this);
            }
        });
    }

    /* renamed from: U0 */
    public final boolean m11170U0() {
        Integer numM15549f;
        InterfaceC8629i interfaceC8629i = this.pageControl;
        int iMo6734y = interfaceC8629i != null ? interfaceC8629i.mo6734y() : 0;
        C9317a c9317a = this.fragmentConfig;
        return iMo6734y >= ((c9317a == null || (numM15549f = c9317a.m15549f()) == null) ? 3 : numM15549f.intValue());
    }

    /* renamed from: V0 */
    public final boolean m11171V0() {
        InterfaceC8629i interfaceC8629i = this.pageControl;
        return interfaceC8629i != null && interfaceC8629i.mo6722m();
    }

    /* renamed from: W */
    public final void m11172W() throws Resources.NotFoundException {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        View root = viewFragmentBlackboardEvaluationBinding.f11350c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        LinearLayout llEvaluationTools = viewFragmentBlackboardEvaluationBinding2.f11366s;
        Intrinsics.checkNotNullExpressionValue(llEvaluationTools, "llEvaluationTools");
        root.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC7239b(root, getResources().getDimensionPixelSize(R$dimen.view_3), this, llEvaluationTools));
    }

    /* renamed from: W0 */
    public final int m11173W0(int color) {
        int i10 = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupM11178Z0 = m11178Z0();
        int childCount = radioGroupM11178Z0.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = radioGroupM11178Z0.getChildAt(i11);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String() & ViewCompat.MEASURED_SIZE_MASK) == i10) {
                return (color & ViewCompat.MEASURED_STATE_MASK) | (16777215 & normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String());
            }
        }
        return m11174X0(0);
    }

    /* renamed from: X0 */
    public final int m11174X0(int slotIndex) {
        RadioGroup radioGroupM11178Z0 = m11178Z0();
        int childCount = radioGroupM11178Z0.getChildCount();
        if (childCount == 0) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        View childAt = radioGroupM11178Z0.getChildAt(RangesKt.coerceIn(slotIndex, 0, childCount - 1));
        NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
        return normalColorRadioButton == null ? ViewCompat.MEASURED_STATE_MASK : normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String();
    }

    /* renamed from: Y */
    public final void m11175Y(int slotIndex, boolean persist, boolean notifySdkSelectCallback) {
        Function1 function1;
        int iM11174X0 = m11174X0(slotIndex);
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            boardConfig.setPaintColor(iM11174X0);
            boardConfig.setBeelinePaintColor(iM11174X0);
        }
        if (persist) {
            int iM11176Y0 = m11176Y0();
            requireContext().getSharedPreferences("blackboard_evaluation_pen", 0).edit().putInt("pen_color_slot_index", iM11176Y0 > 0 ? RangesKt.coerceIn(slotIndex, 0, iM11176Y0 - 1) : 0).apply();
        }
        if (!notifySdkSelectCallback || (function1 = this.evaluationSelectColorChangeCallback) == null) {
            return;
        }
        function1.invoke(Integer.valueOf(iM11174X0));
    }

    /* renamed from: Y0 */
    public final int m11176Y0() {
        return RangesKt.coerceAtLeast(m11178Z0().getChildCount(), 0);
    }

    /* renamed from: Z */
    public final void m11177Z() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new AlertDialog.Builder(activity, R$style.Theme_AppCompat_Light_Dialog_Alert).setMessage(R$string.clear_canvas).setPositiveButton(getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: s7.s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    BlackboardEvaluationFragment.m11125a0(this.f16205a, dialogInterface, i10);
                }
            }).setNegativeButton(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: s7.t
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    BlackboardEvaluationFragment.m11126b0(dialogInterface, i10);
                }
            }).create().show();
        }
    }

    /* renamed from: Z0 */
    public final RadioGroup m11178Z0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        RadioGroup rgPenColor = viewFragmentBlackboardEvaluationBinding.f11350c.f11467d;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        return rgPenColor;
    }

    /* renamed from: a1 */
    public final int m11179a1(SharedPreferences prefs) {
        if (prefs.contains("pen_color_slot_index")) {
            return RangesKt.coerceIn(prefs.getInt("pen_color_slot_index", 0), 0, RangesKt.coerceAtLeast(m11176Y0() - 1, 0));
        }
        if (!prefs.contains("pen_color_argb")) {
            return 0;
        }
        int iM11195o0 = m11195o0(prefs.getInt("pen_color_argb", ViewCompat.MEASURED_STATE_MASK));
        prefs.edit().putInt("pen_color_slot_index", iM11195o0).remove("pen_color_argb").apply();
        return iM11195o0;
    }

    /* renamed from: b1 */
    public final void m11180b1(View view) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11362o.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f11359l.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f11356i.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f11358k.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding6;
        }
        viewFragmentBlackboardEvaluationBinding2.f11354g.setSelected(false);
        view.setSelected(true);
    }

    /* renamed from: c0 */
    public final void m11181c0(RadioGroup source, final RadioGroup syncTarget) {
        source.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s7.m
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                BlackboardEvaluationFragment.m11129d0(this.f16200a, syncTarget, radioGroup, i10);
            }
        });
    }

    /* renamed from: c1 */
    public final void m11182c1(Function1 pageSlideListener) {
        this.pageSlideListener = pageSlideListener;
    }

    /* renamed from: d1 */
    public final void m11183d1(BoardConfig boardConfig) throws SecurityException {
        Method method;
        Method[] methods = boardConfig.getClass().getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        int length = methods.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                method = null;
                break;
            }
            method = methods[i10];
            if (Intrinsics.areEqual(method.getName(), "setSelectEditColorChangeListener") && method.getParameterTypes().length == 1) {
                break;
            } else {
                i10++;
            }
        }
        if (method == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m24299constructorimpl(method.invoke(boardConfig, new Function1() { // from class: s7.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.m11131e1(this.f16206a, ((Integer) obj).intValue());
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: e0 */
    public final InterfaceC7289a m11184e0() {
        return new C7240c();
    }

    /* renamed from: f0 */
    public final void m11185f0(float y9) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11355h.getGlobalVisibleRect(rect);
        float fCenterY = y9 - this.dragRect.centerY();
        float f10 = this.defaultTranslateTop;
        float f11 = this.defaultTranslateBottom;
        C9317a c9317a = this.fragmentConfig;
        float fM15544a = f11 - (c9317a != null ? c9317a.m15544a() : 0.0f);
        if (fCenterY < f10) {
            fCenterY = f10;
        }
        if (fCenterY <= fM15544a) {
            fM15544a = fCenterY;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f11369v.setTranslationY(fM15544a);
    }

    /* renamed from: f1 */
    public final void m11186f1(boolean canDoEdit) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f11369v.setCanTouch(canDoEdit);
    }

    /* renamed from: g0 */
    public final void m11187g0() {
        Integer numM15549f;
        InterfaceC8629i interfaceC8629i = this.pageControl;
        int iMo6734y = interfaceC8629i != null ? interfaceC8629i.mo6734y() : 0;
        C9317a c9317a = this.fragmentConfig;
        if (iMo6734y >= ((c9317a == null || (numM15549f = c9317a.m15549f()) == null) ? 3 : numM15549f.intValue())) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C5060q.m2536D(this.imagePicker, null, true, new Function1() { // from class: s7.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.m11135h0(this.f16204a, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: g1 */
    public final void m11188g1(int color) {
        int iM11195o0 = m11195o0(m11173W0(color));
        m11175Y(iM11195o0, true, false);
        m11189h1(iM11195o0);
    }

    /* renamed from: h1 */
    public final void m11189h1(int slotIndex) {
        int iM11176Y0 = m11176Y0();
        if (iM11176Y0 == 0) {
            return;
        }
        int iCoerceIn = RangesKt.coerceIn(slotIndex, 0, iM11176Y0 - 1);
        this.suppressPenColorSync = true;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        View childAt = viewFragmentBlackboardEvaluationBinding.f11350c.f11467d.getChildAt(iCoerceIn);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding3 = null;
            }
            viewFragmentBlackboardEvaluationBinding3.f11350c.f11467d.check(radioButton.getId());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        View childAt2 = viewFragmentBlackboardEvaluationBinding4.f11349b.f11475d.getChildAt(iCoerceIn);
        RadioButton radioButton2 = childAt2 instanceof RadioButton ? (RadioButton) childAt2 : null;
        if (radioButton2 != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding5;
            }
            viewFragmentBlackboardEvaluationBinding2.f11349b.f11475d.check(radioButton2.getId());
        }
        this.suppressPenColorSync = false;
    }

    /* renamed from: j0 */
    public final File m11190j0(Context context, String sourcePath) {
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
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                bitmapCreateBitmap.recycle();
                if (zCompress) {
                    return file;
                }
                FileUtils.delete(file);
                return null;
            } finally {
            }
        }
        bitmapDecodeFile.recycle();
        return null;
    }

    /* renamed from: k0 */
    public final void m11191k0(C9317a config) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.f11354g;
        Intrinsics.checkNotNullExpressionValue(ivDottedLine, "ivDottedLine");
        ivDottedLine.setVisibility(config.m15553j() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding3.f11352e;
        Intrinsics.checkNotNullExpressionValue(ivCamera, "ivCamera");
        ivCamera.setVisibility(config.m15552i() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        ImageView ivDrag = viewFragmentBlackboardEvaluationBinding4.f11355h;
        Intrinsics.checkNotNullExpressionValue(ivDrag, "ivDrag");
        ivDrag.setVisibility(!config.m15548e() ? 4 : 0);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        ImageView ivWithdraw = viewFragmentBlackboardEvaluationBinding5.f11365r;
        Intrinsics.checkNotNullExpressionValue(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(config.m15558o() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding6 = null;
        }
        ImageView ivRecover = viewFragmentBlackboardEvaluationBinding6.f11361n;
        Intrinsics.checkNotNullExpressionValue(ivRecover, "ivRecover");
        ivRecover.setVisibility(config.m15555l() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding7 = null;
        }
        ImageView ivSelect = viewFragmentBlackboardEvaluationBinding7.f11362o;
        Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
        ivSelect.setVisibility(config.m15556m() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding8 = null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding8.f11363p;
        Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
        ivText.setVisibility(config.m15557n() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding9 = null;
        }
        ImageView ivQuestion = viewFragmentBlackboardEvaluationBinding9.f11360m;
        Intrinsics.checkNotNullExpressionValue(ivQuestion, "ivQuestion");
        ivQuestion.setVisibility(config.m15554k() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding10 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding10;
        }
        ImageView ivAnswer = viewFragmentBlackboardEvaluationBinding2.f11351d;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        ivAnswer.setVisibility(config.m15551h() ? 0 : 8);
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            Integer numM15550g = config.m15550g();
            if (numM15550g != null) {
                boardConfig.getMoveActionConfig().m12002j(numM15550g.intValue());
            }
            Integer numM15549f = config.m15549f();
            if (numM15549f != null) {
                boardConfig.setMaxImageSize(numM15549f.intValue());
            }
            boardConfig.setAddTextOriginalTextSize(config.m15547d());
        }
    }

    /* renamed from: l0 */
    public final Bitmap m11192l0(int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isBoardAsWidth) {
        InterfaceC8629i interfaceC8629i = this.pageControl;
        if (interfaceC8629i != null) {
            return InterfaceC8629i.a.m14210f(interfaceC8629i, horizontalOffset, verticalOffset, minWidth, minHeight, isBoardAsWidth, true, false, null, 192, null);
        }
        return null;
    }

    /* renamed from: m0 */
    public final void m11193m0(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            m11185f0(event.getRawY());
        } else if (action == 1) {
            m11185f0(event.getRawY());
        } else {
            if (action != 2) {
                return;
            }
            m11185f0(event.getRawY());
        }
    }

    /* renamed from: n0 */
    public final void m11194n0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        View root = viewFragmentBlackboardEvaluationBinding.f11350c.getRoot();
        root.setTranslationX(0.0f);
        root.setTranslationY(0.0f);
        Intrinsics.checkNotNull(root);
        root.setVisibility(8);
    }

    /* renamed from: o0 */
    public final int m11195o0(int color) {
        int i10 = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupM11178Z0 = m11178Z0();
        int childCount = radioGroupM11178Z0.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = radioGroupM11178Z0.getChildAt(i11);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String() & ViewCompat.MEASURED_SIZE_MASK) == i10) {
                return i11;
            }
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m11113M0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBindingM11390a = ViewFragmentBlackboardEvaluationBinding.m11390a(inflater);
        C9317a c9317a = this.fragmentConfig;
        if (c9317a == null || !c9317a.m15548e()) {
            C9317a c9317a2 = this.fragmentConfig;
            float screenHeight = (ScreenUtils.getScreenHeight() * (1.0f - (c9317a2 != null ? c9317a2.m15546c() : 0.5f))) - getResources().getDimensionPixelSize(R$dimen.view_9);
            SketchRecorderView sketchView = viewFragmentBlackboardEvaluationBindingM11390a.f11367t;
            Intrinsics.checkNotNullExpressionValue(sketchView, "sketchView");
            ViewGroup.LayoutParams layoutParams = sketchView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = (int) screenHeight;
            sketchView.setLayoutParams(layoutParams);
        } else {
            Integer numValueOf = container != null ? Integer.valueOf(container.getHeight()) : null;
            SketchRecorderView sketchView2 = viewFragmentBlackboardEvaluationBindingM11390a.f11367t;
            Intrinsics.checkNotNullExpressionValue(sketchView2, "sketchView");
            ViewGroup.LayoutParams layoutParams2 = sketchView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (numValueOf == null || numValueOf.intValue() <= 0) ? -1 : numValueOf.intValue() - getResources().getDimensionPixelSize(R$dimen.view_38);
            sketchView2.setLayoutParams(layoutParams2);
        }
        Intrinsics.checkNotNull(viewFragmentBlackboardEvaluationBindingM11390a);
        this.mBinding = viewFragmentBlackboardEvaluationBindingM11390a;
        View root = viewFragmentBlackboardEvaluationBindingM11390a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11122S0();
    }

    /* renamed from: p0 */
    public final void m11196p0() {
        String absolutePath;
        File externalCacheDir;
        if (this.path == null) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            this.path = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        m11186f1(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBlackboardEvaluationBinding.f11367t;
        String str = this.path;
        Intrinsics.checkNotNull(str);
        sketchRecorderView.m6188b(str, new Function3() { // from class: s7.j
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BlackboardEvaluationFragment.m11146q0(this.f16196a, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new Function1() { // from class: s7.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m11148r0(this.f16197a, (Throwable) obj);
            }
        });
    }

    /* renamed from: s0 */
    public final void m11197s0() throws SecurityException {
        IBoardControl iBoardControl = this.boardControl;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        this.boardConfig = iBoardControl != null ? iBoardControl.getConfig() : null;
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("blackboard_evaluation_pen", 0);
        Intrinsics.checkNotNull(sharedPreferences);
        int iM11179a1 = m11179a1(sharedPreferences);
        int iM11174X0 = m11174X0(iM11179a1);
        int i10 = sharedPreferences.getInt("text_color_argb", ViewCompat.MEASURED_STATE_MASK);
        BoardConfig boardConfig = this.boardConfig;
        if (boardConfig != null) {
            Boolean boolM2591j = AbstractC5065v.m2591j();
            boardConfig.setFingerDraw(boolM2591j != null ? boolM2591j.booleanValue() : true);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding2;
            }
            viewFragmentBlackboardEvaluationBinding.f11364q.setSelected(boardConfig.getIsFingerDraw());
            boardConfig.setMaxImageSize(2);
            boardConfig.setImageBackground(true);
            boardConfig.setPaintWidth(3.0f);
            boardConfig.setBeelinePaintWidth(3.0f);
            boardConfig.setPaintColor(iM11174X0);
            boardConfig.setBeelinePaintColor(iM11174X0);
            boardConfig.setSelectEditColorList(f11139o);
            boardConfig.setSelectCustomColorView(m11184e0());
            m11183d1(boardConfig);
            boardConfig.setBackgroundColor(-1);
            C7438c moveActionConfig = boardConfig.getMoveActionConfig();
            moveActionConfig.m12004l(true);
            moveActionConfig.m12007o(true);
            moveActionConfig.m12002j(3);
            moveActionConfig.m12003k(1);
            boardConfig.setAddTextOriginalTextColor(i10);
            boardConfig.setAddTextOriginalTextSize(68.0f);
            boardConfig.setAddTextOriginalTextMinSize(68.0f);
            boardConfig.setAddTextOriginalTextMaxSize(88.0f);
            boardConfig.setImageCropView(new C7241d());
        }
        m11189h1(iM11179a1);
    }
}
