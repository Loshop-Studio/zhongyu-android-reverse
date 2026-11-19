.class public Lcom/xuexiang/xui/widget/edittext/PasswordEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;
    }
.end annotation


# static fields
.field private static final ALPHA_ICON_DISABLED:I = 0x60

.field private static final ALPHA_ICON_ENABLED:I = 0x89


# instance fields
.field private mExtraClickArea:I

.field private mHandlingHoverEvent:Z

.field private mHidePwDrawable:Landroid/graphics/drawable/Drawable;

.field private mHoverShowsPw:Z

.field private mPasswordVisible:Z

.field private mSetErrorCalled:Z

.field private mShowPwDrawable:Landroid/graphics/drawable/Drawable;

.field private mShowingIcon:Z

.field private mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->PasswordEditTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mSetErrorCalled:Z

    return p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mSetErrorCalled:Z

    return p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->showPasswordVisibilityIndicator(Z)V

    return-void
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    return p0
.end method

.method static synthetic access$302(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    return p1
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->handlePasswordInputVisibility()V

    return-void
.end method

.method private handlePasswordInputVisibility()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    .line 3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 6
    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/widget/EditText;->setSelection(II)V

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
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->isRtl()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mExtraClickArea:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowPwDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v0, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mExtraClickArea:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowPwDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mExtraClickArea:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v3

    sub-int/2addr v0, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mExtraClickArea:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    :goto_0
    return v1
.end method

.method private showPasswordVisibilityIndicator(Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowPwDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHidePwDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    .line 3
    invoke-virtual {p0, v0, v0, p1, v0}, Landroid/widget/EditText;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/widget/EditText;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    :goto_1
    return-void
.end method

.method private togglePasswordIconVisibility()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->handlePasswordInputVisibility()V

    .line 3
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->showPasswordVisibilityIndicator(Z)V

    return-void
.end method


# virtual methods
.method public initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/high16 v0, 0x41a00000    # 20.0f

    .line 1
    invoke-static {v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mExtraClickArea:I

    .line 2
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->PasswordEditText:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$styleable;->PasswordEditText_pet_iconShow:I

    invoke-static {p2, p1, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowPwDrawable:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$drawable;->pet_icon_visibility_24dp:I

    invoke-static {p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getVectorDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowPwDrawable:Landroid/graphics/drawable/Drawable;

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$styleable;->PasswordEditText_pet_iconHide:I

    invoke-static {p2, p1, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHidePwDrawable:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_1

    .line 6
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$drawable;->pet_icon_visibility_off_24dp:I

    invoke-static {p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getVectorDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHidePwDrawable:Landroid/graphics/drawable/Drawable;

    .line 7
    :cond_1
    sget p2, Lcom/xuexiang/xui/R$styleable;->PasswordEditText_pet_hoverShowsPw:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHoverShowsPw:Z

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->PasswordEditText_pet_nonMonospaceFont:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 9
    sget p3, Lcom/xuexiang/xui/R$styleable;->PasswordEditText_pet_enableIconAlpha:I

    const/4 v0, 0x1

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    .line 10
    sget v0, Lcom/xuexiang/xui/R$styleable;->PasswordEditText_pet_isAsteriskStyle:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-static {}, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    goto :goto_0

    .line 12
    :cond_2
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p3, :cond_3

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHidePwDrawable:Landroid/graphics/drawable/Drawable;

    const/16 p3, 0x89

    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowPwDrawable:Landroid/graphics/drawable/Drawable;

    const/16 p3, 0x60

    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_3
    if-eqz p2, :cond_4

    .line 16
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 17
    :cond_4
    new-instance p1, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;-><init>(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)V

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 18
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->handlePasswordInputVisibility()V

    return-void

    :catchall_0
    move-exception p2

    .line 19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    throw p2
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;

    .line 2
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/EditText;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;->isShowingIcon()Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;->isPasswordVisible()Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->handlePasswordInputVisibility()V

    .line 6
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->showPasswordVisibilityIndicator(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/widget/EditText;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mPasswordVisible:Z

    const/4 v4, 0x0

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$SavedState;-><init>(Landroid/os/Parcelable;ZZLcom/xuexiang/xui/widget/edittext/PasswordEditText$1;)V

    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mShowingIcon:Z

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->isTouchable(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHandlingHoverEvent:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_4

    .line 6
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->togglePasswordIconVisibility()V

    .line 7
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->setAction(I)V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHandlingHoverEvent:Z

    goto :goto_0

    .line 9
    :cond_3
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHoverShowsPw:Z

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->togglePasswordIconVisibility()V

    .line 11
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 12
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mHandlingHoverEvent:Z

    .line 13
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mSetErrorCalled:Z

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mSetErrorCalled:Z

    return-void
.end method

.method public setExtraClickAreaSize(I)Lcom/xuexiang/xui/widget/edittext/PasswordEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mExtraClickArea:I

    return-object p0
.end method

.method public setIsAsteriskStyle(Z)Lcom/xuexiang/xui/widget/edittext/PasswordEditText;
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    :goto_0
    return-object p0
.end method

.method public setPasswordTransformationMethod(Landroid/text/method/PasswordTransformationMethod;)Lcom/xuexiang/xui/widget/edittext/PasswordEditText;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    return-object p0
.end method
