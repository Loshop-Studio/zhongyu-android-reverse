.class final Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBaseViewModel;->x(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.ShareBaseViewModel$downloadTxt$2"
    f = "ShareBaseViewModel.kt"
    l = {
        0x9a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/model/ShareFile;

.field public final synthetic e:Lcom/friday/document/viewmodel/ShareBaseViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->d:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->d:Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->c:I

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
    sget-object p1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->d:Lcom/friday/document/model/ShareFile;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->j(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->d:Lcom/friday/document/model/ShareFile;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p1, ".txt"

    .line 63
    .line 64
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const/4 v7, 0x4

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-static/range {v3 .. v8}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 78
    .line 79
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->i(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Lc2/g2;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v3, Lcom/friday/common/entity/ShareCacheEntity;

    .line 84
    .line 85
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const-string v1, "get32UUID(...)"

    .line 90
    .line 91
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->d:Lcom/friday/document/model/ShareFile;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->d:Lcom/friday/document/model/ShareFile;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getVersion()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 107
    .line 108
    invoke-static {v1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->m(Lcom/friday/document/viewmodel/ShareBaseViewModel;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    invoke-direct/range {v3 .. v10}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 117
    .line 118
    .line 119
    iput v2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;->c:I

    .line 120
    .line 121
    invoke-interface {p1, v3, p0}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v0, :cond_2

    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 129
    .line 130
    return-object p1
.end method
