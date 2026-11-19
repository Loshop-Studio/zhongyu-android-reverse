.class public Lf1/g;
.super Landroidx/appcompat/widget/AppCompatCheckedTextView;
.source "SourceFile"


# instance fields
.field public a:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public b:I

.field public final c:I

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Lg1/e;

.field public h:Lg1/e;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public final m:Landroid/graphics/Rect;

.field public final n:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckedTextView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const p1, -0x777778

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lf1/g;->b:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lf1/g;->d:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    sget-object p1, Lg1/e;->a:Lg1/e;

    .line 13
    .line 14
    iput-object p1, p0, Lf1/g;->g:Lg1/e;

    .line 15
    .line 16
    iput-object p1, p0, Lf1/g;->h:Lg1/e;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lf1/g;->i:Z

    .line 20
    .line 21
    iput-boolean p1, p0, Lf1/g;->j:Z

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lf1/g;->k:Z

    .line 25
    .line 26
    const/4 p1, 0x4

    .line 27
    iput p1, p0, Lf1/g;->l:I

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lf1/g;->m:Landroid/graphics/Rect;

    .line 35
    .line 36
    new-instance v0, Landroid/graphics/Rect;

    .line 37
    .line 38
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lf1/g;->n:Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/high16 v1, 0x10e0000

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lf1/g;->c:I

    .line 54
    .line 55
    iget v0, p0, Lf1/g;->b:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lf1/g;->o(I)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x11

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/view/View;->setTextAlignment(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p2}, Lf1/g;->k(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static c(IILandroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/DrawableContainer;->setExitFadeDuration(I)V

    .line 7
    .line 8
    .line 9
    const p1, 0x10100a0

    .line 10
    .line 11
    .line 12
    filled-new-array {p1}, [I

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p0}, Lf1/g;->d(I)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    const p1, 0x10100a7

    .line 24
    .line 25
    .line 26
    filled-new-array {p1}, [I

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p0, p2}, Lf1/g;->e(ILandroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    new-array p1, p0, [I

    .line 39
    .line 40
    invoke-static {p0}, Lf1/g;->d(I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static d(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static e(ILandroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, -0x1

    .line 6
    invoke-static {p1}, Lf1/g;->d(I)Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, v1, p1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public a(Lf1/h;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lf1/h;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lf1/g;->k:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lf1/g;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lf1/h;->b()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Lf1/g;->j(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lf1/h;->c()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Lf1/g;->p(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lf1/h;->d()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lf1/g;->h()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    new-instance v0, Landroid/text/SpannableString;

    .line 38
    .line 39
    invoke-virtual {p0}, Lf1/g;->h()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lcom/blankj/utilcode/util/p;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    throw p1

    .line 69
    :cond_1
    invoke-virtual {p0}, Lf1/g;->h()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final b(II)V
    .locals 4

    .line 1
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int v1, p2, p1

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    div-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-lt p1, p2, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lf1/g;->m:Landroid/graphics/Rect;

    .line 17
    .line 18
    add-int v3, v0, v1

    .line 19
    .line 20
    invoke-virtual {p1, v1, v2, v3, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lf1/g;->n:Landroid/graphics/Rect;

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    invoke-virtual {p1, v1, v2, v0, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object p2, p0, Lf1/g;->m:Landroid/graphics/Rect;

    .line 31
    .line 32
    add-int v3, v0, v1

    .line 33
    .line 34
    invoke-virtual {p2, v2, v1, p1, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lf1/g;->n:Landroid/graphics/Rect;

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    invoke-virtual {p2, v2, v1, p1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/g;->h:Lg1/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf1/g;->g:Lg1/e;

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lf1/g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lg1/e;->a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public g()Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/g;->g:Lg1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lf1/g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lg1/e;->a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/g;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget v0, p0, Lf1/g;->b:I

    .line 10
    .line 11
    iget v1, p0, Lf1/g;->c:I

    .line 12
    .line 13
    iget-object v2, p0, Lf1/g;->n:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lf1/g;->c(IILandroid/graphics/Rect;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lf1/g;->f:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public j(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lf1/g;->d:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lf1/g;->d:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public k(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf1/g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf1/g;->h()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l(Lg1/e;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lf1/g;->h:Lg1/e;

    .line 2
    .line 3
    iget-object v1, p0, Lf1/g;->g:Lg1/e;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    :cond_0
    iput-object v0, p0, Lf1/g;->h:Lg1/e;

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    sget-object p1, Lg1/e;->a:Lg1/e;

    .line 13
    .line 14
    :cond_1
    iput-object p1, p0, Lf1/g;->g:Lg1/e;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p1, Landroid/text/Spanned;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    move-object v0, p1

    .line 26
    check-cast v0, Landroid/text/Spanned;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const-class v2, Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v0, v1, p1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    :goto_0
    new-instance v0, Landroid/text/SpannableString;

    .line 41
    .line 42
    invoke-virtual {p0}, Lf1/g;->h()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    array-length v2, p1

    .line 52
    move v3, v1

    .line 53
    :goto_1
    if-ge v3, v2, :cond_3

    .line 54
    .line 55
    aget-object v4, p1, v3

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const/16 v6, 0x21

    .line 62
    .line 63
    invoke-virtual {v0, v4, v1, v5, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public m(Lg1/e;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lf1/g;->g:Lg1/e;

    .line 4
    .line 5
    :cond_0
    iput-object p1, p0, Lf1/g;->h:Lg1/e;

    .line 6
    .line 7
    invoke-virtual {p0}, Lf1/g;->f()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final n()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lf1/g;->j:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lf1/g;->i:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lf1/g;->k:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    iget-boolean v3, p0, Lf1/g;->i:Z

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-boolean v3, p0, Lf1/g;->k:Z

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    move v3, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, v1

    .line 29
    :goto_1
    invoke-super {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    iget v3, p0, Lf1/g;->l:I

    .line 33
    .line 34
    invoke-static {v3}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->J(I)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget v4, p0, Lf1/g;->l:I

    .line 39
    .line 40
    invoke-static {v4}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->K(I)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_3

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v4, v1

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    :goto_2
    move v4, v2

    .line 52
    :goto_3
    iget v5, p0, Lf1/g;->l:I

    .line 53
    .line 54
    invoke-static {v5}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->I(I)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    iget-boolean v6, p0, Lf1/g;->j:Z

    .line 59
    .line 60
    if-nez v6, :cond_4

    .line 61
    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    move v0, v2

    .line 65
    :cond_4
    iget-boolean v3, p0, Lf1/g;->i:Z

    .line 66
    .line 67
    if-nez v3, :cond_5

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    or-int/2addr v0, v6

    .line 72
    :cond_5
    iget-boolean v4, p0, Lf1/g;->k:Z

    .line 73
    .line 74
    if-eqz v4, :cond_7

    .line 75
    .line 76
    if-eqz v5, :cond_7

    .line 77
    .line 78
    if-eqz v6, :cond_6

    .line 79
    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    move v2, v1

    .line 84
    :goto_4
    or-int/2addr v0, v2

    .line 85
    :cond_7
    if-nez v6, :cond_8

    .line 86
    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const v3, -0x101009e

    .line 94
    .line 95
    .line 96
    filled-new-array {v3}, [I

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const v4, -0x777778

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3, v4}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    .line 109
    .line 110
    :cond_8
    if-eqz v0, :cond_9

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_9
    const/4 v1, 0x4

    .line 114
    :goto_5
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public o(I)V
    .locals 0

    .line 1
    iput p1, p0, Lf1/g;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lf1/g;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/g;->d:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lf1/g;->m:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lf1/g;->d:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lf1/g;->d:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lf1/g;->f:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    iget-object v1, p0, Lf1/g;->n:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    sub-int/2addr p4, p2

    .line 6
    sub-int/2addr p5, p3

    .line 7
    invoke-virtual {p0, p4, p5}, Lf1/g;->b(II)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lf1/g;->i()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public p(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lf1/g;->e:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lf1/g;->e:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Lf1/g;->i()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public q(IZZ)V
    .locals 0

    .line 1
    iput p1, p0, Lf1/g;->l:I

    .line 2
    .line 3
    iput-boolean p3, p0, Lf1/g;->j:Z

    .line 4
    .line 5
    iput-boolean p2, p0, Lf1/g;->i:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lf1/g;->n()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
