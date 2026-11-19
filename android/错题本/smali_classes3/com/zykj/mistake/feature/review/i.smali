.class public final Lcom/zykj/mistake/feature/review/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:I

.field public final n:Z

.field public final o:Ljava/lang/Integer;

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Z

.field public final u:Z

.field public final v:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 24

    and-int/lit8 v0, p2, 0x1

    .line 1
    const-string v3, ""

    if-eqz v0, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    const/high16 v0, 0x200000

    and-int v0, p2, v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    move/from16 v23, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v4, v3

    move-object v7, v3

    move-object v10, v3

    move-object v13, v3

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v23}, Lcom/zykj/mistake/feature/review/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZZ)V
    .locals 1

    const-string v0, "studentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/zykj/mistake/feature/review/i;->d:I

    .line 7
    iput-boolean p5, p0, Lcom/zykj/mistake/feature/review/i;->e:Z

    .line 8
    iput-object p6, p0, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    .line 9
    iput p7, p0, Lcom/zykj/mistake/feature/review/i;->g:I

    .line 10
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/review/i;->h:Z

    .line 11
    iput-object p9, p0, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    .line 12
    iput p10, p0, Lcom/zykj/mistake/feature/review/i;->j:I

    .line 13
    iput-boolean p11, p0, Lcom/zykj/mistake/feature/review/i;->k:Z

    .line 14
    iput-object p12, p0, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    .line 15
    iput p13, p0, Lcom/zykj/mistake/feature/review/i;->m:I

    .line 16
    iput-boolean p14, p0, Lcom/zykj/mistake/feature/review/i;->n:Z

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/zykj/mistake/feature/review/i;->p:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/zykj/mistake/feature/review/i;->q:I

    move/from16 p1, p18

    .line 20
    iput p1, p0, Lcom/zykj/mistake/feature/review/i;->r:I

    move/from16 p1, p19

    .line 21
    iput p1, p0, Lcom/zykj/mistake/feature/review/i;->s:I

    move/from16 p1, p20

    .line 22
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/review/i;->t:Z

    move/from16 p1, p21

    .line 23
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/review/i;->u:Z

    move/from16 p1, p22

    .line 24
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/review/i;->v:Z

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/review/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZI)Lcom/zykj/mistake/feature/review/i;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_3

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->d:I

    move v7, v2

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_4

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/review/i;->e:Z

    move v8, v2

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_5

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_6

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->g:I

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/review/i;->h:Z

    move v11, v2

    goto :goto_7

    :cond_7
    move/from16 v11, p8

    :goto_7
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_8

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    move-object v12, v2

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_9

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->j:I

    move v13, v2

    goto :goto_9

    :cond_9
    move/from16 v13, p10

    :goto_9
    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/review/i;->k:Z

    move v14, v2

    goto :goto_a

    :cond_a
    move/from16 v14, p11

    :goto_a
    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    move-object v15, v2

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->m:I

    move/from16 v16, v2

    goto :goto_c

    :cond_c
    move/from16 v16, p13

    :goto_c
    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/review/i;->n:Z

    move/from16 v17, v2

    goto :goto_d

    :cond_d
    move/from16 v17, p14

    :goto_d
    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    move-object/from16 v18, v2

    goto :goto_e

    :cond_e
    move-object/from16 v18, p15

    :goto_e
    const v2, 0x8000

    and-int/2addr v2, v1

    if-eqz v2, :cond_f

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->p:I

    move/from16 v19, v2

    goto :goto_f

    :cond_f
    move/from16 v19, p16

    :goto_f
    const/high16 v2, 0x10000

    and-int/2addr v2, v1

    if-eqz v2, :cond_10

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->q:I

    move/from16 v20, v2

    goto :goto_10

    :cond_10
    move/from16 v20, p17

    :goto_10
    const/high16 v2, 0x20000

    and-int/2addr v2, v1

    if-eqz v2, :cond_11

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->r:I

    move/from16 v21, v2

    goto :goto_11

    :cond_11
    move/from16 v21, p18

    :goto_11
    const/high16 v2, 0x40000

    and-int/2addr v2, v1

    if-eqz v2, :cond_12

    iget v2, v0, Lcom/zykj/mistake/feature/review/i;->s:I

    move/from16 v22, v2

    goto :goto_12

    :cond_12
    move/from16 v22, p19

    :goto_12
    const/high16 v2, 0x80000

    and-int/2addr v2, v1

    if-eqz v2, :cond_13

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/review/i;->t:Z

    move/from16 v23, v2

    goto :goto_13

    :cond_13
    move/from16 v23, p20

    :goto_13
    const/high16 v2, 0x100000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/review/i;->u:Z

    :goto_14
    move/from16 v24, v1

    goto :goto_15

    :cond_14
    const/4 v1, 0x1

    goto :goto_14

    :goto_15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string v0, "studentName"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summaryText"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendDescription"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strengtheningDescription"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consolidatingDescription"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "masteredDescription"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/zykj/mistake/feature/review/i;

    move/from16 v25, p21

    invoke-direct/range {v3 .. v25}, Lcom/zykj/mistake/feature/review/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZZ)V

    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/review/i;

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/review/i;

    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->d:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->d:I

    if-eq v1, v2, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->e:Z

    iget-boolean v2, p1, Lcom/zykj/mistake/feature/review/i;->e:Z

    if-eq v1, v2, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->g:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->g:I

    if-eq v1, v2, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->h:Z

    iget-boolean v2, p1, Lcom/zykj/mistake/feature/review/i;->h:Z

    if-eq v1, v2, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->j:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->j:I

    if-eq v1, v2, :cond_b

    goto/16 :goto_0

    :cond_b
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->k:Z

    iget-boolean v2, p1, Lcom/zykj/mistake/feature/review/i;->k:Z

    if-eq v1, v2, :cond_c

    goto :goto_0

    :cond_c
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_0

    :cond_d
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->m:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->m:I

    if-eq v1, v2, :cond_e

    goto :goto_0

    :cond_e
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->n:Z

    iget-boolean v2, p1, Lcom/zykj/mistake/feature/review/i;->n:Z

    if-eq v1, v2, :cond_f

    goto :goto_0

    :cond_f
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_0

    :cond_10
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->p:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->p:I

    if-eq v1, v2, :cond_11

    goto :goto_0

    :cond_11
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->q:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->q:I

    if-eq v1, v2, :cond_12

    goto :goto_0

    :cond_12
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->r:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->r:I

    if-eq v1, v2, :cond_13

    goto :goto_0

    :cond_13
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->s:I

    iget v2, p1, Lcom/zykj/mistake/feature/review/i;->s:I

    if-eq v1, v2, :cond_14

    goto :goto_0

    :cond_14
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->t:Z

    iget-boolean v2, p1, Lcom/zykj/mistake/feature/review/i;->t:Z

    if-eq v1, v2, :cond_15

    goto :goto_0

    :cond_15
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->u:Z

    iget-boolean v2, p1, Lcom/zykj/mistake/feature/review/i;->u:Z

    if-eq v1, v2, :cond_16

    goto :goto_0

    :cond_16
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->v:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/feature/review/i;->v:Z

    if-eq v1, p1, :cond_17

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_17
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/feature/review/i;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/i;->e:Z

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lcom/zykj/mistake/feature/review/i;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/i;->h:Z

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lcom/zykj/mistake/feature/review/i;->j:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/i;->k:Z

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, Lcom/zykj/mistake/feature/review/i;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/i;->n:Z

    .line 83
    .line 84
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v2, 0x0

    .line 89
    iget-object v3, p0, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    .line 90
    .line 91
    if-nez v3, :cond_0

    .line 92
    .line 93
    move v3, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_0
    add-int/2addr v0, v3

    .line 100
    mul-int/2addr v0, v1

    .line 101
    iget v3, p0, Lcom/zykj/mistake/feature/review/i;->p:I

    .line 102
    .line 103
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget v3, p0, Lcom/zykj/mistake/feature/review/i;->q:I

    .line 108
    .line 109
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iget v3, p0, Lcom/zykj/mistake/feature/review/i;->r:I

    .line 114
    .line 115
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget v3, p0, Lcom/zykj/mistake/feature/review/i;->s:I

    .line 120
    .line 121
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/review/i;->t:Z

    .line 126
    .line 127
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/review/i;->u:Z

    .line 132
    .line 133
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/review/i;->v:Z

    .line 138
    .line 139
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/2addr v1, v0

    .line 148
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", summaryText="

    .line 2
    .line 3
    const-string v1, ", recommendDescription="

    .line 4
    .line 5
    const-string v2, "State(studentName="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/review/i;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/review/i;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", recommendPracticeCount="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->d:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", recommendCanPractice="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->e:Z

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", strengtheningDescription="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", strengtheningCount="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->g:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", strengtheningCanPractice="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->h:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", consolidatingDescription="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", consolidatingCount="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->j:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", consolidatingCanPractice="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->k:Z

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", masteredDescription="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->l:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", masteredCount="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->m:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", masteredCanPractice="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->n:Z

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", recent7AddedMistakeCount="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/i;->o:Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", recent7PracticeCount="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->p:I

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ", recent7PracticeDays="

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v1, ", recent7EnterConsolidatingCount="

    .line 156
    .line 157
    const-string v2, ", recent7EnterMasteredCount="

    .line 158
    .line 159
    iget v3, p0, Lcom/zykj/mistake/feature/review/i;->q:I

    .line 160
    .line 161
    iget v4, p0, Lcom/zykj/mistake/feature/review/i;->r:I

    .line 162
    .line 163
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget v1, p0, Lcom/zykj/mistake/feature/review/i;->s:I

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, ", shouldDefaultReviewTab="

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->t:Z

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v1, ", isHomeLoaded="

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->u:Z

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v1, ", isLoadingHome="

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/i;->v:Z

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v1, ", isLoadingRecommend=false)"

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0
.end method
