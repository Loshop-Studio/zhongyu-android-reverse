package com.zykj.view.board.evaluation;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AbstractC5352a0;
import com.blankj.utilcode.util.AbstractC5364g0;
import com.blankj.utilcode.util.AbstractC5371k;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.WithdrawListener;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.view.R$dimen;
import com.zykj.view.R$string;
import com.zykj.view.R$style;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardEvaluationBinding;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0027a;
import p007a6.AbstractC0040n;
import p007a6.C0038l;
import p123h7.C8736p;
import p134i7.AbstractC8807u;
import p232r5.C9913a;
import p265u5.DialogC10197l;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public final class BlackboardEvaluationFragment extends Fragment {

    /* renamed from: l */
    public static final C8233a f15147l = new C8233a(null);

    /* renamed from: b */
    public ViewFragmentBlackboardEvaluationBinding f15149b;

    /* renamed from: c */
    public IBoardControl f15150c;

    /* renamed from: d */
    public IPageControl f15151d;

    /* renamed from: e */
    public BoardConfig f15152e;

    /* renamed from: f */
    public String f15153f;

    /* renamed from: g */
    public C9913a f15154g;

    /* renamed from: i */
    public float f15156i;

    /* renamed from: j */
    public float f15157j;

    /* renamed from: k */
    public InterfaceC10570l f15158k;

    /* renamed from: a */
    public final C0038l f15148a = new C0038l(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: h */
    public Rect f15155h = new Rect();

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$a */
    public static final class C8233a {
        public /* synthetic */ C8233a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final BlackboardEvaluationFragment m13074a(String path, C9913a config) {
            AbstractC9133u.m16133g(path, "path");
            AbstractC9133u.m16133g(config, "config");
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            BlackboardEvaluationFragment blackboardEvaluationFragment = new BlackboardEvaluationFragment();
            blackboardEvaluationFragment.f15154g = config;
            blackboardEvaluationFragment.setArguments(bundle);
            return blackboardEvaluationFragment;
        }

        public C8233a() {
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$b */
    public static final class C8234b implements IAreaMoveListener {
        public C8234b() {
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onHorizontalMove(float f10) {
            Log.i("BlackboardEvaluation", "onHorizontalMove -> " + f10);
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onMoveEnd() {
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onMoveStart() {
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onVerticalMove(float f10) {
            InterfaceC10570l interfaceC10570l = BlackboardEvaluationFragment.this.f15158k;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(Float.valueOf(f10));
            }
            Log.i("BlackboardEvaluation", "onVerticalMove -> " + f10);
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$c */
    public static final class C8235c implements WithdrawListener {
        public C8235c() {
        }

        /* renamed from: b */
        public static final void m13076b(BlackboardEvaluationFragment blackboardEvaluationFragment, boolean z10, boolean z11) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f15359n.setEnabled(z10);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
            }
            viewFragmentBlackboardEvaluationBinding2.f15355j.setEnabled(z11);
        }

        @Override // com.zykj.blackboard.listener.WithdrawListener
        public void onWithdraw(final boolean z10, final boolean z11) {
            FragmentActivity activity = BlackboardEvaluationFragment.this.getActivity();
            if (activity != null) {
                final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: r5.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.C8235c.m13076b(blackboardEvaluationFragment, z10, z11);
                    }
                });
            }
        }
    }

    /* renamed from: I */
    public static final void m13011I(BlackboardEvaluationFragment blackboardEvaluationFragment, DialogInterface dialogInterface, int i10) {
        IPageControl iPageControl = blackboardEvaluationFragment.f15151d;
        if (iPageControl != null) {
            IPageControl.DefaultImpls.cleanPage$default(iPageControl, null, 1, null);
        }
    }

    /* renamed from: J */
    public static final void m13012J(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: M */
    public static final C8736p m13013M(final BlackboardEvaluationFragment blackboardEvaluationFragment, Uri uri) {
        if (uri == null) {
            return C8736p.f16368a;
        }
        File fileM2473f = AbstractC5364g0.m2473f(uri);
        IPageControl iPageControl = blackboardEvaluationFragment.f15151d;
        if (iPageControl != null) {
            String absolutePath = fileM2473f.getAbsolutePath();
            AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
            final ImageGraph imageGraphAddSpecialImage = iPageControl.addSpecialImage(absolutePath);
            if (imageGraphAddSpecialImage != null) {
                AbstractC5371k.m2522d(fileM2473f);
                ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
                if (viewFragmentBlackboardEvaluationBinding == null) {
                    AbstractC9133u.m16151y("mBinding");
                    viewFragmentBlackboardEvaluationBinding = null;
                }
                viewFragmentBlackboardEvaluationBinding.f15360o.post(new Runnable() { // from class: r5.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.m13014N(imageGraphAddSpecialImage, blackboardEvaluationFragment);
                    }
                });
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: N */
    public static final void m13014N(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        MoveActionConfig moveActionConfig;
        float f10 = imageGraph.getRenderRectF().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.f15360o.getHeight();
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        float maxHeightTimes = f10 / (height * (((boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null) ? 2 : moveActionConfig.getMaxHeightTimes()) - 1));
        IPageControl iPageControl = blackboardEvaluationFragment.f15151d;
        if (iPageControl != null) {
            iPageControl.areaMoveStart();
        }
        IPageControl iPageControl2 = blackboardEvaluationFragment.f15151d;
        if (iPageControl2 != null) {
            IPageControl.DefaultImpls.areaMoveEnd$default(iPageControl2, null, Float.valueOf(maxHeightTimes), 1, null);
        }
        InterfaceC10570l interfaceC10570l = blackboardEvaluationFragment.f15158k;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Float.valueOf(maxHeightTimes));
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ Bitmap m13015Q(BlackboardEvaluationFragment blackboardEvaluationFragment, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        return blackboardEvaluationFragment.m13064P(i10, i11, i12, i13, z10);
    }

    /* renamed from: T */
    public static final C8736p m13016T(BlackboardEvaluationFragment blackboardEvaluationFragment, IBoardControl boardControl, boolean z10, long j10) {
        AbstractC9133u.m16133g(boardControl, "boardControl");
        blackboardEvaluationFragment.f15150c = boardControl;
        blackboardEvaluationFragment.m13067V();
        blackboardEvaluationFragment.m13069p0();
        C9913a c9913a = blackboardEvaluationFragment.f15154g;
        if (c9913a != null) {
            blackboardEvaluationFragment.m13063O(c9913a);
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15354i.performClick();
        blackboardEvaluationFragment.m13073w0(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f15361p.setVisibility(8);
        return C8736p.f16368a;
    }

    /* renamed from: U */
    public static final C8736p m13017U(BlackboardEvaluationFragment blackboardEvaluationFragment, Throwable it) {
        AbstractC9133u.m16133g(it, "it");
        ToastUtils.m2403s("加载失败,清除缓存后再试", new Object[0]);
        blackboardEvaluationFragment.m13073w0(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15361p.setVisibility(8);
        return C8736p.f16368a;
    }

    /* renamed from: W */
    private final void m13018W() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15359n.setOnClickListener(new View.OnClickListener() { // from class: r5.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13042m0(this.f19899a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f15355j.setOnClickListener(new View.OnClickListener() { // from class: r5.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13044n0(this.f19908a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f15356k.setOnClickListener(new View.OnClickListener() { // from class: r5.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13019X(this.f19909a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f15358m.setOnClickListener(new View.OnClickListener() { // from class: r5.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13020Y(this.f19910a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding6 = null;
        }
        viewFragmentBlackboardEvaluationBinding6.f15354i.setOnClickListener(new View.OnClickListener() { // from class: r5.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13021Z(this.f19911a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding7 = null;
        }
        viewFragmentBlackboardEvaluationBinding7.f15353h.setOnClickListener(new View.OnClickListener() { // from class: r5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13022a0(this.f19890a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding8 = null;
        }
        viewFragmentBlackboardEvaluationBinding8.f15348c.setOnClickListener(new View.OnClickListener() { // from class: r5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13023b0(this.f19891a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding9 = null;
        }
        viewFragmentBlackboardEvaluationBinding9.f15350e.setOnClickListener(new View.OnClickListener() { // from class: r5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13024c0(this.f19892a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding10 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding10 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding10 = null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding10.f15346a;
        AbstractC9133u.m16132f(ivCamera, "ivCamera");
        AbstractC0027a.m65d(ivCamera, 0L, new View.OnClickListener() { // from class: r5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13025d0(this.f19893a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding11 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding11 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding11 = null;
        }
        ImageView ivImport = viewFragmentBlackboardEvaluationBinding11.f15352g;
        AbstractC9133u.m16132f(ivImport, "ivImport");
        AbstractC0027a.m65d(ivImport, 0L, new View.OnClickListener() { // from class: r5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13026e0(this.f19894a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding12 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding12 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding12 = null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding12.f15357l;
        AbstractC9133u.m16132f(ivText, "ivText");
        AbstractC0027a.m65d(ivText, 0L, new View.OnClickListener() { // from class: r5.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13028f0(this.f19904a, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding13 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding13 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding13 = null;
        }
        viewFragmentBlackboardEvaluationBinding13.f15347b.setOnClickListener(new View.OnClickListener() { // from class: r5.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13036j0(this.f19905a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding14 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding14 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding14 = null;
        }
        viewFragmentBlackboardEvaluationBinding14.f15351f.setOnClickListener(new View.OnClickListener() { // from class: r5.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m13038k0(this.f19906a, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding15 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding15 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding15;
        }
        viewFragmentBlackboardEvaluationBinding2.f15349d.setOnTouchListener(new View.OnTouchListener() { // from class: r5.v
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BlackboardEvaluationFragment.m13040l0(this.f19907a, view, motionEvent);
            }
        });
    }

    /* renamed from: X */
    public static final void m13019X(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f15356k;
            AbstractC9133u.m16132f(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m13071u0(ivSelect);
        }
    }

    /* renamed from: Y */
    public static final void m13020Y(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        if (boardConfig != null) {
            boardConfig.setFingerDraw(!boardConfig.isFingerDraw());
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f15358m.setSelected(boardConfig.isFingerDraw());
            AbstractC0040n.m113q(Boolean.valueOf(boardConfig.isFingerDraw()));
        }
    }

    /* renamed from: Z */
    public static final void m13021Z(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_WRITING);
            BoardConfig.setDottedLine$default(boardConfig, false, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivPen = viewFragmentBlackboardEvaluationBinding.f15354i;
            AbstractC9133u.m16132f(ivPen, "ivPen");
            blackboardEvaluationFragment.m13071u0(ivPen);
        }
    }

    /* renamed from: a0 */
    public static final void m13022a0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            boardConfig.setDottedLine(true, 30.0f, 0.0f);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivLine = viewFragmentBlackboardEvaluationBinding.f15353h;
            AbstractC9133u.m16132f(ivLine, "ivLine");
            blackboardEvaluationFragment.m13071u0(ivLine);
        }
    }

    /* renamed from: b0 */
    public static final void m13023b0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            BoardConfig.setDottedLine$default(boardConfig, true, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.f15348c;
            AbstractC9133u.m16132f(ivDottedLine, "ivDottedLine");
            blackboardEvaluationFragment.m13071u0(ivDottedLine);
        }
    }

    /* renamed from: c0 */
    public static final void m13024c0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        BoardConfig boardConfig = blackboardEvaluationFragment.f15152e;
        if (boardConfig != null) {
            boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivEraser = viewFragmentBlackboardEvaluationBinding.f15350e;
            AbstractC9133u.m16132f(ivEraser, "ivEraser");
            blackboardEvaluationFragment.m13071u0(ivEraser);
        }
    }

    /* renamed from: d0 */
    public static final void m13025d0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m13062L();
    }

    /* renamed from: e0 */
    public static final void m13026e0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC10559a interfaceC10559aM18565o;
        C9913a c9913a = blackboardEvaluationFragment.f15154g;
        if (c9913a == null || (interfaceC10559aM18565o = c9913a.m18565o()) == null) {
            return;
        }
        interfaceC10559aM18565o.invoke();
    }

    /* renamed from: f0 */
    public static final void m13028f0(final BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        FragmentActivity fragmentActivityRequireActivity = blackboardEvaluationFragment.requireActivity();
        AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
        new DialogC10197l(fragmentActivityRequireActivity, 0, 2, null).m19068s("", new InterfaceC10570l() { // from class: r5.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m13030g0((String) obj);
            }
        }, new InterfaceC10570l() { // from class: r5.l
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m13032h0(this.f19898a, (String) obj);
            }
        }, new InterfaceC10559a() { // from class: r5.n
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BlackboardEvaluationFragment.m13034i0();
            }
        });
    }

    /* renamed from: g0 */
    public static final C8736p m13030g0(String it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: h0 */
    public static final C8736p m13032h0(BlackboardEvaluationFragment blackboardEvaluationFragment, String content) {
        TextGraph textGraphAddText;
        AbstractC9133u.m16133g(content, "content");
        IPageControl iPageControl = blackboardEvaluationFragment.f15151d;
        if (iPageControl != null && (textGraphAddText = iPageControl.addText(content, EzyPositionEnum.PositionEnum.TOP_CENTER, 20)) != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f15356k;
            AbstractC9133u.m16132f(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m13071u0(ivSelect);
            IPageControl iPageControl2 = blackboardEvaluationFragment.f15151d;
            if (iPageControl2 != null) {
                iPageControl2.newSelectGraph(AbstractC8807u.m14755e(textGraphAddText.getId()));
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: i0 */
    public static final C8736p m13034i0() {
        return C8736p.f16368a;
    }

    /* renamed from: j0 */
    public static final void m13036j0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m13060H();
    }

    /* renamed from: k0 */
    public static final void m13038k0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC10559a interfaceC10559aM18552b;
        C9913a c9913a = blackboardEvaluationFragment.f15154g;
        if (c9913a == null || (interfaceC10559aM18552b = c9913a.m18552b()) == null) {
            return;
        }
        interfaceC10559aM18552b.invoke();
    }

    /* renamed from: l0 */
    public static final boolean m13040l0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view, MotionEvent motionEvent) {
        AbstractC9133u.m16130d(motionEvent);
        blackboardEvaluationFragment.m13065R(motionEvent);
        return true;
    }

    /* renamed from: m0 */
    public static final void m13042m0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        IPageControl iPageControl = blackboardEvaluationFragment.f15151d;
        if (iPageControl != null) {
            iPageControl.withdraw();
        }
    }

    /* renamed from: n0 */
    public static final void m13044n0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        IPageControl iPageControl = blackboardEvaluationFragment.f15151d;
        if (iPageControl != null) {
            iPageControl.recover();
        }
    }

    /* renamed from: r0 */
    public static final void m13049r0(final BlackboardEvaluationFragment blackboardEvaluationFragment) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15349d.getGlobalVisibleRect(blackboardEvaluationFragment.f15155h);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f15362q.post(new Runnable() { // from class: r5.j
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m13051s0(this.f19897a);
            }
        });
    }

    /* renamed from: s0 */
    public static final void m13051s0(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15362q.getGlobalVisibleRect(rect);
        Log.i("initTranslationConfig", rect + " " + blackboardEvaluationFragment.f15155h);
        blackboardEvaluationFragment.f15156i = 0.0f;
        blackboardEvaluationFragment.f15157j = (float) (rect.bottom - blackboardEvaluationFragment.f15155h.bottom);
        float fM2423b = (float) AbstractC5352a0.m2423b();
        C9913a c9913a = blackboardEvaluationFragment.f15154g;
        blackboardEvaluationFragment.m13061K(fM2423b * (c9913a != null ? c9913a.m18553c() : 0.5f));
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f15362q.setVisibility(0);
    }

    /* renamed from: t0 */
    private final void m13053t0() {
        m13018W();
        m13066S();
        m13070q0();
    }

    /* renamed from: H */
    public final void m13060H() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new AlertDialog.Builder(activity, R$style.Theme_AppCompat_Light_Dialog_Alert).setMessage(R$string.clear_canvas).setPositiveButton(getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: r5.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    BlackboardEvaluationFragment.m13011I(this.f19901a, dialogInterface, i10);
                }
            }).setNegativeButton(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: r5.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    BlackboardEvaluationFragment.m13012J(dialogInterface, i10);
                }
            }).create().show();
        }
    }

    /* renamed from: K */
    public final void m13061K(float f10) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15349d.getGlobalVisibleRect(rect);
        float fCenterY = f10 - this.f15155h.centerY();
        float f11 = this.f15156i;
        float f12 = this.f15157j;
        C9913a c9913a = this.f15154g;
        float fM18551a = f12 - (c9913a != null ? c9913a.m18551a() : 0.0f);
        if (fCenterY < f11) {
            fCenterY = f11;
        }
        if (fCenterY <= fM18551a) {
            fM18551a = fCenterY;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f15362q.setTranslationY(fM18551a);
    }

    /* renamed from: L */
    public final void m13062L() {
        Integer numM18556f;
        IPageControl iPageControl = this.f15151d;
        int imageGraphCount = iPageControl != null ? iPageControl.getImageGraphCount() : 0;
        C9913a c9913a = this.f15154g;
        if (imageGraphCount >= ((c9913a == null || (numM18556f = c9913a.m18556f()) == null) ? 3 : numM18556f.intValue())) {
            ToastUtils.m2403s("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C0038l.m86w(this.f15148a, null, true, new InterfaceC10570l() { // from class: r5.o
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.m13013M(this.f19900a, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: O */
    public final void m13063O(C9913a c9913a) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.f15348c;
        AbstractC9133u.m16132f(ivDottedLine, "ivDottedLine");
        ivDottedLine.setVisibility(c9913a.m18559i() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding3.f15346a;
        AbstractC9133u.m16132f(ivCamera, "ivCamera");
        ivCamera.setVisibility(c9913a.m18558h() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        ImageView ivDrag = viewFragmentBlackboardEvaluationBinding4.f15349d;
        AbstractC9133u.m16132f(ivDrag, "ivDrag");
        ivDrag.setVisibility(!c9913a.m18555e() ? 4 : 0);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        ImageView ivWithdraw = viewFragmentBlackboardEvaluationBinding5.f15359n;
        AbstractC9133u.m16132f(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(c9913a.m18564n() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding6 = null;
        }
        ImageView ivRecover = viewFragmentBlackboardEvaluationBinding6.f15355j;
        AbstractC9133u.m16132f(ivRecover, "ivRecover");
        ivRecover.setVisibility(c9913a.m18561k() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding7 = null;
        }
        ImageView ivSelect = viewFragmentBlackboardEvaluationBinding7.f15356k;
        AbstractC9133u.m16132f(ivSelect, "ivSelect");
        ivSelect.setVisibility(c9913a.m18562l() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding8 = null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding8.f15357l;
        AbstractC9133u.m16132f(ivText, "ivText");
        ivText.setVisibility(c9913a.m18563m() ? 0 : 8);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding9;
        }
        ImageView ivImport = viewFragmentBlackboardEvaluationBinding2.f15352g;
        AbstractC9133u.m16132f(ivImport, "ivImport");
        ivImport.setVisibility(c9913a.m18560j() ? 0 : 8);
        BoardConfig boardConfig = this.f15152e;
        if (boardConfig != null) {
            Integer numM18557g = c9913a.m18557g();
            if (numM18557g != null) {
                boardConfig.getMoveActionConfig().setMaxHeightTimes(numM18557g.intValue());
            }
            Integer numM18556f = c9913a.m18556f();
            if (numM18556f != null) {
                boardConfig.setMaxImageSize(numM18556f.intValue());
            }
            boardConfig.setAddTextOriginalTextSize(c9913a.m18554d());
        }
    }

    /* renamed from: P */
    public final Bitmap m13064P(int i10, int i11, int i12, int i13, boolean z10) {
        IPageControl iPageControl = this.f15151d;
        if (iPageControl != null) {
            return IPageControl.DefaultImpls.minScreenshot$default(iPageControl, i10, i11, i12, i13, z10, true, false, null, 192, null);
        }
        return null;
    }

    /* renamed from: R */
    public final void m13065R(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m13061K(motionEvent.getRawY());
        } else if (action == 1) {
            m13061K(motionEvent.getRawY());
        } else {
            if (action != 2) {
                return;
            }
            m13061K(motionEvent.getRawY());
        }
    }

    /* renamed from: S */
    public final void m13066S() {
        String absolutePath;
        File externalCacheDir;
        if (this.f15153f == null) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            this.f15153f = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        m13073w0(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBlackboardEvaluationBinding.f15360o;
        String str = this.f15153f;
        AbstractC9133u.m16130d(str);
        sketchRecorderView.ready(str, new InterfaceC10575q() { // from class: r5.h
            @Override // p300x7.InterfaceC10575q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BlackboardEvaluationFragment.m13016T(this.f19895a, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new InterfaceC10570l() { // from class: r5.i
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m13017U(this.f19896a, (Throwable) obj);
            }
        });
    }

    /* renamed from: V */
    public final void m13067V() {
        IBoardControl iBoardControl = this.f15150c;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        BoardConfig config = iBoardControl != null ? iBoardControl.getConfig() : null;
        this.f15152e = config;
        if (config != null) {
            Boolean boolM104h = AbstractC0040n.m104h();
            config.setFingerDraw(boolM104h != null ? boolM104h.booleanValue() : true);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.f15149b;
            if (viewFragmentBlackboardEvaluationBinding2 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding2;
            }
            viewFragmentBlackboardEvaluationBinding.f15358m.setSelected(config.isFingerDraw());
            config.setMaxImageSize(2);
            config.setImageBackground(true);
            config.setPaintWidth(3.0f);
            config.setBeelinePaintWidth(3.0f);
            config.setPaintColor(Color.parseColor("#000000"));
            config.setBackgroundColor(-1);
            MoveActionConfig moveActionConfig = config.getMoveActionConfig();
            moveActionConfig.setMoveActionEnable(true);
            moveActionConfig.setVerticalTranslate(true);
            moveActionConfig.setMaxHeightTimes(3);
            moveActionConfig.setMaxWidthTimes(1);
            config.setAddTextOriginalTextSize(68.0f);
            config.setAddTextOriginalTextMinSize(68.0f);
            config.setAddTextOriginalTextMaxSize(88.0f);
        }
    }

    /* renamed from: o0 */
    public final void m13068o0() {
        Bundle arguments = getArguments();
        this.f15153f = arguments != null ? arguments.getString("path") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m13068o0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBindingM13262a = ViewFragmentBlackboardEvaluationBinding.m13262a(inflater);
        C9913a c9913a = this.f15154g;
        if (c9913a == null || !c9913a.m18555e()) {
            C9913a c9913a2 = this.f15154g;
            float fM2423b = (AbstractC5352a0.m2423b() * (1.0f - (c9913a2 != null ? c9913a2.m18553c() : 0.5f))) - getResources().getDimensionPixelSize(R$dimen.view_9);
            SketchRecorderView sketchView = viewFragmentBlackboardEvaluationBindingM13262a.f15360o;
            AbstractC9133u.m16132f(sketchView, "sketchView");
            ViewGroup.LayoutParams layoutParams = sketchView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = (int) fM2423b;
            sketchView.setLayoutParams(layoutParams);
        } else {
            Integer numValueOf = viewGroup != null ? Integer.valueOf(viewGroup.getHeight()) : null;
            SketchRecorderView sketchView2 = viewFragmentBlackboardEvaluationBindingM13262a.f15360o;
            AbstractC9133u.m16132f(sketchView2, "sketchView");
            ViewGroup.LayoutParams layoutParams2 = sketchView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (numValueOf == null || numValueOf.intValue() <= 0) ? -1 : numValueOf.intValue() - getResources().getDimensionPixelSize(R$dimen.view_38);
            sketchView2.setLayoutParams(layoutParams2);
        }
        AbstractC9133u.m16130d(viewFragmentBlackboardEvaluationBindingM13262a);
        this.f15149b = viewFragmentBlackboardEvaluationBindingM13262a;
        View root = viewFragmentBlackboardEvaluationBindingM13262a.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f15150c = null;
        this.f15152e = null;
        this.f15151d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        m13053t0();
    }

    /* renamed from: p0 */
    public final void m13069p0() {
        IBoardControl iBoardControl = this.f15150c;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        IPageControl currentPage = iBoardControl != null ? iBoardControl.getCurrentPage() : null;
        this.f15151d = currentPage;
        if (currentPage == null) {
            IBoardControl iBoardControl2 = this.f15150c;
            this.f15151d = iBoardControl2 != null ? IBoardControl.DefaultImpls.createPage$default(iBoardControl2, false, null, 3, null) : null;
        }
        IPageControl iPageControl = this.f15151d;
        if (iPageControl != null) {
            iPageControl.setAreaMoveListener(new C8234b());
        }
        IPageControl iPageControl2 = this.f15151d;
        if (iPageControl2 != null) {
            iPageControl2.addWithdrawListener(new C8235c());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding2 = null;
        }
        viewFragmentBlackboardEvaluationBinding2.f15359n.setEnabled(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding.f15355j.setEnabled(false);
    }

    /* renamed from: q0 */
    public final void m13070q0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15349d.post(new Runnable() { // from class: r5.b
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m13049r0(this.f19889a);
            }
        });
    }

    /* renamed from: u0 */
    public final void m13071u0(View view) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15356k.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f15354i.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f15350e.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f15353h.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding6;
        }
        viewFragmentBlackboardEvaluationBinding2.f15348c.setSelected(false);
        view.setSelected(true);
    }

    /* renamed from: v0 */
    public final void m13072v0(InterfaceC10570l interfaceC10570l) {
        this.f15158k = interfaceC10570l;
    }

    /* renamed from: w0 */
    public final void m13073w0(boolean z10) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f15149b;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f15362q.setCanTouch(z10);
    }
}
