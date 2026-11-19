package com.zykj.view.board.board;

import android.net.Uri;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.board.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5303a implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8222a;

    /* renamed from: b */
    public final /* synthetic */ BoardFragment f8223b;

    public /* synthetic */ C5303a(BoardFragment boardFragment, int i) {
        this.f8222a = i;
        this.f8223b = boardFragment;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8222a) {
            case 0:
                return BoardFragment.startCapture$lambda$75(this.f8223b, (Uri) obj);
            case 1:
                return BoardFragment.startGallery$lambda$73(this.f8223b, (Uri) obj);
            case 2:
                return BoardFragment.initGraphClickListener$lambda$43$lambda$39$lambda$38(this.f8223b, (String) obj);
            case 3:
                return BoardFragment.loadSketchData$lambda$5(this.f8223b, (Throwable) obj);
            case 4:
                return BoardFragment.initProgressBarTouchListener$lambda$65(this.f8223b, ((Float) obj).floatValue());
            case 5:
                return BoardFragment.initProgressBarTouchListener$lambda$66(this.f8223b, ((Float) obj).floatValue());
            case 6:
                return BoardFragment.initProgressBarTouchListener$lambda$68(this.f8223b, ((Float) obj).floatValue());
            case 7:
                return BoardFragment.initProgressBarTouchListener$lambda$69(this.f8223b, ((Float) obj).floatValue());
            default:
                return BoardFragment.initPenClickListener$lambda$31(this.f8223b, ((Integer) obj).intValue());
        }
    }
}
