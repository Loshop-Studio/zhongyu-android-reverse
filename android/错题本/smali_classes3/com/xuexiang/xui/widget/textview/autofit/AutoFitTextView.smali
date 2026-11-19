.class public Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"

# interfaces
.implements Ls3/b;


# instance fields
.field public final b:Ls3/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 3
    invoke-static {p0, p2, p1}, Ls3/c;->b(Landroid/widget/TextView;Landroid/util/AttributeSet;I)Ls3/c;

    move-result-object p1

    .line 4
    iget-object p2, p1, Ls3/c;->j:Ljava/util/ArrayList;

    if-nez p2, :cond_0

    .line 5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p1, Ls3/c;->j:Ljava/util/ArrayList;

    .line 6
    :cond_0
    iget-object p2, p1, Ls3/c;->j:Ljava/util/ArrayList;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    invoke-static {p0, p2, p3}, Ls3/c;->b(Landroid/widget/TextView;Landroid/util/AttributeSet;I)Ls3/c;

    move-result-object p1

    .line 10
    iget-object p2, p1, Ls3/c;->j:Ljava/util/ArrayList;

    if-nez p2, :cond_0

    .line 11
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p1, Ls3/c;->j:Ljava/util/ArrayList;

    .line 12
    :cond_0
    iget-object p2, p1, Ls3/c;->j:Ljava/util/ArrayList;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    return-void
.end method


# virtual methods
.method public getAutofitHelper()Ls3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxTextSize()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    iget v0, v0, Ls3/c;->f:F

    .line 4
    .line 5
    return v0
.end method

.method public getMinTextSize()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    iget v0, v0, Ls3/c;->e:F

    .line 4
    .line 5
    return v0
.end method

.method public getPrecision()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    iget v0, v0, Ls3/c;->g:F

    .line 4
    .line 5
    return v0
.end method

.method public setEnableFit(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls3/c;->d(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLines(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setLines(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v1, v0, Ls3/c;->d:I

    .line 9
    .line 10
    if-eq v1, p1, :cond_0

    .line 11
    .line 12
    iput p1, v0, Ls3/c;->d:I

    .line 13
    .line 14
    invoke-virtual {v0}, Ls3/c;->a()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setMaxLines(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v1, v0, Ls3/c;->d:I

    .line 9
    .line 10
    if-eq v1, p1, :cond_0

    .line 11
    .line 12
    iput p1, v0, Ls3/c;->d:I

    .line 13
    .line 14
    invoke-virtual {v0}, Ls3/c;->a()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setMaxTextSize(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    iget-object v1, v0, Ls3/c;->a:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-static {v2, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget v1, v0, Ls3/c;->f:F

    .line 29
    .line 30
    cmpl-float v1, p1, v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iput p1, v0, Ls3/c;->f:F

    .line 35
    .line 36
    invoke-virtual {v0}, Ls3/c;->a()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public setMinTextSize(I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    int-to-float p1, p1

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Ls3/c;->e(FI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPrecision(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 2
    .line 3
    iget v1, v0, Ls3/c;->g:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Ls3/c;->g:F

    .line 10
    .line 11
    invoke-virtual {v0}, Ls3/c;->a()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setTextSize(IF)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/autofit/AutoFitTextView;->b:Ls3/c;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-boolean v1, v0, Ls3/c;->i:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, v0, Ls3/c;->a:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_1
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {p1, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget p2, v0, Ls3/c;->c:F

    .line 38
    .line 39
    cmpl-float p2, p2, p1

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    iput p1, v0, Ls3/c;->c:F

    .line 44
    .line 45
    :cond_2
    :goto_0
    return-void
.end method
