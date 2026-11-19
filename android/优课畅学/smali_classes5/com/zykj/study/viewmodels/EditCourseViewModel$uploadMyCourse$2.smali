.class final Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/EditCourseViewModel;->p(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.viewmodels.EditCourseViewModel$uploadMyCourse$2"
    f = "EditCourseViewModel.kt"
    l = {
        0x52,
        0x54
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/data/MyCourseEntity;

.field public final synthetic c:Lcom/zykj/study/viewmodels/EditCourseViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/data/MyCourseEntity;Lcom/zykj/study/viewmodels/EditCourseViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->c:Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->c:Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;-><init>(Lcom/zykj/study/data/MyCourseEntity;Lcom/zykj/study/viewmodels/EditCourseViewModel;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->a:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_4

    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->c:Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->g()Lcom/zykj/study/repository/CourseRepository;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 49
    .line 50
    iput v3, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->a:I

    .line 51
    .line 52
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/CourseRepository;->e(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->c:Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->g()Lcom/zykj/study/repository/CourseRepository;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 73
    .line 74
    iput v2, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;->a:I

    .line 75
    .line 76
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/CourseRepository;->A(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_5

    .line 81
    .line 82
    :goto_1
    return-object v0

    .line 83
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    :goto_3
    invoke-static {p1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
.end method
