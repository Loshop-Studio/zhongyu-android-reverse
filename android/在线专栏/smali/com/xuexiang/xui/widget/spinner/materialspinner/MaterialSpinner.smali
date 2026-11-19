.class public Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNoMoreChoiceListener;,
        Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;,
        Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;
    }
.end annotation


# instance fields
.field private mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

.field private mArrowColor:I

.field private mArrowColorDisabled:I

.field private mArrowDrawable:Landroid/graphics/drawable/Drawable;

.field private mBackgroundColor:I

.field private mDropDownOffset:I

.field private mHideArrow:Z

.field private mIsInDialog:Z

.field private mListView:Landroid/widget/ListView;

.field private mNothingSelected:Z

.field private mOnItemSelectedListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;

.field private mOnNoMoreChoiceListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNoMoreChoiceListener;

.field private mOnNothingSelectedListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;

.field private mPopupWindow:Landroid/widget/PopupWindow;

.field private mPopupWindowHeight:I

.field private mPopupWindowMaxHeight:I

.field private mSelectedIndex:I

.field private mTextColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->MaterialSpinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    return p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    return p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mNothingSelected:Z

    return p0
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mNothingSelected:Z

    return p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mOnItemSelectedListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mOnNothingSelectedListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mHideArrow:Z

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->animateArrow(Z)V

    return-void
.end method

.method private animateArrow(Z)V
    .locals 4

    const/16 v0, 0x2710

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x2710

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 1
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x2

    new-array v3, v3, [I

    aput v2, v3, v1

    const/4 v1, 0x1

    aput v0, v3, v1

    const-string v0, "level"

    invoke-static {p1, v0, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method private calculatePopWindowPos(Landroid/view/View;)[I
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [I

    new-array v0, v0, [I

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/xuexiang/xui/utils/Utils;->getScreenHeight(Landroid/content/Context;)I

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-static {v3}, Lcom/xuexiang/xui/utils/Utils;->getListViewHeightBasedOnChildren(Landroid/widget/ListView;)I

    move-result v3

    .line 5
    iget v4, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowMaxHeight:I

    if-lez v4, :cond_0

    if-le v3, v4, :cond_0

    move v3, v4

    :cond_0
    const/4 v4, 0x1

    aget v5, v0, v4

    sub-int/2addr v2, v5

    sub-int/2addr v2, p1

    const/4 v5, 0x0

    if-ge v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    aget p1, v0, v5

    aput p1, v1, v5

    aget p1, v0, v4

    sub-int/2addr p1, v3

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mDropDownOffset:I

    sub-int/2addr p1, v0

    aput p1, v1, v4

    goto :goto_1

    :cond_2
    aget v2, v0, v5

    aput v2, v1, v5

    aget v0, v0, v4

    add-int/2addr v0, p1

    aput v0, v1, v4

    :goto_1
    return-object v1
.end method

.method private calculatePopWindowYOffset(Landroid/view/View;)I
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/xuexiang/xui/utils/Utils;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-static {v2}, Lcom/xuexiang/xui/utils/Utils;->getListViewHeightBasedOnChildren(Landroid/widget/ListView;)I

    move-result v2

    .line 5
    iget v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowMaxHeight:I

    if-lez v3, :cond_0

    if-le v2, v3, :cond_0

    move v2, v3

    :cond_0
    const/4 v3, 0x1

    aget v0, v0, v3

    sub-int/2addr v1, v0

    add-int v0, v2, p1

    const/4 v4, 0x0

    if-ge v1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mDropDownOffset:I

    add-int/2addr v2, v0

    add-int/2addr v2, p1

    neg-int v4, v2

    :cond_2
    return v4
.end method

.method private calculatePopupWindowHeight()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    const/4 v1, -0x2

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->ms_item_height_size:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v2

    mul-int v0, v0, v2

    int-to-float v0, v0

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowMaxHeight:I

    if-lez v2, :cond_1

    int-to-float v3, v2

    cmpl-float v3, v0, v3

    if-lez v3, :cond_1

    return v2

    .line 4
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowHeight:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    if-eq v2, v1, :cond_2

    int-to-float v3, v2

    cmpg-float v0, v3, v0

    if-gtz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method private hasMoreChoice()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p3

    .line 3
    :try_start_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_background_color:I

    const/4 v2, -0x1

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mBackgroundColor:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_background_selector:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 5
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_text_color:I

    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    .line 6
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_arrow_image:I

    invoke-static {p1, p2, v3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    .line 7
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_arrow_tint:I

    iget v4, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColor:I

    .line 8
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_hide_arrow:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mHideArrow:Z

    .line 9
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_dropdown_max_height:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowMaxHeight:I

    .line 10
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_dropdown_height:I

    const/4 v4, -0x2

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowHeight:I

    .line 11
    iget v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColor:I

    const v4, 0x3f4ccccd    # 0.8f

    invoke-static {v3, v4}, Lcom/xuexiang/xui/utils/ResUtils;->lighter(IF)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColorDisabled:I

    .line 12
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_entries:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 13
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_dropdown_bg:I

    invoke-static {p1, p2, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 14
    sget v5, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_in_dialog:I

    invoke-virtual {p2, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mIsInDialog:Z

    .line 15
    sget v5, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_pop_anim_style:I

    invoke-virtual {p2, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 17
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v6, Lcom/xuexiang/xui/R$attr;->ms_padding_top_size:I

    invoke-static {p2, v6}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p2

    .line 18
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lcom/xuexiang/xui/R$attr;->ms_padding_left_size:I

    invoke-static {v6, v7}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v6

    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v7

    sget v8, Lcom/xuexiang/xui/R$attr;->ms_dropdown_offset:I

    invoke-static {v7, v8}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v7

    iput v7, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mDropDownOffset:I

    const v7, 0x800013

    .line 20
    invoke-virtual {p0, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v7, 0x1

    .line 21
    invoke-virtual {p0, v7}, Landroid/widget/TextView;->setClickable(Z)V

    .line 22
    invoke-virtual {p0, v6, p2, p2, p2}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 23
    sget p2, Lcom/xuexiang/xui/R$drawable;->ms_background_selector:I

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 24
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mHideArrow:Z

    const/4 v6, 0x0

    if-nez p2, :cond_1

    .line 25
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_0

    .line 26
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v9, Lcom/xuexiang/xui/R$drawable;->ms_ic_arrow_up:I

    invoke-static {p2, v9}, Lcom/xuexiang/xui/utils/ResUtils;->getVectorDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    .line 27
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    iget v9, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColor:I

    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p2, v9, v10}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 28
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v9, Lcom/xuexiang/xui/R$attr;->ms_arrow_size:I

    invoke-static {p2, v9}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p2

    .line 29
    iget-object v9, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v9, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 30
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v6, v6, p2, v6}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 31
    :cond_1
    new-instance p2, Landroid/widget/ListView;

    invoke-direct {p2, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    .line 32
    invoke-virtual {p0}, Landroid/widget/TextView;->getId()I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/ListView;->setId(I)V

    .line 33
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-virtual {p2, v6}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 34
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-virtual {p2, v7}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    .line 35
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v8}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p2

    .line 36
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-virtual {v1, p2, p2, p2, p2}, Landroid/widget/ListView;->setPadding(IIII)V

    .line 37
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    new-instance v1, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$1;-><init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    invoke-virtual {p2, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    if-eqz v3, :cond_2

    .line 38
    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setItems([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 39
    :cond_2
    new-instance p2, Landroid/widget/PopupWindow;

    invoke-direct {p2, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v7}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    if-eq v5, v2, :cond_3

    .line 42
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 43
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 45
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    const/16 p2, 0x30

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V

    .line 46
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    const/high16 p2, 0x41800000    # 16.0f

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setElevation(F)V

    if-eqz v4, :cond_4

    .line 47
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v4}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 48
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v1, Lcom/xuexiang/xui/R$drawable;->ms_drop_down_bg:I

    invoke-static {p2, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 49
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mBackgroundColor:I

    if-eq p1, v2, :cond_5

    .line 50
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setBackgroundColor(I)V

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_6

    .line 51
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 52
    :cond_6
    :goto_1
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    if-eq p1, p3, :cond_7

    .line 53
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setTextColor(I)V

    .line 54
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    new-instance p2, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;-><init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void

    :catchall_0
    move-exception p1

    .line 55
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    throw p1
.end method

.method private setAdapterInternal(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result v0

    if-ltz v0, :cond_1

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const-string p1, ""

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private showPopupWindow()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mIsInDialog:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-direct {p0, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->calculatePopWindowYOffset(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v0, p0, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :goto_0
    return-void
.end method


# virtual methods
.method public collapse()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mHideArrow:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->animateArrow(Z)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public expand()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->hasMoreChoice()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mOnNoMoreChoiceListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNoMoreChoiceListener;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNoMoreChoiceListener;->OnNoMoreChoice(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    :cond_0
    return-void

    .line 4
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mHideArrow:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 5
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->animateArrow(Z)V

    .line 6
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mNothingSelected:Z

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->showPopupWindow()V

    return-void
.end method

.method public getAdapter()Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    return-object v0
.end method

.method public getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getItems()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mListView:Landroid/widget/ListView;

    return-object v0
.end method

.method public getPopupWindow()Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public getSelectedIndex()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    return v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSpinnerPosition(Ljava/lang/Object;Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/List<",
            "TT;>;)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 3
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method protected onMeasure(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->calculatePopupWindowHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 5
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    invoke-virtual {v3, v2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getItemText(I)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-le v4, v5, :cond_0

    move-object v1, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 10
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 12
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setWidth(I)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 2
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "selected_index"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->notifyItemSelected(I)V

    :cond_0
    const-string v0, "is_popup_showing"

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$3;-><init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    :cond_1
    const-string v0, "state"

    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 11
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/TextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-super {p0}, Landroid/widget/TextView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    const-string v2, "selected_index"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    const-string v2, "is_popup_showing"

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->collapse()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_0
    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/TextView;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->expand()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->collapse()V

    .line 6
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerAdapterWrapper;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerAdapterWrapper;-><init>(Landroid/content/Context;Landroid/widget/ListAdapter;)V

    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setAdapterInternal(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;)V

    return-object p0
.end method

.method public setAdapter(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerAdapter;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerAdapter<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;"
        }
    .end annotation

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    .line 7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setAdapterInternal(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;)V

    return-object p0
.end method

.method public setArrowColor(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColor:I

    const v0, 0x3f4ccccd    # 0.8f

    .line 2
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ResUtils;->lighter(IF)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColorDisabled:I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColor:I

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 9

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mBackgroundColor:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 3
    instance-of v1, v0, Landroid/graphics/drawable/StateListDrawable;

    if-eqz v1, :cond_1

    .line 4
    :try_start_0
    const-class v1, Landroid/graphics/drawable/StateListDrawable;

    const-string v2, "getStateDrawable"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isAccessible()Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    :cond_0
    const/4 v2, 0x2

    new-array v4, v2, [I

    const v5, 0x3f59999a    # 0.85f

    .line 7
    invoke-static {p1, v5}, Lcom/xuexiang/xui/utils/ResUtils;->darker(IF)I

    move-result v5

    aput v5, v4, v6

    aput p1, v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    new-array v7, v3, [Ljava/lang/Object;

    .line 8
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-virtual {v1, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/drawable/ColorDrawable;

    .line 9
    aget v8, v4, v5

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    .line 12
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 13
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setDropDownBackgroundSelector(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setBackgroundSelector(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    :cond_0
    return-object p0
.end method

.method public setDropdownHeight(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowHeight:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->calculatePopupWindowHeight()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-void
.end method

.method public setDropdownMaxHeight(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindowMaxHeight:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mPopupWindow:Landroid/widget/PopupWindow;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->calculatePopupWindowHeight()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColor:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mArrowColorDisabled:I

    :goto_0
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_1
    return-void
.end method

.method public setItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerAdapter;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setTextColor(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->setTextSize(F)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setAdapterInternal(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;)V

    return-object p0
.end method

.method public final varargs setItems([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setItems(Ljava/util/List;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    return-object p0
.end method

.method public setOnItemSelectedListener(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mOnItemSelectedListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnItemSelectedListener;

    return-object p0
.end method

.method public setOnNoMoreChoiceListener(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNoMoreChoiceListener;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mOnNoMoreChoiceListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNoMoreChoiceListener;

    return-object p0
.end method

.method public setOnNothingSelectedListener(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mOnNothingSelectedListener:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;

    return-object p0
.end method

.method public setSelectedIndex(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v0, :cond_1

    if-ltz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getCount()I

    move-result v0

    if-gt p1, v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->notifyItemSelected(I)V

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mSelectedIndex:I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Position must be lower than adapter count!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setSelectedItem(Ljava/lang/Object;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mAdapter:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getItems()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->getSpinnerPosition(Ljava/lang/Object;Ljava/util/List;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setSelectedIndex(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    :cond_0
    return-object p0
.end method

.method public setTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->mTextColor:I

    .line 2
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
