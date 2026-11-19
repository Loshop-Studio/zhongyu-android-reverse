.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field public b:I

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Z

.field public f:Z

.field public g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public o:I

.field public p:Landroid/graphics/Paint;

.field public q:Lj2/c;

.field public r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v1, 0x3

    .line 2
    new-array v1, v1, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 5
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 8
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 9
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x3

    .line 11
    new-array v1, v1, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 14
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 17
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 18
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x3

    .line 20
    new-array v0, v0, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 22
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 23
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ADAPTIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 24
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 26
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static a(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-lez p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    if-eq p2, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr v2, p2

    .line 32
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-le v2, p2, :cond_0

    .line 41
    .line 42
    move p2, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move p2, v1

    .line 45
    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-lez p2, :cond_3

    .line 52
    .line 53
    if-eqz p3, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    add-int/2addr p3, p2

    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    sub-int/2addr p3, p2

    .line 69
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    sub-int/2addr p2, v0

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-ge p3, p1, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v0, v1

    .line 86
    :goto_1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 87
    .line 88
    :cond_3
    return-void
.end method

.method public static d(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    if-eq v2, v3, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    if-eqz v2, :cond_2

    .line 17
    .line 18
    instance-of v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-lez p0, :cond_1

    .line 41
    .line 42
    return v1

    .line 43
    :cond_1
    return v0

    .line 44
    :cond_2
    return v2
.end method


# virtual methods
.method public final b(Landroid/view/ViewGroup;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Lj2/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lj2/b;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lj2/b;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;Z)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {v0, p1, p2, p2}, Lj2/b;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Lj2/c;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, p2}, Lj2/c;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Lj2/c;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Lj2/c;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lj2/c;->onScrollChanged()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MDRootLayout:[I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget p3, Lcom/xuexiang/xui/R$styleable;->MDRootLayout_md_reduce_padding_no_title_no_buttons:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 22
    .line 23
    .line 24
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_notitle_vertical_padding:I

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:I

    .line 31
    .line 32
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_button_frame_vertical_padding:I

    .line 33
    .line 34
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 39
    .line 40
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_button_padding_frame_side:I

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:I

    .line 47
    .line 48
    sget p2, Lcom/xuexiang/xui/R$attr;->md_button_height:I

    .line 49
    .line 50
    sget p3, Lcom/xuexiang/xui/R$dimen;->default_md_button_height_phone:I

    .line 51
    .line 52
    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    invoke-static {p1, p2, p3}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 61
    .line 62
    new-instance p2, Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:Landroid/graphics/Paint;

    .line 68
    .line 69
    sget p2, Lcom/xuexiang/xui/R$dimen;->md_divider_height:I

    .line 70
    .line 71
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:I

    .line 76
    .line 77
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:Landroid/graphics/Paint;

    .line 78
    .line 79
    sget p3, Lcom/xuexiang/xui/R$attr;->md_divider_color:I

    .line 80
    .line 81
    invoke-static {p1, p3, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final e(Landroid/view/View;Z)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_9

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Landroid/widget/ScrollView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    check-cast p1, Landroid/widget/ScrollView;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v2, v3

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int/2addr v2, v3

    .line 41
    if-ge v2, v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b(Landroid/view/ViewGroup;Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 48
    .line 49
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 50
    .line 51
    :cond_3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    instance-of v0, p1, Landroid/widget/AdapterView;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    if-eqz v0, :cond_c

    .line 58
    .line 59
    check-cast p1, Landroid/widget/AdapterView;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v3, -0x1

    .line 66
    if-ne v0, v3, :cond_5

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    move v0, v2

    .line 76
    goto :goto_1

    .line 77
    :cond_6
    move v0, v1

    .line 78
    :goto_1
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getCount()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    sub-int/2addr v4, v2

    .line 87
    if-ne v3, v4, :cond_7

    .line 88
    .line 89
    move v3, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_7
    move v3, v1

    .line 92
    :goto_2
    if-eqz v0, :cond_b

    .line 93
    .line 94
    if-eqz v3, :cond_b

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-lez v0, :cond_b

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-ge v0, v3, :cond_8

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sub-int/2addr v0, v2

    .line 122
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sub-int/2addr v2, v3

    .line 139
    if-le v0, v2, :cond_9

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    :goto_3
    if-eqz p2, :cond_a

    .line 143
    .line 144
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 145
    .line 146
    :cond_a
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 147
    .line 148
    return-void

    .line 149
    :cond_b
    :goto_4
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b(Landroid/view/ViewGroup;Z)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_c
    instance-of v0, p1, Landroid/webkit/WebView;

    .line 154
    .line 155
    if-eqz v0, :cond_d

    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    new-instance v1, Lj2/a;

    .line 162
    .line 163
    invoke-direct {v1, p0, p1, p2}, Lj2/a;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/View;Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_d
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    if-eqz v0, :cond_10

    .line 173
    .line 174
    move-object v0, p1

    .line 175
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-eqz v3, :cond_e

    .line 182
    .line 183
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_e

    .line 192
    .line 193
    move v1, v2

    .line 194
    :cond_e
    if-eqz p2, :cond_f

    .line 195
    .line 196
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 197
    .line 198
    :cond_f
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 199
    .line 200
    if-eqz v1, :cond_17

    .line 201
    .line 202
    check-cast p1, Landroid/view/ViewGroup;

    .line 203
    .line 204
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b(Landroid/view/ViewGroup;Z)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_10
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 209
    .line 210
    if-eqz v0, :cond_17

    .line 211
    .line 212
    check-cast p1, Landroid/view/ViewGroup;

    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const/4 v3, 0x0

    .line 219
    if-nez v0, :cond_12

    .line 220
    .line 221
    :cond_11
    move-object v4, v3

    .line 222
    goto :goto_6

    .line 223
    :cond_12
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    sub-int/2addr v0, v2

    .line 228
    :goto_5
    if-ltz v0, :cond_11

    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-nez v5, :cond_13

    .line 239
    .line 240
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-nez v5, :cond_13

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_13
    add-int/lit8 v0, v0, -0x1

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :goto_6
    invoke-virtual {p0, v4, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e(Landroid/view/View;Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-nez p2, :cond_14

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_14
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    sub-int/2addr p2, v2

    .line 265
    :goto_7
    if-ltz p2, :cond_16

    .line 266
    .line 267
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-nez v2, :cond_15

    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-ne v2, v5, :cond_15

    .line 286
    .line 287
    move-object v3, v0

    .line 288
    goto :goto_8

    .line 289
    :cond_15
    add-int/lit8 p2, p2, -0x1

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_16
    :goto_8
    if-eq v3, v4, :cond_17

    .line 293
    .line 294
    invoke-virtual {p0, v3, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e(Landroid/view/View;Z)V

    .line 295
    .line 296
    .line 297
    :cond_17
    :goto_9
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:I

    .line 17
    .line 18
    sub-int v1, v0, v1

    .line 19
    .line 20
    int-to-float v4, v1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v5, v1

    .line 26
    int-to-float v6, v0

    .line 27
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:Landroid/graphics/Paint;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v2, p1

    .line 31
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, p1

    .line 36
    :goto_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-float v10, p1

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v11, v0

    .line 52
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:I

    .line 53
    .line 54
    add-int/2addr p1, v0

    .line 55
    int-to-float v12, p1

    .line 56
    iget-object v13, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:Landroid/graphics/Paint;

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    move-object v8, v2

    .line 60
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final onFinishInflate()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sget v4, Lcom/xuexiang/xui/R$id;->md_titleFrame:I

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNeutral:I

    .line 32
    .line 33
    iget-object v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 38
    .line 39
    aput-object v2, v5, v0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNegative:I

    .line 47
    .line 48
    if-ne v3, v4, :cond_2

    .line 49
    .line 50
    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    aput-object v2, v5, v3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    sget v4, Lcom/xuexiang/xui/R$id;->md_buttonDefaultPositive:I

    .line 61
    .line 62
    if-ne v3, v4, :cond_3

    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 66
    .line 67
    aput-object v2, v5, v3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 16
    .line 17
    add-int/2addr p1, p3

    .line 18
    invoke-virtual {v0, p2, p3, p4, p1}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    move p3, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:I

    .line 28
    .line 29
    add-int/2addr p3, p1

    .line 30
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, p3

    .line 45
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/view/View;->layout(IIII)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 49
    .line 50
    const/4 p3, 0x1

    .line 51
    const/4 v0, 0x0

    .line 52
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 57
    .line 58
    sub-int/2addr p5, p1

    .line 59
    array-length p1, v1

    .line 60
    :goto_1
    if-ge v0, p1, :cond_10

    .line 61
    .line 62
    aget-object v2, v1, v0

    .line 63
    .line 64
    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int v3, p5, v3

    .line 75
    .line 76
    invoke-virtual {v2, p2, v3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    sub-int/2addr p5, v2

    .line 84
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 92
    .line 93
    sub-int/2addr p5, p1

    .line 94
    :cond_5
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 95
    .line 96
    sub-int p1, p5, p1

    .line 97
    .line 98
    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:I

    .line 99
    .line 100
    const/4 v3, 0x2

    .line 101
    aget-object v4, v1, v3

    .line 102
    .line 103
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    const/4 v5, -0x1

    .line 108
    if-eqz v4, :cond_7

    .line 109
    .line 110
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 111
    .line 112
    sget-object v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 113
    .line 114
    if-ne v4, v6, :cond_6

    .line 115
    .line 116
    add-int v4, p2, v2

    .line 117
    .line 118
    aget-object v6, v1, v3

    .line 119
    .line 120
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    add-int/2addr v6, v4

    .line 125
    move v7, v6

    .line 126
    move v6, v5

    .line 127
    goto :goto_2

    .line 128
    :cond_6
    sub-int v6, p4, v2

    .line 129
    .line 130
    aget-object v4, v1, v3

    .line 131
    .line 132
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    sub-int v4, v6, v4

    .line 137
    .line 138
    move v7, v6

    .line 139
    move v6, v4

    .line 140
    :goto_2
    aget-object v8, v1, v3

    .line 141
    .line 142
    invoke-virtual {v8, v4, p1, v7, p5}, Landroid/view/View;->layout(IIII)V

    .line 143
    .line 144
    .line 145
    aget-object v4, v1, v3

    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    add-int/2addr v2, v4

    .line 152
    goto :goto_3

    .line 153
    :cond_7
    move v6, v5

    .line 154
    :goto_3
    aget-object v4, v1, p3

    .line 155
    .line 156
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_a

    .line 161
    .line 162
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 163
    .line 164
    sget-object v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 165
    .line 166
    if-ne v4, v7, :cond_8

    .line 167
    .line 168
    add-int/2addr v2, p2

    .line 169
    aget-object v4, v1, p3

    .line 170
    .line 171
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    add-int/2addr v4, v2

    .line 176
    :goto_4
    move v7, v5

    .line 177
    goto :goto_5

    .line 178
    :cond_8
    sget-object v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 179
    .line 180
    if-ne v4, v7, :cond_9

    .line 181
    .line 182
    sub-int v4, p4, v2

    .line 183
    .line 184
    aget-object v2, v1, p3

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    sub-int v2, v4, v2

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_9
    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:I

    .line 194
    .line 195
    add-int/2addr v2, p2

    .line 196
    aget-object v4, v1, p3

    .line 197
    .line 198
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    add-int/2addr v4, v2

    .line 203
    move v7, v4

    .line 204
    :goto_5
    aget-object v8, v1, p3

    .line 205
    .line 206
    invoke-virtual {v8, v2, p1, v4, p5}, Landroid/view/View;->layout(IIII)V

    .line 207
    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_a
    move v7, v5

    .line 211
    :goto_6
    aget-object v2, v1, v0

    .line 212
    .line 213
    invoke-static {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_10

    .line 218
    .line 219
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 220
    .line 221
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 222
    .line 223
    if-ne v2, v4, :cond_b

    .line 224
    .line 225
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:I

    .line 226
    .line 227
    sub-int/2addr p4, p2

    .line 228
    aget-object p2, v1, v0

    .line 229
    .line 230
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    sub-int p2, p4, p2

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_b
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 238
    .line 239
    if-ne v2, v4, :cond_c

    .line 240
    .line 241
    iget p4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:I

    .line 242
    .line 243
    add-int/2addr p2, p4

    .line 244
    aget-object p4, v1, v0

    .line 245
    .line 246
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 247
    .line 248
    .line 249
    move-result p4

    .line 250
    add-int/2addr p4, p2

    .line 251
    goto :goto_9

    .line 252
    :cond_c
    if-ne v7, v5, :cond_d

    .line 253
    .line 254
    if-eq v6, v5, :cond_d

    .line 255
    .line 256
    aget-object p2, v1, v0

    .line 257
    .line 258
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    sub-int v7, v6, p2

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_d
    if-ne v6, v5, :cond_e

    .line 266
    .line 267
    if-eq v7, v5, :cond_e

    .line 268
    .line 269
    aget-object p2, v1, v0

    .line 270
    .line 271
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    :goto_7
    add-int v6, p2, v7

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_e
    if-ne v6, v5, :cond_f

    .line 279
    .line 280
    sub-int/2addr p4, p2

    .line 281
    div-int/2addr p4, v3

    .line 282
    aget-object p2, v1, v0

    .line 283
    .line 284
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 285
    .line 286
    .line 287
    move-result p2

    .line 288
    div-int/2addr p2, v3

    .line 289
    sub-int v7, p4, p2

    .line 290
    .line 291
    aget-object p2, v1, v0

    .line 292
    .line 293
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    goto :goto_7

    .line 298
    :cond_f
    :goto_8
    move p4, v6

    .line 299
    move p2, v7

    .line 300
    :goto_9
    aget-object v0, v1, v0

    .line 301
    .line 302
    invoke-virtual {v0, p2, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 303
    .line 304
    .line 305
    :cond_10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 306
    .line 307
    invoke-virtual {p0, p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e(Landroid/view/View;Z)V

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:I

    .line 10
    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 16
    .line 17
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 18
    .line 19
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->ALWAYS:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 20
    .line 21
    iget-object v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-ne v3, v4, :cond_1

    .line 25
    .line 26
    move v3, v2

    .line 27
    move v8, v6

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;->NEVER:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 30
    .line 31
    if-ne v3, v4, :cond_2

    .line 32
    .line 33
    move v3, v6

    .line 34
    move v8, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    array-length v3, v5

    .line 37
    move v4, v6

    .line 38
    move v7, v4

    .line 39
    move v8, v7

    .line 40
    :goto_0
    if-ge v4, v3, :cond_4

    .line 41
    .line 42
    aget-object v9, v5, v4

    .line 43
    .line 44
    if-eqz v9, :cond_3

    .line 45
    .line 46
    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_3

    .line 51
    .line 52
    invoke-virtual {v9, v6, v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    add-int/2addr v7, v8

    .line 63
    move v8, v2

    .line 64
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget v4, Lcom/xuexiang/xui/R$dimen;->md_neutral_button_margin:I

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    mul-int/lit8 v3, v3, 0x2

    .line 82
    .line 83
    sub-int v3, v0, v3

    .line 84
    .line 85
    if-le v7, v3, :cond_5

    .line 86
    .line 87
    move v3, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move v3, v6

    .line 90
    :goto_1
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 91
    .line 92
    if-eqz v3, :cond_7

    .line 93
    .line 94
    array-length v3, v5

    .line 95
    move v4, v6

    .line 96
    move v7, v4

    .line 97
    :goto_2
    if-ge v4, v3, :cond_8

    .line 98
    .line 99
    aget-object v9, v5, v4

    .line 100
    .line 101
    if-eqz v9, :cond_6

    .line 102
    .line 103
    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_6

    .line 108
    .line 109
    invoke-virtual {v9, v2, v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    add-int/2addr v7, v8

    .line 120
    move v8, v2

    .line 121
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_7
    move v7, v6

    .line 125
    :cond_8
    if-eqz v8, :cond_a

    .line 126
    .line 127
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Z

    .line 128
    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    sub-int p1, v1, v7

    .line 132
    .line 133
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 134
    .line 135
    mul-int/lit8 v3, p2, 0x2

    .line 136
    .line 137
    mul-int/lit8 p2, p2, 0x2

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_9
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    .line 141
    .line 142
    sub-int p1, v1, p1

    .line 143
    .line 144
    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 145
    .line 146
    mul-int/lit8 v3, p2, 0x2

    .line 147
    .line 148
    :goto_3
    move p2, v6

    .line 149
    goto :goto_4

    .line 150
    :cond_a
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    .line 151
    .line 152
    mul-int/lit8 v3, p1, 0x2

    .line 153
    .line 154
    move p1, v1

    .line 155
    goto :goto_3

    .line 156
    :goto_4
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 157
    .line 158
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    const/high16 v5, 0x40000000    # 2.0f

    .line 163
    .line 164
    if-eqz v4, :cond_b

    .line 165
    .line 166
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 167
    .line 168
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    invoke-virtual {v4, v7, v6}, Landroid/view/View;->measure(II)V

    .line 173
    .line 174
    .line 175
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 176
    .line 177
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    sub-int/2addr p1, v4

    .line 182
    goto :goto_5

    .line 183
    :cond_b
    iget v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:I

    .line 184
    .line 185
    add-int/2addr v3, v4

    .line 186
    :goto_5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 187
    .line 188
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_f

    .line 193
    .line 194
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 195
    .line 196
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    sub-int v7, p1, p2

    .line 201
    .line 202
    const/high16 v9, -0x80000000

    .line 203
    .line 204
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    invoke-virtual {v4, v5, v7}, Landroid/view/View;->measure(II)V

    .line 209
    .line 210
    .line 211
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 212
    .line 213
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    sub-int v5, p1, v3

    .line 218
    .line 219
    if-gt v4, v5, :cond_e

    .line 220
    .line 221
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    .line 222
    .line 223
    if-eqz v4, :cond_d

    .line 224
    .line 225
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:Landroid/view/View;

    .line 226
    .line 227
    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    if-nez v4, :cond_d

    .line 232
    .line 233
    if-eqz v8, :cond_c

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_c
    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 237
    .line 238
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 239
    .line 240
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    add-int/2addr v2, p2

    .line 245
    sub-int v6, p1, v2

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_d
    :goto_6
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 249
    .line 250
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    .line 251
    .line 252
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 253
    .line 254
    .line 255
    move-result p2

    .line 256
    add-int/2addr p2, v3

    .line 257
    sub-int v6, p1, p2

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_e
    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_f
    move v6, p1

    .line 264
    :goto_7
    sub-int/2addr v1, v6

    .line 265
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method public setButtonGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    .line 18
    sget-object p1, Lj2/d;->a:[I

    .line 19
    .line 20
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    aget p1, p1, v1

    .line 27
    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    sget-object p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 42
    .line 43
    :cond_2
    :goto_0
    return-void
.end method

.method public setButtonStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public setStackingBehavior(Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
