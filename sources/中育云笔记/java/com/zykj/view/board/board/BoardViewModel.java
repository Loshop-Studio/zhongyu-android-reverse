package com.zykj.view.board.board;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.R$string;
import com.zykj.view.board.board.AbstractC8855q;
import com.zykj.view.board.board.AbstractC8856r;
import com.zykj.view.board.board.AbstractC8861w;
import com.zykj.view.board.board.AbstractC8862x;
import com.zykj.view.board.board.BoardViewModel;
import com.zykj.view.utils.ZoomPointSolution;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10215c;
import ma.InterfaceC10218f;
import ma.InterfaceC10222j;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p224kb.AbstractC9902x1;
import p224kb.C9831a;
import p224kb.C9836b1;
import p307q9.C10762b;
import p307q9.C10764d;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p378vb.AbstractC11571a;
import p378vb.AbstractC11584n;
import p378vb.C11585o;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p422y9.InterfaceC11935n;
import sd.AbstractC11117h;

/* loaded from: classes6.dex */
public final class BoardViewModel extends ViewModel {

    /* renamed from: A */
    public final InterfaceC11612u f20138A;

    /* renamed from: B */
    public boolean f20139B;

    /* renamed from: a */
    public C9836b1 f20140a;

    /* renamed from: b */
    public C9831a f20141b;

    /* renamed from: c */
    public IBoardControl f20142c;

    /* renamed from: d */
    public InterfaceC10222j f20143d;

    /* renamed from: e */
    public InterfaceC10218f f20144e;

    /* renamed from: f */
    public int f20145f = AbstractC8846h.m16969e().indexOf(AbstractC8862x.d.f20345c);

    /* renamed from: g */
    public final PointF f20146g = new PointF();

    /* renamed from: h */
    public final InterfaceC11602k f20147h;

    /* renamed from: i */
    public final InterfaceC11607p f20148i;

    /* renamed from: j */
    public final InterfaceC11603l f20149j;

    /* renamed from: k */
    public final InterfaceC11612u f20150k;

    /* renamed from: l */
    public final InterfaceC11603l f20151l;

    /* renamed from: m */
    public final InterfaceC11612u f20152m;

    /* renamed from: n */
    public final InterfaceC11603l f20153n;

    /* renamed from: o */
    public final InterfaceC11612u f20154o;

    /* renamed from: p */
    public final InterfaceC11603l f20155p;

    /* renamed from: q */
    public final InterfaceC11612u f20156q;

    /* renamed from: r */
    public final InterfaceC11603l f20157r;

    /* renamed from: s */
    public final InterfaceC11612u f20158s;

    /* renamed from: t */
    public final InterfaceC11603l f20159t;

    /* renamed from: u */
    public final InterfaceC11612u f20160u;

    /* renamed from: v */
    public final InterfaceC11603l f20161v;

    /* renamed from: w */
    public final InterfaceC11612u f20162w;

    /* renamed from: x */
    public final InterfaceC11603l f20163x;

    /* renamed from: y */
    public final InterfaceC11612u f20164y;

    /* renamed from: z */
    public final InterfaceC11603l f20165z;

    /* renamed from: com.zykj.view.board.board.BoardViewModel$a */
    public static final /* synthetic */ class C8835a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20166a;

        static {
            int[] iArr = new int[ZoomPointSolution.values().length];
            try {
                iArr[ZoomPointSolution.f20771d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomPointSolution.f20772e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomPointSolution.f20773f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoomPointSolution.f20774g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoomPointSolution.f20776i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoomPointSolution.f20775h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZoomPointSolution.f20777j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZoomPointSolution.f20778k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ZoomPointSolution.f20779l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f20166a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardViewModel$b */
    public static final class C8837b implements InterfaceC10215c {
        public C8837b() {
        }

        @Override // ma.InterfaceC10215c
        /* renamed from: a */
        public void mo16936a(InterfaceC5181c graph) {
            C9831a c9831aM16880J;
            InterfaceC9540l interfaceC9540lM19942g;
            AbstractC9979u.m20294g(graph, "graph");
            if (!(graph instanceof ImageGraph) || (c9831aM16880J = BoardViewModel.this.m16880J()) == null || (interfaceC9540lM19942g = c9831aM16880J.m19942g()) == null) {
                return;
            }
            String strM2863E = ((ImageGraph) graph).m2863E();
            if (strM2863E == null) {
                strM2863E = "";
            }
            interfaceC9540lM19942g.invoke(strM2863E);
        }
    }

    public BoardViewModel() {
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f20147h = interfaceC11602kM25592b;
        this.f20148i = AbstractC11596e.m25551a(interfaceC11602kM25592b);
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new C8854p(false, false, false, false, false, null, 63, null));
        this.f20149j = interfaceC11603lM25602a;
        this.f20150k = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(new C8858t(false, false, null, 0, null, 31, null));
        this.f20151l = interfaceC11603lM25602a2;
        this.f20152m = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        InterfaceC11603l interfaceC11603lM25602a3 = AbstractC11613v.m25602a(new C8847i(null, 1, null));
        this.f20153n = interfaceC11603lM25602a3;
        this.f20154o = AbstractC11596e.m25552b(interfaceC11603lM25602a3);
        InterfaceC11603l interfaceC11603lM25602a4 = AbstractC11613v.m25602a(new C8852n(false, false, false, false, null, 31, null));
        this.f20155p = interfaceC11603lM25602a4;
        this.f20156q = AbstractC11596e.m25552b(interfaceC11603lM25602a4);
        InterfaceC11603l interfaceC11603lM25602a5 = AbstractC11613v.m25602a(new C8839a(false, null, 3, null));
        this.f20157r = interfaceC11603lM25602a5;
        this.f20158s = AbstractC11596e.m25552b(interfaceC11603lM25602a5);
        InterfaceC11603l interfaceC11603lM25602a6 = AbstractC11613v.m25602a(new C8851m(null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 511, null));
        this.f20159t = interfaceC11603lM25602a6;
        this.f20160u = AbstractC11596e.m25552b(interfaceC11603lM25602a6);
        InterfaceC11603l interfaceC11603lM25602a7 = AbstractC11613v.m25602a(new C8860v(null, false, null, 7, null));
        this.f20161v = interfaceC11603lM25602a7;
        this.f20162w = AbstractC11596e.m25552b(interfaceC11603lM25602a7);
        InterfaceC11603l interfaceC11603lM25602a8 = AbstractC11613v.m25602a(new C8849k(null, 1, null));
        this.f20163x = interfaceC11603lM25602a8;
        this.f20164y = AbstractC11596e.m25552b(interfaceC11603lM25602a8);
        InterfaceC11603l interfaceC11603lM25602a9 = AbstractC11613v.m25602a(Boolean.FALSE);
        this.f20165z = interfaceC11603lM25602a9;
        this.f20138A = AbstractC11596e.m25552b(interfaceC11603lM25602a9);
        this.f20139B = true;
    }

    /* renamed from: B */
    public static /* synthetic */ void m16823B(BoardViewModel boardViewModel, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m16867A(f10, f11);
    }

    /* renamed from: C0 */
    public static final C10786q m16824C0(BoardViewModel boardViewModel, int i10) {
        AbstractC11584n.m25518o(Integer.valueOf(i10));
        C10762b c10762bM16882K = boardViewModel.m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22875S(i10);
        }
        return C10786q.f26013a;
    }

    /* renamed from: D0 */
    public static final C10786q m16825D0(BoardViewModel boardViewModel, float f10) {
        AbstractC11584n.m25519p(Float.valueOf(f10));
        C10762b c10762bM16882K = boardViewModel.m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22878V(f10);
        }
        return C10786q.f26013a;
    }

    /* renamed from: E */
    public static /* synthetic */ void m16826E(BoardViewModel boardViewModel, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m16871D(f10, f11);
    }

    /* renamed from: H */
    public static final C10786q m16827H(BoardViewModel boardViewModel) {
        InterfaceC11935n interfaceC11935nM16898S = boardViewModel.m16898S();
        if (interfaceC11935nM16898S != null) {
            boardViewModel.m16930s0(interfaceC11935nM16898S);
        } else {
            ToastUtils.showShort("画板初始化失败，请退出后重试", new Object[0]);
        }
        return C10786q.f26013a;
    }

    /* renamed from: X */
    public static /* synthetic */ void m16828X(BoardViewModel boardViewModel, boolean z10, boolean z11, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            C9836b1 c9836b1 = boardViewModel.f20140a;
            z10 = c9836b1 != null ? c9836b1.m19948c() : true;
        }
        if ((i10 & 2) != 0) {
            C9836b1 c9836b12 = boardViewModel.f20140a;
            z11 = c9836b12 != null ? c9836b12.m19951f() : false;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = new BoardViewModel$getSavePath$1(null);
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p2 = new BoardViewModel$getSavePath$2(null);
        }
        boardViewModel.m16906W(z10, z11, interfaceC9544p, interfaceC9544p2);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m16829Z0(BoardViewModel boardViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !((C8860v) boardViewModel.f20161v.getValue()).m17033e();
        }
        boardViewModel.m16910Y0(z10);
    }

    /* renamed from: b0 */
    public static final C10786q m16832b0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC11603l interfaceC11603l = boardViewModel.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 439, null)));
        return C10786q.f26013a;
    }

    /* renamed from: c0 */
    public static final C10786q m16834c0(BoardViewModel boardViewModel, float f10, float f11) {
        InterfaceC11603l interfaceC11603l = boardViewModel.f20159t;
        while (true) {
            Object value = interfaceC11603l.getValue();
            float f12 = f10;
            float f13 = f11;
            if (interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, false, f12, 0.0f, false, f13, 0.0f, 367, null))) {
                return C10786q.f26013a;
            }
            f10 = f12;
            f11 = f13;
        }
    }

    /* renamed from: d0 */
    public static final C10786q m16836d0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC11603l interfaceC11603l = boardViewModel.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, true, 0.0f, 0.0f, true, 0.0f, 0.0f, 439, null)));
        return C10786q.f26013a;
    }

    /* renamed from: g0 */
    public static final C10786q m16840g0(BoardViewModel boardViewModel, InterfaceC11935n it) {
        InterfaceC9529a interfaceC9529aM19943h;
        AbstractC9979u.m20294g(it, "it");
        boardViewModel.m16930s0(it);
        boardViewModel.f20165z.mo20854a(Boolean.TRUE);
        C9831a c9831a = boardViewModel.f20141b;
        if (c9831a != null && (interfaceC9529aM19943h = c9831a.m19943h()) != null) {
            interfaceC9529aM19943h.invoke();
        }
        return C10786q.f26013a;
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m16841g1(BoardViewModel boardViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !((C8854p) boardViewModel.f20149j.getValue()).m17005g();
        }
        boardViewModel.m16920f1(z10);
    }

    /* renamed from: h0 */
    public static final C10786q m16843h0(BoardViewModel boardViewModel, InterfaceC9540l interfaceC9540l) {
        InterfaceC11935n interfaceC11935nM16898S = boardViewModel.m16898S();
        if (interfaceC11935nM16898S != null) {
            interfaceC9540l.invoke(interfaceC11935nM16898S);
        } else {
            ToastUtils.showShort("画板加载失败，请退出后重试", new Object[0]);
        }
        return C10786q.f26013a;
    }

    /* renamed from: l0 */
    public static final C10786q m16848l0(BoardViewModel boardViewModel, CommandInfoEntity commandInfoEntity) {
        Object value;
        AbstractC9979u.m20294g(commandInfoEntity, "<unused var>");
        InterfaceC11603l interfaceC11603l = boardViewModel.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        return C10786q.f26013a;
    }

    /* renamed from: n0 */
    public static final C10786q m16851n0(BoardViewModel boardViewModel, InterfaceC11935n interfaceC11935n, String graph) {
        Object value;
        Object value2;
        AbstractC9979u.m20294g(graph, "graph");
        InterfaceC11603l interfaceC11603l = boardViewModel.f20149j;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, false, false, false, false, false, AbstractC8855q.d.f20294e, 31, null)));
        InterfaceC11603l interfaceC11603l2 = boardViewModel.f20159t;
        do {
            value2 = interfaceC11603l2.getValue();
        } while (!interfaceC11603l2.mo20870e(value2, C8851m.m16977b((C8851m) value2, AbstractC8856r.d.f20302e, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        interfaceC11935n.mo14455F(AbstractC10976v.m24126e(graph));
        return C10786q.f26013a;
    }

    /* renamed from: q0 */
    public static final C10786q m16855q0(BoardViewModel boardViewModel, boolean z10) {
        InterfaceC11603l interfaceC11603l = boardViewModel.f20161v;
        while (true) {
            Object value = interfaceC11603l.getValue();
            boolean z11 = z10;
            if (interfaceC11603l.mo20870e(value, C8860v.m17029b((C8860v) value, null, z11, null, 5, null))) {
                return C10786q.f26013a;
            }
            z10 = z11;
        }
    }

    /* renamed from: v0 */
    public static final C10786q m16861v0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC11603l interfaceC11603l = boardViewModel.f20161v;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8860v.m17029b((C8860v) value, AbstractC8861w.c.f20339f, false, null, 6, null)));
        return C10786q.f26013a;
    }

    /* renamed from: w0 */
    public static final C10786q m16863w0(BoardViewModel boardViewModel, long j10) {
        Object value;
        InterfaceC11603l interfaceC11603l = boardViewModel.f20161v;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8860v.m17029b((C8860v) value, null, false, C11585o.f27488a.m25522b(j10), 3, null)));
        return C10786q.f26013a;
    }

    /* renamed from: x0 */
    public static final C10786q m16864x0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC11603l interfaceC11603l = boardViewModel.f20161v;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8860v.m17029b((C8860v) value, AbstractC8861w.a.f20337f, false, null, 6, null)));
        return C10786q.f26013a;
    }

    /* renamed from: y */
    public static /* synthetic */ void m16865y(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, String str2, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            scaleTypeEnum = EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER_8;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            str2 = "";
        }
        if ((i10 & 32) != 0) {
            interfaceC9540l = null;
        }
        boardViewModel.m16933x(bitmap, str, scaleTypeEnum, z10, str2, interfaceC9540l);
    }

    /* renamed from: z0 */
    public static final C10786q m16866z0(BoardViewModel boardViewModel, boolean z10, boolean z11) {
        InterfaceC11603l interfaceC11603l = boardViewModel.f20149j;
        while (true) {
            Object value = interfaceC11603l.getValue();
            boolean z12 = z10;
            boolean z13 = z11;
            if (interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, false, false, z12, z13, false, null, 51, null))) {
                boardViewModel.m16877H0();
                return C10786q.f26013a;
            }
            z10 = z12;
            z11 = z13;
        }
    }

    /* renamed from: A */
    public final void m16867A(Float f10, Float f11) {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S != null) {
            interfaceC11935nM16898S.areaMoveEnd(f10, f11);
        }
    }

    /* renamed from: A0 */
    public final void m16868A0(C9836b1 boardSketchConfig) {
        AbstractC9979u.m20294g(boardSketchConfig, "boardSketchConfig");
        this.f20140a = boardSketchConfig;
    }

    /* renamed from: B0 */
    public final void m16869B0(InterfaceC11935n interfaceC11935n) {
        AbstractC9902x1.m19970f(interfaceC11935n, new InterfaceC9540l() { // from class: kb.p1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16824C0(this.f23189c, ((Integer) obj).intValue());
            }
        }, new InterfaceC9540l() { // from class: kb.q1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16825D0(this.f23193c, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: C */
    public final void m16870C() {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S != null) {
            interfaceC11935nM16898S.areaMoveStart();
        }
    }

    /* renamed from: D */
    public final void m16871D(Float f10, Float f11) {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S != null) {
            interfaceC11935nM16898S.areaMoving(f10, f11);
        }
    }

    /* renamed from: E0 */
    public final void m16872E0(C10762b c10762b) {
        c10762b.m22874R("");
        Integer numM25509f = AbstractC11584n.m25509f();
        c10762b.m22875S(numM25509f != null ? numM25509f.intValue() : ((C8858t) this.f20151l.getValue()).m17021e().m17015a());
        Float fM25510g = AbstractC11584n.m25510g();
        if (fM25510g != null) {
            c10762b.m22878V(fM25510g.floatValue());
        }
        c10762b.m22892f().right = 600.0f;
        c10762b.m22905l0(this.f20143d);
    }

    /* renamed from: F */
    public final void m16873F() {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S != null) {
            InterfaceC11935n.a.m26492e(interfaceC11935nM16898S, null, 1, null);
        }
    }

    /* renamed from: F0 */
    public final void m16874F0(float f10, float f11) {
        float f12 = 2;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        PointF pointF = this.f20146g;
        C9836b1 c9836b1 = this.f20140a;
        ZoomPointSolution zoomPointSolutionM19950e = c9836b1 != null ? c9836b1.m19950e() : null;
        switch (zoomPointSolutionM19950e == null ? -1 : C8835a.f20166a[zoomPointSolutionM19950e.ordinal()]) {
            case 1:
                pointF.set(0.0f, 0.0f);
                break;
            case 2:
                pointF.set(f10, 0.0f);
                break;
            case 3:
                pointF.set(0.0f, f11);
                break;
            case 4:
                pointF.set(f10, f11);
                break;
            case 5:
                pointF.set(0.0f, f14);
                break;
            case 6:
                pointF.set(f13, 0.0f);
                break;
            case 7:
                pointF.set(f10, f14);
                break;
            case 8:
                pointF.set(f13, f11);
                break;
            case 9:
                pointF.set(f13, f14);
                break;
            default:
                pointF.set(f13, 0.0f);
                break;
        }
    }

    /* renamed from: G */
    public final void m16875G() {
        Object value;
        Object value2;
        IBoardControl iBoardControl = this.f20142c;
        if (iBoardControl == null) {
            return;
        }
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        InterfaceC11603l interfaceC11603l2 = this.f20161v;
        do {
            value2 = interfaceC11603l2.getValue();
        } while (!interfaceC11603l2.mo20870e(value2, C8860v.m17029b((C8860v) value2, AbstractC8861w.b.f20338f, false, null, 6, null)));
        IBoardControl.DefaultImpls.m14447b(iBoardControl, 0, null, 2, null);
        IBoardControl.DefaultImpls.m14446a(iBoardControl, false, new InterfaceC9529a() { // from class: kb.c1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardViewModel.m16827H(this.f23144c);
            }
        }, 1, null);
    }

    /* renamed from: G0 */
    public final boolean m16876G0() {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        int iMo14482y = interfaceC11935nM16898S != null ? interfaceC11935nM16898S.mo14482y() : 0;
        C9836b1 c9836b1 = this.f20140a;
        return iMo14482y >= (c9836b1 != null ? c9836b1.m19947b() : 3);
    }

    /* renamed from: H0 */
    public final void m16877H0() {
        Object value;
        C8839a c8839a;
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null) {
            return;
        }
        int backgroundColor = interfaceC11935nM16898S.getBackgroundColor();
        InterfaceC11603l interfaceC11603l = this.f20157r;
        do {
            value = interfaceC11603l.getValue();
            c8839a = (C8839a) value;
            for (AbstractC8840b abstractC8840b : AbstractC8846h.m16965a()) {
                if (abstractC8840b.m16947a() == backgroundColor) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!interfaceC11603l.mo20870e(value, C8839a.m16943b(c8839a, false, abstractC8840b, 1, null)));
    }

    /* renamed from: I */
    public final InterfaceC11612u m16878I() {
        return this.f20158s;
    }

    /* renamed from: I0 */
    public final void m16879I0() {
        C10762b c10762bM16882K;
        Object value;
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null || (c10762bM16882K = m16882K()) == null) {
            return;
        }
        float fMo14464j = interfaceC11935nM16898S.mo14464j();
        Iterator it = AbstractC8846h.m16969e().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((AbstractC8862x) it.next()).m17038a() == fMo14464j) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            i10 = 3;
        }
        this.f20145f = i10;
        float f10 = 1;
        float fM22923b = f10 / (c10762bM16882K.m22919z().m22923b() * fMo14464j);
        float fM22924c = f10 / (c10762bM16882K.m22919z().m22924c() * fMo14464j);
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, false, interfaceC11935nM16898S.getMoveVerticalProgress(), fM22923b, false, interfaceC11935nM16898S.getMoveHorizontalProgress(), fM22924c, 79, null)));
    }

    /* renamed from: J */
    public final C9831a m16880J() {
        return this.f20141b;
    }

    /* renamed from: J0 */
    public final void m16881J0() {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S != null) {
            interfaceC11935nM16898S.mo14460f();
        }
    }

    /* renamed from: K */
    public final C10762b m16882K() {
        IBoardControl iBoardControl = this.f20142c;
        if (iBoardControl != null) {
            return iBoardControl.getConfig();
        }
        return null;
    }

    /* renamed from: K0 */
    public final void m16883K0(InterfaceC10218f interfaceC10218f) {
        this.f20144e = interfaceC10218f;
    }

    /* renamed from: L */
    public final InterfaceC11612u m16884L() {
        return this.f20154o;
    }

    /* renamed from: L0 */
    public final void m16885L0(InterfaceC10222j interfaceC10222j) {
        this.f20143d = interfaceC10222j;
    }

    /* renamed from: M */
    public final InterfaceC11607p m16886M() {
        return this.f20148i;
    }

    /* renamed from: M0 */
    public final void m16887M0(boolean z10) {
        if (z10) {
            InterfaceC11935n interfaceC11935nM16898S = m16898S();
            if (interfaceC11935nM16898S != null) {
                interfaceC11935nM16898S.mo14483z();
                return;
            }
            return;
        }
        InterfaceC11935n interfaceC11935nM16898S2 = m16898S();
        if (interfaceC11935nM16898S2 != null) {
            interfaceC11935nM16898S2.mo14469m();
        }
    }

    /* renamed from: N */
    public final InterfaceC11612u m16888N() {
        return this.f20164y;
    }

    /* renamed from: N0 */
    public final void m16889N0() {
        Object value;
        C8851m c8851m;
        AbstractC8856r abstractC8856r;
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
            c8851m = (C8851m) value;
            AbstractC8856r abstractC8856rM16982f = c8851m.m16982f();
            abstractC8856r = AbstractC8856r.a.f20299e;
            if (AbstractC9979u.m20289b(abstractC8856rM16982f, abstractC8856r)) {
                abstractC8856r = AbstractC8856r.d.f20302e;
            }
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b(c8851m, abstractC8856r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: O */
    public final InterfaceC11612u m16890O() {
        return this.f20160u;
    }

    /* renamed from: O0 */
    public final void m16891O0() {
        Object value;
        C8851m c8851m;
        AbstractC8856r abstractC8856r;
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
            c8851m = (C8851m) value;
            AbstractC8856r abstractC8856rM16982f = c8851m.m16982f();
            abstractC8856r = AbstractC8856r.b.f20300e;
            if (AbstractC9979u.m20289b(abstractC8856rM16982f, abstractC8856r)) {
                abstractC8856r = AbstractC8856r.d.f20302e;
            }
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b(c8851m, abstractC8856r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: P */
    public final InterfaceC11612u m16892P() {
        return this.f20156q;
    }

    /* renamed from: P0 */
    public final void m16893P0() {
        Object value;
        C8851m c8851m;
        AbstractC8856r abstractC8856r;
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
            c8851m = (C8851m) value;
            AbstractC8856r abstractC8856rM16982f = c8851m.m16982f();
            abstractC8856r = AbstractC8856r.c.f20301e;
            if (AbstractC9979u.m20289b(abstractC8856rM16982f, abstractC8856r)) {
                abstractC8856r = AbstractC8856r.d.f20302e;
            }
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b(c8851m, abstractC8856r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: Q */
    public final InterfaceC11612u m16894Q() {
        return this.f20138A;
    }

    /* renamed from: Q0 */
    public final void m16895Q0() {
        Object value;
        C8851m c8851m;
        AbstractC8856r abstractC8856r;
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
            c8851m = (C8851m) value;
            AbstractC8856r abstractC8856rM16982f = c8851m.m16982f();
            abstractC8856r = AbstractC8856r.e.f20303e;
            if (AbstractC9979u.m20289b(abstractC8856rM16982f, abstractC8856r)) {
                abstractC8856r = AbstractC8856r.d.f20302e;
            }
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b(c8851m, abstractC8856r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: R */
    public final InterfaceC11612u m16896R() {
        return this.f20150k;
    }

    /* renamed from: R0 */
    public final void m16897R0() {
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null) {
            return;
        }
        if (!interfaceC11935nM16898S.mo14479u()) {
            interfaceC11935nM16898S.mo14475q(this.f20139B);
        } else {
            this.f20139B = interfaceC11935nM16898S.mo14463i();
            interfaceC11935nM16898S.stopRecord();
        }
    }

    /* renamed from: S */
    public final InterfaceC11935n m16898S() {
        List listMo14433d;
        IBoardControl iBoardControl = this.f20142c;
        if (iBoardControl == null || (listMo14433d = iBoardControl.mo14433d()) == null) {
            return null;
        }
        return (InterfaceC11935n) AbstractC10947g0.m23946o0(listMo14433d);
    }

    /* renamed from: S0 */
    public final void m16899S0(int i10) {
        Object value;
        AbstractC8840b abstractC8840b = (AbstractC8840b) AbstractC8846h.m16965a().get(i10);
        InterfaceC11603l interfaceC11603l = this.f20157r;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8839a.m16943b((C8839a) value, false, abstractC8840b, 1, null)));
        C10762b c10762bM16882K = m16882K();
        if (c10762bM16882K == null) {
            return;
        }
        c10762bM16882K.m22879W(abstractC8840b.m16947a());
        BackgroundLineConfig backgroundLineConfigM22900j = c10762bM16882K.m22900j();
        backgroundLineConfigM22900j.m13715e(abstractC8840b.m16948b());
        backgroundLineConfigM22900j.m13717g(abstractC8840b.m16950d());
        backgroundLineConfigM22900j.m13716f(abstractC8840b.m16949c());
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null) {
            return;
        }
        if (abstractC8840b.m16947a() != interfaceC11935nM16898S.getBackgroundColor()) {
            interfaceC11935nM16898S.mo14461g(abstractC8840b.m16947a(), c10762bM16882K.m22900j());
        }
        AbstractC11584n.m25513j(Integer.valueOf(abstractC8840b.m16947a()));
    }

    /* renamed from: T */
    public final List m16900T() {
        List listMo14457c;
        if (!((Boolean) this.f20138A.getValue()).booleanValue()) {
            return AbstractC10978w.m24136n();
        }
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        return (interfaceC11935nM16898S == null || (listMo14457c = interfaceC11935nM16898S.mo14457c()) == null) ? AbstractC10978w.m24136n() : listMo14457c;
    }

    /* renamed from: T0 */
    public final void m16901T0() {
        C8847i c8847i = (C8847i) this.f20153n.getValue();
        C10762b c10762bM16882K = m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22897h0(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            c10762bM16882K.m22885b0(c8847i.m16971b().m16973b());
        }
    }

    /* renamed from: U */
    public final InterfaceC11612u m16902U() {
        return this.f20152m;
    }

    /* renamed from: U0 */
    public final void m16903U0() {
        C8858t c8858t = (C8858t) this.f20151l.getValue();
        C10762b c10762bM16882K = m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22897h0(c8858t.m17023g().m17024a());
            C10762b.m22856a0(c10762bM16882K, c8858t.m17023g().m17028e(), 0.0f, 0.0f, 6, null);
            float fFloatValue = ((Number) c8858t.m17023g().m17027d().get(c8858t.m17022f())).floatValue();
            c10762bM16882K.m22901j0(fFloatValue);
            c10762bM16882K.m22881Y(fFloatValue);
            int iM25476e = AbstractC11571a.m25476e(c8858t.m17021e().m17015a(), c8858t.m17023g().m17026c());
            c10762bM16882K.m22899i0(iM25476e);
            c10762bM16882K.m22880X(iM25476e);
            if (AbstractC11584n.m25509f() == null) {
                c10762bM16882K.m22875S(iM25476e);
            }
        }
    }

    /* renamed from: V */
    public final InterfaceC11612u m16904V() {
        return this.f20162w;
    }

    /* renamed from: V0 */
    public final void m16905V0(int i10) {
        Object value;
        AbstractC8848j abstractC8848j = (AbstractC8848j) AbstractC8846h.m16966b().get(i10);
        InterfaceC11603l interfaceC11603l = this.f20153n;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, ((C8847i) value).m16970a(abstractC8848j)));
        m16901T0();
        AbstractC11584n.m25514k(Float.valueOf(abstractC8848j.m16973b()));
    }

    /* renamed from: W */
    public final void m16906W(boolean z10, boolean z11, InterfaceC9544p error, InterfaceC9544p callback) {
        AbstractC9979u.m20294g(error, "error");
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$getSavePath$3(this, z10, z11, callback, error, null), 3, null);
    }

    /* renamed from: W0 */
    public final void m16907W0(boolean z10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updateExpandState$1(this, z10, null), 3, null);
    }

    /* renamed from: X0 */
    public final void m16908X0(AbstractC8853o graphType) {
        AbstractC8853o abstractC8853o;
        AbstractC9979u.m20294g(graphType, "graphType");
        m16914b1(AbstractC8855q.b.f20292e);
        InterfaceC11603l interfaceC11603l = this.f20155p;
        while (true) {
            Object value = interfaceC11603l.getValue();
            abstractC8853o = graphType;
            if (interfaceC11603l.mo20870e(value, C8852n.m16988b((C8852n) value, false, false, false, false, abstractC8853o, 15, null))) {
                break;
            } else {
                graphType = abstractC8853o;
            }
        }
        C10762b c10762bM16882K = m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22897h0(EzyModeEnum.ModeEnum.ACTION_GEOMETRY);
            c10762bM16882K.m22889d0(abstractC8853o.m16995a());
        }
    }

    /* renamed from: Y */
    public final void m16909Y() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: Y0 */
    public final void m16910Y0(boolean z10) {
        boolean z11;
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null) {
            return;
        }
        InterfaceC11603l interfaceC11603l = this.f20161v;
        while (true) {
            Object value = interfaceC11603l.getValue();
            z11 = z10;
            if (interfaceC11603l.mo20870e(value, C8860v.m17029b((C8860v) value, null, z11, null, 5, null))) {
                break;
            } else {
                z10 = z11;
            }
        }
        if (z11) {
            interfaceC11935nM16898S.mo14458d();
            ToastUtils.showShort(R$string.turn_on_micro_phone);
        } else {
            interfaceC11935nM16898S.mo14476r();
            ToastUtils.showShort(R$string.turn_off_micro_phone);
        }
    }

    /* renamed from: Z */
    public final void m16911Z() {
        Object value;
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, AbstractC8856r.d.f20302e, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    /* renamed from: a0 */
    public final void m16912a0(InterfaceC11935n interfaceC11935n) {
        AbstractC9902x1.m19967c(interfaceC11935n, new InterfaceC9529a() { // from class: kb.f1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardViewModel.m16832b0(this.f23154c);
            }
        }, new InterfaceC9544p() { // from class: kb.g1
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m16834c0(this.f23157c, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, new InterfaceC9529a() { // from class: kb.h1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardViewModel.m16836d0(this.f23160c);
            }
        });
    }

    /* renamed from: a1 */
    public final void m16913a1(AbstractC8856r minorToolType) {
        AbstractC9979u.m20294g(minorToolType, "minorToolType");
        InterfaceC11603l interfaceC11603l = this.f20159t;
        while (true) {
            Object value = interfaceC11603l.getValue();
            AbstractC8856r abstractC8856r = minorToolType;
            if (interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, abstractC8856r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null))) {
                return;
            } else {
                minorToolType = abstractC8856r;
            }
        }
    }

    /* renamed from: b1 */
    public final void m16914b1(AbstractC8855q mainToolType) {
        AbstractC8855q abstractC8855q;
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        InterfaceC11603l interfaceC11603l = this.f20149j;
        while (true) {
            Object value = interfaceC11603l.getValue();
            abstractC8855q = mainToolType;
            if (interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, false, false, false, false, false, abstractC8855q, 31, null))) {
                break;
            } else {
                mainToolType = abstractC8855q;
            }
        }
        if (AbstractC9979u.m20289b(abstractC8855q, AbstractC8855q.d.f20294e)) {
            C10762b c10762bM16882K = m16882K();
            if (c10762bM16882K != null) {
                c10762bM16882K.m22897h0(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
                return;
            }
            return;
        }
        if (AbstractC9979u.m20289b(abstractC8855q, AbstractC8855q.c.f20293e)) {
            m16903U0();
        } else if (AbstractC9979u.m20289b(abstractC8855q, AbstractC8855q.a.f20291e)) {
            m16901T0();
        } else if (!AbstractC9979u.m20289b(abstractC8855q, AbstractC8855q.b.f20292e)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c1 */
    public final void m16915c1(int i10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenColorLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: d1 */
    public final void m16916d1(int i10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenSizeLevel$1(this, i10, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16917e0(p307q9.C10762b r8) {
        /*
            r7 = this;
            java.lang.Integer r0 = p378vb.AbstractC11584n.m25504a()
            r1 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.intValue()
            java.util.List r2 = com.zykj.view.board.board.AbstractC8846h.m16965a()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L14:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()
            com.zykj.view.board.board.b r4 = (com.zykj.view.board.board.AbstractC8840b) r4
            int r4 = r4.m16947a()
            if (r4 != r0) goto L28
            goto L2c
        L28:
            int r3 = r3 + 1
            goto L14
        L2b:
            r3 = r5
        L2c:
            if (r3 != r5) goto L2f
        L2e:
            r3 = r1
        L2f:
            java.util.List r0 = com.zykj.view.board.board.AbstractC8846h.m16965a()
            java.lang.Object r0 = r0.get(r3)
            com.zykj.view.board.board.b r0 = (com.zykj.view.board.board.AbstractC8840b) r0
            vd.l r2 = r7.f20157r
        L3b:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.zykj.view.board.board.a r4 = (com.zykj.view.board.board.C8839a) r4
            r5 = 0
            r6 = 1
            com.zykj.view.board.board.a r4 = com.zykj.view.board.board.C8839a.m16943b(r4, r1, r0, r6, r5)
            boolean r3 = r2.mo20870e(r3, r4)
            if (r3 == 0) goto L3b
            int r1 = r0.m16947a()
            r8.m22879W(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig r8 = r8.m22900j()
            int r1 = r0.m16948b()
            r8.m13715e(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig$BackgroundLineType r1 = r0.m16950d()
            r8.m13717g(r1)
            float r0 = r0.m16949c()
            r8.m13716f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.m16917e0(q9.b):void"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/view/board/board/BoardViewModel.smali:5976
    }

    /* renamed from: e1 */
    public final void m16918e1(AbstractC8859u penType) {
        AbstractC9979u.m20294g(penType, "penType");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: f0 */
    public final void m16919f0(IBoardControl boardControl, boolean z10, long j10) {
        Object value;
        Object value2;
        AbstractC9979u.m20294g(boardControl, "boardControl");
        LogUtils.m3888i("initBoardControl Start");
        this.f20142c = boardControl;
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, z10, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        if (j10 > 0) {
            InterfaceC11603l interfaceC11603l2 = this.f20161v;
            do {
                value2 = interfaceC11603l2.getValue();
            } while (!interfaceC11603l2.mo20870e(value2, C8860v.m17029b((C8860v) value2, AbstractC8861w.a.f20337f, false, C11585o.f27488a.m25522b(j10), 2, null)));
        }
        C10762b c10762bM16882K = m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22903k0(48.0f);
            C9836b1 c9836b1 = this.f20140a;
            if (c9836b1 != null) {
                c10762bM16882K.m22895g0(c9836b1.m19947b());
            }
            m16920f1(!AbstractC9979u.m20289b(AbstractC11584n.m25511h(), Boolean.FALSE));
            m16872E0(c10762bM16882K);
            m16917e0(c10762bM16882K);
            c10762bM16882K.m22893f0(this.f20144e);
            m16929r0(c10762bM16882K);
            m16924j0(c10762bM16882K);
            m16931t0(c10762bM16882K);
            m16914b1(AbstractC8855q.c.f20293e);
        }
        final InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: kb.k1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16840g0(this.f23170c, (InterfaceC11935n) obj);
            }
        };
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S != null) {
            LogUtils.m3888i("pageControl is not Null");
            interfaceC9540l.invoke(interfaceC11935nM16898S);
        } else {
            LogUtils.m3888i("pageControl is Null");
            IBoardControl.DefaultImpls.m14446a(boardControl, false, new InterfaceC9529a() { // from class: kb.l1
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return BoardViewModel.m16843h0(this.f23174c, interfaceC9540l);
                }
            }, 1, null);
        }
        LogUtils.m3888i("initBoardControl Finished");
    }

    /* renamed from: f1 */
    public final void m16920f1(boolean z10) {
        boolean z11;
        InterfaceC11603l interfaceC11603l = this.f20149j;
        while (true) {
            Object value = interfaceC11603l.getValue();
            z11 = z10;
            if (interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, false, false, false, false, z11, null, 47, null))) {
                break;
            } else {
                z10 = z11;
            }
        }
        C10762b c10762bM16882K = m16882K();
        if (c10762bM16882K != null) {
            c10762bM16882K.m22887c0(z11);
        }
        AbstractC11584n.m25520q(Boolean.valueOf(z11));
    }

    /* renamed from: h1 */
    public final void m16921h1(C8842d boardViewConfig) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        AbstractC9979u.m20294g(boardViewConfig, "boardViewConfig");
        InterfaceC11603l interfaceC11603l = this.f20149j;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, boardViewConfig.m16960h(), boardViewConfig.m16962j(), false, false, false, null, 60, null)));
        InterfaceC11603l interfaceC11603l2 = this.f20151l;
        do {
            value2 = interfaceC11603l2.getValue();
        } while (!interfaceC11603l2.mo20870e(value2, C8858t.m17017b((C8858t) value2, boardViewConfig.m16956d(), boardViewConfig.m16959g(), null, 0, null, 28, null)));
        InterfaceC11603l interfaceC11603l3 = this.f20155p;
        do {
            value3 = interfaceC11603l3.getValue();
        } while (!interfaceC11603l3.mo20870e(value3, C8852n.m16988b((C8852n) value3, boardViewConfig.m16957e(), boardViewConfig.m16955c(), boardViewConfig.m16961i(), boardViewConfig.m16958f(), null, 16, null)));
        InterfaceC11603l interfaceC11603l4 = this.f20157r;
        do {
            value4 = interfaceC11603l4.getValue();
        } while (!interfaceC11603l4.mo20870e(value4, C8839a.m16943b((C8839a) value4, boardViewConfig.m16954b(), null, 2, null)));
        InterfaceC11603l interfaceC11603l5 = this.f20159t;
        do {
            value5 = interfaceC11603l5.getValue();
        } while (!interfaceC11603l5.mo20870e(value5, C8851m.m16977b((C8851m) value5, null, boardViewConfig.m16953a(), false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 509, null)));
    }

    /* renamed from: i0 */
    public final void m16922i0(C9831a boardCallbackConfig) {
        AbstractC9979u.m20294g(boardCallbackConfig, "boardCallbackConfig");
        this.f20141b = boardCallbackConfig;
    }

    /* renamed from: i1 */
    public final void m16923i1(boolean z10) {
        int i10;
        Object value;
        int i11 = this.f20145f;
        if (z10 && i11 < AbstractC8846h.m16969e().size() - 1) {
            this.f20145f++;
        } else if (!z10 && (i10 = this.f20145f) > 0) {
            this.f20145f = i10 - 1;
        }
        if (i11 == this.f20145f) {
            return;
        }
        float fM17038a = ((AbstractC8862x) AbstractC8846h.m16969e().get(this.f20145f)).m17038a();
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null) {
            return;
        }
        PointF pointF = this.f20146g;
        interfaceC11935nM16898S.mo14474p(pointF.x, pointF.y, fM17038a);
        float moveVerticalProgress = interfaceC11935nM16898S.getMoveVerticalProgress();
        float moveHorizontalProgress = interfaceC11935nM16898S.getMoveHorizontalProgress();
        float f10 = moveVerticalProgress > 1.0f ? 1.0f : moveVerticalProgress < 0.0f ? 0.0f : moveVerticalProgress;
        float f11 = moveHorizontalProgress <= 1.0f ? moveHorizontalProgress < 0.0f ? 0.0f : fM17038a <= 1.0f ? 0.5f : moveHorizontalProgress : 1.0f;
        if (f10 != moveVerticalProgress || f11 != moveHorizontalProgress) {
            interfaceC11935nM16898S.areaMoveStart();
            interfaceC11935nM16898S.areaMoveEnd(Float.valueOf(f11), Float.valueOf(f10));
        }
        if (m16882K() == null) {
            return;
        }
        float f12 = 1;
        float fM22923b = f12 / (r3.m22919z().m22923b() * fM17038a);
        float fM22924c = f12 / (r3.m22919z().m22924c() * fM17038a);
        InterfaceC11603l interfaceC11603l = this.f20159t;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8851m.m16977b((C8851m) value, null, null, false, false, 0.0f, fM22923b, false, 0.0f, fM22924c, 223, null)));
    }

    /* renamed from: j0 */
    public final void m16924j0(C10762b c10762b) {
        Object value;
        Float fM25505b = AbstractC11584n.m25505b();
        int i10 = 0;
        if (fM25505b != null) {
            float fFloatValue = fM25505b.floatValue();
            Iterator it = AbstractC8846h.m16966b().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (((AbstractC8848j) it.next()).m16973b() == fFloatValue) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        AbstractC8848j abstractC8848j = (AbstractC8848j) AbstractC8846h.m16966b().get(i10);
        InterfaceC11603l interfaceC11603l = this.f20153n;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, ((C8847i) value).m16970a(abstractC8848j)));
    }

    /* renamed from: k0 */
    public final void m16925k0(InterfaceC11935n interfaceC11935n) {
        AbstractC9902x1.m19966b(interfaceC11935n, new InterfaceC9540l() { // from class: kb.i1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16848l0(this.f23164c, (CommandInfoEntity) obj);
            }
        });
    }

    /* renamed from: m0 */
    public final void m16926m0(final InterfaceC11935n interfaceC11935n) {
        interfaceC11935n.mo14470n(new InterfaceC9540l() { // from class: kb.d1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16851n0(this.f23147c, interfaceC11935n, (String) obj);
            }
        });
    }

    /* renamed from: o0 */
    public final void m16927o0(InterfaceC11935n interfaceC11935n) {
        interfaceC11935n.mo14467l(new C8837b());
    }

    /* renamed from: p0 */
    public final void m16928p0(InterfaceC11935n interfaceC11935n) {
        AbstractC9902x1.m19968d(interfaceC11935n, new InterfaceC9540l() { // from class: kb.e1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16855q0(this.f23151c, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* renamed from: r0 */
    public final void m16929r0(C10762b c10762b) {
        C9836b1 c9836b1 = this.f20140a;
        if (c9836b1 == null) {
            return;
        }
        if (!c9836b1.m19949d()) {
            c10762b.m22919z().m22933l(false);
            return;
        }
        C10764d c10764dM22919z = c10762b.m22919z();
        c10764dM22919z.m22933l(true);
        c10764dM22919z.m22936o(true);
        c10764dM22919z.m22930i(true);
        c10764dM22919z.m22932k(1);
        c10764dM22919z.m22931j(c9836b1.m19946a());
    }

    /* renamed from: s0 */
    public final void m16930s0(InterfaceC11935n interfaceC11935n) {
        LogUtils.m3888i("initPageControl Start");
        m16927o0(interfaceC11935n);
        m16932u0(interfaceC11935n);
        m16928p0(interfaceC11935n);
        m16869B0(interfaceC11935n);
        m16926m0(interfaceC11935n);
        m16912a0(interfaceC11935n);
        m16925k0(interfaceC11935n);
        m16934y0(interfaceC11935n);
        m16877H0();
        m16879I0();
        LogUtils.m3888i("initPageControl Finished");
    }

    /* renamed from: t0 */
    public final void m16931t0(C10762b c10762b) {
        Object value;
        C8858t c8858t;
        AbstractC8859u abstractC8859u;
        int iIntValue;
        Object next;
        AbstractC8857s abstractC8857s;
        InterfaceC11603l interfaceC11603l = this.f20151l;
        do {
            value = interfaceC11603l.getValue();
            c8858t = (C8858t) value;
            List listM16968d = AbstractC8846h.m16968d();
            Integer numM25508e = AbstractC11584n.m25508e();
            abstractC8859u = (AbstractC8859u) listM16968d.get(numM25508e != null ? numM25508e.intValue() : 0);
            Integer numM25507d = AbstractC11584n.m25507d();
            iIntValue = numM25507d != null ? numM25507d.intValue() : 0;
            List listM16967c = AbstractC8846h.m16967c();
            Iterator it = listM16967c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int iM17015a = ((AbstractC8857s) next).m17015a();
                Integer numM25506c = AbstractC11584n.m25506c();
                if (numM25506c != null && iM17015a == numM25506c.intValue()) {
                    break;
                }
            }
            abstractC8857s = (AbstractC8857s) next;
            if (abstractC8857s == null) {
                abstractC8857s = (AbstractC8857s) AbstractC10947g0.m23944m0(listM16967c);
            }
        } while (!interfaceC11603l.mo20870e(value, C8858t.m17017b(c8858t, false, false, abstractC8859u, iIntValue, abstractC8857s, 3, null)));
    }

    /* renamed from: u0 */
    public final void m16932u0(InterfaceC11935n interfaceC11935n) {
        AbstractC9902x1.m19969e(interfaceC11935n, new InterfaceC9529a() { // from class: kb.m1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardViewModel.m16861v0(this.f23178c);
            }
        }, new InterfaceC9540l() { // from class: kb.n1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return BoardViewModel.m16863w0(this.f23182c, ((Long) obj).longValue());
            }
        }, new InterfaceC9529a() { // from class: kb.o1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BoardViewModel.m16864x0(this.f23186c);
            }
        });
    }

    /* renamed from: x */
    public final void m16933x(Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, String filename, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(scaleTypeEnum, "scaleTypeEnum");
        AbstractC9979u.m20294g(filename, "filename");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$addImageGraph$1(this, bitmap, filename, scaleTypeEnum, str, interfaceC9540l, z10, null), 3, null);
    }

    /* renamed from: y0 */
    public final void m16934y0(InterfaceC11935n interfaceC11935n) {
        AbstractC9902x1.m19965a(interfaceC11935n, new InterfaceC9544p() { // from class: kb.j1
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m16866z0(this.f23167c, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* renamed from: z */
    public final void m16935z(String content) {
        C5414d c5414dM26490c;
        Object value;
        AbstractC9979u.m20294g(content, "content");
        InterfaceC11935n interfaceC11935nM16898S = m16898S();
        if (interfaceC11935nM16898S == null || (c5414dM26490c = InterfaceC11935n.a.m26490c(interfaceC11935nM16898S, content, EzyPositionEnum.PositionEnum.CENTER, 0, 4, null)) == null) {
            return;
        }
        InterfaceC11603l interfaceC11603l = this.f20149j;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, false, false, false, false, false, AbstractC8855q.d.f20294e, 31, null)));
        interfaceC11935nM16898S.mo14455F(AbstractC10976v.m24126e(c5414dM26490c.getId()));
    }
}
