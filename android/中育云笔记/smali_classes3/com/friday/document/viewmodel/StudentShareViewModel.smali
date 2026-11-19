.class public final Lcom/friday/document/viewmodel/StudentShareViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Ls2/b;

.field public final c:Ld2/i;

.field public final d:Lc2/g2;

.field public final e:Lcom/friday/common/dao/ResourceDao;

.field public final f:Lcom/friday/document/service/FileManager;

.field public final g:Lvd/k;

.field public final h:Lvd/p;

.field public final i:Landroidx/lifecycle/MutableLiveData;

.field public final j:Landroidx/lifecycle/LiveData;

.field public final k:Lvd/l;

.field public final l:Lvd/u;

.field public final m:Ljava/lang/String;

.field public final n:Landroidx/lifecycle/MutableLiveData;

.field public o:I

.field public final p:Landroidx/lifecycle/LiveData;

.field public final q:Landroidx/lifecycle/MutableLiveData;

.field public final r:Landroidx/lifecycle/MutableLiveData;

.field public final s:Landroidx/lifecycle/MutableLiveData;

.field public final t:Landroidx/lifecycle/MutableLiveData;

.field public final u:Ljava/util/HashMap;

.field public final v:Landroidx/lifecycle/MutableLiveData;

.field public final w:Landroidx/lifecycle/MutableLiveData;

.field public final x:Lvd/l;

.field public final y:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls2/b;Ld2/i;Lc2/g2;Lcom/friday/common/dao/ResourceDao;Lcom/friday/document/service/FileManager;)V
    .locals 1

    .line 1
    const-string v0, "shareService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ezyService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "shareCacheDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "resourceDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "fileManager"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->b:Ls2/b;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->c:Ld2/i;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->d:Lc2/g2;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->e:Lcom/friday/common/dao/ResourceDao;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->f:Lcom/friday/document/service/FileManager;

    .line 38
    .line 39
    const/4 p1, 0x7

    .line 40
    const/4 p2, 0x0

    .line 41
    const/4 p3, 0x0

    .line 42
    invoke-static {p2, p2, p3, p1, p3}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->g:Lvd/k;

    .line 47
    .line 48
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->h:Lvd/p;

    .line 53
    .line 54
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 55
    .line 56
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->j:Landroidx/lifecycle/LiveData;

    .line 62
    .line 63
    invoke-static {p3}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->k:Lvd/l;

    .line 68
    .line 69
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->l:Lvd/u;

    .line 74
    .line 75
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->G()J

    .line 82
    .line 83
    .line 84
    move-result-wide p3

    .line 85
    new-instance p5, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, "share"

    .line 97
    .line 98
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p5, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->m:Ljava/lang/String;

    .line 115
    .line 116
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 117
    .line 118
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 122
    .line 123
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->p()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    iput p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->o:I

    .line 134
    .line 135
    new-instance p2, Lz2/n0;

    .line 136
    .line 137
    invoke-direct {p2, p0}, Lz2/n0;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p2}, Landroidx/lifecycle/Transformations;->map(Landroidx/lifecycle/LiveData;Lhd/l;)Landroidx/lifecycle/LiveData;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->p:Landroidx/lifecycle/LiveData;

    .line 145
    .line 146
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 147
    .line 148
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 152
    .line 153
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 154
    .line 155
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 159
    .line 160
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 161
    .line 162
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 166
    .line 167
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 168
    .line 169
    new-instance p1, Ljava/util/HashMap;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 172
    .line 173
    .line 174
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->u:Ljava/util/HashMap;

    .line 175
    .line 176
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 177
    .line 178
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 179
    .line 180
    .line 181
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 182
    .line 183
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->w:Landroidx/lifecycle/MutableLiveData;

    .line 184
    .line 185
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->x:Lvd/l;

    .line 194
    .line 195
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->y:Lvd/u;

    .line 200
    .line 201
    return-void
.end method

.method public static final C(Lcom/friday/document/viewmodel/StudentShareViewModel;Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget p0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->o:I

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance p0, Lcom/friday/document/viewmodel/StudentShareViewModel$a;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/friday/document/viewmodel/StudentShareViewModel$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p0}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance p0, Lz2/o0;

    .line 24
    .line 25
    invoke-direct {p0}, Lz2/o0;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lz2/p0;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lz2/p0;-><init>(Lhd/p;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    check-cast p0, Ljava/lang/Iterable;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    move-object v2, v1

    .line 64
    check-cast v2, Lcom/friday/document/model/ShareFile;

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const-string v3, "0"

    .line 71
    .line 72
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    new-instance p0, Lkotlin/Pair;

    .line 87
    .line 88
    invoke-direct {p0, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Ljava/util/List;

    .line 96
    .line 97
    invoke-virtual {p0}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Ljava/util/List;

    .line 102
    .line 103
    check-cast p1, Ljava/util/Collection;

    .line 104
    .line 105
    check-cast p0, Ljava/lang/Iterable;

    .line 106
    .line 107
    invoke-static {p1, p0}, Lrc/g0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method

.method public static final D(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p0, p1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static final E(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final G()J
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

.method public static synthetic e(Lcom/friday/document/viewmodel/StudentShareViewModel;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->C(Lcom/friday/document/viewmodel/StudentShareViewModel;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel;->E(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->D(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I

    move-result p0

    return p0
.end method

.method public static final varargs synthetic h(Lcom/friday/document/viewmodel/StudentShareViewModel;Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel;->w(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic i(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->e:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->u:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lc2/g2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->d:Lc2/g2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ls2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->b:Ls2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/friday/document/viewmodel/StudentShareViewModel;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->G()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic q(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/viewmodel/StudentShareViewModel;->p(Lcom/friday/document/model/ShareFile;ZLvc/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final varargs w(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p2, v2

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-static {p1, v3, v4}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    return v4

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v1
.end method


# virtual methods
.method public final A()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F(Lcom/friday/document/model/ShareFile;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

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
    iput v1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    if-eq v2, v6, :cond_4

    .line 40
    .line 41
    if-eq v2, v5, :cond_3

    .line 42
    .line 43
    if-eq v2, v4, :cond_2

    .line 44
    .line 45
    if-ne v2, v3, :cond_1

    .line 46
    .line 47
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/Exception;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 71
    .line 72
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Ljava/lang/String;

    .line 75
    .line 76
    :goto_1
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :catch_0
    move-exception p2

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 86
    .line 87
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    iget-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Ljava/lang/String;

    .line 95
    .line 96
    :try_start_1
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :try_start_2
    iget-object p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->b:Ls2/b;

    .line 104
    .line 105
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iput-object v2, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    iput v6, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

    .line 112
    .line 113
    invoke-interface {p2, p1, v0}, Ls2/b;->b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-ne p2, v1, :cond_6

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    :goto_2
    check-cast p2, Lcom/friday/common/property/BaseResponse;

    .line 121
    .line 122
    invoke-virtual {p2}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->x:Lvd/l;

    .line 129
    .line 130
    invoke-virtual {p2}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, Lcom/friday/document/model/StudentShareEntity;

    .line 135
    .line 136
    invoke-virtual {v4}, Lcom/friday/document/model/StudentShareEntity;->getShareFileList()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    iput-object v6, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    iput-object p2, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->d:Ljava/lang/Object;

    .line 151
    .line 152
    iput v5, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

    .line 153
    .line 154
    invoke-interface {v2, v4, v0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-ne p1, v1, :cond_8

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_7
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->x:Lvd/l;

    .line 162
    .line 163
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    iput-object v6, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    iput-object p2, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->d:Ljava/lang/Object;

    .line 178
    .line 179
    iput v4, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

    .line 180
    .line 181
    invoke-interface {v2, v5, v0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 185
    if-ne p1, v1, :cond_8

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :goto_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 189
    .line 190
    .line 191
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->x:Lvd/l;

    .line 192
    .line 193
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iput-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->c:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iput-object p1, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->d:Ljava/lang/Object;

    .line 208
    .line 209
    iput v3, v0, Lcom/friday/document/viewmodel/StudentShareViewModel$doSearch$1;->g:I

    .line 210
    .line 211
    invoke-interface {v2, v4, v0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-ne p1, v1, :cond_8

    .line 216
    .line 217
    :goto_4
    return-object v1

    .line 218
    :cond_8
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 219
    .line 220
    return-object p1
.end method

.method public final p(Lcom/friday/document/model/ShareFile;ZLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final r(Lcom/friday/document/model/ShareFile;)V
    .locals 7

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadNoteFile$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadNoteFile$1;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadNoteFile$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadNoteFile$2;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V

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

.method public final s(Lcom/friday/document/model/ShareFile;)V
    .locals 1

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t(Lcom/friday/document/model/ShareFile;)V
    .locals 7

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$2;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V

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

.method public final u(Lcom/friday/document/model/ShareFile;)V
    .locals 7

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$1;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadTxt$2;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lvc/c;)V

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

.method public final v(Lcom/friday/document/model/ShareFile;)V
    .locals 1

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Lcom/friday/document/service/FileManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->f:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel;->y:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method
