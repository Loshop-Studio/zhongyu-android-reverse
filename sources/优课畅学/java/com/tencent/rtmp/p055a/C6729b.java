package com.tencent.rtmp.p055a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.rtmp.a.b */
/* loaded from: classes4.dex */
public class C6729b implements InterfaceC6728a {

    /* renamed from: a */
    private final BitmapFactory.Options f6503a = new BitmapFactory.Options();

    /* renamed from: b */
    private HandlerThread f6504b;

    /* renamed from: c */
    private Handler f6505c;

    /* renamed from: d */
    private List<C6730c> f6506d;

    /* renamed from: e */
    private Map<String, BitmapRegionDecoder> f6507e;

    /* renamed from: com.tencent.rtmp.a.b$a */
    public static class a implements Runnable {

        /* renamed from: a */
        private WeakReference<C6729b> f6509a;

        /* renamed from: b */
        private String f6510b;

        public a(C6729b c6729b, String str) {
            this.f6509a = new WeakReference<>(c6729b);
            this.f6510b = str;
        }

        /* renamed from: a */
        private float m5818a(String str) {
            String str2;
            String str3;
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 3) {
                String str4 = strArrSplit[0];
                str3 = strArrSplit[1];
                str2 = strArrSplit[2];
            } else if (strArrSplit.length == 2) {
                str3 = strArrSplit[0];
                str2 = strArrSplit[1];
            } else if (strArrSplit.length == 1) {
                str2 = strArrSplit[0];
                str3 = null;
            } else {
                str2 = null;
                str3 = null;
            }
            float fFloatValue = str3 != null ? 0.0f + (Float.valueOf(str3).floatValue() * 60.0f) : 0.0f;
            return str2 != null ? fFloatValue + Float.valueOf(str2).floatValue() : fFloatValue;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            InputStream inputStreamM5812a;
            String line;
            int i10;
            C6729b c6729b = this.f6509a.get();
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        inputStreamM5812a = c6729b.m5812a(this.f6510b);
                    } catch (IOException unused) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                if (inputStreamM5812a == null) {
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamM5812a));
                try {
                    String line2 = bufferedReader2.readLine();
                    if (line2 != null && line2.length() != 0 && line2.contains("WEBVTT")) {
                        do {
                            line = bufferedReader2.readLine();
                            if (line != null && line.contains("-->")) {
                                String[] strArrSplit = line.split(" --> ");
                                if (strArrSplit.length == 2) {
                                    String line3 = bufferedReader2.readLine();
                                    C6730c c6730c = new C6730c();
                                    c6730c.f6514a = m5818a(strArrSplit[0]);
                                    c6730c.f6515b = m5818a(strArrSplit[1]);
                                    c6730c.f6516c = line3;
                                    int iIndexOf = line3.indexOf("#");
                                    if (iIndexOf != -1) {
                                        c6730c.f6517d = line3.substring(0, iIndexOf);
                                    }
                                    int iIndexOf2 = line3.indexOf("=");
                                    if (iIndexOf2 != -1 && (i10 = iIndexOf2 + 1) < line3.length()) {
                                        String[] strArrSplit2 = line3.substring(i10, line3.length()).split(",");
                                        if (strArrSplit2.length == 4) {
                                            c6730c.f6518e = Integer.valueOf(strArrSplit2[0]).intValue();
                                            c6730c.f6519f = Integer.valueOf(strArrSplit2[1]).intValue();
                                            c6730c.f6520g = Integer.valueOf(strArrSplit2[2]).intValue();
                                            c6730c.f6521h = Integer.valueOf(strArrSplit2[3]).intValue();
                                        }
                                    }
                                    if (c6729b != null && c6729b.f6506d != null) {
                                        c6729b.f6506d.add(c6730c);
                                    }
                                }
                            }
                        } while (line != null);
                        bufferedReader2.close();
                        return;
                    }
                    TXCLog.m4991e("TXImageSprite", "DownloadAndParseVTTFileTask : getVTT File Error!");
                    if (c6729b != null) {
                        c6729b.m5816b();
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused2) {
                    }
                } catch (IOException e11) {
                    e = e11;
                    bufferedReader = bufferedReader2;
                    TXCLog.m4992e("TXImageSprite", "load image sprite failed.", e);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.tencent.rtmp.a.b$b */
    public static class b implements Runnable {

        /* renamed from: a */
        private WeakReference<C6729b> f6511a;

        /* renamed from: b */
        private String f6512b;

        /* renamed from: c */
        private String f6513c;

        public b(C6729b c6729b, String str, String str2) {
            this.f6511a = new WeakReference<>(c6729b);
            this.f6512b = str;
            this.f6513c = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            int i10;
            C6729b c6729b = this.f6511a.get();
            if (this.f6511a == null || c6729b == null) {
                return;
            }
            InputStream inputStreamM5812a = null;
            try {
                try {
                    try {
                        inputStreamM5812a = c6729b.m5812a(this.f6513c);
                        int iLastIndexOf = this.f6513c.lastIndexOf("/");
                        if (iLastIndexOf != -1 && (i10 = iLastIndexOf + 1) < this.f6513c.length()) {
                            String str = this.f6513c;
                            String strSubstring = str.substring(i10, str.length());
                            if (c6729b.f6507e != null) {
                                c6729b.f6507e.put(strSubstring, BitmapRegionDecoder.newInstance(inputStreamM5812a, true));
                            }
                        }
                        if (inputStreamM5812a != null) {
                            inputStreamM5812a.close();
                        }
                    } catch (IOException e10) {
                        TXCLog.m4992e("TXImageSprite", "load bitmap from network failed.", e10);
                        if (inputStreamM5812a != null) {
                            inputStreamM5812a.close();
                        }
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (inputStreamM5812a != null) {
                    try {
                        inputStreamM5812a.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    public C6729b() {
        ArrayList arrayList = new ArrayList();
        this.f6506d = arrayList;
        this.f6506d = Collections.synchronizedList(arrayList);
        HashMap map = new HashMap();
        this.f6507e = map;
        this.f6507e = Collections.synchronizedMap(map);
    }

    @Override // com.tencent.rtmp.p055a.InterfaceC6728a
    public Bitmap getThumbnail(float f10) {
        C6730c c6730cM5810a;
        if (this.f6506d.size() == 0 || (c6730cM5810a = m5810a(0, this.f6506d.size() - 1, f10)) == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f6507e.get(c6730cM5810a.f6517d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        int i10 = c6730cM5810a.f6518e;
        rect.left = i10;
        int i11 = c6730cM5810a.f6519f;
        rect.top = i11;
        rect.right = i10 + c6730cM5810a.f6520g;
        rect.bottom = i11 + c6730cM5810a.f6521h;
        return bitmapRegionDecoder.decodeRegion(rect, this.f6503a);
    }

    @Override // com.tencent.rtmp.p055a.InterfaceC6728a
    public void release() {
        m5816b();
        HandlerThread handlerThread = this.f6504b;
        if (handlerThread == null || this.f6505c == null) {
            return;
        }
        handlerThread.quitSafely();
        this.f6505c = null;
        this.f6504b = null;
    }

    @Override // com.tencent.rtmp.p055a.InterfaceC6728a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.m4991e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        m5816b();
        m5814a();
        this.f6505c.post(new a(this, str));
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f6505c.post(new b(this, str, it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5816b() {
        if (this.f6505c != null) {
            TXCLog.m4994i("TXImageSprite", " remove all tasks!");
            this.f6505c.removeCallbacksAndMessages(null);
            this.f6505c.post(new Runnable() { // from class: com.tencent.rtmp.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C6729b.this.f6506d != null) {
                        C6729b.this.f6506d.clear();
                    }
                    if (C6729b.this.f6507e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : C6729b.this.f6507e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        C6729b.this.f6507e.clear();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private C6730c m5810a(int i10, int i11, float f10) {
        int i12 = ((i11 - i10) / 2) + i10;
        if (this.f6506d.get(i12).f6514a <= f10 && this.f6506d.get(i12).f6515b > f10) {
            return this.f6506d.get(i12);
        }
        if (i10 >= i11) {
            return this.f6506d.get(i10);
        }
        if (f10 >= this.f6506d.get(i12).f6515b) {
            return m5810a(i12 + 1, i11, f10);
        }
        if (f10 < this.f6506d.get(i12).f6514a) {
            return m5810a(i10, i12 - 1, f10);
        }
        return null;
    }

    /* renamed from: a */
    private void m5814a() {
        if (this.f6504b == null) {
            HandlerThread handlerThread = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.f6504b = handlerThread;
            handlerThread.start();
            this.f6505c = new Handler(this.f6504b.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public InputStream m5812a(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.connect();
        uRLConnectionOpenConnection.getInputStream();
        uRLConnectionOpenConnection.setConnectTimeout(15000);
        uRLConnectionOpenConnection.setReadTimeout(15000);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
