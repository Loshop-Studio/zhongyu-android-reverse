.class public final Lcom/zykj/mistake/feature/collection/detail/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Ljava/util/Set;

.field public final B:Z

.field public final C:Z

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Z

.field public final G:Z

.field public final H:Ljava/util/Set;

.field public final I:Z

.field public final J:Z

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

.field public final e:Z

.field public final f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

.field public final g:Ljava/util/List;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Ljava/util/List;

.field public final n:Ljava/util/List;

.field public final o:I

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:Ljava/util/Set;

.field public final t:Ljava/lang/Integer;

.field public final u:Ljava/lang/Integer;

.field public final v:Ljava/lang/Integer;

.field public final w:I

.field public final x:I

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZ)V
    .locals 6

    move-object/from16 v0, p13

    move-object/from16 v1, p14

    move-object/from16 v2, p19

    move-object/from16 v3, p27

    move-object/from16 v4, p34

    const-string v5, "entryMode"

    invoke-static {p4, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "drawerMode"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "items"

    invoke-static {p7, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "filterSubjects"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "filterTags"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "selectedSubjectIds"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "selectedTagIds"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "selectedItemIds"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 5
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 6
    iput-boolean p5, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 7
    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 8
    iput-object p7, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 9
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    move p1, p9

    .line 10
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    move/from16 p1, p10

    .line 11
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    move/from16 p1, p11

    .line 12
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 14
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    .line 15
    iput-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    move/from16 p1, p18

    .line 19
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    .line 20
    iput-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    move/from16 p1, p23

    .line 24
    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    move/from16 p1, p24

    .line 25
    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    move/from16 p1, p25

    .line 26
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    move/from16 p1, p26

    .line 27
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 28
    iput-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    move/from16 p1, p28

    .line 29
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->B:Z

    move/from16 p1, p29

    .line 30
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    move-object/from16 p1, p30

    .line 31
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    move-object/from16 p1, p31

    .line 32
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    move/from16 p1, p32

    .line 33
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    move/from16 p1, p33

    .line 34
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 35
    iput-object v4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    move/from16 p1, p35

    .line 36
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    move/from16 p1, p36

    .line 37
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/collection/detail/z0;Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZII)Lcom/zykj/mistake/feature/collection/detail/z0;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p37

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v5, v1, 0x10

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x20

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x40

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit16 v8, v1, 0x80

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x100

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x200

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x400

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x800

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x1000

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x2000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_e

    iget v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    goto :goto_e

    :cond_e
    move/from16 v1, p15

    :goto_e
    const/high16 v16, 0x10000

    and-int v16, p37, v16

    move/from16 p15, v1

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x20000

    and-int v16, p37, v16

    move-object/from16 p16, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x40000

    and-int v16, p37, v16

    move-object/from16 p17, v1

    if-eqz v16, :cond_11

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x80000

    and-int v16, p37, v16

    move/from16 p18, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x100000

    and-int v16, p37, v16

    move/from16 p3, v4

    if-eqz v16, :cond_13

    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    goto :goto_13

    :cond_13
    move-object/from16 v4, p20

    :goto_13
    const/high16 v16, 0x200000

    and-int v16, p37, v16

    move-object/from16 p20, v4

    if-eqz v16, :cond_14

    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    goto :goto_14

    :cond_14
    move-object/from16 v4, p21

    :goto_14
    const/high16 v16, 0x400000

    and-int v16, p37, v16

    move-object/from16 p21, v4

    if-eqz v16, :cond_15

    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    goto :goto_15

    :cond_15
    move-object/from16 v4, p22

    :goto_15
    const/high16 v16, 0x800000

    and-int v16, p37, v16

    move-object/from16 p22, v4

    if-eqz v16, :cond_16

    iget v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    goto :goto_16

    :cond_16
    move/from16 v4, p23

    :goto_16
    const/high16 v16, 0x1000000

    and-int v16, p37, v16

    move/from16 p23, v4

    if-eqz v16, :cond_17

    iget v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    goto :goto_17

    :cond_17
    move/from16 v4, p24

    :goto_17
    const/high16 v16, 0x2000000

    and-int v16, p37, v16

    move/from16 p24, v4

    if-eqz v16, :cond_18

    iget-boolean v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    goto :goto_18

    :cond_18
    move/from16 v4, p25

    :goto_18
    const/high16 v16, 0x4000000

    and-int v16, p37, v16

    move/from16 p25, v4

    if-eqz v16, :cond_19

    iget-boolean v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    goto :goto_19

    :cond_19
    move/from16 v4, p26

    :goto_19
    const/high16 v16, 0x8000000

    and-int v16, p37, v16

    move/from16 p26, v4

    if-eqz v16, :cond_1a

    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    goto :goto_1a

    :cond_1a
    move-object/from16 v4, p27

    :goto_1a
    const/high16 v16, 0x10000000

    and-int v16, p37, v16

    move/from16 p5, v6

    if-eqz v16, :cond_1b

    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->B:Z

    goto :goto_1b

    :cond_1b
    move/from16 v6, p28

    :goto_1b
    const/high16 v16, 0x20000000

    and-int v16, p37, v16

    move/from16 p28, v6

    if-eqz v16, :cond_1c

    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    goto :goto_1c

    :cond_1c
    move/from16 v6, p29

    :goto_1c
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p37, v16

    move/from16 p29, v6

    if-eqz v16, :cond_1d

    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 v6, p30

    :goto_1d
    const/high16 v16, -0x80000000

    and-int v16, p37, v16

    move/from16 p8, v9

    if-eqz v16, :cond_1e

    iget-object v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v9, p31

    :goto_1e
    and-int/lit8 v16, p38, 0x1

    move-object/from16 p31, v9

    if-eqz v16, :cond_1f

    iget-boolean v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    goto :goto_1f

    :cond_1f
    move/from16 v9, p32

    :goto_1f
    and-int/lit8 v16, p38, 0x2

    move/from16 p32, v9

    if-eqz v16, :cond_20

    iget-boolean v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    goto :goto_20

    :cond_20
    move/from16 v9, p33

    :goto_20
    and-int/lit8 v16, p38, 0x4

    move/from16 p33, v9

    if-eqz v16, :cond_21

    iget-object v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    goto :goto_21

    :cond_21
    move-object/from16 v9, p34

    :goto_21
    and-int/lit8 v16, p38, 0x8

    move/from16 p9, v10

    if-eqz v16, :cond_22

    iget-boolean v10, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    goto :goto_22

    :cond_22
    move/from16 v10, p35

    :goto_22
    and-int/lit8 v16, p38, 0x10

    move/from16 p35, v10

    if-eqz v16, :cond_23

    iget-boolean v10, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    goto :goto_23

    :cond_23
    move/from16 v10, p36

    :goto_23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string v0, "collectionId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entryMode"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawerMode"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterSubjects"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterTags"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedSubjectIds"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedTagIds"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editName"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedItemIds"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/z0;

    move-object/from16 p0, v0

    move-object/from16 p19, v1

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p27, v4

    move-object/from16 p4, v5

    move-object/from16 p30, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p34, v9

    move/from16 p36, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    invoke-direct/range {p0 .. p36}, Lcom/zykj/mistake/feature/collection/detail/z0;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;ZLcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;Ljava/util/List;ZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZZLjava/util/Set;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;ZZ)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 38
    .line 39
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 46
    .line 47
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 54
    .line 55
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 62
    .line 63
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 64
    .line 65
    if-eq v0, v1, :cond_7

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_7
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 70
    .line 71
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_8
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    .line 82
    .line 83
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    .line 84
    .line 85
    if-eq v0, v1, :cond_9

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_9
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    .line 90
    .line 91
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    .line 92
    .line 93
    if-eq v0, v1, :cond_a

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_a
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 98
    .line 99
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 100
    .line 101
    if-eq v0, v1, :cond_b

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_b
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    .line 106
    .line 107
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    .line 108
    .line 109
    if-eq v0, v1, :cond_c

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_c
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 114
    .line 115
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 116
    .line 117
    if-eq v0, v1, :cond_d

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_d
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    .line 122
    .line 123
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    .line 124
    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_e

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_e
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    .line 134
    .line 135
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    .line 136
    .line 137
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_f

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_f
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    .line 146
    .line 147
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    .line 148
    .line 149
    if-eq v0, v1, :cond_10

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_10
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_11

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_11
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_12

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_12
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    .line 178
    .line 179
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    .line 180
    .line 181
    if-eq v0, v1, :cond_13

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_13
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 186
    .line 187
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 188
    .line 189
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_14

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_14
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    .line 198
    .line 199
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_15

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_15
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    .line 210
    .line 211
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    .line 212
    .line 213
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_16

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_16
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    .line 222
    .line 223
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-nez v0, :cond_17

    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_17
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 234
    .line 235
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 236
    .line 237
    if-eq v0, v1, :cond_18

    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_18
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 242
    .line 243
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 244
    .line 245
    if-eq v0, v1, :cond_19

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_19
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    .line 250
    .line 251
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    .line 252
    .line 253
    if-eq v0, v1, :cond_1a

    .line 254
    .line 255
    goto :goto_0

    .line 256
    :cond_1a
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 257
    .line 258
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 259
    .line 260
    if-eq v0, v1, :cond_1b

    .line 261
    .line 262
    goto :goto_0

    .line 263
    :cond_1b
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    .line 264
    .line 265
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    .line 266
    .line 267
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_1c

    .line 272
    .line 273
    goto :goto_0

    .line 274
    :cond_1c
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->B:Z

    .line 275
    .line 276
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->B:Z

    .line 277
    .line 278
    if-eq v0, v1, :cond_1d

    .line 279
    .line 280
    goto :goto_0

    .line 281
    :cond_1d
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    .line 282
    .line 283
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    .line 284
    .line 285
    if-eq v0, v1, :cond_1e

    .line 286
    .line 287
    goto :goto_0

    .line 288
    :cond_1e
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    .line 289
    .line 290
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-nez v0, :cond_1f

    .line 297
    .line 298
    goto :goto_0

    .line 299
    :cond_1f
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    .line 300
    .line 301
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_20

    .line 308
    .line 309
    goto :goto_0

    .line 310
    :cond_20
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    .line 311
    .line 312
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    .line 313
    .line 314
    if-eq v0, v1, :cond_21

    .line 315
    .line 316
    goto :goto_0

    .line 317
    :cond_21
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 318
    .line 319
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 320
    .line 321
    if-eq v0, v1, :cond_22

    .line 322
    .line 323
    goto :goto_0

    .line 324
    :cond_22
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 325
    .line 326
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 327
    .line 328
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-nez v0, :cond_23

    .line 333
    .line 334
    goto :goto_0

    .line 335
    :cond_23
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 336
    .line 337
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 338
    .line 339
    if-eq v0, v1, :cond_24

    .line 340
    .line 341
    goto :goto_0

    .line 342
    :cond_24
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    .line 343
    .line 344
    iget-boolean p1, p1, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    .line 345
    .line 346
    if-eq v0, p1, :cond_25

    .line 347
    .line 348
    :goto_0
    const/4 p1, 0x0

    .line 349
    return p1

    .line 350
    :cond_25
    :goto_1
    const/4 p1, 0x1

    .line 351
    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v2, 0x64

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

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
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 69
    .line 70
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    .line 75
    .line 76
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    .line 99
    .line 100
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const/4 v2, 0x0

    .line 105
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 106
    .line 107
    if-nez v3, :cond_0

    .line 108
    .line 109
    move v3, v2

    .line 110
    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    :goto_0
    add-int/2addr v0, v3

    .line 116
    mul-int/2addr v0, v1

    .line 117
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 118
    .line 119
    if-nez v3, :cond_1

    .line 120
    .line 121
    move v3, v2

    .line 122
    goto :goto_1

    .line 123
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    :goto_1
    add-int/2addr v0, v3

    .line 128
    mul-int/2addr v0, v1

    .line 129
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    .line 130
    .line 131
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    add-int/2addr v3, v0

    .line 142
    mul-int/2addr v3, v1

    .line 143
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    .line 144
    .line 145
    if-nez v0, :cond_2

    .line 146
    .line 147
    move v0, v2

    .line 148
    goto :goto_2

    .line 149
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    :goto_2
    add-int/2addr v3, v0

    .line 154
    mul-int/2addr v3, v1

    .line 155
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    .line 156
    .line 157
    if-nez v0, :cond_3

    .line 158
    .line 159
    move v0, v2

    .line 160
    goto :goto_3

    .line 161
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    :goto_3
    add-int/2addr v3, v0

    .line 166
    mul-int/2addr v3, v1

    .line 167
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    .line 168
    .line 169
    if-nez v0, :cond_4

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    :goto_4
    add-int/2addr v3, v2

    .line 177
    mul-int/2addr v3, v1

    .line 178
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 179
    .line 180
    invoke-static {v0, v3, v1}, Landroidx/collection/a;->c(III)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iget v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 185
    .line 186
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    .line 191
    .line 192
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 197
    .line 198
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    add-int/2addr v2, v0

    .line 209
    mul-int/2addr v2, v1

    .line 210
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->B:Z

    .line 211
    .line 212
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    .line 217
    .line 218
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    .line 235
    .line 236
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 241
    .line 242
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    add-int/2addr v2, v0

    .line 253
    mul-int/2addr v2, v1

    .line 254
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 255
    .line 256
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    .line 261
    .line 262
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    add-int/2addr v1, v0

    .line 267
    return v1
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    .line 2
    .line 3
    return v0
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
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", maxCount=100, entryMode="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", drawerVisible="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", drawerMode="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", items="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", practiceEnabled="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", hasLoadedItems="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", isRefreshing="

    .line 76
    .line 77
    const-string v2, ", isLoadingMore="

    .line 78
    .line 79
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->i:Z

    .line 80
    .line 81
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 82
    .line 83
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 84
    .line 85
    .line 86
    const-string v1, ", hasMore="

    .line 87
    .line 88
    const-string v2, ", filterSubjects="

    .line 89
    .line 90
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    .line 91
    .line 92
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 93
    .line 94
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", filterTags="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", selectedTimeType="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ", customStartTime="

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", customEndTime="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, ", isCustomTimeConfirmed="

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v1, ", selectedSubjectIds="

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v1, ", selectedDiffValue="

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, ", selectedAttainedLevelValue="

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v1, ", selectedErrorReasonValue="

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v1, ", selectedCurrentCollectionType="

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v1, ", selectedOtherCollectionType="

    .line 198
    .line 199
    const-string v2, ", addFilterInitialized="

    .line 200
    .line 201
    iget v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 202
    .line 203
    iget v4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    .line 204
    .line 205
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const-string v1, ", includeNoCustomTag="

    .line 209
    .line 210
    const-string v2, ", selectedTagIds="

    .line 211
    .line 212
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->y:Z

    .line 213
    .line 214
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    .line 215
    .line 216
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 217
    .line 218
    .line 219
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v1, ", isFilterLoading="

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->B:Z

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v1, ", showEditNameDialog="

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    .line 240
    .line 241
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v1, ", editName="

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v1, ", editNameError="

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v1, ", isEditingName="

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    .line 270
    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v1, ", isDeleteMode="

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 280
    .line 281
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v1, ", selectedItemIds="

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 290
    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v1, ", isDeleting="

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v1, ", showDeleteConfirmDialog="

    .line 305
    .line 306
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    .line 310
    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v1, ")"

    .line 315
    .line 316
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0
.end method
