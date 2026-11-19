package com.jaredrummler.android.colorpicker;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
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
import androidx.core.graphics.ColorUtils;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.jaredrummler.android.colorpicker.C6590a;
import com.jaredrummler.android.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import p185n1.InterfaceC9085b;

/* loaded from: classes4.dex */
public class ColorPickerDialog extends DialogFragment implements ColorPickerView.InterfaceC6589c, TextWatcher {

    /* renamed from: u */
    public static final int[] f5133u = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: a */
    public InterfaceC9085b f5134a;

    /* renamed from: b */
    public FrameLayout f5135b;

    /* renamed from: c */
    public int[] f5136c;

    /* renamed from: d */
    public int f5137d;

    /* renamed from: e */
    public int f5138e;

    /* renamed from: f */
    public int f5139f;

    /* renamed from: g */
    public boolean f5140g;

    /* renamed from: h */
    public int f5141h;

    /* renamed from: i */
    public C6590a f5142i;

    /* renamed from: j */
    public LinearLayout f5143j;

    /* renamed from: k */
    public SeekBar f5144k;

    /* renamed from: l */
    public TextView f5145l;

    /* renamed from: m */
    public ColorPickerView f5146m;

    /* renamed from: n */
    public ColorPanelView f5147n;

    /* renamed from: o */
    public EditText f5148o;

    /* renamed from: p */
    public boolean f5149p;

    /* renamed from: q */
    public int f5150q;

    /* renamed from: r */
    public boolean f5151r;

    /* renamed from: s */
    public int f5152s;

    /* renamed from: t */
    public final View.OnTouchListener f5153t = new ViewOnTouchListenerC6577b();

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$a */
    public class C6576a implements SeekBar.OnSeekBarChangeListener {
        public C6576a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            C6590a c6590a;
            ColorPickerDialog.this.f5145l.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((i9 * 100.0d) / 255.0d))));
            int i10 = 255 - i9;
            int i11 = 0;
            while (true) {
                c6590a = ColorPickerDialog.this.f5142i;
                int[] iArr = c6590a.f5231b;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11];
                ColorPickerDialog.this.f5142i.f5231b[i11] = Color.argb(i10, Color.red(i12), Color.green(i12), Color.blue(i12));
                i11++;
            }
            c6590a.notifyDataSetChanged();
            for (int i13 = 0; i13 < ColorPickerDialog.this.f5143j.getChildCount(); i13++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f5143j.getChildAt(i13);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                if (frameLayout.getTag() == null) {
                    frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
                }
                int color = colorPanelView.getColor();
                int iArgb = Color.argb(i10, Color.red(color), Color.green(color), Color.blue(color));
                if (i10 <= 165) {
                    colorPanelView.setBorderColor(iArgb | ViewCompat.MEASURED_STATE_MASK);
                } else {
                    colorPanelView.setBorderColor(((Integer) frameLayout.getTag()).intValue());
                }
                if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                    if (i10 <= 165) {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    } else if (ColorUtils.calculateLuminance(iArgb) >= 0.65d) {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    } else {
                        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    }
                }
                colorPanelView.setColor(iArgb);
            }
            ColorPickerDialog.this.f5137d = Color.argb(i10, Color.red(ColorPickerDialog.this.f5137d), Color.green(ColorPickerDialog.this.f5137d), Color.blue(ColorPickerDialog.this.f5137d));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$b */
    public class ViewOnTouchListenerC6577b implements View.OnTouchListener {
        public ViewOnTouchListenerC6577b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText = ColorPickerDialog.this.f5148o;
            if (view == editText || !editText.hasFocus()) {
                return false;
            }
            ColorPickerDialog.this.f5148o.clearFocus();
            ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(ColorPickerDialog.this.f5148o.getWindowToken(), 0);
            ColorPickerDialog.this.f5148o.clearFocus();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$c */
    public class DialogInterfaceOnClickListenerC6578c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC6578c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            colorPickerDialog.m4516l(colorPickerDialog.f5137d);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$d */
    public class ViewOnClickListenerC6579d implements View.OnClickListener {
        public ViewOnClickListenerC6579d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ColorPickerDialog.this.f5135b.removeAllViews();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i9 = colorPickerDialog.f5138e;
            if (i9 == 0) {
                colorPickerDialog.f5138e = 1;
                ((Button) view).setText(colorPickerDialog.f5152s != 0 ? ColorPickerDialog.this.f5152s : R$string.cpv_custom);
                ColorPickerDialog colorPickerDialog2 = ColorPickerDialog.this;
                colorPickerDialog2.f5135b.addView(colorPickerDialog2.m4513h());
                return;
            }
            if (i9 != 1) {
                return;
            }
            colorPickerDialog.f5138e = 0;
            ((Button) view).setText(colorPickerDialog.f5150q != 0 ? ColorPickerDialog.this.f5150q : R$string.cpv_presets);
            ColorPickerDialog colorPickerDialog3 = ColorPickerDialog.this;
            colorPickerDialog3.f5135b.addView(colorPickerDialog3.m4512g());
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$e */
    public class ViewOnClickListenerC6580e implements View.OnClickListener {
        public ViewOnClickListenerC6580e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int color = ColorPickerDialog.this.f5147n.getColor();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i9 = colorPickerDialog.f5137d;
            if (color == i9) {
                colorPickerDialog.m4516l(i9);
                ColorPickerDialog.this.dismiss();
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$f */
    public class ViewOnFocusChangeListenerC6581f implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC6581f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).showSoftInput(ColorPickerDialog.this.f5148o, 1);
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$g */
    public class C6582g implements C6590a.a {
        public C6582g() {
        }

        @Override // com.jaredrummler.android.colorpicker.C6590a.a
        /* renamed from: a */
        public void mo4525a(int i9) throws Resources.NotFoundException {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f5137d;
            if (i10 == i9) {
                colorPickerDialog.m4516l(i10);
                ColorPickerDialog.this.dismiss();
            } else {
                colorPickerDialog.f5137d = i9;
                if (colorPickerDialog.f5140g) {
                    colorPickerDialog.m4511f(i9);
                }
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$h */
    public class RunnableC6583h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f5161a;

        /* renamed from: b */
        public final /* synthetic */ int f5162b;

        public RunnableC6583h(ColorPanelView colorPanelView, int i9) {
            this.f5161a = colorPanelView;
            this.f5162b = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5161a.setColor(this.f5162b);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$i */
    public class ViewOnClickListenerC6584i implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f5164a;

        public ViewOnClickListenerC6584i(ColorPanelView colorPanelView) {
            this.f5164a = colorPanelView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ((view.getTag() instanceof Boolean) && ((Boolean) view.getTag()).booleanValue()) {
                ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
                colorPickerDialog.m4516l(colorPickerDialog.f5137d);
                ColorPickerDialog.this.dismiss();
                return;
            }
            ColorPickerDialog.this.f5137d = this.f5164a.getColor();
            ColorPickerDialog.this.f5142i.m4559a();
            for (int i9 = 0; i9 < ColorPickerDialog.this.f5143j.getChildCount(); i9++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f5143j.getChildAt(i9);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                imageView.setImageResource(colorPanelView == view ? R$drawable.cpv_preset_checked : 0);
                if ((colorPanelView != view || ColorUtils.calculateLuminance(colorPanelView.getColor()) < 0.65d) && Color.alpha(colorPanelView.getColor()) > 165) {
                    imageView.setColorFilter((ColorFilter) null);
                } else {
                    imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                }
                colorPanelView.setTag(Boolean.valueOf(colorPanelView == view));
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$j */
    public class ViewOnLongClickListenerC6585j implements View.OnLongClickListener {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f5166a;

        public ViewOnLongClickListenerC6585j(ColorPanelView colorPanelView) {
            this.f5166a = colorPanelView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f5166a.m4505d();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$k */
    public static final class C6586k {

        /* renamed from: a */
        public int f5168a = R$string.cpv_default_title;

        /* renamed from: b */
        public int f5169b = R$string.cpv_presets;

        /* renamed from: c */
        public int f5170c = R$string.cpv_custom;

        /* renamed from: d */
        public int f5171d = R$string.cpv_select;

        /* renamed from: e */
        public int f5172e = 1;

        /* renamed from: f */
        public int[] f5173f = ColorPickerDialog.f5133u;

        /* renamed from: g */
        public int f5174g = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: h */
        public int f5175h = 0;

        /* renamed from: i */
        public boolean f5176i = false;

        /* renamed from: j */
        public boolean f5177j = true;

        /* renamed from: k */
        public boolean f5178k = true;

        /* renamed from: l */
        public boolean f5179l = true;

        /* renamed from: m */
        public int f5180m = 1;

        /* renamed from: a */
        public ColorPickerDialog m4526a() {
            ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f5175h);
            bundle.putInt("dialogType", this.f5172e);
            bundle.putInt(TypedValues.Custom.S_COLOR, this.f5174g);
            bundle.putIntArray("presets", this.f5173f);
            bundle.putBoolean("alpha", this.f5176i);
            bundle.putBoolean("allowCustom", this.f5178k);
            bundle.putBoolean("allowPresets", this.f5177j);
            bundle.putInt("dialogTitle", this.f5168a);
            bundle.putBoolean("showColorShades", this.f5179l);
            bundle.putInt("colorShape", this.f5180m);
            bundle.putInt("presetsButtonText", this.f5169b);
            bundle.putInt("customButtonText", this.f5170c);
            bundle.putInt("selectedButtonText", this.f5171d);
            colorPickerDialog.setArguments(bundle);
            return colorPickerDialog;
        }

        /* renamed from: b */
        public C6586k m4527b(boolean z9) {
            this.f5178k = z9;
            return this;
        }

        /* renamed from: c */
        public C6586k m4528c(boolean z9) {
            this.f5177j = z9;
            return this;
        }

        /* renamed from: d */
        public C6586k m4529d(int i9) {
            this.f5174g = i9;
            return this;
        }

        /* renamed from: e */
        public C6586k m4530e(int i9) {
            this.f5180m = i9;
            return this;
        }

        /* renamed from: f */
        public C6586k m4531f(int i9) {
            this.f5168a = i9;
            return this;
        }

        /* renamed from: g */
        public C6586k m4532g(int i9) {
            this.f5172e = i9;
            return this;
        }

        /* renamed from: h */
        public C6586k m4533h(int[] iArr) {
            this.f5173f = iArr;
            return this;
        }

        /* renamed from: i */
        public C6586k m4534i(boolean z9) {
            this.f5176i = z9;
            return this;
        }

        /* renamed from: j */
        public C6586k m4535j(boolean z9) {
            this.f5179l = z9;
            return this;
        }
    }

    private int getSelectedItemPosition() {
        int i9 = 0;
        while (true) {
            int[] iArr = this.f5136c;
            if (i9 >= iArr.length) {
                return -1;
            }
            if (iArr[i9] == this.f5137d) {
                return i9;
            }
            i9++;
        }
    }

    /* renamed from: k */
    public static C6586k m4509k() {
        return new C6586k();
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerView.InterfaceC6589c
    /* renamed from: a */
    public void mo4510a(int i9) {
        this.f5137d = i9;
        ColorPanelView colorPanelView = this.f5147n;
        if (colorPanelView != null) {
            colorPanelView.setColor(i9);
        }
        if (!this.f5151r && this.f5148o != null) {
            m4521q(i9);
            if (this.f5148o.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f5148o.getWindowToken(), 0);
                this.f5148o.clearFocus();
            }
        }
        this.f5151r = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int iM4518n;
        if (!this.f5148o.isFocused() || (iM4518n = m4518n(editable.toString())) == this.f5146m.getColor()) {
            return;
        }
        this.f5151r = true;
        this.f5146m.m4549n(iM4518n, true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    /* renamed from: f */
    public void m4511f(int i9) throws Resources.NotFoundException {
        int[] iArrM4514i = m4514i(i9);
        int i10 = 0;
        if (this.f5143j.getChildCount() != 0) {
            while (i10 < this.f5143j.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f5143j.getChildAt(i10);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                colorPanelView.setColor(iArrM4514i[i10]);
                colorPanelView.setTag(Boolean.FALSE);
                imageView.setImageDrawable(null);
                i10++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.cpv_item_horizontal_padding);
        int length = iArrM4514i.length;
        while (i10 < length) {
            int i11 = iArrM4514i[i10];
            View viewInflate = View.inflate(getActivity(), this.f5141h == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i11);
            this.f5143j.addView(viewInflate);
            colorPanelView2.post(new RunnableC6583h(colorPanelView2, i11));
            colorPanelView2.setOnClickListener(new ViewOnClickListenerC6584i(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new ViewOnLongClickListenerC6585j(colorPanelView2));
            i10++;
        }
    }

    /* renamed from: g */
    public View m4512g() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_color_picker, null);
        this.f5146m = (ColorPickerView) viewInflate.findViewById(R$id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_old);
        this.f5147n = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_new);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.cpv_arrow_right);
        this.f5148o = (EditText) viewInflate.findViewById(R$id.cpv_hex);
        try {
            TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorPrimary});
            int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f5146m.setAlphaSliderVisible(this.f5149p);
        colorPanelView.setColor(getArguments().getInt(TypedValues.Custom.S_COLOR));
        this.f5146m.m4549n(this.f5137d, true);
        this.f5147n.setColor(this.f5137d);
        m4521q(this.f5137d);
        if (!this.f5149p) {
            this.f5148o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f5147n.setOnClickListener(new ViewOnClickListenerC6580e());
        viewInflate.setOnTouchListener(this.f5153t);
        this.f5146m.setOnColorChangedListener(this);
        this.f5148o.addTextChangedListener(this);
        this.f5148o.setOnFocusChangeListener(new ViewOnFocusChangeListenerC6581f());
        return viewInflate;
    }

    /* renamed from: h */
    public View m4513h() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_presets, null);
        this.f5143j = (LinearLayout) viewInflate.findViewById(R$id.shades_layout);
        this.f5144k = (SeekBar) viewInflate.findViewById(R$id.transparency_seekbar);
        this.f5145l = (TextView) viewInflate.findViewById(R$id.transparency_text);
        GridView gridView = (GridView) viewInflate.findViewById(R$id.gridView);
        m4515j();
        if (this.f5140g) {
            m4511f(this.f5137d);
        } else {
            this.f5143j.setVisibility(8);
            viewInflate.findViewById(R$id.shades_divider).setVisibility(8);
        }
        C6590a c6590a = new C6590a(new C6582g(), this.f5136c, getSelectedItemPosition(), this.f5141h);
        this.f5142i = c6590a;
        gridView.setAdapter((ListAdapter) c6590a);
        if (this.f5149p) {
            m4522r();
            return viewInflate;
        }
        viewInflate.findViewById(R$id.transparency_layout).setVisibility(8);
        viewInflate.findViewById(R$id.transparency_title).setVisibility(8);
        return viewInflate;
    }

    /* renamed from: i */
    public final int[] m4514i(int i9) {
        return new int[]{m4523s(i9, 0.9d), m4523s(i9, 0.7d), m4523s(i9, 0.5d), m4523s(i9, 0.333d), m4523s(i9, 0.166d), m4523s(i9, -0.125d), m4523s(i9, -0.25d), m4523s(i9, -0.375d), m4523s(i9, -0.5d), m4523s(i9, -0.675d), m4523s(i9, -0.7d), m4523s(i9, -0.775d)};
    }

    /* renamed from: j */
    public final void m4515j() {
        int iAlpha = Color.alpha(this.f5137d);
        int[] intArray = getArguments().getIntArray("presets");
        this.f5136c = intArray;
        if (intArray == null) {
            this.f5136c = f5133u;
        }
        int[] iArr = this.f5136c;
        boolean z9 = iArr == f5133u;
        this.f5136c = Arrays.copyOf(iArr, iArr.length);
        if (iAlpha != 255) {
            int i9 = 0;
            while (true) {
                int[] iArr2 = this.f5136c;
                if (i9 >= iArr2.length) {
                    break;
                }
                int i10 = iArr2[i9];
                this.f5136c[i9] = Color.argb(iAlpha, Color.red(i10), Color.green(i10), Color.blue(i10));
                i9++;
            }
        }
        this.f5136c = m4524t(this.f5136c, this.f5137d);
        int i11 = getArguments().getInt(TypedValues.Custom.S_COLOR);
        if (i11 != this.f5137d) {
            this.f5136c = m4524t(this.f5136c, i11);
        }
        if (z9) {
            int[] iArr3 = this.f5136c;
            if (iArr3.length == 19) {
                this.f5136c = m4519o(iArr3, Color.argb(iAlpha, 0, 0, 0));
            }
        }
    }

    /* renamed from: l */
    public final void m4516l(int i9) {
        if (this.f5134a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f5134a.mo4553a(this.f5139f, i9);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (!(activity instanceof InterfaceC9085b)) {
                throw new IllegalStateException("The activity must implement ColorPickerDialogListener");
            }
            ((InterfaceC9085b) activity).mo4553a(this.f5139f, i9);
        }
    }

    /* renamed from: m */
    public final void m4517m() {
        if (this.f5134a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f5134a.mo4554b(this.f5139f);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC9085b) {
                ((InterfaceC9085b) activity).mo4554b(this.f5139f);
            }
        }
    }

    /* renamed from: n */
    public final int m4518n(String str) throws NumberFormatException {
        int i9;
        int i10;
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        int i11 = 255;
        int i12 = 0;
        if (str.length() == 0) {
            i9 = 0;
            i10 = 0;
        } else if (str.length() <= 2) {
            i9 = Integer.parseInt(str, 16);
            i10 = 0;
        } else if (str.length() == 3) {
            i12 = Integer.parseInt(str.substring(0, 1), 16);
            i10 = Integer.parseInt(str.substring(1, 2), 16);
            i9 = Integer.parseInt(str.substring(2, 3), 16);
        } else if (str.length() == 4) {
            i10 = Integer.parseInt(str.substring(0, 2), 16);
            i9 = Integer.parseInt(str.substring(2, 4), 16);
        } else if (str.length() == 5) {
            i12 = Integer.parseInt(str.substring(0, 1), 16);
            i10 = Integer.parseInt(str.substring(1, 3), 16);
            i9 = Integer.parseInt(str.substring(3, 5), 16);
        } else if (str.length() == 6) {
            i12 = Integer.parseInt(str.substring(0, 2), 16);
            i10 = Integer.parseInt(str.substring(2, 4), 16);
            i9 = Integer.parseInt(str.substring(4, 6), 16);
        } else if (str.length() == 7) {
            int i13 = Integer.parseInt(str.substring(0, 1), 16);
            i12 = Integer.parseInt(str.substring(1, 3), 16);
            int i14 = Integer.parseInt(str.substring(3, 5), 16);
            i9 = Integer.parseInt(str.substring(5, 7), 16);
            i11 = i13;
            i10 = i14;
        } else if (str.length() == 8) {
            i11 = Integer.parseInt(str.substring(0, 2), 16);
            i12 = Integer.parseInt(str.substring(2, 4), 16);
            i10 = Integer.parseInt(str.substring(4, 6), 16);
            i9 = Integer.parseInt(str.substring(6, 8), 16);
        } else {
            i11 = -1;
            i9 = -1;
            i10 = -1;
            i12 = -1;
        }
        return Color.argb(i11, i12, i10, i9);
    }

    /* renamed from: o */
    public final int[] m4519o(int[] iArr, int i9) {
        for (int i10 : iArr) {
            if (i10 == i9) {
                return iArr;
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[length] = i9;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i9;
        this.f5139f = getArguments().getInt("id");
        this.f5149p = getArguments().getBoolean("alpha");
        this.f5140g = getArguments().getBoolean("showColorShades");
        this.f5141h = getArguments().getInt("colorShape");
        if (bundle == null) {
            this.f5137d = getArguments().getInt(TypedValues.Custom.S_COLOR);
            this.f5138e = getArguments().getInt("dialogType");
        } else {
            this.f5137d = bundle.getInt(TypedValues.Custom.S_COLOR);
            this.f5138e = bundle.getInt("dialogType");
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.f5135b = frameLayout;
        int i10 = this.f5138e;
        if (i10 == 0) {
            frameLayout.addView(m4512g());
        } else if (i10 == 1) {
            frameLayout.addView(m4513h());
        }
        int i11 = getArguments().getInt("selectedButtonText");
        if (i11 == 0) {
            i11 = R$string.cpv_select;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setView(this.f5135b).setPositiveButton(i11, new DialogInterfaceOnClickListenerC6578c());
        int i12 = getArguments().getInt("dialogTitle");
        if (i12 != 0) {
            positiveButton.setTitle(i12);
        }
        this.f5150q = getArguments().getInt("presetsButtonText");
        this.f5152s = getArguments().getInt("customButtonText");
        if (this.f5138e == 0 && getArguments().getBoolean("allowPresets")) {
            i9 = this.f5150q;
            if (i9 == 0) {
                i9 = R$string.cpv_presets;
            }
        } else if (this.f5138e == 1 && getArguments().getBoolean("allowCustom")) {
            i9 = this.f5152s;
            if (i9 == 0) {
                i9 = R$string.cpv_custom;
            }
        } else {
            i9 = 0;
        }
        if (i9 != 0) {
            positiveButton.setNeutralButton(i9, (DialogInterface.OnClickListener) null);
        }
        return positiveButton.create();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m4517m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f5137d);
        bundle.putInt("dialogType", this.f5138e);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        alertDialog.getWindow().clearFlags(131080);
        alertDialog.getWindow().setSoftInputMode(4);
        Button button = alertDialog.getButton(-3);
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC6579d());
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    /* renamed from: p */
    public void m4520p(InterfaceC9085b interfaceC9085b) {
        this.f5134a = interfaceC9085b;
    }

    /* renamed from: q */
    public final void m4521q(int i9) {
        if (this.f5149p) {
            this.f5148o.setText(String.format("%08X", Integer.valueOf(i9)));
        } else {
            this.f5148o.setText(String.format("%06X", Integer.valueOf(i9 & ViewCompat.MEASURED_SIZE_MASK)));
        }
    }

    /* renamed from: r */
    public final void m4522r() {
        int iAlpha = 255 - Color.alpha(this.f5137d);
        this.f5144k.setMax(255);
        this.f5144k.setProgress(iAlpha);
        this.f5145l.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((iAlpha * 100.0d) / 255.0d))));
        this.f5144k.setOnSeekBarChangeListener(new C6576a());
    }

    /* renamed from: s */
    public final int m4523s(int i9, double d10) throws NumberFormatException {
        long j9 = Long.parseLong(String.format("#%06X", Integer.valueOf(16777215 & i9)).substring(1), 16);
        double d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d10 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d11 = 255.0d;
        }
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 *= -1.0d;
        }
        long j10 = j9 >> 16;
        long j11 = (j9 >> 8) & 255;
        long j12 = j9 & 255;
        return Color.argb(Color.alpha(i9), (int) (Math.round((d11 - j10) * d10) + j10), (int) (Math.round((d11 - j11) * d10) + j11), (int) (Math.round((d11 - j12) * d10) + j12));
    }

    /* renamed from: t */
    public final int[] m4524t(int[] iArr, int i9) {
        for (int i10 : iArr) {
            if (i10 == i9) {
                return iArr;
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[0] = i9;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return iArr2;
    }
}
