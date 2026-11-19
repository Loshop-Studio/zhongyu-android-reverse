.class public Lcom/xuexiang/xui/widget/spinner/DropDownMenu;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private mContainerView:Landroid/widget/FrameLayout;

.field private mContentLayoutId:I

.field private mContentView:Landroid/view/View;

.field private mCurrentTabPosition:I

.field private mDividerColor:I

.field private mDividerMargin:I

.field private mDividerWidth:I

.field private mMaskColor:I

.field private mMaskView:Landroid/view/View;

.field private mMenuHeightPercent:F

.field private mMenuSelectedIcon:Landroid/graphics/drawable/Drawable;

.field private mMenuTextPaddingHorizontal:I

.field private mMenuTextPaddingVertical:I

.field private mMenuTextSelectedColor:I

.field private mMenuTextSize:I

.field private mMenuTextUnselectedColor:I

.field private mMenuUnselectedIcon:Landroid/graphics/drawable/Drawable;

.field private mPopupMenuViews:Landroid/widget/FrameLayout;

.field private mTabMenuView:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    const/high16 p1, 0x3f000000    # 0.5f

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuHeightPercent:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    sget v0, Lcom/xuexiang/xui/R$attr;->DropDownMenuStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, -0x1

    .line 6
    iput p3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    const/high16 v0, 0x3f000000    # 0.5f

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuHeightPercent:F

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 9
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 10
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_contentLayoutId:I

    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContentLayoutId:I

    .line 11
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_dividerColor:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mDividerColor:I

    .line 12
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_dividerWidth:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_ddm_divider_width:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mDividerWidth:I

    .line 13
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_dividerMargin:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_ddm_divider_margin:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mDividerMargin:I

    .line 14
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_underlineColor:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    .line 15
    sget v2, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_underlineHeight:I

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_ddm_underline_height:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v3

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 16
    sget v3, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuBackgroundColor:I

    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 17
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_maskColor:I

    sget v5, Lcom/xuexiang/xui/R$color;->default_ddm_mask_color:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskColor:I

    .line 18
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextSelectedColor:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextSelectedColor:I

    .line 19
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextUnselectedColor:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/xuexiang/xui/R$attr;->xui_config_color_content_text:I

    invoke-static {v5, v6}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextUnselectedColor:I

    .line 20
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextPaddingHorizontal:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_ddm_menu_text_padding_horizontal:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextPaddingHorizontal:I

    .line 21
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextPaddingVertical:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_ddm_menu_text_padding_vertical:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextPaddingVertical:I

    .line 22
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextSize:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_ddm_menu_text_size:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextSize:I

    .line 23
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuUnselectedIcon:I

    invoke-static {v4, p2, v5}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuUnselectedIcon:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_0

    .line 24
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$drawable;->ddm_ic_arrow_down:I

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/ResUtils;->getVectorDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuUnselectedIcon:Landroid/graphics/drawable/Drawable;

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuSelectedIcon:I

    invoke-static {v4, p2, v5}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuSelectedIcon:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_1

    .line 26
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$drawable;->ddm_ic_arrow_up:I

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/ResUtils;->getVectorDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuSelectedIcon:Landroid/graphics/drawable/Drawable;

    .line 27
    :cond_1
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuHeightPercent:I

    iget v5, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuHeightPercent:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuHeightPercent:F

    .line 28
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    .line 30
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {p2, p3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 31
    iget-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 32
    iget-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 33
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v3, p2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p2, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 35
    new-instance p2, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 36
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, p3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 38
    invoke-virtual {p0, p2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 39
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    .line 40
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    const/4 p2, 0x2

    invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/spinner/DropDownMenu;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->switchMenu(Landroid/view/View;)V

    return-void
.end method

.method private addTab(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 3
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v1, 0x11

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextSize:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 6
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextUnselectedColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuUnselectedIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setArrowIconEnd(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 9
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextPaddingHorizontal:I

    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextPaddingVertical:I

    invoke-virtual {v0, v1, v2, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 11
    new-instance v1, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;

    invoke-direct {v1, p0, v0}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;-><init>(Lcom/xuexiang/xui/widget/spinner/DropDownMenu;Landroid/widget/TextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ge p2, p1, :cond_0

    .line 14
    new-instance p1, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 15
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mDividerWidth:I

    const/4 v1, -0x1

    invoke-direct {p2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mDividerMargin:I

    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 17
    iput v0, p2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 18
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    iget p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mDividerColor:I

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private setArrowIconEnd(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p2, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private switchMenu(Landroid/view/View;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne p1, v2, :cond_2

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    if-ne v2, v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->closeMenu()V

    goto/16 :goto_2

    :cond_0
    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$anim;->ddm_menu_in:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$anim;->ddm_mask_in:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    div-int/lit8 v3, v1, 0x2

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 10
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    div-int/lit8 v3, v1, 0x2

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :goto_1
    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextSelectedColor:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuSelectedIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setArrowIconEnd(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 14
    :cond_2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextUnselectedColor:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuUnselectedIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setArrowIconEnd(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 16
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    div-int/lit8 v3, v1, 0x2

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    add-int/lit8 v1, v1, 0x2

    goto/16 :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public closeMenu()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuTextUnselectedColor:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuUnselectedIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, v2}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setArrowIconEnd(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$anim;->ddm_menu_out:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$anim;->ddm_mask_out:I

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    :cond_0
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContentView:Landroid/view/View;

    return-object v0
.end method

.method public isShowing()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setDropDownMenu(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContentLayoutId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContentLayoutId:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setDropDownMenu(Ljava/util/List;Ljava/util/List;Landroid/view/View;)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mContentLayoutId == -1, You need to set properties app:ddm_contentLayoutId"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDropDownMenu(Ljava/util/List;Ljava/util/List;Landroid/view/View;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 8
    invoke-direct {p0, p1, v1}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->addTab(Ljava/util/List;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_0
    iput-object p3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContentView:Landroid/view/View;

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 11
    new-instance p1, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    .line 12
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p3, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    iget p3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskColor:I

    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    new-instance p3, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$1;

    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$1;-><init>(Lcom/xuexiang/xui/widget/spinner/DropDownMenu;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {p1, p3, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMaskView:Landroid/view/View;

    const/16 p3, 0x8

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v3}, Landroid/widget/FrameLayout;->removeViewAt(I)V

    .line 19
    :cond_1
    new-instance p1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {p1, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    .line 20
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->getDisplayHeight(Landroid/content/Context;Z)I

    move-result v2

    int-to-float v2, v2

    iget v5, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mMenuHeightPercent:F

    mul-float v2, v2, v5

    float-to-int v2, v2

    invoke-direct {v4, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v4}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mContainerView:Landroid/widget/FrameLayout;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p3, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 23
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 24
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {p3, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mPopupMenuViews:Landroid/widget/FrameLayout;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void

    .line 26
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "params not match, tabTexts.size() should be equal popupViews.size()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDropDownMenu([Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setDropDownMenu(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setDropDownMenu([Ljava/lang/String;Ljava/util/List;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setDropDownMenu(Ljava/util/List;Ljava/util/List;Landroid/view/View;)V

    return-void
.end method

.method public setTabMenuClickable(Z)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->setClickable(Z)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setTabMenuText(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mCurrentTabPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->mTabMenuView:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
