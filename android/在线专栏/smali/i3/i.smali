.class final Li3/i;
.super Lj3/a;
.source "SourceFile"

# interfaces
.implements Li3/e;
.implements Li3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li3/i$a;,
        Li3/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj3/a<",
        "Li3/k;",
        ">;",
        "Li3/e<",
        "TT;>;",
        "Li3/a;"
    }
.end annotation


# instance fields
.field private final e:I

.field private final f:I

.field private final g:Lh3/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private h:[Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private i:J

.field private j:J

.field private k:I

.field private l:I


# direct methods
.method public constructor <init>(IILh3/a;)V
    .locals 0
    .param p3    # Lh3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lj3/a;-><init>()V

    .line 2
    iput p1, p0, Li3/i;->e:I

    .line 3
    iput p2, p0, Li3/i;->f:I

    .line 4
    iput-object p3, p0, Li3/i;->g:Lh3/a;

    return-void
.end method

.method private final B()V
    .locals 5

    .line 1
    iget-object v0, p0, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 2
    iget v0, p0, Li3/i;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Li3/i;->k:I

    .line 3
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 4
    iget-wide v2, p0, Li3/i;->i:J

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    iput-wide v0, p0, Li3/i;->i:J

    .line 5
    :cond_0
    iget-wide v2, p0, Li3/i;->j:J

    cmp-long v4, v2, v0

    if-gez v4, :cond_1

    invoke-direct {p0, v0, v1}, Li3/i;->y(J)V

    :cond_1
    return-void
.end method

.method private final C(Ljava/lang/Object;Lq2/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v6, Lf3/m;

    invoke-static {p2}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object v0

    const/4 v7, 0x1

    invoke-direct {v6, v0, v7}, Lf3/m;-><init>(Lq2/d;I)V

    .line 2
    invoke-virtual {v6}, Lf3/m;->v()V

    .line 3
    sget-object v8, Lj3/b;->a:[Lq2/d;

    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    invoke-static {p0, p1}, Li3/i;->t(Li3/i;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object p1, Lo2/r;->a:Lo2/r;

    sget-object v0, Lo2/l;->a:Lo2/l$a;

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v6, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    .line 7
    invoke-static {p0, v8}, Li3/i;->n(Li3/i;[Lq2/d;)[Lq2/d;

    move-result-object p1

    const/4 v0, 0x0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v9, Li3/i$a;

    invoke-static {p0}, Li3/i;->p(Li3/i;)J

    move-result-wide v0

    invoke-static {p0}, Li3/i;->r(Li3/i;)I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v0

    move-object v0, v9

    move-object v1, p0

    move-object v4, p1

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Li3/i$a;-><init>(Li3/i;JLjava/lang/Object;Lq2/d;)V

    .line 9
    invoke-static {p0, v9}, Li3/i;->m(Li3/i;Ljava/lang/Object;)V

    .line 10
    invoke-static {p0}, Li3/i;->q(Li3/i;)I

    move-result p1

    add-int/2addr p1, v7

    invoke-static {p0, p1}, Li3/i;->s(Li3/i;I)V

    .line 11
    invoke-static {p0}, Li3/i;->o(Li3/i;)I

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0, v8}, Li3/i;->n(Li3/i;[Lq2/d;)[Lq2/d;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p1, v8

    move-object v0, v9

    .line 12
    :goto_0
    monitor-exit p0

    if-nez v0, :cond_2

    goto :goto_1

    .line 13
    :cond_2
    invoke-static {v6, v0}, Lf3/n;->a(Lf3/l;Lf3/w0;)V

    :goto_1
    const/4 v0, 0x0

    .line 14
    array-length v1, p1

    :goto_2
    if-ge v0, v1, :cond_4

    aget-object v2, p1, v0

    add-int/lit8 v0, v0, 0x1

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    sget-object v3, Lo2/r;->a:Lo2/r;

    sget-object v4, Lo2/l;->a:Lo2/l$a;

    invoke-static {v3}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    .line 15
    :cond_4
    invoke-virtual {v6}, Lf3/m;->s()Ljava/lang/Object;

    move-result-object p1

    .line 16
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_5

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lq2/d;)V

    .line 17
    :cond_5
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_6

    return-object p1

    :cond_6
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1

    :catchall_0
    move-exception p1

    .line 18
    monitor-exit p0

    throw p1
.end method

.method private final D(Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Li3/i;->K()I

    move-result v0

    .line 2
    iget-object v1, p0, Li3/i;->h:[Ljava/lang/Object;

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 3
    invoke-direct {p0, v1, v3, v2}, Li3/i;->L([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 4
    :cond_0
    array-length v3, v1

    if-lt v0, v3, :cond_1

    array-length v3, v1

    mul-int/lit8 v3, v3, 0x2

    invoke-direct {p0, v1, v0, v3}, Li3/i;->L([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    .line 5
    :cond_1
    :goto_0
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v2

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-static {v1, v2, v3, p1}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method private final E([Lq2/d;)[Lq2/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lq2/d<",
            "Lo2/r;",
            ">;)[",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p0}, Lj3/a;->d(Lj3/a;)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    invoke-static {p0}, Lj3/a;->e(Lj3/a;)[Lj3/c;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_2

    .line 4
    :cond_1
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    if-eqz v4, :cond_5

    .line 5
    check-cast v4, Li3/k;

    .line 6
    iget-object v5, v4, Li3/k;->b:Lq2/d;

    if-nez v5, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    invoke-direct {p0, v4}, Li3/i;->P(Li3/k;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-gez v10, :cond_3

    goto :goto_1

    .line 8
    :cond_3
    array-length v6, p1

    if-lt v0, v6, :cond_4

    array-length v6, p1

    const/4 v7, 0x2

    mul-int/lit8 v6, v6, 0x2

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v6, "java.util.Arrays.copyOf(this, newSize)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    :cond_4
    move-object v6, p1

    check-cast v6, [Lq2/d;

    add-int/lit8 v7, v0, 0x1

    aput-object v5, v6, v0

    const/4 v0, 0x0

    .line 10
    iput-object v0, v4, Li3/k;->b:Lq2/d;

    move v0, v7

    :cond_5
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_6
    :goto_2
    check-cast p1, [Lq2/d;

    return-object p1
.end method

.method private final F()J
    .locals 4

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v0

    iget v2, p0, Li3/i;->k:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final G()J
    .locals 4

    iget-wide v0, p0, Li3/i;->j:J

    iget-wide v2, p0, Li3/i;->i:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private final H(J)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    invoke-static {v0, p1, p2}, Li3/j;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of p2, p1, Li3/i$a;

    if-eqz p2, :cond_0

    check-cast p1, Li3/i$a;

    iget-object p1, p1, Li3/i$a;->c:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private final I()J
    .locals 4

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v0

    iget v2, p0, Li3/i;->k:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget v2, p0, Li3/i;->l:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final J()I
    .locals 4

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v0

    iget v2, p0, Li3/i;->k:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-wide v2, p0, Li3/i;->i:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method private final K()I
    .locals 2

    iget v0, p0, Li3/i;->k:I

    iget v1, p0, Li3/i;->l:I

    add-int/2addr v0, v1

    return v0
.end method

.method private final L([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    if-lez p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    .line 1
    new-array p3, p3, [Ljava/lang/Object;

    iput-object p3, p0, Li3/i;->h:[Ljava/lang/Object;

    if-nez p1, :cond_1

    return-object p3

    .line 2
    :cond_1
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v1

    if-lez p2, :cond_3

    :goto_1
    add-int/lit8 v3, v0, 0x1

    int-to-long v4, v0

    add-long/2addr v4, v1

    .line 3
    invoke-static {p1, v4, v5}, Li3/j;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3, v4, v5, v0}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    if-lt v3, p2, :cond_2

    goto :goto_2

    :cond_2
    move v0, v3

    goto :goto_1

    :cond_3
    :goto_2
    return-object p3

    .line 4
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Buffer size overflow"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final N(Ljava/lang/Object;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lj3/a;->j()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Li3/i;->O(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 2
    :cond_0
    iget v0, p0, Li3/i;->k:I

    iget v1, p0, Li3/i;->f:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_3

    iget-wide v0, p0, Li3/i;->j:J

    iget-wide v3, p0, Li3/i;->i:J

    cmp-long v5, v0, v3

    if-gtz v5, :cond_3

    .line 3
    iget-object v0, p0, Li3/i;->g:Lh3/a;

    sget-object v1, Li3/i$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    const/4 p1, 0x0

    return p1

    .line 4
    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Li3/i;->D(Ljava/lang/Object;)V

    .line 5
    iget p1, p0, Li3/i;->k:I

    add-int/2addr p1, v2

    iput p1, p0, Li3/i;->k:I

    .line 6
    iget v0, p0, Li3/i;->f:I

    if-le p1, v0, :cond_4

    invoke-direct {p0}, Li3/i;->B()V

    .line 7
    :cond_4
    invoke-direct {p0}, Li3/i;->J()I

    move-result p1

    iget v0, p0, Li3/i;->e:I

    if-le p1, v0, :cond_5

    .line 8
    iget-wide v0, p0, Li3/i;->i:J

    const-wide/16 v3, 0x1

    add-long v6, v0, v3

    iget-wide v8, p0, Li3/i;->j:J

    invoke-direct {p0}, Li3/i;->F()J

    move-result-wide v10

    invoke-direct {p0}, Li3/i;->I()J

    move-result-wide v12

    move-object v5, p0

    invoke-direct/range {v5 .. v13}, Li3/i;->R(JJJJ)V

    :cond_5
    return v2
.end method

.method private final O(Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget v0, p0, Li3/i;->e:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Li3/i;->D(Ljava/lang/Object;)V

    .line 3
    iget p1, p0, Li3/i;->k:I

    add-int/2addr p1, v1

    iput p1, p0, Li3/i;->k:I

    .line 4
    iget v0, p0, Li3/i;->e:I

    if-le p1, v0, :cond_1

    invoke-direct {p0}, Li3/i;->B()V

    .line 5
    :cond_1
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v2

    iget p1, p0, Li3/i;->k:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, Li3/i;->j:J

    return v1
.end method

.method private final P(Li3/k;)J
    .locals 6

    .line 1
    iget-wide v0, p1, Li3/k;->a:J

    .line 2
    invoke-direct {p0}, Li3/i;->F()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-wide v0

    .line 3
    :cond_0
    iget p1, p0, Li3/i;->f:I

    const-wide/16 v2, -0x1

    if-lez p1, :cond_1

    return-wide v2

    .line 4
    :cond_1
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v4

    cmp-long p1, v0, v4

    if-lez p1, :cond_2

    return-wide v2

    .line 5
    :cond_2
    iget p1, p0, Li3/i;->l:I

    if-nez p1, :cond_3

    return-wide v2

    :cond_3
    return-wide v0
.end method

.method private final Q(Li3/k;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lj3/b;->a:[Lq2/d;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    invoke-direct {p0, p1}, Li3/i;->P(Li3/k;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    .line 4
    sget-object p1, Li3/j;->a:Lkotlinx/coroutines/internal/t;

    goto :goto_0

    .line 5
    :cond_0
    iget-wide v3, p1, Li3/k;->a:J

    .line 6
    invoke-direct {p0, v1, v2}, Li3/i;->H(J)Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    .line 7
    iput-wide v1, p1, Li3/k;->a:J

    .line 8
    invoke-virtual {p0, v3, v4}, Li3/i;->S(J)[Lq2/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    .line 9
    :goto_0
    monitor-exit p0

    const/4 v1, 0x0

    .line 10
    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    sget-object v4, Lo2/r;->a:Lo2/r;

    sget-object v5, Lo2/l;->a:Lo2/l$a;

    invoke-static {v4}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    return-object p1

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p0

    throw p1
.end method

.method private final R(JJJJ)V
    .locals 13

    move-object v0, p0

    move-wide v1, p1

    move-wide/from16 v3, p3

    .line 1
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    .line 2
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v7

    cmp-long v9, v7, v5

    if-gez v9, :cond_1

    :goto_0
    const-wide/16 v9, 0x1

    add-long/2addr v9, v7

    iget-object v11, v0, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-static {v11, v7, v8, v12}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    cmp-long v7, v9, v5

    if-ltz v7, :cond_0

    goto :goto_1

    :cond_0
    move-wide v7, v9

    goto :goto_0

    .line 3
    :cond_1
    :goto_1
    iput-wide v1, v0, Li3/i;->i:J

    .line 4
    iput-wide v3, v0, Li3/i;->j:J

    sub-long v1, p5, v5

    long-to-int v2, v1

    .line 5
    iput v2, v0, Li3/i;->k:I

    sub-long v1, p7, p5

    long-to-int v2, v1

    .line 6
    iput v2, v0, Li3/i;->l:I

    return-void
.end method

.method public static final synthetic l(Li3/i;Li3/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Li3/i;->w(Li3/i$a;)V

    return-void
.end method

.method public static final synthetic m(Li3/i;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Li3/i;->D(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic n(Li3/i;[Lq2/d;)[Lq2/d;
    .locals 0

    invoke-direct {p0, p1}, Li3/i;->E([Lq2/d;)[Lq2/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Li3/i;)I
    .locals 0

    iget p0, p0, Li3/i;->f:I

    return p0
.end method

.method public static final synthetic p(Li3/i;)J
    .locals 2

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic q(Li3/i;)I
    .locals 0

    iget p0, p0, Li3/i;->l:I

    return p0
.end method

.method public static final synthetic r(Li3/i;)I
    .locals 0

    invoke-direct {p0}, Li3/i;->K()I

    move-result p0

    return p0
.end method

.method public static final synthetic s(Li3/i;I)V
    .locals 0

    iput p1, p0, Li3/i;->l:I

    return-void
.end method

.method public static final synthetic t(Li3/i;Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0, p1}, Li3/i;->N(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic u(Li3/i;Li3/k;)J
    .locals 0

    invoke-direct {p0, p1}, Li3/i;->P(Li3/k;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final v(Li3/k;Lq2/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/k;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lf3/m;

    invoke-static {p2}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf3/m;-><init>(Lq2/d;I)V

    .line 2
    invoke-virtual {v0}, Lf3/m;->v()V

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Li3/i;->u(Li3/i;Li3/k;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    .line 5
    iput-object v0, p1, Li3/k;->b:Lq2/d;

    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lo2/r;->a:Lo2/r;

    sget-object v1, Lo2/l;->a:Lo2/l$a;

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    .line 7
    :goto_0
    sget-object p1, Lo2/r;->a:Lo2/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    .line 8
    invoke-virtual {v0}, Lf3/m;->s()Ljava/lang/Object;

    move-result-object v0

    .line 9
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lq2/d;)V

    .line 10
    :cond_1
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_2

    return-object v0

    :cond_2
    return-object p1

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p0

    throw p1
.end method

.method private final w(Li3/i$a;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p1, Li3/i$a;->b:J

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    .line 4
    iget-wide v1, p1, Li3/i$a;->b:J

    invoke-static {v0, v1, v2}, Li3/j;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v1, p1, :cond_1

    monitor-exit p0

    return-void

    .line 5
    :cond_1
    :try_start_2
    iget-wide v1, p1, Li3/i$a;->b:J

    sget-object p1, Li3/j;->a:Lkotlinx/coroutines/internal/t;

    invoke-static {v0, v1, v2, p1}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 6
    invoke-direct {p0}, Li3/i;->x()V

    .line 7
    sget-object p1, Lo2/r;->a:Lo2/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final x()V
    .locals 5

    .line 1
    iget v0, p0, Li3/i;->f:I

    if-nez v0, :cond_0

    iget v0, p0, Li3/i;->l:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    .line 3
    :goto_0
    iget v1, p0, Li3/i;->l:I

    if-lez v1, :cond_1

    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v1

    invoke-direct {p0}, Li3/i;->K()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Li3/j;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Li3/j;->a:Lkotlinx/coroutines/internal/t;

    if-ne v1, v2, :cond_1

    .line 4
    iget v1, p0, Li3/i;->l:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Li3/i;->l:I

    .line 5
    invoke-direct {p0}, Li3/i;->G()J

    move-result-wide v1

    invoke-direct {p0}, Li3/i;->K()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final y(J)V
    .locals 9

    .line 1
    invoke-static {p0}, Lj3/a;->d(Lj3/a;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {p0}, Lj3/a;->e(Lj3/a;)[Lj3/c;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    if-eqz v3, :cond_2

    .line 4
    check-cast v3, Li3/k;

    .line 5
    iget-wide v4, v3, Li3/k;->a:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_2

    cmp-long v6, v4, p1

    if-gez v6, :cond_2

    .line 6
    iput-wide p1, v3, Li3/k;->a:J

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_3
    :goto_1
    iput-wide p1, p0, Li3/i;->j:J

    return-void
.end method


# virtual methods
.method protected A(I)[Li3/k;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-array p1, p1, [Li3/k;

    return-object p1
.end method

.method public M(Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lj3/b;->a:[Lq2/d;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    invoke-direct {p0, p1}, Li3/i;->N(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 4
    invoke-direct {p0, v0}, Li3/i;->E([Lq2/d;)[Lq2/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    monitor-exit p0

    .line 6
    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    sget-object v4, Lo2/r;->a:Lo2/r;

    sget-object v5, Lo2/l;->a:Lo2/l$a;

    invoke-static {v4}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    return p1

    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    throw p1
.end method

.method public final S(J)[Lq2/d;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)[",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v9, p0

    .line 1
    iget-wide v0, v9, Li3/i;->j:J

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    sget-object v0, Lj3/b;->a:[Lq2/d;

    return-object v0

    .line 2
    :cond_0
    invoke-direct/range {p0 .. p0}, Li3/i;->G()J

    move-result-wide v0

    .line 3
    iget v2, v9, Li3/i;->k:I

    int-to-long v2, v2

    add-long/2addr v2, v0

    .line 4
    iget v4, v9, Li3/i;->f:I

    const-wide/16 v5, 0x1

    if-nez v4, :cond_1

    iget v4, v9, Li3/i;->l:I

    if-lez v4, :cond_1

    add-long/2addr v2, v5

    .line 5
    :cond_1
    invoke-static/range {p0 .. p0}, Lj3/a;->d(Lj3/a;)I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-static/range {p0 .. p0}, Lj3/a;->e(Lj3/a;)[Lj3/c;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 7
    :cond_3
    array-length v7, v4

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_5

    aget-object v11, v4, v8

    if-eqz v11, :cond_4

    .line 8
    check-cast v11, Li3/k;

    .line 9
    iget-wide v11, v11, Li3/k;->a:J

    const-wide/16 v13, 0x0

    cmp-long v15, v11, v13

    if-ltz v15, :cond_4

    cmp-long v13, v11, v2

    if-gez v13, :cond_4

    move-wide v2, v11

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 10
    :cond_5
    :goto_1
    iget-wide v7, v9, Li3/i;->j:J

    cmp-long v4, v2, v7

    if-gtz v4, :cond_6

    sget-object v0, Lj3/b;->a:[Lq2/d;

    return-object v0

    .line 11
    :cond_6
    invoke-direct/range {p0 .. p0}, Li3/i;->F()J

    move-result-wide v7

    .line 12
    invoke-virtual/range {p0 .. p0}, Lj3/a;->j()I

    move-result v4

    if-lez v4, :cond_7

    sub-long v11, v7, v2

    long-to-int v4, v11

    .line 13
    iget v11, v9, Li3/i;->l:I

    iget v12, v9, Li3/i;->f:I

    sub-int/2addr v12, v4

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v4

    goto :goto_2

    .line 14
    :cond_7
    iget v4, v9, Li3/i;->l:I

    .line 15
    :goto_2
    sget-object v11, Lj3/b;->a:[Lq2/d;

    .line 16
    iget v12, v9, Li3/i;->l:I

    int-to-long v12, v12

    add-long/2addr v12, v7

    if-lez v4, :cond_b

    .line 17
    new-array v11, v4, [Lq2/d;

    .line 18
    iget-object v14, v9, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    cmp-long v15, v7, v12

    if-gez v15, :cond_b

    move-wide/from16 v16, v7

    const/4 v15, 0x0

    :goto_3
    add-long v18, v7, v5

    .line 19
    invoke-static {v14, v7, v8}, Li3/j;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    .line 20
    sget-object v5, Li3/j;->a:Lkotlinx/coroutines/internal/t;

    if-eq v10, v5, :cond_9

    const-string v6, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    .line 21
    invoke-static {v10, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v10, Li3/i$a;

    add-int/lit8 v6, v15, 0x1

    move-wide/from16 v20, v2

    .line 22
    iget-object v2, v10, Li3/i$a;->d:Lq2/d;

    aput-object v2, v11, v15

    .line 23
    invoke-static {v14, v7, v8, v5}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 24
    iget-object v2, v10, Li3/i$a;->c:Ljava/lang/Object;

    move-wide/from16 v7, v16

    invoke-static {v14, v7, v8, v2}, Li3/j;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v2, 0x1

    add-long/2addr v7, v2

    if-lt v6, v4, :cond_8

    goto :goto_5

    :cond_8
    move v15, v6

    move-wide/from16 v16, v7

    goto :goto_4

    :cond_9
    move-wide/from16 v20, v2

    move-wide/from16 v7, v16

    :goto_4
    cmp-long v2, v18, v12

    if-ltz v2, :cond_a

    move-wide/from16 v7, v16

    goto :goto_5

    :cond_a
    move-wide/from16 v7, v18

    move-wide/from16 v2, v20

    const-wide/16 v5, 0x1

    goto :goto_3

    :cond_b
    move-wide/from16 v20, v2

    :goto_5
    sub-long v0, v7, v0

    long-to-int v1, v0

    .line 25
    invoke-virtual/range {p0 .. p0}, Lj3/a;->j()I

    move-result v0

    if-nez v0, :cond_c

    move-wide v3, v7

    goto :goto_6

    :cond_c
    move-wide/from16 v3, v20

    .line 26
    :goto_6
    iget-wide v5, v9, Li3/i;->i:J

    iget v0, v9, Li3/i;->e:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v0, v0

    sub-long v0, v7, v0

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 27
    iget v2, v9, Li3/i;->f:I

    if-nez v2, :cond_d

    cmp-long v2, v0, v12

    if-gez v2, :cond_d

    iget-object v2, v9, Li3/i;->h:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    invoke-static {v2, v0, v1}, Li3/j;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Li3/j;->a:Lkotlinx/coroutines/internal/t;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const-wide/16 v5, 0x1

    add-long/2addr v7, v5

    add-long/2addr v0, v5

    :cond_d
    move-wide v1, v0

    move-wide v5, v7

    move-object/from16 v0, p0

    move-wide v7, v12

    .line 28
    invoke-direct/range {v0 .. v8}, Li3/i;->R(JJJJ)V

    .line 29
    invoke-direct/range {p0 .. p0}, Li3/i;->x()V

    .line 30
    array-length v0, v11

    const/4 v1, 0x1

    if-nez v0, :cond_e

    const/4 v10, 0x1

    goto :goto_7

    :cond_e
    const/4 v10, 0x0

    :goto_7
    xor-int/lit8 v0, v10, 0x1

    if-eqz v0, :cond_f

    invoke-direct {v9, v11}, Li3/i;->E([Lq2/d;)[Lq2/d;

    move-result-object v11

    :cond_f
    return-object v11
.end method

.method public final T()J
    .locals 5

    .line 1
    iget-wide v0, p0, Li3/i;->i:J

    .line 2
    iget-wide v2, p0, Li3/i;->j:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    iput-wide v0, p0, Li3/i;->j:J

    :cond_0
    return-wide v0
.end method

.method public a(Ljava/lang/Object;Lq2/d;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Li3/i;->M(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Li3/i;->C(Ljava/lang/Object;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public c(Li3/b;Lq2/d;)Ljava/lang/Object;
    .locals 8
    .param p1    # Li3/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/b<",
            "-TT;>;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Li3/i$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Li3/i$c;

    iget v1, v0, Li3/i$c;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li3/i$c;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Li3/i$c;

    invoke-direct {v0, p0, p2}, Li3/i$c;-><init>(Li3/i;Lq2/d;)V

    :goto_0
    iget-object p2, v0, Li3/i$c;->e:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Li3/i$c;->g:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Li3/i$c;->d:Ljava/lang/Object;

    check-cast p1, Lf3/m1;

    iget-object v2, v0, Li3/i$c;->c:Ljava/lang/Object;

    check-cast v2, Li3/k;

    iget-object v5, v0, Li3/i$c;->b:Ljava/lang/Object;

    check-cast v5, Li3/b;

    iget-object v6, v0, Li3/i$c;->a:Ljava/lang/Object;

    check-cast v6, Li3/i;

    :try_start_0
    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p2, p1

    move-object p1, v5

    goto :goto_2

    .line 2
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_3
    iget-object p1, v0, Li3/i$c;->d:Ljava/lang/Object;

    check-cast p1, Lf3/m1;

    iget-object v2, v0, Li3/i$c;->c:Ljava/lang/Object;

    check-cast v2, Li3/k;

    iget-object v5, v0, Li3/i$c;->b:Ljava/lang/Object;

    check-cast v5, Li3/b;

    iget-object v6, v0, Li3/i$c;->a:Ljava/lang/Object;

    check-cast v6, Li3/i;

    :try_start_1
    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_4
    iget-object p1, v0, Li3/i$c;->c:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Li3/k;

    iget-object p1, v0, Li3/i$c;->b:Ljava/lang/Object;

    check-cast p1, Li3/b;

    iget-object v5, v0, Li3/i$c;->a:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Li3/i;

    :try_start_2
    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_5
    invoke-static {p2}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lj3/a;->f()Lj3/c;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Li3/k;

    .line 5
    :try_start_3
    instance-of p2, p1, Li3/m;

    if-eqz p2, :cond_6

    move-object p2, p1

    check-cast p2, Li3/m;

    iput-object p0, v0, Li3/i$c;->a:Ljava/lang/Object;

    iput-object p1, v0, Li3/i$c;->b:Ljava/lang/Object;

    iput-object v2, v0, Li3/i$c;->c:Ljava/lang/Object;

    iput v5, v0, Li3/i$c;->g:I

    invoke-virtual {p2, v0}, Li3/m;->c(Lq2/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v6, p0

    .line 6
    :goto_1
    :try_start_4
    invoke-interface {v0}, Lq2/d;->getContext()Lq2/g;

    move-result-object p2

    .line 7
    sget-object v5, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p2, v5}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p2

    check-cast p2, Lf3/m1;

    :goto_2
    move-object v5, p1

    move-object p1, p2

    .line 8
    :cond_7
    :goto_3
    invoke-direct {v6, v2}, Li3/i;->Q(Li3/k;)Ljava/lang/Object;

    move-result-object p2

    .line 9
    sget-object v7, Li3/j;->a:Lkotlinx/coroutines/internal/t;

    if-eq p2, v7, :cond_9

    if-nez p1, :cond_8

    goto :goto_4

    .line 10
    :cond_8
    invoke-static {p1}, Lf3/q1;->e(Lf3/m1;)V

    .line 11
    :goto_4
    iput-object v6, v0, Li3/i$c;->a:Ljava/lang/Object;

    iput-object v5, v0, Li3/i$c;->b:Ljava/lang/Object;

    iput-object v2, v0, Li3/i$c;->c:Ljava/lang/Object;

    iput-object p1, v0, Li3/i$c;->d:Ljava/lang/Object;

    iput v3, v0, Li3/i$c;->g:I

    invoke-interface {v5, p2, v0}, Li3/b;->a(Ljava/lang/Object;Lq2/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_1

    return-object v1

    .line 12
    :cond_9
    iput-object v6, v0, Li3/i$c;->a:Ljava/lang/Object;

    iput-object v5, v0, Li3/i$c;->b:Ljava/lang/Object;

    iput-object v2, v0, Li3/i$c;->c:Ljava/lang/Object;

    iput-object p1, v0, Li3/i$c;->d:Ljava/lang/Object;

    iput v4, v0, Li3/i$c;->g:I

    invoke-direct {v6, v2, v0}, Li3/i;->v(Li3/k;Lq2/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p2, v1, :cond_7

    return-object v1

    :catchall_1
    move-exception p1

    move-object v6, p0

    .line 13
    :goto_5
    invoke-virtual {v6, v2}, Lj3/a;->i(Lj3/c;)V

    throw p1
.end method

.method public bridge synthetic g()Lj3/c;
    .locals 1

    invoke-virtual {p0}, Li3/i;->z()Li3/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h(I)[Lj3/c;
    .locals 0

    invoke-virtual {p0, p1}, Li3/i;->A(I)[Li3/k;

    move-result-object p1

    return-object p1
.end method

.method protected z()Li3/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Li3/k;

    invoke-direct {v0}, Li3/k;-><init>()V

    return-object v0
.end method
