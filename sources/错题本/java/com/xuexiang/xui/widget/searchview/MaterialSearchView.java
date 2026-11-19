package com.xuexiang.xui.widget.searchview;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p017b1.ViewOnClickListenerC3099c;
import p032c8.C3238c;

/* loaded from: classes3.dex */
public class MaterialSearchView extends FrameLayout implements Filter.FilterListener {

    /* renamed from: t */
    public static final /* synthetic */ int f4831t = 0;

    /* renamed from: a */
    public boolean f4832a;

    /* renamed from: b */
    public boolean f4833b;

    /* renamed from: c */
    public View f4834c;

    /* renamed from: d */
    public View f4835d;

    /* renamed from: e */
    public ListView f4836e;

    /* renamed from: f */
    public EditText f4837f;

    /* renamed from: g */
    public ImageButton f4838g;

    /* renamed from: h */
    public ImageButton f4839h;

    /* renamed from: i */
    public ImageButton f4840i;

    /* renamed from: j */
    public LinearLayout f4841j;

    /* renamed from: k */
    public CharSequence f4842k;

    /* renamed from: l */
    public ListAdapter f4843l;

    /* renamed from: m */
    public SavedState f4844m;

    /* renamed from: n */
    public boolean f4845n;

    /* renamed from: o */
    public boolean f4846o;

    /* renamed from: p */
    public boolean f4847p;

    /* renamed from: q */
    public Drawable f4848q;

    /* renamed from: r */
    public Context f4849r;

    /* renamed from: s */
    public final ViewOnClickListenerC3099c f4850s;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4219j();

        /* renamed from: a */
        public String f4851a;

        /* renamed from: b */
        public boolean f4852b;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4851a);
            parcel.writeInt(this.f4852b ? 1 : 0);
        }
    }

    public MaterialSearchView(Context context) {
        super(context);
        this.f4832a = false;
        this.f4845n = false;
        this.f4846o = false;
        this.f4850s = new ViewOnClickListenerC3099c(this, 3);
        m3568c(context);
        m3567b(null, 0);
    }

    /* renamed from: a */
    public final void m3566a() {
        if (this.f4832a) {
            this.f4837f.setText((CharSequence) null);
            if (this.f4836e.getVisibility() == 0) {
                this.f4836e.setVisibility(8);
            }
            clearFocus();
            this.f4834c.setVisibility(8);
            this.f4832a = false;
        }
    }

    /* renamed from: b */
    public final void m3567b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f4849r.obtainStyledAttributes(attributeSet, R$styleable.MaterialSearchView, i, 0);
        if (typedArrayObtainStyledAttributes != null) {
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchBackground)) {
                getContext();
                setBackground(typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialSearchView_msv_searchBackground));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_android_textColor)) {
                setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSearchView_android_textColor, 0));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_android_textColorHint)) {
                setHintTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSearchView_android_textColorHint, 0));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_android_hint)) {
                setHint(typedArrayObtainStyledAttributes.getString(R$styleable.MaterialSearchView_android_hint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchVoiceIcon)) {
                getContext();
                setVoiceIcon(typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialSearchView_msv_searchVoiceIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchClearIcon)) {
                getContext();
                setCloseIcon(typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialSearchView_msv_searchClearIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchBackIcon)) {
                getContext();
                setBackIcon(typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialSearchView_msv_searchBackIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchSuggestionBackground)) {
                getContext();
                setSuggestionBackground(typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialSearchView_msv_searchSuggestionBackground));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchSuggestionIcon)) {
                getContext();
                setSuggestionIcon(typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialSearchView_msv_searchSuggestionIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_android_inputType)) {
                setInputType(typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialSearchView_android_inputType, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public final void m3568c(Context context) {
        this.f4849r = context;
        LayoutInflater.from(context).inflate(R$layout.xui_layout_search_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.search_layout);
        this.f4834c = viewFindViewById;
        this.f4841j = (LinearLayout) viewFindViewById.findViewById(R$id.search_top_bar);
        this.f4836e = (ListView) this.f4834c.findViewById(R$id.suggestion_list);
        this.f4837f = (EditText) this.f4834c.findViewById(R$id.searchTextView);
        this.f4838g = (ImageButton) this.f4834c.findViewById(R$id.action_up_btn);
        this.f4839h = (ImageButton) this.f4834c.findViewById(R$id.action_voice_btn);
        this.f4840i = (ImageButton) this.f4834c.findViewById(R$id.action_clear_btn);
        this.f4835d = this.f4834c.findViewById(R$id.transparent_view);
        EditText editText = this.f4837f;
        ViewOnClickListenerC3099c viewOnClickListenerC3099c = this.f4850s;
        editText.setOnClickListener(viewOnClickListenerC3099c);
        this.f4838g.setOnClickListener(viewOnClickListenerC3099c);
        this.f4839h.setOnClickListener(viewOnClickListenerC3099c);
        this.f4840i.setOnClickListener(viewOnClickListenerC3099c);
        this.f4835d.setOnClickListener(viewOnClickListenerC3099c);
        this.f4847p = false;
        m3572g(true);
        this.f4837f.setOnEditorActionListener(new C4213d(this));
        this.f4837f.addTextChangedListener(new C4214e(this, 0));
        this.f4837f.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4215f(this, 0));
        this.f4836e.setVisibility(8);
        setAnimationDuration(400);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f4833b = true;
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        super.clearFocus();
        this.f4837f.clearFocus();
        this.f4833b = false;
    }

    /* renamed from: d */
    public final void m3569d(CharSequence charSequence, boolean z8) {
        Editable text;
        this.f4837f.setText(charSequence);
        if (charSequence != null) {
            EditText editText = this.f4837f;
            editText.setSelection(editText.length());
            this.f4842k = charSequence;
        }
        if (!z8 || TextUtils.isEmpty(charSequence) || (text = this.f4837f.getText()) == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m3566a();
        this.f4837f.setText((CharSequence) null);
    }

    /* renamed from: e */
    public final void m3570e(boolean z8) {
        if (this.f4832a) {
            return;
        }
        this.f4837f.setText((CharSequence) null);
        this.f4837f.requestFocus();
        if (z8) {
            C3238c c3238c = new C3238c();
            this.f4834c.setVisibility(0);
            LinearLayout linearLayout = this.f4841j;
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(linearLayout, linearLayout.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, linearLayout.getResources().getDisplayMetrics())), linearLayout.getHeight() / 2, 0.0f, Math.max(linearLayout.getWidth(), linearLayout.getHeight()));
            linearLayout.setVisibility(0);
            animatorCreateCircularReveal.addListener(new C4211b(c3238c, linearLayout));
            animatorCreateCircularReveal.start();
        } else {
            this.f4834c.setVisibility(0);
        }
        this.f4832a = true;
    }

    /* renamed from: f */
    public final void m3571f() {
        ListAdapter listAdapter = this.f4843l;
        if (listAdapter == null || listAdapter.getCount() <= 0 || this.f4836e.getVisibility() != 8) {
            return;
        }
        this.f4836e.setVisibility(0);
    }

    /* renamed from: g */
    public final void m3572g(boolean z8) {
        if (z8 && ((isInEditMode() || getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() == 0) && this.f4847p)) {
            this.f4839h.setVisibility(0);
        } else {
            this.f4839h.setVisibility(8);
        }
    }

    @Override // android.widget.Filter.FilterListener
    public final void onFilterComplete(int i) {
        if (i > 0) {
            m3571f();
        } else if (this.f4836e.getVisibility() == 0) {
            this.f4836e.setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f4844m = savedState;
        if (savedState.f4852b) {
            m3570e(false);
            m3569d(this.f4844m.f4851a, false);
        }
        super.onRestoreInstanceState(this.f4844m.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        this.f4844m = savedState;
        CharSequence charSequence = this.f4842k;
        savedState.f4851a = charSequence != null ? charSequence.toString() : null;
        SavedState savedState2 = this.f4844m;
        savedState2.f4852b = this.f4832a;
        return savedState2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!this.f4833b && isFocusable()) {
            return this.f4837f.requestFocus(i, rect);
        }
        return false;
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.f4843l = listAdapter;
        this.f4836e.setAdapter(listAdapter);
        Editable text = this.f4837f.getText();
        ListAdapter listAdapter2 = this.f4843l;
        if (listAdapter2 == null || !(listAdapter2 instanceof Filterable)) {
            return;
        }
        ((Filterable) listAdapter2).getFilter().filter(text, this);
    }

    public void setAnimationDuration(int i) {
    }

    public void setBackIcon(Drawable drawable) {
        this.f4838g.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.f4841j.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f4841j.setBackgroundColor(i);
    }

    public void setCloseIcon(Drawable drawable) {
        this.f4840i.setImageDrawable(drawable);
    }

    public void setCursorDrawable(int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f4837f, Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEllipsize(boolean z8) {
        this.f4846o = z8;
    }

    public void setHint(CharSequence charSequence) {
        this.f4837f.setHint(charSequence);
    }

    public void setHintTextColor(int i) {
        this.f4837f.setHintTextColor(i);
    }

    public void setInputType(int i) {
        this.f4837f.setInputType(i);
    }

    public void setMenuItem(MenuItem menuItem) {
        menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC4217h(this));
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f4836e.setOnItemClickListener(onItemClickListener);
    }

    public void setOnQueryTextListener(InterfaceC4218i interfaceC4218i) {
    }

    public void setOnSearchViewListener(InterfaceC4220k interfaceC4220k) {
    }

    public void setSearchFilter(AbstractC4210a abstractC4210a) {
        ListAdapter listAdapter = this.f4843l;
        if (listAdapter == null || !(listAdapter instanceof C4222m)) {
            return;
        }
        C4222m c4222m = (C4222m) listAdapter;
        c4222m.f4871f = abstractC4210a;
        abstractC4210a.f4853a = c4222m.f4867b;
        abstractC4210a.f4854b = c4222m;
    }

    public void setSubmitOnClick(boolean z8) {
        this.f4845n = z8;
    }

    public void setSuggestionBackground(Drawable drawable) {
        this.f4836e.setBackground(drawable);
    }

    public void setSuggestionIcon(Drawable drawable) {
        this.f4848q = drawable;
    }

    public void setSuggestions(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f4835d.setVisibility(8);
            return;
        }
        this.f4835d.setVisibility(0);
        Context context = this.f4849r;
        Drawable drawable = this.f4848q;
        boolean z8 = this.f4846o;
        C4222m c4222m = new C4222m();
        c4222m.f4869d = LayoutInflater.from(context);
        c4222m.f4866a = new ArrayList();
        c4222m.f4867b = strArr;
        c4222m.f4868c = drawable;
        c4222m.f4870e = z8;
        C4212c c4212c = new C4212c();
        c4222m.f4871f = c4212c;
        c4212c.f4853a = c4222m.f4867b;
        c4212c.f4854b = c4222m;
        setAdapter(c4222m);
        setOnItemClickListener(new C4216g(this, c4222m));
    }

    public void setTextColor(int i) {
        this.f4837f.setTextColor(i);
    }

    public void setVoiceIcon(Drawable drawable) {
        this.f4839h.setImageDrawable(drawable);
    }

    public void setVoiceSearch(boolean z8) {
        this.f4847p = z8;
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4832a = false;
        this.f4845n = false;
        this.f4846o = false;
        this.f4850s = new ViewOnClickListenerC3099c(this, 3);
        m3568c(context);
        m3567b(attributeSet, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f4832a = false;
        this.f4845n = false;
        this.f4846o = false;
        this.f4850s = new ViewOnClickListenerC3099c(this, 3);
        m3568c(context);
        m3567b(attributeSet, i);
    }
}
