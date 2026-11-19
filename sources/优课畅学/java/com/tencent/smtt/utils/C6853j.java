package com.tencent.smtt.utils;

import com.tencent.smtt.utils.C6848e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.tencent.smtt.utils.j */
/* loaded from: classes4.dex */
final class C6853j extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f6981a;

    /* renamed from: b */
    final /* synthetic */ C6848e.a f6982b;

    public C6853j(String str, C6848e.a aVar) {
        this.f6981a = str;
        this.f6982b = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        fileOutputStreamM6327d = null;
        FileOutputStream fileOutputStreamM6327d = null;
        inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://soft.tbs.imtt.qq.com/17421/tbs_res_imtt_tbs_DebugPlugin_DebugPlugin.tbs").openConnection();
                int contentLength = httpURLConnection.getContentLength();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                InputStream inputStream2 = httpURLConnection.getInputStream();
                try {
                    fileOutputStreamM6327d = C6854k.m6327d(new File(this.f6981a));
                    byte[] bArr = new byte[8192];
                    int i10 = 0;
                    while (true) {
                        int i11 = inputStream2.read(bArr);
                        if (i11 <= 0) {
                            break;
                        }
                        i10 += i11;
                        fileOutputStreamM6327d.write(bArr, 0, i11);
                        this.f6982b.mo6292a((i10 * 100) / contentLength);
                    }
                    this.f6982b.mo6291a();
                    try {
                        inputStream2.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    fileOutputStreamM6327d.close();
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = fileOutputStreamM6327d;
                    inputStream = inputStream2;
                    try {
                        e.printStackTrace();
                        this.f6982b.mo6293a(e);
                        try {
                            inputStream.close();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            inputStream.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStreamM6327d;
                    inputStream = inputStream2;
                    inputStream.close();
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        } catch (Exception e16) {
            e = e16;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
