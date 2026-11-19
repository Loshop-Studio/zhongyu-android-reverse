.class public Lb/c/a/e/b/a/b/b;
.super La/t/a/b;
.source ""


# instance fields
.field public d0:Lb/c/a/e/b/a/b/a;

.field public e0:Z

.field public f0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/t/a/b$i;",
            ">;"
        }
    .end annotation
.end field

.field public g0:La/t/a/b$i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, La/t/a/b;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb/c/a/e/b/a/b/b;->e0:Z

    new-instance p1, Lb/c/a/e/b/a/b/b$a;

    invoke-direct {p1, p0}, Lb/c/a/e/b/a/b/b$a;-><init>(Lb/c/a/e/b/a/b/b;)V

    iput-object p1, p0, Lb/c/a/e/b/a/b/b;->g0:La/t/a/b$i;

    invoke-virtual {p0}, Lb/c/a/e/b/a/b/b;->A()V

    return-void
.end method

.method public static synthetic z(Lb/c/a/e/b/a/b/b;)I
    .locals 0

    invoke-super {p0}, La/t/a/b;->getCurrentItem()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A()V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->g0:La/t/a/b$i;

    if-eqz v0, :cond_0

    .line 1
    iget-object v1, p0, La/t/a/b;->S:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2
    :cond_0
    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->g0:La/t/a/b$i;

    invoke-super {p0, v0}, La/t/a/b;->b(La/t/a/b$i;)V

    return-void
.end method

.method public b(La/t/a/b$i;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->f0:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getAdapter()La/t/a/a;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    :cond_0
    return-object v0
.end method

.method public getCurrentItem()I
    .locals 2

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    if-eqz v0, :cond_0

    invoke-super {p0}, La/t/a/b;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lb/c/a/e/b/a/b/a;->k(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getPageAdapterWrapper()La/t/a/a;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    return-object v0
.end method

.method public setAdapter(La/t/a/a;)V
    .locals 1

    new-instance v0, Lb/c/a/e/b/a/b/a;

    invoke-direct {v0, p1}, Lb/c/a/e/b/a/b/a;-><init>(La/t/a/a;)V

    iput-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    iget-boolean p1, p0, Lb/c/a/e/b/a/b/b;->e0:Z

    .line 1
    iput-boolean p1, v0, Lb/c/a/e/b/a/b/a;->e:Z

    .line 2
    invoke-super {p0, v0}, La/t/a/b;->setAdapter(La/t/a/a;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lb/c/a/e/b/a/b/b;->x(IZ)V

    return-void
.end method

.method public setBoundaryCaching(Z)V
    .locals 1

    iput-boolean p1, p0, Lb/c/a/e/b/a/b/b;->e0:Z

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    if-eqz v0, :cond_0

    .line 1
    iput-boolean p1, v0, Lb/c/a/e/b/a/b/a;->e:Z

    :cond_0
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    invoke-virtual {p0}, Lb/c/a/e/b/a/b/b;->getCurrentItem()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 1
    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    .line 2
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    add-int/2addr p1, v0

    .line 3
    invoke-super {p0, p1, v0}, La/t/a/b;->x(IZ)V

    :cond_0
    return-void
.end method

.method public setOnPageChangeListener(La/t/a/b$i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb/c/a/e/b/a/b/b;->b(La/t/a/b$i;)V

    return-void
.end method

.method public x(IZ)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/b;->d0:Lb/c/a/e/b/a/b/a;

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    .line 2
    invoke-super {p0, p1, p2}, La/t/a/b;->x(IZ)V

    return-void
.end method
