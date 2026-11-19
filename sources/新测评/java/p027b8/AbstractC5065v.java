package p027b8;

import com.blankj.utilcode.util.SPUtils;
import com.zykj.blackboard.enums.SelectGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: b8.v */
/* loaded from: classes5.dex */
public abstract class AbstractC5065v {
    /* renamed from: a */
    public static final Integer m2582a() {
        if (m2592k().contains("BACKGROUND_COLOR_INT")) {
            return Integer.valueOf(m2592k().getInt("BACKGROUND_COLOR_INT"));
        }
        return null;
    }

    /* renamed from: b */
    public static final Float m2583b() {
        if (m2592k().contains("ERASER_SIZE_FLOAT")) {
            return Float.valueOf(m2592k().getFloat("ERASER_SIZE_FLOAT"));
        }
        return null;
    }

    /* renamed from: c */
    public static final Integer m2584c() {
        if (m2592k().contains("GEOMETRY_COLOR_INT")) {
            return Integer.valueOf(m2592k().getInt("GEOMETRY_COLOR_INT"));
        }
        return null;
    }

    /* renamed from: d */
    public static final Integer m2585d() {
        if (m2592k().contains("PEN_COLOR")) {
            return Integer.valueOf(m2592k().getInt("PEN_COLOR"));
        }
        return null;
    }

    /* renamed from: e */
    public static final Integer m2586e() {
        if (m2592k().contains("PEN_SIZE_LEVEL")) {
            return Integer.valueOf(m2592k().getInt("PEN_SIZE_LEVEL"));
        }
        return null;
    }

    /* renamed from: f */
    public static final Integer m2587f() {
        if (m2592k().contains("PEN_TYPE_LEVEL")) {
            return Integer.valueOf(m2592k().getInt("PEN_TYPE_LEVEL"));
        }
        return null;
    }

    /* renamed from: g */
    public static final List m2588g() {
        String string;
        List listSplit$default;
        if (m2592k().contains("SELECT_GRAPH_ENUM_LIST") && (string = m2592k().getString("SELECT_GRAPH_ENUM_LIST")) != null) {
            String str = string.length() > 0 ? string : null;
            if (str != null && (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"+"}, false, 0, 6, (Object) null)) != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(SelectGraphEnum.valueOf((String) it.next()));
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final Integer m2589h() {
        if (m2592k().contains("TEXT_COLOR")) {
            return Integer.valueOf(m2592k().getInt("TEXT_COLOR"));
        }
        return null;
    }

    /* renamed from: i */
    public static final Float m2590i() {
        if (m2592k().contains("TEXT_SIZE")) {
            return Float.valueOf(m2592k().getFloat("TEXT_SIZE"));
        }
        return null;
    }

    /* renamed from: j */
    public static final Boolean m2591j() {
        if (m2592k().contains("IS_TOUCHABLE")) {
            return Boolean.valueOf(m2592k().getBoolean("IS_TOUCHABLE"));
        }
        return null;
    }

    /* renamed from: k */
    public static final SPUtils m2592k() {
        SPUtils sPUtils = SPUtils.getInstance("VIEW");
        Intrinsics.checkNotNullExpressionValue(sPUtils, "getInstance(...)");
        return sPUtils;
    }

    /* renamed from: l */
    public static final void m2593l(Integer num) {
        if (num != null) {
            m2592k().put("BACKGROUND_COLOR_INT", num.intValue());
        }
    }

    /* renamed from: m */
    public static final void m2594m(Float f10) {
        if (f10 != null) {
            m2592k().put("ERASER_SIZE_FLOAT", f10.floatValue());
        }
    }

    /* renamed from: n */
    public static final void m2595n(Integer num) {
        if (num != null) {
            m2592k().put("GEOMETRY_COLOR_INT", num.intValue());
        }
    }

    /* renamed from: o */
    public static final void m2596o(Integer num) {
        if (num != null) {
            m2592k().put("PEN_COLOR", num.intValue());
        }
    }

    /* renamed from: p */
    public static final void m2597p(Integer num) {
        if (num != null) {
            m2592k().put("PEN_SIZE_LEVEL", num.intValue());
        }
    }

    /* renamed from: q */
    public static final void m2598q(Integer num) {
        if (num != null) {
            m2592k().put("PEN_TYPE_LEVEL", num.intValue());
        }
    }

    /* renamed from: r */
    public static final void m2599r(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((SelectGraphEnum) it.next()).name());
            stringBuffer.append("+");
        }
        m2592k().put("SELECT_GRAPH_ENUM_LIST", StringsKt.removeSuffix(stringBuffer, "+").toString());
    }

    /* renamed from: s */
    public static final void m2600s(Integer num) {
        if (num != null) {
            m2592k().put("TEXT_COLOR", num.intValue());
        }
    }

    /* renamed from: t */
    public static final void m2601t(Float f10) {
        if (f10 != null) {
            m2592k().put("TEXT_SIZE", f10.floatValue());
        }
    }

    /* renamed from: u */
    public static final void m2602u(Boolean bool) {
        if (bool != null) {
            m2592k().put("IS_TOUCHABLE", bool.booleanValue());
        }
    }
}
