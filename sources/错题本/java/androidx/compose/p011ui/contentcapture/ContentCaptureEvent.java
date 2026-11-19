package androidx.compose.p011ui.contentcapture;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.platform.coreshims.ViewStructureCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "id", "", "timestamp", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "structureCompat", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "(IJLandroidx/compose/ui/contentcapture/ContentCaptureEventType;Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "getId", "()I", "getStructureCompat", "()Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "getTimestamp", "()J", "getType", "()Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class ContentCaptureEvent {
    private final int id;

    @Nullable
    private final ViewStructureCompat structureCompat;
    private final long timestamp;

    @NotNull
    private final ContentCaptureEventType type;

    public ContentCaptureEvent(int i, long j7, @NotNull ContentCaptureEventType contentCaptureEventType, @Nullable ViewStructureCompat viewStructureCompat) {
        this.id = i;
        this.timestamp = j7;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i, long j7, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = contentCaptureEvent.id;
        }
        if ((i8 & 2) != 0) {
            j7 = contentCaptureEvent.timestamp;
        }
        if ((i8 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        if ((i8 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i, j7, contentCaptureEventType, viewStructureCompat);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ContentCaptureEventType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    @NotNull
    public final ContentCaptureEvent copy(int id, long timestamp, @NotNull ContentCaptureEventType type, @Nullable ViewStructureCompat structureCompat) {
        return new ContentCaptureEvent(id, timestamp, type, structureCompat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) other;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && AbstractC5830k.m5325b(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + AbstractC0584a.m897B(this.timestamp, Integer.hashCode(this.id) * 31, 31)) * 31;
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return iHashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    @NotNull
    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}
