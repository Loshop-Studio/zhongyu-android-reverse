package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13558d2 = {"Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", "Width", "Height", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class IntrinsicWidthHeight {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES;
    public static final IntrinsicWidthHeight Width = new IntrinsicWidthHeight("Width", 0);
    public static final IntrinsicWidthHeight Height = new IntrinsicWidthHeight("Height", 1);

    private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
        return new IntrinsicWidthHeight[]{Width, Height};
    }

    static {
        IntrinsicWidthHeight[] intrinsicWidthHeightArr$values = $values();
        $VALUES = intrinsicWidthHeightArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(intrinsicWidthHeightArr$values);
    }

    private IntrinsicWidthHeight(String str, int i10) {
    }

    public static EnumEntries<IntrinsicWidthHeight> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) $VALUES.clone();
    }
}
