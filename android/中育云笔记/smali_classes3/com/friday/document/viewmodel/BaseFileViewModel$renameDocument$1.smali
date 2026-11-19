.class final Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel;->r0(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$renameDocument$1"
    f = "BaseFileViewModel.kt"
    l = {
        0x19a,
        0x19d,
        0x1a2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/friday/document/viewmodel/BaseFileViewModel;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->i:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->j:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->k:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->i:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->j:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->k:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->h:I

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
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v10, p0

    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 59
    .line 60
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v10, p0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->i:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->j:Ljava/lang/String;

    .line 79
    .line 80
    iput v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->h:I

    .line 81
    .line 82
    invoke-interface {p1, v1, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_4

    .line 87
    .line 88
    move-object v10, p0

    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_4
    :goto_0
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 92
    .line 93
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 94
    .line 95
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 96
    .line 97
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 98
    .line 99
    invoke-direct {v1, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 100
    .line 101
    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    iget-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->i:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 105
    .line 106
    iget-object v6, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->j:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v7, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->k:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-instance v4, Ljava/util/Date;

    .line 115
    .line 116
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    const-string v4, "format(...)"

    .line 124
    .line 125
    invoke-static {v9, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iput-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->c:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iput-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->d:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->e:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    iput-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->f:Ljava/lang/Object;

    .line 147
    .line 148
    const/4 v4, 0x0

    .line 149
    iput v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->g:I

    .line 150
    .line 151
    iput v3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->h:I

    .line 152
    .line 153
    const/4 v8, 0x1

    .line 154
    move-object v10, p0

    .line 155
    invoke-interface/range {v5 .. v10}, Lcom/friday/common/dao/FileDao;->a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    if-ne v3, v0, :cond_5

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    move-object v3, p1

    .line 163
    :goto_1
    move-object p1, v3

    .line 164
    goto :goto_2

    .line 165
    :cond_6
    move-object v10, p0

    .line 166
    :goto_2
    iget-object v3, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->i:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 167
    .line 168
    invoke-virtual {v3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->T()Landroidx/lifecycle/MutableLiveData;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget-object v4, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->i:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 173
    .line 174
    invoke-virtual {v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    iget-object v5, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->j:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iput-object p1, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->c:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->d:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v3, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->e:Ljava/lang/Object;

    .line 193
    .line 194
    const/4 p1, 0x0

    .line 195
    iput-object p1, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->f:Ljava/lang/Object;

    .line 196
    .line 197
    iput v2, v10, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;->h:I

    .line 198
    .line 199
    invoke-interface {v4, v5, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-ne p1, v0, :cond_7

    .line 204
    .line 205
    :goto_3
    return-object v0

    .line 206
    :cond_7
    move-object v0, v3

    .line 207
    :goto_4
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 211
    .line 212
    return-object p1
.end method
