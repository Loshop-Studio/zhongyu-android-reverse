.class public Lcom/umeng/commonsdk/statistics/proto/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/aq;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/d$d;,
        Lcom/umeng/commonsdk/statistics/proto/d$f;,
        Lcom/umeng/commonsdk/statistics/proto/d$b;,
        Lcom/umeng/commonsdk/statistics/proto/d$c;,
        Lcom/umeng/commonsdk/statistics/proto/d$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/aq<",
        "Lcom/umeng/commonsdk/statistics/proto/d;",
        "Lcom/umeng/commonsdk/statistics/proto/d$e;",
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
.field public a:Ljava/util/Map;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:B


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, "Imprint"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->e:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const-string v1, "property"

    .line 13
    .line 14
    const/16 v2, 0xd

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->f:Lg2/p;

    .line 21
    .line 22
    new-instance v0, Lg2/p;

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    const-string v5, "version"

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    invoke-direct {v0, v5, v6, v4}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->g:Lg2/p;

    .line 33
    .line 34
    new-instance v0, Lg2/p;

    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    const-string v7, "checksum"

    .line 38
    .line 39
    const/16 v8, 0xb

    .line 40
    .line 41
    invoke-direct {v0, v7, v8, v4}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->h:Lg2/p;

    .line 45
    .line 46
    new-instance v0, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->i:Ljava/util/Map;

    .line 52
    .line 53
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/d$c;

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    invoke-direct {v4, v9}, Lcom/umeng/commonsdk/statistics/proto/d$c;-><init>(Lcom/umeng/commonsdk/statistics/proto/d$a;)V

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
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/d$f;

    .line 65
    .line 66
    invoke-direct {v4, v9}, Lcom/umeng/commonsdk/statistics/proto/d$f;-><init>(Lcom/umeng/commonsdk/statistics/proto/d$a;)V

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
    const-class v4, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 77
    .line 78
    invoke-direct {v0, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    sget-object v4, Lcom/umeng/commonsdk/statistics/proto/d$e;->c:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 82
    .line 83
    new-instance v9, Lcom/umeng/analytics/pro/bc;

    .line 84
    .line 85
    new-instance v10, Lcom/umeng/analytics/pro/bf;

    .line 86
    .line 87
    new-instance v11, Lcom/umeng/analytics/pro/bd;

    .line 88
    .line 89
    invoke-direct {v11, v8}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 90
    .line 91
    .line 92
    new-instance v12, Lcom/umeng/analytics/pro/bh;

    .line 93
    .line 94
    const/16 v13, 0xc

    .line 95
    .line 96
    const-class v14, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 97
    .line 98
    invoke-direct {v12, v13, v14}, Lcom/umeng/analytics/pro/bh;-><init>(BLjava/lang/Class;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v10, v2, v11, v12}, Lcom/umeng/analytics/pro/bf;-><init>(BLcom/umeng/analytics/pro/bd;Lcom/umeng/analytics/pro/bd;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v9, v1, v3, v10}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/d$e;->d:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 111
    .line 112
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 113
    .line 114
    new-instance v4, Lcom/umeng/analytics/pro/bd;

    .line 115
    .line 116
    invoke-direct {v4, v6}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v2, v5, v3, v4}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/d$e;->e:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 126
    .line 127
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 128
    .line 129
    new-instance v4, Lcom/umeng/analytics/pro/bd;

    .line 130
    .line 131
    invoke-direct {v4, v8}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v2, v7, v3, v4}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->j:Ljava/util/Map;

    .line 145
    .line 146
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 147
    .line 148
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bc;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 149
    .line 150
    .line 151
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
    iput-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->d:B

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic C()Lg2/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->e:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic D()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->f:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic E()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->g:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic F()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->h:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

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
    const-string v2, "Required field \'checksum\' was not present! Struct: "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/d;->toString()Ljava/lang/String;

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
    const-string v2, "Required field \'property\' was not present! Struct: "

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/d;->toString()Ljava/lang/String;

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

.method public g(I)Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->b:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->u(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public m(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->i:Ljava/util/Map;

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

.method public n(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public p(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d;->i:Ljava/util/Map;

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
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Imprint("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "property:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

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
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    const-string v3, "version:"

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v3, p0, Lcom/umeng/commonsdk/statistics/proto/d;->b:I

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, "checksum:"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 50
    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :goto_1
    const-string v1, ")"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method

.method public u(Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->d:B

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
    iput-byte p1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->d:B

    .line 9
    .line 10
    return-void
.end method

.method public v()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public w(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public x()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

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

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public z()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/commonsdk/statistics/proto/d;->d:B

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
