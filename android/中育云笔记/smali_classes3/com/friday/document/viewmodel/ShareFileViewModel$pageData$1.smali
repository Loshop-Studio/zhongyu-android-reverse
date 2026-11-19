.class final Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareFileViewModel;-><init>(Landroid/content/Context;Ls2/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/s;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareFileViewModel$pageData$1"
    f = "ShareFileViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public synthetic g:I

.field public final synthetic h:Lcom/friday/document/viewmodel/ShareFileViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->h:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    const/4 p1, 0x5

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic g(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->p(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->t(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final p(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;)I
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

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

.method public static final t(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I
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


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, Lcom/friday/document/model/ShareFile;

    move-object v2, p2

    check-cast v2, Lcom/friday/document/model/ShareFile;

    move-object v3, p3

    check-cast v3, Ljava/util/List;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object v5, p5

    check-cast v5, Lvc/c;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->n(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;Ljava/util/List;ILvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/friday/document/model/ShareFile;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/List;

    .line 12
    .line 13
    iget v3, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->g:I

    .line 14
    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget v4, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->c:I

    .line 19
    .line 20
    if-nez v4, :cond_8

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->h:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Lcom/friday/document/viewmodel/ShareFileViewModel;->T(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    if-nez v3, :cond_1

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Iterable;

    .line 37
    .line 38
    new-instance p1, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1$a;

    .line 39
    .line 40
    invoke-direct {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1$a;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, p1}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    check-cast v2, Ljava/lang/Iterable;

    .line 49
    .line 50
    new-instance p1, Lcom/friday/document/viewmodel/b;

    .line 51
    .line 52
    invoke-direct {p1}, Lcom/friday/document/viewmodel/b;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v3, Lcom/friday/document/viewmodel/c;

    .line 56
    .line 57
    invoke-direct {v3, p1}, Lcom/friday/document/viewmodel/c;-><init>(Lhd/p;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 65
    .line 66
    new-instance v2, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v3, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    const-string v5, "0"

    .line 85
    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    move-object v6, v4

    .line 93
    check-cast v6, Lcom/friday/document/model/ShareFile;

    .line 94
    .line 95
    invoke-virtual {v6}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v6, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_2

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    new-instance p1, Lkotlin/Pair;

    .line 114
    .line 115
    invoke-direct {p1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/util/List;

    .line 123
    .line 124
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    check-cast v2, Ljava/util/Collection;

    .line 131
    .line 132
    check-cast p1, Ljava/lang/Iterable;

    .line 133
    .line 134
    invoke-static {v2, p1}, Lrc/g0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Ljava/lang/Iterable;

    .line 139
    .line 140
    new-instance v2, Ljava/util/ArrayList;

    .line 141
    .line 142
    const/16 v3, 0xa

    .line 143
    .line 144
    invoke-static {p1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Lcom/friday/document/model/ShareFile;

    .line 166
    .line 167
    new-instance v4, Lcom/friday/document/model/ShareListEntity;

    .line 168
    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    goto :goto_3

    .line 176
    :cond_4
    const/4 v6, 0x0

    .line 177
    :goto_3
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x1

    .line 187
    if-eqz v6, :cond_5

    .line 188
    .line 189
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-static {v6, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-nez v6, :cond_5

    .line 198
    .line 199
    move v6, v8

    .line 200
    goto :goto_4

    .line 201
    :cond_5
    move v6, v7

    .line 202
    :goto_4
    if-nez v0, :cond_6

    .line 203
    .line 204
    move v7, v8

    .line 205
    :cond_6
    invoke-direct {v4, v6, v7, v3}, Lcom/friday/document/model/ShareListEntity;-><init>(ZZLcom/friday/document/model/ShareFile;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    return-object v2

    .line 213
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 214
    .line 215
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 216
    .line 217
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p1
.end method

.method public final n(Lcom/friday/document/model/ShareFile;Lcom/friday/document/model/ShareFile;Ljava/util/List;ILvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->h:Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p5}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;-><init>(Lcom/friday/document/viewmodel/ShareFileViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, v0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, v0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iput p4, v0, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->g:I

    .line 15
    .line 16
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel$pageData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
