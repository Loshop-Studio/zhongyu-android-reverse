package com.xuexiang.xui.widget.button.switchbutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes4.dex */
class SwitchButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwitchButton$SavedState> CREATOR = new C6501a();

    /* renamed from: a */
    public CharSequence f6046a;

    /* renamed from: b */
    public CharSequence f6047b;

    /* renamed from: com.xuexiang.xui.widget.button.switchbutton.SwitchButton$SavedState$a */
    public static class C6501a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState createFromParcel(Parcel parcel) {
            return new SwitchButton$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState[] newArray(int i10) {
            return new SwitchButton$SavedState[i10];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f6046a, parcel, i10);
        TextUtils.writeToParcel(this.f6047b, parcel, i10);
    }

    public SwitchButton$SavedState(Parcel parcel) {
        super(parcel);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6046a = (CharSequence) creator.createFromParcel(parcel);
        this.f6047b = (CharSequence) creator.createFromParcel(parcel);
    }
}
