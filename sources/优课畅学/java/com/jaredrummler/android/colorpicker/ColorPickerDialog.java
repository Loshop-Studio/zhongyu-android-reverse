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
import com.jaredrummler.android.colorpicker.C6397a;
import com.jaredrummler.android.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import p082e1.InterfaceC8347b;

/* loaded from: classes4.dex */
public class ColorPickerDialog extends DialogFragment implements ColorPickerView.InterfaceC6396c, TextWatcher {

    /* renamed from: u */
    public static final int[] f4105u = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: a */
    public InterfaceC8347b f4106a;

    /* renamed from: b */
    public FrameLayout f4107b;

    /* renamed from: c */
    public int[] f4108c;

    /* renamed from: d */
    public int f4109d;

    /* renamed from: e */
    public int f4110e;

    /* renamed from: f */
    public int f4111f;

    /* renamed from: g */
    public boolean f4112g;

    /* renamed from: h */
    public int f4113h;

    /* renamed from: i */
    public C6397a f4114i;

    /* renamed from: j */
    public LinearLayout f4115j;

    /* renamed from: k */
    public SeekBar f4116k;

    /* renamed from: l */
    public TextView f4117l;

    /* renamed from: m */
    public ColorPickerView f4118m;

    /* renamed from: n */
    public ColorPanelView f4119n;

    /* renamed from: o */
    public EditText f4120o;

    /* renamed from: p */
    public boolean f4121p;

    /* renamed from: q */
    public int f4122q;

    /* renamed from: r */
    public boolean f4123r;

    /* renamed from: s */
    public int f4124s;

    /* renamed from: t */
    public final View.OnTouchListener f4125t = new ViewOnTouchListenerC6384b();

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$a */
    public class C6383a implements SeekBar.OnSeekBarChangeListener {
        public C6383a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            C6397a c6397a;
            ColorPickerDialog.this.f4117l.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((i10 * 100.0d) / 255.0d))));
            int i11 = 255 - i10;
            int i12 = 0;
            while (true) {
                c6397a = ColorPickerDialog.this.f4114i;
                int[] iArr = c6397a.f4203b;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12];
                ColorPickerDialog.this.f4114i.f4203b[i12] = Color.argb(i11, Color.red(i13), Color.green(i13), Color.blue(i13));
                i12++;
            }
            c6397a.notifyDataSetChanged();
            for (int i14 = 0; i14 < ColorPickerDialog.this.f4115j.getChildCount(); i14++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f4115j.getChildAt(i14);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                if (frameLayout.getTag() == null) {
                    frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
                }
                int color = colorPanelView.getColor();
                int iArgb = Color.argb(i11, Color.red(color), Color.green(color), Color.blue(color));
                if (i11 <= 165) {
                    colorPanelView.setBorderColor(iArgb | (-16777216));
                } else {
                    colorPanelView.setBorderColor(((Integer) frameLayout.getTag()).intValue());
                }
                if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                    if (i11 <= 165) {
                        imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                    } else if (ColorUtils.calculateLuminance(iArgb) >= 0.65d) {
                        imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                    } else {
                        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    }
                }
                colorPanelView.setColor(iArgb);
            }
            ColorPickerDialog.this.f4109d = Color.argb(i11, Color.red(ColorPickerDialog.this.f4109d), Color.green(ColorPickerDialog.this.f4109d), Color.blue(ColorPickerDialog.this.f4109d));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$b */
    public class ViewOnTouchListenerC6384b implements View.OnTouchListener {
        public ViewOnTouchListenerC6384b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText = ColorPickerDialog.this.f4120o;
            if (view == editText || !editText.hasFocus()) {
                return false;
            }
            ColorPickerDialog.this.f4120o.clearFocus();
            ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(ColorPickerDialog.this.f4120o.getWindowToken(), 0);
            ColorPickerDialog.this.f4120o.clearFocus();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$c */
    public class DialogInterfaceOnClickListenerC6385c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC6385c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            colorPickerDialog.m3934o(colorPickerDialog.f4109d);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$d */
    public class ViewOnClickListenerC6386d implements View.OnClickListener {
        public ViewOnClickListenerC6386d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ColorPickerDialog.this.f4107b.removeAllViews();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f4110e;
            if (i10 == 0) {
                colorPickerDialog.f4110e = 1;
                ((Button) view).setText(colorPickerDialog.f4124s != 0 ? ColorPickerDialog.this.f4124s : R$string.cpv_custom);
                ColorPickerDialog colorPickerDialog2 = ColorPickerDialog.this;
                colorPickerDialog2.f4107b.addView(colorPickerDialog2.m3931k());
                return;
            }
            if (i10 != 1) {
                return;
            }
            colorPickerDialog.f4110e = 0;
            ((Button) view).setText(colorPickerDialog.f4122q != 0 ? ColorPickerDialog.this.f4122q : R$string.cpv_presets);
            ColorPickerDialog colorPickerDialog3 = ColorPickerDialog.this;
            colorPickerDialog3.f4107b.addView(colorPickerDialog3.m3930j());
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$e */
    public class ViewOnClickListenerC6387e implements View.OnClickListener {
        public ViewOnClickListenerC6387e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int color = ColorPickerDialog.this.f4119n.getColor();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f4109d;
            if (color == i10) {
                colorPickerDialog.m3934o(i10);
                ColorPickerDialog.this.dismiss();
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$f */
    public class ViewOnFocusChangeListenerC6388f implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC6388f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).showSoftInput(ColorPickerDialog.this.f4120o, 1);
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$g */
    public class C6389g implements C6397a.a {
        public C6389g() {
        }

        @Override // com.jaredrummler.android.colorpicker.C6397a.a
        /* renamed from: a */
        public void mo3943a(int i10) throws Resources.NotFoundException {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i11 = colorPickerDialog.f4109d;
            if (i11 == i10) {
                colorPickerDialog.m3934o(i11);
                ColorPickerDialog.this.dismiss();
            } else {
                colorPickerDialog.f4109d = i10;
                if (colorPickerDialog.f4112g) {
                    colorPickerDialog.m3929i(i10);
                }
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$h */
    public class RunnableC6390h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f4133a;

        /* renamed from: b */
        public final /* synthetic */ int f4134b;

        public RunnableC6390h(ColorPanelView colorPanelView, int i10) {
            this.f4133a = colorPanelView;
            this.f4134b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4133a.setColor(this.f4134b);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$i */
    public class ViewOnClickListenerC6391i implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f4136a;

        public ViewOnClickListenerC6391i(ColorPanelView colorPanelView) {
            this.f4136a = colorPanelView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ((view.getTag() instanceof Boolean) && ((Boolean) view.getTag()).booleanValue()) {
                ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
                colorPickerDialog.m3934o(colorPickerDialog.f4109d);
                ColorPickerDialog.this.dismiss();
                return;
            }
            ColorPickerDialog.this.f4109d = this.f4136a.getColor();
            ColorPickerDialog.this.f4114i.m3977a();
            for (int i10 = 0; i10 < ColorPickerDialog.this.f4115j.getChildCount(); i10++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f4115j.getChildAt(i10);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                imageView.setImageResource(colorPanelView == view ? R$drawable.cpv_preset_checked : 0);
                if ((colorPanelView != view || ColorUtils.calculateLuminance(colorPanelView.getColor()) < 0.65d) && Color.alpha(colorPanelView.getColor()) > 165) {
                    imageView.setColorFilter((ColorFilter) null);
                } else {
                    imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                }
                colorPanelView.setTag(Boolean.valueOf(colorPanelView == view));
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$j */
    public class ViewOnLongClickListenerC6392j implements View.OnLongClickListener {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f4138a;

        public ViewOnLongClickListenerC6392j(ColorPanelView colorPanelView) {
            this.f4138a = colorPanelView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f4138a.m3923d();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$k */
    public static final class C6393k {

        /* renamed from: a */
        public int f4140a = R$string.cpv_default_title;

        /* renamed from: b */
        public int f4141b = R$string.cpv_presets;

        /* renamed from: c */
        public int f4142c = R$string.cpv_custom;

        /* renamed from: d */
        public int f4143d = R$string.cpv_select;

        /* renamed from: e */
        public int f4144e = 1;

        /* renamed from: f */
        public int[] f4145f = ColorPickerDialog.f4105u;

        /* renamed from: g */
        public int f4146g = -16777216;

        /* renamed from: h */
        public int f4147h = 0;

        /* renamed from: i */
        public boolean f4148i = false;

        /* renamed from: j */
        public boolean f4149j = true;

        /* renamed from: k */
        public boolean f4150k = true;

        /* renamed from: l */
        public boolean f4151l = true;

        /* renamed from: m */
        public int f4152m = 1;

        /* renamed from: a */
        public ColorPickerDialog m3944a() {
            ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f4147h);
            bundle.putInt("dialogType", this.f4144e);
            bundle.putInt(TypedValues.Custom.S_COLOR, this.f4146g);
            bundle.putIntArray("presets", this.f4145f);
            bundle.putBoolean("alpha", this.f4148i);
            bundle.putBoolean("allowCustom", this.f4150k);
            bundle.putBoolean("allowPresets", this.f4149j);
            bundle.putInt("dialogTitle", this.f4140a);
            bundle.putBoolean("showColorShades", this.f4151l);
            bundle.putInt("colorShape", this.f4152m);
            bundle.putInt("presetsButtonText", this.f4141b);
            bundle.putInt("customButtonText", this.f4142c);
            bundle.putInt("selectedButtonText", this.f4143d);
            colorPickerDialog.setArguments(bundle);
            return colorPickerDialog;
        }

        /* renamed from: b */
        public C6393k m3945b(boolean z10) {
            this.f4150k = z10;
            return this;
        }

        /* renamed from: c */
        public C6393k m3946c(boolean z10) {
            this.f4149j = z10;
            return this;
        }

        /* renamed from: d */
        public C6393k m3947d(int i10) {
            this.f4146g = i10;
            return this;
        }

        /* renamed from: e */
        public C6393k m3948e(int i10) {
            this.f4152m = i10;
            return this;
        }

        /* renamed from: f */
        public C6393k m3949f(int i10) {
            this.f4140a = i10;
            return this;
        }

        /* renamed from: g */
        public C6393k m3950g(int i10) {
            this.f4144e = i10;
            return this;
        }

        /* renamed from: h */
        public C6393k m3951h(int[] iArr) {
            this.f4145f = iArr;
            return this;
        }

        /* renamed from: i */
        public C6393k m3952i(boolean z10) {
            this.f4148i = z10;
            return this;
        }

        /* renamed from: j */
        public C6393k m3953j(boolean z10) {
            this.f4151l = z10;
            return this;
        }
    }

    private int getSelectedItemPosition() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4108c;
            if (i10 >= iArr.length) {
                return -1;
            }
            if (iArr[i10] == this.f4109d) {
                return i10;
            }
            i10++;
        }
    }

    /* renamed from: n */
    public static C6393k m3927n() {
        return new C6393k();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int iM3936q;
        if (!this.f4120o.isFocused() || (iM3936q = m3936q(editable.toString())) == this.f4118m.getColor()) {
            return;
        }
        this.f4123r = true;
        this.f4118m.m3967n(iM3936q, true);
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerView.InterfaceC6396c
    /* renamed from: b */
    public void mo3928b(int i10) {
        this.f4109d = i10;
        ColorPanelView colorPanelView = this.f4119n;
        if (colorPanelView != null) {
            colorPanelView.setColor(i10);
        }
        if (!this.f4123r && this.f4120o != null) {
            m3939t(i10);
            if (this.f4120o.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f4120o.getWindowToken(), 0);
                this.f4120o.clearFocus();
            }
        }
        this.f4123r = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: i */
    public void m3929i(int i10) throws Resources.NotFoundException {
        int[] iArrM3932l = m3932l(i10);
        int i11 = 0;
        if (this.f4115j.getChildCount() != 0) {
            while (i11 < this.f4115j.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f4115j.getChildAt(i11);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                colorPanelView.setColor(iArrM3932l[i11]);
                colorPanelView.setTag(Boolean.FALSE);
                imageView.setImageDrawable(null);
                i11++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.cpv_item_horizontal_padding);
        int length = iArrM3932l.length;
        while (i11 < length) {
            int i12 = iArrM3932l[i11];
            View viewInflate = View.inflate(getActivity(), this.f4113h == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i12);
            this.f4115j.addView(viewInflate);
            colorPanelView2.post(new RunnableC6390h(colorPanelView2, i12));
            colorPanelView2.setOnClickListener(new ViewOnClickListenerC6391i(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new ViewOnLongClickListenerC6392j(colorPanelView2));
            i11++;
        }
    }

    /* renamed from: j */
    public View m3930j() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_color_picker, null);
        this.f4118m = (ColorPickerView) viewInflate.findViewById(R$id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_old);
        this.f4119n = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_new);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.cpv_arrow_right);
        this.f4120o = (EditText) viewInflate.findViewById(R$id.cpv_hex);
        try {
            TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorPrimary});
            int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f4118m.setAlphaSliderVisible(this.f4121p);
        colorPanelView.setColor(getArguments().getInt(TypedValues.Custom.S_COLOR));
        this.f4118m.m3967n(this.f4109d, true);
        this.f4119n.setColor(this.f4109d);
        m3939t(this.f4109d);
        if (!this.f4121p) {
            this.f4120o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f4119n.setOnClickListener(new ViewOnClickListenerC6387e());
        viewInflate.setOnTouchListener(this.f4125t);
        this.f4118m.setOnColorChangedListener(this);
        this.f4120o.addTextChangedListener(this);
        this.f4120o.setOnFocusChangeListener(new ViewOnFocusChangeListenerC6388f());
        return viewInflate;
    }

    /* renamed from: k */
    public View m3931k() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_presets, null);
        this.f4115j = (LinearLayout) viewInflate.findViewById(R$id.shades_layout);
        this.f4116k = (SeekBar) viewInflate.findViewById(R$id.transparency_seekbar);
        this.f4117l = (TextView) viewInflate.findViewById(R$id.transparency_text);
        GridView gridView = (GridView) viewInflate.findViewById(R$id.gridView);
        m3933m();
        if (this.f4112g) {
            m3929i(this.f4109d);
        } else {
            this.f4115j.setVisibility(8);
            viewInflate.findViewById(R$id.shades_divider).setVisibility(8);
        }
        C6397a c6397a = new C6397a(new C6389g(), this.f4108c, getSelectedItemPosition(), this.f4113h);
        this.f4114i = c6397a;
        gridView.setAdapter((ListAdapter) c6397a);
        if (this.f4121p) {
            m3940u();
            return viewInflate;
        }
        viewInflate.findViewById(R$id.transparency_layout).setVisibility(8);
        viewInflate.findViewById(R$id.transparency_title).setVisibility(8);
        return viewInflate;
    }

    /* renamed from: l */
    public final int[] m3932l(int i10) {
        return new int[]{m3941v(i10, 0.9d), m3941v(i10, 0.7d), m3941v(i10, 0.5d), m3941v(i10, 0.333d), m3941v(i10, 0.166d), m3941v(i10, -0.125d), m3941v(i10, -0.25d), m3941v(i10, -0.375d), m3941v(i10, -0.5d), m3941v(i10, -0.675d), m3941v(i10, -0.7d), m3941v(i10, -0.775d)};
    }

    /* renamed from: m */
    public final void m3933m() {
        int iAlpha = Color.alpha(this.f4109d);
        int[] intArray = getArguments().getIntArray("presets");
        this.f4108c = intArray;
        if (intArray == null) {
            this.f4108c = f4105u;
        }
        int[] iArr = this.f4108c;
        boolean z10 = iArr == f4105u;
        this.f4108c = Arrays.copyOf(iArr, iArr.length);
        if (iAlpha != 255) {
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.f4108c;
                if (i10 >= iArr2.length) {
                    break;
                }
                int i11 = iArr2[i10];
                this.f4108c[i10] = Color.argb(iAlpha, Color.red(i11), Color.green(i11), Color.blue(i11));
                i10++;
            }
        }
        this.f4108c = m3942w(this.f4108c, this.f4109d);
        int i12 = getArguments().getInt(TypedValues.Custom.S_COLOR);
        if (i12 != this.f4109d) {
            this.f4108c = m3942w(this.f4108c, i12);
        }
        if (z10) {
            int[] iArr3 = this.f4108c;
            if (iArr3.length == 19) {
                this.f4108c = m3937r(iArr3, Color.argb(iAlpha, 0, 0, 0));
            }
        }
    }

    /* renamed from: o */
    public final void m3934o(int i10) {
        if (this.f4106a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f4106a.mo3971a(this.f4111f, i10);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (!(activity instanceof InterfaceC8347b)) {
                throw new IllegalStateException("The activity must implement ColorPickerDialogListener");
            }
            ((InterfaceC8347b) activity).mo3971a(this.f4111f, i10);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i10;
        this.f4111f = getArguments().getInt("id");
        this.f4121p = getArguments().getBoolean("alpha");
        this.f4112g = getArguments().getBoolean("showColorShades");
        this.f4113h = getArguments().getInt("colorShape");
        if (bundle == null) {
            this.f4109d = getArguments().getInt(TypedValues.Custom.S_COLOR);
            this.f4110e = getArguments().getInt("dialogType");
        } else {
            this.f4109d = bundle.getInt(TypedValues.Custom.S_COLOR);
            this.f4110e = bundle.getInt("dialogType");
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.f4107b = frameLayout;
        int i11 = this.f4110e;
        if (i11 == 0) {
            frameLayout.addView(m3930j());
        } else if (i11 == 1) {
            frameLayout.addView(m3931k());
        }
        int i12 = getArguments().getInt("selectedButtonText");
        if (i12 == 0) {
            i12 = R$string.cpv_select;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setView(this.f4107b).setPositiveButton(i12, new DialogInterfaceOnClickListenerC6385c());
        int i13 = getArguments().getInt("dialogTitle");
        if (i13 != 0) {
            positiveButton.setTitle(i13);
        }
        this.f4122q = getArguments().getInt("presetsButtonText");
        this.f4124s = getArguments().getInt("customButtonText");
        if (this.f4110e == 0 && getArguments().getBoolean("allowPresets")) {
            i10 = this.f4122q;
            if (i10 == 0) {
                i10 = R$string.cpv_presets;
            }
        } else if (this.f4110e == 1 && getArguments().getBoolean("allowCustom")) {
            i10 = this.f4124s;
            if (i10 == 0) {
                i10 = R$string.cpv_custom;
            }
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            positiveButton.setNeutralButton(i10, (DialogInterface.OnClickListener) null);
        }
        return positiveButton.create();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        m3935p();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f4109d);
        bundle.putInt("dialogType", this.f4110e);
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
            button.setOnClickListener(new ViewOnClickListenerC6386d());
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: p */
    public final void m3935p() {
        if (this.f4106a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f4106a.mo3972b(this.f4111f);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC8347b) {
                ((InterfaceC8347b) activity).mo3972b(this.f4111f);
            }
        }
    }

    /* renamed from: q */
    public final int m3936q(String str) throws NumberFormatException {
        int i10;
        int i11;
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        int i12 = 255;
        int i13 = 0;
        if (str.length() == 0) {
            i10 = 0;
            i11 = 0;
        } else if (str.length() <= 2) {
            i10 = Integer.parseInt(str, 16);
            i11 = 0;
        } else if (str.length() == 3) {
            i13 = Integer.parseInt(str.substring(0, 1), 16);
            i11 = Integer.parseInt(str.substring(1, 2), 16);
            i10 = Integer.parseInt(str.substring(2, 3), 16);
        } else if (str.length() == 4) {
            i11 = Integer.parseInt(str.substring(0, 2), 16);
            i10 = Integer.parseInt(str.substring(2, 4), 16);
        } else if (str.length() == 5) {
            i13 = Integer.parseInt(str.substring(0, 1), 16);
            i11 = Integer.parseInt(str.substring(1, 3), 16);
            i10 = Integer.parseInt(str.substring(3, 5), 16);
        } else if (str.length() == 6) {
            i13 = Integer.parseInt(str.substring(0, 2), 16);
            i11 = Integer.parseInt(str.substring(2, 4), 16);
            i10 = Integer.parseInt(str.substring(4, 6), 16);
        } else if (str.length() == 7) {
            int i14 = Integer.parseInt(str.substring(0, 1), 16);
            i13 = Integer.parseInt(str.substring(1, 3), 16);
            int i15 = Integer.parseInt(str.substring(3, 5), 16);
            i10 = Integer.parseInt(str.substring(5, 7), 16);
            i12 = i14;
            i11 = i15;
        } else if (str.length() == 8) {
            i12 = Integer.parseInt(str.substring(0, 2), 16);
            i13 = Integer.parseInt(str.substring(2, 4), 16);
            i11 = Integer.parseInt(str.substring(4, 6), 16);
            i10 = Integer.parseInt(str.substring(6, 8), 16);
        } else {
            i12 = -1;
            i10 = -1;
            i11 = -1;
            i13 = -1;
        }
        return Color.argb(i12, i13, i11, i10);
    }

    /* renamed from: r */
    public final int[] m3937r(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return iArr;
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[length] = i10;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: s */
    public void m3938s(InterfaceC8347b interfaceC8347b) {
        this.f4106a = interfaceC8347b;
    }

    /* renamed from: t */
    public final void m3939t(int i10) {
        if (this.f4121p) {
            this.f4120o.setText(String.format("%08X", Integer.valueOf(i10)));
        } else {
            this.f4120o.setText(String.format("%06X", Integer.valueOf(i10 & ViewCompat.MEASURED_SIZE_MASK)));
        }
    }

    /* renamed from: u */
    public final void m3940u() {
        int iAlpha = 255 - Color.alpha(this.f4109d);
        this.f4116k.setMax(255);
        this.f4116k.setProgress(iAlpha);
        this.f4117l.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((iAlpha * 100.0d) / 255.0d))));
        this.f4116k.setOnSeekBarChangeListener(new C6383a());
    }

    /* renamed from: v */
    public final int m3941v(int i10, double d10) throws NumberFormatException {
        long j10 = Long.parseLong(String.format("#%06X", Integer.valueOf(16777215 & i10)).substring(1), 16);
        double d11 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d10 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d11 = 255.0d;
        }
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d10 *= -1.0d;
        }
        long j11 = j10 >> 16;
        long j12 = (j10 >> 8) & 255;
        long j13 = j10 & 255;
        return Color.argb(Color.alpha(i10), (int) (Math.round((d11 - j11) * d10) + j11), (int) (Math.round((d11 - j12) * d10) + j12), (int) (Math.round((d11 - j13) * d10) + j13));
    }

    /* renamed from: w */
    public final int[] m3942w(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return iArr;
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[0] = i10;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return iArr2;
    }
}
