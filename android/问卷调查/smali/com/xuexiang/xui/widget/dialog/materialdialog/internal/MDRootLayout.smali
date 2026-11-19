.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;
.super Landroid/view/ViewGroup;
.source ""


# static fields
.field public static final synthetic u:I


# instance fields
.field public final b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

.field public c:I

.field public d:Landroid/view/View;

.field public e:Landroid/view/View;

.field public f:Z

.field public g:Z

.field public h:Lb/c/a/e/d/a/b;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:Lb/c/a/e/d/a/a;

.field public p:I

.field public q:Landroid/graphics/Paint;

.field public r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field public s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field public t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Z

    sget-object v1, Lb/c/a/e/d/a/b;->c:Lb/c/a/e/d/a/b;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Lb/c/a/e/d/a/b;

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    sget-object v2, Lb/c/a/e/d/a/a;->b:Lb/c/a/e/d/a/a;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget-object v3, Lb/c/a/b;->e:[I

    invoke-virtual {p1, p2, v3, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    const p2, 0x7f07013d

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    const p2, 0x7f07012c

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    const p2, 0x7f070130

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    const p2, 0x7f070079

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    const v1, 0x7f040359

    invoke-static {p1, v1, p2}, Lb/c/a/a;->C(Landroid/content/Context;II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:I

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    const p2, 0x7f070135

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t:I

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    const v1, 0x7f040366

    .line 2
    invoke-static {p1, v1, v0}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result p1

    .line 3
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    return-void
.end method

.method public static a(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZZ)V
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    const/16 v2, 0x8

    if-eq p2, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    if-le v2, p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    :cond_1
    if-eqz p3, :cond_3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_3

    if-eqz p4, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p3, p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    if-ge p3, p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Z

    :cond_3
    return-void
.end method

.method public static c(Landroid/view/View;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_2

    instance-of v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    if-eqz v3, :cond_2

    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    move v2, v0

    :cond_2
    return v2
.end method


# virtual methods
.method public final b(Landroid/view/ViewGroup;ZZ)V
    .locals 1

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v0, :cond_4

    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$b;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$p;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$b;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$c;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    if-nez p3, :cond_3

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->r:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    goto :goto_0

    :cond_3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->s:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$c;->onScrollChanged()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final d(Landroid/view/View;ZZ)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Landroid/widget/ScrollView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    check-cast p1, Landroid/widget/ScrollView;

    .line 1
    invoke-virtual {p1}, Landroid/widget/ScrollView;->getChildCount()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v2}, Landroid/widget/ScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/ScrollView;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {p1}, Landroid/widget/ScrollView;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/widget/ScrollView;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    if-ge v3, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v2

    :goto_1
    if-eqz v1, :cond_3

    .line 2
    :goto_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b(Landroid/view/ViewGroup;ZZ)V

    goto/16 :goto_e

    :cond_3
    if-eqz p2, :cond_4

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    :cond_4
    if-eqz p3, :cond_1a

    :goto_3
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Z

    goto/16 :goto_e

    :cond_5
    instance-of v0, p1, Landroid/widget/AdapterView;

    const/4 v3, -0x1

    if-eqz v0, :cond_e

    check-cast p1, Landroid/widget/AdapterView;

    .line 3
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v0

    if-ne v0, v3, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_4

    :cond_7
    move v0, v2

    :goto_4
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v3

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getCount()I

    move-result v4

    sub-int/2addr v4, v1

    if-ne v3, v4, :cond_8

    move v3, v1

    goto :goto_5

    :cond_8
    move v3, v2

    :goto_5
    if-eqz v0, :cond_b

    if-eqz v3, :cond_b

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_b

    invoke-virtual {p1, v2}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getPaddingTop()I

    move-result v3

    if-ge v0, v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getChildCount()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getHeight()I

    move-result v3

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v0, v3, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    move v1, v2

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    goto :goto_2

    :cond_c
    if-eqz p2, :cond_d

    .line 4
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    :cond_d
    if-eqz p3, :cond_1a

    goto :goto_3

    :cond_e
    instance-of v0, p1, Landroid/webkit/WebView;

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout$a;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/View;ZZ)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto/16 :goto_e

    :cond_f
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$l;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->f()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_8

    :cond_10
    move v1, v2

    :goto_8
    if-eqz p2, :cond_11

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    :cond_11
    if-eqz p3, :cond_12

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Z

    :cond_12
    if-eqz v1, :cond_1a

    check-cast p1, Landroid/view/ViewGroup;

    goto/16 :goto_2

    :cond_13
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1a

    check-cast p1, Landroid/view/ViewGroup;

    .line 7
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_14

    goto :goto_a

    :cond_14
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/2addr v0, v3

    :goto_9
    if-ltz v0, :cond_16

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_15

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v6

    if-nez v6, :cond_15

    goto :goto_b

    :cond_15
    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    :cond_16
    :goto_a
    move-object v5, v4

    .line 8
    :goto_b
    invoke-virtual {p0, v5, p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;ZZ)V

    .line 9
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-nez p2, :cond_17

    goto :goto_d

    :cond_17
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    add-int/2addr p2, v3

    :goto_c
    if-ltz p2, :cond_19

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v3

    if-ne v0, v3, :cond_18

    move-object v4, p3

    goto :goto_d

    :cond_18
    add-int/lit8 p2, p2, -0x1

    goto :goto_c

    :cond_19
    :goto_d
    if-eq v4, v5, :cond_1a

    .line 10
    invoke-virtual {p0, v4, v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;ZZ)V

    :cond_1a
    :goto_e
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->f:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    const/4 v2, 0x0

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t:I

    sub-int v1, v0, v1

    int-to-float v3, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    int-to-float v4, v1

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    const/4 v2, 0x0

    int-to-float v3, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    int-to-float v4, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t:I

    add-int/2addr v0, v1

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public onFinishInflate()V
    .locals 5

    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    const v4, 0x7f09014c

    if-ne v3, v4, :cond_0

    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    const v4, 0x7f09013e

    if-ne v3, v4, :cond_1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aput-object v2, v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    const v4, 0x7f09013d

    if-ne v3, v4, :cond_2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v4, 0x1

    aput-object v2, v3, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    const v4, 0x7f09013f

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v4, 0x2

    check-cast v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aput-object v2, v3, v4

    goto :goto_1

    :cond_3
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 10

    sget-object p1, Lb/c/a/e/d/a/a;->b:Lb/c/a/e/d/a/a;

    sget-object v0, Lb/c/a/e/d/a/a;->d:Lb/c/a/e/d/a/a;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    add-int/2addr v1, p3

    invoke-virtual {v2, p2, p3, p4, v1}, Landroid/view/View;->layout(IIII)V

    move p3, v1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    add-int/2addr p3, v1

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {v1, p2, p3, p4, v2}, Landroid/view/View;->layout(IIII)V

    :cond_2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p3, :cond_4

    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    sub-int/2addr p5, p1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length p3, p1

    :goto_1
    if-ge v2, p3, :cond_10

    aget-object v0, p1, v2

    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v3

    sub-int v3, p5, v3

    invoke-virtual {v0, p2, v3, p4, p5}, Landroid/widget/TextView;->layout(IIII)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    sub-int/2addr p5, v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    if-eqz p3, :cond_5

    iget p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    sub-int/2addr p5, p3

    :cond_5
    iget p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:I

    sub-int p3, p5, p3

    iget v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v4

    const/4 v6, -0x1

    if-eqz v4, :cond_7

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    if-ne v4, v0, :cond_6

    add-int v4, p2, v3

    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v7, v7, v5

    invoke-virtual {v7}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v4

    move v8, v7

    move v7, v6

    goto :goto_2

    :cond_6
    sub-int v7, p4, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v4, v4, v5

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    sub-int v4, v7, v4

    move v8, v7

    move v7, v4

    :goto_2
    iget-object v9, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v9, v9, v5

    invoke-virtual {v9, v4, p3, v8, p5}, Landroid/widget/TextView;->layout(IIII)V

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v4, v4, v5

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_3

    :cond_7
    move v7, v6

    :goto_3
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v4, v4, v1

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    if-ne v4, v0, :cond_8

    add-int/2addr v3, p2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v4, v4, v1

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v3

    :goto_4
    move v8, v6

    goto :goto_5

    :cond_8
    if-ne v4, p1, :cond_9

    sub-int v4, p4, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v3

    sub-int v3, v4, v3

    goto :goto_4

    :cond_9
    iget v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    add-int/2addr v3, p2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v4, v4, v1

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v3

    move v8, v4

    :goto_5
    iget-object v9, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v9, v9, v1

    invoke-virtual {v9, v3, p3, v4, p5}, Landroid/widget/TextView;->layout(IIII)V

    goto :goto_6

    :cond_a
    move v8, v6

    :goto_6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object v3, v3, v2

    invoke-static {v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    if-ne v3, v0, :cond_b

    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    sub-int/2addr p4, p1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p1, p1, v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    sub-int p1, p4, p1

    goto :goto_9

    :cond_b
    if-ne v3, p1, :cond_c

    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->p:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v2

    invoke-virtual {p2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p2

    add-int p4, p2, p1

    goto :goto_9

    :cond_c
    if-ne v8, v6, :cond_d

    if-eq v7, v6, :cond_d

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p1, p1, v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    sub-int v8, v7, p1

    goto :goto_8

    :cond_d
    if-ne v7, v6, :cond_e

    if-eq v8, v6, :cond_e

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p1, p1, v2

    goto :goto_7

    :cond_e
    if-ne v7, v6, :cond_f

    sub-int/2addr p4, p2

    div-int/2addr p4, v5

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p1, p1, v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    div-int/2addr p1, v5

    sub-int v8, p4, p1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p1, p1, v2

    :goto_7
    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    add-int v7, p1, v8

    :cond_f
    :goto_8
    move p4, v7

    move p1, v8

    :goto_9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    aget-object p2, p2, v2

    invoke-virtual {p2, p1, p3, p4, p5}, Landroid/widget/TextView;->layout(IIII)V

    :cond_10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-virtual {p0, p1, v1, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d(Landroid/view/View;ZZ)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 11

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:I

    if-le v1, v2, :cond_0

    move v1, v2

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Lb/c/a/e/d/a/b;

    sget-object v4, Lb/c/a/e/d/a/b;->b:Lb/c/a/e/d/a/b;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    move v3, v2

    move v8, v5

    goto :goto_1

    :cond_1
    sget-object v4, Lb/c/a/e/d/a/b;->d:Lb/c/a/e/d/a/b;

    if-ne v3, v4, :cond_2

    move v3, v5

    move v8, v3

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v4, v3

    move v6, v5

    move v7, v6

    move v8, v7

    :goto_0
    if-ge v6, v4, :cond_4

    aget-object v9, v3, v6

    if-eqz v9, :cond_3

    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v9, v5, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v9}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v7, v8

    move v8, v2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07013c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    sub-int v3, v0, v3

    if-le v7, v3, :cond_5

    move v3, v2

    goto :goto_1

    :cond_5
    move v3, v5

    :goto_1
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v4, v3

    move v6, v5

    move v7, v6

    :goto_2
    if-ge v6, v4, :cond_8

    aget-object v9, v3, v6

    if-eqz v9, :cond_6

    invoke-static {v9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v9, v2, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->a(ZZ)V

    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v9}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v7, v8

    move v8, v2

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_7
    move v7, v5

    :cond_8
    if-eqz v8, :cond_a

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->i:Z

    if-eqz p1, :cond_9

    sub-int p1, v1, v7

    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    mul-int/lit8 v3, p2, 0x2

    add-int/2addr v3, v5

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, v5

    goto :goto_4

    :cond_9
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->n:I

    sub-int p1, v1, p1

    iget p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 v3, p2, 0x0

    goto :goto_3

    :cond_a
    iget p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->m:I

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 v3, p1, 0x0

    move p1, v1

    :goto_3
    move p2, v5

    :goto_4
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    if-eqz v4, :cond_b

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-virtual {v4, v7, v5}, Landroid/view/View;->measure(II)V

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int/2addr p1, v4

    goto :goto_5

    :cond_b
    iget v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->l:I

    add-int/2addr v3, v4

    :goto_5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_f

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    sub-int v7, p1, p2

    const/high16 v9, -0x80000000

    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-virtual {v4, v6, v7}, Landroid/view/View;->measure(II)V

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int v6, p1, v3

    if-gt v4, v6, :cond_e

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->k:Z

    if-eqz v4, :cond_d

    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->d:Landroid/view/View;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_d

    if-eqz v8, :cond_c

    goto :goto_6

    :cond_c
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, p2

    sub-int v5, p1, v2

    goto :goto_7

    :cond_d
    :goto_6
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->e:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, v3

    sub-int v5, p1, p2

    goto :goto_7

    :cond_e
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->j:Z

    goto :goto_7

    :cond_f
    move v5, p1

    :goto_7
    sub-int/2addr v1, v5

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setButtonGravity(Lb/c/a/e/d/a/a;)V
    .locals 1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lb/c/a/e/d/a/a;->b:Lb/c/a/e/d/a/a;

    goto :goto_0

    :cond_1
    sget-object p1, Lb/c/a/e/d/a/a;->d:Lb/c/a/e/d/a/a;

    :goto_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->o:Lb/c/a/e/d/a/a;

    :cond_2
    :goto_1
    return-void
.end method

.method public setButtonStackedGravity(Lb/c/a/e/d/a/a;)V
    .locals 4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->b:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedGravity(Lb/c/a/e/d/a/a;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->c:I

    return-void
.end method

.method public setStackingBehavior(Lb/c/a/e/d/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->h:Lb/c/a/e/d/a/b;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method
