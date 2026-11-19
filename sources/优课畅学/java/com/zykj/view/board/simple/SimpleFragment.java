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
import com.zykj.view.board.board.AbstractC8221q;
import com.zykj.view.board.simple.AbstractC8253d;
import com.zykj.view.board.simple.SimpleFragment;
import com.zykj.view.databinding.ViewFragmentSimpleBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.util.Iterator;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.C0038l;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p210p5.AbstractC9742w1;
import p276v5.C10248c;
import p300x7.InterfaceC10559a;

@InterfaceC8721a
/* loaded from: classes5.dex */
public final class SimpleFragment extends Fragment {

    /* renamed from: d */
    public static final C8247a f15220d = new C8247a(null);

    /* renamed from: a */
    public final InterfaceC8724d f15221a = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: t5.a
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return SimpleFragment.m13192R();
        }
    });

    /* renamed from: b */
    public final C0038l f15222b = new C0038l(this, null, 2, null);

    /* renamed from: c */
    public ViewFragmentSimpleBinding f15223c;

    /* renamed from: com.zykj.view.board.simple.SimpleFragment$a */
    public static final class C8247a {
        public /* synthetic */ C8247a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C8247a() {
        }
    }

    /* renamed from: com.zykj.view.board.simple.SimpleFragment$b */
    public static final class C8248b implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f15225b;

        public C8248b(boolean z10) {
            this.f15225b = z10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding = SimpleFragment.this.f15223c;
            if (viewFragmentSimpleBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSimpleBinding = null;
            }
            viewFragmentSimpleBinding.f15406i.setEnabled(true);
            SimpleFragment.this.m13212w().m13229l(this.f15225b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: A */
    private final void m13175A() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentSimpleBinding.f15400c.f15441d;
        AbstractC9133u.m16132f(rgEraserSize, "rgEraserSize");
        final int i10 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgEraserSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: t5.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m13176B(this.f20185a, i10, view);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: B */
    public static final void m13176B(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m13212w().m13228k(i10);
    }

    /* renamed from: C */
    private final void m13177C() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f15405h.setOnClickListener(new View.OnClickListener() { // from class: t5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m13178D(view);
            }
        });
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f15223c;
        if (viewFragmentSimpleBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding3;
        }
        viewFragmentSimpleBinding2.f15406i.setOnClickListener(new View.OnClickListener() { // from class: t5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m13179E(this.f20178a, view);
            }
        });
    }

    /* renamed from: D */
    public static final void m13178D(View view) {
    }

    /* renamed from: E */
    public static final void m13179E(SimpleFragment simpleFragment, View view) {
        simpleFragment.m13212w().m13225f();
    }

    /* renamed from: F */
    private final void m13180F() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f15402e;
        viewIncludeMenuBinding.f15465j.setOnClickListener(new View.OnClickListener() { // from class: t5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m13181G(this.f20187a, view);
            }
        });
        viewIncludeMenuBinding.f15461f.setOnClickListener(new View.OnClickListener() { // from class: t5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m13182H(this.f20188a, view);
            }
        });
        viewIncludeMenuBinding.f15459d.setOnClickListener(new View.OnClickListener() { // from class: t5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m13183I(this.f20189a, view);
            }
        });
        viewIncludeMenuBinding.f15457b.setOnClickListener(new View.OnClickListener() { // from class: t5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m13184J(this.f20190a, view);
            }
        });
    }

    /* renamed from: G */
    public static final void m13181G(SimpleFragment simpleFragment, View view) {
        SimpleViewModel.m13221r(simpleFragment.m13212w(), false, 1, null);
    }

    /* renamed from: H */
    public static final void m13182H(SimpleFragment simpleFragment, View view) {
        simpleFragment.m13212w().m13230m(AbstractC8221q.c.f15077e);
        simpleFragment.m13212w().m13227h();
    }

    /* renamed from: I */
    public static final void m13183I(SimpleFragment simpleFragment, View view) {
        simpleFragment.m13212w().m13230m(AbstractC8221q.a.f15075e);
        simpleFragment.m13212w().m13226g();
    }

    /* renamed from: J */
    public static final void m13184J(final SimpleFragment simpleFragment, View view) {
        Context contextRequireContext = simpleFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        AbstractC9742w1.m18260f(contextRequireContext, new InterfaceC10559a() { // from class: t5.c
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SimpleFragment.m13185K(this.f20179a);
            }
        });
    }

    /* renamed from: K */
    public static final C8736p m13185K(SimpleFragment simpleFragment) {
        simpleFragment.m13212w().m13222c();
        return C8736p.f16368a;
    }

    /* renamed from: L */
    private final void m13186L() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SimpleFragment$initObserver$1(this, null), 3, null);
    }

    /* renamed from: M */
    private final void m13187M() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgPenType = viewFragmentSimpleBinding.f15403f.f15481k;
        AbstractC9133u.m16132f(rgPenType, "rgPenType");
        Iterator it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: t5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m13188N(this.f20180a, view);
                }
            });
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f15223c;
        if (viewFragmentSimpleBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentSimpleBinding3.f15403f.f15480j;
        AbstractC9133u.m16132f(rgPenSize, "rgPenSize");
        final int i10 = 0;
        final int i11 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgPenSize)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: t5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m13189O(this.f20181a, i11, view);
                }
            });
            i11 = i12;
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f15223c;
        if (viewFragmentSimpleBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding4;
        }
        RadioGroup rgPenColor = viewFragmentSimpleBinding2.f15403f.f15479i;
        AbstractC9133u.m16132f(rgPenColor, "rgPenColor");
        for (Object obj2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj2).setOnClickListener(new View.OnClickListener() { // from class: t5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m13190P(this.f20183a, i10, view);
                }
            });
            i10 = i13;
        }
    }

    /* renamed from: N */
    public static final void m13188N(SimpleFragment simpleFragment, View view) {
        int id = view.getId();
        if (id == R$id.rb_pen_custom) {
            simpleFragment.m13212w().m13233p(AbstractC8253d.a.f15294d);
        } else if (id == R$id.rb_pen_line) {
            simpleFragment.m13212w().m13233p(AbstractC8253d.c.f15296d);
        } else if (id == R$id.rb_pen_dotted_line) {
            simpleFragment.m13212w().m13233p(AbstractC8253d.b.f15295d);
        }
    }

    /* renamed from: O */
    public static final void m13189O(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m13212w().m13232o(i10);
    }

    /* renamed from: P */
    public static final void m13190P(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m13212w().m13231n(i10);
    }

    /* renamed from: Q */
    private final void m13191Q() {
        m13211z();
        m13186L();
    }

    /* renamed from: R */
    public static final SimpleViewModel m13192R() {
        return new SimpleViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final void m13193S(boolean z10) {
        float f10;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f15406i.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C8248b(z10));
        float f11 = 0.0f;
        if (z10) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f15223c;
            if (viewFragmentSimpleBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSimpleBinding3 = null;
            }
            f10 = -viewFragmentSimpleBinding3.f15402e.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f15223c;
            if (viewFragmentSimpleBinding4 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSimpleBinding4 = null;
            }
            f11 = -viewFragmentSimpleBinding4.f15402e.getRoot().getWidth();
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.f15223c;
        if (viewFragmentSimpleBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentSimpleBinding5.f15402e.getRoot(), "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding6 = this.f15223c;
        if (viewFragmentSimpleBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding6.f15410m, "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding7 = this.f15223c;
        if (viewFragmentSimpleBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding2.f15406i, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: z */
    private final void m13211z() {
        m13180F();
        m13187M();
        m13175A();
        m13177C();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewFragmentSimpleBinding viewFragmentSimpleBindingM13275a = ViewFragmentSimpleBinding.m13275a(inflater, viewGroup, false);
        AbstractC9133u.m16130d(viewFragmentSimpleBindingM13275a);
        this.f15223c = viewFragmentSimpleBindingM13275a;
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBindingM13275a.f15402e;
        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f15466k;
        AbstractC9133u.m16132f(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(8);
        AppCompatImageView ivRecover = viewIncludeMenuBinding.f15462g;
        AbstractC9133u.m16132f(ivRecover, "ivRecover");
        ivRecover.setVisibility(8);
        AppCompatImageView ivSelect = viewIncludeMenuBinding.f15464i;
        AbstractC9133u.m16132f(ivSelect, "ivSelect");
        ivSelect.setVisibility(8);
        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f15458c;
        AbstractC9133u.m16132f(ivEnlarge, "ivEnlarge");
        ivEnlarge.setVisibility(8);
        AppCompatImageView ivReduce = viewIncludeMenuBinding.f15463h;
        AbstractC9133u.m16132f(ivReduce, "ivReduce");
        ivReduce.setVisibility(8);
        AppCompatImageView ivImageAdd = viewIncludeMenuBinding.f15460e;
        AbstractC9133u.m16132f(ivImageAdd, "ivImageAdd");
        ivImageAdd.setVisibility(8);
        AppCompatImageView ivBackgroundColor = viewIncludeMenuBinding.f15456a;
        AbstractC9133u.m16132f(ivBackgroundColor, "ivBackgroundColor");
        ivBackgroundColor.setVisibility(8);
        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBindingM13275a.f15403f;
        RadioButton rbPenCursor = viewIncludePenBinding.f15471a;
        AbstractC9133u.m16132f(rbPenCursor, "rbPenCursor");
        rbPenCursor.setVisibility(8);
        RadioButton rbPenHighlighter = viewIncludePenBinding.f15474d;
        AbstractC9133u.m16132f(rbPenHighlighter, "rbPenHighlighter");
        rbPenHighlighter.setVisibility(8);
        View root = viewFragmentSimpleBindingM13275a.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        m13191Q();
    }

    /* renamed from: w */
    public final SimpleViewModel m13212w() {
        return (SimpleViewModel) this.f15221a.getValue();
    }

    /* renamed from: x */
    public final C10248c m13213x() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        return viewFragmentSimpleBinding.f15409l.getSimpleBoardConfig();
    }

    /* renamed from: y */
    public final SimpleBoardView m13214y() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15223c;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        SimpleBoardView sketchView = viewFragmentSimpleBinding.f15409l;
        AbstractC9133u.m16132f(sketchView, "sketchView");
        return sketchView;
    }
}
