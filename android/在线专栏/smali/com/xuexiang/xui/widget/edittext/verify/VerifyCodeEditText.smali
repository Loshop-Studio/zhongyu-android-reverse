.class public Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;,
        Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_EDIT_TEXT_SIZE:I = 0x4

.field private static final DEFAULT_HEIGHT:I = 0x32


# instance fields
.field private mBackgroundFocus:Landroid/graphics/drawable/Drawable;

.field private mBackgroundNormal:Landroid/graphics/drawable/Drawable;

.field private mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

.field private mEtDivider:Landroid/graphics/drawable/Drawable;

.field private mEtNumber:I

.field private mEtTextColor:I

.field private mEtTextSize:F

.field private mEtWidth:I

.field private mIsDivideEqually:Z

.field private mIsPwd:Z

.field private mLlContainer:Landroid/widget/LinearLayout;

.field private mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

.field private mPwdRadius:F

.field private mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

.field private mTextWatcher:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->VerifyCodeEditTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;-><init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mTextWatcher:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->refreshEditSizeWhenDivideEqually()V

    return-void
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initView(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->onKeyDelete()V

    return-void
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->setText(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    return-object p0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_verify_code:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->ll_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->et_input:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    .line 4
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 5
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_number:I

    const/4 v0, 0x4

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_width:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_vcet_width:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtWidth:I

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_is_divide_equally:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsDivideEqually:Z

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_divider:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtDivider:Landroid/graphics/drawable/Drawable;

    .line 9
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_text_size:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_vcet_text_size:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtTextSize:F

    .line 10
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_text_color:I

    const/high16 v0, -0x1000000

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtTextColor:I

    .line 11
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_bg_focus:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    .line 12
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_bg_normal:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    .line 13
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_is_pwd:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsPwd:Z

    .line 14
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_pwd_radius:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_vcet_pwd_radius:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdRadius:F

    .line 15
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtDivider:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_0

    .line 17
    sget p2, Lcom/xuexiang/xui/R$drawable;->vcet_shape_divider:I

    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtDivider:Landroid/graphics/drawable/Drawable;

    .line 18
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_1

    .line 19
    sget p2, Lcom/xuexiang/xui/R$drawable;->vcet_shape_bg_focus:I

    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    .line 20
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_2

    .line 21
    sget p2, Lcom/xuexiang/xui/R$drawable;->vcet_shape_bg_normal:I

    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    .line 22
    :cond_2
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsDivideEqually:Z

    if-eqz p2, :cond_3

    .line 23
    new-instance p1, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;-><init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 24
    :cond_3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initView(Landroid/content/Context;)V

    :goto_0
    return-void
.end method

.method private initEtContainer([Landroid/widget/TextView;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsDivideEqually:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x11

    .line 4
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_0

    .line 5
    :cond_0
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 6
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 9
    array-length v2, p1

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, p1, v1

    .line 10
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 11
    :cond_1
    array-length v0, p1

    :goto_2
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method private initTextViews(Landroid/content/Context;IILandroid/graphics/drawable/Drawable;FI)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    const/4 v2, 0x1

    new-array v2, v2, [Landroid/text/InputFilter;

    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v3, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v3, v2, v1

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    if-eqz p4, :cond_0

    .line 3
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v2

    invoke-virtual {p4, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p4}, Landroid/widget/LinearLayout;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    :cond_0
    new-array p2, p2, [Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    const/4 p2, 0x0

    .line 6
    :goto_0
    iget-object p4, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    array-length p4, p4

    if-ge p2, p4, :cond_3

    .line 7
    new-instance p4, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    invoke-direct {p4, p1}, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;-><init>(Landroid/content/Context;)V

    .line 8
    invoke-virtual {p4, v1, p5}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 9
    invoke-virtual {p4, p6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsDivideEqually:Z

    if-nez v0, :cond_1

    .line 11
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setWidth(I)V

    .line 12
    :cond_1
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setHeight(I)V

    if-nez p2, :cond_2

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p4, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p4, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    const/16 v0, 0x11

    .line 15
    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 16
    invoke-virtual {p4, v1}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    aput-object p4, v0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private initView(Landroid/content/Context;)V
    .locals 7

    .line 1
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtWidth:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtDivider:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtTextSize:F

    iget v6, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtTextColor:I

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initTextViews(Landroid/content/Context;IILandroid/graphics/drawable/Drawable;FI)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initEtContainer([Landroid/widget/TextView;)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->setListener()V

    return-void
.end method

.method private onKeyDelete()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_4

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    aget-object v1, v1, v0

    .line 3
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 4
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsPwd:Z

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;->clearPassword()V

    .line 6
    :cond_0
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    add-int/lit8 v2, v1, -0x1

    if-ge v0, v2, :cond_2

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    add-int/lit8 v2, v0, 0x1

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    if-eqz v0, :cond_4

    .line 11
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;->onClear()V

    goto :goto_1

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->getInputValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;->onChange(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_4

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    if-eqz v0, :cond_4

    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->getInputValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;->onChange(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method private refreshEditSizeWhenDivideEqually()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/DensityUtils;->getDisplayWidth(Landroid/content/Context;Z)I

    move-result v2

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    sub-int/2addr v4, v3

    mul-int v1, v1, v4

    sub-int/2addr v2, v1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v2, v1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I

    move-result v1

    sub-int/2addr v2, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v2, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    div-int/2addr v2, v0

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtWidth:I

    return-void
.end method

.method private restoreView(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 1
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtWidth:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtDivider:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtTextSize:F

    iget v6, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtTextColor:I

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initTextViews(Landroid/content/Context;IILandroid/graphics/drawable/Drawable;FI)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initEtContainer([Landroid/widget/TextView;)V

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, ""

    .line 4
    invoke-virtual {p2, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 5
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_1

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    if-le p2, v0, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    aget-object v0, p1, p2

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->setText(Ljava/lang/String;Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->setListener()V

    return-void
.end method

.method private setListener()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mTextWatcher:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    new-instance v1, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$2;-><init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    new-instance v1, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$3;-><init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->setBackSpaceListener(Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;)V

    return-void
.end method

.method private setText(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    array-length v2, v1

    if-ge v0, v2, :cond_4

    .line 3
    aget-object v1, v1, v0

    .line 4
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 5
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsPwd:Z

    if-eqz v2, :cond_1

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdRadius:F

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;->drawPassword(F)V

    .line 7
    :cond_1
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    add-int/lit8 v1, p1, -0x1

    if-ge v0, v1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    add-int/lit8 v0, v0, 0x1

    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    if-eqz p1, :cond_4

    if-nez p2, :cond_4

    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->getInputValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;->onChange(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/lit8 p1, p1, -0x1

    if-ne v0, p1, :cond_4

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    if-eqz p1, :cond_4

    if-nez p2, :cond_4

    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->getInputValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;->onComplete(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public clearInputValue()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    if-nez v0, :cond_0

    .line 2
    aget-object v1, v1, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundFocus:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 3
    :cond_0
    aget-object v1, v1, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mBackgroundNormal:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    :goto_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsPwd:Z

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;->clearPassword()V

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    aget-object v1, v1, v0

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    if-eqz v0, :cond_3

    .line 8
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;->onClear()V

    :cond_3
    return-void
.end method

.method public dp2px(FLandroid/content/Context;)F
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    return p1
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    return-object v0
.end method

.method public getEtNumber()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    return v0
.end method

.method public getInputValue()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mPwdTextViews:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 3
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsDivideEqually:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->getInputValue()Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mTextWatcher:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->refreshEditSizeWhenDivideEqually()V

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->restoreView(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    const/high16 v0, 0x42480000    # 50.0f

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->dp2px(FLandroid/content/Context;)F

    move-result v0

    float-to-int v0, v0

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtWidth:I

    if-ge v1, v0, :cond_0

    const/high16 p2, 0x40000000    # 2.0f

    .line 4
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public setEtNumber(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEtNumber:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mEditText:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mTextWatcher:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsDivideEqually:Z

    if-eqz p1, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->refreshEditSizeWhenDivideEqually()V

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->initView(Landroid/content/Context;)V

    return-void
.end method

.method public setOnInputListener(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mOnInputListener:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$OnInputListener;

    return-void
.end method

.method public setPwdMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->mIsPwd:Z

    return-void
.end method

.method public sp2px(FLandroid/content/Context;)F
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    const/4 v0, 0x2

    .line 2
    invoke-static {v0, p1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    return p1
.end method
