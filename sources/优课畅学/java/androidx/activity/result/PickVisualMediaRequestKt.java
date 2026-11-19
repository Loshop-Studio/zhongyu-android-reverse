package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

/* loaded from: classes.dex */
public final class PickVisualMediaRequestKt {
    @InterfaceC8721a
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
        AbstractC9133u.m16133g(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    @InterfaceC8721a
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i10) {
        AbstractC9133u.m16133g(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i10).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        return PickVisualMediaRequest(visualMediaType, i10);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i10, boolean z10, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        AbstractC9133u.m16133g(mediaType, "mediaType");
        AbstractC9133u.m16133g(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i10).setOrderedSelection(z10).setDefaultTab(defaultTab).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, boolean z10, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i10, z10, defaultTab);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(long j10, ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i10, boolean z10, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        AbstractC9133u.m16133g(mediaType, "mediaType");
        AbstractC9133u.m16133g(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i10).setOrderedSelection(z10).setDefaultTab(defaultTab).setAccentColor(j10).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(long j10, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i10, boolean z10, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i11 & 4) != 0) {
            i10 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(j10, visualMediaType2, i12, z11, defaultTab);
    }
}
