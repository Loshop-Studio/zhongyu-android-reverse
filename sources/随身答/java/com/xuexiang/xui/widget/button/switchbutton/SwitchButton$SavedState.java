package com.xuexiang.xui.widget.button.switchbutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes4.dex */
class SwitchButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwitchButton$SavedState> CREATOR = new C6820a();

    /* renamed from: a */
    public CharSequence f7301a;

    /* renamed from: b */
    public CharSequence f7302b;

    /* renamed from: com.xuexiang.xui.widget.button.switchbutton.SwitchButton$SavedState$a */
    public static class C6820a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState createFromParcel(Parcel parcel) {
            return new SwitchButton$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SwitchButton$SavedState[] newArray(int i9) {
            return new SwitchButton$SavedState[i9];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        TextUtils.writeToParcel(this.f7301a, parcel, i9);
        TextUtils.writeToParcel(this.f7302b, parcel, i9);
    }

    public SwitchButton$SavedState(Parcel parcel) {
        super(parcel);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f7301a = (CharSequence) creator.createFromParcel(parcel);
        this.f7302b = (CharSequence) creator.createFromParcel(parcel);
    }
}
