.class public Lcom/umeng/commonsdk/statistics/proto/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/aq;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/e$d;,
        Lcom/umeng/commonsdk/statistics/proto/e$f;,
        Lcom/umeng/commonsdk/statistics/proto/e$b;,
        Lcom/umeng/commonsdk/statistics/proto/e$c;,
        Lcom/umeng/commonsdk/statistics/proto/e$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/aq<",
        "Lcom/umeng/commonsdk/statistics/proto/e;",
        "Lcom/umeng/commonsdk/statistics/proto/e$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final f:Lg2/u;

.field public static final g:Lg2/p;

.field public static final h:Lg2/p;

.field public static final i:Lg2/p;

.field public static final j:Ljava/util/Map;

.field public static final k:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:Ljava/lang/String;

.field public d:B

.field public e:[Lcom/umeng/commonsdk/statistics/proto/e$e;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, "ImprintValue"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->f:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const-string v1, "value"

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
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->g:Lg2/p;

    .line 21
    .line 22
    new-instance v0, Lg2/p;

    .line 23
    .line 24
    const-string v4, "ts"

    .line 25
    .line 26
    const/16 v5, 0xa

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-direct {v0, v4, v5, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->h:Lg2/p;

    .line 33
    .line 34
    new-instance v0, Lg2/p;

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    const-string v8, "guid"

    .line 38
    .line 39
    invoke-direct {v0, v8, v2, v7}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->i:Lg2/p;

    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->j:Ljava/util/Map;

    .line 50
    .line 51
    new-instance v7, Lcom/umeng/commonsdk/statistics/proto/e$c;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    invoke-direct {v7, v9}, Lcom/umeng/commonsdk/statistics/proto/e$c;-><init>(Lcom/umeng/commonsdk/statistics/proto/e$a;)V

    .line 55
    .line 56
    .line 57
    const-class v10, Lg2/x;

    .line 58
    .line 59
    invoke-interface {v0, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    new-instance v7, Lcom/umeng/commonsdk/statistics/proto/e$f;

    .line 63
    .line 64
    invoke-direct {v7, v9}, Lcom/umeng/commonsdk/statistics/proto/e$f;-><init>(Lcom/umeng/commonsdk/statistics/proto/e$a;)V

    .line 65
    .line 66
    .line 67
    const-class v9, Lg2/z;

    .line 68
    .line 69
    invoke-interface {v0, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    new-instance v0, Ljava/util/EnumMap;

    .line 73
    .line 74
    const-class v7, Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 75
    .line 76
    invoke-direct {v0, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    sget-object v7, Lcom/umeng/commonsdk/statistics/proto/e$e;->c:Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 80
    .line 81
    new-instance v9, Lcom/umeng/analytics/pro/bc;

    .line 82
    .line 83
    new-instance v10, Lcom/umeng/analytics/pro/bd;

    .line 84
    .line 85
    invoke-direct {v10, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v9, v1, v6, v10}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/e$e;->d:Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 95
    .line 96
    new-instance v6, Lcom/umeng/analytics/pro/bc;

    .line 97
    .line 98
    new-instance v7, Lcom/umeng/analytics/pro/bd;

    .line 99
    .line 100
    invoke-direct {v7, v5}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v6, v4, v3, v7}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/e$e;->e:Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 110
    .line 111
    new-instance v4, Lcom/umeng/analytics/pro/bc;

    .line 112
    .line 113
    new-instance v5, Lcom/umeng/analytics/pro/bd;

    .line 114
    .line 115
    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v4, v8, v3, v5}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->k:Ljava/util/Map;

    .line 129
    .line 130
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 131
    .line 132
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bc;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 133
    .line 134
    .line 135
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
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->d:B

    .line 6
    .line 7
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e$e;->c:Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 8
    .line 9
    filled-new-array {v0}, [Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->e:[Lcom/umeng/commonsdk/statistics/proto/e$e;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic A()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->g:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic B()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->h:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic C()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->i:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic z()Lg2/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->f:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public g(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public m(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->j:Ljava/util/Map;

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

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public p(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/e;->j:Ljava/util/Map;

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
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->d:B

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
    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->d:B

    .line 9
    .line 10
    return-void
.end method

.method public t(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ImprintValue("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/e;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, ", "

    .line 13
    .line 14
    const-string v3, "null"

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-string v1, "value:"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string v1, "ts:"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-wide v4, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 43
    .line 44
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, "guid:"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :goto_1
    const-string v1, ")"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

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

.method public v()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public w()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->d:B

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

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Required field \'guid\' was not present! Struct: "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/e;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method
