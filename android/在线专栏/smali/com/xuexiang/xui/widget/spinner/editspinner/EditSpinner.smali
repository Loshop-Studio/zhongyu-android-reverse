.class public Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/text/TextWatcher;


# static fields
.field private static final DEFAULT_MAX_LINE:I = 0x1

.field private static final TOGGLE_POPUP_WINDOW_INTERVAL:I = 0xc8


# instance fields
.field private mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

.field private mAnimation:Landroid/view/animation/Animation;

.field private mDropDownBg:Landroid/graphics/drawable/Drawable;

.field private mEditText:Landroid/widget/EditText;

.field private mIsFilterKey:Z

.field private mIsShowFilterData:Z

.field private mIvArrow:Landroid/widget/ImageView;

.field private mMaxLine:I

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mPopAnimStyle:I

.field private mPopupWindow:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ListPopupWindow;",
            ">;"
        }
    .end annotation
.end field

.field private mPopupWindowHideTime:J

.field private mResetAnimation:Landroid/view/animation/Animation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->EditSpinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mMaxLine:I

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsShowFilterData:Z

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsFilterKey:Z

    .line 7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->initView(Landroid/content/Context;)V

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->initAnimation()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;J)J
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindowHideTime:J

    return-wide p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mResetAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method private buildPopupWindow()Landroid/widget/ListPopupWindow;
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$1;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$1;-><init>(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;Landroid/content/Context;)V

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopAnimStyle:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setAnimationStyle(I)V

    .line 4
    :cond_0
    invoke-virtual {v0, p0}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setInputMethodMode(I)V

    const/16 v2, 0x30

    .line 6
    invoke-virtual {v0, v2}, Landroid/widget/ListPopupWindow;->setSoftInputMode(I)V

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setPromptPosition(I)V

    const/4 v1, -0x2

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setWidth(I)V

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setHeight(I)V

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 11
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$attr;->ms_dropdown_offset:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setVerticalOffset(I)V

    .line 12
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$drawable;->xui_config_list_item_selector:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setListSelector(Landroid/graphics/drawable/Drawable;)V

    .line 13
    new-instance v1, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;-><init>(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mDropDownBg:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$drawable;->ms_drop_down_bg_radius:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-object v0
.end method

.method private dismissDropDown()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->getPopupWindow()Landroid/widget/ListPopupWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private getPopupWindow()Landroid/widget/ListPopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindow:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ListPopupWindow;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private initAnimation()V
    .locals 11

    .line 1
    new-instance v7, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v7, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAnimation:Landroid/view/animation/Animation;

    const-wide/16 v0, 0x12c

    .line 2
    invoke-virtual {v7, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 4
    new-instance v2, Landroid/view/animation/RotateAnimation;

    const/high16 v5, -0x3ccc0000    # -180.0f

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, 0x1

    const/high16 v10, 0x3f000000    # 0.5f

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mResetAnimation:Landroid/view/animation/Animation;

    .line 5
    invoke-virtual {v2, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mResetAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->EditSpinner:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_isShowFilterData:I

    const/4 v0, 0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsShowFilterData:Z

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_isFilterKey:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsFilterKey:Z

    .line 4
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_arrowImage:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    if-eqz p3, :cond_0

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    invoke-virtual {v2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    :cond_0
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_arrowMargin:I

    const/4 v2, -0x1

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    if-eq p3, v2, :cond_1

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 8
    invoke-virtual {v3, p3, v1, p3, v1}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 9
    iget-object p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    invoke-virtual {p3, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    sget v3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_hint:I

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 11
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_background:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    if-eqz p3, :cond_2

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v3, p3}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 13
    :cond_2
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_maxLine:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mMaxLine:I

    .line 14
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v3, p3}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 15
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_height:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$attr;->ms_item_height_size:I

    invoke-static {v3, v4}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    .line 16
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v2, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_textColor:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setTextColors(Landroid/content/res/ColorStateList;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 18
    sget p1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_textSize:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_size_spinner_text:I

    invoke-static {p3, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 19
    sget p1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_entries:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_3

    .line 20
    invoke-static {p1}, Lcom/xuexiang/xui/utils/ResUtils;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setItems([Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 21
    :cond_3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p3, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_dropdown_bg:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mDropDownBg:Landroid/graphics/drawable/Drawable;

    .line 22
    sget p1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_enable:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    .line 23
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setEnabled(Z)V

    .line 24
    sget p1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_maxLength:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setMaxLength(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 26
    sget p1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_maxEms:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setMaxEms(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 28
    sget p1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_popAnimStyle:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopAnimStyle:I

    .line 29
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initView(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_edit_spinner:I

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget p1, Lcom/xuexiang/xui/R$id;->edit_spinner_edit:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    .line 3
    sget p1, Lcom/xuexiang/xui/R$id;->edit_spinner_arrow:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    .line 4
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAnimation:Landroid/view/animation/Animation;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mResetAnimation:Landroid/view/animation/Animation;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    :cond_2
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setAdapter(Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->dismissDropDown()V

    return-void
.end method

.method private setBaseAdapter(Landroid/widget/BaseAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindow:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->buildPopupWindow()Landroid/widget/ListPopupWindow;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindow:Ljava/lang/ref/WeakReference;

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->getPopupWindow()Landroid/widget/ListPopupWindow;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_1
    return-void
.end method

.method private showDropDown()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->getPopupWindow()Landroid/widget/ListPopupWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->show()V

    :cond_0
    return-void
.end method

.method private showFilterData(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindow:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getEditSpinnerFilter()Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getEditSpinnerFilter()Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;->onFilter(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->showDropDown()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->dismissDropDown()V

    :goto_0
    return-void

    .line 5
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->dismissDropDown()V

    return-void
.end method

.method private togglePopupWindow()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindowHideTime:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xc8

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mPopupWindow:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->showFilterData(Ljava/lang/String;)V

    nop

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addTextChangedListener(Landroid/text/TextWatcher;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-object p0
.end method

.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsShowFilterData:Z

    if-eqz v0, :cond_1

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->showFilterData(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->dismissDropDown()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->togglePopupWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->recycle()V

    .line 2
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    invoke-virtual {v0, p3}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getItemString(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->dismissDropDown()V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    if-eqz v1, :cond_0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    .line 5
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_0
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public setAdapter(Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setBaseAdapter(Landroid/widget/BaseAdapter;)V

    return-object p0
.end method

.method public setArrowImageDrawable(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setArrowImageResource(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-object p0
.end method

.method public setBackgroundSelector(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    :cond_0
    return-object p0
.end method

.method public setEditTextHeight(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    int-to-float p1, p1

    invoke-static {v3, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    invoke-direct {v1, v2, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public setEditTextWidth(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {v1, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIvArrow:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setFilterColor(Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setFilterColor(Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    :cond_0
    return-object p0
.end method

.method public setHint(Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setInputType(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setInputType(I)V

    :cond_0
    return-object p0
.end method

.method public setIsFilterKey(Z)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setIsFilterKey(Z)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    :cond_0
    return-object p0
.end method

.method public setItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;"
        }
    .end annotation

    .line 6
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;-><init>(Ljava/util/List;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    .line 7
    invoke-virtual {p1}, Landroid/widget/EditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    .line 8
    invoke-virtual {v0}, Landroid/widget/EditText;->getTextSize()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    move-result-object p1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsFilterKey:Z

    .line 9
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setIsFilterKey(Z)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setAdapter(Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    return-object p0
.end method

.method public setItems([Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;-><init>([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    .line 2
    invoke-virtual {p1}, Landroid/widget/EditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getTextSize()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    move-result-object p1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mIsFilterKey:Z

    .line 4
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setIsFilterKey(Z)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setAdapter(Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    return-object p0
.end method

.method public setMaxEms(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setMaxEms(I)V

    :cond_0
    return-object p0
.end method

.method public setMaxLength(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    const/4 v1, 0x0

    .line 2
    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v0, v1

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    :cond_0
    return-object p0
.end method

.method public setMaxLine(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mMaxLine:I

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setMaxLines(I)V

    :cond_0
    return-object p0
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-object p0
.end method

.method public setText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-object p0
.end method

.method public setTextColor(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    :cond_0
    return-object p0
.end method

.method public setTextColors(Landroid/content/res/ColorStateList;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    :cond_0
    return-object p0
.end method

.method public setTextSize(F)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;

    :cond_0
    return-object p0
.end method
