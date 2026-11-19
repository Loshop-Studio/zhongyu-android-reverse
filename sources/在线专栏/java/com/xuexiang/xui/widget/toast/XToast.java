package com.xuexiang.xui.widget.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.xuexiang.xui.C2042R;

@SuppressLint({"InflateParams"})
/* loaded from: classes.dex */
public class XToast {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    private static Toast lastToast;

    public static class Config {
        private static final Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", 0);
        private static volatile Config sInstance;
        private Typeface typeface = LOADED_TOAST_TYPEFACE;
        private int textSize = -1;
        private boolean tintIcon = true;
        private boolean allowQueue = true;
        private int alpha = -1;
        private int gravity = -1;
        private int xOffset = 0;
        private int yOffset = 0;

        private Config() {
        }

        public static Config get() {
            if (sInstance == null) {
                synchronized (Config.class) {
                    if (sInstance == null) {
                        sInstance = new Config();
                    }
                }
            }
            return sInstance;
        }

        public Config allowQueue(boolean z3) {
            this.allowQueue = z3;
            return this;
        }

        public void reset() {
            this.typeface = LOADED_TOAST_TYPEFACE;
            this.textSize = -1;
            this.tintIcon = true;
            this.allowQueue = true;
            this.alpha = -1;
            this.gravity = -1;
            this.xOffset = 0;
            this.yOffset = 0;
        }

        public Config resetGravity() {
            this.gravity = -1;
            this.xOffset = 0;
            this.yOffset = 0;
            return this;
        }

        public Config setAlpha(int i4) {
            this.alpha = i4;
            return this;
        }

        public Config setGravity(int i4) {
            this.gravity = i4;
            return this;
        }

        public Config setTextSize(int i4) {
            this.textSize = i4;
            return this;
        }

        public Config setToastTypeface(Typeface typeface) {
            if (typeface != null) {
                this.typeface = typeface;
            }
            return this;
        }

        public Config setXOffset(int i4) {
            this.xOffset = i4;
            return this;
        }

        public Config setYOffset(int i4) {
            this.yOffset = i4;
            return this;
        }

        public Config tintIcon(boolean z3) {
            this.tintIcon = z3;
            return this;
        }

        public Config setGravity(int i4, int i5, int i6) {
            this.gravity = i4;
            this.xOffset = i5;
            this.yOffset = i6;
            return this;
        }
    }

    private XToast() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Toast custom(Context context, int i4, Drawable drawable, int i5, boolean z3) {
        return custom(context, (CharSequence) context.getString(i4), drawable, -1, Utils.getColor(context, C2042R.color.toast_default_text_color), i5, z3, false);
    }

    public static Toast error(Context context, int i4) {
        return error(context, (CharSequence) context.getString(i4), 0, true);
    }

    public static Toast info(Context context, int i4) {
        return info(context, (CharSequence) context.getString(i4), 0, true);
    }

    public static Toast normal(Context context, int i4) {
        return normal(context, (CharSequence) context.getString(i4), 0, (Drawable) null, false);
    }

    public static Toast success(Context context, int i4) {
        return success(context, (CharSequence) context.getString(i4), 0, true);
    }

    public static Toast warning(Context context, int i4) {
        return warning(context, (CharSequence) context.getString(i4), 0, true);
    }

    public static Toast custom(Context context, CharSequence charSequence, Drawable drawable, int i4, boolean z3) {
        return custom(context, charSequence, drawable, -1, Utils.getColor(context, C2042R.color.toast_default_text_color), i4, z3, false);
    }

    public static Toast error(Context context, CharSequence charSequence) {
        return error(context, charSequence, 0, true);
    }

    public static Toast info(Context context, CharSequence charSequence) {
        return info(context, charSequence, 0, true);
    }

    public static Toast normal(Context context, CharSequence charSequence) {
        return normal(context, charSequence, 0, (Drawable) null, false);
    }

    public static Toast success(Context context, CharSequence charSequence) {
        return success(context, charSequence, 0, true);
    }

    public static Toast warning(Context context, CharSequence charSequence) {
        return warning(context, charSequence, 0, true);
    }

    public static Toast custom(Context context, int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
        return custom(context, context.getString(i4), Utils.getDrawable(context, i5), Utils.getColor(context, i6), Utils.getColor(context, C2042R.color.toast_default_text_color), i7, z3, z4);
    }

    public static Toast error(Context context, int i4, int i5) {
        return error(context, (CharSequence) context.getString(i4), i5, true);
    }

    public static Toast info(Context context, int i4, int i5) {
        return info(context, (CharSequence) context.getString(i4), i5, true);
    }

    public static Toast normal(Context context, int i4, Drawable drawable) {
        return normal(context, (CharSequence) context.getString(i4), 0, drawable, true);
    }

    public static Toast success(Context context, int i4, int i5) {
        return success(context, (CharSequence) context.getString(i4), i5, true);
    }

    public static Toast warning(Context context, int i4, int i5) {
        return warning(context, (CharSequence) context.getString(i4), i5, true);
    }

    public static Toast error(Context context, CharSequence charSequence, int i4) {
        return error(context, charSequence, i4, true);
    }

    public static Toast info(Context context, CharSequence charSequence, int i4) {
        return info(context, charSequence, i4, true);
    }

    public static Toast normal(Context context, CharSequence charSequence, Drawable drawable) {
        return normal(context, charSequence, 0, drawable, true);
    }

    public static Toast success(Context context, CharSequence charSequence, int i4) {
        return success(context, charSequence, i4, true);
    }

    public static Toast warning(Context context, CharSequence charSequence, int i4) {
        return warning(context, charSequence, i4, true);
    }

    public static Toast error(Context context, int i4, int i5, boolean z3) {
        return custom(context, (CharSequence) context.getString(i4), Utils.getDrawable(context, C2042R.drawable.xtoast_ic_clear_white_24dp), Utils.getColor(context, C2042R.color.toast_error_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i5, z3, true);
    }

    public static Toast info(Context context, int i4, int i5, boolean z3) {
        return custom(context, (CharSequence) context.getString(i4), Utils.getDrawable(context, C2042R.drawable.xtoast_ic_info_outline_white_24dp), Utils.getColor(context, C2042R.color.toast_info_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i5, z3, true);
    }

    public static Toast normal(Context context, int i4, int i5) {
        return normal(context, (CharSequence) context.getString(i4), i5, (Drawable) null, false);
    }

    public static Toast success(Context context, int i4, int i5, boolean z3) {
        return custom(context, (CharSequence) context.getString(i4), Utils.getDrawable(context, C2042R.drawable.xtoast_ic_check_white_24dp), Utils.getColor(context, C2042R.color.toast_success_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i5, z3, true);
    }

    public static Toast warning(Context context, int i4, int i5, boolean z3) {
        return custom(context, (CharSequence) context.getString(i4), Utils.getDrawable(context, C2042R.drawable.xtoast_ic_error_outline_white_24dp), Utils.getColor(context, C2042R.color.toast_warning_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i5, z3, true);
    }

    public static Toast custom(Context context, CharSequence charSequence, int i4, int i5, int i6, boolean z3, boolean z4) {
        return custom(context, charSequence, Utils.getDrawable(context, i4), Utils.getColor(context, i5), Utils.getColor(context, C2042R.color.toast_default_text_color), i6, z3, z4);
    }

    public static Toast normal(Context context, CharSequence charSequence, int i4) {
        return normal(context, charSequence, i4, (Drawable) null, false);
    }

    public static Toast normal(Context context, int i4, int i5, Drawable drawable) {
        return normal(context, (CharSequence) context.getString(i4), i5, drawable, true);
    }

    public static Toast error(Context context, CharSequence charSequence, int i4, boolean z3) {
        return custom(context, charSequence, Utils.getDrawable(context, C2042R.drawable.xtoast_ic_clear_white_24dp), Utils.getColor(context, C2042R.color.toast_error_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i4, z3, true);
    }

    public static Toast info(Context context, CharSequence charSequence, int i4, boolean z3) {
        return custom(context, charSequence, Utils.getDrawable(context, C2042R.drawable.xtoast_ic_info_outline_white_24dp), Utils.getColor(context, C2042R.color.toast_info_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i4, z3, true);
    }

    public static Toast normal(Context context, CharSequence charSequence, int i4, Drawable drawable) {
        return normal(context, charSequence, i4, drawable, true);
    }

    public static Toast success(Context context, CharSequence charSequence, int i4, boolean z3) {
        return custom(context, charSequence, Utils.getDrawable(context, C2042R.drawable.xtoast_ic_check_white_24dp), Utils.getColor(context, C2042R.color.toast_success_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i4, z3, true);
    }

    public static Toast warning(Context context, CharSequence charSequence, int i4, boolean z3) {
        return custom(context, charSequence, Utils.getDrawable(context, C2042R.drawable.xtoast_ic_error_outline_white_24dp), Utils.getColor(context, C2042R.color.toast_warning_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i4, z3, true);
    }

    public static Toast custom(Context context, int i4, Drawable drawable, int i5, int i6, boolean z3, boolean z4) {
        return custom(context, context.getString(i4), drawable, Utils.getColor(context, i5), Utils.getColor(context, C2042R.color.toast_default_text_color), i6, z3, z4);
    }

    public static Toast normal(Context context, int i4, int i5, Drawable drawable, boolean z3) {
        return custom(context, (CharSequence) context.getString(i4), drawable, Utils.getColor(context, C2042R.color.toast_normal_tint_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i5, z3, true);
    }

    public static Toast custom(Context context, int i4, Drawable drawable, int i5, int i6, int i7, boolean z3, boolean z4) {
        return custom(context, context.getString(i4), drawable, Utils.getColor(context, i5), Utils.getColor(context, i6), i7, z3, z4);
    }

    public static Toast normal(Context context, CharSequence charSequence, int i4, Drawable drawable, boolean z3) {
        return custom(context, charSequence, drawable, Utils.getColor(context, C2042R.color.toast_normal_tint_color), Utils.getColor(context, C2042R.color.toast_default_text_color), i4, z3, true);
    }

    @SuppressLint({"ShowToast"})
    public static Toast custom(Context context, CharSequence charSequence, Drawable drawable, int i4, int i5, int i6, boolean z3, boolean z4) {
        Drawable drawable2;
        Toast toastMakeText = Toast.makeText(context, "", i6);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C2042R.layout.xui_layout_xtoast, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(C2042R.id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(C2042R.id.toast_text);
        if (z4) {
            drawable2 = Utils.tint9PatchDrawableFrame(context, i4);
        } else {
            drawable2 = Utils.getDrawable(context, C2042R.drawable.xtoast_frame);
        }
        Utils.setBackground(viewInflate, drawable2);
        if (!z3) {
            imageView.setVisibility(8);
        } else if (drawable != null) {
            if (Config.get().tintIcon) {
                drawable = Utils.tintIcon(drawable, i5);
            }
            Utils.setBackground(imageView, drawable);
        } else {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        textView.setText(charSequence);
        textView.setTextColor(i5);
        textView.setTypeface(Config.get().typeface, 0);
        if (Config.get().textSize != -1) {
            textView.setTextSize(2, Config.get().textSize);
        }
        if (Config.get().alpha != -1) {
            viewInflate.getBackground().setAlpha(Config.get().alpha);
        }
        toastMakeText.setView(viewInflate);
        if (!Config.get().allowQueue) {
            Toast toast = lastToast;
            if (toast != null) {
                toast.cancel();
            }
            lastToast = toastMakeText;
        }
        if (Config.get().gravity != -1) {
            toastMakeText.setGravity(Config.get().gravity, Config.get().xOffset, Config.get().yOffset);
        }
        return toastMakeText;
    }
}
