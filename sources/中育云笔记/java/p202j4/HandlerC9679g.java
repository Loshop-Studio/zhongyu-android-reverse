package p202j4;

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
import p246m4.C10199b;

/* renamed from: j4.g */
/* loaded from: classes5.dex */
public class HandlerC9679g extends Handler {

    /* renamed from: f */
    public static final String f22459f = "j4.g";

    /* renamed from: a */
    public PDFView f22460a;

    /* renamed from: b */
    public RectF f22461b;

    /* renamed from: c */
    public Rect f22462c;

    /* renamed from: d */
    public Matrix f22463d;

    /* renamed from: e */
    public boolean f22464e;

    /* renamed from: j4.g$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C10199b f22465c;

        public a(C10199b c10199b) {
            this.f22465c = c10199b;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC9679g.this.f22460a.m7862P(this.f22465c);
        }
    }

    /* renamed from: j4.g$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ PageRenderingException f22467c;

        public b(PageRenderingException pageRenderingException) {
            this.f22467c = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC9679g.this.f22460a.m7863Q(this.f22467c);
        }
    }

    /* renamed from: j4.g$c */
    public class c {

        /* renamed from: a */
        public float f22469a;

        /* renamed from: b */
        public float f22470b;

        /* renamed from: c */
        public RectF f22471c;

        /* renamed from: d */
        public int f22472d;

        /* renamed from: e */
        public boolean f22473e;

        /* renamed from: f */
        public int f22474f;

        /* renamed from: g */
        public boolean f22475g;

        /* renamed from: h */
        public boolean f22476h;

        public c(float f10, float f11, RectF rectF, int i10, boolean z10, int i11, boolean z11, boolean z12) {
            this.f22472d = i10;
            this.f22469a = f10;
            this.f22470b = f11;
            this.f22471c = rectF;
            this.f22473e = z10;
            this.f22474f = i11;
            this.f22475g = z11;
            this.f22476h = z12;
        }
    }

    public HandlerC9679g(Looper looper, PDFView pDFView) {
        super(looper);
        this.f22461b = new RectF();
        this.f22462c = new Rect();
        this.f22463d = new Matrix();
        this.f22464e = false;
        this.f22460a = pDFView;
    }

    /* renamed from: b */
    public void m19134b(int i10, float f10, float f11, RectF rectF, boolean z10, int i11, boolean z11, boolean z12) {
        sendMessage(obtainMessage(1, new c(f10, f11, rectF, i10, z10, i11, z11, z12)));
    }

    /* renamed from: c */
    public final void m19135c(int i10, int i11, RectF rectF) {
        this.f22463d.reset();
        float f10 = i10;
        float f11 = i11;
        this.f22463d.postTranslate((-rectF.left) * f10, (-rectF.top) * f11);
        this.f22463d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f22461b.set(0.0f, 0.0f, f10, f11);
        this.f22463d.mapRect(this.f22461b);
        this.f22461b.round(this.f22462c);
    }

    /* renamed from: d */
    public final C10199b m19136d(c cVar) {
        C9678f c9678f = this.f22460a.f10801j;
        c9678f.m19126t(cVar.f22472d);
        int iRound = Math.round(cVar.f22469a);
        int iRound2 = Math.round(cVar.f22470b);
        if (iRound != 0 && iRound2 != 0 && !c9678f.m19127u(cVar.f22472d)) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, cVar.f22475g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                m19135c(iRound, iRound2, cVar.f22471c);
                c9678f.m19132z(bitmapCreateBitmap, cVar.f22472d, this.f22462c, cVar.f22476h);
                return new C10199b(cVar.f22472d, bitmapCreateBitmap, cVar.f22471c, cVar.f22473e, cVar.f22474f);
            } catch (IllegalArgumentException e10) {
                Log.e(f22459f, "Cannot create bitmap", e10);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m19137e() {
        this.f22464e = true;
    }

    /* renamed from: f */
    public void m19138f() {
        this.f22464e = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C10199b c10199bM19136d = m19136d((c) message.obj);
            if (c10199bM19136d != null) {
                if (this.f22464e) {
                    this.f22460a.post(new a(c10199bM19136d));
                } else {
                    c10199bM19136d.m21302d().recycle();
                }
            }
        } catch (PageRenderingException e10) {
            this.f22460a.post(new b(e10));
        }
    }
}
