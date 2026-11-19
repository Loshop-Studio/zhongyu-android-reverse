package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.C0013a;
import p000a.p005b.C0014b;
import p000a.p005b.p012g.InterfaceC0041b;
import p000a.p005b.p014h.C0069a1;
import p000a.p005b.p014h.C0075d;
import p000a.p005b.p014h.C0080f0;
import p000a.p005b.p014h.C0110u0;
import p000a.p005b.p014h.ViewOnClickListenerC0098o0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p047i.p048a.AbstractC0284a;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class SearchView extends C0080f0 implements InterfaceC0041b {

    /* renamed from: r0 */
    public static final C0488n f2869r0;

    /* renamed from: A */
    public Rect f2870A;

    /* renamed from: B */
    public Rect f2871B;

    /* renamed from: C */
    public int[] f2872C;

    /* renamed from: D */
    public int[] f2873D;

    /* renamed from: E */
    public final ImageView f2874E;

    /* renamed from: F */
    public final Drawable f2875F;

    /* renamed from: G */
    public final int f2876G;

    /* renamed from: H */
    public final int f2877H;

    /* renamed from: I */
    public final Intent f2878I;

    /* renamed from: J */
    public final Intent f2879J;

    /* renamed from: K */
    public final CharSequence f2880K;

    /* renamed from: L */
    public InterfaceC0486l f2881L;

    /* renamed from: M */
    public InterfaceC0485k f2882M;

    /* renamed from: N */
    public View.OnFocusChangeListener f2883N;

    /* renamed from: O */
    public InterfaceC0487m f2884O;

    /* renamed from: P */
    public View.OnClickListener f2885P;

    /* renamed from: Q */
    public boolean f2886Q;

    /* renamed from: R */
    public boolean f2887R;

    /* renamed from: S */
    public AbstractC0284a f2888S;

    /* renamed from: T */
    public boolean f2889T;

    /* renamed from: U */
    public CharSequence f2890U;

    /* renamed from: V */
    public boolean f2891V;

    /* renamed from: W */
    public boolean f2892W;

    /* renamed from: a0 */
    public int f2893a0;

    /* renamed from: b0 */
    public boolean f2894b0;

    /* renamed from: c0 */
    public CharSequence f2895c0;

    /* renamed from: d0 */
    public CharSequence f2896d0;

    /* renamed from: e0 */
    public boolean f2897e0;

    /* renamed from: f0 */
    public int f2898f0;

    /* renamed from: g0 */
    public SearchableInfo f2899g0;

    /* renamed from: h0 */
    public Bundle f2900h0;

    /* renamed from: i0 */
    public final Runnable f2901i0;

    /* renamed from: j0 */
    public Runnable f2902j0;

    /* renamed from: k0 */
    public final WeakHashMap<String, Drawable.ConstantState> f2903k0;

    /* renamed from: l0 */
    public final View.OnClickListener f2904l0;

    /* renamed from: m0 */
    public View.OnKeyListener f2905m0;

    /* renamed from: n0 */
    public final TextView.OnEditorActionListener f2906n0;

    /* renamed from: o0 */
    public final AdapterView.OnItemClickListener f2907o0;

    /* renamed from: p0 */
    public final AdapterView.OnItemSelectedListener f2908p0;

    /* renamed from: q */
    public final SearchAutoComplete f2909q;

    /* renamed from: q0 */
    public TextWatcher f2910q0;

    /* renamed from: r */
    public final View f2911r;

    /* renamed from: s */
    public final View f2912s;

    /* renamed from: t */
    public final View f2913t;

    /* renamed from: u */
    public final ImageView f2914u;

    /* renamed from: v */
    public final ImageView f2915v;

    /* renamed from: w */
    public final ImageView f2916w;

    /* renamed from: x */
    public final ImageView f2917x;

    /* renamed from: y */
    public final View f2918y;

    /* renamed from: z */
    public C0490p f2919z;

    public static class SearchAutoComplete extends C0075d {

        /* renamed from: e */
        public int f2920e;

        /* renamed from: f */
        public SearchView f2921f;

        /* renamed from: g */
        public boolean f2922g;

        /* renamed from: h */
        public final Runnable f2923h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0474a implements Runnable {
            public RunnableC0474a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f2922g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f2922g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, C1088R.attr.autoCompleteTextViewStyle);
            this.f2923h = new RunnableC0474a();
            this.f2920e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public void m1603a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0488n c0488n = SearchView.f2869r0;
            Objects.requireNonNull(c0488n);
            C0488n.m1609a();
            Method method = c0488n.f2937c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f2920e <= 0 || super.enoughToFilter();
        }

        @Override // p000a.p005b.p014h.C0075d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2922g) {
                removeCallbacks(this.f2923h);
                post(this.f2923h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f2921f;
            searchView.m1591G(searchView.f2887R);
            searchView.post(searchView.f2901i0);
            if (searchView.f2909q.hasFocus()) {
                searchView.m1595s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2921f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.f2921f.hasFocus() && getVisibility() == 0) {
                this.f2922g = true;
                Context context = getContext();
                C0488n c0488n = SearchView.f2869r0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m1603a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2922g = false;
                removeCallbacks(this.f2923h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2922g = true;
                    return;
                }
                this.f2922g = false;
                removeCallbacks(this.f2923h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2921f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2920e = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0475a implements TextWatcher {
        public C0475a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f2909q.getText();
            searchView.f2896d0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.m1590F(z);
            searchView.m1592H(!z);
            searchView.m1586B();
            searchView.m1589E();
            if (searchView.f2881L != null && !TextUtils.equals(charSequence, searchView.f2895c0)) {
                searchView.f2881L.m1606b(charSequence.toString());
            }
            searchView.f2895c0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0476b implements Runnable {
        public RunnableC0476b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m1587C();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0477c implements Runnable {
        public RunnableC0477c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0284a abstractC0284a = SearchView.this.f2888S;
            if (abstractC0284a instanceof ViewOnClickListenerC0098o0) {
                abstractC0284a.mo369b(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0478d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0478d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f2883N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0479e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0479e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f2918y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f2912s.getPaddingLeft();
                Rect rect = new Rect();
                boolean zM281b = C0069a1.m281b(searchView);
                int dimensionPixelSize = searchView.f2886Q ? resources.getDimensionPixelSize(C1088R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C1088R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f2909q.getDropDownBackground().getPadding(rect);
                searchView.f2909q.setDropDownHorizontalOffset(zM281b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f2909q.setDropDownWidth((((searchView.f2918y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0480f implements View.OnClickListener {
        public ViewOnClickListenerC0480f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f2914u) {
                searchView.m1601y();
                return;
            }
            if (view == searchView.f2916w) {
                searchView.m1597u();
                return;
            }
            if (view == searchView.f2915v) {
                searchView.m1602z();
                return;
            }
            if (view != searchView.f2917x) {
                if (view == searchView.f2909q) {
                    searchView.m1595s();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f2899g0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m1594r(searchView.f2879J, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f2878I);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0481g implements View.OnKeyListener {
        public ViewOnKeyListenerC0481g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f2899g0 == null) {
                return false;
            }
            if (searchView.f2909q.isPopupShowing() && SearchView.this.f2909q.getListSelection() != -1) {
                return SearchView.this.m1585A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.f2909q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m1596t(0, null, searchView2.f2909q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0482h implements TextView.OnEditorActionListener {
        public C0482h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m1602z();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0483i implements AdapterView.OnItemClickListener {
        public C0483i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m1598v(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0484j implements AdapterView.OnItemSelectedListener {
        public C0484j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m1599w(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface InterfaceC0485k {
        /* renamed from: a */
        boolean m1604a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0486l {
        /* renamed from: a */
        boolean m1605a(String str);

        /* renamed from: b */
        boolean m1606b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0487m {
        /* renamed from: a */
        boolean m1607a(int i);

        /* renamed from: b */
        boolean m1608b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0488n {

        /* renamed from: a */
        public Method f2935a;

        /* renamed from: b */
        public Method f2936b;

        /* renamed from: c */
        public Method f2937c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0488n() throws NoSuchMethodException, SecurityException {
            this.f2935a = null;
            this.f2936b = null;
            this.f2937c = null;
            m1609a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2935a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2936b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f2937c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m1609a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0489o extends AbstractC0287a {
        public static final Parcelable.Creator<C0489o> CREATOR = new a();

        /* renamed from: d */
        public boolean f2938d;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public class a implements Parcelable.ClassLoaderCreator<C0489o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0489o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0489o[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0489o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0489o(parcel, classLoader);
            }
        }

        public C0489o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2938d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0489o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("SearchView.SavedState{");
            sbM2079g.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2079g.append(" isIconified=");
            sbM2079g.append(this.f2938d);
            sbM2079g.append("}");
            return sbM2079g.toString();
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeValue(Boolean.valueOf(this.f2938d));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0490p extends TouchDelegate {

        /* renamed from: a */
        public final View f2939a;

        /* renamed from: b */
        public final Rect f2940b;

        /* renamed from: c */
        public final Rect f2941c;

        /* renamed from: d */
        public final Rect f2942d;

        /* renamed from: e */
        public final int f2943e;

        /* renamed from: f */
        public boolean f2944f;

        public C0490p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2943e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f2940b = new Rect();
            this.f2942d = new Rect();
            this.f2941c = new Rect();
            m1610a(rect, rect2);
            this.f2939a = view;
        }

        /* renamed from: a */
        public void m1610a(Rect rect, Rect rect2) {
            this.f2940b.set(rect);
            this.f2942d.set(rect);
            Rect rect3 = this.f2942d;
            int i = this.f2943e;
            rect3.inset(-i, -i);
            this.f2941c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float width;
            int height;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f2944f;
                    if (z2 && !this.f2942d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f2944f;
                        this.f2944f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f2940b.contains(x, y)) {
                this.f2944f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f2941c.contains(x, y)) {
                Rect rect = this.f2941c;
                width = x - rect.left;
                height = y - rect.top;
            } else {
                width = this.f2939a.getWidth() / 2;
                height = this.f2939a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f2939a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f2869r0 = Build.VERSION.SDK_INT < 29 ? new C0488n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2870A = new Rect();
        this.f2871B = new Rect();
        this.f2872C = new int[2];
        this.f2873D = new int[2];
        this.f2901i0 = new RunnableC0476b();
        this.f2902j0 = new RunnableC0477c();
        this.f2903k0 = new WeakHashMap<>();
        ViewOnClickListenerC0480f viewOnClickListenerC0480f = new ViewOnClickListenerC0480f();
        this.f2904l0 = viewOnClickListenerC0480f;
        this.f2905m0 = new ViewOnKeyListenerC0481g();
        C0482h c0482h = new C0482h();
        this.f2906n0 = c0482h;
        C0483i c0483i = new C0483i();
        this.f2907o0 = c0483i;
        C0484j c0484j = new C0484j();
        this.f2908p0 = c0484j;
        this.f2910q0 = new C0475a();
        C0110u0 c0110u0 = new C0110u0(context, context.obtainStyledAttributes(attributeSet, C0014b.f45t, i, 0));
        LayoutInflater.from(context).inflate(c0110u0.m426l(9, C1088R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1088R.id.search_src_text);
        this.f2909q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2911r = findViewById(C1088R.id.search_edit_frame);
        View viewFindViewById = findViewById(C1088R.id.search_plate);
        this.f2912s = viewFindViewById;
        View viewFindViewById2 = findViewById(C1088R.id.submit_area);
        this.f2913t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C1088R.id.search_button);
        this.f2914u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1088R.id.search_go_btn);
        this.f2915v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1088R.id.search_close_btn);
        this.f2916w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C1088R.id.search_voice_btn);
        this.f2917x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C1088R.id.search_mag_icon);
        this.f2874E = imageView5;
        Drawable drawableM421g = c0110u0.m421g(10);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        viewFindViewById.setBackground(drawableM421g);
        viewFindViewById2.setBackground(c0110u0.m421g(14));
        imageView.setImageDrawable(c0110u0.m421g(13));
        imageView2.setImageDrawable(c0110u0.m421g(7));
        imageView3.setImageDrawable(c0110u0.m421g(4));
        imageView4.setImageDrawable(c0110u0.m421g(16));
        imageView5.setImageDrawable(c0110u0.m421g(13));
        this.f2875F = c0110u0.m421g(12);
        C0013a.m13d(imageView, getResources().getString(C1088R.string.abc_searchview_description_search));
        this.f2876G = c0110u0.m426l(15, C1088R.layout.abc_search_dropdown_item_icons_2line);
        this.f2877H = c0110u0.m426l(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC0480f);
        imageView3.setOnClickListener(viewOnClickListenerC0480f);
        imageView2.setOnClickListener(viewOnClickListenerC0480f);
        imageView4.setOnClickListener(viewOnClickListenerC0480f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0480f);
        searchAutoComplete.addTextChangedListener(this.f2910q0);
        searchAutoComplete.setOnEditorActionListener(c0482h);
        searchAutoComplete.setOnItemClickListener(c0483i);
        searchAutoComplete.setOnItemSelectedListener(c0484j);
        searchAutoComplete.setOnKeyListener(this.f2905m0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0478d());
        setIconifiedByDefault(c0110u0.m415a(8, true));
        int iM420f = c0110u0.m420f(1, -1);
        if (iM420f != -1) {
            setMaxWidth(iM420f);
        }
        this.f2880K = c0110u0.m428n(6);
        this.f2890U = c0110u0.m428n(11);
        int iM424j = c0110u0.m424j(3, -1);
        if (iM424j != -1) {
            setImeOptions(iM424j);
        }
        int iM424j2 = c0110u0.m424j(2, -1);
        if (iM424j2 != -1) {
            setInputType(iM424j2);
        }
        setFocusable(c0110u0.m415a(0, true));
        c0110u0.f810b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2878I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2879J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2918y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0479e());
        }
        m1591G(this.f2886Q);
        m1588D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1088R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1088R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f2909q.setText(charSequence);
        this.f2909q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public boolean m1585A(int i, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f2899g0 != null && this.f2888S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m1598v(this.f2909q.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f2909q.setSelection(i == 21 ? 0 : this.f2909q.length());
                this.f2909q.setListSelection(0);
                this.f2909q.clearListSelection();
                this.f2909q.m1603a();
                return true;
            }
            if (i != 19 || this.f2909q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m1586B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2909q.getText());
        if (!z2 && (!this.f2886Q || this.f2897e0)) {
            z = false;
        }
        this.f2916w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f2916w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: C */
    public void m1587C() {
        int[] iArr = this.f2909q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2912s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2913t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: D */
    public final void m1588D() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2909q;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        if (this.f2886Q && this.f2875F != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.f2875F.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f2875F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: E */
    public final void m1589E() {
        int i = 0;
        if (!((this.f2889T || this.f2894b0) && !this.f2887R) || (this.f2915v.getVisibility() != 0 && this.f2917x.getVisibility() != 0)) {
            i = 8;
        }
        this.f2913t.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1590F(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f2889T
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f2894b0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f2887R
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f2894b0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f2915v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m1590F(boolean):void");
    }

    /* renamed from: G */
    public final void m1591G(boolean z) {
        this.f2887R = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f2909q.getText());
        this.f2914u.setVisibility(i);
        m1590F(z2);
        this.f2911r.setVisibility(z ? 8 : 0);
        this.f2874E.setVisibility((this.f2874E.getDrawable() == null || this.f2886Q) ? 8 : 0);
        m1586B();
        m1592H(!z2);
        m1589E();
    }

    /* renamed from: H */
    public final void m1592H(boolean z) {
        int i = 8;
        if (this.f2894b0 && !this.f2887R && z) {
            this.f2915v.setVisibility(8);
            i = 0;
        }
        this.f2917x.setVisibility(i);
    }

    @Override // p000a.p005b.p012g.InterfaceC0041b
    /* renamed from: a */
    public void mo150a() {
        if (this.f2897e0) {
            return;
        }
        this.f2897e0 = true;
        int imeOptions = this.f2909q.getImeOptions();
        this.f2898f0 = imeOptions;
        this.f2909q.setImeOptions(imeOptions | 33554432);
        this.f2909q.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f2892W = true;
        super.clearFocus();
        this.f2909q.clearFocus();
        this.f2909q.setImeVisibility(false);
        this.f2892W = false;
    }

    @Override // p000a.p005b.p012g.InterfaceC0041b
    /* renamed from: e */
    public void mo151e() {
        this.f2909q.setText(BuildConfig.FLAVOR);
        SearchAutoComplete searchAutoComplete = this.f2909q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f2896d0 = BuildConfig.FLAVOR;
        clearFocus();
        m1591G(true);
        this.f2909q.setImeOptions(this.f2898f0);
        this.f2897e0 = false;
    }

    public int getImeOptions() {
        return this.f2909q.getImeOptions();
    }

    public int getInputType() {
        return this.f2909q.getInputType();
    }

    public int getMaxWidth() {
        return this.f2893a0;
    }

    public CharSequence getQuery() {
        return this.f2909q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2890U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2899g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2880K : getContext().getText(this.f2899g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2877H;
    }

    public int getSuggestionRowLayout() {
        return this.f2876G;
    }

    public AbstractC0284a getSuggestionsAdapter() {
        return this.f2888S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2901i0);
        post(this.f2902j0);
        super.onDetachedFromWindow();
    }

    @Override // p000a.p005b.p014h.C0080f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f2909q;
            Rect rect = this.f2870A;
            searchAutoComplete.getLocationInWindow(this.f2872C);
            getLocationInWindow(this.f2873D);
            int[] iArr = this.f2872C;
            int i5 = iArr[1];
            int[] iArr2 = this.f2873D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f2871B;
            Rect rect3 = this.f2870A;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0490p c0490p = this.f2919z;
            if (c0490p != null) {
                c0490p.m1610a(this.f2871B, this.f2870A);
                return;
            }
            C0490p c0490p2 = new C0490p(this.f2871B, this.f2870A, this.f2909q);
            this.f2919z = c0490p2;
            setTouchDelegate(c0490p2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // p000a.p005b.p014h.C0080f0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f2887R
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f2893a0
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f2893a0
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f2893a0
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0489o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0489o c0489o = (C0489o) parcelable;
        super.onRestoreInstanceState(c0489o.f1718b);
        m1591G(c0489o.f2938d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0489o c0489o = new C0489o(super.onSaveInstanceState());
        c0489o.f2938d = this.f2887R;
        return c0489o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f2901i0);
    }

    /* renamed from: q */
    public final Intent m1593q(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2896d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2900h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2899g0.getSearchActivity());
        return intent;
    }

    /* renamed from: r */
    public final Intent m1594r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2900h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f2892W || !isFocusable()) {
            return false;
        }
        if (this.f2887R) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f2909q.requestFocus(i, rect);
        if (zRequestFocus) {
            m1591G(false);
        }
        return zRequestFocus;
    }

    /* renamed from: s */
    public void m1595s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2909q.refreshAutoCompleteResults();
            return;
        }
        C0488n c0488n = f2869r0;
        SearchAutoComplete searchAutoComplete = this.f2909q;
        Objects.requireNonNull(c0488n);
        C0488n.m1609a();
        Method method = c0488n.f2935a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0488n c0488n2 = f2869r0;
        SearchAutoComplete searchAutoComplete2 = this.f2909q;
        Objects.requireNonNull(c0488n2);
        C0488n.m1609a();
        Method method2 = c0488n2.f2936b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2900h0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m1597u();
        } else {
            m1601y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2886Q == z) {
            return;
        }
        this.f2886Q = z;
        m1591G(z);
        m1588D();
    }

    public void setImeOptions(int i) {
        this.f2909q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2909q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2893a0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0485k interfaceC0485k) {
        this.f2882M = interfaceC0485k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2883N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0486l interfaceC0486l) {
        this.f2881L = interfaceC0486l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2885P = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0487m interfaceC0487m) {
        this.f2884O = interfaceC0487m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2890U = charSequence;
        m1588D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2891V = z;
        AbstractC0284a abstractC0284a = this.f2888S;
        if (abstractC0284a instanceof ViewOnClickListenerC0098o0) {
            ((ViewOnClickListenerC0098o0) abstractC0284a).f730r = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f2899g0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f2909q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f2909q
            android.app.SearchableInfo r3 = r6.f2899g0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f2899g0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f2899g0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f2909q
            r3.setInputType(r7)
            a.i.a.a r7 = r6.f2888S
            if (r7 == 0) goto L42
            r7.mo369b(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f2899g0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            a.b.h.o0 r7 = new a.b.h.o0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f2899g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f2903k0
            r7.<init>(r3, r6, r4, r5)
            r6.f2888S = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f2909q
            r3.setAdapter(r7)
            a.i.a.a r7 = r6.f2888S
            a.b.h.o0 r7 = (p000a.p005b.p014h.ViewOnClickListenerC0098o0) r7
            boolean r3 = r6.f2891V
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = r0
        L69:
            r7.f730r = r3
        L6b:
            r6.m1588D()
        L6e:
            android.app.SearchableInfo r7 = r6.f2899g0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f2899g0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.f2878I
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f2899g0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.f2879J
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = r3
        La0:
            r6.f2894b0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f2909q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.f2887R
            r6.m1591G(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2889T = z;
        m1591G(this.f2887R);
    }

    public void setSuggestionsAdapter(AbstractC0284a abstractC0284a) {
        this.f2888S = abstractC0284a;
        this.f2909q.setAdapter(abstractC0284a);
    }

    /* renamed from: t */
    public void m1596t(int i, String str, String str2) {
        getContext().startActivity(m1593q("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    /* renamed from: u */
    public void m1597u() {
        if (!TextUtils.isEmpty(this.f2909q.getText())) {
            this.f2909q.setText(BuildConfig.FLAVOR);
            this.f2909q.requestFocus();
            this.f2909q.setImeVisibility(true);
        } else if (this.f2886Q) {
            InterfaceC0485k interfaceC0485k = this.f2882M;
            if (interfaceC0485k == null || !interfaceC0485k.m1604a()) {
                clearFocus();
                m1591G(true);
            }
        }
    }

    /* renamed from: v */
    public boolean m1598v(int i) {
        int position;
        String strM367h;
        InterfaceC0487m interfaceC0487m = this.f2884O;
        if (interfaceC0487m != null && interfaceC0487m.m1608b(i)) {
            return false;
        }
        Cursor cursor = this.f2888S.f1705d;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM1593q = null;
            try {
                int i2 = ViewOnClickListenerC0098o0.f724z;
                String strM367h2 = ViewOnClickListenerC0098o0.m367h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM367h2 == null) {
                    strM367h2 = this.f2899g0.getSuggestIntentAction();
                }
                if (strM367h2 == null) {
                    strM367h2 = "android.intent.action.SEARCH";
                }
                String str = strM367h2;
                String strM367h3 = ViewOnClickListenerC0098o0.m367h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM367h3 == null) {
                    strM367h3 = this.f2899g0.getSuggestIntentData();
                }
                if (strM367h3 != null && (strM367h = ViewOnClickListenerC0098o0.m367h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM367h3 = strM367h3 + "/" + Uri.encode(strM367h);
                }
                intentM1593q = m1593q(str, strM367h3 == null ? null : Uri.parse(strM367h3), ViewOnClickListenerC0098o0.m367h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0098o0.m367h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentM1593q != null) {
                try {
                    getContext().startActivity(intentM1593q);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentM1593q, e3);
                }
            }
        }
        this.f2909q.setImeVisibility(false);
        this.f2909q.dismissDropDown();
        return true;
    }

    /* renamed from: w */
    public boolean m1599w(int i) {
        CharSequence charSequenceMo370c;
        InterfaceC0487m interfaceC0487m = this.f2884O;
        if (interfaceC0487m != null && interfaceC0487m.m1607a(i)) {
            return false;
        }
        Editable text = this.f2909q.getText();
        Cursor cursor = this.f2888S.f1705d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (charSequenceMo370c = this.f2888S.mo370c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(charSequenceMo370c);
        return true;
    }

    /* renamed from: x */
    public void m1600x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: y */
    public void m1601y() {
        m1591G(false);
        this.f2909q.requestFocus();
        this.f2909q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2885P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: z */
    public void m1602z() {
        Editable text = this.f2909q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0486l interfaceC0486l = this.f2881L;
        if (interfaceC0486l == null || !interfaceC0486l.m1605a(text.toString())) {
            if (this.f2899g0 != null) {
                m1596t(0, null, text.toString());
            }
            this.f2909q.setImeVisibility(false);
            this.f2909q.dismissDropDown();
        }
    }
}
