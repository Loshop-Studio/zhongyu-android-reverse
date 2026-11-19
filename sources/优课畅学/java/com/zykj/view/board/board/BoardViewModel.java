package com.zykj.view.board.board;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.AbstractC5380q;
import com.blankj.utilcode.util.ToastUtils;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IBoardControl;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.listener.ImageCropView;
import com.zykj.blackboard.listener.TextEditView;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.R$string;
import com.zykj.view.board.board.AbstractC8221q;
import com.zykj.view.board.board.AbstractC8222r;
import com.zykj.view.board.board.AbstractC8227w;
import com.zykj.view.board.board.AbstractC8228x;
import com.zykj.view.board.board.BoardViewModel;
import com.zykj.view.utils.ZoomPointSolution;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0027a;
import p007a6.AbstractC0040n;
import p007a6.C0041o;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;
import p210p5.AbstractC9745x1;
import p210p5.C9674a;
import p210p5.C9679b1;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class BoardViewModel extends ViewModel {

    /* renamed from: A */
    public final InterfaceC9280q f14921A;

    /* renamed from: B */
    public boolean f14922B;

    /* renamed from: a */
    public C9679b1 f14923a;

    /* renamed from: b */
    public C9674a f14924b;

    /* renamed from: c */
    public IBoardControl f14925c;

    /* renamed from: d */
    public TextEditView f14926d;

    /* renamed from: e */
    public ImageCropView f14927e;

    /* renamed from: f */
    public int f14928f = AbstractC8212h.m12853e().indexOf(AbstractC8228x.d.f15129c);

    /* renamed from: g */
    public final PointF f14929g = new PointF();

    /* renamed from: h */
    public final InterfaceC9270g f14930h;

    /* renamed from: i */
    public final InterfaceC9275l f14931i;

    /* renamed from: j */
    public final InterfaceC9271h f14932j;

    /* renamed from: k */
    public final InterfaceC9280q f14933k;

    /* renamed from: l */
    public final InterfaceC9271h f14934l;

    /* renamed from: m */
    public final InterfaceC9280q f14935m;

    /* renamed from: n */
    public final InterfaceC9271h f14936n;

    /* renamed from: o */
    public final InterfaceC9280q f14937o;

    /* renamed from: p */
    public final InterfaceC9271h f14938p;

    /* renamed from: q */
    public final InterfaceC9280q f14939q;

    /* renamed from: r */
    public final InterfaceC9271h f14940r;

    /* renamed from: s */
    public final InterfaceC9280q f14941s;

    /* renamed from: t */
    public final InterfaceC9271h f14942t;

    /* renamed from: u */
    public final InterfaceC9280q f14943u;

    /* renamed from: v */
    public final InterfaceC9271h f14944v;

    /* renamed from: w */
    public final InterfaceC9280q f14945w;

    /* renamed from: x */
    public final InterfaceC9271h f14946x;

    /* renamed from: y */
    public final InterfaceC9280q f14947y;

    /* renamed from: z */
    public final InterfaceC9271h f14948z;

    /* renamed from: com.zykj.view.board.board.BoardViewModel$a */
    public static final /* synthetic */ class C8201a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14949a;

        static {
            int[] iArr = new int[ZoomPointSolution.values().length];
            try {
                iArr[ZoomPointSolution.f15557b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomPointSolution.f15558c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomPointSolution.f15559d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoomPointSolution.f15560e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoomPointSolution.f15562g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoomPointSolution.f15561f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZoomPointSolution.f15563h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZoomPointSolution.f15564i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ZoomPointSolution.f15565j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f14949a = iArr;
        }
    }

    /* renamed from: com.zykj.view.board.board.BoardViewModel$b */
    public static final class C8203b implements GraphDeleteListener {
        public C8203b() {
        }

        @Override // com.zykj.blackboard.listener.GraphDeleteListener
        public void onGraphDelete(IGraph graph) {
            C9674a c9674aM12768J;
            InterfaceC10570l interfaceC10570lM18245g;
            AbstractC9133u.m16133g(graph, "graph");
            if (!(graph instanceof ImageGraph) || (c9674aM12768J = BoardViewModel.this.m12768J()) == null || (interfaceC10570lM18245g = c9674aM12768J.m18245g()) == null) {
                return;
            }
            String filePath = ((ImageGraph) graph).getFilePath();
            if (filePath == null) {
                filePath = "";
            }
            interfaceC10570lM18245g.invoke(filePath);
        }
    }

    public BoardViewModel() {
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f14930h = interfaceC9270gM17044b;
        this.f14931i = AbstractC9268e.m17011a(interfaceC9270gM17044b);
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(new C8220p(false, false, false, false, false, null, 63, null));
        this.f14932j = interfaceC9271hM17054a;
        this.f14933k = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        InterfaceC9271h interfaceC9271hM17054a2 = AbstractC9281r.m17054a(new C8224t(false, false, null, 0, null, 31, null));
        this.f14934l = interfaceC9271hM17054a2;
        this.f14935m = AbstractC9268e.m17012b(interfaceC9271hM17054a2);
        InterfaceC9271h interfaceC9271hM17054a3 = AbstractC9281r.m17054a(new C8213i(null, 1, null));
        this.f14936n = interfaceC9271hM17054a3;
        this.f14937o = AbstractC9268e.m17012b(interfaceC9271hM17054a3);
        InterfaceC9271h interfaceC9271hM17054a4 = AbstractC9281r.m17054a(new C8218n(false, false, false, false, null, 31, null));
        this.f14938p = interfaceC9271hM17054a4;
        this.f14939q = AbstractC9268e.m17012b(interfaceC9271hM17054a4);
        InterfaceC9271h interfaceC9271hM17054a5 = AbstractC9281r.m17054a(new C8205a(false, null, 3, null));
        this.f14940r = interfaceC9271hM17054a5;
        this.f14941s = AbstractC9268e.m17012b(interfaceC9271hM17054a5);
        InterfaceC9271h interfaceC9271hM17054a6 = AbstractC9281r.m17054a(new C8217m(null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 511, null));
        this.f14942t = interfaceC9271hM17054a6;
        this.f14943u = AbstractC9268e.m17012b(interfaceC9271hM17054a6);
        InterfaceC9271h interfaceC9271hM17054a7 = AbstractC9281r.m17054a(new C8226v(null, false, null, 7, null));
        this.f14944v = interfaceC9271hM17054a7;
        this.f14945w = AbstractC9268e.m17012b(interfaceC9271hM17054a7);
        InterfaceC9271h interfaceC9271hM17054a8 = AbstractC9281r.m17054a(new C8215k(null, 1, null));
        this.f14946x = interfaceC9271hM17054a8;
        this.f14947y = AbstractC9268e.m17012b(interfaceC9271hM17054a8);
        InterfaceC9271h interfaceC9271hM17054a9 = AbstractC9281r.m17054a(Boolean.FALSE);
        this.f14948z = interfaceC9271hM17054a9;
        this.f14921A = AbstractC9268e.m17012b(interfaceC9271hM17054a9);
        this.f14922B = true;
    }

    /* renamed from: B */
    public static /* synthetic */ void m12711B(BoardViewModel boardViewModel, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m12755A(f10, f11);
    }

    /* renamed from: B0 */
    public static final C8736p m12712B0(BoardViewModel boardViewModel, int i10) {
        AbstractC0040n.m111o(Integer.valueOf(i10));
        BoardConfig boardConfigM12770K = boardViewModel.m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setAddTextOriginalTextColor(i10);
        }
        return C8736p.f16368a;
    }

    /* renamed from: C0 */
    public static final C8736p m12713C0(BoardViewModel boardViewModel, float f10) {
        AbstractC0040n.m112p(Float.valueOf(f10));
        BoardConfig boardConfigM12770K = boardViewModel.m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setAddTextOriginalTextSize(f10);
        }
        return C8736p.f16368a;
    }

    /* renamed from: E */
    public static /* synthetic */ void m12714E(BoardViewModel boardViewModel, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        boardViewModel.m12758D(f10, f11);
    }

    /* renamed from: H */
    public static final C8736p m12715H(BoardViewModel boardViewModel) {
        IPageControl iPageControlM12786S = boardViewModel.m12786S();
        if (iPageControlM12786S != null) {
            boardViewModel.m12814r0(iPageControlM12786S);
        } else {
            ToastUtils.m2403s("画板初始化失败，请退出后重试", new Object[0]);
        }
        return C8736p.f16368a;
    }

    /* renamed from: W */
    public static /* synthetic */ void m12716W(BoardViewModel boardViewModel, boolean z10, boolean z11, InterfaceC10574p interfaceC10574p, InterfaceC10574p interfaceC10574p2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            C9679b1 c9679b1 = boardViewModel.f14923a;
            z10 = c9679b1 != null ? c9679b1.m18251c() : true;
        }
        if ((i10 & 2) != 0) {
            C9679b1 c9679b12 = boardViewModel.f14923a;
            z11 = c9679b12 != null ? c9679b12.m18254f() : false;
        }
        if ((i10 & 4) != 0) {
            interfaceC10574p = new BoardViewModel$getSavePath$1(null);
        }
        if ((i10 & 8) != 0) {
            interfaceC10574p2 = new BoardViewModel$getSavePath$2(null);
        }
        boardViewModel.m12792V(z10, z11, interfaceC10574p, interfaceC10574p2);
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m12717X0(BoardViewModel boardViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !((C8226v) boardViewModel.f14944v.getValue()).m12917e();
        }
        boardViewModel.m12794W0(z10);
    }

    /* renamed from: a0 */
    public static final C8736p m12719a0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC9271h interfaceC9271h = boardViewModel.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 439, null)));
        return C8736p.f16368a;
    }

    /* renamed from: b0 */
    public static final C8736p m12721b0(BoardViewModel boardViewModel, float f10, float f11) {
        InterfaceC9271h interfaceC9271h = boardViewModel.f14942t;
        while (true) {
            Object value = interfaceC9271h.getValue();
            float f12 = f10;
            float f13 = f11;
            if (interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, false, f12, 0.0f, false, f13, 0.0f, 367, null))) {
                return C8736p.f16368a;
            }
            f10 = f12;
            f11 = f13;
        }
    }

    /* renamed from: c0 */
    public static final C8736p m12723c0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC9271h interfaceC9271h = boardViewModel.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, true, 0.0f, 0.0f, true, 0.0f, 0.0f, 439, null)));
        return C8736p.f16368a;
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m12725d1(BoardViewModel boardViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !((C8220p) boardViewModel.f14932j.getValue()).m12889g();
        }
        boardViewModel.m12802c1(z10);
    }

    /* renamed from: f0 */
    public static final C8736p m12728f0(BoardViewModel boardViewModel, IPageControl it) {
        InterfaceC10559a interfaceC10559aM18246h;
        AbstractC9133u.m16133g(it, "it");
        boardViewModel.m12814r0(it);
        boardViewModel.f14948z.mo16670a(Boolean.TRUE);
        C9674a c9674a = boardViewModel.f14924b;
        if (c9674a != null && (interfaceC10559aM18246h = c9674a.m18246h()) != null) {
            interfaceC10559aM18246h.invoke();
        }
        return C8736p.f16368a;
    }

    /* renamed from: g0 */
    public static final C8736p m12730g0(BoardViewModel boardViewModel, InterfaceC10570l interfaceC10570l) {
        IPageControl iPageControlM12786S = boardViewModel.m12786S();
        if (iPageControlM12786S != null) {
            interfaceC10570l.invoke(iPageControlM12786S);
        } else {
            ToastUtils.m2403s("画板加载失败，请退出后重试", new Object[0]);
        }
        return C8736p.f16368a;
    }

    /* renamed from: k0 */
    public static final C8736p m12735k0(BoardViewModel boardViewModel, CommandInfoEntity commandInfoEntity) {
        Object value;
        AbstractC9133u.m16133g(commandInfoEntity, "<unused var>");
        InterfaceC9271h interfaceC9271h = boardViewModel.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 507, null)));
        return C8736p.f16368a;
    }

    /* renamed from: m0 */
    public static final C8736p m12738m0(BoardViewModel boardViewModel, IPageControl iPageControl, String graph) {
        Object value;
        Object value2;
        AbstractC9133u.m16133g(graph, "graph");
        InterfaceC9271h interfaceC9271h = boardViewModel.f14932j;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, false, false, false, false, false, AbstractC8221q.d.f15078e, 31, null)));
        InterfaceC9271h interfaceC9271h2 = boardViewModel.f14942t;
        do {
            value2 = interfaceC9271h2.getValue();
        } while (!interfaceC9271h2.mo16686e(value2, C8217m.m12861b((C8217m) value2, AbstractC8222r.d.f15086e, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
        iPageControl.newSelectGraph(AbstractC8807u.m14755e(graph));
        return C8736p.f16368a;
    }

    /* renamed from: p0 */
    public static final C8736p m12742p0(BoardViewModel boardViewModel, boolean z10) {
        InterfaceC9271h interfaceC9271h = boardViewModel.f14944v;
        while (true) {
            Object value = interfaceC9271h.getValue();
            boolean z11 = z10;
            if (interfaceC9271h.mo16686e(value, C8226v.m12913b((C8226v) value, null, z11, null, 5, null))) {
                return C8736p.f16368a;
            }
            z10 = z11;
        }
    }

    /* renamed from: u0 */
    public static final C8736p m12748u0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC9271h interfaceC9271h = boardViewModel.f14944v;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8226v.m12913b((C8226v) value, AbstractC8227w.c.f15123f, false, null, 6, null)));
        return C8736p.f16368a;
    }

    /* renamed from: v0 */
    public static final C8736p m12750v0(BoardViewModel boardViewModel, long j10) {
        Object value;
        InterfaceC9271h interfaceC9271h = boardViewModel.f14944v;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8226v.m12913b((C8226v) value, null, false, C0041o.f109a.m115b(j10), 3, null)));
        return C8736p.f16368a;
    }

    /* renamed from: w0 */
    public static final C8736p m12752w0(BoardViewModel boardViewModel) {
        Object value;
        InterfaceC9271h interfaceC9271h = boardViewModel.f14944v;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8226v.m12913b((C8226v) value, AbstractC8227w.a.f15121f, false, null, 6, null)));
        return C8736p.f16368a;
    }

    /* renamed from: y */
    public static /* synthetic */ void m12753y(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, String str2, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
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
            interfaceC10570l = null;
        }
        boardViewModel.m12817x(bitmap, str, scaleTypeEnum, z10, str2, interfaceC10570l);
    }

    /* renamed from: y0 */
    public static final C8736p m12754y0(BoardViewModel boardViewModel, boolean z10, boolean z11) {
        InterfaceC9271h interfaceC9271h = boardViewModel.f14932j;
        while (true) {
            Object value = interfaceC9271h.getValue();
            boolean z12 = z10;
            boolean z13 = z11;
            if (interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, false, false, z12, z13, false, null, 51, null))) {
                boardViewModel.m12764G0();
                return C8736p.f16368a;
            }
            z10 = z12;
            z11 = z13;
        }
    }

    /* renamed from: A */
    public final void m12755A(Float f10, Float f11) {
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S != null) {
            iPageControlM12786S.areaMoveEnd(f10, f11);
        }
    }

    /* renamed from: A0 */
    public final void m12756A0(IPageControl iPageControl) {
        AbstractC9745x1.m18273f(iPageControl, new InterfaceC10570l() { // from class: p5.p1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12712B0(this.f19428a, ((Integer) obj).intValue());
            }
        }, new InterfaceC10570l() { // from class: p5.q1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12713C0(this.f19432a, ((Float) obj).floatValue());
            }
        });
    }

    /* renamed from: C */
    public final void m12757C() {
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S != null) {
            iPageControlM12786S.areaMoveStart();
        }
    }

    /* renamed from: D */
    public final void m12758D(Float f10, Float f11) {
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S != null) {
            iPageControlM12786S.areaMoving(f10, f11);
        }
    }

    /* renamed from: D0 */
    public final void m12759D0(BoardConfig boardConfig) {
        boardConfig.setAddTextOriginalText("");
        Integer numM102f = AbstractC0040n.m102f();
        boardConfig.setAddTextOriginalTextColor(numM102f != null ? numM102f.intValue() : ((C8224t) this.f14934l.getValue()).m12905e().m12899a());
        Float fM103g = AbstractC0040n.m103g();
        if (fM103g != null) {
            boardConfig.setAddTextOriginalTextSize(fM103g.floatValue());
        }
        boardConfig.getAddTextRectF().right = 600.0f;
        boardConfig.setTextEditView(this.f14926d);
    }

    /* renamed from: E0 */
    public final void m12760E0(float f10, float f11) {
        float f12 = 2;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        PointF pointF = this.f14929g;
        C9679b1 c9679b1 = this.f14923a;
        ZoomPointSolution zoomPointSolutionM18253e = c9679b1 != null ? c9679b1.m18253e() : null;
        switch (zoomPointSolutionM18253e == null ? -1 : C8201a.f14949a[zoomPointSolutionM18253e.ordinal()]) {
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

    /* renamed from: F */
    public final void m12761F() {
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S != null) {
            IPageControl.DefaultImpls.cleanPage$default(iPageControlM12786S, null, 1, null);
        }
    }

    /* renamed from: F0 */
    public final boolean m12762F0() {
        IPageControl iPageControlM12786S = m12786S();
        int imageGraphCount = iPageControlM12786S != null ? iPageControlM12786S.getImageGraphCount() : 0;
        C9679b1 c9679b1 = this.f14923a;
        return imageGraphCount >= (c9679b1 != null ? c9679b1.m18250b() : 3);
    }

    /* renamed from: G */
    public final void m12763G() {
        Object value;
        Object value2;
        IBoardControl iBoardControl = this.f14925c;
        if (iBoardControl == null) {
            return;
        }
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 507, null)));
        InterfaceC9271h interfaceC9271h2 = this.f14944v;
        do {
            value2 = interfaceC9271h2.getValue();
        } while (!interfaceC9271h2.mo16686e(value2, C8226v.m12913b((C8226v) value2, AbstractC8227w.b.f15122f, false, null, 6, null)));
        IBoardControl.DefaultImpls.deletePage$default(iBoardControl, 0, null, 2, null);
        IBoardControl.DefaultImpls.createPage$default(iBoardControl, false, new InterfaceC10559a() { // from class: p5.c1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardViewModel.m12715H(this.f19383a);
            }
        }, 1, null);
    }

    /* renamed from: G0 */
    public final void m12764G0() {
        Object value;
        C8205a c8205a;
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null) {
            return;
        }
        int backgroundColor = iPageControlM12786S.getBackgroundColor();
        InterfaceC9271h interfaceC9271h = this.f14940r;
        do {
            value = interfaceC9271h.getValue();
            c8205a = (C8205a) value;
            for (AbstractC8206b abstractC8206b : AbstractC8212h.m12849a()) {
                if (abstractC8206b.m12831a() == backgroundColor) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!interfaceC9271h.mo16686e(value, C8205a.m12827b(c8205a, false, abstractC8206b, 1, null)));
    }

    /* renamed from: H0 */
    public final void m12765H0() {
        BoardConfig boardConfigM12770K;
        Object value;
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null || (boardConfigM12770K = m12770K()) == null) {
            return;
        }
        float zoomLevel = iPageControlM12786S.getZoomLevel();
        Iterator it = AbstractC8212h.m12853e().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((AbstractC8228x) it.next()).m12922a() == zoomLevel) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            i10 = 3;
        }
        this.f14928f = i10;
        float f10 = 1;
        float maxHeightTimes = f10 / (boardConfigM12770K.getMoveActionConfig().getMaxHeightTimes() * zoomLevel);
        float maxWidthTimes = f10 / (boardConfigM12770K.getMoveActionConfig().getMaxWidthTimes() * zoomLevel);
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, false, iPageControlM12786S.getMoveVerticalProgress(), maxHeightTimes, false, iPageControlM12786S.getMoveHorizontalProgress(), maxWidthTimes, 79, null)));
    }

    /* renamed from: I */
    public final InterfaceC9280q m12766I() {
        return this.f14941s;
    }

    /* renamed from: I0 */
    public final void m12767I0(ImageCropView imageCropView) {
        this.f14927e = imageCropView;
    }

    /* renamed from: J */
    public final C9674a m12768J() {
        return this.f14924b;
    }

    /* renamed from: J0 */
    public final void m12769J0(TextEditView textEditView) {
        this.f14926d = textEditView;
    }

    /* renamed from: K */
    public final BoardConfig m12770K() {
        IBoardControl iBoardControl = this.f14925c;
        if (iBoardControl != null) {
            return iBoardControl.getConfig();
        }
        return null;
    }

    /* renamed from: K0 */
    public final void m12771K0(boolean z10) {
        if (z10) {
            IPageControl iPageControlM12786S = m12786S();
            if (iPageControlM12786S != null) {
                iPageControlM12786S.recover();
                return;
            }
            return;
        }
        IPageControl iPageControlM12786S2 = m12786S();
        if (iPageControlM12786S2 != null) {
            iPageControlM12786S2.withdraw();
        }
    }

    /* renamed from: L */
    public final InterfaceC9280q m12772L() {
        return this.f14937o;
    }

    /* renamed from: L0 */
    public final void m12773L0() {
        Object value;
        C8217m c8217m;
        AbstractC8222r abstractC8222r;
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
            c8217m = (C8217m) value;
            AbstractC8222r abstractC8222rM12866f = c8217m.m12866f();
            abstractC8222r = AbstractC8222r.a.f15083e;
            if (AbstractC9133u.m16128b(abstractC8222rM12866f, abstractC8222r)) {
                abstractC8222r = AbstractC8222r.d.f15086e;
            }
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b(c8217m, abstractC8222r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
    }

    /* renamed from: M */
    public final InterfaceC9275l m12774M() {
        return this.f14931i;
    }

    /* renamed from: M0 */
    public final void m12775M0() {
        Object value;
        C8217m c8217m;
        AbstractC8222r abstractC8222r;
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
            c8217m = (C8217m) value;
            AbstractC8222r abstractC8222rM12866f = c8217m.m12866f();
            abstractC8222r = AbstractC8222r.b.f15084e;
            if (AbstractC9133u.m16128b(abstractC8222rM12866f, abstractC8222r)) {
                abstractC8222r = AbstractC8222r.d.f15086e;
            }
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b(c8217m, abstractC8222r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
    }

    /* renamed from: N */
    public final InterfaceC9280q m12776N() {
        return this.f14947y;
    }

    /* renamed from: N0 */
    public final void m12777N0() {
        Object value;
        C8217m c8217m;
        AbstractC8222r abstractC8222r;
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
            c8217m = (C8217m) value;
            AbstractC8222r abstractC8222rM12866f = c8217m.m12866f();
            abstractC8222r = AbstractC8222r.c.f15085e;
            if (AbstractC9133u.m16128b(abstractC8222rM12866f, abstractC8222r)) {
                abstractC8222r = AbstractC8222r.d.f15086e;
            }
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b(c8217m, abstractC8222r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
    }

    /* renamed from: O */
    public final InterfaceC9280q m12778O() {
        return this.f14943u;
    }

    /* renamed from: O0 */
    public final void m12779O0() {
        Object value;
        C8217m c8217m;
        AbstractC8222r abstractC8222r;
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
            c8217m = (C8217m) value;
            AbstractC8222r abstractC8222rM12866f = c8217m.m12866f();
            abstractC8222r = AbstractC8222r.e.f15087e;
            if (AbstractC9133u.m16128b(abstractC8222rM12866f, abstractC8222r)) {
                abstractC8222r = AbstractC8222r.d.f15086e;
            }
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b(c8217m, abstractC8222r, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
    }

    /* renamed from: P */
    public final InterfaceC9280q m12780P() {
        return this.f14939q;
    }

    /* renamed from: P0 */
    public final void m12781P0() {
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null) {
            return;
        }
        if (!iPageControlM12786S.isRecording()) {
            iPageControlM12786S.startRecord(this.f14922B);
        } else {
            this.f14922B = iPageControlM12786S.isMicroTurnOn();
            iPageControlM12786S.stopRecord();
        }
    }

    /* renamed from: Q */
    public final InterfaceC9280q m12782Q() {
        return this.f14921A;
    }

    /* renamed from: Q0 */
    public final void m12783Q0(int i10) {
        Object value;
        AbstractC8206b abstractC8206b = (AbstractC8206b) AbstractC8212h.m12849a().get(i10);
        InterfaceC9271h interfaceC9271h = this.f14940r;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8205a.m12827b((C8205a) value, false, abstractC8206b, 1, null)));
        BoardConfig boardConfigM12770K = m12770K();
        if (boardConfigM12770K == null) {
            return;
        }
        boardConfigM12770K.setBackgroundColor(abstractC8206b.m12831a());
        BackgroundLineConfig backgroundLineConfig = boardConfigM12770K.getBackgroundLineConfig();
        backgroundLineConfig.setLineColor(abstractC8206b.m12832b());
        backgroundLineConfig.setLineType(abstractC8206b.m12834d());
        backgroundLineConfig.setLineSpace(abstractC8206b.m12833c());
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null) {
            return;
        }
        if (abstractC8206b.m12831a() != iPageControlM12786S.getBackgroundColor()) {
            iPageControlM12786S.setBackgroundColorWithLineConfig(abstractC8206b.m12831a(), boardConfigM12770K.getBackgroundLineConfig());
        }
        AbstractC0040n.m106j(Integer.valueOf(abstractC8206b.m12831a()));
    }

    /* renamed from: R */
    public final InterfaceC9280q m12784R() {
        return this.f14933k;
    }

    /* renamed from: R0 */
    public final void m12785R0() {
        C8213i c8213i = (C8213i) this.f14936n.getValue();
        BoardConfig boardConfigM12770K = m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setMode(EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING);
            boardConfigM12770K.setEraserWidth(c8213i.m12855b().m12857b());
        }
    }

    /* renamed from: S */
    public final IPageControl m12786S() {
        List<IPageControl> pages;
        IBoardControl iBoardControl = this.f14925c;
        if (iBoardControl == null || (pages = iBoardControl.getPages()) == null) {
            return null;
        }
        return (IPageControl) AbstractC8778f0.m14568n0(pages);
    }

    /* renamed from: S0 */
    public final void m12787S0() {
        C8224t c8224t = (C8224t) this.f14934l.getValue();
        BoardConfig boardConfigM12770K = m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setMode(c8224t.m12907g().m12908a());
            BoardConfig.setDottedLine$default(boardConfigM12770K, c8224t.m12907g().m12912e(), 0.0f, 0.0f, 6, null);
            float fFloatValue = ((Number) c8224t.m12907g().m12911d().get(c8224t.m12906f())).floatValue();
            boardConfigM12770K.setPaintWidth(fFloatValue);
            boardConfigM12770K.setBeelinePaintWidth(fFloatValue);
            int iM66e = AbstractC0027a.m66e(c8224t.m12905e().m12899a(), c8224t.m12907g().m12910c());
            boardConfigM12770K.setPaintColor(iM66e);
            boardConfigM12770K.setBeelinePaintColor(iM66e);
            if (AbstractC0040n.m102f() == null) {
                boardConfigM12770K.setAddTextOriginalTextColor(iM66e);
            }
        }
    }

    /* renamed from: T */
    public final InterfaceC9280q m12788T() {
        return this.f14935m;
    }

    /* renamed from: T0 */
    public final void m12789T0(int i10) {
        Object value;
        AbstractC8214j abstractC8214j = (AbstractC8214j) AbstractC8212h.m12850b().get(i10);
        InterfaceC9271h interfaceC9271h = this.f14936n;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, ((C8213i) value).m12854a(abstractC8214j)));
        m12785R0();
        AbstractC0040n.m107k(Float.valueOf(abstractC8214j.m12857b()));
    }

    /* renamed from: U */
    public final InterfaceC9280q m12790U() {
        return this.f14945w;
    }

    /* renamed from: U0 */
    public final void m12791U0(boolean z10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updateExpandState$1(this, z10, null), 3, null);
    }

    /* renamed from: V */
    public final void m12792V(boolean z10, boolean z11, InterfaceC10574p error, InterfaceC10574p callback) {
        AbstractC9133u.m16133g(error, "error");
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$getSavePath$3(this, z10, z11, callback, error, null), 3, null);
    }

    /* renamed from: V0 */
    public final void m12793V0(AbstractC8219o graphType) {
        AbstractC8219o abstractC8219o;
        AbstractC9133u.m16133g(graphType, "graphType");
        m12797Y0(AbstractC8221q.b.f15076e);
        InterfaceC9271h interfaceC9271h = this.f14938p;
        while (true) {
            Object value = interfaceC9271h.getValue();
            abstractC8219o = graphType;
            if (interfaceC9271h.mo16686e(value, C8218n.m12872b((C8218n) value, false, false, false, false, abstractC8219o, 15, null))) {
                break;
            } else {
                graphType = abstractC8219o;
            }
        }
        BoardConfig boardConfigM12770K = m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setMode(EzyModeEnum.ModeEnum.ACTION_GEOMETRY);
            boardConfigM12770K.setGeometryActionEnum(abstractC8219o.m12879a());
        }
    }

    /* renamed from: W0 */
    public final void m12794W0(boolean z10) {
        boolean z11;
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null) {
            return;
        }
        InterfaceC9271h interfaceC9271h = this.f14944v;
        while (true) {
            Object value = interfaceC9271h.getValue();
            z11 = z10;
            if (interfaceC9271h.mo16686e(value, C8226v.m12913b((C8226v) value, null, z11, null, 5, null))) {
                break;
            } else {
                z10 = z11;
            }
        }
        if (z11) {
            iPageControlM12786S.turnOnMicro();
            ToastUtils.m2402r(R$string.turn_on_micro_phone);
        } else {
            iPageControlM12786S.turnOffMicro();
            ToastUtils.m2402r(R$string.turn_off_micro_phone);
        }
    }

    /* renamed from: X */
    public final void m12795X() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: Y */
    public final void m12796Y() {
        Object value;
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, AbstractC8222r.d.f15086e, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
    }

    /* renamed from: Y0 */
    public final void m12797Y0(AbstractC8221q mainToolType) {
        AbstractC8221q abstractC8221q;
        AbstractC9133u.m16133g(mainToolType, "mainToolType");
        InterfaceC9271h interfaceC9271h = this.f14932j;
        while (true) {
            Object value = interfaceC9271h.getValue();
            abstractC8221q = mainToolType;
            if (interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, false, false, false, false, false, abstractC8221q, 31, null))) {
                break;
            } else {
                mainToolType = abstractC8221q;
            }
        }
        if (AbstractC9133u.m16128b(abstractC8221q, AbstractC8221q.d.f15078e)) {
            BoardConfig boardConfigM12770K = m12770K();
            if (boardConfigM12770K != null) {
                boardConfigM12770K.setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
                return;
            }
            return;
        }
        if (AbstractC9133u.m16128b(abstractC8221q, AbstractC8221q.c.f15077e)) {
            m12787S0();
        } else if (AbstractC9133u.m16128b(abstractC8221q, AbstractC8221q.a.f15075e)) {
            m12785R0();
        } else if (!AbstractC9133u.m16128b(abstractC8221q, AbstractC8221q.b.f15076e)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: Z */
    public final void m12798Z(IPageControl iPageControl) {
        AbstractC9745x1.m18270c(iPageControl, new InterfaceC10559a() { // from class: p5.f1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardViewModel.m12719a0(this.f19393a);
            }
        }, new InterfaceC10574p() { // from class: p5.g1
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m12721b0(this.f19396a, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, new InterfaceC10559a() { // from class: p5.h1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardViewModel.m12723c0(this.f19399a);
            }
        });
    }

    /* renamed from: Z0 */
    public final void m12799Z0(int i10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenColorLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: a1 */
    public final void m12800a1(int i10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenSizeLevel$1(this, i10, null), 3, null);
    }

    /* renamed from: b1 */
    public final void m12801b1(AbstractC8225u penType) {
        AbstractC9133u.m16133g(penType, "penType");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: c1 */
    public final void m12802c1(boolean z10) {
        boolean z11;
        InterfaceC9271h interfaceC9271h = this.f14932j;
        while (true) {
            Object value = interfaceC9271h.getValue();
            z11 = z10;
            if (interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, false, false, false, false, z11, null, 47, null))) {
                break;
            } else {
                z10 = z11;
            }
        }
        BoardConfig boardConfigM12770K = m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setFingerDraw(z11);
        }
        AbstractC0040n.m113q(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12803d0(com.zykj.blackboard.bean.BoardConfig r8) {
        /*
            r7 = this;
            java.lang.Integer r0 = p007a6.AbstractC0040n.m97a()
            r1 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.intValue()
            java.util.List r2 = com.zykj.view.board.board.AbstractC8212h.m12849a()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L14:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()
            com.zykj.view.board.board.b r4 = (com.zykj.view.board.board.AbstractC8206b) r4
            int r4 = r4.m12831a()
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
            java.util.List r0 = com.zykj.view.board.board.AbstractC8212h.m12849a()
            java.lang.Object r0 = r0.get(r3)
            com.zykj.view.board.board.b r0 = (com.zykj.view.board.board.AbstractC8206b) r0
            l8.h r2 = r7.f14940r
        L3b:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.zykj.view.board.board.a r4 = (com.zykj.view.board.board.C8205a) r4
            r5 = 0
            r6 = 1
            com.zykj.view.board.board.a r4 = com.zykj.view.board.board.C8205a.m12827b(r4, r1, r0, r6, r5)
            boolean r3 = r2.mo16686e(r3, r4)
            if (r3 == 0) goto L3b
            int r1 = r0.m12831a()
            r8.setBackgroundColor(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig r8 = r8.getBackgroundLineConfig()
            int r1 = r0.m12832b()
            r8.setLineColor(r1)
            com.zykj.blackboard.bean.BackgroundLineConfig$BackgroundLineType r1 = r0.m12834d()
            r8.setLineType(r1)
            float r0 = r0.m12833c()
            r8.setLineSpace(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardViewModel.m12803d0(com.zykj.blackboard.bean.BoardConfig):void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/view/board/board/BoardViewModel.smali:5905
    }

    /* renamed from: e0 */
    public final void m12804e0(IBoardControl boardControl, boolean z10, long j10) {
        Object value;
        Object value2;
        AbstractC9133u.m16133g(boardControl, "boardControl");
        AbstractC5380q.m2623s("initBoardControl Start");
        this.f14925c = boardControl;
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, z10, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 507, null)));
        if (j10 > 0) {
            InterfaceC9271h interfaceC9271h2 = this.f14944v;
            do {
                value2 = interfaceC9271h2.getValue();
            } while (!interfaceC9271h2.mo16686e(value2, C8226v.m12913b((C8226v) value2, AbstractC8227w.a.f15121f, false, C0041o.f109a.m115b(j10), 2, null)));
        }
        BoardConfig boardConfigM12770K = m12770K();
        if (boardConfigM12770K != null) {
            boardConfigM12770K.setSelectIconWidth(48.0f);
            C9679b1 c9679b1 = this.f14923a;
            if (c9679b1 != null) {
                boardConfigM12770K.setMaxImageSize(c9679b1.m18250b());
            }
            m12802c1(!AbstractC9133u.m16128b(AbstractC0040n.m104h(), Boolean.FALSE));
            m12759D0(boardConfigM12770K);
            m12803d0(boardConfigM12770K);
            boardConfigM12770K.setImageCropView(this.f14927e);
            m12813q0(boardConfigM12770K);
            m12808i0(boardConfigM12770K);
            m12815s0(boardConfigM12770K);
            m12797Y0(AbstractC8221q.c.f15077e);
        }
        final InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: p5.k1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12728f0(this.f19409a, (IPageControl) obj);
            }
        };
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S != null) {
            AbstractC5380q.m2623s("pageControl is not Null");
            interfaceC10570l.invoke(iPageControlM12786S);
        } else {
            AbstractC5380q.m2623s("pageControl is Null");
            IBoardControl.DefaultImpls.createPage$default(boardControl, false, new InterfaceC10559a() { // from class: p5.l1
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return BoardViewModel.m12730g0(this.f19413a, interfaceC10570l);
                }
            }, 1, null);
        }
        AbstractC5380q.m2623s("initBoardControl Finished");
    }

    /* renamed from: e1 */
    public final void m12805e1(C8208d boardViewConfig) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        AbstractC9133u.m16133g(boardViewConfig, "boardViewConfig");
        InterfaceC9271h interfaceC9271h = this.f14932j;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, boardViewConfig.m12844h(), boardViewConfig.m12846j(), false, false, false, null, 60, null)));
        InterfaceC9271h interfaceC9271h2 = this.f14934l;
        do {
            value2 = interfaceC9271h2.getValue();
        } while (!interfaceC9271h2.mo16686e(value2, C8224t.m12901b((C8224t) value2, boardViewConfig.m12840d(), boardViewConfig.m12843g(), null, 0, null, 28, null)));
        InterfaceC9271h interfaceC9271h3 = this.f14938p;
        do {
            value3 = interfaceC9271h3.getValue();
        } while (!interfaceC9271h3.mo16686e(value3, C8218n.m12872b((C8218n) value3, boardViewConfig.m12841e(), boardViewConfig.m12839c(), boardViewConfig.m12845i(), boardViewConfig.m12842f(), null, 16, null)));
        InterfaceC9271h interfaceC9271h4 = this.f14940r;
        do {
            value4 = interfaceC9271h4.getValue();
        } while (!interfaceC9271h4.mo16686e(value4, C8205a.m12827b((C8205a) value4, boardViewConfig.m12838b(), null, 2, null)));
        InterfaceC9271h interfaceC9271h5 = this.f14942t;
        do {
            value5 = interfaceC9271h5.getValue();
        } while (!interfaceC9271h5.mo16686e(value5, C8217m.m12861b((C8217m) value5, null, boardViewConfig.m12837a(), false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 509, null)));
    }

    /* renamed from: f1 */
    public final void m12806f1(boolean z10) {
        int i10;
        Object value;
        int i11 = this.f14928f;
        if (z10 && i11 < AbstractC8212h.m12853e().size() - 1) {
            this.f14928f++;
        } else if (!z10 && (i10 = this.f14928f) > 0) {
            this.f14928f = i10 - 1;
        }
        if (i11 == this.f14928f) {
            return;
        }
        float fM12922a = ((AbstractC8228x) AbstractC8212h.m12853e().get(this.f14928f)).m12922a();
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null) {
            return;
        }
        PointF pointF = this.f14929g;
        iPageControlM12786S.zoomLevel(pointF.x, pointF.y, fM12922a);
        float moveVerticalProgress = iPageControlM12786S.getMoveVerticalProgress();
        float moveHorizontalProgress = iPageControlM12786S.getMoveHorizontalProgress();
        float f10 = moveVerticalProgress > 1.0f ? 1.0f : moveVerticalProgress < 0.0f ? 0.0f : moveVerticalProgress;
        float f11 = moveHorizontalProgress <= 1.0f ? moveHorizontalProgress < 0.0f ? 0.0f : fM12922a <= 1.0f ? 0.5f : moveHorizontalProgress : 1.0f;
        if (f10 != moveVerticalProgress || f11 != moveHorizontalProgress) {
            iPageControlM12786S.areaMoveStart();
            iPageControlM12786S.areaMoveEnd(Float.valueOf(f11), Float.valueOf(f10));
        }
        if (m12770K() == null) {
            return;
        }
        float f12 = 1;
        float maxHeightTimes = f12 / (r3.getMoveActionConfig().getMaxHeightTimes() * fM12922a);
        float maxWidthTimes = f12 / (r3.getMoveActionConfig().getMaxWidthTimes() * fM12922a);
        InterfaceC9271h interfaceC9271h = this.f14942t;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8217m.m12861b((C8217m) value, null, null, false, false, 0.0f, maxHeightTimes, false, 0.0f, maxWidthTimes, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, null)));
    }

    /* renamed from: h0 */
    public final void m12807h0(C9674a boardCallbackConfig) {
        AbstractC9133u.m16133g(boardCallbackConfig, "boardCallbackConfig");
        this.f14924b = boardCallbackConfig;
    }

    /* renamed from: i0 */
    public final void m12808i0(BoardConfig boardConfig) {
        Object value;
        Float fM98b = AbstractC0040n.m98b();
        int i10 = 0;
        if (fM98b != null) {
            float fFloatValue = fM98b.floatValue();
            Iterator it = AbstractC8212h.m12850b().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (((AbstractC8214j) it.next()).m12857b() == fFloatValue) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        AbstractC8214j abstractC8214j = (AbstractC8214j) AbstractC8212h.m12850b().get(i10);
        InterfaceC9271h interfaceC9271h = this.f14936n;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, ((C8213i) value).m12854a(abstractC8214j)));
    }

    /* renamed from: j0 */
    public final void m12809j0(IPageControl iPageControl) {
        AbstractC9745x1.m18269b(iPageControl, new InterfaceC10570l() { // from class: p5.i1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12735k0(this.f19403a, (CommandInfoEntity) obj);
            }
        });
    }

    /* renamed from: l0 */
    public final void m12810l0(final IPageControl iPageControl) {
        iPageControl.setGeometryCreateListener(new InterfaceC10570l() { // from class: p5.d1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12738m0(this.f19386a, iPageControl, (String) obj);
            }
        });
    }

    /* renamed from: n0 */
    public final void m12811n0(IPageControl iPageControl) {
        iPageControl.addGraphDeleteListener(new C8203b());
    }

    /* renamed from: o0 */
    public final void m12812o0(IPageControl iPageControl) {
        AbstractC9745x1.m18271d(iPageControl, new InterfaceC10570l() { // from class: p5.e1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12742p0(this.f19390a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* renamed from: q0 */
    public final void m12813q0(BoardConfig boardConfig) {
        C9679b1 c9679b1 = this.f14923a;
        if (c9679b1 == null) {
            return;
        }
        if (!c9679b1.m18252d()) {
            boardConfig.getMoveActionConfig().setMoveActionEnable(false);
            return;
        }
        MoveActionConfig moveActionConfig = boardConfig.getMoveActionConfig();
        moveActionConfig.setMoveActionEnable(true);
        moveActionConfig.setVerticalTranslate(true);
        moveActionConfig.setHorizontalTranslate(true);
        moveActionConfig.setMaxWidthTimes(1);
        moveActionConfig.setMaxHeightTimes(c9679b1.m18249a());
    }

    /* renamed from: r0 */
    public final void m12814r0(IPageControl iPageControl) {
        AbstractC5380q.m2623s("initPageControl Start");
        m12811n0(iPageControl);
        m12816t0(iPageControl);
        m12812o0(iPageControl);
        m12756A0(iPageControl);
        m12810l0(iPageControl);
        m12798Z(iPageControl);
        m12809j0(iPageControl);
        m12818x0(iPageControl);
        m12764G0();
        m12765H0();
        AbstractC5380q.m2623s("initPageControl Finished");
    }

    /* renamed from: s0 */
    public final void m12815s0(BoardConfig boardConfig) {
        Object value;
        C8224t c8224t;
        AbstractC8225u abstractC8225u;
        int iIntValue;
        Object next;
        AbstractC8223s abstractC8223s;
        InterfaceC9271h interfaceC9271h = this.f14934l;
        do {
            value = interfaceC9271h.getValue();
            c8224t = (C8224t) value;
            List listM12852d = AbstractC8212h.m12852d();
            Integer numM101e = AbstractC0040n.m101e();
            abstractC8225u = (AbstractC8225u) listM12852d.get(numM101e != null ? numM101e.intValue() : 0);
            Integer numM100d = AbstractC0040n.m100d();
            iIntValue = numM100d != null ? numM100d.intValue() : 0;
            List listM12851c = AbstractC8212h.m12851c();
            Iterator it = listM12851c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int iM12899a = ((AbstractC8223s) next).m12899a();
                Integer numM99c = AbstractC0040n.m99c();
                if (numM99c != null && iM12899a == numM99c.intValue()) {
                    break;
                }
            }
            abstractC8223s = (AbstractC8223s) next;
            if (abstractC8223s == null) {
                abstractC8223s = (AbstractC8223s) AbstractC8778f0.m14566l0(listM12851c);
            }
        } while (!interfaceC9271h.mo16686e(value, C8224t.m12901b(c8224t, false, false, abstractC8225u, iIntValue, abstractC8223s, 3, null)));
    }

    /* renamed from: t0 */
    public final void m12816t0(IPageControl iPageControl) {
        AbstractC9745x1.m18272e(iPageControl, new InterfaceC10559a() { // from class: p5.m1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardViewModel.m12748u0(this.f19417a);
            }
        }, new InterfaceC10570l() { // from class: p5.n1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return BoardViewModel.m12750v0(this.f19421a, ((Long) obj).longValue());
            }
        }, new InterfaceC10559a() { // from class: p5.o1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return BoardViewModel.m12752w0(this.f19425a);
            }
        });
    }

    /* renamed from: x */
    public final void m12817x(Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, String filename, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(scaleTypeEnum, "scaleTypeEnum");
        AbstractC9133u.m16133g(filename, "filename");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BoardViewModel$addImageGraph$1(this, bitmap, filename, scaleTypeEnum, str, interfaceC10570l, z10, null), 3, null);
    }

    /* renamed from: x0 */
    public final void m12818x0(IPageControl iPageControl) {
        AbstractC9745x1.m18268a(iPageControl, new InterfaceC10574p() { // from class: p5.j1
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return BoardViewModel.m12754y0(this.f19406a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* renamed from: z */
    public final void m12819z(String content) {
        TextGraph textGraphAddText$default;
        Object value;
        AbstractC9133u.m16133g(content, "content");
        IPageControl iPageControlM12786S = m12786S();
        if (iPageControlM12786S == null || (textGraphAddText$default = IPageControl.DefaultImpls.addText$default(iPageControlM12786S, content, EzyPositionEnum.PositionEnum.CENTER, 0, 4, null)) == null) {
            return;
        }
        InterfaceC9271h interfaceC9271h = this.f14932j;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, false, false, false, false, false, AbstractC8221q.d.f15078e, 31, null)));
        iPageControlM12786S.newSelectGraph(AbstractC8807u.m14755e(textGraphAddText$default.getId()));
    }

    /* renamed from: z0 */
    public final void m12820z0(C9679b1 boardSketchConfig) {
        AbstractC9133u.m16133g(boardSketchConfig, "boardSketchConfig");
        this.f14923a = boardSketchConfig;
    }
}
