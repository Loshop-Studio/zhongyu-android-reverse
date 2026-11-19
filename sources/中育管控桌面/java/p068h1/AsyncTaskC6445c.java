package p068h1;

import android.content.Context;
import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.C5764a;
import com.shockwave.pdfium.PdfiumCore;
import p098l1.InterfaceC7292a;

/* renamed from: h1.c */
/* loaded from: classes3.dex */
public class AsyncTaskC6445c extends AsyncTask {

    /* renamed from: a */
    public boolean f8159a = false;

    /* renamed from: b */
    public PDFView f8160b;

    /* renamed from: c */
    public Context f8161c;

    /* renamed from: d */
    public PdfiumCore f8162d;

    /* renamed from: e */
    public C5764a f8163e;

    /* renamed from: f */
    public String f8164f;

    /* renamed from: g */
    public InterfaceC7292a f8165g;

    /* renamed from: h */
    public int f8166h;

    /* renamed from: i */
    public int f8167i;

    /* renamed from: j */
    public int f8168j;

    public AsyncTaskC6445c(InterfaceC7292a interfaceC7292a, String str, PDFView pDFView, PdfiumCore pdfiumCore, int i6) {
        this.f8165g = interfaceC7292a;
        this.f8166h = i6;
        this.f8160b = pDFView;
        this.f8164f = str;
        this.f8162d = pdfiumCore;
        this.f8161c = pDFView.getContext();
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            C5764a c5764aMo8292a = this.f8165g.mo8292a(this.f8161c, this.f8162d, this.f8164f);
            this.f8163e = c5764aMo8292a;
            this.f8162d.m3751i(c5764aMo8292a, this.f8166h);
            this.f8167i = this.f8162d.m3748f(this.f8163e, this.f8166h);
            this.f8168j = this.f8162d.m3747e(this.f8163e, this.f8166h);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        if (th != null) {
            this.f8160b.m3378K(th);
        } else {
            if (this.f8159a) {
                return;
            }
            this.f8160b.m3377J(this.f8163e, this.f8167i, this.f8168j);
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.f8159a = true;
    }
}
