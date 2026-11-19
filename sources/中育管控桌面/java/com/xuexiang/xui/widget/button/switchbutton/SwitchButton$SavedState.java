package com.xuexiang.xui.widget.button.switchbutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes3.dex */
class SwitchButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwitchButton$SavedState> CREATOR = new C5879a();

    /* renamed from: a */
    public CharSequence f4770a;

    /* renamed from: b */
    public CharSequence f4771b;

    /* renamed from: com.xuexiang.xui.widget.button.switchbutton.SwitchButton$SavedState$a */
    public static class C5879a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState createFromParcel(Parcel parcel) {
            return new SwitchButton$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState[] newArray(int i6) {
            return new SwitchButton$SavedState[i6];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        TextUtils.writeToParcel(this.f4770a, parcel, i6);
        TextUtils.writeToParcel(this.f4771b, parcel, i6);
    }

    public SwitchButton$SavedState(Parcel parcel) {
        super(parcel);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4770a = (CharSequence) creator.createFromParcel(parcel);
        this.f4771b = (CharSequence) creator.createFromParcel(parcel);
    }
}
