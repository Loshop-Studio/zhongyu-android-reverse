package p334s6;

import android.content.Context;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import p008a7.AbstractC0080m;

/* renamed from: s6.e */
/* loaded from: classes5.dex */
public abstract class AbstractC11077e {

    /* renamed from: s6.e$a */
    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isDirectory();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m24623a(android.content.Context r26, java.lang.String r27) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p334s6.AbstractC11077e.m24623a(android.content.Context, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: b */
    public static LocalMediaFolder m24624b(Context context, String str) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayListM24623a = m24623a(context, str);
        if (arrayListM24623a == null || arrayListM24623a.size() <= 0) {
            return null;
        }
        AbstractC0080m.m222d(arrayListM24623a);
        LocalMedia localMedia = (LocalMedia) arrayListM24623a.get(0);
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.m9420r(localMedia.m9400w());
        localMediaFolder.m9418p(localMedia.m9401x());
        localMediaFolder.m9419q(localMedia.m9397t());
        localMediaFolder.m9415m(localMedia.m9373h());
        localMediaFolder.m9421s(arrayListM24623a.size());
        localMediaFolder.m9417o(arrayListM24623a);
        return localMediaFolder;
    }
}
