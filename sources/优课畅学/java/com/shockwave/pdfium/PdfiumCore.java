package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import com.shockwave.pdfium.C6409a;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class PdfiumCore {

    /* renamed from: b */
    public static final String f4296b = "com.shockwave.pdfium.PdfiumCore";

    /* renamed from: c */
    public static final Class f4297c = FileDescriptor.class;

    /* renamed from: d */
    public static final Object f4298d;

    /* renamed from: e */
    public static Field f4299e;

    /* renamed from: a */
    public int f4300a;

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e10) {
            Log.e(f4296b, "Native libraries failed to load - " + e10);
        }
        f4298d = new Object();
        f4299e = null;
    }

    public PdfiumCore(Context context) {
        this.f4300a = context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: c */
    public static int m4089c(ParcelFileDescriptor parcelFileDescriptor) throws NoSuchFieldException, SecurityException {
        try {
            if (f4299e == null) {
                Field declaredField = f4297c.getDeclaredField("descriptor");
                f4299e = declaredField;
                declaredField.setAccessible(true);
            }
            return f4299e.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return -1;
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    private native void nativeCloseDocument(long j10);

    private native void nativeClosePage(long j10);

    private native void nativeClosePages(long[] jArr);

    private native long nativeGetBookmarkDestIndex(long j10, long j11);

    private native String nativeGetBookmarkTitle(long j10);

    private native Integer nativeGetDestPageIndex(long j10, long j11);

    private native String nativeGetDocumentMetaText(long j10, String str);

    private native Long nativeGetFirstChildBookmark(long j10, Long l10);

    private native RectF nativeGetLinkRect(long j10);

    private native String nativeGetLinkURI(long j10, long j11);

    private native int nativeGetPageCount(long j10);

    private native int nativeGetPageHeightPixel(long j10, int i10);

    private native int nativeGetPageHeightPoint(long j10);

    private native long[] nativeGetPageLinks(long j10);

    private native Size nativeGetPageSizeByIndex(long j10, int i10, int i11);

    private native int nativeGetPageWidthPixel(long j10, int i10);

    private native int nativeGetPageWidthPoint(long j10);

    private native Long nativeGetSiblingBookmark(long j10, long j11);

    private native long nativeLoadPage(long j10, int i10);

    private native long[] nativeLoadPages(long j10, int i10, int i11);

    private native long nativeOpenDocument(int i10, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j10, int i10, int i11, int i12, int i13, int i14, double d10, double d11);

    private native void nativeRenderPage(long j10, Surface surface, int i10, int i11, int i12, int i13, int i14, boolean z10);

    private native void nativeRenderPageBitmap(long j10, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10);

    /* renamed from: a */
    public void m4090a(C6409a c6409a) {
        synchronized (f4298d) {
            try {
                Iterator it = c6409a.f4303c.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(((Long) c6409a.f4303c.get((Integer) it.next())).longValue());
                }
                c6409a.f4303c.clear();
                nativeCloseDocument(c6409a.f4301a);
                ParcelFileDescriptor parcelFileDescriptor = c6409a.f4302b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    c6409a.f4302b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public C6409a.c m4091b(C6409a c6409a) {
        C6409a.c cVar;
        synchronized (f4298d) {
            cVar = new C6409a.c();
            cVar.f4311a = nativeGetDocumentMetaText(c6409a.f4301a, "Title");
            cVar.f4312b = nativeGetDocumentMetaText(c6409a.f4301a, "Author");
            cVar.f4313c = nativeGetDocumentMetaText(c6409a.f4301a, "Subject");
            cVar.f4314d = nativeGetDocumentMetaText(c6409a.f4301a, "Keywords");
            cVar.f4315e = nativeGetDocumentMetaText(c6409a.f4301a, "Creator");
            cVar.f4316f = nativeGetDocumentMetaText(c6409a.f4301a, "Producer");
            cVar.f4317g = nativeGetDocumentMetaText(c6409a.f4301a, "CreationDate");
            cVar.f4318h = nativeGetDocumentMetaText(c6409a.f4301a, "ModDate");
        }
        return cVar;
    }

    /* renamed from: d */
    public int m4092d(C6409a c6409a) {
        int iNativeGetPageCount;
        synchronized (f4298d) {
            iNativeGetPageCount = nativeGetPageCount(c6409a.f4301a);
        }
        return iNativeGetPageCount;
    }

    /* renamed from: e */
    public List m4093e(C6409a c6409a, int i10) {
        synchronized (f4298d) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l10 = (Long) c6409a.f4303c.get(Integer.valueOf(i10));
                if (l10 == null) {
                    return arrayList;
                }
                for (long j10 : nativeGetPageLinks(l10.longValue())) {
                    Integer numNativeGetDestPageIndex = nativeGetDestPageIndex(c6409a.f4301a, j10);
                    String strNativeGetLinkURI = nativeGetLinkURI(c6409a.f4301a, j10);
                    RectF rectFNativeGetLinkRect = nativeGetLinkRect(j10);
                    if (rectFNativeGetLinkRect != null && (numNativeGetDestPageIndex != null || strNativeGetLinkURI != null)) {
                        arrayList.add(new C6409a.b(rectFNativeGetLinkRect, numNativeGetDestPageIndex, strNativeGetLinkURI));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public Size m4094f(C6409a c6409a, int i10) {
        Size sizeNativeGetPageSizeByIndex;
        synchronized (f4298d) {
            sizeNativeGetPageSizeByIndex = nativeGetPageSizeByIndex(c6409a.f4301a, i10, this.f4300a);
        }
        return sizeNativeGetPageSizeByIndex;
    }

    /* renamed from: g */
    public List m4095g(C6409a c6409a) {
        ArrayList arrayList;
        synchronized (f4298d) {
            try {
                arrayList = new ArrayList();
                Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c6409a.f4301a, null);
                if (lNativeGetFirstChildBookmark != null) {
                    m4100l(arrayList, c6409a, lNativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public Point m4096h(C6409a c6409a, int i10, int i11, int i12, int i13, int i14, int i15, double d10, double d11) {
        return nativePageCoordsToDevice(((Long) c6409a.f4303c.get(Integer.valueOf(i10))).longValue(), i11, i12, i13, i14, i15, d10, d11);
    }

    /* renamed from: i */
    public RectF m4097i(C6409a c6409a, int i10, int i11, int i12, int i13, int i14, int i15, RectF rectF) {
        Point pointM4096h = m4096h(c6409a, i10, i11, i12, i13, i14, i15, rectF.left, rectF.top);
        Point pointM4096h2 = m4096h(c6409a, i10, i11, i12, i13, i14, i15, rectF.right, rectF.bottom);
        return new RectF(pointM4096h.x, pointM4096h.y, pointM4096h2.x, pointM4096h2.y);
    }

    /* renamed from: j */
    public C6409a m4098j(ParcelFileDescriptor parcelFileDescriptor, String str) {
        C6409a c6409a = new C6409a();
        c6409a.f4302b = parcelFileDescriptor;
        synchronized (f4298d) {
            c6409a.f4301a = nativeOpenDocument(m4089c(parcelFileDescriptor), str);
        }
        return c6409a;
    }

    /* renamed from: k */
    public long m4099k(C6409a c6409a, int i10) {
        long jNativeLoadPage;
        synchronized (f4298d) {
            jNativeLoadPage = nativeLoadPage(c6409a.f4301a, i10);
            c6409a.f4303c.put(Integer.valueOf(i10), Long.valueOf(jNativeLoadPage));
        }
        return jNativeLoadPage;
    }

    /* renamed from: l */
    public final void m4100l(List list, C6409a c6409a, long j10) {
        C6409a.a aVar = new C6409a.a();
        aVar.f4307d = j10;
        aVar.f4305b = nativeGetBookmarkTitle(j10);
        aVar.f4306c = nativeGetBookmarkDestIndex(c6409a.f4301a, j10);
        list.add(aVar);
        Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c6409a.f4301a, Long.valueOf(j10));
        if (lNativeGetFirstChildBookmark != null) {
            m4100l(aVar.m4102a(), c6409a, lNativeGetFirstChildBookmark.longValue());
        }
        Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(c6409a.f4301a, j10);
        if (lNativeGetSiblingBookmark != null) {
            m4100l(list, c6409a, lNativeGetSiblingBookmark.longValue());
        }
    }

    /* renamed from: m */
    public void m4101m(C6409a c6409a, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        synchronized (f4298d) {
            try {
                nativeRenderPageBitmap(((Long) c6409a.f4303c.get(Integer.valueOf(i10))).longValue(), bitmap, this.f4300a, i11, i12, i13, i14, z10);
            } catch (NullPointerException e10) {
                Log.e(f4296b, "mContext may be null");
                e10.printStackTrace();
            } catch (Exception e11) {
                Log.e(f4296b, "Exception throw from native");
                e11.printStackTrace();
            }
        }
    }
}
