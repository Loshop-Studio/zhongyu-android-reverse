package com.xuexiang.xui.widget.button.switchbutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes2.dex */
class SwitchButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwitchButton$SavedState> CREATOR = new C3550a();

    /* renamed from: a */
    public CharSequence f3386a;

    /* renamed from: b */
    public CharSequence f3387b;

    /* renamed from: com.xuexiang.xui.widget.button.switchbutton.SwitchButton$SavedState$a */
    public static class C3550a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState createFromParcel(Parcel parcel) {
            return new SwitchButton$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState[] newArray(int i4) {
            return new SwitchButton$SavedState[i4];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        TextUtils.writeToParcel(this.f3386a, parcel, i4);
        TextUtils.writeToParcel(this.f3387b, parcel, i4);
    }

    public SwitchButton$SavedState(Parcel parcel) {
        super(parcel);
        this.f3386a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3387b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }
}
