package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9958b0;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    @Immutable
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    @Immutable
    public static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f10) {
            this.axisName = str;
            this.value = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return AbstractC9979u.m20289b(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    @Immutable
    public static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i10) {
            this.axisName = str;
            this.value = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return AbstractC9979u.m20289b(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    @Immutable
    public static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        public /* synthetic */ SettingTextUnit(String str, long j10, AbstractC9972n abstractC9972n) {
            this(str, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return AbstractC9979u.m20289b(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m33692equalsimpl0(this.value, settingTextUnit.value);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m33101getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m33696hashCodeimpl(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m33702toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return TextUnit.m33695getValueimpl(this.value) * density.getFontScale();
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            throw new KotlinNothingValueException();
        }

        private SettingTextUnit(String str, long j10) {
            this.axisName = str;
            this.value = j10;
            this.needsDensity = true;
        }
    }

    @Immutable
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                Object arrayList = linkedHashMap.get(axisName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(axisName, arrayList);
                }
                ((List) arrayList).add(setting);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + AbstractC10947g0.m23954w0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
                AbstractC10937b0.m23857B(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.settings = arrayList3;
            int size = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (((Setting) arrayList3.get(i10)).getNeedsDensity()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            this.needsDensity = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && AbstractC9979u.m20289b(this.settings, ((Settings) obj).settings);
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    public final Setting Setting(String str, float f10) {
        if (!(str.length() == 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new SettingFloat(str, f10);
    }

    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m33099Settings6EWAqTQ(FontWeight fontWeight, int i10, Setting... settingArr) {
        C9958b0 c9958b0 = new C9958b0(3);
        c9958b0.m20246a(weight(fontWeight.getWeight()));
        c9958b0.m20246a(italic(i10));
        c9958b0.m20247b(settingArr);
        return new Settings((Setting[]) c9958b0.m20249d(new Setting[c9958b0.m20248c()]));
    }

    public final Setting grade(int i10) {
        boolean z10 = false;
        if (-1000 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", i10);
    }

    public final Setting italic(float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + f10);
        }
        return new SettingFloat("ital", f10);
    }

    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m33100opticalSizingR2X_6o(long j10) {
        if (!TextUnit.m33698isSpimpl(j10)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", j10, null);
    }

    public final Setting slant(float f10) {
        boolean z10 = false;
        if (-90.0f <= f10 && f10 <= 90.0f) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + f10);
        }
        return new SettingFloat("slnt", f10);
    }

    public final Setting weight(int i10) {
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + i10);
        }
        return new SettingInt("wght", i10);
    }

    public final Setting width(float f10) {
        if (!(f10 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + f10);
        }
        return new SettingFloat("wdth", f10);
    }
}
