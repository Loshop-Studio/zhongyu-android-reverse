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
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.searchview.AnimationUtils;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class MaterialSearchView extends FrameLayout implements Filter.FilterListener {
    public static final int REQUEST_VOICE = 9999;
    private boolean allowVoiceSearch;
    private boolean ellipsize;
    private ListAdapter mAdapter;
    private int mAnimationDuration;
    private ImageButton mBackBtn;
    private ImageButton mClearBtn;
    private boolean mClearingFocus;
    private Context mContext;
    private boolean mIsSearchOpen;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private SavedState mSavedState;
    private View mSearchLayout;
    private EditText mSearchSrcTextView;
    private LinearLayout mSearchTopBar;
    private SearchViewListener mSearchViewListener;
    private ListView mSuggestionsListView;
    private View mTintView;
    private CharSequence mUserQuery;
    private ImageButton mVoiceBtn;
    private boolean submit;
    private Drawable suggestionIcon;

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        };
        boolean isSearchOpen;
        String query;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.query);
            parcel.writeInt(this.isSearchOpen ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.query = parcel.readString();
            this.isSearchOpen = parcel.readInt() == 1;
        }
    }

    public interface SearchViewListener {
        void onSearchViewClosed();

        void onSearchViewShown();
    }

    public MaterialSearchView(Context context) {
        super(context);
        this.mIsSearchOpen = false;
        this.submit = false;
        this.ellipsize = false;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == MaterialSearchView.this.mBackBtn) {
                    MaterialSearchView.this.closeSearch();
                    return;
                }
                if (view == MaterialSearchView.this.mVoiceBtn) {
                    MaterialSearchView.this.onVoiceClicked();
                    return;
                }
                if (view == MaterialSearchView.this.mClearBtn) {
                    MaterialSearchView.this.mSearchSrcTextView.setText((CharSequence) null);
                } else if (view == MaterialSearchView.this.mSearchSrcTextView) {
                    MaterialSearchView.this.showSuggestions();
                } else if (view == MaterialSearchView.this.mTintView) {
                    MaterialSearchView.this.closeSearch();
                }
            }
        };
        initiateView(context);
        initStyle(null, 0);
    }

    private void initSearchView() {
        this.mSearchSrcTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.1
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                MaterialSearchView.this.onSubmitQuery();
                return true;
            }
        });
        this.mSearchSrcTextView.addTextChangedListener(new TextWatcher() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                MaterialSearchView.this.mUserQuery = charSequence;
                MaterialSearchView.this.startFilter(charSequence);
                MaterialSearchView.this.onTextChanged(charSequence);
            }
        });
        this.mSearchSrcTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z3) {
                if (z3) {
                    MaterialSearchView materialSearchView = MaterialSearchView.this;
                    materialSearchView.showKeyboard(materialSearchView.mSearchSrcTextView);
                    MaterialSearchView.this.showSuggestions();
                }
            }
        });
    }

    private void initStyle(AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, C2042R.styleable.MaterialSearchView, i4, 0);
        if (typedArrayObtainStyledAttributes != null) {
            int i5 = C2042R.styleable.MaterialSearchView_msv_searchBackground;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                setBackground(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, i5));
            }
            int i6 = C2042R.styleable.MaterialSearchView_android_textColor;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                setTextColor(typedArrayObtainStyledAttributes.getColor(i6, 0));
            }
            int i7 = C2042R.styleable.MaterialSearchView_android_textColorHint;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                setHintTextColor(typedArrayObtainStyledAttributes.getColor(i7, 0));
            }
            int i8 = C2042R.styleable.MaterialSearchView_android_hint;
            if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                setHint(typedArrayObtainStyledAttributes.getString(i8));
            }
            int i9 = C2042R.styleable.MaterialSearchView_msv_searchVoiceIcon;
            if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                setVoiceIcon(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, i9));
            }
            int i10 = C2042R.styleable.MaterialSearchView_msv_searchClearIcon;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                setCloseIcon(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, i10));
            }
            int i11 = C2042R.styleable.MaterialSearchView_msv_searchBackIcon;
            if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                setBackIcon(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, i11));
            }
            int i12 = C2042R.styleable.MaterialSearchView_msv_searchSuggestionBackground;
            if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                setSuggestionBackground(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, i12));
            }
            int i13 = C2042R.styleable.MaterialSearchView_msv_searchSuggestionIcon;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                setSuggestionIcon(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, i13));
            }
            int i14 = C2042R.styleable.MaterialSearchView_android_inputType;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                setInputType(typedArrayObtainStyledAttributes.getInt(i14, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void initiateView(Context context) {
        this.mContext = context;
        LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_search_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(C2042R.id.search_layout);
        this.mSearchLayout = viewFindViewById;
        this.mSearchTopBar = (LinearLayout) viewFindViewById.findViewById(C2042R.id.search_top_bar);
        this.mSuggestionsListView = (ListView) this.mSearchLayout.findViewById(C2042R.id.suggestion_list);
        this.mSearchSrcTextView = (EditText) this.mSearchLayout.findViewById(C2042R.id.searchTextView);
        this.mBackBtn = (ImageButton) this.mSearchLayout.findViewById(C2042R.id.action_up_btn);
        this.mVoiceBtn = (ImageButton) this.mSearchLayout.findViewById(C2042R.id.action_voice_btn);
        this.mClearBtn = (ImageButton) this.mSearchLayout.findViewById(C2042R.id.action_clear_btn);
        this.mTintView = this.mSearchLayout.findViewById(C2042R.id.transparent_view);
        this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
        this.mBackBtn.setOnClickListener(this.mOnClickListener);
        this.mVoiceBtn.setOnClickListener(this.mOnClickListener);
        this.mClearBtn.setOnClickListener(this.mOnClickListener);
        this.mTintView.setOnClickListener(this.mOnClickListener);
        this.allowVoiceSearch = false;
        showVoice(true);
        initSearchView();
        this.mSuggestionsListView.setVisibility(8);
        setAnimationDuration(AnimationUtils.ANIMATION_DURATION_MEDIUM);
    }

    private boolean isVoiceAvailable() {
        return isInEditMode() || getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.mOnQueryChangeListener;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            closeSearch();
            this.mSearchSrcTextView.setText((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTextChanged(CharSequence charSequence) {
        this.mUserQuery = this.mSearchSrcTextView.getText();
        if (!TextUtils.isEmpty(r0)) {
            this.mClearBtn.setVisibility(0);
            showVoice(false);
        } else {
            this.mClearBtn.setVisibility(8);
            showVoice(true);
        }
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVoiceClicked() {
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, REQUEST_VOICE);
            }
        } catch (Exception unused) {
            Toast.makeText(getContext(), C2042R.string.xui_tip_no_recognize_speech, 0).show();
        }
    }

    private void setVisibleWithAnimation() {
        AnimationUtils.AnimationListener animationListener = new AnimationUtils.AnimationListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.7
            @Override // com.xuexiang.xui.widget.searchview.AnimationUtils.AnimationListener
            public boolean onAnimationCancel(View view) {
                return false;
            }

            @Override // com.xuexiang.xui.widget.searchview.AnimationUtils.AnimationListener
            public boolean onAnimationEnd(View view) {
                if (MaterialSearchView.this.mSearchViewListener == null) {
                    return false;
                }
                MaterialSearchView.this.mSearchViewListener.onSearchViewShown();
                return false;
            }

            @Override // com.xuexiang.xui.widget.searchview.AnimationUtils.AnimationListener
            public boolean onAnimationStart(View view) {
                return false;
            }
        };
        this.mSearchLayout.setVisibility(0);
        AnimationUtils.reveal(this.mSearchTopBar, animationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFilter(CharSequence charSequence) {
        ListAdapter listAdapter = this.mAdapter;
        if (listAdapter == null || !(listAdapter instanceof Filterable)) {
            return;
        }
        ((Filterable) listAdapter).getFilter().filter(charSequence, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        hideKeyboard(this);
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mClearingFocus = false;
    }

    public void closeSearch() {
        if (isSearchOpen()) {
            this.mSearchSrcTextView.setText((CharSequence) null);
            dismissSuggestions();
            clearFocus();
            this.mSearchLayout.setVisibility(8);
            SearchViewListener searchViewListener = this.mSearchViewListener;
            if (searchViewListener != null) {
                searchViewListener.onSearchViewClosed();
            }
            this.mIsSearchOpen = false;
        }
    }

    public void dismissSuggestions() {
        if (this.mSuggestionsListView.getVisibility() == 0) {
            this.mSuggestionsListView.setVisibility(8);
        }
    }

    public void hideKeyboard(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public boolean isSearchOpen() {
        return this.mIsSearchOpen;
    }

    @Override // android.widget.Filter.FilterListener
    public void onFilterComplete(int i4) {
        if (i4 > 0) {
            showSuggestions();
        } else {
            dismissSuggestions();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mSavedState = savedState;
        if (savedState.isSearchOpen) {
            showSearch(false);
            setQuery(this.mSavedState.query, false);
        }
        super.onRestoreInstanceState(this.mSavedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        this.mSavedState = savedState;
        CharSequence charSequence = this.mUserQuery;
        savedState.query = charSequence != null ? charSequence.toString() : null;
        SavedState savedState2 = this.mSavedState;
        savedState2.isSearchOpen = this.mIsSearchOpen;
        return savedState2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (!this.mClearingFocus && isFocusable()) {
            return this.mSearchSrcTextView.requestFocus(i4, rect);
        }
        return false;
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.mAdapter = listAdapter;
        this.mSuggestionsListView.setAdapter(listAdapter);
        startFilter(this.mSearchSrcTextView.getText());
    }

    public void setAnimationDuration(int i4) {
        this.mAnimationDuration = i4;
    }

    public void setBackIcon(Drawable drawable) {
        this.mBackBtn.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.mSearchTopBar.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        this.mSearchTopBar.setBackgroundColor(i4);
    }

    public void setCloseIcon(Drawable drawable) {
        this.mClearBtn.setImageDrawable(drawable);
    }

    public void setCursorDrawable(int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.mSearchSrcTextView, Integer.valueOf(i4));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void setEllipsize(boolean z3) {
        this.ellipsize = z3;
    }

    public void setHint(CharSequence charSequence) {
        this.mSearchSrcTextView.setHint(charSequence);
    }

    public void setHintTextColor(int i4) {
        this.mSearchSrcTextView.setHintTextColor(i4);
    }

    public void setInputType(int i4) {
        this.mSearchSrcTextView.setInputType(i4);
    }

    public void setMenuItem(MenuItem menuItem) {
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.6
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem2) {
                MaterialSearchView.this.showSearch();
                return true;
            }
        });
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mSuggestionsListView.setOnItemClickListener(onItemClickListener);
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.mOnQueryChangeListener = onQueryTextListener;
    }

    public void setOnSearchViewListener(SearchViewListener searchViewListener) {
        this.mSearchViewListener = searchViewListener;
    }

    public void setQuery(CharSequence charSequence, boolean z3) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            EditText editText = this.mSearchSrcTextView;
            editText.setSelection(editText.length());
            this.mUserQuery = charSequence;
        }
        if (!z3 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setSearchFilter(AbstractSearchFilter abstractSearchFilter) {
        ListAdapter listAdapter = this.mAdapter;
        if (listAdapter == null || !(listAdapter instanceof SearchAdapter)) {
            return;
        }
        ((SearchAdapter) listAdapter).setSearchFilter(abstractSearchFilter);
    }

    public void setSubmitOnClick(boolean z3) {
        this.submit = z3;
    }

    public void setSuggestionBackground(Drawable drawable) {
        this.mSuggestionsListView.setBackground(drawable);
    }

    public void setSuggestionIcon(Drawable drawable) {
        this.suggestionIcon = drawable;
    }

    public void setSuggestions(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.mTintView.setVisibility(8);
            return;
        }
        this.mTintView.setVisibility(0);
        final SearchAdapter searchAdapter = new SearchAdapter(this.mContext, strArr, this.suggestionIcon, this.ellipsize);
        setAdapter(searchAdapter);
        setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                MaterialSearchView.this.setQuery((String) searchAdapter.getItem(i4), MaterialSearchView.this.submit);
            }
        });
    }

    public void setTextColor(int i4) {
        this.mSearchSrcTextView.setTextColor(i4);
    }

    public void setVoiceIcon(Drawable drawable) {
        this.mVoiceBtn.setImageDrawable(drawable);
    }

    public void setVoiceSearch(boolean z3) {
        this.allowVoiceSearch = z3;
    }

    public void showKeyboard(View view) {
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public void showSearch() {
        showSearch(true);
    }

    public void showSuggestions() {
        ListAdapter listAdapter = this.mAdapter;
        if (listAdapter == null || listAdapter.getCount() <= 0 || this.mSuggestionsListView.getVisibility() != 8) {
            return;
        }
        this.mSuggestionsListView.setVisibility(0);
    }

    public void showVoice(boolean z3) {
        if (z3 && isVoiceAvailable() && this.allowVoiceSearch) {
            this.mVoiceBtn.setVisibility(0);
        } else {
            this.mVoiceBtn.setVisibility(8);
        }
    }

    public void showSearch(boolean z3) {
        if (isSearchOpen()) {
            return;
        }
        this.mSearchSrcTextView.setText((CharSequence) null);
        this.mSearchSrcTextView.requestFocus();
        if (z3) {
            setVisibleWithAnimation();
        } else {
            this.mSearchLayout.setVisibility(0);
            SearchViewListener searchViewListener = this.mSearchViewListener;
            if (searchViewListener != null) {
                searchViewListener.onSearchViewShown();
            }
        }
        this.mIsSearchOpen = true;
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsSearchOpen = false;
        this.submit = false;
        this.ellipsize = false;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == MaterialSearchView.this.mBackBtn) {
                    MaterialSearchView.this.closeSearch();
                    return;
                }
                if (view == MaterialSearchView.this.mVoiceBtn) {
                    MaterialSearchView.this.onVoiceClicked();
                    return;
                }
                if (view == MaterialSearchView.this.mClearBtn) {
                    MaterialSearchView.this.mSearchSrcTextView.setText((CharSequence) null);
                } else if (view == MaterialSearchView.this.mSearchSrcTextView) {
                    MaterialSearchView.this.showSuggestions();
                } else if (view == MaterialSearchView.this.mTintView) {
                    MaterialSearchView.this.closeSearch();
                }
            }
        };
        initiateView(context);
        initStyle(attributeSet, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        this.mIsSearchOpen = false;
        this.submit = false;
        this.ellipsize = false;
        this.mOnClickListener = new View.OnClickListener() { // from class: com.xuexiang.xui.widget.searchview.MaterialSearchView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == MaterialSearchView.this.mBackBtn) {
                    MaterialSearchView.this.closeSearch();
                    return;
                }
                if (view == MaterialSearchView.this.mVoiceBtn) {
                    MaterialSearchView.this.onVoiceClicked();
                    return;
                }
                if (view == MaterialSearchView.this.mClearBtn) {
                    MaterialSearchView.this.mSearchSrcTextView.setText((CharSequence) null);
                } else if (view == MaterialSearchView.this.mSearchSrcTextView) {
                    MaterialSearchView.this.showSuggestions();
                } else if (view == MaterialSearchView.this.mTintView) {
                    MaterialSearchView.this.closeSearch();
                }
            }
        };
        initiateView(context);
        initStyle(attributeSet, i4);
    }
}
