package p202j4;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;
import p271o4.InterfaceC10442a;

/* renamed from: j4.c */
/* loaded from: classes5.dex */
public class AsyncTaskC9675c extends AsyncTask {

    /* renamed from: a */
    public boolean f22404a = false;

    /* renamed from: b */
    public WeakReference f22405b;

    /* renamed from: c */
    public PdfiumCore f22406c;

    /* renamed from: d */
    public String f22407d;

    /* renamed from: e */
    public InterfaceC10442a f22408e;

    /* renamed from: f */
    public int[] f22409f;

    /* renamed from: g */
    public C9678f f22410g;

    public AsyncTaskC9675c(InterfaceC10442a interfaceC10442a, String str, int[] iArr, PDFView pDFView, PdfiumCore pdfiumCore) {
        this.f22408e = interfaceC10442a;
        this.f22409f = iArr;
        this.f22405b = new WeakReference(pDFView);
        this.f22407d = str;
        this.f22406c = pdfiumCore;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            PDFView pDFView = (PDFView) this.f22405b.get();
            if (pDFView == null) {
                return new NullPointerException("pdfView == null");
            }
            this.f22410g = new C9678f(this.f22406c, this.f22408e.mo21824a(pDFView.getContext(), this.f22406c, this.f22407d), pDFView.getPageFitPolicy(), m19088b(pDFView), this.f22409f, pDFView.m7849C(), pDFView.getSpacingPx(), pDFView.m7890w(), pDFView.m7893z());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: b */
    public final Size m19088b(PDFView pDFView) {
        return new Size(pDFView.getWidth(), pDFView.getHeight());
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        PDFView pDFView = (PDFView) this.f22405b.get();
        if (pDFView != null) {
            if (th != null) {
                pDFView.m7856J(th);
            } else {
                if (this.f22404a) {
                    return;
                }
                pDFView.m7855I(this.f22410g);
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.f22404a = true;
    }
}
