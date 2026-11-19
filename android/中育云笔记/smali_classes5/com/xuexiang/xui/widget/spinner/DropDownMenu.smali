.class public Lcom/xuexiang/xui/widget/spinner/DropDownMenu;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public c:Landroid/widget/LinearLayout;

.field public d:Landroid/widget/FrameLayout;

.field public e:I

.field public f:I

.field public g:Landroid/view/View;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Landroid/graphics/drawable/Drawable;

.field public r:Landroid/graphics/drawable/Drawable;

.field public s:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->e:I

    const/high16 p1, 0x3f000000    # 0.5f

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->s:F

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
    iput p3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->e:I

    const/high16 v0, 0x3f000000    # 0.5f

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->s:F

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

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->f:I

    .line 11
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_dividerColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->h:I

    .line 12
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_dividerWidth:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_ddm_divider_width:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/f;->e(I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->i:I

    .line 13
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_dividerMargin:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_ddm_divider_margin:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/f;->e(I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->j:I

    .line 14
    sget v1, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_underlineColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    .line 15
    sget v2, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_underlineHeight:I

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_ddm_underline_height:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/f;->e(I)I

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

    invoke-static {v5}, Lcom/xuexiang/xui/utils/f;->c(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->o:I

    .line 18
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextSelectedColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    invoke-static {v5, v6}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->k:I

    .line 19
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextUnselectedColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/xuexiang/xui/R$attr;->xui_config_color_content_text:I

    invoke-static {v5, v6}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->l:I

    .line 20
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextPaddingHorizontal:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_ddm_menu_text_padding_horizontal:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/f;->e(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->m:I

    .line 21
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextPaddingVertical:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_ddm_menu_text_padding_vertical:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/f;->e(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->n:I

    .line 22
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuTextSize:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_ddm_menu_text_size:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/f;->e(I)I

    move-result v5

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->p:I

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuUnselectedIcon:I

    invoke-static {v4, p2, v5}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->r:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$drawable;->ddm_ic_arrow_down:I

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/f;->l(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->r:Landroid/graphics/drawable/Drawable;

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuSelectedIcon:I

    invoke-static {v4, p2, v5}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->q:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$drawable;->ddm_ic_arrow_up:I

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/f;->l(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->q:Landroid/graphics/drawable/Drawable;

    .line 27
    :cond_1
    sget v4, Lcom/xuexiang/xui/R$styleable;->DropDownMenu_ddm_menuHeightPercent:I

    iget v5, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->s:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->s:F

    .line 28
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    .line 30
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {p2, p3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 31
    iget-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 32
    iget-object v4, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 33
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v3, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 35
    new-instance p2, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 36
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, p3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 38
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 39
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->d:Landroid/widget/FrameLayout;

    .line 40
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->d:Landroid/widget/FrameLayout;

    const/4 p2, 0x2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->g:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public setTabMenuClickable(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, p1}, Landroid/view/View;->setClickable(Z)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public setTabMenuText(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->c:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
