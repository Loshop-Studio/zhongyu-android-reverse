package com.zykj.view.board.board;

import android.net.Uri;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.board.board.BoardViewModel;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.view.board.board.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5317o implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8249a;

    /* renamed from: b */
    public final /* synthetic */ Object f8250b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5428d f8251c;

    public /* synthetic */ C5317o(Object obj, InterfaceC5428d interfaceC5428d, int i) {
        this.f8249a = i;
        this.f8250b = obj;
        this.f8251c = interfaceC5428d;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8249a) {
            case 0:
                return BoardViewModel.C52903.invokeSuspend$lambda$0((BoardViewModel) this.f8250b, (InterfaceC6473e) this.f8251c, (String) obj);
            case 1:
                return BoardViewModel.C52903.invokeSuspend$lambda$1((BoardViewModel) this.f8250b, (InterfaceC6473e) this.f8251c, (Throwable) obj);
            default:
                return BoardFragment.C52833.showCropView$lambda$0((InterfaceC6471c) this.f8250b, (InterfaceC6469a) this.f8251c, (Uri) obj);
        }
    }
}
