package p136ed;

import cd.AbstractC5423b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

/* renamed from: ed.e */
/* loaded from: classes6.dex */
public abstract class AbstractC9123e extends AbstractC9120b {
    /* renamed from: a */
    public static final List m17945a(Path path, String glob) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(path, "<this>");
        AbstractC9979u.m20294g(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamM17944a = AbstractC9122d.m17944a(directoryStreamNewDirectoryStream);
            AbstractC9979u.m20291d(directoryStreamM17944a);
            List listM23922X0 = AbstractC10947g0.m23922X0(directoryStreamM17944a);
            AbstractC5423b.m2902a(directoryStreamNewDirectoryStream, null);
            return listM23922X0;
        } finally {
        }
    }

    /* renamed from: b */
    public static /* synthetic */ List m17946b(Path path, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return m17945a(path, str);
    }
}
