.class public Lb/c/a/e/b/a/b/a;
.super La/t/a/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/a/e/b/a/b/a$a;
    }
.end annotation


# instance fields
.field public c:La/t/a/a;

.field public d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lb/c/a/e/b/a/b/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z


# direct methods
.method public constructor <init>(La/t/a/a;)V
    .locals 1

    invoke-direct {p0}, La/t/a/a;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lb/c/a/e/b/a/b/a;->d:Landroid/util/SparseArray;

    iput-object p1, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb/c/a/e/b/a/b/a;->j()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    .line 2
    iget-object v2, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    instance-of v2, v2, La/k/b/h0;

    if-nez v2, :cond_0

    invoke-virtual {p0, p2}, Lb/c/a/e/b/a/b/a;->k(I)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    iget-boolean v3, p0, Lb/c/a/e/b/a/b/a;->e:Z

    if-eqz v3, :cond_2

    if-eq p2, v1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->d:Landroid/util/SparseArray;

    new-instance v1, Lb/c/a/e/b/a/b/a$a;

    invoke-direct {v1, p1, v2, p3}, Lb/c/a/e/b/a/b/a$a;-><init>(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {p2, p1, v2, p3}, La/t/a/a;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public b(Landroid/view/ViewGroup;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0, p1}, La/t/a/a;->b(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0}, La/t/a/a;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public d(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    instance-of v0, v0, La/k/b/h0;

    if-nez v0, :cond_0

    invoke-virtual {p0, p2}, Lb/c/a/e/b/a/b/a;->k(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    iget-boolean v1, p0, Lb/c/a/e/b/a/b/a;->e:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb/c/a/e/b/a/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/c/a/e/b/a/b/a$a;

    if-eqz v1, :cond_1

    iget-object p1, p0, Lb/c/a/e/b/a/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->remove(I)V

    iget-object p1, v1, Lb/c/a/e/b/a/b/a$a;->a:Ljava/lang/Object;

    return-object p1

    :cond_1
    iget-object p2, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {p2, p1, v0}, La/t/a/a;->d(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0, p1, p2}, La/t/a/a;->e(Landroid/view/View;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0, p1, p2}, La/t/a/a;->f(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public g()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0}, La/t/a/a;->g()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public h(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0, p1, p2, p3}, La/t/a/a;->h(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    return-void
.end method

.method public i(Landroid/view/ViewGroup;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0, p1}, La/t/a/a;->i(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/b/a;->c:La/t/a/a;

    invoke-virtual {v0}, La/t/a/a;->c()I

    move-result v0

    return v0
.end method

.method public k(I)I
    .locals 1

    invoke-virtual {p0}, Lb/c/a/e/b/a/b/a;->j()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    rem-int/2addr p1, v0

    if-gez p1, :cond_1

    add-int/2addr p1, v0

    :cond_1
    return p1
.end method
