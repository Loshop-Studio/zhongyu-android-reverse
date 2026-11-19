.class public Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
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

.method public static synthetic access$000(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCount()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$200(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$302(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$400(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getLabelAnimator()Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$500(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$600(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getLabelFocusAnimator()Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$700(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    .line 2
    .line 3
    return p0
.end method

.method private adjustBottomLines()Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 10
    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomLines:I

    .line 27
    .line 28
    goto :goto_6

    .line 29
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const v1, 0x800005

    .line 34
    .line 35
    .line 36
    and-int/2addr v0, v1

    .line 37
    if-eq v0, v1, :cond_5

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const v1, 0x800003

    .line 51
    .line 52
    .line 53
    and-int/2addr v0, v1

    .line 54
    if-ne v0, v1, :cond_4

    .line 55
    .line 56
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 57
    .line 58
    :goto_1
    move-object v5, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_5
    :goto_2
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :goto_3
    new-instance v1, Landroid/text/StaticLayout;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    :goto_4
    move-object v2, v0

    .line 73
    goto :goto_5

    .line 74
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :goto_5
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextLeftOffset()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    sub-int/2addr v0, v4

    .line 88
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextRightOffset()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v0, v4

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-int/2addr v0, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    sub-int v4, v0, v4

    .line 103
    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x1

    .line 106
    const/high16 v6, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/text/StaticLayout;->getLineCount()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    .line 118
    .line 119
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    :goto_6
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLines:F

    .line 124
    .line 125
    int-to-float v0, v0

    .line 126
    cmpl-float v1, v1, v0

    .line 127
    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomLinesAnimator(F)Landroid/animation/ObjectAnimator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 135
    .line 136
    .line 137
    :cond_7
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLines:F

    .line 138
    .line 139
    const/4 v0, 0x1

    .line 140
    return v0
.end method

.method private checkCharactersCount()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCountAtBeginning:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 33
    .line 34
    if-lt v0, v3, :cond_4

    .line 35
    .line 36
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 37
    .line 38
    if-lez v3, :cond_5

    .line 39
    .line 40
    if-gt v0, v3, :cond_4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    move v1, v2

    .line 44
    :cond_5
    :goto_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    .line 45
    .line 46
    return-void
.end method

.method private checkLength(Ljava/lang/CharSequence;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;->getLength(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method private correctPaddings()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getButtonsCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/2addr v0, v1

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v5, v2

    .line 17
    move v2, v0

    .line 18
    move v0, v5

    .line 19
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    .line 20
    .line 21
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingLeft:I

    .line 22
    .line 23
    add-int/2addr v1, v3

    .line 24
    add-int/2addr v1, v0

    .line 25
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    .line 26
    .line 27
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingTop:I

    .line 28
    .line 29
    add-int/2addr v0, v3

    .line 30
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    .line 31
    .line 32
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingRight:I

    .line 33
    .line 34
    add-int/2addr v3, v4

    .line 35
    add-int/2addr v3, v2

    .line 36
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 37
    .line 38
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingBottom:I

    .line 39
    .line 40
    add-int/2addr v2, v4

    .line 41
    invoke-super {p0, v1, v0, v3, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private drawActionButton(Landroid/graphics/Canvas;III)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 32
    .line 33
    const/16 v1, 0xff

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 46
    .line 47
    sub-int p2, p3, p2

    .line 48
    .line 49
    :goto_0
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    if-eqz p3, :cond_2

    .line 53
    .line 54
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->clearButtonBitmaps:[Landroid/graphics/Bitmap;

    .line 55
    .line 56
    aget-object p3, p3, v0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    .line 60
    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPwIconBitmaps:[Landroid/graphics/Bitmap;

    .line 64
    .line 65
    aget-object p3, p3, v0

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget-object p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hidePwIconBitmaps:[Landroid/graphics/Bitmap;

    .line 69
    .line 70
    aget-object p3, p3, v0

    .line 71
    .line 72
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 73
    .line 74
    add-int/2addr p4, v0

    .line 75
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    .line 76
    .line 77
    sub-int/2addr p4, v0

    .line 78
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    sub-int/2addr v0, v1

    .line 83
    div-int/lit8 v0, v0, 0x2

    .line 84
    .line 85
    add-int/2addr v0, p4

    .line 86
    int-to-float p2, p2

    .line 87
    int-to-float p4, v0

    .line 88
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 89
    .line 90
    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    return-void
.end method

.method private drawBottomEllipsis(Landroid/graphics/Canvas;III)V
    .locals 5
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 34
    .line 35
    add-int/2addr p4, v0

    .line 36
    int-to-float p4, p4

    .line 37
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    move p2, p3

    .line 44
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_2

    .line 49
    .line 50
    const/4 p3, -0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 p3, 0x1

    .line 53
    :goto_1
    int-to-float p2, p2

    .line 54
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    .line 55
    .line 56
    mul-int v1, p3, v0

    .line 57
    .line 58
    int-to-float v1, v1

    .line 59
    const/high16 v2, 0x40000000    # 2.0f

    .line 60
    .line 61
    div-float/2addr v1, v2

    .line 62
    add-float/2addr v1, p2

    .line 63
    int-to-float v3, v0

    .line 64
    div-float/2addr v3, v2

    .line 65
    add-float/2addr v3, p4

    .line 66
    int-to-float v0, v0

    .line 67
    div-float/2addr v0, v2

    .line 68
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {p1, v1, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    .line 74
    .line 75
    mul-int v1, p3, v0

    .line 76
    .line 77
    mul-int/lit8 v1, v1, 0x5

    .line 78
    .line 79
    int-to-float v1, v1

    .line 80
    div-float/2addr v1, v2

    .line 81
    add-float/2addr v1, p2

    .line 82
    int-to-float v3, v0

    .line 83
    div-float/2addr v3, v2

    .line 84
    add-float/2addr v3, p4

    .line 85
    int-to-float v0, v0

    .line 86
    div-float/2addr v0, v2

    .line 87
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {p1, v1, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    .line 93
    .line 94
    mul-int/2addr p3, v0

    .line 95
    mul-int/lit8 p3, p3, 0x9

    .line 96
    .line 97
    int-to-float p3, p3

    .line 98
    div-float/2addr p3, v2

    .line 99
    add-float/2addr p3, p2

    .line 100
    int-to-float p2, v0

    .line 101
    div-float/2addr p2, v2

    .line 102
    add-float/2addr p2, p4

    .line 103
    int-to-float p4, v0

    .line 104
    div-float/2addr p4, v2

    .line 105
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 106
    .line 107
    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method private drawBottomText(Landroid/graphics/Canvas;IIIF)V
    .locals 3
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_5

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 37
    .line 38
    const/4 v2, -0x1

    .line 39
    if-eq v1, v2, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 43
    .line 44
    const v2, 0xffffff

    .line 45
    .line 46
    .line 47
    and-int/2addr v1, v2

    .line 48
    const/high16 v2, 0x44000000    # 512.0f

    .line 49
    .line 50
    or-int/2addr v1, v2

    .line 51
    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    .line 64
    .line 65
    invoke-virtual {p2}, Landroid/text/Layout;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    sub-int/2addr p3, p2

    .line 70
    int-to-float p2, p3

    .line 71
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 72
    .line 73
    add-int/2addr p4, p3

    .line 74
    int-to-float p3, p4

    .line 75
    sub-float/2addr p3, p5

    .line 76
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomTextLeftOffset()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    add-int/2addr p2, p3

    .line 85
    int-to-float p2, p2

    .line 86
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 87
    .line 88
    add-int/2addr p4, p3

    .line 89
    int-to-float p3, p4

    .line 90
    sub-float/2addr p3, p5

    .line 91
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textLayout:Landroid/text/StaticLayout;

    .line 95
    .line 96
    invoke-virtual {p2, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 100
    .line 101
    .line 102
    :cond_5
    return-void
.end method

.method private drawFloatingLabel(Landroid/graphics/Canvas;II)V
    .locals 7
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_7

    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 14
    .line 15
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 16
    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusEvaluator:Landroid/animation/ArgbEvaluator;

    .line 24
    .line 25
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-float v3, v3

    .line 32
    mul-float/2addr v2, v3

    .line 33
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 34
    .line 35
    const/4 v4, -0x1

    .line 36
    if-eq v3, v4, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 40
    .line 41
    const v5, 0xffffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v3, v5

    .line 45
    const/high16 v5, 0x44000000    # 512.0f

    .line 46
    .line 47
    or-int/2addr v3, v5

    .line 48
    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v1, v2, v3, v5}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v2, 0x5

    .line 88
    and-int/2addr v1, v2

    .line 89
    if-eq v1, v2, :cond_3

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    const/4 v1, 0x3

    .line 103
    and-int/2addr p3, v1

    .line 104
    if-ne p3, v1, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getInnerPaddingLeft()I

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    int-to-float p3, p3

    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getInnerPaddingLeft()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    sub-int/2addr v1, v2

    .line 121
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getInnerPaddingRight()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    sub-int/2addr v1, v2

    .line 126
    int-to-float v1, v1

    .line 127
    const/high16 v2, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-static {v1, v0, v2, p3}, Landroidx/collection/a;->a(FFFF)F

    .line 130
    .line 131
    .line 132
    move-result p3

    .line 133
    float-to-int p3, p3

    .line 134
    add-int/2addr p2, p3

    .line 135
    goto :goto_2

    .line 136
    :cond_3
    :goto_1
    int-to-float p2, p3

    .line 137
    sub-float/2addr p2, v0

    .line 138
    float-to-int p2, p2

    .line 139
    :goto_2
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 140
    .line 141
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    .line 142
    .line 143
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 144
    .line 145
    add-int/2addr v0, v1

    .line 146
    add-int/2addr v0, p3

    .line 147
    int-to-float v0, v0

    .line 148
    int-to-float p3, p3

    .line 149
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 150
    .line 151
    const/high16 v2, 0x3f800000    # 1.0f

    .line 152
    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    move v1, v2

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    .line 158
    .line 159
    :goto_3
    mul-float/2addr p3, v1

    .line 160
    sub-float/2addr v0, p3

    .line 161
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 162
    .line 163
    .line 164
    move-result p3

    .line 165
    int-to-float p3, p3

    .line 166
    add-float/2addr v0, p3

    .line 167
    float-to-int p3, v0

    .line 168
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 169
    .line 170
    if-eqz v0, :cond_5

    .line 171
    .line 172
    move v0, v2

    .line 173
    goto :goto_4

    .line 174
    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    .line 175
    .line 176
    :goto_4
    const/high16 v1, 0x437f0000    # 255.0f

    .line 177
    .line 178
    mul-float/2addr v0, v1

    .line 179
    const v3, 0x3f3d70a4    # 0.74f

    .line 180
    .line 181
    .line 182
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    .line 183
    .line 184
    mul-float/2addr v5, v3

    .line 185
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    int-to-float v3, v3

    .line 190
    const v6, 0x3e851eb8    # 0.26f

    .line 191
    .line 192
    .line 193
    invoke-static {v5, v3, v6, v0}, Landroidx/collection/a;->z(FFFF)F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 198
    .line 199
    if-eq v3, v4, :cond_6

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_6
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    int-to-float v2, v2

    .line 207
    div-float/2addr v2, v1

    .line 208
    :goto_5
    mul-float/2addr v0, v2

    .line 209
    float-to-int v0, v0

    .line 210
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 211
    .line 212
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 213
    .line 214
    .line 215
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    int-to-float p2, p2

    .line 222
    int-to-float p3, p3

    .line 223
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 224
    .line 225
    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 226
    .line 227
    .line 228
    :cond_7
    return-void
.end method

.method private drawIcons(Landroid/graphics/Canvas;III)V
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x3

    .line 15
    const/4 v4, 0x2

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    move v5, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    move v5, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    move v5, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v5, v1

    .line 47
    :goto_0
    aget-object v0, v0, v5

    .line 48
    .line 49
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 50
    .line 51
    sub-int/2addr p2, v5

    .line 52
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 53
    .line 54
    sub-int/2addr p2, v5

    .line 55
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    sub-int/2addr v5, v6

    .line 60
    div-int/2addr v5, v4

    .line 61
    add-int/2addr v5, p2

    .line 62
    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 63
    .line 64
    add-int/2addr p2, p4

    .line 65
    iget v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    .line 66
    .line 67
    sub-int/2addr p2, v6

    .line 68
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    sub-int/2addr v6, v7

    .line 73
    div-int/2addr v6, v4

    .line 74
    add-int/2addr v6, p2

    .line 75
    int-to-float p2, v5

    .line 76
    int-to-float v5, v6

    .line 77
    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 78
    .line 79
    invoke-virtual {p1, v0, p2, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-eqz p2, :cond_7

    .line 87
    .line 88
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    move v1, v3

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    move v1, v4

    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    move v1, v2

    .line 115
    :cond_6
    :goto_1
    aget-object p2, p2, v1

    .line 116
    .line 117
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 118
    .line 119
    add-int/2addr p3, v0

    .line 120
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 121
    .line 122
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v0, v1

    .line 127
    div-int/2addr v0, v4

    .line 128
    add-int/2addr v0, p3

    .line 129
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 130
    .line 131
    add-int/2addr p4, p3

    .line 132
    iget p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    .line 133
    .line 134
    sub-int/2addr p4, p3

    .line 135
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    sub-int/2addr p3, v1

    .line 140
    div-int/2addr p3, v4

    .line 141
    add-int/2addr p3, p4

    .line 142
    int-to-float p4, v0

    .line 143
    int-to-float p3, p3

    .line 144
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 145
    .line 146
    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    return-void
.end method

.method private drawUnderline(Landroid/graphics/Canvas;III)I
    .locals 18
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 8
    .line 9
    if-nez v3, :cond_6

    .line 10
    .line 11
    iget v3, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 12
    .line 13
    add-int v3, p4, v3

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isInternalValid()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    iget-object v4, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 22
    .line 23
    iget v5, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    .line 27
    .line 28
    int-to-float v7, v1

    .line 29
    int-to-float v8, v3

    .line 30
    int-to-float v9, v2

    .line 31
    iget v1, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    .line 32
    .line 33
    add-int/2addr v1, v3

    .line 34
    int-to-float v10, v1

    .line 35
    iget-object v11, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 36
    .line 37
    move-object/from16 v6, p1

    .line 38
    .line 39
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 40
    .line 41
    .line 42
    return v3

    .line 43
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const v5, 0xffffff

    .line 48
    .line 49
    .line 50
    const/4 v6, -0x1

    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    iget-object v2, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 54
    .line 55
    iget v4, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 56
    .line 57
    if-eq v4, v6, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget v4, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 61
    .line 62
    and-int/2addr v4, v5

    .line 63
    const/high16 v5, 0x44000000    # 512.0f

    .line 64
    .line 65
    or-int/2addr v4, v5

    .line 66
    :goto_0
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 67
    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    invoke-direct {v0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-float v2, v2

    .line 75
    const/4 v4, 0x0

    .line 76
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    int-to-float v5, v5

    .line 81
    cmpg-float v5, v4, v5

    .line 82
    .line 83
    if-gez v5, :cond_2

    .line 84
    .line 85
    int-to-float v5, v1

    .line 86
    add-float v13, v5, v4

    .line 87
    .line 88
    int-to-float v14, v3

    .line 89
    add-float v15, v13, v2

    .line 90
    .line 91
    iget v5, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    .line 92
    .line 93
    add-int/2addr v5, v3

    .line 94
    int-to-float v5, v5

    .line 95
    iget-object v6, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 96
    .line 97
    move-object/from16 v12, p1

    .line 98
    .line 99
    move/from16 v16, v5

    .line 100
    .line 101
    move-object/from16 v17, v6

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 104
    .line 105
    .line 106
    const/high16 v5, 0x40400000    # 3.0f

    .line 107
    .line 108
    mul-float/2addr v5, v2

    .line 109
    add-float/2addr v4, v5

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    return v3

    .line 112
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    iget-object v4, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 119
    .line 120
    iget v5, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 121
    .line 122
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 123
    .line 124
    .line 125
    int-to-float v13, v1

    .line 126
    int-to-float v14, v3

    .line 127
    int-to-float v15, v2

    .line 128
    iget v1, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    .line 129
    .line 130
    add-int/2addr v1, v3

    .line 131
    int-to-float v1, v1

    .line 132
    iget-object v2, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 133
    .line 134
    move-object/from16 v12, p1

    .line 135
    .line 136
    move/from16 v16, v1

    .line 137
    .line 138
    move-object/from16 v17, v2

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 141
    .line 142
    .line 143
    return v3

    .line 144
    :cond_4
    iget-object v4, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 145
    .line 146
    iget v7, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 147
    .line 148
    if-eq v7, v6, :cond_5

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    iget v6, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 152
    .line 153
    and-int/2addr v5, v6

    .line 154
    const/high16 v6, 0x1e000000

    .line 155
    .line 156
    or-int v7, v5, v6

    .line 157
    .line 158
    :goto_2
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    .line 160
    .line 161
    int-to-float v13, v1

    .line 162
    int-to-float v14, v3

    .line 163
    int-to-float v15, v2

    .line 164
    iget v1, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    .line 165
    .line 166
    add-int/2addr v1, v3

    .line 167
    int-to-float v1, v1

    .line 168
    iget-object v2, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->paint:Landroid/graphics/Paint;

    .line 169
    .line 170
    move-object/from16 v12, p1

    .line 171
    .line 172
    move/from16 v16, v1

    .line 173
    .line 174
    move-object/from16 v17, v2

    .line 175
    .line 176
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 177
    .line 178
    .line 179
    return v3

    .line 180
    :cond_6
    return p4
.end method

.method private generateIconBitmaps(I)[Landroid/graphics/Bitmap;
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

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
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;
    .locals 7

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x4

    .line 12
    new-array v0, v0, [Landroid/graphics/Bitmap;

    .line 13
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->scaleIcon(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 14
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v0, v4

    .line 15
    new-instance v3, Landroid/graphics/Canvas;

    aget-object v4, v0, v4

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 16
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    const v5, 0xffffff

    and-int v6, v4, v5

    invoke-static {v4}, Lt6/a;->l(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/high16 v4, -0x1000000

    goto :goto_0

    :cond_1
    const/high16 v4, -0x76000000

    :goto_0
    or-int/2addr v4, v6

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v3, v4, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 17
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    aput-object v3, v0, v2

    .line 18
    new-instance v3, Landroid/graphics/Canvas;

    aget-object v4, v0, v2

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 19
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    invoke-virtual {v3, v4, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 20
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v0, v4

    .line 21
    new-instance v3, Landroid/graphics/Canvas;

    aget-object v4, v0, v4

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 22
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    and-int/2addr v5, v4

    invoke-static {v4}, Lt6/a;->l(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/high16 v4, 0x4c000000    # 3.3554432E7f

    goto :goto_1

    :cond_2
    const/high16 v4, 0x42000000    # 32.0f

    :goto_1
    or-int/2addr v4, v5

    invoke-virtual {v3, v4, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 23
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 v1, 0x3

    aput-object p1, v0, v1

    .line 24
    new-instance p1, Landroid/graphics/Canvas;

    aget-object v1, v0, v1

    invoke-direct {p1, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 25
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    invoke-virtual {p1, v1, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

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

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x5

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v0, v1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method private getBottomLinesAnimator(F)Landroid/animation/ObjectAnimator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-array v0, v2, [F

    .line 8
    .line 9
    aput p1, v0, v1

    .line 10
    .line 11
    const-string p1, "currentBottomLines"

    .line 12
    .line 13
    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    .line 24
    .line 25
    new-array v2, v2, [F

    .line 26
    .line 27
    aput p1, v2, v1

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomLinesAnimator:Landroid/animation/ObjectAnimator;

    .line 33
    .line 34
    return-object p1
.end method

.method private getBottomTextLeftOffset()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomEllipsisWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method private getBottomTextRightOffset()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getBottomEllipsisWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method private getButtonsCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isShowClearButton()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isShowPasswordButton()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method private getCharactersCounterText()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 2
    .line 3
    const-string v1, " / "

    .line 4
    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 72
    .line 73
    if-gtz v0, :cond_3

    .line 74
    .line 75
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const-string v2, "+"

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 132
    .line 133
    invoke-static {v0, v2, v1}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const-string v2, "-"

    .line 143
    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 152
    .line 153
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkLength(Ljava/lang/CharSequence;)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0
.end method

.method private getCharactersCounterWidth()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterText()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    float-to-int v0, v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private getEndIcon()[Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 11
    .line 12
    return-object v0
.end method

.method private getLabelAnimator()Landroid/animation/ObjectAnimator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    const-string v1, "floatingLabelFraction"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    .line 20
    .line 21
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-wide/16 v1, 0x12c

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-wide/16 v1, 0x0

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelAnimator:Landroid/animation/ObjectAnimator;

    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
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

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    const-string v1, "focusFraction"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->labelFocusAnimator:Landroid/animation/ObjectAnimator;

    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private getPixel(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method private getStartIcon()[Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 11
    .line 12
    return-object v0
.end method

.method private handleSwitchPasswordInputVisibility()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/widget/EditText;->setSelection(II)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private hasCharactersCounter()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 2
    .line 3
    if-gtz v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    .line 8
    .line 9
    const/16 v1, 0x18

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget v1, Lcom/xuexiang/xui/R$dimen;->default_edittext_components_spacing:I

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget v1, Lcom/xuexiang/xui/R$dimen;->default_bottom_ellipsis_height:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomEllipsisSize:I

    .line 46
    .line 47
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText:[I

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_textColor:I

    .line 55
    .line 56
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_textColorHint:I

    .line 63
    .line 64
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_baseColor:I

    .line 71
    .line 72
    const/high16 v2, -0x1000000

    .line 73
    .line 74
    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 79
    .line 80
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_primaryColor:I

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget v3, Lcom/xuexiang/xui/R$attr;->colorPrimary:I

    .line 87
    .line 88
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 89
    .line 90
    invoke-static {v2, v3, v4}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 99
    .line 100
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabel:I

    .line 101
    .line 102
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setFloatingLabelInternal(I)V

    .line 107
    .line 108
    .line 109
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_errorColor:I

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_error_text:I

    .line 116
    .line 117
    invoke-static {v2, v3, v1}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 126
    .line 127
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_allowEmpty:I

    .line 128
    .line 129
    const/4 v2, 0x1

    .line 130
    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    const/4 v3, 0x0

    .line 135
    if-nez v0, :cond_1

    .line 136
    .line 137
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_errorEmpty:I

    .line 138
    .line 139
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_0

    .line 148
    .line 149
    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 150
    .line 151
    new-instance v5, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    .line 152
    .line 153
    invoke-direct {v5, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_0
    invoke-static {}, Lt1/a;->a()V

    .line 161
    .line 162
    .line 163
    throw v3

    .line 164
    :cond_1
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_minCharacters:I

    .line 165
    .line 166
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 171
    .line 172
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_maxCharacters:I

    .line 173
    .line 174
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 179
    .line 180
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_singleLineEllipsis:I

    .line 181
    .line 182
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 187
    .line 188
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_helperText:I

    .line 189
    .line 190
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 195
    .line 196
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_helperTextColor:I

    .line 197
    .line 198
    const/4 v4, -0x1

    .line 199
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 204
    .line 205
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_minBottomTextLines:I

    .line 206
    .line 207
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    .line 212
    .line 213
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_accentTypeface:I

    .line 214
    .line 215
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-eqz v0, :cond_2

    .line 220
    .line 221
    invoke-static {v0}, Lt1/a;->c(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iput-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    .line 225
    .line 226
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 227
    .line 228
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 229
    .line 230
    .line 231
    :cond_2
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_typeface:I

    .line 232
    .line 233
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-eqz v0, :cond_3

    .line 238
    .line 239
    invoke-static {v0}, Lt1/a;->c(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 243
    .line 244
    .line 245
    :cond_3
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelText:I

    .line 246
    .line 247
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 252
    .line 253
    if-nez v0, :cond_4

    .line 254
    .line 255
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 260
    .line 261
    :cond_4
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelPadding:I

    .line 262
    .line 263
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 264
    .line 265
    invoke-virtual {p3, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 270
    .line 271
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelTextSize:I

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    sget v6, Lcom/xuexiang/xui/R$dimen;->default_floating_label_text_size:I

    .line 278
    .line 279
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    invoke-virtual {p3, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 288
    .line 289
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelTextColor:I

    .line 290
    .line 291
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 296
    .line 297
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelAnimating:I

    .line 298
    .line 299
    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    .line 304
    .line 305
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_bottomTextSize:I

    .line 306
    .line 307
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    sget v6, Lcom/xuexiang/xui/R$dimen;->default_bottom_text_size:I

    .line 312
    .line 313
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    invoke-virtual {p3, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 322
    .line 323
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_hideUnderline:I

    .line 324
    .line 325
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 330
    .line 331
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_underlineColor:I

    .line 332
    .line 333
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 338
    .line 339
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_underlineHeight:I

    .line 340
    .line 341
    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    invoke-virtual {p3, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeight:I

    .line 350
    .line 351
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_underlineHeightFocused:I

    .line 352
    .line 353
    const/4 v5, 0x2

    .line 354
    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    invoke-virtual {p3, v0, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineHeightFocused:I

    .line 363
    .line 364
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_autoValidate:I

    .line 365
    .line 366
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    .line 371
    .line 372
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_iconLeft:I

    .line 373
    .line 374
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconLeftBitmaps:[Landroid/graphics/Bitmap;

    .line 383
    .line 384
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_iconRight:I

    .line 385
    .line 386
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(I)[Landroid/graphics/Bitmap;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconRightBitmaps:[Landroid/graphics/Bitmap;

    .line 395
    .line 396
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_clearButton:I

    .line 397
    .line 398
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 403
    .line 404
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    sget v4, Lcom/xuexiang/xui/R$drawable;->xui_ic_default_clear_btn:I

    .line 409
    .line 410
    invoke-static {v0, v4}, Lcom/xuexiang/xui/utils/a;->a(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->clearButtonBitmaps:[Landroid/graphics/Bitmap;

    .line 419
    .line 420
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_passWordButton:I

    .line 421
    .line 422
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    .line 427
    .line 428
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_isAsteriskStyle:I

    .line 429
    .line 430
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-eqz v0, :cond_6

    .line 435
    .line 436
    sget-object v0, Ll2/b;->a:Ll2/b;

    .line 437
    .line 438
    if-eqz v0, :cond_5

    .line 439
    .line 440
    goto :goto_1

    .line 441
    :cond_5
    new-instance v0, Ll2/b;

    .line 442
    .line 443
    invoke-direct {v0}, Landroid/text/method/PasswordTransformationMethod;-><init>()V

    .line 444
    .line 445
    .line 446
    sput-object v0, Ll2/b;->a:Ll2/b;

    .line 447
    .line 448
    :goto_1
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    .line 449
    .line 450
    goto :goto_2

    .line 451
    :cond_6
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    .line 456
    .line 457
    :goto_2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    .line 458
    .line 459
    if-eqz v0, :cond_7

    .line 460
    .line 461
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->handleSwitchPasswordInputVisibility()V

    .line 462
    .line 463
    .line 464
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    sget v4, Lcom/xuexiang/xui/R$drawable;->pet_icon_visibility_24dp:I

    .line 469
    .line 470
    invoke-static {v0, v4}, Lcom/xuexiang/xui/utils/a;->a(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPwIconBitmaps:[Landroid/graphics/Bitmap;

    .line 479
    .line 480
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    sget v4, Lcom/xuexiang/xui/R$drawable;->pet_icon_visibility_off_24dp:I

    .line 485
    .line 486
    invoke-static {v0, v4}, Lcom/xuexiang/xui/utils/a;->a(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->generateIconBitmaps(Landroid/graphics/Bitmap;)[Landroid/graphics/Bitmap;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hidePwIconBitmaps:[Landroid/graphics/Bitmap;

    .line 495
    .line 496
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_regexp:I

    .line 497
    .line 498
    invoke-virtual {p3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-nez v4, :cond_9

    .line 507
    .line 508
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_errorMessage:I

    .line 509
    .line 510
    invoke-virtual {p3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-nez v6, :cond_8

    .line 519
    .line 520
    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 521
    .line 522
    new-instance v7, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;

    .line 523
    .line 524
    invoke-direct {v7, v4, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/RegexpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    goto :goto_3

    .line 531
    :cond_8
    invoke-static {}, Lt1/a;->a()V

    .line 532
    .line 533
    .line 534
    throw v3

    .line 535
    :cond_9
    :goto_3
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_iconPadding:I

    .line 536
    .line 537
    const/16 v4, 0x8

    .line 538
    .line 539
    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 548
    .line 549
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_floatingLabelAlwaysShown:I

    .line 550
    .line 551
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 556
    .line 557
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_helperTextAlwaysShown:I

    .line 558
    .line 559
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    .line 564
    .line 565
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_validateOnFocusLost:I

    .line 566
    .line 567
    invoke-virtual {p3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    .line 572
    .line 573
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialEditText_met_checkCharactersCountAtBeginning:I

    .line 574
    .line 575
    invoke-virtual {p3, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCountAtBeginning:Z

    .line 580
    .line 581
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 582
    .line 583
    .line 584
    const p3, 0x10100d8

    .line 585
    .line 586
    .line 587
    const v0, 0x10100d9

    .line 588
    .line 589
    .line 590
    const v4, 0x10100d5

    .line 591
    .line 592
    .line 593
    const v6, 0x10100d6

    .line 594
    .line 595
    .line 596
    const v7, 0x10100d7

    .line 597
    .line 598
    .line 599
    filled-new-array {v4, v6, v7, p3, v0}, [I

    .line 600
    .line 601
    .line 602
    move-result-object p3

    .line 603
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 608
    .line 609
    .line 610
    move-result p2

    .line 611
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 612
    .line 613
    .line 614
    move-result p3

    .line 615
    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    .line 616
    .line 617
    invoke-virtual {p1, v5, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 618
    .line 619
    .line 620
    move-result p3

    .line 621
    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    .line 622
    .line 623
    const/4 p3, 0x3

    .line 624
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 625
    .line 626
    .line 627
    move-result p3

    .line 628
    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    .line 629
    .line 630
    const/4 p3, 0x4

    .line 631
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 632
    .line 633
    .line 634
    move-result p2

    .line 635
    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 636
    .line 637
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 638
    .line 639
    .line 640
    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 641
    .line 642
    .line 643
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 644
    .line 645
    if-eqz p1, :cond_a

    .line 646
    .line 647
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    invoke-virtual {p0}, Landroid/widget/TextView;->setSingleLine()V

    .line 652
    .line 653
    .line 654
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 655
    .line 656
    .line 657
    :cond_a
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 658
    .line 659
    .line 660
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 661
    .line 662
    .line 663
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initText()V

    .line 664
    .line 665
    .line 666
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initFloatingLabel()V

    .line 667
    .line 668
    .line 669
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initTextWatcher()V

    .line 670
    .line 671
    .line 672
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->checkCharactersCount()V

    .line 673
    .line 674
    .line 675
    return-void
.end method

.method private initFloatingLabel()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 15
    .line 16
    invoke-super {p0, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private initMinBottomLines()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 8
    .line 9
    if-gtz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v0, v1

    .line 27
    :goto_1
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    .line 28
    .line 29
    if-lez v3, :cond_2

    .line 30
    .line 31
    move v1, v3

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    move v1, v2

    .line 37
    :goto_2
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomLines:I

    .line 38
    .line 39
    int-to-float v0, v1

    .line 40
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    .line 41
    .line 42
    return-void
.end method

.method private initPadding()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 6
    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 12
    .line 13
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingTop:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 16
    .line 17
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 18
    .line 19
    int-to-float v1, v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 30
    .line 31
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 32
    .line 33
    sub-float/2addr v1, v0

    .line 34
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    .line 35
    .line 36
    mul-float/2addr v1, v0

    .line 37
    float-to-int v0, v1

    .line 38
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 46
    .line 47
    mul-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    :goto_1
    add-int/2addr v0, v1

    .line 50
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingBottom:I

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    move v0, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 62
    .line 63
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 64
    .line 65
    add-int/2addr v0, v2

    .line 66
    :goto_2
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingLeft:I

    .line 67
    .line 68
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 76
    .line 77
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 78
    .line 79
    add-int/2addr v1, v0

    .line 80
    :goto_3
    iput v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingRight:I

    .line 81
    .line 82
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method private initText()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 34
    .line 35
    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    iput v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelShown:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetHintTextColor()V

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->resetTextColor()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private initTextWatcher()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;-><init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private insideActionButton(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move v1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 19
    .line 20
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 21
    .line 22
    add-int/2addr v1, v3

    .line 23
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 39
    .line 40
    sub-int/2addr v3, v4

    .line 41
    iget v4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 42
    .line 43
    sub-int/2addr v3, v4

    .line 44
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 52
    .line 53
    sub-int v1, v3, v1

    .line 54
    .line 55
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/2addr v4, v3

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    sub-int/2addr v4, v3

    .line 69
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 70
    .line 71
    add-int/2addr v4, v3

    .line 72
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterHeight:I

    .line 73
    .line 74
    sub-int/2addr v4, v3

    .line 75
    int-to-float v5, v1

    .line 76
    cmpl-float v5, v0, v5

    .line 77
    .line 78
    if-ltz v5, :cond_3

    .line 79
    .line 80
    iget v5, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 81
    .line 82
    add-int/2addr v1, v5

    .line 83
    int-to-float v1, v1

    .line 84
    cmpg-float v0, v0, v1

    .line 85
    .line 86
    if-gez v0, :cond_3

    .line 87
    .line 88
    int-to-float v0, v4

    .line 89
    cmpl-float v0, p1, v0

    .line 90
    .line 91
    if-ltz v0, :cond_3

    .line 92
    .line 93
    add-int/2addr v4, v3

    .line 94
    int-to-float v0, v4

    .line 95
    cmpg-float p1, p1, v0

    .line 96
    .line 97
    if-gez p1, :cond_3

    .line 98
    .line 99
    const/4 p1, 0x1

    .line 100
    return p1

    .line 101
    :cond_3
    return v2
.end method

.method private isInternalValid()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isCharactersCountValid()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method private isRTL()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private resetHintTextColor()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorHintStateList:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 6
    .line 7
    const v1, 0xffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    const/high16 v1, 0x44000000    # 512.0f

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private resetTextColor()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const v1, 0x101009e

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Landroid/widget/EditText;->EMPTY_STATE_SET:[I

    .line 15
    .line 16
    filled-new-array {v1, v2}, [[I

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 21
    .line 22
    const v3, 0xffffff

    .line 23
    .line 24
    .line 25
    and-int v4, v2, v3

    .line 26
    .line 27
    const/high16 v5, -0x21000000

    .line 28
    .line 29
    or-int/2addr v4, v5

    .line 30
    and-int/2addr v2, v3

    .line 31
    const/high16 v3, 0x44000000    # 512.0f

    .line 32
    .line 33
    or-int/2addr v2, v3

    .line 34
    filled-new-array {v4, v2}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v0, v1, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textColorStateList:Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private scaleIcon(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconSize:I

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    if-le v2, v3, :cond_2

    .line 19
    .line 20
    if-le v0, v3, :cond_1

    .line 21
    .line 22
    int-to-float v2, v3

    .line 23
    int-to-float v1, v1

    .line 24
    int-to-float v0, v0

    .line 25
    div-float/2addr v1, v0

    .line 26
    mul-float/2addr v1, v2

    .line 27
    float-to-int v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    int-to-float v2, v3

    .line 30
    int-to-float v0, v0

    .line 31
    int-to-float v1, v1

    .line 32
    div-float/2addr v0, v1

    .line 33
    mul-float/2addr v0, v2

    .line 34
    float-to-int v0, v0

    .line 35
    move v4, v3

    .line 36
    move v3, v0

    .line 37
    move v0, v4

    .line 38
    :goto_0
    const/4 v1, 0x0

    .line 39
    invoke-static {p1, v3, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_2
    :goto_1
    return-object p1
.end method

.method private setFloatingLabelInternal(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq p1, v2, :cond_0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelEnabled:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->highlightFloatingLabel:Z

    .line 21
    .line 22
    return-void
.end method

.method private togglePasswordIconVisibility()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->passwordVisible:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->handleSwitchPasswordInputVisibility()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public addValidator(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public clearValidators()Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public getAccentTypeface()Landroid/graphics/Typeface;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBottomTextSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getCurrentBottomLines()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    .line 2
    .line 3
    return v0
.end method

.method public getEditValue()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getError()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getErrorColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 2
    .line 3
    return v0
.end method

.method public getFloatingLabelFraction()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    .line 2
    .line 3
    return v0
.end method

.method public getFloatingLabelPadding()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 2
    .line 3
    return v0
.end method

.method public getFloatingLabelText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFloatingLabelTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 2
    .line 3
    return v0
.end method

.method public getFloatingLabelTextSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getFocusFraction()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    .line 2
    .line 3
    return v0
.end method

.method public getHelperText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHelperTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 2
    .line 3
    return v0
.end method

.method public getInnerPaddingBottom()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 2
    .line 3
    return v0
.end method

.method public getInnerPaddingLeft()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    .line 2
    .line 3
    return v0
.end method

.method public getInnerPaddingRight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    .line 2
    .line 3
    return v0
.end method

.method public getInnerPaddingTop()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxCharacters()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinBottomTextLines()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minBottomTextLines:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinCharacters()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 2
    .line 3
    return v0
.end method

.method public getUnderlineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 2
    .line 3
    return v0
.end method

.method public getValidators()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasValidators()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isAutoValidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    .line 2
    .line 3
    return v0
.end method

.method public isCharactersCountValid()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->charactersCountValid:Z

    .line 2
    .line 3
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEditValue()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isFloatingLabelAlwaysShown()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFloatingLabelAnimating()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    .line 2
    .line 3
    return v0
.end method

.method public isHelperTextAlwaysShown()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    .line 2
    .line 3
    return v0
.end method

.method public isHideUnderline()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 2
    .line 3
    return v0
.end method

.method public isNotEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEditValue()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public isShowClearButton()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 2
    .line 3
    return v0
.end method

.method public isShowPasswordButton()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    .line 2
    .line 3
    return v0
.end method

.method public isValid(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public isValidateOnFocusLost()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    .line 2
    .line 3
    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->firstShown:Z

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getStartIcon()[Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 14
    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 16
    .line 17
    add-int/2addr v1, v2

    .line 18
    :goto_0
    add-int v4, v0, v1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getEndIcon()[Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconOuterWidth:I

    .line 40
    .line 41
    sub-int/2addr v1, v2

    .line 42
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->iconPadding:I

    .line 43
    .line 44
    sub-int/2addr v1, v2

    .line 45
    :goto_1
    add-int v5, v0, v1

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v1, v0

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sub-int/2addr v1, v0

    .line 61
    invoke-direct {p0, p1, v4, v5, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawIcons(Landroid/graphics/Canvas;III)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1, v4, v5, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawActionButton(Landroid/graphics/Canvas;III)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1, v4, v5, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawUnderline(Landroid/graphics/Canvas;III)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 72
    .line 73
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 74
    .line 75
    int-to-float v1, v1

    .line 76
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 86
    .line 87
    neg-float v2, v1

    .line 88
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 89
    .line 90
    sub-float/2addr v2, v0

    .line 91
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 92
    .line 93
    int-to-float v3, v3

    .line 94
    add-float/2addr v3, v1

    .line 95
    add-float v7, v3, v0

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hasCharactersCounter()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isCharactersCountValid()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_6

    .line 114
    .line 115
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isCharactersCountValid()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 124
    .line 125
    const v3, 0xffffff

    .line 126
    .line 127
    .line 128
    and-int/2addr v1, v3

    .line 129
    const/high16 v3, 0x44000000    # 512.0f

    .line 130
    .line 131
    or-int/2addr v1, v3

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 134
    .line 135
    :goto_2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getCharactersCounterText()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->isRTL()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    int-to-float v1, v4

    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int/2addr v1, v5

    .line 155
    int-to-float v1, v1

    .line 156
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 157
    .line 158
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    sub-float/2addr v1, v3

    .line 163
    :goto_3
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomSpacing:I

    .line 164
    .line 165
    add-int/2addr v3, v6

    .line 166
    int-to-float v3, v3

    .line 167
    add-float/2addr v3, v2

    .line 168
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 169
    .line 170
    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    move-object v2, p0

    .line 174
    move-object v3, p1

    .line 175
    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawBottomText(Landroid/graphics/Canvas;IIIF)V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0, v3, v4, v5}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawFloatingLabel(Landroid/graphics/Canvas;II)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, v3, v4, v5, v6}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->drawBottomEllipsis(Landroid/graphics/Canvas;III)V

    .line 182
    .line 183
    .line 184
    invoke-super {p0, v3}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->singleLineEllipsis:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v2, 0x14

    .line 23
    .line 24
    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->getPixel(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-float v2, v2

    .line 29
    cmpg-float v0, v0, v2

    .line 30
    .line 31
    if-gez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->extraPaddingBottom:I

    .line 42
    .line 43
    sub-int/2addr v2, v3

    .line 44
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 45
    .line 46
    sub-int/2addr v2, v3

    .line 47
    int-to-float v2, v2

    .line 48
    cmpl-float v0, v0, v2

    .line 49
    .line 50
    if-lez v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 61
    .line 62
    sub-int/2addr v2, v3

    .line 63
    int-to-float v2, v2

    .line 64
    cmpg-float v0, v0, v2

    .line 65
    .line 66
    if-gez v0, :cond_0

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_b

    .line 77
    .line 78
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 79
    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showPasswordButton:Z

    .line 83
    .line 84
    if-eqz v0, :cond_b

    .line 85
    .line 86
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_b

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const/4 v2, 0x1

    .line 97
    if-eqz v0, :cond_8

    .line 98
    .line 99
    if-eq v0, v2, :cond_3

    .line 100
    .line 101
    const/4 v3, 0x2

    .line 102
    if-eq v0, v3, :cond_9

    .line 103
    .line 104
    const/4 v2, 0x3

    .line 105
    if-eq v0, v2, :cond_2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 109
    .line 110
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_5

    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->togglePasswordIconVisibility()V

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 140
    .line 141
    :cond_6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 142
    .line 143
    if-eqz v0, :cond_7

    .line 144
    .line 145
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 146
    .line 147
    return v2

    .line 148
    :cond_7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->insideActionButton(Landroid/view/MotionEvent;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_9

    .line 156
    .line 157
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 158
    .line 159
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 160
    .line 161
    return v2

    .line 162
    :cond_9
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 163
    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->insideActionButton(Landroid/view/MotionEvent;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_a

    .line 171
    .line 172
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonClicking:Z

    .line 173
    .line 174
    :cond_a
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->actionButtonTouched:Z

    .line 175
    .line 176
    if-eqz v0, :cond_b

    .line 177
    .line 178
    return v2

    .line 179
    :cond_b
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    return p1
.end method

.method public setAccentTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->accentTypeface:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setAllowEmpty(ZLjava/lang/String;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;

    .line 19
    .line 20
    instance-of v3, v1, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->setErrorMessage(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {}, Lt1/a;->a()V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 46
    :goto_1
    if-nez p1, :cond_5

    .line 47
    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validators:Ljava/util/List;

    .line 57
    .line 58
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;

    .line 59
    .line 60
    invoke-direct {v0, p2}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/NotAllowEmptyValidator;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_4
    invoke-static {}, Lt1/a;->a()V

    .line 68
    .line 69
    .line 70
    throw v2

    .line 71
    :cond_5
    return-object p0
.end method

.method public setAutoValidate(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->autoValidate:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validate()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public setBaseColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->baseColor:I

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initText()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setBottomTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->bottomTextSize:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCurrentBottomLines(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->currentBottomLines:F

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->tempErrorText:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public setErrorColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->errorColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setFloatingLabel(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setFloatingLabelInternal(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public setFloatingLabelAlwaysShown(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAlwaysShown:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setFloatingLabelAnimating(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelAnimating:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setFloatingLabelFraction(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelFraction:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setFloatingLabelPadding(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelPadding:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setFloatingLabelText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelText:Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setFloatingLabelTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setFloatingLabelTextSize(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->floatingLabelTextSize:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setFocusFraction(F)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->focusFraction:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setHelperText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperText:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->adjustBottomLines()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-object p0
.end method

.method public setHelperTextAlwaysShown(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextAlwaysShown:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setHelperTextColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->helperTextColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setHideUnderline(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->hideUnderline:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public setIconLeft(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

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
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

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

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->lengthChecker:Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METLengthChecker;

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxCharacters(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->maxCharacters:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 10
    .line 11
    .line 12
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
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setMinCharacters(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->minCharacters:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initMinBottomLines()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initPadding()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->outerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 10
    .line 11
    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setPaddings(IIII)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingTop:I

    .line 2
    .line 3
    iput p4, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingBottom:I

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingLeft:I

    .line 6
    .line 7
    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->innerPaddingRight:I

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setPasswordTransformationMethod(Landroid/text/method/PasswordTransformationMethod;)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->mTransformationMethod:Landroid/text/method/PasswordTransformationMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method public setPrimaryColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->primaryColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setShowClearButton(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->showClearButton:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->correctPaddings()V

    .line 4
    .line 5
    .line 6
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
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->textPaint:Landroid/text/TextPaint;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setUnderlineColor(I)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->underlineColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setValidateOnFocusLost(Z)Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validateOnFocusLost:Z

    .line 2
    .line 3
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

    move v4, v1

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

    move v4, v1

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
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return p1
.end method

.method public validateWith(Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;)Z
    .locals 2
    .param p1    # Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->isValid(Ljava/lang/CharSequence;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->getErrorMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 28
    .line 29
    .line 30
    return v0
.end method
