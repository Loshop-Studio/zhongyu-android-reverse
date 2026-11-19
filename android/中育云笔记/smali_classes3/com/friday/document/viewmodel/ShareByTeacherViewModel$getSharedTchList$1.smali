.class final Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->i(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareByTeacherViewModel$getSharedTchList$1"
    f = "ShareByTeacherViewModel.kt"
    l = {
        0x1f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Z

.field public final synthetic e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;


# direct methods
.method public constructor <init>(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->d:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->d:Z

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;-><init>(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->c:I

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
    iget-boolean p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->d:Z

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->g(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lvd/l;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->f(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Ls2/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput v2, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->c:I

    .line 51
    .line 52
    invoke-interface {p1, p0}, Ls2/b;->e(Lvc/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_3
    :goto_0
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lcom/friday/document/model/TchListEntity;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/friday/document/model/TchListEntity;->getTeachers()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->h(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lvd/l;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel$getSharedTchList$1;->e:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 88
    .line 89
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->h(Lcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lvd/l;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {p1, v0}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 101
    .line 102
    return-object p1
.end method
