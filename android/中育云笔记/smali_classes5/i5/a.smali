.class public Li5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String; = "a"

.field public static final f:Ljava/util/Map;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Li5/c;

.field public final c:Li5/c;

.field public final d:Lk5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li5/a;->f:Ljava/util/Map;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Li5/c;Li5/c;Lk5/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Li5/a;->a:Ljava/util/Map;

    .line 12
    .line 13
    iput-object p2, p0, Li5/a;->c:Li5/c;

    .line 14
    .line 15
    iput-object p1, p0, Li5/a;->b:Li5/c;

    .line 16
    .line 17
    iput-object p3, p0, Li5/a;->d:Lk5/g;

    .line 18
    .line 19
    invoke-virtual {p3, p0}, Lk5/g;->d(Li5/a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()Li5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Li5/a;->b:Li5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0, v0, p4}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Li5/a;->f:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Map;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, p1, p3, p4, p2}, Li5/a;->d(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/b;Landroid/content/Context;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/Map;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    :goto_0
    sget-object p1, Li5/a;->e:Ljava/lang/String;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string p3, "Cache size is: "

    .line 41
    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p1, p2}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    return-object p1
.end method

.method public c(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0, v0, p2}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iget-object p2, p0, Li5/a;->b:Li5/c;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "time"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "0"

    .line 26
    .line 27
    invoke-virtual {p2, v0, v2}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Li5/a;->a:Ljava/util/Map;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object p2, Li5/a;->f:Ljava/util/Map;

    .line 51
    .line 52
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object v0, Li5/a;->e:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v2, "Cache size is: "

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {v0, p2}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, Li5/a;->d:Lk5/g;

    .line 82
    .line 83
    invoke-virtual {p2, p1}, Lk5/g;->e(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final d(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/b;Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0, v0, p3}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, p0, Li5/a;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-static {v1}, Ln5/e;->a(Ljava/lang/Long;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-virtual {p2, p1}, Li5/b;->a(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-wide/32 v2, 0x493e0

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2, v3}, Ln5/e;->b(Ljava/lang/Long;J)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance v3, Lm5/c;

    .line 35
    .line 36
    invoke-direct {v3, p1, p3}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Li5/a;->d:Lk5/g;

    .line 40
    .line 41
    iget-object v6, p0, Li5/a;->c:Li5/c;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v7, -0x1

    .line 45
    move-object v5, p4

    .line 46
    invoke-virtual/range {v2 .. v7}, Lk5/g;->h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p2, v0}, Li5/b;->a(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final e(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Landroid/content/Context;)V
    .locals 6

    .line 1
    iget-object v0, p0, Li5/a;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/Long;

    .line 8
    .line 9
    const-wide/32 v0, 0x493e0

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0, v1}, Ln5/e;->b(Ljava/lang/Long;J)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    new-instance v1, Lm5/c;

    .line 19
    .line 20
    invoke-direct {v1, p1, p3}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Li5/a;->d:Lk5/g;

    .line 24
    .line 25
    iget-object v4, p0, Li5/a;->c:Li5/c;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v5, -0x1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual/range {v0 .. v5}, Lk5/g;->h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public f(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Lk5/d;Landroid/content/Context;Lm5/c;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lk5/d;->t()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    sget-object p1, Li5/a;->e:Ljava/lang/String;

    .line 9
    .line 10
    const-string p2, "update cache from server failed"

    .line 11
    .line 12
    invoke-static {p1, p2}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p4}, Lm5/c;->e()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    if-nez p4, :cond_3

    .line 25
    .line 26
    const/4 p4, 0x1

    .line 27
    invoke-virtual {p1, p4, p4, p3}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p2}, Lk5/d;->B()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    iget-object p3, p0, Li5/a;->b:Li5/c;

    .line 38
    .line 39
    const-string p4, ""

    .line 40
    .line 41
    invoke-virtual {p3, p1, p4}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    sget-object p4, Li5/a;->f:Ljava/util/Map;

    .line 46
    .line 47
    invoke-static {p3}, Lh5/a;->e(Ljava/lang/String;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-interface {p4, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object p3, p0, Li5/a;->b:Li5/c;

    .line 56
    .line 57
    invoke-virtual {p2}, Lk5/d;->y()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    invoke-virtual {p3, p1, p4}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sget-object p3, Li5/a;->f:Ljava/util/Map;

    .line 65
    .line 66
    invoke-virtual {p2}, Lk5/d;->y()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    invoke-static {p4}, Lh5/a;->e(Ljava/lang/String;)Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    invoke-interface {p3, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-virtual {p2}, Lk5/d;->r()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-nez p3, :cond_2

    .line 86
    .line 87
    iget-object p3, p0, Li5/a;->b:Li5/c;

    .line 88
    .line 89
    new-instance p4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v0, "ETag"

    .line 98
    .line 99
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    invoke-virtual {p2}, Lk5/d;->r()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p3, p4, v0}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    iget-object p3, p0, Li5/a;->b:Li5/c;

    .line 114
    .line 115
    new-instance p4, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v0, "time"

    .line 124
    .line 125
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    invoke-virtual {p2}, Lk5/d;->a()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p3, p4, v0}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object p3, p0, Li5/a;->a:Ljava/util/Map;

    .line 140
    .line 141
    invoke-virtual {p2}, Lk5/d;->a()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    iget-object p1, p0, Li5/a;->b:Li5/c;

    .line 158
    .line 159
    invoke-virtual {p2}, Lk5/d;->y()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    const-string p4, "geoipCountryCode"

    .line 164
    .line 165
    invoke-virtual {p1, p4, p3}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Li5/a;->b:Li5/c;

    .line 169
    .line 170
    invoke-virtual {p2}, Lk5/d;->a()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    const-string p3, "geoipCountryCodetime"

    .line 175
    .line 176
    invoke-virtual {p1, p3, p2}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :goto_1
    sget-object p1, Li5/a;->e:Ljava/lang/String;

    .line 180
    .line 181
    new-instance p2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string p3, "Cache size is: "

    .line 187
    .line 188
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    sget-object p3, Li5/a;->f:Ljava/util/Map;

    .line 192
    .line 193
    invoke-interface {p3}, Ljava/util/Map;->size()I

    .line 194
    .line 195
    .line 196
    move-result p3

    .line 197
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-static {p1, p2}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public g()Lk5/g;
    .locals 1

    .line 1
    iget-object v0, p0, Li5/a;->d:Lk5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0, v0, p2}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Li5/a;->b:Li5/c;

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    invoke-virtual {v1, v0, v2}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Li5/a;->b:Li5/c;

    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v4, "time"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, "0"

    .line 34
    .line 35
    invoke-virtual {v2, v3, v4}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    const-string v3, "\\d+"

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v2

    .line 61
    sget-object v3, Li5/a;->e:Ljava/lang/String;

    .line 62
    .line 63
    const-string v6, "convert urlParamKey from String to Long catch NumberFormatException."

    .line 64
    .line 65
    invoke-static {v3, v6, v2}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    :goto_0
    sget-object v2, Li5/a;->f:Ljava/util/Map;

    .line 69
    .line 70
    invoke-static {v1}, Lh5/a;->e(Ljava/lang/String;)Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget-object v1, Li5/a;->e:Ljava/lang/String;

    .line 78
    .line 79
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v6, "Cache size is: "

    .line 85
    .line 86
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v1, v2}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, Li5/a;->a:Ljava/util/Map;

    .line 104
    .line 105
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p1, v0, p2}, Li5/a;->e(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public i()Li5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Li5/a;->c:Li5/c;

    .line 2
    .line 3
    return-object v0
.end method
