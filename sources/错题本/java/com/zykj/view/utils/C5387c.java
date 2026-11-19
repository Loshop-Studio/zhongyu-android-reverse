package com.zykj.view.utils;

import android.net.Uri;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.utils.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5387c implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8334a;

    /* renamed from: b */
    public final /* synthetic */ Uri f8335b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f8336c;

    public /* synthetic */ C5387c(Uri uri, InterfaceC6471c interfaceC6471c, int i) {
        this.f8334a = i;
        this.f8335b = uri;
        this.f8336c = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8334a) {
            case 0:
                return ImagePicker.startCapture$lambda$8$lambda$7$lambda$6(this.f8335b, this.f8336c, (Uri) obj);
            default:
                return ImagePicker.startSystemCamera$lambda$11$lambda$10$lambda$9(this.f8335b, this.f8336c, (Uri) obj);
        }
    }
}
