package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.C6854k;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.tencent.smtt.sdk.bo */
/* loaded from: classes4.dex */
class C6816bo {

    /* renamed from: a */
    private static C6816bo f6876a;

    /* renamed from: e */
    private static FileLock f6877e;

    /* renamed from: b */
    private C6817bp f6878b;

    /* renamed from: c */
    private boolean f6879c;

    /* renamed from: d */
    private boolean f6880d;

    private C6816bo() {
    }

    /* renamed from: b */
    public static C6816bo m6152b() {
        if (f6876a == null) {
            synchronized (C6816bo.class) {
                try {
                    if (f6876a == null) {
                        f6876a = new C6816bo();
                    }
                } finally {
                }
            }
        }
        return f6876a;
    }

    /* renamed from: a */
    public C6817bp m6153a(boolean z10) {
        return z10 ? this.f6878b : m6158d();
    }

    /* renamed from: c */
    public boolean m6157c() {
        if (QbSdk.f6572a) {
            return false;
        }
        return this.f6879c;
    }

    /* renamed from: d */
    public C6817bp m6158d() {
        if (QbSdk.f6572a) {
            return null;
        }
        return this.f6878b;
    }

    /* renamed from: e */
    public boolean m6159e() {
        return this.f6880d;
    }

    /* renamed from: a */
    public FileLock m6154a() {
        return f6877e;
    }

    /* renamed from: a */
    public synchronized FileLock m6155a(Context context) {
        FileLock fileLock = f6877e;
        if (fileLock != null) {
            return fileLock;
        }
        FileOutputStream fileOutputStreamM6316b = C6854k.m6316b(context, true, "tbs_rename_lock.txt");
        if (fileOutputStreamM6316b != null) {
            f6877e = C6854k.m6301a(context, fileOutputStreamM6316b);
        }
        return f6877e;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #3 {all -> 0x000a, blocks: (B:5:0x0004, B:8:0x000d, B:10:0x001d, B:11:0x0022, B:14:0x002f, B:17:0x0035, B:18:0x0037, B:27:0x006f, B:29:0x0073, B:32:0x008a, B:34:0x008e, B:51:0x0103, B:53:0x010f, B:62:0x01a4, B:64:0x01a8, B:54:0x0133, B:50:0x0100, B:55:0x0157, B:57:0x015d, B:58:0x017d, B:59:0x019d, B:61:0x01a1, B:24:0x0051, B:25:0x006c, B:30:0x0082, B:38:0x009f, B:40:0x00a5, B:43:0x00b4, B:45:0x00b8, B:46:0x00e7, B:48:0x00eb, B:19:0x0042, B:21:0x004a), top: B:71:0x0004, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d A[Catch: all -> 0x000a, TryCatch #3 {all -> 0x000a, blocks: (B:5:0x0004, B:8:0x000d, B:10:0x001d, B:11:0x0022, B:14:0x002f, B:17:0x0035, B:18:0x0037, B:27:0x006f, B:29:0x0073, B:32:0x008a, B:34:0x008e, B:51:0x0103, B:53:0x010f, B:62:0x01a4, B:64:0x01a8, B:54:0x0133, B:50:0x0100, B:55:0x0157, B:57:0x015d, B:58:0x017d, B:59:0x019d, B:61:0x01a1, B:24:0x0051, B:25:0x006c, B:30:0x0082, B:38:0x009f, B:40:0x00a5, B:43:0x00b4, B:45:0x00b8, B:46:0x00e7, B:48:0x00eb, B:19:0x0042, B:21:0x004a), top: B:71:0x0004, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8 A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #3 {all -> 0x000a, blocks: (B:5:0x0004, B:8:0x000d, B:10:0x001d, B:11:0x0022, B:14:0x002f, B:17:0x0035, B:18:0x0037, B:27:0x006f, B:29:0x0073, B:32:0x008a, B:34:0x008e, B:51:0x0103, B:53:0x010f, B:62:0x01a4, B:64:0x01a8, B:54:0x0133, B:50:0x0100, B:55:0x0157, B:57:0x015d, B:58:0x017d, B:59:0x019d, B:61:0x01a1, B:24:0x0051, B:25:0x006c, B:30:0x0082, B:38:0x009f, B:40:0x00a5, B:43:0x00b4, B:45:0x00b8, B:46:0x00e7, B:48:0x00eb, B:19:0x0042, B:21:0x004a), top: B:71:0x0004, inners: #1, #4 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m6156a(android.content.Context r11, com.tencent.smtt.sdk.C6784aj r12) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6816bo.m6156a(android.content.Context, com.tencent.smtt.sdk.aj):void");
    }
}
