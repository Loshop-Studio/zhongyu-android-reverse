package p181m7;

import com.blankj.utilcode.util.SPUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: m7.p */
/* loaded from: classes5.dex */
public final class C9039p {

    /* renamed from: a */
    public static final C9039p f15219a = new C9039p();

    /* renamed from: a */
    public final List m14426a() {
        return m14427b();
    }

    /* renamed from: b */
    public final List m14427b() {
        List listSplit$default;
        String string = m14428c().getString("LATEST_COLOR_LIST");
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
    public final SPUtils m14428c() {
        SPUtils sPUtils = SPUtils.getInstance("VIEW");
        Intrinsics.checkNotNullExpressionValue(sPUtils, "getInstance(...)");
        return sPUtils;
    }

    /* renamed from: d */
    public final void m14429d(int i9) {
        if (C9025b.f15177a.m14385b(i9)) {
            List listM14427b = m14427b();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i9));
            Iterator it = listM14427b.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue != i9 && arrayList.size() < 13) {
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
            m14430e(arrayList);
        }
    }

    /* renamed from: e */
    public final void m14430e(List list) {
        if (list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(((Number) it.next()).intValue()));
            stringBuffer.append("+");
        }
        m14428c().put("LATEST_COLOR_LIST", StringsKt.removeSuffix(stringBuffer, "+").toString());
    }
}
