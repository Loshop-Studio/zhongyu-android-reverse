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
import androidx.core.view.C0358u;
import androidx.customview.view.AbsSavedState;
import anet.channel.bytes.C0860a;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p015c.C1038a;
import p015c.C1041d;
import p015c.C1043f;
import p015c.C1044g;
import p015c.C1045h;
import p015c.C1047j;
import p084f0.AbstractC2500a;
import p088g.InterfaceC2621c;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC2621c {

    /* renamed from: f0 */
    static final C0191n f930f0;

    /* renamed from: A */
    private boolean f931A;

    /* renamed from: B */
    private boolean f932B;

    /* renamed from: C */
    AbstractC2500a f933C;

    /* renamed from: D */
    private boolean f934D;

    /* renamed from: E */
    private CharSequence f935E;

    /* renamed from: F */
    private boolean f936F;

    /* renamed from: G */
    private boolean f937G;

    /* renamed from: H */
    private int f938H;

    /* renamed from: I */
    private boolean f939I;

    /* renamed from: J */
    private CharSequence f940J;

    /* renamed from: K */
    private CharSequence f941K;

    /* renamed from: L */
    private boolean f942L;

    /* renamed from: M */
    private int f943M;

    /* renamed from: N */
    SearchableInfo f944N;

    /* renamed from: S */
    private Bundle f945S;

    /* renamed from: T */
    private final Runnable f946T;

    /* renamed from: U */
    private Runnable f947U;

    /* renamed from: V */
    private final WeakHashMap<String, Drawable.ConstantState> f948V;

    /* renamed from: W */
    private final View.OnClickListener f949W;

    /* renamed from: a */
    final SearchAutoComplete f950a;

    /* renamed from: a0 */
    View.OnKeyListener f951a0;

    /* renamed from: b */
    private final View f952b;

    /* renamed from: b0 */
    private final TextView.OnEditorActionListener f953b0;

    /* renamed from: c */
    private final View f954c;

    /* renamed from: c0 */
    private final AdapterView.OnItemClickListener f955c0;

    /* renamed from: d */
    private final View f956d;

    /* renamed from: d0 */
    private final AdapterView.OnItemSelectedListener f957d0;

    /* renamed from: e */
    final ImageView f958e;

    /* renamed from: e0 */
    private TextWatcher f959e0;

    /* renamed from: f */
    final ImageView f960f;

    /* renamed from: g */
    final ImageView f961g;

    /* renamed from: h */
    final ImageView f962h;

    /* renamed from: i */
    private final View f963i;

    /* renamed from: j */
    private C0192o f964j;

    /* renamed from: k */
    private Rect f965k;

    /* renamed from: l */
    private Rect f966l;

    /* renamed from: m */
    private int[] f967m;

    /* renamed from: n */
    private int[] f968n;

    /* renamed from: o */
    private final ImageView f969o;

    /* renamed from: p */
    private final Drawable f970p;

    /* renamed from: q */
    private final int f971q;

    /* renamed from: r */
    private final int f972r;

    /* renamed from: s */
    private final Intent f973s;

    /* renamed from: t */
    private final Intent f974t;

    /* renamed from: u */
    private final CharSequence f975u;

    /* renamed from: v */
    private InterfaceC0189l f976v;

    /* renamed from: w */
    private InterfaceC0188k f977w;

    /* renamed from: x */
    View.OnFocusChangeListener f978x;

    /* renamed from: y */
    private InterfaceC0190m f979y;

    /* renamed from: z */
    private View.OnClickListener f980z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0176a();

        /* renamed from: a */
        boolean f981a;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0176a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0176a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f981a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f981a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f981a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        private int f982a;

        /* renamed from: b */
        private SearchView f983b;

        /* renamed from: c */
        private boolean f984c;

        /* renamed from: d */
        final Runnable f985d;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class RunnableC0177a implements Runnable {
            RunnableC0177a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m716c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1038a.f5752p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        void m714a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f930f0.m723c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: b */
        boolean m715b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: c */
        void m716c() {
            if (this.f984c) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f984c = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f982a <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f984c) {
                removeCallbacks(this.f985d);
                post(this.f985d);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z3, int i4, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z3, i4, rect);
            this.f983b.m696B();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
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
                        this.f983b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f983b.hasFocus() && getVisibility() == 0) {
                this.f984c = true;
                if (SearchView.m691o(getContext())) {
                    m714a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z3) {
                this.f984c = false;
                removeCallbacks(this.f985d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f984c = true;
                    return;
                }
                this.f984c = false;
                removeCallbacks(this.f985d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f983b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f982a = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f985d = new RunnableC0177a();
            this.f982a = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0178a implements TextWatcher {
        C0178a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.m695A(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class RunnableC0179b implements Runnable {
        RunnableC0179b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m699H();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class RunnableC0180c implements Runnable {
        RunnableC0180c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2500a abstractC2500a = SearchView.this.f933C;
            if (abstractC2500a instanceof ViewOnClickListenerC0202a0) {
                abstractC2500a.mo754a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class ViewOnFocusChangeListenerC0181d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0181d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f978x;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z3);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class ViewOnLayoutChangeListenerC0182e implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0182e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.m700d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class ViewOnClickListenerC0183f implements View.OnClickListener {
        ViewOnClickListenerC0183f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f958e) {
                searchView.m708x();
                return;
            }
            if (view == searchView.f961g) {
                searchView.m704t();
                return;
            }
            if (view == searchView.f960f) {
                searchView.m709y();
            } else if (view == searchView.f962h) {
                searchView.m697C();
            } else if (view == searchView.f950a) {
                searchView.m701j();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class ViewOnKeyListenerC0184g implements View.OnKeyListener {
        ViewOnKeyListenerC0184g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f944N == null) {
                return false;
            }
            if (searchView.f950a.isPopupShowing() && SearchView.this.f950a.getListSelection() != -1) {
                return SearchView.this.m710z(view, i4, keyEvent);
            }
            if (SearchView.this.f950a.m715b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m703r(0, null, searchView2.f950a.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0185h implements TextView.OnEditorActionListener {
        C0185h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.m709y();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0186i implements AdapterView.OnItemClickListener {
        C0186i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.m705u(i4, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0187j implements AdapterView.OnItemSelectedListener {
        C0187j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.m706v(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface InterfaceC0188k {
        /* renamed from: a */
        boolean m717a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0189l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0190m {
        /* renamed from: a */
        boolean m718a(int i4);

        /* renamed from: b */
        boolean m719b(int i4);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0191n {

        /* renamed from: a */
        private Method f997a;

        /* renamed from: b */
        private Method f998b;

        /* renamed from: c */
        private Method f999c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0191n() throws NoSuchMethodException, SecurityException {
            this.f997a = null;
            this.f998b = null;
            this.f999c = null;
            m720d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f997a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f998b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f999c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m720d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m721a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m720d();
            Method method = this.f998b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m722b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m720d();
            Method method = this.f997a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m723c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m720d();
            Method method = this.f999c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0192o extends TouchDelegate {

        /* renamed from: a */
        private final View f1000a;

        /* renamed from: b */
        private final Rect f1001b;

        /* renamed from: c */
        private final Rect f1002c;

        /* renamed from: d */
        private final Rect f1003d;

        /* renamed from: e */
        private final int f1004e;

        /* renamed from: f */
        private boolean f1005f;

        public C0192o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1004e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1001b = new Rect();
            this.f1003d = new Rect();
            this.f1002c = new Rect();
            m724a(rect, rect2);
            this.f1000a = view;
        }

        /* renamed from: a */
        public void m724a(Rect rect, Rect rect2) {
            this.f1001b.set(rect);
            this.f1003d.set(rect);
            Rect rect3 = this.f1003d;
            int i4 = this.f1004e;
            rect3.inset(-i4, -i4);
            this.f1002c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z3;
            boolean z4;
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z5 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z4 = this.f1005f;
                    if (z4 && !this.f1003d.contains(x3, y3)) {
                        z5 = z4;
                        z3 = false;
                    }
                } else {
                    if (action == 3) {
                        z4 = this.f1005f;
                        this.f1005f = false;
                    }
                    z3 = true;
                    z5 = false;
                }
                z5 = z4;
                z3 = true;
            } else {
                if (this.f1001b.contains(x3, y3)) {
                    this.f1005f = true;
                    z3 = true;
                }
                z3 = true;
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            if (!z3 || this.f1002c.contains(x3, y3)) {
                Rect rect = this.f1002c;
                motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
            } else {
                motionEvent.setLocation(this.f1000a.getWidth() / 2, this.f1000a.getHeight() / 2);
            }
            return this.f1000a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f930f0 = Build.VERSION.SDK_INT < 29 ? new C0191n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: D */
    private void m674D() {
        post(this.f946T);
    }

    /* renamed from: E */
    private void m675E(int i4) {
        Editable text = this.f950a.getText();
        Cursor cursorMo8419b = this.f933C.mo8419b();
        if (cursorMo8419b == null) {
            return;
        }
        if (!cursorMo8419b.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceMo755c = this.f933C.mo755c(cursorMo8419b);
        if (charSequenceMo755c != null) {
            setQuery(charSequenceMo755c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: G */
    private void m676G() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f950a.getText());
        if (!z4 && (!this.f931A || this.f942L)) {
            z3 = false;
        }
        this.f961g.setVisibility(z3 ? 0 : 8);
        Drawable drawable = this.f961g.getDrawable();
        if (drawable != null) {
            drawable.setState(z4 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: I */
    private void m677I() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f950a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m689l(queryHint));
    }

    /* renamed from: J */
    private void m678J() {
        this.f950a.setThreshold(this.f944N.getSuggestThreshold());
        this.f950a.setImeOptions(this.f944N.getImeOptions());
        int inputType = this.f944N.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f944N.getSuggestAuthority() != null) {
                inputType = inputType | ArrayPool.STANDARD_BUFFER_SIZE_BYTES | C0860a.MAX_POOL_SIZE;
            }
        }
        this.f950a.setInputType(inputType);
        AbstractC2500a abstractC2500a = this.f933C;
        if (abstractC2500a != null) {
            abstractC2500a.mo754a(null);
        }
        if (this.f944N.getSuggestAuthority() != null) {
            ViewOnClickListenerC0202a0 viewOnClickListenerC0202a0 = new ViewOnClickListenerC0202a0(getContext(), this, this.f944N, this.f948V);
            this.f933C = viewOnClickListenerC0202a0;
            this.f950a.setAdapter(viewOnClickListenerC0202a0);
            ((ViewOnClickListenerC0202a0) this.f933C).m761x(this.f936F ? 2 : 1);
        }
    }

    /* renamed from: K */
    private void m679K() {
        this.f956d.setVisibility((m692p() && (this.f960f.getVisibility() == 0 || this.f962h.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: L */
    private void m680L(boolean z3) {
        this.f960f.setVisibility((this.f934D && m692p() && hasFocus() && (z3 || !this.f939I)) ? 0 : 8);
    }

    /* renamed from: M */
    private void m681M(boolean z3) {
        this.f932B = z3;
        int i4 = z3 ? 0 : 8;
        boolean z4 = !TextUtils.isEmpty(this.f950a.getText());
        this.f958e.setVisibility(i4);
        m680L(z4);
        this.f952b.setVisibility(z3 ? 8 : 0);
        this.f969o.setVisibility((this.f969o.getDrawable() == null || this.f931A) ? 8 : 0);
        m676G();
        m682N(!z4);
        m679K();
    }

    /* renamed from: N */
    private void m682N(boolean z3) {
        int i4 = 8;
        if (this.f939I && !m702n() && z3) {
            this.f960f.setVisibility(8);
            i4 = 0;
        }
        this.f962h.setVisibility(i4);
    }

    /* renamed from: e */
    private Intent m683e(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f941K);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f945S;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f944N.getSearchActivity());
        return intent;
    }

    /* renamed from: f */
    private Intent m684f(Cursor cursor, int i4, String str) {
        int position;
        String strM745o;
        try {
            String strM745o2 = ViewOnClickListenerC0202a0.m745o(cursor, "suggest_intent_action");
            if (strM745o2 == null) {
                strM745o2 = this.f944N.getSuggestIntentAction();
            }
            if (strM745o2 == null) {
                strM745o2 = "android.intent.action.SEARCH";
            }
            String str2 = strM745o2;
            String strM745o3 = ViewOnClickListenerC0202a0.m745o(cursor, "suggest_intent_data");
            if (strM745o3 == null) {
                strM745o3 = this.f944N.getSuggestIntentData();
            }
            if (strM745o3 != null && (strM745o = ViewOnClickListenerC0202a0.m745o(cursor, "suggest_intent_data_id")) != null) {
                strM745o3 = strM745o3 + "/" + Uri.encode(strM745o);
            }
            return m683e(str2, strM745o3 == null ? null : Uri.parse(strM745o3), ViewOnClickListenerC0202a0.m745o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0202a0.m745o(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e4);
            return null;
        }
    }

    /* renamed from: g */
    private Intent m685g(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f945S;
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

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1041d.f5778g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1041d.f5779h);
    }

    /* renamed from: h */
    private Intent m686h(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: i */
    private void m687i() {
        this.f950a.dismissDropDown();
    }

    /* renamed from: k */
    private void m688k(View view, Rect rect) {
        view.getLocationInWindow(this.f967m);
        getLocationInWindow(this.f968n);
        int[] iArr = this.f967m;
        int i4 = iArr[1];
        int[] iArr2 = this.f968n;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    /* renamed from: l */
    private CharSequence m689l(CharSequence charSequence) {
        if (!this.f931A || this.f970p == null) {
            return charSequence;
        }
        int textSize = (int) (this.f950a.getTextSize() * 1.25d);
        this.f970p.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f970p), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: m */
    private boolean m690m() {
        SearchableInfo searchableInfo = this.f944N;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f944N.getVoiceSearchLaunchWebSearch()) {
            intent = this.f973s;
        } else if (this.f944N.getVoiceSearchLaunchRecognizer()) {
            intent = this.f974t;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, ArrayPool.STANDARD_BUFFER_SIZE_BYTES) == null) ? false : true;
    }

    /* renamed from: o */
    static boolean m691o(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: p */
    private boolean m692p() {
        return (this.f934D || this.f939I) && !m702n();
    }

    /* renamed from: q */
    private void m693q(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e4) {
            Log.e("SearchView", "Failed launch activity: " + intent, e4);
        }
    }

    /* renamed from: s */
    private boolean m694s(int i4, int i5, String str) {
        Cursor cursorMo8419b = this.f933C.mo8419b();
        if (cursorMo8419b == null || !cursorMo8419b.moveToPosition(i4)) {
            return false;
        }
        m693q(m684f(cursorMo8419b, i5, str));
        return true;
    }

    private void setQuery(CharSequence charSequence) {
        this.f950a.setText(charSequence);
        this.f950a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    void m695A(CharSequence charSequence) {
        Editable text = this.f950a.getText();
        this.f941K = text;
        boolean z3 = !TextUtils.isEmpty(text);
        m680L(z3);
        m682N(!z3);
        m676G();
        m679K();
        if (this.f976v != null && !TextUtils.equals(charSequence, this.f940J)) {
            this.f976v.onQueryTextChange(charSequence.toString());
        }
        this.f940J = charSequence.toString();
    }

    /* renamed from: B */
    void m696B() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m681M(m702n());
        m674D();
        if (this.f950a.hasFocus()) {
            m701j();
        }
    }

    /* renamed from: C */
    void m697C() {
        SearchableInfo searchableInfo = this.f944N;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m686h(this.f973s, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m685g(this.f974t, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: F */
    public void m698F(CharSequence charSequence, boolean z3) {
        this.f950a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f950a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f941K = charSequence;
        }
        if (!z3 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m709y();
    }

    /* renamed from: H */
    void m699H() {
        int[] iArr = this.f950a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f954c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f956d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // p088g.InterfaceC2621c
    /* renamed from: b */
    public void mo512b() {
        if (this.f942L) {
            return;
        }
        this.f942L = true;
        int imeOptions = this.f950a.getImeOptions();
        this.f943M = imeOptions;
        this.f950a.setImeOptions(imeOptions | 33554432);
        this.f950a.setText("");
        setIconified(false);
    }

    @Override // p088g.InterfaceC2621c
    /* renamed from: c */
    public void mo513c() {
        m698F("", false);
        clearFocus();
        m681M(true);
        this.f950a.setImeOptions(this.f943M);
        this.f942L = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f937G = true;
        super.clearFocus();
        this.f950a.clearFocus();
        this.f950a.setImeVisibility(false);
        this.f937G = false;
    }

    /* renamed from: d */
    void m700d() {
        if (this.f963i.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f954c.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM947b = C0226m0.m947b(this);
            int dimensionPixelSize = this.f931A ? resources.getDimensionPixelSize(C1041d.f5776e) + resources.getDimensionPixelSize(C1041d.f5777f) : 0;
            this.f950a.getDropDownBackground().getPadding(rect);
            this.f950a.setDropDownHorizontalOffset(zM947b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f950a.setDropDownWidth((((this.f963i.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f950a.getImeOptions();
    }

    public int getInputType() {
        return this.f950a.getInputType();
    }

    public int getMaxWidth() {
        return this.f938H;
    }

    public CharSequence getQuery() {
        return this.f950a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f935E;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f944N;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f975u : getContext().getText(this.f944N.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f972r;
    }

    int getSuggestionRowLayout() {
        return this.f971q;
    }

    public AbstractC2500a getSuggestionsAdapter() {
        return this.f933C;
    }

    /* renamed from: j */
    void m701j() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f950a.refreshAutoCompleteResults();
            return;
        }
        C0191n c0191n = f930f0;
        c0191n.m722b(this.f950a);
        c0191n.m721a(this.f950a);
    }

    /* renamed from: n */
    public boolean m702n() {
        return this.f932B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f946T);
        post(this.f947U);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            m688k(this.f950a, this.f965k);
            Rect rect = this.f966l;
            Rect rect2 = this.f965k;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            C0192o c0192o = this.f964j;
            if (c0192o != null) {
                c0192o.m724a(this.f966l, this.f965k);
                return;
            }
            C0192o c0192o2 = new C0192o(this.f966l, this.f965k, this.f950a);
            this.f964j = c0192o2;
            setTouchDelegate(c0192o2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        if (m702n()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f938H;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f938H;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f938H) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m681M(savedState.f981a);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f981a = m702n();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        m674D();
    }

    /* renamed from: r */
    void m703r(int i4, String str, String str2) {
        getContext().startActivity(m683e("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.f937G || !isFocusable()) {
            return false;
        }
        if (m702n()) {
            return super.requestFocus(i4, rect);
        }
        boolean zRequestFocus = this.f950a.requestFocus(i4, rect);
        if (zRequestFocus) {
            m681M(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f945S = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            m704t();
        } else {
            m708x();
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f931A == z3) {
            return;
        }
        this.f931A = z3;
        m681M(z3);
        m677I();
    }

    public void setImeOptions(int i4) {
        this.f950a.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f950a.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f938H = i4;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0188k interfaceC0188k) {
        this.f977w = interfaceC0188k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f978x = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0189l interfaceC0189l) {
        this.f976v = interfaceC0189l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f980z = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0190m interfaceC0190m) {
        this.f979y = interfaceC0190m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f935E = charSequence;
        m677I();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f936F = z3;
        AbstractC2500a abstractC2500a = this.f933C;
        if (abstractC2500a instanceof ViewOnClickListenerC0202a0) {
            ((ViewOnClickListenerC0202a0) abstractC2500a).m761x(z3 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f944N = searchableInfo;
        if (searchableInfo != null) {
            m678J();
            m677I();
        }
        boolean zM690m = m690m();
        this.f939I = zM690m;
        if (zM690m) {
            this.f950a.setPrivateImeOptions("nm");
        }
        m681M(m702n());
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f934D = z3;
        m681M(m702n());
    }

    public void setSuggestionsAdapter(AbstractC2500a abstractC2500a) {
        this.f933C = abstractC2500a;
        this.f950a.setAdapter(abstractC2500a);
    }

    /* renamed from: t */
    void m704t() {
        if (!TextUtils.isEmpty(this.f950a.getText())) {
            this.f950a.setText("");
            this.f950a.requestFocus();
            this.f950a.setImeVisibility(true);
        } else if (this.f931A) {
            InterfaceC0188k interfaceC0188k = this.f977w;
            if (interfaceC0188k == null || !interfaceC0188k.m717a()) {
                clearFocus();
                m681M(true);
            }
        }
    }

    /* renamed from: u */
    boolean m705u(int i4, int i5, String str) {
        InterfaceC0190m interfaceC0190m = this.f979y;
        if (interfaceC0190m != null && interfaceC0190m.m719b(i4)) {
            return false;
        }
        m694s(i4, 0, null);
        this.f950a.setImeVisibility(false);
        m687i();
        return true;
    }

    /* renamed from: v */
    boolean m706v(int i4) {
        InterfaceC0190m interfaceC0190m = this.f979y;
        if (interfaceC0190m != null && interfaceC0190m.m718a(i4)) {
            return false;
        }
        m675E(i4);
        return true;
    }

    /* renamed from: w */
    void m707w(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: x */
    void m708x() {
        m681M(false);
        this.f950a.requestFocus();
        this.f950a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f980z;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: y */
    void m709y() {
        Editable text = this.f950a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0189l interfaceC0189l = this.f976v;
        if (interfaceC0189l == null || !interfaceC0189l.onQueryTextSubmit(text.toString())) {
            if (this.f944N != null) {
                m703r(0, null, text.toString());
            }
            this.f950a.setImeVisibility(false);
            m687i();
        }
    }

    /* renamed from: z */
    boolean m710z(View view, int i4, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f944N != null && this.f933C != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return m705u(this.f950a.getListSelection(), 0, null);
            }
            if (i4 == 21 || i4 == 22) {
                this.f950a.setSelection(i4 == 21 ? 0 : this.f950a.length());
                this.f950a.setListSelection(0);
                this.f950a.clearListSelection();
                this.f950a.m714a();
                return true;
            }
            if (i4 == 19) {
                this.f950a.getListSelection();
                return false;
            }
        }
        return false;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5730I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f965k = new Rect();
        this.f966l = new Rect();
        this.f967m = new int[2];
        this.f968n = new int[2];
        this.f946T = new RunnableC0179b();
        this.f947U = new RunnableC0180c();
        this.f948V = new WeakHashMap<>();
        ViewOnClickListenerC0183f viewOnClickListenerC0183f = new ViewOnClickListenerC0183f();
        this.f949W = viewOnClickListenerC0183f;
        this.f951a0 = new ViewOnKeyListenerC0184g();
        C0185h c0185h = new C0185h();
        this.f953b0 = c0185h;
        C0186i c0186i = new C0186i();
        this.f955c0 = c0186i;
        C0187j c0187j = new C0187j();
        this.f957d0 = c0187j;
        this.f959e0 = new C0178a();
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, C1047j.f6106k2, i4, 0);
        LayoutInflater.from(context).inflate(c0214g0M815v.m829n(C1047j.f6156u2, C1044g.f5899t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1043f.f5841J);
        this.f950a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f952b = findViewById(C1043f.f5837F);
        View viewFindViewById = findViewById(C1043f.f5840I);
        this.f954c = viewFindViewById;
        View viewFindViewById2 = findViewById(C1043f.f5847P);
        this.f956d = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C1043f.f5835D);
        this.f958e = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1043f.f5838G);
        this.f960f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1043f.f5836E);
        this.f961g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C1043f.f5842K);
        this.f962h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C1043f.f5839H);
        this.f969o = imageView5;
        C0358u.m2057t0(viewFindViewById, c0214g0M815v.m822g(C1047j.f6161v2));
        C0358u.m2057t0(viewFindViewById2, c0214g0M815v.m822g(C1047j.f6181z2));
        int i5 = C1047j.f6176y2;
        imageView.setImageDrawable(c0214g0M815v.m822g(i5));
        imageView2.setImageDrawable(c0214g0M815v.m822g(C1047j.f6146s2));
        imageView3.setImageDrawable(c0214g0M815v.m822g(C1047j.f6131p2));
        imageView4.setImageDrawable(c0214g0M815v.m822g(C1047j.f5930B2));
        imageView5.setImageDrawable(c0214g0M815v.m822g(i5));
        this.f970p = c0214g0M815v.m822g(C1047j.f6171x2);
        C0218i0.m886a(imageView, getResources().getString(C1045h.f5916o));
        this.f971q = c0214g0M815v.m829n(C1047j.f5925A2, C1044g.f5898s);
        this.f972r = c0214g0M815v.m829n(C1047j.f6136q2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0183f);
        imageView3.setOnClickListener(viewOnClickListenerC0183f);
        imageView2.setOnClickListener(viewOnClickListenerC0183f);
        imageView4.setOnClickListener(viewOnClickListenerC0183f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0183f);
        searchAutoComplete.addTextChangedListener(this.f959e0);
        searchAutoComplete.setOnEditorActionListener(c0185h);
        searchAutoComplete.setOnItemClickListener(c0186i);
        searchAutoComplete.setOnItemSelectedListener(c0187j);
        searchAutoComplete.setOnKeyListener(this.f951a0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0181d());
        setIconifiedByDefault(c0214g0M815v.m816a(C1047j.f6151t2, true));
        int iM821f = c0214g0M815v.m821f(C1047j.f6116m2, -1);
        if (iM821f != -1) {
            setMaxWidth(iM821f);
        }
        this.f975u = c0214g0M815v.m831p(C1047j.f6141r2);
        this.f935E = c0214g0M815v.m831p(C1047j.f6166w2);
        int iM826k = c0214g0M815v.m826k(C1047j.f6126o2, -1);
        if (iM826k != -1) {
            setImeOptions(iM826k);
        }
        int iM826k2 = c0214g0M815v.m826k(C1047j.f6121n2, -1);
        if (iM826k2 != -1) {
            setInputType(iM826k2);
        }
        setFocusable(c0214g0M815v.m816a(C1047j.f6111l2, true));
        c0214g0M815v.m835w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f973s = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f974t = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f963i = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0182e());
        }
        m681M(this.f931A);
        m677I();
    }
}
