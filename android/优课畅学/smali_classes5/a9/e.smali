.class public La9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/n;
.implements Lb9/c;


# instance fields
.field public final a:La9/f;

.field public b:I

.field public c:La9/e;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La9/e;->b:I

    .line 6
    .line 7
    iput v0, p0, La9/e;->e:I

    .line 8
    .line 9
    new-instance v0, La9/f;

    .line 10
    .line 11
    invoke-direct {v0}, La9/f;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La9/e;->a:La9/f;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La9/e;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, La9/e;->a:La9/f;

    .line 2
    .line 3
    iget v0, v0, La9/f;->f:I

    .line 4
    .line 5
    return v0
.end method

.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La9/e;->j()La9/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La9/e;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, La9/e;->a:La9/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La9/f;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput v0, p0, La9/e;->b:I

    .line 10
    .line 11
    iput v0, p0, La9/e;->e:I

    .line 12
    .line 13
    return-void
.end method

.method public declared-synchronized e()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, La9/e;->e:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iput v0, p0, La9/e;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, La9/e;->a:La9/f;

    .line 2
    .line 3
    iget v0, v0, La9/f;->e:I

    .line 4
    .line 5
    return v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La9/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La9/e;->l(La9/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La9/e;->i()La9/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(IIIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/e;->a:La9/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, La9/f;->a(IIIZ)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La9/e;->a:La9/f;

    .line 7
    .line 8
    iget-object p1, p1, La9/f;->b:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getRowBytes()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p2, p0, La9/e;->a:La9/f;

    .line 15
    .line 16
    iget-object p2, p2, La9/f;->b:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    mul-int/2addr p1, p2

    .line 23
    iput p1, p0, La9/e;->b:I

    .line 24
    .line 25
    return-void
.end method

.method public declared-synchronized hasReferences()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, La9/e;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public i()La9/f;
    .locals 2

    .line 1
    iget-object v0, p0, La9/e;->a:La9/f;

    .line 2
    .line 3
    iget-object v1, v0, La9/f;->b:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :cond_0
    return-object v0
.end method

.method public j()La9/e;
    .locals 1

    .line 1
    iget-object v0, p0, La9/e;->c:La9/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public declared-synchronized k()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, La9/e;->e:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, La9/e;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public l(La9/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, La9/e;->c:La9/e;

    .line 2
    .line 3
    return-void
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, La9/e;->b:I

    .line 2
    .line 3
    return v0
.end method
