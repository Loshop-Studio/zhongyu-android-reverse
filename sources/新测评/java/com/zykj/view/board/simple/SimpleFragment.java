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
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.zykj.view.R$id;
import com.zykj.view.board.board.AbstractC7227n;
import com.zykj.view.board.simple.AbstractC7263d;
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
import p027b8.C5060q;
import p213q7.AbstractC8902a2;
import p278w7.C9822c;

@Deprecated(message = "用于编辑图片的，但是暂时没看到对应任务")
@Metadata(m13557d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m13558d2 = {"Lcom/zykj/view/board/simple/SimpleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "N", "w", "C", "J", "x", "z", "I", "", "isOpen", "P", "(Z)V", "Lcom/zykj/view/board/simple/SimpleViewModel;", "a", "Lkotlin/Lazy;", "t", "()Lcom/zykj/view/board/simple/SimpleViewModel;", "mViewModel", "Lb8/q;", "b", "Lb8/q;", "imagePicker", "Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;", "c", "Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;", "mBinding", "Lcom/zykj/view/simpleBoard/SimpleBoardView;", "v", "()Lcom/zykj/view/simpleBoard/SimpleBoardView;", "sketchView", "Lw7/c;", "u", "()Lw7/c;", "sketchConfig", "d", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSimpleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleFragment.kt\ncom/zykj/view/board/simple/SimpleFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,314:1\n257#2,2:315\n257#2,2:317\n257#2,2:319\n257#2,2:321\n257#2,2:323\n257#2,2:325\n257#2,2:327\n257#2,2:329\n257#2,2:331\n1321#3,2:333\n1332#3,3:335\n1332#3,3:338\n1332#3,3:341\n29#4:344\n85#4,18:345\n*S KotlinDebug\n*F\n+ 1 SimpleFragment.kt\ncom/zykj/view/board/simple/SimpleFragment\n*L\n66#1:315,2\n67#1:317,2\n68#1:319,2\n69#1:321,2\n70#1:323,2\n71#1:325,2\n72#1:327,2\n76#1:329,2\n77#1:331,2\n159#1:333,2\n170#1:335,3\n177#1:338,3\n189#1:341,3\n275#1:344\n275#1:345,18\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleFragment extends Fragment {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy mViewModel = LazyKt.lazy(new Function0() { // from class: u7.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SimpleFragment.m11317O();
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public final C5060q imagePicker = new C5060q(this, null, 2, null);

    /* renamed from: c, reason: from kotlin metadata */
    public ViewFragmentSimpleBinding mBinding;

    /* renamed from: com.zykj.view.board.simple.SimpleFragment$b */
    public static final class C7258b implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f11227b;

        public C7258b(boolean z9) {
            this.f11227b = z9;
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
            viewFragmentSimpleBinding.f11417i.setEnabled(true);
            SimpleFragment.this.m11340t().m11357l(this.f11227b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: A */
    public static final void m11303A(View view) {
    }

    /* renamed from: B */
    public static final void m11304B(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11340t().m11353f();
    }

    /* renamed from: C */
    private final void m11305C() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f11413e;
        viewIncludeMenuBinding.f11499j.setOnClickListener(new View.OnClickListener() { // from class: u7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11306D(this.f16792a, view);
            }
        });
        viewIncludeMenuBinding.f11495f.setOnClickListener(new View.OnClickListener() { // from class: u7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11307E(this.f16793a, view);
            }
        });
        viewIncludeMenuBinding.f11493d.setOnClickListener(new View.OnClickListener() { // from class: u7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11308F(this.f16794a, view);
            }
        });
        viewIncludeMenuBinding.f11491b.setOnClickListener(new View.OnClickListener() { // from class: u7.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11309G(this.f16795a, view);
            }
        });
    }

    /* renamed from: D */
    public static final void m11306D(SimpleFragment simpleFragment, View view) {
        SimpleViewModel.m11349r(simpleFragment.m11340t(), false, 1, null);
    }

    /* renamed from: E */
    public static final void m11307E(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11340t().m11358m(AbstractC7227n.c.f11069e);
        simpleFragment.m11340t().m11355h();
    }

    /* renamed from: F */
    public static final void m11308F(SimpleFragment simpleFragment, View view) {
        simpleFragment.m11340t().m11358m(AbstractC7227n.a.f11067e);
        simpleFragment.m11340t().m11354g();
    }

    /* renamed from: G */
    public static final void m11309G(final SimpleFragment simpleFragment, View view) {
        Context contextRequireContext = simpleFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AbstractC8902a2.m15013f(contextRequireContext, new Function0() { // from class: u7.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SimpleFragment.m11310H(this.f16784a);
            }
        });
    }

    /* renamed from: H */
    public static final Unit m11310H(SimpleFragment simpleFragment) {
        simpleFragment.m11340t().m11350c();
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    private final void m11311I() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SimpleFragment$initObserver$1(this, null), 3, null);
    }

    /* renamed from: J */
    private final void m11312J() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgPenType = viewFragmentSimpleBinding.f11414f.f11516l;
        Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
        Iterator<View> it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: u7.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m11313K(this.f16785a, view);
                }
            });
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
        if (viewFragmentSimpleBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentSimpleBinding3.f11414f.f11515k;
        Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
        final int i10 = 0;
        final int i11 = 0;
        for (View view : ViewGroupKt.getChildren(rgPenSize)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: u7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SimpleFragment.m11314L(this.f16786a, i11, view2);
                }
            });
            i11 = i12;
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.mBinding;
        if (viewFragmentSimpleBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding4;
        }
        RadioGroup rgPenColor = viewFragmentSimpleBinding2.f11414f.f11514j;
        Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
        for (View view2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view2.setOnClickListener(new View.OnClickListener() { // from class: u7.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SimpleFragment.m11315M(this.f16788a, i10, view3);
                }
            });
            i10 = i13;
        }
    }

    /* renamed from: K */
    public static final void m11313K(SimpleFragment simpleFragment, View view) {
        int id = view.getId();
        if (id == R$id.rb_pen_custom) {
            simpleFragment.m11340t().m11361p(AbstractC7263d.a.f11296d);
        } else if (id == R$id.rb_pen_line) {
            simpleFragment.m11340t().m11361p(AbstractC7263d.c.f11298d);
        } else if (id == R$id.rb_pen_dotted_line) {
            simpleFragment.m11340t().m11361p(AbstractC7263d.b.f11297d);
        }
    }

    /* renamed from: L */
    public static final void m11314L(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m11340t().m11360o(i10);
    }

    /* renamed from: M */
    public static final void m11315M(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m11340t().m11359n(i10);
    }

    /* renamed from: N */
    private final void m11316N() {
        m11336w();
        m11311I();
    }

    /* renamed from: O */
    public static final SimpleViewModel m11317O() {
        return new SimpleViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m11318P(boolean isOpen) {
        float f10;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f11417i.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C7258b(isOpen));
        float f11 = 0.0f;
        if (isOpen) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
            if (viewFragmentSimpleBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSimpleBinding3 = null;
            }
            f10 = -viewFragmentSimpleBinding3.f11413e.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!isOpen) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.mBinding;
            if (viewFragmentSimpleBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSimpleBinding4 = null;
            }
            f11 = -viewFragmentSimpleBinding4.f11413e.getRoot().getWidth();
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.mBinding;
        if (viewFragmentSimpleBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentSimpleBinding5.f11413e.getRoot(), "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding6 = this.mBinding;
        if (viewFragmentSimpleBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding6.f11421m, "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding7 = this.mBinding;
        if (viewFragmentSimpleBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding2.f11417i, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: w */
    private final void m11336w() {
        m11305C();
        m11312J();
        m11337x();
        m11339z();
    }

    /* renamed from: x */
    private final void m11337x() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentSimpleBinding.f11411c.f11459d;
        Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
        final int i10 = 0;
        for (View view : ViewGroupKt.getChildren(rgEraserSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: u7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SimpleFragment.m11338y(this.f16790a, i10, view2);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: y */
    public static final void m11338y(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m11340t().m11356k(i10);
    }

    /* renamed from: z */
    private final void m11339z() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f11416h.setOnClickListener(new View.OnClickListener() { // from class: u7.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11303A(view);
            }
        });
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
        if (viewFragmentSimpleBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding3;
        }
        viewFragmentSimpleBinding2.f11417i.setOnClickListener(new View.OnClickListener() { // from class: u7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m11304B(this.f16783a, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentSimpleBinding viewFragmentSimpleBindingM11406a = ViewFragmentSimpleBinding.m11406a(inflater, container, false);
        Intrinsics.checkNotNull(viewFragmentSimpleBindingM11406a);
        this.mBinding = viewFragmentSimpleBindingM11406a;
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBindingM11406a.f11413e;
        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f11500k;
        Intrinsics.checkNotNullExpressionValue(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(8);
        AppCompatImageView ivRecover = viewIncludeMenuBinding.f11496g;
        Intrinsics.checkNotNullExpressionValue(ivRecover, "ivRecover");
        ivRecover.setVisibility(8);
        AppCompatImageView ivSelect = viewIncludeMenuBinding.f11498i;
        Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
        ivSelect.setVisibility(8);
        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f11492c;
        Intrinsics.checkNotNullExpressionValue(ivEnlarge, "ivEnlarge");
        ivEnlarge.setVisibility(8);
        AppCompatImageView ivReduce = viewIncludeMenuBinding.f11497h;
        Intrinsics.checkNotNullExpressionValue(ivReduce, "ivReduce");
        ivReduce.setVisibility(8);
        AppCompatImageView ivImageAdd = viewIncludeMenuBinding.f11494e;
        Intrinsics.checkNotNullExpressionValue(ivImageAdd, "ivImageAdd");
        ivImageAdd.setVisibility(8);
        AppCompatImageView ivBackgroundColor = viewIncludeMenuBinding.f11490a;
        Intrinsics.checkNotNullExpressionValue(ivBackgroundColor, "ivBackgroundColor");
        ivBackgroundColor.setVisibility(8);
        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBindingM11406a.f11414f;
        RadioButton rbPenCursor = viewIncludePenBinding.f11506b;
        Intrinsics.checkNotNullExpressionValue(rbPenCursor, "rbPenCursor");
        rbPenCursor.setVisibility(8);
        RadioButton rbPenHighlighter = viewIncludePenBinding.f11509e;
        Intrinsics.checkNotNullExpressionValue(rbPenHighlighter, "rbPenHighlighter");
        rbPenHighlighter.setVisibility(8);
        View root = viewFragmentSimpleBindingM11406a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11316N();
    }

    /* renamed from: t */
    public final SimpleViewModel m11340t() {
        return (SimpleViewModel) this.mViewModel.getValue();
    }

    /* renamed from: u */
    public final C9822c m11341u() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        return viewFragmentSimpleBinding.f11420l.getSimpleBoardConfig();
    }

    /* renamed from: v */
    public final SimpleBoardView m11342v() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSimpleBinding = null;
        }
        SimpleBoardView sketchView = viewFragmentSimpleBinding.f11420l;
        Intrinsics.checkNotNullExpressionValue(sketchView, "sketchView");
        return sketchView;
    }
}
