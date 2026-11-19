package com.zykj.view.utils;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C3392l;
import com.zykj.blackboard.enums.SelectGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"(\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\"(\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b\"(\u0010\"\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b\"(\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"(\u0010+\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'\"(\u0010.\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001b\"(\u00101\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001b\"(\u00104\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001b\"4\u0010;\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001052\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, m5110d2 = {"", SPDataKt.IS_TOUCHABLE, "Ljava/lang/String;", SPDataKt.PEN_TYPE_LEVEL, SPDataKt.PEN_COLOR, SPDataKt.PEN_SIZE_LEVEL, "ERASER_SIZE", SPDataKt.TEXT_SIZE, SPDataKt.TEXT_COLOR, "GEOMETRY_COLOR", "BACKGROUND_COLOR", SPDataKt.SELECT_GRAPH_ENUM_LIST, "Lcom/blankj/utilcode/util/l;", "getSpUtils", "()Lcom/blankj/utilcode/util/l;", "spUtils", "", "value", "getSpTouchable", "()Ljava/lang/Boolean;", "setSpTouchable", "(Ljava/lang/Boolean;)V", "spTouchable", "", "getSpPenTypeLevel", "()Ljava/lang/Integer;", "setSpPenTypeLevel", "(Ljava/lang/Integer;)V", "spPenTypeLevel", "getSpPenColor", "setSpPenColor", "spPenColor", "getSpPenSizeLevel", "setSpPenSizeLevel", "spPenSizeLevel", "", "getSpEraserSize", "()Ljava/lang/Float;", "setSpEraserSize", "(Ljava/lang/Float;)V", "spEraserSize", "getSpTextSize", "setSpTextSize", "spTextSize", "getSpTextColor", "setSpTextColor", "spTextColor", "getSpGeometryColor", "setSpGeometryColor", "spGeometryColor", "getSpBackgroundColor", "setSpBackgroundColor", "spBackgroundColor", "", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "getSpSelectGraphEnum", "()Ljava/util/List;", "setSpSelectGraphEnum", "(Ljava/util/List;)V", "spSelectGraphEnum", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSPData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SPData.kt\ncom/zykj/view/utils/SPDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1#2:108\n1563#3:109\n1634#3,3:110\n1869#3,2:113\n*S KotlinDebug\n*F\n+ 1 SPData.kt\ncom/zykj/view/utils/SPDataKt\n*L\n93#1:109\n93#1:110,3\n101#1:113,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SPDataKt {

    @NotNull
    public static final String BACKGROUND_COLOR = "BACKGROUND_COLOR_INT";

    @NotNull
    public static final String ERASER_SIZE = "ERASER_SIZE_FLOAT";

    @NotNull
    public static final String GEOMETRY_COLOR = "GEOMETRY_COLOR_INT";

    @NotNull
    public static final String IS_TOUCHABLE = "IS_TOUCHABLE";

    @NotNull
    public static final String PEN_COLOR = "PEN_COLOR";

    @NotNull
    public static final String PEN_SIZE_LEVEL = "PEN_SIZE_LEVEL";

    @NotNull
    public static final String PEN_TYPE_LEVEL = "PEN_TYPE_LEVEL";

    @NotNull
    public static final String SELECT_GRAPH_ENUM_LIST = "SELECT_GRAPH_ENUM_LIST";

    @NotNull
    public static final String TEXT_COLOR = "TEXT_COLOR";

    @NotNull
    public static final String TEXT_SIZE = "TEXT_SIZE";

    @Nullable
    public static final Integer getSpBackgroundColor() {
        if (getSpUtils().f2169a.contains(BACKGROUND_COLOR)) {
            return Integer.valueOf(getSpUtils().m2346b(BACKGROUND_COLOR));
        }
        return null;
    }

    @Nullable
    public static final Float getSpEraserSize() {
        if (getSpUtils().f2169a.contains(ERASER_SIZE)) {
            return Float.valueOf(getSpUtils().f2169a.getFloat(ERASER_SIZE, -1.0f));
        }
        return null;
    }

    @Nullable
    public static final Integer getSpGeometryColor() {
        if (getSpUtils().f2169a.contains(GEOMETRY_COLOR)) {
            return Integer.valueOf(getSpUtils().m2346b(GEOMETRY_COLOR));
        }
        return null;
    }

    @Nullable
    public static final Integer getSpPenColor() {
        if (getSpUtils().f2169a.contains(PEN_COLOR)) {
            return Integer.valueOf(getSpUtils().m2346b(PEN_COLOR));
        }
        return null;
    }

    @Nullable
    public static final Integer getSpPenSizeLevel() {
        if (getSpUtils().f2169a.contains(PEN_SIZE_LEVEL)) {
            return Integer.valueOf(getSpUtils().m2346b(PEN_SIZE_LEVEL));
        }
        return null;
    }

    @Nullable
    public static final Integer getSpPenTypeLevel() {
        if (getSpUtils().f2169a.contains(PEN_TYPE_LEVEL)) {
            return Integer.valueOf(getSpUtils().m2346b(PEN_TYPE_LEVEL));
        }
        return null;
    }

    @Nullable
    public static final List<SelectGraphEnum> getSpSelectGraphEnum() {
        String string;
        if (getSpUtils().f2169a.contains(SELECT_GRAPH_ENUM_LIST) && (string = getSpUtils().f2169a.getString(SELECT_GRAPH_ENUM_LIST, "")) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                List listM5394b0 = AbstractC5855p.m5394b0(string, new String[]{"+"});
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5394b0, 10));
                Iterator it = listM5394b0.iterator();
                while (it.hasNext()) {
                    arrayList.add(SelectGraphEnum.valueOf((String) it.next()));
                }
                return arrayList;
            }
        }
        return null;
    }

    @Nullable
    public static final Integer getSpTextColor() {
        if (getSpUtils().f2169a.contains(TEXT_COLOR)) {
            return Integer.valueOf(getSpUtils().m2346b(TEXT_COLOR));
        }
        return null;
    }

    @Nullable
    public static final Float getSpTextSize() {
        if (getSpUtils().f2169a.contains(TEXT_SIZE)) {
            return Float.valueOf(getSpUtils().f2169a.getFloat(TEXT_SIZE, -1.0f));
        }
        return null;
    }

    @Nullable
    public static final Boolean getSpTouchable() {
        if (getSpUtils().f2169a.contains(IS_TOUCHABLE)) {
            return Boolean.valueOf(getSpUtils().f2169a.getBoolean(IS_TOUCHABLE, false));
        }
        return null;
    }

    private static final C3392l getSpUtils() {
        return C3392l.m2345a("VIEW");
    }

    public static final void setSpBackgroundColor(@Nullable Integer num) {
        if (num != null) {
            getSpUtils().m2347c(BACKGROUND_COLOR, num.intValue());
        }
    }

    public static final void setSpEraserSize(@Nullable Float f) {
        if (f != null) {
            getSpUtils().f2169a.edit().putFloat(ERASER_SIZE, f.floatValue()).apply();
        }
    }

    public static final void setSpGeometryColor(@Nullable Integer num) {
        if (num != null) {
            getSpUtils().m2347c(GEOMETRY_COLOR, num.intValue());
        }
    }

    public static final void setSpPenColor(@Nullable Integer num) {
        if (num != null) {
            getSpUtils().m2347c(PEN_COLOR, num.intValue());
        }
    }

    public static final void setSpPenSizeLevel(@Nullable Integer num) {
        if (num != null) {
            getSpUtils().m2347c(PEN_SIZE_LEVEL, num.intValue());
        }
    }

    public static final void setSpPenTypeLevel(@Nullable Integer num) {
        if (num != null) {
            getSpUtils().m2347c(PEN_TYPE_LEVEL, num.intValue());
        }
    }

    public static final void setSpSelectGraphEnum(@Nullable List<? extends SelectGraphEnum> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((SelectGraphEnum) it.next()).name());
            stringBuffer.append("+");
        }
        getSpUtils().f2169a.edit().putString(SELECT_GRAPH_ENUM_LIST, AbstractC5855p.m5389W(stringBuffer).toString()).apply();
    }

    public static final void setSpTextColor(@Nullable Integer num) {
        if (num != null) {
            getSpUtils().m2347c(TEXT_COLOR, num.intValue());
        }
    }

    public static final void setSpTextSize(@Nullable Float f) {
        if (f != null) {
            getSpUtils().f2169a.edit().putFloat(TEXT_SIZE, f.floatValue()).apply();
        }
    }

    public static final void setSpTouchable(@Nullable Boolean bool) {
        if (bool != null) {
            getSpUtils().f2169a.edit().putBoolean(IS_TOUCHABLE, bool.booleanValue()).apply();
        }
    }
}
