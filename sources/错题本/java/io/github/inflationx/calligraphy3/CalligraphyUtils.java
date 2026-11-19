package io.github.inflationx.calligraphy3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes3.dex */
public final class CalligraphyUtils {
    public static final int[] ANDROID_ATTR_TEXT_APPEARANCE = {android.R.attr.textAppearance};
    private static Boolean sToolbarCheck = null;
    private static Boolean sAppCompatViewCheck = null;

    private CalligraphyUtils() {
    }

    public static boolean applyFontToTextView(TextView textView, Typeface typeface) {
        return applyFontToTextView(textView, typeface, false);
    }

    public static CharSequence applyTypefaceSpan(CharSequence charSequence, Typeface typeface) {
        if (charSequence != null && charSequence.length() > 0) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = new SpannableString(charSequence);
            }
            ((Spannable) charSequence).setSpan(TypefaceUtils.getSpan(typeface), 0, charSequence.length(), 33);
        }
        return charSequence;
    }

    public static boolean canAddV7AppCompatViews() {
        if (sAppCompatViewCheck == null) {
            try {
                int i = AppCompatTextView.f185a;
                sAppCompatViewCheck = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                sAppCompatViewCheck = Boolean.FALSE;
            }
        }
        return sAppCompatViewCheck.booleanValue();
    }

    public static boolean canCheckForV7Toolbar() {
        if (sToolbarCheck == null) {
            try {
                int i = Toolbar.f186a;
                sToolbarCheck = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                sToolbarCheck = Boolean.FALSE;
            }
        }
        return sToolbarCheck.booleanValue();
    }

    public static String pullFontPathFromStyle(Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes;
        if (iArr != null && attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr)) != null) {
            try {
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    typedArrayObtainStyledAttributes.recycle();
                    return string;
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return null;
    }

    public static String pullFontPathFromTextAppearance(Context context, AttributeSet attributeSet, int[] iArr) throws Resources.NotFoundException {
        if (iArr != null && attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_ATTR_TEXT_APPEARANCE);
            int resourceId = -1;
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                } catch (Exception unused) {
                    return null;
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            if (typedArrayObtainStyledAttributes2 != null) {
                try {
                    return typedArrayObtainStyledAttributes2.getString(0);
                } catch (Exception unused2) {
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return null;
    }

    public static String pullFontPathFromTheme(Context context, int i, int[] iArr) throws Resources.NotFoundException {
        if (i != -1 && iArr != null) {
            Resources.Theme theme = context.getTheme();
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(i, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, iArr);
            try {
                return typedArrayObtainStyledAttributes.getString(0);
            } catch (Exception unused) {
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        return null;
    }

    public static String pullFontPathFromView(Context context, AttributeSet attributeSet, int[] iArr) throws Resources.NotFoundException, NumberFormatException {
        CharSequence charSequence;
        if (iArr != null && attributeSet != null) {
            try {
                String resourceEntryName = context.getResources().getResourceEntryName(iArr[0]);
                int attributeResourceValue = attributeSet.getAttributeResourceValue(null, resourceEntryName, -1);
                String string = attributeResourceValue > 0 ? context.getString(attributeResourceValue) : attributeSet.getAttributeValue(null, resourceEntryName);
                if (string != null && string.startsWith("?") && string.length() > 1) {
                    String strSubstring = string.substring(1);
                    if (TextUtils.isDigitsOnly(strSubstring)) {
                        int i = Integer.parseInt(strSubstring);
                        TypedValue typedValue = new TypedValue();
                        context.getTheme().resolveAttribute(i, typedValue, true);
                        if (typedValue.type == 3 && (charSequence = typedValue.string) != null) {
                            return charSequence.toString();
                        }
                    }
                }
                return string;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean applyFontToTextView(TextView textView, final Typeface typeface, boolean z8) {
        if (textView == null || typeface == null) {
            return false;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 129);
        textView.setTypeface(typeface);
        if (!z8) {
            return true;
        }
        textView.setText(applyTypefaceSpan(textView.getText(), typeface), TextView.BufferType.SPANNABLE);
        textView.addTextChangedListener(new TextWatcher() { // from class: io.github.inflationx.calligraphy3.CalligraphyUtils.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CalligraphyUtils.applyTypefaceSpan(editable, typeface);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
            }
        });
        return true;
    }

    public static boolean applyFontToTextView(Context context, TextView textView, String str) {
        return applyFontToTextView(context, textView, str, false);
    }

    public static boolean applyFontToTextView(Context context, TextView textView, String str, boolean z8) {
        if (textView == null || context == null) {
            return false;
        }
        return applyFontToTextView(textView, TypefaceUtils.load(context.getAssets(), str), z8);
    }

    public static String pullFontPathFromTheme(Context context, int i, int i8, int[] iArr) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes;
        if (i != -1 && iArr != null) {
            Resources.Theme theme = context.getTheme();
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(i, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(typedValue.resourceId, new int[]{i8});
            try {
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                if (resourceId != -1 && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, iArr)) != null) {
                    try {
                        return typedArrayObtainStyledAttributes.getString(0);
                    } catch (Exception unused) {
                    } finally {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                }
                return null;
            } catch (Exception unused2) {
            } finally {
                typedArrayObtainStyledAttributes2.recycle();
            }
        }
        return null;
    }

    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig) {
        applyFontToTextView(context, textView, calligraphyConfig, false);
    }

    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, boolean z8) {
        if (context == null || textView == null || calligraphyConfig == null || !calligraphyConfig.isFontSet()) {
            return;
        }
        applyFontToTextView(context, textView, calligraphyConfig.getFontPath(), z8);
    }

    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, String str) {
        applyFontToTextView(context, textView, calligraphyConfig, str, false);
    }

    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, String str, boolean z8) {
        if (context == null || textView == null || calligraphyConfig == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || !applyFontToTextView(context, textView, str, z8)) {
            applyFontToTextView(context, textView, calligraphyConfig, z8);
        }
    }
}
