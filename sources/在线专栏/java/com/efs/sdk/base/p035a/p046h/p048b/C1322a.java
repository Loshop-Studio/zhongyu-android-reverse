package com.efs.sdk.base.p035a.p046h.p048b;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.http.IHttpUtil;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.a */
/* loaded from: classes.dex */
public final class C1322a implements IHttpUtil {

    /* renamed from: com.efs.sdk.base.a.h.b.a$a */
    static class a {

        /* renamed from: a */
        private static final C1322a f7110a = new C1322a(0);
    }

    private C1322a() {
    }

    /* synthetic */ C1322a(byte b4) {
        this();
    }

    /* renamed from: a */
    public static C1322a m5551a() {
        return a.f7110a;
    }

    /* renamed from: b */
    private static void m5555b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                C1321b.m5541a(httpURLConnection.getInputStream());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse get(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnectionM5554a;
        HttpResponse httpResponse = new HttpResponse();
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            httpURLConnectionM5554a = null;
            try {
                try {
                    httpURLConnectionM5554a = m5554a(str, map);
                    httpURLConnectionM5554a.setRequestMethod("GET");
                    httpURLConnectionM5554a.setInstanceFollowRedirects(true);
                    httpURLConnectionM5554a.setRequestProperty("Connection", "close");
                    httpURLConnectionM5554a.connect();
                    httpResponse = m5553a(httpURLConnectionM5554a);
                    m5555b(httpURLConnectionM5554a);
                    break;
                } finally {
                    try {
                        m5555b(httpURLConnectionM5554a);
                    } catch (Throwable th) {
                        m5555b(httpURLConnectionM5554a);
                    }
                }
            } catch (SocketTimeoutException e4) {
                httpResponse.setHttpCode(-3);
                C1329d.m5573b("efs.util.http", "post file '" + str + "' error", e4);
            } catch (UnknownHostException e5) {
                httpResponse.setHttpCode(-2);
                C1329d.m5573b("efs.util.http", "get request '" + str + "' error， maybe network is disconnect", e5);
            }
            m5555b(httpURLConnectionM5554a);
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse post(String str, Map<String, String> map, File file) {
        return m5552a(str, map, file, null);
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr) {
        return m5552a(str, map, null, bArr);
    }

    /* renamed from: a */
    private static HttpURLConnection m5554a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        if (map == null) {
            map = Collections.emptyMap();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.net.HttpURLConnection] */
    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse post(String str, Map<String, String> map, byte[] bArr) {
        HttpResponse httpResponse = new HttpResponse();
        OutputStream outputStream = null;
        try {
            try {
                map = m5554a(str, map);
                try {
                    map.setRequestMethod("POST");
                    map.setRequestProperty("Connection", "close");
                    outputStream = map.getOutputStream();
                    outputStream.write(bArr);
                    httpResponse = m5553a(map);
                } catch (SocketTimeoutException e4) {
                    e = e4;
                    httpResponse.setHttpCode(-3);
                    C1329d.m5573b("efs.util.http", "post file '" + str + "' error", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (UnknownHostException e5) {
                    e = e5;
                    httpResponse.setHttpCode(-2);
                    C1329d.m5573b("efs.util.http", "post data to '" + str + "' error， maybe network is disconnect", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (Throwable th) {
                    th = th;
                    C1329d.m5573b("efs.util.http", "post data '" + str + "' error", th);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                }
            } finally {
                C1321b.m5541a(outputStream);
                m5555b(map);
            }
        } catch (SocketTimeoutException e6) {
            e = e6;
            map = 0;
        } catch (UnknownHostException e7) {
            e = e7;
            map = 0;
        } catch (Throwable th2) {
            th = th2;
            map = 0;
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    /* renamed from: a */
    private static HttpResponse m5553a(HttpURLConnection httpURLConnection) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        HttpResponse httpResponse = new HttpResponse();
        if (httpURLConnection == null) {
            return httpResponse;
        }
        try {
            httpResponse.setHttpCode(httpURLConnection.getResponseCode());
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                while (true) {
                    try {
                        int i4 = inputStream.read(bArr);
                        if (i4 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i4);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            C1329d.m5573b("efs.util.http", "get response error", th);
                            return httpResponse;
                        } finally {
                            C1321b.m5541a(inputStream);
                            C1321b.m5541a(byteArrayOutputStream);
                        }
                    }
                }
                httpResponse.data = byteArrayOutputStream.toString();
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
            }
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
        return httpResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: a */
    private static HttpResponse m5552a(String str, Map<String, String> map, File file, byte[] bArr) {
        FileInputStream fileInputStream;
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        HttpResponse httpResponse = new HttpResponse();
        HttpURLConnection httpURLConnection = null;
         = null;
         = null;
         = null;
        ?? r4 = null;
        httpURLConnection = null;
        httpURLConnection = null;
        httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionM5554a = m5554a(str, map);
                try {
                    httpURLConnectionM5554a.setRequestMethod("POST");
                    httpURLConnectionM5554a.setRequestProperty("Connection", "close");
                    httpURLConnectionM5554a.setRequestProperty("Content-Type", "multipart/form-data;boundary=----WebKitFormBoundaryP0Rfzlf32iRoMhmb");
                    outputStream = httpURLConnectionM5554a.getOutputStream();
                    try {
                        dataOutputStream = new DataOutputStream(outputStream);
                        try {
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb\r\n");
                            if (bArr == 0) {
                                if (file != null && file.exists()) {
                                    dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"" + file.getName() + "\"\r\n");
                                    dataOutputStream.writeBytes("\r\n");
                                    fileInputStream4 = new FileInputStream(file);
                                    try {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int i4 = fileInputStream4.read(bArr2);
                                            if (i4 == -1) {
                                                break;
                                            }
                                            dataOutputStream.write(bArr2, 0, i4);
                                        }
                                        r4 = fileInputStream4;
                                    } catch (SocketTimeoutException e4) {
                                        e = e4;
                                        httpURLConnection = httpURLConnectionM5554a;
                                        fileInputStream3 = fileInputStream4;
                                        httpResponse.setHttpCode(-3);
                                        C1329d.m5573b("efs.util.http", "post file '" + str + "' error", e);
                                        bArr = fileInputStream3;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (UnknownHostException e5) {
                                        e = e5;
                                        httpURLConnection = httpURLConnectionM5554a;
                                        fileInputStream2 = fileInputStream4;
                                        httpResponse.setHttpCode(-2);
                                        C1329d.m5573b("efs.util.http", "post file '" + str + "' error， maybe network is disconnect", e);
                                        bArr = fileInputStream2;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (Throwable th) {
                                        th = th;
                                        httpURLConnection = httpURLConnectionM5554a;
                                        fileInputStream = fileInputStream4;
                                        C1329d.m5573b("efs.util.http", "post file '" + str + "' error", th);
                                        bArr = fileInputStream;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    }
                                }
                                m5555b(httpURLConnectionM5554a);
                                C1321b.m5541a(outputStream);
                                C1321b.m5541a(dataOutputStream);
                                C1321b.m5541a((Closeable) null);
                                return httpResponse;
                            }
                            dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"f\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(bArr, 0, bArr.length);
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n");
                            httpResponse = m5553a(httpURLConnectionM5554a);
                            m5555b(httpURLConnectionM5554a);
                            C1321b.m5541a(outputStream);
                            C1321b.m5541a(dataOutputStream);
                            C1321b.m5541a((Closeable) r4);
                        } catch (SocketTimeoutException e6) {
                            e = e6;
                            fileInputStream4 = r4;
                        } catch (UnknownHostException e7) {
                            e = e7;
                            fileInputStream4 = r4;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream4 = r4;
                        }
                    } catch (SocketTimeoutException e8) {
                        e = e8;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (UnknownHostException e9) {
                        e = e9;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    }
                } catch (SocketTimeoutException e10) {
                    e = e10;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (UnknownHostException e11) {
                    e = e11;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                }
            } finally {
                m5555b(httpURLConnection);
                C1321b.m5541a(outputStream);
                C1321b.m5541a(dataOutputStream);
                C1321b.m5541a((Closeable) bArr);
            }
        } catch (SocketTimeoutException e12) {
            e = e12;
            fileInputStream3 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (UnknownHostException e13) {
            e = e13;
            fileInputStream2 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            outputStream = null;
            dataOutputStream = null;
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }
}
