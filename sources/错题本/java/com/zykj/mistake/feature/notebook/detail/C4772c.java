package com.zykj.mistake.feature.notebook.detail;

import android.graphics.Bitmap;
import coil3.AbstractC3330o;
import coil3.InterfaceC3305k;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.widget.ResizableImageView;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p171u.InterfaceC6608a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c */
/* loaded from: classes3.dex */
public final class C4772c implements InterfaceC6608a {

    /* renamed from: a */
    public final /* synthetic */ ResizableImageView f6929a;

    /* renamed from: b */
    public final /* synthetic */ String f6930b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6931c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6469a f6932d;

    /* renamed from: e */
    public final /* synthetic */ ResizableImageView f6933e;

    /* renamed from: f */
    public final /* synthetic */ String f6934f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC6469a f6935g;

    /* renamed from: h */
    public final /* synthetic */ boolean f6936h;

    public C4772c(ResizableImageView resizableImageView, String str, boolean z8, InterfaceC6469a interfaceC6469a, ResizableImageView resizableImageView2, String str2, InterfaceC6469a interfaceC6469a2, boolean z9) {
        this.f6929a = resizableImageView;
        this.f6930b = str;
        this.f6931c = z8;
        this.f6932d = interfaceC6469a;
        this.f6933e = resizableImageView2;
        this.f6934f = str2;
        this.f6935g = interfaceC6469a2;
        this.f6936h = z9;
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: f */
    public final void mo112f(InterfaceC3305k interfaceC3305k) {
        ResizableImageView resizableImageView = this.f6929a;
        if (AbstractC5830k.m5325b(resizableImageView.getTag(), this.f6930b)) {
            if (this.f6931c) {
                resizableImageView.setImageDrawable(null);
                return;
            }
            InterfaceC6469a interfaceC6469a = this.f6932d;
            if (interfaceC6469a != null) {
                interfaceC6469a.invoke();
            }
        }
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: m */
    public final void mo119m(InterfaceC3305k interfaceC3305k) {
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: q */
    public final void mo123q(InterfaceC3305k interfaceC3305k) {
        ResizableImageView resizableImageView = this.f6933e;
        if (AbstractC5830k.m5325b(resizableImageView.getTag(), this.f6934f)) {
            InterfaceC6469a interfaceC6469a = this.f6935g;
            if (interfaceC6469a != null) {
                interfaceC6469a.invoke();
            }
            Bitmap bitmapM2272j = AbstractC3330o.m2272j(interfaceC3305k);
            if (this.f6936h) {
                bitmapM2272j = AbstractC5099d.m4457g(bitmapM2272j);
            }
            resizableImageView.setImageBitmap(bitmapM2272j);
        }
    }
}
