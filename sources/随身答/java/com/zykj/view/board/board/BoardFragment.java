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
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.zykj.view.board.board.AbstractC7674q;
import com.zykj.view.board.board.AbstractC7676s;
import com.zykj.view.board.board.AbstractC7680w;
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
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p025b7.AbstractC5137d2;
import p025b7.C5122a;
import p025b7.C5154i1;
import p181m7.AbstractC9026c;
import p181m7.C9025b;
import p181m7.C9037n;
import p181m7.C9039p;
import p253t5.InterfaceC9615a;
import p253t5.InterfaceC9616b;
import p253t5.InterfaceC9617c;

@Metadata(m13412d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 g2\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\u0003J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103JS\u0010<\u001a\u00020\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u00109\u001a\u00020\u00132\u0018\b\u0002\u0010;\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J%\u0010@\u001a\u00020\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u0002060>2\b\b\u0002\u00109\u001a\u00020\u0013¢\u0006\u0004\b@\u0010AJo\u0010J\u001a\u00020\u00042\b\b\u0002\u0010B\u001a\u00020\u00132\b\b\u0002\u0010C\u001a\u00020\u00132&\b\u0002\u0010H\u001a \b\u0001\u0012\u0004\u0012\u00020E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040F\u0012\u0006\u0012\u0004\u0018\u00010G\u0018\u00010D2$\u0010I\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u000106\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040F\u0012\u0006\u0012\u0004\u0018\u00010G0D¢\u0006\u0004\bJ\u0010KJ\u0013\u0010L\u001a\b\u0012\u0004\u0012\u0002060>¢\u0006\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010d\u001a\u0010\u0012\f\u0012\n a*\u0004\u0018\u000106060`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u00107\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006h"}, m13413d2 = {"Lcom/zykj/view/board/board/BoardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "H1", "B0", "I1", "z0", "b1", "B1", "p1", "E0", "R0", "x0", "G0", "C0", "u1", "o1", "", "isOpen", "W1", "(Z)V", "T1", "Q1", "Lb7/i1;", "boardSketchConfig", "N1", "(Lb7/i1;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "P1", "w0", "Lcom/zykj/view/board/board/f;", "boardViewConfig", "O1", "(Lcom/zykj/view/board/board/f;)V", "Lb7/a;", "boardCallbackConfig", "M1", "(Lb7/a;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "filename", "isSelected", "Lkotlin/Function1;", "imagePathCallback", "n0", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "", "pathList", "p0", "(Ljava/util/List;Z)V", "needClear", "isContentThumbnail", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "error", "callback", "u0", "(ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "t0", "()Ljava/util/List;", "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;", "a", "Lcom/zykj/view/databinding/ViewFragmentBoardBinding;", "mBinding", "Lcom/zykj/view/board/board/BoardViewModel;", "b", "Lkotlin/Lazy;", "r0", "()Lcom/zykj/view/board/board/BoardViewModel;", "mViewModel", "Lm7/n;", "c", "Lm7/n;", "mImagePicker", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "audioCallback", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "e", "Landroidx/activity/result/ActivityResultLauncher;", "audioPermissionRequest", "s0", "()Ljava/lang/String;", "f", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,1030:1\n1#2:1031\n1321#3,2:1032\n1332#3,3:1034\n1332#3,3:1037\n1332#3,3:1040\n1332#3,3:1043\n29#4:1046\n85#4,18:1047\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment\n*L\n378#1:1032,2\n391#1:1034,3\n398#1:1037,3\n415#1:1040,3\n466#1:1043,3\n781#1:1046\n781#1:1047,18\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardFragment extends Fragment {

    /* renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public ViewFragmentBoardBinding mBinding;

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy mViewModel = LazyKt.lazy(new Function0() { // from class: b7.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BoardFragment.m11096L1();
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public final C9037n mImagePicker = new C9037n(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: d, reason: from kotlin metadata */
    public Function0 audioCallback;

    /* renamed from: e, reason: from kotlin metadata */
    public final ActivityResultLauncher audioPermissionRequest;

    /* renamed from: com.zykj.view.board.board.BoardFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BoardFragment m11217a(String path, C7663f boardViewConfig, C5154i1 boardSketchConfig, C5122a boardCallbackConfig) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(boardViewConfig, "boardViewConfig");
            Intrinsics.checkNotNullParameter(boardSketchConfig, "boardSketchConfig");
            Intrinsics.checkNotNullParameter(boardCallbackConfig, "boardCallbackConfig");
            BoardFragment boardFragment = new BoardFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            boardFragment.setArguments(bundle);
            boardFragment.m11198O1(boardViewConfig);
            boardFragment.m11197N1(boardSketchConfig);
            boardFragment.m11196M1(boardCallbackConfig);
            return boardFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$b */
    public static final class C7648b implements InterfaceC9617c {
        public C7648b() {
        }

        @Override // p253t5.InterfaceC9617c
        /* renamed from: a */
        public void mo11218a(String initText, Function1 afterTextChangedCallback, Function1 doneCallback, Function0 cancelCallback) {
            Intrinsics.checkNotNullParameter(initText, "initText");
            Intrinsics.checkNotNullParameter(afterTextChangedCallback, "afterTextChangedCallback");
            Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
            Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
            Context contextRequireContext = BoardFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            AbstractC5137d2.m2206i(contextRequireContext, initText, afterTextChangedCallback, cancelCallback, doneCallback);
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$c */
    public static final class C7649c implements InterfaceC9616b {
        public C7649c() {
        }

        /* renamed from: c */
        public static final Unit m11220c(Function1 function1, Function0 function0, Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
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

        @Override // p253t5.InterfaceC9616b
        /* renamed from: a */
        public void mo11221a(String imageLocalPath, final Function1 doneCallback, final Function0 cancelCallback) {
            Intrinsics.checkNotNullParameter(imageLocalPath, "imageLocalPath");
            Intrinsics.checkNotNullParameter(doneCallback, "doneCallback");
            Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
            C9037n c9037n = BoardFragment.this.mImagePicker;
            Uri uriFile2Uri = UriUtils.file2Uri(new File(imageLocalPath));
            Intrinsics.checkNotNullExpressionValue(uriFile2Uri, "file2Uri(...)");
            c9037n.m14420r(uriFile2Uri, new Function1() { // from class: b7.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BoardFragment.C7649c.m11220c(doneCallback, cancelCallback, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$d */
    public static final class C7650d implements InterfaceC9615a {
        public C7650d() {
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: a */
        public void mo11222a(Integer num) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f12618a.setSelectColor(num);
            ViewFragmentBoardBinding viewFragmentBoardBinding3 = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
            }
            viewFragmentBoardBinding2.f12618a.m12058c();
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: b */
        public void mo11223b(Integer num) {
            if (num != null) {
                C9039p.f15219a.m14429d(num.intValue());
            }
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: c */
        public boolean mo11224c(int i9) {
            return C9025b.f15177a.m14385b(i9);
        }

        @Override // p253t5.InterfaceC9615a
        /* renamed from: d */
        public void mo11225d(Function1 function1) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f12618a.setOnColorChangeListener(function1);
        }

        @Override // p253t5.InterfaceC9615a
        public void dispatchTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f12618a.dispatchTouchEvent(event);
        }

        @Override // p253t5.InterfaceC9615a
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.mBinding;
            if (viewFragmentBoardBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f12618a.draw(canvas);
        }

        @Override // p253t5.InterfaceC9615a
        public float getHeight() {
            return BoardFragment.this.requireContext().getResources().getDimension(R$dimen.view_138);
        }

        @Override // p253t5.InterfaceC9615a
        public float getWidth() {
            return BoardFragment.this.requireContext().getResources().getDimension(R$dimen.view_174);
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$e */
    public static final class C7651e implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f12033b;

        public C7651e(boolean z9) {
            this.f12033b = z9;
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
            viewFragmentBoardBinding.f12630m.setEnabled(true);
            BoardFragment.this.m11209r0().m11348k1(this.f12033b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoardFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: b7.a0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BoardFragment.m11170q0(this.f2259a, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.audioPermissionRequest = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: A0 */
    public static final void m11067A0(BoardFragment boardFragment) {
        BoardViewModel boardViewModelM11209r0 = boardFragment.m11209r0();
        ViewFragmentBoardBinding viewFragmentBoardBinding = boardFragment.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        float width = viewFragmentBoardBinding.f12634q.getWidth();
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = boardFragment.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        boardViewModelM11209r0.m11307O0(width, viewFragmentBoardBinding2.f12634q.getHeight());
    }

    /* renamed from: A1 */
    public static final Unit m11068A1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m11245E(boardFragment.m11209r0(), Float.valueOf(f10), null, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: B0 */
    private final void m11070B0() {
        m11204b1();
        m11191B1();
        m11208p1();
        m11193E0();
        m11201R0();
        m11215x0();
        m11194G0();
        m11213u1();
        m11192C0();
    }

    /* renamed from: C1 */
    public static final void m11072C1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11303L();
        boardFragment.m11209r0().m11361t1(SelectGraphEnum.STROKE);
    }

    /* renamed from: D0 */
    public static final Unit m11074D0(BoardFragment boardFragment) {
        boardFragment.m11209r0().m11301K();
        return Unit.INSTANCE;
    }

    /* renamed from: D1 */
    public static final void m11075D1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11303L();
        boardFragment.m11209r0().m11361t1(SelectGraphEnum.STROKE_HIGHLIGHTER);
    }

    /* renamed from: E1 */
    public static final void m11077E1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11303L();
        boardFragment.m11209r0().m11361t1(SelectGraphEnum.IMAGE);
    }

    /* renamed from: F0 */
    public static final void m11079F0(BoardFragment boardFragment, int i9, View view) {
        boardFragment.m11209r0().m11347j1(i9);
    }

    /* renamed from: F1 */
    public static final void m11080F1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11303L();
        boardFragment.m11209r0().m11361t1(SelectGraphEnum.TEXT);
    }

    /* renamed from: G1 */
    public static final void m11082G1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11303L();
        boardFragment.m11209r0().m11361t1(SelectGraphEnum.GEOMETRY);
    }

    /* renamed from: H0 */
    public static final void m11084H0(BoardFragment boardFragment, View view) {
        Function1 function1M2189b;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function1M2189b = boardCallbackConfig.m2189b()) == null) {
            return;
        }
        Intrinsics.checkNotNull(view);
        function1M2189b.invoke(view);
    }

    /* renamed from: H1 */
    private final void m11085H1() throws FileNotFoundException {
        m11216z0();
        m11070B0();
        m11206o1();
        m11195I1();
    }

    /* renamed from: I0 */
    public static final void m11087I0(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11343h0();
    }

    /* renamed from: J0 */
    public static final void m11089J0(final BoardFragment boardFragment, View view) {
        boardFragment.audioCallback = new Function0() { // from class: b7.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m11092K0(this.f2360a);
            }
        };
        boardFragment.audioPermissionRequest.launch("android.permission.RECORD_AUDIO");
    }

    /* renamed from: J1 */
    public static final Unit m11090J1(BoardFragment boardFragment, IBoardControl iBoardControl, boolean z9, long j9) {
        Intrinsics.checkNotNullParameter(iBoardControl, "iBoardControl");
        LogUtils.m2954d("页面BoardFragment，画板数据加载成功，是否缓存" + z9 + "，加载耗时为" + j9);
        boardFragment.m11209r0().m11352n0(iBoardControl, z9, j9);
        boardFragment.m11214w0();
        return Unit.INSTANCE;
    }

    /* renamed from: K0 */
    public static final Unit m11092K0(BoardFragment boardFragment) {
        boardFragment.m11209r0().m11335c1();
        return Unit.INSTANCE;
    }

    /* renamed from: K1 */
    public static final Unit m11093K1(BoardFragment boardFragment, Throwable it) {
        Function0 function0M2196i;
        Intrinsics.checkNotNullParameter(it, "it");
        LogUtils.m2954d("页面BoardFragment，画板数据加载失败，message: " + it.getMessage());
        boardFragment.m11214w0();
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig != null && (function0M2196i = boardCallbackConfig.m2196i()) != null) {
            function0M2196i.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: L0 */
    public static final void m11095L0(BoardFragment boardFragment, View view) {
        BoardViewModel.m11271n1(boardFragment.m11209r0(), false, 1, null);
    }

    /* renamed from: L1 */
    public static final BoardViewModel m11096L1() {
        return new BoardViewModel();
    }

    /* renamed from: M0 */
    public static final void m11098M0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        Function1 function1M2192e;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function1M2192e = boardCallbackConfig.m2192e()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f12792c.setEnabled(false);
        BoardViewModel.m11259f0(boardFragment.m11209r0(), false, false, new BoardFragment$initExtraClickListener$3$3$1$1(function1M2192e, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$3$1$2(function1M2192e, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* renamed from: N0 */
    public static final void m11100N0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        Function1 function1M2197j;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function1M2197j = boardCallbackConfig.m2197j()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f12795f.setEnabled(false);
        BoardViewModel.m11259f0(boardFragment.m11209r0(), false, false, new BoardFragment$initExtraClickListener$3$4$1$1(function1M2197j, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$4$1$2(function1M2197j, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* renamed from: O0 */
    public static final void m11102O0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        Function2 function2M2191d;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function2M2191d = boardCallbackConfig.m2191d()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(boardFragment), null, null, new BoardFragment$initExtraClickListener$3$5$1$1(viewItemSketchRecordAudioBinding, function2M2191d, null), 3, null);
    }

    /* renamed from: P0 */
    public static final void m11104P0(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11305N();
    }

    /* renamed from: Q0 */
    public static final void m11106Q0(BoardFragment boardFragment, ViewItemSketchRecordBinding viewItemSketchRecordBinding, View view) {
        Function2 function2M2191d;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function2M2191d = boardCallbackConfig.m2191d()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(boardFragment), null, null, new BoardFragment$initExtraClickListener$4$1$1$1(viewItemSketchRecordBinding, function2M2191d, null), 3, null);
    }

    /* renamed from: R1 */
    public static final Unit m11108R1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        final File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        m11167o0(boardFragment, null, fileUri2FileNoCacheCopy.getAbsolutePath(), null, true, new Function1() { // from class: b7.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11111S1(fileUri2FileNoCacheCopy, (String) obj);
            }
        }, 5, null);
        return Unit.INSTANCE;
    }

    /* renamed from: S0 */
    public static final void m11110S0(final BoardFragment boardFragment, View view) {
        Function1 function1M2193f;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function1M2193f = boardCallbackConfig.m2193f()) == null) {
            boardFragment.m11202T1();
        } else {
            function1M2193f.invoke(new Function0() { // from class: b7.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BoardFragment.m11113T0(this.f2364a);
                }
            });
        }
    }

    /* renamed from: S1 */
    public static final Unit m11111S1(File file, String str) {
        FileUtils.delete(file);
        return Unit.INSTANCE;
    }

    /* renamed from: T0 */
    public static final Unit m11113T0(BoardFragment boardFragment) {
        boardFragment.m11202T1();
        return Unit.INSTANCE;
    }

    /* renamed from: U0 */
    public static final void m11115U0(final BoardFragment boardFragment, View view) {
        Function1 function1M2190c;
        C5122a boardCallbackConfig = boardFragment.m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || (function1M2190c = boardCallbackConfig.m2190c()) == null) {
            boardFragment.m11200Q1();
        } else {
            function1M2190c.invoke(new Function0() { // from class: b7.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BoardFragment.m11118V0(this.f2357a);
                }
            });
        }
    }

    /* renamed from: U1 */
    public static final Unit m11116U1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        final File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        m11167o0(boardFragment, null, fileUri2FileNoCacheCopy.getAbsolutePath(), null, true, new Function1() { // from class: b7.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11119V1(fileUri2FileNoCacheCopy, (String) obj);
            }
        }, 5, null);
        return Unit.INSTANCE;
    }

    /* renamed from: V0 */
    public static final Unit m11118V0(BoardFragment boardFragment) {
        boardFragment.m11200Q1();
        return Unit.INSTANCE;
    }

    /* renamed from: V1 */
    public static final Unit m11119V1(File file, String str) {
        FileUtils.delete(file);
        return Unit.INSTANCE;
    }

    /* renamed from: W0 */
    public static final void m11121W0(final BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AbstractC5137d2.m2207j(contextRequireContext, null, null, null, new Function1() { // from class: b7.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11123X0(this.f2354a, (String) obj);
            }
        }, 7, null);
    }

    /* renamed from: X0 */
    public static final Unit m11123X0(BoardFragment boardFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boardFragment.m11209r0().m11289B(it);
        return Unit.INSTANCE;
    }

    /* renamed from: Y0 */
    public static final void m11125Y0(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11349l1(AbstractC7674q.c.f12274e);
    }

    /* renamed from: Z0 */
    public static final void m11127Z0(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11349l1(AbstractC7674q.b.f12273e);
    }

    /* renamed from: a1 */
    public static final void m11129a1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11349l1(AbstractC7674q.d.f12275e);
    }

    /* renamed from: c1 */
    public static final void m11133c1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        BoardViewModel.m11284v1(boardFragment.m11209r0(), false, 1, null);
    }

    /* renamed from: d1 */
    public static final void m11136d1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11367x1(true);
    }

    /* renamed from: e1 */
    public static final void m11139e1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11367x1(false);
    }

    /* renamed from: f1 */
    public static final void m11142f1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11353o1(AbstractC7676s.c.f12288e);
        boardFragment.m11209r0().m11333b1();
    }

    /* renamed from: g1 */
    public static final void m11145g1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11353o1(AbstractC7676s.a.f12286e);
        boardFragment.m11209r0().m11327Y0();
    }

    /* renamed from: h1 */
    public static final void m11148h1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11329Z0();
    }

    /* renamed from: i1 */
    public static final void m11151i1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11325X0();
    }

    /* renamed from: j1 */
    public static final void m11154j1(final BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        Context contextRequireContext = boardFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AbstractC5137d2.m2203f(contextRequireContext, new Function0() { // from class: b7.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m11157k1(this.f2347a);
            }
        });
    }

    /* renamed from: k1 */
    public static final Unit m11157k1(BoardFragment boardFragment) {
        boardFragment.m11209r0().m11297I();
        return Unit.INSTANCE;
    }

    /* renamed from: l1 */
    public static final void m11160l1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11323W0(false);
    }

    /* renamed from: m1 */
    public static final void m11163m1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11323W0(true);
    }

    /* renamed from: n1 */
    public static final void m11165n1(BoardFragment boardFragment, View view) {
        boardFragment.m11209r0().m11304M();
        boardFragment.m11209r0().m11353o1(AbstractC7676s.d.f12289e);
        boardFragment.m11209r0().m11337d1();
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m11167o0(BoardFragment boardFragment, Bitmap bitmap, String str, String str2, boolean z9, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bitmap = null;
        }
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            str2 = "";
        }
        if ((i9 & 8) != 0) {
            z9 = false;
        }
        if ((i9 & 16) != 0) {
            function1 = null;
        }
        boardFragment.m11205n0(bitmap, str, str2, z9, function1);
    }

    /* renamed from: q0 */
    public static final void m11170q0(BoardFragment boardFragment, Boolean it) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue() && (function0 = boardFragment.audioCallback) != null) {
            function0.invoke();
        }
        boardFragment.audioCallback = null;
    }

    /* renamed from: q1 */
    public static final void m11171q1(BoardFragment boardFragment, View view) {
        int id = view.getId();
        if (id == R$id.rb_pen_custom) {
            boardFragment.m11209r0().m11360s1(AbstractC7680w.b.f12319f);
            return;
        }
        if (id == R$id.rb_pen_line) {
            boardFragment.m11209r0().m11360s1(AbstractC7680w.e.f12322f);
            return;
        }
        if (id == R$id.rb_pen_dotted_line) {
            boardFragment.m11209r0().m11360s1(AbstractC7680w.c.f12320f);
        } else if (id == R$id.rb_pen_cursor) {
            boardFragment.m11209r0().m11360s1(AbstractC7680w.a.f12318f);
        } else if (id == R$id.rb_pen_highlighter) {
            boardFragment.m11209r0().m11360s1(AbstractC7680w.d.f12321f);
        }
    }

    /* renamed from: r1 */
    public static final void m11173r1(BoardFragment boardFragment, int i9, View view) {
        boardFragment.m11209r0().m11358r1(i9);
    }

    /* renamed from: s1 */
    public static final void m11175s1(BoardFragment boardFragment, int i9, View view) {
        boardFragment.m11209r0().m11354p1(i9);
    }

    /* renamed from: t1 */
    public static final Unit m11177t1(BoardFragment boardFragment, int i9) {
        boardFragment.m11209r0().m11356q1(i9);
        return Unit.INSTANCE;
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m11180v0(BoardFragment boardFragment, boolean z9, boolean z10, Function2 function2, Function2 function22, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        if ((i9 & 2) != 0) {
            z10 = false;
        }
        if ((i9 & 4) != 0) {
            function2 = null;
        }
        boardFragment.m11212u0(z9, z10, function2, function22);
    }

    /* renamed from: v1 */
    public static final Unit m11181v1(BoardFragment boardFragment) {
        boardFragment.m11209r0().m11294F();
        return Unit.INSTANCE;
    }

    /* renamed from: w1 */
    public static final Unit m11183w1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m11248H(boardFragment.m11209r0(), null, Float.valueOf(f10), 1, null);
        return Unit.INSTANCE;
    }

    /* renamed from: x1 */
    public static final Unit m11185x1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m11245E(boardFragment.m11209r0(), null, Float.valueOf(f10), 1, null);
        return Unit.INSTANCE;
    }

    /* renamed from: y0 */
    public static final void m11187y0(BoardFragment boardFragment, int i9, View view) {
        boardFragment.m11209r0().m11340f1(i9);
    }

    /* renamed from: y1 */
    public static final Unit m11188y1(BoardFragment boardFragment) {
        boardFragment.m11209r0().m11294F();
        return Unit.INSTANCE;
    }

    /* renamed from: z1 */
    public static final Unit m11190z1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m11248H(boardFragment.m11209r0(), Float.valueOf(f10), null, 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: B1 */
    public final void m11191B1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12628k.f12773d.setOnClickListener(new View.OnClickListener() { // from class: b7.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11072C1(this.f2291a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        viewFragmentBoardBinding3.f12628k.f12771b.setOnClickListener(new View.OnClickListener() { // from class: b7.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11075D1(this.f2299a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        viewFragmentBoardBinding4.f12628k.f12772c.setOnClickListener(new View.OnClickListener() { // from class: b7.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11077E1(this.f2302a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding5 = null;
        }
        viewFragmentBoardBinding5.f12628k.f12774e.setOnClickListener(new View.OnClickListener() { // from class: b7.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11080F1(this.f2316a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.mBinding;
        if (viewFragmentBoardBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding6;
        }
        viewFragmentBoardBinding2.f12628k.f12770a.setOnClickListener(new View.OnClickListener() { // from class: b7.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11082G1(this.f2319a, view);
            }
        });
    }

    /* renamed from: C0 */
    public final void m11192C0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12620c.setOnBeforeTouchDispatchToChildren(new Function0() { // from class: b7.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m11074D0(this.f2273a);
            }
        });
    }

    /* renamed from: E0 */
    public final void m11193E0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentBoardBinding.f12623f.f12703d;
        Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
        final int i9 = 0;
        for (View view : ViewGroupKt.getChildren(rgEraserSize)) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: b7.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BoardFragment.m11079F0(this.f2263a, i9, view2);
                }
            });
            i9 = i10;
        }
    }

    /* renamed from: G0 */
    public final void m11194G0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12629l.setOnClickListener(new View.OnClickListener() { // from class: b7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11084H0(this.f2305a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        viewFragmentBoardBinding3.f12630m.setOnClickListener(new View.OnClickListener() { // from class: b7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11087I0(this.f2315a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        final ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding4.f12627j;
        AppCompatImageView ivRecord = viewItemSketchRecordAudioBinding.f12791b;
        Intrinsics.checkNotNullExpressionValue(ivRecord, "ivRecord");
        AbstractC9026c.m14393f(ivRecord, 0L, new View.OnClickListener() { // from class: b7.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11089J0(this.f2318a, view);
            }
        }, 1, null);
        viewItemSketchRecordAudioBinding.f12790a.setOnClickListener(new View.OnClickListener() { // from class: b7.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11095L0(this.f2321a, view);
            }
        });
        viewItemSketchRecordAudioBinding.f12792c.setOnClickListener(new View.OnClickListener() { // from class: b7.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11098M0(this.f2327a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f12795f.setOnClickListener(new View.OnClickListener() { // from class: b7.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11100N0(this.f2331a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f12797h.setOnClickListener(new View.OnClickListener() { // from class: b7.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11102O0(this.f2335a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f12793d.setOnClickListener(new View.OnClickListener() { // from class: b7.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11104P0(this.f2339a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding5;
        }
        final ViewItemSketchRecordBinding viewItemSketchRecordBinding = viewFragmentBoardBinding2.f12622e;
        viewItemSketchRecordBinding.f12803a.setOnClickListener(new View.OnClickListener() { // from class: b7.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11106Q0(this.f2342a, viewItemSketchRecordBinding, view);
            }
        });
    }

    /* renamed from: I1 */
    public final void m11195I1() throws FileNotFoundException {
        File externalCacheDir;
        String absolutePath;
        C5122a boardCallbackConfig = m11209r0().getBoardCallbackConfig();
        if (boardCallbackConfig == null || boardCallbackConfig.m2188a()) {
            m11199P1();
        }
        String strM11210s0 = m11210s0();
        if (strM11210s0.length() == 0) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                throw new FileNotFoundException("unknown board path");
            }
            strM11210s0 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        LogUtils.m2954d("页面BoardFragment，开始加载画板数据，画板路径" + strM11210s0);
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBoardBinding.f12634q;
        Intrinsics.checkNotNull(strM11210s0);
        sketchRecorderView.m7284b(strM11210s0, new Function3() { // from class: b7.c0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BoardFragment.m11090J1(this.f2267a, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new Function1() { // from class: b7.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11093K1(this.f2270a, (Throwable) obj);
            }
        });
    }

    /* renamed from: M1 */
    public final void m11196M1(C5122a boardCallbackConfig) {
        Intrinsics.checkNotNullParameter(boardCallbackConfig, "boardCallbackConfig");
        m11209r0().m11355q0(boardCallbackConfig);
    }

    /* renamed from: N1 */
    public final void m11197N1(C5154i1 boardSketchConfig) {
        m11209r0().m11300J0(boardSketchConfig);
    }

    /* renamed from: O1 */
    public final void m11198O1(C7663f boardViewConfig) {
        Intrinsics.checkNotNullParameter(boardViewConfig, "boardViewConfig");
        m11209r0().m11365w1(boardViewConfig);
    }

    /* renamed from: P1 */
    public final void m11199P1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12631n.setVisibility(0);
    }

    /* renamed from: Q1 */
    public final void m11200Q1() {
        if (m11209r0().m11309P0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C9037n.m14415y(this.mImagePicker, null, true, new Function1() { // from class: b7.y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BoardFragment.m11108R1(this.f2367a, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: R0 */
    public final void m11201R0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f12624g;
        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f12725b;
        Intrinsics.checkNotNullExpressionValue(ivImageGallery, "ivImageGallery");
        AbstractC9026c.m14393f(ivImageGallery, 0L, new View.OnClickListener() { // from class: b7.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11110S0(this.f2346a, view);
            }
        }, 1, null);
        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f12724a;
        Intrinsics.checkNotNullExpressionValue(ivImageCamera, "ivImageCamera");
        AbstractC9026c.m14393f(ivImageCamera, 0L, new View.OnClickListener() { // from class: b7.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11115U0(this.f2349a, view);
            }
        }, 1, null);
        AppCompatImageView ivText = viewIncludeImageAddBinding.f12728e;
        Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
        AbstractC9026c.m14393f(ivText, 0L, new View.OnClickListener() { // from class: b7.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11121W0(this.f2353a, view);
            }
        }, 1, null);
        viewIncludeImageAddBinding.f12727d.setOnClickListener(new View.OnClickListener() { // from class: b7.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11125Y0(this.f2356a, view);
            }
        });
        viewIncludeImageAddBinding.f12726c.setOnClickListener(new View.OnClickListener() { // from class: b7.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11127Z0(this.f2359a, view);
            }
        });
        viewIncludeImageAddBinding.f12729f.setOnClickListener(new View.OnClickListener() { // from class: b7.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11129a1(this.f2366a, view);
            }
        });
    }

    /* renamed from: T1 */
    public final void m11202T1() {
        if (m11209r0().m11309P0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            this.mImagePicker.m14422u(true, new Function1() { // from class: b7.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BoardFragment.m11116U1(this.f2369a, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: W1 */
    public final void m11203W1(boolean isOpen) {
        float f10;
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12630m.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C7651e(isOpen));
        float f11 = 0.0f;
        if (isOpen) {
            ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
            if (viewFragmentBoardBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding3 = null;
            }
            f10 = -viewFragmentBoardBinding3.f12625h.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!isOpen) {
            ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
            if (viewFragmentBoardBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentBoardBinding4 = null;
            }
            f11 = -viewFragmentBoardBinding4.f12625h.getRoot().getWidth();
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentBoardBinding5.f12625h.getRoot(), "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.mBinding;
        if (viewFragmentBoardBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding6.f12635r, "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.mBinding;
        if (viewFragmentBoardBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding2.f12630m, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: b1 */
    public final void m11204b1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f12625h;
        viewIncludeMenuBinding.f12744k.setOnClickListener(new View.OnClickListener() { // from class: b7.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11160l1(this.f2268a, view);
            }
        });
        viewIncludeMenuBinding.f12740g.setOnClickListener(new View.OnClickListener() { // from class: b7.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11163m1(this.f2274a, view);
            }
        });
        viewIncludeMenuBinding.f12742i.setOnClickListener(new View.OnClickListener() { // from class: b7.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11165n1(this.f2292a, view);
            }
        });
        viewIncludeMenuBinding.f12743j.setOnClickListener(new View.OnClickListener() { // from class: b7.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11133c1(this.f2300a, view);
            }
        });
        viewIncludeMenuBinding.f12736c.setOnClickListener(new View.OnClickListener() { // from class: b7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11136d1(this.f2266a, view);
            }
        });
        viewIncludeMenuBinding.f12741h.setOnClickListener(new View.OnClickListener() { // from class: b7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11139e1(this.f2269a, view);
            }
        });
        viewIncludeMenuBinding.f12739f.setOnClickListener(new View.OnClickListener() { // from class: b7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11142f1(this.f2272a, view);
            }
        });
        viewIncludeMenuBinding.f12737d.setOnClickListener(new View.OnClickListener() { // from class: b7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11145g1(this.f2290a, view);
            }
        });
        viewIncludeMenuBinding.f12738e.setOnClickListener(new View.OnClickListener() { // from class: b7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11148h1(this.f2298a, view);
            }
        });
        viewIncludeMenuBinding.f12734a.setOnClickListener(new View.OnClickListener() { // from class: b7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11151i1(this.f2301a, view);
            }
        });
        viewIncludeMenuBinding.f12735b.setOnClickListener(new View.OnClickListener() { // from class: b7.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m11154j1(this.f2271a, view);
            }
        });
    }

    /* renamed from: n0 */
    public final void m11205n0(Bitmap bitmap, String path, String filename, boolean isSelected, Function1 imagePathCallback) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        BoardViewModel.m11243A(m11209r0(), bitmap, path, null, isSelected, filename, imagePathCallback, 4, null);
    }

    /* renamed from: o1 */
    public final void m11206o1() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BoardFragment$initObserver$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentBoardBinding viewFragmentBoardBindingM11884a = ViewFragmentBoardBinding.m11884a(inflater);
        Intrinsics.checkNotNull(viewFragmentBoardBindingM11884a);
        this.mBinding = viewFragmentBoardBindingM11884a;
        View root = viewFragmentBoardBindingM11884a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m11214w0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11085H1();
    }

    /* renamed from: p0 */
    public final void m11207p0(List pathList, boolean isSelected) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        m11209r0().m11368y(pathList, isSelected);
    }

    /* renamed from: p1 */
    public final void m11208p1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgPenType = viewFragmentBoardBinding.f12626i.f12760l;
        Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
        Iterator<View> it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: b7.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m11171q1(this.f2324a, view);
                }
            });
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentBoardBinding3.f12626i.f12759k;
        Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
        final int i9 = 0;
        final int i10 = 0;
        for (View view : ViewGroupKt.getChildren(rgPenSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: b7.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BoardFragment.m11173r1(this.f2362a, i10, view2);
                }
            });
            i10 = i11;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.mBinding;
        if (viewFragmentBoardBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        RadioGroup rgPenColor = viewFragmentBoardBinding4.f12626i.f12758j;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        for (View view2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i12 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view2.setOnClickListener(new View.OnClickListener() { // from class: b7.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BoardFragment.m11175s1(this.f2306a, i9, view3);
                }
            });
            i9 = i12;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.mBinding;
        if (viewFragmentBoardBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding5;
        }
        viewFragmentBoardBinding2.f12619b.setOnColorChangeListener(new Function1() { // from class: b7.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11177t1(this.f2350a, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: r0 */
    public final BoardViewModel m11209r0() {
        return (BoardViewModel) this.mViewModel.getValue();
    }

    /* renamed from: s0 */
    public final String m11210s0() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    /* renamed from: t0 */
    public final List m11211t0() {
        return m11209r0().m11336d0();
    }

    /* renamed from: u0 */
    public final void m11212u0(boolean needClear, boolean isContentThumbnail, Function2 error, Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        m11209r0().m11338e0(needClear, isContentThumbnail, new BoardFragment$getSavePath$1(error, callback, null), callback);
    }

    /* renamed from: u1 */
    public final void m11213u1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchProgressView sketchProgressVertical = viewFragmentBoardBinding.f12633p;
        Intrinsics.checkNotNullExpressionValue(sketchProgressVertical, "sketchProgressVertical");
        AbstractC9026c.m14391d(sketchProgressVertical, new Function0() { // from class: b7.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m11181v1(this.f2322a);
            }
        }, new Function1() { // from class: b7.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11183w1(this.f2325a, ((Float) obj).floatValue());
            }
        }, new Function1() { // from class: b7.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11185x1(this.f2329a, ((Float) obj).floatValue());
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.mBinding;
        if (viewFragmentBoardBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        SketchProgressView sketchProgressHorizontal = viewFragmentBoardBinding2.f12632o;
        Intrinsics.checkNotNullExpressionValue(sketchProgressHorizontal, "sketchProgressHorizontal");
        AbstractC9026c.m14391d(sketchProgressHorizontal, new Function0() { // from class: b7.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BoardFragment.m11188y1(this.f2333a);
            }
        }, new Function1() { // from class: b7.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11190z1(this.f2337a, ((Float) obj).floatValue());
            }
        }, new Function1() { // from class: b7.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BoardFragment.m11068A1(this.f2340a, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: w0 */
    public final void m11214w0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12631n.setVisibility(8);
    }

    /* renamed from: x0 */
    public final void m11215x0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgBackgroundColor = viewFragmentBoardBinding.f12621d.f12688g;
        Intrinsics.checkNotNullExpressionValue(rgBackgroundColor, "rgBackgroundColor");
        final int i9 = 0;
        for (View view : ViewGroupKt.getChildren(rgBackgroundColor)) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: b7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BoardFragment.m11187y0(this.f2261a, i9, view2);
                }
            });
            i9 = i10;
        }
    }

    /* renamed from: z0 */
    public final void m11216z0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.mBinding;
        if (viewFragmentBoardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f12634q.post(new Runnable() { // from class: b7.r0
            @Override // java.lang.Runnable
            public final void run() {
                BoardFragment.m11067A0(this.f2344a);
            }
        });
        m11209r0().m11321V0(new C7648b());
        m11209r0().m11319U0(new C7649c());
        m11209r0().m11315S0(new C7650d());
    }
}
