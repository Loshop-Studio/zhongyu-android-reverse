package com.zykj.gallery.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m7880d2 = {"Lcom/zykj/gallery/bean/GalleryBody;", "", HintConstants.AUTOFILL_HINT_NAME, "", "picture", "size", "appName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPicture", "getSize", "getAppName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GalleryBody {
    public static final int $stable = 0;
    private final String appName;
    private final String name;
    private final String picture;
    private final String size;

    public GalleryBody(String name, String picture, String size, String appName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.name = name;
        this.picture = picture;
        this.size = size;
        this.appName = appName;
    }

    public static /* synthetic */ GalleryBody copy$default(GalleryBody galleryBody, String str, String str2, String str3, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = galleryBody.name;
        }
        if ((i6 & 2) != 0) {
            str2 = galleryBody.picture;
        }
        if ((i6 & 4) != 0) {
            str3 = galleryBody.size;
        }
        if ((i6 & 8) != 0) {
            str4 = galleryBody.appName;
        }
        return galleryBody.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    public final GalleryBody copy(String name, String picture, String size, String appName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new GalleryBody(name, picture, size, appName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryBody)) {
            return false;
        }
        GalleryBody galleryBody = (GalleryBody) other;
        return Intrinsics.areEqual(this.name, galleryBody.name) && Intrinsics.areEqual(this.picture, galleryBody.picture) && Intrinsics.areEqual(this.size, galleryBody.size) && Intrinsics.areEqual(this.appName, galleryBody.appName);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.picture.hashCode()) * 31) + this.size.hashCode()) * 31) + this.appName.hashCode();
    }

    public String toString() {
        return "GalleryBody(name=" + this.name + ", picture=" + this.picture + ", size=" + this.size + ", appName=" + this.appName + ")";
    }
}
