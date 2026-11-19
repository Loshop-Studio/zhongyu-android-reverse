.class public final Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ll8/d;


# direct methods
.method public constructor <init>(Ll8/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2;->a:Ll8/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->b:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->b:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ll8/d;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2;->a:Ll8/d;

    .line 62
    .line 63
    move-object v2, p1

    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move-object v5, v4

    .line 81
    check-cast v5, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 82
    .line 83
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getId()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    const-wide/16 v7, 0x0

    .line 94
    .line 95
    cmp-long v5, v5, v7

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const/4 v4, 0x0

    .line 101
    :goto_1
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iput-object v2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iput-object v2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-static {p2}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 124
    .line 125
    const/4 p1, 0x0

    .line 126
    iput p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->h:I

    .line 127
    .line 128
    iput v3, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2$1;->b:I

    .line 129
    .line 130
    invoke-interface {p2, v4, v0}, Ll8/d;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v1, :cond_5

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_5
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 138
    .line 139
    return-object p1
.end method
