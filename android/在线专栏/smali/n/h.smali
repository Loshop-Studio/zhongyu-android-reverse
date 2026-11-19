.class public Ln/h;
.super Ln/e;
.source "SourceFile"


# instance fields
.field protected G0:F

.field protected H0:I

.field protected I0:I

.field private J0:Ln/d;

.field private K0:I

.field private L0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ln/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    iput v0, p0, Ln/h;->G0:F

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Ln/h;->H0:I

    .line 4
    iput v0, p0, Ln/h;->I0:I

    .line 5
    iget-object v0, p0, Ln/e;->E:Ln/d;

    iput-object v0, p0, Ln/h;->J0:Ln/d;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Ln/h;->K0:I

    .line 7
    iput v0, p0, Ln/h;->L0:I

    .line 8
    iget-object v1, p0, Ln/e;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 9
    iget-object v1, p0, Ln/e;->M:Ljava/util/ArrayList;

    iget-object v2, p0, Ln/h;->J0:Ln/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object v1, p0, Ln/e;->L:[Ln/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 11
    iget-object v2, p0, Ln/e;->L:[Ln/d;

    iget-object v3, p0, Ln/h;->J0:Ln/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public K0(Lm/d;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ln/e;->H()Ln/e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Ln/h;->J0:Ln/d;

    invoke-virtual {p1, v0}, Lm/d;->x(Ljava/lang/Object;)I

    move-result p1

    .line 3
    iget v0, p0, Ln/h;->K0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Ln/e;->G0(I)V

    .line 5
    invoke-virtual {p0, v2}, Ln/e;->H0(I)V

    .line 6
    invoke-virtual {p0}, Ln/e;->H()Ln/e;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->w()I

    move-result p1

    invoke-virtual {p0, p1}, Ln/e;->i0(I)V

    .line 7
    invoke-virtual {p0, v2}, Ln/e;->F0(I)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v2}, Ln/e;->G0(I)V

    .line 9
    invoke-virtual {p0, p1}, Ln/e;->H0(I)V

    .line 10
    invoke-virtual {p0}, Ln/e;->H()Ln/e;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->Q()I

    move-result p1

    invoke-virtual {p0, p1}, Ln/e;->F0(I)V

    .line 11
    invoke-virtual {p0, v2}, Ln/e;->i0(I)V

    :goto_0
    return-void
.end method

.method public L0()I
    .locals 1

    iget v0, p0, Ln/h;->K0:I

    return v0
.end method

.method public M0()I
    .locals 1

    iget v0, p0, Ln/h;->H0:I

    return v0
.end method

.method public N0()I
    .locals 1

    iget v0, p0, Ln/h;->I0:I

    return v0
.end method

.method public O0()F
    .locals 1

    iget v0, p0, Ln/h;->G0:F

    return v0
.end method

.method public P0(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 1
    iput v1, p0, Ln/h;->G0:F

    .line 2
    iput p1, p0, Ln/h;->H0:I

    .line 3
    iput v0, p0, Ln/h;->I0:I

    :cond_0
    return-void
.end method

.method public Q0(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    .line 1
    iput v1, p0, Ln/h;->G0:F

    .line 2
    iput v0, p0, Ln/h;->H0:I

    .line 3
    iput p1, p0, Ln/h;->I0:I

    :cond_0
    return-void
.end method

.method public R0(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    iput p1, p0, Ln/h;->G0:F

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Ln/h;->H0:I

    .line 3
    iput p1, p0, Ln/h;->I0:I

    :cond_0
    return-void
.end method

.method public S0(I)V
    .locals 3

    .line 1
    iget v0, p0, Ln/h;->K0:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Ln/h;->K0:I

    .line 3
    iget-object p1, p0, Ln/e;->M:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget p1, p0, Ln/h;->K0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Ln/e;->D:Ln/d;

    iput-object p1, p0, Ln/h;->J0:Ln/d;

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Ln/e;->E:Ln/d;

    iput-object p1, p0, Ln/h;->J0:Ln/d;

    .line 7
    :goto_0
    iget-object p1, p0, Ln/e;->M:Ljava/util/ArrayList;

    iget-object v0, p0, Ln/h;->J0:Ln/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Ln/e;->L:[Ln/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    .line 9
    iget-object v1, p0, Ln/e;->L:[Ln/d;

    iget-object v2, p0, Ln/h;->J0:Ln/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public f(Lm/d;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ln/e;->H()Ln/e;

    move-result-object v0

    check-cast v0, Ln/f;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v1, Ln/d$b;->b:Ln/d$b;

    invoke-virtual {v0, v1}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v1

    .line 3
    sget-object v2, Ln/d$b;->d:Ln/d$b;

    invoke-virtual {v0, v2}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v2

    .line 4
    iget-object v3, p0, Ln/e;->P:Ln/e;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    iget-object v3, v3, Ln/e;->O:[Ln/e$b;

    aget-object v3, v3, v5

    sget-object v6, Ln/e$b;->b:Ln/e$b;

    if-ne v3, v6, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 5
    :goto_0
    iget v6, p0, Ln/h;->K0:I

    if-nez v6, :cond_3

    .line 6
    sget-object v1, Ln/d$b;->c:Ln/d$b;

    invoke-virtual {v0, v1}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v1

    .line 7
    sget-object v2, Ln/d$b;->e:Ln/d$b;

    invoke-virtual {v0, v2}, Ln/e;->n(Ln/d$b;)Ln/d;

    move-result-object v2

    .line 8
    iget-object v0, p0, Ln/e;->P:Ln/e;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ln/e;->O:[Ln/e$b;

    aget-object v0, v0, v4

    sget-object v3, Ln/e$b;->b:Ln/e$b;

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    move v3, v4

    .line 9
    :cond_3
    iget v0, p0, Ln/h;->H0:I

    const/16 v4, 0x8

    const/4 v6, -0x1

    const/4 v7, 0x5

    if-eq v0, v6, :cond_4

    .line 10
    iget-object v0, p0, Ln/h;->J0:Ln/d;

    invoke-virtual {p1, v0}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v0

    .line 11
    invoke-virtual {p1, v1}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v1

    .line 12
    iget v6, p0, Ln/h;->H0:I

    invoke-virtual {p1, v0, v1, v6, v4}, Lm/d;->e(Lm/i;Lm/i;II)Lm/b;

    if-eqz v3, :cond_6

    .line 13
    invoke-virtual {p1, v2}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v5, v7}, Lm/d;->h(Lm/i;Lm/i;II)V

    goto :goto_2

    .line 14
    :cond_4
    iget v0, p0, Ln/h;->I0:I

    if-eq v0, v6, :cond_5

    .line 15
    iget-object v0, p0, Ln/h;->J0:Ln/d;

    invoke-virtual {p1, v0}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v0

    .line 16
    invoke-virtual {p1, v2}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v2

    .line 17
    iget v6, p0, Ln/h;->I0:I

    neg-int v6, v6

    invoke-virtual {p1, v0, v2, v6, v4}, Lm/d;->e(Lm/i;Lm/i;II)Lm/b;

    if-eqz v3, :cond_6

    .line 18
    invoke-virtual {p1, v1}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v5, v7}, Lm/d;->h(Lm/i;Lm/i;II)V

    .line 19
    invoke-virtual {p1, v2, v0, v5, v7}, Lm/d;->h(Lm/i;Lm/i;II)V

    goto :goto_2

    .line 20
    :cond_5
    iget v0, p0, Ln/h;->G0:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    .line 21
    iget-object v0, p0, Ln/h;->J0:Ln/d;

    invoke-virtual {p1, v0}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v0

    .line 22
    invoke-virtual {p1, v2}, Lm/d;->q(Ljava/lang/Object;)Lm/i;

    move-result-object v1

    .line 23
    iget v2, p0, Ln/h;->G0:F

    .line 24
    invoke-static {p1, v0, v1, v2}, Lm/d;->s(Lm/d;Lm/i;Lm/i;F)Lm/b;

    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lm/d;->d(Lm/b;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l(Ln/e;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/e;",
            "Ljava/util/HashMap<",
            "Ln/e;",
            "Ln/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Ln/e;->l(Ln/e;Ljava/util/HashMap;)V

    .line 2
    check-cast p1, Ln/h;

    .line 3
    iget p2, p1, Ln/h;->G0:F

    iput p2, p0, Ln/h;->G0:F

    .line 4
    iget p2, p1, Ln/h;->H0:I

    iput p2, p0, Ln/h;->H0:I

    .line 5
    iget p2, p1, Ln/h;->I0:I

    iput p2, p0, Ln/h;->I0:I

    .line 6
    iget p1, p1, Ln/h;->K0:I

    invoke-virtual {p0, p1}, Ln/h;->S0(I)V

    return-void
.end method

.method public n(Ln/d$b;)Ln/d;
    .locals 2

    .line 1
    sget-object v0, Ln/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    .line 2
    :pswitch_1
    iget v0, p0, Ln/h;->K0:I

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Ln/h;->J0:Ln/d;

    return-object p1

    .line 4
    :pswitch_2
    iget v0, p0, Ln/h;->K0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5
    iget-object p1, p0, Ln/h;->J0:Ln/d;

    return-object p1

    .line 6
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
