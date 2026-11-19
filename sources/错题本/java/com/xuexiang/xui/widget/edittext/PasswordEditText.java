package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: a */
    public boolean f4296a;

    /* renamed from: b */
    public boolean f4297b;

    public PasswordEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4297b = savedState.f4298a;
        this.f4296a = savedState.f4299b;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f4296a) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(null);
        }
        setSelection(selectionStart, selectionEnd);
        if (this.f4297b) {
            this.f4297b = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f4297b = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4297b, this.f4296a);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4297b) {
            return super.onTouchEvent(motionEvent);
        }
        if (getLayoutDirection() != 1) {
            motionEvent.getX();
            getWidth();
            getPaddingRight();
            throw null;
        }
        if (motionEvent.getX() <= getPaddingLeft()) {
            motionEvent.getAction();
            return super.onTouchEvent(motionEvent);
        }
        motionEvent.getX();
        getPaddingLeft();
        throw null;
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.PasswordEditTextStyle);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4171a();

        /* renamed from: a */
        public final boolean f4298a;

        /* renamed from: b */
        public final boolean f4299b;

        public SavedState(Parcelable parcelable, boolean z8, boolean z9) {
            super(parcelable);
            this.f4298a = z8;
            this.f4299b = z9;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f4298a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f4299b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4298a = parcel.readByte() != 0;
            this.f4299b = parcel.readByte() != 0;
        }
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC6582a.m6217a();
        throw null;
    }
}
