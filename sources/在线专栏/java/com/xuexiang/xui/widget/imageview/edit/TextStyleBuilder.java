package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TextStyleBuilder {
    private Map<TextStyle, Object> values = new HashMap();

    /* renamed from: com.xuexiang.xui.widget.imageview.edit.TextStyleBuilder$1 */
    static /* synthetic */ class C21931 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$imageview$edit$TextStyleBuilder$TextStyle */
        static final /* synthetic */ int[] f9692xd3ab0245;

        static {
            int[] iArr = new int[TextStyle.values().length];
            f9692xd3ab0245 = iArr;
            try {
                iArr[TextStyle.SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9692xd3ab0245[TextStyle.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9692xd3ab0245[TextStyle.FONT_FAMILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9692xd3ab0245[TextStyle.GRAVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9692xd3ab0245[TextStyle.BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9692xd3ab0245[TextStyle.TEXT_APPEARANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected enum TextStyle {
        SIZE("TextSize"),
        COLOR("TextColor"),
        GRAVITY("Gravity"),
        FONT_FAMILY("FontFamily"),
        BACKGROUND("Background"),
        TEXT_APPEARANCE("TextAppearance");

        private String property;

        TextStyle(String str) {
            this.property = str;
        }

        public String getProperty() {
            return this.property;
        }
    }

    protected void applyBackgroundColor(TextView textView, int i4) {
        textView.setBackgroundColor(i4);
    }

    protected void applyBackgroundDrawable(TextView textView, Drawable drawable) {
        textView.setBackground(drawable);
    }

    protected void applyFontFamily(TextView textView, Typeface typeface) {
        textView.setTypeface(typeface);
    }

    protected void applyGravity(TextView textView, int i4) {
        textView.setGravity(i4);
    }

    void applyStyle(TextView textView) {
        for (Map.Entry<TextStyle, Object> entry : this.values.entrySet()) {
            switch (C21931.f9692xd3ab0245[entry.getKey().ordinal()]) {
                case 1:
                    applyTextSize(textView, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    applyTextColor(textView, ((Integer) entry.getValue()).intValue());
                    break;
                case 3:
                    applyFontFamily(textView, (Typeface) entry.getValue());
                    break;
                case 4:
                    applyGravity(textView, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    if (entry.getValue() instanceof Drawable) {
                        applyBackgroundDrawable(textView, (Drawable) entry.getValue());
                        break;
                    } else if (entry.getValue() instanceof Integer) {
                        applyBackgroundColor(textView, ((Integer) entry.getValue()).intValue());
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (entry.getValue() instanceof Integer) {
                        applyTextAppearance(textView, ((Integer) entry.getValue()).intValue());
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    protected void applyTextAppearance(TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i4);
        } else {
            textView.setTextAppearance(textView.getContext(), i4);
        }
    }

    protected void applyTextColor(TextView textView, int i4) {
        textView.setTextColor(i4);
    }

    protected void applyTextSize(TextView textView, float f4) {
        textView.setTextSize(f4);
    }

    protected Map<TextStyle, Object> getValues() {
        return this.values;
    }

    public void withBackgroundColor(int i4) {
        this.values.put(TextStyle.BACKGROUND, Integer.valueOf(i4));
    }

    public void withBackgroundDrawable(Drawable drawable) {
        this.values.put(TextStyle.BACKGROUND, drawable);
    }

    public void withGravity(int i4) {
        this.values.put(TextStyle.GRAVITY, Integer.valueOf(i4));
    }

    public void withTextAppearance(int i4) {
        this.values.put(TextStyle.TEXT_APPEARANCE, Integer.valueOf(i4));
    }

    public void withTextColor(int i4) {
        this.values.put(TextStyle.COLOR, Integer.valueOf(i4));
    }

    public void withTextFont(Typeface typeface) {
        this.values.put(TextStyle.FONT_FAMILY, typeface);
    }

    public void withTextSize(float f4) {
        this.values.put(TextStyle.SIZE, Float.valueOf(f4));
    }
}
