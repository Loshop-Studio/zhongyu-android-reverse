.class public abstract Lea/c;
.super Lda/a;
.source "SourceFile"


# instance fields
.field public i:Lga/d;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/Integer;

.field public l:F

.field public m:F

.field public n:Landroid/graphics/Paint;

.field public o:Landroid/graphics/Path;

.field public p:Landroid/graphics/Path;

.field public final q:Landroid/graphics/Matrix;

.field public final r:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p4, p5}, Lda/a;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lea/c;->i:Lga/d;

    .line 15
    .line 16
    iput-object p4, p0, Lea/c;->j:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p5, p0, Lea/c;->k:Ljava/lang/Integer;

    .line 19
    .line 20
    const/high16 p1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iput p1, p0, Lea/c;->l:F

    .line 23
    .line 24
    new-instance p1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance p1, Landroid/graphics/Matrix;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lea/c;->q:Landroid/graphics/Matrix;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final A()F
    .locals 1

    .line 1
    iget v0, p0, Lea/c;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final B()F
    .locals 1

    .line 1
    iget v0, p0, Lea/c;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public final C()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Lga/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->i:Lga/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->q:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 3

    .line 1
    iget-object v0, p0, Lea/c;->i:Lga/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lea/c;->w()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lea/c;->x()Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lea/c;->i:Lga/d;

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lea/c;->w()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lea/c;->x()Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v0, v1, v2}, Lga/d;->a(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    return-object v0
.end method

.method public H()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lea/c;->G()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "it.touchEventList"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lea/c;->Q(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lna/l;->a:Lna/l;

    .line 20
    .line 21
    iget-object v2, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lna/l;->c(Ljava/util/List;)Landroid/graphics/Path;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0, v1}, Lea/c;->S(Landroid/graphics/Path;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "it.paint"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lea/c;->R(Lcom/zykj/board/EzyPaint$Paint;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lea/c;->v()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final I()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v2, 0xff

    .line 15
    .line 16
    if-ge v0, v2, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    return v1
.end method

.method public final J(FFFF)F
    .locals 0

    .line 1
    sub-float/2addr p1, p3

    .line 2
    mul-float/2addr p1, p1

    .line 3
    sub-float/2addr p2, p4

    .line 4
    mul-float/2addr p2, p2

    .line 5
    add-float/2addr p1, p2

    .line 6
    float-to-double p1, p1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    double-to-float p1, p1

    .line 12
    return p1
.end method

.method public final K(FFFFFF)F
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lea/c;->J(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1, p2, p5, p6}, Lea/c;->J(FFFF)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p3, p4, p5, p6}, Lea/c;->J(FFFF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    mul-float p3, p2, p2

    .line 14
    .line 15
    mul-float p4, v0, v0

    .line 16
    .line 17
    mul-float p5, p1, p1

    .line 18
    .line 19
    add-float p6, p4, p5

    .line 20
    .line 21
    cmpl-float p6, p3, p6

    .line 22
    .line 23
    if-ltz p6, :cond_0

    .line 24
    .line 25
    return p1

    .line 26
    :cond_0
    add-float/2addr p4, p3

    .line 27
    cmpl-float p3, p5, p4

    .line 28
    .line 29
    if-ltz p3, :cond_1

    .line 30
    .line 31
    return p2

    .line 32
    :cond_1
    add-float p3, v0, p1

    .line 33
    .line 34
    add-float/2addr p3, p2

    .line 35
    const/4 p4, 0x2

    .line 36
    int-to-float p4, p4

    .line 37
    div-float/2addr p3, p4

    .line 38
    sub-float p5, p3, v0

    .line 39
    .line 40
    mul-float/2addr p5, p3

    .line 41
    sub-float p1, p3, p1

    .line 42
    .line 43
    mul-float/2addr p5, p1

    .line 44
    sub-float/2addr p3, p2

    .line 45
    mul-float/2addr p5, p3

    .line 46
    float-to-double p1, p5

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    double-to-float p1, p1

    .line 52
    mul-float/2addr p4, p1

    .line 53
    div-float/2addr p4, v0

    .line 54
    return p4
.end method

.method public final L(Landroid/graphics/Paint;FF)V
    .locals 1

    .line 1
    const-string v0, "paint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    cmpg-float v0, p3, p1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    cmpg-float p1, p2, p1

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    :goto_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 19
    .line 20
    :cond_1
    iput p2, p0, Lea/c;->l:F

    .line 21
    .line 22
    iput p3, p0, Lea/c;->m:F

    .line 23
    .line 24
    return-void
.end method

.method public final M(Landroid/graphics/Path;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 2
    .line 3
    return-void
.end method

.method public N(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea/c;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public O(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea/c;->k:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final P(Lga/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea/c;->i:Lga/d;

    .line 2
    .line 3
    return-void
.end method

.method public final Q(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 12
    .line 13
    check-cast p1, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final R(Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 2

    .line 1
    const-string v0, "paint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {p1}, Lna/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    cmpg-float v0, v0, v1

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    cmpg-float v0, v0, v1

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :goto_1
    iput v0, p0, Lea/c;->l:F

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iput p1, p0, Lea/c;->m:F

    .line 49
    .line 50
    return-void
.end method

.method public final S(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 4

    .line 1
    invoke-super {p0}, Lda/a;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v2, p0, Lea/c;->l:F

    .line 10
    .line 11
    iget v3, p0, Lea/c;->m:F

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, Lna/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->R(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v0
.end method

.method public j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    iget-object v0, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lea/c;->H()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 35
    .line 36
    .line 37
    :cond_3
    new-instance p1, Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 48
    .line 49
    .line 50
    :cond_4
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 51
    .line 52
    iget-object v1, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    goto :goto_0

    .line 62
    :cond_5
    move v1, v2

    .line 63
    :goto_0
    sub-float/2addr v0, v1

    .line 64
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 65
    .line 66
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 67
    .line 68
    iget-object v1, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    goto :goto_1

    .line 77
    :cond_6
    move v1, v2

    .line 78
    :goto_1
    sub-float/2addr v0, v1

    .line 79
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 80
    .line 81
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 82
    .line 83
    iget-object v1, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 84
    .line 85
    if-eqz v1, :cond_7

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_2

    .line 92
    :cond_7
    move v1, v2

    .line 93
    :goto_2
    add-float/2addr v0, v1

    .line 94
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 95
    .line 96
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 97
    .line 98
    iget-object v1, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 99
    .line 100
    if-eqz v1, :cond_8

    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    :cond_8
    add-float/2addr v0, v2

    .line 107
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 108
    .line 109
    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lba/a;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 6
    .line 7
    iput-object v0, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 8
    .line 9
    iput-object v0, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 10
    .line 11
    return-void
.end method

.method public q(FFF)Z
    .locals 14

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [F

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput p1, v2, v3

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    aput p2, v2, p1

    .line 13
    .line 14
    iget-object v4, p0, Lea/c;->q:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lea/c;->q:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v5}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lea/c;->q:Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {v4, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Lea/c;->G()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    iget-object v5, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ljava/util/Collection;

    .line 58
    .line 59
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-object v4, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    sub-int/2addr v4, p1

    .line 69
    move v5, v3

    .line 70
    :cond_1
    if-ge v5, v4, :cond_2

    .line 71
    .line 72
    iget-object v6, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 79
    .line 80
    invoke-virtual {v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    iget-object v6, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 91
    .line 92
    invoke-virtual {v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    iget-object v6, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    check-cast v6, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 105
    .line 106
    invoke-virtual {v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    iget-object v6, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 117
    .line 118
    invoke-virtual {v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    aget v12, v2, v3

    .line 123
    .line 124
    aget v13, v2, p1

    .line 125
    .line 126
    move-object v7, p0

    .line 127
    invoke-virtual/range {v7 .. v13}, Lea/c;->K(FFFFFF)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    cmpg-float v6, v6, p3

    .line 132
    .line 133
    if-gtz v6, :cond_1

    .line 134
    .line 135
    return p1

    .line 136
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v2, "\u6d88\u8017\u65f6\u95f4D >> "

    .line 142
    .line 143
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    sub-long/2addr v4, v0

    .line 151
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const-string v0, "deleteGraph"

    .line 159
    .line 160
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    return v3
.end method

.method public v()V
    .locals 5

    .line 1
    iget-object v0, p0, Lea/c;->o:Landroid/graphics/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lba/a;->b()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lea/c;->p:Landroid/graphics/Path;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lba/a;->d()Landroid/graphics/RectF;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lba/a;->d()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 31
    .line 32
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    cmpg-float v2, v1, v2

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v4, 0x0

    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    cmpg-float v2, v1, v4

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    int-to-float v2, v3

    .line 46
    sub-float/2addr v1, v2

    .line 47
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    :cond_3
    :goto_0
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 52
    .line 53
    cmpg-float v2, v1, v2

    .line 54
    .line 55
    if-nez v2, :cond_5

    .line 56
    .line 57
    cmpg-float v2, v1, v4

    .line 58
    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    int-to-float v2, v3

    .line 63
    sub-float/2addr v1, v2

    .line 64
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 65
    .line 66
    :cond_5
    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->k:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/c;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method
