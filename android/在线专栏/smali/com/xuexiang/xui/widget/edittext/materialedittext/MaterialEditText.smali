.class public Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"

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

.field bottomLinesAnimator:Landroid/animation/ObjectAnimator;

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

.field innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private innerPaddingBottom:I

.field private innerPaddingLeft:I

.field private innerPaddingRight:I

.field private innerPaddingTop:I

.field labelAnimator:Landroid/animation/ObjectAnimator;

.field labelFocusAnimator:Landroid/animation/ObjectAnimator;

.field private lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

.field private mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

.field private maxCharacters:I

.field private minBottomLines:I

.field private minBottomTextLines:I

.field private minCharacters:I

.field outerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field paint:Landroid/graphics/Paint;

.field private passwordVisible:Z

.field private primaryColor:I

.field private showClearButton:Z

.field private showPasswordButton:Z

.field private showPwIconBitmaps:[Landroid/graphics/Bitmap;

.field private singleLineEllipsis:Z

.field private tempErrorText:Ljava/lang/String;

.field private textColorHintStateList:Landroid/content/res/ColorStateList;

.field private textColorStateList:Landroid/content/res/ColorStateList;

.field textLayout:Landroid/text/StaticLayout;

.field textPaint:Landroid/text/TextPaint;

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

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->MaterialEditTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 5
    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusEvaluator:Landroid/animation/ArgbEvaluator;

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 7
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCount()V

    return-void
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    return p0
.end method

.method static synthetic access$302(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    return p1
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getLabelAnimator()Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getLabelFocusAnimator()Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    return p0
.end method

.method private adjustBottomLines()Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomLines:I

    goto :goto_4

    .line 5
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

    .line 6
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

    .line 7
    :cond_5
    :goto_1
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    :goto_2
    move-object v5, v0

    .line 8
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

    .line 9
    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 10
    :goto_4
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLines:F

    int-to-float v0, v0

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_7

    .line 11
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomLinesAnimator(F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 12
    :cond_7
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLines:F

    const/4 v0, 0x1

    return v0
.end method

.method private checkCharactersCount()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCountAtBeginning:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    goto :goto_2

    .line 3
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    .line 4
    :cond_3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v0

    .line 5
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    if-lt v0, v3, :cond_4

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    if-lez v3, :cond_5

    if-gt v0, v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    :goto_2
    return-void
.end method

.method private checkLength(Ljava/lang/CharSequence;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;->getLength(Ljava/lang/CharSequence;)I

    move-result p1

    return p1
.end method

.method private correctPaddings()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getButtonsCount()I

    move-result v1

    mul-int v0, v0, v1

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    const/4 v0, 0x0

    .line 3
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

    .line 1
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

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int p2, p3, p2

    .line 4
    :goto_0
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    .line 5
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->clearButtonBitmaps:[Landroid/graphics/Bitmap;

    aget-object p3, p3, v0

    goto :goto_1

    .line 6
    :cond_2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPwIconBitmaps:[Landroid/graphics/Bitmap;

    aget-object p3, p3, v0

    goto :goto_1

    :cond_3
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hidePwIconBitmaps:[Landroid/graphics/Bitmap;

    aget-object p3, p3, v0

    .line 7
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr p4, v0

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/2addr p4, v0

    int-to-float p2, p2

    int-to-float p4, p4

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_4
    return-void
.end method

.method private drawBottomEllipsis(Landroid/graphics/Canvas;III)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollX()I

    move-result v0

    if-eqz v0, :cond_3

    .line 2
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

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    int-to-float p4, p4

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_1

    move p2, p3

    .line 5
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

    .line 6
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

    .line 7
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

    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    mul-int p3, p3, v0

    mul-int/lit8 p3, p3, 0x9

    int-to-float p3, p3

    div-float/2addr p3, v2

    add-float/2addr p2, p3

    int-to-float p3, v0

    div-float/2addr p3, v2

    add-float/2addr p4, p3

    int-to-float p3, v0

    div-float/2addr p3, v2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_3
    return-void
.end method

.method private drawBottomText(Landroid/graphics/Canvas;IIIF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    if-eqz v0, :cond_5

    .line 2
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

    .line 3
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

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    invoke-virtual {p2}, Landroid/text/StaticLayout;->getWidth()I

    move-result p2

    sub-int/2addr p3, p2

    int-to-float p2, p3

    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, p3

    int-to-float p3, p4

    sub-float/2addr p3, p5

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_1

    .line 7
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextLeftOffset()I

    move-result p3

    add-int/2addr p2, p3

    int-to-float p2, p2

    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, p3

    int-to-float p3, p4

    sub-float/2addr p3, p5

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 8
    :goto_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    invoke-virtual {p2, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 9
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_5
    return-void
.end method

.method private drawFloatingLabel(Landroid/graphics/Canvas;II)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusEvaluator:Landroid/animation/ArgbEvaluator;

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v3

    int-to-float v3, v3

    mul-float v2, v2, v3

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

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/EditText;->getGravity()I

    move-result v1

    const/4 v2, 0x5

    and-int/2addr v1, v2

    if-eq v1, v2, :cond_3

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getGravity()I

    move-result p3

    const/4 v1, 0x3

    and-int/2addr p3, v1

    if-ne p3, v1, :cond_2

    goto :goto_2

    .line 7
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

    add-float/2addr p3, v1

    float-to-int p3, p3

    add-int/2addr p2, p3

    goto :goto_2

    :cond_3
    :goto_1
    int-to-float p2, p3

    sub-float/2addr p2, v0

    float-to-int p2, p2

    .line 8
    :goto_2
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    add-int/2addr v0, v1

    add-int/2addr v0, p3

    int-to-float v0, v0

    int-to-float p3, p3

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_4

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    :goto_3
    mul-float p3, p3, v1

    sub-float/2addr v0, p3

    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollY()I

    move-result p3

    int-to-float p3, p3

    add-float/2addr v0, p3

    float-to-int p3, v0

    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    if-eqz v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    :goto_4
    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    const v3, 0x3f3d70a4    # 0.74f

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    mul-float v5, v5, v3

    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v3

    int-to-float v3, v3

    mul-float v5, v5, v3

    const v3, 0x3e851eb8    # 0.26f

    add-float/2addr v5, v3

    mul-float v0, v0, v5

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    if-eq v3, v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    :goto_5
    mul-float v0, v0, v2

    float-to-int v0, v0

    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 12
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

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eqz v0, :cond_3

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v5, 0x3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_1

    const/4 v5, 0x2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    aget-object v0, v0, v5

    .line 4
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    sub-int/2addr p2, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int/2addr p2, v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    sub-int/2addr v5, v6

    div-int/2addr v5, v4

    add-int/2addr p2, v5

    .line 5
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr v5, p4

    iget v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr v5, v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sub-int/2addr v6, v7

    div-int/2addr v6, v4

    add-int/2addr v5, v6

    int-to-float p2, p2

    int-to-float v5, v5

    .line 6
    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 7
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v1, 0x3

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v1, 0x2

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    const/4 v1, 0x0

    :goto_1
    aget-object p2, p2, v1

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr p3, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/2addr v0, v4

    add-int/2addr p3, v0

    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr p4, v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/2addr v0, v4

    add-int/2addr p4, v0

    int-to-float p3, p3

    int-to-float p4, p4

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_7
    return-void
.end method

.method private drawUnderline(Landroid/graphics/Canvas;III)I
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    if-nez v0, :cond_5

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr p4, v0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, p2

    int-to-float v4, p4

    int-to-float v5, p3

    .line 5
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    add-int/2addr p2, p4

    int-to-float v6, p2

    iget-object v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_3

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    const v1, 0xffffff

    const/4 v2, -0x1

    if-nez v0, :cond_2

    .line 7
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v0, v1

    const/high16 v1, 0x44000000    # 512.0f

    or-int/2addr v0, v1

    :goto_0
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p3, 0x1

    .line 8
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result p3

    int-to-float p3, p3

    const/4 v0, 0x0

    .line 9
    :goto_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v1, v0, v1

    if-gez v1, :cond_5

    int-to-float v1, p2

    add-float v3, v1, v0

    int-to-float v4, p4

    add-float v5, v3, p3

    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    add-int/2addr v1, p4

    int-to-float v6, v1

    iget-object v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/high16 v1, 0x40400000    # 3.0f

    mul-float v1, v1, p3

    add-float/2addr v0, v1

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, p2

    int-to-float v4, p4

    int-to-float v5, p3

    .line 13
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    add-int/2addr p2, p4

    int-to-float v6, p2

    iget-object v7, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    if-eq v3, v2, :cond_4

    goto :goto_2

    :cond_4
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v1, v2

    const/high16 v2, 0x1e000000

    or-int v3, v1, v2

    :goto_2
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, p2

    int-to-float v6, p4

    int-to-float v7, p3

    .line 15
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    add-int/2addr p2, p4

    int-to-float v8, p2

    iget-object v9, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_5
    :goto_3
    return p4
.end method

.method private generateIconBitmaps(I)[Landroid/graphics/Bitmap;
    .locals 4

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 3
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 4
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    if-le v2, v3, :cond_1

    div-int v1, v2, v3

    :cond_1
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 6
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

    .line 12
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->scaleIcon(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 13
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    .line 14
    new-instance v1, Landroid/graphics/Canvas;

    aget-object v3, v0, v3

    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 15
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v4, 0xffffff

    and-int v5, v3, v4

    invoke-static {v3}, Lcom/xuexiang/xui/utils/Utils;->isLight(I)Z

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

    .line 16
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v2

    .line 17
    new-instance v1, Landroid/graphics/Canvas;

    aget-object v3, v0, v2

    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 18
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v3, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 19
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 20
    new-instance v1, Landroid/graphics/Canvas;

    aget-object v3, v0, v3

    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 21
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v4, v3

    invoke-static {v3}, Lcom/xuexiang/xui/utils/Utils;->isLight(I)Z

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

    .line 22
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 v1, 0x3

    aput-object p1, v0, v1

    .line 23
    new-instance p1, Landroid/graphics/Canvas;

    aget-object v1, v0, v1

    invoke-direct {p1, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 24
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

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 8
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 9
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 10
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 11
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

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    new-array v0, v2, [F

    aput p1, v0, v1

    const-string p1, "currentBottomLines"

    .line 2
    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    new-array v2, v2, [F

    aput p1, v2, v1

    invoke-virtual {v0, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 5
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

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    const-string v1, " / "

    if-gtz v0, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 3
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    if-gtz v0, :cond_3

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    const-string v2, "+"

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

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

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 5
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v0

    const-string v2, "-"

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    move-result v1

    goto :goto_2

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

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
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

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 2
    fill-array-data v0, :array_0

    const-string v1, "floatingLabelFraction"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    .line 3
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

    .line 4
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

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 2
    fill-array-data v0, :array_0

    const-string v1, "focusFraction"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    .line 3
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

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

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

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    .line 3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 6
    :goto_0
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
    .locals 7

    const/16 v0, 0x20

    .line 1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    const/16 v1, 0x18

    .line 2
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_edittext_components_spacing:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 5
    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_bottom_ellipsis_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    .line 6
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_textColor:I

    invoke-static {p1, p3, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    .line 8
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_textColorHint:I

    invoke-static {p1, p3, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    .line 9
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_baseColor:I

    const/high16 v2, -0x1000000

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 10
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_primaryColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->colorPrimary:I

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    invoke-static {v2, v3, v4}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result v2

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 11
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabel:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setFloatingLabelInternal(I)V

    .line 12
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_errorColor:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_error_text:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 13
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_allowEmpty:I

    const/4 v2, 0x1

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 14
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_errorEmpty:I

    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 16
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v4, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    invoke-direct {v4, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v3, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    sget v4, Lcom/xuexiang/xui/R$string;->xui_met_not_allow_empty:I

    invoke-static {v4}, Lcom/xuexiang/xui/utils/ResUtils;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_1
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_minCharacters:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 19
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_maxCharacters:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 20
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_singleLineEllipsis:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_helperText:I

    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 22
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_helperTextColor:I

    const/4 v3, -0x1

    invoke-virtual {p3, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 23
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_minBottomTextLines:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_accentTypeface:I

    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 25
    invoke-static {v0}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    .line 26
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v4, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 27
    :cond_2
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_typeface:I

    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 28
    invoke-static {v0}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 30
    :cond_3
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelText:I

    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    if-nez v0, :cond_4

    .line 31
    invoke-virtual {p0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 32
    :cond_4
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelPadding:I

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 33
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelTextSize:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_floating_label_text_size:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 34
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelTextColor:I

    invoke-virtual {p3, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 35
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelAnimating:I

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    .line 36
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_bottomTextSize:I

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_bottom_text_size:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 37
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_hideUnderline:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 38
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_underlineColor:I

    invoke-virtual {p3, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 39
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_underlineHeight:I

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v4

    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    .line 40
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_underlineHeightFocused:I

    const/4 v4, 0x2

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v5

    invoke-virtual {p3, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    .line 41
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_autoValidate:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    .line 42
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_iconLeft:I

    invoke-virtual {p3, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 43
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_iconRight:I

    invoke-virtual {p3, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 44
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_clearButton:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 45
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lcom/xuexiang/xui/R$drawable;->xui_ic_default_clear_btn:I

    invoke-static {v0, v3}, Lcom/xuexiang/xui/utils/DrawableUtils;->getBitmapByDrawableId(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->clearButtonBitmaps:[Landroid/graphics/Bitmap;

    .line 46
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_passWordButton:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    .line 47
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_isAsteriskStyle:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 48
    invoke-static {}, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    goto :goto_1

    .line 49
    :cond_5
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    .line 50
    :goto_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    if-eqz v0, :cond_6

    .line 51
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->handleSwitchPasswordInputVisibility()V

    .line 52
    :cond_6
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lcom/xuexiang/xui/R$drawable;->pet_icon_visibility_24dp:I

    invoke-static {v0, v3}, Lcom/xuexiang/xui/utils/DrawableUtils;->getBitmapByDrawableId(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPwIconBitmaps:[Landroid/graphics/Bitmap;

    .line 53
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lcom/xuexiang/xui/R$drawable;->pet_icon_visibility_off_24dp:I

    invoke-static {v0, v3}, Lcom/xuexiang/xui/utils/DrawableUtils;->getBitmapByDrawableId(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hidePwIconBitmaps:[Landroid/graphics/Bitmap;

    .line 54
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_regexp:I

    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 56
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_errorMessage:I

    invoke-virtual {p3, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 58
    iget-object v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v6, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    invoke-direct {v6, v3, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 59
    :cond_7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v5, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    sget v6, Lcom/xuexiang/xui/R$string;->xui_met_input_error:I

    invoke-static {v6}, Lcom/xuexiang/xui/utils/ResUtils;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_8
    :goto_2
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_iconPadding:I

    const/16 v3, 0x8

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    move-result v3

    invoke-virtual {p3, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 61
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelAlwaysShown:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 62
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_helperTextAlwaysShown:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    .line 63
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_validateOnFocusLost:I

    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    .line 64
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_checkCharactersCountAtBeginning:I

    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCountAtBeginning:Z

    .line 65
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    const/4 p3, 0x5

    new-array p3, p3, [I

    .line 66
    fill-array-data p3, :array_0

    .line 67
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 68
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    .line 69
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    .line 70
    invoke-virtual {p1, v4, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    const/4 p3, 0x3

    .line 71
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    const/4 p3, 0x4

    .line 72
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 73
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 75
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    if-eqz p1, :cond_9

    .line 76
    invoke-virtual {p0}, Landroid/widget/EditText;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object p1

    .line 77
    invoke-virtual {p0}, Landroid/widget/EditText;->setSingleLine()V

    .line 78
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 79
    :cond_9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 80
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 81
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initText()V

    .line 82
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initFloatingLabel()V

    .line 83
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initTextWatcher()V

    .line 84
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCount()V

    return-void

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

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 3
    invoke-super {p0, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initMinBottomLines()V
    .locals 4

    .line 1
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
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 2
    :goto_1
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    if-lez v3, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    :goto_2
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomLines:I

    int-to-float v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    return-void
.end method

.method private initPadding()V
    .locals 3

    .line 1
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

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v0

    .line 4
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    mul-float v1, v1, v0

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

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr v0, v2

    :goto_2
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingLeft:I

    .line 6
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

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    return-void
.end method

.method private initText()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    goto :goto_1

    .line 9
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    .line 10
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

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    add-int/2addr v1, v3

    .line 4
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

    .line 5
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    sub-int v1, v3, v1

    .line 6
    :goto_2
    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollY()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    add-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    sub-int/2addr v3, v4

    int-to-float v5, v1

    cmpl-float v5, v0, v5

    if-ltz v5, :cond_3

    .line 7
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    add-int/2addr v1, v5

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    int-to-float v0, v3

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_3

    add-int/2addr v3, v4

    int-to-float v0, v3

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

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    const/high16 v1, 0x44000000    # 512.0f

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setHintTextColor(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void
.end method

.method private resetTextColor()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    .line 2
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

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void
.end method

.method private scaleIcon(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 4
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    if-ne v2, v3, :cond_0

    return-object p1

    :cond_0
    if-le v2, v3, :cond_2

    if-le v0, v3, :cond_1

    int-to-float v2, v3

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    mul-float v2, v2, v1

    float-to-int v0, v2

    goto :goto_0

    :cond_1
    int-to-float v2, v3

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    mul-float v2, v2, v0

    float-to-int v0, v2

    move v4, v3

    move v3, v0

    move v0, v4

    :goto_0
    const/4 v1, 0x0

    .line 5
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

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    goto :goto_0

    .line 3
    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    goto :goto_0

    .line 5
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    :goto_0
    return-void
.end method

.method private togglePasswordIconVisibility()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->handleSwitchPasswordInputVisibility()V

    return-void
.end method


# virtual methods
.method public addValidator(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public clearValidators()Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
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

    .line 1
    :cond_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isValidateOnFocusLost()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/EditText;->onAttachedToWindow()V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
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

    .line 2
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

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    .line 4
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawIcons(Landroid/graphics/Canvas;III)V

    .line 5
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawActionButton(Landroid/graphics/Canvas;III)V

    .line 6
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawUnderline(Landroid/graphics/Canvas;III)I

    move-result v8

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    .line 9
    iget v3, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v4, v3

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v4, v2

    .line 10
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    int-to-float v5, v5

    add-float/2addr v5, v3

    add-float v7, v5, v2

    .line 11
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

    .line 12
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

    .line 13
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterText()Ljava/lang/String;

    move-result-object v2

    .line 14
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

    .line 15
    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawBottomText(Landroid/graphics/Canvas;IIIF)V

    .line 16
    invoke-direct {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawFloatingLabel(Landroid/graphics/Canvas;II)V

    .line 17
    invoke-direct {p0, p1, v0, v1, v8}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawBottomEllipsis(Landroid/graphics/Canvas;III)V

    .line 18
    invoke-super {p0, p1}, Landroid/widget/EditText;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/EditText;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
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

    .line 2
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V

    return v1

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    if-eqz v0, :cond_b

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_9

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    goto :goto_1

    .line 7
    :cond_3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    if-eqz v0, :cond_6

    .line 8
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->togglePasswordIconVisibility()V

    .line 12
    :cond_5
    :goto_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 13
    :cond_6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    if-eqz v0, :cond_7

    .line 14
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    return v2

    .line 15
    :cond_7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    goto :goto_1

    .line 16
    :cond_8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->insideActionButton(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 17
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 18
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    return v2

    .line 19
    :cond_9
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    if-eqz v0, :cond_a

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->insideActionButton(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 20
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 21
    :cond_a
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    if-eqz v0, :cond_b

    return v2

    .line 22
    :cond_b
    :goto_1
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setAccentTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setAllowEmpty(ZLjava/lang/String;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;

    .line 4
    instance-of v2, v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    if-eqz v2, :cond_0

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 6
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {v1, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->setErrorMessage(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    sget v0, Lcom/xuexiang/xui/R$string;->xui_met_not_allow_empty:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getString(I)Ljava/lang/String;

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

    .line 9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    invoke-direct {v0, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 11
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    new-instance p2, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    sget v0, Lcom/xuexiang/xui/R$string;->xui_met_not_allow_empty:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    return-object p0
.end method

.method public setAutoValidate(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validate()Z

    :cond_0
    return-object p0
.end method

.method public setBaseColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initText()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setBottomTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-void
.end method

.method public setCurrentBottomLines(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
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
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    :cond_1
    return-void
.end method

.method public setErrorColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabel(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setFloatingLabelInternal(I)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setFloatingLabelAlwaysShown(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 2
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

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setFloatingLabelPadding(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabelText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getHint()Ljava/lang/CharSequence;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabelTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setFloatingLabelTextSize(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setFocusFraction(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setHelperText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    :cond_1
    return-object p0
.end method

.method public setHelperTextAlwaysShown(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-object p0
.end method

.method public setHelperTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setHideUnderline(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setIconLeft(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconLeft(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/drawable/Drawable;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconRight(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconRight(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    return-object p0
.end method

.method public setIconRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/drawable/Drawable;)[Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 4
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

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setMetHintTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    return-object p0
.end method

.method public setMetHintTextColor(Landroid/content/res/ColorStateList;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    return-object p0
.end method

.method public setMetTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetTextColor()V

    return-object p0
.end method

.method public setMetTextColor(Landroid/content/res/ColorStateList;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetTextColor()V

    return-object p0
.end method

.method public setMinBottomTextLines(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setMinCharacters(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    goto :goto_0

    .line 3
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

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    .line 2
    iput p4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    .line 5
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

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setShowClearButton(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    return-object p0
.end method

.method public setSingleLineEllipsis()Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setSingleLineEllipsis(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    move-result-object v0

    return-object v0
.end method

.method public setSingleLineEllipsis(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 5
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_0
    return-void
.end method

.method public setUnderlineColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 2
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

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x1

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;

    if-eqz v4, :cond_2

    .line 8
    invoke-virtual {v5, v0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->isValid(Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_1

    .line 9
    invoke-virtual {v5}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz v4, :cond_4

    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    .line 11
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

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isValid(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return p1
.end method

.method public validateWith(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2
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

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->postInvalidate()V

    return v0
.end method
