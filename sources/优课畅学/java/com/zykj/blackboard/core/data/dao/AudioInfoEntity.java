package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.zykj.blackboard.utils.BoardBox;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Entity
/* loaded from: classes4.dex */
public final class AudioInfoEntity {
    transient BoxStore __boxStore;
    private EzyCommandEnum.CommandEnum commandEnum;
    private byte[] data;
    private long delayTime;
    private long duration;

    /* renamed from: id */
    private long f8708id;
    private boolean isPlay;
    public ToOne<AudioRecordEntity> record;

    public AudioInfoEntity() {
        this(0L, 0L, 0L, false, null, null, 63, null);
    }

    public static /* synthetic */ AudioInfoEntity copy$default(AudioInfoEntity audioInfoEntity, long j10, long j11, long j12, boolean z10, EzyCommandEnum.CommandEnum commandEnum, byte[] bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = audioInfoEntity.f8708id;
        }
        long j13 = j10;
        if ((i10 & 2) != 0) {
            j11 = audioInfoEntity.delayTime;
        }
        return audioInfoEntity.copy(j13, j11, (i10 & 4) != 0 ? audioInfoEntity.duration : j12, (i10 & 8) != 0 ? audioInfoEntity.isPlay : z10, (i10 & 16) != 0 ? audioInfoEntity.commandEnum : commandEnum, (i10 & 32) != 0 ? audioInfoEntity.data : bArr);
    }

    public final long component1() {
        return this.f8708id;
    }

    public final long component2() {
        return this.delayTime;
    }

    public final long component3() {
        return this.duration;
    }

    public final boolean component4() {
        return this.isPlay;
    }

    public final EzyCommandEnum.CommandEnum component5() {
        return this.commandEnum;
    }

    public final byte[] component6() {
        return this.data;
    }

    public final AudioInfoEntity copy(long j10, long j11, long j12, boolean z10, EzyCommandEnum.CommandEnum commandEnum, byte[] data) {
        AbstractC9133u.m16133g(commandEnum, "commandEnum");
        AbstractC9133u.m16133g(data, "data");
        return new AudioInfoEntity(j10, j11, j12, z10, commandEnum, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9133u.m16128b(AudioInfoEntity.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type com.zykj.blackboard.core.data.dao.AudioInfoEntity");
        AudioInfoEntity audioInfoEntity = (AudioInfoEntity) obj;
        return this.f8708id == audioInfoEntity.f8708id && this.delayTime == audioInfoEntity.delayTime && this.duration == audioInfoEntity.duration && this.isPlay == audioInfoEntity.isPlay && this.commandEnum == audioInfoEntity.commandEnum && Arrays.equals(this.data, audioInfoEntity.data);
    }

    public final EzyCommandEnum.CommandEnum getCommandEnum() {
        return this.commandEnum;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final long getDelayTime() {
        return this.delayTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.f8708id;
    }

    public final ToOne<AudioRecordEntity> getRecord() {
        ToOne<AudioRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC9133u.m16151y("record");
        return null;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f8708id) * 31) + Long.hashCode(this.delayTime)) * 31) + Long.hashCode(this.duration)) * 31) + Boolean.hashCode(this.isPlay)) * 31) + this.commandEnum.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    public final boolean isPlay() {
        return this.isPlay;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m15370d(AudioInfoEntity.class).m15414l(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m15370d(AudioInfoEntity.class).m15422t(this);
    }

    public final void setCommandEnum(EzyCommandEnum.CommandEnum commandEnum) {
        AbstractC9133u.m16133g(commandEnum, "<set-?>");
        this.commandEnum = commandEnum;
    }

    public final void setData(byte[] bArr) {
        AbstractC9133u.m16133g(bArr, "<set-?>");
        this.data = bArr;
    }

    public final void setDelayTime(long j10) {
        this.delayTime = j10;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setId(long j10) {
        this.f8708id = j10;
    }

    public final void setPlay(boolean z10) {
        this.isPlay = z10;
    }

    public final void setRecord(ToOne<AudioRecordEntity> toOne) {
        AbstractC9133u.m16133g(toOne, "<set-?>");
        this.record = toOne;
    }

    public String toString() {
        return "AudioInfoEntity(id=" + this.f8708id + ", delayTime=" + this.delayTime + ", duration=" + this.duration + ", isPlay=" + this.isPlay + ", commandEnum=" + this.commandEnum + ", data=" + Arrays.toString(this.data) + ')';
    }

    public AudioInfoEntity(long j10, long j11, long j12, boolean z10, EzyCommandEnum.CommandEnum commandEnum, byte[] data) {
        AbstractC9133u.m16133g(commandEnum, "commandEnum");
        AbstractC9133u.m16133g(data, "data");
        this.record = new ToOne<>(this, AudioInfoEntity_.record);
        this.f8708id = j10;
        this.delayTime = j11;
        this.duration = j12;
        this.isPlay = z10;
        this.commandEnum = commandEnum;
        this.data = data;
    }

    public /* synthetic */ AudioInfoEntity(long j10, long j11, long j12, boolean z10, EzyCommandEnum.CommandEnum commandEnum, byte[] bArr, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? EzyCommandEnum.CommandEnum.ACTION_DEFAULT : commandEnum, (i10 & 32) != 0 ? new byte[0] : bArr);
    }
}
