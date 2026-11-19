package p267u7;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import org.slf4j.Marker;
import p134i7.AbstractC8778f0;
import p256t7.AbstractC10117b;

/* renamed from: u7.e */
/* loaded from: classes5.dex */
public abstract class AbstractC10204e extends AbstractC10201b {
    /* renamed from: a */
    public static final List m19073a(Path path, String glob) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(path, "<this>");
        AbstractC9133u.m16133g(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamM19072a = AbstractC10203d.m19072a(directoryStreamNewDirectoryStream);
            AbstractC9133u.m16130d(directoryStreamM19072a);
            List listM14544U0 = AbstractC8778f0.m14544U0(directoryStreamM19072a);
            AbstractC10117b.m18861a(directoryStreamNewDirectoryStream, null);
            return listM14544U0;
        } finally {
        }
    }

    /* renamed from: b */
    public static /* synthetic */ List m19074b(Path path, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = Marker.ANY_MARKER;
        }
        return m19073a(path, str);
    }
}
