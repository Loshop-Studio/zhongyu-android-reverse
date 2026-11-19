package anet.channel.util;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import java.io.File;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class SerializeHelper {
    private static final String TAG = "awcn.SerializeHelper";
    private static File cacheDir;

    public static File getCacheFiles(String str) {
        Context context;
        if (cacheDir == null && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            cacheDir = context.getCacheDir();
        }
        return new File(cacheDir, str);
    }

    public static synchronized void persist(Serializable serializable, File file) {
        persist(serializable, file, null);
    }

    public static synchronized <T> T restore(File file) {
        return (T) restore(file, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:10:0x0013, B:12:0x0019, B:14:0x001f, B:22:0x003a, B:23:0x003c), top: B:55:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized <T> T restore(java.io.File r19, anet.channel.statist.StrategyStatObject r20) {
        /*
            r1 = r20
            java.lang.Class<anet.channel.util.SerializeHelper> r2 = anet.channel.util.SerializeHelper.class
            monitor-enter(r2)
            if (r1 == 0) goto L11
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> Le
            r1.readStrategyFilePath = r0     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r0 = move-exception
            goto Lb2
        L11:
            r3 = 3
            r4 = 0
            boolean r0 = r19.exists()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L37
            boolean r0 = anet.channel.util.ALog.isPrintLog(r3)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L35
            java.lang.String r0 = "awcn.SerializeHelper"
            java.lang.String r5 = "file not exist."
            java.lang.String r6 = "file"
            java.lang.String r7 = r19.getName()     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L31
            anet.channel.util.ALog.m2532w(r0, r5, r4, r6)     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            r7 = r4
            r10 = r7
            goto L8d
        L35:
            monitor-exit(r2)
            return r4
        L37:
            r0 = 1
            if (r1 == 0) goto L3c
            r1.isFileExists = r0     // Catch: java.lang.Throwable -> L31
        L3c:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L31
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L31
            r8 = r19
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L31
            java.io.ObjectInputStream r9 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L8b
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8b
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L8b
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r9.readObject()     // Catch: java.lang.Throwable -> L8b
            r9.close()     // Catch: java.lang.Throwable -> L64
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L64
            long r11 = r11 - r5
            if (r1 == 0) goto L66
            r1.isReadObjectSucceed = r0     // Catch: java.lang.Throwable -> L64
            r1.readCostTime = r11     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r0 = move-exception
            goto L8d
        L66:
            java.lang.String r0 = "awcn.SerializeHelper"
            java.lang.String r5 = "restore end."
            java.lang.String r13 = "file"
            java.io.File r14 = r8.getAbsoluteFile()     // Catch: java.lang.Throwable -> L64
            java.lang.String r15 = "size"
            long r8 = r8.length()     // Catch: java.lang.Throwable -> L64
            java.lang.Long r16 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.String r17 = "cost"
            java.lang.Long r18 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r6 = new java.lang.Object[]{r13, r14, r15, r16, r17, r18}     // Catch: java.lang.Throwable -> L64
            anet.channel.util.ALog.m2530i(r0, r5, r4, r6)     // Catch: java.lang.Throwable -> L64
        L87:
            r7.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> Laa
            goto Laa
        L8b:
            r0 = move-exception
            r10 = r4
        L8d:
            boolean r3 = anet.channel.util.ALog.isPrintLog(r3)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto La0
            java.lang.String r3 = "awcn.SerializeHelper"
            java.lang.String r5 = "restore file fail."
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L9e
            anet.channel.util.ALog.m2531w(r3, r5, r4, r0, r6)     // Catch: java.lang.Throwable -> L9e
            goto La0
        L9e:
            r0 = move-exception
            goto Lac
        La0:
            if (r1 == 0) goto La7
            java.lang.String r3 = "SerializeHelper.restore()"
            r1.appendErrorTrace(r3, r0)     // Catch: java.lang.Throwable -> L9e
        La7:
            if (r7 == 0) goto Laa
            goto L87
        Laa:
            monitor-exit(r2)
            return r10
        Lac:
            if (r7 == 0) goto Lb1
            r7.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> Lb1
        Lb1:
            throw r0     // Catch: java.lang.Throwable -> Le
        Lb2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.restore(java.io.File, anet.channel.statist.StrategyStatObject):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[Catch: all -> 0x004c, TryCatch #5 {, blocks: (B:8:0x0011, B:12:0x0048, B:32:0x007c, B:34:0x0083, B:36:0x0095, B:38:0x009b, B:41:0x00c8, B:46:0x00d9, B:48:0x00dd, B:39:0x00bd, B:52:0x00ea, B:53:0x00ed, B:30:0x0078, B:54:0x00ee), top: B:70:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: all -> 0x004c, TryCatch #5 {, blocks: (B:8:0x0011, B:12:0x0048, B:32:0x007c, B:34:0x0083, B:36:0x0095, B:38:0x009b, B:41:0x00c8, B:46:0x00d9, B:48:0x00dd, B:39:0x00bd, B:52:0x00ea, B:53:0x00ed, B:30:0x0078, B:54:0x00ee), top: B:70:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void persist(java.io.Serializable r18, java.io.File r19, anet.channel.statist.StrategyStatObject r20) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.persist(java.io.Serializable, java.io.File, anet.channel.statist.StrategyStatObject):void");
    }
}
