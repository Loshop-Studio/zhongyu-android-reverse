package com.zykj.mistake.utils;

import android.graphics.Bitmap;
import com.zykj.mistake.widget.StemWebView;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5961g;

/* renamed from: com.zykj.mistake.utils.b */
/* loaded from: classes3.dex */
public final class RunnableC5097b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ StemWebView f8024a;

    /* renamed from: b */
    public final /* synthetic */ C5961g f8025b;

    /* renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f8026c;

    /* renamed from: d */
    public final /* synthetic */ C5098c f8027d;

    public RunnableC5097b(StemWebView stemWebView, C5961g c5961g, Ref$ObjectRef ref$ObjectRef, C5098c c5098c) {
        this.f8024a = stemWebView;
        this.f8025b = c5961g;
        this.f8026c = ref$ObjectRef;
        this.f8027d = c5098c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmapM4480a = this.f8024a.m4480a();
        Ref$ObjectRef ref$ObjectRef = this.f8026c;
        StemWebView stemWebView = (StemWebView) ref$ObjectRef.element;
        if (stemWebView != null) {
            stemWebView.removeAllViews();
        }
        this.f8027d.f8029b.removeAllViews();
        ref$ObjectRef.element = null;
        C5961g c5961g = this.f8025b;
        if (bitmapM4480a == null) {
            if (c5961g.isActive()) {
                c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(new IllegalStateException("Capture web failed"))));
            }
        } else if (c5961g.isActive()) {
            c5961g.resumeWith(Result.m13956constructorimpl(bitmapM4480a));
        }
    }
}
