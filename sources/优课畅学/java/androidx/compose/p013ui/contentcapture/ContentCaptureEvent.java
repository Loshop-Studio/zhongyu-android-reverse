package androidx.compose.p013ui.contentcapture;

import androidx.compose.p013ui.platform.coreshims.ViewStructureCompat;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class ContentCaptureEvent {

    /* renamed from: id */
    private final int f1209id;
    private final ViewStructureCompat structureCompat;
    private final long timestamp;
    private final ContentCaptureEventType type;

    public ContentCaptureEvent(int i10, long j10, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.f1209id = i10;
        this.timestamp = j10;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i10, long j10, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = contentCaptureEvent.f1209id;
        }
        if ((i11 & 2) != 0) {
            j10 = contentCaptureEvent.timestamp;
        }
        if ((i11 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        if ((i11 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i10, j10, contentCaptureEventType, viewStructureCompat);
    }

    public final int component1() {
        return this.f1209id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final ContentCaptureEventType component3() {
        return this.type;
    }

    public final ViewStructureCompat component4() {
        return this.structureCompat;
    }

    public final ContentCaptureEvent copy(int i10, long j10, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        return new ContentCaptureEvent(i10, j10, contentCaptureEventType, viewStructureCompat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.f1209id == contentCaptureEvent.f1209id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && AbstractC9133u.m16128b(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int getId() {
        return this.f1209id;
    }

    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f1209id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.type.hashCode()) * 31;
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return iHashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f1209id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}
