package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;

@Entity
/* loaded from: classes5.dex */
public final class AudioInfoEntity {
    transient BoxStore __boxStore;
    private EzyCommandEnum.CommandEnum commandEnum;
    private byte[] data;
    private long delayTime;
    private long duration;

    /* renamed from: id */
    private long f18012id;
    private boolean isPlay;
    public ToOne<AudioRecordEntity> record;

    public AudioInfoEntity() {
        this(0L, 0L, 0L, false, null, null, 63, null);
    }

    /* renamed from: a */
    public final EzyCommandEnum.CommandEnum m13975a() {
        return this.commandEnum;
    }

    /* renamed from: b */
    public final byte[] m13976b() {
        return this.data;
    }

    /* renamed from: c */
    public final long m13977c() {
        return this.delayTime;
    }

    /* renamed from: d */
    public final long m13978d() {
        return this.duration;
    }

    /* renamed from: e */
    public final long m13979e() {
        return this.f18012id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9979u.m20289b(AudioInfoEntity.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type com.zykj.blackboard.core.data.dao.AudioInfoEntity");
        AudioInfoEntity audioInfoEntity = (AudioInfoEntity) obj;
        return this.f18012id == audioInfoEntity.f18012id && this.delayTime == audioInfoEntity.delayTime && this.duration == audioInfoEntity.duration && this.isPlay == audioInfoEntity.isPlay && this.commandEnum == audioInfoEntity.commandEnum && Arrays.equals(this.data, audioInfoEntity.data);
    }

    /* renamed from: f */
    public final ToOne m13980f() {
        ToOne<AudioRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9979u.m20312y("record");
        return null;
    }

    /* renamed from: g */
    public final boolean m13981g() {
        return this.isPlay;
    }

    /* renamed from: h */
    public final void m13982h() {
        C10341d.f24644a.m21626f().m18954g(AudioInfoEntity.class).m19227m(this);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f18012id) * 31) + Long.hashCode(this.delayTime)) * 31) + Long.hashCode(this.duration)) * 31) + Boolean.hashCode(this.isPlay)) * 31) + this.commandEnum.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    /* renamed from: i */
    public final void m13983i(byte[] bArr) {
        AbstractC9979u.m20294g(bArr, "<set-?>");
        this.data = bArr;
    }

    /* renamed from: j */
    public final void m13984j(long j10) {
        this.duration = j10;
    }

    /* renamed from: k */
    public final void m13985k(long j10) {
        this.f18012id = j10;
    }

    public String toString() {
        return "AudioInfoEntity(id=" + this.f18012id + ", delayTime=" + this.delayTime + ", duration=" + this.duration + ", isPlay=" + this.isPlay + ", commandEnum=" + this.commandEnum + ", data=" + Arrays.toString(this.data) + ')';
    }

    public AudioInfoEntity(long j10, long j11, long j12, boolean z10, EzyCommandEnum.CommandEnum commandEnum, byte[] data) {
        AbstractC9979u.m20294g(commandEnum, "commandEnum");
        AbstractC9979u.m20294g(data, "data");
        this.record = new ToOne<>(this, AudioInfoEntity_.f18034p);
        this.f18012id = j10;
        this.delayTime = j11;
        this.duration = j12;
        this.isPlay = z10;
        this.commandEnum = commandEnum;
        this.data = data;
    }

    public /* synthetic */ AudioInfoEntity(long j10, long j11, long j12, boolean z10, EzyCommandEnum.CommandEnum commandEnum, byte[] bArr, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? EzyCommandEnum.CommandEnum.ACTION_DEFAULT : commandEnum, (i10 & 32) != 0 ? new byte[0] : bArr);
    }
}
