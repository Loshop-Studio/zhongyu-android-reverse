.class public final Lf/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Lf/d;

.field public g:Lf/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lf/d;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf/d;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf/d;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/d;->a:[B

    iput p2, p0, Lf/d;->b:I

    iput p3, p0, Lf/d;->c:I

    iput-boolean p4, p0, Lf/d;->d:Z

    iput-boolean p5, p0, Lf/d;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lf/d;
    .locals 4

    iget-object v0, p0, Lf/d;->f:Lf/d;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lf/d;->g:Lf/d;

    invoke-static {v2}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v3, p0, Lf/d;->f:Lf/d;

    iput-object v3, v2, Lf/d;->f:Lf/d;

    iget-object v2, p0, Lf/d;->f:Lf/d;

    invoke-static {v2}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iget-object v3, p0, Lf/d;->g:Lf/d;

    iput-object v3, v2, Lf/d;->g:Lf/d;

    iput-object v1, p0, Lf/d;->f:Lf/d;

    iput-object v1, p0, Lf/d;->g:Lf/d;

    return-object v0
.end method

.method public final b(Lf/d;)Lf/d;
    .locals 1

    const-string v0, "segment"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lf/d;->g:Lf/d;

    iget-object v0, p0, Lf/d;->f:Lf/d;

    iput-object v0, p1, Lf/d;->f:Lf/d;

    iget-object v0, p0, Lf/d;->f:Lf/d;

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    iput-object p1, v0, Lf/d;->g:Lf/d;

    iput-object p1, p0, Lf/d;->f:Lf/d;

    return-object p1
.end method

.method public final c()Lf/d;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf/d;->d:Z

    new-instance v0, Lf/d;

    iget-object v2, p0, Lf/d;->a:[B

    iget v3, p0, Lf/d;->b:I

    iget v4, p0, Lf/d;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lf/d;-><init>([BIIZZ)V

    return-object v0
.end method

.method public final d(Lf/d;I)V
    .locals 7

    const-string v0, "sink"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lf/d;->e:Z

    if-eqz v0, :cond_3

    iget v5, p1, Lf/d;->c:I

    add-int v0, v5, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    iget-boolean v0, p1, Lf/d;->d:Z

    if-nez v0, :cond_1

    add-int v0, v5, p2

    iget v4, p1, Lf/d;->b:I

    sub-int/2addr v0, v4

    if-gt v0, v1, :cond_0

    iget-object v2, p1, Lf/d;->a:[B

    const/4 v3, 0x0

    const/4 v6, 0x2

    move-object v1, v2

    invoke-static/range {v1 .. v6}, Ld/e/e;->b([B[BIIII)[B

    iget v0, p1, Lf/d;->c:I

    iget v1, p1, Lf/d;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Lf/d;->c:I

    const/4 v0, 0x0

    iput v0, p1, Lf/d;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lf/d;->a:[B

    iget-object v1, p1, Lf/d;->a:[B

    iget v2, p1, Lf/d;->c:I

    iget v3, p0, Lf/d;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Ld/e/e;->a([B[BIII)[B

    iget v0, p1, Lf/d;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lf/d;->c:I

    iget p1, p0, Lf/d;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lf/d;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
