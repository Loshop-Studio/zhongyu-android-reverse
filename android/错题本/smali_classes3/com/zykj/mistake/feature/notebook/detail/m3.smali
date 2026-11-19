.class public final Lcom/zykj/mistake/feature/notebook/detail/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:Z

.field public final D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

.field public final E:Ljava/util/List;

.field public final F:Lcom/zykj/mistake/feature/notebook/detail/p0;

.field public final G:Lcom/zykj/mistake/feature/notebook/detail/p0;

.field public final H:Lcom/zykj/mistake/feature/notebook/detail/n3;

.field public final I:Lcom/zykj/mistake/feature/notebook/detail/k3;

.field public final J:Lcom/zykj/mistake/feature/notebook/detail/q0;

.field public final K:Z

.field public final L:Z

.field public final M:Z

.field public final N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

.field public final O:Z

.field public final P:Z

.field public final Q:I

.field public final R:Ljava/util/List;

.field public final S:I

.field public final T:Z

.field public final U:Ljava/util/List;

.field public final V:Ljava/util/Set;

.field public final W:Ljava/util/Set;

.field public final X:Ljava/util/Set;

.field public final Y:Z

.field public final Z:Z

.field public final a:I

.field public final a0:Z

.field public final b:I

.field public final b0:Z

.field public final c:J

.field public final c0:Ljava/lang/String;

.field public final d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

.field public final d0:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final e0:Z

.field public final f:Ljava/lang/String;

.field public final f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

.field public final g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

.field public final g0:Z

.field public final h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

.field public final h0:Z

.field public final i:Ljava/lang/String;

.field public final i0:Z

.field public final j:Ljava/lang/String;

.field public final j0:Z

.field public final k:Ljava/lang/String;

.field public final k0:Z

.field public final l:Ljava/lang/String;

.field public final l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

.field public final m:Ljava/util/List;

.field public final m0:I

.field public final n:Ljava/util/List;

.field public final o:Ljava/util/List;

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Ljava/util/List;

.field public final t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

.field public final u:Z

.field public final v:Z

.field public final w:Z

.field public final x:Ljava/lang/Integer;

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p8

    move-object/from16 v3, p14

    move-object/from16 v4, p15

    move-object/from16 v5, p16

    move-object/from16 v6, p20

    move-object/from16 v7, p21

    move-object/from16 v8, p31

    move-object/from16 v9, p32

    move-object/from16 v10, p45

    move-object/from16 v11, p48

    move-object/from16 v12, p49

    move-object/from16 v13, p50

    move-object/from16 v14, p51

    const-string v15, "entryMode"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "reviewPracticeScene"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "editStems"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "editAnswers"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "editTags"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "tags"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "answerResult"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "selectedTab"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "answerEntries"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "navItems"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "joinCollections"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "collectionIds"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "originalJoinCollectionIds"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "selectedJoinCollectionIds"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move/from16 v15, p1

    .line 2
    iput v15, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a:I

    move/from16 v15, p2

    .line 3
    iput v15, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    move-wide/from16 v14, p3

    .line 4
    iput-wide v14, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    .line 5
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    move-object/from16 v1, p6

    .line 6
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    move-object/from16 v1, p7

    .line 7
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    .line 8
    iput-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    move-object/from16 v1, p9

    .line 9
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    move-object/from16 v1, p10

    .line 10
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    move-object/from16 v1, p11

    .line 11
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    move-object/from16 v1, p12

    .line 12
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    move-object/from16 v1, p13

    .line 13
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    .line 14
    iput-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    .line 15
    iput-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    .line 16
    iput-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    move/from16 v1, p17

    .line 17
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    move/from16 v1, p18

    .line 18
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->q:Z

    move/from16 v1, p19

    .line 19
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    .line 20
    iput-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    .line 21
    iput-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    move/from16 v1, p22

    .line 22
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    move/from16 v1, p23

    .line 23
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    move/from16 v1, p24

    .line 24
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    move-object/from16 v1, p25

    .line 25
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    move/from16 v1, p26

    .line 26
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    move/from16 v1, p27

    .line 27
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    move/from16 v1, p28

    .line 28
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    move/from16 v1, p29

    .line 29
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    move/from16 v1, p30

    .line 30
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    .line 31
    iput-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 32
    iput-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    move-object/from16 v1, p33

    .line 33
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    move-object/from16 v1, p34

    .line 34
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    move-object/from16 v1, p35

    .line 35
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    move-object/from16 v1, p36

    .line 36
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    move-object/from16 v1, p37

    .line 37
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    move/from16 v1, p38

    .line 38
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    move/from16 v1, p39

    .line 39
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    move/from16 v1, p40

    .line 40
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    move-object/from16 v1, p41

    .line 41
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    move/from16 v1, p42

    .line 42
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->O:Z

    move/from16 v1, p43

    .line 43
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    move/from16 v1, p44

    .line 44
    iput v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    .line 45
    iput-object v10, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    move/from16 v1, p46

    .line 46
    iput v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    move/from16 v1, p47

    .line 47
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    .line 48
    iput-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    .line 49
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    .line 50
    iput-object v13, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    move-object/from16 v14, p51

    .line 51
    iput-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    move/from16 v1, p52

    .line 52
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    move/from16 v1, p53

    .line 53
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Z:Z

    move/from16 v1, p54

    .line 54
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a0:Z

    move/from16 v1, p55

    .line 55
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    move-object/from16 v1, p56

    .line 56
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    move-object/from16 v1, p57

    .line 57
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    move/from16 v1, p58

    .line 58
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    move-object/from16 v1, p59

    .line 59
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    move/from16 v1, p60

    .line 60
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    move/from16 v1, p61

    .line 61
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    move/from16 v1, p62

    .line 62
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    move/from16 v1, p63

    .line 63
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    move/from16 v1, p64

    .line 64
    iput-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k0:Z

    move-object/from16 v1, p65

    .line 65
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    move/from16 v1, p66

    .line 66
    iput v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;
    .locals 33

    move-object/from16 v0, p0

    move/from16 v1, p67

    move/from16 v2, p68

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a:I

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p3

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p9

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p10

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p11

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p12

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p13

    :goto_b
    move/from16 p1, v3

    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_c

    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v3, p14

    :goto_c
    move/from16 p2, v4

    and-int/lit16 v4, v1, 0x2000

    if-eqz v4, :cond_d

    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v4, p15

    :goto_d
    move-wide/from16 p3, v5

    and-int/lit16 v5, v1, 0x4000

    if-eqz v5, :cond_e

    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v5, p16

    :goto_e
    const v6, 0x8000

    and-int v16, v1, v6

    move/from16 p5, v6

    if-eqz v16, :cond_f

    iget-boolean v6, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    goto :goto_f

    :cond_f
    move/from16 v6, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v17, v1, v16

    if-eqz v17, :cond_10

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->q:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v17, 0x20000

    and-int v18, p67, v17

    move/from16 p18, v1

    if-eqz v18, :cond_11

    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v18, 0x40000

    and-int v19, p67, v18

    move/from16 p19, v1

    if-eqz v19, :cond_12

    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p20

    :goto_12
    const/high16 v19, 0x80000

    and-int v20, p67, v19

    move/from16 p17, v6

    if-eqz v20, :cond_13

    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    goto :goto_13

    :cond_13
    move-object/from16 v6, p21

    :goto_13
    const/high16 v20, 0x100000

    and-int v21, p67, v20

    move-object/from16 p9, v11

    if-eqz v21, :cond_14

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    goto :goto_14

    :cond_14
    move/from16 v11, p22

    :goto_14
    const/high16 v21, 0x200000

    and-int v22, p67, v21

    move/from16 p22, v11

    if-eqz v22, :cond_15

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    goto :goto_15

    :cond_15
    move/from16 v11, p23

    :goto_15
    const/high16 v22, 0x400000

    and-int v23, p67, v22

    move/from16 p23, v11

    if-eqz v23, :cond_16

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    goto :goto_16

    :cond_16
    move/from16 v11, p24

    :goto_16
    const/high16 v23, 0x800000

    and-int v24, p67, v23

    move/from16 p24, v11

    if-eqz v24, :cond_17

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    goto :goto_17

    :cond_17
    move-object/from16 v11, p25

    :goto_17
    const/high16 v24, 0x1000000

    and-int v25, p67, v24

    move-object/from16 p25, v11

    if-eqz v25, :cond_18

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    goto :goto_18

    :cond_18
    move/from16 v11, p26

    :goto_18
    const/high16 v25, 0x2000000

    and-int v26, p67, v25

    move/from16 p26, v11

    if-eqz v26, :cond_19

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    goto :goto_19

    :cond_19
    move/from16 v11, p27

    :goto_19
    const/high16 v26, 0x4000000

    and-int v27, p67, v26

    move/from16 p27, v11

    if-eqz v27, :cond_1a

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    goto :goto_1a

    :cond_1a
    move/from16 v11, p28

    :goto_1a
    const/high16 v27, 0x8000000

    and-int v28, p67, v27

    move/from16 p28, v11

    if-eqz v28, :cond_1b

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    goto :goto_1b

    :cond_1b
    move/from16 v11, p29

    :goto_1b
    const/high16 v28, 0x10000000

    and-int v29, p67, v28

    move/from16 p29, v11

    if-eqz v29, :cond_1c

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    goto :goto_1c

    :cond_1c
    move/from16 v11, p30

    :goto_1c
    const/high16 v29, 0x20000000

    and-int v30, p67, v29

    move/from16 p30, v11

    if-eqz v30, :cond_1d

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    goto :goto_1d

    :cond_1d
    move-object/from16 v11, p31

    :goto_1d
    const/high16 v30, 0x40000000    # 2.0f

    and-int v31, p67, v30

    move-object/from16 p31, v11

    if-eqz v31, :cond_1e

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    goto :goto_1e

    :cond_1e
    move-object/from16 v11, p32

    :goto_1e
    const/high16 v31, -0x80000000

    and-int v32, p67, v31

    move-object/from16 p32, v11

    if-eqz v32, :cond_1f

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    goto :goto_1f

    :cond_1f
    move-object/from16 v11, p33

    :goto_1f
    and-int/lit8 v32, v2, 0x1

    move-object/from16 p33, v11

    if-eqz v32, :cond_20

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    goto :goto_20

    :cond_20
    move-object/from16 v11, p34

    :goto_20
    and-int/lit8 v32, v2, 0x2

    move-object/from16 p34, v11

    if-eqz v32, :cond_21

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    goto :goto_21

    :cond_21
    move-object/from16 v11, p35

    :goto_21
    and-int/lit8 v32, v2, 0x4

    move-object/from16 p35, v11

    if-eqz v32, :cond_22

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    goto :goto_22

    :cond_22
    move-object/from16 v11, p36

    :goto_22
    and-int/lit8 v32, v2, 0x8

    move-object/from16 p36, v11

    if-eqz v32, :cond_23

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    goto :goto_23

    :cond_23
    move-object/from16 v11, p37

    :goto_23
    and-int/lit8 v32, v2, 0x10

    move-object/from16 p37, v11

    if-eqz v32, :cond_24

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    goto :goto_24

    :cond_24
    move/from16 v11, p38

    :goto_24
    and-int/lit8 v32, v2, 0x20

    move/from16 p38, v11

    if-eqz v32, :cond_25

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    goto :goto_25

    :cond_25
    move/from16 v11, p39

    :goto_25
    and-int/lit8 v32, v2, 0x40

    move/from16 p39, v11

    if-eqz v32, :cond_26

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    goto :goto_26

    :cond_26
    move/from16 v11, p40

    :goto_26
    move/from16 p40, v11

    and-int/lit16 v11, v2, 0x80

    if-eqz v11, :cond_27

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    goto :goto_27

    :cond_27
    move-object/from16 v11, p41

    :goto_27
    move-object/from16 p41, v11

    and-int/lit16 v11, v2, 0x100

    if-eqz v11, :cond_28

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->O:Z

    goto :goto_28

    :cond_28
    move/from16 v11, p42

    :goto_28
    move/from16 p42, v11

    and-int/lit16 v11, v2, 0x200

    if-eqz v11, :cond_29

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    goto :goto_29

    :cond_29
    move/from16 v11, p43

    :goto_29
    move/from16 p43, v11

    and-int/lit16 v11, v2, 0x400

    if-eqz v11, :cond_2a

    iget v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    goto :goto_2a

    :cond_2a
    move/from16 v11, p44

    :goto_2a
    move/from16 p44, v11

    and-int/lit16 v11, v2, 0x800

    if-eqz v11, :cond_2b

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    goto :goto_2b

    :cond_2b
    move-object/from16 v11, p45

    :goto_2b
    move-object/from16 p45, v11

    and-int/lit16 v11, v2, 0x1000

    if-eqz v11, :cond_2c

    iget v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    goto :goto_2c

    :cond_2c
    move/from16 v11, p46

    :goto_2c
    move/from16 p46, v11

    and-int/lit16 v11, v2, 0x2000

    if-eqz v11, :cond_2d

    iget-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    goto :goto_2d

    :cond_2d
    move/from16 v11, p47

    :goto_2d
    move/from16 p47, v11

    and-int/lit16 v11, v2, 0x4000

    if-eqz v11, :cond_2e

    iget-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    goto :goto_2e

    :cond_2e
    move-object/from16 v11, p48

    :goto_2e
    and-int v32, v2, p5

    if-eqz v32, :cond_2f

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    goto :goto_2f

    :cond_2f
    move-object/from16 v2, p49

    :goto_2f
    and-int v16, p68, v16

    move-object/from16 p49, v2

    if-eqz v16, :cond_30

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    goto :goto_30

    :cond_30
    move-object/from16 v2, p50

    :goto_30
    and-int v16, p68, v17

    move-object/from16 p50, v2

    if-eqz v16, :cond_31

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    goto :goto_31

    :cond_31
    move-object/from16 v2, p51

    :goto_31
    and-int v16, p68, v18

    move-object/from16 p51, v2

    if-eqz v16, :cond_32

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    goto :goto_32

    :cond_32
    move/from16 v2, p52

    :goto_32
    and-int v16, p68, v19

    move/from16 p52, v2

    if-eqz v16, :cond_33

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Z:Z

    goto :goto_33

    :cond_33
    move/from16 v2, p53

    :goto_33
    and-int v16, p68, v20

    move/from16 p53, v2

    if-eqz v16, :cond_34

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a0:Z

    goto :goto_34

    :cond_34
    move/from16 v2, p54

    :goto_34
    and-int v16, p68, v21

    move/from16 p54, v2

    if-eqz v16, :cond_35

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    goto :goto_35

    :cond_35
    move/from16 v2, p55

    :goto_35
    and-int v16, p68, v22

    move/from16 p55, v2

    if-eqz v16, :cond_36

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    goto :goto_36

    :cond_36
    move-object/from16 v2, p56

    :goto_36
    and-int v16, p68, v23

    move-object/from16 p56, v2

    if-eqz v16, :cond_37

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    goto :goto_37

    :cond_37
    move-object/from16 v2, p57

    :goto_37
    and-int v16, p68, v24

    move-object/from16 p57, v2

    if-eqz v16, :cond_38

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    goto :goto_38

    :cond_38
    move/from16 v2, p58

    :goto_38
    and-int v16, p68, v25

    move/from16 p58, v2

    if-eqz v16, :cond_39

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    goto :goto_39

    :cond_39
    move-object/from16 v2, p59

    :goto_39
    and-int v16, p68, v26

    move-object/from16 p59, v2

    if-eqz v16, :cond_3a

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    goto :goto_3a

    :cond_3a
    move/from16 v2, p60

    :goto_3a
    and-int v16, p68, v27

    move/from16 p60, v2

    if-eqz v16, :cond_3b

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    goto :goto_3b

    :cond_3b
    move/from16 v2, p61

    :goto_3b
    and-int v16, p68, v28

    move/from16 p61, v2

    if-eqz v16, :cond_3c

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    goto :goto_3c

    :cond_3c
    move/from16 v2, p62

    :goto_3c
    and-int v16, p68, v29

    move/from16 p62, v2

    if-eqz v16, :cond_3d

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    goto :goto_3d

    :cond_3d
    move/from16 v2, p63

    :goto_3d
    and-int v16, p68, v30

    move/from16 p63, v2

    if-eqz v16, :cond_3e

    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k0:Z

    goto :goto_3e

    :cond_3e
    move/from16 v2, p64

    :goto_3e
    and-int v16, p68, v31

    move/from16 p64, v2

    if-eqz v16, :cond_3f

    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    goto :goto_3f

    :cond_3f
    move-object/from16 v2, p65

    :goto_3f
    and-int/lit8 v16, p69, 0x1

    move-object/from16 p65, v2

    if-eqz v16, :cond_40

    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    goto :goto_40

    :cond_40
    move/from16 v2, p66

    :goto_40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string v0, "entryMode"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reviewPracticeSessionId"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reviewPracticeRoundId"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reviewPracticeScene"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subject"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examName"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stemShoot"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editStems"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editAnswers"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editTags"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerResult"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedTab"

    move-object/from16 p20, v1

    move-object/from16 v1, p31

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerEntries"

    move-object/from16 v1, p32

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navItems"

    move-object/from16 v1, p45

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinCollections"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectionIds"

    move-object/from16 v1, p49

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalJoinCollectionIds"

    move-object/from16 v1, p50

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedJoinCollectionIds"

    move-object/from16 v1, p51

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    move-object/from16 p0, v0

    move/from16 p66, v2

    move-object/from16 p14, v3

    move-object/from16 p15, v4

    move-object/from16 p16, v5

    move-object/from16 p21, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p48, v11

    move-object/from16 p10, v12

    move-object/from16 p11, v13

    move-object/from16 p12, v14

    move-object/from16 p13, v15

    invoke-direct/range {p0 .. p66}, Lcom/zykj/mistake/feature/notebook/detail/m3;-><init>(IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/List;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;I)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/zykj/mistake/feature/notebook/detail/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    iget-wide v5, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->q:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->q:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->O:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->O:Z

    if-eq v1, v3, :cond_2a

    return v2

    :cond_2a
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    return v2

    :cond_33
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Z:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->Z:Z

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->a0:Z

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    return v2

    :cond_38
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    return v2

    :cond_39
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    if-eq v1, v3, :cond_3a

    return v2

    :cond_3a
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    if-eq v1, v3, :cond_3e

    return v2

    :cond_3e
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    if-eq v1, v3, :cond_3f

    return v2

    :cond_3f
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k0:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->k0:Z

    if-eq v1, v3, :cond_40

    return v2

    :cond_40
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    return v2

    :cond_41
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    iget p1, p1, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    if-eq v1, p1, :cond_42

    return v2

    :cond_42
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    .line 2
    .line 3
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a:I

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
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, v1, v0}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

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
    const/4 v0, 0x0

    .line 51
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 52
    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    move v3, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_0
    add-int/2addr v2, v3

    .line 62
    mul-int/2addr v2, v1

    .line 63
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v2, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v2, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    .line 106
    .line 107
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->q:Z

    .line 112
    .line 113
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    .line 118
    .line 119
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    .line 124
    .line 125
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    add-int/2addr v3, v2

    .line 136
    mul-int/2addr v3, v1

    .line 137
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    .line 138
    .line 139
    invoke-static {v2, v3, v1}, Landroidx/collection/a;->i(ZII)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    .line 144
    .line 145
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    .line 150
    .line 151
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    .line 156
    .line 157
    if-nez v3, :cond_1

    .line 158
    .line 159
    move v3, v0

    .line 160
    goto :goto_1

    .line 161
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    :goto_1
    add-int/2addr v2, v3

    .line 166
    mul-int/2addr v2, v1

    .line 167
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    .line 168
    .line 169
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    .line 174
    .line 175
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    .line 180
    .line 181
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    .line 186
    .line 187
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    .line 192
    .line 193
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    add-int/2addr v3, v2

    .line 204
    mul-int/2addr v3, v1

    .line 205
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    .line 206
    .line 207
    invoke-static {v2, v3, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 212
    .line 213
    if-nez v3, :cond_2

    .line 214
    .line 215
    move v3, v0

    .line 216
    goto :goto_2

    .line 217
    :cond_2
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/notebook/detail/p0;->hashCode()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    :goto_2
    add-int/2addr v2, v3

    .line 222
    mul-int/2addr v2, v1

    .line 223
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 224
    .line 225
    if-nez v3, :cond_3

    .line 226
    .line 227
    move v3, v0

    .line 228
    goto :goto_3

    .line 229
    :cond_3
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/notebook/detail/p0;->hashCode()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    :goto_3
    add-int/2addr v2, v3

    .line 234
    mul-int/2addr v2, v1

    .line 235
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    .line 236
    .line 237
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/notebook/detail/n3;->hashCode()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    add-int/2addr v3, v2

    .line 242
    mul-int/2addr v3, v1

    .line 243
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 244
    .line 245
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/k3;->hashCode()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    add-int/2addr v2, v3

    .line 250
    mul-int/2addr v2, v1

    .line 251
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    .line 252
    .line 253
    invoke-virtual {v3}, Lcom/zykj/mistake/feature/notebook/detail/q0;->hashCode()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    add-int/2addr v3, v2

    .line 258
    mul-int/2addr v3, v1

    .line 259
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    .line 260
    .line 261
    invoke-static {v2, v3, v1}, Landroidx/collection/a;->i(ZII)I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    .line 266
    .line 267
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    .line 272
    .line 273
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 278
    .line 279
    if-nez v3, :cond_4

    .line 280
    .line 281
    move v3, v0

    .line 282
    goto :goto_4

    .line 283
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    :goto_4
    add-int/2addr v2, v3

    .line 288
    mul-int/2addr v2, v1

    .line 289
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->O:Z

    .line 290
    .line 291
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    .line 296
    .line 297
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    .line 302
    .line 303
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    .line 308
    .line 309
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    .line 314
    .line 315
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    .line 320
    .line 321
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    .line 326
    .line 327
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    .line 332
    .line 333
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    add-int/2addr v3, v2

    .line 338
    mul-int/2addr v3, v1

    .line 339
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    .line 340
    .line 341
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    add-int/2addr v2, v3

    .line 346
    mul-int/2addr v2, v1

    .line 347
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    add-int/2addr v3, v2

    .line 354
    mul-int/2addr v3, v1

    .line 355
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    .line 356
    .line 357
    invoke-static {v2, v3, v1}, Landroidx/collection/a;->i(ZII)I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Z:Z

    .line 362
    .line 363
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a0:Z

    .line 368
    .line 369
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    .line 374
    .line 375
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    .line 380
    .line 381
    invoke-static {v2, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {v2, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    .line 392
    .line 393
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    .line 398
    .line 399
    if-nez v3, :cond_5

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    :goto_5
    add-int/2addr v2, v0

    .line 407
    mul-int/2addr v2, v1

    .line 408
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    .line 409
    .line 410
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    .line 415
    .line 416
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    .line 421
    .line 422
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    .line 427
    .line 428
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k0:Z

    .line 433
    .line 434
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 439
    .line 440
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/l3;->hashCode()I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    add-int/2addr v2, v0

    .line 445
    mul-int/2addr v2, v1

    .line 446
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    .line 447
    .line 448
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    add-int/2addr v0, v2

    .line 453
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", itemId="

    .line 2
    .line 3
    const-string v1, ", topicId="

    .line 4
    .line 5
    const-string v2, "State(bookId="

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a:I

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", entryMode="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", reviewPracticeSessionId="

    .line 31
    .line 32
    const-string v2, ", reviewPracticeRoundId="

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v1, ", reviewPracticeScene="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", reviewPracticePoolType="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", subject="

    .line 62
    .line 63
    const-string v2, ", examName="

    .line 64
    .line 65
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", title="

    .line 73
    .line 74
    const-string v2, ", stemShoot="

    .line 75
    .line 76
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v1, ", editStems="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", editAnswers="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->n:Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", editTags="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->o:Ljava/util/List;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", isCustomMistake="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->p:Z

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", isRelatedQstGroup="

    .line 124
    .line 125
    const-string v2, ", showMoreMenu="

    .line 126
    .line 127
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->q:Z

    .line 128
    .line 129
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    .line 130
    .line 131
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 132
    .line 133
    .line 134
    const-string v1, ", tags="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", answerResult="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->t:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", hasPendingAnswerResult="

    .line 155
    .line 156
    const-string v2, ", hasPracticeResultChanged="

    .line 157
    .line 158
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    .line 159
    .line 160
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    .line 161
    .line 162
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 163
    .line 164
    .line 165
    const-string v1, ", hasNotebookListChanged="

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v1, ", removedItemId="

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v1, ", removedItemIsMastered="

    .line 186
    .line 187
    const-string v2, ", isPracticeMode="

    .line 188
    .line 189
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    .line 190
    .line 191
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    .line 192
    .line 193
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 194
    .line 195
    .line 196
    const-string v1, ", answerRevealed="

    .line 197
    .line 198
    const-string v2, ", showNavButtons="

    .line 199
    .line 200
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->A:Z

    .line 201
    .line 202
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->B:Z

    .line 203
    .line 204
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 205
    .line 206
    .line 207
    const-string v1, ", isShowAnswer="

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->C:Z

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v1, ", selectedTab="

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->D:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v1, ", answerEntries="

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->E:Ljava/util/List;

    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v1, ", originalMicroLesson="

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->F:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v1, ", revisedMicroLesson="

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->G:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v1, ", supplement="

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->H:Lcom/zykj/mistake/feature/notebook/detail/n3;

    .line 263
    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v1, ", note="

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v1, ", boardSketchParams="

    .line 278
    .line 279
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v1, ", isDetailLoaded="

    .line 288
    .line 289
    const-string v2, ", draftExpanded="

    .line 290
    .line 291
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    .line 292
    .line 293
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    .line 294
    .line 295
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 296
    .line 297
    .line 298
    const-string v1, ", isDraftSaving="

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->M:Z

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string v1, ", pendingDraftNavigation="

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v1, ", skipNextResumeRefresh="

    .line 319
    .line 320
    const-string v2, ", skipNextRouteInit="

    .line 321
    .line 322
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->O:Z

    .line 323
    .line 324
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->P:Z

    .line 325
    .line 326
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 327
    .line 328
    .line 329
    const-string v1, ", draftRestoreVersion="

    .line 330
    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    .line 335
    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v1, ", navItems="

    .line 340
    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    .line 345
    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    const-string v1, ", navIndex="

    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    .line 355
    .line 356
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    const-string v1, ", showJoinCollectionDialog="

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    .line 365
    .line 366
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    const-string v1, ", joinCollections="

    .line 370
    .line 371
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    .line 375
    .line 376
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string v1, ", collectionIds="

    .line 380
    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->V:Ljava/util/Set;

    .line 385
    .line 386
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    const-string v1, ", originalJoinCollectionIds="

    .line 390
    .line 391
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    .line 395
    .line 396
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string v1, ", selectedJoinCollectionIds="

    .line 400
    .line 401
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    const-string v1, ", isJoiningCollection="

    .line 410
    .line 411
    const-string v2, ", isInReviewState="

    .line 412
    .line 413
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    .line 414
    .line 415
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Z:Z

    .line 416
    .line 417
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 418
    .line 419
    .line 420
    const-string v1, ", isJoiningReview="

    .line 421
    .line 422
    const-string v2, ", showCreateCollectionDialog="

    .line 423
    .line 424
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->a0:Z

    .line 425
    .line 426
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    .line 427
    .line 428
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 429
    .line 430
    .line 431
    const-string v1, ", createCollectionName="

    .line 432
    .line 433
    const-string v2, ", createCollectionNameError="

    .line 434
    .line 435
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    .line 436
    .line 437
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    .line 438
    .line 439
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    const-string v1, ", isCreatingCollection="

    .line 443
    .line 444
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    .line 448
    .line 449
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v1, ", createCollectionEntry="

    .line 453
    .line 454
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;

    .line 458
    .line 459
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    const-string v1, ", showCollectionLimitDialog="

    .line 463
    .line 464
    const-string v2, ", showReviewRoundCompleteDialog="

    .line 465
    .line 466
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    .line 467
    .line 468
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    .line 469
    .line 470
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 471
    .line 472
    .line 473
    const-string v1, ", showReviewExitDialog="

    .line 474
    .line 475
    const-string v2, ", showReviewFinishedDialog="

    .line 476
    .line 477
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    .line 478
    .line 479
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    .line 480
    .line 481
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 482
    .line 483
    .line 484
    const-string v1, ", isEndingReviewPractice="

    .line 485
    .line 486
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->k0:Z

    .line 490
    .line 491
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    const-string v1, ", reviewPracticeSummary="

    .line 495
    .line 496
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 500
    .line 501
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    const-string v1, ", reviewPracticeRoundCount="

    .line 505
    .line 506
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    .line 510
    .line 511
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v1, ")"

    .line 515
    .line 516
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    return-object v0
.end method
