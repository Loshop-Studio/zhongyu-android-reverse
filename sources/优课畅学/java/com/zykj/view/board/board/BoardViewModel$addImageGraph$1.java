package com.zykj.view.board.board;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.board.board.AbstractC8221q;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8807u;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1", m17801f = "BoardViewModel.kt", m17802l = {896}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$addImageGraph$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14950a;

    /* renamed from: b */
    public /* synthetic */ Object f14951b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f14952c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f14953d;

    /* renamed from: e */
    public final /* synthetic */ String f14954e;

    /* renamed from: f */
    public final /* synthetic */ EzyScaleTypeEnum.ScaleTypeEnum f14955f;

    /* renamed from: g */
    public final /* synthetic */ String f14956g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC10570l f14957h;

    /* renamed from: i */
    public final /* synthetic */ boolean f14958i;

    @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1", m17801f = "BoardViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1 */
    public static final class C82021 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f14959a;

        /* renamed from: b */
        public /* synthetic */ boolean f14960b;

        public C82021(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C82021 c82021 = new C82021(interfaceC9324c);
            c82021.f14960b = ((Boolean) obj).booleanValue();
            return c82021;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10 = this.f14960b;
            AbstractC9434a.m17291f();
            if (this.f14959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(z10);
        }

        public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
            return ((C82021) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$addImageGraph$1(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, String str2, InterfaceC10570l interfaceC10570l, boolean z10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14952c = boardViewModel;
        this.f14953d = bitmap;
        this.f14954e = str;
        this.f14955f = scaleTypeEnum;
        this.f14956g = str2;
        this.f14957h = interfaceC10570l;
        this.f14958i = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BoardViewModel$addImageGraph$1 boardViewModel$addImageGraph$1 = new BoardViewModel$addImageGraph$1(this.f14952c, this.f14953d, this.f14954e, this.f14955f, this.f14956g, this.f14957h, this.f14958i, interfaceC9324c);
        boardViewModel$addImageGraph$1.f14951b = obj;
        return boardViewModel$addImageGraph$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$addImageGraph$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15909b;
        Object value;
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f14951b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14950a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9280q interfaceC9280qM12782Q = this.f14952c.m12782Q();
            C82021 c82021 = new C82021(null);
            this.f14951b = interfaceC8822b0;
            this.f14950a = 1;
            if (AbstractC9268e.m17035y(interfaceC9280qM12782Q, c82021, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        IPageControl iPageControlM12786S = this.f14952c.m12786S();
        if (iPageControlM12786S == null) {
            return C8736p.f16368a;
        }
        if (this.f14952c.m12762F0()) {
            ToastUtils.m2403s("图片数量已达上限，不可继续插入", new Object[0]);
            return C8736p.f16368a;
        }
        Bitmap bitmap = this.f14953d;
        String str = this.f14954e;
        EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum = this.f14955f;
        String str2 = this.f14956g;
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(bitmap != null ? IPageControl.DefaultImpls.addImage$default(iPageControlM12786S, bitmap, str, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, false, 48, null) : str2 != null ? IPageControl.DefaultImpls.addImage$default(iPageControlM12786S, str2, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, 8, null) : null);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        if (Result.m15911d(objM15909b) != null) {
            ToastUtils.m2403s("图片数量超过上限", new Object[0]);
        }
        ImageGraph imageGraph = (ImageGraph) (Result.m15913g(objM15909b) ? null : objM15909b);
        if (imageGraph != null) {
            InterfaceC10570l interfaceC10570l = this.f14957h;
            boolean z10 = this.f14958i;
            BoardViewModel boardViewModel = this.f14952c;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(imageGraph.getFilePath());
            }
            if (z10) {
                InterfaceC9271h interfaceC9271h = boardViewModel.f14932j;
                do {
                    value = interfaceC9271h.getValue();
                } while (!interfaceC9271h.mo16686e(value, C8220p.m12883b((C8220p) value, false, false, false, false, false, AbstractC8221q.d.f15078e, 31, null)));
                iPageControlM12786S.newSelectGraph(AbstractC8807u.m14755e(imageGraph.getId()));
            }
        }
        return C8736p.f16368a;
    }
}
