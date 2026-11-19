package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IntRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u0007\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\f"}, m13558d2 = {"PickVisualMediaRequest", "Landroidx/activity/result/PickVisualMediaRequest;", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "maxItems", "", "isOrderedSelection", "", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "accentColor", "", "activity_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class PickVisualMediaRequestKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i10) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i10).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity_release();
        }
        return PickVisualMediaRequest(visualMediaType, i10);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i10, boolean z9, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i10).setOrderedSelection(z9).setDefaultTab(defaultTab).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, boolean z9, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity_release();
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        if ((i11 & 8) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i10, z9, defaultTab);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(long j10, ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i10, boolean z9, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i10).setOrderedSelection(z9).setDefaultTab(defaultTab).setAccentColor(j10).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(long j10, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, boolean z9, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i11 & 4) != 0) {
            i10 = ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity_release();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z9 = false;
        }
        boolean z10 = z9;
        if ((i11 & 16) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(j10, visualMediaType2, i12, z10, defaultTab);
    }
}
