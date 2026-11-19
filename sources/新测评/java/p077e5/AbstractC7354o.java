package p077e5;

import com.zykj.board.EzyPageSnapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: e5.o */
/* loaded from: classes4.dex */
public abstract class AbstractC7354o {

    /* renamed from: a */
    public static final a f11923a = new a(null);

    /* renamed from: e5.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m11785a(String str, String fileName, EzyPageSnapshot.PageSnapshot snapshot) throws Throwable {
            FileOutputStream fileOutputStream;
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format(fileName, Arrays.copyOf(new Object[0], 0));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
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
