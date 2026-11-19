.class public Lcom/luck/picture/lib/PictureSelectorFragment;
.super Lcom/luck/picture/lib/basic/PictureCommonFragment;
.source "SourceFile"

# interfaces
.implements Lq6/i;


# static fields
.field public static final B:Ljava/lang/String; = "PictureSelectorFragment"

.field public static C:I = 0x87

.field public static final D:Ljava/lang/Object;


# instance fields
.field public A:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

.field public m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

.field public n:Landroid/widget/TextView;

.field public o:Lcom/luck/picture/lib/widget/TitleBar;

.field public p:Lcom/luck/picture/lib/widget/BottomNavBar;

.field public q:Lcom/luck/picture/lib/widget/CompleteSelectView;

.field public r:Landroid/widget/TextView;

.field public s:J

.field public t:I

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

.field public z:Lm6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/PictureSelectorFragment;->D:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->s:J

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->u:I

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic A1(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->U1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic C1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->q2(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic D1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->R1(Ljava/util/List;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic E1(Lcom/luck/picture/lib/PictureSelectorFragment;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic F1(Lcom/luck/picture/lib/PictureSelectorFragment;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->s:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic H1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lm6/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic I1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic J1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/TitleBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic U0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic V0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic W0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic X0(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->M1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y0(Lcom/luck/picture/lib/PictureSelectorFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic Z0(Lcom/luck/picture/lib/PictureSelectorFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic a1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c1(Lcom/luck/picture/lib/PictureSelectorFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e1(Lcom/luck/picture/lib/PictureSelectorFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f1(Lcom/luck/picture/lib/PictureSelectorFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic g1(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->m0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->T1(Ljava/util/ArrayList;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static h2()Lcom/luck/picture/lib/PictureSelectorFragment;
    .locals 2

    .line 1
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static synthetic i1(Lcom/luck/picture/lib/PictureSelectorFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k1(Lcom/luck/picture/lib/PictureSelectorFragment;)Ls6/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->A:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic n1(Lcom/luck/picture/lib/PictureSelectorFragment;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->j2(IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->O1(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->P1(Ljava/util/ArrayList;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q1(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r1(Lcom/luck/picture/lib/PictureSelectorFragment;Lcom/luck/picture/lib/entity/LocalMediaFolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->Q1(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s1(Lcom/luck/picture/lib/PictureSelectorFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic t1(I)I
    .locals 0

    .line 1
    sput p0, Lcom/luck/picture/lib/PictureSelectorFragment;->C:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic u1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic w1(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic y1(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->r2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z1(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->s2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public F0(Z)V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->Z()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ge v0, v1, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->j0(I)V

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 38
    .line 39
    iget v1, v1, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->f(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final K1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$q;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$q;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lm6/a;->k(Lq6/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final L1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$e;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$e;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->k(Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 12
    .line 13
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$f;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$f;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setOnRecyclerViewScrollStateListener(Lq6/k;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 22
    .line 23
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$g;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$g;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setOnRecyclerViewScrollListener(Lq6/j;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 32
    .line 33
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E0:Z

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance v0, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/luck/picture/lib/widget/a;

    .line 43
    .line 44
    new-instance v2, Lcom/luck/picture/lib/PictureSelectorFragment$h;

    .line 45
    .line 46
    invoke-direct {v2, p0, v0}, Lcom/luck/picture/lib/PictureSelectorFragment$h;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/HashSet;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2}, Lcom/luck/picture/lib/widget/a;-><init>(Lcom/luck/picture/lib/widget/a$a;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 53
    .line 54
    invoke-direct {v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n(I)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->r(Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->A:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    return-void
.end method

.method public final M1()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 7
    .line 8
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->f2()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->c2()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final N1(Z)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l0:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_b

    .line 7
    .line 8
    iget-boolean v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 14
    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    invoke-static {}, Lu6/a;->l()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 24
    .line 25
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    invoke-static {}, Lu6/a;->l()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 36
    .line 37
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 38
    .line 39
    sub-int/2addr v0, v3

    .line 40
    if-ne p1, v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return v2

    .line 44
    :cond_2
    :goto_0
    return v3

    .line 45
    :cond_3
    invoke-static {}, Lu6/a;->l()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_a

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    invoke-static {}, Lu6/a;->l()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ne v0, v3, :cond_4

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    invoke-static {}, Lu6/a;->o()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 71
    .line 72
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 73
    .line 74
    if-lez v1, :cond_5

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 78
    .line 79
    :goto_1
    invoke-static {}, Lu6/a;->l()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eq v0, v1, :cond_7

    .line 84
    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    invoke-static {}, Lu6/a;->l()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    sub-int/2addr v1, v3

    .line 92
    if-ne p1, v1, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    return v2

    .line 96
    :cond_7
    :goto_2
    return v3

    .line 97
    :cond_8
    invoke-static {}, Lu6/a;->l()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 102
    .line 103
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 104
    .line 105
    if-eq v0, v1, :cond_a

    .line 106
    .line 107
    if-nez p1, :cond_9

    .line 108
    .line 109
    invoke-static {}, Lu6/a;->l()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 114
    .line 115
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 116
    .line 117
    sub-int/2addr v0, v3

    .line 118
    if-ne p1, v0, :cond_9

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_9
    return v2

    .line 122
    :cond_a
    :goto_3
    return v3

    .line 123
    :cond_b
    :goto_4
    return v2
.end method

.method public final O1(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_3

    .line 17
    .line 18
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 35
    .line 36
    invoke-static {v0}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lm6/a;->c(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 54
    .line 55
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->d2(J)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->t2()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public P(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm6/a;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->b2(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->v:Z

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 27
    .line 28
    iget v3, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 29
    .line 30
    if-ne v3, v1, :cond_1

    .line 31
    .line 32
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {}, Lu6/a;->h()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->R()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0, p1, v2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 55
    .line 56
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 64
    .line 65
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v0, v1, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 79
    .line 80
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 91
    .line 92
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v1}, La7/q;->e(Ljava/lang/Object;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    invoke-virtual {v0, v3, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 146
    .line 147
    .line 148
    iget p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->n(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->t(Z)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 166
    .line 167
    invoke-virtual {p1, v2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setEnabledLoadMore(Z)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_4
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->g2(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 175
    .line 176
    .line 177
    :goto_1
    iput v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->t:I

    .line 178
    .line 179
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-gtz p1, :cond_6

    .line 190
    .line 191
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 192
    .line 193
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 194
    .line 195
    if-eqz p1, :cond_5

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->t2()V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->V1()V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final P1(Ljava/util/ArrayList;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setEnabledLoadMore(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->b()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->h()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final Q1(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    new-instance v2, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_1
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-static {p1}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->t2()V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public final R1(Ljava/util/List;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setEnabledLoadMore(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->b()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->n2(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-lez p2, :cond_1

    .line 33
    .line 34
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->getItemCount()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {v0, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->V1()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->h()V

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/16 p2, 0xa

    .line 74
    .line 75
    if-ge p1, p2, :cond_2

    .line 76
    .line 77
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1, p2, v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->onScrolled(II)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_1
    return-void
.end method

.method public final S1(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_3

    .line 17
    .line 18
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 35
    .line 36
    invoke-static {v0}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lm6/a;->c(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 54
    .line 55
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-static {}, Lu6/a;->k()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    invoke-virtual {p0, p1, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->P1(Ljava/util/ArrayList;Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->t2()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final T1(Ljava/util/ArrayList;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setEnabledLoadMore(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-virtual {p1, p2, p2}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->onScrolled(II)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final U1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->r:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-wide/16 v1, 0xfa

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final V1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public W()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v0, v1}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    sget v0, Lcom/luck/picture/lib/R$layout;->ps_fragment_selector:I

    .line 14
    .line 15
    return v0
.end method

.method public final W1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lm6/a;->d(Landroid/content/Context;)Lm6/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 10
    .line 11
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$o;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$o;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lm6/a;->l(Lm6/a$d;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->K1()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final X1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->p:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->p:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 7
    .line 8
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$r;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$r;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/BottomNavBar;->setOnBottomNavBarListener(Lcom/luck/picture/lib/widget/BottomNavBar$b;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->p:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->h()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final Y1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget v1, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lz6/a;->d()Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v3}, Lcom/luck/picture/lib/style/TitleBarStyle;->w(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/TitleBar;->getTitleCancelView()Landroid/widget/TextView;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/CompleteSelectView;->c()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Lcom/luck/picture/lib/widget/CompleteSelectView;->setSelectedChange(Z)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 50
    .line 51
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->U()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    instance-of v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 78
    .line 79
    sget v1, Lcom/luck/picture/lib/R$id;->title_bar:I

    .line 80
    .line 81
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 82
    .line 83
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 90
    .line 91
    sget v1, Lcom/luck/picture/lib/R$id;->title_bar:I

    .line 92
    .line 93
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 94
    .line 95
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 96
    .line 97
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 108
    .line 109
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v1}, La7/e;->h(Landroid/content/Context;)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    instance-of v0, v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 127
    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 131
    .line 132
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 133
    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 143
    .line 144
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1}, La7/e;->h(Landroid/content/Context;)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 153
    .line 154
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 155
    .line 156
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$m;

    .line 157
    .line 158
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$m;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public Z([Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    aget-object v0, p1, v1

    .line 10
    .line 11
    sget-object v2, Lw6/b;->d:[Ljava/lang/String;

    .line 12
    .line 13
    aget-object v2, v2, v1

    .line 14
    .line 15
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    :goto_0
    sget-object v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2, p1}, Lw6/a;->e(Landroid/content/Context;[Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, La7/j;->f()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 44
    .line 45
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-static {}, Lh6/a;->a()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2, p1}, Lw6/a;->e(Landroid/content/Context;[Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    :goto_1
    if-eqz p1, :cond_4

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->A0()V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->M1()V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget v0, Lcom/luck/picture/lib/R$string;->ps_camera:I

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p1, v0}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget v0, Lcom/luck/picture/lib/R$string;->ps_jurisdiction:I

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {p1, v0}, La7/p;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 104
    .line 105
    .line 106
    :goto_2
    new-array p1, v1, [Ljava/lang/String;

    .line 107
    .line 108
    sput-object p1, Lw6/b;->a:[Ljava/lang/String;

    .line 109
    .line 110
    return-void
.end method

.method public final Z1(Landroid/view/View;)V
    .locals 5

    .line 1
    sget v0, Lcom/luck/picture/lib/R$id;->recycler:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 10
    .line 11
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->B()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, La7/o;->c(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sget v3, Lcom/luck/picture/lib/R$color;->ps_color_black:I

    .line 40
    .line 41
    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 49
    .line 50
    iget v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y:I

    .line 51
    .line 52
    if-gtz v1, :cond_1

    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    :cond_1
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 56
    .line 57
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->p()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v2}, La7/o;->b(I)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 74
    .line 75
    new-instance v2, Lcom/luck/picture/lib/decoration/GridSpacingItemDecoration;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->p()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->T()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-direct {v2, v1, v3, v0}, Lcom/luck/picture/lib/decoration/GridSpacingItemDecoration;-><init>(IIZ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 93
    .line 94
    new-instance v3, Lcom/luck/picture/lib/decoration/GridSpacingItemDecoration;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const/high16 v4, 0x3f800000    # 1.0f

    .line 101
    .line 102
    invoke-static {p1, v4}, La7/e;->a(Landroid/content/Context;F)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/SelectMainStyle;->T()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-direct {v3, v1, p1, v0}, Lcom/luck/picture/lib/decoration/GridSpacingItemDecoration;-><init>(IIZ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 117
    .line 118
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 131
    .line 132
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_4

    .line 137
    .line 138
    check-cast p1, Landroidx/recyclerview/widget/SimpleItemAnimator;

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 151
    .line 152
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 153
    .line 154
    const/4 v0, 0x1

    .line 155
    const/4 v1, 0x2

    .line 156
    if-eqz p1, :cond_5

    .line 157
    .line 158
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setReachBottomRow(I)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setOnRecyclerViewPreloadListener(Lq6/i;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 172
    .line 173
    .line 174
    :goto_2
    new-instance p1, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 175
    .line 176
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iget-object v3, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 181
    .line 182
    invoke-direct {p1, v2, v3}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;-><init>(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 183
    .line 184
    .line 185
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 186
    .line 187
    iget-boolean v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 188
    .line 189
    invoke-virtual {p1, v2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->j(Z)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 193
    .line 194
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m0:I

    .line 195
    .line 196
    if-eq p1, v0, :cond_7

    .line 197
    .line 198
    if-eq p1, v1, :cond_6

    .line 199
    .line 200
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 201
    .line 202
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 203
    .line 204
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_6
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 209
    .line 210
    new-instance v0, Lcom/luck/picture/lib/animators/SlideInBottomAnimationAdapter;

    .line 211
    .line 212
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 213
    .line 214
    invoke-direct {v0, v1}, Lcom/luck/picture/lib/animators/SlideInBottomAnimationAdapter;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_7
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 222
    .line 223
    new-instance v0, Lcom/luck/picture/lib/animators/AlphaInAnimationAdapter;

    .line 224
    .line 225
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 226
    .line 227
    invoke-direct {v0, v1}, Lcom/luck/picture/lib/animators/AlphaInAnimationAdapter;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 231
    .line 232
    .line 233
    :goto_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->L1()V

    .line 234
    .line 235
    .line 236
    return-void
.end method

.method public final a2()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->d()Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/TitleBar;->d()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 26
    .line 27
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$n;

    .line 28
    .line 29
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$n;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/TitleBar;->setOnTitleBarListener(Lcom/luck/picture/lib/widget/TitleBar$a;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final b2(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->t:I

    .line 6
    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    if-ge v1, p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_1
    return v0
.end method

.method public c2()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 4
    .line 5
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$a;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$a;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ls6/a;->g(Lq6/f;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public d2(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setEnabledLoadMore(Z)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 10
    .line 11
    iget v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 12
    .line 13
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    iget v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 16
    .line 17
    mul-int v5, v0, v2

    .line 18
    .line 19
    new-instance v6, Lcom/luck/picture/lib/PictureSelectorFragment$b;

    .line 20
    .line 21
    invoke-direct {v6, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$b;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    move-wide v2, p1

    .line 26
    invoke-virtual/range {v1 .. v6}, Ls6/a;->i(JIILq6/g;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public e2()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 14
    .line 15
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    move-wide v3, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 33
    .line 34
    iget v5, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 35
    .line 36
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 37
    .line 38
    iget v6, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 39
    .line 40
    new-instance v7, Lcom/luck/picture/lib/PictureSelectorFragment$l;

    .line 41
    .line 42
    invoke-direct {v7, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$l;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {v2 .. v7}, Ls6/a;->i(JIILq6/g;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public f2()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 4
    .line 5
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$c;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$c;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ls6/a;->h(Lq6/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->p:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g2(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm6/a;->f()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lm6/a;->i()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-wide/16 v2, -0x1

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    new-instance v1, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 19
    .line 20
    invoke-direct {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v5, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 24
    .line 25
    iget-object v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    iget-object v5, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 34
    .line 35
    iget v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 36
    .line 37
    invoke-static {}, Ll6/d;->b()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-ne v5, v6, :cond_0

    .line 42
    .line 43
    sget v5, Lcom/luck/picture/lib/R$string;->ps_all_audio:I

    .line 44
    .line 45
    :goto_0
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    sget v5, Lcom/luck/picture/lib/R$string;->ps_camera_roll:I

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v5, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 54
    .line 55
    iget-object v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 56
    .line 57
    :goto_1
    invoke-virtual {v1, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v5, ""

    .line 61
    .line 62
    invoke-virtual {v1, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v4, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 73
    .line 74
    invoke-virtual {v1, v4}, Lm6/a;->h(I)Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_2
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v1, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v1, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v5, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 93
    .line 94
    invoke-virtual {v5}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v1, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2, v3}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-virtual {p0, v5}, Lcom/luck/picture/lib/PictureSelectorFragment;->b2(I)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    const/4 v6, 0x1

    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    add-int/2addr v5, v6

    .line 125
    :goto_3
    invoke-virtual {v1, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-nez v5, :cond_4

    .line 133
    .line 134
    invoke-static {v1}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    move v5, v4

    .line 138
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-ge v5, v7, :cond_6

    .line 143
    .line 144
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    check-cast v7, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 149
    .line 150
    invoke-virtual {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-static {v8, v9}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_5

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    const/4 v7, 0x0

    .line 169
    :goto_5
    if-nez v7, :cond_7

    .line 170
    .line 171
    new-instance v7, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 172
    .line 173
    invoke-direct {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    :cond_7
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {v7, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    cmp-long v2, v8, v2

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    invoke-virtual {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    const-wide/16 v8, 0x0

    .line 199
    .line 200
    cmp-long v2, v2, v8

    .line 201
    .line 202
    if-nez v2, :cond_9

    .line 203
    .line 204
    :cond_8
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->h()J

    .line 205
    .line 206
    .line 207
    move-result-wide v2

    .line 208
    invoke-virtual {v7, v2, v3}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 209
    .line 210
    .line 211
    :cond_9
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 212
    .line 213
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 214
    .line 215
    if-eqz v2, :cond_a

    .line 216
    .line 217
    invoke-virtual {v7, v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->t(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-virtual {p0, v2}, Lcom/luck/picture/lib/PictureSelectorFragment;->b2(I)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_b

    .line 230
    .line 231
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 232
    .line 233
    iget-object v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 234
    .line 235
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_b

    .line 240
    .line 241
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 242
    .line 243
    iget-object v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Y:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-nez v2, :cond_c

    .line 250
    .line 251
    :cond_b
    invoke-virtual {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v2, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_c
    :goto_6
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    invoke-virtual {p0, v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->b2(I)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_d

    .line 267
    .line 268
    invoke-virtual {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    goto :goto_7

    .line 273
    :cond_d
    invoke-virtual {v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    add-int/2addr v1, v6

    .line 278
    :goto_7
    invoke-virtual {v7, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 279
    .line 280
    .line 281
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 282
    .line 283
    iget-object v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v7, v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-virtual {v7, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 296
    .line 297
    invoke-virtual {p1, v0}, Lm6/a;->c(Ljava/util/List;)V

    .line 298
    .line 299
    .line 300
    return-void
.end method

.method public h()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$k;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$k;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 12
    .line 13
    .line 14
    const-wide/16 v2, 0x15e

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->e2()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public i2()V
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ls6/d;

    .line 10
    .line 11
    invoke-direct {v0}, Ls6/d;-><init>()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Ls6/b;

    .line 16
    .line 17
    invoke-direct {v0}, Ls6/b;-><init>()V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->f:Ls6/a;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ls6/a;->f(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final j2(IZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->P:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1, v2}, La7/a;->b(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    :goto_0
    move-object v15, v1

    .line 33
    move v11, v3

    .line 34
    move-wide v13, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v3, v0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    goto :goto_0

    .line 64
    :goto_1
    if-nez p2, :cond_2

    .line 65
    .line 66
    iget-object v1, v0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 67
    .line 68
    iget-boolean v3, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    iget-object v3, v0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 73
    .line 74
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1}, La7/e;->h(Landroid/content/Context;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    :goto_2
    invoke-static {v3, v1}, Lt6/a;->c(Landroid/view/ViewGroup;I)V

    .line 89
    .line 90
    .line 91
    :cond_2
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1, v2}, La7/a;->b(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-static {}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->U1()Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    iget-object v1, v0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/luck/picture/lib/widget/TitleBar;->getTitleText()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    iget-object v1, v0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    iget v12, v0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 120
    .line 121
    move/from16 v10, p1

    .line 122
    .line 123
    move/from16 v7, p2

    .line 124
    .line 125
    invoke-virtual/range {v6 .. v15}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->j2(ZLjava/lang/String;ZIIIJLjava/util/ArrayList;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1, v2, v6}, Lk6/a;->a(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    return-void
.end method

.method public k2(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "com.luck.picture.lib.all_folder_size"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->t:I

    .line 10
    .line 11
    const-string v0, "com.luck.picture.lib.current_page"

    .line 12
    .line 13
    iget v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 20
    .line 21
    const-string v0, "com.luck.picture.lib.current_preview_position"

    .line 22
    .line 23
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->u:I

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->u:I

    .line 30
    .line 31
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 32
    .line 33
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 34
    .line 35
    const-string v1, "com.luck.picture.lib.display_camera"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 45
    .line 46
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 47
    .line 48
    iput-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 49
    .line 50
    return-void
.end method

.method public final l2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->j(Z)V

    .line 6
    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->J0(J)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->Q1(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {}, Lu6/a;->i()Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->S1(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final m2()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->u:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 6
    .line 7
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorFragment$d;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$d;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public n0(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 2
    .line 3
    iget p1, p1, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->f(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n2(Ljava/util/List;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 3
    .line 4
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 5
    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->v:Z

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    sget-object v1, Lcom/luck/picture/lib/PictureSelectorFragment;->D:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    monitor-exit v1

    .line 48
    goto :goto_2

    .line 49
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    goto :goto_4

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_3

    .line 55
    :cond_2
    :goto_2
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->v:Z

    .line 56
    .line 57
    return-void

    .line 58
    :goto_3
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    .line 60
    .line 61
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->v:Z

    .line 62
    .line 63
    return-void

    .line 64
    :goto_4
    iput-boolean v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->v:Z

    .line 65
    .line 66
    throw p1
.end method

.method public o0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->M0(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->x:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->j(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, La7/j;->f()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lh6/a;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lw6/a;->d(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->M1()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    sget-object v0, Lw6/b;->b:[Ljava/lang/String;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {p0, v1, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->s0(Z[Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 46
    .line 47
    invoke-static {}, Lw6/a;->b()Lw6/a;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, Lcom/luck/picture/lib/PictureSelectorFragment$p;

    .line 52
    .line 53
    invoke-direct {v2, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$p;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p0, v0, v2}, Lw6/a;->i(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lw6/c;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->A:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->q()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.luck.picture.lib.all_folder_size"

    .line 5
    .line 6
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->t:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "com.luck.picture.lib.current_page"

    .line 12
    .line 13
    iget v1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->e:I

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->getLastVisiblePosition()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const-string v1, "com.luck.picture.lib.current_preview_position"

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const-string v1, "com.luck.picture.lib.display_camera"

    .line 36
    .line 37
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->z:Lm6/a;

    .line 48
    .line 49
    invoke-virtual {p1}, Lm6/a;->f()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lu6/a;->a(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lu6/a;->b(Ljava/util/ArrayList;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->k2(Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    iput-boolean p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->w:Z

    .line 13
    .line 14
    sget p2, Lcom/luck/picture/lib/R$id;->tv_data_empty:I

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 23
    .line 24
    sget p2, Lcom/luck/picture/lib/R$id;->ps_complete_select:I

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 31
    .line 32
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 33
    .line 34
    sget p2, Lcom/luck/picture/lib/R$id;->title_bar:I

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Lcom/luck/picture/lib/widget/TitleBar;

    .line 41
    .line 42
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->o:Lcom/luck/picture/lib/widget/TitleBar;

    .line 43
    .line 44
    sget p2, Lcom/luck/picture/lib/R$id;->bottom_nar_bar:I

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 51
    .line 52
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->p:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 53
    .line 54
    sget p2, Lcom/luck/picture/lib/R$id;->tv_current_data_time:I

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Landroid/widget/TextView;

    .line 61
    .line 62
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->r:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->i2()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->W1()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->a2()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->Y1()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->Z1(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->X1()V

    .line 80
    .line 81
    .line 82
    iget-boolean p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->w:Z

    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->l2()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->o2()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final p2(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->U()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-lez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Lcom/luck/picture/lib/PictureSelectorFragment$j;

    .line 16
    .line 17
    invoke-direct {v3, p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment$j;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->q2(Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final q2(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->J0(J)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->F0(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->i(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lu6/a;->e()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lu6/a;->f()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->m2()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->d()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->t2()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment;->V1()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final r2()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->getFirstVisiblePosition()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-le v2, v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/luck/picture/lib/entity/LocalMedia;->o()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    cmp-long v2, v2, v4

    .line 41
    .line 42
    if-lez v2, :cond_0

    .line 43
    .line 44
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->r:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->o()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    invoke-static {v3, v0, v1}, La7/d;->e(Landroid/content/Context;J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void
.end method

.method public final s2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->r:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    cmpl-float v0, v0, v1

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->r:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide/16 v1, 0x96

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alphaBy(F)Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public final t2()V
    .locals 4

    .line 1
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lu6/a;->j()Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 40
    .line 41
    sget v1, Lcom/luck/picture/lib/R$drawable;->ps_ic_no_data:I

    .line 42
    .line 43
    invoke-virtual {v0, v2, v1, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 47
    .line 48
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 49
    .line 50
    invoke-static {}, Ll6/d;->b()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-ne v0, v1, :cond_3

    .line 55
    .line 56
    sget v0, Lcom/luck/picture/lib/R$string;->ps_audio_empty:I

    .line 57
    .line 58
    :goto_1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    sget v0, Lcom/luck/picture/lib/R$string;->ps_empty:I

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :goto_2
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->n:Landroid/widget/TextView;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public x0(ZLcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->p:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/BottomNavBar;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->q:Lcom/luck/picture/lib/widget/CompleteSelectView;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/CompleteSelectView;->setSelectedChange(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->N1(Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 19
    .line 20
    iget p2, p2, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->f(I)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->m:Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 26
    .line 27
    new-instance v0, Lcom/luck/picture/lib/PictureSelectorFragment$i;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/PictureSelectorFragment$i;-><init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 30
    .line 31
    .line 32
    sget v1, Lcom/luck/picture/lib/PictureSelectorFragment;->C:I

    .line 33
    .line 34
    int-to-long v1, v1

    .line 35
    invoke-virtual {p2, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment;->y:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 40
    .line 41
    iget p2, p2, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->f(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    if-nez p1, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->F0(Z)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method
