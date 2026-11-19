package androidx.compose.p014ui.contentcapture;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class ContentCaptureEventType {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ ContentCaptureEventType[] $VALUES;
    public static final ContentCaptureEventType VIEW_APPEAR = new ContentCaptureEventType("VIEW_APPEAR", 0);
    public static final ContentCaptureEventType VIEW_DISAPPEAR = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ ContentCaptureEventType[] $values() {
        return new ContentCaptureEventType[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        ContentCaptureEventType[] contentCaptureEventTypeArr$values = $values();
        $VALUES = contentCaptureEventTypeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(contentCaptureEventTypeArr$values);
    }

    private ContentCaptureEventType(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }
}
