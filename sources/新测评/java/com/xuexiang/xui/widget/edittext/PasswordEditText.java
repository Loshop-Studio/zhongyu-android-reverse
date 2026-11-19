package com.xuexiang.xui.widget.edittext;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import p033c3.AbstractC5115b;

/* loaded from: classes4.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: a */
    public int f6246a;

    /* renamed from: b */
    public Drawable f6247b;

    /* renamed from: c */
    public Drawable f6248c;

    /* renamed from: d */
    public boolean f6249d;

    /* renamed from: e */
    public boolean f6250e;

    /* renamed from: f */
    public boolean f6251f;

    /* renamed from: g */
    public boolean f6252g;

    /* renamed from: h */
    public boolean f6253h;

    /* renamed from: i */
    public PasswordTransformationMethod f6254i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6521a();

        /* renamed from: a */
        public final boolean f6255a;

        /* renamed from: b */
        public final boolean f6256b;

        /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$SavedState$a */
        public static class C6521a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AbstractC5115b abstractC5115b) {
            this(parcel);
        }

        /* renamed from: a */
        public boolean m5648a() {
            return this.f6256b;
        }

        /* renamed from: b */
        public boolean m5649b() {
            return this.f6255a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f6255a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6256b ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z9, boolean z10, AbstractC5115b abstractC5115b) {
            this(parcelable, z9, z10);
        }

        public SavedState(Parcelable parcelable, boolean z9, boolean z10) {
            super(parcelable);
            this.f6255a = z9;
            this.f6256b = z10;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6255a = parcel.readByte() != 0;
            this.f6256b = parcel.readByte() != 0;
        }
    }

    /* renamed from: b */
    private boolean m5644b() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: c */
    private boolean m5645c(MotionEvent motionEvent) {
        return m5644b() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f6246a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f6247b.getIntrinsicWidth()) + this.f6246a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f6247b.getIntrinsicWidth()) - this.f6246a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f6246a));
    }

    /* renamed from: a */
    public final void m5646a() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f6249d) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.f6254i);
        }
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: d */
    public final void m5647d(boolean z9) {
        if (!z9) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f6250e = false;
        } else {
            Drawable drawable = this.f6249d ? this.f6247b : this.f6248c;
            this.f6250e = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6250e = savedState.m5649b();
        this.f6249d = savedState.m5648a();
        m5646a();
        m5647d(this.f6250e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f6250e, this.f6249d, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6250e) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zM5645c = m5645c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.f6253h || zM5645c)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.f6253h = false;
            }
        } else if (this.f6252g && zM5645c) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.f6253h = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.f6251f = true;
    }

    public final void togglePasswordIconVisibility() {
        this.f6249d = !this.f6249d;
        m5646a();
        m5647d(true);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.f6251f = true;
    }
}
