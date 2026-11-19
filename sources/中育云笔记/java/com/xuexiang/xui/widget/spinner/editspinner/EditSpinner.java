package com.xuexiang.xui.widget.spinner.editspinner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import p177h9.AbstractC9501a;
import p177h9.C9502b;

/* loaded from: classes5.dex */
public class EditSpinner extends FrameLayout implements View.OnClickListener, AdapterView.OnItemClickListener, TextWatcher {

    /* renamed from: c */
    public EditText f16972c;

    /* renamed from: d */
    public ImageView f16973d;

    /* renamed from: e */
    public ListPopupWindow f16974e;

    /* renamed from: f */
    public AbstractC9501a f16975f;

    /* renamed from: g */
    public long f16976g;

    /* renamed from: h */
    public Animation f16977h;

    /* renamed from: i */
    public Animation f16978i;

    /* renamed from: j */
    public AdapterView.OnItemClickListener f16979j;

    /* renamed from: k */
    public int f16980k;

    /* renamed from: l */
    public Drawable f16981l;

    /* renamed from: m */
    public int f16982m;

    /* renamed from: n */
    public boolean f16983n;

    /* renamed from: o */
    public boolean f16984o;

    /* renamed from: com.xuexiang.xui.widget.spinner.editspinner.EditSpinner$a */
    public class C8253a extends ListPopupWindow {
        public C8253a(Context context) {
            super(context);
        }

        @Override // android.widget.ListPopupWindow
        public void dismiss() {
            super.dismiss();
        }

        @Override // android.widget.ListPopupWindow
        public void show() {
            super.show();
            EditSpinner.this.f16973d.startAnimation(EditSpinner.this.f16977h);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.editspinner.EditSpinner$b */
    public class C8254b implements PopupWindow.OnDismissListener {
        public C8254b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            EditSpinner.this.f16976g = System.currentTimeMillis();
            EditSpinner.this.f16973d.startAnimation(EditSpinner.this.f16978i);
        }
    }

    public EditSpinner(Context context) {
        this(context, null);
    }

    private void setBaseAdapter(BaseAdapter baseAdapter) {
        if (this.f16974e == null) {
            m13232g();
        }
        this.f16974e.setAdapter(baseAdapter);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        this.f16972c.setSelection(string.length());
        if (!TextUtils.isEmpty(string)) {
            if (this.f16983n) {
                m13240o(string);
            }
        } else {
            ListPopupWindow listPopupWindow = this.f16974e;
            if (listPopupWindow != null) {
                listPopupWindow.dismiss();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: e */
    public final void m13230e() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f16977h = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f16977h.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f16978i = rotateAnimation2;
        rotateAnimation2.setDuration(300L);
        this.f16978i.setFillAfter(true);
    }

    /* renamed from: f */
    public final void m13231f(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditSpinner, i10, 0);
        if (typedArrayObtainStyledAttributes != null) {
            this.f16983n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditSpinner_es_isShowFilterData, true);
            this.f16984o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditSpinner_es_isFilterKey, false);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_arrowImage, 0);
            if (resourceId != 0) {
                this.f16973d.setImageResource(resourceId);
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EditSpinner_es_arrowMargin, -1);
            if (dimensionPixelSize != -1) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16973d.getLayoutParams();
                layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.f16973d.setLayoutParams(layoutParams);
            }
            this.f16972c.setHint(typedArrayObtainStyledAttributes.getString(R$styleable.EditSpinner_es_hint));
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_background, 0);
            if (resourceId2 != 0) {
                this.f16972c.setBackgroundResource(resourceId2);
            }
            int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.EditSpinner_es_maxLine, 1);
            this.f16980k = i11;
            this.f16972c.setMaxLines(i11);
            this.f16972c.setLayoutParams(new FrameLayout.LayoutParams(-1, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EditSpinner_es_height, AbstractC8041g.m12219f(getContext(), R$attr.ms_item_height_size))));
            m13238m(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.EditSpinner_es_textColor));
            m13239n(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EditSpinner_es_textSize, AbstractC8041g.m12219f(getContext(), R$attr.xui_config_size_spinner_text)));
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_entries, 0);
            if (resourceId3 != 0) {
                m13235j(AbstractC8040f.m12210k(resourceId3));
            }
            this.f16981l = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.EditSpinner_es_dropdown_bg);
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditSpinner_es_enable, true));
            m13237l(typedArrayObtainStyledAttributes.getInteger(R$styleable.EditSpinner_es_maxLength, -1));
            m13236k(typedArrayObtainStyledAttributes.getInteger(R$styleable.EditSpinner_es_maxEms, -1));
            this.f16982m = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_popAnimStyle, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: g */
    public final void m13232g() {
        C8253a c8253a = new C8253a(getContext());
        this.f16974e = c8253a;
        int i10 = this.f16982m;
        if (i10 != -1) {
            c8253a.setAnimationStyle(i10);
        }
        this.f16974e.setOnItemClickListener(this);
        this.f16974e.setInputMethodMode(2);
        this.f16974e.setSoftInputMode(48);
        this.f16974e.setPromptPosition(1);
        this.f16974e.setWidth(-2);
        this.f16974e.setHeight(-2);
        this.f16974e.setAnchorView(this.f16972c);
        this.f16974e.setVerticalOffset(AbstractC8041g.m12219f(getContext(), R$attr.ms_dropdown_offset));
        this.f16974e.setListSelector(AbstractC8040f.m12205f(getContext(), R$drawable.xui_config_list_item_selector));
        this.f16974e.setOnDismissListener(new C8254b());
        Drawable drawable = this.f16981l;
        if (drawable != null) {
            this.f16974e.setBackgroundDrawable(drawable);
        } else {
            this.f16974e.setBackgroundDrawable(AbstractC8040f.m12205f(getContext(), R$drawable.ms_drop_down_bg_radius));
        }
    }

    public EditText getEditText() {
        return this.f16972c;
    }

    public String getText() {
        EditText editText = this.f16972c;
        return editText != null ? editText.getText().toString() : "";
    }

    /* renamed from: h */
    public final void m13233h(Context context) {
        LayoutInflater.from(context).inflate(R$layout.xui_layout_edit_spinner, this);
        this.f16972c = (EditText) findViewById(R$id.edit_spinner_edit);
        ImageView imageView = (ImageView) findViewById(R$id.edit_spinner_arrow);
        this.f16973d = imageView;
        imageView.setOnClickListener(this);
        this.f16972c.addTextChangedListener(this);
    }

    /* renamed from: i */
    public EditSpinner m13234i(AbstractC9501a abstractC9501a) {
        this.f16975f = abstractC9501a;
        setBaseAdapter(abstractC9501a);
        return this;
    }

    /* renamed from: j */
    public EditSpinner m13235j(String[] strArr) {
        C9502b c9502bM18726e = new C9502b(getContext(), strArr).m18727f(this.f16972c.getTextColors().getDefaultColor()).m18728g(this.f16972c.getTextSize()).m18726e(this.f16984o);
        this.f16975f = c9502bM18726e;
        m13234i(c9502bM18726e);
        return this;
    }

    /* renamed from: k */
    public EditSpinner m13236k(int i10) {
        EditText editText = this.f16972c;
        if (editText != null && i10 > 0) {
            editText.setMaxEms(i10);
        }
        return this;
    }

    /* renamed from: l */
    public EditSpinner m13237l(int i10) {
        if (this.f16972c != null && i10 > 0) {
            this.f16972c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
        return this;
    }

    /* renamed from: m */
    public EditSpinner m13238m(ColorStateList colorStateList) {
        EditText editText = this.f16972c;
        if (editText != null && colorStateList != null) {
            editText.setTextColor(colorStateList);
            AbstractC9501a abstractC9501a = this.f16975f;
            if (abstractC9501a != null && (abstractC9501a instanceof C9502b)) {
                ((C9502b) abstractC9501a).m18727f(colorStateList.getDefaultColor());
            }
        }
        return this;
    }

    /* renamed from: n */
    public EditSpinner m13239n(float f10) {
        EditText editText = this.f16972c;
        if (editText != null) {
            editText.setTextSize(0, f10);
            AbstractC9501a abstractC9501a = this.f16975f;
            if (abstractC9501a != null && (abstractC9501a instanceof C9502b)) {
                ((C9502b) abstractC9501a).m18728g(f10);
            }
        }
        return this;
    }

    /* renamed from: o */
    public final void m13240o(String str) {
        AbstractC9501a abstractC9501a;
        if (this.f16974e == null || (abstractC9501a = this.f16975f) == null || abstractC9501a.mo18722b() == null) {
            ListPopupWindow listPopupWindow = this.f16974e;
            if (listPopupWindow != null) {
                listPopupWindow.dismiss();
                return;
            }
            return;
        }
        if (this.f16975f.mo18722b().mo18724a(str)) {
            this.f16974e.dismiss();
        } else {
            this.f16974e.show();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m13241p();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f16972c.setText(((AbstractC9501a) adapterView.getAdapter()).mo18723c(i10));
        ListPopupWindow listPopupWindow = this.f16974e;
        if (listPopupWindow != null) {
            listPopupWindow.dismiss();
        }
        AdapterView.OnItemClickListener onItemClickListener = this.f16979j;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i10, j10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: p */
    public final void m13241p() {
        if (System.currentTimeMillis() - this.f16976g <= 200 || this.f16975f == null || this.f16974e == null) {
            return;
        }
        m13240o("");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        EditText editText = this.f16972c;
        if (editText != null) {
            editText.setFocusable(z10);
            this.f16972c.setFocusableInTouchMode(z10);
            this.f16972c.setEnabled(z10);
            this.f16973d.setEnabled(z10);
        }
    }

    public EditSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.EditSpinnerStyle);
    }

    public EditSpinner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16980k = 1;
        this.f16983n = true;
        this.f16984o = false;
        m13233h(context);
        m13231f(context, attributeSet, i10);
        m13230e();
    }
}
