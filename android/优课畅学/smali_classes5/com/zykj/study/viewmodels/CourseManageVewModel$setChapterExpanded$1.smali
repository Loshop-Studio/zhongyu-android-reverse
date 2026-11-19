.class final Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseManageVewModel;->i(JZ)V
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
    c = "com.zykj.study.viewmodels.CourseManageVewModel$setChapterExpanded$1"
    f = "CourseManageVewModel.kt"
    l = {
        0x58,
        0x60
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

.field public final synthetic d:Z

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;ZJLm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->d:Z

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->e:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->d:Z

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->e:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;-><init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;ZJLm7/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->d(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/util/List;

    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->d:Z

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-wide v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->e:J

    .line 52
    .line 53
    invoke-static {v1, v2}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 64
    .line 65
    invoke-static {v1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->d(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {p1}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-wide v4, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->e:J

    .line 74
    .line 75
    invoke-static {v4, v5}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->a:Ljava/lang/Object;

    .line 87
    .line 88
    iput v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->b:I

    .line 89
    .line 90
    invoke-interface {v1, v2, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    iget-wide v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->e:J

    .line 98
    .line 99
    invoke-static {v3, v4}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->c:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 110
    .line 111
    invoke-static {v1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->d(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {p1}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-wide v4, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->e:J

    .line 120
    .line 121
    invoke-static {v4, v5}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->a:Ljava/lang/Object;

    .line 133
    .line 134
    iput v2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1;->b:I

    .line 135
    .line 136
    invoke-interface {v1, v3, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne p1, v0, :cond_4

    .line 141
    .line 142
    :goto_1
    return-object v0

    .line 143
    :cond_4
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 144
    .line 145
    return-object p1
.end method
