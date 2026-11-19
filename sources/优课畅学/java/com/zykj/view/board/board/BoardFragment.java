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
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.AbstractC5364g0;
import com.blankj.utilcode.util.AbstractC5371k;
import com.blankj.utilcode.util.AbstractC5380q;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.listener.ImageCropView;
import com.zykj.blackboard.listener.TextEditView;
import com.zykj.view.R$id;
import com.zykj.view.board.board.AbstractC8219o;
import com.zykj.view.board.board.AbstractC8221q;
import com.zykj.view.board.board.AbstractC8225u;
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
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0027a;
import p007a6.C0038l;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p210p5.AbstractC9742w1;
import p210p5.C9674a;
import p210p5.C9679b1;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public final class BoardFragment extends Fragment {

    /* renamed from: f */
    public static final C8196a f14833f = new C8196a(null);

    /* renamed from: a */
    public ViewFragmentBoardBinding f14834a;

    /* renamed from: b */
    public final InterfaceC8724d f14835b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: p5.y
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return BoardFragment.m12661u1();
        }
    });

    /* renamed from: c */
    public final C0038l f14836c = new C0038l(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: d */
    public InterfaceC10559a f14837d;

    /* renamed from: e */
    public final ActivityResultLauncher f14838e;

    /* renamed from: com.zykj.view.board.board.BoardFragment$a */
    public static final class C8196a {
        public /* synthetic */ C8196a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final BoardFragment m12691a(String path, C8208d boardViewConfig, C9679b1 boardSketchConfig, C9674a boardCallbackConfig) {
            AbstractC9133u.m16133g(path, "path");
            AbstractC9133u.m16133g(boardViewConfig, "boardViewConfig");
            AbstractC9133u.m16133g(boardSketchConfig, "boardSketchConfig");
            AbstractC9133u.m16133g(boardCallbackConfig, "boardCallbackConfig");
            BoardFragment boardFragment = new BoardFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            boardFragment.setArguments(bundle);
            boardFragment.m12688x1(boardViewConfig);
            boardFragment.m12687w1(boardSketchConfig);
            boardFragment.m12685v1(boardCallbackConfig);
            return boardFragment;
        }

        public C8196a() {
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$b */
    public static final class C8197b implements TextEditView {
        public C8197b() {
        }

        @Override // com.zykj.blackboard.listener.TextEditView
        public void showEditView(String initText, InterfaceC10570l afterTextChangedCallback, InterfaceC10570l doneCallback, InterfaceC10559a cancelCallback) {
            AbstractC9133u.m16133g(initText, "initText");
            AbstractC9133u.m16133g(afterTextChangedCallback, "afterTextChangedCallback");
            AbstractC9133u.m16133g(doneCallback, "doneCallback");
            AbstractC9133u.m16133g(cancelCallback, "cancelCallback");
            Context contextRequireContext = BoardFragment.this.requireContext();
            AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
            AbstractC9742w1.m18263i(contextRequireContext, initText, afterTextChangedCallback, cancelCallback, doneCallback);
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$c */
    public static final class C8198c implements ImageCropView {
        public C8198c() {
        }

        /* renamed from: b */
        public static final C8736p m12693b(InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
            String absolutePath;
            if (uri != null) {
                File fileM2472e = AbstractC5364g0.m2472e(uri);
                if (fileM2472e == null || (absolutePath = fileM2472e.getAbsolutePath()) == null) {
                    absolutePath = "";
                }
                interfaceC10570l.invoke(absolutePath);
            } else {
                interfaceC10559a.invoke();
            }
            return C8736p.f16368a;
        }

        @Override // com.zykj.blackboard.listener.ImageCropView
        public void showCropView(String imageLocalPath, final InterfaceC10570l doneCallback, final InterfaceC10559a cancelCallback) {
            AbstractC9133u.m16133g(imageLocalPath, "imageLocalPath");
            AbstractC9133u.m16133g(doneCallback, "doneCallback");
            AbstractC9133u.m16133g(cancelCallback, "cancelCallback");
            C0038l c0038l = BoardFragment.this.f14836c;
            Uri uriM2469b = AbstractC5364g0.m2469b(new File(imageLocalPath));
            AbstractC9133u.m16132f(uriM2469b, "file2Uri(...)");
            c0038l.m93r(uriM2469b, new InterfaceC10570l() { // from class: p5.a1
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BoardFragment.C8198c.m12693b(doneCallback, cancelCallback, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardFragment$d */
    public static final class C8199d implements Animator.AnimatorListener {

        /* renamed from: b */
        public final /* synthetic */ boolean f14842b;

        public C8199d(boolean z10) {
            this.f14842b = z10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewFragmentBoardBinding viewFragmentBoardBinding = BoardFragment.this.f14834a;
            if (viewFragmentBoardBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBoardBinding = null;
            }
            viewFragmentBoardBinding.f15375i.setEnabled(true);
            BoardFragment.this.m12678m0().m12791U0(this.f14842b);
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
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: p5.z
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BoardFragment.m12640l0(this.f19465a, (Boolean) obj);
            }
        });
        AbstractC9133u.m16132f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f14838e = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: A0 */
    public static final C8736p m12561A0(BoardFragment boardFragment) {
        boardFragment.m12678m0().m12781P0();
        return C8736p.f16368a;
    }

    /* renamed from: A1 */
    public static final C8736p m12562A1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return C8736p.f16368a;
        }
        final File fileM2473f = AbstractC5364g0.m2473f(uri);
        m12637k0(boardFragment, null, fileM2473f.getAbsolutePath(), null, true, new InterfaceC10570l() { // from class: p5.u0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12565B1(fileM2473f, (String) obj);
            }
        }, 5, null);
        return C8736p.f16368a;
    }

    /* renamed from: B0 */
    public static final void m12564B0(BoardFragment boardFragment, View view) {
        BoardViewModel.m12717X0(boardFragment.m12678m0(), false, 1, null);
    }

    /* renamed from: B1 */
    public static final C8736p m12565B1(File file, String str) {
        AbstractC5371k.m2522d(file);
        return C8736p.f16368a;
    }

    /* renamed from: C0 */
    public static final void m12567C0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC10570l interfaceC10570lM18243e;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10570lM18243e = c9674aM12768J.m18243e()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f15501c.setEnabled(false);
        BoardViewModel.m12716W(boardFragment.m12678m0(), false, false, new BoardFragment$initExtraClickListener$3$3$1$1(interfaceC10570lM18243e, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$3$1$2(interfaceC10570lM18243e, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* renamed from: D0 */
    public static final void m12569D0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC10570l interfaceC10570lM18248j;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10570lM18248j = c9674aM12768J.m18248j()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f15504f.setEnabled(false);
        BoardViewModel.m12716W(boardFragment.m12678m0(), false, false, new BoardFragment$initExtraClickListener$3$4$1$1(interfaceC10570lM18248j, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$4$1$2(interfaceC10570lM18248j, viewItemSketchRecordAudioBinding, null), 2, null);
    }

    /* renamed from: D1 */
    public static final C8736p m12570D1(BoardFragment boardFragment, Uri uri) {
        if (uri == null) {
            return C8736p.f16368a;
        }
        final File fileM2473f = AbstractC5364g0.m2473f(uri);
        m12637k0(boardFragment, null, fileM2473f.getAbsolutePath(), null, true, new InterfaceC10570l() { // from class: p5.s0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12573E1(fileM2473f, (String) obj);
            }
        }, 5, null);
        return C8736p.f16368a;
    }

    /* renamed from: E0 */
    public static final void m12572E0(BoardFragment boardFragment, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, View view) {
        InterfaceC10574p interfaceC10574pM18242d;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10574pM18242d = c9674aM12768J.m18242d()) == null) {
            return;
        }
        viewItemSketchRecordAudioBinding.f15506h.setEnabled(false);
        BoardViewModel.m12716W(boardFragment.m12678m0(), false, false, new BoardFragment$initExtraClickListener$3$5$1$1(interfaceC10574pM18242d, viewItemSketchRecordAudioBinding, null), new BoardFragment$initExtraClickListener$3$5$1$2(interfaceC10574pM18242d, viewItemSketchRecordAudioBinding, null), 3, null);
    }

    /* renamed from: E1 */
    public static final C8736p m12573E1(File file, String str) {
        AbstractC5371k.m2522d(file);
        return C8736p.f16368a;
    }

    /* renamed from: F0 */
    public static final void m12575F0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12763G();
    }

    /* renamed from: G0 */
    public static final void m12577G0(BoardFragment boardFragment, ViewItemSketchRecordBinding viewItemSketchRecordBinding, View view) {
        InterfaceC10574p interfaceC10574pM18242d;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10574pM18242d = c9674aM12768J.m18242d()) == null) {
            return;
        }
        viewItemSketchRecordBinding.f15512a.setEnabled(false);
        BoardViewModel.m12716W(boardFragment.m12678m0(), false, false, new BoardFragment$initExtraClickListener$4$1$1$1(interfaceC10574pM18242d, viewItemSketchRecordBinding, null), new BoardFragment$initExtraClickListener$4$1$1$2(interfaceC10574pM18242d, viewItemSketchRecordBinding, null), 3, null);
    }

    /* renamed from: I0 */
    public static final void m12580I0(final BoardFragment boardFragment, View view) {
        InterfaceC10570l interfaceC10570lM18244f;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10570lM18244f = c9674aM12768J.m18244f()) == null) {
            boardFragment.m12671C1();
        } else {
            interfaceC10570lM18244f.invoke(new InterfaceC10559a() { // from class: p5.o0
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BoardFragment.m12582J0(this.f19424a);
                }
            });
        }
    }

    /* renamed from: J0 */
    public static final C8736p m12582J0(BoardFragment boardFragment) {
        boardFragment.m12671C1();
        return C8736p.f16368a;
    }

    /* renamed from: K0 */
    public static final void m12584K0(final BoardFragment boardFragment, View view) {
        InterfaceC10570l interfaceC10570lM18241c;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10570lM18241c = c9674aM12768J.m18241c()) == null) {
            boardFragment.m12690z1();
        } else {
            interfaceC10570lM18241c.invoke(new InterfaceC10559a() { // from class: p5.l0
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BoardFragment.m12586L0(this.f19412a);
                }
            });
        }
    }

    /* renamed from: L0 */
    public static final C8736p m12586L0(BoardFragment boardFragment) {
        boardFragment.m12690z1();
        return C8736p.f16368a;
    }

    /* renamed from: M0 */
    public static final void m12588M0(final BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        AbstractC9742w1.m18264j(contextRequireContext, null, null, null, new InterfaceC10570l() { // from class: p5.m0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12590N0(this.f19416a, (String) obj);
            }
        }, 7, null);
    }

    /* renamed from: N0 */
    public static final C8736p m12590N0(BoardFragment boardFragment, String it) {
        AbstractC9133u.m16133g(it, "it");
        boardFragment.m12678m0().m12819z(it);
        return C8736p.f16368a;
    }

    /* renamed from: O0 */
    public static final void m12592O0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12793V0(AbstractC8219o.c.f15063e);
    }

    /* renamed from: P0 */
    public static final void m12594P0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12793V0(AbstractC8219o.b.f15062e);
    }

    /* renamed from: Q0 */
    public static final void m12596Q0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12793V0(AbstractC8219o.d.f15064e);
    }

    /* renamed from: S0 */
    public static final void m12599S0(BoardFragment boardFragment, View view) {
        BoardViewModel.m12725d1(boardFragment.m12678m0(), false, 1, null);
    }

    /* renamed from: T0 */
    public static final void m12601T0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12806f1(true);
    }

    /* renamed from: U0 */
    public static final void m12603U0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12806f1(false);
    }

    /* renamed from: V0 */
    public static final void m12605V0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12797Y0(AbstractC8221q.c.f15077e);
        boardFragment.m12678m0().m12779O0();
    }

    /* renamed from: W0 */
    public static final void m12607W0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12797Y0(AbstractC8221q.a.f15075e);
        boardFragment.m12678m0().m12775M0();
    }

    /* renamed from: X0 */
    public static final void m12609X0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12777N0();
    }

    /* renamed from: Y0 */
    public static final void m12611Y0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12773L0();
    }

    /* renamed from: Z0 */
    public static final void m12613Z0(final BoardFragment boardFragment, View view) {
        Context contextRequireContext = boardFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        AbstractC9742w1.m18260f(contextRequireContext, new InterfaceC10559a() { // from class: p5.n0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardFragment.m12615a1(this.f19420a);
            }
        });
    }

    /* renamed from: a1 */
    public static final C8736p m12615a1(BoardFragment boardFragment) {
        boardFragment.m12678m0().m12761F();
        return C8736p.f16368a;
    }

    /* renamed from: b1 */
    public static final void m12617b1(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12771K0(false);
    }

    /* renamed from: c1 */
    public static final void m12619c1(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12771K0(true);
    }

    /* renamed from: d1 */
    public static final void m12621d1(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12797Y0(AbstractC8221q.d.f15078e);
        boardFragment.m12678m0().m12796Y();
    }

    /* renamed from: e1 */
    private final void m12623e1() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BoardFragment$initObserver$1(this, null), 3, null);
    }

    /* renamed from: g1 */
    public static final void m12628g1(BoardFragment boardFragment, View view) {
        int id = view.getId();
        if (id == R$id.rb_pen_custom) {
            boardFragment.m12678m0().m12801b1(AbstractC8225u.b.f15109f);
            return;
        }
        if (id == R$id.rb_pen_line) {
            boardFragment.m12678m0().m12801b1(AbstractC8225u.e.f15112f);
            return;
        }
        if (id == R$id.rb_pen_dotted_line) {
            boardFragment.m12678m0().m12801b1(AbstractC8225u.c.f15110f);
        } else if (id == R$id.rb_pen_cursor) {
            boardFragment.m12678m0().m12801b1(AbstractC8225u.a.f15108f);
        } else if (id == R$id.rb_pen_highlighter) {
            boardFragment.m12678m0().m12801b1(AbstractC8225u.d.f15111f);
        }
    }

    /* renamed from: h1 */
    public static final void m12631h1(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m12678m0().m12800a1(i10);
    }

    /* renamed from: i1 */
    public static final void m12634i1(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m12678m0().m12799Z0(i10);
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m12637k0(BoardFragment boardFragment, Bitmap bitmap, String str, String str2, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
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
            interfaceC10570l = null;
        }
        boardFragment.m12676j0(bitmap, str, str2, z10, interfaceC10570l);
    }

    /* renamed from: k1 */
    public static final C8736p m12638k1(BoardFragment boardFragment) {
        boardFragment.m12678m0().m12757C();
        return C8736p.f16368a;
    }

    /* renamed from: l0 */
    public static final void m12640l0(BoardFragment boardFragment, Boolean it) {
        InterfaceC10559a interfaceC10559a;
        AbstractC9133u.m16133g(it, "it");
        if (it.booleanValue() && (interfaceC10559a = boardFragment.f14837d) != null) {
            interfaceC10559a.invoke();
        }
        boardFragment.f14837d = null;
    }

    /* renamed from: l1 */
    public static final C8736p m12641l1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m12714E(boardFragment.m12678m0(), null, Float.valueOf(f10), 1, null);
        return C8736p.f16368a;
    }

    /* renamed from: m1 */
    public static final C8736p m12643m1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m12711B(boardFragment.m12678m0(), null, Float.valueOf(f10), 1, null);
        return C8736p.f16368a;
    }

    /* renamed from: n1 */
    public static final C8736p m12645n1(BoardFragment boardFragment) {
        boardFragment.m12678m0().m12757C();
        return C8736p.f16368a;
    }

    /* renamed from: o1 */
    public static final C8736p m12647o1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m12714E(boardFragment.m12678m0(), Float.valueOf(f10), null, 2, null);
        return C8736p.f16368a;
    }

    /* renamed from: p1 */
    public static final C8736p m12649p1(BoardFragment boardFragment, float f10) {
        BoardViewModel.m12711B(boardFragment.m12678m0(), Float.valueOf(f10), null, 2, null);
        return C8736p.f16368a;
    }

    /* renamed from: q0 */
    public static final void m12651q0(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m12678m0().m12783Q0(i10);
    }

    /* renamed from: q1 */
    private final void m12652q1() throws FileNotFoundException {
        m12682r0();
        m12658t0();
        m12623e1();
        m12683r1();
    }

    /* renamed from: s0 */
    public static final void m12655s0(BoardFragment boardFragment) {
        BoardViewModel boardViewModelM12678m0 = boardFragment.m12678m0();
        ViewFragmentBoardBinding viewFragmentBoardBinding = boardFragment.f14834a;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        float width = viewFragmentBoardBinding.f15379m.getWidth();
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = boardFragment.f14834a;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        boardViewModelM12678m0.m12760E0(width, viewFragmentBoardBinding2.f15379m.getHeight());
    }

    /* renamed from: s1 */
    public static final C8736p m12656s1(BoardFragment boardFragment, IBoardControl iBoardControl, boolean z10, long j10) {
        AbstractC9133u.m16133g(iBoardControl, "iBoardControl");
        AbstractC5380q.m2623s("loadDir success, cache: " + z10 + ", duration: " + j10);
        boardFragment.m12678m0().m12804e0(iBoardControl, z10, j10);
        boardFragment.m12680o0();
        return C8736p.f16368a;
    }

    /* renamed from: t0 */
    private final void m12658t0() {
        m12674R0();
        m12675f1();
        m12684u0();
        m12673H0();
        m12681p0();
        m12686w0();
        m12677j1();
    }

    /* renamed from: t1 */
    public static final C8736p m12659t1(BoardFragment boardFragment, Throwable it) {
        InterfaceC10559a interfaceC10559aM18247i;
        AbstractC9133u.m16133g(it, "it");
        AbstractC5380q.m2623s("loadDir failed, message: " + it.getMessage());
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J != null && (interfaceC10559aM18247i = c9674aM12768J.m18247i()) != null) {
            interfaceC10559aM18247i.invoke();
        }
        boardFragment.m12680o0();
        return C8736p.f16368a;
    }

    /* renamed from: u1 */
    public static final BoardViewModel m12661u1() {
        return new BoardViewModel();
    }

    /* renamed from: v0 */
    public static final void m12663v0(BoardFragment boardFragment, int i10, View view) {
        boardFragment.m12678m0().m12789T0(i10);
    }

    /* renamed from: x0 */
    public static final void m12666x0(BoardFragment boardFragment, View view) {
        InterfaceC10570l interfaceC10570lM18240b;
        C9674a c9674aM12768J = boardFragment.m12678m0().m12768J();
        if (c9674aM12768J == null || (interfaceC10570lM18240b = c9674aM12768J.m18240b()) == null) {
            return;
        }
        AbstractC9133u.m16130d(view);
        interfaceC10570lM18240b.invoke(view);
    }

    /* renamed from: y0 */
    public static final void m12668y0(BoardFragment boardFragment, View view) {
        boardFragment.m12678m0().m12795X();
    }

    /* renamed from: z0 */
    public static final void m12670z0(final BoardFragment boardFragment, View view) {
        boardFragment.f14837d = new InterfaceC10559a() { // from class: p5.p0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardFragment.m12561A0(this.f19427a);
            }
        };
        boardFragment.f14838e.launch("android.permission.RECORD_AUDIO");
    }

    /* renamed from: C1 */
    public final void m12671C1() {
        if (m12678m0().m12762F0()) {
            ToastUtils.m2403s("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            this.f14836c.m94t(true, new InterfaceC10570l() { // from class: p5.r0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BoardFragment.m12570D1(this.f19434a, (Uri) obj);
                }
            });
        }
    }

    /* renamed from: F1 */
    public final void m12672F1(boolean z10) {
        float f10;
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f15375i.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new C8199d(z10));
        float f11 = 0.0f;
        if (z10) {
            ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f14834a;
            if (viewFragmentBoardBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBoardBinding3 = null;
            }
            f10 = -viewFragmentBoardBinding3.f15371e.getRoot().getWidth();
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f14834a;
            if (viewFragmentBoardBinding4 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBoardBinding4 = null;
            }
            f11 = -viewFragmentBoardBinding4.f15371e.getRoot().getWidth();
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f14834a;
        if (viewFragmentBoardBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding5 = null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentBoardBinding5.f15371e.getRoot(), "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.f14834a;
        if (viewFragmentBoardBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding6 = null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding6.f15380n, "translationX", f10, f11));
        ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.f14834a;
        if (viewFragmentBoardBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding7;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentBoardBinding2.f15375i, "translationX", f10, f11));
        animatorSet.start();
    }

    /* renamed from: H0 */
    public final void m12673H0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f15370d;
        AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f15447b;
        AbstractC9133u.m16132f(ivImageGallery, "ivImageGallery");
        AbstractC0027a.m65d(ivImageGallery, 0L, new View.OnClickListener() { // from class: p5.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12580I0(this.f19433a, view);
            }
        }, 1, null);
        AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f15446a;
        AbstractC9133u.m16132f(ivImageCamera, "ivImageCamera");
        AbstractC0027a.m65d(ivImageCamera, 0L, new View.OnClickListener() { // from class: p5.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12584K0(this.f19436a, view);
            }
        }, 1, null);
        AppCompatImageView ivText = viewIncludeImageAddBinding.f15450e;
        AbstractC9133u.m16132f(ivText, "ivText");
        AbstractC0027a.m65d(ivText, 0L, new View.OnClickListener() { // from class: p5.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12588M0(this.f19439a, view);
            }
        }, 1, null);
        viewIncludeImageAddBinding.f15449d.setOnClickListener(new View.OnClickListener() { // from class: p5.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12592O0(this.f19441a, view);
            }
        });
        viewIncludeImageAddBinding.f15448c.setOnClickListener(new View.OnClickListener() { // from class: p5.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12594P0(this.f19443a, view);
            }
        });
        viewIncludeImageAddBinding.f15451f.setOnClickListener(new View.OnClickListener() { // from class: p5.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12596Q0(this.f19445a, view);
            }
        });
    }

    /* renamed from: R0 */
    public final void m12674R0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f15371e;
        viewIncludeMenuBinding.f15466k.setOnClickListener(new View.OnClickListener() { // from class: p5.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12617b1(this.f19440a, view);
            }
        });
        viewIncludeMenuBinding.f15462g.setOnClickListener(new View.OnClickListener() { // from class: p5.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12619c1(this.f19446a, view);
            }
        });
        viewIncludeMenuBinding.f15464i.setOnClickListener(new View.OnClickListener() { // from class: p5.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12621d1(this.f19449a, view);
            }
        });
        viewIncludeMenuBinding.f15465j.setOnClickListener(new View.OnClickListener() { // from class: p5.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12599S0(this.f19464a, view);
            }
        });
        viewIncludeMenuBinding.f15458c.setOnClickListener(new View.OnClickListener() { // from class: p5.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12601T0(this.f19466a, view);
            }
        });
        viewIncludeMenuBinding.f15463h.setOnClickListener(new View.OnClickListener() { // from class: p5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12603U0(this.f19381a, view);
            }
        });
        viewIncludeMenuBinding.f15461f.setOnClickListener(new View.OnClickListener() { // from class: p5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12605V0(this.f19384a, view);
            }
        });
        viewIncludeMenuBinding.f15459d.setOnClickListener(new View.OnClickListener() { // from class: p5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12607W0(this.f19388a, view);
            }
        });
        viewIncludeMenuBinding.f15460e.setOnClickListener(new View.OnClickListener() { // from class: p5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12609X0(this.f19391a, view);
            }
        });
        viewIncludeMenuBinding.f15456a.setOnClickListener(new View.OnClickListener() { // from class: p5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12611Y0(this.f19394a, view);
            }
        });
        viewIncludeMenuBinding.f15457b.setOnClickListener(new View.OnClickListener() { // from class: p5.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12613Z0(this.f19444a, view);
            }
        });
    }

    /* renamed from: f1 */
    public final void m12675f1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgPenType = viewFragmentBoardBinding.f15372f.f15481k;
        AbstractC9133u.m16132f(rgPenType, "rgPenType");
        Iterator it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: p5.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m12628g1(this.f19415a, view);
                }
            });
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f14834a;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        RadioGroup rgPenSize = viewFragmentBoardBinding3.f15372f.f15480j;
        AbstractC9133u.m16132f(rgPenSize, "rgPenSize");
        final int i10 = 0;
        final int i11 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgPenSize)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: p5.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m12631h1(this.f19447a, i11, view);
                }
            });
            i11 = i12;
        }
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f14834a;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding4;
        }
        RadioGroup rgPenColor = viewFragmentBoardBinding2.f15372f.f15479i;
        AbstractC9133u.m16132f(rgPenColor, "rgPenColor");
        for (Object obj2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj2).setOnClickListener(new View.OnClickListener() { // from class: p5.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m12634i1(this.f19401a, i10, view);
                }
            });
            i10 = i13;
        }
    }

    /* renamed from: j0 */
    public final void m12676j0(Bitmap bitmap, String str, String filename, boolean z10, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(filename, "filename");
        BoardViewModel.m12753y(m12678m0(), bitmap, str, null, z10, filename, interfaceC10570l, 4, null);
    }

    /* renamed from: j1 */
    public final void m12677j1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchProgressView sketchProgressVertical = viewFragmentBoardBinding.f15378l;
        AbstractC9133u.m16132f(sketchProgressVertical, "sketchProgressVertical");
        AbstractC0027a.m63b(sketchProgressVertical, new InterfaceC10559a() { // from class: p5.d0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardFragment.m12638k1(this.f19385a);
            }
        }, new InterfaceC10570l() { // from class: p5.e0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12641l1(this.f19389a, ((Float) obj).floatValue());
            }
        }, new InterfaceC10570l() { // from class: p5.f0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12643m1(this.f19392a, ((Float) obj).floatValue());
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f14834a;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
        }
        SketchProgressView sketchProgressHorizontal = viewFragmentBoardBinding2.f15377k;
        AbstractC9133u.m16132f(sketchProgressHorizontal, "sketchProgressHorizontal");
        AbstractC0027a.m63b(sketchProgressHorizontal, new InterfaceC10559a() { // from class: p5.g0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardFragment.m12645n1(this.f19395a);
            }
        }, new InterfaceC10570l() { // from class: p5.h0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12647o1(this.f19398a, ((Float) obj).floatValue());
            }
        }, new InterfaceC10570l() { // from class: p5.j0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12649p1(this.f19405a, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: m0 */
    public final BoardViewModel m12678m0() {
        return (BoardViewModel) this.f14835b.getValue();
    }

    /* renamed from: n0 */
    public final String m12679n0() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    /* renamed from: o0 */
    public final void m12680o0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f15376j.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewFragmentBoardBinding viewFragmentBoardBindingM13264a = ViewFragmentBoardBinding.m13264a(inflater);
        AbstractC9133u.m16130d(viewFragmentBoardBindingM13264a);
        this.f14834a = viewFragmentBoardBindingM13264a;
        View root = viewFragmentBoardBindingM13264a.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m12680o0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws FileNotFoundException {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        m12652q1();
    }

    /* renamed from: p0 */
    public final void m12681p0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgBackgroundColor = viewFragmentBoardBinding.f15367a.f15433g;
        AbstractC9133u.m16132f(rgBackgroundColor, "rgBackgroundColor");
        final int i10 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgBackgroundColor)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: p5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m12651q0(this.f19372a, i10, view);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: r0 */
    public final void m12682r0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f15379m.post(new Runnable() { // from class: p5.k0
            @Override // java.lang.Runnable
            public final void run() {
                BoardFragment.m12655s0(this.f19408a);
            }
        });
        m12678m0().m12769J0(new C8197b());
        m12678m0().m12767I0(new C8198c());
    }

    /* renamed from: r1 */
    public final void m12683r1() throws FileNotFoundException {
        File externalCacheDir;
        String absolutePath;
        C9674a c9674aM12768J = m12678m0().m12768J();
        if (c9674aM12768J == null || c9674aM12768J.m18239a()) {
            m12689y1();
        }
        String strM12679n0 = m12679n0();
        if (strM12679n0.length() == 0) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                throw new FileNotFoundException("unknown board path");
            }
            strM12679n0 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        AbstractC5380q.m2623s("Ready Start,  path -> " + strM12679n0);
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBoardBinding.f15379m;
        AbstractC9133u.m16130d(strM12679n0);
        sketchRecorderView.ready(strM12679n0, new InterfaceC10575q() { // from class: p5.b0
            @Override // p300x7.InterfaceC10575q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BoardFragment.m12656s1(this.f19374a, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new InterfaceC10570l() { // from class: p5.c0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardFragment.m12659t1(this.f19382a, (Throwable) obj);
            }
        });
    }

    /* renamed from: u0 */
    public final void m12684u0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        RadioGroup rgEraserSize = viewFragmentBoardBinding.f15369c.f15441d;
        AbstractC9133u.m16132f(rgEraserSize, "rgEraserSize");
        final int i10 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgEraserSize)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: p5.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoardFragment.m12663v0(this.f19368a, i10, view);
                }
            });
            i10 = i11;
        }
    }

    /* renamed from: v1 */
    public final void m12685v1(C9674a boardCallbackConfig) {
        AbstractC9133u.m16133g(boardCallbackConfig, "boardCallbackConfig");
        m12678m0().m12807h0(boardCallbackConfig);
    }

    /* renamed from: w0 */
    public final void m12686w0() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f15374h.setOnClickListener(new View.OnClickListener() { // from class: p5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12666x0(this.f19397a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f14834a;
        if (viewFragmentBoardBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding3 = null;
        }
        viewFragmentBoardBinding3.f15375i.setOnClickListener(new View.OnClickListener() { // from class: p5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12668y0(this.f19400a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f14834a;
        if (viewFragmentBoardBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding4 = null;
        }
        final ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding4.f15373g;
        AppCompatImageView ivRecord = viewItemSketchRecordAudioBinding.f15500b;
        AbstractC9133u.m16132f(ivRecord, "ivRecord");
        AbstractC0027a.m65d(ivRecord, 0L, new View.OnClickListener() { // from class: p5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12670z0(this.f19404a, view);
            }
        }, 1, null);
        viewItemSketchRecordAudioBinding.f15499a.setOnClickListener(new View.OnClickListener() { // from class: p5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12564B0(this.f19407a, view);
            }
        });
        viewItemSketchRecordAudioBinding.f15501c.setOnClickListener(new View.OnClickListener() { // from class: p5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12567C0(this.f19410a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f15504f.setOnClickListener(new View.OnClickListener() { // from class: p5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12569D0(this.f19418a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f15506h.setOnClickListener(new View.OnClickListener() { // from class: p5.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12572E0(this.f19422a, viewItemSketchRecordAudioBinding, view);
            }
        });
        viewItemSketchRecordAudioBinding.f15502d.setOnClickListener(new View.OnClickListener() { // from class: p5.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12575F0(this.f19426a, view);
            }
        });
        ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f14834a;
        if (viewFragmentBoardBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBoardBinding2 = viewFragmentBoardBinding5;
        }
        final ViewItemSketchRecordBinding viewItemSketchRecordBinding = viewFragmentBoardBinding2.f15368b;
        viewItemSketchRecordBinding.f15512a.setOnClickListener(new View.OnClickListener() { // from class: p5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardFragment.m12577G0(this.f19429a, viewItemSketchRecordBinding, view);
            }
        });
    }

    /* renamed from: w1 */
    public final void m12687w1(C9679b1 c9679b1) {
        m12678m0().m12820z0(c9679b1);
    }

    /* renamed from: x1 */
    public final void m12688x1(C8208d boardViewConfig) {
        AbstractC9133u.m16133g(boardViewConfig, "boardViewConfig");
        m12678m0().m12805e1(boardViewConfig);
    }

    /* renamed from: y1 */
    public final void m12689y1() {
        ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14834a;
        if (viewFragmentBoardBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBoardBinding = null;
        }
        viewFragmentBoardBinding.f15376j.setVisibility(0);
    }

    /* renamed from: z1 */
    public final void m12690z1() {
        if (m12678m0().m12762F0()) {
            ToastUtils.m2403s("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C0038l.m86w(this.f14836c, null, true, new InterfaceC10570l() { // from class: p5.q0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BoardFragment.m12562A1(this.f19431a, (Uri) obj);
                }
            }, 1, null);
        }
    }
}
