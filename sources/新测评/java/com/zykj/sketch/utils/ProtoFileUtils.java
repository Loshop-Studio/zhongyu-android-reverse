package com.zykj.sketch.utils;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.SketchHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/sketch/utils/ProtoFileUtils;", "", "()V", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class ProtoFileUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000b¨\u0006\f"}, m13558d2 = {"Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;", "", "()V", "readProtoFile", "", "path", "", "saveProtoFile", "", "drawBoard", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "Lcom/zykj/sketch/SketchHeader$Header;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] readProtoFile(String path) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
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
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(drawBoard, "drawBoard");
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
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(drawBoard, "drawBoard");
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
