.class final Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/SearchViewModel;->m(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.main.viewmodel.SearchViewModel$downloadMicroClass$1"
    f = "SearchViewModel.kt"
    l = {
        0xaa,
        0xab
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/main/viewmodel/SearchViewModel;

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->f:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->d:I

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
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/main/viewmodel/SearchViewModel;

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
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/friday/main/viewmodel/SearchViewModel;->g(Lcom/friday/main/viewmodel/SearchViewModel;)Lj2/d;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 45
    .line 46
    iput v3, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->d:I

    .line 47
    .line 48
    invoke-interface {p1, v1, p0}, Lj2/d;->d(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->e:Lcom/friday/main/viewmodel/SearchViewModel;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/friday/main/viewmodel/SearchViewModel;->f(Lcom/friday/main/viewmodel/SearchViewModel;)Lcom/friday/common/dao/FileDao;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v3, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->c:Ljava/lang/Object;

    .line 68
    .line 69
    iput v2, p0, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;->d:I

    .line 70
    .line 71
    invoke-interface {v1, v3, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-ne v1, v0, :cond_4

    .line 76
    .line 77
    :goto_1
    return-object v0

    .line 78
    :cond_4
    move-object v0, p1

    .line 79
    move-object p1, v1

    .line 80
    :goto_2
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lcom/friday/main/viewmodel/SearchViewModel;->w(Lcom/friday/common/entity/FileEntity;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 86
    .line 87
    return-object p1
.end method
