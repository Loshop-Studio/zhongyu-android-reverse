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
import com.jaredrummler.android.colorpicker.C7379a;
import com.jaredrummler.android.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p162g6.InterfaceC9273b;

/* loaded from: classes5.dex */
public class ColorPickerDialog extends DialogFragment implements ColorPickerView.InterfaceC7378c, TextWatcher {

    /* renamed from: x */
    public static final int[] f11908x = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: d */
    public InterfaceC9273b f11909d;

    /* renamed from: e */
    public FrameLayout f11910e;

    /* renamed from: f */
    public int[] f11911f;

    /* renamed from: g */
    public int f11912g;

    /* renamed from: h */
    public int f11913h;

    /* renamed from: i */
    public int f11914i;

    /* renamed from: j */
    public boolean f11915j;

    /* renamed from: k */
    public int f11916k;

    /* renamed from: l */
    public C7379a f11917l;

    /* renamed from: m */
    public LinearLayout f11918m;

    /* renamed from: n */
    public SeekBar f11919n;

    /* renamed from: o */
    public TextView f11920o;

    /* renamed from: p */
    public ColorPickerView f11921p;

    /* renamed from: q */
    public ColorPanelView f11922q;

    /* renamed from: r */
    public EditText f11923r;

    /* renamed from: s */
    public boolean f11924s;

    /* renamed from: t */
    public int f11925t;

    /* renamed from: u */
    public boolean f11926u;

    /* renamed from: v */
    public int f11927v;

    /* renamed from: w */
    public final View.OnTouchListener f11928w = new ViewOnTouchListenerC7366b();

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$a */
    public class C7365a implements SeekBar.OnSeekBarChangeListener {
        public C7365a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            C7379a c7379a;
            ColorPickerDialog.this.f11920o.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((i10 * 100.0d) / 255.0d))));
            int i11 = 255 - i10;
            int i12 = 0;
            while (true) {
                c7379a = ColorPickerDialog.this.f11917l;
                int[] iArr = c7379a.f12017d;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12];
                ColorPickerDialog.this.f11917l.f12017d[i12] = Color.argb(i11, Color.red(i13), Color.green(i13), Color.blue(i13));
                i12++;
            }
            c7379a.notifyDataSetChanged();
            for (int i14 = 0; i14 < ColorPickerDialog.this.f11918m.getChildCount(); i14++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f11918m.getChildAt(i14);
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
            ColorPickerDialog.this.f11912g = Color.argb(i11, Color.red(ColorPickerDialog.this.f11912g), Color.green(ColorPickerDialog.this.f11912g), Color.blue(ColorPickerDialog.this.f11912g));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$b */
    public class ViewOnTouchListenerC7366b implements View.OnTouchListener {
        public ViewOnTouchListenerC7366b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EditText editText = ColorPickerDialog.this.f11923r;
            if (view == editText || !editText.hasFocus()) {
                return false;
            }
            ColorPickerDialog.this.f11923r.clearFocus();
            ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(ColorPickerDialog.this.f11923r.getWindowToken(), 0);
            ColorPickerDialog.this.f11923r.clearFocus();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$c */
    public class DialogInterfaceOnClickListenerC7367c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC7367c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            colorPickerDialog.m8857x(colorPickerDialog.f11912g);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$d */
    public class ViewOnClickListenerC7368d implements View.OnClickListener {
        public ViewOnClickListenerC7368d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ColorPickerDialog.this.f11910e.removeAllViews();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f11913h;
            if (i10 == 0) {
                colorPickerDialog.f11913h = 1;
                ((Button) view).setText(colorPickerDialog.f11927v != 0 ? ColorPickerDialog.this.f11927v : R$string.cpv_custom);
                ColorPickerDialog colorPickerDialog2 = ColorPickerDialog.this;
                colorPickerDialog2.f11910e.addView(colorPickerDialog2.m8854t());
                return;
            }
            if (i10 != 1) {
                return;
            }
            colorPickerDialog.f11913h = 0;
            ((Button) view).setText(colorPickerDialog.f11925t != 0 ? ColorPickerDialog.this.f11925t : R$string.cpv_presets);
            ColorPickerDialog colorPickerDialog3 = ColorPickerDialog.this;
            colorPickerDialog3.f11910e.addView(colorPickerDialog3.m8853s());
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$e */
    public class ViewOnClickListenerC7369e implements View.OnClickListener {
        public ViewOnClickListenerC7369e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int color = ColorPickerDialog.this.f11922q.getColor();
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i10 = colorPickerDialog.f11912g;
            if (color == i10) {
                colorPickerDialog.m8857x(i10);
                ColorPickerDialog.this.dismiss();
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$f */
    public class ViewOnFocusChangeListenerC7370f implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC7370f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                ((InputMethodManager) ColorPickerDialog.this.getActivity().getSystemService("input_method")).showSoftInput(ColorPickerDialog.this.f11923r, 1);
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$g */
    public class C7371g implements C7379a.a {
        public C7371g() {
        }

        @Override // com.jaredrummler.android.colorpicker.C7379a.a
        /* renamed from: a */
        public void mo8860a(int i10) throws Resources.NotFoundException {
            ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
            int i11 = colorPickerDialog.f11912g;
            if (i11 == i10) {
                colorPickerDialog.m8857x(i11);
                ColorPickerDialog.this.dismiss();
            } else {
                colorPickerDialog.f11912g = i10;
                if (colorPickerDialog.f11915j) {
                    colorPickerDialog.m8852r(i10);
                }
            }
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$h */
    public class RunnableC7372h implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ ColorPanelView f11936c;

        /* renamed from: d */
        public final /* synthetic */ int f11937d;

        public RunnableC7372h(ColorPanelView colorPanelView, int i10) {
            this.f11936c = colorPanelView;
            this.f11937d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11936c.setColor(this.f11937d);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$i */
    public class ViewOnClickListenerC7373i implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ ColorPanelView f11939c;

        public ViewOnClickListenerC7373i(ColorPanelView colorPanelView) {
            this.f11939c = colorPanelView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if ((view.getTag() instanceof Boolean) && ((Boolean) view.getTag()).booleanValue()) {
                ColorPickerDialog colorPickerDialog = ColorPickerDialog.this;
                colorPickerDialog.m8857x(colorPickerDialog.f11912g);
                ColorPickerDialog.this.dismiss();
                return;
            }
            ColorPickerDialog.this.f11912g = this.f11939c.getColor();
            ColorPickerDialog.this.f11917l.m8897a();
            for (int i10 = 0; i10 < ColorPickerDialog.this.f11918m.getChildCount(); i10++) {
                FrameLayout frameLayout = (FrameLayout) ColorPickerDialog.this.f11918m.getChildAt(i10);
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
    public class ViewOnLongClickListenerC7374j implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ ColorPanelView f11941c;

        public ViewOnLongClickListenerC7374j(ColorPanelView colorPanelView) {
            this.f11941c = colorPanelView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f11941c.m8840d();
            return true;
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerDialog$k */
    public static final class C7375k {

        /* renamed from: a */
        public int f11943a = R$string.cpv_default_title;

        /* renamed from: b */
        public int f11944b = R$string.cpv_presets;

        /* renamed from: c */
        public int f11945c = R$string.cpv_custom;

        /* renamed from: d */
        public int f11946d = R$string.cpv_select;

        /* renamed from: e */
        public int f11947e = 1;

        /* renamed from: f */
        public int[] f11948f = ColorPickerDialog.f11908x;

        /* renamed from: g */
        public int f11949g = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: h */
        public int f11950h = 0;

        /* renamed from: i */
        public boolean f11951i = false;

        /* renamed from: j */
        public boolean f11952j = true;

        /* renamed from: k */
        public boolean f11953k = true;

        /* renamed from: l */
        public boolean f11954l = true;

        /* renamed from: m */
        public int f11955m = 1;

        /* renamed from: a */
        public ColorPickerDialog m8861a() {
            ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(AgooConstants.MESSAGE_ID, this.f11950h);
            bundle.putInt("dialogType", this.f11947e);
            bundle.putInt(TypedValues.Custom.S_COLOR, this.f11949g);
            bundle.putIntArray("presets", this.f11948f);
            bundle.putBoolean("alpha", this.f11951i);
            bundle.putBoolean("allowCustom", this.f11953k);
            bundle.putBoolean("allowPresets", this.f11952j);
            bundle.putInt("dialogTitle", this.f11943a);
            bundle.putBoolean("showColorShades", this.f11954l);
            bundle.putInt("colorShape", this.f11955m);
            bundle.putInt("presetsButtonText", this.f11944b);
            bundle.putInt("customButtonText", this.f11945c);
            bundle.putInt("selectedButtonText", this.f11946d);
            colorPickerDialog.setArguments(bundle);
            return colorPickerDialog;
        }

        /* renamed from: b */
        public C7375k m8862b(boolean z10) {
            this.f11953k = z10;
            return this;
        }

        /* renamed from: c */
        public C7375k m8863c(boolean z10) {
            this.f11952j = z10;
            return this;
        }

        /* renamed from: d */
        public C7375k m8864d(int i10) {
            this.f11949g = i10;
            return this;
        }

        /* renamed from: e */
        public C7375k m8865e(int i10) {
            this.f11955m = i10;
            return this;
        }

        /* renamed from: f */
        public C7375k m8866f(int i10) {
            this.f11943a = i10;
            return this;
        }

        /* renamed from: g */
        public C7375k m8867g(int i10) {
            this.f11947e = i10;
            return this;
        }

        /* renamed from: h */
        public C7375k m8868h(int[] iArr) {
            this.f11948f = iArr;
            return this;
        }

        /* renamed from: i */
        public C7375k m8869i(boolean z10) {
            this.f11951i = z10;
            return this;
        }

        /* renamed from: j */
        public C7375k m8870j(boolean z10) {
            this.f11954l = z10;
            return this;
        }
    }

    private int getSelectedItemPosition() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f11911f;
            if (i10 >= iArr.length) {
                return -1;
            }
            if (iArr[i10] == this.f11912g) {
                return i10;
            }
            i10++;
        }
    }

    /* renamed from: w */
    public static C7375k m8844w() {
        return new C7375k();
    }

    /* renamed from: A */
    public final int[] m8845A(int[] iArr, int i10) {
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

    /* renamed from: B */
    public void m8846B(InterfaceC9273b interfaceC9273b) {
        this.f11909d = interfaceC9273b;
    }

    /* renamed from: C */
    public final void m8847C(int i10) {
        if (this.f11924s) {
            this.f11923r.setText(String.format("%08X", Integer.valueOf(i10)));
        } else {
            this.f11923r.setText(String.format("%06X", Integer.valueOf(i10 & ViewCompat.MEASURED_SIZE_MASK)));
        }
    }

    /* renamed from: D */
    public final void m8848D() {
        int iAlpha = 255 - Color.alpha(this.f11912g);
        this.f11919n.setMax(255);
        this.f11919n.setProgress(iAlpha);
        this.f11920o.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((iAlpha * 100.0d) / 255.0d))));
        this.f11919n.setOnSeekBarChangeListener(new C7365a());
    }

    /* renamed from: E */
    public final int m8849E(int i10, double d10) throws NumberFormatException {
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

    /* renamed from: F */
    public final int[] m8850F(int[] iArr, int i10) {
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

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int iM8859z;
        if (!this.f11923r.isFocused() || (iM8859z = m8859z(editable.toString())) == this.f11921p.getColor()) {
            return;
        }
        this.f11926u = true;
        this.f11921p.m8884n(iM8859z, true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerView.InterfaceC7378c
    /* renamed from: g */
    public void mo8851g(int i10) {
        this.f11912g = i10;
        ColorPanelView colorPanelView = this.f11922q;
        if (colorPanelView != null) {
            colorPanelView.setColor(i10);
        }
        if (!this.f11926u && this.f11923r != null) {
            m8847C(i10);
            if (this.f11923r.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f11923r.getWindowToken(), 0);
                this.f11923r.clearFocus();
            }
        }
        this.f11926u = false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i10;
        this.f11914i = getArguments().getInt(AgooConstants.MESSAGE_ID);
        this.f11924s = getArguments().getBoolean("alpha");
        this.f11915j = getArguments().getBoolean("showColorShades");
        this.f11916k = getArguments().getInt("colorShape");
        if (bundle == null) {
            this.f11912g = getArguments().getInt(TypedValues.Custom.S_COLOR);
            this.f11913h = getArguments().getInt("dialogType");
        } else {
            this.f11912g = bundle.getInt(TypedValues.Custom.S_COLOR);
            this.f11913h = bundle.getInt("dialogType");
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        this.f11910e = frameLayout;
        int i11 = this.f11913h;
        if (i11 == 0) {
            frameLayout.addView(m8853s());
        } else if (i11 == 1) {
            frameLayout.addView(m8854t());
        }
        int i12 = getArguments().getInt("selectedButtonText");
        if (i12 == 0) {
            i12 = R$string.cpv_select;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setView(this.f11910e).setPositiveButton(i12, new DialogInterfaceOnClickListenerC7367c());
        int i13 = getArguments().getInt("dialogTitle");
        if (i13 != 0) {
            positiveButton.setTitle(i13);
        }
        this.f11925t = getArguments().getInt("presetsButtonText");
        this.f11927v = getArguments().getInt("customButtonText");
        if (this.f11913h == 0 && getArguments().getBoolean("allowPresets")) {
            i10 = this.f11925t;
            if (i10 == 0) {
                i10 = R$string.cpv_presets;
            }
        } else if (this.f11913h == 1 && getArguments().getBoolean("allowCustom")) {
            i10 = this.f11927v;
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
        m8858y();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f11912g);
        bundle.putInt("dialogType", this.f11913h);
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
            button.setOnClickListener(new ViewOnClickListenerC7368d());
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: r */
    public void m8852r(int i10) throws Resources.NotFoundException {
        int[] iArrM8855u = m8855u(i10);
        int i11 = 0;
        if (this.f11918m.getChildCount() != 0) {
            while (i11 < this.f11918m.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f11918m.getChildAt(i11);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
                colorPanelView.setColor(iArrM8855u[i11]);
                colorPanelView.setTag(Boolean.FALSE);
                imageView.setImageDrawable(null);
                i11++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.cpv_item_horizontal_padding);
        int length = iArrM8855u.length;
        while (i11 < length) {
            int i12 = iArrM8855u[i11];
            View viewInflate = View.inflate(getActivity(), this.f11916k == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i12);
            this.f11918m.addView(viewInflate);
            colorPanelView2.post(new RunnableC7372h(colorPanelView2, i12));
            colorPanelView2.setOnClickListener(new ViewOnClickListenerC7373i(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new ViewOnLongClickListenerC7374j(colorPanelView2));
            i11++;
        }
    }

    /* renamed from: s */
    public View m8853s() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_color_picker, null);
        this.f11921p = (ColorPickerView) viewInflate.findViewById(R$id.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_old);
        this.f11922q = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_new);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.cpv_arrow_right);
        this.f11923r = (EditText) viewInflate.findViewById(R$id.cpv_hex);
        try {
            TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorPrimary});
            int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f11921p.setAlphaSliderVisible(this.f11924s);
        colorPanelView.setColor(getArguments().getInt(TypedValues.Custom.S_COLOR));
        this.f11921p.m8884n(this.f11912g, true);
        this.f11922q.setColor(this.f11912g);
        m8847C(this.f11912g);
        if (!this.f11924s) {
            this.f11923r.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f11922q.setOnClickListener(new ViewOnClickListenerC7369e());
        viewInflate.setOnTouchListener(this.f11928w);
        this.f11921p.setOnColorChangedListener(this);
        this.f11923r.addTextChangedListener(this);
        this.f11923r.setOnFocusChangeListener(new ViewOnFocusChangeListenerC7370f());
        return viewInflate;
    }

    /* renamed from: t */
    public View m8854t() throws Resources.NotFoundException {
        View viewInflate = View.inflate(getActivity(), R$layout.cpv_dialog_presets, null);
        this.f11918m = (LinearLayout) viewInflate.findViewById(R$id.shades_layout);
        this.f11919n = (SeekBar) viewInflate.findViewById(R$id.transparency_seekbar);
        this.f11920o = (TextView) viewInflate.findViewById(R$id.transparency_text);
        GridView gridView = (GridView) viewInflate.findViewById(R$id.gridView);
        m8856v();
        if (this.f11915j) {
            m8852r(this.f11912g);
        } else {
            this.f11918m.setVisibility(8);
            viewInflate.findViewById(R$id.shades_divider).setVisibility(8);
        }
        C7379a c7379a = new C7379a(new C7371g(), this.f11911f, getSelectedItemPosition(), this.f11916k);
        this.f11917l = c7379a;
        gridView.setAdapter((ListAdapter) c7379a);
        if (this.f11924s) {
            m8848D();
            return viewInflate;
        }
        viewInflate.findViewById(R$id.transparency_layout).setVisibility(8);
        viewInflate.findViewById(R$id.transparency_title).setVisibility(8);
        return viewInflate;
    }

    /* renamed from: u */
    public final int[] m8855u(int i10) {
        return new int[]{m8849E(i10, 0.9d), m8849E(i10, 0.7d), m8849E(i10, 0.5d), m8849E(i10, 0.333d), m8849E(i10, 0.166d), m8849E(i10, -0.125d), m8849E(i10, -0.25d), m8849E(i10, -0.375d), m8849E(i10, -0.5d), m8849E(i10, -0.675d), m8849E(i10, -0.7d), m8849E(i10, -0.775d)};
    }

    /* renamed from: v */
    public final void m8856v() {
        int iAlpha = Color.alpha(this.f11912g);
        int[] intArray = getArguments().getIntArray("presets");
        this.f11911f = intArray;
        if (intArray == null) {
            this.f11911f = f11908x;
        }
        int[] iArr = this.f11911f;
        boolean z10 = iArr == f11908x;
        this.f11911f = Arrays.copyOf(iArr, iArr.length);
        if (iAlpha != 255) {
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.f11911f;
                if (i10 >= iArr2.length) {
                    break;
                }
                int i11 = iArr2[i10];
                this.f11911f[i10] = Color.argb(iAlpha, Color.red(i11), Color.green(i11), Color.blue(i11));
                i10++;
            }
        }
        this.f11911f = m8850F(this.f11911f, this.f11912g);
        int i12 = getArguments().getInt(TypedValues.Custom.S_COLOR);
        if (i12 != this.f11912g) {
            this.f11911f = m8850F(this.f11911f, i12);
        }
        if (z10) {
            int[] iArr3 = this.f11911f;
            if (iArr3.length == 19) {
                this.f11911f = m8845A(iArr3, Color.argb(iAlpha, 0, 0, 0));
            }
        }
    }

    /* renamed from: x */
    public final void m8857x(int i10) {
        if (this.f11909d != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f11909d.mo8888a(this.f11914i, i10);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (!(activity instanceof InterfaceC9273b)) {
                throw new IllegalStateException("The activity must implement ColorPickerDialogListener");
            }
            ((InterfaceC9273b) activity).mo8888a(this.f11914i, i10);
        }
    }

    /* renamed from: y */
    public final void m8858y() {
        if (this.f11909d != null) {
            Log.w("ColorPickerDialog", "Using deprecated listener which may be remove in future releases");
            this.f11909d.mo8889b(this.f11914i);
        } else {
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC9273b) {
                ((InterfaceC9273b) activity).mo8889b(this.f11914i);
            }
        }
    }

    /* renamed from: z */
    public final int m8859z(String str) throws NumberFormatException {
        int i10;
        int i11;
        if (str.startsWith(MqttTopic.MULTI_LEVEL_WILDCARD)) {
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
}
