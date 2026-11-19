package com.zykj.view.utils;

import android.net.Uri;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.view.utils.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5388d implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f8337a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8338b;

    /* renamed from: c */
    public final /* synthetic */ ImagePicker f8339c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f8340d;

    public /* synthetic */ C5388d(boolean z8, ImagePicker imagePicker, InterfaceC6471c interfaceC6471c, int i) {
        this.f8337a = i;
        this.f8338b = z8;
        this.f8339c = imagePicker;
        this.f8340d = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f8337a) {
            case 0:
                ImagePicker imagePicker = this.f8339c;
                return ImagePicker.startGallery$lambda$12(this.f8338b, imagePicker, this.f8340d, (Uri) obj);
            default:
                ImagePicker imagePicker2 = this.f8339c;
                return ImagePicker.startCapture$lambda$8$lambda$7(this.f8338b, imagePicker2, this.f8340d, (Uri) obj);
        }
    }
}
