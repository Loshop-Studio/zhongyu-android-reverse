package com.zykj.sketch.core.data;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class AudioTask {
    private int duration;
    private final String fileName;
    private String path;
    private final long startTime;

    public AudioTask(long j10, String fileName, String path, int i10) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(path, "path");
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

    public final long component1() {
        return this.startTime;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.path;
    }

    public final int component4() {
        return this.duration;
    }

    public final AudioTask copy(long j10, String fileName, String path, int i10) {
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(path, "path");
        return new AudioTask(j10, fileName, path, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioTask)) {
            return false;
        }
        AudioTask audioTask = (AudioTask) obj;
        return this.startTime == audioTask.startTime && AbstractC9133u.m16128b(this.fileName, audioTask.fileName) && AbstractC9133u.m16128b(this.path, audioTask.path) && this.duration == audioTask.duration;
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
        AbstractC9133u.m16133g(str, "<set-?>");
        this.path = str;
    }

    public String toString() {
        return "AudioTask(startTime=" + this.startTime + ", fileName=" + this.fileName + ", path=" + this.path + ", duration=" + this.duration + ')';
    }

    public /* synthetic */ AudioTask(long j10, String str, String str2, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(j10, str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0 : i10);
    }
}
