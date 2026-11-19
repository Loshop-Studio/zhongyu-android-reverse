package com.efs.sdk.base.p020a.p031h.p033b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.http.IHttpUtil;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
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
/* loaded from: classes2.dex */
public final class C2950a implements IHttpUtil {

    /* renamed from: com.efs.sdk.base.a.h.b.a$a */
    public static class a {

        /* renamed from: a */
        private static final C2950a f1140a = new C2950a(0);
    }

    private C2950a() {
    }

    public /* synthetic */ C2950a(byte b4) {
        this();
    }

    /* renamed from: a */
    public static C2950a m2192a() {
        return a.f1140a;
    }

    /* renamed from: b */
    private static void m2196b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                C2949b.m2182a(httpURLConnection.getInputStream());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    @NonNull
    public final HttpResponse get(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnectionM2195a;
        HttpResponse httpResponse = new HttpResponse();
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            httpURLConnectionM2195a = null;
            try {
                try {
                    httpURLConnectionM2195a = m2195a(str, map);
                    httpURLConnectionM2195a.setRequestMethod("GET");
                    httpURLConnectionM2195a.setInstanceFollowRedirects(true);
                    httpURLConnectionM2195a.setRequestProperty("Connection", "close");
                    httpURLConnectionM2195a.connect();
                    httpResponse = m2194a(httpURLConnectionM2195a);
                    m2196b(httpURLConnectionM2195a);
                    break;
                } finally {
                    try {
                        m2196b(httpURLConnectionM2195a);
                    } catch (Throwable th) {
                        m2196b(httpURLConnectionM2195a);
                    }
                }
            } catch (SocketTimeoutException e4) {
                httpResponse.setHttpCode(-3);
                C2957d.m2214b("efs.util.http", "post file '" + str + "' error", e4);
            } catch (UnknownHostException e5) {
                httpResponse.setHttpCode(-2);
                C2957d.m2214b("efs.util.http", "get request '" + str + "' error， maybe network is disconnect", e5);
            }
            m2196b(httpURLConnectionM2195a);
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    @NonNull
    public final HttpResponse post(@NonNull String str, @Nullable Map<String, String> map, @NonNull File file) {
        return m2193a(str, map, file, null);
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    @NonNull
    public final HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr) {
        return m2193a(str, map, null, bArr);
    }

    /* renamed from: a */
    private static HttpURLConnection m2195a(String str, Map<String, String> map) {
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
    /* JADX WARN: Type inference failed for: r8v10, types: [java.net.HttpURLConnection, java.net.URLConnection] */
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
    @NonNull
    public final HttpResponse post(@NonNull String str, @Nullable Map<String, String> map, @NonNull byte[] bArr) {
        HttpResponse httpResponse = new HttpResponse();
        OutputStream outputStream = null;
        try {
            try {
                map = m2195a(str, map);
                try {
                    map.setRequestMethod("POST");
                    map.setRequestProperty("Connection", "close");
                    outputStream = map.getOutputStream();
                    outputStream.write(bArr);
                    httpResponse = m2194a(map);
                } catch (SocketTimeoutException e4) {
                    e = e4;
                    httpResponse.setHttpCode(-3);
                    C2957d.m2214b("efs.util.http", "post file '" + str + "' error", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (UnknownHostException e5) {
                    e = e5;
                    httpResponse.setHttpCode(-2);
                    C2957d.m2214b("efs.util.http", "post data to '" + str + "' error， maybe network is disconnect", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (Throwable th) {
                    th = th;
                    C2957d.m2214b("efs.util.http", "post data '" + str + "' error", th);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                }
            } finally {
                C2949b.m2182a(outputStream);
                m2196b(map);
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
    private static HttpResponse m2194a(HttpURLConnection httpURLConnection) {
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
                            C2957d.m2214b("efs.util.http", "get response error", th);
                            return httpResponse;
                        } finally {
                            C2949b.m2182a(inputStream);
                            C2949b.m2182a(byteArrayOutputStream);
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
    @NonNull
    /* renamed from: a */
    private static HttpResponse m2193a(@NonNull String str, @Nullable Map<String, String> map, @Nullable File file, @Nullable byte[] bArr) {
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
                HttpURLConnection httpURLConnectionM2195a = m2195a(str, map);
                try {
                    httpURLConnectionM2195a.setRequestMethod("POST");
                    httpURLConnectionM2195a.setRequestProperty("Connection", "close");
                    httpURLConnectionM2195a.setRequestProperty("Content-Type", "multipart/form-data;boundary=----WebKitFormBoundaryP0Rfzlf32iRoMhmb");
                    outputStream = httpURLConnectionM2195a.getOutputStream();
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
                                        httpURLConnection = httpURLConnectionM2195a;
                                        fileInputStream3 = fileInputStream4;
                                        httpResponse.setHttpCode(-3);
                                        C2957d.m2214b("efs.util.http", "post file '" + str + "' error", e);
                                        bArr = fileInputStream3;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (UnknownHostException e5) {
                                        e = e5;
                                        httpURLConnection = httpURLConnectionM2195a;
                                        fileInputStream2 = fileInputStream4;
                                        httpResponse.setHttpCode(-2);
                                        C2957d.m2214b("efs.util.http", "post file '" + str + "' error， maybe network is disconnect", e);
                                        bArr = fileInputStream2;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (Throwable th) {
                                        th = th;
                                        httpURLConnection = httpURLConnectionM2195a;
                                        fileInputStream = fileInputStream4;
                                        C2957d.m2214b("efs.util.http", "post file '" + str + "' error", th);
                                        bArr = fileInputStream;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    }
                                }
                                m2196b(httpURLConnectionM2195a);
                                C2949b.m2182a(outputStream);
                                C2949b.m2182a(dataOutputStream);
                                C2949b.m2182a((Closeable) null);
                                return httpResponse;
                            }
                            dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"f\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(bArr, 0, bArr.length);
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n");
                            httpResponse = m2194a(httpURLConnectionM2195a);
                            m2196b(httpURLConnectionM2195a);
                            C2949b.m2182a(outputStream);
                            C2949b.m2182a(dataOutputStream);
                            C2949b.m2182a((Closeable) r4);
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
                m2196b(httpURLConnection);
                C2949b.m2182a(outputStream);
                C2949b.m2182a(dataOutputStream);
                C2949b.m2182a((Closeable) bArr);
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
