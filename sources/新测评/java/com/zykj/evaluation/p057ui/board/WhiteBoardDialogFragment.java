package com.zykj.evaluation.p057ui.board;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.NavArgsLazy;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.databinding.FragmentWhiteBoardBinding;
import com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragment;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p027b8.AbstractC5046c;
import p101g7.C7585a;
import p235s7.C9317a;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u0011\u001a\u00020\u00002\u001e\u0010\u0010\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00002\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a0\f¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0094@¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R&\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R0\u0010\u0010\u001a\u001c\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, m13558d2 = {"Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;", "Lcom/zykj/evaluation/base/BaseDialogFragment;", "Lcom/zykj/evaluation/databinding/FragmentWhiteBoardBinding;", "<init>", "()V", "", "layoutId", "()I", "", "isFullDialog", "()Z", "isShowDim", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/Bitmap;", "", "onImportAnswerClick", "F", "(Lkotlin/jvm/functions/Function1;)Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;", "hasStem", "D", "(Z)Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;", "", "stemSketchPath", "G", "(Ljava/lang/String;)Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;", "", "onConfirmCallback", ExifInterface.LONGITUDE_EAST, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "path", "Ljava/io/File;", "s", "(Ljava/lang/String;)Ljava/io/File;", "C", "()Ljava/lang/String;", "Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragmentArgs;", "f", "Landroidx/navigation/NavArgsLazy;", "u", "()Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragmentArgs;", "args", "Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;", "g", "Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;", "sketch", "h", "Lkotlin/jvm/functions/Function1;", "i", "j", "Z", "k", "Ljava/lang/String;", "l", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nWhiteBoardDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteBoardDialogFragment.kt\ncom/zykj/evaluation/ui/board/WhiteBoardDialogFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n42#2,3:208\n257#3,2:211\n3829#4:213\n4344#4,2:214\n1999#5,14:216\n*S KotlinDebug\n*F\n+ 1 WhiteBoardDialogFragment.kt\ncom/zykj/evaluation/ui/board/WhiteBoardDialogFragment\n*L\n32#1:208,3\n164#1:211,2\n178#1:213\n178#1:214,2\n179#1:216,14\n*E\n"})
/* loaded from: classes4.dex */
public final class WhiteBoardDialogFragment extends Hilt_WhiteBoardDialogFragment<FragmentWhiteBoardBinding> {

    /* renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m */
    public static final int f9049m = 8;

    /* renamed from: g, reason: from kotlin metadata */
    public BlackboardEvaluationFragment sketch;

    /* renamed from: h, reason: from kotlin metadata */
    public Function1 onConfirmCallback;

    /* renamed from: i, reason: from kotlin metadata */
    public Function1 onImportAnswerClick;

    /* renamed from: j, reason: from kotlin metadata */
    public boolean hasStem;

    /* renamed from: f, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(WhiteBoardDialogFragmentArgs.class), new C6885b(this));

    /* renamed from: k, reason: from kotlin metadata */
    public String stemSketchPath = "";

    /* renamed from: com.zykj.evaluation.ui.board.WhiteBoardDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WhiteBoardDialogFragment m9206a(WhiteBoardDialogFragmentArgs args) {
            Intrinsics.checkNotNullParameter(args, "args");
            WhiteBoardDialogFragment whiteBoardDialogFragment = new WhiteBoardDialogFragment();
            whiteBoardDialogFragment.setArguments(args.m9211d());
            return whiteBoardDialogFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.evaluation.ui.board.WhiteBoardDialogFragment$b */
    public static final class C6885b implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f9056a;

        public C6885b(Fragment fragment) {
            this.f9056a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f9056a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f9056a + " has null arguments");
        }
    }

    /* renamed from: A */
    public static final Unit m9179A(WhiteBoardDialogFragment whiteBoardDialogFragment) {
        BlackboardEvaluationFragment blackboardEvaluationFragment = whiteBoardDialogFragment.sketch;
        if (blackboardEvaluationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketch");
            blackboardEvaluationFragment = null;
        }
        if (blackboardEvaluationFragment.m11170U0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return Unit.INSTANCE;
        }
        LifecycleOwner viewLifecycleOwner = whiteBoardDialogFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WhiteBoardDialogFragment$initView$5$1(whiteBoardDialogFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static final Unit m9180B(WhiteBoardDialogFragment whiteBoardDialogFragment, float f10) {
        ((FragmentWhiteBoardBinding) whiteBoardDialogFragment.getMBindView()).f8759c.setText(f10 < 0.01f ? whiteBoardDialogFragment.getString(R.string.page_on_the_top) : f10 >= 0.99f ? whiteBoardDialogFragment.getString(R.string.page_on_the_bottom) : whiteBoardDialogFragment.getString(R.string.page_could_be_slide));
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final boolean m9193t(File file, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "bg_at_", false, 2, (Object) null) && StringsKt.endsWith$default(str, ".webp", false, 2, (Object) null);
    }

    /* renamed from: v */
    public static final void m9194v(WhiteBoardDialogFragment whiteBoardDialogFragment, View view) {
        whiteBoardDialogFragment.dismissAllowingStateLoss();
    }

    /* renamed from: w */
    public static final Unit m9195w(final WhiteBoardDialogFragment whiteBoardDialogFragment) {
        whiteBoardDialogFragment.showProgress();
        new Thread(new Runnable() { // from class: t5.h0
            @Override // java.lang.Runnable
            public final void run() {
                WhiteBoardDialogFragment.m9196x(this.f16368a);
            }
        }).start();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public static final void m9196x(final WhiteBoardDialogFragment whiteBoardDialogFragment) {
        final String strM9199C = whiteBoardDialogFragment.m9199C();
        ((FragmentWhiteBoardBinding) whiteBoardDialogFragment.getMBindView()).getRoot().post(new Runnable() { // from class: t5.i0
            @Override // java.lang.Runnable
            public final void run() {
                WhiteBoardDialogFragment.m9197y(this.f16370a, strM9199C);
            }
        });
    }

    /* renamed from: y */
    public static final void m9197y(WhiteBoardDialogFragment whiteBoardDialogFragment, String str) {
        whiteBoardDialogFragment.hideProgress();
        Function1 function1 = whiteBoardDialogFragment.onConfirmCallback;
        if (function1 != null) {
            whiteBoardDialogFragment.dismiss();
            function1.invoke(str);
        }
    }

    /* renamed from: z */
    public static final Unit m9198z(WhiteBoardDialogFragment whiteBoardDialogFragment) {
        BlackboardEvaluationFragment blackboardEvaluationFragment = whiteBoardDialogFragment.sketch;
        if (blackboardEvaluationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketch");
            blackboardEvaluationFragment = null;
        }
        if (blackboardEvaluationFragment.m11170U0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return Unit.INSTANCE;
        }
        if (!whiteBoardDialogFragment.hasStem) {
            ToastUtils.showShort("暂无题干可导入", new Object[0]);
            return Unit.INSTANCE;
        }
        LifecycleOwner viewLifecycleOwner = whiteBoardDialogFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WhiteBoardDialogFragment$initView$4$1(whiteBoardDialogFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public final String m9199C() {
        BlackboardEvaluationFragment blackboardEvaluationFragment;
        BlackboardEvaluationFragment blackboardEvaluationFragment2 = this.sketch;
        if (blackboardEvaluationFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketch");
            blackboardEvaluationFragment2 = null;
        }
        if (blackboardEvaluationFragment2.m11171V0()) {
            BlackboardEvaluationFragment blackboardEvaluationFragment3 = this.sketch;
            if (blackboardEvaluationFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sketch");
                blackboardEvaluationFragment = null;
            } else {
                blackboardEvaluationFragment = blackboardEvaluationFragment3;
            }
            Bitmap bitmapM11192l0 = blackboardEvaluationFragment.m11192l0(50, 20, 50, 50, true);
            String absolutePath = new File(m9205u().getFilePath(), "answer_" + System.currentTimeMillis() + ".webp").getAbsolutePath();
            if (bitmapM11192l0 != null) {
                C7585a c7585a = C7585a.f12711a;
                Intrinsics.checkNotNull(absolutePath);
                if (C7585a.m12441j(c7585a, bitmapM11192l0, absolutePath, true, false, 8, null) != null) {
                    return absolutePath;
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public final WhiteBoardDialogFragment m9200D(boolean hasStem) {
        this.hasStem = hasStem;
        return this;
    }

    /* renamed from: E */
    public final WhiteBoardDialogFragment m9201E(Function1 onConfirmCallback) {
        Intrinsics.checkNotNullParameter(onConfirmCallback, "onConfirmCallback");
        this.onConfirmCallback = onConfirmCallback;
        return this;
    }

    /* renamed from: F */
    public final WhiteBoardDialogFragment m9202F(Function1 onImportAnswerClick) {
        Intrinsics.checkNotNullParameter(onImportAnswerClick, "onImportAnswerClick");
        this.onImportAnswerClick = onImportAnswerClick;
        return this;
    }

    /* renamed from: G */
    public final WhiteBoardDialogFragment m9203G(String stemSketchPath) {
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        this.stemSketchPath = stemSketchPath;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        RelativeLayout rlRoot = ((FragmentWhiteBoardBinding) getMBindView()).f8757a;
        Intrinsics.checkNotNullExpressionValue(rlRoot, "rlRoot");
        AbstractC5046c.m2530f(rlRoot, 0L, new View.OnClickListener() { // from class: t5.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WhiteBoardDialogFragment.m9194v(this.f16356a, view);
            }
        }, 1, null);
        boolean zM9210c = m9205u().getIsHand();
        boolean zM9209b = m9205u().getIsCorrect();
        boolean z9 = true;
        BlackboardEvaluationFragment blackboardEvaluationFragmentM11198a = BlackboardEvaluationFragment.INSTANCE.m11198a(m9205u().getFilePath(), new C9317a(true, zM9210c, Boxing.boxInt(4), Boxing.boxInt((zM9210c || zM9209b) ? 6 : 1), zM9210c || zM9209b, (zM9210c || zM9209b) ? 0.5f : 0.65f, 30.0f, new Function0() { // from class: t5.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WhiteBoardDialogFragment.m9195w(this.f16359a);
            }
        }, true, true, true, true, 68.0f, zM9210c, new Function0() { // from class: t5.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WhiteBoardDialogFragment.m9198z(this.f16362a);
            }
        }, zM9209b, new Function0() { // from class: t5.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WhiteBoardDialogFragment.m9179A(this.f16364a);
            }
        }));
        this.sketch = blackboardEvaluationFragmentM11198a;
        BlackboardEvaluationFragment blackboardEvaluationFragment = null;
        if (blackboardEvaluationFragmentM11198a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketch");
            blackboardEvaluationFragmentM11198a = null;
        }
        blackboardEvaluationFragmentM11198a.m11182c1(new Function1() { // from class: t5.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WhiteBoardDialogFragment.m9180B(this.f16366a, ((Float) obj).floatValue());
            }
        });
        TextView tvSketchMoveTip = ((FragmentWhiteBoardBinding) getMBindView()).f8759c;
        Intrinsics.checkNotNullExpressionValue(tvSketchMoveTip, "tvSketchMoveTip");
        if (!zM9210c && !zM9209b) {
            z9 = false;
        }
        tvSketchMoveTip.setVisibility(z9 ? 0 : 8);
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        BlackboardEvaluationFragment blackboardEvaluationFragment2 = this.sketch;
        if (blackboardEvaluationFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketch");
        } else {
            blackboardEvaluationFragment = blackboardEvaluationFragment2;
        }
        fragmentTransactionBeginTransaction.replace(R.id.sketch_fragment, blackboardEvaluationFragment).commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public boolean isFullDialog() {
        return true;
    }

    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public boolean isShowDim() {
        return true;
    }

    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.fragment_white_board;
    }

    /* renamed from: s */
    public final File m9204s(String path) {
        File[] fileArrListFiles;
        File file = new File(path);
        Object next = null;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: t5.g0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return WhiteBoardDialogFragment.m9193t(file2, str);
            }
        })) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isFile() && file2.length() > 0) {
                arrayList.add(file2);
            }
        }
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
        }
        return (File) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public final WhiteBoardDialogFragmentArgs m9205u() {
        return (WhiteBoardDialogFragmentArgs) this.args.getValue();
    }
}
