.class public final Lcom/zykj/mistake/feature/collection/filter/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Ljava/lang/Integer;

.field public final B:Ljava/lang/Integer;

.field public final C:I

.field public final D:I

.field public final E:Z

.field public final F:Ljava/util/Set;

.field public final G:Z

.field public final H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

.field public final f:I

.field public final g:Ljava/util/List;

.field public final h:I

.field public final i:Ljava/util/Set;

.field public final j:Ljava/util/Set;

.field public final k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/List;

.field public final u:I

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Z

.field public final y:Ljava/util/Set;

.field public final z:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/List;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V
    .locals 10

    move-object/from16 v0, p7

    move-object/from16 v1, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p19

    move-object/from16 v5, p20

    move-object/from16 v6, p25

    move-object/from16 v7, p32

    move-object/from16 v8, p34

    const-string v9, "items"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "allItemIds"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "selectedItemIds"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "sortType"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "filterSubjects"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "filterTags"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "selectedSubjectIds"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "selectedTagIds"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "sourceType"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 5
    iput p4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 6
    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    move/from16 p1, p6

    .line 7
    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->f:I

    .line 8
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    move/from16 p1, p8

    .line 9
    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    .line 10
    iput-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    .line 11
    iput-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 12
    iput-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    move/from16 p1, p13

    .line 14
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    move/from16 p1, p16

    .line 17
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    move/from16 p1, p17

    .line 18
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    move/from16 p1, p18

    .line 19
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    .line 20
    iput-object v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    .line 21
    iput-object v5, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    move/from16 p1, p21

    .line 22
    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    move/from16 p1, p24

    .line 25
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    .line 26
    iput-object v6, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    move-object/from16 p1, p26

    .line 27
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    move-object/from16 p1, p27

    .line 28
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    move-object/from16 p1, p28

    .line 29
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    move/from16 p1, p29

    .line 30
    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    move/from16 p1, p30

    .line 31
    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    move/from16 p1, p31

    .line 32
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    .line 33
    iput-object v7, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    move/from16 p1, p33

    .line 34
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    .line 35
    iput-object v8, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p35

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->f:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p3, v4

    and-int/lit16 v4, v1, 0x4000

    if-eqz v4, :cond_e

    iget-boolean v4, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    goto :goto_e

    :cond_e
    move/from16 v4, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p35, v16

    move/from16 p16, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p35, v16

    move/from16 p17, v1

    if-eqz v16, :cond_11

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p35, v16

    move/from16 p18, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p35, v16

    move/from16 p15, v4

    if-eqz v16, :cond_13

    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v4, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p35, v16

    move/from16 p4, v5

    if-eqz v16, :cond_14

    iget v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    goto :goto_14

    :cond_14
    move/from16 v5, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p35, v16

    move/from16 p21, v5

    if-eqz v16, :cond_15

    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v5, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p35, v16

    move-object/from16 p22, v5

    if-eqz v16, :cond_16

    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v5, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p35, v16

    move-object/from16 p23, v5

    if-eqz v16, :cond_17

    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    goto :goto_17

    :cond_17
    move/from16 v5, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p35, v16

    move/from16 p24, v5

    if-eqz v16, :cond_18

    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    goto :goto_18

    :cond_18
    move-object/from16 v5, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p35, v16

    move/from16 p6, v7

    if-eqz v16, :cond_19

    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    goto :goto_19

    :cond_19
    move-object/from16 v7, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p35, v16

    move-object/from16 p26, v7

    if-eqz v16, :cond_1a

    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    goto :goto_1a

    :cond_1a
    move-object/from16 v7, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p35, v16

    move-object/from16 p27, v7

    if-eqz v16, :cond_1b

    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    goto :goto_1b

    :cond_1b
    move-object/from16 v7, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p35, v16

    move-object/from16 p28, v7

    if-eqz v16, :cond_1c

    iget v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    goto :goto_1c

    :cond_1c
    move/from16 v7, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p35, v16

    move/from16 p29, v7

    if-eqz v16, :cond_1d

    iget v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    goto :goto_1d

    :cond_1d
    move/from16 v7, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p35, v16

    move/from16 p30, v7

    if-eqz v16, :cond_1e

    iget-boolean v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    goto :goto_1e

    :cond_1e
    move/from16 v7, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p35, v16

    move/from16 p31, v7

    if-eqz v16, :cond_1f

    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    goto :goto_1f

    :cond_1f
    move-object/from16 v7, p32

    :goto_1f
    and-int/lit8 v16, p36, 0x1

    move/from16 p8, v9

    if-eqz v16, :cond_20

    iget-boolean v9, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    goto :goto_20

    :cond_20
    move/from16 v9, p33

    :goto_20
    and-int/lit8 v16, p36, 0x2

    move/from16 p33, v9

    if-eqz v16, :cond_21

    iget-object v9, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    goto :goto_21

    :cond_21
    move-object/from16 v9, p34

    :goto_21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string v0, "collectionId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mistakeListReq"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allItemIds"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedItemIds"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortType"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterSubjects"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterTags"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedSubjectIds"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedTagIds"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceType"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/s0;

    move-object/from16 p0, v0

    move-object/from16 p19, v1

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p20, v4

    move-object/from16 p25, v5

    move-object/from16 p5, v6

    move-object/from16 p32, v7

    move-object/from16 p7, v8

    move-object/from16 p34, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    invoke-direct/range {p0 .. p34}, Lcom/zykj/mistake/feature/collection/filter/s0;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/List;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ljava/util/Collection;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 13
    .line 14
    check-cast v0, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/collection/filter/s0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/s0;

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->f:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    if-eq v1, p1, :cond_23

    return v2

    :cond_23
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->f:I

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/2addr v2, v0

    .line 61
    mul-int/2addr v2, v1

    .line 62
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, v2

    .line 69
    mul-int/2addr v0, v1

    .line 70
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/2addr v2, v0

    .line 77
    mul-int/2addr v2, v1

    .line 78
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    .line 79
    .line 80
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    .line 91
    .line 92
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    .line 103
    .line 104
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    .line 109
    .line 110
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    .line 115
    .line 116
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    .line 121
    .line 122
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    .line 127
    .line 128
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    .line 133
    .line 134
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/4 v2, 0x0

    .line 139
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    .line 140
    .line 141
    if-nez v3, :cond_0

    .line 142
    .line 143
    move v3, v2

    .line 144
    goto :goto_0

    .line 145
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    :goto_0
    add-int/2addr v0, v3

    .line 150
    mul-int/2addr v0, v1

    .line 151
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    .line 152
    .line 153
    if-nez v3, :cond_1

    .line 154
    .line 155
    move v3, v2

    .line 156
    goto :goto_1

    .line 157
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    :goto_1
    add-int/2addr v0, v3

    .line 162
    mul-int/2addr v0, v1

    .line 163
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    .line 164
    .line 165
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    add-int/2addr v3, v0

    .line 176
    mul-int/2addr v3, v1

    .line 177
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    .line 178
    .line 179
    if-nez v0, :cond_2

    .line 180
    .line 181
    move v0, v2

    .line 182
    goto :goto_2

    .line 183
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    :goto_2
    add-int/2addr v3, v0

    .line 188
    mul-int/2addr v3, v1

    .line 189
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    .line 190
    .line 191
    if-nez v0, :cond_3

    .line 192
    .line 193
    move v0, v2

    .line 194
    goto :goto_3

    .line 195
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    :goto_3
    add-int/2addr v3, v0

    .line 200
    mul-int/2addr v3, v1

    .line 201
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    .line 202
    .line 203
    if-nez v0, :cond_4

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    :goto_4
    add-int/2addr v3, v2

    .line 211
    mul-int/2addr v3, v1

    .line 212
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    .line 213
    .line 214
    invoke-static {v0, v3, v1}, Landroidx/collection/a;->c(III)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    .line 219
    .line 220
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    .line 225
    .line 226
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    add-int/2addr v2, v0

    .line 237
    mul-int/2addr v2, v1

    .line 238
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    .line 239
    .line 240
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    add-int/2addr v1, v0

    .line 251
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", currentCount="

    .line 4
    .line 5
    const-string v2, "State(collectionId="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", capacity="

    .line 16
    .line 17
    const-string v2, ", mistakeListReq="

    .line 18
    .line 19
    iget v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 20
    .line 21
    iget v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", otherCollectionType="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->f:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", items="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", totalCount="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", allItemIds="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", selectedItemIds="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", sortType="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ", drawerVisible="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", showCurrentCollectionFilter="

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", isRefreshing="

    .line 107
    .line 108
    const-string v2, ", isLoadingMore="

    .line 109
    .line 110
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    .line 111
    .line 112
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    .line 113
    .line 114
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 115
    .line 116
    .line 117
    const-string v1, ", hasMore="

    .line 118
    .line 119
    const-string v2, ", isLoading="

    .line 120
    .line 121
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    .line 122
    .line 123
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    .line 124
    .line 125
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 126
    .line 127
    .line 128
    const-string v1, ", isAddingToCollection="

    .line 129
    .line 130
    const-string v2, ", filterSubjects="

    .line 131
    .line 132
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    .line 133
    .line 134
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->r:Z

    .line 135
    .line 136
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", filterTags="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", selectedTimeType="

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, ", customStartTime="

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, ", customEndTime="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, ", isCustomTimeConfirmed="

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, ", selectedSubjectIds="

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v1, ", selectedDiffValue="

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, ", selectedAttainedLevelValue="

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v1, ", selectedErrorReasonValue="

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v1, ", selectedCurrentCollectionType="

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v1, ", selectedOtherCollectionType="

    .line 240
    .line 241
    const-string v2, ", includeNoCustomTag="

    .line 242
    .line 243
    iget v3, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    .line 244
    .line 245
    iget v4, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    .line 246
    .line 247
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v1, ", selectedTagIds="

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v1, ", showOverLimitDialog="

    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v1, ", sourceType="

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v1, ")"

    .line 286
    .line 287
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    return-object v0
.end method
