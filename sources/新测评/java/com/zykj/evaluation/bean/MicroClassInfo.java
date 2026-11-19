package com.zykj.evaluation.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006$"}, m13558d2 = {"Lcom/zykj/evaluation/bean/MicroClassInfo;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "address", "snapshot", "creationTime", "creatorUserId", "isRevising", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getAddress", "getSnapshot", "getCreationTime", "getCreatorUserId", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MicroClassInfo {
    public static final int $stable = 0;
    private final String address;
    private final String creationTime;
    private final long creatorUserId;
    private final long id;
    private final boolean isRevising;
    private final String name;
    private final String snapshot;

    public MicroClassInfo(long j10, String str, String str2, String str3, String str4, long j11, boolean z9) {
        this.id = j10;
        this.name = str;
        this.address = str2;
        this.snapshot = str3;
        this.creationTime = str4;
        this.creatorUserId = j11;
        this.isRevising = z9;
    }

    public static /* synthetic */ MicroClassInfo copy$default(MicroClassInfo microClassInfo, long j10, String str, String str2, String str3, String str4, long j11, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = microClassInfo.id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = microClassInfo.name;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = microClassInfo.address;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = microClassInfo.snapshot;
        }
        return microClassInfo.copy(j12, str5, str6, str3, (i10 & 16) != 0 ? microClassInfo.creationTime : str4, (i10 & 32) != 0 ? microClassInfo.creatorUserId : j11, (i10 & 64) != 0 ? microClassInfo.isRevising : z9);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreatorUserId() {
        return this.creatorUserId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsRevising() {
        return this.isRevising;
    }

    public final MicroClassInfo copy(long id, String name, String address, String snapshot, String creationTime, long creatorUserId, boolean isRevising) {
        return new MicroClassInfo(id, name, address, snapshot, creationTime, creatorUserId, isRevising);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicroClassInfo)) {
            return false;
        }
        MicroClassInfo microClassInfo = (MicroClassInfo) other;
        return this.id == microClassInfo.id && Intrinsics.areEqual(this.name, microClassInfo.name) && Intrinsics.areEqual(this.address, microClassInfo.address) && Intrinsics.areEqual(this.snapshot, microClassInfo.snapshot) && Intrinsics.areEqual(this.creationTime, microClassInfo.creationTime) && this.creatorUserId == microClassInfo.creatorUserId && this.isRevising == microClassInfo.isRevising;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final long getCreatorUserId() {
        return this.creatorUserId;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSnapshot() {
        return this.snapshot;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.snapshot;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creationTime;
        return ((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.creatorUserId)) * 31) + Boolean.hashCode(this.isRevising);
    }

    public final boolean isRevising() {
        return this.isRevising;
    }

    public String toString() {
        return "MicroClassInfo(id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", snapshot=" + this.snapshot + ", creationTime=" + this.creationTime + ", creatorUserId=" + this.creatorUserId + ", isRevising=" + this.isRevising + ")";
    }
}
