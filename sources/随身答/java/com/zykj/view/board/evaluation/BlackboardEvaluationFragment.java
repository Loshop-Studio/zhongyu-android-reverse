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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p161io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p084d5.InterfaceC7751k;
import p119g7.DialogC8078l;
import p127h5.C8101d;
import p181m7.AbstractC9026c;
import p181m7.AbstractC9040q;
import p181m7.C9037n;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9477e;
import p243s5.InterfaceC9478f;
import p243s5.InterfaceC9482j;
import p253t5.InterfaceC9615a;
import p253t5.InterfaceC9616b;
import p272v4.C9763b;
import p272v4.C9765d;

@Metadata(m13412d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0082\u00012\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020)2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020)H\u0002¢\u0006\u0004\b4\u0010.J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00042\u0006\u00103\u001a\u00020)H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\bB\u0010=J\u0017\u0010C\u001a\u00020)2\u0006\u00103\u001a\u00020)H\u0002¢\u0006\u0004\bC\u0010.J\u0017\u0010D\u001a\u00020\t2\u0006\u00103\u001a\u00020)H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010P\u001a\u00020\u00042\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ+\u0010V\u001a\u00020\u00192\u0006\u0010S\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0004H\u0016¢\u0006\u0004\bZ\u0010\u0003R\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR$\u0010s\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010|R&\u0010\u0081\u0001\u001a\u0010\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010r¨\u0006\u0083\u0001"}, m13413d2 = {"Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "G0", "M0", "n0", "J0", "", "canDoEdit", "W0", "(Z)V", "j0", "m0", "Landroid/content/Context;", "context", "", "sourcePath", "Ljava/io/File;", "f0", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "I0", "c0", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/View;", "view", "T0", "(Landroid/view/View;)V", "h0", "toggleColorPanel", "R", "H0", ExifInterface.LATITUDE_SOUTH, "Landroid/widget/RadioGroup;", "source", "syncTarget", "Y", "(Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;)V", "R0", "()Landroid/widget/RadioGroup;", "", "Q0", "()I", "slotIndex", "P0", "(I)I", "Landroid/content/SharedPreferences;", "prefs", "S0", "(Landroid/content/SharedPreferences;)I", TypedValues.Custom.S_COLOR, "i0", "Lt5/a;", "a0", "()Lt5/a;", "persist", "notifySdkSelectCallback", "U", "(IZZ)V", "X0", "(I)V", "Lv4/b;", "boardConfig", "U0", "(Lv4/b;)V", "Y0", "O0", "N0", "(I)Z", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "g0", "(Landroid/view/MotionEvent;)V", "", "y", "b0", "(F)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lm7/n;", "a", "Lm7/n;", "imagePicker", "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;", "b", "Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;", "mBinding", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "c", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "boardControl", "Ld5/k;", "d", "Ld5/k;", "pageControl", "e", "Lv4/b;", "f", "Ljava/lang/String;", "path", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "evaluationSelectColorChangeCallback", "h", "Z", "suppressPenColorSync", "Landroid/graphics/Rect;", "i", "Landroid/graphics/Rect;", "dragRect", "j", "F", "defaultTranslateTop", "k", "defaultTranslateBottom", "l", "pageSlideListener", "m", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1042:1\n311#2:1043\n327#2,4:1044\n312#2:1048\n311#2:1049\n327#2,4:1050\n312#2:1054\n257#2,2:1061\n257#2,2:1063\n278#2,2:1065\n257#2,2:1067\n257#2,2:1069\n257#2,2:1071\n257#2,2:1073\n257#2,2:1075\n257#2,2:1077\n257#2,2:1079\n255#2:1081\n257#2,2:1082\n83#3,6:1055\n1310#4,2:1084\n1#5:1086\n346#6,8:1087\n*S KotlinDebug\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment\n*L\n130#1:1043\n130#1:1044,4\n130#1:1048\n144#1:1049\n144#1:1050,4\n144#1:1054\n672#1:1061,2\n674#1:1063,2\n676#1:1065,2\n678#1:1067,2\n680#1:1069,2\n682#1:1071,2\n684#1:1073,2\n686#1:1075,2\n688#1:1077,2\n723#1:1079,2\n738#1:1081\n743#1:1082,2\n512#1:1055,6\n931#1:1084,2\n798#1:1087,8\n*E\n"})
/* loaded from: classes5.dex */
public final class BlackboardEvaluationFragment extends Fragment {

    /* renamed from: n */
    public static final List f12362n = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#007DFE")), Integer.valueOf(Color.parseColor("#FE3720"))});

    /* renamed from: b, reason: from kotlin metadata */
    public ViewFragmentBlackboardEvaluationBinding mBinding;

    /* renamed from: c, reason: from kotlin metadata */
    public IBoardControl boardControl;

    /* renamed from: d, reason: from kotlin metadata */
    public InterfaceC7751k pageControl;

    /* renamed from: e, reason: from kotlin metadata */
    public C9763b boardConfig;

    /* renamed from: f, reason: from kotlin metadata */
    public String path;

    /* renamed from: g, reason: from kotlin metadata */
    public Function1 evaluationSelectColorChangeCallback;

    /* renamed from: h, reason: from kotlin metadata */
    public boolean suppressPenColorSync;

    /* renamed from: j, reason: from kotlin metadata */
    public float defaultTranslateTop;

    /* renamed from: k, reason: from kotlin metadata */
    public float defaultTranslateBottom;

    /* renamed from: l, reason: from kotlin metadata */
    public Function1 pageSlideListener;

    /* renamed from: a, reason: from kotlin metadata */
    public final C9037n imagePicker = new C9037n(this, null, 2, null);

    /* renamed from: i, reason: from kotlin metadata */
    public Rect dragRect = new Rect();

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$b */
    public static final class ViewTreeObserverOnPreDrawListenerC7689b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f12375a;

        /* renamed from: b */
        public final /* synthetic */ int f12376b;

        /* renamed from: c */
        public final /* synthetic */ BlackboardEvaluationFragment f12377c;

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f12378d;

        public ViewTreeObserverOnPreDrawListenerC7689b(View view, int i9, BlackboardEvaluationFragment blackboardEvaluationFragment, LinearLayout linearLayout) {
            this.f12375a = view;
            this.f12376b = i9;
            this.f12377c = blackboardEvaluationFragment;
            this.f12378d = linearLayout;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f12375a.getWidth() != 0 && this.f12375a.getHeight() != 0) {
                BlackboardEvaluationFragment.m11584T(this.f12375a, this.f12376b, this.f12377c, this.f12378d);
                this.f12375a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$c */
    public static final class C7690c implements InterfaceC9615a {
        public C7690c() {
        }

        /* renamed from: f */
        public static final Unit m11659f(Function1 function1, BlackboardEvaluationFragment blackboardEvaluationFragment, int i9) {
            function1.invoke(Integer.valueOf(i9));
            blackboardEvaluationFragment.m11646X0(i9);
            return Unit.INSTANCE;
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: a */
        public void mo11222a(Integer num) {
            if (num == null) {
                return;
            }
            BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
            int iM11655i0 = blackboardEvaluationFragment.m11655i0(blackboardEvaluationFragment.m11634O0(num.intValue()));
            BlackboardEvaluationFragment.this.m11642U(iM11655i0, true, true);
            BlackboardEvaluationFragment.this.m11648Y0(iM11655i0);
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: b */
        public void mo11223b(Integer num) {
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: c */
        public boolean mo11224c(int i9) {
            return BlackboardEvaluationFragment.this.m11633N0(i9);
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: d */
        public void mo11225d(final Function1 function1) {
            final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
            blackboardEvaluationFragment.evaluationSelectColorChangeCallback = function1 != null ? new Function1() { // from class: d7.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.C7690c.m11659f(function1, blackboardEvaluationFragment, ((Integer) obj).intValue());
                }
            } : null;
        }

        @Override // p253t5.InterfaceC9615a
        public void dispatchTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = BlackboardEvaluationFragment.this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f12592a.dispatchTouchEvent(event);
        }

        @Override // p253t5.InterfaceC9615a
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = BlackboardEvaluationFragment.this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f12592a.draw(canvas);
        }

        @Override // p253t5.InterfaceC9615a
        public float getHeight() {
            return BlackboardEvaluationFragment.this.getResources().getDimension(R$dimen.evaluation_pen_color_strip_height);
        }

        @Override // p253t5.InterfaceC9615a
        public float getWidth() {
            return BlackboardEvaluationFragment.this.getResources().getDimension(R$dimen.evaluation_pen_color_strip_width);
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$d */
    public static final class C7691d implements InterfaceC9616b {
        public C7691d() {
        }

        /* renamed from: c */
        public static final Unit m11661c(File file, Function1 function1, Function0 function0, Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
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

        @Override // p253t5.InterfaceC9616b
        /* renamed from: a */
        public void mo11221a(String imageLocalPath, final Function1 doneCallback, final Function0 cancelCallback) {
            Uri uriFile2Uri;
            Intrinsics.checkNotNullParameter(imageLocalPath, "imageLocalPath");
            Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
            Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
            Context context = BlackboardEvaluationFragment.this.getContext();
            if (context == null || StringsKt.isBlank(imageLocalPath)) {
                cancelCallback.invoke();
                return;
            }
            final File fileM11652f0 = BlackboardEvaluationFragment.this.m11652f0(context, imageLocalPath);
            if (fileM11652f0 == null || (uriFile2Uri = UriUtils.file2Uri(fileM11652f0)) == null) {
                uriFile2Uri = UriUtils.file2Uri(new File(imageLocalPath));
            }
            if (uriFile2Uri != null) {
                BlackboardEvaluationFragment.this.imagePicker.m14420r(uriFile2Uri, new Function1() { // from class: d7.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BlackboardEvaluationFragment.C7691d.m11661c(fileM11652f0, doneCallback, cancelCallback, (Uri) obj);
                    }
                });
                return;
            }
            if (fileM11652f0 != null) {
                FileUtils.delete(fileM11652f0);
            }
            cancelCallback.invoke();
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$e */
    public static final class C7692e implements InterfaceC9476d {
        public C7692e() {
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: a */
        public void mo2221a(float f10) {
            Log.i("BlackboardEvaluation", "onHorizontalMove -> " + f10);
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: b */
        public void mo2222b(float f10) {
            Function1 function1 = BlackboardEvaluationFragment.this.pageSlideListener;
            if (function1 != null) {
                function1.invoke(Float.valueOf(f10));
            }
            Log.i("BlackboardEvaluation", "onVerticalMove -> " + f10);
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: c */
        public void mo2223c() {
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: d */
        public void mo2224d() {
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$f */
    public static final class C7693f implements InterfaceC9482j {
        public C7693f() {
        }

        /* renamed from: c */
        public static final void m11663c(BlackboardEvaluationFragment blackboardEvaluationFragment, boolean z9, boolean z10) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f12609r.setEnabled(z9);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
            }
            viewFragmentBlackboardEvaluationBinding2.f12605n.setEnabled(z10);
        }

        @Override // p243s5.InterfaceC9482j
        /* renamed from: a */
        public void mo2218a(final boolean z9, final boolean z10) {
            FragmentActivity activity = BlackboardEvaluationFragment.this.getActivity();
            if (activity != null) {
                final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: d7.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.C7693f.m11663c(blackboardEvaluationFragment, z9, z10);
                    }
                });
            }
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$g */
    public static final class C7694g implements InterfaceC9477e {
        public C7694g() {
        }

        @Override // p243s5.InterfaceC9477e
        /* renamed from: a */
        public void mo2220a(int i9) {
            BlackboardEvaluationFragment.this.m11646X0(i9);
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$h */
    public static final class C7695h implements InterfaceC9478f {
        public C7695h() {
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: a */
        public void mo2227a(float f10) {
            C9763b c9763b = BlackboardEvaluationFragment.this.boardConfig;
            if (c9763b != null) {
                c9763b.m16474Y(f10);
            }
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: b */
        public void mo2228b() {
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: c */
        public void mo2229c(int i9, float f10) {
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: d */
        public void mo2230d(int i9) {
            C9763b c9763b = BlackboardEvaluationFragment.this.boardConfig;
            if (c9763b != null) {
                c9763b.m16471V(i9);
            }
            BlackboardEvaluationFragment.this.requireContext().getSharedPreferences("blackboard_evaluation_pen", 0).edit().putInt("text_color_argb", i9).apply();
        }
    }

    /* renamed from: A0 */
    public static final Unit m11558A0() {
        return Unit.INSTANCE;
    }

    /* renamed from: B0 */
    public static final void m11560B0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        blackboardEvaluationFragment.m11644V();
    }

    /* renamed from: C0 */
    public static final void m11562C0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
    }

    /* renamed from: D0 */
    public static final boolean m11564D0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNull(motionEvent);
        blackboardEvaluationFragment.m11653g0(motionEvent);
        return true;
    }

    /* renamed from: E0 */
    public static final void m11566E0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        InterfaceC7751k interfaceC7751k = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k != null) {
            interfaceC7751k.mo7835o();
        }
    }

    /* renamed from: F0 */
    public static final void m11568F0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        InterfaceC7751k interfaceC7751k = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k != null) {
            interfaceC7751k.mo7814B();
        }
    }

    /* renamed from: G0 */
    private final void m11570G0() {
        Bundle arguments = getArguments();
        this.path = arguments != null ? arguments.getString("path") : null;
    }

    /* renamed from: K0 */
    public static final void m11575K0(final BlackboardEvaluationFragment blackboardEvaluationFragment) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12599h.getGlobalVisibleRect(blackboardEvaluationFragment.dragRect);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f12613v.post(new Runnable() { // from class: d7.k
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m11577L0(this.f13095a);
            }
        });
    }

    /* renamed from: L0 */
    public static final void m11577L0(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12613v.getGlobalVisibleRect(rect);
        Log.i("initTranslationConfig", rect + " " + blackboardEvaluationFragment.dragRect);
        blackboardEvaluationFragment.defaultTranslateTop = 0.0f;
        blackboardEvaluationFragment.defaultTranslateBottom = (float) (rect.bottom - blackboardEvaluationFragment.dragRect.bottom);
        blackboardEvaluationFragment.m11650b0(((float) ScreenUtils.getScreenHeight()) * 0.5f);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f12613v.setVisibility(0);
    }

    /* renamed from: M0 */
    private final void m11579M0() {
        m11605n0();
        m11630H0();
        m11656j0();
        m11632J0();
    }

    /* renamed from: T */
    public static final void m11584T(View view, int i9, BlackboardEvaluationFragment blackboardEvaluationFragment, LinearLayout linearLayout) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12603l.getGlobalVisibleRect(rect);
        linearLayout.getGlobalVisibleRect(new Rect());
        view.getGlobalVisibleRect(new Rect());
        view.setTranslationX(rect.left - r5.left);
        view.setTranslationY((r4.bottom + i9) - r5.top);
    }

    /* renamed from: V0 */
    public static final Unit m11585V0(BlackboardEvaluationFragment blackboardEvaluationFragment, int i9) {
        blackboardEvaluationFragment.m11646X0(i9);
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final void m11586W(BlackboardEvaluationFragment blackboardEvaluationFragment, DialogInterface dialogInterface, int i9) {
        InterfaceC7751k interfaceC7751k = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k != null) {
            InterfaceC7751k.a.m12101e(interfaceC7751k, null, 1, null);
        }
    }

    /* renamed from: X */
    public static final void m11587X(DialogInterface dialogInterface, int i9) {
        dialogInterface.dismiss();
    }

    /* renamed from: Z */
    public static final void m11588Z(BlackboardEvaluationFragment blackboardEvaluationFragment, RadioGroup radioGroup, RadioGroup radioGroup2, int i9) {
        if (blackboardEvaluationFragment.suppressPenColorSync) {
            return;
        }
        int i10 = -1;
        if (i9 == -1) {
            return;
        }
        Iterator<Integer> it = RangesKt.until(0, radioGroup2.getChildCount()).iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iNextInt = ((IntIterator) it).nextInt();
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (radioGroup2.getChildAt(iNextInt).getId() == i9) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0 || i10 >= blackboardEvaluationFragment.m11636Q0()) {
            return;
        }
        blackboardEvaluationFragment.suppressPenColorSync = true;
        View childAt = radioGroup.getChildAt(i10);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton != null) {
            radioGroup.check(radioButton.getId());
        }
        blackboardEvaluationFragment.suppressPenColorSync = false;
        blackboardEvaluationFragment.m11642U(i10, true, true);
    }

    /* renamed from: d0 */
    public static final Unit m11591d0(final BlackboardEvaluationFragment blackboardEvaluationFragment, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        InterfaceC7751k interfaceC7751k = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k != null) {
            String absolutePath = fileUri2FileNoCacheCopy.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            final ImageGraph imageGraphMo7815C = interfaceC7751k.mo7815C(absolutePath);
            if (imageGraphMo7815C != null) {
                FileUtils.delete(fileUri2FileNoCacheCopy);
                ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
                if (viewFragmentBlackboardEvaluationBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    viewFragmentBlackboardEvaluationBinding = null;
                }
                viewFragmentBlackboardEvaluationBinding.f12611t.post(new Runnable() { // from class: d7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.m11593e0(imageGraphMo7815C, blackboardEvaluationFragment);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static final void m11593e0(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        C9765d c9765dM16519z;
        float f10 = imageGraph.mo12795c().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.f12611t.getHeight();
        C9763b c9763b = blackboardEvaluationFragment.boardConfig;
        float fM16523b = f10 / (height * (((c9763b == null || (c9765dM16519z = c9763b.m16519z()) == null) ? 2 : c9765dM16519z.m16523b()) - 1));
        InterfaceC7751k interfaceC7751k = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k != null) {
            interfaceC7751k.areaMoveStart();
        }
        InterfaceC7751k interfaceC7751k2 = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k2 != null) {
            InterfaceC7751k.a.m12100d(interfaceC7751k2, null, Float.valueOf(fM16523b), 1, null);
        }
        Function1 function1 = blackboardEvaluationFragment.pageSlideListener;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fM16523b));
        }
    }

    /* renamed from: k0 */
    public static final Unit m11600k0(BlackboardEvaluationFragment blackboardEvaluationFragment, IBoardControl boardControl, boolean z9, long j9) throws Resources.NotFoundException, SecurityException {
        Intrinsics.checkNotNullParameter(boardControl, "boardControl");
        blackboardEvaluationFragment.boardControl = boardControl;
        blackboardEvaluationFragment.m11657m0();
        blackboardEvaluationFragment.m11631I0();
        blackboardEvaluationFragment.m11637R(false);
        blackboardEvaluationFragment.m11645W0(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12612u.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* renamed from: l0 */
    public static final Unit m11602l0(BlackboardEvaluationFragment blackboardEvaluationFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToastUtils.showShort("加载失败,清除缓存后再试", new Object[0]);
        blackboardEvaluationFragment.m11645W0(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12612u.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* renamed from: n0 */
    private final void m11605n0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12609r.setOnClickListener(new View.OnClickListener() { // from class: d7.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11566E0(this.f13104a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f12605n.setOnClickListener(new View.OnClickListener() { // from class: d7.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11568F0(this.f13076a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f12606o.setOnClickListener(new View.OnClickListener() { // from class: d7.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11607o0(this.f13078a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f12608q.setOnClickListener(new View.OnClickListener() { // from class: d7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11609p0(this.f13077a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding6 = null;
        }
        viewFragmentBlackboardEvaluationBinding6.f12603l.setOnClickListener(new View.OnClickListener() { // from class: d7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                BlackboardEvaluationFragment.m11611q0(this.f13079a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding7 = null;
        }
        viewFragmentBlackboardEvaluationBinding7.f12602k.setOnClickListener(new View.OnClickListener() { // from class: d7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11613r0(this.f13082a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding8 = null;
        }
        viewFragmentBlackboardEvaluationBinding8.f12598g.setOnClickListener(new View.OnClickListener() { // from class: d7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11615s0(this.f13086a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding9 = null;
        }
        viewFragmentBlackboardEvaluationBinding9.f12600i.setOnClickListener(new View.OnClickListener() { // from class: d7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11617t0(this.f13090a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding10 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding10 = null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding10.f12596e;
        Intrinsics.checkNotNullExpressionValue(ivCamera, "ivCamera");
        AbstractC9026c.m14393f(ivCamera, 0L, new View.OnClickListener() { // from class: d7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11619u0(this.f13091a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding11 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding11 = null;
        }
        ImageView ivQuestion = viewFragmentBlackboardEvaluationBinding11.f12604m;
        Intrinsics.checkNotNullExpressionValue(ivQuestion, "ivQuestion");
        AbstractC9026c.m14393f(ivQuestion, 0L, new View.OnClickListener() { // from class: d7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11621v0(this.f13092a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding12 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding12 = null;
        }
        ImageView ivAnswer = viewFragmentBlackboardEvaluationBinding12.f12595d;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        AbstractC9026c.m14393f(ivAnswer, 0L, new View.OnClickListener() { // from class: d7.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11623w0(this.f13105a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding13 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding13 = null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding13.f12607p;
        Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
        AbstractC9026c.m14393f(ivText, 0L, new View.OnClickListener() { // from class: d7.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11625x0(this.f13106a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding14 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding14 = null;
        }
        viewFragmentBlackboardEvaluationBinding14.f12597f.setOnClickListener(new View.OnClickListener() { // from class: d7.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11560B0(this.f13107a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding15 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding15 = null;
        }
        viewFragmentBlackboardEvaluationBinding15.f12601j.setOnClickListener(new View.OnClickListener() { // from class: d7.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m11562C0(this.f13108a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding16 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding16;
        }
        viewFragmentBlackboardEvaluationBinding2.f12599h.setOnTouchListener(new View.OnTouchListener() { // from class: d7.z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BlackboardEvaluationFragment.m11564D0(this.f13109a, view, motionEvent);
            }
        });
    }

    /* renamed from: o0 */
    public static final void m11607o0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        C9763b c9763b = blackboardEvaluationFragment.boardConfig;
        if (c9763b != null) {
            c9763b.m16498l0(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f12606o;
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m11641T0(ivSelect);
        }
    }

    /* renamed from: p0 */
    public static final void m11609p0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        C9763b c9763b = blackboardEvaluationFragment.boardConfig;
        if (c9763b != null) {
            c9763b.m16486f0(!c9763b.m16467R());
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f12608q.setSelected(c9763b.m16467R());
            AbstractC9040q.m14451u(Boolean.valueOf(c9763b.m16467R()));
        }
    }

    /* renamed from: q0 */
    public static final void m11611q0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) throws Resources.NotFoundException {
        blackboardEvaluationFragment.m11637R(true);
    }

    /* renamed from: r0 */
    public static final void m11613r0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        C9763b c9763b = blackboardEvaluationFragment.boardConfig;
        if (c9763b != null) {
            c9763b.m16498l0(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            c9763b.m16481c0(true, 30.0f, 0.0f);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivLine = viewFragmentBlackboardEvaluationBinding.f12602k;
            Intrinsics.checkNotNullExpressionValue(ivLine, "ivLine");
            blackboardEvaluationFragment.m11641T0(ivLine);
        }
    }

    /* renamed from: s0 */
    public static final void m11615s0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        C9763b c9763b = blackboardEvaluationFragment.boardConfig;
        if (c9763b != null) {
            c9763b.m16498l0(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            C9763b.m16449d0(c9763b, true, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.f12598g;
            Intrinsics.checkNotNullExpressionValue(ivDottedLine, "ivDottedLine");
            blackboardEvaluationFragment.m11641T0(ivDottedLine);
        }
    }

    /* renamed from: t0 */
    public static final void m11617t0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        C9763b c9763b = blackboardEvaluationFragment.boardConfig;
        if (c9763b != null) {
            c9763b.m16498l0(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivEraser = viewFragmentBlackboardEvaluationBinding.f12600i;
            Intrinsics.checkNotNullExpressionValue(ivEraser, "ivEraser");
            blackboardEvaluationFragment.m11641T0(ivEraser);
        }
    }

    /* renamed from: u0 */
    public static final void m11619u0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        blackboardEvaluationFragment.m11651c0();
    }

    /* renamed from: v0 */
    public static final void m11621v0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
    }

    /* renamed from: w0 */
    public static final void m11623w0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
    }

    /* renamed from: x0 */
    public static final void m11625x0(final BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m11654h0();
        FragmentActivity fragmentActivityRequireActivity = blackboardEvaluationFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        new DialogC8078l(fragmentActivityRequireActivity, 0, 2, null).m12897s("", new Function1() { // from class: d7.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m11627y0((String) obj);
            }
        }, new Function1() { // from class: d7.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m11629z0(this.f13098a, (String) obj);
            }
        }, new Function0() { // from class: d7.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackboardEvaluationFragment.m11558A0();
            }
        });
    }

    /* renamed from: y0 */
    public static final Unit m11627y0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: z0 */
    public static final Unit m11629z0(BlackboardEvaluationFragment blackboardEvaluationFragment, String content) {
        C8101d c8101dMo7838q;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC7751k interfaceC7751k = blackboardEvaluationFragment.pageControl;
        if (interfaceC7751k != null && (c8101dMo7838q = interfaceC7751k.mo7838q(content, EzyPositionEnum.PositionEnum.TOP_CENTER, 20)) != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.mBinding;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f12606o;
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m11641T0(ivSelect);
            InterfaceC7751k interfaceC7751k2 = blackboardEvaluationFragment.pageControl;
            if (interfaceC7751k2 != null) {
                interfaceC7751k2.mo7818F(CollectionsKt.listOf(c8101dMo7838q.getId()));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: H0 */
    public final void m11630H0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        RadioGroup rgPenColor = viewFragmentBlackboardEvaluationBinding.f12594c.f12711d;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        RadioGroup rgPenColorProxy = viewFragmentBlackboardEvaluationBinding2.f12593b.f12719d;
        Intrinsics.checkNotNullExpressionValue(rgPenColorProxy, "rgPenColorProxy");
        m11647Y(rgPenColor, rgPenColorProxy);
        m11647Y(rgPenColorProxy, rgPenColor);
    }

    /* renamed from: I0 */
    public final void m11631I0() {
        IBoardControl iBoardControl = this.boardControl;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        InterfaceC7751k interfaceC7751kMo7794a = iBoardControl != null ? iBoardControl.mo7794a() : null;
        this.pageControl = interfaceC7751kMo7794a;
        if (interfaceC7751kMo7794a == null) {
            IBoardControl iBoardControl2 = this.boardControl;
            this.pageControl = iBoardControl2 != null ? IBoardControl.DefaultImpls.m7809a(iBoardControl2, false, null, 3, null) : null;
        }
        InterfaceC7751k interfaceC7751k = this.pageControl;
        if (interfaceC7751k != null) {
            interfaceC7751k.setAreaMoveListener(new C7692e());
        }
        InterfaceC7751k interfaceC7751k2 = this.pageControl;
        if (interfaceC7751k2 != null) {
            interfaceC7751k2.mo7822e(new C7693f());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding2 = null;
        }
        viewFragmentBlackboardEvaluationBinding2.f12609r.setEnabled(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding.f12605n.setEnabled(false);
        InterfaceC7751k interfaceC7751k3 = this.pageControl;
        if (interfaceC7751k3 != null) {
            interfaceC7751k3.mo7827j(new C7694g());
        }
        InterfaceC7751k interfaceC7751k4 = this.pageControl;
        if (interfaceC7751k4 != null) {
            interfaceC7751k4.mo7829k(new C7695h());
        }
    }

    /* renamed from: J0 */
    public final void m11632J0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12599h.post(new Runnable() { // from class: d7.a
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m11575K0(this.f13075a);
            }
        });
    }

    /* renamed from: N0 */
    public final boolean m11633N0(int color) {
        int i9 = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupM11638R0 = m11638R0();
        int childCount = radioGroupM11638R0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = radioGroupM11638R0.getChildAt(i10);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String() & ViewCompat.MEASURED_SIZE_MASK) == i9) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O0 */
    public final int m11634O0(int color) {
        int i9 = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupM11638R0 = m11638R0();
        int childCount = radioGroupM11638R0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = radioGroupM11638R0.getChildAt(i10);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String() & ViewCompat.MEASURED_SIZE_MASK) == i9) {
                return (color & ViewCompat.MEASURED_STATE_MASK) | (16777215 & normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String());
            }
        }
        return m11635P0(0);
    }

    /* renamed from: P0 */
    public final int m11635P0(int slotIndex) {
        RadioGroup radioGroupM11638R0 = m11638R0();
        int childCount = radioGroupM11638R0.getChildCount();
        if (childCount == 0) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        View childAt = radioGroupM11638R0.getChildAt(RangesKt.coerceIn(slotIndex, 0, childCount - 1));
        NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
        return normalColorRadioButton == null ? ViewCompat.MEASURED_STATE_MASK : normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String();
    }

    /* renamed from: Q0 */
    public final int m11636Q0() {
        return RangesKt.coerceAtLeast(m11638R0().getChildCount(), 0);
    }

    /* renamed from: R */
    public final void m11637R(boolean toggleColorPanel) throws Resources.NotFoundException {
        C9763b c9763b = this.boardConfig;
        if (c9763b != null) {
            c9763b.m16498l0(EzyModeEnum.ModeEnum.ACTION_WRITING);
            C9763b.m16449d0(c9763b, false, 0.0f, 0.0f, 6, null);
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        ImageView ivPen = viewFragmentBlackboardEvaluationBinding.f12603l;
        Intrinsics.checkNotNullExpressionValue(ivPen, "ivPen");
        m11641T0(ivPen);
        if (toggleColorPanel) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
            }
            View root = viewFragmentBlackboardEvaluationBinding2.f12594c.getRoot();
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
            m11639S();
        }
    }

    /* renamed from: R0 */
    public final RadioGroup m11638R0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        RadioGroup rgPenColor = viewFragmentBlackboardEvaluationBinding.f12594c.f12711d;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        return rgPenColor;
    }

    /* renamed from: S */
    public final void m11639S() throws Resources.NotFoundException {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        View root = viewFragmentBlackboardEvaluationBinding.f12594c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        LinearLayout llEvaluationTools = viewFragmentBlackboardEvaluationBinding2.f12610s;
        Intrinsics.checkNotNullExpressionValue(llEvaluationTools, "llEvaluationTools");
        root.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC7689b(root, getResources().getDimensionPixelSize(R$dimen.view_3), this, llEvaluationTools));
    }

    /* renamed from: S0 */
    public final int m11640S0(SharedPreferences prefs) {
        if (prefs.contains("pen_color_slot_index")) {
            return RangesKt.coerceIn(prefs.getInt("pen_color_slot_index", 0), 0, RangesKt.coerceAtLeast(m11636Q0() - 1, 0));
        }
        if (!prefs.contains("pen_color_argb")) {
            return 0;
        }
        int iM11655i0 = m11655i0(prefs.getInt("pen_color_argb", ViewCompat.MEASURED_STATE_MASK));
        prefs.edit().putInt("pen_color_slot_index", iM11655i0).remove("pen_color_argb").apply();
        return iM11655i0;
    }

    /* renamed from: T0 */
    public final void m11641T0(View view) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12606o.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f12603l.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f12600i.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f12602k.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding6;
        }
        viewFragmentBlackboardEvaluationBinding2.f12598g.setSelected(false);
        view.setSelected(true);
    }

    /* renamed from: U */
    public final void m11642U(int slotIndex, boolean persist, boolean notifySdkSelectCallback) {
        Function1 function1;
        int iM11635P0 = m11635P0(slotIndex);
        C9763b c9763b = this.boardConfig;
        if (c9763b != null) {
            c9763b.m16500m0(iM11635P0);
            c9763b.m16477a0(iM11635P0);
        }
        if (persist) {
            int iM11636Q0 = m11636Q0();
            requireContext().getSharedPreferences("blackboard_evaluation_pen", 0).edit().putInt("pen_color_slot_index", iM11636Q0 > 0 ? RangesKt.coerceIn(slotIndex, 0, iM11636Q0 - 1) : 0).apply();
        }
        if (!notifySdkSelectCallback || (function1 = this.evaluationSelectColorChangeCallback) == null) {
            return;
        }
        function1.invoke(Integer.valueOf(iM11635P0));
    }

    /* renamed from: U0 */
    public final void m11643U0(C9763b boardConfig) throws SecurityException {
        Method method;
        Method[] methods = boardConfig.getClass().getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        int length = methods.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                method = null;
                break;
            }
            method = methods[i9];
            if (Intrinsics.areEqual(method.getName(), "setSelectEditColorChangeListener") && method.getParameterTypes().length == 1) {
                break;
            } else {
                i9++;
            }
        }
        if (method == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m24758constructorimpl(method.invoke(boardConfig, new Function1() { // from class: d7.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.m11585V0(this.f13101a, ((Integer) obj).intValue());
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: V */
    public final void m11644V() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new AlertDialog.Builder(activity, R$style.Theme_AppCompat_Light_Dialog_Alert).setMessage(R$string.clear_canvas).setPositiveButton(getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: d7.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    BlackboardEvaluationFragment.m11586W(this.f13100a, dialogInterface, i9);
                }
            }).setNegativeButton(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: d7.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    BlackboardEvaluationFragment.m11587X(dialogInterface, i9);
                }
            }).create().show();
        }
    }

    /* renamed from: W0 */
    public final void m11645W0(boolean canDoEdit) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12613v.setCanTouch(canDoEdit);
    }

    /* renamed from: X0 */
    public final void m11646X0(int color) {
        int iM11655i0 = m11655i0(m11634O0(color));
        m11642U(iM11655i0, true, false);
        m11648Y0(iM11655i0);
    }

    /* renamed from: Y */
    public final void m11647Y(RadioGroup source, final RadioGroup syncTarget) {
        source.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: d7.l
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i9) {
                BlackboardEvaluationFragment.m11588Z(this.f13096a, syncTarget, radioGroup, i9);
            }
        });
    }

    /* renamed from: Y0 */
    public final void m11648Y0(int slotIndex) {
        int iM11636Q0 = m11636Q0();
        if (iM11636Q0 == 0) {
            return;
        }
        int iCoerceIn = RangesKt.coerceIn(slotIndex, 0, iM11636Q0 - 1);
        this.suppressPenColorSync = true;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        View childAt = viewFragmentBlackboardEvaluationBinding.f12594c.f12711d.getChildAt(iCoerceIn);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBlackboardEvaluationBinding3 = null;
            }
            viewFragmentBlackboardEvaluationBinding3.f12594c.f12711d.check(radioButton.getId());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        View childAt2 = viewFragmentBlackboardEvaluationBinding4.f12593b.f12719d.getChildAt(iCoerceIn);
        RadioButton radioButton2 = childAt2 instanceof RadioButton ? (RadioButton) childAt2 : null;
        if (radioButton2 != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding5;
            }
            viewFragmentBlackboardEvaluationBinding2.f12593b.f12719d.check(radioButton2.getId());
        }
        this.suppressPenColorSync = false;
    }

    /* renamed from: a0 */
    public final InterfaceC9615a m11649a0() {
        return new C7690c();
    }

    /* renamed from: b0 */
    public final void m11650b0(float y9) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f12599h.getGlobalVisibleRect(rect);
        float fCenterY = y9 - this.dragRect.centerY();
        float f10 = this.defaultTranslateTop;
        float f11 = this.defaultTranslateBottom - 0.0f;
        if (fCenterY < f10) {
            fCenterY = f10;
        }
        if (fCenterY <= f11) {
            f11 = fCenterY;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f12613v.setTranslationY(f11);
    }

    /* renamed from: c0 */
    public final void m11651c0() {
        InterfaceC7751k interfaceC7751k = this.pageControl;
        if ((interfaceC7751k != null ? interfaceC7751k.mo7845y() : 0) >= 3) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C9037n.m14415y(this.imagePicker, null, true, new Function1() { // from class: d7.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.m11591d0(this.f13099a, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: f0 */
    public final File m11652f0(Context context, String sourcePath) {
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

    /* renamed from: g0 */
    public final void m11653g0(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            m11650b0(event.getRawY());
        } else if (action == 1) {
            m11650b0(event.getRawY());
        } else {
            if (action != 2) {
                return;
            }
            m11650b0(event.getRawY());
        }
    }

    /* renamed from: h0 */
    public final void m11654h0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        View root = viewFragmentBlackboardEvaluationBinding.f12594c.getRoot();
        root.setTranslationX(0.0f);
        root.setTranslationY(0.0f);
        Intrinsics.checkNotNull(root);
        root.setVisibility(8);
    }

    /* renamed from: i0 */
    public final int m11655i0(int color) {
        int i9 = color & ViewCompat.MEASURED_SIZE_MASK;
        RadioGroup radioGroupM11638R0 = m11638R0();
        int childCount = radioGroupM11638R0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = radioGroupM11638R0.getChildAt(i10);
            NormalColorRadioButton normalColorRadioButton = childAt instanceof NormalColorRadioButton ? (NormalColorRadioButton) childAt : null;
            if (normalColorRadioButton != null && (normalColorRadioButton.getAndroidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR java.lang.String() & ViewCompat.MEASURED_SIZE_MASK) == i9) {
                return i10;
            }
        }
        return 0;
    }

    /* renamed from: j0 */
    public final void m11656j0() {
        String absolutePath;
        File externalCacheDir;
        if (this.path == null) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            this.path = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        m11645W0(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.mBinding;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBlackboardEvaluationBinding.f12611t;
        String str = this.path;
        Intrinsics.checkNotNull(str);
        sketchRecorderView.m7284b(str, new Function3() { // from class: d7.i
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BlackboardEvaluationFragment.m11600k0(this.f13093a, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new Function1() { // from class: d7.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m11602l0(this.f13094a, (Throwable) obj);
            }
        });
    }

    /* renamed from: m0 */
    public final void m11657m0() throws SecurityException {
        IBoardControl iBoardControl = this.boardControl;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        this.boardConfig = iBoardControl != null ? iBoardControl.getConfig() : null;
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("blackboard_evaluation_pen", 0);
        Intrinsics.checkNotNull(sharedPreferences);
        int iM11640S0 = m11640S0(sharedPreferences);
        int iM11635P0 = m11635P0(iM11640S0);
        int i9 = sharedPreferences.getInt("text_color_argb", ViewCompat.MEASURED_STATE_MASK);
        C9763b c9763b = this.boardConfig;
        if (c9763b != null) {
            Boolean boolM14440j = AbstractC9040q.m14440j();
            c9763b.m16486f0(boolM14440j != null ? boolM14440j.booleanValue() : true);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.mBinding;
            if (viewFragmentBlackboardEvaluationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding2;
            }
            viewFragmentBlackboardEvaluationBinding.f12608q.setSelected(c9763b.m16467R());
            c9763b.m16496k0(2);
            c9763b.m16492i0(true);
            c9763b.m16502n0(3.0f);
            c9763b.m16479b0(3.0f);
            c9763b.m16500m0(iM11635P0);
            c9763b.m16477a0(iM11635P0);
            c9763b.m16506p0(f12362n);
            c9763b.m16504o0(m11649a0());
            m11643U0(c9763b);
            c9763b.m16475Z(-1);
            C9765d c9765dM16519z = c9763b.m16519z();
            c9765dM16519z.m16533l(true);
            c9765dM16519z.m16536o(true);
            c9765dM16519z.m16531j(3);
            c9765dM16519z.m16532k(1);
            c9763b.m16471V(i9);
            c9763b.m16474Y(68.0f);
            c9763b.m16473X(68.0f);
            c9763b.m16472W(88.0f);
            c9763b.m16494j0(new C7691d());
        }
        m11648Y0(iM11640S0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m11570G0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBindingM11880a = ViewFragmentBlackboardEvaluationBinding.m11880a(inflater);
        float screenHeight = (ScreenUtils.getScreenHeight() * (1.0f - 0.5f)) - getResources().getDimensionPixelSize(R$dimen.view_9);
        SketchRecorderView sketchView = viewFragmentBlackboardEvaluationBindingM11880a.f12611t;
        Intrinsics.checkNotNullExpressionValue(sketchView, "sketchView");
        ViewGroup.LayoutParams layoutParams = sketchView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) screenHeight;
        sketchView.setLayoutParams(layoutParams);
        Intrinsics.checkNotNull(viewFragmentBlackboardEvaluationBindingM11880a);
        this.mBinding = viewFragmentBlackboardEvaluationBindingM11880a;
        View root = viewFragmentBlackboardEvaluationBindingM11880a.getRoot();
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
        m11579M0();
    }
}
