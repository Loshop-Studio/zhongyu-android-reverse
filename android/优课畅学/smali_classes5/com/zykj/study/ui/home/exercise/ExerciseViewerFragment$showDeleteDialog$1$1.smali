.class final Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->Y(ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;)V
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
    c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$showDeleteDialog$1$1"
    f = "ExerciseViewerFragment.kt"
    l = {
        0xc9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/study/bean/exercise/MicroBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->c:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->e:Lcom/zykj/study/bean/exercise/MicroBean;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->e:Lcom/zykj/study/bean/exercise/MicroBean;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->x(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->c:I

    .line 34
    .line 35
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->e:Lcom/zykj/study/bean/exercise/MicroBean;

    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/zykj/study/bean/exercise/MicroBean;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    iput v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->a:I

    .line 44
    .line 45
    invoke-virtual {p1, v1, v3, v4, p0}, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;->r(ILjava/lang/String;ILm7/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const-string v0, "getString(...)"

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 67
    .line 68
    sget v2, Lcom/zykj/study/R$string;->delete_exercise_success:I

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->A(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$showDeleteDialog$1$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 89
    .line 90
    sget v2, Lcom/zykj/study/R$string;->delete_exercise_fail:I

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 103
    .line 104
    return-object p1
.end method
