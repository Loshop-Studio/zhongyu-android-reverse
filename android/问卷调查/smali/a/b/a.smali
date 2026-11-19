.class public final La/b/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Ljava/lang/reflect/Field;

.field public static b:Z

.field public static c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static d:Z

.field public static e:Ljava/lang/reflect/Field;

.field public static f:Z

.field public static g:Ljava/lang/reflect/Field;

.field public static h:Z


# direct methods
.method public static a(La/f/b/i/e;La/f/b/d;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    sget-object v11, La/f/b/i/d$a;->d:La/f/b/i/d$a;

    const/4 v12, 0x2

    if-nez p2, :cond_0

    iget v1, v0, La/f/b/i/e;->m0:I

    iget-object v2, v0, La/f/b/i/e;->p0:[La/f/b/i/b;

    move v14, v1

    move-object v15, v2

    const/16 v16, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, La/f/b/i/e;->n0:I

    iget-object v2, v0, La/f/b/i/e;->o0:[La/f/b/i/b;

    move v14, v1

    move-object v15, v2

    move/from16 v16, v12

    :goto_0
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v14, :cond_6e

    aget-object v1, v15, v9

    .line 1
    iget-boolean v2, v1, La/f/b/i/b;->t:Z

    const/16 v17, 0x0

    const/16 v8, 0x8

    const/4 v4, 0x1

    if-nez v2, :cond_19

    .line 2
    iget v2, v1, La/f/b/i/b;->o:I

    mul-int/2addr v2, v12

    iget-object v5, v1, La/f/b/i/b;->a:La/f/b/i/d;

    move-object v6, v5

    const/4 v7, 0x0

    :goto_2
    if-nez v7, :cond_14

    iget v13, v1, La/f/b/i/b;->i:I

    add-int/2addr v13, v4

    iput v13, v1, La/f/b/i/b;->i:I

    iget-object v13, v5, La/f/b/i/d;->d0:[La/f/b/i/d;

    iget v3, v1, La/f/b/i/b;->o:I

    aput-object v17, v13, v3

    iget-object v13, v5, La/f/b/i/d;->c0:[La/f/b/i/d;

    aput-object v17, v13, v3

    .line 3
    iget v13, v5, La/f/b/i/d;->X:I

    if-eq v13, v8, :cond_f

    .line 4
    iget v13, v1, La/f/b/i/b;->l:I

    add-int/2addr v13, v4

    iput v13, v1, La/f/b/i/b;->l:I

    invoke-virtual {v5, v3}, La/f/b/i/d;->h(I)La/f/b/i/d$a;

    move-result-object v3

    if-eq v3, v11, :cond_3

    iget v3, v1, La/f/b/i/b;->m:I

    iget v13, v1, La/f/b/i/b;->o:I

    if-nez v13, :cond_1

    .line 5
    invoke-virtual {v5}, La/f/b/i/d;->o()I

    move-result v13

    goto :goto_3

    :cond_1
    if-ne v13, v4, :cond_2

    invoke-virtual {v5}, La/f/b/i/d;->i()I

    move-result v13

    goto :goto_3

    :cond_2
    const/4 v13, 0x0

    :goto_3
    add-int/2addr v3, v13

    .line 6
    iput v3, v1, La/f/b/i/b;->m:I

    :cond_3
    iget v3, v1, La/f/b/i/b;->m:I

    iget-object v13, v5, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v13, v13, v2

    invoke-virtual {v13}, La/f/b/i/c;->b()I

    move-result v13

    add-int/2addr v13, v3

    iput v13, v1, La/f/b/i/b;->m:I

    iget-object v3, v5, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v20, v2, 0x1

    aget-object v3, v3, v20

    invoke-virtual {v3}, La/f/b/i/c;->b()I

    move-result v3

    add-int/2addr v3, v13

    iput v3, v1, La/f/b/i/b;->m:I

    iget v3, v1, La/f/b/i/b;->n:I

    iget-object v13, v5, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v13, v13, v2

    invoke-virtual {v13}, La/f/b/i/c;->b()I

    move-result v13

    add-int/2addr v13, v3

    iput v13, v1, La/f/b/i/b;->n:I

    iget-object v3, v5, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v3, v3, v20

    invoke-virtual {v3}, La/f/b/i/c;->b()I

    move-result v3

    add-int/2addr v3, v13

    iput v3, v1, La/f/b/i/b;->n:I

    iget-object v3, v1, La/f/b/i/b;->b:La/f/b/i/d;

    if-nez v3, :cond_4

    iput-object v5, v1, La/f/b/i/b;->b:La/f/b/i/d;

    :cond_4
    iput-object v5, v1, La/f/b/i/b;->d:La/f/b/i/d;

    iget-object v3, v5, La/f/b/i/d;->J:[La/f/b/i/d$a;

    iget v13, v1, La/f/b/i/b;->o:I

    aget-object v8, v3, v13

    if-ne v8, v11, :cond_f

    iget-object v8, v5, La/f/b/i/d;->l:[I

    aget v21, v8, v13

    const/4 v4, 0x3

    if-eqz v21, :cond_6

    aget v12, v8, v13

    if-eq v12, v4, :cond_6

    aget v12, v8, v13

    const/4 v4, 0x2

    if-ne v12, v4, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v24, v7

    goto :goto_8

    :cond_6
    :goto_4
    iget v4, v1, La/f/b/i/b;->j:I

    const/4 v12, 0x1

    add-int/2addr v4, v12

    iput v4, v1, La/f/b/i/b;->j:I

    iget-object v4, v5, La/f/b/i/d;->b0:[F

    aget v12, v4, v13

    const/16 v19, 0x0

    cmpl-float v24, v12, v19

    if-lez v24, :cond_7

    move/from16 v24, v7

    iget v7, v1, La/f/b/i/b;->k:F

    aget v4, v4, v13

    add-float/2addr v7, v4

    iput v7, v1, La/f/b/i/b;->k:F

    goto :goto_5

    :cond_7
    move/from16 v24, v7

    .line 7
    :goto_5
    iget v4, v5, La/f/b/i/d;->X:I

    const/16 v7, 0x8

    if-eq v4, v7, :cond_9

    .line 8
    aget-object v3, v3, v13

    if-ne v3, v11, :cond_9

    aget v3, v8, v13

    if-eqz v3, :cond_8

    aget v3, v8, v13

    const/4 v4, 0x3

    if-ne v3, v4, :cond_9

    :cond_8
    const/4 v3, 0x1

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    :goto_6
    if-eqz v3, :cond_c

    const/4 v3, 0x0

    cmpg-float v4, v12, v3

    if-gez v4, :cond_a

    const/4 v3, 0x1

    .line 9
    iput-boolean v3, v1, La/f/b/i/b;->q:Z

    goto :goto_7

    :cond_a
    const/4 v3, 0x1

    iput-boolean v3, v1, La/f/b/i/b;->r:Z

    :goto_7
    iget-object v3, v1, La/f/b/i/b;->h:Ljava/util/ArrayList;

    if-nez v3, :cond_b

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, La/f/b/i/b;->h:Ljava/util/ArrayList;

    :cond_b
    iget-object v3, v1, La/f/b/i/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    iget-object v3, v1, La/f/b/i/b;->f:La/f/b/i/d;

    if-nez v3, :cond_d

    iput-object v5, v1, La/f/b/i/b;->f:La/f/b/i/d;

    :cond_d
    iget-object v3, v1, La/f/b/i/b;->g:La/f/b/i/d;

    if-eqz v3, :cond_e

    iget-object v3, v3, La/f/b/i/d;->c0:[La/f/b/i/d;

    iget v4, v1, La/f/b/i/b;->o:I

    aput-object v5, v3, v4

    :cond_e
    iput-object v5, v1, La/f/b/i/b;->g:La/f/b/i/d;

    :goto_8
    iget v3, v1, La/f/b/i/b;->o:I

    goto :goto_9

    :cond_f
    move/from16 v24, v7

    :goto_9
    if-eq v6, v5, :cond_10

    iget-object v3, v6, La/f/b/i/d;->d0:[La/f/b/i/d;

    iget v4, v1, La/f/b/i/b;->o:I

    aput-object v5, v3, v4

    :cond_10
    iget-object v3, v5, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v4, v2, 0x1

    aget-object v3, v3, v4

    iget-object v3, v3, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v3, :cond_11

    iget-object v3, v3, La/f/b/i/c;->b:La/f/b/i/d;

    iget-object v4, v3, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v4, v2

    iget-object v6, v6, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v6, :cond_11

    aget-object v4, v4, v2

    iget-object v4, v4, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v4, v4, La/f/b/i/c;->b:La/f/b/i/d;

    if-eq v4, v5, :cond_12

    :cond_11
    move-object/from16 v3, v17

    :cond_12
    if-eqz v3, :cond_13

    move/from16 v7, v24

    goto :goto_a

    :cond_13
    move-object v3, v5

    const/4 v7, 0x1

    :goto_a
    move-object v6, v5

    const/4 v4, 0x1

    const/16 v8, 0x8

    const/4 v12, 0x2

    move-object v5, v3

    goto/16 :goto_2

    :cond_14
    iget-object v3, v1, La/f/b/i/b;->b:La/f/b/i/d;

    if-eqz v3, :cond_15

    iget v4, v1, La/f/b/i/b;->m:I

    iget-object v3, v3, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v3, v3, v2

    invoke-virtual {v3}, La/f/b/i/c;->b()I

    move-result v3

    sub-int/2addr v4, v3

    iput v4, v1, La/f/b/i/b;->m:I

    :cond_15
    iget-object v3, v1, La/f/b/i/b;->d:La/f/b/i/d;

    if-eqz v3, :cond_16

    iget v4, v1, La/f/b/i/b;->m:I

    iget-object v3, v3, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v2, v2, 0x1

    aget-object v2, v3, v2

    invoke-virtual {v2}, La/f/b/i/c;->b()I

    move-result v2

    sub-int/2addr v4, v2

    iput v4, v1, La/f/b/i/b;->m:I

    :cond_16
    iput-object v5, v1, La/f/b/i/b;->c:La/f/b/i/d;

    iget v2, v1, La/f/b/i/b;->o:I

    if-nez v2, :cond_17

    iget-boolean v2, v1, La/f/b/i/b;->p:Z

    if-eqz v2, :cond_17

    iput-object v5, v1, La/f/b/i/b;->e:La/f/b/i/d;

    goto :goto_b

    :cond_17
    iget-object v2, v1, La/f/b/i/b;->a:La/f/b/i/d;

    iput-object v2, v1, La/f/b/i/b;->e:La/f/b/i/d;

    :goto_b
    iget-boolean v2, v1, La/f/b/i/b;->r:Z

    if-eqz v2, :cond_18

    iget-boolean v2, v1, La/f/b/i/b;->q:Z

    if-eqz v2, :cond_18

    const/4 v2, 0x1

    goto :goto_c

    :cond_18
    const/4 v2, 0x0

    :goto_c
    iput-boolean v2, v1, La/f/b/i/b;->s:Z

    const/4 v2, 0x1

    goto :goto_d

    :cond_19
    move v2, v4

    .line 10
    :goto_d
    iput-boolean v2, v1, La/f/b/i/b;->t:Z

    .line 11
    iget-object v12, v1, La/f/b/i/b;->a:La/f/b/i/d;

    iget-object v13, v1, La/f/b/i/b;->c:La/f/b/i/d;

    iget-object v8, v1, La/f/b/i/b;->b:La/f/b/i/d;

    iget-object v7, v1, La/f/b/i/b;->d:La/f/b/i/d;

    iget-object v2, v1, La/f/b/i/b;->e:La/f/b/i/d;

    iget v3, v1, La/f/b/i/b;->k:F

    iget-object v4, v0, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v4, v4, p2

    sget-object v5, La/f/b/i/d$a;->c:La/f/b/i/d$a;

    if-ne v4, v5, :cond_1a

    const/4 v4, 0x1

    goto :goto_e

    :cond_1a
    const/4 v4, 0x0

    :goto_e
    if-nez p2, :cond_1e

    iget v5, v2, La/f/b/i/d;->Z:I

    const/4 v6, 0x1

    if-nez v5, :cond_1b

    const/16 v22, 0x1

    goto :goto_f

    :cond_1b
    const/16 v22, 0x0

    :goto_f
    if-ne v5, v6, :cond_1c

    move/from16 v21, v6

    move/from16 v23, v9

    const/4 v9, 0x2

    goto :goto_10

    :cond_1c
    move/from16 v23, v9

    const/4 v9, 0x2

    const/16 v21, 0x0

    :goto_10
    if-ne v5, v9, :cond_1d

    move/from16 v5, v22

    goto :goto_13

    :cond_1d
    move/from16 v5, v22

    goto :goto_14

    :cond_1e
    move/from16 v23, v9

    const/4 v6, 0x1

    const/4 v9, 0x2

    iget v5, v2, La/f/b/i/d;->a0:I

    if-nez v5, :cond_1f

    move/from16 v21, v6

    goto :goto_11

    :cond_1f
    const/16 v21, 0x0

    :goto_11
    if-ne v5, v6, :cond_20

    const/4 v6, 0x1

    goto :goto_12

    :cond_20
    const/4 v6, 0x0

    :goto_12
    if-ne v5, v9, :cond_21

    move/from16 v5, v21

    move/from16 v21, v6

    :goto_13
    move/from16 v24, v21

    move/from16 v21, v5

    const/4 v5, 0x1

    goto :goto_15

    :cond_21
    move/from16 v5, v21

    move/from16 v21, v6

    :goto_14
    move/from16 v24, v21

    move/from16 v21, v5

    const/4 v5, 0x0

    :goto_15
    move/from16 v26, v3

    move-object v9, v12

    const/4 v6, 0x0

    :goto_16
    if-nez v6, :cond_2e

    iget-object v3, v9, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v3, v3, v16

    if-eqz v5, :cond_22

    const/16 v27, 0x1

    goto :goto_17

    :cond_22
    const/16 v27, 0x4

    :goto_17
    invoke-virtual {v3}, La/f/b/i/c;->b()I

    move-result v28

    move/from16 v29, v6

    iget-object v6, v9, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v6, v6, p2

    if-ne v6, v11, :cond_23

    iget-object v6, v9, La/f/b/i/d;->l:[I

    aget v6, v6, p2

    if-nez v6, :cond_23

    move/from16 v30, v14

    const/4 v6, 0x1

    goto :goto_18

    :cond_23
    move/from16 v30, v14

    const/4 v6, 0x0

    :goto_18
    iget-object v14, v3, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v14, :cond_24

    if-eq v9, v12, :cond_24

    invoke-virtual {v14}, La/f/b/i/c;->b()I

    move-result v14

    add-int v28, v14, v28

    :cond_24
    move/from16 v14, v28

    if-eqz v5, :cond_25

    if-eq v9, v12, :cond_25

    if-eq v9, v8, :cond_25

    move-object/from16 v28, v15

    const/16 v27, 0x5

    goto :goto_19

    :cond_25
    move-object/from16 v28, v15

    :goto_19
    iget-object v15, v3, La/f/b/i/c;->d:La/f/b/i/c;

    move-object/from16 v31, v2

    if-eqz v15, :cond_28

    if-ne v9, v8, :cond_26

    iget-object v2, v3, La/f/b/i/c;->g:La/f/b/g;

    iget-object v15, v15, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v32, v12

    const/4 v12, 0x6

    invoke-virtual {v10, v2, v15, v14, v12}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_1a

    :cond_26
    move-object/from16 v32, v12

    iget-object v2, v3, La/f/b/i/c;->g:La/f/b/g;

    iget-object v12, v15, La/f/b/i/c;->g:La/f/b/g;

    const/16 v15, 0x8

    invoke-virtual {v10, v2, v12, v14, v15}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :goto_1a
    if-eqz v6, :cond_27

    if-nez v5, :cond_27

    const/4 v2, 0x5

    goto :goto_1b

    :cond_27
    move/from16 v2, v27

    :goto_1b
    iget-object v6, v3, La/f/b/i/c;->g:La/f/b/g;

    iget-object v3, v3, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v10, v6, v3, v14, v2}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto :goto_1c

    :cond_28
    move-object/from16 v32, v12

    :goto_1c
    if-eqz v4, :cond_2a

    .line 12
    iget v2, v9, La/f/b/i/d;->X:I

    const/16 v3, 0x8

    if-eq v2, v3, :cond_29

    .line 13
    iget-object v2, v9, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v2, v2, p2

    if-ne v2, v11, :cond_29

    iget-object v2, v9, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v3, v16, 0x1

    aget-object v3, v2, v3

    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    aget-object v2, v2, v16

    iget-object v2, v2, La/f/b/i/c;->g:La/f/b/g;

    const/4 v6, 0x5

    const/4 v12, 0x0

    invoke-virtual {v10, v3, v2, v12, v6}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    goto :goto_1d

    :cond_29
    const/4 v12, 0x0

    :goto_1d
    iget-object v2, v9, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v2, v2, v16

    iget-object v2, v2, La/f/b/i/c;->g:La/f/b/g;

    iget-object v3, v0, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v3, v3, v16

    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    const/16 v6, 0x8

    invoke-virtual {v10, v2, v3, v12, v6}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_2a
    iget-object v2, v9, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v3, v16, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v2, :cond_2b

    iget-object v2, v2, La/f/b/i/c;->b:La/f/b/i/d;

    iget-object v3, v2, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v3, v16

    iget-object v6, v6, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v6, :cond_2b

    aget-object v3, v3, v16

    iget-object v3, v3, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v3, v3, La/f/b/i/c;->b:La/f/b/i/d;

    if-eq v3, v9, :cond_2c

    :cond_2b
    move-object/from16 v2, v17

    :cond_2c
    if-eqz v2, :cond_2d

    move-object v9, v2

    move/from16 v6, v29

    goto :goto_1e

    :cond_2d
    const/4 v6, 0x1

    :goto_1e
    move-object/from16 v15, v28

    move/from16 v14, v30

    move-object/from16 v2, v31

    move-object/from16 v12, v32

    goto/16 :goto_16

    :cond_2e
    move-object/from16 v31, v2

    move-object/from16 v32, v12

    move/from16 v30, v14

    move-object/from16 v28, v15

    if-eqz v7, :cond_32

    iget-object v2, v13, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v3, v16, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v2, :cond_32

    iget-object v2, v7, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v2, v2, v3

    iget-object v6, v7, La/f/b/i/d;->J:[La/f/b/i/d$a;

    aget-object v6, v6, p2

    if-ne v6, v11, :cond_2f

    iget-object v6, v7, La/f/b/i/d;->l:[I

    aget v6, v6, p2

    if-nez v6, :cond_2f

    const/4 v12, 0x1

    goto :goto_1f

    :cond_2f
    const/4 v12, 0x0

    :goto_1f
    if-eqz v12, :cond_30

    if-nez v5, :cond_30

    iget-object v6, v2, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v9, v6, La/f/b/i/c;->b:La/f/b/i/d;

    if-ne v9, v0, :cond_30

    iget-object v9, v2, La/f/b/i/c;->g:La/f/b/g;

    iget-object v6, v6, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v2}, La/f/b/i/c;->b()I

    move-result v12

    neg-int v12, v12

    const/4 v14, 0x5

    invoke-virtual {v10, v9, v6, v12, v14}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto :goto_20

    :cond_30
    const/4 v14, 0x5

    if-eqz v5, :cond_31

    iget-object v6, v2, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v9, v6, La/f/b/i/c;->b:La/f/b/i/d;

    if-ne v9, v0, :cond_31

    iget-object v9, v2, La/f/b/i/c;->g:La/f/b/g;

    iget-object v6, v6, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v2}, La/f/b/i/c;->b()I

    move-result v12

    neg-int v12, v12

    const/4 v15, 0x4

    invoke-virtual {v10, v9, v6, v12, v15}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto :goto_21

    :cond_31
    :goto_20
    const/4 v15, 0x4

    :goto_21
    iget-object v6, v2, La/f/b/i/c;->g:La/f/b/g;

    iget-object v9, v13, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v3, v9, v3

    iget-object v3, v3, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v2}, La/f/b/i/c;->b()I

    move-result v2

    neg-int v2, v2

    const/4 v9, 0x6

    invoke-virtual {v10, v6, v3, v2, v9}, La/f/b/d;->g(La/f/b/g;La/f/b/g;II)V

    goto :goto_22

    :cond_32
    const/4 v14, 0x5

    const/4 v15, 0x4

    :goto_22
    if-eqz v4, :cond_33

    iget-object v2, v0, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v3, v16, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, La/f/b/i/c;->g:La/f/b/g;

    iget-object v4, v13, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v4, v3

    iget-object v6, v6, La/f/b/i/c;->g:La/f/b/g;

    aget-object v3, v4, v3

    invoke-virtual {v3}, La/f/b/i/c;->b()I

    move-result v3

    const/16 v4, 0x8

    invoke-virtual {v10, v2, v6, v3, v4}, La/f/b/d;->f(La/f/b/g;La/f/b/g;II)V

    :cond_33
    iget-object v2, v1, La/f/b/i/b;->h:Ljava/util/ArrayList;

    if-eqz v2, :cond_3d

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_3d

    iget-boolean v6, v1, La/f/b/i/b;->q:Z

    if-eqz v6, :cond_34

    iget-boolean v6, v1, La/f/b/i/b;->s:Z

    if-nez v6, :cond_34

    iget v6, v1, La/f/b/i/b;->j:I

    int-to-float v6, v6

    goto :goto_23

    :cond_34
    move/from16 v6, v26

    :goto_23
    move-object/from16 v4, v17

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_24
    if-ge v12, v3, :cond_3d

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v14, v26

    check-cast v14, La/f/b/i/d;

    iget-object v15, v14, La/f/b/i/d;->b0:[F

    aget v15, v15, p2

    const/16 v19, 0x0

    cmpg-float v26, v15, v19

    if-gez v26, :cond_36

    iget-boolean v15, v1, La/f/b/i/b;->s:Z

    if-eqz v15, :cond_35

    iget-object v0, v14, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v14, v16, 0x1

    aget-object v14, v0, v14

    iget-object v14, v14, La/f/b/i/c;->g:La/f/b/g;

    aget-object v0, v0, v16

    iget-object v0, v0, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v18, v11

    move-object v15, v14

    const/4 v11, 0x0

    const/4 v14, 0x4

    goto :goto_25

    :cond_35
    const/high16 v15, 0x3f800000    # 1.0f

    :cond_36
    const/16 v19, 0x0

    cmpl-float v26, v15, v19

    if-nez v26, :cond_37

    iget-object v0, v14, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v14, v16, 0x1

    aget-object v14, v0, v14

    iget-object v14, v14, La/f/b/i/c;->g:La/f/b/g;

    aget-object v0, v0, v16

    iget-object v0, v0, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v18, v11

    move-object v15, v14

    const/4 v11, 0x0

    const/16 v14, 0x8

    :goto_25
    invoke-virtual {v10, v15, v0, v11, v14}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    move-object/from16 v33, v2

    move/from16 v29, v3

    move/from16 v26, v6

    const/16 v19, 0x0

    goto/16 :goto_2a

    :cond_37
    move-object/from16 v18, v11

    const/4 v11, 0x0

    if-eqz v4, :cond_3c

    iget-object v4, v4, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v11, v4, v16

    iget-object v11, v11, La/f/b/i/c;->g:La/f/b/g;

    add-int/lit8 v29, v16, 0x1

    aget-object v4, v4, v29

    iget-object v4, v4, La/f/b/i/c;->g:La/f/b/g;

    iget-object v0, v14, La/f/b/i/d;->G:[La/f/b/i/c;

    move-object/from16 v33, v2

    aget-object v2, v0, v16

    iget-object v2, v2, La/f/b/i/c;->g:La/f/b/g;

    aget-object v0, v0, v29

    iget-object v0, v0, La/f/b/i/c;->g:La/f/b/g;

    move/from16 v29, v3

    invoke-virtual/range {p1 .. p1}, La/f/b/d;->m()La/f/b/b;

    move-result-object v3

    move-object/from16 v34, v14

    const/4 v14, 0x0

    .line 14
    iput v14, v3, La/f/b/b;->b:F

    cmpl-float v19, v6, v14

    const/high16 v14, -0x40800000    # -1.0f

    if-eqz v19, :cond_3b

    cmpl-float v19, v9, v15

    if-nez v19, :cond_38

    goto :goto_27

    :cond_38
    const/16 v19, 0x0

    cmpl-float v35, v9, v19

    if-nez v35, :cond_39

    iget-object v0, v3, La/f/b/b;->d:La/f/b/b$a;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v11, v2}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v0, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v0, v4, v14}, La/f/b/b$a;->j(La/f/b/g;F)V

    goto :goto_26

    :cond_39
    const/high16 v14, 0x3f800000    # 1.0f

    if-nez v26, :cond_3a

    iget-object v4, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v4, v2, v14}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v2, v3, La/f/b/b;->d:La/f/b/b$a;

    const/high16 v4, -0x40800000    # -1.0f

    invoke-interface {v2, v0, v4}, La/f/b/b$a;->j(La/f/b/g;F)V

    :goto_26
    move/from16 v26, v6

    goto :goto_28

    :cond_3a
    div-float/2addr v9, v6

    div-float v26, v15, v6

    div-float v9, v9, v26

    move/from16 v26, v6

    iget-object v6, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v6, v11, v14}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v6, v3, La/f/b/b;->d:La/f/b/b$a;

    const/high16 v11, -0x40800000    # -1.0f

    invoke-interface {v6, v4, v11}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v4, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v4, v0, v9}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v0, v3, La/f/b/b;->d:La/f/b/b$a;

    neg-float v4, v9

    invoke-interface {v0, v2, v4}, La/f/b/b$a;->j(La/f/b/g;F)V

    goto :goto_28

    :cond_3b
    :goto_27
    move/from16 v26, v6

    move v6, v14

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    iget-object v9, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v9, v11, v14}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v9, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v9, v4, v6}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v4, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v4, v0, v14}, La/f/b/b$a;->j(La/f/b/g;F)V

    iget-object v0, v3, La/f/b/b;->d:La/f/b/b$a;

    invoke-interface {v0, v2, v6}, La/f/b/b$a;->j(La/f/b/g;F)V

    .line 15
    :goto_28
    invoke-virtual {v10, v3}, La/f/b/d;->c(La/f/b/b;)V

    goto :goto_29

    :cond_3c
    move-object/from16 v33, v2

    move/from16 v29, v3

    move/from16 v26, v6

    move-object/from16 v34, v14

    const/16 v19, 0x0

    :goto_29
    move v9, v15

    move-object/from16 v4, v34

    :goto_2a
    add-int/lit8 v12, v12, 0x1

    const/4 v14, 0x5

    const/4 v15, 0x4

    move-object/from16 v0, p0

    move-object/from16 v11, v18

    move/from16 v6, v26

    move/from16 v3, v29

    move-object/from16 v2, v33

    goto/16 :goto_24

    :cond_3d
    move-object/from16 v18, v11

    if-eqz v8, :cond_43

    if-eq v8, v7, :cond_3e

    if-eqz v5, :cond_43

    :cond_3e
    move-object/from16 v0, v32

    iget-object v0, v0, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v0, v0, v16

    iget-object v1, v13, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v2, v16, 0x1

    aget-object v1, v1, v2

    iget-object v0, v0, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_3f

    iget-object v0, v0, La/f/b/i/c;->g:La/f/b/g;

    move-object v3, v0

    goto :goto_2b

    :cond_3f
    move-object/from16 v3, v17

    :goto_2b
    iget-object v0, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_40

    iget-object v0, v0, La/f/b/i/c;->g:La/f/b/g;

    move-object v6, v0

    goto :goto_2c

    :cond_40
    move-object/from16 v6, v17

    :goto_2c
    iget-object v0, v8, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v0, v0, v16

    iget-object v1, v7, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v1, v2

    if-eqz v3, :cond_42

    if-eqz v6, :cond_42

    move-object/from16 v2, v31

    if-nez p2, :cond_41

    iget v2, v2, La/f/b/i/d;->U:F

    goto :goto_2d

    :cond_41
    iget v2, v2, La/f/b/i/d;->V:F

    :goto_2d
    move v5, v2

    invoke-virtual {v0}, La/f/b/i/c;->b()I

    move-result v4

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v9

    iget-object v2, v0, La/f/b/i/c;->g:La/f/b/g;

    iget-object v0, v1, La/f/b/i/c;->g:La/f/b/g;

    const/4 v11, 0x7

    move-object/from16 v1, p1

    move-object v12, v7

    move-object v7, v0

    move-object v14, v8

    move v8, v9

    move/from16 v15, v23

    const/16 v19, 0x2

    move v9, v11

    invoke-virtual/range {v1 .. v9}, La/f/b/d;->b(La/f/b/g;La/f/b/g;IFLa/f/b/g;La/f/b/g;II)V

    goto/16 :goto_39

    :cond_42
    move-object v12, v7

    move-object v14, v8

    move/from16 v15, v23

    const/16 v19, 0x2

    goto/16 :goto_39

    :cond_43
    move-object v12, v7

    move-object v14, v8

    move/from16 v15, v23

    move-object/from16 v0, v32

    const/16 v19, 0x2

    if-eqz v21, :cond_56

    if-eqz v14, :cond_56

    iget v2, v1, La/f/b/i/b;->j:I

    if-lez v2, :cond_44

    iget v1, v1, La/f/b/i/b;->i:I

    if-ne v1, v2, :cond_44

    const/16 v22, 0x1

    goto :goto_2e

    :cond_44
    const/16 v22, 0x0

    :goto_2e
    move-object v9, v14

    move-object v11, v9

    :goto_2f
    if-eqz v11, :cond_55

    iget-object v1, v11, La/f/b/i/d;->d0:[La/f/b/i/d;

    aget-object v1, v1, p2

    move-object v8, v1

    :goto_30
    if-eqz v8, :cond_45

    .line 16
    iget v1, v8, La/f/b/i/d;->X:I

    const/16 v7, 0x8

    if-ne v1, v7, :cond_46

    .line 17
    iget-object v1, v8, La/f/b/i/d;->d0:[La/f/b/i/d;

    aget-object v8, v1, p2

    goto :goto_30

    :cond_45
    const/16 v7, 0x8

    :cond_46
    if-nez v8, :cond_48

    if-ne v11, v12, :cond_47

    goto :goto_31

    :cond_47
    move-object/from16 v20, v8

    move-object/from16 v23, v9

    goto/16 :goto_38

    :cond_48
    :goto_31
    iget-object v1, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v1, v16

    iget-object v2, v1, La/f/b/i/c;->g:La/f/b/g;

    iget-object v3, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v3, :cond_49

    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    goto :goto_32

    :cond_49
    move-object/from16 v3, v17

    :goto_32
    if-eq v9, v11, :cond_4a

    iget-object v3, v9, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v4, v16, 0x1

    aget-object v3, v3, v4

    goto :goto_33

    :cond_4a
    if-ne v11, v14, :cond_4c

    if-ne v9, v11, :cond_4c

    iget-object v3, v0, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v4, v3, v16

    iget-object v4, v4, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v4, :cond_4b

    aget-object v3, v3, v16

    iget-object v3, v3, La/f/b/i/c;->d:La/f/b/i/c;

    :goto_33
    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    goto :goto_34

    :cond_4b
    move-object/from16 v3, v17

    :cond_4c
    :goto_34
    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v1

    iget-object v4, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v5, v16, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v4}, La/f/b/i/c;->b()I

    move-result v4

    if-eqz v8, :cond_4d

    iget-object v6, v8, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v6, v16

    iget-object v7, v6, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v23, v6

    iget-object v6, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v6, v5

    goto :goto_36

    :cond_4d
    iget-object v6, v13, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v6, v5

    iget-object v6, v6, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v6, :cond_4e

    iget-object v7, v6, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v23, v6

    goto :goto_35

    :cond_4e
    move-object/from16 v23, v6

    move-object/from16 v7, v17

    :goto_35
    iget-object v6, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v6, v5

    :goto_36
    iget-object v6, v6, La/f/b/i/c;->g:La/f/b/g;

    if-eqz v23, :cond_4f

    invoke-virtual/range {v23 .. v23}, La/f/b/i/c;->b()I

    move-result v23

    add-int v4, v4, v23

    :cond_4f
    move/from16 v23, v4

    if-eqz v9, :cond_50

    iget-object v4, v9, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v4, v4, v5

    invoke-virtual {v4}, La/f/b/i/c;->b()I

    move-result v4

    add-int/2addr v1, v4

    :cond_50
    if-eqz v2, :cond_47

    if-eqz v3, :cond_47

    if-eqz v7, :cond_47

    if-eqz v6, :cond_47

    if-ne v11, v14, :cond_51

    iget-object v1, v14, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v1, v16

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v1

    :cond_51
    move v4, v1

    if-ne v11, v12, :cond_52

    iget-object v1, v12, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v1, v5

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v1

    move/from16 v23, v1

    :cond_52
    if-eqz v22, :cond_53

    const/16 v25, 0x8

    goto :goto_37

    :cond_53
    const/16 v25, 0x5

    :goto_37
    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    move-object/from16 v26, v6

    move-object v6, v7

    const/16 v20, 0x8

    move-object/from16 v7, v26

    move-object/from16 v20, v8

    move/from16 v8, v23

    move-object/from16 v23, v9

    move/from16 v9, v25

    invoke-virtual/range {v1 .. v9}, La/f/b/d;->b(La/f/b/g;La/f/b/g;IFLa/f/b/g;La/f/b/g;II)V

    .line 18
    :goto_38
    iget v1, v11, La/f/b/i/d;->X:I

    const/16 v9, 0x8

    if-eq v1, v9, :cond_54

    move-object/from16 v23, v11

    :cond_54
    move-object/from16 v11, v20

    move-object/from16 v9, v23

    goto/16 :goto_2f

    :cond_55
    :goto_39
    move-object/from16 v20, v13

    move/from16 v23, v15

    goto/16 :goto_48

    :cond_56
    const/16 v9, 0x8

    if-eqz v24, :cond_55

    if-eqz v14, :cond_55

    .line 19
    iget v2, v1, La/f/b/i/b;->j:I

    if-lez v2, :cond_57

    iget v1, v1, La/f/b/i/b;->i:I

    if-ne v1, v2, :cond_57

    const/16 v22, 0x1

    goto :goto_3a

    :cond_57
    const/16 v22, 0x0

    :goto_3a
    move-object v8, v14

    move-object v11, v8

    :goto_3b
    if-eqz v11, :cond_62

    iget-object v1, v11, La/f/b/i/d;->d0:[La/f/b/i/d;

    aget-object v1, v1, p2

    :goto_3c
    if-eqz v1, :cond_58

    .line 20
    iget v2, v1, La/f/b/i/d;->X:I

    if-ne v2, v9, :cond_58

    .line 21
    iget-object v1, v1, La/f/b/i/d;->d0:[La/f/b/i/d;

    aget-object v1, v1, p2

    goto :goto_3c

    :cond_58
    if-eq v11, v14, :cond_60

    if-eq v11, v12, :cond_60

    if-eqz v1, :cond_60

    if-ne v1, v12, :cond_59

    move-object/from16 v7, v17

    goto :goto_3d

    :cond_59
    move-object v7, v1

    :goto_3d
    iget-object v1, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v1, v16

    iget-object v2, v1, La/f/b/i/c;->g:La/f/b/g;

    iget-object v3, v8, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v4, v16, 0x1

    aget-object v3, v3, v4

    iget-object v3, v3, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v1

    iget-object v5, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v5, v5, v4

    invoke-virtual {v5}, La/f/b/i/c;->b()I

    move-result v5

    if-eqz v7, :cond_5b

    iget-object v6, v7, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v6, v16

    iget-object v9, v6, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v20, v7

    iget-object v7, v6, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v7, :cond_5a

    goto :goto_3f

    :cond_5a
    move-object/from16 v7, v17

    goto :goto_40

    :cond_5b
    move-object/from16 v20, v7

    iget-object v6, v12, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v6, v6, v16

    if-eqz v6, :cond_5c

    iget-object v7, v6, La/f/b/i/c;->g:La/f/b/g;

    move-object v9, v7

    goto :goto_3e

    :cond_5c
    move-object/from16 v9, v17

    :goto_3e
    iget-object v7, v11, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v7, v7, v4

    :goto_3f
    iget-object v7, v7, La/f/b/i/c;->g:La/f/b/g;

    :goto_40
    if-eqz v6, :cond_5d

    invoke-virtual {v6}, La/f/b/i/c;->b()I

    move-result v6

    add-int/2addr v6, v5

    move/from16 v23, v6

    goto :goto_41

    :cond_5d
    move/from16 v23, v5

    :goto_41
    iget-object v5, v8, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v4, v5, v4

    invoke-virtual {v4}, La/f/b/i/c;->b()I

    move-result v4

    add-int/2addr v4, v1

    if-eqz v22, :cond_5e

    const/16 v25, 0x8

    goto :goto_42

    :cond_5e
    const/16 v25, 0x4

    :goto_42
    if-eqz v2, :cond_5f

    if-eqz v3, :cond_5f

    if-eqz v9, :cond_5f

    if-eqz v7, :cond_5f

    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    const/16 v26, 0x4

    move-object v6, v9

    move-object/from16 v27, v8

    move/from16 v8, v23

    move/from16 v23, v15

    const/16 v15, 0x8

    move/from16 v9, v25

    invoke-virtual/range {v1 .. v9}, La/f/b/d;->b(La/f/b/g;La/f/b/g;IFLa/f/b/g;La/f/b/g;II)V

    goto :goto_43

    :cond_5f
    move-object/from16 v27, v8

    move/from16 v23, v15

    const/16 v15, 0x8

    const/16 v26, 0x4

    :goto_43
    move-object/from16 v8, v20

    goto :goto_44

    :cond_60
    move-object/from16 v27, v8

    move/from16 v23, v15

    const/16 v26, 0x4

    move v15, v9

    move-object v8, v1

    .line 22
    :goto_44
    iget v1, v11, La/f/b/i/d;->X:I

    if-eq v1, v15, :cond_61

    goto :goto_45

    :cond_61
    move-object/from16 v11, v27

    :goto_45
    move v9, v15

    move/from16 v15, v23

    move-object/from16 v36, v11

    move-object v11, v8

    move-object/from16 v8, v36

    goto/16 :goto_3b

    :cond_62
    move/from16 v23, v15

    .line 23
    iget-object v1, v14, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v1, v16

    iget-object v0, v0, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v0, v0, v16

    iget-object v0, v0, La/f/b/i/c;->d:La/f/b/i/c;

    iget-object v2, v12, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v3, v16, 0x1

    aget-object v11, v2, v3

    iget-object v2, v13, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v2, v2, v3

    iget-object v15, v2, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v0, :cond_65

    if-eq v14, v12, :cond_63

    iget-object v2, v1, La/f/b/i/c;->g:La/f/b/g;

    iget-object v0, v0, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v1

    const/4 v9, 0x5

    invoke-virtual {v10, v2, v0, v1, v9}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    goto :goto_46

    :cond_63
    const/4 v9, 0x5

    if-eqz v15, :cond_64

    iget-object v2, v1, La/f/b/i/c;->g:La/f/b/g;

    iget-object v3, v0, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v6, v11, La/f/b/i/c;->g:La/f/b/g;

    iget-object v7, v15, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v11}, La/f/b/i/c;->b()I

    move-result v8

    const/4 v0, 0x5

    move-object/from16 v1, p1

    move-object/from16 v20, v13

    move v13, v9

    move v9, v0

    invoke-virtual/range {v1 .. v9}, La/f/b/d;->b(La/f/b/g;La/f/b/g;IFLa/f/b/g;La/f/b/g;II)V

    goto :goto_47

    :cond_64
    :goto_46
    move-object/from16 v20, v13

    move v13, v9

    goto :goto_47

    :cond_65
    move-object/from16 v20, v13

    const/4 v13, 0x5

    :goto_47
    if-eqz v15, :cond_66

    if-eq v14, v12, :cond_66

    iget-object v0, v11, La/f/b/i/c;->g:La/f/b/g;

    iget-object v1, v15, La/f/b/i/c;->g:La/f/b/g;

    invoke-virtual {v11}, La/f/b/i/c;->b()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v10, v0, v1, v2, v13}, La/f/b/d;->d(La/f/b/g;La/f/b/g;II)La/f/b/b;

    :cond_66
    :goto_48
    if-nez v21, :cond_67

    if-eqz v24, :cond_6d

    :cond_67
    if-eqz v14, :cond_6d

    if-eq v14, v12, :cond_6d

    iget-object v0, v14, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v1, v0, v16

    iget-object v2, v12, La/f/b/i/d;->G:[La/f/b/i/c;

    add-int/lit8 v3, v16, 0x1

    aget-object v2, v2, v3

    iget-object v4, v1, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v4, :cond_68

    iget-object v4, v4, La/f/b/i/c;->g:La/f/b/g;

    goto :goto_49

    :cond_68
    move-object/from16 v4, v17

    :goto_49
    iget-object v5, v2, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v5, :cond_69

    iget-object v5, v5, La/f/b/i/c;->g:La/f/b/g;

    goto :goto_4a

    :cond_69
    move-object/from16 v5, v17

    :goto_4a
    move-object/from16 v6, v20

    if-eq v6, v12, :cond_6b

    iget-object v5, v6, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v5, v5, v3

    iget-object v5, v5, La/f/b/i/c;->d:La/f/b/i/c;

    if-eqz v5, :cond_6a

    iget-object v5, v5, La/f/b/i/c;->g:La/f/b/g;

    move-object/from16 v17, v5

    :cond_6a
    move-object/from16 v6, v17

    goto :goto_4b

    :cond_6b
    move-object v6, v5

    :goto_4b
    if-ne v14, v12, :cond_6c

    aget-object v1, v0, v16

    aget-object v2, v0, v3

    :cond_6c
    if-eqz v4, :cond_6d

    if-eqz v6, :cond_6d

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {v1}, La/f/b/i/c;->b()I

    move-result v0

    iget-object v7, v12, La/f/b/i/d;->G:[La/f/b/i/c;

    aget-object v3, v7, v3

    invoke-virtual {v3}, La/f/b/i/c;->b()I

    move-result v8

    iget-object v3, v1, La/f/b/i/c;->g:La/f/b/g;

    iget-object v7, v2, La/f/b/i/c;->g:La/f/b/g;

    const/4 v9, 0x5

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v4

    move v4, v0

    invoke-virtual/range {v1 .. v9}, La/f/b/d;->b(La/f/b/g;La/f/b/g;IFLa/f/b/g;La/f/b/g;II)V

    :cond_6d
    add-int/lit8 v9, v23, 0x1

    move-object/from16 v0, p0

    move-object/from16 v11, v18

    move/from16 v12, v19

    move-object/from16 v15, v28

    move/from16 v14, v30

    goto/16 :goto_1

    :cond_6e
    return-void
.end method

.method public static b(Ljava/lang/Object;)V
    .locals 4

    sget-boolean v0, La/b/a;->d:Z

    const/4 v1, 0x1

    const-string v2, "ResourcesFlusher"

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "android.content.res.ThemedResourceCache"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, La/b/a;->c:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "Could not find ThemedResourceCache class"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v1, La/b/a;->d:Z

    :cond_0
    sget-object v0, La/b/a;->c:Ljava/lang/Class;

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-boolean v3, La/b/a;->f:Z

    if-nez v3, :cond_2

    :try_start_1
    const-string v3, "mUnthemedEntries"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, La/b/a;->e:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v3, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    sput-boolean v1, La/b/a;->f:Z

    :cond_2
    sget-object v0, La/b/a;->e:Ljava/lang/reflect/Field;

    if-nez v0, :cond_3

    return-void

    :cond_3
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/LongSparseArray;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, p0

    goto :goto_2

    :catch_2
    move-exception p0

    const-string v0, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    invoke-static {v2, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V

    :cond_4
    return-void
.end method

.method public static c(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    if-eqz p0, :cond_1

    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    :goto_0
    instance-of v0, p2, Landroid/view/View;

    if-eqz v0, :cond_1

    instance-of v0, p2, La/b/h/b1;

    if-eqz v0, :cond_0

    check-cast p2, La/b/h/b1;

    invoke-interface {p2}, La/b/h/b1;->a()Ljava/lang/CharSequence;

    move-result-object p2

    iput-object p2, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    goto :goto_0

    :cond_1
    :goto_1
    return-object p0
.end method

.method public static d(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1
    :cond_0
    sget-object v0, La/b/h/x0;->k:La/b/h/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, La/b/h/x0;->b:Landroid/view/View;

    if-ne v0, p0, :cond_1

    invoke-static {v1}, La/b/h/x0;->c(La/b/h/x0;)V

    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, La/b/h/x0;->l:La/b/h/x0;

    if-eqz p1, :cond_2

    iget-object v0, p1, La/b/h/x0;->b:Landroid/view/View;

    if-ne v0, p0, :cond_2

    invoke-virtual {p1}, La/b/h/x0;->b()V

    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    goto :goto_0

    :cond_3
    new-instance v0, La/b/h/x0;

    invoke-direct {v0, p0, p1}, La/b/h/x0;-><init>(Landroid/view/View;Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
