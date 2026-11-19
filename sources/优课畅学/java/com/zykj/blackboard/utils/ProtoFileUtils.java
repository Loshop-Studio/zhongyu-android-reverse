package com.zykj.blackboard.utils;

import android.graphics.Bitmap;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyPageSnapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;

/* loaded from: classes4.dex */
public final class ProtoFileUtils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final void createBitmapFile(String str, String fileName, Bitmap bitmap) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9133u.m16133g(fileName, "fileName");
            AbstractC9133u.m16133g(bitmap, "bitmap");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C9114c0 c9114c0 = C9114c0.f17482a;
                        String str2 = String.format(fileName, Arrays.copyOf(new Object[0], 0));
                        AbstractC9133u.m16132f(str2, "format(format, *args)");
                        File file2 = new File(file, str2);
                        if (file2.exists()) {
                            file2.delete();
                        } else {
                            file2.createNewFile();
                        }
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e12) {
                e = e12;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        }

        public final void createHeadFile(String path, String fileName, EzyHeader.Header header) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9133u.m16133g(path, "path");
            AbstractC9133u.m16133g(fileName, "fileName");
            AbstractC9133u.m16133g(header, "header");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(path, fileName);
                        if (file2.exists()) {
                            file2.delete();
                        } else {
                            file2.createNewFile();
                        }
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                header.writeTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e12) {
                fileOutputStream2 = fileOutputStream;
                e = e12;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                fileOutputStream2 = fileOutputStream;
                th = th2;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        }

        public final void createPageSnapshotFile(String str, String fileName, EzyPageSnapshot.PageSnapshot snapshot) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9133u.m16133g(fileName, "fileName");
            AbstractC9133u.m16133g(snapshot, "snapshot");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C9114c0 c9114c0 = C9114c0.f17482a;
                        String str2 = String.format(fileName, Arrays.copyOf(new Object[0], 0));
                        AbstractC9133u.m16132f(str2, "format(format, *args)");
                        File file2 = new File(file, str2);
                        if (file2.exists()) {
                            file2.delete();
                        } else {
                            file2.createNewFile();
                        }
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    snapshot.writeTo(fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        }

        private Companion() {
        }
    }
}
