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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.view.R$id;
import com.zykj.view.board.board.AbstractC8855q;
import com.zykj.view.board.simple.AbstractC8884b;
import com.zykj.view.board.simple.AbstractC8886d;
import com.zykj.view.board.simple.SimpleFragment;
import com.zykj.view.databinding.ViewFragmentSimpleBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.util.Iterator;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p224kb.AbstractC9899w1;
import p308qb.C10769c;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p378vb.AbstractC11571a;
import p378vb.C11582l;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC10770a
/* loaded from: classes6.dex */
public final class SimpleFragment extends Fragment {

    /* renamed from: g */
    public static final C8880a f20431g = new C8880a(null);

    /* renamed from: d */
    public final InterfaceC10773d f20432d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: ob.a
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return SimpleFragment.m17270Y();
        }
    });

    /* renamed from: e */
    public final C11582l f20433e = new C11582l(this, null, 2, null);

    /* renamed from: f */
    public ViewFragmentSimpleBinding f20434f;

    /* renamed from: com.zykj.view.board.simple.SimpleFragment$a */
    public static final class C8880a {
        public /* synthetic */ C8880a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8880a() {
        }
    }

    /* renamed from: com.zykj.view.board.simple.SimpleFragment$b */
    public static final class C8881b implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f20436b;

        public C8881b(boolean z10) {
            this.f20436b = z10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding = SimpleFragment.this.f20434f;
            if (viewFragmentSimpleBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSimpleBinding = null;
            }
            viewFragmentSimpleBinding.f20617k.setEnabled(true);
            SimpleFragment.this.m17284F().m17301l(this.f20436b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1", m26211f = "SimpleFragment.kt", m26212l = {212}, m26213m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1 */
    public static final class C88821 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f20437c;

        @InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1", m26211f = "SimpleFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f20439c;

            /* renamed from: d */
            public /* synthetic */ Object f20440d;

            /* renamed from: e */
            public final /* synthetic */ SimpleFragment f20441e;

            @InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1", m26211f = "SimpleFragment.kt", m26212l = {214}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C121321 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20442c;

                /* renamed from: d */
                public final /* synthetic */ SimpleFragment f20443d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1", m26211f = "SimpleFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C121331 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20444c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20445d;

                    /* renamed from: e */
                    public final /* synthetic */ SimpleFragment f20446e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121331(SimpleFragment simpleFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20446e = simpleFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121331 c121331 = new C121331(this.f20446e, interfaceC11588c);
                        c121331.f20445d = obj;
                        return c121331;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AbstractC8884b abstractC8884b, InterfaceC11588c interfaceC11588c) {
                        return ((C121331) create(abstractC8884b, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        AbstractC8884b abstractC8884b = (AbstractC8884b) this.f20445d;
                        AbstractC11725a.m25952f();
                        if (this.f20444c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        if (abstractC8884b instanceof AbstractC8884b.b) {
                            this.f20446e.m17271Z(((AbstractC8884b.b) abstractC8884b).m17308a());
                        } else if (abstractC8884b instanceof AbstractC8884b.d) {
                            this.f20446e.m17285G().m22968i(((AbstractC8884b.d) abstractC8884b).m17310a());
                        } else if (abstractC8884b instanceof AbstractC8884b.f) {
                            AbstractC8884b.f fVar = (AbstractC8884b.f) abstractC8884b;
                            this.f20446e.m17286H().setActonMode(fVar.m17312a());
                            this.f20446e.m17285G().m22971l(fVar.m17313b());
                        } else if (abstractC8884b instanceof AbstractC8884b.g) {
                            this.f20446e.m17285G().m22972m(((AbstractC8884b.g) abstractC8884b).m17314a());
                        } else if (abstractC8884b instanceof AbstractC8884b.e) {
                            this.f20446e.m17285G().m22970k(((AbstractC8884b.e) abstractC8884b).m17311a());
                        } else if (abstractC8884b instanceof AbstractC8884b.c) {
                            this.f20446e.m17285G().m22969j(((AbstractC8884b.c) abstractC8884b).m17309a());
                        } else {
                            if (!(abstractC8884b instanceof AbstractC8884b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f20446e.m17286H().m17366d();
                        }
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C121321(SimpleFragment simpleFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20443d = simpleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new C121321(this.f20443d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20442c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11607p interfaceC11607pM17295d = this.f20443d.m17284F().m17295d();
                        C121331 c121331 = new C121331(this.f20443d, null);
                        this.f20442c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11607pM17295d, c121331, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                    return ((C121321) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2", m26211f = "SimpleFragment.kt", m26212l = {243}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20447c;

                /* renamed from: d */
                public final /* synthetic */ SimpleFragment f20448d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1", m26211f = "SimpleFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1, reason: invalid class name and collision with other inner class name */
                public static final class C121341 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20449c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20450d;

                    /* renamed from: e */
                    public final /* synthetic */ SimpleFragment f20451e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121341(SimpleFragment simpleFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20451e = simpleFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121341 c121341 = new C121341(this.f20451e, interfaceC11588c);
                        c121341.f20450d = obj;
                        return c121341;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8887e c8887e, InterfaceC11588c interfaceC11588c) {
                        return ((C121341) create(c8887e, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8887e c8887e = (C8887e) this.f20450d;
                        AbstractC11725a.m25952f();
                        if (this.f20449c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20451e.f20434f;
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
                        if (viewFragmentSimpleBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentSimpleBinding = null;
                        }
                        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f20613g;
                        viewIncludeMenuBinding.f20676l.setSelected(c8887e.m17329j());
                        viewIncludeMenuBinding.f20675k.setSelected(c8887e.m17324e().m17010d());
                        viewIncludeMenuBinding.f20672h.setSelected(c8887e.m17324e().m17009c());
                        viewIncludeMenuBinding.f20670f.setSelected(c8887e.m17324e().m17007a());
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f20451e.f20434f;
                        if (viewFragmentSimpleBinding3 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentSimpleBinding3 = null;
                        }
                        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBinding3.f20614h;
                        RadioGroup rgPenType = viewIncludePenBinding.f20692m;
                        AbstractC9979u.m20293f(rgPenType, "rgPenType");
                        AbstractC11571a.m25472a(rgPenType, c8887e.m17328i().m17318b());
                        RadioGroup rgPenSize = viewIncludePenBinding.f20691l;
                        AbstractC9979u.m20293f(rgPenSize, "rgPenSize");
                        AbstractC11571a.m25472a(rgPenSize, c8887e.m17327h().m17315a());
                        RadioGroup rgPenColor = viewIncludePenBinding.f20690k;
                        AbstractC9979u.m20293f(rgPenColor, "rgPenColor");
                        AbstractC11571a.m25472a(rgPenColor, c8887e.m17326g().m17016b());
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f20451e.f20434f;
                        if (viewFragmentSimpleBinding4 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentSimpleBinding4 = null;
                        }
                        RadioGroup rgEraserSize = viewFragmentSimpleBinding4.f20611e.f20652f;
                        AbstractC9979u.m20293f(rgEraserSize, "rgEraserSize");
                        AbstractC11571a.m25472a(rgEraserSize, c8887e.m17322c().m16972a());
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.f20451e.f20434f;
                        if (viewFragmentSimpleBinding5 == null) {
                            AbstractC9979u.m20312y("mBinding");
                        } else {
                            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding5;
                        }
                        viewFragmentSimpleBinding2.f20617k.setImageResource(c8887e.m17323d().m16976a());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(SimpleFragment simpleFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20448d = simpleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass2(this.f20448d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20447c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM17296e = this.f20448d.m17284F().m17296e();
                        C121341 c121341 = new C121341(this.f20448d, null);
                        this.f20447c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM17296e, c121341, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                    return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SimpleFragment simpleFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f20441e = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20441e, interfaceC11588c);
                anonymousClass1.f20440d = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f20440d;
                AbstractC11725a.m25952f();
                if (this.f20439c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C121321(this.f20441e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass2(this.f20441e, null), 3, null);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C88821(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return SimpleFragment.this.new C88821(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f20437c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LifecycleOwner viewLifecycleOwner = SimpleFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SimpleFragment.this, null);
                this.f20437c = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C88821) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: I */
    private final void m17254I() {
        m17260O();
        m17266U();
        m17255J();
        m17257L();
    }

    /* renamed from: J */
    private final void m17255J() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentSimpleBinding.f20611e.f20652f;
        AbstractC9979u.m20293f(rgEraserSize, "rgEraserSize");
        final int i10 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgEraserSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: ob.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m17256K(this.f24861c, i10, view);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: K */
    public static final void m17256K(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m17284F().m17300k(i10);
    }

    /* renamed from: L */
    private final void m17257L() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f20616j.setOnClickListener(new View.OnClickListener() { // from class: ob.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m17258M(view);
            }
        });
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f20434f;
        if (viewFragmentSimpleBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding3;
        }
        viewFragmentSimpleBinding2.f20617k.setOnClickListener(new View.OnClickListener() { // from class: ob.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m17259N(this.f24854c, view);
            }
        });
    }

    /* renamed from: M */
    public static final void m17258M(View view) {
    }

    /* renamed from: N */
    public static final void m17259N(SimpleFragment simpleFragment, View view) {
        simpleFragment.m17284F().m17297f();
    }

    /* renamed from: O */
    private final void m17260O() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f20613g;
        viewIncludeMenuBinding.f20676l.setOnClickListener(new View.OnClickListener() { // from class: ob.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m17261P(this.f24863c, view);
            }
        });
        viewIncludeMenuBinding.f20672h.setOnClickListener(new View.OnClickListener() { // from class: ob.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m17262Q(this.f24864c, view);
            }
        });
        viewIncludeMenuBinding.f20670f.setOnClickListener(new View.OnClickListener() { // from class: ob.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m17263R(this.f24865c, view);
            }
        });
        viewIncludeMenuBinding.f20668d.setOnClickListener(new View.OnClickListener() { // from class: ob.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleFragment.m17264S(this.f24866c, view);
            }
        });
    }

    /* renamed from: P */
    public static final void m17261P(SimpleFragment simpleFragment, View view) {
        SimpleViewModel.m17293r(simpleFragment.m17284F(), false, 1, null);
    }

    /* renamed from: Q */
    public static final void m17262Q(SimpleFragment simpleFragment, View view) {
        simpleFragment.m17284F().m17302m(AbstractC8855q.c.f20293e);
        simpleFragment.m17284F().m17299h();
    }

    /* renamed from: R */
    public static final void m17263R(SimpleFragment simpleFragment, View view) {
        simpleFragment.m17284F().m17302m(AbstractC8855q.a.f20291e);
        simpleFragment.m17284F().m17298g();
    }

    /* renamed from: S */
    public static final void m17264S(final SimpleFragment simpleFragment, View view) {
        Context contextRequireContext = simpleFragment.requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        AbstractC9899w1.m19957f(contextRequireContext, new InterfaceC9529a() { // from class: ob.c
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return SimpleFragment.m17265T(this.f24855c);
            }
        });
    }

    /* renamed from: T */
    public static final C10786q m17265T(SimpleFragment simpleFragment) {
        simpleFragment.m17284F().m17294c();
        return C10786q.f26013a;
    }

    /* renamed from: U */
    private final void m17266U() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        RadioGroup rgPenType = viewFragmentSimpleBinding.f20614h.f20692m;
        AbstractC9979u.m20293f(rgPenType, "rgPenType");
        Iterator it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: ob.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m17267V(this.f24856c, view);
                }
            });
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f20434f;
        if (viewFragmentSimpleBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentSimpleBinding3.f20614h.f20691l;
        AbstractC9979u.m20293f(rgPenSize, "rgPenSize");
        final int i10 = 0;
        final int i11 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgPenSize)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: ob.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m17268W(this.f24857c, i11, view);
                }
            });
            i11 = i12;
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f20434f;
        if (viewFragmentSimpleBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding4;
        }
        RadioGroup rgPenColor = viewFragmentSimpleBinding2.f20614h.f20690k;
        AbstractC9979u.m20293f(rgPenColor, "rgPenColor");
        for (Object obj2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj2).setOnClickListener(new View.OnClickListener() { // from class: ob.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimpleFragment.m17269X(this.f24859c, i10, view);
                }
            });
            i10 = i13;
        }
    }

    /* renamed from: V */
    public static final void m17267V(SimpleFragment simpleFragment, View view) {
        int id2 = view.getId();
        if (id2 == R$id.rb_pen_custom) {
            simpleFragment.m17284F().m17305p(AbstractC8886d.a.f20505d);
        } else if (id2 == R$id.rb_pen_line) {
            simpleFragment.m17284F().m17305p(AbstractC8886d.c.f20507d);
        } else if (id2 == R$id.rb_pen_dotted_line) {
            simpleFragment.m17284F().m17305p(AbstractC8886d.b.f20506d);
        }
    }

    /* renamed from: W */
    public static final void m17268W(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m17284F().m17304o(i10);
    }

    /* renamed from: X */
    public static final void m17269X(SimpleFragment simpleFragment, int i10, View view) {
        simpleFragment.m17284F().m17303n(i10);
    }

    /* renamed from: Y */
    public static final SimpleViewModel m17270Y() {
        return new SimpleViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public final void m17271Z(boolean z10) {
        float f10;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        viewFragmentSimpleBinding.f20617k.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C8881b(z10));
        float f11 = 0.0f;
        if (z10) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f20434f;
            if (viewFragmentSimpleBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSimpleBinding3 = null;
            }
            f10 = -viewFragmentSimpleBinding3.f20613g.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f20434f;
            if (viewFragmentSimpleBinding4 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSimpleBinding4 = null;
            }
            f11 = -viewFragmentSimpleBinding4.f20613g.getRoot().getWidth();
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.f20434f;
        if (viewFragmentSimpleBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentSimpleBinding5.f20613g.getRoot(), "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding6 = this.f20434f;
        if (viewFragmentSimpleBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding6.f20621o, "translationX", f10, f11));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding7 = this.f20434f;
        if (viewFragmentSimpleBinding7 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSimpleBinding2 = viewFragmentSimpleBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding2.f20617k, "translationX", f10, f11));
        animatorSet.start();
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C88821(null), 3, null);
    }

    private final void initView() {
        m17254I();
        initObserver();
    }

    /* renamed from: F */
    public final SimpleViewModel m17284F() {
        return (SimpleViewModel) this.f20432d.getValue();
    }

    /* renamed from: G */
    public final C10769c m17285G() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        return viewFragmentSimpleBinding.f20620n.getSimpleBoardConfig();
    }

    /* renamed from: H */
    public final SimpleBoardView m17286H() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f20434f;
        if (viewFragmentSimpleBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSimpleBinding = null;
        }
        SimpleBoardView sketchView = viewFragmentSimpleBinding.f20620n;
        AbstractC9979u.m20293f(sketchView, "sketchView");
        return sketchView;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewFragmentSimpleBinding viewFragmentSimpleBindingM17347a = ViewFragmentSimpleBinding.m17347a(inflater, viewGroup, false);
        AbstractC9979u.m20291d(viewFragmentSimpleBindingM17347a);
        this.f20434f = viewFragmentSimpleBindingM17347a;
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBindingM17347a.f20613g;
        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f20677m;
        AbstractC9979u.m20293f(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(8);
        AppCompatImageView ivRecover = viewIncludeMenuBinding.f20673i;
        AbstractC9979u.m20293f(ivRecover, "ivRecover");
        ivRecover.setVisibility(8);
        AppCompatImageView ivSelect = viewIncludeMenuBinding.f20675k;
        AbstractC9979u.m20293f(ivSelect, "ivSelect");
        ivSelect.setVisibility(8);
        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f20669e;
        AbstractC9979u.m20293f(ivEnlarge, "ivEnlarge");
        ivEnlarge.setVisibility(8);
        AppCompatImageView ivReduce = viewIncludeMenuBinding.f20674j;
        AbstractC9979u.m20293f(ivReduce, "ivReduce");
        ivReduce.setVisibility(8);
        AppCompatImageView ivImageAdd = viewIncludeMenuBinding.f20671g;
        AbstractC9979u.m20293f(ivImageAdd, "ivImageAdd");
        ivImageAdd.setVisibility(8);
        AppCompatImageView ivBackgroundColor = viewIncludeMenuBinding.f20667c;
        AbstractC9979u.m20293f(ivBackgroundColor, "ivBackgroundColor");
        ivBackgroundColor.setVisibility(8);
        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBindingM17347a.f20614h;
        RadioButton rbPenCursor = viewIncludePenBinding.f20682c;
        AbstractC9979u.m20293f(rbPenCursor, "rbPenCursor");
        rbPenCursor.setVisibility(8);
        RadioButton rbPenHighlighter = viewIncludePenBinding.f20685f;
        AbstractC9979u.m20293f(rbPenHighlighter, "rbPenHighlighter");
        rbPenHighlighter.setVisibility(8);
        View root = viewFragmentSimpleBindingM17347a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        initView();
    }
}
