.class public Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;,
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$j;,
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;,
        Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;
    }
.end annotation


# static fields
.field public static r:I = 0xa

.field public static s:I = 0xb


# instance fields
.field public c:Landroid/content/Context;

.field public d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

.field public e:I

.field public f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

.field public g:I

.field public h:I

.field public i:I

.field public j:F

.field public k:I

.field public l:I

.field public m:Landroidx/viewpager/widget/ViewPager;

.field public n:Landroidx/viewpager/widget/PagerAdapter;

.field public o:Ljava/util/List;

.field public p:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;

.field public q:Landroid/database/DataSetObserver;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:Landroid/content/Context;

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Ljava/util/List;

    .line 6
    sget-object p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_color:I

    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_width:I

    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:I

    .line 9
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_corners:I

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:F

    .line 10
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_indicator_gravity:I

    const/4 v0, 0x3

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    if-ne p1, v0, :cond_0

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    goto :goto_0

    :cond_1
    const/16 v0, 0x77

    if-ne p1, v0, :cond_2

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 14
    :cond_2
    :goto_0
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_margin:I

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 15
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_mode:I

    sget p3, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r:I

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:I

    .line 16
    sget p1, Lcom/xuexiang/xui/R$styleable;->VerticalTabLayout_vtl_tab_height:I

    const/high16 p3, -0x40000000    # -2.0f

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:I

    .line 17
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->x(IZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->w(IZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->s()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic j(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic k(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public getSelectedTabPosition()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getTabAdapter()Ll9/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public l(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public m(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$b;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "tabView can\'t be null"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final n(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, -0x2

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 12
    .line 13
    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-interface {p1, v0}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 44
    .line 45
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$a;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$a;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public o(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, -0x1

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :cond_0
    return p1
.end method

.method public onFinishInflate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->q()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public p(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 8
    .line 9
    return-object p1
.end method

.method public final q()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 9
    .line 10
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final r(Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:I

    .line 2
    .line 3
    sget v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iput v2, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 13
    .line 14
    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    sget v1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->s:I

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:I

    .line 27
    .line 28
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 32
    .line 33
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 34
    .line 35
    invoke-virtual {p1, v2, v0, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final s()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Landroidx/viewpager/widget/PagerAdapter;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Landroidx/viewpager/widget/PagerAdapter;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "tab"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :goto_1
    new-instance v3, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 46
    .line 47
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:Landroid/content/Context;

    .line 48
    .line 49
    invoke-direct {v3, v4}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Lcom/xuexiang/xui/widget/tabbar/vertical/c$a;

    .line 53
    .line 54
    invoke-direct {v4}, Lcom/xuexiang/xui/widget/tabbar/vertical/c$a;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/c$a;->f(Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/vertical/c$a;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/c$a;->e()Lcom/xuexiang/xui/widget/tabbar/vertical/c;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v3, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->j(Lcom/xuexiang/xui/widget/tabbar/vertical/c;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Landroidx/viewpager/widget/ViewPager;

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    if-lez v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eq v0, v1, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getTabCount()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ge v0, v1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelected(I)V

    .line 98
    .line 99
    .line 100
    :cond_2
    return-void

    .line 101
    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->t()V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->e:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setIndicatorCorners(I)V
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->j:F

    .line 3
    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setIndicatorGravity(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x77

    .line 8
    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "only support Gravity.LEFT, Gravity.RIGHT, Gravity.FILL"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->i:I

    .line 21
    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->l()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setIndicatorWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->l()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTabAdapter(Ll9/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->t()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ll9/b;->getCount()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, Ll9/b;->c(I)Lcom/xuexiang/xui/widget/tabbar/vertical/b;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->i(Lcom/xuexiang/xui/widget/tabbar/vertical/b;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v0}, Ll9/b;->b(I)Lcom/xuexiang/xui/widget/tabbar/vertical/c;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->j(Lcom/xuexiang/xui/widget/tabbar/vertical/c;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {p1, v0}, Ll9/b;->d(I)Lcom/xuexiang/xui/widget/tabbar/vertical/a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->g(Lcom/xuexiang/xui/widget/tabbar/vertical/a;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p1, v0}, Ll9/b;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f(I)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void
.end method

.method public setTabHeight(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:I

    .line 7
    .line 8
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:I

    .line 9
    .line 10
    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r:I

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ge p1, v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    .line 36
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l:I

    .line 37
    .line 38
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 52
    .line 53
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$f;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$f;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public setTabMargin(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 7
    .line 8
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:I

    .line 9
    .line 10
    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r:I

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    move v0, p1

    .line 17
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ge v0, v1, :cond_3

    .line 24
    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    move v3, p1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 42
    .line 43
    :goto_2
    invoke-virtual {v2, p1, v3, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 58
    .line 59
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$e;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$e;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public setTabMode(I)V
    .locals 3

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    sget v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->s:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "only support TAB_MODE_FIXED or TAB_MODE_SCROLLABLE"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:I

    .line 19
    .line 20
    if-ne p1, v0, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->k:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    move v0, p1

    .line 27
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v0, v1, :cond_4

    .line 34
    .line 35
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->r(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v2, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 67
    .line 68
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$d;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$d;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public setTabSelected(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->w(IZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3
    .param p1    # Landroidx/viewpager/widget/ViewPager;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->p:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->removeOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Landroidx/viewpager/widget/ViewPager;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->p:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->p:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;

    .line 33
    .line 34
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->p:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$h;

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$g;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$g;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->l(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->v(Landroidx/viewpager/widget/PagerAdapter;Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    const-string v0, "ViewPager does not have a PagerAdapter set"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->m:Landroidx/viewpager/widget/ViewPager;

    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->v(Landroidx/viewpager/widget/PagerAdapter;Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 8
    .line 9
    return-void
.end method

.method public final u(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->p(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    div-int/lit8 p1, p1, 0x2

    .line 18
    .line 19
    add-int/2addr v1, p1

    .line 20
    sub-int/2addr v1, v0

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    div-int/lit8 p1, p1, 0x2

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-le v1, p1, :cond_0

    .line 29
    .line 30
    sub-int/2addr v1, p1

    .line 31
    invoke-virtual {p0, v0, v1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    if-ge v1, p1, :cond_1

    .line 36
    .line 37
    sub-int/2addr v1, p1

    .line 38
    invoke-virtual {p0, v0, v1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final v(Landroidx/viewpager/widget/PagerAdapter;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Landroidx/viewpager/widget/PagerAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->q:Landroid/database/DataSetObserver;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->n:Landroidx/viewpager/widget/PagerAdapter;

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->q:Landroid/database/DataSetObserver;

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$j;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p2, p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$j;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$a;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->q:Landroid/database/DataSetObserver;

    .line 29
    .line 30
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->q:Landroid/database/DataSetObserver;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->s()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final w(IZZ)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final x(IZZ)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->p(I)Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v4, v2

    .line 14
    :goto_0
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_3

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v1, v2}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 23
    .line 24
    :cond_1
    invoke-interface {v0, v3}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->d:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$k;->k(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->u(I)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    .line 38
    .line 39
    :cond_3
    if-eqz p3, :cond_6

    .line 40
    .line 41
    :goto_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-ge v2, p2, :cond_6

    .line 48
    .line 49
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;

    .line 56
    .line 57
    if-eqz p2, :cond_5

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    invoke-interface {p2, v0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;->b(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V

    .line 62
    .line 63
    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->o(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)I

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    invoke-interface {p2, v5, p3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;->a(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-interface {p2, v0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$i;->c(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;I)V

    .line 75
    .line 76
    .line 77
    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_6
    return-void
.end method
