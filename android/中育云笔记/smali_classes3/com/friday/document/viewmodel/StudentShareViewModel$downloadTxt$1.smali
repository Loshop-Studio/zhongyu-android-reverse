.class final Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/StudentShareViewModel;->u(Lcom/friday/document/model/ShareFile;)V
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
    c = "com.friday.document.viewmodel.StudentShareViewModel$downloadTxt$1"
    f = "StudentShareViewModel.kt"
    l = {
        0xc9,
        0xd0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/StudentShareViewModel;

.field public final synthetic e:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->d:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->e:Lcom/friday/document/model/ShareFile;

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
    new-instance p1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->d:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->e:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->c:I

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
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;

    .line 39
    .line 40
    iget-object v4, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->e:Lcom/friday/document/model/ShareFile;

    .line 41
    .line 42
    iget-object v5, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->d:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-direct {v1, v4, v5, v6}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1$1;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V

    .line 46
    .line 47
    .line 48
    iput v3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->c:I

    .line 49
    .line 50
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->d:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->k(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lc2/g2;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v3, Lcom/friday/common/entity/ShareCacheEntity;

    .line 64
    .line 65
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    const-string v1, "get32UUID(...)"

    .line 70
    .line 71
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->e:Lcom/friday/document/model/ShareFile;

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->e:Lcom/friday/document/model/ShareFile;

    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getVersion()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->d:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 87
    .line 88
    invoke-static {v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->n(Lcom/friday/document/viewmodel/StudentShareViewModel;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v7

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    invoke-direct/range {v3 .. v10}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 97
    .line 98
    .line 99
    iput v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->c:I

    .line 100
    .line 101
    invoke-interface {p1, v3, p0}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v0, :cond_4

    .line 106
    .line 107
    :goto_1
    return-object v0

    .line 108
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->d:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;->e:Lcom/friday/document/model/ShareFile;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 120
    .line 121
    return-object p1
.end method
