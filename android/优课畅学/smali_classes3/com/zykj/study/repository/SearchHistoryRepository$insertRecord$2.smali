.class final Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/SearchHistoryRepository;->e(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.repository.SearchHistoryRepository$insertRecord$2"
    f = "SearchHistoryRepository.kt"
    l = {
        0x25,
        0x2b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public final synthetic e:Lcom/zykj/study/repository/SearchHistoryRepository;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/repository/SearchHistoryRepository;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->e:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->g:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->e:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->g:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;-><init>(Lcom/zykj/study/repository/SearchHistoryRepository;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->d:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->e:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/zykj/study/repository/SearchHistoryRepository;->a(Lcom/zykj/study/repository/SearchHistoryRepository;)Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {p1, v1}, Lcom/zykj/study/data/SearchHistoryEntityDao;->getList(Ljava/lang/String;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object p1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->g:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    move-object v7, v6

    .line 81
    check-cast v7, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 82
    .line 83
    invoke-virtual {v7}, Lcom/zykj/study/data/SearchHistoryEntity;->getSearchKey()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v7, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    const/4 v6, 0x0

    .line 95
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->e:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 96
    .line 97
    iget-object v5, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->f:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v7, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->g:Ljava/lang/String;

    .line 100
    .line 101
    check-cast v6, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 102
    .line 103
    if-nez v6, :cond_5

    .line 104
    .line 105
    invoke-static {p1}, Lcom/zykj/study/repository/SearchHistoryRepository;->a(Lcom/zykj/study/repository/SearchHistoryRepository;)Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v8, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 110
    .line 111
    new-instance v9, Ljava/util/Date;

    .line 112
    .line 113
    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-direct {v8, v4, v5, v7, v9}, Lcom/zykj/study/data/SearchHistoryEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    .line 117
    .line 118
    .line 119
    filled-new-array {v8}, [Lcom/zykj/study/data/SearchHistoryEntity;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    iput-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->a:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    iput-object v6, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->b:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->c:I

    .line 132
    .line 133
    iput v3, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->d:I

    .line 134
    .line 135
    invoke-interface {p1, v5, p0}, Lcom/zykj/study/data/SearchHistoryEntityDao;->insert([Lcom/zykj/study/data/SearchHistoryEntity;Lm7/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v0, :cond_5

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    const/16 v3, 0xa

    .line 147
    .line 148
    if-le p1, v3, :cond_6

    .line 149
    .line 150
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    sub-int/2addr p1, v3

    .line 155
    invoke-interface {v1, v4, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-object v3, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->e:Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 160
    .line 161
    invoke-static {v3}, Lcom/zykj/study/repository/SearchHistoryRepository;->a(Lcom/zykj/study/repository/SearchHistoryRepository;)Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iput-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->a:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->b:Ljava/lang/Object;

    .line 176
    .line 177
    iput v4, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->c:I

    .line 178
    .line 179
    iput v2, p0, Lcom/zykj/study/repository/SearchHistoryRepository$insertRecord$2;->d:I

    .line 180
    .line 181
    invoke-interface {v3, p1, p0}, Lcom/zykj/study/data/SearchHistoryEntityDao;->delete(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-ne p1, v0, :cond_6

    .line 186
    .line 187
    :goto_2
    return-object v0

    .line 188
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 189
    .line 190
    return-object p1
.end method
