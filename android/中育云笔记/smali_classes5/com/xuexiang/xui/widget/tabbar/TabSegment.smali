.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$h;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$l;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$k;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;,
        Lcom/xuexiang/xui/widget/tabbar/TabSegment$f;
    }
.end annotation


# instance fields
.field public A:Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

.field public B:Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

.field public C:Z

.field public final c:Ljava/util/ArrayList;

.field public d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:Z

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:Z

.field public m:Landroid/graphics/Rect;

.field public n:Landroid/graphics/Paint;

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:Landroid/animation/Animator;

.field public v:Landroid/view/View$OnClickListener;

.field public w:Landroidx/viewpager/widget/ViewPager;

.field public x:Landroidx/viewpager/widget/PagerAdapter;

.field public y:Landroid/database/DataSetObserver;

.field public z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->TabSegmentStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:I

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Z

    const/4 v2, 0x0

    .line 10
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 11
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->t:I

    .line 14
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$a;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$a;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->v:Landroid/view/View$OnClickListener;

    .line 15
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 16
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->T(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    invoke-virtual {p0, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    return-void
.end method

.method public static synthetic A(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic B(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$f;
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

.method public static synthetic C(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic D(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->Q(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic E(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->V(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->M(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->N(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/animation/Animator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d0(Landroid/widget/TextView;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:I

    .line 2
    .line 3
    return p0
.end method

.method private getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;->a()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private getTabCount()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk9/a;->g()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->U(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setViewPagerScrollState(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getTabCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic l(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic m(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->S(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic n(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic o(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic q(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->K(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->P(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic s(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->b0(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setViewPagerScrollState(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->t:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, p1, v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a0(IZZ)V

    .line 17
    .line 18
    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static synthetic t(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic u(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic v(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic w(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic x(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic y(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic z(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public H(Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public I(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)Lcom/xuexiang/xui/widget/tabbar/TabSegment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;->a()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lk9/a;->a(Ljava/lang/Object;)Lk9/a;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final J(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "Could not instantiate the TypefaceProvider: "

    .line 2
    .line 3
    invoke-static {p2}, Lcom/xuexiang/xui/utils/h;->i(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->O(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_1

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :catch_1
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :catch_2
    move-exception p1

    .line 45
    goto :goto_4

    .line 46
    :catch_3
    move-exception p1

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :catch_4
    move-exception p1

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_1
    invoke-virtual {p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-class v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$k;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    const/4 v1, 0x0

    .line 67
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    const/4 v2, 0x1

    .line 72
    :try_start_2
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catch_5
    move-exception p1

    .line 84
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v3, "Error creating TypefaceProvider "

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-direct {v1, v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v1
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    .line 107
    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v2, "Class is not a TypefaceProvider "

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    :goto_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v2, "Cannot access non-public constructor "

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :goto_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-direct {v1, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :goto_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-direct {v1, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    throw v1

    .line 195
    :goto_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 196
    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v2, "Unable to find TypefaceProvider "

    .line 203
    .line 204
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    throw v0
.end method

.method public final K(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;->a(I)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final L(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;->c(I)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final M(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;->b(I)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final N(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;->d(I)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final O(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x2e

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    return-object p2
.end method

.method public final P(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 10
    .line 11
    :cond_0
    return p1
.end method

.method public final Q(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->h()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 10
    .line 11
    :cond_0
    return p1
.end method

.method public final R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->j()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 10
    .line 11
    :cond_0
    return p1
.end method

.method public final S(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->m()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 10
    .line 11
    :cond_0
    return p1
.end method

.method public final T(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->TabSegment:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_selected_color:I

    .line 9
    .line 10
    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 11
    .line 12
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 21
    .line 22
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_normal_color:I

    .line 23
    .line 24
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_gray_5:I

    .line 25
    .line 26
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 35
    .line 36
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_has_indicator:I

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 44
    .line 45
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_indicator_height:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget v3, Lcom/xuexiang/xui/R$dimen;->xui_tab_segment_indicator_height:I

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i:I

    .line 62
    .line 63
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_android_textSize:I

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    sget v3, Lcom/xuexiang/xui/R$dimen;->xui_tab_segment_text_size:I

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 80
    .line 81
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_indicator_top:I

    .line 82
    .line 83
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 88
    .line 89
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_icon_position:I

    .line 90
    .line 91
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 96
    .line 97
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_mode:I

    .line 98
    .line 99
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 104
    .line 105
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_space:I

    .line 106
    .line 107
    const/high16 v0, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:I

    .line 118
    .line 119
    sget p3, Lcom/xuexiang/xui/R$styleable;->TabSegment_ts_typeface_provider:I

    .line 120
    .line 121
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 126
    .line 127
    .line 128
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 129
    .line 130
    invoke-direct {p2, p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 134
    .line 135
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 136
    .line 137
    const/4 v1, -0x2

    .line 138
    const/4 v2, -0x1

    .line 139
    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->J(Landroid/content/Context;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final U(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    add-int/2addr v2, v3

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v0, v1, v3, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v1, v2

    .line 47
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    new-instance v0, Landroid/graphics/Paint;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 59
    .line 60
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 72
    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    return-void
.end method

.method public final V(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;F)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->d()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->d()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v1, v2

    .line 19
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->c()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-float v2, v2

    .line 24
    int-to-float v0, v0

    .line 25
    mul-float/2addr v0, p3

    .line 26
    add-float/2addr v2, v0

    .line 27
    float-to-int v0, v2

    .line 28
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;->d()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    int-to-float v1, v1

    .line 34
    mul-float/2addr v1, p3

    .line 35
    add-float/2addr v2, v1

    .line 36
    float-to-int v1, v2

    .line 37
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    new-instance v2, Landroid/graphics/Rect;

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v2, v0, v3, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->m:Landroid/graphics/Rect;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput v0, v2, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    add-int/2addr v0, v1

    .line 54
    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 55
    .line 56
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    new-instance v0, Landroid/graphics/Paint;

    .line 61
    .line 62
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 66
    .line 67
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/b;->a(IIF)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->n:Landroid/graphics/Paint;

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public W()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk9/a;->j()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->X(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public X(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Landroidx/viewpager/widget/PagerAdapter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->Z()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->Z()V

    .line 19
    .line 20
    .line 21
    move p1, v1

    .line 22
    :goto_0
    if-ge p1, v0, :cond_1

    .line 23
    .line 24
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Landroidx/viewpager/widget/PagerAdapter;

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;-><init>(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->I(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 36
    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->W()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Landroidx/viewpager/widget/ViewPager;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    if-lez v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->a0(IZZ)V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method public Y(Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public Z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;->a()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lk9/a;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public a0(IZZ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lk9/a;->i()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v2}, Lk9/a;->g()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Lk9/a;->j()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lk9/a;->i()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v4, :cond_c

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-gt v4, p1, :cond_2

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_2
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 50
    .line 51
    if-nez v4, :cond_b

    .line 52
    .line 53
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->t:I

    .line 54
    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_3
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 60
    .line 61
    if-ne v4, p1, :cond_5

    .line 62
    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->L(I)V

    .line 66
    .line 67
    .line 68
    :cond_4
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 69
    .line 70
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    const/4 v7, -0x1

    .line 81
    if-le v4, v5, :cond_6

    .line 82
    .line 83
    const-string v4, "TabSegment"

    .line 84
    .line 85
    const-string v5, "selectTab: current selected index is bigger than views size."

    .line 86
    .line 87
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    iput v7, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 91
    .line 92
    :cond_6
    iget v9, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 93
    .line 94
    if-ne v9, v7, :cond_7

    .line 95
    .line 96
    invoke-virtual {v2, p1}, Lk9/a;->f(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 101
    .line 102
    invoke-virtual {p0, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->U(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {p0, v4, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d0(Landroid/widget/TextView;Z)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 123
    .line 124
    invoke-virtual {v3, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->M(I)V

    .line 128
    .line 129
    .line 130
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 131
    .line 132
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    invoke-virtual {v2, v9}, Lk9/a;->f(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 140
    .line 141
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 146
    .line 147
    invoke-virtual {v2, p1}, Lk9/a;->f(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 152
    .line 153
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 158
    .line 159
    if-eqz p2, :cond_a

    .line 160
    .line 161
    invoke-virtual {p0, v9}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->N(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->M(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-virtual {p0, v7, v8}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d0(Landroid/widget/TextView;Z)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {p0, v7, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d0(Landroid/widget/TextView;Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v4, v8}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->b(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-le v4, v5, :cond_8

    .line 196
    .line 197
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-virtual {p0, v3, v8}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    sub-int/2addr v4, v5

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    sub-int/2addr v4, v5

    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    add-int/2addr v5, v4

    .line 224
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-ge v5, v7, :cond_9

    .line 229
    .line 230
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    sub-int/2addr v3, v4

    .line 235
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    sub-int/2addr v3, v4

    .line 240
    invoke-virtual {p0, v3, v8}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 241
    .line 242
    .line 243
    :cond_9
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 244
    .line 245
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 246
    .line 247
    invoke-virtual {p0, v2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->U(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Z)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_a
    const/4 v0, 0x2

    .line 252
    new-array v0, v0, [F

    .line 253
    .line 254
    fill-array-data v0, :array_0

    .line 255
    .line 256
    .line 257
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 262
    .line 263
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v10, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 267
    .line 268
    .line 269
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;

    .line 270
    .line 271
    move-object v1, v3

    .line 272
    move-object v3, v2

    .line 273
    move-object v2, v4

    .line 274
    move-object v4, v5

    .line 275
    move-object v5, v1

    .line 276
    move-object v1, p0

    .line 277
    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$b;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v10, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 281
    .line 282
    .line 283
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$c;

    .line 284
    .line 285
    move-object v1, v3

    .line 286
    move-object v3, v2

    .line 287
    move-object v2, v4

    .line 288
    move-object v4, v5

    .line 289
    move-object v5, v1

    .line 290
    move-object v1, p0

    .line 291
    move v6, p1

    .line 292
    move v7, v9

    .line 293
    invoke-direct/range {v0 .. v7}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$c;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;II)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 297
    .line 298
    .line 299
    const-wide/16 v2, 0xc8

    .line 300
    .line 301
    invoke-virtual {v10, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v10}, Landroid/animation/ValueAnimator;->start()V

    .line 305
    .line 306
    .line 307
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 308
    .line 309
    return-void

    .line 310
    :cond_b
    :goto_1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:I

    .line 311
    .line 312
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 313
    .line 314
    return-void

    .line 315
    :cond_c
    :goto_2
    iput-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 316
    .line 317
    return-void

    .line 318
    nop

    .line 319
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final b0(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    move-object v1, p2

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object v1, v0

    .line 7
    :goto_0
    const/4 v2, 0x1

    .line 8
    if-ne p3, v2, :cond_1

    .line 9
    .line 10
    move-object v2, p2

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move-object v2, v0

    .line 13
    :goto_1
    const/4 v3, 0x2

    .line 14
    if-ne p3, v3, :cond_2

    .line 15
    .line 16
    move-object v3, p2

    .line 17
    goto :goto_2

    .line 18
    :cond_2
    move-object v3, v0

    .line 19
    :goto_2
    const/4 v4, 0x3

    .line 20
    if-ne p3, v4, :cond_3

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_3
    move-object p2, v0

    .line 24
    :goto_3
    invoke-virtual {p1, v1, v2, v3, p2}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public c0(Landroidx/viewpager/widget/PagerAdapter;ZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Landroidx/viewpager/widget/PagerAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Landroid/database/DataSetObserver;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->x:Landroidx/viewpager/widget/PagerAdapter;

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Landroid/database/DataSetObserver;

    .line 19
    .line 20
    if-nez p3, :cond_1

    .line 21
    .line 22
    new-instance p3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$h;

    .line 23
    .line 24
    invoke-direct {p3, p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$h;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V

    .line 25
    .line 26
    .line 27
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Landroid/database/DataSetObserver;

    .line 28
    .line 29
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->y:Landroid/database/DataSetObserver;

    .line 30
    .line 31
    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->X(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final d0(Landroid/widget/TextView;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public e0(Landroidx/viewpager/widget/ViewPager;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f0(Landroidx/viewpager/widget/ViewPager;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public f0(Landroidx/viewpager/widget/ViewPager;ZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Landroidx/viewpager/widget/ViewPager;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->removeOnAdapterChangeListener(Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->Y(Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 30
    .line 31
    :cond_2
    if-eqz p1, :cond_6

    .line 32
    .line 33
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Landroidx/viewpager/widget/ViewPager;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabLayoutOnPageChangeListener;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->z:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$l;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$l;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->A:Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->H(Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0, v0, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c0(Landroidx/viewpager/widget/PagerAdapter;ZZ)V

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

    .line 71
    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

    .line 75
    .line 76
    invoke-direct {v0, p0, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

    .line 80
    .line 81
    :cond_5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

    .line 82
    .line 83
    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->a(Z)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->B:Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->addOnAdapterChangeListener(Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->w:Landroidx/viewpager/widget/ViewPager;

    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    invoke-virtual {p0, v1, p1, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c0(Landroidx/viewpager/widget/PagerAdapter;ZZ)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public g0(IF)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroid/animation/Animator;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->C:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    cmpl-float v1, p2, v0

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    cmpg-float v0, p2, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 v0, p1, -0x1

    .line 20
    .line 21
    neg-float p2, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    add-int/lit8 v0, p1, 0x1

    .line 24
    .line 25
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lk9/a;->i()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-le v3, p1, :cond_3

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-gt v3, v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {v1, p1}, Lk9/a;->f(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lk9/a;->f(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;

    .line 57
    .line 58
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 63
    .line 64
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->Q(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-static {v2, v4, p2}, Lcom/xuexiang/xui/utils/b;->a(IIF)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->Q(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->R(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-static {v4, v5, p2}, Lcom/xuexiang/xui/utils/b;->a(IIF)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {p1, v3, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1, v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->a(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v3, v1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->V(Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;Lcom/xuexiang/xui/widget/tabbar/TabSegment$i;F)V

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_1
    return-void
.end method

.method public getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget p2, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 6
    .line 7
    const/4 p3, -0x1

    .line 8
    if-eq p2, p3, :cond_1

    .line 9
    .line 10
    iget p2, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->getAdapter()Lcom/xuexiang/xui/widget/tabbar/TabSegment$j;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lk9/a;->i()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p3, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e:I

    .line 23
    .line 24
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    const/4 p5, 0x0

    .line 39
    if-le p3, p4, :cond_0

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p0, p2, p5}, Landroid/view/View;->scrollTo(II)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    sub-int/2addr p3, p4

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    sub-int/2addr p3, p4

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    add-int/2addr p4, p3

    .line 68
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-ge p4, v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    sub-int/2addr p2, p3

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    sub-int/2addr p2, p3

    .line 84
    invoke-virtual {p0, p2, p5}, Landroid/view/View;->scrollBy(II)V

    .line 85
    .line 86
    .line 87
    :cond_1
    return-void
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v3, v4

    .line 29
    sub-int v4, v0, v3

    .line 30
    .line 31
    const/high16 v5, 0x40000000    # 2.0f

    .line 32
    .line 33
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual {v2, v4, p2}, Landroid/view/View;->measure(II)V

    .line 38
    .line 39
    .line 40
    const/high16 v4, -0x80000000

    .line 41
    .line 42
    if-ne v1, v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    add-int/2addr p1, v3

    .line 49
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public setDefaultNormalColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultSelectedColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultTabIconPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public setHasIndicator(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i:I

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setIndicatorPosition(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setIndicatorWidthAdjustContent(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Z

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setItemSpaceInScrollMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:I

    .line 2
    .line 3
    return-void
.end method

.method public setMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->d:Lcom/xuexiang/xui/widget/tabbar/TabSegment$e;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setOnTabClickListener(Lcom/xuexiang/xui/widget/tabbar/TabSegment$f;)V
    .locals 0

    return-void
.end method

.method public setTabTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public setTypefaceProvider(Lcom/xuexiang/xui/widget/tabbar/TabSegment$k;)V
    .locals 0

    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1
    .param p1    # Landroidx/viewpager/widget/ViewPager;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e0(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
