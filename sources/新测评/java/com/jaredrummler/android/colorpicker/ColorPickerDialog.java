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
import com.jaredrummler.android.colorpicker.C6325a;
import com.jaredrummler.android.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import p196p1.InterfaceC8815b;

/* loaded from: classes.dex */
public class ColorPickerDialog extends DialogFragment implements ColorPickerView.InterfaceC6324c, TextWatcher {

    /* renamed from: u */
    public static final int[] f4542u = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: a */
    public InterfaceC8815b f4543a;

    /* renamed from: b */
    public FrameLayout f4544b;

    /* renamed from: c */
    public int[] f4545c;

    /* renamed from: d */
    public int f4546d;

    /* renamed from: e */
    public int f4547e;

    /* renamed from: f */
    public int f4548f;

    /* renamed from: g */
    public boolean f4549g;

    /* renamed from: h */
    public int f4550h;

    /* renamed from: i */
    public C6325a f4551i;

    /* renamed from: j */
    public LinearLayout f4552j;

    /* renamed from: k */
    public SeekBar f4553k;

    /* renamed from: l */
    public TextView f4554l;

    /* renamed from: m */
    public ColorPickerView f4555m;

    /* renamed from: n */
    public ColorPanelView f4556n;

    /* renamed from: o */
    public EditText f4557o;

    /* renamed from: p */
    public boolean f4558p;

    /* renamed from: q */
    public int f4559q;

    /* renamed from: r */
    public boolean f4560r;

    /* renamed from: s */
    public int f4561s;

    /* renamed from: t */
    public final View.OnTouchListener f4562t = new ViewOnTouchListenerC6312b();

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$a */
    public class C6311a implements SeekBar.OnSeekBarChangeListener {
        public C6311a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
            C6325a c6325a;
            ColorPickerDialog.this.f4554l.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((i10 * 100.0d) / 255.0d))));
            int i11 = 255 - i10;
            int i12 = 0;
            while (true) {
                c6325a = ColorPickerDialog.this.f4551i;
                int[] iArr = c6325a.f4640b;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12];
                ColorPickerDialog.this.f4551i.f4640b[i12] = Color.argb(i11, Color.red(i13), Color.green(i13), Color.blue(i13));
                i12++;
            }
            c6325a.notifyDataSetChanged();
            for (int i14 = 0; i14 < ColorPickerDialog.this.f4552j.getChildCount(); i14++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f4552j.getChildAt(i14);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                if (frameLayout.getTag() == null) {
                    frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
                }
                int color = colorPanelView.getColor();
                int iArgb = Color.argb(i11, Color.red(color), Color.green(color), Color.blue(color));
                if (i11 <= 165) {
                    colorPanelView.setBorderColor(iArgb | ViewCompat.MEASURED_STATE_MASK);
                } else {
                    colorPanelView.setBorderColor(((Integer) frameLayout.getTag()).intValue());
                }
                if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                    if (i11 <= 165) {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    } else if (ColorUtils.calculateLuminance(iArgb) >= 0.65d) {
                        imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                    } else {
                        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    }
                }
                colorPanelView.setColor(iArgb);
            }
            ColorPickerDialog.this.f4546d = Color.argb(i11, Color.red(ColorPickerDialog.this.f4546d), Color.green(ColorPickerDialog.this.f4546d), Color.blue(ColorPickerDialog.this.f4546d));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$b */
    public class ViewOnTouchListenerC6312b implements View.OnTouchListener {
        public ViewOnTouchListenerC6312b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText = ColorPickerDialog.this.f4557o;
            if (view == editText || !editText.hasFocus()) {
                return false;
            }
            ColorPickerDialog.this.f4557o.clearFocus();
            ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(ColorPickerDialog.this.f4557o.getWindowToken(), 0);
            ColorPickerDialog.this.f4557o.clearFocus();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$c */
    public class DialogInterfaceOnClickListenerC6313c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC6313c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            colorPickerDialog.m4322l(colorPickerDialog.f4546d);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$d */
    public class ViewOnClickListenerC6314d implements View.OnClickListener {
        public ViewOnClickListenerC6314d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ColorPickerDialog.this.f4544b.removeAllViews();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f4547e;
            if (i10 == 0) {
                colorPickerDialog.f4547e = 1;
                ((Button) view).setText(colorPickerDialog.f4561s != 0 ? ColorPickerDialog.this.f4561s : R$string.cpv_custom);
                ColorPickerDialog colorPickerDialog2 = ColorPickerDialog.this;
                colorPickerDialog2.f4544b.addView(colorPickerDialog2.m4319h());
                return;
            }
            if (i10 != 1) {
                return;
            }
            colorPickerDialog.f4547e = 0;
            ((Button) view).setText(colorPickerDialog.f4559q != 0 ? ColorPickerDialog.this.f4559q : R$string.cpv_presets);
            ColorPickerDialog colorPickerDialog3 = ColorPickerDialog.this;
            colorPickerDialog3.f4544b.addView(colorPickerDialog3.m4318g());
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$e */
    public class ViewOnClickListenerC6315e implements View.OnClickListener {
        public ViewOnClickListenerC6315e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int color = ColorPickerDialog.this.f4556n.getColor();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f4546d;
            if (color == i10) {
                colorPickerDialog.m4322l(i10);
                ColorPickerDialog.this.dismiss();
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$f */
    public class ViewOnFocusChangeListenerC6316f implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC6316f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).showSoftInput(ColorPickerDialog.this.f4557o, 1);
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$g */
    public class C6317g implements C6325a.a {
        public C6317g() {
        }

        @Override // com.jaredrummler.android.colorpicker.C6325a.a
        /* renamed from: a */
        public void mo4331a(int i10) throws Resources.NotFoundException {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i11 = colorPickerDialog.f4546d;
            if (i11 == i10) {
                colorPickerDialog.m4322l(i11);
                ColorPickerDialog.this.dismiss();
            } else {
                colorPickerDialog.f4546d = i10;
                if (colorPickerDialog.f4549g) {
                    colorPickerDialog.m4317f(i10);
                }
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$h */
    public class RunnableC6318h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f4570a;

        /* renamed from: b */
        public final /* synthetic */ int f4571b;

        public RunnableC6318h(ColorPanelView colorPanelView, int i10) {
            this.f4570a = colorPanelView;
            this.f4571b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4570a.setColor(this.f4571b);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$i */
    public class ViewOnClickListenerC6319i implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f4573a;

        public ViewOnClickListenerC6319i(ColorPanelView colorPanelView) {
            this.f4573a = colorPanelView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ((view.getTag() instanceof Boolean) && ((Boolean) view.getTag()).booleanValue()) {
                ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
                colorPickerDialog.m4322l(colorPickerDialog.f4546d);
                ColorPickerDialog.this.dismiss();
                return;
            }
            ColorPickerDialog.this.f4546d = this.f4573a.getColor();
            ColorPickerDialog.this.f4551i.m4365a();
            for (int i10 = 0; i10 < ColorPickerDialog.this.f4552j.getChildCount(); i10++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f4552j.getChildAt(i10);
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
    public class ViewOnLongClickListenerC6320j implements View.OnLongClickListener {

        /* renamed from: a */
        public final /* synthetic */ ColorPanelView f4575a;

        public ViewOnLongClickListenerC6320j(ColorPanelView colorPanelView) {
            this.f4575a = colorPanelView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f4575a.m4311d();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$k */
    public static final class C6321k {

        /* renamed from: a */
        public int f4577a = R$string.cpv_default_title;

        /* renamed from: b */
        public int f4578b = R$string.cpv_presets;

        /* renamed from: c */
        public int f4579c = R$string.cpv_custom;

        /* renamed from: d */
        public int f4580d = R$string.cpv_select;

        /* renamed from: e */
        public int f4581e = 1;

        /* renamed from: f */
        public int[] f4582f = ColorPickerDialog.f4542u;

        /* renamed from: g */
        public int f4583g = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: h */
        public int f4584h = 0;

        /* renamed from: i */
        public boolean f4585i = false;

        /* renamed from: j */
        public boolean f4586j = true;

        /* renamed from: k */
        public boolean f4587k = true;

        /* renamed from: l */
        public boolean f4588l = true;

        /* renamed from: m */
        public int f4589m = 1;

        /* renamed from: a */
        public ColorPickerDialog m4332a() {
            ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f4584h);
            bundle.putInt("dialogType", this.f4581e);
            bundle.putInt(TypedValues.Custom.S_COLOR, this.f4583g);
            bundle.putIntArray("presets", this.f4582f);
            bundle.putBoolean("alpha", this.f4585i);
            bundle.putBoolean("allowCustom", this.f4587k);
            bundle.putBoolean("allowPresets", this.f4586j);
            bundle.putInt("dialogTitle", this.f4577a);
            bundle.putBoolean("showColorShades", this.f4588l);
            bundle.putInt("colorShape", this.f4589m);
            bundle.putInt("presetsButtonText", this.f4578b);
            bundle.putInt("customButtonText", this.f4579c);
            bundle.putInt("selectedButtonText", this.f4580d);
            colorPickerDialog.setArguments(bundle);
            return colorPickerDialog;
        }

        /* renamed from: b */
        public C6321k m4333b(boolean z9) {
            this.f4587k = z9;
            return this;
        }

        /* renamed from: c */
        public C6321k m4334c(boolean z9) {
            this.f4586j = z9;
            return this;
        }

        /* renamed from: d */
        public C6321k m4335d(int i10) {
            this.f4583g = i10;
            return this;
        }

        /* renamed from: e */
        public C6321k m4336e(int i10) {
            this.f4589m = i10;
            return this;
        }

        /* renamed from: f */
        public C6321k m4337f(int i10) {
            this.f4577a = i10;
            return this;
        }

        /* renamed from: g */
        public C6321k m4338g(int i10) {
            this.f4581e = i10;
            return this;
        }

        /* renamed from: h */
        public C6321k m4339h(int[] iArr) {
            this.f4582f = iArr;
            return this;
        }

        /* renamed from: i */
        public C6321k m4340i(boolean z9) {
            this.f4585i = z9;
            return this;
        }

        /* renamed from: j */
        public C6321k m4341j(boolean z9) {
            this.f4588l = z9;
            return this;
        }
    }

    private int getSelectedItemPosition() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4545c;
            if (i10 >= iArr.length) {
                return -1;
            }
            if (iArr[i10] == this.f4546d) {
                return i10;
            }
            i10++;
        }
    }

    /* renamed from: k */
    public static C6321k m4315k() {
        return new C6321k();
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerView.InterfaceC6324c
    /* renamed from: a */
    public void mo4316a(int i10) {
        this.f4546d = i10;
        ColorPanelView colorPanelView = this.f4556n;
        if (colorPanelView != null) {
            colorPanelView.setColor(i10);
        }
        if (!this.f4560r && this.f4557o != null) {
            m4327q(i10);
            if (this.f4557o.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f4557o.getWindowToken(), 0);
                this.f4557o.clearFocus();
            }
        }
        this.f4560r = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int iM4324n;
        if (!this.f4557o.isFocused() || (iM4324n = m4324n(editable.toString())) == this.f4555m.getColor()) {
            return;
        }
        this.f4560r = true;
        this.f4555m.m4355n(iM4324n, true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: f */
    public void m4317f(int i10) throws Resources.NotFoundException {
        int[] iArrM4320i = m4320i(i10);
        int i11 = 0;
        if (this.f4552j.getChildCount() != 0) {
            while (i11 < this.f4552j.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f4552j.getChildAt(i11);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                colorPanelView.setColor(iArrM4320i[i11]);
                colorPanelView.setTag(Boolean.FALSE);
                imageView.setImageDrawable(null);
                i11++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.cpv_item_horizontal_padding);
        int length = iArrM4320i.length;
        while (i11 < length) {
            int i12 = iArrM4320i[i11];
            View viewInflate = View.inflate(getActivity(), this.f4550h == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i12);
            this.f4552j.addView(viewInflate);
            colorPanelView2.post(new RunnableC6318h(colorPanelView2, i12));
            colorPanelView2.setOnClickListener(new ViewOnClickListenerC6319i(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new ViewOnLongClickListenerC6320j(colorPanelView2));
            i11++;
        }
    }

    /* renamed from: g */
    public View m4318g() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_color_picker, null);
        this.f4555m = (ColorPickerView) viewInflate.findViewById(R$id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_old);
        this.f4556n = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_new);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.cpv_arrow_right);
        this.f4557o = (EditText) viewInflate.findViewById(R$id.cpv_hex);
        try {
            TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorPrimary});
            int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f4555m.setAlphaSliderVisible(this.f4558p);
        colorPanelView.setColor(getArguments().getInt(TypedValues.Custom.S_COLOR));
        this.f4555m.m4355n(this.f4546d, true);
        this.f4556n.setColor(this.f4546d);
        m4327q(this.f4546d);
        if (!this.f4558p) {
            this.f4557o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f4556n.setOnClickListener(new ViewOnClickListenerC6315e());
        viewInflate.setOnTouchListener(this.f4562t);
        this.f4555m.setOnColorChangedListener(this);
        this.f4557o.addTextChangedListener(this);
        this.f4557o.setOnFocusChangeListener(new ViewOnFocusChangeListenerC6316f());
        return viewInflate;
    }

    /* renamed from: h */
    public View m4319h() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_presets, null);
        this.f4552j = (LinearLayout) viewInflate.findViewById(R$id.shades_layout);
        this.f4553k = (SeekBar) viewInflate.findViewById(R$id.transparency_seekbar);
        this.f4554l = (TextView) viewInflate.findViewById(R$id.transparency_text);
        GridView gridView = (GridView) viewInflate.findViewById(R$id.gridView);
        m4321j();
        if (this.f4549g) {
            m4317f(this.f4546d);
        } else {
            this.f4552j.setVisibility(8);
            viewInflate.findViewById(R$id.shades_divider).setVisibility(8);
        }
        C6325a c6325a = new C6325a(new C6317g(), this.f4545c, getSelectedItemPosition(), this.f4550h);
        this.f4551i = c6325a;
        gridView.setAdapter((ListAdapter) c6325a);
        if (this.f4558p) {
            m4328r();
            return viewInflate;
        }
        viewInflate.findViewById(R$id.transparency_layout).setVisibility(8);
        viewInflate.findViewById(R$id.transparency_title).setVisibility(8);
        return viewInflate;
    }

    /* renamed from: i */
    public final int[] m4320i(int i10) {
        return new int[]{m4329s(i10, 0.9d), m4329s(i10, 0.7d), m4329s(i10, 0.5d), m4329s(i10, 0.333d), m4329s(i10, 0.166d), m4329s(i10, -0.125d), m4329s(i10, -0.25d), m4329s(i10, -0.375d), m4329s(i10, -0.5d), m4329s(i10, -0.675d), m4329s(i10, -0.7d), m4329s(i10, -0.775d)};
    }

    /* renamed from: j */
    public final void m4321j() {
        int iAlpha = Color.alpha(this.f4546d);
        int[] intArray = getArguments().getIntArray("presets");
        this.f4545c = intArray;
        if (intArray == null) {
            this.f4545c = f4542u;
        }
        int[] iArr = this.f4545c;
        boolean z9 = iArr == f4542u;
        this.f4545c = Arrays.copyOf(iArr, iArr.length);
        if (iAlpha != 255) {
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.f4545c;
                if (i10 >= iArr2.length) {
                    break;
                }
                int i11 = iArr2[i10];
                this.f4545c[i10] = Color.argb(iAlpha, Color.red(i11), Color.green(i11), Color.blue(i11));
                i10++;
            }
        }
        this.f4545c = m4330t(this.f4545c, this.f4546d);
        int i12 = getArguments().getInt(TypedValues.Custom.S_COLOR);
        if (i12 != this.f4546d) {
            this.f4545c = m4330t(this.f4545c, i12);
        }
        if (z9) {
            int[] iArr3 = this.f4545c;
            if (iArr3.length == 19) {
                this.f4545c = m4325o(iArr3, Color.argb(iAlpha, 0, 0, 0));
            }
        }
    }

    /* renamed from: l */
    public final void m4322l(int i10) {
        if (this.f4543a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f4543a.mo4359a(this.f4548f, i10);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (!(activity instanceof InterfaceC8815b)) {
                throw new IllegalStateException("The activity must implement ColorPickerDialogListener");
            }
            ((InterfaceC8815b) activity).mo4359a(this.f4548f, i10);
        }
    }

    /* renamed from: m */
    public final void m4323m() {
        if (this.f4543a != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f4543a.mo4360b(this.f4548f);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC8815b) {
                ((InterfaceC8815b) activity).mo4360b(this.f4548f);
            }
        }
    }

    /* renamed from: n */
    public final int m4324n(String str) throws NumberFormatException {
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

    /* renamed from: o */
    public final int[] m4325o(int[] iArr, int i10) {
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

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i10;
        this.f4548f = getArguments().getInt("id");
        this.f4558p = getArguments().getBoolean("alpha");
        this.f4549g = getArguments().getBoolean("showColorShades");
        this.f4550h = getArguments().getInt("colorShape");
        if (bundle == null) {
            this.f4546d = getArguments().getInt(TypedValues.Custom.S_COLOR);
            this.f4547e = getArguments().getInt("dialogType");
        } else {
            this.f4546d = bundle.getInt(TypedValues.Custom.S_COLOR);
            this.f4547e = bundle.getInt("dialogType");
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.f4544b = frameLayout;
        int i11 = this.f4547e;
        if (i11 == 0) {
            frameLayout.addView(m4318g());
        } else if (i11 == 1) {
            frameLayout.addView(m4319h());
        }
        int i12 = getArguments().getInt("selectedButtonText");
        if (i12 == 0) {
            i12 = R$string.cpv_select;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setView(this.f4544b).setPositiveButton(i12, new DialogInterfaceOnClickListenerC6313c());
        int i13 = getArguments().getInt("dialogTitle");
        if (i13 != 0) {
            positiveButton.setTitle(i13);
        }
        this.f4559q = getArguments().getInt("presetsButtonText");
        this.f4561s = getArguments().getInt("customButtonText");
        if (this.f4547e == 0 && getArguments().getBoolean("allowPresets")) {
            i10 = this.f4559q;
            if (i10 == 0) {
                i10 = R$string.cpv_presets;
            }
        } else if (this.f4547e == 1 && getArguments().getBoolean("allowCustom")) {
            i10 = this.f4561s;
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
        m4323m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f4546d);
        bundle.putInt("dialogType", this.f4547e);
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
            button.setOnClickListener(new ViewOnClickListenerC6314d());
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: p */
    public void m4326p(InterfaceC8815b interfaceC8815b) {
        this.f4543a = interfaceC8815b;
    }

    /* renamed from: q */
    public final void m4327q(int i10) {
        if (this.f4558p) {
            this.f4557o.setText(String.format("%08X", Integer.valueOf(i10)));
        } else {
            this.f4557o.setText(String.format("%06X", Integer.valueOf(i10 & ViewCompat.MEASURED_SIZE_MASK)));
        }
    }

    /* renamed from: r */
    public final void m4328r() {
        int iAlpha = 255 - Color.alpha(this.f4546d);
        this.f4553k.setMax(255);
        this.f4553k.setProgress(iAlpha);
        this.f4554l.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((iAlpha * 100.0d) / 255.0d))));
        this.f4553k.setOnSeekBarChangeListener(new C6311a());
    }

    /* renamed from: s */
    public final int m4329s(int i10, double d10) throws NumberFormatException {
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

    /* renamed from: t */
    public final int[] m4330t(int[] iArr, int i10) {
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
