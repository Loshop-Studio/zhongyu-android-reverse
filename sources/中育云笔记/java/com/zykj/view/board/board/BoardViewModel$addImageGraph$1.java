package com.zykj.view.board.board;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.board.board.AbstractC8855q;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10976v;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import p422y9.InterfaceC11935n;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1", m26211f = "BoardViewModel.kt", m26212l = {896}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$addImageGraph$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20167c;

    /* renamed from: d */
    public /* synthetic */ Object f20168d;

    /* renamed from: e */
    public final /* synthetic */ BoardViewModel f20169e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f20170f;

    /* renamed from: g */
    public final /* synthetic */ String f20171g;

    /* renamed from: h */
    public final /* synthetic */ EzyScaleTypeEnum.ScaleTypeEnum f20172h;

    /* renamed from: i */
    public final /* synthetic */ String f20173i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC9540l f20174j;

    /* renamed from: k */
    public final /* synthetic */ boolean f20175k;

    @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1", m26211f = "BoardViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1 */
    public static final class C88361 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f20176c;

        /* renamed from: d */
        public /* synthetic */ boolean f20177d;

        public C88361(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C88361 c88361 = new C88361(interfaceC11588c);
            c88361.f20177d = ((Boolean) obj).booleanValue();
            return c88361;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10 = this.f20177d;
            AbstractC11725a.m25952f();
            if (this.f20176c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(z10);
        }

        public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
            return ((C88361) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$addImageGraph$1(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, String str2, InterfaceC9540l interfaceC9540l, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20169e = boardViewModel;
        this.f20170f = bitmap;
        this.f20171g = str;
        this.f20172h = scaleTypeEnum;
        this.f20173i = str2;
        this.f20174j = interfaceC9540l;
        this.f20175k = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BoardViewModel$addImageGraph$1 boardViewModel$addImageGraph$1 = new BoardViewModel$addImageGraph$1(this.f20169e, this.f20170f, this.f20171g, this.f20172h, this.f20173i, this.f20174j, this.f20175k, interfaceC11588c);
        boardViewModel$addImageGraph$1.f20168d = obj;
        return boardViewModel$addImageGraph$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM20054c;
        Object value;
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f20168d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20167c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11612u interfaceC11612uM16894Q = this.f20169e.m16894Q();
            C88361 c88361 = new C88361(null);
            this.f20168d = interfaceC11122i0;
            this.f20167c = 1;
            if (AbstractC11596e.m25573w(interfaceC11612uM16894Q, c88361, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        InterfaceC11935n interfaceC11935nM16898S = this.f20169e.m16898S();
        if (interfaceC11935nM16898S == null) {
            return C10786q.f26013a;
        }
        if (this.f20169e.m16876G0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return C10786q.f26013a;
        }
        Bitmap bitmap = this.f20170f;
        String str = this.f20171g;
        EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum = this.f20172h;
        String str2 = this.f20173i;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(bitmap != null ? InterfaceC11935n.a.m26488a(interfaceC11935nM16898S, bitmap, str, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, false, 48, null) : str2 != null ? InterfaceC11935n.a.m26489b(interfaceC11935nM16898S, str2, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, 8, null) : null);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20056e(objM20054c) != null) {
            ToastUtils.showShort("图片数量超过上限", new Object[0]);
        }
        ImageGraph imageGraph = (ImageGraph) (Result.m20058g(objM20054c) ? null : objM20054c);
        if (imageGraph != null) {
            InterfaceC9540l interfaceC9540l = this.f20174j;
            boolean z10 = this.f20175k;
            BoardViewModel boardViewModel = this.f20169e;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(imageGraph.m2863E());
            }
            if (z10) {
                InterfaceC11603l interfaceC11603l = boardViewModel.f20149j;
                do {
                    value = interfaceC11603l.getValue();
                } while (!interfaceC11603l.mo20870e(value, C8854p.m16999b((C8854p) value, false, false, false, false, false, AbstractC8855q.d.f20294e, 31, null)));
                interfaceC11935nM16898S.mo14455F(AbstractC10976v.m24126e(imageGraph.getId()));
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$addImageGraph$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
