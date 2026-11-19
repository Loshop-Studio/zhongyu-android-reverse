.class public Lcom/umeng/commonsdk/statistics/proto/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/aq;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/b$d;,
        Lcom/umeng/commonsdk/statistics/proto/b$f;,
        Lcom/umeng/commonsdk/statistics/proto/b$b;,
        Lcom/umeng/commonsdk/statistics/proto/b$c;,
        Lcom/umeng/commonsdk/statistics/proto/b$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/aq<",
        "Lcom/umeng/commonsdk/statistics/proto/b;",
        "Lcom/umeng/commonsdk/statistics/proto/b$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final e:Lg2/u;

.field public static final f:Lg2/p;

.field public static final g:Lg2/p;

.field public static final h:Lg2/p;

.field public static final i:Ljava/util/Map;

.field public static final j:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:I

.field public d:B


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, "IdSnapshot"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->e:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const-string v1, "identity"

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
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->f:Lg2/p;

    .line 21
    .line 22
    new-instance v0, Lg2/p;

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    const-string v5, "ts"

    .line 26
    .line 27
    const/16 v6, 0xa

    .line 28
    .line 29
    invoke-direct {v0, v5, v6, v4}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->g:Lg2/p;

    .line 33
    .line 34
    new-instance v0, Lg2/p;

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    const-string v7, "version"

    .line 38
    .line 39
    const/16 v8, 0x8

    .line 40
    .line 41
    invoke-direct {v0, v7, v8, v4}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->h:Lg2/p;

    .line 45
    .line 46
    new-instance v0, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->i:Ljava/util/Map;

    .line 52
    .line 53
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/b$c;

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    invoke-direct {v4, v9}, Lcom/umeng/commonsdk/statistics/proto/b$c;-><init>(Lcom/umeng/commonsdk/statistics/proto/b$a;)V

    .line 57
    .line 58
    .line 59
    const-class v10, Lg2/x;

    .line 60
    .line 61
    invoke-interface {v0, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/b$f;

    .line 65
    .line 66
    invoke-direct {v4, v9}, Lcom/umeng/commonsdk/statistics/proto/b$f;-><init>(Lcom/umeng/commonsdk/statistics/proto/b$a;)V

    .line 67
    .line 68
    .line 69
    const-class v9, Lg2/z;

    .line 70
    .line 71
    invoke-interface {v0, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/EnumMap;

    .line 75
    .line 76
    const-class v4, Lcom/umeng/commonsdk/statistics/proto/b$e;

    .line 77
    .line 78
    invoke-direct {v0, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    sget-object v4, Lcom/umeng/commonsdk/statistics/proto/b$e;->c:Lcom/umeng/commonsdk/statistics/proto/b$e;

    .line 82
    .line 83
    new-instance v9, Lcom/umeng/analytics/pro/bc;

    .line 84
    .line 85
    new-instance v10, Lcom/umeng/analytics/pro/bd;

    .line 86
    .line 87
    invoke-direct {v10, v2}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v9, v1, v3, v10}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/b$e;->d:Lcom/umeng/commonsdk/statistics/proto/b$e;

    .line 97
    .line 98
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 99
    .line 100
    new-instance v4, Lcom/umeng/analytics/pro/bd;

    .line 101
    .line 102
    invoke-direct {v4, v6}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v2, v5, v3, v4}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/b$e;->e:Lcom/umeng/commonsdk/statistics/proto/b$e;

    .line 112
    .line 113
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 114
    .line 115
    new-instance v4, Lcom/umeng/analytics/pro/bd;

    .line 116
    .line 117
    invoke-direct {v4, v8}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v2, v7, v3, v4}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->j:Ljava/util/Map;

    .line 131
    .line 132
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/b;

    .line 133
    .line 134
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bc;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
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
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic C()Lg2/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->e:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic D()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->f:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic E()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->g:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic F()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->h:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lg2/l;->c(BI)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public B()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

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
    const-string v2, "Required field \'identity\' was not present! Struct: "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/b;->toString()Ljava/lang/String;

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

.method public g(I)Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->w(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public m(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->i:Ljava/util/Map;

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

.method public n(J)Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->v(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public p(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/b;->i:Ljava/util/Map;

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

.method public q(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public t(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "IdSnapshot("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "identity:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "null"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    const-string v1, ", "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "ts:"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-wide v2, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, "version:"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget v1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ")"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public v(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

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
    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

    .line 9
    .line 10
    return-void
.end method

.method public w(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, p1}, Lg2/l;->a(BIZ)B

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

    .line 9
    .line 10
    return-void
.end method

.method public x()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public y()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->d:B

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

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    .line 2
    .line 3
    return v0
.end method
