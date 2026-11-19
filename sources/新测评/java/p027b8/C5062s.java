package p027b8;

import com.blankj.utilcode.util.SPUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: b8.s */
/* loaded from: classes5.dex */
public final class C5062s {

    /* renamed from: a */
    public static final C5062s f2627a = new C5062s();

    /* renamed from: a */
    public final List m2570a() {
        return m2571b();
    }

    /* renamed from: b */
    public final List m2571b() {
        List listSplit$default;
        String string = m2572c().getString("LATEST_COLOR_LIST");
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            String str = string;
            if (str != null && (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"+"}, false, 0, 6, (Object) null)) != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* renamed from: c */
    public final SPUtils m2572c() {
        SPUtils sPUtils = SPUtils.getInstance("VIEW");
        Intrinsics.checkNotNullExpressionValue(sPUtils, "getInstance(...)");
        return sPUtils;
    }

    /* renamed from: d */
    public final void m2573d(int i10) {
        if (C5045b.f2579a.m2522b(i10)) {
            List listM2571b = m2571b();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i10));
            Iterator it = listM2571b.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue != i10 && arrayList.size() < 13) {
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
            m2574e(arrayList);
        }
    }

    /* renamed from: e */
    public final void m2574e(List list) {
        if (list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(((Number) it.next()).intValue()));
            stringBuffer.append("+");
        }
        m2572c().put("LATEST_COLOR_LIST", StringsKt.removeSuffix(stringBuffer, "+").toString());
    }
}
