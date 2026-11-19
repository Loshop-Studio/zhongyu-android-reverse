.class final Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->y(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$downloadFile$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x1cc,
        0x1cf,
        0x1d1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/viewmodel/BaseFileViewModel;

.field public final synthetic f:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

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
    :goto_0
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lcom/friday/common/property/BaseResponse;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->G()Ls2/a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->d:I

    .line 56
    .line 57
    invoke-interface {p1, v1, p0}, Ls2/a;->b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_4

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_4
    :goto_1
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/friday/common/entity/GetResourceEntity;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/friday/common/entity/GetResourceEntity;->getResourceList()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v5, "\u9875\u9762BaseFleViewModel\uff0c\u9700\u8981\u4e0b\u8f7d\u7684\u6587\u4ef6\u6709"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lcom/friday/common/entity/GetResourceEntity;

    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/friday/common/entity/GetResourceEntity;->getResourceList()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/util/Collection;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_5

    .line 128
    .line 129
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 130
    .line 131
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->N()Lcom/friday/document/service/FileManager;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, Lcom/friday/common/entity/GetResourceEntity;

    .line 140
    .line 141
    invoke-virtual {v2}, Lcom/friday/common/entity/GetResourceEntity;->getResourceList()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 146
    .line 147
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->d:I

    .line 154
    .line 155
    invoke-virtual {v1, v2, v4, p0}, Lcom/friday/document/service/FileManager;->a(Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-ne p1, v0, :cond_6

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->N()Lcom/friday/document/service/FileManager;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 169
    .line 170
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->c:Ljava/lang/Object;

    .line 175
    .line 176
    iput v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->d:I

    .line 177
    .line 178
    invoke-virtual {v1, v3, p0}, Lcom/friday/document/service/FileManager;->c(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v0, :cond_6

    .line 183
    .line 184
    :goto_2
    return-object v0

    .line 185
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 186
    .line 187
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v1, "\u9875\u9762BaseFileViewModel.kt -> \u51c6\u5907\u6267\u884c postValue, id="

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->e:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->e0()Landroidx/lifecycle/MutableLiveData;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;->f:Lcom/friday/common/entity/FileEntity;

    .line 222
    .line 223
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 227
    .line 228
    return-object p1
.end method
