.class public Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:Landroid/widget/TextView;

.field public final c:I

.field public d:Ljava/lang/String;

.field public final e:I

.field public final f:Z

.field public g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:Z

.field public final l:I

.field public final m:Landroid/graphics/drawable/Drawable;

.field public final n:Z

.field public final o:Lcom/xuexiang/xui/widget/searchview/e;


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
    .locals 5

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/searchview/e;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->o:Lcom/xuexiang/xui/widget/searchview/e;

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_maxCount:I

    const/16 v1, 0xf0

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_ignoreCnOrEn:I

    const/4 v1, 0x1

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->f:Z

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_hintText:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->d:Ljava/lang/String;

    .line 9
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_hintTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$attr;->xui_config_color_hint_text:I

    .line 10
    invoke-static {v3, v4, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result v3

    .line 11
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->e:I

    .line 12
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentPadding:I

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {p1, v3}, Lh4/a;->h(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->l:I

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentBackground:I

    .line 14
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 15
    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->m:Landroid/graphics/drawable/Drawable;

    .line 16
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentText:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->g:Ljava/lang/String;

    .line 17
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$attr;->xui_config_color_input_text:I

    .line 18
    invoke-static {v3, v4, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result v3

    .line 19
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->i:I

    .line 20
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentTextSize:I

    const/high16 v3, 0x41600000    # 14.0f

    invoke-static {p1, v3}, Lh4/a;->n(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->h:I

    .line 21
    sget p3, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_contentViewHeight:I

    const/high16 v3, 0x430c0000    # 140.0f

    invoke-static {p1, v3}, Lh4/a;->h(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->j:F

    .line 22
    sget p1, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_isFixHeight:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->k:Z

    .line 23
    sget p1, Lcom/xuexiang/xui/R$styleable;->MultiLineEditText_mlet_showSurplusNumber:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->n:Z

    .line 24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/xuexiang/xui/R$layout;->xui_layout_multiline_edittext:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 26
    sget p2, Lcom/xuexiang/xui/R$id;->mlet_input:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 27
    sget p2, Lcom/xuexiang/xui/R$id;->mlet_number:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b:Landroid/widget/TextView;

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 29
    sget p1, Lcom/xuexiang/xui/R$drawable;->mlet_selector_bg:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->e:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->l:I

    invoke-virtual {p1, p2, p2, p2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->m:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1

    .line 36
    iget-object p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 37
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->i:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->h:I

    int-to-float p2, p2

    invoke-virtual {p1, v2, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 39
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->k:Z

    if-eqz p1, :cond_2

    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->j:F

    float-to-int p2, p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHeight(I)V

    goto :goto_0

    .line 41
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    iget p2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->j:F

    float-to-int p2, p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 42
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 43
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b()V

    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 45
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    new-instance p2, Lcom/xuexiang/xui/widget/searchview/f;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lcom/xuexiang/xui/widget/searchview/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)J
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    const/16 v4, 0x7f

    .line 17
    .line 18
    if-ge v3, v4, :cond_0

    .line 19
    .line 20
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 21
    .line 22
    :goto_1
    add-double/2addr v0, v3

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a(Ljava/lang/String;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    long-to-int v0, v0

    .line 42
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final c(I)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->n:Z

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 13
    .line 14
    sub-int/2addr v2, p1

    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public getContentText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->g:Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->g:Ljava/lang/String;

    .line 27
    .line 28
    return-object v0
.end method

.method public getCountTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHintText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->d:Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->d:Ljava/lang/String;

    .line 27
    .line 28
    return-object v0
.end method

.method public setContentText(Ljava/lang/String;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->f:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v0, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-lez v0, :cond_4

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->f:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    move v0, v1

    .line 32
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v0, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-lez v4, :cond_1

    .line 43
    .line 44
    const/16 v5, 0x7f

    .line 45
    .line 46
    if-ge v4, v5, :cond_1

    .line 47
    .line 48
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 49
    .line 50
    :goto_2
    add-double/2addr v2, v4

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :goto_3
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iget v6, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 60
    .line 61
    int-to-long v6, v6

    .line 62
    cmp-long v4, v4, v6

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->c:I

    .line 73
    .line 74
    :goto_4
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :cond_4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->g:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 81
    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public setContentTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setContentTextSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    int-to-float p1, p1

    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setHintColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setHintText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->a:Landroid/widget/EditText;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
