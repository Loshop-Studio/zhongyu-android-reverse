.class final Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseManageVewModel;->h(J)V
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
    c = "com.zykj.study.viewmodels.CourseManageVewModel$initData$1"
    f = "CourseManageVewModel.kt"
    l = {
        0x4c,
        0x4d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/study/viewmodels/CourseManageVewModel;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;JLm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->d:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->e:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->d:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->e:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;-><init>(Lcom/zykj/study/viewmodels/CourseManageVewModel;JLm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->c:I

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
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->d:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 39
    .line 40
    iget-wide v4, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->e:J

    .line 41
    .line 42
    invoke-static {p1, v4, v5}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->e(Lcom/zykj/study/viewmodels/CourseManageVewModel;J)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->d:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->a(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Lo4/b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-wide v4, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->e:J

    .line 52
    .line 53
    iput v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->c:I

    .line 54
    .line 55
    invoke-interface {p1, v4, v5, p0}, Lo4/b;->a(JLm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->d:Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 63
    .line 64
    check-cast p1, Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;->c(Lcom/zykj/study/viewmodels/CourseManageVewModel;)Ll8/h;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iput-object v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->a:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    iput v3, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->b:I

    .line 78
    .line 79
    iput v2, p0, Lcom/zykj/study/viewmodels/CourseManageVewModel$initData$1;->c:I

    .line 80
    .line 81
    invoke-interface {v1, p1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_4

    .line 86
    .line 87
    :goto_1
    return-object v0

    .line 88
    :cond_4
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 89
    .line 90
    return-object p1
.end method
