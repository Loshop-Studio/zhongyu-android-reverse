package com.zykj.view.utils;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C3392l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/view/utils/LatestColorManager;", "", "<init>", "()V", "", TypedValues.Custom.S_COLOR, "Ld6/s;", "putNewColor", "(I)V", "", LatestColorManager.LATEST_COLOR_LIST, "Ljava/lang/String;", "Lcom/blankj/utilcode/util/l;", "getSpUtils", "()Lcom/blankj/utilcode/util/l;", "spUtils", "", "value", "getSpLatestColorList", "()Ljava/util/List;", "setSpLatestColorList", "(Ljava/util/List;)V", "spLatestColorList", "getLatestColorList", "latestColorList", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLatestColorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LatestColorManager.kt\ncom/zykj/view/utils/LatestColorManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1#2:48\n1563#3:49\n1634#3,3:50\n1869#3,2:53\n1869#3,2:55\n*S KotlinDebug\n*F\n+ 1 LatestColorManager.kt\ncom/zykj/view/utils/LatestColorManager\n*L\n16#1:49\n16#1:50,3\n22#1:53,2\n40#1:55,2\n*E\n"})
/* loaded from: classes3.dex */
public final class LatestColorManager {

    @NotNull
    public static final LatestColorManager INSTANCE = new LatestColorManager();

    @NotNull
    private static final String LATEST_COLOR_LIST = "LATEST_COLOR_LIST";

    private LatestColorManager() {
    }

    private final List<Integer> getSpLatestColorList() {
        String string = getSpUtils().f2169a.getString(LATEST_COLOR_LIST, "");
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                List listM5394b0 = AbstractC5855p.m5394b0(string, new String[]{"+"});
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5394b0, 10));
                Iterator it = listM5394b0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                }
                return arrayList;
            }
        }
        return EmptyList.INSTANCE;
    }

    private final C3392l getSpUtils() {
        return C3392l.m2345a("VIEW");
    }

    private final void setSpLatestColorList(List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(((Number) it.next()).intValue()));
            stringBuffer.append("+");
        }
        getSpUtils().f2169a.edit().putString(LATEST_COLOR_LIST, AbstractC5855p.m5389W(stringBuffer).toString()).apply();
    }

    @NotNull
    public final List<Integer> getLatestColorList() {
        return getSpLatestColorList();
    }

    public final void putNewColor(int color) {
        if (CustomColorManager.INSTANCE.isColorExist(color)) {
            List<Integer> spLatestColorList = getSpLatestColorList();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(color));
            Iterator<T> it = spLatestColorList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue != color && arrayList.size() < 13) {
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
            setSpLatestColorList(arrayList);
        }
    }
}
