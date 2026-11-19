package com.zykj.mistake.activity;

import android.widget.ImageView;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import kotlin.jvm.internal.AbstractC5830k;
import p007a6.AbstractC0018a;
import p016b0.AbstractC3085o;
import p147r0.C6446d;

/* renamed from: com.zykj.mistake.activity.t */
/* loaded from: classes3.dex */
public final class C4484t extends AbstractC0018a {

    /* renamed from: b */
    public final /* synthetic */ MistakeCreateOrEditActivity f5944b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f5945c;

    /* renamed from: d */
    public final /* synthetic */ int f5946d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f5947e;

    public C4484t(int i, ImageView imageView, ImageView imageView2, MistakeCreateOrEditActivity mistakeCreateOrEditActivity) {
        this.f5944b = mistakeCreateOrEditActivity;
        this.f5945c = imageView;
        this.f5946d = i;
        this.f5947e = imageView2;
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() {
        this.f5944b.mo3963c();
    }

    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable e) {
        AbstractC5830k.m5330g(e, "e");
    }

    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        String uri = (String) obj;
        AbstractC5830k.m5330g(uri, "uri");
        MistakeCreateOrEditActivity mistakeCreateOrEditActivity = this.f5944b;
        C3412f c3412fMo2374c = ComponentCallbacks2C3408b.m2361d(mistakeCreateOrEditActivity).m5863c(mistakeCreateOrEditActivity).m2386l(uri).mo2374c(((C6446d) new C6446d().m6086g(AbstractC3085o.f1480b)).m6096r());
        ImageView imageView = this.f5945c;
        c3412fMo2374c.m2378y(imageView);
        mistakeCreateOrEditActivity.f5811p[this.f5946d] = uri;
        imageView.setSelected(true);
        MistakeCreateOrEditActivity.m3911C(imageView, true);
        this.f5947e.setVisibility(0);
    }
}
