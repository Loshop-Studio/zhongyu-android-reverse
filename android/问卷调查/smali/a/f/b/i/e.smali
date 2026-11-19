.class public La/f/b/i/e;
.super La/f/b/i/k;
.source ""


# instance fields
.field public f0:La/f/b/i/l/b;

.field public g0:La/f/b/i/l/e;

.field public h0:La/f/b/i/l/b$b;

.field public i0:Z

.field public j0:La/f/b/d;

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:I

.field public o0:[La/f/b/i/b;

.field public p0:[La/f/b/i/b;

.field public q0:I

.field public r0:Z

.field public s0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, La/f/b/i/k;-><init>()V

    new-instance v0, La/f/b/i/l/b;

    invoke-direct {v0, p0}, La/f/b/i/l/b;-><init>(La/f/b/i/e;)V

    iput-object v0, p0, La/f/b/i/e;->f0:La/f/b/i/l/b;

    new-instance v0, La/f/b/i/l/e;

    invoke-direct {v0, p0}, La/f/b/i/l/e;-><init>(La/f/b/i/e;)V

    iput-object v0, p0, La/f/b/i/e;->g0:La/f/b/i/l/e;

    const/4 v0, 0x0

    iput-object v0, p0, La/f/b/i/e;->h0:La/f/b/i/l/b$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/f/b/i/e;->i0:Z

    new-instance v1, La/f/b/d;

    invoke-direct {v1}, La/f/b/d;-><init>()V

    iput-object v1, p0, La/f/b/i/e;->j0:La/f/b/d;

    iput v0, p0, La/f/b/i/e;->m0:I

    iput v0, p0, La/f/b/i/e;->n0:I

    const/4 v1, 0x4

    new-array v2, v1, [La/f/b/i/b;

    iput-object v2, p0, La/f/b/i/e;->o0:[La/f/b/i/b;

    new-array v1, v1, [La/f/b/i/b;

    iput-object v1, p0, La/f/b/i/e;->p0:[La/f/b/i/b;

    const/16 v1, 0x107

    iput v1, p0, La/f/b/i/e;->q0:I

    iput-boolean v0, p0, La/f/b/i/e;->r0:Z

    iput-boolean v0, p0, La/f/b/i/e;->s0:Z

    return-void
.end method


# virtual methods
.method public C(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, La/f/b/i/d;->C(ZZ)V

    iget-object v0, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/f/b/i/d;

    invoke-virtual {v2, p1, p2}, La/f/b/i/d;->C(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public E()V
    .locals 19

    move-object/from16 v1, p0

    sget-object v2, La/f/b/i/i;->a:[Z

    sget-object v3, La/f/b/i/d$a;->c:La/f/b/i/d$a;

    sget-object v4, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    const/4 v5, 0x0

    iput v5, v1, La/f/b/i/d;->P:I

    iput v5, v1, La/f/b/i/d;->Q:I

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->o()I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->i()I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    iput-boolean v5, v1, La/f/b/i/e;->r0:Z

    iput-boolean v5, v1, La/f/b/i/e;->s0:Z

    .line 1
    iget v0, v1, La/f/b/i/e;->q0:I

    and-int/lit8 v8, v0, 0x40

    const/16 v9, 0x40

    const/4 v10, 0x1

    if-ne v8, v9, :cond_0

    move v8, v10

    goto :goto_0

    :cond_0
    move v8, v5

    :goto_0
    if-nez v8, :cond_3

    and-int/lit16 v8, v0, 0x80

    const/16 v9, 0x80

    if-ne v8, v9, :cond_1

    move v8, v10

    goto :goto_1

    :cond_1
    move v8, v5

    :goto_1
    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    move v8, v5

    goto :goto_3

    :cond_3
    :goto_2
    move v8, v10

    .line 2
    :goto_3
    iget-object v9, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-boolean v5, v9, La/f/b/d;->f:Z

    if-eqz v0, :cond_4

    if-eqz v8, :cond_4

    iput-boolean v10, v9, La/f/b/d;->f:Z

    :cond_4
    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v8, v0, v10

    aget-object v9, v0, v5

    iget-object v11, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->j()La/f/b/i/d$a;

    move-result-object v0

    if-eq v0, v3, :cond_6

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->n()La/f/b/i/d$a;

    move-result-object v0

    if-ne v0, v3, :cond_5

    goto :goto_4

    :cond_5
    move v12, v5

    goto :goto_5

    :cond_6
    :goto_4
    move v12, v10

    .line 3
    :goto_5
    iput v5, v1, La/f/b/i/e;->m0:I

    iput v5, v1, La/f/b/i/e;->n0:I

    .line 4
    iget-object v0, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v13

    move v0, v5

    :goto_6
    if-ge v0, v13, :cond_8

    iget-object v14, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/f/b/i/d;

    instance-of v15, v14, La/f/b/i/k;

    if-eqz v15, :cond_7

    check-cast v14, La/f/b/i/k;

    invoke-virtual {v14}, La/f/b/i/k;->E()V

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_8
    move v0, v5

    move v15, v0

    move v14, v10

    :goto_7
    if-eqz v14, :cond_18

    add-int/lit8 v5, v0, 0x1

    :try_start_0
    iget-object v0, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v0}, La/f/b/d;->t()V

    const/4 v10, 0x0

    .line 5
    iput v10, v1, La/f/b/i/e;->m0:I

    iput v10, v1, La/f/b/i/e;->n0:I

    .line 6
    iget-object v0, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v1, v0}, La/f/b/i/d;->e(La/f/b/d;)V

    const/4 v0, 0x0

    :goto_8
    if-ge v0, v13, :cond_9

    iget-object v10, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/f/b/i/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move/from16 v16, v14

    :try_start_1
    iget-object v14, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v10, v14}, La/f/b/i/d;->e(La/f/b/d;)V

    add-int/lit8 v0, v0, 0x1

    move/from16 v14, v16

    goto :goto_8

    :cond_9
    move/from16 v16, v14

    iget-object v0, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v1, v0}, La/f/b/i/e;->G(La/f/b/d;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v0, v1, La/f/b/i/e;->j0:La/f/b/d;

    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v10, v0, La/f/b/d;->f:Z

    if-eqz v10, :cond_d

    const/4 v10, 0x0

    :goto_9
    iget v14, v0, La/f/b/d;->i:I

    if-ge v10, v14, :cond_b

    iget-object v14, v0, La/f/b/d;->e:[La/f/b/b;

    aget-object v14, v14, v10

    iget-boolean v14, v14, La/f/b/b;->e:Z

    if-nez v14, :cond_a

    const/4 v10, 0x0

    goto :goto_a

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_b
    const/4 v10, 0x1

    :goto_a
    if-nez v10, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {v0}, La/f/b/d;->j()V

    goto :goto_c

    :cond_d
    :goto_b
    iget-object v10, v0, La/f/b/d;->b:La/f/b/d$a;

    invoke-virtual {v0, v10}, La/f/b/d;->q(La/f/b/d$a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_c
    move/from16 v17, v15

    const/16 v16, 0x1

    goto :goto_f

    :catch_0
    move-exception v0

    const/4 v14, 0x1

    goto :goto_e

    :catch_1
    move-exception v0

    goto :goto_d

    :catch_2
    move-exception v0

    move/from16 v16, v14

    :goto_d
    move/from16 v14, v16

    .line 8
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    sget-object v10, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move/from16 v16, v14

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v17, v15

    const-string v15, "EXCEPTION : "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_f
    const/4 v0, 0x2

    if-eqz v16, :cond_e

    iget-object v10, v1, La/f/b/i/e;->j0:La/f/b/d;

    const/4 v14, 0x0

    .line 9
    aput-boolean v14, v2, v0

    invoke-virtual {v1, v10}, La/f/b/i/d;->D(La/f/b/d;)V

    iget-object v14, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_10
    if-ge v15, v14, :cond_f

    iget-object v0, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/f/b/i/d;

    invoke-virtual {v0, v10}, La/f/b/i/d;->D(La/f/b/d;)V

    add-int/lit8 v15, v15, 0x1

    const/4 v0, 0x2

    goto :goto_10

    .line 10
    :cond_e
    iget-object v0, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v1, v0}, La/f/b/i/d;->D(La/f/b/d;)V

    const/4 v0, 0x0

    :goto_11
    if-ge v0, v13, :cond_f

    iget-object v10, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/f/b/i/d;

    iget-object v14, v1, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v10, v14}, La/f/b/i/d;->D(La/f/b/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_f
    if-eqz v12, :cond_12

    const/16 v0, 0x8

    if-ge v5, v0, :cond_12

    const/4 v0, 0x2

    aget-boolean v0, v2, v0

    if-eqz v0, :cond_12

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    :goto_12
    if-ge v0, v13, :cond_10

    iget-object v15, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La/f/b/i/d;

    move-object/from16 v16, v2

    iget v2, v15, La/f/b/i/d;->P:I

    invoke-virtual {v15}, La/f/b/i/d;->o()I

    move-result v18

    add-int v2, v18, v2

    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v10

    iget v2, v15, La/f/b/i/d;->Q:I

    invoke-virtual {v15}, La/f/b/i/d;->i()I

    move-result v15

    add-int/2addr v15, v2

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v2, v16

    goto :goto_12

    :cond_10
    move-object/from16 v16, v2

    iget v0, v1, La/f/b/i/d;->S:I

    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, La/f/b/i/d;->T:I

    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-ne v9, v3, :cond_11

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->o()I

    move-result v10

    if-ge v10, v0, :cond_11

    invoke-virtual {v1, v0}, La/f/b/i/d;->B(I)V

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v10, 0x0

    aput-object v3, v0, v10

    const/4 v0, 0x1

    const/4 v15, 0x1

    goto :goto_13

    :cond_11
    move/from16 v15, v17

    const/4 v0, 0x0

    :goto_13
    if-ne v8, v3, :cond_13

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->i()I

    move-result v10

    if-ge v10, v2, :cond_13

    invoke-virtual {v1, v2}, La/f/b/i/d;->w(I)V

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v2, 0x1

    aput-object v3, v0, v2

    const/4 v0, 0x1

    const/4 v15, 0x1

    goto :goto_14

    :cond_12
    move-object/from16 v16, v2

    move/from16 v15, v17

    const/4 v0, 0x0

    :cond_13
    :goto_14
    iget v2, v1, La/f/b/i/d;->S:I

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->o()I

    move-result v10

    invoke-static {v2, v10}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->o()I

    move-result v10

    if-le v2, v10, :cond_14

    invoke-virtual {v1, v2}, La/f/b/i/d;->B(I)V

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v2, 0x0

    aput-object v4, v0, v2

    const/4 v0, 0x1

    const/4 v15, 0x1

    :cond_14
    iget v2, v1, La/f/b/i/d;->T:I

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->i()I

    move-result v10

    invoke-static {v2, v10}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->i()I

    move-result v10

    if-le v2, v10, :cond_15

    invoke-virtual {v1, v2}, La/f/b/i/d;->w(I)V

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v2, 0x1

    aput-object v4, v0, v2

    move v0, v2

    move v15, v0

    goto :goto_15

    :cond_15
    const/4 v2, 0x1

    :goto_15
    if-nez v15, :cond_17

    iget-object v10, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v14, 0x0

    aget-object v10, v10, v14

    if-ne v10, v3, :cond_16

    if-lez v6, :cond_16

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->o()I

    move-result v10

    if-le v10, v6, :cond_16

    iput-boolean v2, v1, La/f/b/i/e;->r0:Z

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aput-object v4, v0, v14

    invoke-virtual {v1, v6}, La/f/b/i/d;->B(I)V

    move v0, v2

    move v15, v0

    :cond_16
    iget-object v10, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v10, v10, v2

    if-ne v10, v3, :cond_17

    if-lez v7, :cond_17

    invoke-virtual/range {p0 .. p0}, La/f/b/i/d;->i()I

    move-result v10

    if-le v10, v7, :cond_17

    iput-boolean v2, v1, La/f/b/i/e;->s0:Z

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aput-object v4, v0, v2

    invoke-virtual {v1, v7}, La/f/b/i/d;->w(I)V

    const/4 v14, 0x1

    const/4 v15, 0x1

    goto :goto_16

    :cond_17
    move v14, v0

    :goto_16
    move v0, v5

    move-object/from16 v2, v16

    const/4 v5, 0x0

    const/4 v10, 0x1

    goto/16 :goto_7

    :cond_18
    move/from16 v17, v15

    iput-object v11, v1, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    if-eqz v17, :cond_19

    iget-object v0, v1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    const/4 v2, 0x0

    aput-object v9, v0, v2

    const/4 v2, 0x1

    aput-object v8, v0, v2

    :cond_19
    iget-object v0, v1, La/f/b/i/e;->j0:La/f/b/d;

    .line 11
    iget-object v0, v0, La/f/b/d;->k:La/f/b/c;

    .line 12
    invoke-virtual {v1, v0}, La/f/b/i/k;->v(La/f/b/c;)V

    return-void
.end method

.method public F(La/f/b/i/d;I)V
    .locals 5

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 1
    iget p2, p0, La/f/b/i/e;->m0:I

    add-int/2addr p2, v0

    iget-object v1, p0, La/f/b/i/e;->p0:[La/f/b/i/b;

    array-length v2, v1

    if-lt p2, v2, :cond_0

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [La/f/b/i/b;

    iput-object p2, p0, La/f/b/i/e;->p0:[La/f/b/i/b;

    :cond_0
    iget-object p2, p0, La/f/b/i/e;->p0:[La/f/b/i/b;

    iget v1, p0, La/f/b/i/e;->m0:I

    new-instance v2, La/f/b/i/b;

    const/4 v3, 0x0

    .line 2
    iget-boolean v4, p0, La/f/b/i/e;->i0:Z

    .line 3
    invoke-direct {v2, p1, v3, v4}, La/f/b/i/b;-><init>(La/f/b/i/d;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, La/f/b/i/e;->m0:I

    goto :goto_0

    :cond_1
    if-ne p2, v0, :cond_3

    .line 4
    iget p2, p0, La/f/b/i/e;->n0:I

    add-int/2addr p2, v0

    iget-object v1, p0, La/f/b/i/e;->o0:[La/f/b/i/b;

    array-length v2, v1

    if-lt p2, v2, :cond_2

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [La/f/b/i/b;

    iput-object p2, p0, La/f/b/i/e;->o0:[La/f/b/i/b;

    :cond_2
    iget-object p2, p0, La/f/b/i/e;->o0:[La/f/b/i/b;

    iget v1, p0, La/f/b/i/e;->n0:I

    new-instance v2, La/f/b/i/b;

    .line 5
    iget-boolean v3, p0, La/f/b/i/e;->i0:Z

    .line 6
    invoke-direct {v2, p1, v0, v3}, La/f/b/i/b;-><init>(La/f/b/i/d;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, La/f/b/i/e;->n0:I

    :cond_3
    :goto_0
    return-void
.end method

.method public G(La/f/b/d;)Z
    .locals 13

    sget-object v0, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    sget-object v1, La/f/b/i/d$a;->c:La/f/b/i/d$a;

    invoke-virtual {p0, p1}, La/f/b/i/d;->b(La/f/b/d;)V

    iget-object v2, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v4, v2, :cond_1

    iget-object v7, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/f/b/i/d;

    .line 1
    iget-object v8, v7, La/f/b/i/d;->I:[Z

    aput-boolean v3, v8, v3

    aput-boolean v3, v8, v6

    .line 2
    instance-of v7, v7, La/f/b/i/a;

    if-eqz v7, :cond_0

    move v5, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    if-eqz v5, :cond_7

    move v5, v3

    :goto_1
    if-ge v5, v2, :cond_7

    iget-object v7, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/f/b/i/d;

    instance-of v8, v7, La/f/b/i/a;

    if-eqz v8, :cond_6

    check-cast v7, La/f/b/i/a;

    move v8, v3

    .line 3
    :goto_2
    iget v9, v7, La/f/b/i/h;->f0:I

    if-ge v8, v9, :cond_6

    iget-object v9, v7, La/f/b/i/h;->e0:[La/f/b/i/d;

    aget-object v9, v9, v8

    iget v10, v7, La/f/b/i/a;->g0:I

    if-eqz v10, :cond_4

    if-ne v10, v6, :cond_2

    goto :goto_3

    :cond_2
    if-eq v10, v4, :cond_3

    const/4 v11, 0x3

    if-ne v10, v11, :cond_5

    .line 4
    :cond_3
    iget-object v9, v9, La/f/b/i/d;->I:[Z

    aput-boolean v6, v9, v6

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v9, v9, La/f/b/i/d;->I:[Z

    aput-boolean v6, v9, v3

    :cond_5
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    move v5, v3

    :goto_5
    if-ge v5, v2, :cond_b

    .line 5
    iget-object v7, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/f/b/i/d;

    .line 6
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v8, v7, La/f/b/i/j;

    if-nez v8, :cond_9

    instance-of v8, v7, La/f/b/i/f;

    if-eqz v8, :cond_8

    goto :goto_6

    :cond_8
    move v8, v3

    goto :goto_7

    :cond_9
    :goto_6
    move v8, v6

    :goto_7
    if-eqz v8, :cond_a

    .line 7
    invoke-virtual {v7, p1}, La/f/b/i/d;->b(La/f/b/d;)V

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    move v5, v3

    :goto_8
    if-ge v5, v2, :cond_17

    iget-object v7, p0, La/f/b/i/k;->e0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/f/b/i/d;

    instance-of v8, v7, La/f/b/i/e;

    if-eqz v8, :cond_f

    iget-object v8, v7, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v9, v8, v3

    aget-object v10, v8, v6

    if-ne v9, v1, :cond_c

    .line 8
    aput-object v0, v8, v3

    :cond_c
    if-ne v10, v1, :cond_d

    .line 9
    aput-object v0, v8, v6

    .line 10
    :cond_d
    invoke-virtual {v7, p1}, La/f/b/i/d;->b(La/f/b/d;)V

    if-ne v9, v1, :cond_e

    invoke-virtual {v7, v9}, La/f/b/i/d;->x(La/f/b/i/d$a;)V

    :cond_e
    if-ne v10, v1, :cond_16

    invoke-virtual {v7, v10}, La/f/b/i/d;->A(La/f/b/i/d$a;)V

    goto/16 :goto_b

    .line 11
    :cond_f
    sget-object v8, La/f/b/i/d$a;->e:La/f/b/i/d$a;

    const/4 v9, -0x1

    iput v9, v7, La/f/b/i/d;->h:I

    iput v9, v7, La/f/b/i/d;->i:I

    iget-object v9, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v9, v9, v3

    if-eq v9, v1, :cond_10

    iget-object v9, v7, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v9, v9, v3

    if-ne v9, v8, :cond_10

    iget-object v9, v7, La/f/b/i/d;->y:La/f/b/i/c;

    iget v9, v9, La/f/b/i/c;->e:I

    invoke-virtual {p0}, La/f/b/i/d;->o()I

    move-result v10

    iget-object v11, v7, La/f/b/i/d;->A:La/f/b/i/c;

    iget v11, v11, La/f/b/i/c;->e:I

    sub-int/2addr v10, v11

    iget-object v11, v7, La/f/b/i/d;->y:La/f/b/i/c;

    invoke-virtual {p1, v11}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v12

    iput-object v12, v11, La/f/b/i/c;->g:La/f/b/g;

    iget-object v11, v7, La/f/b/i/d;->A:La/f/b/i/c;

    invoke-virtual {p1, v11}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v12

    iput-object v12, v11, La/f/b/i/c;->g:La/f/b/g;

    iget-object v11, v7, La/f/b/i/d;->y:La/f/b/i/c;

    iget-object v11, v11, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {p1, v11, v9}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v11, v7, La/f/b/i/d;->A:La/f/b/i/c;

    iget-object v11, v11, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {p1, v11, v10}, La/f/b/d;->e(La/f/b/g;I)V

    iput v4, v7, La/f/b/i/d;->h:I

    .line 12
    iput v9, v7, La/f/b/i/d;->P:I

    sub-int/2addr v10, v9

    iput v10, v7, La/f/b/i/d;->L:I

    iget v9, v7, La/f/b/i/d;->S:I

    if-ge v10, v9, :cond_10

    iput v9, v7, La/f/b/i/d;->L:I

    .line 13
    :cond_10
    iget-object v9, p0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v9, v9, v6

    if-eq v9, v1, :cond_13

    iget-object v9, v7, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v9, v9, v6

    if-ne v9, v8, :cond_13

    iget-object v8, v7, La/f/b/i/d;->z:La/f/b/i/c;

    iget v8, v8, La/f/b/i/c;->e:I

    invoke-virtual {p0}, La/f/b/i/d;->i()I

    move-result v9

    iget-object v10, v7, La/f/b/i/d;->B:La/f/b/i/c;

    iget v10, v10, La/f/b/i/c;->e:I

    sub-int/2addr v9, v10

    iget-object v10, v7, La/f/b/i/d;->z:La/f/b/i/c;

    invoke-virtual {p1, v10}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v11

    iput-object v11, v10, La/f/b/i/c;->g:La/f/b/g;

    iget-object v10, v7, La/f/b/i/d;->B:La/f/b/i/c;

    invoke-virtual {p1, v10}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v11

    iput-object v11, v10, La/f/b/i/c;->g:La/f/b/g;

    iget-object v10, v7, La/f/b/i/d;->z:La/f/b/i/c;

    iget-object v10, v10, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {p1, v10, v8}, La/f/b/d;->e(La/f/b/g;I)V

    iget-object v10, v7, La/f/b/i/d;->B:La/f/b/i/c;

    iget-object v10, v10, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {p1, v10, v9}, La/f/b/d;->e(La/f/b/g;I)V

    iget v10, v7, La/f/b/i/d;->R:I

    if-gtz v10, :cond_11

    .line 14
    iget v10, v7, La/f/b/i/d;->X:I

    const/16 v11, 0x8

    if-ne v10, v11, :cond_12

    .line 15
    :cond_11
    iget-object v10, v7, La/f/b/i/d;->C:La/f/b/i/c;

    invoke-virtual {p1, v10}, La/f/b/d;->l(Ljava/lang/Object;)La/f/b/g;

    move-result-object v11

    iput-object v11, v10, La/f/b/i/c;->g:La/f/b/g;

    iget-object v10, v7, La/f/b/i/d;->C:La/f/b/i/c;

    iget-object v10, v10, La/f/b/i/c;->g:La/f/b/g;

    iget v11, v7, La/f/b/i/d;->R:I

    add-int/2addr v11, v8

    invoke-virtual {p1, v10, v11}, La/f/b/d;->e(La/f/b/g;I)V

    :cond_12
    iput v4, v7, La/f/b/i/d;->i:I

    .line 16
    iput v8, v7, La/f/b/i/d;->Q:I

    sub-int/2addr v9, v8

    iput v9, v7, La/f/b/i/d;->M:I

    iget v8, v7, La/f/b/i/d;->T:I

    if-ge v9, v8, :cond_13

    iput v8, v7, La/f/b/i/d;->M:I

    .line 17
    :cond_13
    instance-of v8, v7, La/f/b/i/j;

    if-nez v8, :cond_15

    instance-of v8, v7, La/f/b/i/f;

    if-eqz v8, :cond_14

    goto :goto_9

    :cond_14
    move v8, v3

    goto :goto_a

    :cond_15
    :goto_9
    move v8, v6

    :goto_a
    if-nez v8, :cond_16

    .line 18
    invoke-virtual {v7, p1}, La/f/b/i/d;->b(La/f/b/d;)V

    :cond_16
    :goto_b
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_8

    :cond_17
    iget v0, p0, La/f/b/i/e;->m0:I

    if-lez v0, :cond_18

    invoke-static {p0, p1, v3}, La/b/a;->a(La/f/b/i/e;La/f/b/d;I)V

    :cond_18
    iget v0, p0, La/f/b/i/e;->n0:I

    if-lez v0, :cond_19

    invoke-static {p0, p1, v6}, La/b/a;->a(La/f/b/i/e;La/f/b/d;I)V

    :cond_19
    return v6
.end method

.method public H(ZI)Z
    .locals 13

    iget-object v0, p0, La/f/b/i/e;->g0:La/f/b/i/l/e;

    .line 1
    sget-object v1, La/f/b/i/d$a;->e:La/f/b/i/d$a;

    sget-object v2, La/f/b/i/d$a;->c:La/f/b/i/d$a;

    sget-object v3, La/f/b/i/d$a;->b:La/f/b/i/d$a;

    const/4 v4, 0x1

    and-int/2addr p1, v4

    iget-object v5, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, La/f/b/i/d;->h(I)La/f/b/i/d$a;

    move-result-object v5

    iget-object v7, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    invoke-virtual {v7, v4}, La/f/b/i/d;->h(I)La/f/b/i/d$a;

    move-result-object v7

    iget-object v8, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    invoke-virtual {v8}, La/f/b/i/d;->p()I

    move-result v8

    iget-object v9, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    invoke-virtual {v9}, La/f/b/i/d;->q()I

    move-result v9

    if-eqz p1, :cond_4

    if-eq v5, v2, :cond_0

    if-ne v7, v2, :cond_4

    :cond_0
    iget-object v10, v0, La/f/b/i/l/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/f/b/i/l/m;

    iget v12, v11, La/f/b/i/l/m;->f:I

    if-ne v12, p2, :cond_1

    invoke-virtual {v11}, La/f/b/i/l/m;->k()Z

    move-result v11

    if-nez v11, :cond_1

    move p1, v6

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    if-ne v5, v2, :cond_4

    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    .line 2
    iget-object v2, p1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aput-object v3, v2, v6

    .line 3
    invoke-virtual {v0, p1, v6}, La/f/b/i/l/e;->d(La/f/b/i/e;I)I

    move-result v2

    invoke-virtual {p1, v2}, La/f/b/i/d;->B(I)V

    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v2, p1, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v2, v2, La/f/b/i/l/m;->e:La/f/b/i/l/g;

    invoke-virtual {p1}, La/f/b/i/d;->o()I

    move-result p1

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    if-ne v7, v2, :cond_4

    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    .line 4
    iget-object v2, p1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aput-object v3, v2, v4

    .line 5
    invoke-virtual {v0, p1, v4}, La/f/b/i/l/e;->d(La/f/b/i/e;I)I

    move-result v2

    invoke-virtual {p1, v2}, La/f/b/i/d;->w(I)V

    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v2, p1, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v2, v2, La/f/b/i/l/m;->e:La/f/b/i/l/g;

    invoke-virtual {p1}, La/f/b/i/d;->i()I

    move-result p1

    :goto_0
    invoke-virtual {v2, p1}, La/f/b/i/l/g;->c(I)V

    :cond_4
    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v2, p1, La/f/b/i/d;->J:[La/f/b/i/d$a;

    if-nez p2, :cond_6

    aget-object v9, v2, v6

    if-eq v9, v3, :cond_5

    aget-object v2, v2, v6

    if-ne v2, v1, :cond_7

    :cond_5
    invoke-virtual {p1}, La/f/b/i/d;->o()I

    move-result p1

    add-int/2addr p1, v8

    iget-object v1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v1, v1, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v1, v1, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    invoke-virtual {v1, p1}, La/f/b/i/l/f;->c(I)V

    iget-object v1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v1, v1, La/f/b/i/d;->d:La/f/b/i/l/j;

    iget-object v1, v1, La/f/b/i/l/m;->e:La/f/b/i/l/g;

    sub-int/2addr p1, v8

    goto :goto_2

    :cond_6
    aget-object v8, v2, v4

    if-eq v8, v3, :cond_8

    aget-object v2, v2, v4

    if-ne v2, v1, :cond_7

    goto :goto_1

    :cond_7
    move p1, v6

    goto :goto_3

    :cond_8
    :goto_1
    invoke-virtual {p1}, La/f/b/i/d;->i()I

    move-result p1

    add-int/2addr p1, v9

    iget-object v1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v1, v1, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v1, v1, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    invoke-virtual {v1, p1}, La/f/b/i/l/f;->c(I)V

    iget-object v1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    iget-object v1, v1, La/f/b/i/d;->e:La/f/b/i/l/l;

    iget-object v1, v1, La/f/b/i/l/m;->e:La/f/b/i/l/g;

    sub-int/2addr p1, v9

    :goto_2
    invoke-virtual {v1, p1}, La/f/b/i/l/g;->c(I)V

    move p1, v4

    :goto_3
    invoke-virtual {v0}, La/f/b/i/l/e;->g()V

    iget-object v1, v0, La/f/b/i/l/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/f/b/i/l/m;

    iget v3, v2, La/f/b/i/l/m;->f:I

    if-eq v3, p2, :cond_9

    goto :goto_4

    :cond_9
    iget-object v3, v2, La/f/b/i/l/m;->b:La/f/b/i/d;

    iget-object v8, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    if-ne v3, v8, :cond_a

    iget-boolean v3, v2, La/f/b/i/l/m;->g:Z

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, La/f/b/i/l/m;->e()V

    goto :goto_4

    :cond_b
    iget-object v1, v0, La/f/b/i/l/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/f/b/i/l/m;

    iget v3, v2, La/f/b/i/l/m;->f:I

    if-eq v3, p2, :cond_d

    goto :goto_5

    :cond_d
    if-nez p1, :cond_e

    iget-object v3, v2, La/f/b/i/l/m;->b:La/f/b/i/d;

    iget-object v8, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    if-ne v3, v8, :cond_e

    goto :goto_5

    :cond_e
    iget-object v3, v2, La/f/b/i/l/m;->h:La/f/b/i/l/f;

    iget-boolean v3, v3, La/f/b/i/l/f;->j:Z

    if-nez v3, :cond_f

    goto :goto_6

    :cond_f
    iget-object v3, v2, La/f/b/i/l/m;->i:La/f/b/i/l/f;

    iget-boolean v3, v3, La/f/b/i/l/f;->j:Z

    if-nez v3, :cond_10

    goto :goto_6

    :cond_10
    instance-of v3, v2, La/f/b/i/l/c;

    if-nez v3, :cond_c

    iget-object v2, v2, La/f/b/i/l/m;->e:La/f/b/i/l/g;

    iget-boolean v2, v2, La/f/b/i/l/f;->j:Z

    if-nez v2, :cond_c

    :goto_6
    move v4, v6

    :cond_11
    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    invoke-virtual {p1, v5}, La/f/b/i/d;->x(La/f/b/i/d$a;)V

    iget-object p1, v0, La/f/b/i/l/e;->a:La/f/b/i/e;

    invoke-virtual {p1, v7}, La/f/b/i/d;->A(La/f/b/i/d$a;)V

    return v4
.end method

.method public I()V
    .locals 2

    iget-object v0, p0, La/f/b/i/e;->g0:La/f/b/i/l/e;

    const/4 v1, 0x1

    .line 1
    iput-boolean v1, v0, La/f/b/i/l/e;->b:Z

    return-void
.end method

.method public J(I)V
    .locals 1

    iput p1, p0, La/f/b/i/e;->q0:I

    const/16 v0, 0x100

    invoke-static {p1, v0}, La/f/b/i/i;->a(II)Z

    move-result p1

    sput-boolean p1, La/f/b/d;->p:Z

    return-void
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, La/f/b/i/e;->j0:La/f/b/d;

    invoke-virtual {v0}, La/f/b/d;->t()V

    const/4 v0, 0x0

    iput v0, p0, La/f/b/i/e;->k0:I

    iput v0, p0, La/f/b/i/e;->l0:I

    invoke-super {p0}, La/f/b/i/k;->u()V

    return-void
.end method
