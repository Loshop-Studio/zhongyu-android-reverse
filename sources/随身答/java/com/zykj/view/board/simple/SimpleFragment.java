package com.zykj.view.board.simple;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.zykj.view.R$id;
import com.zykj.view.board.board.AbstractC7676s;
import com.zykj.view.board.simple.AbstractC7715d;
import com.zykj.view.board.simple.SimpleFragment;
import com.zykj.view.databinding.ViewFragmentSimpleBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p025b7.AbstractC5137d2;
import p129h7.C8107c;
import p181m7.C9037n;

@Deprecated(message = "用于编辑图片的，但是暂时没看到对应任务")
@Metadata(m13412d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m13413d2 = {"Lcom/zykj/view/board/simple/SimpleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "P", "x", "D", "L", "y", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "K", "", "isOpen", "R", "(Z)V", "Lcom/zykj/view/board/simple/SimpleViewModel;", "a", "Lkotlin/Lazy;", "u", "()Lcom/zykj/view/board/simple/SimpleViewModel;", "mViewModel", "Lm7/n;", "b", "Lm7/n;", "imagePicker", "Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;", "c", "Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;", "mBinding", "Lcom/zykj/view/simpleBoard/SimpleBoardView;", "w", "()Lcom/zykj/view/simpleBoard/SimpleBoardView;", "sketchView", "Lh7/c;", "v", "()Lh7/c;", "sketchConfig", "d", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleFragment.kt\ncom/zykj/view/board/simple/SimpleFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,319:1\n257#2,2:320\n257#2,2:322\n257#2,2:324\n257#2,2:326\n257#2,2:328\n257#2,2:330\n257#2,2:332\n257#2,2:334\n1321#3,2:336\n1332#3,3:338\n1332#3,3:341\n1332#3,3:344\n29#4:347\n85#4,18:348\n*S KotlinDebug\n*F\n+ 1 SimpleFragment.kt\ncom/zykj/view/board/simple/SimpleFragment\n*L\n66#1:320,2\n67#1:322,2\n68#1:324,2\n69#1:326,2\n70#1:328,2\n71#1:330,2\n75#1:332,2\n76#1:334,2\n163#1:336,2\n174#1:338,3\n181#1:341,3\n193#1:344,3\n279#1:347\n279#1:348,18\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleFragment extends Fragment {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy mViewModel = LazyKt.lazy(new Function0() { // from class: f7.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SimpleFragment.m11805Q();
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public final C9037n imagePicker = new C9037n(this, null, 2, null);

    /* renamed from: c, reason: from kotlin metadata */
    public ViewFragmentSimpleBinding mBinding;

    /* renamed from: com.zykj.view.board.simple.SimpleFragment$b */
    public static final class C7710b implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f12462b;

        public C7710b(boolean z9) {
            this.f12462b = z9;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding = SimpleFragment.this.mBinding;
            if (viewFragmentSimpleBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSimpleBinding = null;
            }
            viewFragmentSimpleBinding.f12661i.setEnabled(true);
            SimpleFragment.this.m11828u().m11846m(this.f12462b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: A */
    private final void m11789A() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f12660h.setOnClickListener(new View.OnClickListener() { // from class: f7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11790B(view);
            }
        });
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
        if (viewFragmentSimpleBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding3;
        }
        viewFragmentSimpleBinding2.f12661i.setOnClickListener(new View.OnClickListener() { // from class: f7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11791C(this.f13386a, view);
            }
        });
    }

    /* renamed from: B */
    public static final void m11790B(View view) {
    }

    /* renamed from: C */
    public static final void m11791C(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11828u().m11842f();
    }

    /* renamed from: D */
    private final void m11792D() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f12657e;
        viewIncludeMenuBinding.f12743j.setOnClickListener(new View.OnClickListener() { // from class: f7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11793E(this.f13395a, view);
            }
        });
        viewIncludeMenuBinding.f12742i.setOnClickListener(new View.OnClickListener() { // from class: f7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11794F(this.f13396a, view);
            }
        });
        viewIncludeMenuBinding.f12739f.setOnClickListener(new View.OnClickListener() { // from class: f7.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11795G(this.f13397a, view);
            }
        });
        viewIncludeMenuBinding.f12737d.setOnClickListener(new View.OnClickListener() { // from class: f7.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11796H(this.f13398a, view);
            }
        });
        viewIncludeMenuBinding.f12735b.setOnClickListener(new View.OnClickListener() { // from class: f7.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11797I(this.f13399a, view);
            }
        });
    }

    /* renamed from: E */
    public static final void m11793E(SimpleFragment simpleFragment, View view) {
        SimpleViewModel.m11838s(simpleFragment.m11828u(), false, 1, null);
    }

    /* renamed from: F */
    public static final void m11794F(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11828u().m11847n(AbstractC7676s.d.f12289e);
    }

    /* renamed from: G */
    public static final void m11795G(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11828u().m11847n(AbstractC7676s.c.f12288e);
        simpleFragment.m11828u().m11844h();
    }

    /* renamed from: H */
    public static final void m11796H(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11828u().m11847n(AbstractC7676s.a.f12286e);
        simpleFragment.m11828u().m11843g();
    }

    /* renamed from: I */
    public static final void m11797I(final SimpleFragment simpleFragment, View view) {
        Context contextRequireContext = simpleFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AbstractC5137d2.m2203f(contextRequireContext, new Function0() { // from class: f7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SimpleFragment.m11798J(this.f13387a);
            }
        });
    }

    /* renamed from: J */
    public static final Unit m11798J(SimpleFragment simpleFragment) {
        simpleFragment.m11828u().m11839c();
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    private final void m11799K() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SimpleFragment$initObserver$1(this, null), 3, null);
    }

    /* renamed from: L */
    private final void m11800L() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgPenType = viewFragmentSimpleBinding.f12658f.f12760l;
        Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
        Iterator<View> it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: f7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m11801M(this.f13388a, view);
                }
            });
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
        if (viewFragmentSimpleBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentSimpleBinding3.f12658f.f12759k;
        Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
        final int i9 = 0;
        final int i10 = 0;
        for (View view : ViewGroupKt.getChildren(rgPenSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: f7.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SimpleFragment.m11802N(this.f13389a, i10, view2);
                }
            });
            i10 = i11;
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.mBinding;
        if (viewFragmentSimpleBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding4;
        }
        RadioGroup rgPenColor = viewFragmentSimpleBinding2.f12658f.f12758j;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        for (View view2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i12 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view2.setOnClickListener(new View.OnClickListener() { // from class: f7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SimpleFragment.m11803O(this.f13391a, i9, view3);
                }
            });
            i9 = i12;
        }
    }

    /* renamed from: M */
    public static final void m11801M(SimpleFragment simpleFragment, View view) {
        int id = view.getId();
        if (id == R$id.rb_pen_custom) {
            simpleFragment.m11828u().m11850q(AbstractC7715d.a.f12533d);
        } else if (id == R$id.rb_pen_line) {
            simpleFragment.m11828u().m11850q(AbstractC7715d.c.f12535d);
        } else if (id == R$id.rb_pen_dotted_line) {
            simpleFragment.m11828u().m11850q(AbstractC7715d.b.f12534d);
        }
    }

    /* renamed from: N */
    public static final void m11802N(SimpleFragment simpleFragment, int i9, View view) {
        simpleFragment.m11828u().m11849p(i9);
    }

    /* renamed from: O */
    public static final void m11803O(SimpleFragment simpleFragment, int i9, View view) {
        simpleFragment.m11828u().m11848o(i9);
    }

    /* renamed from: P */
    private final void m11804P() {
        m11825x();
        m11799K();
    }

    /* renamed from: Q */
    public static final SimpleViewModel m11805Q() {
        return new SimpleViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m11806R(boolean isOpen) {
        float f10;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f12661i.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C7710b(isOpen));
        float f11 = 0.0f;
        if (isOpen) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
            if (viewFragmentSimpleBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSimpleBinding3 = null;
            }
            f10 = -viewFragmentSimpleBinding3.f12657e.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!isOpen) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.mBinding;
            if (viewFragmentSimpleBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSimpleBinding4 = null;
            }
            f11 = -viewFragmentSimpleBinding4.f12657e.getRoot().getWidth();
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.mBinding;
        if (viewFragmentSimpleBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentSimpleBinding5.f12657e.getRoot(), "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding6 = this.mBinding;
        if (viewFragmentSimpleBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding6.f12665m, "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding7 = this.mBinding;
        if (viewFragmentSimpleBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding2.f12661i, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: x */
    private final void m11825x() {
        m11792D();
        m11800L();
        m11826y();
        m11789A();
    }

    /* renamed from: y */
    private final void m11826y() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentSimpleBinding.f12655c.f12703d;
        Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
        final int i9 = 0;
        for (View view : ViewGroupKt.getChildren(rgEraserSize)) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: f7.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SimpleFragment.m11827z(this.f13393a, i9, view2);
                }
            });
            i9 = i10;
        }
    }

    /* renamed from: z */
    public static final void m11827z(SimpleFragment simpleFragment, int i9, View view) {
        simpleFragment.m11828u().m11845l(i9);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentSimpleBinding viewFragmentSimpleBindingM11896a = ViewFragmentSimpleBinding.m11896a(inflater, container, false);
        Intrinsics.checkNotNull(viewFragmentSimpleBindingM11896a);
        this.mBinding = viewFragmentSimpleBindingM11896a;
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBindingM11896a.f12657e;
        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f12744k;
        Intrinsics.checkNotNullExpressionValue(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(8);
        AppCompatImageView ivRecover = viewIncludeMenuBinding.f12740g;
        Intrinsics.checkNotNullExpressionValue(ivRecover, "ivRecover");
        ivRecover.setVisibility(8);
        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f12736c;
        Intrinsics.checkNotNullExpressionValue(ivEnlarge, "ivEnlarge");
        ivEnlarge.setVisibility(8);
        AppCompatImageView ivReduce = viewIncludeMenuBinding.f12741h;
        Intrinsics.checkNotNullExpressionValue(ivReduce, "ivReduce");
        ivReduce.setVisibility(8);
        AppCompatImageView ivImageAdd = viewIncludeMenuBinding.f12738e;
        Intrinsics.checkNotNullExpressionValue(ivImageAdd, "ivImageAdd");
        ivImageAdd.setVisibility(8);
        AppCompatImageView ivBackgroundColor = viewIncludeMenuBinding.f12734a;
        Intrinsics.checkNotNullExpressionValue(ivBackgroundColor, "ivBackgroundColor");
        ivBackgroundColor.setVisibility(8);
        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBindingM11896a.f12658f;
        RadioButton rbPenCursor = viewIncludePenBinding.f12750b;
        Intrinsics.checkNotNullExpressionValue(rbPenCursor, "rbPenCursor");
        rbPenCursor.setVisibility(8);
        RadioButton rbPenHighlighter = viewIncludePenBinding.f12753e;
        Intrinsics.checkNotNullExpressionValue(rbPenHighlighter, "rbPenHighlighter");
        rbPenHighlighter.setVisibility(8);
        View root = viewFragmentSimpleBindingM11896a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11804P();
    }

    /* renamed from: u */
    public final SimpleViewModel m11828u() {
        return (SimpleViewModel) this.mViewModel.getValue();
    }

    /* renamed from: v */
    public final C8107c m11829v() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        return viewFragmentSimpleBinding.f12664l.getSimpleBoardConfig();
    }

    /* renamed from: w */
    public final SimpleBoardView m11830w() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        SimpleBoardView sketchView = viewFragmentSimpleBinding.f12664l;
        Intrinsics.checkNotNullExpressionValue(sketchView, "sketchView");
        return sketchView;
    }
}
