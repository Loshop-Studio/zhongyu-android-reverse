package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import com.shockwave.pdfium.C7519a;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class PdfiumCore {

    /* renamed from: b */
    public static final String f12749b = "com.shockwave.pdfium.PdfiumCore";

    /* renamed from: c */
    public static final Class f12750c = FileDescriptor.class;

    /* renamed from: d */
    public static final Object f12751d;

    /* renamed from: e */
    public static Field f12752e;

    /* renamed from: a */
    public int f12753a;

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e10) {
            Log.e(f12749b, "Native libraries failed to load - " + e10);
        }
        f12751d = new Object();
        f12752e = null;
    }

    public PdfiumCore(Context context) {
        this.f12753a = context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: c */
    public static int m9702c(ParcelFileDescriptor parcelFileDescriptor) throws NoSuchFieldException, SecurityException {
        try {
            if (f12752e == null) {
                Field declaredField = f12750c.getDeclaredField("descriptor");
                f12752e = declaredField;
                declaredField.setAccessible(true);
            }
            return f12752e.getInt(parcelFileDescriptor.getFileDescriptor());
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
    public void m9703a(C7519a c7519a) {
        synchronized (f12751d) {
            try {
                Iterator it = c7519a.f12756c.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(((Long) c7519a.f12756c.get((Integer) it.next())).longValue());
                }
                c7519a.f12756c.clear();
                nativeCloseDocument(c7519a.f12754a);
                ParcelFileDescriptor parcelFileDescriptor = c7519a.f12755b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    c7519a.f12755b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public C7519a.c m9704b(C7519a c7519a) {
        C7519a.c cVar;
        synchronized (f12751d) {
            cVar = new C7519a.c();
            cVar.f12764a = nativeGetDocumentMetaText(c7519a.f12754a, "Title");
            cVar.f12765b = nativeGetDocumentMetaText(c7519a.f12754a, "Author");
            cVar.f12766c = nativeGetDocumentMetaText(c7519a.f12754a, "Subject");
            cVar.f12767d = nativeGetDocumentMetaText(c7519a.f12754a, "Keywords");
            cVar.f12768e = nativeGetDocumentMetaText(c7519a.f12754a, "Creator");
            cVar.f12769f = nativeGetDocumentMetaText(c7519a.f12754a, "Producer");
            cVar.f12770g = nativeGetDocumentMetaText(c7519a.f12754a, "CreationDate");
            cVar.f12771h = nativeGetDocumentMetaText(c7519a.f12754a, "ModDate");
        }
        return cVar;
    }

    /* renamed from: d */
    public int m9705d(C7519a c7519a) {
        int iNativeGetPageCount;
        synchronized (f12751d) {
            iNativeGetPageCount = nativeGetPageCount(c7519a.f12754a);
        }
        return iNativeGetPageCount;
    }

    /* renamed from: e */
    public List m9706e(C7519a c7519a, int i10) {
        synchronized (f12751d) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l10 = (Long) c7519a.f12756c.get(Integer.valueOf(i10));
                if (l10 == null) {
                    return arrayList;
                }
                for (long j10 : nativeGetPageLinks(l10.longValue())) {
                    Integer numNativeGetDestPageIndex = nativeGetDestPageIndex(c7519a.f12754a, j10);
                    String strNativeGetLinkURI = nativeGetLinkURI(c7519a.f12754a, j10);
                    RectF rectFNativeGetLinkRect = nativeGetLinkRect(j10);
                    if (rectFNativeGetLinkRect != null && (numNativeGetDestPageIndex != null || strNativeGetLinkURI != null)) {
                        arrayList.add(new C7519a.b(rectFNativeGetLinkRect, numNativeGetDestPageIndex, strNativeGetLinkURI));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public Size m9707f(C7519a c7519a, int i10) {
        Size sizeNativeGetPageSizeByIndex;
        synchronized (f12751d) {
            sizeNativeGetPageSizeByIndex = nativeGetPageSizeByIndex(c7519a.f12754a, i10, this.f12753a);
        }
        return sizeNativeGetPageSizeByIndex;
    }

    /* renamed from: g */
    public List m9708g(C7519a c7519a) {
        ArrayList arrayList;
        synchronized (f12751d) {
            try {
                arrayList = new ArrayList();
                Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c7519a.f12754a, null);
                if (lNativeGetFirstChildBookmark != null) {
                    m9713l(arrayList, c7519a, lNativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public Point m9709h(C7519a c7519a, int i10, int i11, int i12, int i13, int i14, int i15, double d10, double d11) {
        return nativePageCoordsToDevice(((Long) c7519a.f12756c.get(Integer.valueOf(i10))).longValue(), i11, i12, i13, i14, i15, d10, d11);
    }

    /* renamed from: i */
    public RectF m9710i(C7519a c7519a, int i10, int i11, int i12, int i13, int i14, int i15, RectF rectF) {
        Point pointM9709h = m9709h(c7519a, i10, i11, i12, i13, i14, i15, rectF.left, rectF.top);
        Point pointM9709h2 = m9709h(c7519a, i10, i11, i12, i13, i14, i15, rectF.right, rectF.bottom);
        return new RectF(pointM9709h.x, pointM9709h.y, pointM9709h2.x, pointM9709h2.y);
    }

    /* renamed from: j */
    public C7519a m9711j(ParcelFileDescriptor parcelFileDescriptor, String str) {
        C7519a c7519a = new C7519a();
        c7519a.f12755b = parcelFileDescriptor;
        synchronized (f12751d) {
            c7519a.f12754a = nativeOpenDocument(m9702c(parcelFileDescriptor), str);
        }
        return c7519a;
    }

    /* renamed from: k */
    public long m9712k(C7519a c7519a, int i10) {
        long jNativeLoadPage;
        synchronized (f12751d) {
            jNativeLoadPage = nativeLoadPage(c7519a.f12754a, i10);
            c7519a.f12756c.put(Integer.valueOf(i10), Long.valueOf(jNativeLoadPage));
        }
        return jNativeLoadPage;
    }

    /* renamed from: l */
    public final void m9713l(List list, C7519a c7519a, long j10) {
        C7519a.a aVar = new C7519a.a();
        aVar.f12760d = j10;
        aVar.f12758b = nativeGetBookmarkTitle(j10);
        aVar.f12759c = nativeGetBookmarkDestIndex(c7519a.f12754a, j10);
        list.add(aVar);
        Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c7519a.f12754a, Long.valueOf(j10));
        if (lNativeGetFirstChildBookmark != null) {
            m9713l(aVar.m9715a(), c7519a, lNativeGetFirstChildBookmark.longValue());
        }
        Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(c7519a.f12754a, j10);
        if (lNativeGetSiblingBookmark != null) {
            m9713l(list, c7519a, lNativeGetSiblingBookmark.longValue());
        }
    }

    /* renamed from: m */
    public void m9714m(C7519a c7519a, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        synchronized (f12751d) {
            try {
                nativeRenderPageBitmap(((Long) c7519a.f12756c.get(Integer.valueOf(i10))).longValue(), bitmap, this.f12753a, i11, i12, i13, i14, z10);
            } catch (NullPointerException e10) {
                Log.e(f12749b, "mContext may be null");
                e10.printStackTrace();
            } catch (Exception e11) {
                Log.e(f12749b, "Exception throw from native");
                e11.printStackTrace();
            }
        }
    }
}
