.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->U(Ljava/lang/String;)V
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
    c = "com.friday.paint.viewmodel.NewNoteViewModel$repairMissingImagesByPageDir$1"
    f = "NewNoteViewModel.kt"
    l = {
        0x1b3,
        0x1b4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->f:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->d:I

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
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_3

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :try_start_2
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/FileDao;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput v3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->d:I

    .line 53
    .line 54
    invoke-interface {p1, v1, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    if-nez p1, :cond_4

    .line 64
    .line 65
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_4
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->e:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 69
    .line 70
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->i(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lj2/d;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->f:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iput-object v4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput v2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->d:I

    .line 83
    .line 84
    invoke-interface {v1, p1, v3, p0}, Lj2/d;->f(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 88
    if-ne p1, v0, :cond_5

    .line 89
    .line 90
    :goto_1
    return-object v0

    .line 91
    :goto_2
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;->f:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v2, "\u9875\u9762NewNoteViewModel.kt -> \u6062\u590d\u7f3a\u5931\u56fe\u7247\u5931\u8d25\uff0cpageDir="

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, ": "

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 130
    .line 131
    return-object p1
.end method
