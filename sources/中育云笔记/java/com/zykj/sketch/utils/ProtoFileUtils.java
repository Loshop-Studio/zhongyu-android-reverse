package com.zykj.sketch.utils;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.SketchHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class ProtoFileUtils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final byte[] readProtoFile(String path) throws IOException {
            AbstractC9979u.m20294g(path, "path");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(path + "/actions.bin"));
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return bArr;
            } catch (Exception e10) {
                System.out.println((Object) e10.getMessage());
                return new byte[0];
            }
        }

        public final void saveProtoFile(String path, EzyDrawBoard.DrawBoard drawBoard) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9979u.m20294g(path, "path");
            AbstractC9979u.m20294g(drawBoard, "drawBoard");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(path, "actions.bin");
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
                    drawBoard.writeTo(fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e11) {
                    fileOutputStream2 = fileOutputStream;
                    e = e11;
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

        public final void saveProtoFile(String path, SketchHeader.Header drawBoard) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9979u.m20294g(path, "path");
            AbstractC9979u.m20294g(drawBoard, "drawBoard");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(path, "header.bin");
                        if (!file2.exists()) {
                            file2.createNewFile();
                        } else {
                            file2.delete();
                        }
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    drawBoard.writeTo(fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e11) {
                    fileOutputStream2 = fileOutputStream;
                    e = e11;
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
    }
}
