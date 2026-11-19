package kotlin.p102io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p073h4.AbstractC5625a;
import p124n6.C6216a;
import p124n6.C6222g;
import p124n6.C6224i;
import p124n6.C6225j;
import p152r6.InterfaceC6473e;

/* renamed from: kotlin.io.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5818a extends AbstractC5625a {
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.io.b] */
    /* renamed from: u */
    public static boolean m5311u(File file, File file2) throws IOException {
        boolean zExists = file.exists();
        final C6225j c6225j = C6225j.f9964a;
        if (!zExists) {
            c6225j.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null));
            throw null;
        }
        try {
            C6224i c6224iM5316z = m5316z(file, FileWalkDirection.TOP_DOWN);
            C6222g c6222g = new C6222g(new C6224i(c6224iM5316z.f9961a, c6224iM5316z.f9962b, new InterfaceC6473e() { // from class: kotlin.io.b
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) throws TerminateException {
                    File f = (File) obj;
                    IOException e = (IOException) obj2;
                    AbstractC5830k.m5330g(f, "f");
                    AbstractC5830k.m5330g(e, "e");
                    if (c6225j.invoke(f, e) != OnErrorAction.TERMINATE) {
                        return C5443s.f8405a;
                    }
                    throw new TerminateException(f);
                }
            }));
            while (c6222g.hasNext()) {
                File file3 = (File) c6222g.next();
                if (!file3.exists()) {
                    c6225j.invoke(file3, new NoSuchFileException(file3, null, "The source file doesn't exist.", 2, null));
                    throw null;
                }
                File file4 = new File(file2, m5315y(file3, file));
                if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                    if (file4.isDirectory()) {
                        if (!m5313w(file4)) {
                            c6225j.invoke(file4, new FileAlreadyExistsException(file3, file4, "The destination file already exists."));
                            throw null;
                        }
                    } else if (!file4.delete()) {
                        c6225j.invoke(file4, new FileAlreadyExistsException(file3, file4, "The destination file already exists."));
                        throw null;
                    }
                }
                if (file3.isDirectory()) {
                    file4.mkdirs();
                } else {
                    m5312v(file3, file4);
                    if (file4.length() != file3.length()) {
                        c6225j.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    /* renamed from: v */
    public static void m5312v(File file, File file2) throws IOException {
        AbstractC5830k.m5330g(file, "<this>");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC0000a.m8i(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: w */
    public static boolean m5313w(File file) {
        C6222g c6222g = new C6222g(m5316z(file, FileWalkDirection.BOTTOM_UP));
        while (true) {
            boolean z8 = true;
            while (c6222g.hasNext()) {
                File file2 = (File) c6222g.next();
                if (!file2.delete() && file2.exists()) {
                    z8 = false;
                } else {
                    if (z8) {
                        break;
                    }
                    z8 = false;
                }
            }
            return z8;
        }
    }

    /* renamed from: x */
    public static final C6216a m5314x(C6216a c6216a) {
        File file = c6216a.f9945a;
        List<File> list = c6216a.f9946b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!AbstractC5830k.m5325b(name, ".")) {
                if (!AbstractC5830k.m5325b(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || AbstractC5830k.m5325b(((File) AbstractC5805t.m5235o0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new C6216a(file, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m5315y(java.io.File r10, java.io.File r11) {
        /*
            n6.a r0 = p073h4.AbstractC5625a.m4957q(r10)
            n6.a r0 = m5314x(r0)
            java.util.List r1 = r0.f9946b
            n6.a r2 = p073h4.AbstractC5625a.m4957q(r11)
            n6.a r2 = m5314x(r2)
            java.util.List r3 = r2.f9946b
            java.io.File r0 = r0.f9945a
            java.io.File r2 = r2.f9945a
            boolean r0 = r0.equals(r2)
            r2 = 0
            if (r0 != 0) goto L20
            goto L89
        L20:
            int r0 = r3.size()
            int r4 = r1.size()
            int r5 = java.lang.Math.min(r4, r0)
            r6 = 0
        L2d:
            if (r6 >= r5) goto L40
            java.lang.Object r7 = r1.get(r6)
            java.lang.Object r8 = r3.get(r6)
            boolean r7 = kotlin.jvm.internal.AbstractC5830k.m5325b(r7, r8)
            if (r7 == 0) goto L40
            int r6 = r6 + 1
            goto L2d
        L40:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r7 = r0 + (-1)
            if (r6 > r7) goto L6b
        L49:
            java.lang.Object r8 = r3.get(r7)
            java.io.File r8 = (java.io.File) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = ".."
            boolean r8 = kotlin.jvm.internal.AbstractC5830k.m5325b(r8, r9)
            if (r8 == 0) goto L5c
            goto L89
        L5c:
            r5.append(r9)
            if (r7 == r6) goto L66
            char r8 = java.io.File.separatorChar
            r5.append(r8)
        L66:
            if (r7 == r6) goto L6b
            int r7 = r7 + (-1)
            goto L49
        L6b:
            if (r6 >= r4) goto L85
            if (r6 >= r0) goto L74
            char r0 = java.io.File.separatorChar
            r5.append(r0)
        L74:
            java.util.List r0 = kotlin.collections.AbstractC5805t.m5225e0(r1, r6)
            java.lang.String r1 = java.io.File.separator
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r1, r3)
            r3 = 124(0x7c, float:1.74E-43)
            kotlin.collections.AbstractC5805t.m5233m0(r0, r5, r1, r2, r3)
        L85:
            java.lang.String r2 = r5.toString()
        L89:
            if (r2 == 0) goto L8c
            return r2
        L8c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "this and base files have different roots: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = " and "
            r1.append(r10)
            r1.append(r11)
            r10 = 46
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p102io.AbstractC5818a.m5315y(java.io.File, java.io.File):java.lang.String");
    }

    /* renamed from: z */
    public static final C6224i m5316z(File file, FileWalkDirection direction) {
        AbstractC5830k.m5330g(direction, "direction");
        return new C6224i(file, direction, null);
    }
}
