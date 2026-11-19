.class public Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filter$FilterListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;,
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;,
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;
    }
.end annotation


# static fields
.field public static final REQUEST_VOICE:I = 0x270f


# instance fields
.field private allowVoiceSearch:Z

.field private ellipsize:Z

.field private mAdapter:Landroid/widget/ListAdapter;

.field private mAnimationDuration:I

.field private mBackBtn:Landroid/widget/ImageButton;

.field private mClearBtn:Landroid/widget/ImageButton;

.field private mClearingFocus:Z

.field private mContext:Landroid/content/Context;

.field private mIsSearchOpen:Z

.field private mOldQueryText:Ljava/lang/CharSequence;

.field private final mOnClickListener:Landroid/view/View$OnClickListener;

.field private mOnQueryChangeListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;

.field private mSavedState:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

.field private mSearchLayout:Landroid/view/View;

.field private mSearchSrcTextView:Landroid/widget/EditText;

.field private mSearchTopBar:Landroid/widget/LinearLayout;

.field private mSearchViewListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;

.field private mSuggestionsListView:Landroid/widget/ListView;

.field private mTintView:Landroid/view/View;

.field private mUserQuery:Ljava/lang/CharSequence;

.field private mVoiceBtn:Landroid/widget/ImageButton;

.field private submit:Z

.field private suggestionIcon:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->submit:Z

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->ellipsize:Z

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initiateView(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initStyle(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->submit:Z

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->ellipsize:Z

    .line 12
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 13
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initiateView(Landroid/content/Context;)V

    .line 14
    invoke-direct {p0, p2, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initStyle(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->submit:Z

    .line 18
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->ellipsize:Z

    .line 19
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 20
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initiateView(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0, p2, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initStyle(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->onSubmitQuery()V

    return-void
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->submit:Z

    return p0
.end method

.method static synthetic access$102(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mUserQuery:Ljava/lang/CharSequence;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchViewListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->startFilter(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->onTextChanged(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mBackBtn:Landroid/widget/ImageButton;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mVoiceBtn:Landroid/widget/ImageButton;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->onVoiceClicked()V

    return-void
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearBtn:Landroid/widget/ImageButton;

    return-object p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mTintView:Landroid/view/View;

    return-object p0
.end method

.method private initSearchView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$1;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$3;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initStyle(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackground:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColor:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setTextColor(I)V

    .line 6
    :cond_1
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColorHint:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setHintTextColor(I)V

    .line 8
    :cond_2
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_hint:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setHint(Ljava/lang/CharSequence;)V

    .line 10
    :cond_3
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchVoiceIcon:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setVoiceIcon(Landroid/graphics/drawable/Drawable;)V

    .line 12
    :cond_4
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchClearIcon:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setCloseIcon(Landroid/graphics/drawable/Drawable;)V

    .line 14
    :cond_5
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackIcon:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setBackIcon(Landroid/graphics/drawable/Drawable;)V

    .line 16
    :cond_6
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionBackground:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 17
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestionBackground(Landroid/graphics/drawable/Drawable;)V

    .line 18
    :cond_7
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionIcon:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestionIcon(Landroid/graphics/drawable/Drawable;)V

    .line 20
    :cond_8
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_inputType:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 21
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setInputType(I)V

    .line 22
    :cond_9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_a
    return-void
.end method

.method private initiateView(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mContext:Landroid/content/Context;

    .line 2
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_search_view:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 3
    sget p1, Lcom/xuexiang/xui/R$id;->search_layout:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    .line 4
    sget v0, Lcom/xuexiang/xui/R$id;->search_top_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchTopBar:Landroid/widget/LinearLayout;

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->suggestion_list:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->searchTextView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->action_up_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mBackBtn:Landroid/widget/ImageButton;

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->action_voice_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mVoiceBtn:Landroid/widget/ImageButton;

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->action_clear_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearBtn:Landroid/widget/ImageButton;

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->transparent_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mTintView:Landroid/view/View;

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mBackBtn:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mVoiceBtn:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearBtn:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mTintView:Landroid/view/View;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->allowVoiceSearch:Z

    .line 17
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showVoice(Z)V

    .line 18
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initSearchView()V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setVisibility(I)V

    .line 20
    sget p1, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->ANIMATION_DURATION_MEDIUM:I

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setAnimationDuration(I)V

    return-void
.end method

.method private isVoiceAvailable()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isInEditMode()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 3
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private onSubmitQuery()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnQueryChangeListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;->onQueryTextSubmit(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->closeSearch()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method private onTextChanged(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mUserQuery:Ljava/lang/CharSequence;

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearBtn:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 5
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showVoice(Z)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearBtn:Landroid/widget/ImageButton;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 7
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showVoice(Z)V

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnQueryChangeListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOldQueryText:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnQueryChangeListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;->onQueryTextChange(Ljava/lang/String;)Z

    .line 10
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOldQueryText:Ljava/lang/CharSequence;

    return-void
.end method

.method private onVoiceClicked()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.speech.extra.LANGUAGE_MODEL"

    const-string v2, "web_search"

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.speech.extra.MAX_RESULTS"

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mContext:Landroid/content/Context;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 5
    check-cast v1, Landroid/app/Activity;

    const/16 v2, 0x270f

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 6
    :catch_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$string;->xui_tip_no_recognize_speech:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return-void
.end method

.method private setVisibleWithAnimation()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$7;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$7;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchTopBar:Landroid/widget/LinearLayout;

    invoke-static {v1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->reveal(Landroid/view/View;Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V

    return-void
.end method

.method private startFilter(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/widget/Filterable;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/Filterable;

    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public clearFocus()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearingFocus:Z

    .line 2
    invoke-virtual {p0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->hideKeyboard(Landroid/view/View;)V

    .line 3
    invoke-super {p0}, Landroid/widget/FrameLayout;->clearFocus()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearingFocus:Z

    return-void
.end method

.method public closeSearch()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->isSearchOpen()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->dismissSuggestions()V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->clearFocus()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchViewListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;->onSearchViewClosed()V

    :cond_1
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    return-void
.end method

.method public dismissSuggestions()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public hideKeyboard(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public isSearchOpen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    return v0
.end method

.method public onFilterComplete(I)V
    .locals 0

    if-lez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showSuggestions()V

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->dismissSuggestions()V

    :goto_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3
    :cond_0
    check-cast p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSavedState:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 4
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->isSearchOpen:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showSearch(Z)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSavedState:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->query:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSavedState:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;-><init>(Landroid/os/Parcelable;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSavedState:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mUserQuery:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->query:Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSavedState:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->isSearchOpen:Z

    return-object v0
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearingFocus:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0, p1, p2}, Landroid/widget/EditText;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mAdapter:Landroid/widget/ListAdapter;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->startFilter(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setAnimationDuration(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mAnimationDuration:I

    return-void
.end method

.method public setBackIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mBackBtn:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchTopBar:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchTopBar:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    return-void
.end method

.method public setCloseIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mClearBtn:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCursorDrawable(I)V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Landroid/widget/TextView;

    const-string v1, "mCursorDrawableRes"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setEllipsize(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->ellipsize:Z

    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setHintTextColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHintTextColor(I)V

    return-void
.end method

.method public setInputType(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setInputType(I)V

    return-void
.end method

.method public setMenuItem(Landroid/view/MenuItem;)V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$6;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$6;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public setOnQueryTextListener(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mOnQueryChangeListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$OnQueryTextListener;

    return-void
.end method

.method public setOnSearchViewListener(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchViewListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;

    return-void
.end method

.method public setQuery(Ljava/lang/CharSequence;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mUserQuery:Ljava/lang/CharSequence;

    :cond_0
    if-eqz p2, :cond_1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->onSubmitQuery()V

    :cond_1
    return-void
.end method

.method public setSearchFilter(Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->setSearchFilter(Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;)Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    :cond_0
    return-void
.end method

.method public setSubmitOnClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->submit:Z

    return-void
.end method

.method public setSuggestionBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSuggestionIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->suggestionIcon:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setSuggestions([Ljava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    array-length v0, p1

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mTintView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->suggestionIcon:Landroid/graphics/drawable/Drawable;

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->ellipsize:Z

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;-><init>(Landroid/content/Context;[Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V

    .line 4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;

    invoke-direct {p1, p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Lcom/xuexiang/xui/widget/searchview/SearchAdapter;)V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mTintView:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    return-void
.end method

.method public setVoiceIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mVoiceBtn:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setVoiceSearch(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->allowVoiceSearch:Z

    return-void
.end method

.method public showKeyboard(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void
.end method

.method public showSearch()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showSearch(Z)V

    return-void
.end method

.method public showSearch(Z)V
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->isSearchOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchSrcTextView:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    if-eqz p1, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setVisibleWithAnimation()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchLayout:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSearchViewListener:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;

    if-eqz p1, :cond_2

    .line 8
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SearchViewListener;->onSearchViewShown()V

    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mIsSearchOpen:Z

    return-void
.end method

.method public showSuggestions()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mSuggestionsListView:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public showVoice(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->isVoiceAvailable()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->allowVoiceSearch:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mVoiceBtn:Landroid/widget/ImageButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->mVoiceBtn:Landroid/widget/ImageButton;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    :goto_0
    return-void
.end method
