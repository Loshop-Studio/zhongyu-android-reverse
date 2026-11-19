.class public final Lcom/zykj/mistake/feature/notebook/list/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Ljava/util/Set;

.field public final k:Ljava/util/List;

.field public final l:Ljava/util/List;

.field public final m:Ljava/util/List;

.field public final n:Z

.field public final o:Z

.field public final p:Ljava/util/List;

.field public final q:Ljava/util/Set;

.field public final r:Ljava/util/Set;

.field public final s:Z

.field public final t:Z

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Z

.field public final x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

.field public final y:Z


# direct methods
.method public constructor <init>(IIZLjava/util/List;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/util/List;Ljava/util/Set;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;Z)V
    .locals 8

    move-object/from16 v0, p10

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    move-object/from16 v4, p16

    move-object/from16 v5, p17

    move-object/from16 v6, p18

    const-string v7, "items"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "selectedItemIds"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "filterSubjects"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "customTags"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "filterCustomTags"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "joinCollections"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "originalJoinCollectionIds"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "selectedJoinCollectionIds"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    .line 3
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    .line 4
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    .line 5
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 6
    iput-boolean p5, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 7
    iput-boolean p6, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 8
    iput-boolean p7, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    move/from16 p1, p8

    .line 9
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    move/from16 p1, p9

    .line 10
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    .line 11
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 12
    iput-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    .line 13
    iput-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    .line 14
    iput-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    .line 17
    iput-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 18
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->q:Ljava/util/Set;

    .line 19
    iput-object v6, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    move/from16 p1, p19

    .line 20
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    move/from16 p1, p20

    .line 21
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    move/from16 p1, p23

    .line 24
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    move/from16 p1, p25

    .line 26
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 26

    .line 27
    sget-object v4, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 28
    sget-object v10, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v1, 0x1d

    const/16 v2, 0xd

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 29
    const-string v21, ""

    const/16 v24, 0x0

    move-object v11, v4

    move-object v12, v4

    move-object v13, v4

    move-object/from16 v16, v4

    move-object/from16 v17, v10

    move-object/from16 v18, v10

    move-object/from16 v22, v21

    move-object/from16 v0, p0

    move/from16 v3, p1

    invoke-direct/range {v0 .. v25}, Lcom/zykj/mistake/feature/notebook/list/e1;-><init>(IIZLjava/util/List;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/util/List;Ljava/util/Set;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;Z)V

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/notebook/list/e1;IIZLjava/util/ArrayList;ZZZZLjava/util/Set;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLjava/util/ArrayList;Lkotlin/collections/EmptySet;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;ZI)Lcom/zykj/mistake/feature/notebook/list/e1;
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    iget v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_2

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    move-object v7, v2

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_4

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    move v8, v2

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_5

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    move v9, v2

    goto :goto_5

    :cond_5
    move/from16 v9, p6

    :goto_5
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_6

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    move v11, v2

    goto :goto_7

    :cond_7
    const/4 v11, 0x1

    :goto_7
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_8

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    move v12, v2

    goto :goto_8

    :cond_8
    move/from16 v12, p8

    :goto_8
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_9

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p9

    :goto_9
    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    move-object v14, v2

    goto :goto_a

    :cond_a
    move-object/from16 v14, p10

    :goto_a
    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    move-object v15, v2

    goto :goto_b

    :cond_b
    move-object/from16 v15, p11

    :goto_b
    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p12

    :goto_c
    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-boolean v3, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    move/from16 v17, v3

    goto :goto_d

    :cond_d
    const/16 v17, 0x1

    :goto_d
    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-boolean v3, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    move/from16 v18, v3

    goto :goto_e

    :cond_e
    move/from16 v18, p13

    :goto_e
    const v3, 0x8000

    and-int/2addr v3, v1

    if-eqz v3, :cond_f

    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v3, p14

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->q:Ljava/util/Set;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p15

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p24, v16

    move/from16 p1, v4

    if-eqz v16, :cond_11

    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    goto :goto_11

    :cond_11
    move-object/from16 v4, p16

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p24, v16

    move/from16 p2, v5

    if-eqz v16, :cond_12

    iget-boolean v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    move/from16 v22, v5

    goto :goto_12

    :cond_12
    move/from16 v22, p17

    :goto_12
    const/high16 v5, 0x80000

    and-int v5, p24, v5

    if-eqz v5, :cond_13

    iget-boolean v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    move/from16 v23, v5

    goto :goto_13

    :cond_13
    move/from16 v23, p18

    :goto_13
    const/high16 v5, 0x100000

    and-int v5, p24, v5

    if-eqz v5, :cond_14

    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v5, p19

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p24, v16

    move/from16 p3, v6

    if-eqz v16, :cond_15

    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v6, p20

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p24, v16

    move/from16 p4, v8

    if-eqz v16, :cond_16

    iget-boolean v8, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    move/from16 v26, v8

    goto :goto_16

    :cond_16
    move/from16 v26, p21

    :goto_16
    const/high16 v8, 0x800000

    and-int v8, p24, v8

    if-eqz v8, :cond_17

    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    move-object/from16 v27, v8

    goto :goto_17

    :cond_17
    move-object/from16 v27, p22

    :goto_17
    const/high16 v8, 0x1000000

    and-int v8, p24, v8

    if-eqz v8, :cond_18

    iget-boolean v8, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    move/from16 v28, v8

    goto :goto_18

    :cond_18
    move/from16 v28, p23

    :goto_18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string v0, "items"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedItemIds"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterSubjects"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customTags"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterCustomTags"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinCollections"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalJoinCollectionIds"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedJoinCollectionIds"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createCollectionName"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createCollectionNameError"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v3

    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/e1;

    move/from16 v8, p4

    move-object/from16 v20, v1

    move-object/from16 v16, v2

    move-object/from16 v21, v4

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-direct/range {v3 .. v28}, Lcom/zykj/mistake/feature/notebook/list/e1;-><init>(IIZLjava/util/List;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/util/List;Ljava/util/Set;Ljava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;Z)V

    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/notebook/list/e1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/e1;

    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->q:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->q:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    if-eq v1, p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    add-int/2addr v2, v0

    .line 65
    mul-int/2addr v2, v1

    .line 66
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    .line 91
    .line 92
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->q:Ljava/util/Set;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    add-int/2addr v2, v0

    .line 109
    mul-int/2addr v2, v1

    .line 110
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    add-int/2addr v0, v2

    .line 117
    mul-int/2addr v0, v1

    .line 118
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    .line 119
    .line 120
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    .line 125
    .line 126
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    .line 143
    .line 144
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 149
    .line 150
    if-nez v2, :cond_0

    .line 151
    .line 152
    const/4 v2, 0x0

    .line 153
    goto :goto_0

    .line 154
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    :goto_0
    add-int/2addr v0, v2

    .line 159
    mul-int/2addr v0, v1

    .line 160
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    .line 161
    .line 162
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    add-int/2addr v1, v0

    .line 167
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", masteredCount="

    .line 2
    .line 3
    const-string v1, ", practiceEnabled="

    .line 4
    .line 5
    const-string v2, "State(totalCount="

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->a:I

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->b:I

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", items="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", isRefreshing="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", isLoadingMore="

    .line 36
    .line 37
    const-string v2, ", hasMore="

    .line 38
    .line 39
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->e:Z

    .line 40
    .line 41
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 42
    .line 43
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", isFilterApplied="

    .line 47
    .line 48
    const-string v2, ", isSelectionMode="

    .line 49
    .line 50
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    .line 51
    .line 52
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->h:Z

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", selectedItemIds="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->j:Ljava/util/Set;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", filterSubjects="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->k:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", customTags="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->l:Ljava/util/List;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", filterCustomTags="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->m:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", isFilterDataLoaded="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->n:Z

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", showJoinCollectionDialog="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->o:Z

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ", joinCollections="

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->p:Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", originalJoinCollectionIds="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->q:Ljava/util/Set;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, ", selectedJoinCollectionIds="

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->r:Ljava/util/Set;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v1, ", isJoiningCollection="

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, ", showCreateCollectionDialog="

    .line 158
    .line 159
    const-string v2, ", createCollectionName="

    .line 160
    .line 161
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->s:Z

    .line 162
    .line 163
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->t:Z

    .line 164
    .line 165
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 166
    .line 167
    .line 168
    const-string v1, ", createCollectionNameError="

    .line 169
    .line 170
    const-string v2, ", isCreatingCollection="

    .line 171
    .line 172
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->u:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->v:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->w:Z

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, ", createCollectionEntry="

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->x:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, ", showCollectionLimitDialog="

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/list/e1;->y:Z

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v1, ")"

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0
.end method
