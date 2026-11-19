.class public Lcom/xuexiang/xui/widget/textview/ExpandableTextView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/ExpandableTextView$d;,
        Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;
    }
.end annotation


# instance fields
.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/ImageButton;

.field public e:Z

.field public f:Z

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:Landroid/graphics/drawable/Drawable;

.field public m:I

.field public n:F

.field public o:Z

.field public p:Landroid/util/SparseBooleanArray;

.field public q:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 6
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 9
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->n:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Landroid/view/View;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->h(Landroid/view/View;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->o:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)Lcom/xuexiang/xui/widget/textview/ExpandableTextView$d;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->j:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static h(Landroid/view/View;F)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    .line 12
    .line 13
    invoke-direct {v0, p1, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static j(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p1, p0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static k(Landroid/widget/TextView;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getLineCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineTop(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/2addr v1, p0

    .line 22
    add-int/2addr v0, v1

    .line 23
    return v0
.end method

.method public static n()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public static o()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public getText()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final i()V
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->expandable_text:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/xuexiang/xui/R$id;->expand_collapse:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/ImageButton;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d:Landroid/widget/ImageButton;

    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d:Landroid/widget/ImageButton;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final l(Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->m(Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->setOrientation(I)V

    .line 6
    .line 7
    .line 8
    const/16 p1, 0x8

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final m(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_maxCollapsedLines:I

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->i:I

    .line 20
    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_animDuration:I

    .line 22
    .line 23
    const/16 v1, 0x12c

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->m:I

    .line 30
    .line 31
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_animAlphaStart:I

    .line 32
    .line 33
    const v1, 0x3f333333    # 0.7f

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->n:F

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget v1, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_expandDrawable:I

    .line 47
    .line 48
    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget v1, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_collapseDrawable:I

    .line 59
    .line 60
    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k:Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    if-nez v0, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_more_black_12dp:I

    .line 75
    .line 76
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->j(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k:Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_less_black_12dp:I

    .line 91
    .line 92
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->j(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 11
    .line 12
    xor-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d:Landroid/widget/ImageButton;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->l:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->p:Landroid/util/SparseBooleanArray;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->q:I

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 37
    .line 38
    .line 39
    :cond_2
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->o:Z

    .line 41
    .line 42
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    new-instance v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->g:I

    .line 53
    .line 54
    invoke-direct {v0, p0, p0, v1, v2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/view/View;II)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget v3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->h:I

    .line 69
    .line 70
    add-int/2addr v2, v3

    .line 71
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    sub-int/2addr v2, v3

    .line 78
    invoke-direct {v0, p0, p0, v1, v2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$c;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/view/View;II)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->i()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->o:Z

    .line 2
    .line 3
    return p1
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->e:Z

    .line 16
    .line 17
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d:Landroid/widget/ImageButton;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 23
    .line 24
    const v2, 0x7fffffff

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 28
    .line 29
    .line 30
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/widget/TextView;->getLineCount()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->i:I

    .line 40
    .line 41
    if-gt v1, v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->k(Landroid/widget/TextView;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->h:I

    .line 51
    .line 52
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 57
    .line 58
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->i:I

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d:Landroid/widget/ImageButton;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 69
    .line 70
    .line 71
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->f:Z

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 76
    .line 77
    new-instance p2, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$b;

    .line 78
    .line 79
    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$b;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->g:I

    .line 90
    .line 91
    :cond_3
    :goto_0
    return-void

    .line 92
    :cond_4
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public setOnExpandStateChangeListener(Lcom/xuexiang/xui/widget/textview/ExpandableTextView$d;)V
    .locals 0
    .param p1    # Lcom/xuexiang/xui/widget/textview/ExpandableTextView$d;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v0, "ExpandableTextView only supports Vertical Orientation."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
