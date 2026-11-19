package com.efs.sdk.base.p039a.p050h.p052b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.http.IHttpUtil;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
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
/* loaded from: classes3.dex */
public final class C5690a implements IHttpUtil {

    /* renamed from: com.efs.sdk.base.a.h.b.a$a */
    public static class a {

        /* renamed from: a */
        private static final C5690a f4744a = new C5690a(0);
    }

    private C5690a() {
    }

    /* renamed from: a */
    public static C5690a m4161a() {
        return a.f4744a;
    }

    /* renamed from: b */
    private static void m4165b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                C5689b.m4151a(httpURLConnection.getInputStream());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    @NonNull
    public final HttpResponse get(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnectionM4164a;
        HttpResponse httpResponse = new HttpResponse();
        int i9 = 0;
        while (true) {
            if (i9 >= 3) {
                break;
            }
            httpURLConnectionM4164a = null;
            try {
                try {
                    httpURLConnectionM4164a = m4164a(str, map);
                    httpURLConnectionM4164a.setRequestMethod("GET");
                    httpURLConnectionM4164a.setInstanceFollowRedirects(true);
                    httpURLConnectionM4164a.setRequestProperty("Connection", "close");
                    httpURLConnectionM4164a.connect();
                    httpResponse = m4163a(httpURLConnectionM4164a);
                    m4165b(httpURLConnectionM4164a);
                    break;
                } finally {
                    try {
                        m4165b(httpURLConnectionM4164a);
                    } catch (Throwable th) {
                        m4165b(httpURLConnectionM4164a);
                    }
                }
            } catch (SocketTimeoutException e10) {
                httpResponse.setHttpCode(-3);
                C5697d.m4183b("efs.util.http", "post file '" + str + "' error", e10);
            } catch (UnknownHostException e11) {
                httpResponse.setHttpCode(-2);
                C5697d.m4183b("efs.util.http", "get request '" + str + "' error， maybe network is disconnect", e11);
            }
            m4165b(httpURLConnectionM4164a);
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    @NonNull
    public final HttpResponse post(@NonNull String str, @Nullable Map<String, String> map, @NonNull File file) {
        return m4162a(str, map, file, null);
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    @NonNull
    public final HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr) {
        return m4162a(str, map, null, bArr);
    }

    public /* synthetic */ C5690a(byte b10) {
        this();
    }

    /* renamed from: a */
    private static HttpURLConnection m4164a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        if (map == null) {
            map = Collections.EMPTY_MAP;
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
                map = m4164a(str, map);
                try {
                    map.setRequestMethod("POST");
                    map.setRequestProperty("Connection", "close");
                    outputStream = map.getOutputStream();
                    outputStream.write(bArr);
                    httpResponse = m4163a(map);
                } catch (SocketTimeoutException e10) {
                    e = e10;
                    httpResponse.setHttpCode(-3);
                    C5697d.m4183b("efs.util.http", "post file '" + str + "' error", e);
                    map = map;
                    C5689b.m4151a(outputStream);
                    m4165b(map);
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (UnknownHostException e11) {
                    e = e11;
                    httpResponse.setHttpCode(-2);
                    C5697d.m4183b("efs.util.http", "post data to '" + str + "' error， maybe network is disconnect", e);
                    map = map;
                    C5689b.m4151a(outputStream);
                    m4165b(map);
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (Throwable th) {
                    th = th;
                    C5697d.m4183b("efs.util.http", "post data '" + str + "' error", th);
                    map = map;
                    C5689b.m4151a(outputStream);
                    m4165b(map);
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                }
            } catch (Throwable th2) {
                C5689b.m4151a(outputStream);
                m4165b(map);
                throw th2;
            }
        } catch (SocketTimeoutException e12) {
            e = e12;
            map = 0;
        } catch (UnknownHostException e13) {
            e = e13;
            map = 0;
        } catch (Throwable th3) {
            th = th3;
            map = 0;
        }
        C5689b.m4151a(outputStream);
        m4165b(map);
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    /* renamed from: a */
    private static HttpResponse m4163a(HttpURLConnection httpURLConnection) {
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
                        int i9 = inputStream.read(bArr);
                        if (i9 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i9);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            C5697d.m4183b("efs.util.http", "get response error", th);
                            return httpResponse;
                        } finally {
                            C5689b.m4151a(inputStream);
                            C5689b.m4151a(byteArrayOutputStream);
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
    private static HttpResponse m4162a(@NonNull String str, @Nullable Map<String, String> map, @Nullable File file, @Nullable byte[] bArr) {
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
        ?? r42 = null;
        httpURLConnection = null;
        httpURLConnection = null;
        httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionM4164a = m4164a(str, map);
                try {
                    httpURLConnectionM4164a.setRequestMethod("POST");
                    httpURLConnectionM4164a.setRequestProperty("Connection", "close");
                    httpURLConnectionM4164a.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data;boundary=----WebKitFormBoundaryP0Rfzlf32iRoMhmb");
                    outputStream = httpURLConnectionM4164a.getOutputStream();
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
                                            int i9 = fileInputStream4.read(bArr2);
                                            if (i9 == -1) {
                                                break;
                                            }
                                            dataOutputStream.write(bArr2, 0, i9);
                                        }
                                        r42 = fileInputStream4;
                                    } catch (SocketTimeoutException e10) {
                                        e = e10;
                                        httpURLConnection = httpURLConnectionM4164a;
                                        fileInputStream3 = fileInputStream4;
                                        httpResponse.setHttpCode(-3);
                                        C5697d.m4183b("efs.util.http", "post file '" + str + "' error", e);
                                        bArr = fileInputStream3;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (UnknownHostException e11) {
                                        e = e11;
                                        httpURLConnection = httpURLConnectionM4164a;
                                        fileInputStream2 = fileInputStream4;
                                        httpResponse.setHttpCode(-2);
                                        C5697d.m4183b("efs.util.http", "post file '" + str + "' error， maybe network is disconnect", e);
                                        bArr = fileInputStream2;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (Throwable th) {
                                        th = th;
                                        httpURLConnection = httpURLConnectionM4164a;
                                        fileInputStream = fileInputStream4;
                                        C5697d.m4183b("efs.util.http", "post file '" + str + "' error", th);
                                        bArr = fileInputStream;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    }
                                }
                                m4165b(httpURLConnectionM4164a);
                                C5689b.m4151a(outputStream);
                                C5689b.m4151a(dataOutputStream);
                                C5689b.m4151a((Closeable) null);
                                return httpResponse;
                            }
                            dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"f\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(bArr, 0, bArr.length);
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n");
                            httpResponse = m4163a(httpURLConnectionM4164a);
                            m4165b(httpURLConnectionM4164a);
                            C5689b.m4151a(outputStream);
                            C5689b.m4151a(dataOutputStream);
                            C5689b.m4151a((Closeable) r42);
                        } catch (SocketTimeoutException e12) {
                            e = e12;
                            fileInputStream4 = r42;
                        } catch (UnknownHostException e13) {
                            e = e13;
                            fileInputStream4 = r42;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream4 = r42;
                        }
                    } catch (SocketTimeoutException e14) {
                        e = e14;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (UnknownHostException e15) {
                        e = e15;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    }
                } catch (SocketTimeoutException e16) {
                    e = e16;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (UnknownHostException e17) {
                    e = e17;
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
                m4165b(httpURLConnection);
                C5689b.m4151a(outputStream);
                C5689b.m4151a(dataOutputStream);
                C5689b.m4151a((Closeable) bArr);
            }
        } catch (SocketTimeoutException e18) {
            e = e18;
            fileInputStream3 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (UnknownHostException e19) {
            e = e19;
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
