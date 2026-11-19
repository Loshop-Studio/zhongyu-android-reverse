package p008a7;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: a7.m */
/* loaded from: classes5.dex */
public abstract class AbstractC0080m {
    /* renamed from: a */
    public static /* synthetic */ int m219a(LocalMediaFolder localMediaFolder, LocalMediaFolder localMediaFolder2) {
        if (localMediaFolder.m9408c() == null || localMediaFolder2.m9408c() == null) {
            return 0;
        }
        return Integer.compare(localMediaFolder2.m9412j(), localMediaFolder.m9412j());
    }

    /* renamed from: c */
    public static void m221c(List list) {
        Collections.sort(list, new Comparator() { // from class: a7.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC0080m.m219a((LocalMediaFolder) obj, (LocalMediaFolder) obj2);
            }
        });
    }

    /* renamed from: d */
    public static void m222d(List list) {
        Collections.sort(list, new Comparator() { // from class: a7.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((LocalMedia) obj2).m9387o(), ((LocalMedia) obj).m9387o());
            }
        });
    }
}
