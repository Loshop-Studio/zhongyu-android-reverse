package anetwork.channel.download;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.Header;
import anetwork.channel.aidl.Connection;
import anetwork.channel.http.NetworkSdkSetting;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class DownloadManager {
    public static final int ERROR_DOWNLOAD_CANCELLED = -105;
    public static final int ERROR_EXCEPTION_HAPPEN = -104;
    public static final int ERROR_FILE_FOLDER_INVALID = -101;
    public static final int ERROR_FILE_RENAME_FAILED = -106;
    public static final int ERROR_IO_EXCEPTION = -103;
    public static final int ERROR_REQUEST_FAIL = -102;
    public static final int ERROR_URL_INVALID = -100;
    public static final String TAG = "anet.DownloadManager";

    /* renamed from: a */
    SparseArray<RunnableC5112b> f2855a;

    /* renamed from: b */
    AtomicInteger f2856b;

    /* renamed from: c */
    ThreadPoolExecutor f2857c;

    /* renamed from: d */
    Context f2858d;

    public interface DownloadListener {
        void onFail(int i10, int i11, String str);

        void onProgress(int i10, long j10, long j11);

        void onSuccess(int i10, String str);
    }

    /* renamed from: anetwork.channel.download.DownloadManager$a */
    public static class C5111a {

        /* renamed from: a */
        static DownloadManager f2859a = new DownloadManager();

        private C5111a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m2594b(String str) {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f2858d.getExternalFilesDir(null));
        sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        sb2.append("downloads");
        sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        sb2.append(str);
        return sb2.toString();
    }

    public static DownloadManager getInstance() {
        return C5111a.f2859a;
    }

    public void cancel(int i10) {
        synchronized (this.f2855a) {
            try {
                RunnableC5112b runnableC5112b = this.f2855a.get(i10);
                if (runnableC5112b != null) {
                    if (ALog.isPrintLog(2)) {
                        ALog.m2530i(TAG, "try cancel task" + i10 + " url=" + runnableC5112b.f2861b.toString(), null, new Object[0]);
                    }
                    this.f2855a.remove(i10);
                    runnableC5112b.m2601a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int enqueue(String str, String str2, DownloadListener downloadListener) {
        return enqueue(str, null, str2, downloadListener);
    }

    /* renamed from: anetwork.channel.download.DownloadManager$b */
    public class RunnableC5112b implements Runnable {

        /* renamed from: a */
        final int f2860a;

        /* renamed from: b */
        final URL f2861b;

        /* renamed from: d */
        private final String f2863d;

        /* renamed from: e */
        private final CopyOnWriteArrayList<DownloadListener> f2864e;

        /* renamed from: f */
        private final AtomicBoolean f2865f = new AtomicBoolean(false);

        /* renamed from: g */
        private final AtomicBoolean f2866g = new AtomicBoolean(false);

        /* renamed from: h */
        private volatile Connection f2867h = null;

        /* renamed from: i */
        private boolean f2868i;

        public RunnableC5112b(URL url, String str, String str2, DownloadListener downloadListener) {
            this.f2868i = true;
            this.f2860a = DownloadManager.this.f2856b.getAndIncrement();
            this.f2861b = url;
            str2 = TextUtils.isEmpty(str2) ? m2596a(url) : str2;
            if (TextUtils.isEmpty(str)) {
                this.f2863d = DownloadManager.this.m2594b(str2);
            } else {
                if (str.endsWith(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                    this.f2863d = str + str2;
                } else {
                    this.f2863d = str + '/' + str2;
                }
                if (str.startsWith("/data/user") || str.startsWith("/data/data")) {
                    this.f2868i = false;
                }
            }
            CopyOnWriteArrayList<DownloadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f2864e = copyOnWriteArrayList;
            copyOnWriteArrayList.add(downloadListener);
        }

        /* renamed from: a */
        public boolean m2602a(DownloadListener downloadListener) {
            if (this.f2866g.get()) {
                return false;
            }
            this.f2864e.add(downloadListener);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:186:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x026b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:235:0x024e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:240:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 646
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.download.DownloadManager.RunnableC5112b.run():void");
        }

        /* renamed from: a */
        public void m2601a() {
            this.f2865f.set(true);
            m2597a(-105, "download canceled.");
            if (this.f2867h != null) {
                try {
                    this.f2867h.cancel();
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m2599a(String str) {
            if (this.f2866g.compareAndSet(false, true)) {
                Iterator<DownloadListener> it = this.f2864e.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(this.f2860a, str);
                }
            }
        }

        /* renamed from: a */
        private void m2597a(int i10, String str) {
            if (this.f2866g.compareAndSet(false, true)) {
                Iterator<DownloadListener> it = this.f2864e.iterator();
                while (it.hasNext()) {
                    it.next().onFail(this.f2860a, i10, str);
                }
            }
        }

        /* renamed from: a */
        private void m2598a(long j10, long j11) {
            if (this.f2866g.get()) {
                return;
            }
            Iterator<DownloadListener> it = this.f2864e.iterator();
            while (it.hasNext()) {
                it.next().onProgress(this.f2860a, j10, j11);
            }
        }

        /* renamed from: a */
        private long m2595a(int i10, Map<String, List<String>> map, long j10) {
            int iLastIndexOf;
            try {
                if (i10 == 200) {
                    return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length"));
                }
                if (i10 != 206) {
                    return 0L;
                }
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Range");
                long j11 = (singleHeaderFieldByKey == null || (iLastIndexOf = singleHeaderFieldByKey.lastIndexOf(47)) == -1) ? 0L : Long.parseLong(singleHeaderFieldByKey.substring(iLastIndexOf + 1));
                if (j11 != 0) {
                    return j11;
                }
                try {
                    return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length")) + j10;
                } catch (Exception unused) {
                    return j11;
                }
            } catch (Exception unused2) {
                return 0L;
            }
        }

        /* renamed from: a */
        private void m2600a(List<Header> list) {
            if (list != null) {
                ListIterator<Header> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (HttpHeaders.RANGE.equalsIgnoreCase(listIterator.next().getName())) {
                        listIterator.remove();
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        private String m2596a(URL url) {
            String path = url.getPath();
            int iLastIndexOf = path.lastIndexOf(47);
            String strSubstring = iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1, path.length()) : null;
            return (TextUtils.isEmpty(strSubstring) && (strSubstring = StringUtils.md5ToHex(url.toString())) == null) ? url.getFile() : strSubstring;
        }
    }

    private DownloadManager() {
        this.f2855a = new SparseArray<>(6);
        this.f2856b = new AtomicInteger(0);
        this.f2857c = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f2858d = null;
        this.f2858d = NetworkSdkSetting.getContext();
        this.f2857c.allowCoreThreadTimeOut(true);
        m2592a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r0.m2602a(r13) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r11 = r0.f2860a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int enqueue(java.lang.String r10, java.lang.String r11, java.lang.String r12, anetwork.channel.download.DownloadManager.DownloadListener r13) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            boolean r0 = anet.channel.util.ALog.isPrintLog(r0)
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.String r0 = "anet.DownloadManager"
            java.lang.String r2 = "enqueue"
            java.lang.String r3 = "folder"
            java.lang.String r5 = "filename"
            java.lang.String r7 = "url"
            r8 = r10
            r4 = r11
            r6 = r12
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            anet.channel.util.ALog.m2530i(r0, r2, r1, r10)
            goto L20
        L1d:
            r8 = r10
            r4 = r11
            r6 = r12
        L20:
            android.content.Context r10 = r9.f2858d
            r11 = 0
            r12 = -1
            if (r10 != 0) goto L30
            java.lang.String r10 = "anet.DownloadManager"
            java.lang.String r13 = "network sdk not initialized."
            java.lang.Object[] r11 = new java.lang.Object[r11]
            anet.channel.util.ALog.m2529e(r10, r13, r1, r11)
            return r12
        L30:
            java.net.URL r5 = new java.net.URL     // Catch: java.net.MalformedURLException -> La1
            r5.<init>(r8)     // Catch: java.net.MalformedURLException -> La1
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L54
            boolean r10 = r9.m2593a(r4)
            if (r10 != 0) goto L54
            java.lang.String r10 = "anet.DownloadManager"
            java.lang.String r0 = "file folder invalid."
            java.lang.Object[] r11 = new java.lang.Object[r11]
            anet.channel.util.ALog.m2529e(r10, r0, r1, r11)
            if (r13 == 0) goto L53
            r10 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r11 = "file folder path invalid"
            r13.onFail(r12, r10, r11)
        L53:
            return r12
        L54:
            android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r10 = r9.f2855a
            monitor-enter(r10)
            android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r12 = r9.f2855a     // Catch: java.lang.Throwable -> L9c
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L9c
        L5d:
            if (r11 >= r12) goto L80
            android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r0 = r9.f2855a     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.valueAt(r11)     // Catch: java.lang.Throwable -> L79
            anetwork.channel.download.DownloadManager$b r0 = (anetwork.channel.download.DownloadManager.RunnableC5112b) r0     // Catch: java.lang.Throwable -> L79
            java.net.URL r1 = r0.f2861b     // Catch: java.lang.Throwable -> L79
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L7d
            boolean r11 = r0.m2602a(r13)     // Catch: java.lang.Throwable -> L79
            if (r11 == 0) goto L80
            int r11 = r0.f2860a     // Catch: java.lang.Throwable -> L79
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L79
            return r11
        L79:
            r0 = move-exception
            r11 = r0
            r4 = r9
            goto L9f
        L7d:
            int r11 = r11 + 1
            goto L5d
        L80:
            anetwork.channel.download.DownloadManager$b r3 = new anetwork.channel.download.DownloadManager$b     // Catch: java.lang.Throwable -> L9c
            r8 = r13
            r7 = r6
            r6 = r4
            r4 = r9
            r3.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L99
            android.util.SparseArray<anetwork.channel.download.DownloadManager$b> r11 = r4.f2855a     // Catch: java.lang.Throwable -> L99
            int r12 = r3.f2860a     // Catch: java.lang.Throwable -> L99
            r11.put(r12, r3)     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.ThreadPoolExecutor r11 = r4.f2857c     // Catch: java.lang.Throwable -> L99
            r11.submit(r3)     // Catch: java.lang.Throwable -> L99
            int r11 = r3.f2860a     // Catch: java.lang.Throwable -> L99
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            return r11
        L99:
            r0 = move-exception
        L9a:
            r11 = r0
            goto L9f
        L9c:
            r0 = move-exception
            r4 = r9
            goto L9a
        L9f:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            throw r11
        La1:
            r0 = move-exception
            r4 = r9
            r8 = r13
            r10 = r0
            java.lang.String r13 = "anet.DownloadManager"
            java.lang.String r0 = "url invalid."
            java.lang.Object[] r11 = new java.lang.Object[r11]
            anet.channel.util.ALog.m2528e(r13, r0, r1, r10, r11)
            if (r8 == 0) goto Lb7
            r10 = -100
            java.lang.String r11 = "url invalid"
            r8.onFail(r12, r10, r11)
        Lb7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.download.DownloadManager.enqueue(java.lang.String, java.lang.String, java.lang.String, anetwork.channel.download.DownloadManager$DownloadListener):int");
    }

    /* renamed from: a */
    private void m2592a() {
        if (this.f2858d != null) {
            File file = new File(this.f2858d.getExternalFilesDir(null), "downloads");
            if (file.exists()) {
                return;
            }
            file.mkdir();
        }
    }

    /* renamed from: a */
    private boolean m2593a(String str) {
        if (this.f2858d == null) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                return true;
            }
            return file.mkdir();
        } catch (Exception unused) {
            ALog.m2529e(TAG, "create folder failed", null, "folder", str);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public File m2590a(String str, boolean z10) {
        String strMd5ToHex = StringUtils.md5ToHex(str);
        if (strMd5ToHex != null) {
            str = strMd5ToHex;
        }
        if (z10) {
            return new File(this.f2858d.getExternalCacheDir(), str);
        }
        return new File(this.f2858d.getCacheDir(), str);
    }
}
