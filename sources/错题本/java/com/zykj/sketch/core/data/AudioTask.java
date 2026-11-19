package com.zykj.sketch.core.data;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m5110d2 = {"Lcom/zykj/sketch/core/data/AudioTask;", "", "startTime", "", "fileName", "", "path", TypedValues.TransitionType.S_DURATION, "", "(JLjava/lang/String;Ljava/lang/String;I)V", "getDuration", "()I", "setDuration", "(I)V", "getFileName", "()Ljava/lang/String;", "getPath", "setPath", "(Ljava/lang/String;)V", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class AudioTask {
    private int duration;

    @NotNull
    private final String fileName;

    @NotNull
    private String path;
    private final long startTime;

    public AudioTask(long j7, @NotNull String fileName, @NotNull String path, int i) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(path, "path");
        this.startTime = j7;
        this.fileName = fileName;
        this.path = path;
        this.duration = i;
    }

    public static /* synthetic */ AudioTask copy$default(AudioTask audioTask, long j7, String str, String str2, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = audioTask.startTime;
        }
        long j8 = j7;
        if ((i8 & 2) != 0) {
            str = audioTask.fileName;
        }
        String str3 = str;
        if ((i8 & 4) != 0) {
            str2 = audioTask.path;
        }
        String str4 = str2;
        if ((i8 & 8) != 0) {
            i = audioTask.duration;
        }
        return audioTask.copy(j8, str3, str4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final AudioTask copy(long startTime, @NotNull String fileName, @NotNull String path, int duration) {
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(path, "path");
        return new AudioTask(startTime, fileName, path, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTask)) {
            return false;
        }
        AudioTask audioTask = (AudioTask) other;
        return this.startTime == audioTask.startTime && AbstractC5830k.m5325b(this.fileName, audioTask.fileName) && AbstractC5830k.m5325b(this.path, audioTask.path) && this.duration == audioTask.duration;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Integer.hashCode(this.duration) + AbstractC0584a.m903d(AbstractC0584a.m903d(Long.hashCode(this.startTime) * 31, 31, this.fileName), 31, this.path);
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setPath(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.path = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioTask(startTime=");
        sb.append(this.startTime);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", duration=");
        return AbstractC0037f.m88m(sb, this.duration, ')');
    }

    public /* synthetic */ AudioTask(long j7, String str, String str2, int i, int i8, AbstractC5824e abstractC5824e) {
        this(j7, str, (i8 & 4) != 0 ? "" : str2, (i8 & 8) != 0 ? 0 : i);
    }
}
