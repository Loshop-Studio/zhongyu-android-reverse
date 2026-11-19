package com.zykj.sketch.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.SketchHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/sketch/utils/ProtoFileUtils;", "", "()V", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ProtoFileUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;", "", "<init>", "()V", "", "path", "", "readProtoFile", "(Ljava/lang/String;)[B", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "drawBoard", "Ld6/s;", "saveProtoFile", "(Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;)V", "Lcom/zykj/sketch/SketchHeader$Header;", "(Ljava/lang/String;Lcom/zykj/sketch/SketchHeader$Header;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final byte[] readProtoFile(@NotNull String path) throws IOException {
            AbstractC5830k.m5330g(path, "path");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(path.concat("/actions.bin")));
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return bArr;
            } catch (Exception e) {
                System.out.println((Object) e.getMessage());
                return new byte[0];
            }
        }

        public final void saveProtoFile(@NotNull String path, @NotNull EzyDrawBoard.DrawBoard drawBoard) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC5830k.m5330g(path, "path");
            AbstractC5830k.m5330g(drawBoard, "drawBoard");
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
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    drawBoard.writeTo(fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e4) {
                    fileOutputStream2 = fileOutputStream;
                    e = e4;
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
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }

        private Companion() {
        }

        public final void saveProtoFile(@NotNull String path, @NotNull SketchHeader.Header drawBoard) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC5830k.m5330g(path, "path");
            AbstractC5830k.m5330g(drawBoard, "drawBoard");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(path, SourceSave.HEADER_FILE_NAME);
                        if (!file2.exists()) {
                            file2.createNewFile();
                        } else {
                            file2.delete();
                        }
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    drawBoard.writeTo(fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e4) {
                    fileOutputStream2 = fileOutputStream;
                    e = e4;
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
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
    }
}
