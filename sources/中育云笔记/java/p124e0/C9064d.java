package p124e0;

import android.os.Parcel;
import android.os.Parcelable;
import com.aliyun.ams.emas.push.notification.CPushMessage;

/* renamed from: e0.d */
/* loaded from: classes3.dex */
public final class C9064d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CPushMessage createFromParcel(Parcel parcel) {
        return new CPushMessage(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CPushMessage[] newArray(int i10) {
        return new CPushMessage[i10];
    }
}
