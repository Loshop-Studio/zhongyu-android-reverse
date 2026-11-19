.class final Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->l(Z)V
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
    c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$fetchFileList$1"
    f = "PickNoteViewModel.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;ZLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->e:Z

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
    new-instance p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->e:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;ZLvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :try_start_1
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->i(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lpa/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput v3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->c:I

    .line 38
    .line 39
    invoke-interface {p1, p0}, Lpa/a;->a(Lvc/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_b

    .line 53
    .line 54
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/friday/common/entity/FileBean;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/friday/common/entity/FileBean;->getNoteList()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/Iterable;

    .line 70
    .line 71
    iget-boolean v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->e:Z

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_a

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Lcom/friday/common/entity/NoteBean;

    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getParentId()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v0, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    const-string v5, "0"

    .line 98
    .line 99
    const-string v6, "11"

    .line 100
    .line 101
    if-nez v4, :cond_7

    .line 102
    .line 103
    :try_start_2
    new-instance v4, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v7, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_4

    .line 119
    .line 120
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-static {v6, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_6

    .line 129
    .line 130
    :cond_4
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-static {v5}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_2
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getParentId()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    if-eqz v1, :cond_9

    .line 150
    .line 151
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v4, :cond_8

    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_3

    .line 170
    .line 171
    :cond_8
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getParentId()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    check-cast v4, Ljava/util/List;

    .line 180
    .line 181
    if-eqz v4, :cond_3

    .line 182
    .line 183
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_9
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getParentId()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Ljava/util/List;

    .line 200
    .line 201
    if-eqz v4, :cond_3

    .line 202
    .line 203
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :cond_a
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_b
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 233
    .line 234
    .line 235
    iget-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;->d:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 245
    .line 246
    return-object p1
.end method
