package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import p123t0.AbstractC4582b;

/* loaded from: classes2.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: a */
    public int f3450a;

    /* renamed from: b */
    public Drawable f3451b;

    /* renamed from: c */
    public Drawable f3452c;

    /* renamed from: d */
    public boolean f3453d;

    /* renamed from: e */
    public boolean f3454e;

    /* renamed from: f */
    public boolean f3455f;

    /* renamed from: g */
    public boolean f3456g;

    /* renamed from: h */
    public boolean f3457h;

    /* renamed from: i */
    public PasswordTransformationMethod f3458i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3561a();

        /* renamed from: a */
        public final boolean f3459a;

        /* renamed from: b */
        public final boolean f3460b;

        /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$SavedState$a */
        public static class C3561a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AbstractC4582b abstractC4582b) {
            this(parcel);
        }

        /* renamed from: b */
        public boolean m4290b() {
            return this.f3460b;
        }

        /* renamed from: d */
        public boolean m4291d() {
            return this.f3459a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f3459a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f3460b ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z3, boolean z4, AbstractC4582b abstractC4582b) {
            this(parcelable, z3, z4);
        }

        public SavedState(Parcelable parcelable, boolean z3, boolean z4) {
            super(parcelable);
            this.f3459a = z3;
            this.f3460b = z4;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3459a = parcel.readByte() != 0;
            this.f3460b = parcel.readByte() != 0;
        }
    }

    /* renamed from: a */
    public final void m4286a() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f3453d) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.f3458i);
        }
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: b */
    public final boolean m4287b() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: c */
    public final boolean m4288c(MotionEvent motionEvent) {
        if (m4287b()) {
            if (motionEvent.getX() > getPaddingLeft() - this.f3450a && motionEvent.getX() < getPaddingLeft() + this.f3451b.getIntrinsicWidth() + this.f3450a) {
                return true;
            }
        } else if (motionEvent.getX() > ((getWidth() - getPaddingRight()) - this.f3451b.getIntrinsicWidth()) - this.f3450a && motionEvent.getX() < (getWidth() - getPaddingRight()) + this.f3450a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m4289d(boolean z3) {
        if (!z3) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f3454e = false;
        } else {
            Drawable drawable = this.f3453d ? this.f3451b : this.f3452c;
            this.f3454e = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3454e = savedState.m4291d();
        this.f3453d = savedState.m4290b();
        m4286a();
        m4289d(this.f3454e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f3454e, this.f3453d, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3454e) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zM4288c = m4288c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.f3457h || zM4288c)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.f3457h = false;
            }
        } else if (this.f3456g && zM4288c) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.f3457h = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.f3455f = true;
    }

    public final void togglePasswordIconVisibility() {
        this.f3453d = !this.f3453d;
        m4286a();
        m4289d(true);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.f3455f = true;
    }
}
