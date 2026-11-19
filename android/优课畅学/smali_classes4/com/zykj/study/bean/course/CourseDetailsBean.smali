.class public Lcom/zykj/study/bean/course/CourseDetailsBean;
.super Lcom/zykj/study/bean/course/CourseSimpleBean;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private catalogs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation
.end field

.field private courseName:Ljava/lang/String;

.field private isBindTeach:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "isSupervised"
    .end annotation
.end field

.field private isLearning:Z

.field private isTutoring:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "isSuperviser"
    .end annotation
.end field

.field private learnTime:Ljava/util/Date;

.field private progress:Ljava/lang/Integer;

.field private students:Ljava/lang/Integer;

.field private superviseId:I

.field private userAvatar:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;ZLjava/util/List;ZZLcom/zykj/study/bean/course/CourseType;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "IIIZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Z",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;ZZ",
            "Lcom/zykj/study/bean/course/CourseType;",
            ")V"
        }
    .end annotation

    const-string v0, "status"

    move-object/from16 v1, p26

    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move/from16 v8, p11

    move-object/from16 v9, p12

    move/from16 v10, p13

    move-object/from16 v11, p14

    move/from16 v12, p15

    move/from16 v13, p16

    move/from16 v14, p17

    move/from16 v15, p22

    move-object/from16 v16, v1

    move/from16 v1, p1

    .line 3
    invoke-direct/range {v0 .. v16}, Lcom/zykj/study/bean/course/CourseSimpleBean;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIZLcom/zykj/study/bean/course/CourseType;)V

    move/from16 v1, p2

    .line 4
    iput v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->superviseId:I

    move-object/from16 v1, p4

    .line 5
    iput-object v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->userAvatar:Ljava/lang/String;

    move-object/from16 v1, p8

    .line 6
    iput-object v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->courseName:Ljava/lang/String;

    move/from16 v1, p18

    .line 7
    iput-boolean v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning:Z

    move-object/from16 v1, p19

    .line 8
    iput-object v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->progress:Ljava/lang/Integer;

    move-object/from16 v1, p20

    .line 9
    iput-object v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->students:Ljava/lang/Integer;

    move-object/from16 v1, p21

    .line 10
    iput-object v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->learnTime:Ljava/util/Date;

    move-object/from16 v1, p23

    .line 11
    iput-object v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->catalogs:Ljava/util/List;

    move/from16 v1, p24

    .line 12
    iput-boolean v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach:Z

    move/from16 v1, p25

    .line 13
    iput-boolean v1, v0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring:Z

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;ZLjava/util/List;ZZLcom/zykj/study/bean/course/CourseType;ILkotlin/jvm/internal/n;)V
    .locals 32

    move/from16 v0, p27

    const/4 v1, 0x0

    .line 1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    and-int/lit8 v3, v0, 0x4

    .line 2
    const-string v4, ""

    if-eqz v3, :cond_0

    move-object v8, v4

    goto :goto_0

    :cond_0
    move-object/from16 v8, p3

    :goto_0
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_1

    move-object v9, v4

    goto :goto_1

    :cond_1
    move-object/from16 v9, p4

    :goto_1
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_2

    move-object v10, v4

    goto :goto_2

    :cond_2
    move-object/from16 v10, p5

    :goto_2
    and-int/lit8 v3, v0, 0x20

    if-eqz v3, :cond_3

    move-object v11, v4

    goto :goto_3

    :cond_3
    move-object/from16 v11, p6

    :goto_3
    and-int/lit8 v3, v0, 0x40

    if-eqz v3, :cond_4

    move-object v12, v4

    goto :goto_4

    :cond_4
    move-object/from16 v12, p7

    :goto_4
    and-int/lit16 v3, v0, 0x80

    if-eqz v3, :cond_5

    move-object v13, v4

    goto :goto_5

    :cond_5
    move-object/from16 v13, p8

    :goto_5
    and-int/lit16 v3, v0, 0x100

    if-eqz v3, :cond_6

    move-object v14, v4

    goto :goto_6

    :cond_6
    move-object/from16 v14, p9

    :goto_6
    and-int/lit16 v3, v0, 0x200

    if-eqz v3, :cond_7

    move-object v15, v4

    goto :goto_7

    :cond_7
    move-object/from16 v15, p10

    :goto_7
    and-int/lit16 v3, v0, 0x400

    if-eqz v3, :cond_8

    move/from16 v16, v1

    goto :goto_8

    :cond_8
    move/from16 v16, p11

    :goto_8
    and-int/lit16 v3, v0, 0x800

    if-eqz v3, :cond_9

    move-object/from16 v17, v4

    goto :goto_9

    :cond_9
    move-object/from16 v17, p12

    :goto_9
    and-int/lit16 v3, v0, 0x1000

    if-eqz v3, :cond_a

    move/from16 v18, v1

    goto :goto_a

    :cond_a
    move/from16 v18, p13

    :goto_a
    and-int/lit16 v3, v0, 0x2000

    if-eqz v3, :cond_b

    move-object/from16 v19, v4

    goto :goto_b

    :cond_b
    move-object/from16 v19, p14

    :goto_b
    and-int/lit16 v3, v0, 0x4000

    if-eqz v3, :cond_c

    move/from16 v20, v1

    goto :goto_c

    :cond_c
    move/from16 v20, p15

    :goto_c
    const v3, 0x8000

    and-int/2addr v3, v0

    if-eqz v3, :cond_d

    move/from16 v21, v1

    goto :goto_d

    :cond_d
    move/from16 v21, p16

    :goto_d
    const/high16 v3, 0x10000

    and-int/2addr v3, v0

    if-eqz v3, :cond_e

    move/from16 v22, v1

    goto :goto_e

    :cond_e
    move/from16 v22, p17

    :goto_e
    const/high16 v3, 0x20000

    and-int/2addr v3, v0

    if-eqz v3, :cond_f

    move/from16 v23, v1

    goto :goto_f

    :cond_f
    move/from16 v23, p18

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v24, v2

    goto :goto_10

    :cond_10
    move-object/from16 v24, p19

    :goto_10
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v25, v2

    goto :goto_11

    :cond_11
    move-object/from16 v25, p20

    :goto_11
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    const/4 v1, 0x0

    move-object/from16 v26, v1

    goto :goto_12

    :cond_12
    move-object/from16 v26, p21

    :goto_12
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    const/4 v2, 0x1

    if-eqz v1, :cond_13

    move/from16 v27, v2

    goto :goto_13

    :cond_13
    move/from16 v27, p22

    :goto_13
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    move/from16 v29, v2

    goto :goto_14

    :cond_14
    move/from16 v29, p24

    :goto_14
    const/high16 v1, 0x1000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_15

    move/from16 v30, v2

    :goto_15
    move-object/from16 v5, p0

    move/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v28, p23

    move-object/from16 v31, p26

    goto :goto_16

    :cond_15
    move/from16 v30, p25

    goto :goto_15

    :goto_16
    invoke-direct/range {v5 .. v31}, Lcom/zykj/study/bean/course/CourseDetailsBean;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;ZLjava/util/List;ZZLcom/zykj/study/bean/course/CourseType;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;

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
    invoke-super {p0, p1}, Lcom/zykj/study/bean/course/CourseSimpleBean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    return v2

    .line 18
    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->superviseId:I

    .line 19
    .line 20
    check-cast p1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 21
    .line 22
    iget v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->superviseId:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->userAvatar:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->userAvatar:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->courseName:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->courseName:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning:Z

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->progress:Ljava/lang/Integer;

    .line 57
    .line 58
    iget-object v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->progress:Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->students:Ljava/lang/Integer;

    .line 68
    .line 69
    iget-object v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->students:Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->learnTime:Ljava/util/Date;

    .line 79
    .line 80
    iget-object v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->learnTime:Ljava/util/Date;

    .line 81
    .line 82
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->catalogs:Ljava/util/List;

    .line 90
    .line 91
    iget-object v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->catalogs:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach:Z

    .line 101
    .line 102
    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach:Z

    .line 103
    .line 104
    if-eq v1, v3, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring:Z

    .line 108
    .line 109
    iget-boolean p1, p1, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring:Z

    .line 110
    .line 111
    if-eq v1, p1, :cond_c

    .line 112
    .line 113
    return v2

    .line 114
    :cond_c
    return v0
.end method

.method public final getCatalogs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->catalogs:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCourseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->courseName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLearnTime()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->learnTime:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProgress()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->progress:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStudents()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->students:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuperviseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->superviseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUserAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->userAvatar:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/study/bean/course/CourseSimpleBean;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->superviseId:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    mul-int/lit8 v0, v0, 0x1f

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->userAvatar:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    add-int/2addr v0, v1

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->courseName:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v2

    .line 36
    :goto_1
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning:Z

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v0, v1

    .line 46
    mul-int/lit8 v0, v0, 0x1f

    .line 47
    .line 48
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->progress:Ljava/lang/Integer;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move v1, v2

    .line 58
    :goto_2
    add-int/2addr v0, v1

    .line 59
    mul-int/lit8 v0, v0, 0x1f

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->students:Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v1, v2

    .line 71
    :goto_3
    add-int/2addr v0, v1

    .line 72
    mul-int/lit8 v0, v0, 0x1f

    .line 73
    .line 74
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->learnTime:Ljava/util/Date;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    move v1, v2

    .line 84
    :goto_4
    add-int/2addr v0, v1

    .line 85
    mul-int/lit8 v0, v0, 0x1f

    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->catalogs:Ljava/util/List;

    .line 88
    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :cond_5
    add-int/2addr v0, v2

    .line 96
    mul-int/lit8 v0, v0, 0x1f

    .line 97
    .line 98
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach:Z

    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    add-int/2addr v0, v1

    .line 105
    mul-int/lit8 v0, v0, 0x1f

    .line 106
    .line 107
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring:Z

    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    add-int/2addr v0, v1

    .line 114
    return v0
.end method

.method public final isBindTeach()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLearning()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isTutoring()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setBindTeach(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setCatalogs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->catalogs:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setCourseName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->courseName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setLearnTime(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->learnTime:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setLearning(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setProgress(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->progress:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setStudents(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->students:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setSuperviseId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->superviseId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTutoring(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setUserAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/course/CourseDetailsBean;->userAvatar:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
