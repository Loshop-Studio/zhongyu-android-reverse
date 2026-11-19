package p101g7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: g7.j */
/* loaded from: classes4.dex */
public final class C7594j {

    /* renamed from: a */
    public static final C7594j f12739a = new C7594j();

    /* renamed from: a */
    public final boolean m12484a(String version, boolean z9) {
        Intrinsics.checkNotNullParameter(version, "version");
        return m12485b(version, z9 ? "0.10.18" : "0.10.19") >= 0;
    }

    /* renamed from: b */
    public final int m12485b(String old, String str) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(str, "new");
        List listSplit$default = StringsKt.split$default((CharSequence) old, new String[]{"."}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        int iMin = Math.min(listSplit$default.size(), listSplit$default2.size());
        int iCompare = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = Integer.parseInt((String) listSplit$default.get(i10));
            int i12 = Integer.parseInt((String) listSplit$default2.get(i10));
            if (iCompare == 0) {
                iCompare = Intrinsics.compare(i11, i12);
            }
            if (iCompare != 0) {
                break;
            }
        }
        return iCompare != 0 ? iCompare : listSplit$default.size() - listSplit$default2.size();
    }
}
