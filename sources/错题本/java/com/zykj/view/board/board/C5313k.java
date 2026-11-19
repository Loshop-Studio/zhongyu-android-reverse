package com.zykj.view.board.board;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IPageControl;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.board.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5313k implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8241a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f8242b;

    public /* synthetic */ C5313k(BoardViewModel boardViewModel, int i) {
        this.f8241a = i;
        this.f8242b = boardViewModel;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8241a) {
            case 0:
                return BoardViewModel.initEventListener$lambda$49(this.f8242b, (CommandInfoEntity) obj);
            case 1:
                return BoardViewModel.initTextChangeListener$lambda$40(this.f8242b, ((Float) obj).floatValue());
            case 2:
                return BoardViewModel.initMicroPhoneListener$lambda$38(this.f8242b, ((Boolean) obj).booleanValue());
            case 3:
                return BoardViewModel.initGeometryColorListener$lambda$41(this.f8242b, ((Integer) obj).intValue());
            case 4:
                return BoardViewModel.initBoardControl$lambda$5(this.f8242b, (IPageControl) obj);
            case 5:
                return BoardViewModel.initRecordListener$lambda$34(this.f8242b, ((Long) obj).longValue());
            default:
                return BoardViewModel.initTextChangeListener$lambda$39(this.f8242b, ((Integer) obj).intValue());
        }
    }
}
