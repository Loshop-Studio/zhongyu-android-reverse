.class final Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ManualSyncViewModel;->n(Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$2$2"
    f = "ManualSyncViewModel.kt"
    l = {
        0x3b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

.field public final synthetic e:Lcom/friday/document/model/ManualSyncEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lcom/friday/document/model/ManualSyncEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->e:Lcom/friday/document/model/ManualSyncEntity;

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
    new-instance p1, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->e:Lcom/friday/document/model/ManualSyncEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;-><init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lcom/friday/document/model/ManualSyncEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->c:I

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
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_1
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->k()Lcom/friday/document/service/FileManager;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->e:Lcom/friday/document/model/ManualSyncEntity;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/friday/document/model/ManualSyncEntity;->getFileEntity()Lcom/friday/common/entity/FileEntity;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput v2, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->c:I

    .line 42
    .line 43
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/service/FileManager;->G(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->e:Lcom/friday/document/model/ManualSyncEntity;

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    invoke-virtual {p1, v0}, Lcom/friday/document/model/ManualSyncEntity;->setSyncState(I)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->e(Lcom/friday/document/viewmodel/ManualSyncViewModel;)Lvd/l;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_3
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Ljava/lang/Object;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v0, v1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->e:Lcom/friday/document/model/ManualSyncEntity;

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-virtual {v0, v1}, Lcom/friday/document/model/ManualSyncEntity;->setSyncState(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$2$2;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 85
    .line 86
    invoke-static {v0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->e(Lcom/friday/document/viewmodel/ManualSyncViewModel;)Lvd/l;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_4
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, Ljava/lang/Object;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 106
    .line 107
    .line 108
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 109
    .line 110
    return-object p1
.end method
