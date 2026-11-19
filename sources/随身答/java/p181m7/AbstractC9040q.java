package p181m7;

import com.blankj.utilcode.util.SPUtils;
import com.zykj.blackboard.enums.SelectGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: m7.q */
/* loaded from: classes5.dex */
public abstract class AbstractC9040q {
    /* renamed from: a */
    public static final Integer m14431a() {
        if (m14441k().contains("BACKGROUND_COLOR_INT")) {
            return Integer.valueOf(m14441k().getInt("BACKGROUND_COLOR_INT"));
        }
        return null;
    }

    /* renamed from: b */
    public static final Float m14432b() {
        if (m14441k().contains("ERASER_SIZE_FLOAT")) {
            return Float.valueOf(m14441k().getFloat("ERASER_SIZE_FLOAT"));
        }
        return null;
    }

    /* renamed from: c */
    public static final Integer m14433c() {
        if (m14441k().contains("GEOMETRY_COLOR_INT")) {
            return Integer.valueOf(m14441k().getInt("GEOMETRY_COLOR_INT"));
        }
        return null;
    }

    /* renamed from: d */
    public static final Integer m14434d() {
        if (m14441k().contains("PEN_COLOR")) {
            return Integer.valueOf(m14441k().getInt("PEN_COLOR"));
        }
        return null;
    }

    /* renamed from: e */
    public static final Integer m14435e() {
        if (m14441k().contains("PEN_SIZE_LEVEL")) {
            return Integer.valueOf(m14441k().getInt("PEN_SIZE_LEVEL"));
        }
        return null;
    }

    /* renamed from: f */
    public static final Integer m14436f() {
        if (m14441k().contains("PEN_TYPE_LEVEL")) {
            return Integer.valueOf(m14441k().getInt("PEN_TYPE_LEVEL"));
        }
        return null;
    }

    /* renamed from: g */
    public static final List m14437g() {
        String string;
        List listSplit$default;
        if (m14441k().contains("SELECT_GRAPH_ENUM_LIST") && (string = m14441k().getString("SELECT_GRAPH_ENUM_LIST")) != null) {
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
    public static final Integer m14438h() {
        if (m14441k().contains("TEXT_COLOR")) {
            return Integer.valueOf(m14441k().getInt("TEXT_COLOR"));
        }
        return null;
    }

    /* renamed from: i */
    public static final Float m14439i() {
        if (m14441k().contains("TEXT_SIZE")) {
            return Float.valueOf(m14441k().getFloat("TEXT_SIZE"));
        }
        return null;
    }

    /* renamed from: j */
    public static final Boolean m14440j() {
        if (m14441k().contains("IS_TOUCHABLE")) {
            return Boolean.valueOf(m14441k().getBoolean("IS_TOUCHABLE"));
        }
        return null;
    }

    /* renamed from: k */
    public static final SPUtils m14441k() {
        SPUtils sPUtils = SPUtils.getInstance("VIEW");
        Intrinsics.checkNotNullExpressionValue(sPUtils, "getInstance(...)");
        return sPUtils;
    }

    /* renamed from: l */
    public static final void m14442l(Integer num) {
        if (num != null) {
            m14441k().put("BACKGROUND_COLOR_INT", num.intValue());
        }
    }

    /* renamed from: m */
    public static final void m14443m(Float f10) {
        if (f10 != null) {
            m14441k().put("ERASER_SIZE_FLOAT", f10.floatValue());
        }
    }

    /* renamed from: n */
    public static final void m14444n(Integer num) {
        if (num != null) {
            m14441k().put("GEOMETRY_COLOR_INT", num.intValue());
        }
    }

    /* renamed from: o */
    public static final void m14445o(Integer num) {
        if (num != null) {
            m14441k().put("PEN_COLOR", num.intValue());
        }
    }

    /* renamed from: p */
    public static final void m14446p(Integer num) {
        if (num != null) {
            m14441k().put("PEN_SIZE_LEVEL", num.intValue());
        }
    }

    /* renamed from: q */
    public static final void m14447q(Integer num) {
        if (num != null) {
            m14441k().put("PEN_TYPE_LEVEL", num.intValue());
        }
    }

    /* renamed from: r */
    public static final void m14448r(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((SelectGraphEnum) it.next()).name());
            stringBuffer.append("+");
        }
        m14441k().put("SELECT_GRAPH_ENUM_LIST", StringsKt.removeSuffix(stringBuffer, "+").toString());
    }

    /* renamed from: s */
    public static final void m14449s(Integer num) {
        if (num != null) {
            m14441k().put("TEXT_COLOR", num.intValue());
        }
    }

    /* renamed from: t */
    public static final void m14450t(Float f10) {
        if (f10 != null) {
            m14441k().put("TEXT_SIZE", f10.floatValue());
        }
    }

    /* renamed from: u */
    public static final void m14451u(Boolean bool) {
        if (bool != null) {
            m14441k().put("IS_TOUCHABLE", bool.booleanValue());
        }
    }
}
