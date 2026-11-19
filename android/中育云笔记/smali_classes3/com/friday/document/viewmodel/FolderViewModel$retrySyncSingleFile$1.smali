.class final Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/FolderViewModel;->O0(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.document.viewmodel.FolderViewModel$retrySyncSingleFile$1"
    f = "FolderViewModel.kt"
    l = {
        0xd2,
        0xd4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/friday/document/viewmodel/FolderViewModel;

.field public final synthetic i:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/FolderViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->h:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->i:Lcom/friday/common/entity/FileEntity;

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
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->h:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->i:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;-><init>(Lcom/friday/document/viewmodel/FolderViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->g:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->f:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lqc/q;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lsd/i0;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->h:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->i:Lcom/friday/common/entity/FileEntity;

    .line 55
    .line 56
    :try_start_1
    sget-object v6, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 57
    .line 58
    const-string v6, "\u5355\u4e2a\u540c\u6b65\u5f00\u59cb"

    .line 59
    .line 60
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->N()Lcom/friday/document/service/FileManager;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->g:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 90
    .line 91
    iput v3, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->e:I

    .line 92
    .line 93
    iput v5, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->f:I

    .line 94
    .line 95
    invoke-virtual {v6, v2, v7, v8, p0}, Lcom/friday/document/service/FileManager;->I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v1, :cond_3

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 103
    .line 104
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    goto :goto_2

    .line 109
    :goto_1
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :goto_2
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->h:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/Result;->k(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    move-object v5, p1

    .line 128
    check-cast v5, Lqc/q;

    .line 129
    .line 130
    invoke-static {v2}, Lcom/friday/document/viewmodel/FolderViewModel;->F0(Lcom/friday/document/viewmodel/FolderViewModel;)Lvd/k;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    sget-object v6, Lqc/q;->a:Lqc/q;

    .line 135
    .line 136
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->g:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    iput v3, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->e:I

    .line 151
    .line 152
    iput v4, p0, Lcom/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1;->f:I

    .line 153
    .line 154
    invoke-interface {v2, v6, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-ne v0, v1, :cond_4

    .line 159
    .line 160
    :goto_3
    return-object v1

    .line 161
    :cond_4
    move-object v0, p1

    .line 162
    :goto_4
    move-object p1, v0

    .line 163
    :cond_5
    invoke-static {p1}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_6

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v2, "\u5355\u4e2a\u540c\u6b65\u5931\u8d25: "

    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    :cond_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 209
    .line 210
    return-object p1
.end method
