package p175h7;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.lzy.okgo.exception.HttpException;
import com.lzy.okgo.exception.OkGoException;
import com.lzy.okgo.exception.StorageException;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.base.Request;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import je.AbstractC9746z;
import je.C9745y;
import p115d7.C9003e;
import p146f7.AbstractC9202a;
import p146f7.AbstractC9203b;
import p146f7.AbstractC9204c;
import p163g7.C9275a;
import p191i7.RunnableC9612b;

/* renamed from: h7.b */
/* loaded from: classes5.dex */
public class RunnableC9498b implements Runnable {

    /* renamed from: c */
    public Progress f21954c;

    /* renamed from: d */
    public Map f21955d;

    /* renamed from: e */
    public ThreadPoolExecutor f21956e;

    /* renamed from: f */
    public RunnableC9612b f21957f;

    /* renamed from: h7.b$a */
    public class a implements Progress.InterfaceC7515a {
        public a() {
        }

        @Override // com.lzy.okgo.model.Progress.InterfaceC7515a
        /* renamed from: a */
        public void mo9675a(Progress progress) {
            RunnableC9498b.this.m18704f(progress);
        }
    }

    /* renamed from: h7.b$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f21959c;

        public b(Progress progress) {
            this.f21959c = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC9498b.this.f21955d.values().iterator();
            while (it.hasNext()) {
                ((AbstractC9497a) it.next()).mo5395a(this.f21959c);
            }
        }
    }

    /* renamed from: h7.b$c */
    public class c implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f21961c;

        public c(Progress progress) {
            this.f21961c = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC9498b.this.f21955d.values().iterator();
            while (it.hasNext()) {
                ((AbstractC9497a) it.next()).mo5396b(this.f21961c);
            }
        }
    }

    /* renamed from: h7.b$d */
    public class d implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f21963c;

        public d(Progress progress) {
            this.f21963c = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC9498b.this.f21955d.values().iterator();
            while (it.hasNext()) {
                ((AbstractC9497a) it.next()).mo5396b(this.f21963c);
            }
        }
    }

    /* renamed from: h7.b$e */
    public class e implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f21965c;

        public e(Progress progress) {
            this.f21965c = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC9498b.this.f21955d.values().iterator();
            while (it.hasNext()) {
                ((AbstractC9497a) it.next()).mo5396b(this.f21965c);
            }
        }
    }

    /* renamed from: h7.b$f */
    public class f implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f21967c;

        public f(Progress progress) {
            this.f21967c = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (AbstractC9497a abstractC9497a : RunnableC9498b.this.f21955d.values()) {
                abstractC9497a.mo5396b(this.f21967c);
                abstractC9497a.mo5398d(this.f21967c);
            }
        }
    }

    /* renamed from: h7.b$g */
    public class g implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f21969c;

        /* renamed from: d */
        public final /* synthetic */ File f21970d;

        public g(Progress progress, File file) {
            this.f21969c = progress;
            this.f21970d = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (AbstractC9497a abstractC9497a : RunnableC9498b.this.f21955d.values()) {
                abstractC9497a.mo5396b(this.f21969c);
                abstractC9497a.mo5397c(this.f21970d, this.f21969c);
            }
        }
    }

    public RunnableC9498b(String str, Request request) {
        AbstractC9202a.m18096b(str, "tag == null");
        Progress progress = new Progress();
        this.f21954c = progress;
        progress.f12697c = str;
        progress.f12699e = C9275a.m18263b().m18266a();
        this.f21954c.f12698d = request.m9680e();
        Progress progress2 = this.f21954c;
        progress2.f12706l = 0;
        progress2.f12703i = -1L;
        progress2.f12709o = request;
        this.f21956e = C9275a.m18263b().m18269e().m18716a();
        this.f21955d = new HashMap();
    }

    /* renamed from: b */
    public final void m18700b(InputStream inputStream, RandomAccessFile randomAccessFile, Progress progress) throws IOException {
        Progress progress2 = progress;
        if (inputStream == null || randomAccessFile == null) {
            return;
        }
        progress2.f12706l = 2;
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        while (true) {
            try {
                int i10 = bufferedInputStream.read(bArr, 0, 8192);
                if (i10 == -1 || progress2.f12706l != 2) {
                    break;
                }
                randomAccessFile.write(bArr, 0, i10);
                Progress.m9671e(progress2, i10, progress2.f12703i, new a());
                progress2 = progress;
            } finally {
                AbstractC9203b.m18102a(randomAccessFile);
                AbstractC9203b.m18102a(bufferedInputStream);
                AbstractC9203b.m18102a(inputStream);
            }
        }
    }

    /* renamed from: c */
    public RunnableC9498b m18701c(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            AbstractC9204c.m18113c("fileName is null, ignored!");
            return this;
        }
        this.f21954c.f12701g = str;
        return this;
    }

    /* renamed from: d */
    public RunnableC9498b m18702d(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            AbstractC9204c.m18113c("folder is null, ignored!");
            return this;
        }
        this.f21954c.f12699e = str;
        return this;
    }

    /* renamed from: e */
    public void m18703e() {
        this.f21956e.remove(this.f21957f);
        Progress progress = this.f21954c;
        int i10 = progress.f12706l;
        if (i10 == 1) {
            m18708j(progress);
            return;
        }
        if (i10 == 2) {
            progress.f12705k = 0L;
            progress.f12706l = 3;
        } else {
            AbstractC9204c.m18113c("only the task with status WAITING(1) or LOADING(2) can pause, current status is " + this.f21954c.f12706l);
        }
    }

    /* renamed from: f */
    public final void m18704f(Progress progress) {
        m18715q(progress);
        AbstractC9202a.m18101g(new e(progress));
    }

    /* renamed from: g */
    public final void m18705g(Progress progress, Throwable th) {
        progress.f12705k = 0L;
        progress.f12706l = 4;
        progress.f12713s = th;
        m18715q(progress);
        AbstractC9202a.m18101g(new f(progress));
    }

    /* renamed from: h */
    public final void m18706h(Progress progress, File file) {
        progress.f12705k = 0L;
        progress.f12702h = 1.0f;
        progress.f12706l = 5;
        m18715q(progress);
        AbstractC9202a.m18101g(new g(progress, file));
    }

    /* renamed from: i */
    public final void m18707i(Progress progress) {
        progress.f12705k = 0L;
        progress.f12706l = 0;
        m18715q(progress);
        AbstractC9202a.m18101g(new b(progress));
    }

    /* renamed from: j */
    public final void m18708j(Progress progress) {
        progress.f12705k = 0L;
        progress.f12706l = 3;
        m18715q(progress);
        AbstractC9202a.m18101g(new d(progress));
    }

    /* renamed from: k */
    public final void m18709k(Progress progress) {
        progress.f12705k = 0L;
        progress.f12706l = 1;
        m18715q(progress);
        AbstractC9202a.m18101g(new c(progress));
    }

    /* renamed from: l */
    public RunnableC9498b m18710l(AbstractC9497a abstractC9497a) {
        if (abstractC9497a != null) {
            this.f21955d.put(abstractC9497a.f21953a, abstractC9497a);
        }
        return this;
    }

    /* renamed from: m */
    public void m18711m() {
        m18703e();
        AbstractC9203b.m18106e(this.f21954c.f12700f);
        Progress progress = this.f21954c;
        progress.f12706l = 0;
        progress.f12704j = 0L;
        progress.f12702h = 0.0f;
        progress.f12705k = 0L;
        C9003e.m17584n().m17579h(this.f21954c);
        m18713o();
    }

    /* renamed from: n */
    public RunnableC9498b m18712n() {
        if (!TextUtils.isEmpty(this.f21954c.f12699e) && !TextUtils.isEmpty(this.f21954c.f12701g)) {
            Progress progress = this.f21954c;
            Progress progress2 = this.f21954c;
            progress.f12700f = new File(progress2.f12699e, progress2.f12701g).getAbsolutePath();
        }
        C9003e.m17584n().m17579h(this.f21954c);
        return this;
    }

    /* renamed from: o */
    public void m18713o() {
        if (C9275a.m18263b().m18267c(this.f21954c.f12697c) == null || C9003e.m17584n().m17585k(this.f21954c.f12697c) == null) {
            throw new IllegalStateException("you must call DownloadTask#save() before DownloadTask#start()！");
        }
        Progress progress = this.f21954c;
        int i10 = progress.f12706l;
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            m18707i(progress);
            m18709k(this.f21954c);
            RunnableC9612b runnableC9612b = new RunnableC9612b(this.f21954c.f12707m, this);
            this.f21957f = runnableC9612b;
            this.f21956e.execute(runnableC9612b);
            return;
        }
        if (i10 != 5) {
            AbstractC9204c.m18113c("the task with tag " + this.f21954c.f12697c + " is already in the download queue, current task status is " + this.f21954c.f12706l);
            return;
        }
        if (progress.f12700f == null) {
            m18705g(progress, new StorageException("the file of the task with tag:" + this.f21954c.f12697c + " may be invalid or damaged, please call the method restart() to download again！"));
            return;
        }
        File file = new File(this.f21954c.f12700f);
        if (file.exists()) {
            long length = file.length();
            Progress progress2 = this.f21954c;
            if (length == progress2.f12703i) {
                m18706h(progress2, new File(this.f21954c.f12700f));
                return;
            }
        }
        m18705g(this.f21954c, new StorageException("the file " + this.f21954c.f12700f + " may be invalid or damaged, please call the method restart() to download again！"));
    }

    /* renamed from: p */
    public void m18714p(String str) {
        AbstractC9202a.m18096b(str, "tag == null");
        this.f21955d.remove(str);
    }

    /* renamed from: q */
    public final void m18715q(Progress progress) {
        C9003e.m17584n().m17589p(Progress.m9670d(progress), progress.f12697c);
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        File file;
        Progress progress = this.f21954c;
        long j10 = progress.f12704j;
        if (j10 < 0) {
            m18705g(progress, OkGoException.m9650a());
            return;
        }
        if (j10 > 0 && !TextUtils.isEmpty(progress.f12700f) && !new File(this.f21954c.f12700f).exists()) {
            m18705g(this.f21954c, OkGoException.m9651c());
            return;
        }
        try {
            Request request = this.f21954c.f12709o;
            request.m9683k(HttpHeaders.RANGE, "bytes=" + j10 + "-");
            C9745y c9745yM9679a = request.m9679a();
            int iM19632j = c9745yM9679a.m19632j();
            if (iM19632j == 404 || iM19632j >= 500) {
                m18705g(this.f21954c, HttpException.m9649a());
                return;
            }
            AbstractC9746z abstractC9746zM19628e = c9745yM9679a.m19628e();
            if (abstractC9746zM19628e == null) {
                m18705g(this.f21954c, new HttpException("response body is null"));
                return;
            }
            Progress progress2 = this.f21954c;
            if (progress2.f12703i == -1) {
                progress2.f12703i = abstractC9746zM19628e.contentLength();
            }
            String strM18099e = this.f21954c.f12701g;
            if (TextUtils.isEmpty(strM18099e)) {
                strM18099e = AbstractC9202a.m18099e(c9745yM9679a, this.f21954c.f12698d);
                this.f21954c.f12701g = strM18099e;
            }
            if (!AbstractC9203b.m18104c(this.f21954c.f12699e)) {
                m18705g(this.f21954c, StorageException.m9653a());
                return;
            }
            if (TextUtils.isEmpty(this.f21954c.f12700f)) {
                file = new File(this.f21954c.f12699e, strM18099e);
                this.f21954c.f12700f = file.getAbsolutePath();
            } else {
                file = new File(this.f21954c.f12700f);
            }
            if (j10 > 0 && !file.exists()) {
                m18705g(this.f21954c, OkGoException.m9650a());
                return;
            }
            Progress progress3 = this.f21954c;
            if (j10 > progress3.f12703i) {
                m18705g(progress3, OkGoException.m9650a());
                return;
            }
            if (j10 == 0 && file.exists()) {
                AbstractC9203b.m18105d(file);
            }
            if (j10 == this.f21954c.f12703i && j10 > 0) {
                if (file.exists() && j10 == file.length()) {
                    m18706h(this.f21954c, file);
                    return;
                } else {
                    m18705g(this.f21954c, OkGoException.m9650a());
                    return;
                }
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(j10);
                this.f21954c.f12704j = j10;
                try {
                    C9003e.m17584n().m17579h(this.f21954c);
                    m18700b(abstractC9746zM19628e.byteStream(), randomAccessFile, this.f21954c);
                    Progress progress4 = this.f21954c;
                    int i10 = progress4.f12706l;
                    if (i10 == 3) {
                        m18708j(progress4);
                        return;
                    }
                    if (i10 != 2) {
                        m18705g(progress4, OkGoException.m9652d());
                        return;
                    }
                    long length = file.length();
                    Progress progress5 = this.f21954c;
                    if (length == progress5.f12703i) {
                        m18706h(progress5, file);
                    } else {
                        m18705g(progress5, OkGoException.m9650a());
                    }
                } catch (IOException e10) {
                    m18705g(this.f21954c, e10);
                }
            } catch (Exception e11) {
                m18705g(this.f21954c, e11);
            }
        } catch (IOException e12) {
            m18705g(this.f21954c, e12);
        }
    }

    public RunnableC9498b(Progress progress) {
        AbstractC9202a.m18096b(progress, "progress == null");
        this.f21954c = progress;
        this.f21956e = C9275a.m18263b().m18269e().m18716a();
        this.f21955d = new HashMap();
    }
}
