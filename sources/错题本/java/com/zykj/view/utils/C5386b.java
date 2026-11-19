package com.zykj.view.utils;

import android.net.Uri;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.utils.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5386b implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8329a;

    /* renamed from: b */
    public final /* synthetic */ ImagePicker f8330b;

    /* renamed from: c */
    public final /* synthetic */ Uri f8331c;

    /* renamed from: d */
    public final /* synthetic */ boolean f8332d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6471c f8333e;

    public /* synthetic */ C5386b(ImagePicker imagePicker, Uri uri, boolean z8, InterfaceC6471c interfaceC6471c, int i) {
        this.f8329a = i;
        this.f8330b = imagePicker;
        this.f8331c = uri;
        this.f8332d = z8;
        this.f8333e = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f8329a) {
            case 0:
                return ImagePicker.startCapture$lambda$8(this.f8330b, this.f8331c, this.f8332d, this.f8333e);
            default:
                return ImagePicker.startSystemCamera$lambda$11(this.f8330b, this.f8331c, this.f8332d, this.f8333e);
        }
    }
}
