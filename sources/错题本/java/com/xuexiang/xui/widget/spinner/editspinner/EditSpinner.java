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
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p009a8.C0025c;
import p123n3.AbstractC6215b;
import p123n3.C6214a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class EditSpinner extends FrameLayout implements View.OnClickListener, AdapterView.OnItemClickListener, TextWatcher {

    /* renamed from: a */
    public final EditText f4882a;

    /* renamed from: b */
    public final ImageView f4883b;

    /* renamed from: c */
    public C6214a f4884c;

    /* renamed from: d */
    public final RotateAnimation f4885d;

    /* renamed from: e */
    public final RotateAnimation f4886e;

    /* renamed from: f */
    public final Drawable f4887f;

    /* renamed from: g */
    public final int f4888g;

    /* renamed from: h */
    public final boolean f4889h;

    public EditSpinner(Context context) {
        this(context, null);
    }

    private void setBaseAdapter(BaseAdapter baseAdapter) {
        if (this.f4884c == null) {
            C6214a c6214a = new C6214a(this, getContext());
            this.f4884c = c6214a;
            int i = this.f4888g;
            if (i != -1) {
                c6214a.setAnimationStyle(i);
            }
            this.f4884c.setOnItemClickListener(this);
            this.f4884c.setInputMethodMode(2);
            this.f4884c.setSoftInputMode(48);
            this.f4884c.setPromptPosition(1);
            this.f4884c.setWidth(-2);
            this.f4884c.setHeight(-2);
            this.f4884c.setAnchorView(this.f4882a);
            this.f4884c.setVerticalOffset(AbstractC5806u.m5253G(getContext(), R$attr.ms_dropdown_offset, -1));
            this.f4884c.setListSelector(getContext().getDrawable(R$drawable.xui_config_list_item_selector));
            this.f4884c.setOnDismissListener(new C0025c(this, 1));
            Drawable drawable = this.f4887f;
            if (drawable != null) {
                this.f4884c.setBackgroundDrawable(drawable);
            } else {
                this.f4884c.setBackgroundDrawable(getContext().getDrawable(R$drawable.ms_drop_down_bg_radius));
            }
        }
        this.f4884c.setAdapter(baseAdapter);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C6214a c6214a;
        String string = editable.toString();
        this.f4882a.setSelection(string.length());
        if (TextUtils.isEmpty(string)) {
            C6214a c6214a2 = this.f4884c;
            if (c6214a2 != null) {
                c6214a2.dismiss();
                return;
            }
            return;
        }
        if (!this.f4889h || (c6214a = this.f4884c) == null) {
            return;
        }
        c6214a.dismiss();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    public EditText getEditText() {
        return this.f4882a;
    }

    public String getText() {
        EditText editText = this.f4882a;
        return editText != null ? editText.getText().toString() : "";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        System.currentTimeMillis();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        ((AbstractC6215b) adapterView.getAdapter()).getClass();
        throw null;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        EditText editText = this.f4882a;
        if (editText != null) {
            editText.setFocusable(z8);
            this.f4882a.setFocusableInTouchMode(z8);
            this.f4882a.setEnabled(z8);
            this.f4883b.setEnabled(z8);
        }
    }

    public EditSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.EditSpinnerStyle);
    }

    public EditSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4889h = true;
        LayoutInflater.from(context).inflate(R$layout.xui_layout_edit_spinner, this);
        this.f4882a = (EditText) findViewById(R$id.edit_spinner_edit);
        ImageView imageView = (ImageView) findViewById(R$id.edit_spinner_arrow);
        this.f4883b = imageView;
        imageView.setOnClickListener(this);
        this.f4882a.addTextChangedListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditSpinner, i, 0);
        if (typedArrayObtainStyledAttributes != null) {
            this.f4889h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditSpinner_es_isShowFilterData, true);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditSpinner_es_isFilterKey, false);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_arrowImage, 0);
            if (resourceId != 0) {
                this.f4883b.setImageResource(resourceId);
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EditSpinner_es_arrowMargin, -1);
            if (dimensionPixelSize != -1) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4883b.getLayoutParams();
                layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.f4883b.setLayoutParams(layoutParams);
            }
            this.f4882a.setHint(typedArrayObtainStyledAttributes.getString(R$styleable.EditSpinner_es_hint));
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_background, 0);
            if (resourceId2 != 0) {
                this.f4882a.setBackgroundResource(resourceId2);
            }
            this.f4882a.setMaxLines(typedArrayObtainStyledAttributes.getInt(R$styleable.EditSpinner_es_maxLine, 1));
            this.f4882a.setLayoutParams(new FrameLayout.LayoutParams(-1, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EditSpinner_es_height, AbstractC5806u.m5253G(getContext(), R$attr.ms_item_height_size, -1))));
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.EditSpinner_es_textColor);
            EditText editText = this.f4882a;
            if (editText != null && colorStateList != null) {
                editText.setTextColor(colorStateList);
            }
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.EditSpinner_es_textSize, AbstractC5806u.m5253G(getContext(), R$attr.xui_config_size_spinner_text, -1));
            EditText editText2 = this.f4882a;
            if (editText2 != null) {
                editText2.setTextSize(0, dimensionPixelSize2);
            }
            if (typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_entries, 0) == 0) {
                getContext();
                this.f4887f = typedArrayObtainStyledAttributes.getDrawable(R$styleable.EditSpinner_es_dropdown_bg);
                setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditSpinner_es_enable, true));
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.EditSpinner_es_maxLength, -1);
                if (this.f4882a != null && integer > 0) {
                    this.f4882a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
                }
                int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.EditSpinner_es_maxEms, -1);
                EditText editText3 = this.f4882a;
                if (editText3 != null && integer2 > 0) {
                    editText3.setMaxEms(integer2);
                }
                this.f4888g = typedArrayObtainStyledAttributes.getResourceId(R$styleable.EditSpinner_es_popAnimStyle, -1);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                AbstractC6582a.m6217a();
                throw null;
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f4885d = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f4885d.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f4886e = rotateAnimation2;
        rotateAnimation2.setDuration(300L);
        this.f4886e.setFillAfter(true);
    }
}
