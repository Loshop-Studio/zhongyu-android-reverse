package p166l5;

import android.os.AsyncTask;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: l5.a */
/* loaded from: classes5.dex */
public class C9251a {

    /* renamed from: l5.a$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f18244a;

        /* renamed from: b */
        public final /* synthetic */ d f18245b;

        public a(String str, d dVar) {
            this.f18244a = str;
            this.f18245b = dVar;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0058 -> B:41:0x006b). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(this.f18244a).openConnection();
                        uRLConnectionOpenConnection.setConnectTimeout(15000);
                        uRLConnectionOpenConnection.setReadTimeout(15000);
                        uRLConnectionOpenConnection.connect();
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        if (inputStream == null) {
                            d dVar = this.f18245b;
                            if (dVar != null) {
                                dVar.mo16954a();
                                return;
                            }
                            return;
                        }
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    sb.append(line);
                                }
                            }
                            d dVar2 = this.f18245b;
                            if (dVar2 != null) {
                                dVar2.mo16955b(sb.toString());
                            }
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            e = e10;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            d dVar3 = this.f18245b;
                            if (dVar3 != null) {
                                dVar3.mo16954a();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: l5.a$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f18247a;

        /* renamed from: b */
        public final /* synthetic */ String f18248b;

        /* renamed from: c */
        public final /* synthetic */ d f18249c;

        public b(String str, String str2, d dVar) {
            this.f18247a = str;
            this.f18248b = str2;
            this.f18249c = dVar;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f18247a).openConnection();
                        httpURLConnection.setConnectTimeout(15000);
                        httpURLConnection.setReadTimeout(15000);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.connect();
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(this.f18248b.getBytes());
                        outputStream.flush();
                        outputStream.close();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (inputStream == null) {
                            d dVar = this.f18249c;
                            if (dVar != null) {
                                dVar.mo16954a();
                                return;
                            }
                            return;
                        }
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    sb.append(line);
                                }
                            }
                            d dVar2 = this.f18249c;
                            if (dVar2 != null) {
                                dVar2.mo16955b(sb.toString());
                            }
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            e = e10;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            d dVar3 = this.f18249c;
                            if (dVar3 != null) {
                                dVar3.mo16954a();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: l5.a$c */
    public static class c {

        /* renamed from: a */
        public static final C9251a f18251a = new C9251a(null);
    }

    /* renamed from: l5.a$d */
    public interface d {
        /* renamed from: a */
        void mo16954a();

        /* renamed from: b */
        void mo16955b(String str);
    }

    public /* synthetic */ C9251a(a aVar) {
        this();
    }

    /* renamed from: b */
    public static C9251a m16951b() {
        return c.f18251a;
    }

    /* renamed from: a */
    public void m16952a(String str, d dVar) {
        AsyncTask.execute(new a(str, dVar));
    }

    /* renamed from: c */
    public void m16953c(String str, String str2, d dVar) {
        AsyncTask.execute(new b(str, str2, dVar));
    }

    public C9251a() {
    }
}
