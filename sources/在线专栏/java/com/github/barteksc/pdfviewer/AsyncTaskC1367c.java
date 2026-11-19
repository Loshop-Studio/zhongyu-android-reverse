package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.os.AsyncTask;
import com.shockwave.pdfium.C1671a;
import com.shockwave.pdfium.PdfiumCore;
import p141q1.InterfaceC3007a;

/* renamed from: com.github.barteksc.pdfviewer.c */
/* loaded from: classes.dex */
class AsyncTaskC1367c extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    private boolean f7314a = false;

    /* renamed from: b */
    private PDFView f7315b;

    /* renamed from: c */
    private Context f7316c;

    /* renamed from: d */
    private PdfiumCore f7317d;

    /* renamed from: e */
    private C1671a f7318e;

    /* renamed from: f */
    private String f7319f;

    /* renamed from: g */
    private InterfaceC3007a f7320g;

    /* renamed from: h */
    private int f7321h;

    /* renamed from: i */
    private int f7322i;

    /* renamed from: j */
    private int f7323j;

    AsyncTaskC1367c(InterfaceC3007a interfaceC3007a, String str, PDFView pDFView, PdfiumCore pdfiumCore, int i4) {
        this.f7320g = interfaceC3007a;
        this.f7321h = i4;
        this.f7315b = pDFView;
        this.f7319f = str;
        this.f7317d = pdfiumCore;
        this.f7316c = pDFView.getContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            C1671a c1671aMo10109a = this.f7320g.mo10109a(this.f7316c, this.f7317d, this.f7319f);
            this.f7318e = c1671aMo10109a;
            this.f7317d.m5728i(c1671aMo10109a, this.f7321h);
            this.f7322i = this.f7317d.m5725f(this.f7318e, this.f7321h);
            this.f7323j = this.f7317d.m5724e(this.f7318e, this.f7321h);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        if (th != null) {
            this.f7315b.m5635L(th);
        } else {
            if (this.f7314a) {
                return;
            }
            this.f7315b.m5634K(this.f7318e, this.f7322i, this.f7323j);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        this.f7314a = true;
    }
}
