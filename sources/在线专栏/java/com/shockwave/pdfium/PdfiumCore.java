package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.shockwave.pdfium.C1671a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PdfiumCore {

    /* renamed from: b */
    private static final String f7409b = "com.shockwave.pdfium.PdfiumCore";

    /* renamed from: c */
    private static final Class f7410c;

    /* renamed from: d */
    private static Field f7411d;

    /* renamed from: e */
    private static final Object f7412e;

    /* renamed from: a */
    private int f7413a;

    static {
        try {
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e4) {
            Log.e(f7409b, "Native libraries failed to load - " + e4);
        }
        f7410c = FileDescriptor.class;
        f7411d = null;
        f7412e = new Object();
    }

    public PdfiumCore(Context context) {
        this.f7413a = context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: c */
    public static int m5719c(ParcelFileDescriptor parcelFileDescriptor) throws NoSuchFieldException {
        try {
            if (f7411d == null) {
                Field declaredField = f7410c.getDeclaredField("descriptor");
                f7411d = declaredField;
                declaredField.setAccessible(true);
            }
            return f7411d.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return -1;
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    /* renamed from: j */
    private void m5720j(List<C1671a.a> list, C1671a c1671a, long j4) {
        C1671a.a aVar = new C1671a.a();
        aVar.f7420d = j4;
        aVar.f7418b = nativeGetBookmarkTitle(j4);
        aVar.f7419c = nativeGetBookmarkDestIndex(c1671a.f7414a, j4);
        list.add(aVar);
        Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c1671a.f7414a, Long.valueOf(j4));
        if (lNativeGetFirstChildBookmark != null) {
            m5720j(aVar.m5730a(), c1671a, lNativeGetFirstChildBookmark.longValue());
        }
        Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(c1671a.f7414a, j4);
        if (lNativeGetSiblingBookmark != null) {
            m5720j(list, c1671a, lNativeGetSiblingBookmark.longValue());
        }
    }

    private native void nativeCloseDocument(long j4);

    private native void nativeClosePage(long j4);

    private native long nativeGetBookmarkDestIndex(long j4, long j5);

    private native String nativeGetBookmarkTitle(long j4);

    private native String nativeGetDocumentMetaText(long j4, String str);

    private native Long nativeGetFirstChildBookmark(long j4, Long l3);

    private native int nativeGetPageCount(long j4);

    private native int nativeGetPageHeightPixel(long j4, int i4);

    private native int nativeGetPageWidthPixel(long j4, int i4);

    private native Long nativeGetSiblingBookmark(long j4, long j5);

    private native long nativeLoadPage(long j4, int i4);

    private native long nativeOpenDocument(int i4, String str);

    private native void nativeRenderPageBitmap(long j4, Bitmap bitmap, int i4, int i5, int i6, int i7, int i8, boolean z3);

    /* renamed from: a */
    public void m5721a(C1671a c1671a) {
        synchronized (f7412e) {
            Iterator<Integer> it = c1671a.f7416c.keySet().iterator();
            while (it.hasNext()) {
                nativeClosePage(c1671a.f7416c.get(it.next()).longValue());
            }
            c1671a.f7416c.clear();
            nativeCloseDocument(c1671a.f7414a);
            ParcelFileDescriptor parcelFileDescriptor = c1671a.f7415b;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
                c1671a.f7415b = null;
            }
        }
    }

    /* renamed from: b */
    public C1671a.b m5722b(C1671a c1671a) {
        C1671a.b bVar;
        synchronized (f7412e) {
            bVar = new C1671a.b();
            bVar.f7421a = nativeGetDocumentMetaText(c1671a.f7414a, "Title");
            bVar.f7422b = nativeGetDocumentMetaText(c1671a.f7414a, "Author");
            bVar.f7423c = nativeGetDocumentMetaText(c1671a.f7414a, "Subject");
            bVar.f7424d = nativeGetDocumentMetaText(c1671a.f7414a, "Keywords");
            bVar.f7425e = nativeGetDocumentMetaText(c1671a.f7414a, "Creator");
            bVar.f7426f = nativeGetDocumentMetaText(c1671a.f7414a, "Producer");
            bVar.f7427g = nativeGetDocumentMetaText(c1671a.f7414a, "CreationDate");
            bVar.f7428h = nativeGetDocumentMetaText(c1671a.f7414a, "ModDate");
        }
        return bVar;
    }

    /* renamed from: d */
    public int m5723d(C1671a c1671a) {
        int iNativeGetPageCount;
        synchronized (f7412e) {
            iNativeGetPageCount = nativeGetPageCount(c1671a.f7414a);
        }
        return iNativeGetPageCount;
    }

    /* renamed from: e */
    public int m5724e(C1671a c1671a, int i4) {
        synchronized (f7412e) {
            Long l3 = c1671a.f7416c.get(Integer.valueOf(i4));
            if (l3 == null) {
                return 0;
            }
            return nativeGetPageHeightPixel(l3.longValue(), this.f7413a);
        }
    }

    /* renamed from: f */
    public int m5725f(C1671a c1671a, int i4) {
        synchronized (f7412e) {
            Long l3 = c1671a.f7416c.get(Integer.valueOf(i4));
            if (l3 == null) {
                return 0;
            }
            return nativeGetPageWidthPixel(l3.longValue(), this.f7413a);
        }
    }

    /* renamed from: g */
    public List<C1671a.a> m5726g(C1671a c1671a) {
        ArrayList arrayList;
        synchronized (f7412e) {
            arrayList = new ArrayList();
            Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(c1671a.f7414a, null);
            if (lNativeGetFirstChildBookmark != null) {
                m5720j(arrayList, c1671a, lNativeGetFirstChildBookmark.longValue());
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public C1671a m5727h(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        C1671a c1671a = new C1671a();
        c1671a.f7415b = parcelFileDescriptor;
        synchronized (f7412e) {
            c1671a.f7414a = nativeOpenDocument(m5719c(parcelFileDescriptor), str);
        }
        return c1671a;
    }

    /* renamed from: i */
    public long m5728i(C1671a c1671a, int i4) {
        long jNativeLoadPage;
        synchronized (f7412e) {
            jNativeLoadPage = nativeLoadPage(c1671a.f7414a, i4);
            c1671a.f7416c.put(Integer.valueOf(i4), Long.valueOf(jNativeLoadPage));
        }
        return jNativeLoadPage;
    }

    /* renamed from: k */
    public void m5729k(C1671a c1671a, Bitmap bitmap, int i4, int i5, int i6, int i7, int i8, boolean z3) throws Throwable {
        synchronized (f7412e) {
            try {
                try {
                    try {
                        nativeRenderPageBitmap(c1671a.f7416c.get(Integer.valueOf(i4)).longValue(), bitmap, this.f7413a, i5, i6, i7, i8, z3);
                    } catch (NullPointerException e4) {
                        e = e4;
                        Log.e(f7409b, "mContext may be null");
                        e.printStackTrace();
                    } catch (Exception e5) {
                        e = e5;
                        Log.e(f7409b, "Exception throw from native");
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (NullPointerException e6) {
                e = e6;
            } catch (Exception e7) {
                e = e7;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
