.class public Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source ""

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$FloatingLabelType;
    }
.end annotation


# static fields
.field public static final FLOATING_LABEL_HIGHLIGHT:I = 0x2

.field public static final FLOATING_LABEL_NONE:I = 0x0

.field public static final FLOATING_LABEL_NORMAL:I = 0x1


# instance fields
.field private accentTypeface:Landroid/graphics/Typeface;

.field private actionButtonClicking:Z

.field private actionButtonTouched:Z

.field private autoValidate:Z

.field private baseColor:I

.field private bottomEllipsisSize:I

.field private bottomLines:F

.field public bottomLinesAnimator:Landroid/animation/ObjectAnimator;

.field private bottomSpacing:I

.field private bottomTextSize:I

.field private charactersCountValid:Z

.field private checkCharactersCountAtBeginning:Z

.field private clearButtonBitmaps:[Landroid/graphics/Bitmap;

.field private currentBottomLines:F

.field private errorColor:I

.field private extraPaddingBottom:I

.field private extraPaddingLeft:I

.field private extraPaddingRight:I

.field private extraPaddingTop:I

.field private firstShown:Z

.field private floatingLabelAlwaysShown:Z

.field private floatingLabelAnimating:Z

.field private floatingLabelEnabled:Z

.field private floatingLabelFraction:F

.field private floatingLabelPadding:I

.field private floatingLabelShown:Z

.field private floatingLabelText:Ljava/lang/CharSequence;

.field private floatingLabelTextColor:I

.field private floatingLabelTextSize:I

.field private focusEvaluator:Landroid/animation/ArgbEvaluator;

.field private focusFraction:F

.field private helperText:Ljava/lang/String;

.field private helperTextAlwaysShown:Z

.field private helperTextColor:I

.field private hidePwIconBitmaps:[Landroid/graphics/Bitmap;

.field private hideUnderline:Z

.field private highlightFloatingLabel:Z

.field private iconLeftBitmaps:[Landroid/graphics/Bitmap;

.field private iconOuterHeight:I

.field private iconOuterWidth:I

.field private iconPadding:I

.field private iconRightBitmaps:[Landroid/graphics/Bitmap;

.field private iconSize:I

.field public innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private innerPaddingBottom:I

.field private innerPaddingLeft:I

.field private innerPaddingRight:I

.field private innerPaddingTop:I

.field public labelAnimator:Landroid/animation/ObjectAnimator;

.field public labelFocusAnimator:Landroid/animation/ObjectAnimator;

.field private lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

.field private mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

.field private maxCharacters:I

.field private minBottomLines:I

.field private minBottomTextLines:I

.field private minCharacters:I

.field public outerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field public paint:Landroid/graphics/Paint;

.field private passwordVisible:Z

.field private primaryColor:I

.field private showClearButton:Z

.field private showPasswordButton:Z

.field private showPwIconBitmaps:[Landroid/graphics/Bitmap;

.field private singleLineEllipsis:Z

.field private tempErrorText:Ljava/lang/String;

.field private textColorHintStateList:Landroid/content/res/ColorStateList;

.field private textColorStateList:Landroid/content/res/ColorStateList;

.field public textLayout:Landroid/text/StaticLayout;

.field public textPaint:Landroid/text/TextPaint;

.field private underlineColor:I

.field private underlineHeight:I

.field private underlineHeightFocused:I

.field private validateOnFocusLost:Z

.field private validators:Ljava/util/List;
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

    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04000a

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusEvaluator:Landroid/animation/ArgbEvaluator;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic access$000(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCount()V

    return-void
.end method

.method public static synthetic access$100(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    return p0
.end method

.method public static synthetic access$200(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    return p0
.end method

.method public static synthetic access$300(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    return p0
.end method

.method public static synthetic access$302(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    return p1
.end method

.method public static synthetic access$400(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getLabelAnimator()Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$500(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    return p0
.end method

.method public static synthetic access$600(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getLabelFocusAnimator()Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$700(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    return p0
.end method

.method private adjustBottomLines()Z
    .locals 9

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomLines:I

    goto :goto_4

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getGravity()I

    move-result v0

    const v1, 0x800005

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_5

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroid/widget/EditText;->getGravity()I

    move-result v0

    const v1, 0x800003

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_2

    :cond_4
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_2

    :cond_5
    :goto_1
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    :goto_2
    move-object v5, v0

    new-instance v0, Landroid/text/StaticLayout;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    :goto_3
    move-object v2, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextLeftOffset()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextRightOffset()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v1, v4

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v4

    sub-int v4, v1, v4

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_4
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLines:F

    int-to-float v0, v0

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_7

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomLinesAnimator(F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    :cond_7
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLines:F

    const/4 v0, 0x1

    return v0
.end method

.method private checkCharactersCount()V
    .locals 4

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCountAtBeginning:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v0

    :goto_1
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    if-lt v0, v3, :cond_4

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    if-lez v3, :cond_1

    if-gt v0, v3, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    goto :goto_0

    :goto_2
    return-void
.end method

.method private checkLength(Ljava/lang/CharSequence;)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;->getLength(Ljava/lang/CharSequence;)I

    move-result p1

    return p1
.end method

.method private correctPaddings()V
    .locals 6

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getButtonsCount()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v5, v2

    move v2, v0

    move v0, v5

    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingLeft:I

    add-int/2addr v1, v3

    add-int/2addr v1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingTop:I

    add-int/2addr v0, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingRight:I

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingBottom:I

    add-int/2addr v2, v4

    invoke-super {p0, v1, v0, v3, v2}, Landroid/widget/EditText;->setPaddingRelative(IIII)V

    return-void
.end method

.method private drawActionButton(Landroid/graphics/Canvas;III)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int p2, p3, p2

    :goto_0
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->clearButtonBitmaps:[Landroid/graphics/Bitmap;

    aget-object p3, p3, v0

    goto :goto_1

    :cond_2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPwIconBitmaps:[Landroid/graphics/Bitmap;

    aget-object p3, p3, v0

    goto :goto_1

    :cond_3
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hidePwIconBitmaps:[Landroid/graphics/Bitmap;

    aget-object p3, p3, v0

    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr p4, v0

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p4

    int-to-float p2, p2

    int-to-float p4, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_4
    return-void
.end method

.method private drawBottomEllipsis(Landroid/graphics/Canvas;III)V
    .locals 5

    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollX()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    int-to-float p4, p4

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_1

    move p2, p3

    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, -0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x1

    :goto_1
    int-to-float p2, p2

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    mul-int v1, p3, v0

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, p2

    int-to-float v3, v0

    div-float/2addr v3, v2

    add-float/2addr v3, p4

    int-to-float v0, v0

    div-float/2addr v0, v2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    mul-int v1, p3, v0

    mul-int/lit8 v1, v1, 0x5

    int-to-float v1, v1

    div-float/2addr v1, v2

    add-float/2addr v1, p2

    int-to-float v3, v0

    div-float/2addr v3, v2

    add-float/2addr v3, p4

    int-to-float v0, v0

    div-float/2addr v0, v2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    mul-int/2addr p3, v0

    mul-int/lit8 p3, p3, 0x9

    int-to-float p3, p3

    div-float/2addr p3, v2

    add-float/2addr p3, p2

    int-to-float p2, v0

    div-float/2addr p2, v2

    add-float/2addr p2, p4

    int-to-float p4, v0

    div-float/2addr p4, v2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_3
    return-void
.end method

.method private drawBottomText(Landroid/graphics/Canvas;IIIF)V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    goto :goto_0

    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    goto :goto_0

    :cond_3
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v2, 0xffffff

    and-int/2addr v1, v2

    const/high16 v2, 0x44000000    # 512.0f

    or-int/2addr v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    invoke-virtual {p2}, Landroid/text/StaticLayout;->getWidth()I

    move-result p2

    sub-int/2addr p3, p2

    int-to-float p2, p3

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextLeftOffset()I

    move-result p3

    add-int/2addr p2, p3

    int-to-float p2, p2

    :goto_1
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, p3

    int-to-float p3, p4

    sub-float/2addr p3, p5

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    invoke-virtual {p2, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_5
    return-void
.end method

.method private drawFloatingLabel(Landroid/graphics/Canvas;II)V
    .locals 6

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusEvaluator:Landroid/animation/ArgbEvaluator;

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v5, 0xffffff

    and-int/2addr v3, v5

    const/high16 v5, 0x44000000    # 512.0f

    or-int/2addr v3, v5

    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v2, v3, v5}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getGravity()I

    move-result v1

    const/4 v2, 0x5

    and-int/2addr v1, v2

    if-eq v1, v2, :cond_3

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getGravity()I

    move-result p3

    const/4 v1, 0x3

    and-int/2addr p3, v1

    if-ne p3, v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getInnerPaddingLeft()I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getInnerPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getInnerPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v1, v0

    add-float/2addr v1, p3

    float-to-int p3, v1

    add-int/2addr p2, p3

    goto :goto_2

    :cond_3
    :goto_1
    int-to-float p2, p3

    sub-float/2addr p2, v0

    float-to-int p2, p2

    :goto_2
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    add-int/2addr v0, v1

    add-int/2addr v0, p3

    int-to-float v0, v0

    int-to-float p3, p3

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    :goto_3
    mul-float/2addr p3, v1

    sub-float/2addr v0, p3

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollY()I

    move-result p3

    int-to-float p3, p3

    add-float/2addr v0, p3

    float-to-int p3, v0

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    if-eqz v0, :cond_5

    move v0, v2

    goto :goto_4

    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    :goto_4
    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    const v3, 0x3f3d70a4    # 0.74f

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    mul-float/2addr v5, v3

    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v5, v3

    const v3, 0x3e851eb8    # 0.26f

    add-float/2addr v5, v3

    mul-float/2addr v5, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    if-eq v0, v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    div-float v2, v0, v1

    :goto_5
    mul-float/2addr v5, v2

    float-to-int v0, v5

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setAlpha(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    int-to-float p2, p2

    int-to-float p3, p3

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_7
    return-void
.end method

.method private drawIcons(Landroid/graphics/Canvas;III)V
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v5

    if-nez v5, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v1

    goto :goto_0

    :cond_2
    move v5, v2

    :goto_0
    aget-object v0, v0, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    sub-int/2addr p2, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int/2addr p2, v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    sub-int/2addr v5, v6

    div-int/2addr v5, v4

    add-int/2addr v5, p2

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p2, p4

    iget v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr p2, v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sub-int/2addr v6, v7

    div-int/2addr v6, v4

    add-int/2addr v6, p2

    int-to-float p2, v5

    int-to-float v5, v6

    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v0

    if-nez v0, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_5

    move v1, v4

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_1
    aget-object p2, p2, v1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr p3, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/2addr v0, v4

    add-int/2addr v0, p3

    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, p3

    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr p4, p3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sub-int/2addr p3, v1

    div-int/2addr p3, v4

    add-int/2addr p3, p4

    int-to-float p4, v0

    int-to-float p3, p3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_7
    return-void
.end method

.method private drawUnderline(Landroid/graphics/Canvas;III)I
    .locals 10

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    if-nez v0, :cond_5

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, p2

    int-to-float v4, p4

    int-to-float v5, p3

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    add-int/2addr p2, p4

    int-to-float v6, p2

    iget-object v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_4

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    const v1, 0xffffff

    const/4 v2, -0x1

    if-nez v0, :cond_2

    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v0, v1

    const/high16 v1, 0x44000000    # 512.0f

    or-int/2addr v0, v1

    :goto_1
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p3, 0x1

    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result p3

    int-to-float p3, p3

    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v1, v0, v1

    if-gez v1, :cond_5

    int-to-float v1, p2

    add-float v3, v1, v0

    int-to-float v4, p4

    add-float v5, v3, p3

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    add-int/2addr v1, p4

    int-to-float v6, v1

    iget-object v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p3

    add-float/2addr v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    if-eq v3, v2, :cond_4

    goto :goto_3

    :cond_4
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v1, v2

    const/high16 v2, 0x1e000000

    or-int v3, v1, v2

    :goto_3
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, p2

    int-to-float v6, p4

    int-to-float v7, p3

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    add-int/2addr p2, p4

    int-to-float v8, p2

    iget-object v9, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_5
    :goto_4
    return p4
.end method

.method private generateIconBitmaps(I)[Landroid/graphics/Bitmap;
    .locals 4

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    if-le v2, v3, :cond_1

    div-int v1, v2, v3

    :cond_1
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/graphics/Bitmap;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->scaleIcon(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-instance v1, Landroid/graphics/Canvas;

    aget-object v3, v0, v3

    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v4, 0xffffff

    and-int v5, v3, v4

    invoke-static {v3}, Lb/c/a/a;->v(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/high16 v3, -0x1000000

    goto :goto_0

    :cond_1
    const/high16 v3, -0x76000000

    :goto_0
    or-int/2addr v3, v5

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v3, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v2

    new-instance v1, Landroid/graphics/Canvas;

    aget-object v3, v0, v2

    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v3, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    new-instance v1, Landroid/graphics/Canvas;

    aget-object v3, v0, v3

    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v4, v3

    invoke-static {v3}, Lb/c/a/a;->v(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/high16 v3, 0x4c000000    # 3.3554432E7f

    goto :goto_1

    :cond_2
    const/high16 v3, 0x42000000    # 32.0f

    :goto_1
    or-int/2addr v3, v4

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 v1, 0x3

    aput-object p1, v0, v1

    new-instance p1, Landroid/graphics/Canvas;

    aget-object v1, v0, v1

    invoke-direct {p1, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    return-object v0
.end method

.method private generateIconBitmaps(Landroid/graphics/drawable/Drawable;)[Landroid/graphics/Bitmap;
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    invoke-static {v0, p1, p1, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private getBottomEllipsisWidth()I
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    mul-int/lit8 v0, v0, 0x5

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getBottomLinesAnimator(F)Landroid/animation/ObjectAnimator;
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    new-array v0, v2, [F

    aput p1, v0, v1

    const-string p1, "currentBottomLines"

    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    new-array v2, v2, [F

    aput p1, v2, v1

    invoke-virtual {v0, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    return-object p1
.end method

.method private getBottomTextLeftOffset()I
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomEllipsisWidth()I

    move-result v0

    :goto_0
    return v0
.end method

.method private getBottomTextRightOffset()I
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomEllipsisWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterWidth()I

    move-result v0

    :goto_0
    return v0
.end method

.method private getButtonsCount()I
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isShowClearButton()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isShowPasswordButton()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private getCharactersCounterText()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    const-string v1, " / "

    if-gtz v0, :cond_1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    if-gtz v0, :cond_3

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    const-string v2, "+"

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    const-string v2, "-"

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v1

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getCharactersCounterWidth()I
    .locals 2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getEndIcon()[Landroid/graphics/Bitmap;
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    :goto_0
    return-object v0
.end method

.method private getLabelAnimator()Landroid/animation/ObjectAnimator;
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const-string v1, "floatingLabelFraction"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    if-eqz v1, :cond_1

    const-wide/16 v1, 0x12c

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private getLabelFocusAnimator()Landroid/animation/ObjectAnimator;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const-string v1, "focusFraction"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private getPixel(I)I
    .locals 1

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lb/c/a/a;->h(Landroid/content/Context;F)I

    move-result p1

    return p1
.end method

.method private getStartIcon()[Landroid/graphics/Bitmap;
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    :goto_0
    return-object v0
.end method

.method private handleSwitchPasswordInputVisibility()V
    .locals 3

    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    :goto_0
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    invoke-virtual {p0, v0, v1}, Landroid/widget/EditText;->setSelection(II)V

    return-void
.end method

.method private hasCharactersCounter()Z
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    if-gtz v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    const/16 v1, 0x18

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070077

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07005e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    sget-object v2, Lb/c/a/b;->f:[I

    const/4 v3, 0x0

    invoke-virtual {p1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 1
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    const/16 v0, 0x21

    .line 3
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    const/4 v0, 0x3

    const/high16 v2, -0x1000000

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v5, 0x7f040169

    invoke-static {v2, v5, v4}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result v2

    const/16 v4, 0x1d

    invoke-virtual {p3, v4, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    const/16 v2, 0xa

    invoke-virtual {p3, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setFloatingLabelInternal(I)V

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v2

    const v4, 0x7f040747

    invoke-static {v2, v4}, Lb/c/a/a;->A(Landroid/content/Context;I)I

    move-result v2

    const/4 v4, 0x7

    invoke-virtual {p3, v4, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    const/4 v2, 0x1

    invoke-virtual {p3, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v5, 0x8

    if-nez v4, :cond_1

    invoke-virtual {p3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v7, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    invoke-direct {v7, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v6, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    const v7, 0x7f0f0072

    invoke-static {v7}, Lb/c/a/a;->q(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    const/16 v4, 0x1b

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    const/16 v4, 0x19

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    const/16 v4, 0x1f

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    const/16 v4, 0x11

    invoke-virtual {p3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    const/16 v4, 0x13

    const/4 v6, -0x1

    invoke-virtual {p3, v4, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    const/16 v4, 0x1a

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    invoke-virtual {p3, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lb/c/a/a;->o(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v7, v4}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_2
    const/16 v4, 0x22

    invoke-virtual {p3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4}, Lb/c/a/a;->o(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_3
    const/16 v4, 0xe

    invoke-virtual {p3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    if-nez v4, :cond_4

    invoke-virtual {p0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    :cond_4
    const/16 v4, 0xd

    iget v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    invoke-virtual {p3, v4, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    const/16 v4, 0x10

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f070078

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    invoke-virtual {p3, v4, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    const/16 v4, 0xf

    invoke-virtual {p3, v4, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    const/16 v4, 0xc

    invoke-virtual {p3, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v7, 0x7f07005f

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/4 v7, 0x4

    invoke-virtual {p3, v7, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    const/16 v4, 0x14

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    const/16 v4, 0x23

    invoke-virtual {p3, v4, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    const/16 v4, 0x24

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v8

    invoke-virtual {p3, v4, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    const/16 v4, 0x25

    const/4 v8, 0x2

    invoke-direct {p0, v8}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v9

    invoke-virtual {p3, v4, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    invoke-virtual {p3, v8, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    const/16 v4, 0x15

    invoke-virtual {p3, v4, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    const/16 v4, 0x17

    invoke-virtual {p3, v4, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    const/4 v4, 0x6

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v4

    const v6, 0x7f0800e6

    invoke-static {v4, v6}, Lb/c/a/d/a;->a(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->clearButtonBitmaps:[Landroid/graphics/Bitmap;

    const/16 v4, 0x1c

    invoke-virtual {p3, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    invoke-virtual {p3, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 5
    sget-object v1, Lb/c/a/e/e/a;->b:Lb/c/a/e/e/a;

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    new-instance v1, Lb/c/a/e/e/a;

    invoke-direct {v1}, Lb/c/a/e/e/a;-><init>()V

    sput-object v1, Lb/c/a/e/e/a;->b:Lb/c/a/e/e/a;

    goto :goto_1

    .line 6
    :cond_6
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->handleSwitchPasswordInputVisibility()V

    :cond_7
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v1

    const v4, 0x7f08009a

    invoke-static {v1, v4}, Lb/c/a/d/a;->a(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPwIconBitmaps:[Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v1

    const v4, 0x7f08009b

    invoke-static {v1, v4}, Lb/c/a/d/a;->a(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hidePwIconBitmaps:[Landroid/graphics/Bitmap;

    const/16 v1, 0x1e

    invoke-virtual {p3, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_9

    const/16 v4, 0x9

    invoke-virtual {p3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v9, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    invoke-direct {v9, v4, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v6, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    const v9, 0x7f0f0071

    invoke-static {v9}, Lb/c/a/a;->q(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v9, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_2
    const/16 v1, 0x16

    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v4

    invoke-virtual {p3, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    const/16 v1, 0xb

    invoke-virtual {p3, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    const/16 v1, 0x12

    invoke-virtual {p3, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    const/16 v1, 0x26

    invoke-virtual {p3, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    const/4 v1, 0x5

    invoke-virtual {p3, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCountAtBeginning:Z

    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    new-array p3, v1, [I

    fill-array-data p3, :array_0

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    invoke-virtual {p1, v8, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    invoke-virtual {p1, v7, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Landroid/widget/EditText;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/EditText;->setSingleLine()V

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_a
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initText()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initFloatingLabel()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initTextWatcher()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCount()V

    return-void

    nop

    :array_0
    .array-data 4
        0x10100d5
        0x10100d6
        0x10100d7
        0x10100d8
        0x10100d9
    .end array-data
.end method

.method private initFloatingLabel()V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    invoke-super {p0, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initMinBottomLines()V
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gtz v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    if-gtz v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    if-lez v3, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    move v1, v2

    :cond_3
    :goto_2
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomLines:I

    int-to-float v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    return-void
.end method

.method private initPadding()V
    .locals 3

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingTop:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v0

    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    mul-float/2addr v1, v0

    float-to-int v0, v1

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    mul-int/lit8 v1, v1, 0x2

    :goto_1
    add-int/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingBottom:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr v0, v2

    :goto_2
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingLeft:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr v1, v0

    :goto_3
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingRight:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    return-void
.end method

.method private initText()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetTextColor()V

    return-void
.end method

.method private initTextWatcher()V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private insideActionButton(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr v1, v3

    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    sub-int/2addr v3, v4

    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int v1, v3, v1

    :goto_2
    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollY()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v4, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr v4, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr v4, v3

    int-to-float v5, v1

    cmpl-float v5, v0, v5

    if-ltz v5, :cond_3

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    add-int/2addr v1, v5

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    int-to-float v0, v4

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_3

    add-int/2addr v4, v3

    int-to-float v0, v4

    cmpg-float p1, p1, v0

    if-gez p1, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method private isInternalValid()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isCharactersCountValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isRTL()Z
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

.method private resetHintTextColor()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    const/high16 v1, 0x44000000    # 512.0f

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setHintTextColor(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void
.end method

.method private resetTextColor()V
    .locals 9

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x2

    new-array v2, v1, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const v5, 0x101009e

    const/4 v6, 0x0

    aput v5, v4, v6

    aput-object v4, v2, v6

    sget-object v4, Landroid/widget/EditText;->EMPTY_STATE_SET:[I

    aput-object v4, v2, v3

    new-array v1, v1, [I

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v5, 0xffffff

    and-int v7, v4, v5

    const/high16 v8, -0x21000000

    or-int/2addr v7, v8

    aput v7, v1, v6

    and-int/2addr v4, v5

    const/high16 v5, 0x44000000    # 512.0f

    or-int/2addr v4, v5

    aput v4, v1, v3

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private scaleIcon(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    if-ne v2, v3, :cond_0

    return-object p1

    :cond_0
    if-le v2, v3, :cond_2

    int-to-float v2, v3

    if-le v0, v3, :cond_1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    mul-float/2addr v1, v2

    float-to-int v0, v1

    goto :goto_0

    :cond_1
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    mul-float/2addr v0, v2

    float-to-int v0, v0

    move v4, v3

    move v3, v0

    move v0, v4

    :goto_0
    const/4 v1, 0x0

    invoke-static {p1, v3, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method private setFloatingLabelInternal(I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    :goto_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    :goto_1
    return-void
.end method

.method private togglePasswordIconVisibility()V
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->handleSwitchPasswordInputVisibility()V

    return-void
.end method


# virtual methods
.method public addValidator(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public clear()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public clearValidators()Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-object p0
.end method

.method public getAccentTypeface()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public getBottomTextSize()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    return v0
.end method

.method public getCurrentBottomLines()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    return v0
.end method

.method public getEditValue()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getError()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    return v0
.end method

.method public getFloatingLabelFraction()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    return v0
.end method

.method public getFloatingLabelPadding()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    return v0
.end method

.method public getFloatingLabelText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getFloatingLabelTextColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    return v0
.end method

.method public getFloatingLabelTextSize()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    return v0
.end method

.method public getFocusFraction()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    return v0
.end method

.method public getHelperText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    return-object v0
.end method

.method public getHelperTextColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    return v0
.end method

.method public getInnerPaddingBottom()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    return v0
.end method

.method public getInnerPaddingLeft()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    return v0
.end method

.method public getInnerPaddingRight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    return v0
.end method

.method public getInnerPaddingTop()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    return v0
.end method

.method public getMaxCharacters()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    return v0
.end method

.method public getMinBottomTextLines()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    return v0
.end method

.method public getMinCharacters()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    return v0
.end method

.method public getUnderlineColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    return v0
.end method

.method public getValidators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    return-object v0
.end method

.method public hasValidators()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isAutoValidate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    return v0
.end method

.method public isCharactersCountValid()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEditValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public isFloatingLabelAlwaysShown()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    return v0
.end method

.method public isFloatingLabelAnimating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    return v0
.end method

.method public isHelperTextAlwaysShown()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    return v0
.end method

.method public isHideUnderline()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    return v0
.end method

.method public isNotEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEditValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isShowClearButton()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    return v0
.end method

.method public isShowPasswordButton()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    return v0
.end method

.method public isValid(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isValidateOnFocusLost()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/EditText;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollX()I

    move-result v0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr v1, v2

    :goto_0
    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollX()I

    move-result v1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    sub-int/2addr v2, v3

    :goto_1
    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v3, v2

    invoke-direct {p0, p1, v0, v1, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawIcons(Landroid/graphics/Canvas;III)V

    invoke-direct {p0, p1, v0, v1, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawActionButton(Landroid/graphics/Canvas;III)V

    invoke-direct {p0, p1, v0, v1, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawUnderline(Landroid/graphics/Canvas;III)I

    move-result v8

    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    iget v3, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v4, v3

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v4, v2

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v5, v5

    add-float/2addr v5, v3

    add-float v7, v5, v2

    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isCharactersCountValid()Z

    move-result v2

    if-nez v2, :cond_6

    :cond_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isCharactersCountValid()Z

    move-result v3

    if-eqz v3, :cond_4

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v5, 0xffffff

    and-int/2addr v3, v5

    const/high16 v5, 0x44000000    # 512.0f

    or-int/2addr v3, v5

    goto :goto_2

    :cond_4
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    :goto_2
    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setColor(I)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterText()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v3

    if-eqz v3, :cond_5

    int-to-float v3, v0

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingEnd()I

    move-result v3

    add-int/2addr v3, v1

    int-to-float v3, v3

    iget-object v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v5, v2}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v5

    sub-float/2addr v3, v5

    :goto_3
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr v5, v8

    int-to-float v5, v5

    add-float/2addr v5, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v2, v3, v5, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_6
    move-object v2, p0

    move-object v3, p1

    move v4, v0

    move v5, v1

    move v6, v8

    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawBottomText(Landroid/graphics/Canvas;IIIF)V

    invoke-direct {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawFloatingLabel(Landroid/graphics/Canvas;II)V

    invoke-direct {p0, p1, v0, v1, v8}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawBottomEllipsis(Landroid/graphics/Canvas;III)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/EditText;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollX()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    const/16 v2, 0x14

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingBottom:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    if-eqz v0, :cond_a

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_8

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    goto :goto_1

    :cond_3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->togglePasswordIconVisibility()V

    :cond_5
    :goto_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    :cond_6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    if-eqz v0, :cond_a

    return v2

    :cond_7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->insideActionButton(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    return v2

    :cond_8
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    if-eqz v0, :cond_9

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->insideActionButton(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_9

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    :cond_9
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    if-eqz v0, :cond_a

    return v2

    :cond_a
    :goto_1
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setAccentTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setAllowEmpty(ZLjava/lang/String;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const v2, 0x7f0f0072

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;

    instance-of v3, v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    if-eqz v3, :cond_0

    if-eqz p1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->setErrorMessage(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lb/c/a/a;->q(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->setErrorMessage(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-nez p1, :cond_5

    if-nez v0, :cond_5

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    invoke-direct {v0, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance p2, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    invoke-static {v2}, Lb/c/a/a;->q(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    return-object p0
.end method

.method public setAutoValidate(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validate()Z

    :cond_0
    return-object p0
.end method

.method public setBaseColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initText()V

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setBottomTextSize(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-void
.end method

.method public setCurrentBottomLines(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/EditText;->setFocusable(Z)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    :cond_1
    return-void
.end method

.method public setErrorColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabel(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setFloatingLabelInternal(I)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setFloatingLabelAlwaysShown(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setFloatingLabelAnimating(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    return-object p0
.end method

.method public setFloatingLabelFraction(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setFloatingLabelPadding(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabelText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabelTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabelTextSize(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setFocusFraction(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setHelperText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    :cond_1
    return-object p0
.end method

.method public setHelperTextAlwaysShown(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setHelperTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setHideUnderline(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setIconLeft(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconLeft(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/drawable/Drawable;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconRight(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconRight(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/drawable/Drawable;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setLengthChecker(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

    return-object p0
.end method

.method public setMaxCharacters(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setMetHintTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    return-object p0
.end method

.method public setMetHintTextColor(Landroid/content/res/ColorStateList;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    return-object p0
.end method

.method public setMetTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetTextColor()V

    return-object p0
.end method

.method public setMetTextColor(Landroid/content/res/ColorStateList;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetTextColor()V

    return-object p0
.end method

.method public setMinBottomTextLines(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setMinCharacters(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->outerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    :goto_0
    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->setPadding(IIII)V

    return-void
.end method

.method public setPaddings(IIII)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    iput p4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    return-object p0
.end method

.method public setPasswordTransformationMethod(Landroid/text/method/PasswordTransformationMethod;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    return-object p0
.end method

.method public setPrimaryColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setShowClearButton(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    return-object p0
.end method

.method public setSingleLineEllipsis()Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setSingleLineEllipsis(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    move-result-object v0

    return-object v0
.end method

.method public setSingleLineEllipsis(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_0
    return-void
.end method

.method public setUnderlineColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setValidateOnFocusLost(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    return-object p0
.end method

.method public validate()Z
    .locals 6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v1

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;

    if-eqz v4, :cond_2

    invoke-virtual {v5, v0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->isValid(Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_1

    invoke-virtual {v5}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz v4, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    :cond_4
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return v4

    :cond_5
    :goto_1
    return v1
.end method

.method public validate(Ljava/lang/String;Ljava/lang/CharSequence;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isValid(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return p1
.end method

.method public validateWith(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->isValid(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return v0
.end method
