.class final Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBaseViewModel;->u(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.ShareBaseViewModel$downloadCover$2"
    f = "ShareBaseViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ShareBaseViewModel;

.field public final synthetic e:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->d:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

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
    new-instance p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->d:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->d:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->j(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, ".jpg"

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getOwnerId()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    iget-object v3, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getCreateTime()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-string v3, " "

    .line 56
    .line 57
    filled-new-array {v3}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const/4 v8, 0x6

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-static/range {v4 .. v9}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    move-object v4, v3

    .line 74
    check-cast v4, Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    const/4 v8, 0x4

    .line 79
    const/4 v9, 0x0

    .line 80
    const-string v5, "-"

    .line 81
    .line 82
    const-string v6, ""

    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    invoke-static/range {v4 .. v9}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    :cond_0
    iget-object v3, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

    .line 89
    .line 90
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getMicroClassCoverUrl()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 95
    .line 96
    invoke-virtual {v4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget-object v5, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;->e:Lcom/friday/document/model/ShareFile;

    .line 101
    .line 102
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->n()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-instance v8, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v6, "/"

    .line 123
    .line 124
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v4, p1}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    sget-object v1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 154
    .line 155
    invoke-virtual {v1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1, v3, v0, p1}, Lcom/friday/common/helper/d;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 163
    .line 164
    return-object p1

    .line 165
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 168
    .line 169
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1
.end method
