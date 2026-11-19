package com.zykj.view.board.board;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.view.R$dimen;
import com.zykj.view.R$id;
import com.zykj.view.board.board.AbstractC7225l;
import com.zykj.view.board.board.AbstractC7227n;
import com.zykj.view.board.board.AbstractC7231r;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.databinding.ViewFragmentBoardBinding;
import com.zykj.view.databinding.ViewIncludeImageAddBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import com.zykj.view.databinding.ViewItemSketchRecordBinding;
import com.zykj.view.widget.SketchProgressView;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p027b8.AbstractC5046c;
import p027b8.C5045b;
import p027b8.C5060q;
import p027b8.C5062s;
import p066d5.InterfaceC7289a;
import p066d5.InterfaceC7290b;
import p066d5.InterfaceC7291c;
import p213q7.AbstractC8902a2;

@Metadata(m13557d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 K2\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0003JS\u0010.\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020\u00112\u0018\b\u0002\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\u0003R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010H\u001a\u0010\u0012\f\u0012\n E*\u0004\u0018\u00010(0(0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010)\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, m13558d2 = {"Lcom/zykj/view/board/board/BoardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "y1", "r0", "R0", "r1", "f1", "w0", "J0", "p0", "y0", "u0", "k1", "e1", "", "isOpen", "I1", "(Z)V", "F1", "C1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "showProgress", "hideProgress", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "filename", "isSelected", "Lkotlin/Function1;", "imagePathCallback", "k0", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "x1", "t0", "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;", "a", "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;", "mBinding", "Lcom/zykj/view/board/board/BoardViewModel;", "b", "Lkotlin/Lazy;", "n0", "()Lcom/zykj/view/board/board/BoardViewModel;", "mViewModel", "Lb8/q;", "c", "Lb8/q;", "mImagePicker", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "audioCallback", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "e", "Landroidx/activity/result/ActivityResultLauncher;", "audioPermissionRequest", "o0", "()Ljava/lang/String;", "f", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,1030:1\n1#2:1031\n1321#3,2:1032\n1332#3,3:1034\n1332#3,3:1037\n1332#3,3:1040\n1332#3,3:1043\n29#4:1046\n85#4,18:1047\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n*L\n378#1:1032,2\n391#1:1034,3\n398#1:1037,3\n415#1:1040,3\n466#1:1043,3\n781#1:1046\n781#1:1047,18\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardFragment extends Fragment {

    /* renamed from: a, reason: from kotlin metadata */
    public ViewFragmentBoardBinding mBinding;

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy mViewModel = LazyKt.lazy(new Function0() { // from class: q7.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BoardFragment.m10687B1();
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public final C5060q mImagePicker = new C5060q(this, null, 2, null);

    /* renamed from: d, reason: from kotlin metadata */
    public Function0 audioCallback;

    /* renamed from: e, reason: from kotlin metadata */
    public final ActivityResultLauncher audioPermissionRequest;

    /* renamed from: com.zykj.view.board.board.BoardFragment$b */
    public static final class C7206b implements InterfaceC7291c {
        public C7206b() {
        }

        @Override // p066d5.InterfaceC7291c
        /* renamed from: a */
        public void mo10819a(String initText, Function1 afterTextChangedCallback, Function1 doneCallback, Function0 cancelCallback) {
            Intrinsics.checkNotNullParameter(initText, "initText");
            Intrinsics.checkNotNullParameter(afterTextChangedCallback, "afterTextChangedCallback");
            Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
            Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
            Context contextRequireContext = BoardFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            AbstractC8902a2.m15016i(contextRequireContext, initText, afterTextChangedCallback, cancelCallback, doneCallback);
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$c */
    public static final class C7207c implements InterfaceC7290b {
        public C7207c() {
        }

        /* renamed from: c */
        public static final Unit m10821c(Function1 function1, Function0 function0, Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
            String absolutePath;
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
            Intrinsics.checkNotNullParameter(imageLocalPath, "imageLocalPath");
            Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
            Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
            C5060q c5060q = BoardFragment.this.mImagePicker;
            Uri uriFile2Uri = UriUtils.file2Uri(new File(imageLocalPath));
            Intrinsics.checkNotNullExpressionValue(uriFile2Uri, "file2Uri(...)");
            c5060q.m2568y(uriFile2Uri, new Function1() { // from class: q7.f1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BoardFragment.C7207c.m10821c(doneCallback, cancelCallback, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$d */
    public static final class C7208d implements InterfaceC7289a {
        public C7208d() {
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: a */
        public void mo10823a(Integer num) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f11374a.setSelectColor(num);
            ViewFragmentBoardBinding viewFragmentBoardBinding3 = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
            }
            viewFragmentBoardBinding2.f11374a.m11500c();
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: b */
        public void mo10824b(Integer num) {
            if (num != null) {
                C5062s.f2627a.m2573d(num.intValue());
            }
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: c */
        public boolean mo10825c(int i10) {
            return C5045b.f2579a.m2522b(i10);
        }

        @Override // p066d5.InterfaceC7289a
        /* renamed from: d */
        public void mo10826d(Function1 function1) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f11374a.setOnColorChangeListener(function1);
        }

        @Override // p066d5.InterfaceC7289a
        public void dispatchTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f11374a.dispatchTouchEvent(event);
        }

        @Override // p066d5.InterfaceC7289a
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f11374a.draw(canvas);
        }

        @Override // p066d5.InterfaceC7289a
        public float getHeight() {
            return BoardFragment.this.requireContext().getResources().getDimension(R$dimen.view_138);
        }

        @Override // p066d5.InterfaceC7289a
        public float getWidth() {
            return BoardFragment.this.requireContext().getResources().getDimension(R$dimen.view_174);
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$e */
    public static final class C7209e implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f10883b;

        public C7209e(boolean z9) {
            this.f10883b = z9;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f11386m.setEnabled(true);
            BoardFragment.this.m10810n0().m10934d1(this.f10883b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public BoardFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: q7.a0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BoardFragment.m10769m0(this.f15210a, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.audioPermissionRequest = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: A0 */
    public static final void m10683A0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10931c0();
    }

    /* renamed from: A1 */
    public static final Unit m10684A1(BoardFragment boardFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogUtils.m3237d("页面BoardFragment，画板数据加载失败，message: " + it.getMessage());
        boardFragment.hideProgress();
        boardFragment.m10810n0().m10903O();
        return Unit.INSTANCE;
    }

    /* renamed from: B0 */
    public static final void m10686B0(final BoardFragment boardFragment, View view) {
        boardFragment.audioCallback = new Function0() { // from class: q7.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m10689C0(this.f15302a);
            }
        };
        boardFragment.audioPermissionRequest.launch("android.permission.RECORD_AUDIO");
    }

    /* renamed from: B1 */
    public static final BoardViewModel m10687B1() {
        return new BoardViewModel();
    }

    /* renamed from: C0 */
    public static final Unit m10689C0(BoardFragment boardFragment) {
        boardFragment.m10810n0().m10918V0();
        return Unit.INSTANCE;
    }

    /* renamed from: D0 */
    public static final void m10691D0(BoardFragment boardFragment, View view) {
        BoardViewModel.m10854g1(boardFragment.m10810n0(), false, 1, null);
    }

    /* renamed from: D1 */
    public static final Unit m10692D1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        final File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        m10766l0(boardFragment, null, fileUri2FileNoCacheCopy.getAbsolutePath(), null, true, new Function1() { // from class: q7.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10695E1(fileUri2FileNoCacheCopy, (String) obj);
            }
        }, 5, null);
        return Unit.INSTANCE;
    }

    /* renamed from: E0 */
    public static final void m10694E0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        boardFragment.m10810n0().m10903O();
    }

    /* renamed from: E1 */
    public static final Unit m10695E1(File file, String str) {
        FileUtils.delete(file);
        return Unit.INSTANCE;
    }

    /* renamed from: F0 */
    public static final void m10697F0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        boardFragment.m10810n0().m10903O();
    }

    /* renamed from: G0 */
    public static final void m10699G0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        boardFragment.m10810n0().m10903O();
    }

    /* renamed from: G1 */
    public static final Unit m10700G1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        final File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        m10766l0(boardFragment, null, fileUri2FileNoCacheCopy.getAbsolutePath(), null, true, new Function1() { // from class: q7.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10703H1(fileUri2FileNoCacheCopy, (String) obj);
            }
        }, 5, null);
        return Unit.INSTANCE;
    }

    /* renamed from: H0 */
    public static final void m10702H0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10898L();
    }

    /* renamed from: H1 */
    public static final Unit m10703H1(File file, String str) {
        FileUtils.delete(file);
        return Unit.INSTANCE;
    }

    /* renamed from: I0 */
    public static final void m10705I0(BoardFragment boardFragment, ViewItemSketchRecordBinding viewItemSketchRecordBinding, View view) {
        boardFragment.m10810n0().m10903O();
    }

    /* renamed from: K0 */
    public static final void m10708K0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10903O();
        boardFragment.m10802F1();
    }

    /* renamed from: L0 */
    public static final void m10710L0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10903O();
        boardFragment.m10801C1();
    }

    /* renamed from: M0 */
    public static final void m10712M0(final BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AbstractC8902a2.m15017j(contextRequireContext, null, null, null, new Function1() { // from class: q7.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10714N0(this.f15299a, (String) obj);
            }
        }, 7, null);
    }

    /* renamed from: N0 */
    public static final Unit m10714N0(BoardFragment boardFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boardFragment.m10810n0().m10957z(it);
        return Unit.INSTANCE;
    }

    /* renamed from: O0 */
    public static final void m10716O0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10935e1(AbstractC7225l.c.f11055e);
    }

    /* renamed from: P0 */
    public static final void m10718P0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10935e1(AbstractC7225l.b.f11054e);
    }

    /* renamed from: Q0 */
    public static final void m10720Q0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10935e1(AbstractC7225l.d.f11056e);
    }

    /* renamed from: S0 */
    public static final void m10723S0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        BoardViewModel.m10866o1(boardFragment.m10810n0(), false, 1, null);
    }

    /* renamed from: T0 */
    public static final void m10725T0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10949p1(true);
    }

    /* renamed from: U0 */
    public static final void m10727U0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10949p1(false);
    }

    /* renamed from: V0 */
    public static final void m10729V0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10938h1(AbstractC7227n.c.f11069e);
        boardFragment.m10810n0().m10916U0();
    }

    /* renamed from: W0 */
    public static final void m10731W0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10938h1(AbstractC7227n.a.f11067e);
        boardFragment.m10810n0().m10910R0();
    }

    /* renamed from: X0 */
    public static final void m10733X0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10912S0();
    }

    /* renamed from: Y0 */
    public static final void m10735Y0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10908Q0();
    }

    /* renamed from: Z0 */
    public static final void m10737Z0(final BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        Context contextRequireContext = boardFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AbstractC8902a2.m15013f(contextRequireContext, new Function0() { // from class: q7.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m10739a1(this.f15293a);
            }
        });
    }

    /* renamed from: a1 */
    public static final Unit m10739a1(BoardFragment boardFragment) {
        boardFragment.m10810n0().m10888G();
        return Unit.INSTANCE;
    }

    /* renamed from: b1 */
    public static final void m10741b1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10906P0(false);
    }

    /* renamed from: c1 */
    public static final void m10744c1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10906P0(true);
    }

    /* renamed from: d1 */
    public static final void m10747d1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10896K();
        boardFragment.m10810n0().m10938h1(AbstractC7227n.d.f11070e);
        boardFragment.m10810n0().m10920W0();
    }

    /* renamed from: g1 */
    public static final void m10754g1(BoardFragment boardFragment, View view) {
        int id = view.getId();
        if (id == R$id.rb_pen_custom) {
            boardFragment.m10810n0().m10944l1(AbstractC7231r.b.f11100f);
            return;
        }
        if (id == R$id.rb_pen_line) {
            boardFragment.m10810n0().m10944l1(AbstractC7231r.e.f11103f);
            return;
        }
        if (id == R$id.rb_pen_dotted_line) {
            boardFragment.m10810n0().m10944l1(AbstractC7231r.c.f11101f);
        } else if (id == R$id.rb_pen_cursor) {
            boardFragment.m10810n0().m10944l1(AbstractC7231r.a.f11099f);
        } else if (id == R$id.rb_pen_highlighter) {
            boardFragment.m10810n0().m10944l1(AbstractC7231r.d.f11102f);
        }
    }

    /* renamed from: h1 */
    public static final void m10757h1(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m10810n0().m10942k1(i10);
    }

    /* renamed from: i1 */
    public static final void m10760i1(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m10810n0().m10940i1(i10);
    }

    /* renamed from: j1 */
    public static final Unit m10763j1(BoardFragment boardFragment, int i10) {
        boardFragment.m10810n0().m10941j1(i10);
        return Unit.INSTANCE;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m10766l0(BoardFragment boardFragment, Bitmap bitmap, String str, String str2, boolean z9, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            z9 = false;
        }
        if ((i10 & 16) != 0) {
            function1 = null;
        }
        boardFragment.m10808k0(bitmap, str, str2, z9, function1);
    }

    /* renamed from: l1 */
    public static final Unit m10767l1(BoardFragment boardFragment) {
        boardFragment.m10810n0().m10885D();
        return Unit.INSTANCE;
    }

    /* renamed from: m0 */
    public static final void m10769m0(BoardFragment boardFragment, Boolean it) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue() && (function0 = boardFragment.audioCallback) != null) {
            function0.invoke();
        }
        boardFragment.audioCallback = null;
    }

    /* renamed from: m1 */
    public static final Unit m10770m1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m10841F(boardFragment.m10810n0(), null, Float.valueOf(f10), 1, null);
        return Unit.INSTANCE;
    }

    /* renamed from: n1 */
    public static final Unit m10772n1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m10839C(boardFragment.m10810n0(), null, Float.valueOf(f10), 1, null);
        return Unit.INSTANCE;
    }

    /* renamed from: o1 */
    public static final Unit m10774o1(BoardFragment boardFragment) {
        boardFragment.m10810n0().m10885D();
        return Unit.INSTANCE;
    }

    /* renamed from: p1 */
    public static final Unit m10776p1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m10841F(boardFragment.m10810n0(), Float.valueOf(f10), null, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: q0 */
    public static final void m10778q0(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m10810n0().m10924Y0(i10);
    }

    /* renamed from: q1 */
    public static final Unit m10779q1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m10839C(boardFragment.m10810n0(), Float.valueOf(f10), null, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: s0 */
    public static final void m10782s0(BoardFragment boardFragment) {
        BoardViewModel boardViewModelM10810n0 = boardFragment.m10810n0();
        ViewFragmentBoardBinding viewFragmentBoardBinding = boardFragment.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        float width = viewFragmentBoardBinding.f11390q.getWidth();
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = boardFragment.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        boardViewModelM10810n0.m10891H0(width, viewFragmentBoardBinding2.f11390q.getHeight());
    }

    /* renamed from: s1 */
    public static final void m10783s1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10894J();
        boardFragment.m10810n0().m10946m1(SelectGraphEnum.STROKE);
    }

    /* renamed from: t0 */
    private final void m10785t0() {
        m10805R0();
        m10814r1();
        m10807f1();
        m10816w0();
        m10804J0();
        m10812p0();
        m10817y0();
        m10809k1();
        m10815u0();
    }

    /* renamed from: t1 */
    public static final void m10786t1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10894J();
        boardFragment.m10810n0().m10946m1(SelectGraphEnum.STROKE_HIGHLIGHTER);
    }

    /* renamed from: u1 */
    public static final void m10788u1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10894J();
        boardFragment.m10810n0().m10946m1(SelectGraphEnum.IMAGE);
    }

    /* renamed from: v0 */
    public static final Unit m10790v0(BoardFragment boardFragment) {
        boardFragment.m10810n0().m10892I();
        return Unit.INSTANCE;
    }

    /* renamed from: v1 */
    public static final void m10791v1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10894J();
        boardFragment.m10810n0().m10946m1(SelectGraphEnum.TEXT);
    }

    /* renamed from: w1 */
    public static final void m10793w1(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10894J();
        boardFragment.m10810n0().m10946m1(SelectGraphEnum.GEOMETRY);
    }

    /* renamed from: x0 */
    public static final void m10795x0(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m10810n0().m10932c1(i10);
    }

    /* renamed from: x1 */
    private final void m10796x1() throws FileNotFoundException {
        m10813r0();
        m10785t0();
        m10806e1();
        m10818y1();
    }

    /* renamed from: z0 */
    public static final void m10799z0(BoardFragment boardFragment, View view) {
        boardFragment.m10810n0().m10903O();
    }

    /* renamed from: z1 */
    public static final Unit m10800z1(BoardFragment boardFragment, IBoardControl iBoardControl, boolean z9, long j10) {
        Intrinsics.checkNotNullParameter(iBoardControl, "iBoardControl");
        LogUtils.m3237d("页面BoardFragment，画板数据加载成功，是否缓存" + z9 + "，加载耗时为" + j10);
        boardFragment.m10810n0().m10939i0(iBoardControl, z9, j10);
        boardFragment.hideProgress();
        return Unit.INSTANCE;
    }

    /* renamed from: C1 */
    public final void m10801C1() {
        if (m10810n0().m10893I0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C5060q.m2536D(this.mImagePicker, null, true, new Function1() { // from class: q7.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BoardFragment.m10692D1(this.f15305a, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: F1 */
    public final void m10802F1() {
        if (m10810n0().m10893I0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            this.mImagePicker.m2563A(true, new Function1() { // from class: q7.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BoardFragment.m10700G1(this.f15309a, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: I1 */
    public final void m10803I1(boolean isOpen) {
        float f10;
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11386m.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C7209e(isOpen));
        float f11 = 0.0f;
        if (isOpen) {
            ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
            if (viewFragmentBoardBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding3 = null;
            }
            f10 = -viewFragmentBoardBinding3.f11381h.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!isOpen) {
            ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
            if (viewFragmentBoardBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding4 = null;
            }
            f11 = -viewFragmentBoardBinding4.f11381h.getRoot().getWidth();
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentBoardBinding5.f11381h.getRoot(), "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.mBinding;
        if (viewFragmentBoardBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding6.f11391r, "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.mBinding;
        if (viewFragmentBoardBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding2.f11386m, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: J0 */
    public final void m10804J0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f11380g;
        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f11481b;
        Intrinsics.checkNotNullExpressionValue(ivImageGallery, "ivImageGallery");
        AbstractC5046c.m2530f(ivImageGallery, 0L, new View.OnClickListener() { // from class: q7.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10708K0(this.f15292a, view);
            }
        }, 1, null);
        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f11480a;
        Intrinsics.checkNotNullExpressionValue(ivImageCamera, "ivImageCamera");
        AbstractC5046c.m2530f(ivImageCamera, 0L, new View.OnClickListener() { // from class: q7.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10710L0(this.f15295a, view);
            }
        }, 1, null);
        AppCompatImageView ivText = viewIncludeImageAddBinding.f11484e;
        Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
        AbstractC5046c.m2530f(ivText, 0L, new View.OnClickListener() { // from class: q7.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10712M0(this.f15298a, view);
            }
        }, 1, null);
        viewIncludeImageAddBinding.f11483d.setOnClickListener(new View.OnClickListener() { // from class: q7.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10716O0(this.f15301a, view);
            }
        });
        viewIncludeImageAddBinding.f11482c.setOnClickListener(new View.OnClickListener() { // from class: q7.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10718P0(this.f15304a, view);
            }
        });
        viewIncludeImageAddBinding.f11485f.setOnClickListener(new View.OnClickListener() { // from class: q7.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10720Q0(this.f15310a, view);
            }
        });
    }

    /* renamed from: R0 */
    public final void m10805R0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f11381h;
        viewIncludeMenuBinding.f11500k.setOnClickListener(new View.OnClickListener() { // from class: q7.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10741b1(this.f15211a, view);
            }
        });
        viewIncludeMenuBinding.f11496g.setOnClickListener(new View.OnClickListener() { // from class: q7.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10744c1(this.f15234a, view);
            }
        });
        viewIncludeMenuBinding.f11498i.setOnClickListener(new View.OnClickListener() { // from class: q7.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10747d1(this.f15242a, view);
            }
        });
        viewIncludeMenuBinding.f11499j.setOnClickListener(new View.OnClickListener() { // from class: q7.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10723S0(this.f15245a, view);
            }
        });
        viewIncludeMenuBinding.f11492c.setOnClickListener(new View.OnClickListener() { // from class: q7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10725T0(this.f15232a, view);
            }
        });
        viewIncludeMenuBinding.f11497h.setOnClickListener(new View.OnClickListener() { // from class: q7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10727U0(this.f15240a, view);
            }
        });
        viewIncludeMenuBinding.f11495f.setOnClickListener(new View.OnClickListener() { // from class: q7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10729V0(this.f15243a, view);
            }
        });
        viewIncludeMenuBinding.f11493d.setOnClickListener(new View.OnClickListener() { // from class: q7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10731W0(this.f15246a, view);
            }
        });
        viewIncludeMenuBinding.f11494e.setOnClickListener(new View.OnClickListener() { // from class: q7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10733X0(this.f15250a, view);
            }
        });
        viewIncludeMenuBinding.f11490a.setOnClickListener(new View.OnClickListener() { // from class: q7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10735Y0(this.f15253a, view);
            }
        });
        viewIncludeMenuBinding.f11491b.setOnClickListener(new View.OnClickListener() { // from class: q7.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10737Z0(this.f15216a, view);
            }
        });
    }

    /* renamed from: e1 */
    public final void m10806e1() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BoardFragment$initObserver$1(this, null), 3, null);
    }

    /* renamed from: f1 */
    public final void m10807f1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgPenType = viewFragmentBoardBinding.f11382i.f11516l;
        Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
        Iterator<View> it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: q7.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m10754g1(this.f15269a, view);
                }
            });
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentBoardBinding3.f11382i.f11515k;
        Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
        final int i10 = 0;
        final int i11 = 0;
        for (View view : ViewGroupKt.getChildren(rgPenSize)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: q7.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BoardFragment.m10757h1(this.f15307a, i11, view2);
                }
            });
            i11 = i12;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        RadioGroup rgPenColor = viewFragmentBoardBinding4.f11382i.f11514j;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        for (View view2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view2.setOnClickListener(new View.OnClickListener() { // from class: q7.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BoardFragment.m10760i1(this.f15257a, i10, view3);
                }
            });
            i10 = i13;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding5;
        }
        viewFragmentBoardBinding2.f11375b.setOnColorChangeListener(new Function1() { // from class: q7.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10763j1(this.f15296a, ((Integer) obj).intValue());
            }
        });
    }

    public final void hideProgress() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11387n.setVisibility(8);
    }

    /* renamed from: k0 */
    public final void m10808k0(Bitmap bitmap, String path, String filename, boolean isSelected, Function1 imagePathCallback) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        BoardViewModel.m10878y(m10810n0(), bitmap, path, null, isSelected, filename, imagePathCallback, 4, null);
    }

    /* renamed from: k1 */
    public final void m10809k1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchProgressView sketchProgressVertical = viewFragmentBoardBinding.f11389p;
        Intrinsics.checkNotNullExpressionValue(sketchProgressVertical, "sketchProgressVertical");
        AbstractC5046c.m2528d(sketchProgressVertical, new Function0() { // from class: q7.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m10767l1(this.f15267a);
            }
        }, new Function1() { // from class: q7.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10770m1(this.f15270a, ((Float) obj).floatValue());
            }
        }, new Function1() { // from class: q7.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10772n1(this.f15274a, ((Float) obj).floatValue());
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        SketchProgressView sketchProgressHorizontal = viewFragmentBoardBinding2.f11388o;
        Intrinsics.checkNotNullExpressionValue(sketchProgressHorizontal, "sketchProgressHorizontal");
        AbstractC5046c.m2528d(sketchProgressHorizontal, new Function0() { // from class: q7.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m10774o1(this.f15278a);
            }
        }, new Function1() { // from class: q7.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10776p1(this.f15282a, ((Float) obj).floatValue());
            }
        }, new Function1() { // from class: q7.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10779q1(this.f15285a, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: n0 */
    public final BoardViewModel m10810n0() {
        return (BoardViewModel) this.mViewModel.getValue();
    }

    /* renamed from: o0 */
    public final String m10811o0() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentBoardBinding viewFragmentBoardBindingM11394a = ViewFragmentBoardBinding.m11394a(inflater);
        Intrinsics.checkNotNull(viewFragmentBoardBindingM11394a);
        this.mBinding = viewFragmentBoardBindingM11394a;
        View root = viewFragmentBoardBindingM11394a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hideProgress();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m10796x1();
    }

    /* renamed from: p0 */
    public final void m10812p0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgBackgroundColor = viewFragmentBoardBinding.f11377d.f11444g;
        Intrinsics.checkNotNullExpressionValue(rgBackgroundColor, "rgBackgroundColor");
        final int i10 = 0;
        for (View view : ViewGroupKt.getChildren(rgBackgroundColor)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: q7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BoardFragment.m10778q0(this.f15212a, i10, view2);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: r0 */
    public final void m10813r0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11390q.post(new Runnable() { // from class: q7.r0
            @Override // java.lang.Runnable
            public final void run() {
                BoardFragment.m10782s0(this.f15290a);
            }
        });
        m10810n0().m10904O0(new C7206b());
        m10810n0().m10902N0(new C7207c());
        m10810n0().m10899L0(new C7208d());
    }

    /* renamed from: r1 */
    public final void m10814r1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11384k.f11529d.setOnClickListener(new View.OnClickListener() { // from class: q7.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10783s1(this.f15247a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        viewFragmentBoardBinding3.f11384k.f11527b.setOnClickListener(new View.OnClickListener() { // from class: q7.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10786t1(this.f15251a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        viewFragmentBoardBinding4.f11384k.f11528c.setOnClickListener(new View.OnClickListener() { // from class: q7.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10788u1(this.f15254a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding5 = null;
        }
        viewFragmentBoardBinding5.f11384k.f11530e.setOnClickListener(new View.OnClickListener() { // from class: q7.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10791v1(this.f15261a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.mBinding;
        if (viewFragmentBoardBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding6;
        }
        viewFragmentBoardBinding2.f11384k.f11526a.setOnClickListener(new View.OnClickListener() { // from class: q7.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10793w1(this.f15264a, view);
            }
        });
    }

    public final void showProgress() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11387n.setVisibility(0);
    }

    /* renamed from: u0 */
    public final void m10815u0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11376c.setOnBeforeTouchDispatchToChildren(new Function0() { // from class: q7.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m10790v0(this.f15244a);
            }
        });
    }

    /* renamed from: w0 */
    public final void m10816w0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentBoardBinding.f11379f.f11459d;
        Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
        final int i10 = 0;
        for (View view : ViewGroupKt.getChildren(rgEraserSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: q7.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BoardFragment.m10795x0(this.f15214a, i10, view2);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: y0 */
    public final void m10817y0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f11385l.setOnClickListener(new View.OnClickListener() { // from class: q7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10799z0(this.f15256a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        viewFragmentBoardBinding3.f11386m.setOnClickListener(new View.OnClickListener() { // from class: q7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10683A0(this.f15260a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        final ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding4.f11383j;
        AppCompatImageView ivRecord = viewItemSketchRecordAudioBinding.f11547b;
        Intrinsics.checkNotNullExpressionValue(ivRecord, "ivRecord");
        AbstractC5046c.m2530f(ivRecord, 0L, new View.OnClickListener() { // from class: q7.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10686B0(this.f15263a, view);
            }
        }, 1, null);
        viewItemSketchRecordAudioBinding.f11546a.setOnClickListener(new View.OnClickListener() { // from class: q7.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10691D0(this.f15266a, view);
            }
        });
        viewItemSketchRecordAudioBinding.f11548c.setOnClickListener(new View.OnClickListener() { // from class: q7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10694E0(this.f15272a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f11551f.setOnClickListener(new View.OnClickListener() { // from class: q7.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10697F0(this.f15276a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f11553h.setOnClickListener(new View.OnClickListener() { // from class: q7.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10699G0(this.f15280a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f11549d.setOnClickListener(new View.OnClickListener() { // from class: q7.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10702H0(this.f15284a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding5;
        }
        final ViewItemSketchRecordBinding viewItemSketchRecordBinding = viewFragmentBoardBinding2.f11378e;
        viewItemSketchRecordBinding.f11559a.setOnClickListener(new View.OnClickListener() { // from class: q7.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m10705I0(this.f15288a, viewItemSketchRecordBinding, view);
            }
        });
    }

    /* renamed from: y1 */
    public final void m10818y1() throws FileNotFoundException {
        File externalCacheDir;
        String absolutePath;
        m10810n0().m10903O();
        showProgress();
        String strM10811o0 = m10811o0();
        if (strM10811o0.length() == 0) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                throw new FileNotFoundException("unknown board path");
            }
            strM10811o0 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        LogUtils.m3237d("页面BoardFragment，开始加载画板数据，画板路径" + strM10811o0);
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBoardBinding.f11390q;
        Intrinsics.checkNotNull(strM10811o0);
        sketchRecorderView.m6188b(strM10811o0, new Function3() { // from class: q7.c0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BoardFragment.m10800z1(this.f15233a, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new Function1() { // from class: q7.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m10684A1(this.f15241a, (Throwable) obj);
            }
        });
    }
}
