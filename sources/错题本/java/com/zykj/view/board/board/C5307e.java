package com.zykj.view.board.board;

import java.io.File;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.board.board.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5307e implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8232a;

    /* renamed from: b */
    public final /* synthetic */ Object f8233b;

    public /* synthetic */ C5307e(Object obj, int i) {
        this.f8232a = i;
        this.f8233b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8232a) {
            case 0:
                return BoardFragment.startGallery$lambda$73$lambda$72((File) this.f8233b, (String) obj);
            case 1:
                return BoardFragment.startCapture$lambda$75$lambda$74((File) this.f8233b, (String) obj);
            default:
                return DialogKt.showTextEditDialog$lambda$7((InterfaceC6471c) this.f8233b, (String) obj);
        }
    }
}
