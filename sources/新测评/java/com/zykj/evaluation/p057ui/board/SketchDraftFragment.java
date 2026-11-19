package com.zykj.evaluation.p057ui.board;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.constant.FragmentTag;
import com.zykj.evaluation.databinding.FragmentSketchDraftBinding;
import com.zykj.evaluation.p057ui.board.SketchDraftFragment;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p148io.FilesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p027b8.AbstractC5046c;
import p079e7.C7399o0;
import p101g7.C7595k;
import p202p7.C8860d;
import p278w7.C9822c;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J+\u0010%\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\r¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b4\u0010\u001aJ\u0015\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\r¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0011¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010>J\r\u0010@\u001a\u00020\u0004¢\u0006\u0004\b@\u0010\u0003J\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u0004¢\u0006\u0004\bB\u0010\u0003J\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020/¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020/¢\u0006\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010S\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010MR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020W8\u0002X\u0082D¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R0\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010C\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010UR\u0016\u0010l\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010hR\u0016\u0010n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010M¨\u0006o"}, m13558d2 = {"Lcom/zykj/evaluation/ui/board/SketchDraftFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "P", "D0", "Landroid/view/View;", "view", "r0", "(Landroid/view/View;)V", "", "url", "", "showLoading", "forceWebView", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "callback", "k0", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V", "E0", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "w0", "path", "I", "(Ljava/lang/String;)V", "Ljava/io/File;", "K", "(Ljava/lang/String;)Ljava/io/File;", "z0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "hideAnalysis", "j0", "(Ljava/lang/String;Z)V", "needOldBitmap", "M", "(Z)Landroid/graphics/Bitmap;", "", "targetTime", "targetPath", "p0", "(JLjava/lang/String;)V", "s0", "isSeeMode", "t0", "(Z)V", "bitmap", "q0", "(Landroid/graphics/Bitmap;)V", "H", "()Landroid/graphics/Bitmap;", "i0", "()Z", "h0", "o0", "y0", "O", "qstLastModifyTime", "u0", "(J)V", "f0", "(Ljava/lang/String;J)Z", "Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;", "a", "Lcom/zykj/evaluation/databinding/FragmentSketchDraftBinding;", "binding", "b", "Z", "isChange", "c", "Ljava/lang/String;", "d", "e", "canShowAnswer", "f", "Landroid/graphics/Bitmap;", "imageWithAnswer", "", "g", "F", "scale", "h", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlinx/coroutines/Job;", "i", "Lkotlinx/coroutines/Job;", "saveDataJob", "j", "Lkotlin/jvm/functions/Function1;", "isTouchingChangeListener", "()Lkotlin/jvm/functions/Function1;", "v0", "(Lkotlin/jvm/functions/Function1;)V", "k", "J", "l", "cachedBitmap", "m", "oldTime", "n", "needRefreshOldPng", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSketchDraftFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchDraftFragment.kt\ncom/zykj/evaluation/ui/board/SketchDraftFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,615:1\n1869#2,2:616\n1999#2,14:628\n257#3,2:618\n257#3,2:620\n257#3,2:622\n257#3,2:642\n257#3,2:646\n257#3,2:648\n1#4:624\n3829#5:625\n4344#5,2:626\n13472#5,2:644\n*S KotlinDebug\n*F\n+ 1 SketchDraftFragment.kt\ncom/zykj/evaluation/ui/board/SketchDraftFragment\n*L\n247#1:616,2\n397#1:628,14\n257#1:618,2\n306#1:620,2\n311#1:622,2\n458#1:642,2\n598#1:646,2\n602#1:648,2\n392#1:625\n392#1:626,2\n553#1:644,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SketchDraftFragment extends Fragment {

    /* renamed from: a, reason: from kotlin metadata */
    public FragmentSketchDraftBinding binding;

    /* renamed from: b, reason: from kotlin metadata */
    public boolean isChange;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean canShowAnswer;

    /* renamed from: f, reason: from kotlin metadata */
    public Bitmap imageWithAnswer;

    /* renamed from: i, reason: from kotlin metadata */
    public Job saveDataJob;

    /* renamed from: j, reason: from kotlin metadata */
    public Function1 isTouchingChangeListener;

    /* renamed from: k, reason: from kotlin metadata */
    public long qstLastModifyTime;

    /* renamed from: l, reason: from kotlin metadata */
    public Bitmap cachedBitmap;

    /* renamed from: m, reason: from kotlin metadata */
    public long oldTime;

    /* renamed from: n, reason: from kotlin metadata */
    public boolean needRefreshOldPng;

    /* renamed from: c, reason: from kotlin metadata */
    public String path = "";

    /* renamed from: d, reason: from kotlin metadata */
    public String url = "";

    /* renamed from: g, reason: from kotlin metadata */
    public float scale = 1.0f;

    /* renamed from: h, reason: from kotlin metadata */
    public final float offset = 0.1f;

    /* renamed from: A0 */
    public static final void m9096A0(SketchDraftFragment sketchDraftFragment, DialogInterface dialogInterface, int i10) {
        sketchDraftFragment.m9158I(sketchDraftFragment.path);
        sketchDraftFragment.m9177y0();
        sketchDraftFragment.needRefreshOldPng = false;
        sketchDraftFragment.m9167k0(sketchDraftFragment.url, true, true, new Function1() { // from class: t5.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SketchDraftFragment.m9098B0((Bitmap) obj);
            }
        });
    }

    /* renamed from: B0 */
    public static final Unit m9098B0(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return Unit.INSTANCE;
    }

    /* renamed from: C0 */
    public static final void m9100C0(SketchDraftFragment sketchDraftFragment, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        sketchDraftFragment.needRefreshOldPng = true;
        LogUtils.m3237d("SketchDraftFragment,oldTime是" + sketchDraftFragment.oldTime);
        FragmentSketchDraftBinding fragmentSketchDraftBinding = sketchDraftFragment.binding;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        ImageView ivSketchRefresh = fragmentSketchDraftBinding.f8749j;
        Intrinsics.checkNotNullExpressionValue(ivSketchRefresh, "ivSketchRefresh");
        ivSketchRefresh.setVisibility(0);
        File fileM9159K = sketchDraftFragment.m9159K(sketchDraftFragment.path);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(fileM9159K != null ? fileM9159K.getAbsolutePath() : null);
        sketchDraftFragment.cachedBitmap = bitmapDecodeFile;
        if (bitmapDecodeFile != null) {
            FragmentSketchDraftBinding fragmentSketchDraftBinding3 = sketchDraftFragment.binding;
            if (fragmentSketchDraftBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSketchDraftBinding3 = null;
            }
            fragmentSketchDraftBinding3.f8754o.setImageBackground(bitmapDecodeFile);
            FragmentSketchDraftBinding fragmentSketchDraftBinding4 = sketchDraftFragment.binding;
            if (fragmentSketchDraftBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSketchDraftBinding2 = fragmentSketchDraftBinding4;
            }
            LinearLayoutCompat llLoading = fragmentSketchDraftBinding2.f8753n;
            Intrinsics.checkNotNullExpressionValue(llLoading, "llLoading");
            llLoading.setVisibility(8);
        }
    }

    /* renamed from: F0 */
    public static final Unit m9104F0(final C7399o0 c7399o0, final boolean z9, final SketchDraftFragment sketchDraftFragment, final Function1 function1, WebView webView) {
        c7399o0.postDelayed(new Runnable() { // from class: t5.s
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                SketchDraftFragment.m9106G0(c7399o0, z9, sketchDraftFragment, function1);
            }
        }, 300L);
        return Unit.INSTANCE;
    }

    /* renamed from: G0 */
    public static final void m9106G0(C7399o0 c7399o0, boolean z9, SketchDraftFragment sketchDraftFragment, Function1 function1) throws Throwable {
        Bitmap bitmapM12486a = C7595k.f12740a.m12486a(c7399o0.getWebView());
        FragmentSketchDraftBinding fragmentSketchDraftBinding = null;
        if (bitmapM12486a != null) {
            FragmentSketchDraftBinding fragmentSketchDraftBinding2 = sketchDraftFragment.binding;
            if (fragmentSketchDraftBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSketchDraftBinding2 = null;
            }
            fragmentSketchDraftBinding2.f8754o.setImageBackground(bitmapM12486a);
            LogUtils.m3237d("SketchDraftFragment,截图开始保存");
            sketchDraftFragment.m9169p0(sketchDraftFragment.qstLastModifyTime, sketchDraftFragment.path);
            function1.invoke(bitmapM12486a);
        }
        if (z9) {
            sketchDraftFragment.m9161O();
        }
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = sketchDraftFragment.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding = fragmentSketchDraftBinding3;
        }
        fragmentSketchDraftBinding.f8756q.removeView(c7399o0);
    }

    /* renamed from: H0 */
    public static final void m9107H0(C7399o0 c7399o0, String str) {
        c7399o0.m11884g(str);
    }

    /* renamed from: J */
    public static final boolean m9108J(File file, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "bg_at_", false, 2, (Object) null) && StringsKt.endsWith$default(str, ".webp", false, 2, (Object) null);
    }

    /* renamed from: L */
    public static final boolean m9109L(File file, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "bg_at_", false, 2, (Object) null) && StringsKt.endsWith$default(str, ".webp", false, 2, (Object) null);
    }

    /* renamed from: N */
    public static /* synthetic */ Bitmap m9110N(SketchDraftFragment sketchDraftFragment, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return sketchDraftFragment.m9160M(z9);
    }

    /* renamed from: Q */
    public static final Unit m9111Q(SketchDraftFragment sketchDraftFragment) {
        sketchDraftFragment.isChange = true;
        sketchDraftFragment.m9155D0();
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final boolean m9112R(SketchDraftFragment sketchDraftFragment, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            Function1 function1 = sketchDraftFragment.isTouchingChangeListener;
            if (function1 == null) {
                return false;
            }
            function1.invoke(Boolean.FALSE);
            return false;
        }
        Function1 function12 = sketchDraftFragment.isTouchingChangeListener;
        if (function12 == null) {
            return false;
        }
        function12.invoke(Boolean.TRUE);
        return false;
    }

    /* renamed from: S */
    public static final void m9113S(SketchDraftFragment sketchDraftFragment, final SimpleBoardView simpleBoardView, View view) {
        FragmentActivity activity = sketchDraftFragment.getActivity();
        if (activity != null) {
            new AlertDialog.Builder(activity, 2131952325).setMessage(R.string.clear_canvas).setPositiveButton(sketchDraftFragment.getString(R.string.sure), new DialogInterface.OnClickListener() { // from class: t5.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    SketchDraftFragment.m9114T(simpleBoardView, dialogInterface, i10);
                }
            }).setNegativeButton(sketchDraftFragment.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: t5.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    SketchDraftFragment.m9115U(dialogInterface, i10);
                }
            }).create().show();
        }
    }

    /* renamed from: T */
    public static final void m9114T(SimpleBoardView simpleBoardView, DialogInterface dialogInterface, int i10) {
        simpleBoardView.m11428e();
    }

    /* renamed from: U */
    public static final void m9115U(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: V */
    public static final void m9116V(SketchDraftFragment sketchDraftFragment, SimpleBoardView simpleBoardView, View view) {
        float f10 = sketchDraftFragment.scale + sketchDraftFragment.offset;
        sketchDraftFragment.scale = f10;
        if (f10 > 1.5f) {
            sketchDraftFragment.scale = 1.5f;
        }
        simpleBoardView.m11433j(sketchDraftFragment.scale);
    }

    /* renamed from: W */
    public static final void m9117W(SketchDraftFragment sketchDraftFragment, SimpleBoardView simpleBoardView, View view) {
        float f10 = sketchDraftFragment.scale - sketchDraftFragment.offset;
        sketchDraftFragment.scale = f10;
        if (f10 < 1.0f) {
            sketchDraftFragment.scale = 1.0f;
        }
        simpleBoardView.m11433j(sketchDraftFragment.scale);
    }

    /* renamed from: X */
    public static final void m9118X(SimpleBoardView simpleBoardView, SketchDraftFragment sketchDraftFragment, View view) {
        boolean zIsSelected = view.isSelected();
        simpleBoardView.getSimpleBoardConfig().m16441j(!zIsSelected);
        view.setSelected(!zIsSelected);
        C8860d c8860d = C8860d.f15070b;
        Context contextRequireContext = sketchDraftFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        c8860d.m14862c(contextRequireContext, "draftTouchEnable", !zIsSelected);
    }

    /* renamed from: Y */
    public static final void m9119Y(SimpleBoardView simpleBoardView, SketchDraftFragment sketchDraftFragment, View view) {
        simpleBoardView.setActonMode(3);
        Intrinsics.checkNotNull(view);
        sketchDraftFragment.m9171r0(view);
    }

    /* renamed from: Z */
    public static final void m9120Z(SimpleBoardView simpleBoardView, SketchDraftFragment sketchDraftFragment, View view) {
        simpleBoardView.setActonMode(0);
        simpleBoardView.getSimpleBoardConfig().m16444m(false);
        Intrinsics.checkNotNull(view);
        sketchDraftFragment.m9171r0(view);
    }

    /* renamed from: a0 */
    public static final void m9121a0(SimpleBoardView simpleBoardView, SketchDraftFragment sketchDraftFragment, View view) {
        simpleBoardView.setActonMode(1);
        simpleBoardView.getSimpleBoardConfig().m16444m(false);
        Intrinsics.checkNotNull(view);
        sketchDraftFragment.m9171r0(view);
    }

    /* renamed from: b0 */
    public static final void m9122b0(SimpleBoardView simpleBoardView, SketchDraftFragment sketchDraftFragment, View view) {
        simpleBoardView.setActonMode(1);
        simpleBoardView.getSimpleBoardConfig().m16444m(true);
        Intrinsics.checkNotNull(view);
        sketchDraftFragment.m9171r0(view);
    }

    /* renamed from: c0 */
    public static final void m9124c0(SimpleBoardView simpleBoardView, SketchDraftFragment sketchDraftFragment, View view) {
        simpleBoardView.setActonMode(2);
        Intrinsics.checkNotNull(view);
        sketchDraftFragment.m9171r0(view);
    }

    /* renamed from: d0 */
    public static final void m9126d0(SketchDraftFragment sketchDraftFragment, View view) {
        if (sketchDraftFragment.canShowAnswer) {
            sketchDraftFragment.m9176w0();
            return;
        }
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = sketchDraftFragment.getString(R.string.show_analysis_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        xToastUtils.error(string);
    }

    /* renamed from: e0 */
    public static final void m9128e0(SketchDraftFragment sketchDraftFragment, View view) {
        sketchDraftFragment.m9178z0();
    }

    /* renamed from: g0 */
    public static final boolean m9131g0(File file, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "bg_at_", false, 2, (Object) null) && StringsKt.endsWith$default(str, ".webp", false, 2, (Object) null);
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m9137l0(SketchDraftFragment sketchDraftFragment, String str, boolean z9, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        sketchDraftFragment.m9167k0(str, z9, z10, function1);
    }

    /* renamed from: m0 */
    public static final Unit m9139m0(SketchDraftFragment sketchDraftFragment, Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sketchDraftFragment.m9170q0(it);
        return Unit.INSTANCE;
    }

    /* renamed from: n0 */
    public static final Unit m9141n0(SketchDraftFragment sketchDraftFragment, Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sketchDraftFragment.imageWithAnswer = it;
        return Unit.INSTANCE;
    }

    /* renamed from: x0 */
    public static final Unit m9152x0(SketchDraftFragment sketchDraftFragment, Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sketchDraftFragment.m9170q0(it);
        return Unit.INSTANCE;
    }

    /* renamed from: D0 */
    public final void m9155D0() {
        Job job;
        Job job2 = this.saveDataJob;
        if (job2 != null && job2.isActive() && (job = this.saveDataJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.saveDataJob = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SketchDraftFragment$startSaveDataThread$1(this, null), 3, null);
    }

    /* renamed from: E0 */
    public final void m9156E0(final String url, final boolean showLoading, final Function1 callback) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final C7399o0 c7399o0 = new C7399o0(contextRequireContext, null, 0, 6, null);
        c7399o0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8756q.addView(c7399o0);
        c7399o0.setPageFinishListener(new Function1() { // from class: t5.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SketchDraftFragment.m9104F0(c7399o0, showLoading, this, callback, (WebView) obj);
            }
        });
        c7399o0.post(new Runnable() { // from class: t5.p
            @Override // java.lang.Runnable
            public final void run() {
                SketchDraftFragment.m9107H0(c7399o0, url);
            }
        });
    }

    /* renamed from: H */
    public final Bitmap m9157H() {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        SimpleBoardView simpleBoardView = fragmentSketchDraftBinding.f8754o;
        if (simpleBoardView.m11429f()) {
            return null;
        }
        return simpleBoardView.m11427d();
    }

    /* renamed from: I */
    public final void m9158I(String path) {
        File[] fileArrListFiles;
        File file = new File(path);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: t5.r
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return SketchDraftFragment.m9108J(file2, str);
            }
        })) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    if (file2.exists()) {
                        LogUtils.m3237d("清理缓存", "删除旧文件: " + file2.getName() + ", 结果: " + file2.delete());
                    }
                } catch (Exception e10) {
                    LogUtils.m3238e("清理缓存", "删除文件失败: " + file2.getName() + ", " + e10.getMessage());
                }
            }
        }
    }

    /* renamed from: K */
    public final File m9159K(String path) {
        File[] fileArrListFiles;
        File file = new File(path);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: t5.n
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return SketchDraftFragment.m9109L(file2, str);
            }
        })) != null) {
            return (File) ArraysKt.firstOrNull(fileArrListFiles);
        }
        return null;
    }

    /* renamed from: M */
    public final Bitmap m9160M(boolean needOldBitmap) {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = null;
        if (needOldBitmap) {
            Bitmap bitmap = this.cachedBitmap;
            if (bitmap != null) {
                return bitmap;
            }
            FragmentSketchDraftBinding fragmentSketchDraftBinding2 = this.binding;
            if (fragmentSketchDraftBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSketchDraftBinding = fragmentSketchDraftBinding2;
            }
            return fragmentSketchDraftBinding.f8754o.getImageBackground();
        }
        if (m9163f0(this.path, this.qstLastModifyTime)) {
            LogUtils.m3237d("getStemBitmap", "缓存已失效，强制返回空以触发刷新");
            return null;
        }
        Bitmap bitmap2 = this.cachedBitmap;
        if (bitmap2 != null) {
            return bitmap2;
        }
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding = fragmentSketchDraftBinding3;
        }
        return fragmentSketchDraftBinding.f8754o.getImageBackground();
    }

    /* renamed from: O */
    public final void m9161O() {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8753n.setVisibility(8);
    }

    /* renamed from: P */
    public final void m9162P() {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8754o.setOnActionListener(new Function0() { // from class: t5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchDraftFragment.m9111Q(this.f16351a);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding3 = null;
        }
        fragmentSketchDraftBinding3.f8754o.setOnTouchListener(new View.OnTouchListener() { // from class: t5.v
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SketchDraftFragment.m9112R(this.f16388a, view, motionEvent);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding4 = this.binding;
        if (fragmentSketchDraftBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding4 = null;
        }
        final SimpleBoardView simpleBoardView = fragmentSketchDraftBinding4.f8754o;
        C9822c simpleBoardConfig = simpleBoardView.getSimpleBoardConfig();
        C8860d c8860d = C8860d.f15070b;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        simpleBoardConfig.m16441j(c8860d.m14860a(contextRequireContext, "draftTouchEnable", true));
        FragmentSketchDraftBinding fragmentSketchDraftBinding5 = this.binding;
        if (fragmentSketchDraftBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding5 = null;
        }
        fragmentSketchDraftBinding5.f8751l.setSelected(simpleBoardView.getSimpleBoardConfig().m16433b());
        FragmentSketchDraftBinding fragmentSketchDraftBinding6 = this.binding;
        if (fragmentSketchDraftBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding6 = null;
        }
        fragmentSketchDraftBinding6.f8751l.setOnClickListener(new View.OnClickListener() { // from class: t5.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9118X(simpleBoardView, this, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding7 = this.binding;
        if (fragmentSketchDraftBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding7 = null;
        }
        fragmentSketchDraftBinding7.f8750k.setOnClickListener(new View.OnClickListener() { // from class: t5.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9119Y(simpleBoardView, this, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding8 = this.binding;
        if (fragmentSketchDraftBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding8 = null;
        }
        fragmentSketchDraftBinding8.f8747h.setOnClickListener(new View.OnClickListener() { // from class: t5.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9120Z(simpleBoardView, this, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding9 = this.binding;
        if (fragmentSketchDraftBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding9 = null;
        }
        fragmentSketchDraftBinding9.f8746g.setOnClickListener(new View.OnClickListener() { // from class: t5.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9121a0(simpleBoardView, this, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding10 = this.binding;
        if (fragmentSketchDraftBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding10 = null;
        }
        fragmentSketchDraftBinding10.f8743d.setOnClickListener(new View.OnClickListener() { // from class: t5.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9122b0(simpleBoardView, this, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding11 = this.binding;
        if (fragmentSketchDraftBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding11 = null;
        }
        fragmentSketchDraftBinding11.f8745f.setOnClickListener(new View.OnClickListener() { // from class: t5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9124c0(simpleBoardView, this, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding12 = this.binding;
        if (fragmentSketchDraftBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding12 = null;
        }
        ImageView ivSketchClean = fragmentSketchDraftBinding12.f8742c;
        Intrinsics.checkNotNullExpressionValue(ivSketchClean, "ivSketchClean");
        AbstractC5046c.m2530f(ivSketchClean, 0L, new View.OnClickListener() { // from class: t5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9113S(this.f16357a, simpleBoardView, view);
            }
        }, 1, null);
        FragmentSketchDraftBinding fragmentSketchDraftBinding13 = this.binding;
        if (fragmentSketchDraftBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding13 = null;
        }
        fragmentSketchDraftBinding13.f8744e.setOnClickListener(new View.OnClickListener() { // from class: t5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9116V(this.f16360a, simpleBoardView, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding14 = this.binding;
        if (fragmentSketchDraftBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding14 = null;
        }
        fragmentSketchDraftBinding14.f8748i.setOnClickListener(new View.OnClickListener() { // from class: t5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9117W(this.f16374a, simpleBoardView, view);
            }
        });
        FragmentSketchDraftBinding fragmentSketchDraftBinding15 = this.binding;
        if (fragmentSketchDraftBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding15 = null;
        }
        fragmentSketchDraftBinding15.f8747h.performClick();
        FragmentSketchDraftBinding fragmentSketchDraftBinding16 = this.binding;
        if (fragmentSketchDraftBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding16 = null;
        }
        AppCompatTextView tvShowAnalysis = fragmentSketchDraftBinding16.f8755p;
        Intrinsics.checkNotNullExpressionValue(tvShowAnalysis, "tvShowAnalysis");
        AbstractC5046c.m2530f(tvShowAnalysis, 0L, new View.OnClickListener() { // from class: t5.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9126d0(this.f16386a, view);
            }
        }, 1, null);
        FragmentSketchDraftBinding fragmentSketchDraftBinding17 = this.binding;
        if (fragmentSketchDraftBinding17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding2 = fragmentSketchDraftBinding17;
        }
        fragmentSketchDraftBinding2.f8749j.setOnClickListener(new View.OnClickListener() { // from class: t5.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SketchDraftFragment.m9128e0(this.f16387a, view);
            }
        });
    }

    /* renamed from: f0 */
    public final boolean m9163f0(String path, long qstLastModifyTime) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (!file.exists() || !file.isDirectory() || qstLastModifyTime == 0) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: t5.q
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return SketchDraftFragment.m9131g0(file2, str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtils.m3237d("后端给的路径,isCacheInvalid", "没有文件");
            return false;
        }
        Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            Intrinsics.checkNotNull(name);
            Long longOrNull = StringsKt.toLongOrNull(StringsKt.substringBefore$default(StringsKt.substringAfter$default(name, "bg_at_", (String) null, 2, (Object) null), ".webp", (String) null, 2, (Object) null));
            if (longOrNull != null && longOrNull.longValue() != qstLastModifyTime) {
                this.oldTime = longOrNull.longValue();
                LogUtils.m3237d(FragmentTag.SketchDraftFragmentTag, "检测到失效缓存文件: " + name + ", 当前题目时间戳: " + qstLastModifyTime + ", 文件时间戳: " + longOrNull);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h0, reason: from getter */
    public final boolean getIsChange() {
        return this.isChange;
    }

    /* renamed from: i0 */
    public final boolean m9165i0() {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        return fragmentSketchDraftBinding.f8754o.m11429f();
    }

    /* renamed from: j0 */
    public final void m9166j0(String url, boolean hideAnalysis) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(url, "url");
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        AppCompatTextView tvShowAnalysis = fragmentSketchDraftBinding.f8755p;
        Intrinsics.checkNotNullExpressionValue(tvShowAnalysis, "tvShowAnalysis");
        tvShowAnalysis.setVisibility(hideAnalysis ? 0 : 8);
        this.url = url;
        if (hideAnalysis) {
            str = url;
            String strReplace$default = StringsKt.replace$default(str, "?showAnalysis=true", "?showAnalysis=false", false, 4, (Object) null);
            this.canShowAnswer = !Intrinsics.areEqual(str, strReplace$default);
            str2 = strReplace$default;
        } else {
            str = url;
            str2 = str;
        }
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding2 = fragmentSketchDraftBinding3;
        }
        fragmentSketchDraftBinding2.f8756q.removeAllViews();
        m9137l0(this, str2, true, false, new Function1() { // from class: t5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SketchDraftFragment.m9139m0(this.f16363a, (Bitmap) obj);
            }
        }, 4, null);
        if (this.canShowAnswer) {
            m9137l0(this, str, false, false, new Function1() { // from class: t5.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchDraftFragment.m9141n0(this.f16365a, (Bitmap) obj);
                }
            }, 4, null);
        }
    }

    /* renamed from: k0 */
    public final void m9167k0(String url, boolean showLoading, boolean forceWebView, Function1 callback) {
        if (forceWebView) {
            m9156E0(url, showLoading, callback);
            return;
        }
        LogUtils.m3237d("SketchDraftFragment,后端给的时间是" + this.qstLastModifyTime);
        LogUtils.m3237d("SketchDraftFragment,path的路径是" + this.path);
        FragmentSketchDraftBinding fragmentSketchDraftBinding = null;
        if (m9163f0(this.path, this.qstLastModifyTime)) {
            LogUtils.m3238e("SketchDraftFragment,加载的图片------本地缓存");
            FragmentSketchDraftBinding fragmentSketchDraftBinding2 = this.binding;
            if (fragmentSketchDraftBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSketchDraftBinding = fragmentSketchDraftBinding2;
            }
            ImageView ivSketchRefresh = fragmentSketchDraftBinding.f8749j;
            Intrinsics.checkNotNullExpressionValue(ivSketchRefresh, "ivSketchRefresh");
            ivSketchRefresh.setVisibility(0);
            m9178z0();
            return;
        }
        LogUtils.m3238e("SketchDraftFragment,加载的图片-----云端网页");
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding = fragmentSketchDraftBinding3;
        }
        ImageView ivSketchRefresh2 = fragmentSketchDraftBinding.f8749j;
        Intrinsics.checkNotNullExpressionValue(ivSketchRefresh2, "ivSketchRefresh");
        ivSketchRefresh2.setVisibility(8);
        m9156E0(url, showLoading, callback);
    }

    /* renamed from: o0 */
    public final void m9168o0() {
        this.isChange = false;
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8754o.m11431h();
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding2 = fragmentSketchDraftBinding3;
        }
        fragmentSketchDraftBinding2.f8747h.performClick();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSketchDraftBinding fragmentSketchDraftBindingM8663c = FragmentSketchDraftBinding.m8663c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fragmentSketchDraftBindingM8663c, "inflate(...)");
        this.binding = fragmentSketchDraftBindingM8663c;
        if (fragmentSketchDraftBindingM8663c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBindingM8663c = null;
        }
        ConstraintLayout root = fragmentSketchDraftBindingM8663c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m9162P();
    }

    /* renamed from: p0 */
    public final void m9169p0(long targetTime, String targetPath) throws Throwable {
        String str;
        FragmentSketchDraftBinding fragmentSketchDraftBinding;
        File file;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2;
        Object next;
        File[] fileArr;
        String str2;
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        LogUtils.m3237d(FragmentTag.SketchDraftFragmentTag, "保存图片, targetTime=" + targetTime + ", targetPath=" + targetPath);
        if (Intrinsics.areEqual(this.path, targetPath)) {
            FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
            String str3 = "binding";
            if (fragmentSketchDraftBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSketchDraftBinding3 = null;
            }
            fragmentSketchDraftBinding3.f8754o.m11432i(targetPath);
            File file2 = new File(targetPath);
            if (!file2.exists() || !file2.isDirectory()) {
                LogUtils.m3238e(FragmentTag.SketchDraftFragmentTag, "保存失败：目录不存在 " + targetPath);
                return;
            }
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file3 = fileArrListFiles[i10];
                    if (file3.isFile()) {
                        String name = file3.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        fileArr = fileArrListFiles;
                        str2 = str3;
                        if (StringsKt.endsWith$default(name, ".webp", false, 2, (Object) null)) {
                            String name2 = file3.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!StringsKt.startsWith$default(name2, "bg_at_", false, 2, (Object) null)) {
                                arrayList.add(file3);
                            }
                        }
                    } else {
                        fileArr = fileArrListFiles;
                        str2 = str3;
                    }
                    i10++;
                    fileArrListFiles = fileArr;
                    str3 = str2;
                }
                str = str3;
                fragmentSketchDraftBinding = null;
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long jLastModified = ((File) next).lastModified();
                        do {
                            Object next2 = it.next();
                            long jLastModified2 = ((File) next2).lastModified();
                            if (jLastModified < jLastModified2) {
                                next = next2;
                                jLastModified = jLastModified2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                file = (File) next;
            } else {
                str = "binding";
                fragmentSketchDraftBinding = null;
                file = null;
            }
            if (file == null) {
                LogUtils.m3238e(FragmentTag.SketchDraftFragmentTag, "保存失败：未找到生成的 UUID webp 文件");
                return;
            }
            File file4 = new File(file2, "bg_at_" + targetTime + ".webp");
            try {
                FilesKt.copyTo$default(file, file4, true, 0, 4, null);
                if (!file4.exists() || file4.length() <= 0) {
                    LogUtils.m3238e(FragmentTag.SketchDraftFragmentTag, "复制后的文件异常，终止后续流程");
                    return;
                }
                if (!file.delete()) {
                    LogUtils.m3241w(FragmentTag.SketchDraftFragmentTag, "UUID 临时文件删除失败：" + file.getAbsolutePath());
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file4.getAbsolutePath());
                this.cachedBitmap = bitmapDecodeFile;
                if (bitmapDecodeFile != null) {
                    FragmentSketchDraftBinding fragmentSketchDraftBinding4 = this.binding;
                    if (fragmentSketchDraftBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        fragmentSketchDraftBinding2 = fragmentSketchDraftBinding;
                    } else {
                        fragmentSketchDraftBinding2 = fragmentSketchDraftBinding4;
                    }
                    fragmentSketchDraftBinding2.f8754o.setImageBackground(bitmapDecodeFile);
                }
                LogUtils.m3237d(FragmentTag.SketchDraftFragmentTag, "保存成功：" + file4.getAbsolutePath());
            } catch (Exception e10) {
                LogUtils.m3238e(FragmentTag.SketchDraftFragmentTag, "保存图片失败: " + e10.getMessage(), e10);
            }
        }
    }

    /* renamed from: q0 */
    public final void m9170q0(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8754o.setImageBackground(bitmap);
    }

    /* renamed from: r0 */
    public final void m9171r0(View view) {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        ImageView imageView = fragmentSketchDraftBinding.f8750k;
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding3 = null;
        }
        ImageView imageView2 = fragmentSketchDraftBinding3.f8747h;
        FragmentSketchDraftBinding fragmentSketchDraftBinding4 = this.binding;
        if (fragmentSketchDraftBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding4 = null;
        }
        ImageView imageView3 = fragmentSketchDraftBinding4.f8746g;
        FragmentSketchDraftBinding fragmentSketchDraftBinding5 = this.binding;
        if (fragmentSketchDraftBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding5 = null;
        }
        ImageView imageView4 = fragmentSketchDraftBinding5.f8743d;
        FragmentSketchDraftBinding fragmentSketchDraftBinding6 = this.binding;
        if (fragmentSketchDraftBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding2 = fragmentSketchDraftBinding6;
        }
        for (ImageView imageView5 : CollectionsKt.listOf((Object[]) new ImageView[]{imageView, imageView2, imageView3, imageView4, fragmentSketchDraftBinding2.f8745f})) {
            imageView5.setSelected(Intrinsics.areEqual(imageView5, view));
        }
    }

    /* renamed from: s0 */
    public final void m9172s0(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8754o.m11430g(path);
        FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
        if (fragmentSketchDraftBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentSketchDraftBinding2 = fragmentSketchDraftBinding3;
        }
        fragmentSketchDraftBinding2.f8752m.setVisibility(0);
    }

    /* renamed from: t0 */
    public final void m9173t0(boolean isSeeMode) {
        if (isSeeMode) {
            FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
            FragmentSketchDraftBinding fragmentSketchDraftBinding2 = null;
            if (fragmentSketchDraftBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentSketchDraftBinding = null;
            }
            fragmentSketchDraftBinding.f8750k.performClick();
            FragmentSketchDraftBinding fragmentSketchDraftBinding3 = this.binding;
            if (fragmentSketchDraftBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentSketchDraftBinding2 = fragmentSketchDraftBinding3;
            }
            LinearLayoutCompat llControl = fragmentSketchDraftBinding2.f8752m;
            Intrinsics.checkNotNullExpressionValue(llControl, "llControl");
            llControl.setVisibility(8);
        }
    }

    /* renamed from: u0 */
    public final void m9174u0(long qstLastModifyTime) {
        this.qstLastModifyTime = qstLastModifyTime;
    }

    /* renamed from: v0 */
    public final void m9175v0(Function1 function1) {
        this.isTouchingChangeListener = function1;
    }

    /* renamed from: w0 */
    public final void m9176w0() {
        Bitmap bitmap = this.imageWithAnswer;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            bitmap2 = bitmap;
        }
        if (bitmap2 != null) {
            m9170q0(bitmap2);
        } else {
            m9177y0();
            m9137l0(this, this.url, true, false, new Function1() { // from class: t5.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SketchDraftFragment.m9152x0(this.f16369a, (Bitmap) obj);
                }
            }, 4, null);
        }
    }

    /* renamed from: y0 */
    public final void m9177y0() {
        FragmentSketchDraftBinding fragmentSketchDraftBinding = this.binding;
        if (fragmentSketchDraftBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSketchDraftBinding = null;
        }
        fragmentSketchDraftBinding.f8753n.setVisibility(0);
    }

    /* renamed from: z0 */
    public final void m9178z0() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.board_title_change);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity, 2131952325).setMessage(string).setPositiveButton(getString(R.string.sure), new DialogInterface.OnClickListener() { // from class: t5.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    SketchDraftFragment.m9096A0(this.f16372a, dialogInterface, i10);
                }
            }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: t5.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    SketchDraftFragment.m9100C0(this.f16373a, dialogInterface, i10);
                }
            }).create();
            Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.show();
        }
    }
}
