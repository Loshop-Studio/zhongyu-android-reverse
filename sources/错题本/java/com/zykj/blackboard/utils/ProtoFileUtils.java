package com.zykj.blackboard.utils;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyHeader$Header;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/blackboard/utils/ProtoFileUtils;", "", "()V", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ProtoFileUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;", "", "<init>", "()V", "", "path", "fileName", "Lcom/zykj/board/EzyHeader$Header;", "header", "Ld6/s;", "createHeadFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyHeader$Header;)V", "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;", "snapshot", "createPageSnapshotFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V", "Landroid/graphics/Bitmap;", "bitmap", "createBitmapFile", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public final void createBitmapFile(@Nullable String path, @NotNull String fileName, @NotNull Bitmap bitmap) {
            FileOutputStream fileOutputStream;
            AbstractC5830k.m5330g(fileName, "fileName");
            AbstractC5830k.m5330g(bitmap, "bitmap");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, String.format(fileName, Arrays.copyOf(new Object[0], 0)));
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
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e4) {
                    e = e4;
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

        public final void createHeadFile(@NotNull String path, @NotNull String fileName, @NotNull EzyHeader$Header header) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC5830k.m5330g(path, "path");
            AbstractC5830k.m5330g(fileName, "fileName");
            AbstractC5830k.m5330g(header, "header");
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
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                header.writeTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e8) {
                fileOutputStream2 = fileOutputStream;
                e = e8;
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
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
        }

        public final void createPageSnapshotFile(@Nullable String path, @NotNull String fileName, @NotNull EzyPageSnapshot$PageSnapshot snapshot) {
            FileOutputStream fileOutputStream;
            AbstractC5830k.m5330g(fileName, "fileName");
            AbstractC5830k.m5330g(snapshot, "snapshot");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, String.format(fileName, Arrays.copyOf(new Object[0], 0)));
                        if (file2.exists()) {
                            file2.delete();
                        } else {
                            file2.createNewFile();
                        }
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                snapshot.writeTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e8) {
                e = e8;
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
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
        }

        private Companion() {
        }
    }
}
