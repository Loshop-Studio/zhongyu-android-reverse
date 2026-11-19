.class final Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NoteViewModel;->P(Ljava/io/File;)V
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
    c = "com.friday.paint.viewmodel.NoteViewModel$saveThumbnail$1"
    f = "NoteViewModel.kt"
    l = {
        0xa7,
        0xab,
        0xac
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Ljava/io/File;

.field public final synthetic g:Lcom/friday/paint/viewmodel/NoteViewModel;


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->g:Lcom/friday/paint/viewmodel/NoteViewModel;

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
    new-instance p1, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->g:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;-><init>(Ljava/io/File;Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const-string v4, "getAbsolutePath(...)"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Lcom/friday/common/entity/ResourceEntity;

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v9, p0

    .line 53
    :goto_0
    move-object v7, v1

    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v9, p0

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v1, "thumbnail.jpg"

    .line 79
    .line 80
    invoke-static {v1, p1, v5}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->g:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-static {v7, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput v5, p0, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->e:I

    .line 102
    .line 103
    const-wide/16 v8, 0x0

    .line 104
    .line 105
    const/4 v11, 0x2

    .line 106
    const/4 v12, 0x0

    .line 107
    move-object v10, p0

    .line 108
    invoke-static/range {v6 .. v12}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    move-object v9, v10

    .line 113
    if-ne p1, v0, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    :goto_1
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    .line 117
    .line 118
    iget-object v1, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 119
    .line 120
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-eqz p1, :cond_6

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v1, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_6

    .line 135
    .line 136
    iget-object v5, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->g:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 137
    .line 138
    invoke-static {v5}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    iget-object v6, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v6, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    iput-object v7, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->c:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v1, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->d:Ljava/lang/Object;

    .line 158
    .line 159
    iput v3, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->e:I

    .line 160
    .line 161
    invoke-interface {v5, v6, p0}, Lcom/friday/common/dao/ResourceDao;->D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-ne v3, v0, :cond_5

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_5
    move-object v3, p1

    .line 169
    goto :goto_0

    .line 170
    :goto_2
    iget-object p1, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->g:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    iget-object p1, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->f:Ljava/io/File;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-static {v6, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iput-object p1, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->c:Ljava/lang/Object;

    .line 193
    .line 194
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p1, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->d:Ljava/lang/Object;

    .line 199
    .line 200
    iput v2, v9, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;->e:I

    .line 201
    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v10, 0x4

    .line 204
    const/4 v11, 0x0

    .line 205
    invoke-static/range {v5 .. v11}, Lcom/friday/common/dao/ResourceDao;->z(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-ne p1, v0, :cond_6

    .line 210
    .line 211
    :goto_3
    return-object v0

    .line 212
    :cond_6
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 213
    .line 214
    return-object p1
.end method
