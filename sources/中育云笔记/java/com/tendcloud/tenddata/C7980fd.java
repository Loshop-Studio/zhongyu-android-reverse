package com.tendcloud.tenddata;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;

/* renamed from: com.tendcloud.tenddata.fd */
/* loaded from: classes5.dex */
public class C7980fd {

    /* renamed from: a */
    private static final int f14927a = 25;

    /* renamed from: b */
    private static C7980fd f14928b;

    /* renamed from: c */
    private ExecutorService f14929c;

    /* renamed from: d */
    private HashMap<Integer, TreeSet<C7979fc>> f14930d;

    /* renamed from: e */
    private CRC32 f14931e;

    /* renamed from: f */
    private Map<Integer, RandomAccessFile> f14932f;

    /* renamed from: g */
    private Map<Integer, FileLock> f14933g;

    /* renamed from: h */
    private Lock f14934h = new ReentrantLock();

    /* renamed from: com.tendcloud.tenddata.fd$a */
    public class a implements Runnable {
        private final String mFolderPath;
        private final String mNewFolder;
        private final TreeSet<C7979fc> mQueue;

        private void deleteFile(String str, C7979fc c7979fc) {
            File file = new File(str + File.separator + c7979fc.m11954b());
            if (file.exists()) {
                file.delete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TreeSet<C7979fc> treeSet = this.mQueue;
                if (treeSet != null) {
                    treeSet.isEmpty();
                    while (!this.mQueue.isEmpty()) {
                        C7979fc c7979fcPollFirst = this.mQueue.pollFirst();
                        if (c7979fcPollFirst != null) {
                            File file = new File(this.mFolderPath);
                            if (file.exists()) {
                                deleteFile(file.getAbsolutePath(), c7979fcPollFirst);
                            }
                            File file2 = new File(this.mNewFolder);
                            if (file2.exists()) {
                                deleteFile(file2.getAbsolutePath(), c7979fcPollFirst);
                            }
                        }
                    }
                    this.mQueue.clear();
                }
            } catch (Throwable unused) {
            }
        }

        private a(AbstractC7841a abstractC7841a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C7843ab.f14307g.getFilesDir());
            String str = File.separator;
            sb2.append(str);
            sb2.append(abstractC7841a.getDataFolder());
            this.mFolderPath = sb2.toString();
            this.mNewFolder = C7843ab.f14307g.getFilesDir() + str + abstractC7841a.getRootFolder() + str + abstractC7841a.getDataFolder();
            this.mQueue = (TreeSet) C7980fd.this.f14930d.get(Integer.valueOf(abstractC7841a.index()));
        }
    }

    /* renamed from: com.tendcloud.tenddata.fd$b */
    public class b implements Runnable {
        private final String mFolderPath;
        private final C7979fc mOperation;

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(this.mFolderPath + File.separator + this.mOperation.m11954b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
        }

        private b(C7979fc c7979fc, AbstractC7841a abstractC7841a, String str) {
            String absolutePath = C7843ab.f14307g.getFilesDir().getAbsolutePath();
            if (!TextUtils.isEmpty(str)) {
                absolutePath = absolutePath + File.separator + str;
            }
            this.mFolderPath = absolutePath + File.separator + abstractC7841a.getDataFolder();
            this.mOperation = c7979fc;
        }
    }

    /* renamed from: com.tendcloud.tenddata.fd$c */
    public class c implements Runnable {
        private InterfaceC7981fe callback;
        private AbstractC7841a features;
        private String mFolderPath;
        private final C7979fc mOperation;
        private final C7980fd opm;

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
        
            r3.release();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        
            r2.close();
            r0 = r7.callback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        
            if (r0 == null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        
            r0.onStoreSuccess();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7980fd.c.run():void");
        }

        private c(C7979fc c7979fc, C7961el c7961el, C7980fd c7980fd) {
            File filesDir = C7843ab.f14307g.getFilesDir();
            this.opm = c7980fd;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(filesDir.toString());
            String str = File.separator;
            sb2.append(str);
            sb2.append(c7961el.f14868a.getDataFolder());
            this.mFolderPath = sb2.toString();
            this.mFolderPath = filesDir.toString() + str + c7961el.f14868a.getRootFolder() + str + c7961el.f14868a.getDataFolder();
            this.mOperation = c7979fc;
            this.callback = c7961el.f14873f;
            this.features = c7961el.f14868a;
        }
    }

    private C7980fd() {
        m11968c();
        this.f14930d = new HashMap<>();
        for (AbstractC7841a abstractC7841a : AbstractC7841a.values()) {
            this.f14930d.put(Integer.valueOf(abstractC7841a.index()), new TreeSet<>());
        }
        this.f14929c = Executors.newSingleThreadExecutor();
        this.f14931e = new CRC32();
    }

    /* renamed from: c */
    private void m11968c() {
        this.f14932f = new HashMap();
        this.f14933g = new HashMap();
        try {
            for (AbstractC7841a abstractC7841a : AbstractC7841a.values()) {
                File file = new File(C7843ab.f14307g.getFilesDir(), abstractC7841a.getRootFolder());
                File file2 = new File(file, abstractC7841a.getDataFolder());
                if (!file2.exists() && !file2.mkdirs()) {
                    return;
                }
                this.f14932f.put(Integer.valueOf(abstractC7841a.index()), new RandomAccessFile(new File(file, "Lock" + abstractC7841a.index()), "rw"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void m11971b() {
        File filesDir = C7843ab.f14307g.getFilesDir();
        try {
            int i10 = 0;
            for (AbstractC7841a abstractC7841a : AbstractC7841a.values()) {
                File file = new File(filesDir, abstractC7841a.getDataFolder());
                if (file.exists()) {
                    Iterator<File> it = m11967c(file).iterator();
                    while (it.hasNext()) {
                        it.next().delete();
                    }
                }
            }
            AbstractC7841a[] abstractC7841aArrValues = AbstractC7841a.values();
            int length = abstractC7841aArrValues.length;
            while (i10 < length) {
                AbstractC7841a abstractC7841a2 = abstractC7841aArrValues[i10];
                File file2 = new File(filesDir, abstractC7841a2.getRootFolder());
                File file3 = new File(file2, abstractC7841a2.getDataFolder());
                if (file3.exists()) {
                    Iterator<File> it2 = m11967c(file3).iterator();
                    while (it2.hasNext()) {
                        it2.next().delete();
                    }
                }
                i10++;
                filesDir = file2;
            }
        } catch (Throwable unused) {
        }
    }

    public void clearDataCache(AbstractC7841a abstractC7841a) {
        try {
            this.f14930d.get(Integer.valueOf(abstractC7841a.index())).clear();
        } catch (Throwable unused) {
        }
    }

    public void confirmRead(AbstractC7841a abstractC7841a) {
        new a(abstractC7841a).run();
    }

    public void getFileLock(AbstractC7841a abstractC7841a) {
        try {
            this.f14934h.lock();
            this.f14933g.put(Integer.valueOf(abstractC7841a.index()), this.f14932f.get(Integer.valueOf(abstractC7841a.index())).getChannel().lock());
        } catch (Throwable unused) {
        }
    }

    public void releaseFileLock(AbstractC7841a abstractC7841a) {
        try {
            if (this.f14933g.get(Integer.valueOf(abstractC7841a.index())) != null) {
                this.f14933g.get(Integer.valueOf(abstractC7841a.index())).release();
                this.f14934h.unlock();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C7980fd m11960a() {
        synchronized (C7980fd.class) {
            try {
                if (f14928b == null) {
                    f14928b = new C7980fd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14928b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11965a(File file, AbstractC7841a abstractC7841a) {
        try {
            int fileLimitType = abstractC7841a.getFileLimitType();
            if (fileLimitType == 1) {
                if (m11966b(file) > 25) {
                    m11964a(file);
                }
            } else if (fileLimitType != 2) {
                if (fileLimitType != 3) {
                    return;
                }
                m11964a(file);
            } else if (file.listFiles().length >= 10) {
                m11964a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private List<File> m11967c(File file) {
        List<File> arrayList = new ArrayList<>();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        try {
            arrayList = Arrays.asList(fileArrListFiles);
            Collections.sort(arrayList, new Comparator<File>() { // from class: com.tendcloud.tenddata.fd.1
                @Override // java.util.Comparator
                public int compare(File file2, File file3) {
                    return file2.getName().compareTo(file3.getName());
                }
            });
            return arrayList;
        } catch (Throwable unused) {
            return arrayList;
        }
    }

    /* renamed from: a */
    private void m11964a(File file) {
        try {
            if (file.isDirectory()) {
                m11964a(m11967c(file).get(0));
            } else {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private int m11966b(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return 0;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                long length = 0;
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        length += file2.length();
                    }
                }
                return (int) (length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public synchronized void m11970a(C7979fc c7979fc, C7961el c7961el) throws Throwable {
        try {
            try {
                this.f14929c.execute(new c(c7979fc, c7961el, this));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* renamed from: a */
    private synchronized void m11962a(C7979fc c7979fc, AbstractC7841a abstractC7841a) {
        if (abstractC7841a != null && c7979fc != null) {
            try {
                this.f14930d.get(Integer.valueOf(abstractC7841a.index())).add(c7979fc);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #3 {all -> 0x0073, blocks: (B:23:0x0069, B:25:0x006f), top: B:88:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106 A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #9 {all -> 0x009c, blocks: (B:35:0x0094, B:36:0x0098, B:48:0x00de, B:58:0x0106, B:60:0x010c), top: B:100:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #9 {all -> 0x009c, blocks: (B:35:0x0094, B:36:0x0098, B:48:0x00de, B:58:0x0106, B:60:0x010c), top: B:100:0x0094 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.TreeSet<com.tendcloud.tenddata.C7979fc> m11969a(com.tendcloud.tenddata.AbstractC7841a r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7980fd.m11969a(com.tendcloud.tenddata.a, int, java.lang.String):java.util.TreeSet");
    }
}
