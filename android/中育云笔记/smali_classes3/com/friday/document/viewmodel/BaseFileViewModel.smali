# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public abstract Lcom/friday/document/viewmodel/BaseFileViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final A:Landroidx/lifecycle/MutableLiveData;

.field public final B:Landroidx/lifecycle/MutableLiveData;

.field public final C:Landroidx/lifecycle/MutableLiveData;

.field public final D:Landroidx/lifecycle/MutableLiveData;

.field public final E:Landroidx/lifecycle/MutableLiveData;

.field public final F:Landroidx/lifecycle/MutableLiveData;

.field public final G:Landroidx/lifecycle/LiveData;

.field public final H:Lvd/l;

.field public final I:Lvd/u;

.field public final J:Landroidx/lifecycle/LiveData;

.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/common/dao/ResourceDao;

.field public final d:Ls2/a;

.field public final e:Lcom/friday/document/service/FileManager;

.field public final f:Ljava/lang/String;

.field public final g:Lqc/d;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/LiveData;

.field public final j:Lvd/k;

.field public final k:Lvd/p;

.field public final l:Lvd/k;

.field public final m:Lvd/p;

.field public final n:Ljava/util/LinkedList;

.field public final o:Lvd/k;

.field public final p:Lvd/p;

.field public final q:Landroidx/lifecycle/MutableLiveData;

.field public final r:Landroidx/lifecycle/LiveData;

.field public final s:Landroidx/lifecycle/MutableLiveData;

.field public final t:Landroidx/lifecycle/MutableLiveData;

.field public final u:Lvd/l;

.field public final v:Lvd/u;

.field public final w:Lvd/k;

.field public final x:Lvd/p;

.field public final y:Landroidx/lifecycle/MutableLiveData;

.field public final z:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V
    .locals 6

    .line 1
    const-string v0, "fileDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resourceDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "documentService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "fileManager"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->d:Ls2/a;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->e:Lcom/friday/document/service/FileManager;

    .line 31
    .line 32
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->l()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->f:Ljava/lang/String;

    .line 43
    .line 44
    new-instance p1, Lz2/b;

    .line 45
    .line 46
    invoke-direct {p1}, Lz2/b;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->g:Lqc/d;

    .line 54
    .line 55
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->i:Landroidx/lifecycle/LiveData;

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    const/4 p2, 0x0

    .line 66
    const/4 p3, 0x7

    .line 67
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->j:Lvd/k;

    .line 72
    .line 73
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->k:Lvd/p;

    .line 74
    .line 75
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->l:Lvd/k;

    .line 80
    .line 81
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->m:Lvd/p;

    .line 82
    .line 83
    new-instance p4, Ljava/util/LinkedList;

    .line 84
    .line 85
    invoke-direct {p4}, Ljava/util/LinkedList;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 89
    .line 90
    const/4 p4, 0x6

    .line 91
    invoke-static {p1, p1, p2, p4, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->o:Lvd/k;

    .line 96
    .line 97
    invoke-static {p4}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->p:Lvd/p;

    .line 102
    .line 103
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 104
    .line 105
    invoke-direct {p4, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 109
    .line 110
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->r:Landroidx/lifecycle/LiveData;

    .line 111
    .line 112
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 113
    .line 114
    invoke-direct {p4}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 118
    .line 119
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 120
    .line 121
    invoke-direct {p4}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 125
    .line 126
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-static {p4}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->u:Lvd/l;

    .line 133
    .line 134
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iput-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->v:Lvd/u;

    .line 139
    .line 140
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->w:Lvd/k;

    .line 145
    .line 146
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->x:Lvd/p;

    .line 151
    .line 152
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 153
    .line 154
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->y:Landroidx/lifecycle/MutableLiveData;

    .line 158
    .line 159
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 160
    .line 161
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->z:Landroidx/lifecycle/MutableLiveData;

    .line 165
    .line 166
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 167
    .line 168
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->A:Landroidx/lifecycle/MutableLiveData;

    .line 172
    .line 173
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 174
    .line 175
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 176
    .line 177
    .line 178
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->B:Landroidx/lifecycle/MutableLiveData;

    .line 179
    .line 180
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->C:Landroidx/lifecycle/MutableLiveData;

    .line 181
    .line 182
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 183
    .line 184
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->D:Landroidx/lifecycle/MutableLiveData;

    .line 188
    .line 189
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->E:Landroidx/lifecycle/MutableLiveData;

    .line 190
    .line 191
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 192
    .line 193
    invoke-direct {p1, p4}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->F:Landroidx/lifecycle/MutableLiveData;

    .line 197
    .line 198
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->G:Landroidx/lifecycle/LiveData;

    .line 199
    .line 200
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->H:Lvd/l;

    .line 209
    .line 210
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    iput-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->I:Lvd/u;

    .line 215
    .line 216
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1;

    .line 217
    .line 218
    invoke-direct {v0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1;-><init>(Lvd/c;)V

    .line 219
    .line 220
    .line 221
    const/4 v4, 0x3

    .line 222
    const/4 v5, 0x0

    .line 223
    const/4 v1, 0x0

    .line 224
    const-wide/16 v2, 0x0

    .line 225
    .line 226
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lvd/c;Lkotlin/coroutines/d;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->J:Landroidx/lifecycle/LiveData;

    .line 231
    .line 232
    return-void
.end method

.method public static final B0(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lqc/q;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final C0()J
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static synthetic e()J
    .locals 2

    .line 1
    invoke-static {}, Lcom/friday/document/viewmodel/BaseFileViewModel;->C0()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic f(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->B0(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/document/viewmodel/BaseFileViewModel;)Ljava/util/LinkedList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->S(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/document/viewmodel/BaseFileViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->o:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/document/viewmodel/BaseFileViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->j:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->l:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->u:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/friday/document/viewmodel/BaseFileViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->w:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/NoteBean;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->c0(Lcom/friday/common/entity/NoteBean;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->d0(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic x0(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w0(ZLcom/friday/common/entity/FileEntity;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: setMultiSelectModeEnable"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method


# virtual methods
.method public final A(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadOffice$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadOffice$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadOffice$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadOffice$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final A0()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$2;

    .line 8
    .line 9
    invoke-direct {v2, p0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lz2/a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lz2/a;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v2, v1}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final B(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadTxt$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadTxt$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadTxt$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadTxt$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final C(Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iput v3, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$findSyncFailedSize$1;->e:I

    .line 60
    .line 61
    invoke-interface {p1, v4, v5, v0}, Lcom/friday/common/dao/FileDao;->S(JLvc/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final D()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->p:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->i:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->r:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ls2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->d:Ls2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->E:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->C:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->A:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->k:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->m:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()Lcom/friday/common/dao/FileDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Lcom/friday/document/service/FileManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->e:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->v:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->x:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final Q(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->f:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->f:I

    .line 34
    .line 35
    const/4 v8, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v8, :cond_1

    .line 39
    .line 40
    iget-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iput-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    .line 66
    .line 67
    iput v8, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewList$1;->f:I

    .line 68
    .line 69
    const-wide/16 v3, 0x0

    .line 70
    .line 71
    const/4 v6, 0x2

    .line 72
    const/4 v7, 0x0

    .line 73
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v0, :cond_3

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_3
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 81
    .line 82
    move-object v0, p2

    .line 83
    check-cast v0, Ljava/util/Collection;

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_7

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Iterable;

    .line 92
    .line 93
    new-instance p1, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    :cond_4
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    move-object v2, v1

    .line 118
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$b;

    .line 135
    .line 136
    invoke-direct {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel$b;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-static {v0, p1}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Ljava/lang/Iterable;

    .line 144
    .line 145
    new-instance p2, Ljava/util/ArrayList;

    .line 146
    .line 147
    const/16 v0, 0xa

    .line 148
    .line 149
    invoke-static {p1, v0}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    .line 171
    .line 172
    new-instance v1, Ljava/io/File;

    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_6
    return-object p2

    .line 186
    :cond_7
    new-instance p2, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 196
    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string p1, "index.json"

    .line 209
    .line 210
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_8

    .line 222
    .line 223
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    :cond_8
    new-instance v0, Ljava/io/File;

    .line 229
    .line 230
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const/4 p1, 0x0

    .line 234
    invoke-static {v0, p1, v8, p1}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$c;

    .line 239
    .line 240
    invoke-direct {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$c;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v1, Lcom/google/gson/Gson;

    .line 248
    .line 249
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Ljava/util/ArrayList;

    .line 257
    .line 258
    if-eqz p1, :cond_a

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    const/4 v1, 0x0

    .line 265
    :cond_9
    :goto_5
    if-ge v1, v0, :cond_a

    .line 266
    .line 267
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    add-int/lit8 v1, v1, 0x1

    .line 272
    .line 273
    check-cast v2, Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_9

    .line 280
    .line 281
    new-instance v3, Ljava/io/File;

    .line 282
    .line 283
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_a
    return-object p2
.end method

.method public final R(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->g:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->g:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/friday/common/helper/NotePageOrder;

    .line 43
    .line 44
    iget-object v0, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p2, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 64
    .line 65
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 66
    .line 67
    move v3, v2

    .line 68
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p2, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->d:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$getPreviewNewNoteList$1;->g:I

    .line 81
    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    const/4 v6, 0x2

    .line 85
    const/4 v7, 0x0

    .line 86
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_3

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_3
    move-object v8, p2

    .line 94
    move-object p2, p1

    .line 95
    move-object p1, v8

    .line 96
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Lcom/friday/common/helper/NotePageOrder;->d(Ljava/util/List;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
.end method

.method public final S(Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/friday/document/model/FolderLevelEntity;

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-object v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lcom/friday/document/model/FolderLevelEntity;

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->m0()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/util/LinkedList;->peekFirst()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    move-object v2, p1

    .line 87
    check-cast v2, Lcom/friday/document/model/FolderLevelEntity;

    .line 88
    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    return-object p1

    .line 93
    :cond_4
    iget-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/friday/document/model/FolderLevelEntity;->getFileId()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iput-object v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iput v4, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->g:I

    .line 102
    .line 103
    invoke-interface {p1, v5, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v1, :cond_5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_1
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    const/4 v5, 0x3

    .line 119
    if-eq v4, v5, :cond_7

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    const/16 v5, 0x1e

    .line 126
    .line 127
    if-ne v4, v5, :cond_6

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    return-object v2

    .line 131
    :cond_7
    :goto_2
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iput-object v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->c:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->d:Ljava/lang/Object;

    .line 142
    .line 143
    iput v3, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$getRealLevel$1;->g:I

    .line 144
    .line 145
    invoke-virtual {p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->S(Lvc/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-ne p1, v1, :cond_8

    .line 150
    .line 151
    :goto_3
    return-object v1

    .line 152
    :cond_8
    return-object p1
.end method

.method public final T()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U()Lcom/friday/common/dao/ResourceDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object v0
.end method

.method public final V()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->I:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W()Lcom/friday/common/entity/FileEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->r:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 8
    .line 9
    return-object v0
.end method

.method public final X()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public final Y()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Z()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->F:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a0()Lvd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->H:Lvd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b0(Lcom/friday/common/entity/FileEntity;)Lcom/friday/common/entity/FileEntity;
    .locals 10

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    filled-new-array {v0, v2, v4}, [Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/4 v4, 0x5

    .line 32
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const/16 v5, 0x1e

    .line 37
    .line 38
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    filled-new-array {v2, v4, v5}, [Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-string v5, "0"

    .line 51
    .line 52
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v5, 0x0

    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v0, v6}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    move v1, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v2, v0}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move v1, v5

    .line 87
    :goto_0
    invoke-virtual {p1, v1}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_2
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v2, v6}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_3

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {v0, v4}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v2, v4}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-static {v0, v6}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_4

    .line 147
    .line 148
    :cond_4
    iget-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 155
    .line 156
    .line 157
    move-result-wide v8

    .line 158
    invoke-interface {v4, v7, v8, v9}, Lcom/friday/common/dao/FileDao;->T(Ljava/lang/String;J)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Ljava/lang/Iterable;

    .line 163
    .line 164
    instance-of v7, v4, Ljava/util/Collection;

    .line 165
    .line 166
    if-eqz v7, :cond_5

    .line 167
    .line 168
    move-object v8, v4

    .line 169
    check-cast v8, Ljava/util/Collection;

    .line 170
    .line 171
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_5

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    if-eqz v9, :cond_7

    .line 187
    .line 188
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    check-cast v9, Ljava/lang/Number;

    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-static {v2, v9}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_6

    .line 207
    .line 208
    const/4 v0, 0x3

    .line 209
    invoke-virtual {p1, v0}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    :goto_1
    if-eqz v7, :cond_9

    .line 214
    .line 215
    move-object v2, v4

    .line 216
    check-cast v2, Ljava/util/Collection;

    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_9

    .line 223
    .line 224
    :cond_8
    move v1, v5

    .line 225
    goto :goto_2

    .line 226
    :cond_9
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_8

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, Ljava/lang/Number;

    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v0, v4}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_a

    .line 255
    .line 256
    :goto_2
    if-nez v6, :cond_c

    .line 257
    .line 258
    if-eqz v1, :cond_b

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_b
    move v3, v5

    .line 262
    :cond_c
    :goto_3
    invoke-virtual {p1, v3}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 263
    .line 264
    .line 265
    :goto_4
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    new-instance v1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    const-string v2, "Folder syncStatus -> "

    .line 275
    .line 276
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-object p1
.end method

.method public final c0(Lcom/friday/common/entity/NoteBean;Lvc/c;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getFileName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getFileUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    iget-object v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v10, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getParentId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getUpdateTime()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getCreateTime()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getVersion()I

    .line 64
    .line 65
    .line 66
    move-result v15

    .line 67
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getShared()Z

    .line 68
    .line 69
    .line 70
    move-result v16

    .line 71
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->isRecycleBin()Z

    .line 72
    .line 73
    .line 74
    move-result v23

    .line 75
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getExpirationTimeStamp()J

    .line 76
    .line 77
    .line 78
    move-result-wide v21

    .line 79
    new-instance v2, Lcom/friday/common/entity/FileEntity;

    .line 80
    .line 81
    const v24, 0x1e000

    .line 82
    .line 83
    .line 84
    const/16 v25, 0x0

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const/4 v14, 0x1

    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    const/16 v20, 0x0

    .line 95
    .line 96
    invoke-direct/range {v2 .. v25}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 97
    .line 98
    .line 99
    move-object v3, v2

    .line 100
    move-object/from16 v2, p2

    .line 101
    .line 102
    invoke-interface {v1, v3, v2}, Lcom/friday/common/dao/FileDao;->I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-ne v1, v2, :cond_0

    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_0
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 114
    .line 115
    return-object v1
.end method

.method public final d0(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v3, 0xa

    .line 10
    .line 11
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/friday/common/entity/NoteBean;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getFileName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getFileUrl()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    iget-object v4, v0, Lcom/friday/document/viewmodel/BaseFileViewModel;->f:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    sget-object v11, Ljava/io/File;->separator:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v12, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getParentId()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getUpdateTime()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getCreateTime()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getVersion()I

    .line 93
    .line 94
    .line 95
    move-result v17

    .line 96
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getShared()Z

    .line 97
    .line 98
    .line 99
    move-result v18

    .line 100
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->isRecycleBin()Z

    .line 101
    .line 102
    .line 103
    move-result v25

    .line 104
    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getExpirationTimeStamp()J

    .line 105
    .line 106
    .line 107
    move-result-wide v23

    .line 108
    new-instance v4, Lcom/friday/common/entity/FileEntity;

    .line 109
    .line 110
    const v26, 0x1e000

    .line 111
    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    const/4 v15, 0x0

    .line 116
    const/16 v16, 0x1

    .line 117
    .line 118
    const/16 v19, 0x0

    .line 119
    .line 120
    const/16 v20, 0x0

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const/16 v22, 0x0

    .line 125
    .line 126
    invoke-direct/range {v4 .. v27}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    iget-object v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 134
    .line 135
    move-object/from16 v3, p2

    .line 136
    .line 137
    invoke-interface {v1, v2, v3}, Lcom/friday/common/dao/FileDao;->N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-ne v1, v2, :cond_1

    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_1
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 149
    .line 150
    return-object v1
.end method

.method public final e0()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->y:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->z:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final h0()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->G:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i0()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->J:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j0()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public k0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "fileId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public l0()V
    .locals 0

    .line 1
    return-void
.end method

.method public m0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n0(Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "fileIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/util/List;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final o0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$notifyCacheCleared$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel$notifyCacheCleared$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final p0()Lcom/friday/document/model/FolderLevelEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->peekFirst()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/model/FolderLevelEntity;

    .line 8
    .line 9
    return-object v0
.end method

.method public final q0()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$2;

    .line 8
    .line 9
    invoke-direct {v2, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v5}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final r0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v2, p0, p1, p2, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$2;

    .line 18
    .line 19
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$renameDocument$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final s(Lcom/friday/common/entity/FileEntity;)V
    .locals 8

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/LinkedList;->peekFirst()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/friday/document/model/FolderLevelEntity;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/friday/document/model/FolderLevelEntity;->getFileId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 34
    .line 35
    sget-object v2, Lcom/friday/document/model/FolderLevelEntity;->Companion:Lcom/friday/document/model/FolderLevelEntity$Companion;

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Lcom/friday/document/model/FolderLevelEntity$Companion;->map2Me(Lcom/friday/common/entity/FileEntity;)Lcom/friday/document/model/FolderLevelEntity;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->k0(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v5, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;

    .line 56
    .line 57
    invoke-direct {v5, p0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel$addFolderLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 58
    .line 59
    .line 60
    const/4 v6, 0x3

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final s0(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$selectSpecifiedItem$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$selectSpecifiedItem$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final t(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p3, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 63
    .line 64
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iput-object v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    iput v4, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$deleteCacheFile$1;->g:I

    .line 73
    .line 74
    invoke-interface {p3, p2, v3, v0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-ne p2, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p3, "index.json"

    .line 99
    .line 100
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    if-nez p3, :cond_6

    .line 112
    .line 113
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_5

    .line 118
    .line 119
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->deleteAllInDir(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    :cond_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_6
    new-instance p3, Ljava/io/File;

    .line 126
    .line 127
    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/4 p2, 0x0

    .line 131
    invoke-static {p3, p2, v4, p2}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    new-instance p3, Lcom/friday/document/viewmodel/BaseFileViewModel$a;

    .line 136
    .line 137
    invoke-direct {p3}, Lcom/friday/document/viewmodel/BaseFileViewModel$a;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    new-instance v0, Lcom/google/gson/Gson;

    .line 145
    .line 146
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p2, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    check-cast p2, Ljava/util/ArrayList;

    .line 154
    .line 155
    if-eqz p2, :cond_8

    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    :cond_7
    :goto_2
    if-ge v3, p3, :cond_8

    .line 162
    .line 163
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    check-cast v0, Ljava/lang/String;

    .line 170
    .line 171
    new-instance v1, Ljava/io/File;

    .line 172
    .line 173
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_7

    .line 181
    .line 182
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_8
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 190
    .line 191
    return-object p1
.end method

.method public final t0(Lcom/friday/common/entity/FileEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    const-string v2, "6"

    .line 62
    .line 63
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    iget-object p2, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFileExits$1;->f:I

    .line 91
    .line 92
    invoke-interface {p2, v2, v0}, Lcom/friday/common/dao/FileDao;->Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    if-ne p2, v1, :cond_4

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_4
    :goto_1
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 100
    .line 101
    if-eqz p2, :cond_5

    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    const/4 p1, 0x0

    .line 109
    :goto_2
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1
.end method

.method public final u0(Lcom/friday/common/entity/FileEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->D:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lcom/friday/document/model/FolderLevelEntity;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->p0()Lcom/friday/document/model/FolderLevelEntity;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {p1}, Lcom/friday/document/model/FolderLevelEntity;->getFileId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v4, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 73
    .line 74
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->d:Ljava/lang/Object;

    .line 85
    .line 86
    iput v3, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesFolderExitsInDb$1;->g:I

    .line 87
    .line 88
    invoke-interface {v4, v2, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v1, :cond_4

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    :goto_1
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    if-nez p1, :cond_6

    .line 99
    .line 100
    :cond_5
    move v3, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_6
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/16 v2, 0x1e

    .line 107
    .line 108
    if-eq v1, v2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    const/4 v1, 0x3

    .line 115
    if-eq p1, v1, :cond_5

    .line 116
    .line 117
    :goto_2
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1
.end method

.method public final v0(Lcom/friday/common/entity/FileEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->B:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->g:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->g:I

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    const/4 v9, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v9, :cond_2

    .line 40
    .line 41
    if-ne v1, v8, :cond_1

    .line 42
    .line 43
    iget-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/util/List;

    .line 46
    .line 47
    iget-object v0, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 66
    .line 67
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iput-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput v9, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->g:I

    .line 83
    .line 84
    const-wide/16 v3, 0x0

    .line 85
    .line 86
    const/4 v6, 0x2

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-ne p2, v0, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 96
    .line 97
    move-object v1, p2

    .line 98
    check-cast v1, Ljava/util/Collection;

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_b

    .line 105
    .line 106
    iget-object v1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iput-object p1, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->c:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object p2, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->d:Ljava/lang/Object;

    .line 115
    .line 116
    iput v8, v5, Lcom/friday/document/viewmodel/BaseFileViewModel$doesNoteExits$1;->g:I

    .line 117
    .line 118
    invoke-interface {v1, v2, v5}, Lcom/friday/common/dao/FileDao;->Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-ne v1, v0, :cond_5

    .line 123
    .line 124
    :goto_3
    return-object v0

    .line 125
    :cond_5
    move-object v0, p1

    .line 126
    move-object p1, p2

    .line 127
    move-object p2, v1

    .line 128
    :goto_4
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 129
    .line 130
    const/4 v1, 0x0

    .line 131
    if-eqz p2, :cond_6

    .line 132
    .line 133
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    goto :goto_5

    .line 138
    :cond_6
    move p2, v1

    .line 139
    :goto_5
    check-cast p1, Ljava/lang/Iterable;

    .line 140
    .line 141
    new-instance v2, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :cond_7
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    move-object v4, v3

    .line 161
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 162
    .line 163
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_7

    .line 172
    .line 173
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_8
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_9

    .line 182
    .line 183
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    new-instance v3, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v4, "\u9875\u9762BaseFileViewModel.kt -> \u7f13\u5b58\u68c0\u67e5\u5931\u8d25,\u7b14\u8bb0ID: "

    .line 197
    .line 198
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string p1, ", \u7f3a\u5931\u8d44\u6e90\u6570: "

    .line 205
    .line 206
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    move v0, v1

    .line 228
    :goto_7
    if-ge v0, p1, :cond_9

    .line 229
    .line 230
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    add-int/lit8 v0, v0, 0x1

    .line 235
    .line 236
    check-cast v3, Lcom/friday/common/entity/ResourceEntity;

    .line 237
    .line 238
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    new-instance v4, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string v5, "\u9875\u9762BaseFileViewModel.kt -> \u4e22\u5931\u7684\u6587\u4ef6\u8d44\u6e90ID: "

    .line 248
    .line 249
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string v2, "\u9875\u9762BaseFileViewModel.kt -> \u5224\u65ad\u7ed3\u679c: fileCached\u6570\u636e\u5e93\u6807\u8bb0="

    .line 277
    .line 278
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v2, ", \u8d44\u6e90\u5168\u90e8\u5b58\u5728="

    .line 285
    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    if-eqz p2, :cond_a

    .line 304
    .line 305
    if-eqz p1, :cond_a

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_a
    move v9, v1

    .line 309
    goto :goto_8

    .line 310
    :cond_b
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 315
    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const-string p1, "index.json"

    .line 328
    .line 329
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    :goto_8
    invoke-static {v9}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    return-object p1
.end method

.method public final w0(ZLcom/friday/common/entity/FileEntity;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, p2, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel$setMultiSelectModeEnable$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadCover$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadCover$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadCover$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadCover$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final y(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadFile$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final y0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel;->n:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->l0()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/friday/document/viewmodel/BaseFileViewModel$showRootLevel$1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v4, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$showRootLevel$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final z(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadMicroClass$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadMicroClass$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadMicroClass$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$downloadMicroClass$2;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final z0(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/document/viewmodel/BaseFileViewModel$switchSelectData$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel$switchSelectData$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method
