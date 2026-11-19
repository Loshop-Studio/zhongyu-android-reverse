.class final Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->v(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$getTitleList$1"
    f = "ExerciseStatisticsViewModel.kt"
    l = {
        0xd4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;IILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->c:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->d:I

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->e:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->c:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->d:I

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->e:I

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;IILm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->b:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v2, p1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 36
    .line 37
    const/16 v14, 0x76

    .line 38
    .line 39
    const/4 v15, 0x0

    .line 40
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    const-wide/16 v7, 0x0

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x1

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    invoke-direct/range {v4 .. v15}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;-><init>(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->c:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->q()Lcom/zykj/study/repository/TeachCourseRepository;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v5, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->d:I

    .line 59
    .line 60
    iget v6, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->e:I

    .line 61
    .line 62
    iput-object v4, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->b:I

    .line 65
    .line 66
    invoke-virtual {v2, v5, v6, v0}, Lcom/zykj/study/repository/TeachCourseRepository;->j(IILm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-ne v2, v1, :cond_2

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    move-object v1, v4

    .line 74
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v2}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-interface {v2, v3, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;->c:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 85
    .line 86
    invoke-static {v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->a(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;)Ll8/h;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v1, v2}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 94
    .line 95
    return-object v1
.end method
