package com.zykj.huiwei.launcher.p035ui.fragment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "messageId", "parameterId", "", "creatorName", "createTime", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "d", "Ljava/lang/String;", "e", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationDetailFragmentArgs implements NavArgs {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final long messageId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final long parameterId;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final String creatorName;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final String createTime;

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NotificationDetailFragmentArgs m5968a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(NotificationDetailFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("messageId")) {
                throw new IllegalArgumentException("Required argument \"messageId\" is missing and does not have an android:defaultValue");
            }
            long j6 = bundle.getLong("messageId");
            if (!bundle.containsKey("parameterId")) {
                throw new IllegalArgumentException("Required argument \"parameterId\" is missing and does not have an android:defaultValue");
            }
            long j7 = bundle.getLong("parameterId");
            if (!bundle.containsKey("creatorName")) {
                throw new IllegalArgumentException("Required argument \"creatorName\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("creatorName");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"creatorName\" is marked as non-null but was passed a null value.");
            }
            if (bundle.containsKey("createTime")) {
                return new NotificationDetailFragmentArgs(j6, j7, string, bundle.getString("createTime"));
            }
            throw new IllegalArgumentException("Required argument \"createTime\" is missing and does not have an android:defaultValue");
        }

        public Companion() {
        }
    }

    public NotificationDetailFragmentArgs(long j6, long j7, String creatorName, String str) {
        Intrinsics.checkNotNullParameter(creatorName, "creatorName");
        this.messageId = j6;
        this.parameterId = j7;
        this.creatorName = creatorName;
        this.createTime = str;
    }

    @JvmStatic
    public static final NotificationDetailFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m5968a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: b, reason: from getter */
    public final String getCreatorName() {
        return this.creatorName;
    }

    /* renamed from: c, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    /* renamed from: d, reason: from getter */
    public final long getParameterId() {
        return this.parameterId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationDetailFragmentArgs)) {
            return false;
        }
        NotificationDetailFragmentArgs notificationDetailFragmentArgs = (NotificationDetailFragmentArgs) other;
        return this.messageId == notificationDetailFragmentArgs.messageId && this.parameterId == notificationDetailFragmentArgs.parameterId && Intrinsics.areEqual(this.creatorName, notificationDetailFragmentArgs.creatorName) && Intrinsics.areEqual(this.createTime, notificationDetailFragmentArgs.createTime);
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.messageId) * 31) + Long.hashCode(this.parameterId)) * 31) + this.creatorName.hashCode()) * 31;
        String str = this.createTime;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NotificationDetailFragmentArgs(messageId=" + this.messageId + ", parameterId=" + this.parameterId + ", creatorName=" + this.creatorName + ", createTime=" + this.createTime + ")";
    }
}
