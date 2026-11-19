package p310z2;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: z2.b */
/* loaded from: classes4.dex */
public class C9991b {

    /* renamed from: a */
    public final Object f17988a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.channels.FileLock m17309e(java.lang.String r3) throws java.io.IOException {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L15 java.io.FileNotFoundException -> L18
            java.lang.String r2 = "rw"
            r1.<init>(r3, r2)     // Catch: java.io.IOException -> L15 java.io.FileNotFoundException -> L18
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.io.IOException -> L15 java.io.FileNotFoundException -> L18
            java.nio.channels.FileLock r3 = r3.lock()     // Catch: java.io.IOException -> L11 java.io.FileNotFoundException -> L13
            return r3
        L11:
            r1 = move-exception
            goto L1b
        L13:
            r1 = move-exception
            goto L1f
        L15:
            r1 = move-exception
            r3 = r0
            goto L1b
        L18:
            r1 = move-exception
            r3 = r0
            goto L1f
        L1b:
            r1.printStackTrace()
            goto L22
        L1f:
            r1.printStackTrace()
        L22:
            if (r3 == 0) goto L2c
            r3.close()     // Catch: java.io.IOException -> L28
            goto L2c
        L28:
            r3 = move-exception
            r3.printStackTrace()
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p310z2.C9991b.m17309e(java.lang.String):java.nio.channels.FileLock");
    }

    /* renamed from: a */
    public void m17310a(File file, InterfaceC9990a interfaceC9990a) {
        if (file.exists()) {
            synchronized (this.f17988a) {
                FileLock fileLockM17309e = m17309e(file.getAbsolutePath());
                if (fileLockM17309e != null) {
                    try {
                        try {
                            interfaceC9990a.mo6244a(file.getName());
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            try {
                                fileLockM17309e.release();
                                fileLockM17309e.channel().close();
                            } catch (IOException e11) {
                                e = e11;
                                e.printStackTrace();
                            }
                        }
                        try {
                            fileLockM17309e.release();
                            fileLockM17309e.channel().close();
                        } catch (IOException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m17311b(File file, InterfaceC9990a interfaceC9990a, int i9) {
        if (file.exists()) {
            synchronized (this.f17988a) {
                FileLock fileLockM17309e = m17309e(file.getAbsolutePath());
                if (fileLockM17309e != null) {
                    try {
                        try {
                            interfaceC9990a.mo6246e(file, i9);
                            try {
                                fileLockM17309e.release();
                                fileLockM17309e.channel().close();
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            try {
                                fileLockM17309e.release();
                                fileLockM17309e.channel().close();
                            } catch (Throwable th2) {
                                th = th2;
                                th.printStackTrace();
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m17312c(File file, InterfaceC9990a interfaceC9990a, Object obj) {
        if (file.exists()) {
            synchronized (this.f17988a) {
                FileLock fileLockM17309e = m17309e(file.getAbsolutePath());
                if (fileLockM17309e != null) {
                    try {
                        try {
                            interfaceC9990a.mo6245c(file.getName(), obj);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            try {
                                fileLockM17309e.release();
                                fileLockM17309e.channel().close();
                            } catch (IOException e11) {
                                e = e11;
                                e.printStackTrace();
                            }
                        }
                        try {
                            fileLockM17309e.release();
                            fileLockM17309e.channel().close();
                        } catch (IOException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m17313d(String str, InterfaceC9990a interfaceC9990a) {
        File file = new File(str);
        if (file.exists()) {
            synchronized (this.f17988a) {
                FileLock fileLockM17309e = m17309e(str);
                if (fileLockM17309e != null) {
                    try {
                        try {
                            interfaceC9990a.mo6244a(file.getName());
                            try {
                                fileLockM17309e.release();
                                fileLockM17309e.channel().close();
                            } catch (IOException e10) {
                                e = e10;
                                e.printStackTrace();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            try {
                                fileLockM17309e.release();
                                fileLockM17309e.channel().close();
                            } catch (IOException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
