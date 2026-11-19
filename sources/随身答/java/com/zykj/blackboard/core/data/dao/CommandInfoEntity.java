package com.zykj.blackboard.core.data.dao;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.BoxStore;
import io.objectbox.annotation.Entity;
import io.objectbox.relation.ToOne;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

@Metadata(m13412d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006:"}, m13413d2 = {"Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "", "", "id", "delayTime", TypedValues.TransitionType.S_DURATION, "", "isPlay", "Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "commandEnum", "", "data", "<init>", "(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "h", "()V", "", "toString", "()Ljava/lang/String;", "J", "e", "()J", "i", "(J)V", "c", "setDelayTime", "d", "setDuration", "Z", "g", "()Z", "setPlay", "(Z)V", "Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "a", "()Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "setCommandEnum", "(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V", "[B", "b", "()[B", "setData", "([B)V", "Lio/objectbox/relation/ToOne;", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "record", "Lio/objectbox/relation/ToOne;", "f", "()Lio/objectbox/relation/ToOne;", "setRecord", "(Lio/objectbox/relation/ToOne;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Entity
/* loaded from: classes4.dex */
public final /* data */ class CommandInfoEntity {
    transient BoxStore __boxStore;
    private EzyCommandEnum.CommandEnum commandEnum;
    private byte[] data;
    private long delayTime;
    private long duration;
    private long id;
    private boolean isPlay;
    public ToOne<CommandRecordEntity> record;

    public CommandInfoEntity() {
        this(0L, 0L, 0L, false, null, null, 63, null);
    }

    /* renamed from: a, reason: from getter */
    public final EzyCommandEnum.CommandEnum getCommandEnum() {
        return this.commandEnum;
    }

    /* renamed from: b, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: c, reason: from getter */
    public final long getDelayTime() {
        return this.delayTime;
    }

    /* renamed from: d, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CommandInfoEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.zykj.blackboard.core.data.dao.CommandInfoEntity");
        CommandInfoEntity commandInfoEntity = (CommandInfoEntity) other;
        return this.id == commandInfoEntity.id && this.delayTime == commandInfoEntity.delayTime && this.duration == commandInfoEntity.duration && this.isPlay == commandInfoEntity.isPlay && this.commandEnum == commandInfoEntity.commandEnum && Arrays.equals(this.data, commandInfoEntity.data);
    }

    /* renamed from: f */
    public final ToOne m7429f() {
        ToOne<CommandRecordEntity> toOne = this.record;
        if (toOne != null) {
            return toOne;
        }
        Intrinsics.throwUninitializedPropertyAccessException("record");
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    /* renamed from: h */
    public final void m7431h() {
        C9685d.f17121a.m16165f().m13101h(CommandInfoEntity.class).m2255l(this);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.delayTime)) * 31) + Long.hashCode(this.duration)) * 31) + Boolean.hashCode(this.isPlay)) * 31) + this.commandEnum.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    /* renamed from: i */
    public final void m7432i(long j9) {
        this.id = j9;
    }

    public String toString() {
        return "CommandInfoEntity(id=" + this.id + ", delayTime=" + this.delayTime + ", duration=" + this.duration + ", isPlay=" + this.isPlay + ", commandEnum=" + this.commandEnum + ", data=" + Arrays.toString(this.data) + ')';
    }

    public CommandInfoEntity(long j9, long j10, long j11, boolean z9, EzyCommandEnum.CommandEnum commandEnum, byte[] data) {
        Intrinsics.checkNotNullParameter(commandEnum, "commandEnum");
        Intrinsics.checkNotNullParameter(data, "data");
        this.record = new ToOne<>(this, CommandInfoEntity_.f8564n);
        this.id = j9;
        this.delayTime = j10;
        this.duration = j11;
        this.isPlay = z9;
        this.commandEnum = commandEnum;
        this.data = data;
    }

    public /* synthetic */ CommandInfoEntity(long j9, long j10, long j11, boolean z9, EzyCommandEnum.CommandEnum commandEnum, byte[] bArr, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j9, (i9 & 2) != 0 ? 0L : j10, (i9 & 4) != 0 ? 0L : j11, (i9 & 8) != 0 ? false : z9, (i9 & 16) != 0 ? EzyCommandEnum.CommandEnum.ACTION_DEFAULT : commandEnum, (i9 & 32) != 0 ? new byte[0] : bArr);
    }
}
