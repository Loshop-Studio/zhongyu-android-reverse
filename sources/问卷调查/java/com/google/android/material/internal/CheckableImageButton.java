package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p031h.p043j.C0266o;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p074b.p075a.p076a.p096r.C0646a;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f4956g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f4957d;

    /* renamed from: e */
    public boolean f4958e;

    /* renamed from: f */
    public boolean f4959f;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C0939a extends AbstractC0287a {
        public static final Parcelable.Creator<C0939a> CREATOR = new a();

        /* renamed from: d */
        public boolean f4960d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0939a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0939a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0939a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0939a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0939a(parcel, classLoader);
            }
        }

        public C0939a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4960d = parcel.readInt() == 1;
        }

        public C0939a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeInt(this.f4960d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1088R.attr.imageButtonStyle);
        this.f4958e = true;
        this.f4959f = true;
        C0266o.m875n(this, new C0646a(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4957d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f4957d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f4956g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0939a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0939a c0939a = (C0939a) parcelable;
        super.onRestoreInstanceState(c0939a.f1718b);
        setChecked(c0939a.f4960d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0939a c0939a = new C0939a(super.onSaveInstanceState());
        c0939a.f4960d = this.f4957d;
        return c0939a;
    }

    public void setCheckable(boolean z) {
        if (this.f4958e != z) {
            this.f4958e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f4958e || this.f4957d == z) {
            return;
        }
        this.f4957d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f4959f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f4959f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4957d);
    }
}
