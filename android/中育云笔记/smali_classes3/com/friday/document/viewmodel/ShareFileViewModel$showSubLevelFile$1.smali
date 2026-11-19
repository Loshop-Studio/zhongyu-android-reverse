.class final Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareFileViewModel;->P(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/l;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareFileViewModel$showSubLevelFile$1"
    f = "ShareFileViewModel.kt"
    l = {
        0xe4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ShareFileViewModel;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->e:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->f:J

    .line 6
    .line 7
    iput-object p5, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->g:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->h:Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->f:J

    .line 8
    .line 9
    iget-object v5, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->g:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->h:Ljava/lang/String;

    .line 12
    .line 13
    move-object v7, p1

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->c:I

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
    move-object v8, p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->u(Lcom/friday/document/viewmodel/ShareFileViewModel;)Lvd/l;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->p()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p1, v1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->d:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->t(Lcom/friday/document/viewmodel/ShareFileViewModel;)Ls2/b;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v4, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-wide v5, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->f:J

    .line 60
    .line 61
    iput v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->c:I

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    move-object v8, p0

    .line 65
    invoke-interface/range {v3 .. v8}, Ls2/b;->d(Ljava/lang/String;JZLvc/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    :goto_0
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/friday/document/model/StudentShareEntity;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/friday/document/model/StudentShareEntity;->getShareFileList()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    move-object v0, p1

    .line 91
    check-cast v0, Ljava/lang/Iterable;

    .line 92
    .line 93
    iget-object v1, v8, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->g:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v2, v8, Lcom/friday/document/viewmodel/ShareFileViewModel$showSubLevelFile$1;->h:Ljava/lang/String;

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_3

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Lcom/friday/document/model/ShareFile;

    .line 112
    .line 113
    invoke-virtual {v3, v1}, Lcom/friday/document/model/ShareFile;->setShareTime(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v2}, Lcom/friday/document/model/ShareFile;->setOwnerName(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    check-cast p1, Ljava/util/Collection;

    .line 121
    .line 122
    invoke-static {p1}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    return-object p1
.end method
