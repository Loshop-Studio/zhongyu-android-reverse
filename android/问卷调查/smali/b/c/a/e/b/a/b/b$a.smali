.class public Lb/c/a/e/b/a/b/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/t/a/b$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/a/e/b/a/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:F

.field public c:F

.field public final synthetic d:Lb/c/a/e/b/a/b/b;


# direct methods
.method public constructor <init>(Lb/c/a/e/b/a/b/b;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lb/c/a/e/b/a/b/b$a;->b:F

    iput p1, p0, Lb/c/a/e/b/a/b/b$a;->c:F

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 1
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    .line 2
    invoke-virtual {v0, p1}, Lb/c/a/e/b/a/b/a;->k(I)I

    move-result p1

    iget v0, p0, Lb/c/a/e/b/a/b/b$a;->c:F

    int-to-float v1, p1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iput v1, p0, Lb/c/a/e/b/a/b/b$a;->c:F

    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 3
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 5
    iget-object v1, v1, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 7
    iget-object v1, v1, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    .line 8
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/t/a/b$i;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, La/t/a/b$i;->a(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(IFI)V
    .locals 9

    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 1
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0, p1}, Lb/c/a/e/b/a/b/a;->k(I)I

    move-result v0

    cmpl-float v3, p2, v1

    if-nez v3, :cond_1

    iget v3, p0, Lb/c/a/e/b/a/b/b$a;->b:F

    cmpl-float v3, v3, v1

    if-nez v3, :cond_1

    if-eqz p1, :cond_0

    iget-object v3, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 3
    iget-object v3, v3, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    .line 4
    invoke-virtual {v3}, Lb/c/a/e/b/a/b/a;->c()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne p1, v3, :cond_1

    :cond_0
    iget-object p1, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    invoke-virtual {p1, v0, v2}, Lb/c/a/e/b/a/b/b;->x(IZ)V

    :cond_1
    move p1, v0

    :cond_2
    iput p2, p0, Lb/c/a/e/b/a/b/b$a;->b:F

    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 5
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Lb/c/a/e/b/a/b/a;->j()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    :goto_0
    iget-object v3, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 7
    iget-object v3, v3, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    if-eqz v3, :cond_7

    move v3, v2

    .line 8
    :goto_1
    iget-object v4, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 9
    iget-object v4, v4, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    .line 10
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    iget-object v4, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 11
    iget-object v4, v4, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    .line 12
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/t/a/b$i;

    if-eqz v4, :cond_6

    if-eq p1, v0, :cond_4

    invoke-interface {v4, p1, p2, p3}, La/t/a/b$i;->b(IFI)V

    goto :goto_2

    :cond_4
    float-to-double v5, p2

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    cmpl-double v5, v5, v7

    if-lez v5, :cond_5

    invoke-interface {v4, v2, v1, v2}, La/t/a/b$i;->b(IFI)V

    goto :goto_2

    :cond_5
    invoke-interface {v4, p1, v1, v2}, La/t/a/b$i;->b(IFI)V

    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    return-void
.end method

.method public c(I)V
    .locals 4

    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 1
    iget-object v1, v0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 2
    invoke-static {v0}, Lb/c/a/e/b/a/b/b;->z(Lb/c/a/e/b/a/b/b;)I

    move-result v0

    iget-object v1, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 3
    iget-object v1, v1, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    .line 4
    invoke-virtual {v1, v0}, Lb/c/a/e/b/a/b/a;->k(I)I

    move-result v1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    iget-object v3, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 5
    iget-object v3, v3, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    .line 6
    invoke-virtual {v3}, Lb/c/a/e/b/a/b/a;->c()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v0, v3, :cond_1

    :cond_0
    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    invoke-virtual {v0, v1, v2}, Lb/c/a/e/b/a/b/b;->x(IZ)V

    :cond_1
    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 7
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 8
    :goto_0
    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 9
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lb/c/a/e/b/a/b/b$a;->d:Lb/c/a/e/b/a/b/b;

    .line 11
    iget-object v0, v0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    .line 12
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/t/a/b$i;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, La/t/a/b$i;->c(I)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
