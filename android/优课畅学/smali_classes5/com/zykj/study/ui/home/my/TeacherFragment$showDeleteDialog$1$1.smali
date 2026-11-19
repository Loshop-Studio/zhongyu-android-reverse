.class final Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/TeacherFragment;->y(Lcom/zykj/study/bean/course/CourseDetailsBean;)V
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
    c = "com.zykj.study.ui.home.my.TeacherFragment$showDeleteDialog$1$1"
    f = "TeacherFragment.kt"
    l = {
        0x55
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/TeacherFragment;

.field public final synthetic c:Lcom/zykj/study/bean/course/CourseDetailsBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->c:Lcom/zykj/study/bean/course/CourseDetailsBean;

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
    new-instance p1, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->c:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->n(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->c:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;->a(Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->m(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    const-string p1, "myCourseAdapter"

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    :cond_3
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 74
    .line 75
    sget v1, Lcom/zykj/study/R$string;->course_remove_success:I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v1, "getString(...)"

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 90
    .line 91
    return-object p1
.end method
