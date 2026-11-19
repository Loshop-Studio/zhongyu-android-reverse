package com.jaredrummler.android.colorpicker;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.tencent.bugly.proguard.RunnableC4124m0;
import com.xuexiang.xui.widget.searchview.ViewOnFocusChangeListenerC4215f;
import java.util.Arrays;
import java.util.Locale;
import p112m1.C6089e;
import p112m1.C6090f;
import p112m1.DialogInterfaceOnClickListenerC6092h;
import p112m1.InterfaceC6095k;
import p112m1.InterfaceC6097m;
import p112m1.ViewOnClickListenerC6093i;
import p112m1.ViewOnClickListenerC6094j;
import p112m1.ViewOnLongClickListenerC6087c;
import p112m1.ViewOnTouchListenerC6091g;
import p129o2.C6268a;

/* loaded from: classes3.dex */
public class ColorPickerDialog extends DialogFragment implements InterfaceC6097m, TextWatcher {

    /* renamed from: t */
    public static final int[] f3127t = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: a */
    public Object f3128a;

    /* renamed from: b */
    public FrameLayout f3129b;

    /* renamed from: c */
    public int[] f3130c;

    /* renamed from: d */
    public int f3131d;

    /* renamed from: e */
    public int f3132e;

    /* renamed from: f */
    public boolean f3133f;

    /* renamed from: g */
    public int f3134g;

    /* renamed from: h */
    public C6089e f3135h;

    /* renamed from: i */
    public LinearLayout f3136i;

    /* renamed from: j */
    public SeekBar f3137j;

    /* renamed from: k */
    public TextView f3138k;

    /* renamed from: l */
    public ColorPickerView f3139l;

    /* renamed from: m */
    public ColorPanelView f3140m;

    /* renamed from: n */
    public EditText f3141n;

    /* renamed from: o */
    public boolean f3142o;

    /* renamed from: p */
    public int f3143p;

    /* renamed from: q */
    public boolean f3144q;

    /* renamed from: r */
    public int f3145r;

    /* renamed from: s */
    public final ViewOnTouchListenerC6091g f3146s = new ViewOnTouchListenerC6091g(this);

    public @interface DialogType {
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, m1.k] */
    /* renamed from: e */
    public static void m2834e(ColorPickerDialog colorPickerDialog, int i) {
        if (colorPickerDialog.f3128a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            colorPickerDialog.f3128a.mo2844a(i);
        } else {
            KeyEventDispatcher.Component activity = colorPickerDialog.getActivity();
            if (!(activity instanceof InterfaceC6095k)) {
                throw new IllegalStateException("The activity must implement ColorPickerDialogListener");
            }
            ((InterfaceC6095k) activity).mo2844a(i);
        }
    }

    /* renamed from: i */
    public static C4031a m2835i() {
        C4031a c4031a = new C4031a();
        c4031a.f3202a = R$string.cpv_default_title;
        c4031a.f3203b = R$string.cpv_presets;
        c4031a.f3204c = R$string.cpv_custom;
        c4031a.f3205d = R$string.cpv_select;
        c4031a.f3206e = 1;
        c4031a.f3207f = f3127t;
        c4031a.f3208g = ViewCompat.MEASURED_STATE_MASK;
        c4031a.f3209h = false;
        c4031a.f3210i = true;
        c4031a.f3211j = true;
        c4031a.f3212k = true;
        c4031a.f3213l = 1;
        return c4031a;
    }

    /* renamed from: l */
    public static int m2836l(double d9, int i) throws NumberFormatException {
        long j7 = Long.parseLong(String.format("#%06X", Integer.valueOf(16777215 & i)).substring(1), 16);
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d9 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 = 255.0d;
        }
        if (d9 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d9 *= -1.0d;
        }
        long j8 = j7 >> 16;
        long j9 = (j7 >> 8) & 255;
        long j10 = j7 & 255;
        return Color.argb(Color.alpha(i), (int) (Math.round((d10 - j8) * d9) + j8), (int) (Math.round((d10 - j9) * d9) + j9), (int) (Math.round((d10 - j10) * d9) + j10));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws NumberFormatException {
        int i;
        int i8;
        int i9;
        int i10;
        if (this.f3141n.isFocused()) {
            String string = editable.toString();
            if (string.startsWith("#")) {
                string = string.substring(1);
            }
            int i11 = 255;
            int i12 = 0;
            if (string.length() == 0) {
                i = 0;
                i8 = 0;
            } else if (string.length() <= 2) {
                i = Integer.parseInt(string, 16);
                i8 = 0;
            } else if (string.length() == 3) {
                i12 = Integer.parseInt(string.substring(0, 1), 16);
                i8 = Integer.parseInt(string.substring(1, 2), 16);
                i = Integer.parseInt(string.substring(2, 3), 16);
            } else if (string.length() == 4) {
                i8 = Integer.parseInt(string.substring(0, 2), 16);
                i = Integer.parseInt(string.substring(2, 4), 16);
            } else if (string.length() == 5) {
                i12 = Integer.parseInt(string.substring(0, 1), 16);
                i8 = Integer.parseInt(string.substring(1, 3), 16);
                i = Integer.parseInt(string.substring(3, 5), 16);
            } else if (string.length() == 6) {
                i12 = Integer.parseInt(string.substring(0, 2), 16);
                i8 = Integer.parseInt(string.substring(2, 4), 16);
                i = Integer.parseInt(string.substring(4, 6), 16);
            } else {
                if (string.length() == 7) {
                    i9 = Integer.parseInt(string.substring(0, 1), 16);
                    i12 = Integer.parseInt(string.substring(1, 3), 16);
                    i10 = Integer.parseInt(string.substring(3, 5), 16);
                    i = Integer.parseInt(string.substring(5, 7), 16);
                } else if (string.length() == 8) {
                    i9 = Integer.parseInt(string.substring(0, 2), 16);
                    i12 = Integer.parseInt(string.substring(2, 4), 16);
                    i10 = Integer.parseInt(string.substring(4, 6), 16);
                    i = Integer.parseInt(string.substring(6, 8), 16);
                } else {
                    i11 = -1;
                    i = -1;
                    i8 = -1;
                    i12 = -1;
                }
                i11 = i9;
                i8 = i10;
            }
            int iArgb = Color.argb(i11, i12, i8, i);
            if (iArgb != this.f3139l.getColor()) {
                this.f3144q = true;
                this.f3139l.m2843b(iArgb, true);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    /* renamed from: f */
    public final void m2837f(int i) throws Resources.NotFoundException {
        int[] iArr = {m2836l(0.9d, i), m2836l(0.7d, i), m2836l(0.5d, i), m2836l(0.333d, i), m2836l(0.166d, i), m2836l(-0.125d, i), m2836l(-0.25d, i), m2836l(-0.375d, i), m2836l(-0.5d, i), m2836l(-0.675d, i), m2836l(-0.7d, i), m2836l(-0.775d, i)};
        int i8 = 0;
        if (this.f3136i.getChildCount() != 0) {
            while (i8 < this.f3136i.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f3136i.getChildAt(i8);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                colorPanelView.setColor(iArr[i8]);
                colorPanelView.setTag(Boolean.FALSE);
                imageView.setImageDrawable(null);
                i8++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.cpv_item_horizontal_padding);
        while (i8 < 12) {
            int i9 = iArr[i8];
            View viewInflate = View.inflate(getActivity(), this.f3134g == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i9);
            this.f3136i.addView(viewInflate);
            colorPanelView2.post(new RunnableC4124m0(colorPanelView2, i9));
            colorPanelView2.setOnClickListener(new ViewOnClickListenerC6094j(this, colorPanelView2));
            colorPanelView2.setOnLongClickListener(new ViewOnLongClickListenerC6087c(colorPanelView2, 1));
            i8++;
        }
    }

    /* renamed from: g */
    public final View m2838g() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_color_picker, null);
        this.f3139l = (ColorPickerView) viewInflate.findViewById(R$id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_old);
        this.f3140m = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_new);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.cpv_arrow_right);
        this.f3141n = (EditText) viewInflate.findViewById(R$id.cpv_hex);
        try {
            TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorPrimary});
            int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f3139l.setAlphaSliderVisible(this.f3142o);
        colorPanelView.setColor(getArguments().getInt(TypedValues.Custom.S_COLOR));
        int i = 1;
        this.f3139l.m2843b(this.f3131d, true);
        this.f3140m.setColor(this.f3131d);
        m2841k(this.f3131d);
        if (!this.f3142o) {
            this.f3141n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f3140m.setOnClickListener(new ViewOnClickListenerC6093i(this, i));
        viewInflate.setOnTouchListener(this.f3146s);
        this.f3139l.setOnColorChangedListener(this);
        this.f3141n.addTextChangedListener(this);
        this.f3141n.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4215f(this, 2));
        return viewInflate;
    }

    /* renamed from: h */
    public final View m2839h() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_presets, null);
        this.f3136i = (LinearLayout) viewInflate.findViewById(R$id.shades_layout);
        this.f3137j = (SeekBar) viewInflate.findViewById(R$id.transparency_seekbar);
        this.f3138k = (TextView) viewInflate.findViewById(R$id.transparency_text);
        GridView gridView = (GridView) viewInflate.findViewById(R$id.gridView);
        int iAlpha = Color.alpha(this.f3131d);
        int[] intArray = getArguments().getIntArray("presets");
        this.f3130c = intArray;
        int[] iArr = f3127t;
        if (intArray == null) {
            this.f3130c = iArr;
        }
        int[] iArr2 = this.f3130c;
        int i = 0;
        boolean z8 = iArr2 == iArr;
        this.f3130c = Arrays.copyOf(iArr2, iArr2.length);
        if (iAlpha != 255) {
            int i8 = 0;
            while (true) {
                int[] iArr3 = this.f3130c;
                if (i8 >= iArr3.length) {
                    break;
                }
                int i9 = iArr3[i8];
                this.f3130c[i8] = Color.argb(iAlpha, Color.red(i9), Color.green(i9), Color.blue(i9));
                i8++;
            }
        }
        int[] iArr4 = this.f3130c;
        int i10 = this.f3131d;
        int length = iArr4.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                int length2 = iArr4.length;
                int[] iArr5 = new int[length2 + 1];
                iArr5[0] = i10;
                System.arraycopy(iArr4, 0, iArr5, 1, length2);
                iArr4 = iArr5;
                break;
            }
            if (iArr4[i11] == i10) {
                break;
            }
            i11++;
        }
        this.f3130c = iArr4;
        int i12 = getArguments().getInt(TypedValues.Custom.S_COLOR);
        if (i12 != this.f3131d) {
            int[] iArr6 = this.f3130c;
            int length3 = iArr6.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length3) {
                    int length4 = iArr6.length;
                    int[] iArr7 = new int[length4 + 1];
                    iArr7[0] = i12;
                    System.arraycopy(iArr6, 0, iArr7, 1, length4);
                    iArr6 = iArr7;
                    break;
                }
                if (iArr6[i13] == i12) {
                    break;
                }
                i13++;
            }
            this.f3130c = iArr6;
        }
        if (z8) {
            int[] iArr8 = this.f3130c;
            if (iArr8.length == 19) {
                int iArgb = Color.argb(iAlpha, 0, 0, 0);
                int length5 = iArr8.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length5) {
                        int length6 = iArr8.length;
                        int[] iArr9 = new int[length6 + 1];
                        iArr9[length6] = iArgb;
                        System.arraycopy(iArr8, 0, iArr9, 0, length6);
                        iArr8 = iArr9;
                        break;
                    }
                    if (iArr8[i14] == iArgb) {
                        break;
                    }
                    i14++;
                }
                this.f3130c = iArr8;
            }
        }
        if (this.f3133f) {
            m2837f(this.f3131d);
        } else {
            this.f3136i.setVisibility(8);
            viewInflate.findViewById(R$id.shades_divider).setVisibility(8);
        }
        C6268a c6268a = new C6268a(this, 21);
        int[] iArr10 = this.f3130c;
        while (true) {
            int[] iArr11 = this.f3130c;
            if (i >= iArr11.length) {
                i = -1;
                break;
            }
            if (iArr11[i] == this.f3131d) {
                break;
            }
            i++;
        }
        C6089e c6089e = new C6089e(c6268a, iArr10, i, this.f3134g);
        this.f3135h = c6089e;
        gridView.setAdapter((ListAdapter) c6089e);
        if (!this.f3142o) {
            viewInflate.findViewById(R$id.transparency_layout).setVisibility(8);
            viewInflate.findViewById(R$id.transparency_title).setVisibility(8);
            return viewInflate;
        }
        int iAlpha2 = 255 - Color.alpha(this.f3131d);
        this.f3137j.setMax(255);
        this.f3137j.setProgress(iAlpha2);
        TextView textView = this.f3138k;
        Locale locale = Locale.ENGLISH;
        textView.setText(((int) ((iAlpha2 * 100.0d) / 255.0d)) + "%");
        this.f3137j.setOnSeekBarChangeListener(new C6090f(this));
        return viewInflate;
    }

    /* renamed from: j */
    public final void m2840j(int i) {
        this.f3131d = i;
        ColorPanelView colorPanelView = this.f3140m;
        if (colorPanelView != null) {
            colorPanelView.setColor(i);
        }
        if (!this.f3144q && this.f3141n != null) {
            m2841k(i);
            if (this.f3141n.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f3141n.getWindowToken(), 0);
                this.f3141n.clearFocus();
            }
        }
        this.f3144q = false;
    }

    /* renamed from: k */
    public final void m2841k(int i) {
        if (this.f3142o) {
            this.f3141n.setText(String.format("%08X", Integer.valueOf(i)));
        } else {
            this.f3141n.setText(String.format("%06X", Integer.valueOf(i & ViewCompat.MEASURED_SIZE_MASK)));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        getArguments().getInt("id");
        this.f3142o = getArguments().getBoolean("alpha");
        this.f3133f = getArguments().getBoolean("showColorShades");
        this.f3134g = getArguments().getInt("colorShape");
        if (bundle == null) {
            this.f3131d = getArguments().getInt(TypedValues.Custom.S_COLOR);
            this.f3132e = getArguments().getInt("dialogType");
        } else {
            this.f3131d = bundle.getInt(TypedValues.Custom.S_COLOR);
            this.f3132e = bundle.getInt("dialogType");
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.f3129b = frameLayout;
        int i8 = this.f3132e;
        if (i8 == 0) {
            frameLayout.addView(m2838g());
        } else if (i8 == 1) {
            frameLayout.addView(m2839h());
        }
        int i9 = getArguments().getInt("selectedButtonText");
        if (i9 == 0) {
            i9 = R$string.cpv_select;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setView(this.f3129b).setPositiveButton(i9, new DialogInterfaceOnClickListenerC6092h(this));
        int i10 = getArguments().getInt("dialogTitle");
        if (i10 != 0) {
            positiveButton.setTitle(i10);
        }
        this.f3143p = getArguments().getInt("presetsButtonText");
        this.f3145r = getArguments().getInt("customButtonText");
        if (this.f3132e == 0 && getArguments().getBoolean("allowPresets")) {
            i = this.f3143p;
            if (i == 0) {
                i = R$string.cpv_presets;
            }
        } else if (this.f3132e == 1 && getArguments().getBoolean("allowCustom")) {
            i = this.f3145r;
            if (i == 0) {
                i = R$string.cpv_custom;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            positiveButton.setNeutralButton(i, (DialogInterface.OnClickListener) null);
        }
        return positiveButton.create();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f3128a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f3128a.getClass();
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC6095k) {
                ((InterfaceC6095k) activity).getClass();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f3131d);
        bundle.putInt("dialogType", this.f3132e);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        alertDialog.getWindow().clearFlags(131080);
        alertDialog.getWindow().setSoftInputMode(4);
        Button button = alertDialog.getButton(-3);
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC6093i(this, 0));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }
}
