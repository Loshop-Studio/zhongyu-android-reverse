package p293x0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import p002a1.C0021b;

/* renamed from: x0.g */
/* loaded from: classes3.dex */
public class HandlerC10488g extends Handler {

    /* renamed from: f */
    public static final String f20894f = "x0.g";

    /* renamed from: a */
    public PDFView f20895a;

    /* renamed from: b */
    public RectF f20896b;

    /* renamed from: c */
    public Rect f20897c;

    /* renamed from: d */
    public Matrix f20898d;

    /* renamed from: e */
    public boolean f20899e;

    /* renamed from: x0.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0021b f20900a;

        public a(C0021b c0021b) {
            this.f20900a = c0021b;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC10488g.this.f20895a.m3571P(this.f20900a);
        }
    }

    /* renamed from: x0.g$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PageRenderingException f20902a;

        public b(PageRenderingException pageRenderingException) {
            this.f20902a = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC10488g.this.f20895a.m3572Q(this.f20902a);
        }
    }

    /* renamed from: x0.g$c */
    public class c {

        /* renamed from: a */
        public float f20904a;

        /* renamed from: b */
        public float f20905b;

        /* renamed from: c */
        public RectF f20906c;

        /* renamed from: d */
        public int f20907d;

        /* renamed from: e */
        public boolean f20908e;

        /* renamed from: f */
        public int f20909f;

        /* renamed from: g */
        public boolean f20910g;

        /* renamed from: h */
        public boolean f20911h;

        public c(float f10, float f11, RectF rectF, int i10, boolean z10, int i11, boolean z11, boolean z12) {
            this.f20907d = i10;
            this.f20904a = f10;
            this.f20905b = f11;
            this.f20906c = rectF;
            this.f20908e = z10;
            this.f20909f = i11;
            this.f20910g = z11;
            this.f20911h = z12;
        }
    }

    public HandlerC10488g(Looper looper, PDFView pDFView) {
        super(looper);
        this.f20896b = new RectF();
        this.f20897c = new Rect();
        this.f20898d = new Matrix();
        this.f20899e = false;
        this.f20895a = pDFView;
    }

    /* renamed from: b */
    public void m19679b(int i10, float f10, float f11, RectF rectF, boolean z10, int i11, boolean z11, boolean z12) {
        sendMessage(obtainMessage(1, new c(f10, f11, rectF, i10, z10, i11, z11, z12)));
    }

    /* renamed from: c */
    public final void m19680c(int i10, int i11, RectF rectF) {
        this.f20898d.reset();
        float f10 = i10;
        float f11 = i11;
        this.f20898d.postTranslate((-rectF.left) * f10, (-rectF.top) * f11);
        this.f20898d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f20896b.set(0.0f, 0.0f, f10, f11);
        this.f20898d.mapRect(this.f20896b);
        this.f20896b.round(this.f20897c);
    }

    /* renamed from: d */
    public final C0021b m19681d(c cVar) {
        C10487f c10487f = this.f20895a.f3718h;
        c10487f.m19671t(cVar.f20907d);
        int iRound = Math.round(cVar.f20904a);
        int iRound2 = Math.round(cVar.f20905b);
        if (iRound != 0 && iRound2 != 0 && !c10487f.m19672u(cVar.f20907d)) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, cVar.f20910g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                m19680c(iRound, iRound2, cVar.f20906c);
                c10487f.m19677z(bitmapCreateBitmap, cVar.f20907d, this.f20897c, cVar.f20911h);
                return new C0021b(cVar.f20907d, bitmapCreateBitmap, cVar.f20906c, cVar.f20908e, cVar.f20909f);
            } catch (IllegalArgumentException e10) {
                Log.e(f20894f, "Cannot create bitmap", e10);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m19682e() {
        this.f20899e = true;
    }

    /* renamed from: f */
    public void m19683f() {
        this.f20899e = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C0021b c0021bM19681d = m19681d((c) message.obj);
            if (c0021bM19681d != null) {
                if (this.f20899e) {
                    this.f20895a.post(new a(c0021bM19681d));
                } else {
                    c0021bM19681d.m48d().recycle();
                }
            }
        } catch (PageRenderingException e10) {
            this.f20895a.post(new b(e10));
        }
    }
}
