package com.xuexiang.xui.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6875e;
import p022b2.C5029a;

/* loaded from: classes4.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: a */
    public int f7650a;

    /* renamed from: b */
    public Drawable f7651b;

    /* renamed from: c */
    public Drawable f7652c;

    /* renamed from: d */
    public boolean f7653d;

    /* renamed from: e */
    public boolean f7654e;

    /* renamed from: f */
    public boolean f7655f;

    /* renamed from: g */
    public boolean f7656g;

    /* renamed from: h */
    public boolean f7657h;

    /* renamed from: i */
    public PasswordTransformationMethod f7658i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6926a();

        /* renamed from: a */
        public final boolean f7659a;

        /* renamed from: b */
        public final boolean f7660b;

        /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$SavedState$a */
        public static class C6926a implements Parcelable.Creator {
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

        public /* synthetic */ SavedState(Parcel parcel, C6927a c6927a) {
            this(parcel);
        }

        /* renamed from: a */
        public boolean m6836a() {
            return this.f7660b;
        }

        /* renamed from: b */
        public boolean m6837b() {
            return this.f7659a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f7659a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7660b ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z10, boolean z11, C6927a c6927a) {
            this(parcelable, z10, z11);
        }

        public SavedState(Parcelable parcelable, boolean z10, boolean z11) {
            super(parcelable);
            this.f7659a = z10;
            this.f7660b = z11;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7659a = parcel.readByte() != 0;
            this.f7660b = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$a */
    public class C6927a implements TextWatcher {
        public C6927a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() <= 0) {
                PasswordEditText.this.f7653d = false;
                PasswordEditText.this.m6832g();
                PasswordEditText.this.m6835l(false);
                return;
            }
            if (PasswordEditText.this.f7655f) {
                PasswordEditText.this.setCompoundDrawablesRelative(null, null, null, null);
                PasswordEditText.this.f7655f = false;
                PasswordEditText.this.m6835l(true);
            }
            if (PasswordEditText.this.f7654e) {
                return;
            }
            PasswordEditText.this.m6835l(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public PasswordEditText(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private boolean m6830i() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: j */
    private boolean m6831j(MotionEvent motionEvent) {
        return m6830i() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f7650a)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f7651b.getIntrinsicWidth()) + this.f7650a)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f7651b.getIntrinsicWidth()) - this.f7650a)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f7650a));
    }

    /* renamed from: g */
    public final void m6832g() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f7653d) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.f7658i);
        }
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: h */
    public void m6833h(Context context, AttributeSet attributeSet, int i10) {
        this.f7650a = AbstractC6872b.m6425a(context, 20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PasswordEditText, i10, 0);
        try {
            Drawable drawableM6453i = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.PasswordEditText_pet_iconShow);
            this.f7651b = drawableM6453i;
            if (drawableM6453i == null) {
                this.f7651b = AbstractC6875e.m6459o(getContext(), R$drawable.pet_icon_visibility_24dp);
            }
            Drawable drawableM6453i2 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.PasswordEditText_pet_iconHide);
            this.f7652c = drawableM6453i2;
            if (drawableM6453i2 == null) {
                this.f7652c = AbstractC6875e.m6459o(getContext(), R$drawable.pet_icon_visibility_off_24dp);
            }
            this.f7656g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_hoverShowsPw, false);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_nonMonospaceFont, false);
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_enableIconAlpha, true);
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_isAsteriskStyle, false)) {
                this.f7658i = C5029a.getInstance();
            } else {
                this.f7658i = PasswordTransformationMethod.getInstance();
            }
            typedArrayObtainStyledAttributes.recycle();
            if (z11) {
                this.f7652c.setAlpha(137);
                this.f7651b.setAlpha(96);
            }
            if (z10) {
                setTypeface(Typeface.DEFAULT);
            }
            addTextChangedListener(new C6927a());
            m6832g();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: k */
    public PasswordEditText m6834k(boolean z10) {
        if (z10) {
            this.f7658i = C5029a.getInstance();
            return this;
        }
        this.f7658i = PasswordTransformationMethod.getInstance();
        return this;
    }

    /* renamed from: l */
    public final void m6835l(boolean z10) {
        if (!z10) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f7654e = false;
        } else {
            Drawable drawable = this.f7653d ? this.f7651b : this.f7652c;
            this.f7654e = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7654e = savedState.m6837b();
        this.f7653d = savedState.m6836a();
        m6832g();
        m6835l(this.f7654e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f7654e, this.f7653d, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7654e) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zM6831j = m6831j(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.f7657h || zM6831j)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.f7657h = false;
            }
        } else if (this.f7656g && zM6831j) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.f7657h = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.f7655f = true;
    }

    public final void togglePasswordIconVisibility() {
        this.f7653d = !this.f7653d;
        m6832g();
        m6835l(true);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.PasswordEditTextStyle);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m6833h(context, attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.f7655f = true;
    }
}
