package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class TintTypedArray {
    private final Context mContext;
    private TypedValue mTypedValue;
    private final TypedArray mWrapped;

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static int getChangingConfigurations(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        public static int getType(TypedArray typedArray, int i6) {
            return typedArray.getType(i6);
        }
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i6, boolean z6) {
        return this.mWrapped.getBoolean(i6, z6);
    }

    @RequiresApi(21)
    public int getChangingConfigurations() {
        return Api21Impl.getChangingConfigurations(this.mWrapped);
    }

    public int getColor(int i6, int i7) {
        return this.mWrapped.getColor(i6, i7);
    }

    public ColorStateList getColorStateList(int i6) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.mWrapped.hasValue(i6) || (resourceId = this.mWrapped.getResourceId(i6, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(this.mContext, resourceId)) == null) ? this.mWrapped.getColorStateList(i6) : colorStateList;
    }

    public float getDimension(int i6, float f6) {
        return this.mWrapped.getDimension(i6, f6);
    }

    public int getDimensionPixelOffset(int i6, int i7) {
        return this.mWrapped.getDimensionPixelOffset(i6, i7);
    }

    public int getDimensionPixelSize(int i6, int i7) {
        return this.mWrapped.getDimensionPixelSize(i6, i7);
    }

    public Drawable getDrawable(int i6) {
        int resourceId;
        return (!this.mWrapped.hasValue(i6) || (resourceId = this.mWrapped.getResourceId(i6, 0)) == 0) ? this.mWrapped.getDrawable(i6) : AppCompatResources.getDrawable(this.mContext, resourceId);
    }

    public Drawable getDrawableIfKnown(int i6) {
        int resourceId;
        if (!this.mWrapped.hasValue(i6) || (resourceId = this.mWrapped.getResourceId(i6, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
    }

    public float getFloat(int i6, float f6) {
        return this.mWrapped.getFloat(i6, f6);
    }

    @Nullable
    public Typeface getFont(@StyleableRes int i6, int i7, @Nullable ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.mWrapped.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        return ResourcesCompat.getFont(this.mContext, resourceId, this.mTypedValue, i7, fontCallback);
    }

    public float getFraction(int i6, int i7, int i8, float f6) {
        return this.mWrapped.getFraction(i6, i7, i8, f6);
    }

    public int getIndex(int i6) {
        return this.mWrapped.getIndex(i6);
    }

    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }

    public int getInt(int i6, int i7) {
        return this.mWrapped.getInt(i6, i7);
    }

    public int getInteger(int i6, int i7) {
        return this.mWrapped.getInteger(i6, i7);
    }

    public int getLayoutDimension(int i6, String str) {
        return this.mWrapped.getLayoutDimension(i6, str);
    }

    public String getNonResourceString(int i6) {
        return this.mWrapped.getNonResourceString(i6);
    }

    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }

    public int getResourceId(int i6, int i7) {
        return this.mWrapped.getResourceId(i6, i7);
    }

    public Resources getResources() {
        return this.mWrapped.getResources();
    }

    public String getString(int i6) {
        return this.mWrapped.getString(i6);
    }

    public CharSequence getText(int i6) {
        return this.mWrapped.getText(i6);
    }

    public CharSequence[] getTextArray(int i6) {
        return this.mWrapped.getTextArray(i6);
    }

    public int getType(int i6) {
        return Api21Impl.getType(this.mWrapped, i6);
    }

    public boolean getValue(int i6, TypedValue typedValue) {
        return this.mWrapped.getValue(i6, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.mWrapped;
    }

    public boolean hasValue(int i6) {
        return this.mWrapped.hasValue(i6);
    }

    public int length() {
        return this.mWrapped.length();
    }

    public TypedValue peekValue(int i6) {
        return this.mWrapped.peekValue(i6);
    }

    public void recycle() {
        this.mWrapped.recycle();
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i6, i7));
    }

    public int getLayoutDimension(int i6, int i7) {
        return this.mWrapped.getLayoutDimension(i6, i7);
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i6, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i6, iArr));
    }
}
