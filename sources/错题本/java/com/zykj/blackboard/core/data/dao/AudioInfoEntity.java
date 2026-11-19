package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Convert;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.InterfaceC5697Id;
import io.objectbox.relation.ToOne;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010*R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b\u0007\u0010\u001d\"\u0004\b0\u00101R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u00105R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010!\"\u0004\b8\u00109R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006B"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "", "", "id", "delayTime", TypedValues.TransitionType.S_DURATION, "", "isPlay", "Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "commandEnum", "", "data", "<init>", "(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ld6/s;", "put", "()V", "remove", "component1", "()J", "component2", "component3", "component4", "()Z", "component5", "()Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "component6", "()[B", "copy", "(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;", "", "toString", "()Ljava/lang/String;", "J", "getId", "setId", "(J)V", "getDelayTime", "setDelayTime", "getDuration", "setDuration", "Z", "setPlay", "(Z)V", "Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "getCommandEnum", "setCommandEnum", "(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V", "[B", "getData", "setData", "([B)V", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "getRecord", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes3.dex */
public final /* data */ class AudioInfoEntity {
    transient BoxStore __boxStore;

    @Convert(converter = CommandEnumConverter.class, dbType = int.class)
    @NotNull
    private EzyCommandEnum$CommandEnum commandEnum;

    @NotNull
    private byte[] data;
    private long delayTime;
    private long duration;

    @InterfaceC5697Id
    private long id;
    private boolean isPlay;
    public ToOne<AudioRecordEntity> record;

    public AudioInfoEntity() {
        this(0L, 0L, 0L, false, null, null, 63, null);
    }

    public static /* synthetic */ AudioInfoEntity copy$default(AudioInfoEntity audioInfoEntity, long j7, long j8, long j9, boolean z8, EzyCommandEnum$CommandEnum ezyCommandEnum$CommandEnum, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = audioInfoEntity.id;
        }
        long j10 = j7;
        if ((i & 2) != 0) {
            j8 = audioInfoEntity.delayTime;
        }
        return audioInfoEntity.copy(j10, j8, (i & 4) != 0 ? audioInfoEntity.duration : j9, (i & 8) != 0 ? audioInfoEntity.isPlay : z8, (i & 16) != 0 ? audioInfoEntity.commandEnum : ezyCommandEnum$CommandEnum, (i & 32) != 0 ? audioInfoEntity.data : bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDelayTime() {
        return this.delayTime;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final EzyCommandEnum$CommandEnum getCommandEnum() {
        return this.commandEnum;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final AudioInfoEntity copy(long id, long delayTime, long duration, boolean isPlay, @NotNull EzyCommandEnum$CommandEnum commandEnum, @NotNull byte[] data) {
        AbstractC5830k.m5330g(commandEnum, "commandEnum");
        AbstractC5830k.m5330g(data, "data");
        return new AudioInfoEntity(id, delayTime, duration, isPlay, commandEnum, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!AudioInfoEntity.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC5830k.m5328e(other, "null cannot be cast to non-null type com.zykj.blackboard.core.data.dao.AudioInfoEntity");
        AudioInfoEntity audioInfoEntity = (AudioInfoEntity) other;
        return this.id == audioInfoEntity.id && this.delayTime == audioInfoEntity.delayTime && this.duration == audioInfoEntity.duration && this.isPlay == audioInfoEntity.isPlay && this.commandEnum == audioInfoEntity.commandEnum && Arrays.equals(this.data, audioInfoEntity.data);
    }

    @NotNull
    public final EzyCommandEnum$CommandEnum getCommandEnum() {
        return this.commandEnum;
    }

    @NotNull
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
        return this.id;
    }

    @NotNull
    public final ToOne<AudioRecordEntity> getRecord() {
        ToOne<AudioRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        AbstractC5830k.m5339p("record");
        throw null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + ((this.commandEnum.hashCode() + AbstractC0584a.m908i(this.isPlay, AbstractC0584a.m897B(this.duration, AbstractC0584a.m897B(this.delayTime, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31);
    }

    public final boolean isPlay() {
        return this.isPlay;
    }

    public final void put() {
        BoardBox.INSTANCE.getBoxStore().m5018c(AudioInfoEntity.class).m5034e(this);
    }

    public final void remove() {
        BoardBox.INSTANCE.getBoxStore().m5018c(AudioInfoEntity.class).m5039j(this);
    }

    public final void setCommandEnum(@NotNull EzyCommandEnum$CommandEnum ezyCommandEnum$CommandEnum) {
        AbstractC5830k.m5330g(ezyCommandEnum$CommandEnum, "<set-?>");
        this.commandEnum = ezyCommandEnum$CommandEnum;
    }

    public final void setData(@NotNull byte[] bArr) {
        AbstractC5830k.m5330g(bArr, "<set-?>");
        this.data = bArr;
    }

    public final void setDelayTime(long j7) {
        this.delayTime = j7;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setPlay(boolean z8) {
        this.isPlay = z8;
    }

    public final void setRecord(@NotNull ToOne<AudioRecordEntity> toOne) {
        AbstractC5830k.m5330g(toOne, "<set-?>");
        this.record = toOne;
    }

    @NotNull
    public String toString() {
        return "AudioInfoEntity(id=" + this.id + ", delayTime=" + this.delayTime + ", duration=" + this.duration + ", isPlay=" + this.isPlay + ", commandEnum=" + this.commandEnum + ", data=" + Arrays.toString(this.data) + ')';
    }

    public AudioInfoEntity(long j7, long j8, long j9, boolean z8, @NotNull EzyCommandEnum$CommandEnum commandEnum, @NotNull byte[] data) {
        AbstractC5830k.m5330g(commandEnum, "commandEnum");
        AbstractC5830k.m5330g(data, "data");
        this.record = new ToOne<>(this, AudioInfoEntity_.record);
        this.id = j7;
        this.delayTime = j8;
        this.duration = j9;
        this.isPlay = z8;
        this.commandEnum = commandEnum;
        this.data = data;
    }

    public /* synthetic */ AudioInfoEntity(long j7, long j8, long j9, boolean z8, EzyCommandEnum$CommandEnum ezyCommandEnum$CommandEnum, byte[] bArr, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0L : j7, (i & 2) != 0 ? 0L : j8, (i & 4) != 0 ? 0L : j9, (i & 8) != 0 ? false : z8, (i & 16) != 0 ? EzyCommandEnum$CommandEnum.ACTION_DEFAULT : ezyCommandEnum$CommandEnum, (i & 32) != 0 ? new byte[0] : bArr);
    }
}
