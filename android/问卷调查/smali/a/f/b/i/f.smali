.class public La/f/b/i/f;
.super La/f/b/i/d;
.source ""


# instance fields
.field public e0:F

.field public f0:I

.field public g0:I

.field public h0:La/f/b/i/c;

.field public i0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, La/f/b/i/d;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, La/f/b/i/f;->e0:F

    const/4 v0, -0x1

    iput v0, p0, La/f/b/i/f;->f0:I

    iput v0, p0, La/f/b/i/f;->g0:I

    iget-object v0, p0, La/f/b/i/d;->z:La/f/b/i/c;

    iput-object v0, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    const/4 v0, 0x0

    iput v0, p0, La/f/b/i/f;->i0:I

    iget-object v1, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v2, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, La/f/b/i/d;->G:[La/f/b/i/c;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, La/f/b/i/d;->G:[La/f/b/i/c;

    iget-object v3, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public D(La/f/b/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/f/b/i/d;->K:La/f/b/i/d;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->o(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, La/f/b/i/f;->i0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 3
    iput p1, p0, La/f/b/i/d;->P:I

    .line 4
    iput v2, p0, La/f/b/i/d;->Q:I

    .line 5
    iget-object p1, p0, La/f/b/i/d;->K:La/f/b/i/d;

    .line 6
    invoke-virtual {p1}, La/f/b/i/d;->i()I

    move-result p1

    invoke-virtual {p0, p1}, La/f/b/i/d;->w(I)V

    invoke-virtual {p0, v2}, La/f/b/i/d;->B(I)V

    goto :goto_0

    .line 7
    :cond_1
    iput v2, p0, La/f/b/i/d;->P:I

    .line 8
    iput p1, p0, La/f/b/i/d;->Q:I

    .line 9
    iget-object p1, p0, La/f/b/i/d;->K:La/f/b/i/d;

    .line 10
    invoke-virtual {p1}, La/f/b/i/d;->o()I

    move-result p1

    invoke-virtual {p0, p1}, La/f/b/i/d;->B(I)V

    invoke-virtual {p0, v2}, La/f/b/i/d;->w(I)V

    :goto_0
    return-void
.end method

.method public E(I)V
    .locals 3

    iget v0, p0, La/f/b/i/f;->i0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, La/f/b/i/f;->i0:I

    iget-object p1, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, La/f/b/i/f;->i0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La/f/b/i/d;->y:La/f/b/i/c;

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/f/b/i/d;->z:La/f/b/i/c;

    :goto_0
    iput-object p1, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    iget-object p1, p0, La/f/b/i/d;->H:Ljava/util/ArrayList;

    iget-object v0, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, La/f/b/i/d;->G:[La/f/b/i/c;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, La/f/b/i/d;->G:[La/f/b/i/c;

    iget-object v2, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public b(La/f/b/d;)V
    .locals 8

    .line 1
    sget-object v0, La/f/b/i/d$a;->c:La/f/b/i/d$a;

    iget-object v1, p0, La/f/b/i/d;->K:La/f/b/i/d;

    .line 2
    check-cast v1, La/f/b/i/e;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v2, La/f/b/i/c$a;->c:La/f/b/i/c$a;

    invoke-virtual {v1, v2}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v2

    sget-object v3, La/f/b/i/c$a;->e:La/f/b/i/c$a;

    invoke-virtual {v1, v3}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v3

    iget-object v4, p0, La/f/b/i/d;->K:La/f/b/i/d;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v4, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v4, v4, v6

    if-ne v4, v0, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    iget v7, p0, La/f/b/i/f;->i0:I

    if-nez v7, :cond_3

    sget-object v2, La/f/b/i/c$a;->d:La/f/b/i/c$a;

    invoke-virtual {v1, v2}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v2

    sget-object v3, La/f/b/i/c$a;->f:La/f/b/i/c$a;

    invoke-virtual {v1, v3}, La/f/b/i/d;->f(La/f/b/i/c$a;)La/f/b/i/c;

    move-result-object v3

    iget-object v1, p0, La/f/b/i/d;->K:La/f/b/i/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v1, v1, v5

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    move v5, v6

    :goto_1
    move v4, v5

    :cond_3
    iget v0, p0, La/f/b/i/f;->f0:I

    const/16 v1, 0x8

    const/4 v5, -0x1

    const/4 v7, 0x5

    if-eq v0, v5, :cond_4

    iget-object v0, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    invoke-virtual {p1, v2}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v2

    iget v5, p0, La/f/b/i/f;->f0:I

    invoke-virtual {p1, v0, v2, v5, v1}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    if-eqz v4, :cond_6

    invoke-virtual {p1, v3}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v6, v7}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_2

    :cond_4
    iget v0, p0, La/f/b/i/f;->g0:I

    if-eq v0, v5, :cond_5

    iget-object v0, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    invoke-virtual {p1, v3}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v3

    iget v5, p0, La/f/b/i/f;->g0:I

    neg-int v5, v5

    invoke-virtual {p1, v0, v3, v5, v1}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    if-eqz v4, :cond_6

    invoke-virtual {p1, v2}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v6, v7}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    invoke-virtual {p1, v3, v0, v6, v7}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_2

    :cond_5
    iget v0, p0, La/f/b/i/f;->e0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    invoke-virtual {p1, v0}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v0

    invoke-virtual {p1, v3}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v2

    iget v3, p0, La/f/b/i/f;->e0:F

    .line 3
    invoke-virtual {p1}, La/f/b/d;->m()La/f/b/b;

    move-result-object v4

    .line 4
    iget-object v5, v4, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v5, v0, v1}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v0, v4, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v0, v2, v3}, La/f/b/b$a;->j(La/f/b/g;F)V

    .line 5
    invoke-virtual {p1, v4}, La/f/b/d;->c(La/f/b/b;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f(La/f/b/i/c$a;)La/f/b/i/c;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget v0, p0, La/f/b/i/f;->i0:I

    if-nez v0, :cond_0

    iget-object p1, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    return-object p1

    :pswitch_2
    iget v0, p0, La/f/b/i/f;->i0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, La/f/b/i/f;->h0:La/f/b/i/c;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
