.class public Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private mContentBackground:Landroid/graphics/drawable/Drawable;

.field private mContentPadding:I

.field private mContentText:Ljava/lang/String;

.field private mContentTextColor:I

.field private mContentTextSize:I

.field private mContentViewHeight:F

.field private mEtInput:Landroid/widget/EditText;

.field private mHintText:Ljava/lang/String;

.field private mHintTextColor:I

.field private mIgnoreCnOrEn:Z

.field private mIsFixHeight:Z

.field private mIsShowSurplusNumber:Z

.field private mMaxCount:I

.field private mTextWatcher:Landroid/text/TextWatcher;

.field private mTvInputNumber:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->MultiLineEditTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;-><init>(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTextWatcher:Landroid/text/TextWatcher;

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/text/TextWatcher;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTextWatcher:Landroid/text/TextWatcher;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIgnoreCnOrEn:Z

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;Ljava/lang/CharSequence;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateLengthIgnoreCnOrEn(Ljava/lang/CharSequence;)I

    move-result p0

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;Ljava/lang/CharSequence;)J
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateLength(Ljava/lang/CharSequence;)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->configCount()V

    return-void
.end method

.method private calculateContentLength(Ljava/lang/String;)J
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIgnoreCnOrEn:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateLengthIgnoreCnOrEn(Ljava/lang/CharSequence;)I

    move-result p1

    int-to-long v0, p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateLength(Ljava/lang/CharSequence;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private calculateLength(Ljava/lang/CharSequence;)J
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 1
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 2
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-lez v3, :cond_0

    const/16 v4, 0x7f

    if-ge v3, v4, :cond_0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    goto :goto_1

    :cond_0
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    :goto_1
    add-double/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    return-wide v0
.end method

.method private calculateLengthIgnoreCnOrEn(Ljava/lang/CharSequence;)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private configCount()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIgnoreCnOrEn:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateLengthIgnoreCnOrEn(Ljava/lang/CharSequence;)I

    move-result v0

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->updateCount(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateLength(Ljava/lang/CharSequence;)J

    move-result-wide v0

    long-to-int v1, v0

    .line 5
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->updateCount(I)V

    :goto_0
    return-void
.end method

.method private getSubStringIndex(Ljava/lang/String;)I
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIgnoreCnOrEn:Z

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 3
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lez v3, :cond_0

    const/16 v4, 0x7f

    if-ge v3, v4, :cond_0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    goto :goto_1

    :cond_0
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    :goto_1
    add-double/2addr v0, v3

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_1

    add-int/lit8 v2, v2, 0x1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_2
    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    return p1
.end method

.method private init()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_multiline_edittext:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    sget v1, Lcom/xuexiang/xui/R$id;->mlet_input:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    .line 3
    sget v1, Lcom/xuexiang/xui/R$id;->mlet_number:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTvInputNumber:Landroid/widget/TextView;

    .line 4
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    sget v0, Lcom/xuexiang/xui/R$drawable;->mlet_selector_bg:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHintTextColor(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentPadding:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v1, v1, v2}, Landroid/widget/EditText;->setPadding(IIII)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 15
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIsFixHeight:Z

    if-eqz v0, :cond_2

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentViewHeight:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHeight(I)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentViewHeight:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMinHeight(I)V

    .line 18
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTvInputNumber:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->requestFocus()Z

    .line 19
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->configCount()V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    new-instance v1, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$1;-><init>(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_maxCount:I

    const/16 v0, 0xf0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_ignoreCnOrEn:I

    const/4 v0, 0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIgnoreCnOrEn:Z

    .line 4
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_hintText:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintText:Ljava/lang/String;

    .line 5
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_hintTextColor:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_hint_text:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintTextColor:I

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentPadding:I

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentPadding:I

    .line 7
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v2, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentBackground:I

    invoke-static {p3, p2, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentBackground:Landroid/graphics/drawable/Drawable;

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentText:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentText:Ljava/lang/String;

    .line 9
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentTextColor:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_input_text:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentTextColor:I

    .line 10
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentTextSize:I

    const/high16 v2, 0x41600000    # 14.0f

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->sp2px(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentTextSize:I

    .line 11
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentViewHeight:I

    const/high16 v2, 0x430c0000    # 140.0f

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentViewHeight:F

    .line 12
    sget p1, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_isFixHeight:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIsFixHeight:Z

    .line 13
    sget p1, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_showSurplusNumber:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIsShowSurplusNumber:Z

    .line 14
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private updateCount(I)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIsShowSurplusNumber:Z

    const-string v1, "/"

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTvInputNumber:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    sub-int/2addr v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTvInputNumber:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getContentText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentText:Ljava/lang/String;

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentText:Ljava/lang/String;

    return-object v0
.end method

.method public getCountTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mTvInputNumber:Landroid/widget/TextView;

    return-object v0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    return-object v0
.end method

.method public getHintText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintText:Ljava/lang/String;

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintText:Ljava/lang/String;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->getContentText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public isNotEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->getContentText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setContentText(Ljava/lang/String;)V
    .locals 5

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->calculateContentLength(Ljava/lang/String;)J

    move-result-wide v0

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->getSubStringIndex(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mContentText:Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setContentTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    return-void
.end method

.method public setContentTextSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    int-to-float p1, p1

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/widget/EditText;->setTextSize(IF)V

    return-void
.end method

.method public setHintColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHintTextColor(I)V

    return-void
.end method

.method public setHintText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mHintText:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mEtInput:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setIgnoreCnOrEn(Z)Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIgnoreCnOrEn:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->configCount()V

    return-object p0
.end method

.method public setIsShowSurplusNumber(Z)Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mIsShowSurplusNumber:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->configCount()V

    return-object p0
.end method

.method public setMaxCount(I)Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->mMaxCount:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->configCount()V

    return-object p0
.end method
