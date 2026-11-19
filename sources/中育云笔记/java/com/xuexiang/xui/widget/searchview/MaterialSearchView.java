package com.xuexiang.xui.widget.searchview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
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
import android.widget.Toast;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.widget.searchview.AbstractC8250b;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public class MaterialSearchView extends FrameLayout implements Filter.FilterListener {

    /* renamed from: c */
    public boolean f16900c;

    /* renamed from: d */
    public int f16901d;

    /* renamed from: e */
    public boolean f16902e;

    /* renamed from: f */
    public View f16903f;

    /* renamed from: g */
    public View f16904g;

    /* renamed from: h */
    public ListView f16905h;

    /* renamed from: i */
    public EditText f16906i;

    /* renamed from: j */
    public ImageButton f16907j;

    /* renamed from: k */
    public ImageButton f16908k;

    /* renamed from: l */
    public ImageButton f16909l;

    /* renamed from: m */
    public LinearLayout f16910m;

    /* renamed from: n */
    public CharSequence f16911n;

    /* renamed from: o */
    public CharSequence f16912o;

    /* renamed from: p */
    public ListAdapter f16913p;

    /* renamed from: q */
    public SavedState f16914q;

    /* renamed from: r */
    public boolean f16915r;

    /* renamed from: s */
    public boolean f16916s;

    /* renamed from: t */
    public boolean f16917t;

    /* renamed from: u */
    public Drawable f16918u;

    /* renamed from: v */
    public Context f16919v;

    /* renamed from: w */
    public final View.OnClickListener f16920w;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8239a();

        /* renamed from: c */
        public String f16921c;

        /* renamed from: d */
        public boolean f16922d;

        /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$SavedState$a */
        public static class C8239a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C8240a c8240a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f16921c);
            parcel.writeInt(this.f16922d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f16921c = parcel.readString();
            this.f16922d = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$a */
    public class C8240a implements TextView.OnEditorActionListener {
        public C8240a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            MaterialSearchView.this.m13208u();
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$b */
    public class C8241b implements TextWatcher {
        public C8241b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            MaterialSearchView.this.f16912o = charSequence;
            MaterialSearchView.this.m13199E(charSequence);
            MaterialSearchView.this.m13209v(charSequence);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$c */
    public class ViewOnFocusChangeListenerC8242c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC8242c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                MaterialSearchView materialSearchView = MaterialSearchView.this;
                materialSearchView.m13213z(materialSearchView.f16906i);
                MaterialSearchView.this.m13197C();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$d */
    public class ViewOnClickListenerC8243d implements View.OnClickListener {
        public ViewOnClickListenerC8243d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == MaterialSearchView.this.f16907j) {
                MaterialSearchView.this.m13200m();
                return;
            }
            if (view == MaterialSearchView.this.f16908k) {
                MaterialSearchView.this.m13210w();
                return;
            }
            if (view == MaterialSearchView.this.f16909l) {
                MaterialSearchView.this.f16906i.setText((CharSequence) null);
            } else if (view == MaterialSearchView.this.f16906i) {
                MaterialSearchView.this.m13197C();
            } else if (view == MaterialSearchView.this.f16904g) {
                MaterialSearchView.this.m13200m();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$e */
    public class C8244e implements AdapterView.OnItemClickListener {

        /* renamed from: c */
        public final /* synthetic */ C8252d f16927c;

        public C8244e(C8252d c8252d) {
            this.f16927c = c8252d;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            MaterialSearchView.this.m13211x((String) this.f16927c.getItem(i10), MaterialSearchView.this.f16915r);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$f */
    public class MenuItemOnMenuItemClickListenerC8245f implements MenuItem.OnMenuItemClickListener {
        public MenuItemOnMenuItemClickListenerC8245f() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            MaterialSearchView.this.m13195A();
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$g */
    public class C8246g implements AbstractC8250b.b {
        public C8246g() {
        }

        @Override // com.xuexiang.xui.widget.searchview.AbstractC8250b.b
        public boolean onAnimationCancel(View view) {
            return false;
        }

        @Override // com.xuexiang.xui.widget.searchview.AbstractC8250b.b
        public boolean onAnimationEnd(View view) {
            MaterialSearchView.m13186d(MaterialSearchView.this);
            return false;
        }

        @Override // com.xuexiang.xui.widget.searchview.AbstractC8250b.b
        public boolean onAnimationStart(View view) {
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$h */
    public interface InterfaceC8247h {
    }

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$i */
    public interface InterfaceC8248i {
    }

    public MaterialSearchView(Context context) {
        super(context);
        this.f16900c = false;
        this.f16915r = false;
        this.f16916s = false;
        this.f16920w = new ViewOnClickListenerC8243d();
        m13205r(context);
        m13204q(null, 0);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8248i m13186d(MaterialSearchView materialSearchView) {
        materialSearchView.getClass();
        return null;
    }

    /* renamed from: A */
    public void m13195A() {
        m13196B(true);
    }

    /* renamed from: B */
    public void m13196B(boolean z10) {
        if (m13206s()) {
            return;
        }
        this.f16906i.setText((CharSequence) null);
        this.f16906i.requestFocus();
        if (z10) {
            m13212y();
        } else {
            this.f16903f.setVisibility(0);
        }
        this.f16900c = true;
    }

    /* renamed from: C */
    public void m13197C() {
        ListAdapter listAdapter = this.f16913p;
        if (listAdapter == null || listAdapter.getCount() <= 0 || this.f16905h.getVisibility() != 8) {
            return;
        }
        this.f16905h.setVisibility(0);
    }

    /* renamed from: D */
    public void m13198D(boolean z10) {
        if (z10 && m13207t() && this.f16917t) {
            this.f16908k.setVisibility(0);
        } else {
            this.f16908k.setVisibility(8);
        }
    }

    /* renamed from: E */
    public final void m13199E(CharSequence charSequence) {
        ListAdapter listAdapter = this.f16913p;
        if (listAdapter == null || !(listAdapter instanceof Filterable)) {
            return;
        }
        ((Filterable) listAdapter).getFilter().filter(charSequence, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f16902e = true;
        m13202o(this);
        super.clearFocus();
        this.f16906i.clearFocus();
        this.f16902e = false;
    }

    /* renamed from: m */
    public void m13200m() {
        if (m13206s()) {
            this.f16906i.setText((CharSequence) null);
            m13201n();
            clearFocus();
            this.f16903f.setVisibility(8);
            this.f16900c = false;
        }
    }

    /* renamed from: n */
    public void m13201n() {
        if (this.f16905h.getVisibility() == 0) {
            this.f16905h.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void m13202o(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // android.widget.Filter.FilterListener
    public void onFilterComplete(int i10) {
        if (i10 > 0) {
            m13197C();
        } else {
            m13201n();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f16914q = savedState;
        if (savedState.f16922d) {
            m13196B(false);
            m13211x(this.f16914q.f16921c, false);
        }
        super.onRestoreInstanceState(this.f16914q.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        this.f16914q = savedState;
        CharSequence charSequence = this.f16912o;
        savedState.f16921c = charSequence != null ? charSequence.toString() : null;
        SavedState savedState2 = this.f16914q;
        savedState2.f16922d = this.f16900c;
        return savedState2;
    }

    /* renamed from: p */
    public final void m13203p() {
        this.f16906i.setOnEditorActionListener(new C8240a());
        this.f16906i.addTextChangedListener(new C8241b());
        this.f16906i.setOnFocusChangeListener(new ViewOnFocusChangeListenerC8242c());
    }

    /* renamed from: q */
    public final void m13204q(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f16919v.obtainStyledAttributes(attributeSet, R$styleable.MaterialSearchView, i10, 0);
        if (typedArrayObtainStyledAttributes != null) {
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchBackground)) {
                setBackground(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSearchView_msv_searchBackground));
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
                setVoiceIcon(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSearchView_msv_searchVoiceIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchClearIcon)) {
                setCloseIcon(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSearchView_msv_searchClearIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchBackIcon)) {
                setBackIcon(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSearchView_msv_searchBackIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchSuggestionBackground)) {
                setSuggestionBackground(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSearchView_msv_searchSuggestionBackground));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_msv_searchSuggestionIcon)) {
                setSuggestionIcon(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSearchView_msv_searchSuggestionIcon));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialSearchView_android_inputType)) {
                setInputType(typedArrayObtainStyledAttributes.getInt(R$styleable.MaterialSearchView_android_inputType, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    public final void m13205r(Context context) {
        this.f16919v = context;
        LayoutInflater.from(context).inflate(R$layout.xui_layout_search_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.search_layout);
        this.f16903f = viewFindViewById;
        this.f16910m = (LinearLayout) viewFindViewById.findViewById(R$id.search_top_bar);
        this.f16905h = (ListView) this.f16903f.findViewById(R$id.suggestion_list);
        this.f16906i = (EditText) this.f16903f.findViewById(R$id.searchTextView);
        this.f16907j = (ImageButton) this.f16903f.findViewById(R$id.action_up_btn);
        this.f16908k = (ImageButton) this.f16903f.findViewById(R$id.action_voice_btn);
        this.f16909l = (ImageButton) this.f16903f.findViewById(R$id.action_clear_btn);
        this.f16904g = this.f16903f.findViewById(R$id.transparent_view);
        this.f16906i.setOnClickListener(this.f16920w);
        this.f16907j.setOnClickListener(this.f16920w);
        this.f16908k.setOnClickListener(this.f16920w);
        this.f16909l.setOnClickListener(this.f16920w);
        this.f16904g.setOnClickListener(this.f16920w);
        this.f16917t = false;
        m13198D(true);
        m13203p();
        this.f16905h.setVisibility(8);
        setAnimationDuration(AbstractC8250b.f16933a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.f16902e && isFocusable()) {
            return this.f16906i.requestFocus(i10, rect);
        }
        return false;
    }

    /* renamed from: s */
    public boolean m13206s() {
        return this.f16900c;
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.f16913p = listAdapter;
        this.f16905h.setAdapter(listAdapter);
        m13199E(this.f16906i.getText());
    }

    public void setAnimationDuration(int i10) {
        this.f16901d = i10;
    }

    public void setBackIcon(Drawable drawable) {
        this.f16907j.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.f16910m.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f16910m.setBackgroundColor(i10);
    }

    public void setCloseIcon(Drawable drawable) {
        this.f16909l.setImageDrawable(drawable);
    }

    public void setCursorDrawable(int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f16906i, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setEllipsize(boolean z10) {
        this.f16916s = z10;
    }

    public void setHint(CharSequence charSequence) {
        this.f16906i.setHint(charSequence);
    }

    public void setHintTextColor(int i10) {
        this.f16906i.setHintTextColor(i10);
    }

    public void setInputType(int i10) {
        this.f16906i.setInputType(i10);
    }

    public void setMenuItem(MenuItem menuItem) {
        menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC8245f());
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f16905h.setOnItemClickListener(onItemClickListener);
    }

    public void setOnQueryTextListener(InterfaceC8247h interfaceC8247h) {
    }

    public void setOnSearchViewListener(InterfaceC8248i interfaceC8248i) {
    }

    public void setSearchFilter(AbstractC8249a abstractC8249a) {
        ListAdapter listAdapter = this.f16913p;
        if (listAdapter == null || !(listAdapter instanceof C8252d)) {
            return;
        }
        ((C8252d) listAdapter).m13223c(abstractC8249a);
    }

    public void setSubmitOnClick(boolean z10) {
        this.f16915r = z10;
    }

    public void setSuggestionBackground(Drawable drawable) {
        this.f16905h.setBackground(drawable);
    }

    public void setSuggestionIcon(Drawable drawable) {
        this.f16918u = drawable;
    }

    public void setSuggestions(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f16904g.setVisibility(8);
            return;
        }
        this.f16904g.setVisibility(0);
        C8252d c8252d = new C8252d(this.f16919v, strArr, this.f16918u, this.f16916s);
        setAdapter(c8252d);
        setOnItemClickListener(new C8244e(c8252d));
    }

    public void setTextColor(int i10) {
        this.f16906i.setTextColor(i10);
    }

    public void setVoiceIcon(Drawable drawable) {
        this.f16908k.setImageDrawable(drawable);
    }

    public void setVoiceSearch(boolean z10) {
        this.f16917t = z10;
    }

    /* renamed from: t */
    public final boolean m13207t() {
        return isInEditMode() || getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() == 0;
    }

    /* renamed from: u */
    public final void m13208u() {
        Editable text = this.f16906i.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m13200m();
        this.f16906i.setText((CharSequence) null);
    }

    /* renamed from: v */
    public final void m13209v(CharSequence charSequence) {
        Editable text = this.f16906i.getText();
        this.f16912o = text;
        if (TextUtils.isEmpty(text)) {
            this.f16909l.setVisibility(8);
            m13198D(true);
        } else {
            this.f16909l.setVisibility(0);
            m13198D(false);
        }
        this.f16911n = charSequence.toString();
    }

    /* renamed from: w */
    public final void m13210w() {
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            Context context = this.f16919v;
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 9999);
            }
        } catch (Exception unused) {
            Toast.makeText(getContext(), R$string.xui_tip_no_recognize_speech, 0).show();
        }
    }

    /* renamed from: x */
    public void m13211x(CharSequence charSequence, boolean z10) {
        this.f16906i.setText(charSequence);
        if (charSequence != null) {
            EditText editText = this.f16906i;
            editText.setSelection(editText.length());
            this.f16912o = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m13208u();
    }

    /* renamed from: y */
    public final void m13212y() {
        C8246g c8246g = new C8246g();
        this.f16903f.setVisibility(0);
        AbstractC8250b.m13220a(this.f16910m, c8246g);
    }

    /* renamed from: z */
    public void m13213z(View view) {
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16900c = false;
        this.f16915r = false;
        this.f16916s = false;
        this.f16920w = new ViewOnClickListenerC8243d();
        m13205r(context);
        m13204q(attributeSet, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f16900c = false;
        this.f16915r = false;
        this.f16916s = false;
        this.f16920w = new ViewOnClickListenerC8243d();
        m13205r(context);
        m13204q(attributeSet, i10);
    }
}
