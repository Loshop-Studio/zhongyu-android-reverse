.class public La/f/b/i/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/f/b/i/d$a;
    }
.end annotation


# instance fields
.field public A:La/f/b/i/c;

.field public B:La/f/b/i/c;

.field public C:La/f/b/i/c;

.field public D:La/f/b/i/c;

.field public E:La/f/b/i/c;

.field public F:La/f/b/i/c;

.field public G:[La/f/b/i/c;

.field public H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/f/b/i/c;",
            ">;"
        }
    .end annotation
.end field

.field public I:[Z

.field public J:[La/f/b/i/d$a;

.field public K:La/f/b/i/d;

.field public L:I

.field public M:I

.field public N:F

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:I

.field public T:I

.field public U:F

.field public V:F

.field public W:Ljava/lang/Object;

.field public X:I

.field public Y:Ljava/lang/String;

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:La/f/b/i/l/c;

.field public b0:[F

.field public c:La/f/b/i/l/c;

.field public c0:[La/f/b/i/d;

.field public d:La/f/b/i/l/j;

.field public d0:[La/f/b/i/d;

.field public e:La/f/b/i/l/l;

.field public f:[Z

.field public g:[I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:[I

.field public m:I

.field public n:I

.field public o:F

.field public p:I

.field public q:I

.field public r:F

.field public s:I

.field public t:F

.field public u:[I

.field public v:F

.field public w:Z

.field public x:Z

.field public y:La/f/b/i/c;

.field public z:La/f/b/i/c;


# direct methods
.method public constructor <init>()V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/f/b/i/d;->a:Z

    new-instance v1, La/f/b/i/l/j;

    invoke-direct {v1, p0}, La/f/b/i/l/j;-><init>(La/f/b/i/d;)V

    iput-object v1, p0, La/f/b/i/d;->d:La/f/b/i/l/j;

    new-instance v1, La/f/b/i/l/l;

    invoke-direct {v1, p0}, La/f/b/i/l/l;-><init>(La/f/b/i/d;)V

    iput-object v1, p0, La/f/b/i/d;->e:La/f/b/i/l/l;

    const/4 v1, 0x2

    new-array v2, v1, [Z

    fill-array-data v2, :array_0

    iput-object v2, p0, La/f/b/i/d;->f:[Z

    const/4 v2, 0x4

    new-array v3, v2, [I

    fill-array-data v3, :array_1

    iput-object v3, p0, La/f/b/i/d;->g:[I

    const/4 v3, -0x1

    iput v3, p0, La/f/b/i/d;->h:I

    iput v3, p0, La/f/b/i/d;->i:I

    iput v0, p0, La/f/b/i/d;->j:I

    iput v0, p0, La/f/b/i/d;->k:I

    new-array v4, v1, [I

    iput-object v4, p0, La/f/b/i/d;->l:[I

    iput v0, p0, La/f/b/i/d;->m:I

    iput v0, p0, La/f/b/i/d;->n:I

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, La/f/b/i/d;->o:F

    iput v0, p0, La/f/b/i/d;->p:I

    iput v0, p0, La/f/b/i/d;->q:I

    iput v4, p0, La/f/b/i/d;->r:F

    iput v3, p0, La/f/b/i/d;->s:I

    iput v4, p0, La/f/b/i/d;->t:F

    new-array v4, v1, [I

    fill-array-data v4, :array_2

    iput-object v4, p0, La/f/b/i/d;->u:[I

    const/4 v4, 0x0

    iput v4, p0, La/f/b/i/d;->v:F

    iput-boolean v0, p0, La/f/b/i/d;->w:Z

    new-instance v5, La/f/b/i/c;

    sget-object v6, La/f/b/i/c$a;->c:La/f/b/i/c$a;

    invoke-direct {v5, p0, v6}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v5, p0, La/f/b/i/d;->y:La/f/b/i/c;

    new-instance v6, La/f/b/i/c;

    sget-object v7, La/f/b/i/c$a;->d:La/f/b/i/c$a;

    invoke-direct {v6, p0, v7}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v6, p0, La/f/b/i/d;->z:La/f/b/i/c;

    new-instance v7, La/f/b/i/c;

    sget-object v8, La/f/b/i/c$a;->e:La/f/b/i/c$a;

    invoke-direct {v7, p0, v8}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v7, p0, La/f/b/i/d;->A:La/f/b/i/c;

    new-instance v8, La/f/b/i/c;

    sget-object v9, La/f/b/i/c$a;->f:La/f/b/i/c$a;

    invoke-direct {v8, p0, v9}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v8, p0, La/f/b/i/d;->B:La/f/b/i/c;

    new-instance v9, La/f/b/i/c;

    sget-object v10, La/f/b/i/c$a;->g:La/f/b/i/c$a;

    invoke-direct {v9, p0, v10}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v9, p0, La/f/b/i/d;->C:La/f/b/i/c;

    new-instance v10, La/f/b/i/c;

    sget-object v11, La/f/b/i/c$a;->i:La/f/b/i/c$a;

    invoke-direct {v10, p0, v11}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v10, p0, La/f/b/i/d;->D:La/f/b/i/c;

    new-instance v10, La/f/b/i/c;

    sget-object v11, La/f/b/i/c$a;->j:La/f/b/i/c$a;

    invoke-direct {v10, p0, v11}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v10, p0, La/f/b/i/d;->E:La/f/b/i/c;

    new-instance v10, La/f/b/i/c;

    sget-object v11, La/f/b/i/c$a;->h:La/f/b/i/c$a;

    invoke-direct {v10, p0, v11}, La/f/b/i/c;-><init>(La/f/b/i/d;La/f/b/i/c$a;)V

    iput-object v10, p0, La/f/b/i/d;->F:La/f/b/i/c;

    const/4 v11, 0x6

    new-array v11, v11, [La/f/b/i/c;

    aput-object v5, v11, v0

    const/4 v5, 0x1

    aput-object v7, v11, v5

    aput-object v6, v11, v1

    const/4 v6, 0x3

    aput-object v8, v11, v6

    aput-object v9, v11, v2

    const/4 v2, 0x5

    aput-object v10, v11, v2

    iput-object v11, p0, La/f/b/i/d;->G:[La/f/b/i/c;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    new-array v6, v1, [Z

    iput-object v6, p0, La/f/b/i/d;->I:[Z

    new-array v6, v1, [La/f/b/i/d$a;

    sget-object v7, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    aput-object v7, v6, v0

    aput-object v7, v6, v5

    iput-object v6, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v6, 0x0

    iput-object v6, p0, La/f/b/i/d;->K:La/f/b/i/d;

    iput v0, p0, La/f/b/i/d;->L:I

    iput v0, p0, La/f/b/i/d;->M:I

    iput v4, p0, La/f/b/i/d;->N:F

    iput v3, p0, La/f/b/i/d;->O:I

    iput v0, p0, La/f/b/i/d;->P:I

    iput v0, p0, La/f/b/i/d;->Q:I

    iput v0, p0, La/f/b/i/d;->R:I

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, p0, La/f/b/i/d;->U:F

    iput v3, p0, La/f/b/i/d;->V:F

    iput v0, p0, La/f/b/i/d;->X:I

    iput-object v6, p0, La/f/b/i/d;->Y:Ljava/lang/String;

    iput v0, p0, La/f/b/i/d;->Z:I

    iput v0, p0, La/f/b/i/d;->a0:I

    new-array v3, v1, [F

    fill-array-data v3, :array_3

    iput-object v3, p0, La/f/b/i/d;->b0:[F

    new-array v3, v1, [La/f/b/i/d;

    aput-object v6, v3, v0

    aput-object v6, v3, v5

    iput-object v3, p0, La/f/b/i/d;->c0:[La/f/b/i/d;

    new-array v1, v1, [La/f/b/i/d;

    aput-object v6, v1, v0

    aput-object v6, v1, v5

    iput-object v1, p0, La/f/b/i/d;->d0:[La/f/b/i/d;

    .line 1
    iget-object v0, p0, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->D:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->E:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v1, p0, La/f/b/i/d;->C:La/f/b/i/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_3
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method


# virtual methods
.method public A(La/f/b/i/d$a;)V
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public B(I)V
    .locals 1

    iput p1, p0, La/f/b/i/d;->L:I

    iget v0, p0, La/f/b/i/d;->S:I

    if-ge p1, v0, :cond_0

    iput v0, p0, La/f/b/i/d;->L:I

    :cond_0
    return-void
.end method

.method public C(ZZ)V
    .locals 8

    sget-object v0, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    iget-object v1, p0, La/f/b/i/d;->d:La/f/b/i/l/j;

    .line 1
    iget-boolean v2, v1, La/f/b/i/l/m;->g:Z

    and-int/2addr p1, v2

    .line 2
    iget-object v2, p0, La/f/b/i/d;->e:La/f/b/i/l/l;

    .line 3
    iget-boolean v3, v2, La/f/b/i/l/m;->g:Z

    and-int/2addr p2, v3

    .line 4
    iget-object v3, v1, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget v3, v3, La/f/b/i/l/f;->g:I

    iget-object v4, v2, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget v4, v4, La/f/b/i/l/f;->g:I

    iget-object v1, v1, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget v1, v1, La/f/b/i/l/f;->g:I

    iget-object v2, v2, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget v2, v2, La/f/b/i/l/f;->g:I

    sub-int v5, v1, v3

    sub-int v6, v2, v4

    const/4 v7, 0x0

    if-ltz v5, :cond_0

    if-ltz v6, :cond_0

    const/high16 v5, -0x80000000

    if-eq v3, v5, :cond_0

    const v6, 0x7fffffff

    if-eq v3, v6, :cond_0

    if-eq v4, v5, :cond_0

    if-eq v4, v6, :cond_0

    if-eq v1, v5, :cond_0

    if-eq v1, v6, :cond_0

    if-eq v2, v5, :cond_0

    if-ne v2, v6, :cond_1

    :cond_0
    move v1, v7

    move v2, v1

    move v3, v2

    move v4, v3

    :cond_1
    sub-int/2addr v1, v3

    sub-int/2addr v2, v4

    if-eqz p1, :cond_2

    iput v3, p0, La/f/b/i/d;->P:I

    :cond_2
    if-eqz p2, :cond_3

    iput v4, p0, La/f/b/i/d;->Q:I

    :cond_3
    iget v3, p0, La/f/b/i/d;->X:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_4

    iput v7, p0, La/f/b/i/d;->L:I

    iput v7, p0, La/f/b/i/d;->M:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object p1, p1, v7

    if-ne p1, v0, :cond_5

    iget p1, p0, La/f/b/i/d;->L:I

    if-ge v1, p1, :cond_5

    move v1, p1

    :cond_5
    iput v1, p0, La/f/b/i/d;->L:I

    iget p1, p0, La/f/b/i/d;->S:I

    if-ge v1, p1, :cond_6

    iput p1, p0, La/f/b/i/d;->L:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    if-ne p1, v0, :cond_7

    iget p1, p0, La/f/b/i/d;->M:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, La/f/b/i/d;->M:I

    iget p1, p0, La/f/b/i/d;->T:I

    if-ge v2, p1, :cond_8

    iput p1, p0, La/f/b/i/d;->M:I

    :cond_8
    return-void
.end method

.method public D(La/f/b/d;)V
    .locals 6

    iget-object v0, p0, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->o(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {p1, v1}, La/f/b/d;->o(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {p1, v2}, La/f/b/d;->o(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {p1, v3}, La/f/b/d;->o(Ljava/lang/Object;)I

    move-result p1

    iget-object v3, p0, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v4, v3, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v5, v4, La/f/b/i/l/f;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v5, v3, La/f/b/i/l/f;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, La/f/b/i/l/f;->g:I

    iget v2, v3, La/f/b/i/l/f;->g:I

    :cond_0
    iget-object v3, p0, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v4, v3, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v5, v4, La/f/b/i/l/f;->j:Z

    if-eqz v5, :cond_1

    iget-object v3, v3, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v5, v3, La/f/b/i/l/f;->j:Z

    if-eqz v5, :cond_1

    iget v1, v4, La/f/b/i/l/f;->g:I

    iget p1, v3, La/f/b/i/l/f;->g:I

    :cond_1
    sub-int v3, v2, v0

    sub-int v4, p1, v1

    const/4 v5, 0x0

    if-ltz v3, :cond_2

    if-ltz v4, :cond_2

    const/high16 v3, -0x80000000

    if-eq v0, v3, :cond_2

    const v4, 0x7fffffff

    if-eq v0, v4, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_2

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_2

    if-eq p1, v3, :cond_2

    if-ne p1, v4, :cond_3

    :cond_2
    move p1, v5

    move v0, p1

    move v1, v0

    move v2, v1

    :cond_3
    sub-int/2addr v2, v0

    sub-int/2addr p1, v1

    .line 1
    iput v0, p0, La/f/b/i/d;->P:I

    iput v1, p0, La/f/b/i/d;->Q:I

    iget v0, p0, La/f/b/i/d;->X:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    iput v5, p0, La/f/b/i/d;->L:I

    iput v5, p0, La/f/b/i/d;->M:I

    goto :goto_0

    :cond_4
    iget-object v0, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v1, v0, v5

    sget-object v3, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    if-ne v1, v3, :cond_5

    iget v1, p0, La/f/b/i/d;->L:I

    if-ge v2, v1, :cond_5

    move v2, v1

    :cond_5
    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-ne v0, v3, :cond_6

    iget v0, p0, La/f/b/i/d;->M:I

    if-ge p1, v0, :cond_6

    move p1, v0

    :cond_6
    iput v2, p0, La/f/b/i/d;->L:I

    iput p1, p0, La/f/b/i/d;->M:I

    iget v0, p0, La/f/b/i/d;->T:I

    if-ge p1, v0, :cond_7

    iput v0, p0, La/f/b/i/d;->M:I

    :cond_7
    iget p1, p0, La/f/b/i/d;->S:I

    if-ge v2, p1, :cond_8

    iput p1, p0, La/f/b/i/d;->L:I

    :cond_8
    :goto_0
    return-void
.end method

.method public b(La/f/b/d;)V
    .locals 47

    move-object/from16 v13, p0

    move-object/from16 v9, p1

    sget-object v7, La/f/b/i/d$a;->c:La/f/b/i/d$a;

    iget-object v0, v13, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v6

    iget-object v0, v13, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v4

    iget-object v0, v13, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v3

    iget-object v0, v13, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v1

    iget-object v0, v13, La/f/b/i/d;->C:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    iget-object v2, v13, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v5, v2, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v8, v5, La/f/b/i/l/f;->j:Z

    const/16 v15, 0x8

    const/4 v14, 0x1

    const/4 v12, 0x0

    if-eqz v8, :cond_4

    iget-object v2, v2, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v2, v2, La/f/b/i/l/f;->j:Z

    if-eqz v2, :cond_4

    iget-object v2, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v8, v2, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v8, v8, La/f/b/i/l/f;->j:Z

    if-eqz v8, :cond_4

    iget-object v2, v2, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v2, v2, La/f/b/i/l/f;->j:Z

    if-eqz v2, :cond_4

    iget v2, v5, La/f/b/i/l/f;->g:I

    invoke-virtual {v9, v6, v2}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v2, v13, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v2, v2, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget v2, v2, La/f/b/i/l/f;->g:I

    invoke-virtual {v9, v4, v2}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v2, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v2, v2, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget v2, v2, La/f/b/i/l/f;->g:I

    invoke-virtual {v9, v3, v2}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v2, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v2, v2, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget v2, v2, La/f/b/i/l/f;->g:I

    invoke-virtual {v9, v1, v2}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v2, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v2, v2, La/f/b/i/l/l;->k:La/f/b/i/l/f;

    iget v2, v2, La/f/b/i/l/f;->g:I

    invoke-virtual {v9, v0, v2}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_3

    if-eqz v0, :cond_0

    iget-object v2, v0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v2, v2, v12

    if-ne v2, v7, :cond_0

    move v2, v14

    goto :goto_0

    :cond_0
    move v2, v12

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v0, v0, v14

    if-ne v0, v7, :cond_1

    move v0, v14

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    if-eqz v2, :cond_2

    iget-object v2, v13, La/f/b/i/d;->f:[Z

    aget-boolean v2, v2, v12

    if-eqz v2, :cond_2

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->s()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v13, La/f/b/i/d;->K:La/f/b/i/d;

    iget-object v2, v2, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v9, v2}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v2

    invoke-virtual {v9, v2, v4, v12, v15}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, v13, La/f/b/i/d;->f:[Z

    aget-boolean v0, v0, v14

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->t()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    iget-object v0, v0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    invoke-virtual {v9, v0, v1, v12, v15}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_3
    return-void

    :cond_4
    iget-object v2, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v2, :cond_b

    if-eqz v2, :cond_5

    iget-object v5, v2, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v5, v5, v12

    if-ne v5, v7, :cond_5

    move v5, v14

    goto :goto_2

    :cond_5
    move v5, v12

    :goto_2
    if-eqz v2, :cond_6

    iget-object v2, v2, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v2, v2, v14

    if-ne v2, v7, :cond_6

    move v2, v14

    goto :goto_3

    :cond_6
    move v2, v12

    :goto_3
    invoke-virtual {v13, v12}, La/f/b/i/d;->r(I)Z

    move-result v8

    if-eqz v8, :cond_7

    iget-object v8, v13, La/f/b/i/d;->K:La/f/b/i/d;

    check-cast v8, La/f/b/i/e;

    invoke-virtual {v8, v13, v12}, La/f/b/i/e;->F(La/f/b/i/d;I)V

    move v8, v14

    goto :goto_4

    :cond_7
    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->s()Z

    move-result v8

    :goto_4
    invoke-virtual {v13, v14}, La/f/b/i/d;->r(I)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v10, v13, La/f/b/i/d;->K:La/f/b/i/d;

    check-cast v10, La/f/b/i/e;

    invoke-virtual {v10, v13, v14}, La/f/b/i/e;->F(La/f/b/i/d;I)V

    move v10, v14

    goto :goto_5

    :cond_8
    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->t()Z

    move-result v10

    :goto_5
    if-nez v8, :cond_9

    if-eqz v5, :cond_9

    iget v11, v13, La/f/b/i/d;->X:I

    if-eq v11, v15, :cond_9

    iget-object v11, v13, La/f/b/i/d;->y:La/f/b/i/c;

    iget-object v11, v11, La/f/b/i/c;->d:La/f/b/i/c;

    if-nez v11, :cond_9

    iget-object v11, v13, La/f/b/i/d;->A:La/f/b/i/c;

    iget-object v11, v11, La/f/b/i/c;->d:La/f/b/i/c;

    if-nez v11, :cond_9

    iget-object v11, v13, La/f/b/i/d;->K:La/f/b/i/d;

    iget-object v11, v11, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v9, v11}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v11

    invoke-virtual {v9, v11, v4, v12, v14}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_9
    if-nez v10, :cond_a

    if-eqz v2, :cond_a

    iget v11, v13, La/f/b/i/d;->X:I

    if-eq v11, v15, :cond_a

    iget-object v11, v13, La/f/b/i/d;->z:La/f/b/i/c;

    iget-object v11, v11, La/f/b/i/c;->d:La/f/b/i/c;

    if-nez v11, :cond_a

    iget-object v11, v13, La/f/b/i/d;->B:La/f/b/i/c;

    iget-object v11, v11, La/f/b/i/c;->d:La/f/b/i/c;

    if-nez v11, :cond_a

    iget-object v11, v13, La/f/b/i/d;->C:La/f/b/i/c;

    if-nez v11, :cond_a

    iget-object v11, v13, La/f/b/i/d;->K:La/f/b/i/d;

    iget-object v11, v11, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v9, v11}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v11

    invoke-virtual {v9, v11, v1, v12, v14}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_a
    move/from16 v27, v2

    move/from16 v28, v5

    move/from16 v30, v8

    move/from16 v29, v10

    goto :goto_6

    :cond_b
    move/from16 v27, v12

    move/from16 v28, v27

    move/from16 v29, v28

    move/from16 v30, v29

    :goto_6
    iget v2, v13, La/f/b/i/d;->L:I

    iget v5, v13, La/f/b/i/d;->S:I

    if-ge v2, v5, :cond_c

    goto :goto_7

    :cond_c
    move v5, v2

    :goto_7
    iget v8, v13, La/f/b/i/d;->M:I

    iget v10, v13, La/f/b/i/d;->T:I

    if-ge v8, v10, :cond_d

    goto :goto_8

    :cond_d
    move v10, v8

    :goto_8
    iget-object v11, v13, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v15, v11, v12

    sget-object v12, La/f/b/i/d$a;->d:La/f/b/i/d$a;

    move-object/from16 v18, v0

    if-eq v15, v12, :cond_e

    move v15, v14

    goto :goto_9

    :cond_e
    const/4 v15, 0x0

    :goto_9
    aget-object v0, v11, v14

    if-eq v0, v12, :cond_f

    move v0, v14

    goto :goto_a

    :cond_f
    const/4 v0, 0x0

    :goto_a
    iget v14, v13, La/f/b/i/d;->O:I

    iput v14, v13, La/f/b/i/d;->s:I

    move-object/from16 v20, v1

    iget v1, v13, La/f/b/i/d;->N:F

    iput v1, v13, La/f/b/i/d;->t:F

    move-object/from16 v21, v3

    iget v3, v13, La/f/b/i/d;->j:I

    move/from16 v22, v5

    iget v5, v13, La/f/b/i/d;->k:I

    const/16 v23, 0x0

    cmpl-float v23, v1, v23

    const/16 v24, 0x4

    move/from16 v25, v10

    if-lez v23, :cond_23

    iget v10, v13, La/f/b/i/d;->X:I

    move-object/from16 v26, v4

    const/16 v4, 0x8

    if-eq v10, v4, :cond_24

    const/4 v4, 0x0

    aget-object v10, v11, v4

    if-ne v10, v12, :cond_10

    if-nez v3, :cond_10

    const/4 v3, 0x3

    :cond_10
    const/4 v10, 0x1

    aget-object v4, v11, v10

    if-ne v4, v12, :cond_11

    if-nez v5, :cond_11

    const/4 v4, 0x0

    const/4 v5, 0x3

    goto :goto_b

    :cond_11
    const/4 v4, 0x0

    :goto_b
    aget-object v10, v11, v4

    const/high16 v32, 0x3f800000    # 1.0f

    if-ne v10, v12, :cond_1d

    const/4 v10, 0x1

    aget-object v4, v11, v10

    if-ne v4, v12, :cond_1c

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1c

    if-ne v5, v4, :cond_1c

    const/4 v2, -0x1

    if-ne v14, v2, :cond_13

    if-eqz v15, :cond_12

    if-nez v0, :cond_12

    const/4 v4, 0x0

    .line 1
    iput v4, v13, La/f/b/i/d;->s:I

    goto :goto_c

    :cond_12
    if-nez v15, :cond_13

    if-eqz v0, :cond_13

    const/4 v0, 0x1

    iput v0, v13, La/f/b/i/d;->s:I

    if-ne v14, v2, :cond_13

    div-float v0, v32, v1

    iput v0, v13, La/f/b/i/d;->t:F

    :cond_13
    :goto_c
    iget v0, v13, La/f/b/i/d;->s:I

    if-nez v0, :cond_15

    iget-object v0, v13, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, v13, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    const/4 v0, 0x1

    :goto_d
    iput v0, v13, La/f/b/i/d;->s:I

    goto :goto_e

    :cond_15
    const/4 v0, 0x1

    iget v1, v13, La/f/b/i/d;->s:I

    if-ne v1, v0, :cond_17

    iget-object v0, v13, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, v13, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    const/4 v0, 0x0

    goto :goto_d

    :cond_17
    :goto_e
    iget v0, v13, La/f/b/i/d;->s:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1a

    iget-object v0, v13, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, v13, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, v13, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, v13, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_18
    iget-object v0, v13, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, v13, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_19

    const/4 v0, 0x0

    :goto_f
    iput v0, v13, La/f/b/i/d;->s:I

    goto :goto_10

    :cond_19
    iget-object v0, v13, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, v13, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget v0, v13, La/f/b/i/d;->t:F

    div-float v0, v32, v0

    iput v0, v13, La/f/b/i/d;->t:F

    const/4 v0, 0x1

    goto :goto_f

    :cond_1a
    :goto_10
    iget v0, v13, La/f/b/i/d;->s:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_22

    iget v0, v13, La/f/b/i/d;->m:I

    if-lez v0, :cond_1b

    iget v1, v13, La/f/b/i/d;->p:I

    if-nez v1, :cond_1b

    const/4 v1, 0x0

    iput v1, v13, La/f/b/i/d;->s:I

    goto/16 :goto_13

    :cond_1b
    if-nez v0, :cond_22

    iget v0, v13, La/f/b/i/d;->p:I

    if-lez v0, :cond_22

    iget v0, v13, La/f/b/i/d;->t:F

    div-float v0, v32, v0

    iput v0, v13, La/f/b/i/d;->t:F

    const/4 v0, 0x1

    iput v0, v13, La/f/b/i/d;->s:I

    goto/16 :goto_13

    :cond_1c
    const/4 v0, 0x0

    goto :goto_11

    :cond_1d
    move v0, v4

    .line 2
    :goto_11
    aget-object v4, v11, v0

    if-ne v4, v12, :cond_1f

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1f

    iput v0, v13, La/f/b/i/d;->s:I

    int-to-float v0, v8

    mul-float/2addr v1, v0

    float-to-int v0, v1

    const/4 v4, 0x1

    aget-object v1, v11, v4

    if-eq v1, v12, :cond_1e

    move/from16 v33, v5

    move/from16 v34, v24

    move/from16 v32, v25

    const/16 v17, 0x0

    const/16 v31, 0x0

    goto :goto_12

    :cond_1e
    move/from16 v34, v3

    move/from16 v31, v4

    move/from16 v33, v5

    move/from16 v32, v25

    const/16 v17, 0x0

    :goto_12
    move v5, v0

    goto :goto_15

    :cond_1f
    const/4 v4, 0x1

    aget-object v0, v11, v4

    if-ne v0, v12, :cond_22

    const/4 v0, 0x3

    if-ne v5, v0, :cond_22

    iput v4, v13, La/f/b/i/d;->s:I

    const/4 v0, -0x1

    if-ne v14, v0, :cond_20

    div-float v0, v32, v1

    iput v0, v13, La/f/b/i/d;->t:F

    :cond_20
    iget v0, v13, La/f/b/i/d;->t:F

    int-to-float v1, v2

    mul-float/2addr v0, v1

    float-to-int v10, v0

    const/16 v17, 0x0

    aget-object v0, v11, v17

    move/from16 v34, v3

    if-eq v0, v12, :cond_21

    move/from16 v32, v10

    move/from16 v31, v17

    move/from16 v5, v22

    move/from16 v33, v24

    goto :goto_15

    :cond_21
    move/from16 v33, v5

    move/from16 v32, v10

    move/from16 v5, v22

    goto :goto_14

    :cond_22
    :goto_13
    const/16 v17, 0x0

    move/from16 v34, v3

    move/from16 v33, v5

    move/from16 v5, v22

    move/from16 v32, v25

    :goto_14
    const/16 v31, 0x1

    goto :goto_15

    :cond_23
    move-object/from16 v26, v4

    :cond_24
    const/16 v17, 0x0

    move/from16 v34, v3

    move/from16 v33, v5

    move/from16 v31, v17

    move/from16 v5, v22

    move/from16 v32, v25

    :goto_15
    iget-object v0, v13, La/f/b/i/d;->l:[I

    aput v34, v0, v17

    const/4 v1, 0x1

    aput v33, v0, v1

    if-eqz v31, :cond_26

    iget v0, v13, La/f/b/i/d;->s:I

    const/4 v1, -0x1

    if-eqz v0, :cond_25

    if-ne v0, v1, :cond_27

    :cond_25
    const/16 v22, 0x1

    goto :goto_16

    :cond_26
    const/4 v1, -0x1

    :cond_27
    const/16 v22, 0x0

    :goto_16
    iget-object v0, v13, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    if-ne v0, v7, :cond_28

    instance-of v0, v13, La/f/b/i/e;

    if-eqz v0, :cond_28

    const/16 v35, 0x1

    goto :goto_17

    :cond_28
    const/16 v35, 0x0

    :goto_17
    if-eqz v35, :cond_29

    const/16 v36, 0x0

    goto :goto_18

    :cond_29
    move/from16 v36, v5

    :goto_18
    iget-object v0, v13, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    const/4 v3, 0x1

    xor-int/lit8 v37, v0, 0x1

    iget-object v0, v13, La/f/b/i/d;->I:[Z

    const/4 v2, 0x0

    aget-boolean v38, v0, v2

    aget-boolean v39, v0, v3

    iget v0, v13, La/f/b/i/d;->h:I

    const/4 v4, 0x2

    const/16 v40, 0x0

    if-eq v0, v4, :cond_2f

    iget-object v0, v13, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v2, v0, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v5, v2, La/f/b/i/l/f;->j:Z

    if-eqz v5, :cond_2c

    iget-object v0, v0, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v0, v0, La/f/b/i/l/f;->j:Z

    if-nez v0, :cond_2a

    goto :goto_19

    :cond_2a
    iget v0, v2, La/f/b/i/l/f;->g:I

    invoke-virtual {v9, v6, v0}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v0, v13, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v0, v0, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget v0, v0, La/f/b/i/l/f;->g:I

    move-object/from16 v15, v26

    invoke-virtual {v9, v15, v0}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_2b

    if-eqz v28, :cond_2b

    iget-object v0, v13, La/f/b/i/d;->f:[Z

    const/4 v2, 0x0

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_2b

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->s()Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    iget-object v0, v0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    const/16 v14, 0x8

    invoke-virtual {v9, v0, v15, v2, v14}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_2b
    move-object/from16 v45, v6

    move-object/from16 v46, v7

    move-object/from16 v44, v15

    move-object/from16 v41, v18

    move-object/from16 v42, v20

    move-object/from16 v43, v21

    goto/16 :goto_1d

    :cond_2c
    :goto_19
    move-object/from16 v15, v26

    const/16 v14, 0x8

    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_2d

    iget-object v0, v0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_1a

    :cond_2d
    move-object/from16 v19, v40

    :goto_1a
    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_2e

    iget-object v0, v0, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    move-object/from16 v26, v0

    goto :goto_1b

    :cond_2e
    move-object/from16 v26, v40

    :goto_1b
    const/4 v2, 0x1

    iget-object v0, v13, La/f/b/i/d;->f:[Z

    const/4 v12, 0x0

    aget-boolean v5, v0, v12

    iget-object v0, v13, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v8, v0, v12

    iget-object v10, v13, La/f/b/i/d;->y:La/f/b/i/c;

    iget-object v11, v13, La/f/b/i/d;->A:La/f/b/i/c;

    iget v0, v13, La/f/b/i/d;->P:I

    move v2, v12

    move v12, v0

    iget v0, v13, La/f/b/i/d;->S:I

    move/from16 v16, v14

    move v14, v0

    iget-object v0, v13, La/f/b/i/d;->u:[I

    aget v0, v0, v2

    move-object/from16 v17, v15

    move v15, v0

    iget v0, v13, La/f/b/i/d;->U:F

    move/from16 v16, v0

    iget v0, v13, La/f/b/i/d;->m:I

    move/from16 v23, v0

    iget v0, v13, La/f/b/i/d;->n:I

    move/from16 v24, v0

    iget v0, v13, La/f/b/i/d;->o:F

    move/from16 v25, v0

    move-object/from16 v41, v18

    move-object/from16 v0, p0

    move-object/from16 v42, v20

    move-object/from16 v1, p1

    move-object/from16 v43, v21

    move/from16 v3, v28

    move-object/from16 v44, v17

    move/from16 v4, v27

    move-object/from16 v45, v6

    move-object/from16 v6, v26

    move-object/from16 v46, v7

    move-object/from16 v7, v19

    move/from16 v9, v35

    move/from16 v13, v36

    move/from16 v17, v22

    move/from16 v18, v30

    move/from16 v19, v29

    move/from16 v20, v38

    move/from16 v21, v34

    move/from16 v22, v33

    move/from16 v26, v37

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v26}, La/f/b/i/d;->d(La/f/b/d;ZZZZLa/f/b/g;La/f/b/g;La/f/b/i/d$a;ZLa/f/b/i/c;La/f/b/i/c;IIIIFZZZZIIIIFZ)V

    goto :goto_1c

    :cond_2f
    move-object/from16 v45, v6

    move-object/from16 v46, v7

    move-object/from16 v41, v18

    move-object/from16 v42, v20

    move-object/from16 v43, v21

    move-object/from16 v44, v26

    :goto_1c
    move-object/from16 v13, p0

    :goto_1d
    iget-object v0, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v1, v0, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v2, v1, La/f/b/i/l/f;->j:Z

    if-eqz v2, :cond_32

    iget-object v0, v0, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v0, v0, La/f/b/i/l/f;->j:Z

    if-eqz v0, :cond_32

    iget v0, v1, La/f/b/i/l/f;->g:I

    move-object/from16 v9, p1

    move-object/from16 v7, v43

    invoke-virtual {v9, v7, v0}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v0, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v0, v0, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget v0, v0, La/f/b/i/l/f;->g:I

    move-object/from16 v6, v42

    invoke-virtual {v9, v6, v0}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v0, v13, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v0, v0, La/f/b/i/l/l;->k:La/f/b/i/l/f;

    iget v0, v0, La/f/b/i/l/f;->g:I

    move-object/from16 v1, v41

    invoke-virtual {v9, v1, v0}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_31

    if-nez v29, :cond_31

    if-eqz v27, :cond_31

    iget-object v2, v13, La/f/b/i/d;->f:[Z

    const/4 v4, 0x1

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_30

    iget-object v0, v0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v6, v3, v2}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_1e

    :cond_30
    const/16 v2, 0x8

    const/4 v3, 0x0

    goto :goto_1e

    :cond_31
    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_1e
    move v14, v3

    goto :goto_1f

    :cond_32
    move-object/from16 v9, p1

    move-object/from16 v1, v41

    move-object/from16 v6, v42

    move-object/from16 v7, v43

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v14, v4

    :goto_1f
    iget v0, v13, La/f/b/i/d;->i:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_33

    move v12, v3

    goto :goto_20

    :cond_33
    move v12, v14

    :goto_20
    if-eqz v12, :cond_3e

    iget-object v0, v13, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v0, v0, v4

    move-object/from16 v5, v46

    if-ne v0, v5, :cond_34

    instance-of v0, v13, La/f/b/i/e;

    if-eqz v0, :cond_34

    move/from16 v17, v4

    goto :goto_21

    :cond_34
    move/from16 v17, v3

    :goto_21
    if-eqz v17, :cond_35

    move/from16 v32, v3

    :cond_35
    if-eqz v31, :cond_37

    iget v0, v13, La/f/b/i/d;->s:I

    if-eq v0, v4, :cond_36

    const/4 v5, -0x1

    if-ne v0, v5, :cond_37

    :cond_36
    move/from16 v18, v4

    goto :goto_22

    :cond_37
    move/from16 v18, v3

    :goto_22
    iget-object v0, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_38

    iget-object v0, v0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v9, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    goto :goto_23

    :cond_38
    move-object/from16 v0, v40

    :goto_23
    iget-object v5, v13, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v5, :cond_39

    iget-object v5, v5, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v9, v5}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v5

    move-object/from16 v40, v5

    :cond_39
    iget v5, v13, La/f/b/i/d;->R:I

    if-gtz v5, :cond_3a

    iget v8, v13, La/f/b/i/d;->X:I

    if-ne v8, v2, :cond_3d

    :cond_3a
    invoke-virtual {v9, v1, v7, v5, v2}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    iget-object v5, v13, La/f/b/i/d;->C:La/f/b/i/c;

    iget-object v5, v5, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v5, :cond_3c

    invoke-virtual {v9, v5}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v5

    invoke-virtual {v9, v1, v5, v3, v2}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    if-eqz v27, :cond_3b

    iget-object v1, v13, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v9, v1}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v9, v0, v1, v3, v2}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_3b
    move/from16 v26, v3

    goto :goto_24

    :cond_3c
    iget v5, v13, La/f/b/i/d;->X:I

    if-ne v5, v2, :cond_3d

    invoke-virtual {v9, v1, v7, v3, v2}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    :cond_3d
    move/from16 v26, v37

    :goto_24
    const/4 v2, 0x0

    iget-object v1, v13, La/f/b/i/d;->f:[Z

    aget-boolean v5, v1, v4

    iget-object v1, v13, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v8, v1, v4

    iget-object v10, v13, La/f/b/i/d;->z:La/f/b/i/c;

    iget-object v11, v13, La/f/b/i/d;->B:La/f/b/i/c;

    iget v12, v13, La/f/b/i/d;->Q:I

    iget v14, v13, La/f/b/i/d;->T:I

    iget-object v1, v13, La/f/b/i/d;->u:[I

    aget v15, v1, v4

    iget v1, v13, La/f/b/i/d;->V:F

    move/from16 v16, v1

    iget v1, v13, La/f/b/i/d;->p:I

    move/from16 v23, v1

    iget v1, v13, La/f/b/i/d;->q:I

    move/from16 v24, v1

    iget v1, v13, La/f/b/i/d;->r:F

    move/from16 v25, v1

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, v27

    move/from16 v4, v28

    move-object/from16 v27, v6

    move-object/from16 v6, v40

    move-object/from16 v28, v7

    move-object/from16 v7, v19

    move/from16 v9, v17

    move/from16 v13, v32

    move/from16 v17, v18

    move/from16 v18, v29

    move/from16 v19, v30

    move/from16 v20, v39

    move/from16 v21, v33

    move/from16 v22, v34

    invoke-virtual/range {v0 .. v26}, La/f/b/i/d;->d(La/f/b/d;ZZZZLa/f/b/g;La/f/b/g;La/f/b/i/d$a;ZLa/f/b/i/c;La/f/b/i/c;IIIIFZZZZIIIIFZ)V

    goto :goto_25

    :cond_3e
    move-object/from16 v27, v6

    move-object/from16 v28, v7

    :goto_25
    if-eqz v31, :cond_40

    const/16 v6, 0x8

    move-object/from16 v7, p0

    iget v0, v7, La/f/b/i/d;->s:I

    const/4 v1, 0x1

    iget v5, v7, La/f/b/i/d;->t:F

    if-ne v0, v1, :cond_3f

    move-object/from16 v0, p1

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    move-object/from16 v3, v44

    move-object/from16 v4, v45

    goto :goto_26

    :cond_3f
    const/16 v6, 0x8

    move-object/from16 v0, p1

    move-object/from16 v1, v44

    move-object/from16 v2, v45

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    :goto_26
    invoke-virtual/range {v0 .. v6}, La/f/b/d;->h(La/f/b/g;La/f/b/g;La/f/b/g;La/f/b/g;FI)V

    goto :goto_27

    :cond_40
    move-object/from16 v7, p0

    :goto_27
    iget-object v0, v7, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->d()Z

    move-result v0

    if-eqz v0, :cond_41

    iget-object v0, v7, La/f/b/i/d;->F:La/f/b/i/c;

    .line 3
    iget-object v0, v0, La/f/b/i/c;->d:La/f/b/i/c;

    .line 4
    iget-object v0, v0, La/f/b/i/c;->b:La/f/b/i/d;

    .line 5
    iget v1, v7, La/f/b/i/d;->v:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {v2}, La/f/b/i/c;->b()I

    move-result v2

    .line 6
    sget-object v3, La/f/b/i/c$a;->c:La/f/b/i/c$a;

    invoke-virtual {v7, v3}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v4

    move-object/from16 v5, p1

    invoke-virtual {v5, v4}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v9

    sget-object v4, La/f/b/i/c$a;->d:La/f/b/i/c$a;

    invoke-virtual {v7, v4}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v6

    invoke-virtual {v5, v6}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v11

    sget-object v6, La/f/b/i/c$a;->e:La/f/b/i/c$a;

    invoke-virtual {v7, v6}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v8

    invoke-virtual {v5, v8}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v16

    sget-object v8, La/f/b/i/c$a;->f:La/f/b/i/c$a;

    invoke-virtual {v7, v8}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v10

    invoke-virtual {v5, v10}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v12

    invoke-virtual {v0, v3}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v3

    invoke-virtual {v5, v3}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v3

    invoke-virtual {v0, v4}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v4

    invoke-virtual {v5, v4}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v13

    invoke-virtual {v0, v6}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v4

    invoke-virtual {v5, v4}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v4

    invoke-virtual {v0, v8}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v0

    invoke-virtual {v5, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, La/f/b/d;->m()La/f/b/b;

    move-result-object v0

    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v17

    int-to-double v1, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    mul-double v3, v17, v1

    double-to-float v15, v3

    move-object v10, v0

    invoke-virtual/range {v10 .. v15}, La/f/b/b;->g(La/f/b/g;La/f/b/g;La/f/b/g;La/f/b/g;F)La/f/b/b;

    invoke-virtual {v5, v0}, La/f/b/d;->c(La/f/b/b;)V

    invoke-virtual/range {p1 .. p1}, La/f/b/d;->m()La/f/b/b;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double/2addr v3, v1

    double-to-float v13, v3

    move-object v8, v0

    move-object/from16 v10, v16

    move-object/from16 v11, v19

    move-object/from16 v12, v20

    invoke-virtual/range {v8 .. v13}, La/f/b/b;->g(La/f/b/g;La/f/b/g;La/f/b/g;La/f/b/g;F)La/f/b/b;

    invoke-virtual {v5, v0}, La/f/b/d;->c(La/f/b/b;)V

    :cond_41
    return-void
.end method

.method public c()Z
    .locals 2

    iget v0, p0, La/f/b/i/d;->X:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d(La/f/b/d;ZZZZLa/f/b/g;La/f/b/g;La/f/b/i/d$a;ZLa/f/b/i/c;La/f/b/i/c;IIIIFZZZZIIIIFZ)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p22

    move/from16 v3, p23

    move/from16 v4, p24

    sget-object v5, La/f/b/i/c$a;->f:La/f/b/i/c$a;

    invoke-virtual {v10, v13}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v9

    invoke-virtual {v10, v14}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v8

    .line 1
    iget-object v6, v13, La/f/b/i/c;->d:La/f/b/i/c;

    .line 2
    invoke-virtual {v10, v6}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v7

    .line 3
    iget-object v6, v14, La/f/b/i/c;->d:La/f/b/i/c;

    .line 4
    invoke-virtual {v10, v6}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v6

    invoke-virtual/range {p10 .. p10}, La/f/b/i/c;->d()Z

    move-result v22

    invoke-virtual/range {p11 .. p11}, La/f/b/i/c;->d()Z

    move-result v23

    iget-object v12, v0, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {v12}, La/f/b/i/c;->d()Z

    move-result v12

    if-eqz v23, :cond_0

    add-int/lit8 v16, v22, 0x1

    goto :goto_0

    :cond_0
    move/from16 v16, v22

    :goto_0
    if-eqz v12, :cond_1

    add-int/lit8 v16, v16, 0x1

    :cond_1
    move/from16 v2, v16

    if-eqz p17, :cond_2

    const/4 v14, 0x3

    goto :goto_1

    :cond_2
    move/from16 v14, p21

    :goto_1
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    move-object/from16 v24, v6

    const/4 v6, 0x1

    if-eqz v11, :cond_5

    if-eq v11, v6, :cond_5

    const/4 v6, 0x2

    if-eq v11, v6, :cond_3

    goto :goto_2

    :cond_3
    const/4 v6, 0x4

    if-ne v14, v6, :cond_4

    goto :goto_3

    :cond_4
    const/4 v11, 0x1

    goto :goto_4

    :cond_5
    :goto_2
    const/4 v6, 0x4

    :goto_3
    const/4 v11, 0x0

    :goto_4
    iget v6, v0, La/f/b/i/d;->X:I

    move/from16 v16, v11

    const/16 v11, 0x8

    if-ne v6, v11, :cond_6

    const/4 v6, 0x0

    const/16 v16, 0x0

    goto :goto_5

    :cond_6
    move/from16 v6, p13

    :goto_5
    if-eqz p26, :cond_9

    if-nez v22, :cond_7

    if-nez v23, :cond_7

    if-nez v12, :cond_7

    move/from16 v11, p12

    invoke-virtual {v10, v9, v11}, La/f/b/d;->e(La/f/b/g;I)V

    goto :goto_6

    :cond_7
    if-eqz v22, :cond_8

    if-nez v23, :cond_8

    invoke-virtual/range {p10 .. p10}, La/f/b/i/c;->b()I

    move-result v11

    move/from16 v27, v12

    const/16 v12, 0x8

    invoke-virtual {v10, v9, v7, v11, v12}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v27, v12

    const/16 v12, 0x8

    goto :goto_7

    :cond_9
    move/from16 v27, v12

    move v12, v11

    :goto_7
    if-nez v16, :cond_d

    const/4 v5, 0x3

    if-eqz p9, :cond_b

    const/4 v11, 0x0

    invoke-virtual {v10, v8, v9, v11, v5}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    if-lez v15, :cond_a

    invoke-virtual {v10, v8, v9, v15, v12}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_a
    const v6, 0x7fffffff

    if-ge v1, v6, :cond_c

    invoke-virtual {v10, v8, v9, v1, v12}, La/f/b/d;->g(La/f/b/g;La/f/b/g;II)V

    goto :goto_8

    :cond_b
    invoke-virtual {v10, v8, v9, v6, v12}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    :cond_c
    :goto_8
    move v1, v5

    goto :goto_c

    :cond_d
    const/4 v1, 0x3

    const/4 v11, 0x2

    if-eq v2, v11, :cond_10

    if-nez p17, :cond_10

    const/4 v11, 0x1

    if-eq v14, v11, :cond_e

    if-nez v14, :cond_10

    :cond_e
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-lez v4, :cond_f

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    :cond_f
    const/16 v6, 0x8

    invoke-virtual {v10, v8, v9, v5, v6}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto/16 :goto_f

    :cond_10
    const/4 v11, -0x2

    if-ne v3, v11, :cond_11

    move v3, v6

    :cond_11
    if-ne v4, v11, :cond_12

    move v4, v6

    :cond_12
    if-lez v6, :cond_13

    const/4 v11, 0x1

    if-eq v14, v11, :cond_13

    const/4 v6, 0x0

    :cond_13
    if-lez v3, :cond_14

    const/16 v11, 0x8

    invoke-virtual {v10, v8, v9, v3, v11}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_14
    if-lez v4, :cond_17

    if-eqz p3, :cond_15

    const/4 v11, 0x1

    if-ne v14, v11, :cond_15

    const/4 v11, 0x0

    goto :goto_9

    :cond_15
    const/4 v11, 0x1

    :goto_9
    if-eqz v11, :cond_16

    const/16 v11, 0x8

    invoke-virtual {v10, v8, v9, v4, v11}, La/f/b/d;->g(La/f/b/g;La/f/b/g;II)V

    goto :goto_a

    :cond_16
    const/16 v11, 0x8

    :goto_a
    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    goto :goto_b

    :cond_17
    const/16 v11, 0x8

    :goto_b
    const/4 v12, 0x1

    if-ne v14, v12, :cond_19

    if-eqz p3, :cond_18

    invoke-virtual {v10, v8, v9, v6, v11}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto :goto_c

    :cond_18
    const/4 v5, 0x5

    invoke-virtual {v10, v8, v9, v6, v5}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    invoke-virtual {v10, v8, v9, v6, v11}, La/f/b/d;->g(La/f/b/g;La/f/b/g;II)V

    :goto_c
    move/from16 v11, p5

    move v12, v3

    goto :goto_10

    :cond_19
    const/4 v6, 0x2

    if-ne v14, v6, :cond_1c

    .line 5
    iget-object v6, v13, La/f/b/i/c;->c:La/f/b/i/c$a;

    .line 6
    sget-object v11, La/f/b/i/c$a;->d:La/f/b/i/c$a;

    if-eq v6, v11, :cond_1b

    if-ne v6, v5, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v5, v0, La/f/b/i/d;->K:La/f/b/i/d;

    sget-object v6, La/f/b/i/c$a;->c:La/f/b/i/c$a;

    invoke-virtual {v5, v6}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v5

    invoke-virtual {v10, v5}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v5

    iget-object v6, v0, La/f/b/i/d;->K:La/f/b/i/d;

    sget-object v11, La/f/b/i/c$a;->e:La/f/b/i/c$a;

    invoke-virtual {v6, v11}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v6

    invoke-virtual {v10, v6}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v6

    move-object/from16 v20, v5

    move-object/from16 v19, v6

    goto :goto_e

    :cond_1b
    :goto_d
    iget-object v6, v0, La/f/b/i/d;->K:La/f/b/i/d;

    invoke-virtual {v6, v11}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v6

    invoke-virtual {v10, v6}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v6

    iget-object v11, v0, La/f/b/i/d;->K:La/f/b/i/d;

    invoke-virtual {v11, v5}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v5

    invoke-virtual {v10, v5}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v5

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    :goto_e
    invoke-virtual/range {p1 .. p1}, La/f/b/d;->m()La/f/b/b;

    move-result-object v5

    move-object/from16 v16, v5

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    move/from16 v21, p25

    invoke-virtual/range {v16 .. v21}, La/f/b/b;->d(La/f/b/g;La/f/b/g;La/f/b/g;La/f/b/g;F)La/f/b/b;

    invoke-virtual {v10, v5}, La/f/b/d;->c(La/f/b/b;)V

    :goto_f
    move/from16 v11, p5

    move v12, v3

    const/16 v16, 0x0

    goto :goto_10

    :cond_1c
    move v12, v3

    const/4 v11, 0x1

    :goto_10
    if-eqz p26, :cond_51

    if-eqz p18, :cond_1d

    move-object/from16 v5, p7

    move v1, v2

    move-object v3, v8

    move-object v13, v9

    move/from16 p5, v11

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/16 v25, 0x1

    move-object/from16 v2, p6

    goto/16 :goto_2c

    :cond_1d
    if-nez v22, :cond_1e

    if-nez v23, :cond_1e

    if-nez v27, :cond_1e

    goto :goto_11

    :cond_1e
    if-eqz v22, :cond_20

    if-nez v23, :cond_20

    :goto_11
    move-object/from16 v6, v24

    :cond_1f
    const/4 v5, 0x0

    goto :goto_12

    :cond_20
    if-nez v22, :cond_22

    if-eqz v23, :cond_22

    invoke-virtual/range {p11 .. p11}, La/f/b/i/c;->b()I

    move-result v1

    neg-int v1, v1

    move-object/from16 v6, v24

    const/16 v2, 0x8

    invoke-virtual {v10, v8, v6, v1, v2}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    if-eqz p3, :cond_1f

    move-object/from16 v3, p6

    const/4 v1, 0x5

    const/4 v5, 0x0

    invoke-virtual {v10, v9, v3, v5, v1}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_21
    :goto_12
    move v4, v5

    move-object v1, v6

    move-object v3, v8

    move/from16 p5, v11

    goto/16 :goto_2a

    :cond_22
    move-object/from16 v3, p6

    move-object/from16 v6, v24

    const/4 v5, 0x0

    if-eqz v22, :cond_21

    if-eqz v23, :cond_21

    iget-object v2, v13, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v2, v2, La/f/b/i/c;->b:La/f/b/i/d;

    move v13, v1

    move-object/from16 v1, p11

    iget-object v5, v1, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v5, v5, La/f/b/i/c;->b:La/f/b/i/d;

    .line 7
    iget-object v13, v0, La/f/b/i/d;->K:La/f/b/i/d;

    const/16 v17, 0x6

    if-eqz v16, :cond_34

    if-nez v14, :cond_26

    if-nez v4, :cond_23

    if-nez v12, :cond_23

    const/4 v4, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x8

    const/16 v20, 0x8

    goto :goto_13

    :cond_23
    const/4 v4, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x5

    const/16 v20, 0x5

    .line 8
    :goto_13
    instance-of v1, v2, La/f/b/i/a;

    if-nez v1, :cond_24

    instance-of v1, v5, La/f/b/i/a;

    if-eqz v1, :cond_25

    :cond_24
    const/16 v20, 0x4

    :cond_25
    move v1, v4

    move/from16 v4, v17

    const/4 v3, 0x1

    const/16 v26, 0x0

    goto/16 :goto_1d

    :cond_26
    const/4 v1, 0x1

    if-ne v14, v1, :cond_27

    const/16 v1, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/16 v26, 0x1

    goto/16 :goto_1c

    :cond_27
    const/4 v1, 0x3

    if-ne v14, v1, :cond_33

    iget v1, v0, La/f/b/i/d;->s:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_2a

    if-eqz p19, :cond_29

    if-eqz p3, :cond_28

    const/4 v1, 0x5

    goto :goto_14

    :cond_28
    const/4 v1, 0x4

    goto :goto_14

    :cond_29
    const/16 v1, 0x8

    :goto_14
    move v4, v1

    const/4 v1, 0x5

    const/4 v3, 0x1

    const/16 v18, 0x8

    goto :goto_1a

    :cond_2a
    if-eqz p17, :cond_2e

    move/from16 v1, p22

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2c

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2b

    goto :goto_15

    :cond_2b
    const/4 v1, 0x0

    goto :goto_16

    :cond_2c
    const/4 v3, 0x1

    :goto_15
    move v1, v3

    :goto_16
    if-nez v1, :cond_2d

    const/4 v1, 0x5

    const/16 v4, 0x8

    goto :goto_17

    :cond_2d
    const/4 v1, 0x4

    const/4 v4, 0x5

    :goto_17
    move/from16 v18, v4

    move/from16 v4, v17

    goto :goto_1a

    :cond_2e
    const/4 v3, 0x1

    if-lez v4, :cond_2f

    const/4 v1, 0x5

    goto :goto_19

    :cond_2f
    if-nez v4, :cond_32

    if-nez v12, :cond_32

    if-nez p19, :cond_30

    const/16 v1, 0x8

    goto :goto_19

    :cond_30
    if-eq v2, v13, :cond_31

    if-eq v5, v13, :cond_31

    const/4 v1, 0x4

    goto :goto_18

    :cond_31
    const/4 v1, 0x5

    :goto_18
    move/from16 v18, v1

    move/from16 v4, v17

    const/4 v1, 0x4

    goto :goto_1a

    :cond_32
    const/4 v1, 0x4

    :goto_19
    move/from16 v4, v17

    const/16 v18, 0x5

    :goto_1a
    move/from16 v20, v1

    move v1, v3

    move/from16 v26, v1

    move/from16 v19, v18

    move/from16 v18, v26

    goto :goto_1d

    :cond_33
    const/4 v3, 0x1

    const/4 v1, 0x0

    const/4 v4, 0x0

    goto :goto_1b

    :cond_34
    const/4 v3, 0x1

    move v1, v3

    move v4, v1

    :goto_1b
    move/from16 v26, v1

    const/4 v1, 0x5

    :goto_1c
    move/from16 v19, v1

    move v1, v4

    move/from16 v4, v17

    const/16 v18, 0x0

    const/16 v20, 0x4

    :goto_1d
    if-eqz v26, :cond_35

    if-ne v7, v6, :cond_35

    if-eq v2, v13, :cond_35

    const/16 v21, 0x0

    const/16 v26, 0x0

    goto :goto_1e

    :cond_35
    move/from16 v21, v3

    :goto_1e
    if-eqz v1, :cond_37

    iget v1, v0, La/f/b/i/d;->X:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_36

    const/16 v23, 0x4

    goto :goto_1f

    :cond_36
    move/from16 v23, v4

    :goto_1f
    invoke-virtual/range {p10 .. p10}, La/f/b/i/c;->b()I

    move-result v4

    invoke-virtual/range {p11 .. p11}, La/f/b/i/c;->b()I

    move-result v24

    move-object/from16 v3, p11

    move-object/from16 v1, p1

    move/from16 p5, v11

    move-object v11, v2

    move-object v2, v9

    move/from16 v27, v14

    const/16 v22, 0x1

    move-object/from16 v14, p6

    move-object v3, v7

    move/from16 p8, v12

    const/16 v25, 0x0

    move-object v12, v5

    move/from16 v5, p16

    move-object/from16 p2, v6

    move/from16 v25, v22

    const/16 v22, 0x4

    move-object v15, v7

    move-object v7, v8

    move-object v14, v8

    move/from16 v8, v24

    move-object/from16 v24, v13

    move-object v13, v9

    move/from16 v9, v23

    invoke-virtual/range {v1 .. v9}, La/f/b/d;->b(La/f/b/g;La/f/b/g;IFLa/f/b/g;La/f/b/g;II)V

    goto :goto_20

    :cond_37
    move/from16 v25, v3

    move-object/from16 p2, v6

    move-object v15, v7

    move/from16 p5, v11

    move/from16 p8, v12

    move-object/from16 v24, v13

    move/from16 v27, v14

    const/16 v22, 0x4

    move-object v11, v2

    move-object v12, v5

    move-object v14, v8

    move-object v13, v9

    :goto_20
    iget v1, v0, La/f/b/i/d;->X:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_38

    return-void

    :cond_38
    move-object/from16 v1, p2

    if-eqz v26, :cond_3b

    if-eqz p3, :cond_3a

    if-eq v15, v1, :cond_3a

    if-nez v16, :cond_3a

    instance-of v2, v11, La/f/b/i/a;

    if-nez v2, :cond_39

    instance-of v2, v12, La/f/b/i/a;

    if-eqz v2, :cond_3a

    :cond_39
    move/from16 v2, v17

    goto :goto_21

    :cond_3a
    move/from16 v2, v19

    :goto_21
    invoke-virtual/range {p10 .. p10}, La/f/b/i/c;->b()I

    move-result v3

    invoke-virtual {v10, v13, v15, v3, v2}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    invoke-virtual/range {p11 .. p11}, La/f/b/i/c;->b()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v10, v14, v1, v3, v2}, La/f/b/d;->g(La/f/b/g;La/f/b/g;II)V

    move/from16 v19, v2

    :cond_3b
    if-eqz p3, :cond_3c

    if-eqz p20, :cond_3c

    instance-of v2, v11, La/f/b/i/a;

    if-nez v2, :cond_3c

    instance-of v2, v12, La/f/b/i/a;

    if-nez v2, :cond_3c

    move/from16 v2, v17

    move v3, v2

    move/from16 v6, v25

    goto :goto_22

    :cond_3c
    move/from16 v2, v19

    move/from16 v3, v20

    move/from16 v6, v21

    :goto_22
    if-eqz v6, :cond_49

    if-eqz v18, :cond_45

    if-eqz p19, :cond_3d

    if-eqz p4, :cond_45

    :cond_3d
    move-object/from16 v4, v24

    if-eq v11, v4, :cond_3f

    if-ne v12, v4, :cond_3e

    goto :goto_23

    :cond_3e
    move/from16 v17, v3

    :cond_3f
    :goto_23
    instance-of v5, v11, La/f/b/i/f;

    if-nez v5, :cond_40

    instance-of v5, v12, La/f/b/i/f;

    if-eqz v5, :cond_41

    :cond_40
    const/16 v17, 0x5

    :cond_41
    instance-of v5, v11, La/f/b/i/a;

    if-nez v5, :cond_42

    instance-of v5, v12, La/f/b/i/a;

    if-eqz v5, :cond_43

    :cond_42
    const/16 v17, 0x5

    :cond_43
    if-eqz p19, :cond_44

    const/4 v5, 0x5

    goto :goto_24

    :cond_44
    move/from16 v5, v17

    :goto_24
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_25

    :cond_45
    move-object/from16 v4, v24

    :goto_25
    if-eqz p3, :cond_48

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-eqz p17, :cond_47

    if-nez p19, :cond_47

    if-eq v11, v4, :cond_46

    if-ne v12, v4, :cond_47

    :cond_46
    move/from16 v6, v22

    goto :goto_26

    :cond_47
    move v6, v2

    goto :goto_26

    :cond_48
    move v6, v3

    :goto_26
    invoke-virtual/range {p10 .. p10}, La/f/b/i/c;->b()I

    move-result v2

    invoke-virtual {v10, v13, v15, v2, v6}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    invoke-virtual/range {p11 .. p11}, La/f/b/i/c;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v10, v14, v1, v2, v6}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    :cond_49
    if-eqz p3, :cond_4b

    move-object/from16 v2, p6

    move-object v3, v14

    if-ne v2, v15, :cond_4a

    invoke-virtual/range {p10 .. p10}, La/f/b/i/c;->b()I

    move-result v6

    goto :goto_27

    :cond_4a
    const/4 v6, 0x0

    :goto_27
    if-eq v15, v2, :cond_4c

    const/4 v4, 0x5

    invoke-virtual {v10, v13, v2, v6, v4}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_28

    :cond_4b
    move-object v3, v14

    :cond_4c
    :goto_28
    if-eqz p3, :cond_4e

    if-eqz v16, :cond_4e

    if-nez p14, :cond_4e

    if-nez p8, :cond_4e

    if-eqz v16, :cond_4d

    move/from16 v14, v27

    const/4 v2, 0x3

    if-ne v14, v2, :cond_4d

    const/16 v2, 0x8

    const/4 v4, 0x0

    goto :goto_29

    :cond_4d
    const/4 v4, 0x0

    const/4 v2, 0x5

    :goto_29
    invoke-virtual {v10, v3, v13, v4, v2}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_2a

    :cond_4e
    const/4 v4, 0x0

    :goto_2a
    if-eqz p3, :cond_50

    if-eqz p5, :cond_50

    move-object/from16 v2, p11

    iget-object v5, v2, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v5, :cond_4f

    invoke-virtual/range {p11 .. p11}, La/f/b/i/c;->b()I

    move-result v6

    move-object/from16 v5, p7

    goto :goto_2b

    :cond_4f
    move-object/from16 v5, p7

    move v6, v4

    :goto_2b
    if-eq v1, v5, :cond_50

    const/4 v1, 0x5

    invoke-virtual {v10, v5, v3, v6, v1}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_50
    return-void

    :cond_51
    move-object/from16 v5, p7

    move v1, v2

    move-object v3, v8

    move-object v13, v9

    move/from16 p5, v11

    const/4 v4, 0x0

    const/16 v25, 0x1

    move-object/from16 v2, p6

    const/4 v6, 0x2

    :goto_2c
    if-ge v1, v6, :cond_56

    if-eqz p3, :cond_56

    if-eqz p5, :cond_56

    const/16 v1, 0x8

    invoke-virtual {v10, v13, v2, v4, v1}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    if-nez p2, :cond_53

    iget-object v1, v0, La/f/b/i/d;->C:La/f/b/i/c;

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-nez v1, :cond_52

    goto :goto_2d

    :cond_52
    move v6, v4

    goto :goto_2e

    :cond_53
    :goto_2d
    move/from16 v6, v25

    :goto_2e
    if-nez p2, :cond_55

    iget-object v1, v0, La/f/b/i/d;->C:La/f/b/i/c;

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v1, :cond_55

    iget-object v1, v1, La/f/b/i/c;->b:La/f/b/i/d;

    iget v2, v1, La/f/b/i/d;->N:F

    const/4 v6, 0x0

    cmpl-float v2, v2, v6

    if-eqz v2, :cond_54

    iget-object v1, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v2, v1, v4

    sget-object v6, La/f/b/i/d$a;->d:La/f/b/i/d$a;

    if-ne v2, v6, :cond_54

    aget-object v1, v1, v25

    if-ne v1, v6, :cond_54

    move/from16 v6, v25

    goto :goto_2f

    :cond_54
    move v6, v4

    :cond_55
    :goto_2f
    if-eqz v6, :cond_56

    const/16 v1, 0x8

    invoke-virtual {v10, v5, v3, v4, v1}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_56
    return-void
.end method

.method public e(La/f/b/d;)V
    .locals 1

    iget-object v0, p0, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    iget-object v0, p0, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    iget-object v0, p0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    iget-object v0, p0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    iget v0, p0, La/f/b/i/d;->R:I

    if-lez v0, :cond_0

    iget-object v0, p0, La/f/b/i/d;->C:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    :cond_0
    return-void
.end method

.method public f(La/f/b/i/c$a;)La/f/b/i/c;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, La/f/b/i/d;->E:La/f/b/i/c;

    return-object p1

    :pswitch_2
    iget-object p1, p0, La/f/b/i/d;->D:La/f/b/i/c;

    return-object p1

    :pswitch_3
    iget-object p1, p0, La/f/b/i/d;->F:La/f/b/i/c;

    return-object p1

    :pswitch_4
    iget-object p1, p0, La/f/b/i/d;->C:La/f/b/i/c;

    return-object p1

    :pswitch_5
    iget-object p1, p0, La/f/b/i/d;->B:La/f/b/i/c;

    return-object p1

    :pswitch_6
    iget-object p1, p0, La/f/b/i/d;->A:La/f/b/i/c;

    return-object p1

    :pswitch_7
    iget-object p1, p0, La/f/b/i/d;->z:La/f/b/i/c;

    return-object p1

    :pswitch_8
    iget-object p1, p0, La/f/b/i/d;->y:La/f/b/i/c;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public g()I
    .locals 2

    invoke-virtual {p0}, La/f/b/i/d;->q()I

    move-result v0

    iget v1, p0, La/f/b/i/d;->M:I

    add-int/2addr v0, v1

    return v0
.end method

.method public h(I)La/f/b/i/d$a;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, La/f/b/i/d;->j()La/f/b/i/d$a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, La/f/b/i/d;->n()La/f/b/i/d$a;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public i()I
    .locals 2

    iget v0, p0, La/f/b/i/d;->X:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, La/f/b/i/d;->M:I

    return v0
.end method

.method public j()La/f/b/i/d$a;
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public k(I)La/f/b/i/d;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, La/f/b/i/d;->A:La/f/b/i/c;

    iget-object v0, p1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/f/b/i/c;->b:La/f/b/i/d;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La/f/b/i/d;->B:La/f/b/i/c;

    iget-object v0, p1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/f/b/i/c;->b:La/f/b/i/d;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(I)La/f/b/i/d;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, La/f/b/i/d;->y:La/f/b/i/c;

    iget-object v0, p1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/f/b/i/c;->b:La/f/b/i/d;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La/f/b/i/d;->z:La/f/b/i/c;

    iget-object v0, p1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, La/f/b/i/c;->b:La/f/b/i/d;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public m()I
    .locals 2

    invoke-virtual {p0}, La/f/b/i/d;->p()I

    move-result v0

    iget v1, p0, La/f/b/i/d;->L:I

    add-int/2addr v0, v1

    return v0
.end method

.method public n()La/f/b/i/d$a;
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public o()I
    .locals 2

    iget v0, p0, La/f/b/i/d;->X:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, La/f/b/i/d;->L:I

    return v0
.end method

.method public p()I
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_0

    instance-of v1, v0, La/f/b/i/e;

    if-eqz v1, :cond_0

    check-cast v0, La/f/b/i/e;

    iget v0, v0, La/f/b/i/e;->k0:I

    iget v1, p0, La/f/b/i/d;->P:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, La/f/b/i/d;->P:I

    return v0
.end method

.method public q()I
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v0, :cond_0

    instance-of v1, v0, La/f/b/i/e;

    if-eqz v1, :cond_0

    check-cast v0, La/f/b/i/e;

    iget v0, v0, La/f/b/i/e;->l0:I

    iget v1, p0, La/f/b/i/d;->Q:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, La/f/b/i/d;->Q:I

    return v0
.end method

.method public final r(I)Z
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v0, p1

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    aget-object v3, v0, p1

    if-eq v1, v3, :cond_0

    add-int/2addr p1, v2

    aget-object v1, v0, p1

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    aget-object p1, v0, p1

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public s()Z
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->y:La/f/b/i/c;

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v1, :cond_0

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, La/f/b/i/d;->A:La/f/b/i/c;

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v1, :cond_2

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public t()Z
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->z:La/f/b/i/c;

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v1, :cond_0

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, La/f/b/i/d;->B:La/f/b/i/c;

    iget-object v1, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v1, :cond_2

    iget-object v1, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, ""

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, La/f/b/i/d;->Y:Ljava/lang/String;

    if-eqz v2, :cond_0

    const-string v0, "id: "

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, La/f/b/i/d;->Y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, La/f/b/i/d;->P:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, La/f/b/i/d;->Q:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") - ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, La/f/b/i/d;->L:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " x "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, La/f/b/i/d;->M:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 6

    iget-object v0, p0, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->C:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->D:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->E:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    iget-object v0, p0, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {v0}, La/f/b/i/c;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, La/f/b/i/d;->K:La/f/b/i/d;

    const/4 v1, 0x0

    iput v1, p0, La/f/b/i/d;->v:F

    const/4 v2, 0x0

    iput v2, p0, La/f/b/i/d;->L:I

    iput v2, p0, La/f/b/i/d;->M:I

    iput v1, p0, La/f/b/i/d;->N:F

    const/4 v1, -0x1

    iput v1, p0, La/f/b/i/d;->O:I

    iput v2, p0, La/f/b/i/d;->P:I

    iput v2, p0, La/f/b/i/d;->Q:I

    iput v2, p0, La/f/b/i/d;->R:I

    iput v2, p0, La/f/b/i/d;->S:I

    iput v2, p0, La/f/b/i/d;->T:I

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, p0, La/f/b/i/d;->U:F

    iput v3, p0, La/f/b/i/d;->V:F

    iget-object v3, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    sget-object v4, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, La/f/b/i/d;->W:Ljava/lang/Object;

    iput v2, p0, La/f/b/i/d;->X:I

    iput v2, p0, La/f/b/i/d;->Z:I

    iput v2, p0, La/f/b/i/d;->a0:I

    iget-object v0, p0, La/f/b/i/d;->b0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    aput v3, v0, v5

    iput v1, p0, La/f/b/i/d;->h:I

    iput v1, p0, La/f/b/i/d;->i:I

    iget-object v0, p0, La/f/b/i/d;->u:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    aput v3, v0, v5

    iput v2, p0, La/f/b/i/d;->j:I

    iput v2, p0, La/f/b/i/d;->k:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, La/f/b/i/d;->o:F

    iput v0, p0, La/f/b/i/d;->r:F

    iput v3, p0, La/f/b/i/d;->n:I

    iput v3, p0, La/f/b/i/d;->q:I

    iput v2, p0, La/f/b/i/d;->m:I

    iput v2, p0, La/f/b/i/d;->p:I

    iput v1, p0, La/f/b/i/d;->s:I

    iput v0, p0, La/f/b/i/d;->t:F

    iget-object v0, p0, La/f/b/i/d;->f:[Z

    aput-boolean v5, v0, v2

    aput-boolean v5, v0, v5

    iget-object v0, p0, La/f/b/i/d;->I:[Z

    aput-boolean v2, v0, v2

    aput-boolean v2, v0, v5

    return-void
.end method

.method public v(La/f/b/c;)V
    .locals 0

    iget-object p1, p0, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->C:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->F:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->D:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    iget-object p1, p0, La/f/b/i/d;->E:La/f/b/i/c;

    invoke-virtual {p1}, La/f/b/i/c;->f()V

    return-void
.end method

.method public w(I)V
    .locals 1

    iput p1, p0, La/f/b/i/d;->M:I

    iget v0, p0, La/f/b/i/d;->T:I

    if-ge p1, v0, :cond_0

    iput v0, p0, La/f/b/i/d;->M:I

    :cond_0
    return-void
.end method

.method public x(La/f/b/i/d$a;)V
    .locals 2

    iget-object v0, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public y(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, La/f/b/i/d;->T:I

    return-void
.end method

.method public z(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, La/f/b/i/d;->S:I

    return-void
.end method
