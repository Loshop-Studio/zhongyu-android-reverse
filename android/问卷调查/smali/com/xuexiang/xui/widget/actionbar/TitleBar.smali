.class public Lcom/xuexiang/xui/widget/actionbar/TitleBar;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;
    }
.end annotation


# instance fields
.field public b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

.field public c:Lb/c/a/e/a/b;

.field public d:Landroid/widget/LinearLayout;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/view/View;

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    const v0, 0x7f040019

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    sget-object v1, Lb/c/a/b;->i:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const v0, 0x7f040705

    const/4 v1, -0x1

    .line 3
    invoke-static {p1, v0, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v0

    const/4 v3, 0x3

    .line 4
    invoke-virtual {p2, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->j:I

    const/4 v0, 0x7

    const v3, 0x7f040707

    .line 5
    invoke-static {p1, v3, v2}, Lb/c/a/a;->z(Landroid/content/Context;IZ)Z

    move-result v3

    .line 6
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->h:Z

    const v0, 0x7f040701

    .line 7
    invoke-static {p1, v0, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v0

    .line 8
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    const/16 v0, 0xb

    const v3, 0x7f040708

    .line 9
    invoke-static {p1, v3, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v3

    .line 10
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l:I

    const/4 v0, 0x4

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->m:I

    const/16 v0, 0xc

    const v3, 0x7f040702

    .line 11
    invoke-static {p1, v3, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v4

    .line 12
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n:I

    const/16 v0, 0x12

    const v4, 0x7f04070b

    .line 13
    invoke-static {p1, v4, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v4

    .line 14
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->o:I

    const/16 v0, 0xf

    const v4, 0x7f040709

    .line 15
    invoke-static {p1, v4, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v4

    .line 16
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p:I

    .line 17
    invoke-static {p1, v3, v1}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result v0

    const/4 v3, 0x2

    .line 18
    invoke-virtual {p2, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    const/16 v0, 0xa

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f04070a

    invoke-static {v4, v5, v1}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result v4

    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->q:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5, v1}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result v0

    const/16 v4, 0x11

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r:I

    const/16 v0, 0xe

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v5, v1}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result v6

    invoke-virtual {p2, v0, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5, v1}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result v0

    const/4 v5, 0x1

    invoke-virtual {p2, v5, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    const/16 v0, 0x8

    .line 19
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t:Landroid/graphics/drawable/Drawable;

    const/16 v0, 0x9

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->u:Ljava/lang/String;

    const/16 v0, 0x10

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->v:Ljava/lang/String;

    const/16 v6, 0xd

    invoke-virtual {p2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->w:Ljava/lang/String;

    const/4 v6, 0x5

    invoke-virtual {p2, v6, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    iput v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->x:I

    const/4 v6, 0x6

    const/high16 v7, 0x3f800000    # 1.0f

    .line 21
    invoke-static {}, Lb/c/a/a;->p()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v8, v7

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v8, v7

    float-to-int v7, v8

    .line 22
    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->y:I

    const/16 v6, 0x13

    invoke-virtual {p2, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->z:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->h:Z

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->getStatusBarHeight()I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    .line 24
    :cond_0
    new-instance p2, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-direct {p2, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    new-instance p2, Lb/c/a/e/a/b;

    invoke-direct {p2, p1}, Lb/c/a/e/a/b;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    new-instance p2, Landroid/widget/LinearLayout;

    invoke-direct {p2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    new-instance p2, Landroid/view/View;

    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {p2, v6, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v7, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n:I

    int-to-float v7, v7

    invoke-virtual {v6, v2, v7}, La/b/h/w;->setTextSize(IF)V

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v7, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->q:I

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->u:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_1

    iget-object v7, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/4 v8, 0x0

    invoke-virtual {v7, v6, v8, v8, v8}, La/b/h/w;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_1
    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->setSingleLine()V

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l:I

    invoke-virtual {v0, v6, v2, v6, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-static {}, Lb/c/a/a;->n()Landroid/graphics/Typeface;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v0, Lcom/xuexiang/xui/widget/textview/AutoMoveTextView;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/textview/AutoMoveTextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->w:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    iget v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->o:I

    int-to-float v6, v6

    invoke-virtual {v0, v2, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    iget v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r:I

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->v:Ljava/lang/String;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    sget-object v6, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    invoke-static {}, Lb/c/a/a;->n()Landroid/graphics/Typeface;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    iget v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p:I

    int-to-float v6, v6

    invoke-virtual {v0, v2, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    iget v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s:I

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->w:Ljava/lang/String;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v6, v7}, Lb/c/a/a;->h(Landroid/content/Context;F)I

    move-result v6

    invoke-virtual {v0, v2, v6, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    sget-object v6, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    invoke-static {}, Lb/c/a/a;->n()Landroid/graphics/Typeface;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->m:I

    if-ne v0, v5, :cond_3

    const v4, 0x800013

    goto :goto_0

    :cond_3
    if-ne v0, v3, :cond_4

    const v4, 0x800015

    :cond_4
    :goto_0
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l:I

    invoke-virtual {v0, v3, v2, v3, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->x:I

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->y:I

    invoke-direct {v0, v1, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->z:Z

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f040703

    .line 25
    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    new-array v1, v5, [I

    aput v0, v1, v2

    invoke-virtual {p2, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_5

    .line 26
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_5
    const p2, 0x7f040704

    .line 27
    invoke-static {p1, p2, v2}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result p1

    .line 28
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 29
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    :cond_6
    :goto_1
    return-void
.end method

.method public static getStatusBarHeight()I
    .locals 4

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    .line 1
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 5

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    add-int/2addr v3, v4

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    if-le v0, v1, :cond_2

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {p2, p3, v0, v1, p1}, Landroid/view/View;->layout(IIII)V

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr v1, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    invoke-virtual {p2, p1, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    :goto_2
    return-void
.end method

.method public b(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-object p0
.end method

.method public getActionCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getCenterText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method public getDividerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    return-object v0
.end method

.method public getLeftText()Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    return-object v0
.end method

.method public getSubTitleText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move p2, p3

    :goto_0
    if-eqz p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    iget-object p4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    iget-object p4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    :goto_1
    invoke-virtual {p0, p1, p2, p4}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p2

    iget-object p4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    sub-int/2addr p2, p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p5

    invoke-virtual {p1, p3, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    iget p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->j:I

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    add-int/2addr v0, p2

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->k:I

    add-int/2addr v0, v2

    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v3

    if-le v2, v3, :cond_1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->c:Lb/c/a/e/a/b;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->i:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    :goto_1
    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v2, v1, p2}, Landroid/widget/LinearLayout;->measure(II)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->g:Landroid/view/View;

    invoke-virtual {p0, v1, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    return-void
.end method
