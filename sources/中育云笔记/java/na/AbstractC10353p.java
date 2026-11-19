package na;

import android.graphics.Bitmap;
import com.zykj.board.EzyPageSnapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;

/* renamed from: na.p */
/* loaded from: classes5.dex */
public abstract class AbstractC10353p {

    /* renamed from: a */
    public static final a f24663a = new a(null);

    /* renamed from: na.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final void m21673a(String str, String fileName, Bitmap bitmap) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9979u.m20294g(fileName, "fileName");
            AbstractC9979u.m20294g(bitmap, "bitmap");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C9960c0 c9960c0 = C9960c0.f23411a;
                        String str2 = String.format(fileName, Arrays.copyOf(new Object[0], 0));
                        AbstractC9979u.m20293f(str2, "format(format, *args)");
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

        /* renamed from: b */
        public final void m21674b(String str, String fileName, EzyPageSnapshot.PageSnapshot snapshot) throws Throwable {
            FileOutputStream fileOutputStream;
            AbstractC9979u.m20294g(fileName, "fileName");
            AbstractC9979u.m20294g(snapshot, "snapshot");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C9960c0 c9960c0 = C9960c0.f23411a;
                        String str2 = String.format(fileName, Arrays.copyOf(new Object[0], 0));
                        AbstractC9979u.m20293f(str2, "format(format, *args)");
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

        public a() {
        }
    }
}
