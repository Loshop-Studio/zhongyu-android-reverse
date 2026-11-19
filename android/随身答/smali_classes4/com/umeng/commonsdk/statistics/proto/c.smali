.class public Lcom/umeng/commonsdk/statistics/proto/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/aq;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/proto/c$d;,
        Lcom/umeng/commonsdk/statistics/proto/c$f;,
        Lcom/umeng/commonsdk/statistics/proto/c$b;,
        Lcom/umeng/commonsdk/statistics/proto/c$c;,
        Lcom/umeng/commonsdk/statistics/proto/c$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/aq<",
        "Lcom/umeng/commonsdk/statistics/proto/c;",
        "Lcom/umeng/commonsdk/statistics/proto/c$e;",
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

.field public b:Ljava/util/List;

.field public c:Ljava/lang/String;

.field public d:[Lcom/umeng/commonsdk/statistics/proto/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, "IdTracking"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->e:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const-string v1, "snapshots"

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
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->f:Lg2/p;

    .line 21
    .line 22
    new-instance v0, Lg2/p;

    .line 23
    .line 24
    const-string v4, "journals"

    .line 25
    .line 26
    const/16 v5, 0xf

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-direct {v0, v4, v5, v6}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->g:Lg2/p;

    .line 33
    .line 34
    new-instance v0, Lg2/p;

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    const-string v8, "checksum"

    .line 38
    .line 39
    const/16 v9, 0xb

    .line 40
    .line 41
    invoke-direct {v0, v8, v9, v7}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->h:Lg2/p;

    .line 45
    .line 46
    new-instance v0, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->i:Ljava/util/Map;

    .line 52
    .line 53
    new-instance v7, Lcom/umeng/commonsdk/statistics/proto/c$c;

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    invoke-direct {v7, v10}, Lcom/umeng/commonsdk/statistics/proto/c$c;-><init>(Lcom/umeng/commonsdk/statistics/proto/c$a;)V

    .line 57
    .line 58
    .line 59
    const-class v11, Lg2/x;

    .line 60
    .line 61
    invoke-interface {v0, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v7, Lcom/umeng/commonsdk/statistics/proto/c$f;

    .line 65
    .line 66
    invoke-direct {v7, v10}, Lcom/umeng/commonsdk/statistics/proto/c$f;-><init>(Lcom/umeng/commonsdk/statistics/proto/c$a;)V

    .line 67
    .line 68
    .line 69
    const-class v10, Lg2/z;

    .line 70
    .line 71
    invoke-interface {v0, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/EnumMap;

    .line 75
    .line 76
    const-class v7, Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 77
    .line 78
    invoke-direct {v0, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    sget-object v7, Lcom/umeng/commonsdk/statistics/proto/c$e;->c:Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 82
    .line 83
    new-instance v10, Lcom/umeng/analytics/pro/bc;

    .line 84
    .line 85
    new-instance v11, Lcom/umeng/analytics/pro/bf;

    .line 86
    .line 87
    new-instance v12, Lcom/umeng/analytics/pro/bd;

    .line 88
    .line 89
    invoke-direct {v12, v9}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 90
    .line 91
    .line 92
    new-instance v13, Lcom/umeng/analytics/pro/bh;

    .line 93
    .line 94
    const-class v14, Lcom/umeng/commonsdk/statistics/proto/b;

    .line 95
    .line 96
    const/16 v15, 0xc

    .line 97
    .line 98
    invoke-direct {v13, v15, v14}, Lcom/umeng/analytics/pro/bh;-><init>(BLjava/lang/Class;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v11, v2, v12, v13}, Lcom/umeng/analytics/pro/bf;-><init>(BLcom/umeng/analytics/pro/bd;Lcom/umeng/analytics/pro/bd;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v10, v1, v3, v11}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/c$e;->d:Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 111
    .line 112
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 113
    .line 114
    new-instance v3, Lcom/umeng/analytics/pro/be;

    .line 115
    .line 116
    new-instance v7, Lcom/umeng/analytics/pro/bh;

    .line 117
    .line 118
    const-class v10, Lcom/umeng/commonsdk/statistics/proto/a;

    .line 119
    .line 120
    invoke-direct {v7, v15, v10}, Lcom/umeng/analytics/pro/bh;-><init>(BLjava/lang/Class;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v3, v5, v7}, Lcom/umeng/analytics/pro/be;-><init>(BLcom/umeng/analytics/pro/bd;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v2, v4, v6, v3}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/c$e;->e:Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 133
    .line 134
    new-instance v2, Lcom/umeng/analytics/pro/bc;

    .line 135
    .line 136
    new-instance v3, Lcom/umeng/analytics/pro/bd;

    .line 137
    .line 138
    invoke-direct {v3, v9}, Lcom/umeng/analytics/pro/bd;-><init>(B)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v2, v8, v6, v3}, Lcom/umeng/analytics/pro/bc;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/bd;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->j:Ljava/util/Map;

    .line 152
    .line 153
    const-class v1, Lcom/umeng/commonsdk/statistics/proto/c;

    .line 154
    .line 155
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/bc;->a(Ljava/lang/Class;Ljava/util/Map;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c$e;->d:Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 5
    .line 6
    sget-object v1, Lcom/umeng/commonsdk/statistics/proto/c$e;->e:Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 7
    .line 8
    filled-new-array {v0, v1}, [Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/c;->d:[Lcom/umeng/commonsdk/statistics/proto/c$e;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic A()Lg2/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->e:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic B()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->f:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic C()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->g:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic D()Lg2/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->h:Lg2/p;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public g(Ljava/util/List;)Lcom/umeng/commonsdk/statistics/proto/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->i:Ljava/util/Map;

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

.method public n(Ljava/util/Map;)Lcom/umeng/commonsdk/statistics/proto/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public p(Lg2/s;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/c;->i:Ljava/util/Map;

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
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 5
    .line 6
    :cond_0
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
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

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
    const-string v1, "IdTracking("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "snapshots:"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

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
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/c;->x()Z

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
    const-string v1, "journals:"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

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
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/c;->y()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, "checksum:"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_2
    const-string v1, ")"

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0
.end method

.method public u()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public v(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public w()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

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

.method public y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

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

.method public z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

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
    const-string v2, "Required field \'snapshots\' was not present! Struct: "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/c;->toString()Ljava/lang/String;

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
