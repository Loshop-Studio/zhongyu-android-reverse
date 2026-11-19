package p293x0;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;
import p032c1.InterfaceC5228a;

/* renamed from: x0.c */
/* loaded from: classes3.dex */
public class AsyncTaskC10484c extends AsyncTask {

    /* renamed from: a */
    public boolean f20839a = false;

    /* renamed from: b */
    public WeakReference f20840b;

    /* renamed from: c */
    public PdfiumCore f20841c;

    /* renamed from: d */
    public String f20842d;

    /* renamed from: e */
    public InterfaceC5228a f20843e;

    /* renamed from: f */
    public int[] f20844f;

    /* renamed from: g */
    public C10487f f20845g;

    public AsyncTaskC10484c(InterfaceC5228a interfaceC5228a, String str, int[] iArr, PDFView pDFView, PdfiumCore pdfiumCore) {
        this.f20843e = interfaceC5228a;
        this.f20844f = iArr;
        this.f20840b = new WeakReference(pDFView);
        this.f20842d = str;
        this.f20841c = pdfiumCore;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            PDFView pDFView = (PDFView) this.f20840b.get();
            if (pDFView == null) {
                return new NullPointerException("pdfView == null");
            }
            this.f20845g = new C10487f(this.f20841c, this.f20843e.mo2133a(pDFView.getContext(), this.f20841c, this.f20842d), pDFView.getPageFitPolicy(), m19633b(pDFView), this.f20844f, pDFView.m3558C(), pDFView.getSpacingPx(), pDFView.m3599w(), pDFView.m3602z());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: b */
    public final Size m19633b(PDFView pDFView) {
        return new Size(pDFView.getWidth(), pDFView.getHeight());
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        PDFView pDFView = (PDFView) this.f20840b.get();
        if (pDFView != null) {
            if (th != null) {
                pDFView.m3565J(th);
            } else {
                if (this.f20839a) {
                    return;
                }
                pDFView.m3564I(this.f20845g);
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.f20839a = true;
    }
}
