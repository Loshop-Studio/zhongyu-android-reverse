.class public final Lr5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;

.field public e:Z

.field public f:F

.field public g:F

.field public h:Lx7/a;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:F

.field public final n:Z

.field public final o:Lx7/a;


# direct methods
.method public constructor <init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLx7/a;ZZZZFZLx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lr5/a;->a:Z

    .line 3
    iput-boolean p2, p0, Lr5/a;->b:Z

    .line 4
    iput-object p3, p0, Lr5/a;->c:Ljava/lang/Integer;

    .line 5
    iput-object p4, p0, Lr5/a;->d:Ljava/lang/Integer;

    .line 6
    iput-boolean p5, p0, Lr5/a;->e:Z

    .line 7
    iput p6, p0, Lr5/a;->f:F

    .line 8
    iput p7, p0, Lr5/a;->g:F

    .line 9
    iput-object p8, p0, Lr5/a;->h:Lx7/a;

    .line 10
    iput-boolean p9, p0, Lr5/a;->i:Z

    .line 11
    iput-boolean p10, p0, Lr5/a;->j:Z

    .line 12
    iput-boolean p11, p0, Lr5/a;->k:Z

    .line 13
    iput-boolean p12, p0, Lr5/a;->l:Z

    .line 14
    iput p13, p0, Lr5/a;->m:F

    .line 15
    iput-boolean p14, p0, Lr5/a;->n:Z

    .line 16
    iput-object p15, p0, Lr5/a;->o:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLx7/a;ZZZZFZLx7/a;ILkotlin/jvm/internal/n;)V
    .locals 16

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move-object v4, v5

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move-object v6, v5

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/high16 v8, 0x3f000000    # 0.5f

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v5

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/high16 v15, 0x42600000    # 56.0f

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move/from16 v2, p14

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    move-object/from16 p16, v5

    :goto_e
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p15, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    .line 17
    :goto_f
    invoke-direct/range {p1 .. p16}, Lr5/a;-><init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLx7/a;ZZZZFZLx7/a;)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Lr5/a;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public final b()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/a;->h:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lr5/a;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lr5/a;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/a;->c:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/a;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final o()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/a;->o:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method
