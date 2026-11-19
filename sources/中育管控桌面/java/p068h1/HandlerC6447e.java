package p068h1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.shockwave.pdfium.C5764a;
import com.shockwave.pdfium.PdfiumCore;
import p082j1.C6583a;

/* renamed from: h1.e */
/* loaded from: classes3.dex */
public class HandlerC6447e extends Handler {

    /* renamed from: a */
    public PdfiumCore f8177a;

    /* renamed from: b */
    public C5764a f8178b;

    /* renamed from: c */
    public PDFView f8179c;

    /* renamed from: d */
    public RectF f8180d;

    /* renamed from: e */
    public Rect f8181e;

    /* renamed from: f */
    public Matrix f8182f;

    /* renamed from: g */
    public final SparseBooleanArray f8183g;

    /* renamed from: h */
    public boolean f8184h;

    /* renamed from: h1.e$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C6583a f8185a;

        public a(C6583a c6583a) {
            this.f8185a = c6583a;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC6447e.this.f8179c.m3384Q(this.f8185a);
        }
    }

    /* renamed from: h1.e$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PageRenderingException f8187a;

        public b(PageRenderingException pageRenderingException) {
            this.f8187a = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC6447e.this.f8179c.m3385R(this.f8187a);
        }
    }

    /* renamed from: h1.e$c */
    public class c {

        /* renamed from: a */
        public float f8189a;

        /* renamed from: b */
        public float f8190b;

        /* renamed from: c */
        public RectF f8191c;

        /* renamed from: d */
        public int f8192d;

        /* renamed from: e */
        public int f8193e;

        /* renamed from: f */
        public boolean f8194f;

        /* renamed from: g */
        public int f8195g;

        /* renamed from: h */
        public boolean f8196h;

        /* renamed from: i */
        public boolean f8197i;

        public c(float f6, float f7, RectF rectF, int i6, int i7, boolean z6, int i8, boolean z7, boolean z8) {
            this.f8192d = i7;
            this.f8189a = f6;
            this.f8190b = f7;
            this.f8191c = rectF;
            this.f8193e = i6;
            this.f8194f = z6;
            this.f8195g = i8;
            this.f8196h = z7;
            this.f8197i = z8;
        }
    }

    public HandlerC6447e(Looper looper, PDFView pDFView, PdfiumCore pdfiumCore, C5764a c5764a) {
        super(looper);
        this.f8180d = new RectF();
        this.f8181e = new Rect();
        this.f8182f = new Matrix();
        this.f8183g = new SparseBooleanArray();
        this.f8184h = false;
        this.f8179c = pDFView;
        this.f8177a = pdfiumCore;
        this.f8178b = c5764a;
    }

    /* renamed from: b */
    public void m7086b(int i6, int i7, float f6, float f7, RectF rectF, boolean z6, int i8, boolean z7, boolean z8) {
        sendMessage(obtainMessage(1, new c(f6, f7, rectF, i6, i7, z6, i8, z7, z8)));
    }

    /* renamed from: c */
    public final void m7087c(int i6, int i7, RectF rectF) {
        this.f8182f.reset();
        float f6 = i6;
        float f7 = i7;
        this.f8182f.postTranslate((-rectF.left) * f6, (-rectF.top) * f7);
        this.f8182f.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f8180d.set(0.0f, 0.0f, f6, f7);
        this.f8182f.mapRect(this.f8180d);
        this.f8180d.round(this.f8181e);
    }

    /* renamed from: d */
    public final C6583a m7088d(c cVar) throws PageRenderingException {
        if (this.f8183g.indexOfKey(cVar.f8192d) < 0) {
            try {
                this.f8177a.m3751i(this.f8178b, cVar.f8192d);
                this.f8183g.put(cVar.f8192d, true);
            } catch (Exception e6) {
                this.f8183g.put(cVar.f8192d, false);
                throw new PageRenderingException(cVar.f8192d, e6);
            }
        }
        int iRound = Math.round(cVar.f8189a);
        int iRound2 = Math.round(cVar.f8190b);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, cVar.f8196h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            m7087c(iRound, iRound2, cVar.f8191c);
            if (this.f8183g.get(cVar.f8192d)) {
                PdfiumCore pdfiumCore = this.f8177a;
                C5764a c5764a = this.f8178b;
                int i6 = cVar.f8192d;
                Rect rect = this.f8181e;
                pdfiumCore.m3753k(c5764a, bitmapCreateBitmap, i6, rect.left, rect.top, rect.width(), this.f8181e.height(), cVar.f8197i);
            } else {
                bitmapCreateBitmap.eraseColor(this.f8179c.getInvalidPageColor());
            }
            return new C6583a(cVar.f8193e, cVar.f8192d, bitmapCreateBitmap, cVar.f8189a, cVar.f8190b, cVar.f8191c, cVar.f8194f, cVar.f8195g);
        } catch (IllegalArgumentException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public void m7089e() {
        this.f8184h = true;
    }

    /* renamed from: f */
    public void m7090f() {
        this.f8184h = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C6583a c6583aM7088d = m7088d((c) message.obj);
            if (c6583aM7088d != null) {
                if (this.f8184h) {
                    this.f8179c.post(new a(c6583aM7088d));
                } else {
                    c6583aM7088d.m7471e().recycle();
                }
            }
        } catch (PageRenderingException e6) {
            this.f8179c.post(new b(e6));
        }
    }
}
