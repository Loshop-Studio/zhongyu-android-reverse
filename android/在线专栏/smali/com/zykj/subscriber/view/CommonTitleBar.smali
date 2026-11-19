.class public Lcom/zykj/subscriber/view/CommonTitleBar;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/view/CommonTitleBar$a;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Z

.field private a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

.field private b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/view/View;

.field private g:Z

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:Landroid/graphics/drawable/Drawable;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040019

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/subscriber/view/CommonTitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/subscriber/view/CommonTitleBar;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1}, Lcom/zykj/subscriber/view/CommonTitleBar;->b(Landroid/content/Context;)V

    return-void
.end method

.method private static a(Landroid/content/res/Resources;Ljava/lang/String;)I
    .locals 2

    const-string v0, "dimen"

    const-string v1, "android"

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    .line 2
    iget-boolean v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->g:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/zykj/subscriber/view/CommonTitleBar;->getStatusBarHeight()I

    move-result v0

    iput v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/subscriber/view/CommonTitleBar;->d(Landroid/content/Context;)V

    return-void
.end method

.method private c(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    sget-object v0, Lc2/v;->N:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const p3, 0x7f04071d

    .line 2
    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p3

    const/4 v0, 0x3

    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->i:I

    const p3, 0x7f04071f

    .line 3
    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveBoolean(Landroid/content/Context;I)Z

    move-result p3

    const/4 v0, 0x7

    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->g:Z

    const p3, 0x7f040719

    .line 4
    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->k:I

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f0705b8

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    iput p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->l:I

    const/4 p3, 0x4

    .line 6
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->m:I

    const p3, 0x7f04071a

    .line 7
    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    const/16 v2, 0xc

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->n:I

    const v0, 0x7f040723

    .line 8
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    const/16 v2, 0x12

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->o:I

    const v0, 0x7f040721

    .line 9
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    const/16 v2, 0xf

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->p:I

    .line 10
    invoke-static {p1, p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    const/4 p3, 0x2

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->q:I

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    const p3, 0x7f040722

    const/4 v0, -0x1

    invoke-static {p1, p3, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p1

    const/16 v2, 0xa

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->r:I

    .line 12
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p1

    const/16 v2, 0x11

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->s:I

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p1

    const/16 v2, 0xe

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->t:I

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p1

    const/4 p3, 0x1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->u:I

    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v0, 0x8

    invoke-static {p1, p2, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->v:Landroid/graphics/drawable/Drawable;

    const/16 p1, 0x9

    .line 16
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->w:Ljava/lang/String;

    const/16 p1, 0x10

    .line 17
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->x:Ljava/lang/String;

    const/16 p1, 0xd

    .line 18
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->y:Ljava/lang/String;

    const/4 p1, 0x5

    .line 19
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->z:I

    const/high16 p1, 0x3f000000    # 0.5f

    .line 20
    invoke-static {p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p1

    const/4 v0, 0x6

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->A:I

    const/16 p1, 0x13

    .line 21
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->B:Z

    .line 22
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    .line 3
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    .line 4
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    .line 5
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 6
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->n:I

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 7
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->r:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f07024c

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 10
    iget-object v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, v4, v4, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 11
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->v:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 12
    iget-object v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v5, v5}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 14
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 15
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->l:I

    invoke-virtual {v1, v3, v4, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 16
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 17
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    .line 18
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    .line 19
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->y:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_1

    .line 20
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    iget v5, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->o:I

    int-to-float v5, v5

    invoke-virtual {v1, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 22
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    iget v5, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->s:I

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->x:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 25
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 26
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 27
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    iget v5, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->p:I

    int-to-float v5, v5

    invoke-virtual {v1, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 28
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    iget v5, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->t:I

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->y:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 31
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v5, v6}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v5

    invoke-virtual {v1, v4, v5, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 32
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 33
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 34
    iget v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->m:I

    if-ne v1, v3, :cond_2

    const v1, 0x800013

    .line 35
    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/view/CommonTitleBar;->g(I)Lcom/zykj/subscriber/view/CommonTitleBar;

    goto :goto_0

    :cond_2
    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    const v1, 0x800015

    .line 36
    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/view/CommonTitleBar;->g(I)Lcom/zykj/subscriber/view/CommonTitleBar;

    goto :goto_0

    :cond_3
    const/16 v1, 0x11

    .line 37
    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/view/CommonTitleBar;->g(I)Lcom/zykj/subscriber/view/CommonTitleBar;

    .line 38
    :goto_0
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 39
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 40
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->l:I

    invoke-virtual {v1, v3, v4, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 41
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->z:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 42
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 44
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->A:I

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    iget-boolean v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->B:Z

    if-eqz v0, :cond_5

    .line 47
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f04071b

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 48
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_4
    const v0, 0x7f04071c

    .line 49
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method private e()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private f(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 2
    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    iget v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iget v4, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    add-int/2addr v3, v4

    .line 4
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 5
    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    iget v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p1

    .line 8
    invoke-virtual {p2, p3, v0, v1, p1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 9
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    iget v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    .line 10
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr v1, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    .line 11
    invoke-virtual {p2, p1, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    iget v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p1

    .line 15
    invoke-virtual {p2, p3, v0, v1, p1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    iget v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    .line 17
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr v1, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    .line 18
    invoke-virtual {p2, p1, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    :goto_0
    return-void
.end method

.method public static getStatusBarHeight()I
    .locals 2

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    invoke-static {v0, v1}, Lcom/zykj/subscriber/view/CommonTitleBar;->a(Landroid/content/res/Resources;Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public g(I)Lcom/zykj/subscriber/view/CommonTitleBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-object p0
.end method

.method public getActionCount()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getCenterText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method public getDividerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    return-object v0
.end method

.method public getLeftText()Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    return-object v0
.end method

.method public getSubTitleText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method public h(Landroid/view/View$OnClickListener;)Lcom/zykj/subscriber/view/CommonTitleBar;
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/zykj/subscriber/view/CommonTitleBar$a;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/zykj/subscriber/view/CommonTitleBar$a;

    .line 4
    invoke-interface {v0, p1}, Lcom/zykj/subscriber/view/CommonTitleBar$a;->performAction(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/subscriber/view/CommonTitleBar;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    iget-object p2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/subscriber/view/CommonTitleBar;->f(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object p2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object p3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/subscriber/view/CommonTitleBar;->f(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    iget-object p4, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    sub-int/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p5

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->i:I

    iget v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    add-int/2addr v0, p2

    .line 3
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->j:I

    add-int/2addr v0, v2

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 6
    iget-object v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 7
    iget-object v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v3

    if-le v2, v3, :cond_1

    .line 8
    iget-object v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    iget-object v4, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    .line 9
    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 10
    invoke-virtual {v2, v1, p2}, Landroid/widget/LinearLayout;->measure(II)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->b:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget v3, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->h:I

    iget-object v4, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->c:Landroid/widget/LinearLayout;

    .line 12
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 13
    invoke-virtual {v2, v1, p2}, Landroid/widget/LinearLayout;->measure(II)V

    .line 14
    :goto_1
    iget-object v1, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->f:Landroid/view/View;

    invoke-virtual {p0, v1, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->a:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/zykj/subscriber/view/CommonTitleBar;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    return-void
.end method
