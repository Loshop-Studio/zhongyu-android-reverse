package com.zykj.mistake.utils;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m5110d2 = {"Lcom/zykj/mistake/utils/NoteRemoteFileInfo;", "", "url", "", "md5", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMd5", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class NoteRemoteFileInfo {
    public static final int $stable = 0;

    @NotNull
    private final String md5;

    @NotNull
    private final String url;

    public NoteRemoteFileInfo(@NotNull String url, @NotNull String md5) {
        AbstractC5830k.m5330g(url, "url");
        AbstractC5830k.m5330g(md5, "md5");
        this.url = url;
        this.md5 = md5;
    }

    public static /* synthetic */ NoteRemoteFileInfo copy$default(NoteRemoteFileInfo noteRemoteFileInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteRemoteFileInfo.url;
        }
        if ((i & 2) != 0) {
            str2 = noteRemoteFileInfo.md5;
        }
        return noteRemoteFileInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final NoteRemoteFileInfo copy(@NotNull String url, @NotNull String md5) {
        AbstractC5830k.m5330g(url, "url");
        AbstractC5830k.m5330g(md5, "md5");
        return new NoteRemoteFileInfo(url, md5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteRemoteFileInfo)) {
            return false;
        }
        NoteRemoteFileInfo noteRemoteFileInfo = (NoteRemoteFileInfo) other;
        return AbstractC5830k.m5325b(this.url, noteRemoteFileInfo.url) && AbstractC5830k.m5325b(this.md5, noteRemoteFileInfo.md5);
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.md5.hashCode() + (this.url.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return AbstractC0037f.m87l("NoteRemoteFileInfo(url=", this.url, ", md5=", this.md5, ")");
    }
}
