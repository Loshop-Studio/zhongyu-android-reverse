package com.zykj.view.board.board;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.view.R$id;
import com.zykj.view.board.board.AbstractC8841c;
import com.zykj.view.board.board.AbstractC8850l;
import com.zykj.view.board.board.AbstractC8853o;
import com.zykj.view.board.board.AbstractC8855q;
import com.zykj.view.board.board.AbstractC8859u;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.databinding.ViewFragmentBoardBinding;
import com.zykj.view.databinding.ViewIncludeBackgroundColorBinding;
import com.zykj.view.databinding.ViewIncludeImageAddBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import com.zykj.view.databinding.ViewItemSketchRecordBinding;
import com.zykj.view.widget.SketchProgressView;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10218f;
import ma.InterfaceC10222j;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p224kb.AbstractC9899w1;
import p224kb.C9831a;
import p224kb.C9836b1;
import p224kb.C9905y1;
import p309qc.C10786q;
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

/* loaded from: classes6.dex */
public final class BoardFragment extends Fragment {

    /* renamed from: i */
    public static final C8830a f20046i = new C8830a(null);

    /* renamed from: d */
    public ViewFragmentBoardBinding f20047d;

    /* renamed from: e */
    public final InterfaceC10773d f20048e = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: kb.y
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return BoardFragment.m16679H1();
        }
    });

    /* renamed from: f */
    public final C11582l f20049f = new C11582l(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: g */
    public InterfaceC9529a f20050g;

    /* renamed from: h */
    public final ActivityResultLauncher f20051h;

    /* renamed from: com.zykj.view.board.board.BoardFragment$a */
    public static final class C8830a {
        public /* synthetic */ C8830a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final BoardFragment m16799a(String path, C8842d boardViewConfig, C9836b1 boardSketchConfig, C9831a boardCallbackConfig) {
            AbstractC9979u.m20294g(path, "path");
            AbstractC9979u.m20294g(boardViewConfig, "boardViewConfig");
            AbstractC9979u.m20294g(boardSketchConfig, "boardSketchConfig");
            AbstractC9979u.m20294g(boardCallbackConfig, "boardCallbackConfig");
            BoardFragment boardFragment = new BoardFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            boardFragment.setArguments(bundle);
            boardFragment.m16784L1(boardViewConfig);
            boardFragment.m16783K1(boardSketchConfig);
            boardFragment.m16781J1(boardCallbackConfig);
            return boardFragment;
        }

        public C8830a() {
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$b */
    public static final class C8831b implements InterfaceC10222j {
        public C8831b() {
        }

        @Override // ma.InterfaceC10222j
        /* renamed from: a */
        public void mo16800a(String initText, InterfaceC9540l afterTextChangedCallback, InterfaceC9540l doneCallback, InterfaceC9529a cancelCallback) {
            AbstractC9979u.m20294g(initText, "initText");
            AbstractC9979u.m20294g(afterTextChangedCallback, "afterTextChangedCallback");
            AbstractC9979u.m20294g(doneCallback, "doneCallback");
            AbstractC9979u.m20294g(cancelCallback, "cancelCallback");
            Context contextRequireContext = BoardFragment.this.requireContext();
            AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
            AbstractC9899w1.m19960i(contextRequireContext, initText, afterTextChangedCallback, cancelCallback, doneCallback);
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$c */
    public static final class C8832c implements InterfaceC10218f {
        public C8832c() {
        }

        /* renamed from: c */
        public static final C10786q m16802c(InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
            String absolutePath;
            if (uri != null) {
                File fileUri2File = UriUtils.uri2File(uri);
                if (fileUri2File == null || (absolutePath = fileUri2File.getAbsolutePath()) == null) {
                    absolutePath = "";
                }
                interfaceC9540l.invoke(absolutePath);
            } else {
                interfaceC9529a.invoke();
            }
            return C10786q.f26013a;
        }

        @Override // ma.InterfaceC10218f
        /* renamed from: a */
        public void mo16803a(String imageLocalPath, final InterfaceC9540l doneCallback, final InterfaceC9529a cancelCallback) {
            AbstractC9979u.m20294g(imageLocalPath, "imageLocalPath");
            AbstractC9979u.m20294g(doneCallback, "doneCallback");
            AbstractC9979u.m20294g(cancelCallback, "cancelCallback");
            C11582l c11582l = BoardFragment.this.f20049f;
            Uri uriFile2Uri = UriUtils.file2Uri(new File(imageLocalPath));
            AbstractC9979u.m20293f(uriFile2Uri, "file2Uri(...)");
            c11582l.m25500q(uriFile2Uri, new InterfaceC9540l() { // from class: kb.a1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return BoardFragment.C8832c.m16802c(doneCallback, cancelCallback, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$d */
    public static final class C8833d implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f20055b;

        public C8833d(boolean z10) {
            this.f20055b = z10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.f20047d;
            if (viewFragmentBoardBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f20586k.setEnabled(true);
            BoardFragment.this.m16794w0().m16907W0(this.f20055b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1", m26211f = "BoardFragment.kt", m26212l = {496}, m26213m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1 */
    public static final class C88341 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f20088c;

        @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f20090c;

            /* renamed from: d */
            public /* synthetic */ Object f20091d;

            /* renamed from: e */
            public final /* synthetic */ BoardFragment f20092e;

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1", m26211f = "BoardFragment.kt", m26212l = {499}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C121221 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20093c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20094d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C121231 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20095c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20096d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20097e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121231(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20097e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121231 c121231 = new C121231(this.f20097e, interfaceC11588c);
                        c121231.f20096d = obj;
                        return c121231;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AbstractC8841c abstractC8841c, InterfaceC11588c interfaceC11588c) {
                        return ((C121231) create(abstractC8841c, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        AbstractC8841c abstractC8841c = (AbstractC8841c) this.f20096d;
                        AbstractC11725a.m25952f();
                        if (this.f20095c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        if (!(abstractC8841c instanceof AbstractC8841c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f20097e.m16789U1(((AbstractC8841c.a) abstractC8841c).m16952a());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C121221(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20094d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new C121221(this.f20094d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20093c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11607p interfaceC11607pM16886M = this.f20094d.m16794w0().m16886M();
                        C121231 c121231 = new C121231(this.f20094d, null);
                        this.f20093c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11607pM16886M, c121231, this) == objM25952f) {
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
                    return ((C121221) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2", m26211f = "BoardFragment.kt", m26212l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20098c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20099d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1, reason: invalid class name and collision with other inner class name */
                public static final class C121241 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20100c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20101d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20102e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121241(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20102e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121241 c121241 = new C121241(this.f20102e, interfaceC11588c);
                        c121241.f20101d = obj;
                        return c121241;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8854p c8854p, InterfaceC11588c interfaceC11588c) {
                        return ((C121241) create(c8854p, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8854p c8854p = (C8854p) this.f20101d;
                        AbstractC11725a.m25952f();
                        if (this.f20100c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20102e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f20582g;
                        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f20677m;
                        AbstractC9979u.m20293f(ivWithdraw, "ivWithdraw");
                        ivWithdraw.setVisibility(c8854p.m17002d() ? 0 : 8);
                        AppCompatImageView ivRecover = viewIncludeMenuBinding.f20673i;
                        AbstractC9979u.m20293f(ivRecover, "ivRecover");
                        ivRecover.setVisibility(c8854p.m17002d() ? 0 : 8);
                        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f20669e;
                        AbstractC9979u.m20293f(ivEnlarge, "ivEnlarge");
                        ivEnlarge.setVisibility(c8854p.m17003e() ? 0 : 8);
                        AppCompatImageView ivReduce = viewIncludeMenuBinding.f20674j;
                        AbstractC9979u.m20293f(ivReduce, "ivReduce");
                        ivReduce.setVisibility(c8854p.m17003e() ? 0 : 8);
                        viewIncludeMenuBinding.f20677m.setEnabled(c8854p.m17006h());
                        viewIncludeMenuBinding.f20673i.setEnabled(c8854p.m17004f());
                        viewIncludeMenuBinding.f20676l.setSelected(c8854p.m17005g());
                        viewIncludeMenuBinding.f20675k.setSelected(c8854p.m17001c().m17010d());
                        viewIncludeMenuBinding.f20672h.setSelected(c8854p.m17001c().m17009c());
                        viewIncludeMenuBinding.f20670f.setSelected(c8854p.m17001c().m17007a());
                        viewIncludeMenuBinding.f20671g.setSelected(c8854p.m17001c().m17008b());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20099d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass2(this.f20099d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20098c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16896R = this.f20099d.m16794w0().m16896R();
                        C121241 c121241 = new C121241(this.f20099d, null);
                        this.f20098c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16896R, c121241, this) == objM25952f) {
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

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3", m26211f = "BoardFragment.kt", m26212l = {532}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20103c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20104d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1, reason: invalid class name and collision with other inner class name */
                public static final class C121251 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20105c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20106d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20107e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121251(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20107e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121251 c121251 = new C121251(this.f20107e, interfaceC11588c);
                        c121251.f20106d = obj;
                        return c121251;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8858t c8858t, InterfaceC11588c interfaceC11588c) {
                        return ((C121251) create(c8858t, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8858t c8858t = (C8858t) this.f20106d;
                        AbstractC11725a.m25952f();
                        if (this.f20105c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20107e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        ViewIncludePenBinding viewIncludePenBinding = viewFragmentBoardBinding.f20583h;
                        RadioButton rbPenDottedLine = viewIncludePenBinding.f20684e;
                        AbstractC9979u.m20293f(rbPenDottedLine, "rbPenDottedLine");
                        rbPenDottedLine.setVisibility(c8858t.m17019c() ? 0 : 8);
                        RadioButton rbPenHighlighter = viewIncludePenBinding.f20685f;
                        AbstractC9979u.m20293f(rbPenHighlighter, "rbPenHighlighter");
                        rbPenHighlighter.setVisibility(c8858t.m17020d() ? 0 : 8);
                        RadioGroup rgPenType = viewIncludePenBinding.f20692m;
                        AbstractC9979u.m20293f(rgPenType, "rgPenType");
                        AbstractC11571a.m25472a(rgPenType, c8858t.m17023g().m17025b());
                        RadioGroup rgPenSize = viewIncludePenBinding.f20691l;
                        AbstractC9979u.m20293f(rgPenSize, "rgPenSize");
                        AbstractC11571a.m25472a(rgPenSize, c8858t.m17022f());
                        RadioGroup rgPenColor = viewIncludePenBinding.f20690k;
                        AbstractC9979u.m20293f(rgPenColor, "rgPenColor");
                        AbstractC11571a.m25472a(rgPenColor, c8858t.m17021e().m17016b());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20104d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass3(this.f20104d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20103c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16902U = this.f20104d.m16794w0().m16902U();
                        C121251 c121251 = new C121251(this.f20104d, null);
                        this.f20103c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16902U, c121251, this) == objM25952f) {
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
                    return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4", m26211f = "BoardFragment.kt", m26212l = {546}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20108c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20109d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1, reason: invalid class name and collision with other inner class name */
                public static final class C121261 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20110c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20111d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20112e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121261(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20112e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121261 c121261 = new C121261(this.f20112e, interfaceC11588c);
                        c121261.f20111d = obj;
                        return c121261;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8847i c8847i, InterfaceC11588c interfaceC11588c) {
                        return ((C121261) create(c8847i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8847i c8847i = (C8847i) this.f20111d;
                        AbstractC11725a.m25952f();
                        if (this.f20110c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20112e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        RadioGroup rgEraserSize = viewFragmentBoardBinding.f20580e.f20652f;
                        AbstractC9979u.m20293f(rgEraserSize, "rgEraserSize");
                        AbstractC11571a.m25472a(rgEraserSize, c8847i.m16971b().m16972a());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20109d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass4(this.f20109d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20108c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16884L = this.f20109d.m16794w0().m16884L();
                        C121261 c121261 = new C121261(this.f20109d, null);
                        this.f20108c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16884L, c121261, this) == objM25952f) {
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
                    return ((AnonymousClass4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5", m26211f = "BoardFragment.kt", m26212l = {555}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20113c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20114d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1, reason: invalid class name and collision with other inner class name */
                public static final class C121271 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20115c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20116d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20117e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121271(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20117e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121271 c121271 = new C121271(this.f20117e, interfaceC11588c);
                        c121271.f20116d = obj;
                        return c121271;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8852n c8852n, InterfaceC11588c interfaceC11588c) {
                        return ((C121271) create(c8852n, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8852n c8852n = (C8852n) this.f20116d;
                        AbstractC11725a.m25952f();
                        if (this.f20115c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20117e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f20581f;
                        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f20657c;
                        AbstractC9979u.m20293f(ivImageCamera, "ivImageCamera");
                        ivImageCamera.setVisibility(c8852n.m16990c() ? 0 : 8);
                        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f20658d;
                        AbstractC9979u.m20293f(ivImageGallery, "ivImageGallery");
                        ivImageGallery.setVisibility(c8852n.m16991d() ? 0 : 8);
                        AppCompatImageView ivText = viewIncludeImageAddBinding.f20661g;
                        AbstractC9979u.m20293f(ivText, "ivText");
                        ivText.setVisibility(c8852n.m16994g() ? 0 : 8);
                        AppCompatImageView ivRectangle = viewIncludeImageAddBinding.f20660f;
                        AbstractC9979u.m20293f(ivRectangle, "ivRectangle");
                        ivRectangle.setVisibility(c8852n.m16993f() ? 0 : 8);
                        AppCompatImageView ivOval = viewIncludeImageAddBinding.f20659e;
                        AbstractC9979u.m20293f(ivOval, "ivOval");
                        ivOval.setVisibility(c8852n.m16993f() ? 0 : 8);
                        ImageView ivTriangle = viewIncludeImageAddBinding.f20662h;
                        AbstractC9979u.m20293f(ivTriangle, "ivTriangle");
                        ivTriangle.setVisibility(c8852n.m16993f() ? 0 : 8);
                        viewIncludeImageAddBinding.f20660f.setSelected(c8852n.m16992e().m16997c());
                        viewIncludeImageAddBinding.f20659e.setSelected(c8852n.m16992e().m16996b());
                        viewIncludeImageAddBinding.f20662h.setSelected(c8852n.m16992e().m16998d());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20114d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass5(this.f20114d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20113c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16892P = this.f20114d.m16794w0().m16892P();
                        C121271 c121271 = new C121271(this.f20114d, null);
                        this.f20113c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16892P, c121271, this) == objM25952f) {
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
                    return ((AnonymousClass5) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6", m26211f = "BoardFragment.kt", m26212l = {573}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20118c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20119d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1, reason: invalid class name and collision with other inner class name */
                public static final class C121281 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20120c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20121d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20122e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121281(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20122e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121281 c121281 = new C121281(this.f20122e, interfaceC11588c);
                        c121281.f20121d = obj;
                        return c121281;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8839a c8839a, InterfaceC11588c interfaceC11588c) {
                        return ((C121281) create(c8839a, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8839a c8839a = (C8839a) this.f20121d;
                        AbstractC11725a.m25952f();
                        if (this.f20120c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20122e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding = viewFragmentBoardBinding.f20578c;
                        RadioButton rbBackgroundLine = viewIncludeBackgroundColorBinding.f20642g;
                        AbstractC9979u.m20293f(rbBackgroundLine, "rbBackgroundLine");
                        rbBackgroundLine.setVisibility(c8839a.m16945c() ? 0 : 8);
                        RadioButton rbBackgroundInterweave = viewIncludeBackgroundColorBinding.f20641f;
                        AbstractC9979u.m20293f(rbBackgroundInterweave, "rbBackgroundInterweave");
                        rbBackgroundInterweave.setVisibility(c8839a.m16945c() ? 0 : 8);
                        RadioGroup rgBackgroundColor = viewIncludeBackgroundColorBinding.f20644i;
                        AbstractC9979u.m20293f(rgBackgroundColor, "rgBackgroundColor");
                        AbstractC11571a.m25472a(rgBackgroundColor, c8839a.m16946d().m16951e());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20119d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass6(this.f20119d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20118c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16878I = this.f20119d.m16794w0().m16878I();
                        C121281 c121281 = new C121281(this.f20119d, null);
                        this.f20118c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16878I, c121281, this) == objM25952f) {
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
                    return ((AnonymousClass6) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7", m26211f = "BoardFragment.kt", m26212l = {584}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7, reason: invalid class name */
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20123c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20124d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1, reason: invalid class name and collision with other inner class name */
                public static final class C121291 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20125c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20126d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20127e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121291(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20127e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121291 c121291 = new C121291(this.f20127e, interfaceC11588c);
                        c121291.f20126d = obj;
                        return c121291;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8851m c8851m, InterfaceC11588c interfaceC11588c) {
                        return ((C121291) create(c8851m, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8851m c8851m = (C8851m) this.f20126d;
                        AbstractC11725a.m25952f();
                        if (this.f20125c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20127e.f20047d;
                        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        View root = viewFragmentBoardBinding.f20583h.getRoot();
                        AbstractC9979u.m20293f(root, "getRoot(...)");
                        root.setVisibility(c8851m.m16982f().m17014d() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding3 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding3 = null;
                        }
                        View root2 = viewFragmentBoardBinding3.f20580e.getRoot();
                        AbstractC9979u.m20293f(root2, "getRoot(...)");
                        root2.setVisibility(c8851m.m16982f().m17012b() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding4 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding4 = null;
                        }
                        View root3 = viewFragmentBoardBinding4.f20581f.getRoot();
                        AbstractC9979u.m20293f(root3, "getRoot(...)");
                        root3.setVisibility(c8851m.m16982f().m17013c() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding5 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding5 = null;
                        }
                        View root4 = viewFragmentBoardBinding5.f20578c.getRoot();
                        AbstractC9979u.m20293f(root4, "getRoot(...)");
                        root4.setVisibility(c8851m.m16982f().m17011a() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding6 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding6 = null;
                        }
                        View root5 = viewFragmentBoardBinding6.f20579d.getRoot();
                        AbstractC9979u.m20293f(root5, "getRoot(...)");
                        root5.setVisibility(c8851m.m16979c().m16963a() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding7 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding7 = null;
                        }
                        View root6 = viewFragmentBoardBinding7.f20584i.getRoot();
                        AbstractC9979u.m20293f(root6, "getRoot(...)");
                        root6.setVisibility(c8851m.m16979c().m16964b() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding8 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding8 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding8 = null;
                        }
                        LinearLayoutCompat llDeleteDraft = viewFragmentBoardBinding8.f20584i.f20713f;
                        AbstractC9979u.m20293f(llDeleteDraft, "llDeleteDraft");
                        llDeleteDraft.setVisibility(c8851m.m16985i() ? 0 : 8);
                        ViewFragmentBoardBinding viewFragmentBoardBinding9 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding9 == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding9 = null;
                        }
                        SketchProgressView sketchProgressView = viewFragmentBoardBinding9.f20589n;
                        sketchProgressView.setTouchable(c8851m.m16987k());
                        sketchProgressView.setProgress(c8851m.m16983g());
                        sketchProgressView.setThumbTime(c8851m.m16984h());
                        ViewFragmentBoardBinding viewFragmentBoardBinding10 = this.f20127e.f20047d;
                        if (viewFragmentBoardBinding10 == null) {
                            AbstractC9979u.m20312y("mBinding");
                        } else {
                            viewFragmentBoardBinding2 = viewFragmentBoardBinding10;
                        }
                        SketchProgressView sketchProgressView2 = viewFragmentBoardBinding2.f20588m;
                        sketchProgressView2.setTouchable(c8851m.m16986j());
                        sketchProgressView2.setProgress(c8851m.m16980d());
                        sketchProgressView2.setThumbTime(c8851m.m16981e());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20124d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass7(this.f20124d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20123c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16890O = this.f20124d.m16794w0().m16890O();
                        C121291 c121291 = new C121291(this.f20124d, null);
                        this.f20123c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16890O, c121291, this) == objM25952f) {
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
                    return ((AnonymousClass7) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8", m26211f = "BoardFragment.kt", m26212l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8, reason: invalid class name */
            public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20128c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20129d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1, reason: invalid class name and collision with other inner class name */
                public static final class C121301 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20130c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20131d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20132e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121301(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20132e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121301 c121301 = new C121301(this.f20132e, interfaceC11588c);
                        c121301.f20131d = obj;
                        return c121301;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8849k c8849k, InterfaceC11588c interfaceC11588c) {
                        return ((C121301) create(c8849k, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8849k c8849k = (C8849k) this.f20131d;
                        AbstractC11725a.m25952f();
                        if (this.f20130c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20132e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        viewFragmentBoardBinding.f20586k.setImageResource(c8849k.m16975b().m16976a());
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20129d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass8(this.f20129d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20128c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16888N = this.f20129d.m16794w0().m16888N();
                        C121301 c121301 = new C121301(this.f20129d, null);
                        this.f20128c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16888N, c121301, this) == objM25952f) {
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
                    return ((AnonymousClass8) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9", m26211f = "BoardFragment.kt", m26212l = {619}, m26213m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9, reason: invalid class name */
            public static final class AnonymousClass9 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f20133c;

                /* renamed from: d */
                public final /* synthetic */ BoardFragment f20134d;

                @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
                /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1, reason: invalid class name and collision with other inner class name */
                public static final class C121311 extends SuspendLambda implements InterfaceC9544p {

                    /* renamed from: c */
                    public int f20135c;

                    /* renamed from: d */
                    public /* synthetic */ Object f20136d;

                    /* renamed from: e */
                    public final /* synthetic */ BoardFragment f20137e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C121311(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.f20137e = boardFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                        C121311 c121311 = new C121311(this.f20137e, interfaceC11588c);
                        c121311.f20136d = obj;
                        return c121311;
                    }

                    @Override // p181hd.InterfaceC9544p
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C8860v c8860v, InterfaceC11588c interfaceC11588c) {
                        return ((C121311) create(c8860v, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        C8860v c8860v = (C8860v) this.f20136d;
                        AbstractC11725a.m25952f();
                        if (this.f20135c != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20137e.f20047d;
                        if (viewFragmentBoardBinding == null) {
                            AbstractC9979u.m20312y("mBinding");
                            viewFragmentBoardBinding = null;
                        }
                        ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding.f20584i;
                        viewItemSketchRecordAudioBinding.f20711d.setImageResource(c8860v.m17032d().m17034a());
                        viewItemSketchRecordAudioBinding.f20710c.setSelected(c8860v.m17033e());
                        viewItemSketchRecordAudioBinding.f20718k.setText(c8860v.m17031c());
                        LinearLayoutCompat llCrop = viewItemSketchRecordAudioBinding.f20712e;
                        AbstractC9979u.m20293f(llCrop, "llCrop");
                        llCrop.setVisibility(c8860v.m17032d().m17035b() ? 0 : 8);
                        LinearLayoutCompat llOption = viewItemSketchRecordAudioBinding.f20714g;
                        AbstractC9979u.m20293f(llOption, "llOption");
                        llOption.setVisibility(c8860v.m17032d().m17036c() ? 0 : 8);
                        LinearLayoutCompat llRecord = viewItemSketchRecordAudioBinding.f20716i;
                        AbstractC9979u.m20293f(llRecord, "llRecord");
                        llRecord.setVisibility(c8860v.m17032d().m17037d() ? 0 : 8);
                        return C10786q.f26013a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass9(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f20134d = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    return new AnonymousClass9(this.f20134d, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.f20133c;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11612u interfaceC11612uM16904V = this.f20134d.m16794w0().m16904V();
                        C121311 c121311 = new C121311(this.f20134d, null);
                        this.f20133c = 1;
                        if (AbstractC11596e.m25559i(interfaceC11612uM16904V, c121311, this) == objM25952f) {
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
                    return ((AnonymousClass9) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BoardFragment boardFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f20092e = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20092e, interfaceC11588c);
                anonymousClass1.f20091d = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f20091d;
                AbstractC11725a.m25952f();
                if (this.f20090c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C121221(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass2(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass3(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass4(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass5(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass6(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass7(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass8(this.f20092e, null), 3, null);
                AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass9(this.f20092e, null), 3, null);
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C88341(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return BoardFragment.this.new C88341(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f20088c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LifecycleOwner viewLifecycleOwner = BoardFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BoardFragment.this, null);
                this.f20088c = 1;
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
            return ((C88341) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoardFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: kb.z
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BoardFragment.m16764v0(this.f23229a, (Boolean) obj);
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f20051h = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: A0 */
    public static final /* synthetic */ Object m16663A0(InterfaceC9540l interfaceC9540l, String str, InterfaceC11588c interfaceC11588c) {
        interfaceC9540l.invoke(str);
        return C10786q.f26013a;
    }

    /* renamed from: A1 */
    public static final C10786q m16664A1(BoardFragment boardFragment) {
        boardFragment.m16794w0().m16870C();
        return C10786q.f26013a;
    }

    /* renamed from: B1 */
    public static final C10786q m16666B1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m16826E(boardFragment.m16794w0(), Float.valueOf(f10), null, 2, null);
        return C10786q.f26013a;
    }

    /* renamed from: C1 */
    public static final C10786q m16668C1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m16823B(boardFragment.m16794w0(), Float.valueOf(f10), null, 2, null);
        return C10786q.f26013a;
    }

    /* renamed from: E0 */
    public static final void m16671E0(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m16794w0().m16899S0(i10);
    }

    /* renamed from: F1 */
    public static final C10786q m16673F1(BoardFragment boardFragment, IBoardControl iBoardControl, boolean z10, long j10) {
        AbstractC9979u.m20294g(iBoardControl, "iBoardControl");
        LogUtils.m3886d("页面BoardFragment，画板数据加载成功，是否缓存" + z10 + "，加载耗时为" + j10);
        boardFragment.m16794w0().m16919f0(iBoardControl, z10, j10);
        boardFragment.m16774C0();
        return C10786q.f26013a;
    }

    /* renamed from: G0 */
    public static final void m16675G0(BoardFragment boardFragment) {
        BoardViewModel boardViewModelM16794w0 = boardFragment.m16794w0();
        ViewFragmentBoardBinding viewFragmentBoardBinding = boardFragment.f20047d;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        float width = viewFragmentBoardBinding.f20590o.getWidth();
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = boardFragment.f20047d;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        boardViewModelM16794w0.m16874F0(width, viewFragmentBoardBinding2.f20590o.getHeight());
    }

    /* renamed from: G1 */
    public static final C10786q m16676G1(BoardFragment boardFragment, Throwable it) {
        InterfaceC9529a interfaceC9529aM19944i;
        AbstractC9979u.m20294g(it, "it");
        LogUtils.m3886d("页面BoardFragment，画板数据加载失败，message: " + it.getMessage());
        boardFragment.m16774C0();
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J != null && (interfaceC9529aM19944i = c9831aM16880J.m19944i()) != null) {
            interfaceC9529aM19944i.invoke();
        }
        return C10786q.f26013a;
    }

    /* renamed from: H0 */
    private final void m16678H0() {
        m16791f1();
        m16792s1();
        m16779I0();
        m16790V0();
        m16775D0();
        m16782K0();
        m16795w1();
    }

    /* renamed from: H1 */
    public static final BoardViewModel m16679H1() {
        return new BoardViewModel();
    }

    /* renamed from: J0 */
    public static final void m16682J0(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m16794w0().m16905V0(i10);
    }

    /* renamed from: L0 */
    public static final void m16685L0(BoardFragment boardFragment, View view) {
        InterfaceC9540l interfaceC9540lM19937b;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9540lM19937b = c9831aM16880J.m19937b()) == null) {
            return;
        }
        AbstractC9979u.m20291d(view);
        interfaceC9540lM19937b.invoke(view);
    }

    /* renamed from: M0 */
    public static final void m16687M0(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16909Y();
    }

    /* renamed from: N0 */
    public static final void m16689N0(final BoardFragment boardFragment, View view) {
        boardFragment.f20050g = new InterfaceC9529a() { // from class: kb.p0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardFragment.m16691O0(this.f23188c);
            }
        };
        boardFragment.f20051h.launch("android.permission.RECORD_AUDIO");
    }

    /* renamed from: O0 */
    public static final C10786q m16691O0(BoardFragment boardFragment) {
        boardFragment.m16794w0().m16897R0();
        return C10786q.f26013a;
    }

    /* renamed from: P0 */
    public static final void m16693P0(BoardFragment boardFragment, View view) {
        BoardViewModel.m16829Z0(boardFragment.m16794w0(), false, 1, null);
    }

    /* renamed from: P1 */
    public static final C10786q m16694P1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return C10786q.f26013a;
        }
        final File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        m16761u0(boardFragment, null, fileUri2FileNoCacheCopy.getAbsolutePath(), null, true, new InterfaceC9540l() { // from class: kb.u0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16697Q1(fileUri2FileNoCacheCopy, (String) obj);
            }
        }, 5, null);
        return C10786q.f26013a;
    }

    /* renamed from: Q0 */
    public static final void m16696Q0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC9540l interfaceC9540lM19940e;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9540lM19940e = c9831aM16880J.m19940e()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f20712e.setEnabled(false);
        BoardViewModel.m16828X(boardFragment.m16794w0(), false, false, new BoardFragment$initExtraClickListener$3$3$1$1(interfaceC9540lM19940e, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$3$1$2(interfaceC9540lM19940e, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* renamed from: Q1 */
    public static final C10786q m16697Q1(File file, String str) {
        FileUtils.delete(file);
        return C10786q.f26013a;
    }

    /* renamed from: R0 */
    public static final void m16699R0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC9540l interfaceC9540lM19945j;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9540lM19945j = c9831aM16880J.m19945j()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f20715h.setEnabled(false);
        BoardViewModel.m16828X(boardFragment.m16794w0(), false, false, new BoardFragment$initExtraClickListener$3$4$1$1(interfaceC9540lM19945j, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$4$1$2(interfaceC9540lM19945j, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* renamed from: S0 */
    public static final void m16701S0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC9544p interfaceC9544pM19939d;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9544pM19939d = c9831aM16880J.m19939d()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f20717j.setEnabled(false);
        BoardViewModel.m16828X(boardFragment.m16794w0(), false, false, new BoardFragment$initExtraClickListener$3$5$1$1(interfaceC9544pM19939d, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$5$1$2(interfaceC9544pM19939d, viewItemSketchRecordAudioBinding, null), 3, null);
    }

    /* renamed from: S1 */
    public static final C10786q m16702S1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return C10786q.f26013a;
        }
        final File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        m16761u0(boardFragment, null, fileUri2FileNoCacheCopy.getAbsolutePath(), null, true, new InterfaceC9540l() { // from class: kb.s0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16705T1(fileUri2FileNoCacheCopy, (String) obj);
            }
        }, 5, null);
        return C10786q.f26013a;
    }

    /* renamed from: T0 */
    public static final void m16704T0(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16875G();
    }

    /* renamed from: T1 */
    public static final C10786q m16705T1(File file, String str) {
        FileUtils.delete(file);
        return C10786q.f26013a;
    }

    /* renamed from: U0 */
    public static final void m16707U0(BoardFragment boardFragment, ViewItemSketchRecordBinding viewItemSketchRecordBinding, View view) {
        InterfaceC9544p interfaceC9544pM19939d;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9544pM19939d = c9831aM16880J.m19939d()) == null) {
            return;
        }
        viewItemSketchRecordBinding.f20723c.setEnabled(false);
        BoardViewModel.m16828X(boardFragment.m16794w0(), false, false, new BoardFragment$initExtraClickListener$4$1$1$1(interfaceC9544pM19939d, viewItemSketchRecordBinding, null), new BoardFragment$initExtraClickListener$4$1$1$2(interfaceC9544pM19939d, viewItemSketchRecordBinding, null), 3, null);
    }

    /* renamed from: W0 */
    public static final void m16710W0(final BoardFragment boardFragment, View view) {
        InterfaceC9540l interfaceC9540lM19941f;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9540lM19941f = c9831aM16880J.m19941f()) == null) {
            boardFragment.m16788R1();
        } else {
            interfaceC9540lM19941f.invoke(new InterfaceC9529a() { // from class: kb.o0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return BoardFragment.m16712X0(this.f23185c);
                }
            });
        }
    }

    /* renamed from: X0 */
    public static final C10786q m16712X0(BoardFragment boardFragment) {
        boardFragment.m16788R1();
        return C10786q.f26013a;
    }

    /* renamed from: Y0 */
    public static final void m16714Y0(final BoardFragment boardFragment, View view) {
        InterfaceC9540l interfaceC9540lM19938c;
        C9831a c9831aM16880J = boardFragment.m16794w0().m16880J();
        if (c9831aM16880J == null || (interfaceC9540lM19938c = c9831aM16880J.m19938c()) == null) {
            boardFragment.m16787O1();
        } else {
            interfaceC9540lM19938c.invoke(new InterfaceC9529a() { // from class: kb.l0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return BoardFragment.m16716Z0(this.f23173c);
                }
            });
        }
    }

    /* renamed from: Z0 */
    public static final C10786q m16716Z0(BoardFragment boardFragment) {
        boardFragment.m16787O1();
        return C10786q.f26013a;
    }

    /* renamed from: a1 */
    public static final void m16718a1(final BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        AbstractC9899w1.m19961j(contextRequireContext, null, null, null, new InterfaceC9540l() { // from class: kb.m0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16720b1(this.f23177c, (String) obj);
            }
        }, 7, null);
    }

    /* renamed from: b1 */
    public static final C10786q m16720b1(BoardFragment boardFragment, String it) {
        AbstractC9979u.m20294g(it, "it");
        boardFragment.m16794w0().m16935z(it);
        return C10786q.f26013a;
    }

    /* renamed from: c1 */
    public static final void m16722c1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16908X0(AbstractC8853o.c.f20279e);
    }

    /* renamed from: d1 */
    public static final void m16724d1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16908X0(AbstractC8853o.b.f20278e);
    }

    /* renamed from: e1 */
    public static final void m16726e1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16908X0(AbstractC8853o.d.f20280e);
    }

    /* renamed from: g1 */
    public static final void m16729g1(BoardFragment boardFragment, View view) {
        BoardViewModel.m16841g1(boardFragment.m16794w0(), false, 1, null);
    }

    /* renamed from: h1 */
    public static final void m16731h1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16923i1(true);
    }

    /* renamed from: i1 */
    public static final void m16733i1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16923i1(false);
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C88341(null), 3, null);
    }

    private final void initView() throws FileNotFoundException {
        m16778F0();
        m16678H0();
        initObserver();
        m16777E1();
    }

    /* renamed from: j1 */
    public static final void m16735j1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16914b1(AbstractC8855q.c.f20293e);
        boardFragment.m16794w0().m16895Q0();
    }

    /* renamed from: k1 */
    public static final void m16737k1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16914b1(AbstractC8855q.a.f20291e);
        boardFragment.m16794w0().m16891O0();
    }

    /* renamed from: l1 */
    public static final void m16739l1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16893P0();
    }

    /* renamed from: m1 */
    public static final void m16741m1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16889N0();
    }

    /* renamed from: n1 */
    public static final void m16743n1(final BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        AbstractC9899w1.m19957f(contextRequireContext, new InterfaceC9529a() { // from class: kb.n0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardFragment.m16746o1(this.f23181c);
            }
        });
    }

    /* renamed from: o1 */
    public static final C10786q m16746o1(BoardFragment boardFragment) {
        boardFragment.m16794w0().m16873F();
        return C10786q.f26013a;
    }

    /* renamed from: p1 */
    public static final void m16749p1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16887M0(false);
    }

    /* renamed from: q1 */
    public static final void m16752q1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16887M0(true);
    }

    /* renamed from: r1 */
    public static final void m16755r1(BoardFragment boardFragment, View view) {
        boardFragment.m16794w0().m16914b1(AbstractC8855q.d.f20294e);
        boardFragment.m16794w0().m16911Z();
    }

    /* renamed from: t1 */
    public static final void m16759t1(BoardFragment boardFragment, View view) {
        int id2 = view.getId();
        if (id2 == R$id.rb_pen_custom) {
            boardFragment.m16794w0().m16918e1(AbstractC8859u.b.f20325f);
            return;
        }
        if (id2 == R$id.rb_pen_line) {
            boardFragment.m16794w0().m16918e1(AbstractC8859u.e.f20328f);
            return;
        }
        if (id2 == R$id.rb_pen_dotted_line) {
            boardFragment.m16794w0().m16918e1(AbstractC8859u.c.f20326f);
        } else if (id2 == R$id.rb_pen_cursor) {
            boardFragment.m16794w0().m16918e1(AbstractC8859u.a.f20324f);
        } else if (id2 == R$id.rb_pen_highlighter) {
            boardFragment.m16794w0().m16918e1(AbstractC8859u.d.f20327f);
        }
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m16761u0(BoardFragment boardFragment, Bitmap bitmap, String str, String str2, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
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
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            interfaceC9540l = null;
        }
        boardFragment.m16793t0(bitmap, str, str2, z10, interfaceC9540l);
    }

    /* renamed from: u1 */
    public static final void m16762u1(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m16794w0().m16916d1(i10);
    }

    /* renamed from: v0 */
    public static final void m16764v0(BoardFragment boardFragment, Boolean it) {
        InterfaceC9529a interfaceC9529a;
        AbstractC9979u.m20294g(it, "it");
        if (it.booleanValue() && (interfaceC9529a = boardFragment.f20050g) != null) {
            interfaceC9529a.invoke();
        }
        boardFragment.f20050g = null;
    }

    /* renamed from: v1 */
    public static final void m16765v1(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m16794w0().m16915c1(i10);
    }

    /* renamed from: x1 */
    public static final C10786q m16768x1(BoardFragment boardFragment) {
        boardFragment.m16794w0().m16870C();
        return C10786q.f26013a;
    }

    /* renamed from: y1 */
    public static final C10786q m16770y1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m16826E(boardFragment.m16794w0(), null, Float.valueOf(f10), 1, null);
        return C10786q.f26013a;
    }

    /* renamed from: z1 */
    public static final C10786q m16772z1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m16823B(boardFragment.m16794w0(), null, Float.valueOf(f10), 1, null);
        return C10786q.f26013a;
    }

    /* renamed from: B0 */
    public final C9905y1 m16773B0() {
        return new C9905y1(((C8854p) m16794w0().m16896R().getValue()).m17001c(), ((C8851m) m16794w0().m16890O().getValue()).m16982f(), ((C8849k) m16794w0().m16888N().getValue()).m16975b());
    }

    /* renamed from: C0 */
    public final void m16774C0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f20587l.setVisibility(8);
    }

    /* renamed from: D0 */
    public final void m16775D0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgBackgroundColor = viewFragmentBoardBinding.f20578c.f20644i;
        AbstractC9979u.m20293f(rgBackgroundColor, "rgBackgroundColor");
        final int i10 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgBackgroundColor)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: kb.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m16671E0(this.f23133c, i10, view);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: D1 */
    public final boolean m16776D1() {
        return m16794w0().m16876G0();
    }

    /* renamed from: E1 */
    public final void m16777E1() throws FileNotFoundException {
        File externalCacheDir;
        String absolutePath;
        C9831a c9831aM16880J = m16794w0().m16880J();
        if (c9831aM16880J == null || c9831aM16880J.m19936a()) {
            m16786N1();
        }
        String strM16796x0 = m16796x0();
        if (strM16796x0.length() == 0) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                throw new FileNotFoundException("unknown board path");
            }
            strM16796x0 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        LogUtils.m3886d("页面BoardFragment，开始加载画板数据，画板路径" + strM16796x0);
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBoardBinding.f20590o;
        AbstractC9979u.m20291d(strM16796x0);
        sketchRecorderView.m13900b(strM16796x0, new InterfaceC9545q() { // from class: kb.b0
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BoardFragment.m16673F1(this.f23135c, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new InterfaceC9540l() { // from class: kb.c0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16676G1(this.f23143c, (Throwable) obj);
            }
        });
    }

    /* renamed from: F0 */
    public final void m16778F0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f20590o.post(new Runnable() { // from class: kb.k0
            @Override // java.lang.Runnable
            public final void run() {
                BoardFragment.m16675G0(this.f23169c);
            }
        });
        m16794w0().m16885L0(new C8831b());
        m16794w0().m16883K0(new C8832c());
    }

    /* renamed from: I0 */
    public final void m16779I0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentBoardBinding.f20580e.f20652f;
        AbstractC9979u.m20293f(rgEraserSize, "rgEraserSize");
        final int i10 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgEraserSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: kb.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m16682J0(this.f23129c, i10, view);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: I1 */
    public final void m16780I1() {
        m16794w0().m16881J0();
    }

    /* renamed from: J1 */
    public final void m16781J1(C9831a boardCallbackConfig) {
        AbstractC9979u.m20294g(boardCallbackConfig, "boardCallbackConfig");
        m16794w0().m16922i0(boardCallbackConfig);
    }

    /* renamed from: K0 */
    public final void m16782K0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f20585j.setOnClickListener(new View.OnClickListener() { // from class: kb.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16685L0(this.f23158c, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f20047d;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        viewFragmentBoardBinding3.f20586k.setOnClickListener(new View.OnClickListener() { // from class: kb.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16687M0(this.f23161c, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f20047d;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        final ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding4.f20584i;
        AppCompatImageView ivRecord = viewItemSketchRecordAudioBinding.f20711d;
        AbstractC9979u.m20293f(ivRecord, "ivRecord");
        AbstractC11571a.m25475d(ivRecord, 0L, new View.OnClickListener() { // from class: kb.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16689N0(this.f23165c, view);
            }
        }, 1, null);
        viewItemSketchRecordAudioBinding.f20710c.setOnClickListener(new View.OnClickListener() { // from class: kb.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16693P0(this.f23168c, view);
            }
        });
        viewItemSketchRecordAudioBinding.f20712e.setOnClickListener(new View.OnClickListener() { // from class: kb.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16696Q0(this.f23171c, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f20715h.setOnClickListener(new View.OnClickListener() { // from class: kb.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16699R0(this.f23179c, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f20717j.setOnClickListener(new View.OnClickListener() { // from class: kb.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16701S0(this.f23183c, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f20713f.setOnClickListener(new View.OnClickListener() { // from class: kb.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16704T0(this.f23187c, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f20047d;
        if (viewFragmentBoardBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding5;
        }
        final ViewItemSketchRecordBinding viewItemSketchRecordBinding = viewFragmentBoardBinding2.f20579d;
        viewItemSketchRecordBinding.f20723c.setOnClickListener(new View.OnClickListener() { // from class: kb.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16707U0(this.f23190c, viewItemSketchRecordBinding, view);
            }
        });
    }

    /* renamed from: K1 */
    public final void m16783K1(C9836b1 c9836b1) {
        m16794w0().m16868A0(c9836b1);
    }

    /* renamed from: L1 */
    public final void m16784L1(C8842d boardViewConfig) {
        AbstractC9979u.m20294g(boardViewConfig, "boardViewConfig");
        m16794w0().m16921h1(boardViewConfig);
    }

    /* renamed from: M1 */
    public final void m16785M1(C9905y1 value) {
        AbstractC9979u.m20294g(value, "value");
        m16794w0().m16914b1(value.m19978b());
        m16794w0().m16913a1(value.m19979c());
        m16794w0().m16907W0(AbstractC9979u.m20289b(value.m19977a(), AbstractC8850l.b.f20258b));
    }

    /* renamed from: N1 */
    public final void m16786N1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f20587l.setVisibility(0);
    }

    /* renamed from: O1 */
    public final void m16787O1() {
        if (m16794w0().m16876G0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C11582l.m25493v(this.f20049f, null, true, new InterfaceC9540l() { // from class: kb.q0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return BoardFragment.m16694P1(this.f23192c, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: R1 */
    public final void m16788R1() {
        if (m16794w0().m16876G0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            this.f20049f.m25501s(true, new InterfaceC9540l() { // from class: kb.r0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return BoardFragment.m16702S1(this.f23195c, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: U1 */
    public final void m16789U1(boolean z10) {
        float f10;
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f20586k.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C8833d(z10));
        float f11 = 0.0f;
        if (z10) {
            ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f20047d;
            if (viewFragmentBoardBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBoardBinding3 = null;
            }
            f10 = -viewFragmentBoardBinding3.f20582g.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f20047d;
            if (viewFragmentBoardBinding4 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBoardBinding4 = null;
            }
            f11 = -viewFragmentBoardBinding4.f20582g.getRoot().getWidth();
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f20047d;
        if (viewFragmentBoardBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentBoardBinding5.f20582g.getRoot(), "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.f20047d;
        if (viewFragmentBoardBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding6.f20591p, "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.f20047d;
        if (viewFragmentBoardBinding7 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding2.f20586k, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: V0 */
    public final void m16790V0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f20581f;
        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f20658d;
        AbstractC9979u.m20293f(ivImageGallery, "ivImageGallery");
        AbstractC11571a.m25475d(ivImageGallery, 0L, new View.OnClickListener() { // from class: kb.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16710W0(this.f23194c, view);
            }
        }, 1, null);
        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f20657c;
        AbstractC9979u.m20293f(ivImageCamera, "ivImageCamera");
        AbstractC11571a.m25475d(ivImageCamera, 0L, new View.OnClickListener() { // from class: kb.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16714Y0(this.f23197c, view);
            }
        }, 1, null);
        AppCompatImageView ivText = viewIncludeImageAddBinding.f20661g;
        AbstractC9979u.m20293f(ivText, "ivText");
        AbstractC11571a.m25475d(ivText, 0L, new View.OnClickListener() { // from class: kb.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16718a1(this.f23200c, view);
            }
        }, 1, null);
        viewIncludeImageAddBinding.f20660f.setOnClickListener(new View.OnClickListener() { // from class: kb.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16722c1(this.f23202c, view);
            }
        });
        viewIncludeImageAddBinding.f20659e.setOnClickListener(new View.OnClickListener() { // from class: kb.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16724d1(this.f23204c, view);
            }
        });
        viewIncludeImageAddBinding.f20662h.setOnClickListener(new View.OnClickListener() { // from class: kb.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16726e1(this.f23206c, view);
            }
        });
    }

    /* renamed from: f1 */
    public final void m16791f1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f20582g;
        viewIncludeMenuBinding.f20677m.setOnClickListener(new View.OnClickListener() { // from class: kb.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16749p1(this.f23201c, view);
            }
        });
        viewIncludeMenuBinding.f20673i.setOnClickListener(new View.OnClickListener() { // from class: kb.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16752q1(this.f23207c, view);
            }
        });
        viewIncludeMenuBinding.f20675k.setOnClickListener(new View.OnClickListener() { // from class: kb.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16755r1(this.f23210c, view);
            }
        });
        viewIncludeMenuBinding.f20676l.setOnClickListener(new View.OnClickListener() { // from class: kb.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16729g1(this.f23225c, view);
            }
        });
        viewIncludeMenuBinding.f20669e.setOnClickListener(new View.OnClickListener() { // from class: kb.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16731h1(this.f23230c, view);
            }
        });
        viewIncludeMenuBinding.f20674j.setOnClickListener(new View.OnClickListener() { // from class: kb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16733i1(this.f23142c, view);
            }
        });
        viewIncludeMenuBinding.f20672h.setOnClickListener(new View.OnClickListener() { // from class: kb.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16735j1(this.f23145c, view);
            }
        });
        viewIncludeMenuBinding.f20670f.setOnClickListener(new View.OnClickListener() { // from class: kb.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16737k1(this.f23149c, view);
            }
        });
        viewIncludeMenuBinding.f20671g.setOnClickListener(new View.OnClickListener() { // from class: kb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16739l1(this.f23152c, view);
            }
        });
        viewIncludeMenuBinding.f20667c.setOnClickListener(new View.OnClickListener() { // from class: kb.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16741m1(this.f23155c, view);
            }
        });
        viewIncludeMenuBinding.f20668d.setOnClickListener(new View.OnClickListener() { // from class: kb.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m16743n1(this.f23205c, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewFragmentBoardBinding viewFragmentBoardBindingM17336a = ViewFragmentBoardBinding.m17336a(inflater);
        AbstractC9979u.m20291d(viewFragmentBoardBindingM17336a);
        this.f20047d = viewFragmentBoardBindingM17336a;
        View root = viewFragmentBoardBindingM17336a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m16774C0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws FileNotFoundException {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        initView();
    }

    /* renamed from: s1 */
    public final void m16792s1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgPenType = viewFragmentBoardBinding.f20583h.f20692m;
        AbstractC9979u.m20293f(rgPenType, "rgPenType");
        Iterator it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: kb.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m16759t1(this.f23176c, view);
                }
            });
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f20047d;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentBoardBinding3.f20583h.f20691l;
        AbstractC9979u.m20293f(rgPenSize, "rgPenSize");
        final int i10 = 0;
        final int i11 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgPenSize)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: kb.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m16762u1(this.f23208c, i11, view);
                }
            });
            i11 = i12;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f20047d;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding4;
        }
        RadioGroup rgPenColor = viewFragmentBoardBinding2.f20583h.f20690k;
        AbstractC9979u.m20293f(rgPenColor, "rgPenColor");
        for (Object obj2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((View) obj2).setOnClickListener(new View.OnClickListener() { // from class: kb.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m16765v1(this.f23162c, i10, view);
                }
            });
            i10 = i13;
        }
    }

    /* renamed from: t0 */
    public final void m16793t0(Bitmap bitmap, String str, String filename, boolean z10, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(filename, "filename");
        BoardViewModel.m16865y(m16794w0(), bitmap, str, null, z10, filename, interfaceC9540l, 4, null);
    }

    /* renamed from: w0 */
    public final BoardViewModel m16794w0() {
        return (BoardViewModel) this.f20048e.getValue();
    }

    /* renamed from: w1 */
    public final void m16795w1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f20047d;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchProgressView sketchProgressVertical = viewFragmentBoardBinding.f20589n;
        AbstractC9979u.m20293f(sketchProgressVertical, "sketchProgressVertical");
        AbstractC11571a.m25473b(sketchProgressVertical, new InterfaceC9529a() { // from class: kb.d0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardFragment.m16768x1(this.f23146c);
            }
        }, new InterfaceC9540l() { // from class: kb.e0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16770y1(this.f23150c, ((Float) obj).floatValue());
            }
        }, new InterfaceC9540l() { // from class: kb.f0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16772z1(this.f23153c, ((Float) obj).floatValue());
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f20047d;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        SketchProgressView sketchProgressHorizontal = viewFragmentBoardBinding2.f20588m;
        AbstractC9979u.m20293f(sketchProgressHorizontal, "sketchProgressHorizontal");
        AbstractC11571a.m25473b(sketchProgressHorizontal, new InterfaceC9529a() { // from class: kb.g0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardFragment.m16664A1(this.f23156c);
            }
        }, new InterfaceC9540l() { // from class: kb.h0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16666B1(this.f23159c, ((Float) obj).floatValue());
            }
        }, new InterfaceC9540l() { // from class: kb.j0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardFragment.m16668C1(this.f23166c, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: x0 */
    public final String m16796x0() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    /* renamed from: y0 */
    public final List m16797y0() {
        return m16794w0().m16900T();
    }

    /* renamed from: z0 */
    public final void m16798z0(boolean z10, boolean z11, InterfaceC9540l interfaceC9540l, InterfaceC9540l callback) {
        AbstractC9979u.m20294g(callback, "callback");
        m16794w0().m16906W(z10, z11, new BoardFragment$getSavePath$2(interfaceC9540l, callback, null), new BoardFragment$getSavePath$1(callback));
    }
}
