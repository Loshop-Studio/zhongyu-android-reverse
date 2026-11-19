package androidx.compose.p013ui.contentcapture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13558d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "(Ljava/lang/String;I)V", "VIEW_APPEAR", "VIEW_DISAPPEAR", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class ContentCaptureEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentCaptureEventType[] $VALUES;
    public static final ContentCaptureEventType VIEW_APPEAR = new ContentCaptureEventType("VIEW_APPEAR", 0);
    public static final ContentCaptureEventType VIEW_DISAPPEAR = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ ContentCaptureEventType[] $values() {
        return new ContentCaptureEventType[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        ContentCaptureEventType[] contentCaptureEventTypeArr$values = $values();
        $VALUES = contentCaptureEventTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(contentCaptureEventTypeArr$values);
    }

    private ContentCaptureEventType(String str, int i10) {
    }

    public static EnumEntries<ContentCaptureEventType> getEntries() {
        return $ENTRIES;
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }
}
