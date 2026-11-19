package com.zykj.view.board.evaluation;

import android.content.Context;
import android.content.DialogInterface;
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
import ca.C5414d;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.view.R$dimen;
import com.zykj.view.R$string;
import com.zykj.view.R$style;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import com.zykj.view.databinding.ViewFragmentBlackboardEvaluationBinding;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10216d;
import ma.InterfaceC10223k;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p294pb.DialogC10651l;
import p307q9.C10762b;
import p307q9.C10764d;
import p309qc.C10786q;
import p325rc.AbstractC10976v;
import p378vb.AbstractC11571a;
import p378vb.AbstractC11584n;
import p378vb.C11582l;
import p422y9.InterfaceC11935n;

/* loaded from: classes6.dex */
public final class BlackboardEvaluationFragment extends Fragment {

    /* renamed from: n */
    public static final C8866a f20359n = new C8866a(null);

    /* renamed from: e */
    public ViewFragmentBlackboardEvaluationBinding f20361e;

    /* renamed from: f */
    public IBoardControl f20362f;

    /* renamed from: g */
    public InterfaceC11935n f20363g;

    /* renamed from: h */
    public C10762b f20364h;

    /* renamed from: i */
    public String f20365i;

    /* renamed from: k */
    public float f20367k;

    /* renamed from: l */
    public float f20368l;

    /* renamed from: m */
    public InterfaceC9540l f20369m;

    /* renamed from: d */
    public final C11582l f20360d = new C11582l(this, null, 2, null);

    /* renamed from: j */
    public Rect f20366j = new Rect();

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$a */
    public static final class C8866a {
        public /* synthetic */ C8866a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8866a() {
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$b */
    public static final class C8867b implements InterfaceC10216d {
        public C8867b() {
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: a */
        public void mo17143a(float f10) {
            Log.i("BlackboardEvaluation", "onHorizontalMove -> " + f10);
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: b */
        public void mo17144b(float f10) {
            InterfaceC9540l interfaceC9540l = BlackboardEvaluationFragment.this.f20369m;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(Float.valueOf(f10));
            }
            Log.i("BlackboardEvaluation", "onVerticalMove -> " + f10);
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: c */
        public void mo17145c() {
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: d */
        public void mo17146d() {
        }
    }

    /* renamed from: com.zykj.view.board.evaluation.BlackboardEvaluationFragment$c */
    public static final class C8868c implements InterfaceC10223k {
        public C8868c() {
        }

        /* renamed from: c */
        public static final void m17148c(BlackboardEvaluationFragment blackboardEvaluationFragment, boolean z10, boolean z11) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f20570p.setEnabled(z10);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
            }
            viewFragmentBlackboardEvaluationBinding2.f20566l.setEnabled(z11);
        }

        @Override // ma.InterfaceC10223k
        /* renamed from: a */
        public void mo17149a(final boolean z10, final boolean z11) {
            FragmentActivity activity = BlackboardEvaluationFragment.this.getActivity();
            if (activity != null) {
                final BlackboardEvaluationFragment blackboardEvaluationFragment = BlackboardEvaluationFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: mb.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.C8868c.m17148c(blackboardEvaluationFragment, z10, z11);
                    }
                });
            }
        }
    }

    /* renamed from: P */
    private final void m17095P() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new AlertDialog.Builder(activity, R$style.Theme_AppCompat_Light_Dialog_Alert).setMessage(R$string.clear_canvas).setPositiveButton(getString(R$string.sure), new DialogInterface.OnClickListener() { // from class: mb.o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    BlackboardEvaluationFragment.m17096Q(this.f24349c, dialogInterface, i10);
                }
            }).setNegativeButton(getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: mb.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    BlackboardEvaluationFragment.m17097R(dialogInterface, i10);
                }
            }).create().show();
        }
    }

    /* renamed from: Q */
    public static final void m17096Q(BlackboardEvaluationFragment blackboardEvaluationFragment, DialogInterface dialogInterface, int i10) {
        InterfaceC11935n interfaceC11935n = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n != null) {
            InterfaceC11935n.a.m26492e(interfaceC11935n, null, 1, null);
        }
    }

    /* renamed from: R */
    public static final void m17097R(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* renamed from: T */
    private final void m17098T() {
        InterfaceC11935n interfaceC11935n = this.f20363g;
        if ((interfaceC11935n != null ? interfaceC11935n.mo14482y() : 0) >= 3) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
        } else {
            C11582l.m25493v(this.f20360d, null, true, new InterfaceC9540l() { // from class: mb.n
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return BlackboardEvaluationFragment.m17099U(this.f24348c, (Uri) obj);
                }
            }, 1, null);
        }
    }

    /* renamed from: U */
    public static final C10786q m17099U(final BlackboardEvaluationFragment blackboardEvaluationFragment, Uri uri) {
        if (uri == null) {
            return C10786q.f26013a;
        }
        File fileUri2FileNoCacheCopy = UriUtils.uri2FileNoCacheCopy(uri);
        InterfaceC11935n interfaceC11935n = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n != null) {
            String absolutePath = fileUri2FileNoCacheCopy.getAbsolutePath();
            AbstractC9979u.m20293f(absolutePath, "getAbsolutePath(...)");
            final ImageGraph imageGraphMo14450A = interfaceC11935n.mo14450A(absolutePath);
            if (imageGraphMo14450A != null) {
                FileUtils.delete(fileUri2FileNoCacheCopy);
                ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
                if (viewFragmentBlackboardEvaluationBinding == null) {
                    AbstractC9979u.m20312y("mBinding");
                    viewFragmentBlackboardEvaluationBinding = null;
                }
                viewFragmentBlackboardEvaluationBinding.f20571q.post(new Runnable() { // from class: mb.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        BlackboardEvaluationFragment.m17100V(imageGraphMo14450A, blackboardEvaluationFragment);
                    }
                });
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: V */
    public static final void m17100V(ImageGraph imageGraph, BlackboardEvaluationFragment blackboardEvaluationFragment) {
        C10764d c10764dM22919z;
        float f10 = imageGraph.mo2715d().top;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        int height = viewFragmentBlackboardEvaluationBinding.f20571q.getHeight();
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        float fM22923b = f10 / (height * (((c10762b == null || (c10764dM22919z = c10762b.m22919z()) == null) ? 2 : c10764dM22919z.m22923b()) - 1));
        InterfaceC11935n interfaceC11935n = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n != null) {
            interfaceC11935n.areaMoveStart();
        }
        InterfaceC11935n interfaceC11935n2 = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n2 != null) {
            InterfaceC11935n.a.m26491d(interfaceC11935n2, null, Float.valueOf(fM22923b), 1, null);
        }
        InterfaceC9540l interfaceC9540l = blackboardEvaluationFragment.f20369m;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Float.valueOf(fM22923b));
        }
    }

    /* renamed from: Y */
    public static final C10786q m17101Y(BlackboardEvaluationFragment blackboardEvaluationFragment, IBoardControl boardControl, boolean z10, long j10) {
        AbstractC9979u.m20294g(boardControl, "boardControl");
        blackboardEvaluationFragment.f20362f = boardControl;
        blackboardEvaluationFragment.m17138a0();
        blackboardEvaluationFragment.m17139t0();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20565k.performClick();
        blackboardEvaluationFragment.m17142y0(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f20572r.setVisibility(8);
        return C10786q.f26013a;
    }

    /* renamed from: Z */
    public static final C10786q m17102Z(BlackboardEvaluationFragment blackboardEvaluationFragment, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        ToastUtils.showShort("加载失败,清除缓存后再试", new Object[0]);
        blackboardEvaluationFragment.m17142y0(true);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20572r.setVisibility(8);
        return C10786q.f26013a;
    }

    /* renamed from: b0 */
    private final void m17103b0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f20361e;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20570p.setOnClickListener(new View.OnClickListener() { // from class: mb.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17123r0(this.f24347c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f20566l.setOnClickListener(new View.OnClickListener() { // from class: mb.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17125s0(this.f24356c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f20567m.setOnClickListener(new View.OnClickListener() { // from class: mb.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17104c0(this.f24357c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f20569o.setOnClickListener(new View.OnClickListener() { // from class: mb.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17105d0(this.f24358c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding6 = null;
        }
        viewFragmentBlackboardEvaluationBinding6.f20565k.setOnClickListener(new View.OnClickListener() { // from class: mb.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17106e0(this.f24359c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding7 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding7 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding7 = null;
        }
        viewFragmentBlackboardEvaluationBinding7.f20564j.setOnClickListener(new View.OnClickListener() { // from class: mb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17107f0(this.f24338c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding8 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding8 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding8 = null;
        }
        viewFragmentBlackboardEvaluationBinding8.f20559e.setOnClickListener(new View.OnClickListener() { // from class: mb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17108g0(this.f24339c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding9 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding9 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding9 = null;
        }
        viewFragmentBlackboardEvaluationBinding9.f20561g.setOnClickListener(new View.OnClickListener() { // from class: mb.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17109h0(this.f24340c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding10 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding10 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding10 = null;
        }
        ImageView ivCamera = viewFragmentBlackboardEvaluationBinding10.f20557c;
        AbstractC9979u.m20293f(ivCamera, "ivCamera");
        AbstractC11571a.m25475d(ivCamera, 0L, new View.OnClickListener() { // from class: mb.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17110i0(this.f24341c, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding11 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding11 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding11 = null;
        }
        ImageView ivImport = viewFragmentBlackboardEvaluationBinding11.f20563i;
        AbstractC9979u.m20293f(ivImport, "ivImport");
        AbstractC11571a.m25475d(ivImport, 0L, new View.OnClickListener() { // from class: mb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17111j0(this.f24342c, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding12 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding12 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding12 = null;
        }
        ImageView ivText = viewFragmentBlackboardEvaluationBinding12.f20568n;
        AbstractC9979u.m20293f(ivText, "ivText");
        AbstractC11571a.m25475d(ivText, 0L, new View.OnClickListener() { // from class: mb.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17112k0(this.f24352c, view);
            }
        }, 1, null);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding13 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding13 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding13 = null;
        }
        viewFragmentBlackboardEvaluationBinding13.f20558d.setOnClickListener(new View.OnClickListener() { // from class: mb.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17117o0(this.f24353c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding14 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding14 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding14 = null;
        }
        viewFragmentBlackboardEvaluationBinding14.f20562h.setOnClickListener(new View.OnClickListener() { // from class: mb.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackboardEvaluationFragment.m17119p0(this.f24354c, view);
            }
        });
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding15 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding15 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding15;
        }
        viewFragmentBlackboardEvaluationBinding2.f20560f.setOnTouchListener(new View.OnTouchListener() { // from class: mb.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BlackboardEvaluationFragment.m17121q0(this.f24355c, view, motionEvent);
            }
        });
    }

    /* renamed from: c0 */
    public static final void m17104c0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        if (c10762b != null) {
            c10762b.m22897h0(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f20567m;
            AbstractC9979u.m20293f(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m17141x0(ivSelect);
        }
    }

    /* renamed from: d0 */
    public static final void m17105d0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        if (c10762b != null) {
            c10762b.m22887c0(!c10762b.m22871O());
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            viewFragmentBlackboardEvaluationBinding.f20569o.setSelected(c10762b.m22871O());
            AbstractC11584n.m25520q(Boolean.valueOf(c10762b.m22871O()));
        }
    }

    /* renamed from: e0 */
    public static final void m17106e0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        if (c10762b != null) {
            c10762b.m22897h0(EzyModeEnum.ModeEnum.ACTION_WRITING);
            C10762b.m22856a0(c10762b, false, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivPen = viewFragmentBlackboardEvaluationBinding.f20565k;
            AbstractC9979u.m20293f(ivPen, "ivPen");
            blackboardEvaluationFragment.m17141x0(ivPen);
        }
    }

    /* renamed from: f0 */
    public static final void m17107f0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        if (c10762b != null) {
            c10762b.m22897h0(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            c10762b.m22882Z(true, 30.0f, 0.0f);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivLine = viewFragmentBlackboardEvaluationBinding.f20564j;
            AbstractC9979u.m20293f(ivLine, "ivLine");
            blackboardEvaluationFragment.m17141x0(ivLine);
        }
    }

    /* renamed from: g0 */
    public static final void m17108g0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        if (c10762b != null) {
            c10762b.m22897h0(EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE);
            C10762b.m22856a0(c10762b, true, 0.0f, 0.0f, 6, null);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivDottedLine = viewFragmentBlackboardEvaluationBinding.f20559e;
            AbstractC9979u.m20293f(ivDottedLine, "ivDottedLine");
            blackboardEvaluationFragment.m17141x0(ivDottedLine);
        }
    }

    /* renamed from: h0 */
    public static final void m17109h0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        C10762b c10762b = blackboardEvaluationFragment.f20364h;
        if (c10762b != null) {
            c10762b.m22897h0(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivEraser = viewFragmentBlackboardEvaluationBinding.f20561g;
            AbstractC9979u.m20293f(ivEraser, "ivEraser");
            blackboardEvaluationFragment.m17141x0(ivEraser);
        }
    }

    /* renamed from: i0 */
    public static final void m17110i0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m17098T();
    }

    private final void initData() {
        Bundle arguments = getArguments();
        this.f20365i = arguments != null ? arguments.getString("path") : null;
    }

    private final void initView() {
        m17103b0();
        m17137X();
        m17140u0();
    }

    /* renamed from: j0 */
    public static final void m17111j0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.getClass();
    }

    /* renamed from: k0 */
    public static final void m17112k0(final BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        FragmentActivity fragmentActivityRequireActivity = blackboardEvaluationFragment.requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        new DialogC10651l(fragmentActivityRequireActivity, 0, 2, null).m22536s("", new InterfaceC9540l() { // from class: mb.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m17113l0((String) obj);
            }
        }, new InterfaceC9540l() { // from class: mb.k
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m17114m0(this.f24346c, (String) obj);
            }
        }, new InterfaceC9529a() { // from class: mb.m
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BlackboardEvaluationFragment.m17115n0();
            }
        });
    }

    /* renamed from: l0 */
    public static final C10786q m17113l0(String it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }

    /* renamed from: m0 */
    public static final C10786q m17114m0(BlackboardEvaluationFragment blackboardEvaluationFragment, String content) {
        C5414d c5414dMo14472o;
        AbstractC9979u.m20294g(content, "content");
        InterfaceC11935n interfaceC11935n = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n != null && (c5414dMo14472o = interfaceC11935n.mo14472o(content, EzyPositionEnum.PositionEnum.TOP_CENTER, 20)) != null) {
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
            if (viewFragmentBlackboardEvaluationBinding == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentBlackboardEvaluationBinding = null;
            }
            ImageView ivSelect = viewFragmentBlackboardEvaluationBinding.f20567m;
            AbstractC9979u.m20293f(ivSelect, "ivSelect");
            blackboardEvaluationFragment.m17141x0(ivSelect);
            InterfaceC11935n interfaceC11935n2 = blackboardEvaluationFragment.f20363g;
            if (interfaceC11935n2 != null) {
                interfaceC11935n2.mo14455F(AbstractC10976v.m24126e(c5414dMo14472o.getId()));
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: n0 */
    public static final C10786q m17115n0() {
        return C10786q.f26013a;
    }

    /* renamed from: o0 */
    public static final void m17117o0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.m17095P();
    }

    /* renamed from: p0 */
    public static final void m17119p0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        blackboardEvaluationFragment.getClass();
    }

    /* renamed from: q0 */
    public static final boolean m17121q0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view, MotionEvent motionEvent) {
        AbstractC9979u.m20291d(motionEvent);
        blackboardEvaluationFragment.m17136W(motionEvent);
        return true;
    }

    /* renamed from: r0 */
    public static final void m17123r0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC11935n interfaceC11935n = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n != null) {
            interfaceC11935n.mo14469m();
        }
    }

    /* renamed from: s0 */
    public static final void m17125s0(BlackboardEvaluationFragment blackboardEvaluationFragment, View view) {
        InterfaceC11935n interfaceC11935n = blackboardEvaluationFragment.f20363g;
        if (interfaceC11935n != null) {
            interfaceC11935n.mo14483z();
        }
    }

    /* renamed from: v0 */
    public static final void m17129v0(final BlackboardEvaluationFragment blackboardEvaluationFragment) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20560f.getGlobalVisibleRect(blackboardEvaluationFragment.f20366j);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f20573s.post(new Runnable() { // from class: mb.i
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m17131w0(this.f24345c);
            }
        });
    }

    /* renamed from: w0 */
    public static final void m17131w0(BlackboardEvaluationFragment blackboardEvaluationFragment) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = blackboardEvaluationFragment.f20361e;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20573s.getGlobalVisibleRect(rect);
        Log.i("initTranslationConfig", rect + " " + blackboardEvaluationFragment.f20366j);
        blackboardEvaluationFragment.f20367k = 0.0f;
        blackboardEvaluationFragment.f20368l = (float) (rect.bottom - blackboardEvaluationFragment.f20366j.bottom);
        blackboardEvaluationFragment.m17135S(((float) ScreenUtils.getScreenHeight()) * 0.5f);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = blackboardEvaluationFragment.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f20573s.setVisibility(0);
    }

    /* renamed from: S */
    public final void m17135S(float f10) {
        Rect rect = new Rect();
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f20361e;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20560f.getGlobalVisibleRect(rect);
        float fCenterY = f10 - this.f20366j.centerY();
        float f11 = this.f20367k;
        float f12 = this.f20368l - 0.0f;
        if (fCenterY < f11) {
            fCenterY = f11;
        }
        if (fCenterY <= f12) {
            f12 = fCenterY;
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding2.f20573s.setTranslationY(f12);
    }

    /* renamed from: W */
    public final void m17136W(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m17135S(motionEvent.getRawY());
        } else if (action == 1) {
            m17135S(motionEvent.getRawY());
        } else {
            if (action != 2) {
                return;
            }
            m17135S(motionEvent.getRawY());
        }
    }

    /* renamed from: X */
    public final void m17137X() {
        String absolutePath;
        File externalCacheDir;
        if (this.f20365i == null) {
            Context context = getContext();
            if (context == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            this.f20365i = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        }
        m17142y0(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        SketchRecorderView sketchRecorderView = viewFragmentBlackboardEvaluationBinding.f20571q;
        String str = this.f20365i;
        AbstractC9979u.m20291d(str);
        sketchRecorderView.m13900b(str, new InterfaceC9545q() { // from class: mb.g
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BlackboardEvaluationFragment.m17101Y(this.f24343c, (IBoardControl) obj, ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }, new InterfaceC9540l() { // from class: mb.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BlackboardEvaluationFragment.m17102Z(this.f24344c, (Throwable) obj);
            }
        });
    }

    /* renamed from: a0 */
    public final void m17138a0() {
        IBoardControl iBoardControl = this.f20362f;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        C10762b config = iBoardControl != null ? iBoardControl.getConfig() : null;
        this.f20364h = config;
        if (config != null) {
            Boolean boolM25511h = AbstractC11584n.m25511h();
            config.m22887c0(boolM25511h != null ? boolM25511h.booleanValue() : true);
            ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.f20361e;
            if (viewFragmentBlackboardEvaluationBinding2 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding2;
            }
            viewFragmentBlackboardEvaluationBinding.f20569o.setSelected(config.m22871O());
            config.m22895g0(2);
            config.m22891e0(true);
            config.m22901j0(3.0f);
            config.m22881Y(3.0f);
            config.m22899i0(Color.parseColor("#000000"));
            config.m22879W(-1);
            C10764d c10764dM22919z = config.m22919z();
            c10764dM22919z.m22933l(true);
            c10764dM22919z.m22936o(true);
            c10764dM22919z.m22931j(3);
            c10764dM22919z.m22932k(1);
            config.m22878V(68.0f);
            config.m22877U(68.0f);
            config.m22876T(88.0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBindingM17334a = ViewFragmentBlackboardEvaluationBinding.m17334a(inflater);
        float screenHeight = (ScreenUtils.getScreenHeight() * (1.0f - 0.5f)) - getResources().getDimensionPixelSize(R$dimen.view_9);
        SketchRecorderView sketchView = viewFragmentBlackboardEvaluationBindingM17334a.f20571q;
        AbstractC9979u.m20293f(sketchView, "sketchView");
        ViewGroup.LayoutParams layoutParams = sketchView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) screenHeight;
        sketchView.setLayoutParams(layoutParams);
        AbstractC9979u.m20291d(viewFragmentBlackboardEvaluationBindingM17334a);
        this.f20361e = viewFragmentBlackboardEvaluationBindingM17334a;
        View root = viewFragmentBlackboardEvaluationBindingM17334a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f20362f = null;
        this.f20364h = null;
        this.f20363g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        initView();
    }

    /* renamed from: t0 */
    public final void m17139t0() {
        IBoardControl iBoardControl = this.f20362f;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = null;
        InterfaceC11935n interfaceC11935nMo14431b = iBoardControl != null ? iBoardControl.mo14431b() : null;
        this.f20363g = interfaceC11935nMo14431b;
        if (interfaceC11935nMo14431b == null) {
            IBoardControl iBoardControl2 = this.f20362f;
            this.f20363g = iBoardControl2 != null ? IBoardControl.DefaultImpls.m14446a(iBoardControl2, false, null, 3, null) : null;
        }
        InterfaceC11935n interfaceC11935n = this.f20363g;
        if (interfaceC11935n != null) {
            interfaceC11935n.setAreaMoveListener(new C8867b());
        }
        InterfaceC11935n interfaceC11935n2 = this.f20363g;
        if (interfaceC11935n2 != null) {
            interfaceC11935n2.mo14481x(new C8868c());
        }
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding2 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding2 = null;
        }
        viewFragmentBlackboardEvaluationBinding2.f20570p.setEnabled(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding = viewFragmentBlackboardEvaluationBinding3;
        }
        viewFragmentBlackboardEvaluationBinding.f20566l.setEnabled(false);
    }

    /* renamed from: u0 */
    public final void m17140u0() {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20560f.post(new Runnable() { // from class: mb.a
            @Override // java.lang.Runnable
            public final void run() {
                BlackboardEvaluationFragment.m17129v0(this.f24337c);
            }
        });
    }

    /* renamed from: x0 */
    public final void m17141x0(View view) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f20361e;
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding2 = null;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20567m.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding3 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding3 = null;
        }
        viewFragmentBlackboardEvaluationBinding3.f20565k.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding4 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding4 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding4 = null;
        }
        viewFragmentBlackboardEvaluationBinding4.f20561g.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding5 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding5 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding5 = null;
        }
        viewFragmentBlackboardEvaluationBinding5.f20564j.setSelected(false);
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding6 = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding6 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentBlackboardEvaluationBinding2 = viewFragmentBlackboardEvaluationBinding6;
        }
        viewFragmentBlackboardEvaluationBinding2.f20559e.setSelected(false);
        view.setSelected(true);
    }

    /* renamed from: y0 */
    public final void m17142y0(boolean z10) {
        ViewFragmentBlackboardEvaluationBinding viewFragmentBlackboardEvaluationBinding = this.f20361e;
        if (viewFragmentBlackboardEvaluationBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentBlackboardEvaluationBinding = null;
        }
        viewFragmentBlackboardEvaluationBinding.f20573s.setCanTouch(z10);
    }
}
