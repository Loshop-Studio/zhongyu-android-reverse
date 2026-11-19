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
import com.taobao.sophix.PatchStatus;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import p221k8.C9828a;

/* loaded from: classes5.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: c */
    public int f15898c;

    /* renamed from: d */
    public Drawable f15899d;

    /* renamed from: e */
    public Drawable f15900e;

    /* renamed from: f */
    public boolean f15901f;

    /* renamed from: g */
    public boolean f15902g;

    /* renamed from: h */
    public boolean f15903h;

    /* renamed from: i */
    public boolean f15904i;

    /* renamed from: j */
    public boolean f15905j;

    /* renamed from: k */
    public PasswordTransformationMethod f15906k;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8106a();

        /* renamed from: c */
        public final boolean f15907c;

        /* renamed from: d */
        public final boolean f15908d;

        /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$SavedState$a */
        public static class C8106a implements Parcelable.Creator {
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

        public /* synthetic */ SavedState(Parcel parcel, C8107a c8107a) {
            this(parcel);
        }

        /* renamed from: a */
        public boolean m12593a() {
            return this.f15908d;
        }

        /* renamed from: b */
        public boolean m12594b() {
            return this.f15907c;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f15907c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f15908d ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z10, boolean z11, C8107a c8107a) {
            this(parcelable, z10, z11);
        }

        public SavedState(Parcelable parcelable, boolean z10, boolean z11) {
            super(parcelable);
            this.f15907c = z10;
            this.f15908d = z11;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f15907c = parcel.readByte() != 0;
            this.f15908d = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.edittext.PasswordEditText$a */
    public class C8107a implements TextWatcher {
        public C8107a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() <= 0) {
                PasswordEditText.this.f15901f = false;
                PasswordEditText.this.m12589g();
                PasswordEditText.this.m12592l(false);
                return;
            }
            if (PasswordEditText.this.f15903h) {
                PasswordEditText.this.setCompoundDrawablesRelative(null, null, null, null);
                PasswordEditText.this.f15903h = false;
                PasswordEditText.this.m12592l(true);
            }
            if (PasswordEditText.this.f15902g) {
                return;
            }
            PasswordEditText.this.m12592l(true);
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
    private boolean m12587i() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: j */
    private boolean m12588j(MotionEvent motionEvent) {
        return m12587i() ? motionEvent.getX() > ((float) (getPaddingLeft() - this.f15898c)) && motionEvent.getX() < ((float) ((getPaddingLeft() + this.f15899d.getIntrinsicWidth()) + this.f15898c)) : motionEvent.getX() > ((float) (((getWidth() - getPaddingRight()) - this.f15899d.getIntrinsicWidth()) - this.f15898c)) && motionEvent.getX() < ((float) ((getWidth() - getPaddingRight()) + this.f15898c));
    }

    /* renamed from: g */
    public final void m12589g() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f15901f) {
            setTransformationMethod(null);
        } else {
            setTransformationMethod(this.f15906k);
        }
        setSelection(selectionStart, selectionEnd);
    }

    /* renamed from: h */
    public void m12590h(Context context, AttributeSet attributeSet, int i10) {
        this.f15898c = AbstractC8037c.m12187a(20.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PasswordEditText, i10, 0);
        try {
            Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.PasswordEditText_pet_iconShow);
            this.f15899d = drawableM12206g;
            if (drawableM12206g == null) {
                this.f15899d = AbstractC8040f.m12211l(getContext(), R$drawable.pet_icon_visibility_24dp);
            }
            Drawable drawableM12206g2 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.PasswordEditText_pet_iconHide);
            this.f15900e = drawableM12206g2;
            if (drawableM12206g2 == null) {
                this.f15900e = AbstractC8040f.m12211l(getContext(), R$drawable.pet_icon_visibility_off_24dp);
            }
            this.f15904i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_hoverShowsPw, false);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_nonMonospaceFont, false);
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_enableIconAlpha, true);
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.PasswordEditText_pet_isAsteriskStyle, false)) {
                this.f15906k = C9828a.getInstance();
            } else {
                this.f15906k = PasswordTransformationMethod.getInstance();
            }
            typedArrayObtainStyledAttributes.recycle();
            if (z11) {
                this.f15900e.setAlpha(PatchStatus.CODE_LOAD_LIB_NS);
                this.f15899d.setAlpha(96);
            }
            if (z10) {
                setTypeface(Typeface.DEFAULT);
            }
            addTextChangedListener(new C8107a());
            m12589g();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: k */
    public PasswordEditText m12591k(boolean z10) {
        if (z10) {
            this.f15906k = C9828a.getInstance();
            return this;
        }
        this.f15906k = PasswordTransformationMethod.getInstance();
        return this;
    }

    /* renamed from: l */
    public final void m12592l(boolean z10) {
        if (!z10) {
            setCompoundDrawablesRelative(null, null, null, null);
            this.f15902g = false;
        } else {
            Drawable drawable = this.f15901f ? this.f15899d : this.f15900e;
            this.f15902g = true;
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f15902g = savedState.m12594b();
        this.f15901f = savedState.m12593a();
        m12589g();
        m12592l(this.f15902g);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f15902g, this.f15901f, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15902g) {
            return super.onTouchEvent(motionEvent);
        }
        boolean zM12588j = m12588j(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (this.f15905j || zM12588j)) {
                togglePasswordIconVisibility();
                motionEvent.setAction(3);
                this.f15905j = false;
            }
        } else if (this.f15904i && zM12588j) {
            togglePasswordIconVisibility();
            motionEvent.setAction(3);
            this.f15905j = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        this.f15903h = true;
    }

    public final void togglePasswordIconVisibility() {
        this.f15901f = !this.f15901f;
        m12589g();
        m12592l(true);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.PasswordEditTextStyle);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12590h(context, attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        super.setError(charSequence, drawable);
        this.f15903h = true;
    }
}
