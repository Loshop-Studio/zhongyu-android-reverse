package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseBooleanArray;
import com.shockwave.pdfium.C1671a;
import com.shockwave.pdfium.PdfiumCore;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p119m1.C2860a;
import p127o1.C2907a;

/* renamed from: com.github.barteksc.pdfviewer.f */
/* loaded from: classes.dex */
class HandlerC1370f extends Handler {

    /* renamed from: i */
    private static final String f7353i = HandlerC1370f.class.getName();

    /* renamed from: a */
    private PdfiumCore f7354a;

    /* renamed from: b */
    private C1671a f7355b;

    /* renamed from: c */
    private PDFView f7356c;

    /* renamed from: d */
    private RectF f7357d;

    /* renamed from: e */
    private Rect f7358e;

    /* renamed from: f */
    private Matrix f7359f;

    /* renamed from: g */
    private final SparseBooleanArray f7360g;

    /* renamed from: h */
    private boolean f7361h;

    /* renamed from: com.github.barteksc.pdfviewer.f$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2907a f7362a;

        a(C2907a c2907a) {
            this.f7362a = c2907a;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC1370f.this.f7356c.m5641R(this.f7362a);
        }
    }

    /* renamed from: com.github.barteksc.pdfviewer.f$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2860a f7364a;

        b(C2860a c2860a) {
            this.f7364a = c2860a;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC1370f.this.f7356c.m5642S(this.f7364a);
        }
    }

    /* renamed from: com.github.barteksc.pdfviewer.f$c */
    private class c {

        /* renamed from: a */
        float f7366a;

        /* renamed from: b */
        float f7367b;

        /* renamed from: c */
        RectF f7368c;

        /* renamed from: d */
        int f7369d;

        /* renamed from: e */
        int f7370e;

        /* renamed from: f */
        boolean f7371f;

        /* renamed from: g */
        int f7372g;

        /* renamed from: h */
        boolean f7373h;

        /* renamed from: i */
        boolean f7374i;

        c(float f4, float f5, RectF rectF, int i4, int i5, boolean z3, int i6, boolean z4, boolean z5) {
            this.f7369d = i5;
            this.f7366a = f4;
            this.f7367b = f5;
            this.f7368c = rectF;
            this.f7370e = i4;
            this.f7371f = z3;
            this.f7372g = i6;
            this.f7373h = z4;
            this.f7374i = z5;
        }
    }

    HandlerC1370f(Looper looper, PDFView pDFView, PdfiumCore pdfiumCore, C1671a c1671a) {
        super(looper);
        this.f7357d = new RectF();
        this.f7358e = new Rect();
        this.f7359f = new Matrix();
        this.f7360g = new SparseBooleanArray();
        this.f7361h = false;
        this.f7356c = pDFView;
        this.f7354a = pdfiumCore;
        this.f7355b = c1671a;
    }

    /* renamed from: c */
    private void m5714c(int i4, int i5, RectF rectF) {
        this.f7359f.reset();
        float f4 = i4;
        float f5 = i5;
        this.f7359f.postTranslate((-rectF.left) * f4, (-rectF.top) * f5);
        this.f7359f.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f7357d.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f4, f5);
        this.f7359f.mapRect(this.f7357d);
        this.f7357d.round(this.f7358e);
    }

    /* renamed from: d */
    private C2907a m5715d(c cVar) throws Throwable {
        if (this.f7360g.indexOfKey(cVar.f7369d) < 0) {
            try {
                this.f7354a.m5728i(this.f7355b, cVar.f7369d);
                this.f7360g.put(cVar.f7369d, true);
            } catch (Exception e4) {
                this.f7360g.put(cVar.f7369d, false);
                throw new C2860a(cVar.f7369d, e4);
            }
        }
        int iRound = Math.round(cVar.f7366a);
        int iRound2 = Math.round(cVar.f7367b);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, cVar.f7373h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            m5714c(iRound, iRound2, cVar.f7368c);
            if (this.f7360g.get(cVar.f7369d)) {
                PdfiumCore pdfiumCore = this.f7354a;
                C1671a c1671a = this.f7355b;
                int i4 = cVar.f7369d;
                Rect rect = this.f7358e;
                pdfiumCore.m5729k(c1671a, bitmapCreateBitmap, i4, rect.left, rect.top, rect.width(), this.f7358e.height(), cVar.f7374i);
            } else {
                bitmapCreateBitmap.eraseColor(this.f7356c.getInvalidPageColor());
            }
            return new C2907a(cVar.f7370e, cVar.f7369d, bitmapCreateBitmap, cVar.f7366a, cVar.f7367b, cVar.f7368c, cVar.f7371f, cVar.f7372g);
        } catch (IllegalArgumentException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    void m5716b(int i4, int i5, float f4, float f5, RectF rectF, boolean z3, int i6, boolean z4, boolean z5) {
        sendMessage(obtainMessage(1, new c(f4, f5, rectF, i4, i5, z3, i6, z4, z5)));
    }

    /* renamed from: e */
    void m5717e() {
        this.f7361h = true;
    }

    /* renamed from: f */
    void m5718f() {
        this.f7361h = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        try {
            C2907a c2907aM5715d = m5715d((c) message.obj);
            if (c2907aM5715d != null) {
                if (this.f7361h) {
                    this.f7356c.post(new a(c2907aM5715d));
                } else {
                    c2907aM5715d.m9976e().recycle();
                }
            }
        } catch (C2860a e4) {
            this.f7356c.post(new b(e4));
        }
    }
}
