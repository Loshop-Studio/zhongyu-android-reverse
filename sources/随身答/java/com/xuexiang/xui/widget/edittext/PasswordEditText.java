package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import p241s3.AbstractC9470b;

/* loaded from: classes4.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: a */
    public int f7504a;

    /* renamed from: b */
    public Drawable f7505b;

    /* renamed from: c */
    public Drawable f7506c;

    /* renamed from: d */
    public boolean f7507d;

    /* renamed from: e */
    public boolean f7508e;

    /* renamed from: f */
    public boolean f7509f;

    /* renamed from: g */
    public boolean f7510g;

    /* renamed from: h */
    public boolean f7511h;

    /* renamed from: i */
    public PasswordTransformationMethod f7512i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6841a();

        /* renamed from: a */
        public final boolean f7513a;

        /* renamed from: b */
        public final boolean f7514b;

        /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$SavedState$a */
        public static class C6841a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i9) {
                return new SavedState[i9];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AbstractC9470b abstractC9470b) {
            this(parcel);
        }

        /* renamed from: a */
        public boolean m6754a() {
            return this.f7514b;
        }

        /* renamed from: b */
        public boolean m6755b() {
            return this.f7513a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeByte(this.f7513a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7514b ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z9, boolean z10, AbstractC9470b abstractC9470b) {
            this(parcelable, z9, z10);
        }

        public SavedState(Parcelable parcelable, boolean z9, boolean z10) {
            super(parcelable);
            this.f7513a = z9;
            this.f7514b = z10;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7513a = parcel.readByte() != 0;
            this.f7514b = parcel.readByte() != 0;
        }
    }

    /* renamed from: b */
    private boolean m6750b() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: c */
    private boolean m6751c(MotionEvent motionEvent) {
        return m6750b() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f7504a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f7505b.getIntrinsicWidth()) + this.f7504a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f7505b.getIntrinsicWidth()) - this.f7504a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f7504a));
    }

    /* renamed from: a */
    public final void m6752a() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f7507d) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.f7512i);
        }
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: d */
    public final void m6753d(boolean z9) {
        if (!z9) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f7508e = false;
        } else {
            Drawable drawable = this.f7507d ? this.f7505b : this.f7506c;
            this.f7508e = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7508e = savedState.m6755b();
        this.f7507d = savedState.m6754a();
        m6752a();
        m6753d(this.f7508e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f7508e, this.f7507d, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7508e) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zM6751c = m6751c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.f7511h || zM6751c)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.f7511h = false;
            }
        } else if (this.f7510g && zM6751c) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.f7511h = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.f7509f = true;
    }

    public final void togglePasswordIconVisibility() {
        this.f7507d = !this.f7507d;
        m6752a();
        m6753d(true);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.f7509f = true;
    }
}
