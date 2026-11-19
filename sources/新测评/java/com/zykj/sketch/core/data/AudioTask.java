package com.zykj.sketch.core.data;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m13558d2 = {"Lcom/zykj/sketch/core/data/AudioTask;", "", "startTime", "", "fileName", "", "path", TypedValues.TransitionType.S_DURATION, "", "(JLjava/lang/String;Ljava/lang/String;I)V", "getDuration", "()I", "setDuration", "(I)V", "getFileName", "()Ljava/lang/String;", "getPath", "setPath", "(Ljava/lang/String;)V", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AudioTask {
    private int duration;
    private final String fileName;
    private String path;
    private final long startTime;

    public AudioTask(long j10, String fileName, String path, int i10) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.startTime = j10;
        this.fileName = fileName;
        this.path = path;
        this.duration = i10;
    }

    public static /* synthetic */ AudioTask copy$default(AudioTask audioTask, long j10, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = audioTask.startTime;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = audioTask.fileName;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = audioTask.path;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            i10 = audioTask.duration;
        }
        return audioTask.copy(j11, str3, str4, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public final AudioTask copy(long startTime, String fileName, String path, int duration) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(path, "path");
        return new AudioTask(startTime, fileName, path, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTask)) {
            return false;
        }
        AudioTask audioTask = (AudioTask) other;
        return this.startTime == audioTask.startTime && Intrinsics.areEqual(this.fileName, audioTask.fileName) && Intrinsics.areEqual(this.path, audioTask.path) && this.duration == audioTask.duration;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.startTime) * 31) + this.fileName.hashCode()) * 31) + this.path.hashCode()) * 31) + Integer.hashCode(this.duration);
    }

    public final void setDuration(int i10) {
        this.duration = i10;
    }

    public final void setPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public String toString() {
        return "AudioTask(startTime=" + this.startTime + ", fileName=" + this.fileName + ", path=" + this.path + ", duration=" + this.duration + ')';
    }

    public /* synthetic */ AudioTask(long j10, String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0 : i10);
    }
}
