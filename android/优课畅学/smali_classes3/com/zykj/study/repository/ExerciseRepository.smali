.class public final Lcom/zykj/study/repository/ExerciseRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo4/b;

.field public final b:Lo4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo4/b;Lo4/d;)V
    .locals 1

    .line 1
    const-string v0, "courseApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "api"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/repository/ExerciseRepository;->a:Lo4/b;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->h:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->h:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->f:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->h:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 72
    .line 73
    new-instance v5, Lcom/zykj/study/bean/exercise/MicroAddInput;

    .line 74
    .line 75
    move v6, p1

    .line 76
    move-object v7, p2

    .line 77
    move-object v8, p3

    .line 78
    move-object v9, p4

    .line 79
    move-object/from16 v10, p5

    .line 80
    .line 81
    invoke-direct/range {v5 .. v10}, Lcom/zykj/study/bean/exercise/MicroAddInput;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput-object p2, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->b:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {p3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {p4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->d:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static/range {p5 .. p5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p2, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iput p1, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->a:I

    .line 109
    .line 110
    iput v4, v1, Lcom/zykj/study/repository/ExerciseRepository$addMicro$1;->h:I

    .line 111
    .line 112
    invoke-interface {v0, v5, v1}, Lo4/d;->l(Lcom/zykj/study/bean/exercise/MicroAddInput;Lm7/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v2, :cond_3

    .line 117
    .line 118
    return-object v2

    .line 119
    :cond_3
    :goto_1
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method

.method public final b(IIIJLm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;

    .line 4
    .line 5
    move v2, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    move-wide v5, p4

    .line 9
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;-><init>(IIIJ)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, p6}, Lo4/d;->k(Lcom/zykj/study/bean/exercise/CompleteExerciseInput;Lm7/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final c(ILjava/lang/String;ILm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/exercise/MicroDeleteInput;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3}, Lcom/zykj/study/bean/exercise/MicroDeleteInput;-><init>(ILjava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p4}, Lo4/d;->j(Lcom/zykj/study/bean/exercise/MicroDeleteInput;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p1
.end method

.method public final d(IIILm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/exercise/ExerciseInput;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3}, Lcom/zykj/study/bean/exercise/ExerciseInput;-><init>(III)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p4}, Lo4/d;->h(Lcom/zykj/study/bean/exercise/ExerciseInput;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final e(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/d;->f(IILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final f(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/d;->e(IILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final g(ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->a:Lo4/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lo4/b;->l(ILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final h(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/d;->a(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final i(IILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lo4/d;->c(IILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final j(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lo4/d;->b(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final k(IIILm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/exercise/ExerciseInput;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3}, Lcom/zykj/study/bean/exercise/ExerciseInput;-><init>(III)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p4}, Lo4/d;->g(Lcom/zykj/study/bean/exercise/ExerciseInput;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final l(JILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->h:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->h:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->f:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->h:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 64
    .line 65
    new-instance v5, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;

    .line 66
    .line 67
    move-wide v6, p1

    .line 68
    move v8, p3

    .line 69
    move-object/from16 v9, p4

    .line 70
    .line 71
    move/from16 v10, p5

    .line 72
    .line 73
    move-object/from16 v11, p6

    .line 74
    .line 75
    invoke-direct/range {v5 .. v11}, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;-><init>(JILjava/lang/String;ZLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static/range {p4 .. p4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->c:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static/range {p6 .. p6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iput-object v3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->d:Ljava/lang/Object;

    .line 89
    .line 90
    iput-wide p1, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->a:J

    .line 91
    .line 92
    iput p3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->b:I

    .line 93
    .line 94
    iput-boolean v10, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->e:Z

    .line 95
    .line 96
    iput v4, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerMicroResult$1;->h:I

    .line 97
    .line 98
    invoke-interface {v0, v5, v1}, Lo4/d;->d(Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;Lm7/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v2, :cond_3

    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_3
    :goto_1
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1
.end method

.method public final m(JILjava/lang/String;ZLjava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->h:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->h:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->f:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->h:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/study/repository/ExerciseRepository;->b:Lo4/d;

    .line 64
    .line 65
    new-instance v5, Lcom/zykj/study/bean/exercise/AnswerResultInput;

    .line 66
    .line 67
    move-wide v6, p1

    .line 68
    move v8, p3

    .line 69
    move-object/from16 v9, p4

    .line 70
    .line 71
    move/from16 v10, p5

    .line 72
    .line 73
    move-object/from16 v11, p6

    .line 74
    .line 75
    invoke-direct/range {v5 .. v11}, Lcom/zykj/study/bean/exercise/AnswerResultInput;-><init>(JILjava/lang/String;ZLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static/range {p4 .. p4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->c:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static/range {p6 .. p6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iput-object v3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->d:Ljava/lang/Object;

    .line 89
    .line 90
    iput-wide p1, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->a:J

    .line 91
    .line 92
    iput p3, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->b:I

    .line 93
    .line 94
    iput-boolean v10, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->e:Z

    .line 95
    .line 96
    iput v4, v1, Lcom/zykj/study/repository/ExerciseRepository$updateAnswerResult$1;->h:I

    .line 97
    .line 98
    invoke-interface {v0, v5, v1}, Lo4/d;->i(Lcom/zykj/study/bean/exercise/AnswerResultInput;Lm7/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v2, :cond_3

    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_3
    :goto_1
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1
.end method
