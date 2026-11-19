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
import java.net.MalformedURLException;
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
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
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
    SparseArray<RunnableC0989b> f5577a;

    /* renamed from: b */
    AtomicInteger f5578b;

    /* renamed from: c */
    ThreadPoolExecutor f5579c;

    /* renamed from: d */
    Context f5580d;

    public interface DownloadListener {
        void onFail(int i4, int i5, String str);

        void onProgress(int i4, long j4, long j5);

        void onSuccess(int i4, String str);
    }

    /* renamed from: anetwork.channel.download.DownloadManager$a */
    private static class C0988a {

        /* renamed from: a */
        static DownloadManager f5581a = new DownloadManager();

        private C0988a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m4703b(String str) {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f5580d.getExternalFilesDir(null));
        sb.append("/");
        sb.append("downloads");
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    public static DownloadManager getInstance() {
        return C0988a.f5581a;
    }

    public void cancel(int i4) {
        synchronized (this.f5577a) {
            RunnableC0989b runnableC0989b = this.f5577a.get(i4);
            if (runnableC0989b != null) {
                if (ALog.isPrintLog(2)) {
                    ALog.m4639i(TAG, "try cancel task" + i4 + " url=" + runnableC0989b.f5583b.toString(), null, new Object[0]);
                }
                this.f5577a.remove(i4);
                runnableC0989b.m4710a();
            }
        }
    }

    public int enqueue(String str, String str2, DownloadListener downloadListener) {
        return enqueue(str, null, str2, downloadListener);
    }

    /* renamed from: anetwork.channel.download.DownloadManager$b */
    class RunnableC0989b implements Runnable {

        /* renamed from: a */
        final int f5582a;

        /* renamed from: b */
        final URL f5583b;

        /* renamed from: d */
        private final String f5585d;

        /* renamed from: e */
        private final CopyOnWriteArrayList<DownloadListener> f5586e;

        /* renamed from: f */
        private final AtomicBoolean f5587f = new AtomicBoolean(false);

        /* renamed from: g */
        private final AtomicBoolean f5588g = new AtomicBoolean(false);

        /* renamed from: h */
        private volatile Connection f5589h = null;

        /* renamed from: i */
        private boolean f5590i;

        RunnableC0989b(URL url, String str, String str2, DownloadListener downloadListener) {
            this.f5590i = true;
            this.f5582a = DownloadManager.this.f5578b.getAndIncrement();
            this.f5583b = url;
            str2 = TextUtils.isEmpty(str2) ? m4705a(url) : str2;
            if (TextUtils.isEmpty(str)) {
                this.f5585d = DownloadManager.this.m4703b(str2);
            } else {
                if (str.endsWith("/")) {
                    this.f5585d = str + str2;
                } else {
                    this.f5585d = str + '/' + str2;
                }
                if (str.startsWith("/data/user") || str.startsWith("/data/data")) {
                    this.f5590i = false;
                }
            }
            CopyOnWriteArrayList<DownloadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f5586e = copyOnWriteArrayList;
            copyOnWriteArrayList.add(downloadListener);
        }

        /* renamed from: a */
        public boolean m4711a(DownloadListener downloadListener) {
            if (this.f5588g.get()) {
                return false;
            }
            this.f5586e.add(downloadListener);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:200:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:204:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:228:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:240:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:250:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 654
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.download.DownloadManager.RunnableC0989b.run():void");
        }

        /* renamed from: a */
        public void m4710a() {
            this.f5587f.set(true);
            m4706a(-105, "download canceled.");
            if (this.f5589h != null) {
                try {
                    this.f5589h.cancel();
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m4708a(String str) {
            if (this.f5588g.compareAndSet(false, true)) {
                Iterator<DownloadListener> it = this.f5586e.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(this.f5582a, str);
                }
            }
        }

        /* renamed from: a */
        private void m4706a(int i4, String str) {
            if (this.f5588g.compareAndSet(false, true)) {
                Iterator<DownloadListener> it = this.f5586e.iterator();
                while (it.hasNext()) {
                    it.next().onFail(this.f5582a, i4, str);
                }
            }
        }

        /* renamed from: a */
        private void m4707a(long j4, long j5) {
            if (this.f5588g.get()) {
                return;
            }
            Iterator<DownloadListener> it = this.f5586e.iterator();
            while (it.hasNext()) {
                it.next().onProgress(this.f5582a, j4, j5);
            }
        }

        /* renamed from: a */
        private long m4704a(int i4, Map<String, List<String>> map, long j4) {
            int iLastIndexOf;
            try {
                if (i4 == 200) {
                    return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length"));
                }
                if (i4 != 206) {
                    return 0L;
                }
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Range");
                long j5 = (singleHeaderFieldByKey == null || (iLastIndexOf = singleHeaderFieldByKey.lastIndexOf(47)) == -1) ? 0L : Long.parseLong(singleHeaderFieldByKey.substring(iLastIndexOf + 1));
                if (j5 == 0) {
                    try {
                        return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length")) + j4;
                    } catch (Exception unused) {
                    }
                }
                return j5;
            } catch (Exception unused2) {
                return 0L;
            }
        }

        /* renamed from: a */
        private void m4709a(List<Header> list) {
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
        private String m4705a(URL url) {
            String path = url.getPath();
            int iLastIndexOf = path.lastIndexOf(47);
            String strSubstring = iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1, path.length()) : null;
            if (!TextUtils.isEmpty(strSubstring)) {
                return strSubstring;
            }
            String strMd5ToHex = StringUtils.md5ToHex(url.toString());
            return strMd5ToHex == null ? url.getFile() : strMd5ToHex;
        }
    }

    private DownloadManager() {
        this.f5577a = new SparseArray<>(6);
        this.f5578b = new AtomicInteger(0);
        this.f5579c = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f5580d = null;
        this.f5580d = NetworkSdkSetting.getContext();
        this.f5579c.allowCoreThreadTimeOut(true);
        m4701a();
    }

    public int enqueue(String str, String str2, String str3, DownloadListener downloadListener) {
        int i4 = 0;
        if (ALog.isPrintLog(2)) {
            ALog.m4639i(TAG, "enqueue", null, "folder", str2, "filename", str3, AgooConstants.OPEN_URL, str);
        }
        if (this.f5580d == null) {
            ALog.m4638e(TAG, "network sdk not initialized.", null, new Object[0]);
            return -1;
        }
        try {
            URL url = new URL(str);
            if (!TextUtils.isEmpty(str2) && !m4702a(str2)) {
                ALog.m4638e(TAG, "file folder invalid.", null, new Object[0]);
                if (downloadListener != null) {
                    downloadListener.onFail(-1, -101, "file folder path invalid");
                }
                return -1;
            }
            synchronized (this.f5577a) {
                int size = this.f5577a.size();
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    RunnableC0989b runnableC0989bValueAt = this.f5577a.valueAt(i4);
                    if (!url.equals(runnableC0989bValueAt.f5583b)) {
                        i4++;
                    } else if (runnableC0989bValueAt.m4711a(downloadListener)) {
                        return runnableC0989bValueAt.f5582a;
                    }
                }
                RunnableC0989b runnableC0989b = new RunnableC0989b(url, str2, str3, downloadListener);
                this.f5577a.put(runnableC0989b.f5582a, runnableC0989b);
                this.f5579c.submit(runnableC0989b);
                return runnableC0989b.f5582a;
            }
        } catch (MalformedURLException e4) {
            ALog.m4637e(TAG, "url invalid.", null, e4, new Object[0]);
            if (downloadListener != null) {
                downloadListener.onFail(-1, -100, "url invalid");
            }
            return -1;
        }
    }

    /* renamed from: a */
    private void m4701a() {
        if (this.f5580d != null) {
            File file = new File(this.f5580d.getExternalFilesDir(null), "downloads");
            if (file.exists()) {
                return;
            }
            file.mkdir();
        }
    }

    /* renamed from: a */
    private boolean m4702a(String str) {
        if (this.f5580d != null) {
            try {
                File file = new File(str);
                if (file.exists()) {
                    return true;
                }
                return file.mkdir();
            } catch (Exception unused) {
                ALog.m4638e(TAG, "create folder failed", null, "folder", str);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public File m4699a(String str, boolean z3) {
        String strMd5ToHex = StringUtils.md5ToHex(str);
        if (strMd5ToHex != null) {
            str = strMd5ToHex;
        }
        if (z3) {
            return new File(this.f5580d.getExternalCacheDir(), str);
        }
        return new File(this.f5580d.getCacheDir(), str);
    }
}
