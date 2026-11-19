.class public final Lu4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final Companion:Lu4/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final s:[Ld6/e;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/util/List;

.field public final l:Ljava/lang/String;

.field public final m:I

.field public final n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

.field public final r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lu4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu4/g;->Companion:Lu4/f;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, Lcom/zykj/view/board/play/b;

    .line 11
    .line 12
    const/16 v2, 0x1b

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lcom/zykj/view/board/play/b;

    .line 22
    .line 23
    const/16 v3, 0x1c

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Lcom/zykj/view/board/play/b;

    .line 33
    .line 34
    const/16 v4, 0x1d

    .line 35
    .line 36
    invoke-direct {v3, v4}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v3}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, Lu4/d;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct {v4, v5}, Lu4/d;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v4}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v4, 0x12

    .line 54
    .line 55
    new-array v4, v4, [Ld6/e;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    aput-object v6, v4, v5

    .line 59
    .line 60
    const/4 v5, 0x1

    .line 61
    aput-object v6, v4, v5

    .line 62
    .line 63
    const/4 v5, 0x2

    .line 64
    aput-object v6, v4, v5

    .line 65
    .line 66
    const/4 v5, 0x3

    .line 67
    aput-object v6, v4, v5

    .line 68
    .line 69
    const/4 v5, 0x4

    .line 70
    aput-object v6, v4, v5

    .line 71
    .line 72
    const/4 v5, 0x5

    .line 73
    aput-object v6, v4, v5

    .line 74
    .line 75
    const/4 v5, 0x6

    .line 76
    aput-object v6, v4, v5

    .line 77
    .line 78
    const/4 v5, 0x7

    .line 79
    aput-object v6, v4, v5

    .line 80
    .line 81
    const/16 v5, 0x8

    .line 82
    .line 83
    aput-object v6, v4, v5

    .line 84
    .line 85
    const/16 v5, 0x9

    .line 86
    .line 87
    aput-object v6, v4, v5

    .line 88
    .line 89
    const/16 v5, 0xa

    .line 90
    .line 91
    aput-object v1, v4, v5

    .line 92
    .line 93
    const/16 v1, 0xb

    .line 94
    .line 95
    aput-object v6, v4, v1

    .line 96
    .line 97
    const/16 v1, 0xc

    .line 98
    .line 99
    aput-object v6, v4, v1

    .line 100
    .line 101
    const/16 v1, 0xd

    .line 102
    .line 103
    aput-object v2, v4, v1

    .line 104
    .line 105
    const/16 v1, 0xe

    .line 106
    .line 107
    aput-object v6, v4, v1

    .line 108
    .line 109
    const/16 v1, 0xf

    .line 110
    .line 111
    aput-object v6, v4, v1

    .line 112
    .line 113
    const/16 v1, 0x10

    .line 114
    .line 115
    aput-object v3, v4, v1

    .line 116
    .line 117
    const/16 v1, 0x11

    .line 118
    .line 119
    aput-object v0, v4, v1

    .line 120
    .line 121
    sput-object v4, Lu4/g;->s:[Ld6/e;

    .line 122
    .line 123
    return-void
.end method

.method public constructor <init>(IIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/lang/String;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput v1, p0, Lu4/g;->a:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lu4/g;->a:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput v1, p0, Lu4/g;->b:I

    goto :goto_1

    :cond_1
    iput p3, p0, Lu4/g;->b:I

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lu4/g;->c:J

    goto :goto_2

    :cond_2
    iput-wide p4, p0, Lu4/g;->c:J

    :goto_2
    and-int/lit8 p2, p1, 0x8

    const-string p3, ""

    if-nez p2, :cond_3

    iput-object p3, p0, Lu4/g;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p6, p0, Lu4/g;->d:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lu4/g;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p7, p0, Lu4/g;->e:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lu4/g;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p8, p0, Lu4/g;->f:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lu4/g;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p9, p0, Lu4/g;->g:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    const/4 p2, 0x1

    iput-boolean p2, p0, Lu4/g;->h:Z

    goto :goto_7

    :cond_7
    iput-boolean p10, p0, Lu4/g;->h:Z

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-boolean v1, p0, Lu4/g;->i:Z

    goto :goto_8

    :cond_8
    iput-boolean p11, p0, Lu4/g;->i:Z

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-boolean v1, p0, Lu4/g;->j:Z

    goto :goto_9

    :cond_9
    iput-boolean p12, p0, Lu4/g;->j:Z

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    .line 2
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 3
    iput-object p2, p0, Lu4/g;->k:Ljava/util/List;

    goto :goto_a

    :cond_a
    iput-object p13, p0, Lu4/g;->k:Ljava/util/List;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object p3, p0, Lu4/g;->l:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 p2, p14

    iput-object p2, p0, Lu4/g;->l:Ljava/lang/String;

    :goto_b
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput v1, p0, Lu4/g;->m:I

    goto :goto_c

    :cond_c
    move/from16 p2, p15

    iput p2, p0, Lu4/g;->m:I

    :goto_c
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    .line 4
    sget-object p2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->NORMAL:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 5
    :goto_d
    iput-object p2, p0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    goto :goto_e

    :cond_d
    move-object/from16 p2, p16

    goto :goto_d

    :goto_e
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object p3, p0, Lu4/g;->o:Ljava/lang/String;

    goto :goto_f

    :cond_e
    move-object/from16 p2, p17

    iput-object p2, p0, Lu4/g;->o:Ljava/lang/String;

    :goto_f
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object p3, p0, Lu4/g;->p:Ljava/lang/String;

    goto :goto_10

    :cond_f
    move-object/from16 p2, p18

    iput-object p2, p0, Lu4/g;->p:Ljava/lang/String;

    :goto_10
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_10

    .line 6
    sget-object p2, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->RECOMMEND:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 7
    :goto_11
    iput-object p2, p0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    goto :goto_12

    :cond_10
    move-object/from16 p2, p19

    goto :goto_11

    :goto_12
    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_11

    const/4 p1, 0x0

    :goto_13
    iput-object p1, p0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    return-void

    :cond_11
    move-object/from16 p1, p20

    goto :goto_13
.end method

.method public constructor <init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;I)V
    .locals 23

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    const-wide/16 v6, 0x0

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    .line 8
    const-string v16, ""

    if-eqz v1, :cond_3

    move-object/from16 v8, v16

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object/from16 v9, v16

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object/from16 v10, v16

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move-object/from16 v11, v16

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    move v12, v1

    goto :goto_7

    :cond_7
    move/from16 v12, p9

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move v13, v2

    goto :goto_8

    :cond_8
    move/from16 v13, p10

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move v14, v2

    goto :goto_9

    :cond_9
    move/from16 v14, p11

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    .line 9
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v15, v1

    goto :goto_a

    :cond_a
    move-object/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_b

    move/from16 v17, v2

    goto :goto_b

    :cond_b
    move/from16 v17, p13

    :goto_b
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_c

    .line 10
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->NORMAL:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    move-object/from16 v18, v1

    goto :goto_c

    :cond_c
    move-object/from16 v18, p14

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    .line 11
    sget-object v1, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->RECOMMEND:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    move-object/from16 v21, v1

    goto :goto_d

    :cond_d
    move-object/from16 v21, p15

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    move-object/from16 v22, v0

    goto :goto_e

    :cond_e
    move-object/from16 v22, p16

    :goto_e
    move-object/from16 v19, v16

    move-object/from16 v20, v16

    move-object/from16 v3, p0

    .line 12
    invoke-direct/range {v3 .. v22}, Lu4/g;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/lang/String;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/lang/String;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V
    .locals 4

    move-object/from16 v0, p12

    move-object/from16 v1, p15

    move-object/from16 v2, p18

    const-string v3, "subject"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "examName"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "title"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "stemShoot"

    invoke-static {p8, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "tags"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "entryMode"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "reviewPracticeScene"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Lu4/g;->a:I

    .line 15
    iput p2, p0, Lu4/g;->b:I

    .line 16
    iput-wide p3, p0, Lu4/g;->c:J

    .line 17
    iput-object p5, p0, Lu4/g;->d:Ljava/lang/String;

    .line 18
    iput-object p6, p0, Lu4/g;->e:Ljava/lang/String;

    .line 19
    iput-object p7, p0, Lu4/g;->f:Ljava/lang/String;

    .line 20
    iput-object p8, p0, Lu4/g;->g:Ljava/lang/String;

    .line 21
    iput-boolean p9, p0, Lu4/g;->h:Z

    .line 22
    iput-boolean p10, p0, Lu4/g;->i:Z

    move p1, p11

    .line 23
    iput-boolean p1, p0, Lu4/g;->j:Z

    .line 24
    iput-object v0, p0, Lu4/g;->k:Ljava/util/List;

    move-object/from16 p1, p13

    .line 25
    iput-object p1, p0, Lu4/g;->l:Ljava/lang/String;

    move/from16 p1, p14

    .line 26
    iput p1, p0, Lu4/g;->m:I

    .line 27
    iput-object v1, p0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    move-object/from16 p1, p16

    .line 28
    iput-object p1, p0, Lu4/g;->o:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 29
    iput-object p1, p0, Lu4/g;->p:Ljava/lang/String;

    .line 30
    iput-object v2, p0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    move-object/from16 p1, p19

    .line 31
    iput-object p1, p0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    return-void
.end method

.method public static a(Lu4/g;Ljava/lang/String;)Lu4/g;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lu4/g;->a:I

    .line 4
    .line 5
    iget v2, v0, Lu4/g;->b:I

    .line 6
    .line 7
    iget-wide v3, v0, Lu4/g;->c:J

    .line 8
    .line 9
    iget-object v5, v0, Lu4/g;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, v0, Lu4/g;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, v0, Lu4/g;->f:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v8, v0, Lu4/g;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v9, v0, Lu4/g;->h:Z

    .line 18
    .line 19
    iget-boolean v10, v0, Lu4/g;->i:Z

    .line 20
    .line 21
    iget-boolean v11, v0, Lu4/g;->j:Z

    .line 22
    .line 23
    iget-object v12, v0, Lu4/g;->k:Ljava/util/List;

    .line 24
    .line 25
    iget v14, v0, Lu4/g;->m:I

    .line 26
    .line 27
    iget-object v15, v0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 28
    .line 29
    iget-object v13, v0, Lu4/g;->o:Ljava/lang/String;

    .line 30
    .line 31
    move/from16 v16, v1

    .line 32
    .line 33
    iget-object v1, v0, Lu4/g;->p:Ljava/lang/String;

    .line 34
    .line 35
    move/from16 v17, v2

    .line 36
    .line 37
    iget-object v2, v0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 38
    .line 39
    iget-object v0, v0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 40
    .line 41
    move-object/from16 v19, v0

    .line 42
    .line 43
    const-string v0, "subject"

    .line 44
    .line 45
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "examName"

    .line 49
    .line 50
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "title"

    .line 54
    .line 55
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "stemShoot"

    .line 59
    .line 60
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "tags"

    .line 64
    .line 65
    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "entryMode"

    .line 69
    .line 70
    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v0, "reviewPracticeSessionId"

    .line 74
    .line 75
    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "reviewPracticeRoundId"

    .line 79
    .line 80
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "reviewPracticeScene"

    .line 84
    .line 85
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lu4/g;

    .line 89
    .line 90
    move-object/from16 v18, v2

    .line 91
    .line 92
    move/from16 v2, v17

    .line 93
    .line 94
    move-object/from16 v17, v1

    .line 95
    .line 96
    move/from16 v1, v16

    .line 97
    .line 98
    move-object/from16 v16, v13

    .line 99
    .line 100
    move-object/from16 v13, p1

    .line 101
    .line 102
    invoke-direct/range {v0 .. v19}, Lu4/g;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/lang/String;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lu4/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lu4/g;

    .line 12
    .line 13
    iget v1, p0, Lu4/g;->a:I

    .line 14
    .line 15
    iget v3, p1, Lu4/g;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lu4/g;->b:I

    .line 21
    .line 22
    iget v3, p1, Lu4/g;->b:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-wide v3, p0, Lu4/g;->c:J

    .line 28
    .line 29
    iget-wide v5, p1, Lu4/g;->c:J

    .line 30
    .line 31
    cmp-long v1, v3, v5

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    iget-object v1, p0, Lu4/g;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, p1, Lu4/g;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget-object v1, p0, Lu4/g;->e:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p1, Lu4/g;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    iget-object v1, p0, Lu4/g;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p1, Lu4/g;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    iget-object v1, p0, Lu4/g;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v3, p1, Lu4/g;->g:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-boolean v1, p0, Lu4/g;->h:Z

    .line 81
    .line 82
    iget-boolean v3, p1, Lu4/g;->h:Z

    .line 83
    .line 84
    if-eq v1, v3, :cond_9

    .line 85
    .line 86
    return v2

    .line 87
    :cond_9
    iget-boolean v1, p0, Lu4/g;->i:Z

    .line 88
    .line 89
    iget-boolean v3, p1, Lu4/g;->i:Z

    .line 90
    .line 91
    if-eq v1, v3, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    iget-boolean v1, p0, Lu4/g;->j:Z

    .line 95
    .line 96
    iget-boolean v3, p1, Lu4/g;->j:Z

    .line 97
    .line 98
    if-eq v1, v3, :cond_b

    .line 99
    .line 100
    return v2

    .line 101
    :cond_b
    iget-object v1, p0, Lu4/g;->k:Ljava/util/List;

    .line 102
    .line 103
    iget-object v3, p1, Lu4/g;->k:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_c

    .line 110
    .line 111
    return v2

    .line 112
    :cond_c
    iget-object v1, p0, Lu4/g;->l:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lu4/g;->l:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_d

    .line 121
    .line 122
    return v2

    .line 123
    :cond_d
    iget v1, p0, Lu4/g;->m:I

    .line 124
    .line 125
    iget v3, p1, Lu4/g;->m:I

    .line 126
    .line 127
    if-eq v1, v3, :cond_e

    .line 128
    .line 129
    return v2

    .line 130
    :cond_e
    iget-object v1, p0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 131
    .line 132
    iget-object v3, p1, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 133
    .line 134
    if-eq v1, v3, :cond_f

    .line 135
    .line 136
    return v2

    .line 137
    :cond_f
    iget-object v1, p0, Lu4/g;->o:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v3, p1, Lu4/g;->o:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_10

    .line 146
    .line 147
    return v2

    .line 148
    :cond_10
    iget-object v1, p0, Lu4/g;->p:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v3, p1, Lu4/g;->p:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_11

    .line 157
    .line 158
    return v2

    .line 159
    :cond_11
    iget-object v1, p0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 160
    .line 161
    iget-object v3, p1, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 162
    .line 163
    if-eq v1, v3, :cond_12

    .line 164
    .line 165
    return v2

    .line 166
    :cond_12
    iget-object v1, p0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 167
    .line 168
    iget-object p1, p1, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 169
    .line 170
    if-eq v1, p1, :cond_13

    .line 171
    .line 172
    return v2

    .line 173
    :cond_13
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lu4/g;->a:I

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
    iget v2, p0, Lu4/g;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lu4/g;->c:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lu4/g;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lu4/g;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lu4/g;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lu4/g;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lu4/g;->h:Z

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lu4/g;->i:Z

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lu4/g;->j:Z

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lu4/g;->k:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, Lu4/g;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, Lu4/g;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/2addr v2, v0

    .line 89
    mul-int/2addr v2, v1

    .line 90
    iget-object v0, p0, Lu4/g;->o:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v2, v1, v0}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, Lu4/g;->p:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

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
    iget-object v0, p0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 111
    .line 112
    if-nez v0, :cond_0

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    :goto_0
    add-int/2addr v2, v0

    .line 121
    return v2
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
    const-string v2, "MistakeDetailRouteArgs(bookId="

    .line 6
    .line 7
    iget v3, p0, Lu4/g;->a:I

    .line 8
    .line 9
    iget v4, p0, Lu4/g;->b:I

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lu4/g;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", subject="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lu4/g;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", examName="

    .line 31
    .line 32
    const-string v2, ", title="

    .line 33
    .line 34
    iget-object v3, p0, Lu4/g;->e:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, p0, Lu4/g;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v1, ", stemShoot="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lu4/g;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", hasStem="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lu4/g;->h:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", isCustomMistake="

    .line 62
    .line 63
    const-string v2, ", isRelatedQstGroup="

    .line 64
    .line 65
    iget-boolean v3, p0, Lu4/g;->i:Z

    .line 66
    .line 67
    iget-boolean v4, p0, Lu4/g;->j:Z

    .line 68
    .line 69
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", tags="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lu4/g;->k:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", navigationKey="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lu4/g;->l:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", navIndex="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget v1, p0, Lu4/g;->m:I

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", entryMode="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", reviewPracticeSessionId="

    .line 113
    .line 114
    const-string v2, ", reviewPracticeRoundId="

    .line 115
    .line 116
    iget-object v3, p0, Lu4/g;->o:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v4, p0, Lu4/g;->p:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v1, ", reviewPracticeScene="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", reviewPracticePoolType="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ")"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0
.end method
