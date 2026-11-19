package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import com.shockwave.pdfium.C5764a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PdfiumCore {

    /* renamed from: b */
    public static final String f3684b = "com.shockwave.pdfium.PdfiumCore";

    /* renamed from: c */
    public static final Class f3685c;

    /* renamed from: d */
    public static Field f3686d;

    /* renamed from: e */
    public static final Object f3687e;

    /* renamed from: a */
    public int f3688a;

    static {
        try {
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e6) {
            Log.e(f3684b, "Native libraries failed to load - " + e6);
        }
        f3685c = FileDescriptor.class;
        f3686d = null;
        f3687e = new Object();
    }

    public PdfiumCore(Context context) {
        this.f3688a = context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: c */
    public static int m3743c(ParcelFileDescriptor parcelFileDescriptor) throws NoSuchFieldException, SecurityException {
        try {
            if (f3686d == null) {
                Field declaredField = f3685c.getDeclaredField("descriptor");
                f3686d = declaredField;
                declaredField.setAccessible(true);
            }
            return f3686d.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
            return -1;
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
            return -1;
        }
    }

    private native void nativeCloseDocument(long j6);

    private native void nativeClosePage(long j6);

    private native void nativeClosePages(long[] jArr);

    private native long nativeGetBookmarkDestIndex(long j6, long j7);

    private native String nativeGetBookmarkTitle(long j6);

    private native String nativeGetDocumentMetaText(long j6, String str);

    private native Long nativeGetFirstChildBookmark(long j6, Long l6);

    private native int nativeGetPageCount(long j6);

    private native int nativeGetPageHeightPixel(long j6, int i6);

    private native int nativeGetPageHeightPoint(long j6);

    private native int nativeGetPageWidthPixel(long j6, int i6);

    private native int nativeGetPageWidthPoint(long j6);

    private native Long nativeGetSiblingBookmark(long j6, long j7);

    private native long nativeLoadPage(long j6, int i6);

    private native long[] nativeLoadPages(long j6, int i6, int i7);

    private native long nativeOpenDocument(int i6, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native void nativeRenderPage(long j6, Surface surface, int i6, int i7, int i8, int i9, int i10, boolean z6);

    private native void nativeRenderPageBitmap(long j6, Bitmap bitmap, int i6, int i7, int i8, int i9, int i10, boolean z6);

    /* renamed from: a */
    public void m3744a(C5764a c5764a) {
        synchronized (f3687e) {
            try {
                Iterator it = c5764a.f3691c.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(((Long) c5764a.f3691c.get((Integer) it.next())).longValue());
                }
                c5764a.f3691c.clear();
                nativeCloseDocument(c5764a.f3689a);
                ParcelFileDescriptor parcelFileDescriptor = c5764a.f3690b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    c5764a.f3690b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public C5764a.b m3745b(C5764a c5764a) {
        C5764a.b bVar;
        synchronized (f3687e) {
            bVar = new C5764a.b();
            bVar.f3696a = nativeGetDocumentMetaText(c5764a.f3689a, "Title");
            bVar.f3697b = nativeGetDocumentMetaText(c5764a.f3689a, "Author");
            bVar.f3698c = nativeGetDocumentMetaText(c5764a.f3689a, "Subject");
            bVar.f3699d = nativeGetDocumentMetaText(c5764a.f3689a, "Keywords");
            bVar.f3700e = nativeGetDocumentMetaText(c5764a.f3689a, "Creator");
            bVar.f3701f = nativeGetDocumentMetaText(c5764a.f3689a, "Producer");
            bVar.f3702g = nativeGetDocumentMetaText(c5764a.f3689a, "CreationDate");
            bVar.f3703h = nativeGetDocumentMetaText(c5764a.f3689a, "ModDate");
        }
        return bVar;
    }

    /* renamed from: d */
    public int m3746d(C5764a c5764a) {
        int iNativeGetPageCount;
        synchronized (f3687e) {
            iNativeGetPageCount = nativeGetPageCount(c5764a.f3689a);
        }
        return iNativeGetPageCount;
    }

    /* renamed from: e */
    public int m3747e(C5764a c5764a, int i6) {
        synchronized (f3687e) {
            try {
                Long l6 = (Long) c5764a.f3691c.get(Integer.valueOf(i6));
                if (l6 == null) {
                    return 0;
                }
                return nativeGetPageHeightPixel(l6.longValue(), this.f3688a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public int m3748f(C5764a c5764a, int i6) {
        synchronized (f3687e) {
            try {
                Long l6 = (Long) c5764a.f3691c.get(Integer.valueOf(i6));
                if (l6 == null) {
                    return 0;
                }
                return nativeGetPageWidthPixel(l6.longValue(), this.f3688a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public List m3749g(C5764a c5764a) {
        ArrayList arrayList;
        synchronized (f3687e) {
            try {
                arrayList = new ArrayList();
                Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c5764a.f3689a, null);
                if (lNativeGetFirstChildBookmark != null) {
                    m3752j(arrayList, c5764a, lNativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public C5764a m3750h(ParcelFileDescriptor parcelFileDescriptor, String str) {
        C5764a c5764a = new C5764a();
        c5764a.f3690b = parcelFileDescriptor;
        synchronized (f3687e) {
            c5764a.f3689a = nativeOpenDocument(m3743c(parcelFileDescriptor), str);
        }
        return c5764a;
    }

    /* renamed from: i */
    public long m3751i(C5764a c5764a, int i6) {
        long jNativeLoadPage;
        synchronized (f3687e) {
            jNativeLoadPage = nativeLoadPage(c5764a.f3689a, i6);
            c5764a.f3691c.put(Integer.valueOf(i6), Long.valueOf(jNativeLoadPage));
        }
        return jNativeLoadPage;
    }

    /* renamed from: j */
    public final void m3752j(List list, C5764a c5764a, long j6) {
        C5764a.a aVar = new C5764a.a();
        aVar.f3695d = j6;
        aVar.f3693b = nativeGetBookmarkTitle(j6);
        aVar.f3694c = nativeGetBookmarkDestIndex(c5764a.f3689a, j6);
        list.add(aVar);
        Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c5764a.f3689a, Long.valueOf(j6));
        if (lNativeGetFirstChildBookmark != null) {
            m3752j(aVar.m3754a(), c5764a, lNativeGetFirstChildBookmark.longValue());
        }
        Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(c5764a.f3689a, j6);
        if (lNativeGetSiblingBookmark != null) {
            m3752j(list, c5764a, lNativeGetSiblingBookmark.longValue());
        }
    }

    /* renamed from: k */
    public void m3753k(C5764a c5764a, Bitmap bitmap, int i6, int i7, int i8, int i9, int i10, boolean z6) {
        synchronized (f3687e) {
            try {
                nativeRenderPageBitmap(((Long) c5764a.f3691c.get(Integer.valueOf(i6))).longValue(), bitmap, this.f3688a, i7, i8, i9, i10, z6);
            } catch (NullPointerException e6) {
                Log.e(f3684b, "mContext may be null");
                e6.printStackTrace();
            } catch (Exception e7) {
                Log.e(f3684b, "Exception throw from native");
                e7.printStackTrace();
            }
        }
    }
}
