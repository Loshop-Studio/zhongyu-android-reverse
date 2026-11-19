.class public Lcom/umeng/commonsdk/statistics/proto/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/aq;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/a$d;,
        Lcom/umeng/commonsdk/statistics/proto/a$f;,
        Lcom/umeng/commonsdk/statistics/proto/a$b;,
        Lcom/umeng/commonsdk/statistics/proto/a$c;,
        Lcom/umeng/commonsdk/statistics/proto/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/aq<",
        "Lcom/umeng/commonsdk/statistics/proto/a;",
        "Lcom/umeng/commonsdk/statistics/proto/a$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final g:Lg2/u;

.field public static final h:Lg2/p;

.field public static final i:Lg2/p;

.field public static final j:Lg2/p;

.field public static final k:Lg2/p;

.field public static final l:Ljava/util/Map;

.field public static final m:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:B

.field public f:[Lcom/umeng/commonsdk/statistics/proto/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, "IdJournal"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->g:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const-string v1, "domain"

    .line 13
    .line 14
    const/16 v2, 0xb

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->h:Lg2/p;

    .line 21
    .line 22
    new-instance v0, Lg2/p;

    .line 23
    .line 24
    const-string v4, "old_id"

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v0, v4, v2, v5}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->i:Lg2/p;

    .line 31
    .line 32
    new-instance v0, Lg2/p;

    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    const-string v7, "new_id"

    .line 36
    .line 37
    invoke-direct {v0, v7, v2, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->j:Lg2/p;

    .line 41
    .line 42
    new-instance v0, Lg2/p;

    .line 43
    .line 44
    const/4 v6, 0x4

    .line 45
    const-string v8, "ts"

    .line 46
    .line 47
    const/16 v9, 0xa

    .line 48
    .line 49
    invoke-direct {v0, v8, v9, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->k:Lg2/p;

    .line 53
    .line 54
    new-instance v0, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->l:Ljava/util/Map;

    .line 60
    .line 61
    new-instance v6, Lcom/umeng/commonsdk/statistics/proto/a$c;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    invoke-direct {v6, v10}, Lcom/umeng/commonsdk/statistics/proto/a$c;-><init>(Lcom/umeng/commonsdk/statistics/proto/a$a;)V

    .line 65
    .line 66
    .line 67
    const-class v11, Lg2/x;

    .line 68
    .line 69
    invoke-interface {v0, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    new-instance v6, Lcom/umeng/commonsdk/statistics/proto/a$f;

    .line 73
    .line 74
    invoke-direct {v6, v10}, Lcom/umeng/commonsdk/statistics/proto/a$f;-><init>(Lcom/umeng/commonsdk/statistics/proto/a$a;)V

    .line 75
    .line 76
    .line 77
    const-class v10, Lg2/z;

    .line 78
    .line 79
    invoke-interface {v0, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/util/EnumMap;

    .line 83
    .line 84
    const-class v6, Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 85
    .line 86
    invoke-direct {v0, v6}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 87
    .line 88
    .line 89
    sget-object v6, Lcom/umeng/commonsdk/statistics/proto/a$e;->c:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 90
    .line 91
    new-instance v10, Lcom/umeng/analytics/pro/bc;

    .line 92
    .line 93
    new-instance v11, Lcom/umeng/analytics/pro/bd;

    .line 94
    .line 95
    invoke-direct {v11, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v10, v1, v3, v11}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/a$e;->d:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 105
    .line 106
    new-instance v6, Lcom/umeng/analytics/pro/bc;

    .line 107
    .line 108
    new-instance v10, Lcom/umeng/analytics/pro/bd;

    .line 109
    .line 110
    invoke-direct {v10, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v6, v4, v5, v10}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/a$e;->e:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 120
    .line 121
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 122
    .line 123
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 124
    .line 125
    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v4, v7, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/a$e;->f:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 135
    .line 136
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 137
    .line 138
    new-instance v4, Lcom/umeng/analytics/pro/bd;

    .line 139
    .line 140
    invoke-direct {v4, v9}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v8, v3, v4}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->m:Ljava/util/Map;

    .line 154
    .line 155
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/a;

    .line 156
    .line 157
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bc;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->e:B

    .line 6
    .line 7
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a$e;->d:Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 8
    .line 9
    filled-new-array {v0}, [Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->f:[Lcom/umeng/commonsdk/statistics/proto/a$e;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic B()Lg2/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->g:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic C()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->h:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic D()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->i:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic E()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->j:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic F()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->k:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Required field \'new_id\' was not present! Struct: "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "Required field \'domain\' was not present! Struct: "

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public g(J)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->x(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public m(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->l:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg2/s;->c()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lg2/w;

    .line 12
    .line 13
    invoke-interface {v0}, Lg2/w;->b()Lg2/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1, p0}, Lg2/v;->b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public n(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public p(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/a;->l:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg2/s;->c()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lg2/w;

    .line 12
    .line 13
    invoke-interface {v0}, Lg2/w;->b()Lg2/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1, p0}, Lg2/v;->a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public q(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public t(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "IdJournal("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "domain:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "null"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/a;->y()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const-string v3, ", "

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, "old_id:"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, "new_id:"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 62
    .line 63
    if-nez v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, "ts:"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-wide v1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->d:J

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ")"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method

.method public u(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public v(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public w(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->c:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public x(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->e:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, p1}, Lg2/l;->a(BIZ)B

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/a;->e:B

    .line 9
    .line 10
    return-void
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public z()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/a;->e:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lg2/l;->c(BI)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method
