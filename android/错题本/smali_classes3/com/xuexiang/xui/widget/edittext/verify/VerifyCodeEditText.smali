.class public Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

.field public c:I

.field public d:Z

.field public e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

.field public final f:Lcom/xuexiang/xui/widget/searchview/e;


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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/e;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/searchview/e;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->f:Lcom/xuexiang/xui/widget/searchview/e;

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_verify_code:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    sget v0, Lcom/xuexiang/xui/R$id;->ll_container:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->a:Landroid/widget/LinearLayout;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$id;->et_input:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->b:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    .line 8
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->VerifyCodeEditText_vcet_number:I

    const/4 p3, 0x4

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 10
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public static a(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    :goto_0
    if-ltz v0, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 9
    .line 10
    aget-object v1, v1, v0

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, ""

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->d:Z

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput-boolean v2, v1, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;->c:Z

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-ge v0, v1, :cond_2

    .line 54
    .line 55
    iget-object p0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    aget-object p0, p0, v0

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->setText(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setText(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ge v0, v2, :cond_4

    .line 13
    .line 14
    aget-object v1, v1, v0

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, ""

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->d:Z

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iput-boolean v3, v1, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;->c:Z

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    shr-int/lit8 v2, v2, 0x2

    .line 48
    .line 49
    int-to-float v2, v2

    .line 50
    iput v2, v1, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;->b:F

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 60
    .line 61
    .line 62
    iget v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 63
    .line 64
    sub-int/2addr v1, v3

    .line 65
    if-ge v0, v1, :cond_2

    .line 66
    .line 67
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 68
    .line 69
    add-int/2addr v0, v3

    .line 70
    aget-object v0, v1, v0

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void

    .line 76
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->b:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEtNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getInputValue()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_0

    .line 11
    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    invoke-virtual {v4}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const/4 v0, 0x1

    .line 22
    const/high16 v1, 0x42480000    # 50.0f

    .line 23
    .line 24
    invoke-static {v0, v1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    float-to-int p2, p2

    .line 29
    const/high16 v0, 0x40000000    # 2.0f

    .line 30
    .line 31
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setEtNumber(I)V
    .locals 7

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->b:Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->f:Lcom/xuexiang/xui/widget/searchview/e;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->a:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->c:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Landroid/text/InputFilter$LengthFilter;

    .line 26
    .line 27
    invoke-direct {v5, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    new-array v6, v6, [Landroid/text/InputFilter;

    .line 32
    .line 33
    aput-object v5, v6, v4

    .line 34
    .line 35
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 36
    .line 37
    .line 38
    new-array v3, v3, [Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 39
    .line 40
    iput-object v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 41
    .line 42
    move v3, v4

    .line 43
    :goto_0
    iget-object v5, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 44
    .line 45
    array-length v6, v5

    .line 46
    if-ge v3, v6, :cond_1

    .line 47
    .line 48
    new-instance v5, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 49
    .line 50
    invoke-direct {v5, v2}, Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-virtual {v5, v4, v6}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setWidth(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setHeight(I)V

    .line 64
    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    if-nez v3, :cond_0

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    const/16 v6, 0x11

    .line 77
    .line 78
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 82
    .line 83
    .line 84
    iget-object v6, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->e:[Lcom/xuexiang/xui/widget/edittext/verify/PwdTextView;

    .line 85
    .line 86
    aput-object v5, v6, v3

    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    array-length v2, v5

    .line 92
    :goto_2
    if-ge v4, v2, :cond_2

    .line 93
    .line 94
    aget-object v3, v5, v4

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lm2/c;

    .line 106
    .line 107
    invoke-direct {v0, p0}, Lm2/c;-><init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Lo2/a;

    .line 114
    .line 115
    const/16 v1, 0x16

    .line 116
    .line 117
    invoke-direct {v0, p0, v1}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;->setBackSpaceListener(Lm2/a;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public setOnInputListener(Lm2/d;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setPwdMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->d:Z

    .line 2
    .line 3
    return-void
.end method
