.class public Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$OnValidateListener;
    }
.end annotation


# instance fields
.field private mErrorDrawable:Landroid/graphics/drawable/Drawable;

.field private mErrorMsg:Ljava/lang/CharSequence;

.field private mExtraClickArea:I

.field private mIsAutoValidate:Z

.field private mIsShowErrorIcon:Z

.field private mIsValid:Z

.field private mOnValidateListener:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$OnValidateListener;

.field private mPosition:I

.field private mValidators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->ValidatorEditTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsValid:Z

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsShowErrorIcon:Z

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->initView()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsAutoValidate:Z

    return p0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const/high16 v0, 0x41a00000    # 20.0f

    .line 1
    invoke-static {v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mExtraClickArea:I

    .line 2
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_regexp:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_1

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_errorMessage:I

    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    .line 7
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    new-instance v2, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    invoke-direct {v2, p3, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    sget v2, Lcom/xuexiang/xui/R$string;->xui_met_input_error:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    :cond_1
    :goto_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_autoValidate:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsAutoValidate:Z

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_showErrorIcon:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsShowErrorIcon:Z

    .line 12
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_errorIcon:I

    invoke-static {p2, p1, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    const/4 p3, 0x2

    if-nez p2, :cond_2

    .line 13
    invoke-virtual {p0}, Landroid/widget/EditText;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p2

    aget-object p2, p2, p3

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_2

    .line 14
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_ic_default_tip_btn:I

    invoke-static {p2, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    .line 15
    :cond_2
    sget p2, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_errorIconSize:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    if-eqz p2, :cond_3

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_1

    .line 17
    :cond_3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p2, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 18
    :goto_1
    sget p2, Lcom/xuexiang/xui/R$styleable;->ValidatorEditText_vet_tipPosition:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mPosition:I

    .line 19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initTextWatcher()V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;-><init>(Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initView()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->setErrorIconVisible(Z)V

    .line 2
    invoke-super {p0, p0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->initTextWatcher()V

    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsAutoValidate:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->updateValid()V

    :cond_0
    return-void
.end method

.method private isRtl()Z
    .locals 2

    invoke-virtual {p0}, Landroid/widget/EditText;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private isTouchable(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->isRtl()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingStart()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mExtraClickArea:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingStart()I

    move-result v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v0, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mExtraClickArea:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingEnd()I

    move-result v4

    sub-int/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mExtraClickArea:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingEnd()I

    move-result v3

    sub-int/2addr v0, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mExtraClickArea:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private onValidateError(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->setErrorIconVisible(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mOnValidateListener:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$OnValidateListener;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-interface {v0, v1, p1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$OnValidateListener;->onValidateError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static parsePosition(I)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 1
    sget-object p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->TOP:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    return-object p0

    .line 2
    :cond_0
    sget-object p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->TOP:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->RIGHT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    return-object p0

    .line 5
    :cond_3
    sget-object p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->LEFT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    return-object p0
.end method

.method private setErrorIconVisible(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsShowErrorIcon:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {p0}, Landroid/widget/EditText;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x3

    aget-object v2, v2, v3

    .line 4
    invoke-virtual {p0, v0, v1, p1, v2}, Landroid/widget/EditText;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private showErrorMsg()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsValid:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->on(Landroid/view/View;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_config_color_error_text:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->color(I)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    move-result-object v0

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mPosition:I

    .line 4
    invoke-static {v1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->parsePosition(I)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->position(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorMsg:Ljava/lang/CharSequence;

    .line 5
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->text(Ljava/lang/String;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->show()Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    :cond_0
    return-void
.end method


# virtual methods
.method public addValidator(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object p0
.end method

.method public clearValidators()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public getErrorMsg()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorMsg:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getInputValue()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->getInputValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public isInputValid()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsAutoValidate:Z

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsValid:Z

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->validate()Z

    move-result v0

    return v0
.end method

.method public isNotEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->getInputValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsAutoValidate:Z

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->updateValid()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->isTouchable(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->showErrorMsg()V

    .line 5
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 2
    invoke-super {p0, p1}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 3
    invoke-super {p0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mErrorMsg:Ljava/lang/CharSequence;

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->setErrorIconVisible(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_config_bg_edittext:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->onValidateError(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_config_color_edittext_error:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public setExtraClickAreaSize(I)Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mExtraClickArea:I

    return-object p0
.end method

.method public setOnValidateListener(Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$OnValidateListener;)Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mOnValidateListener:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$OnValidateListener;

    return-object p0
.end method

.method public updateValid()V
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->validate()Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mIsValid:Z

    return-void
.end method

.method public validate()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->mValidators:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;

    .line 5
    invoke-virtual {v1, v0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->isValid(Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_1

    .line 6
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->setError(Ljava/lang/CharSequence;)V

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->setError(Ljava/lang/CharSequence;)V

    .line 8
    :cond_3
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    :cond_4
    :goto_2
    return v1
.end method
