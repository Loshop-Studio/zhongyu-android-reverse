package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import p041d2.AbstractC6219b;

/* loaded from: classes3.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: a */
    public int f4971a;

    /* renamed from: b */
    public Drawable f4972b;

    /* renamed from: c */
    public Drawable f4973c;

    /* renamed from: d */
    public boolean f4974d;

    /* renamed from: e */
    public boolean f4975e;

    /* renamed from: f */
    public boolean f4976f;

    /* renamed from: g */
    public boolean f4977g;

    /* renamed from: h */
    public boolean f4978h;

    /* renamed from: i */
    public PasswordTransformationMethod f4979i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5900a();

        /* renamed from: a */
        public final boolean f4980a;

        /* renamed from: b */
        public final boolean f4981b;

        /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$SavedState$a */
        public static class C5900a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i6) {
                return new SavedState[i6];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AbstractC6219b abstractC6219b) {
            this(parcel);
        }

        /* renamed from: a */
        public boolean m4667a() {
            return this.f4981b;
        }

        /* renamed from: c */
        public boolean m4668c() {
            return this.f4980a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.f4980a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f4981b ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z6, boolean z7, AbstractC6219b abstractC6219b) {
            this(parcelable, z6, z7);
        }

        public SavedState(Parcelable parcelable, boolean z6, boolean z7) {
            super(parcelable);
            this.f4980a = z6;
            this.f4981b = z7;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4980a = parcel.readByte() != 0;
            this.f4981b = parcel.readByte() != 0;
        }
    }

    /* renamed from: b */
    private boolean m4663b() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: c */
    private boolean m4664c(MotionEvent motionEvent) {
        return m4663b() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f4971a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f4972b.getIntrinsicWidth()) + this.f4971a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f4972b.getIntrinsicWidth()) - this.f4971a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f4971a));
    }

    /* renamed from: a */
    public final void m4665a() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f4974d) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.f4979i);
        }
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: d */
    public final void m4666d(boolean z6) {
        if (!z6) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f4975e = false;
        } else {
            Drawable drawable = this.f4974d ? this.f4972b : this.f4973c;
            this.f4975e = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4975e = savedState.m4668c();
        this.f4974d = savedState.m4667a();
        m4665a();
        m4666d(this.f4975e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4975e, this.f4974d, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4975e) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zM4664c = m4664c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.f4978h || zM4664c)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.f4978h = false;
            }
        } else if (this.f4977g && zM4664c) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.f4978h = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.f4976f = true;
    }

    public final void togglePasswordIconVisibility() {
        this.f4974d = !this.f4974d;
        m4665a();
        m4666d(true);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.f4976f = true;
    }
}
