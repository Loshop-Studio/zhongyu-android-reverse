.class public final Ll2/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;

.field public b:Z

.field public final synthetic c:Ll2/d$a;


# direct methods
.method public constructor <init>(Ll2/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ll2/d$a$a;->a:Ljava/util/Map;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Ll2/d$a$a;->b:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;J)Ll2/b$a;
    .locals 1

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Ll2/d$a$a;->a:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ll2/b$a;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ll2/d$a$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Ll2/b$a;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Ll2/d$a$a;->b:Z

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-object p0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    throw v0
.end method

.method public commit()Z
    .locals 9

    .line 1
    invoke-static {}, Ll2/d;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 7
    .line 8
    invoke-static {v1}, Ll2/d$a;->c(Ll2/d$a;)Ljava/util/WeakHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    move v1, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    if-eqz v1, :cond_1

    .line 24
    .line 25
    new-instance v4, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v5, Ljava/util/HashSet;

    .line 31
    .line 32
    iget-object v6, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 33
    .line 34
    invoke-static {v6}, Ll2/d$a;->c(Ll2/d$a;)Ljava/util/WeakHashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :cond_1
    const/4 v4, 0x0

    .line 50
    move-object v5, v4

    .line 51
    :goto_1
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :try_start_1
    iget-boolean v6, p0, Ll2/d$a$a;->b:Z

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    iget-object v6, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 57
    .line 58
    invoke-static {v6}, Ll2/d$a;->b(Ll2/d$a;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-interface {v6}, Ljava/util/Map;->clear()V

    .line 63
    .line 64
    .line 65
    iput-boolean v2, p0, Ll2/d$a$a;->b:Z

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_2
    :goto_2
    iget-object v2, p0, Ll2/d$a$a;->a:Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :cond_3
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ljava/util/Map$Entry;

    .line 92
    .line 93
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    if-ne v6, p0, :cond_4

    .line 104
    .line 105
    iget-object v6, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 106
    .line 107
    invoke-static {v6}, Ll2/d$a;->b(Ll2/d$a;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-interface {v6, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    iget-object v8, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 116
    .line 117
    invoke-static {v8}, Ll2/d$a;->b(Ll2/d$a;)Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-interface {v8, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :goto_4
    if-eqz v1, :cond_3

    .line 125
    .line 126
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    iget-object v2, p0, Ll2/d$a$a;->a:Ljava/util/Map;

    .line 131
    .line 132
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 133
    .line 134
    .line 135
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 136
    :try_start_2
    iget-object v2, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 137
    .line 138
    invoke-static {v2}, Ll2/d$a;->e(Ll2/d$a;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_6

    .line 143
    .line 144
    iget-object v6, p0, Ll2/d$a$a;->c:Ll2/d$a;

    .line 145
    .line 146
    invoke-virtual {v6, v3}, Ll2/d$a;->f(Z)V

    .line 147
    .line 148
    .line 149
    :cond_6
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    sub-int/2addr v0, v3

    .line 157
    :goto_5
    if-ltz v0, :cond_8

    .line 158
    .line 159
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ljava/lang/String;

    .line 164
    .line 165
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_7

    .line 174
    .line 175
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v3}, Lk/r;->a(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_7
    add-int/lit8 v0, v0, -0x1

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    return v2

    .line 187
    :goto_7
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 188
    :try_start_4
    throw v1

    .line 189
    :goto_8
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 190
    throw v1
.end method
