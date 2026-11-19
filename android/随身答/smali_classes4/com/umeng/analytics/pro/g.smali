.class public Lcom/umeng/analytics/pro/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/g$a;
    }
.end annotation


# static fields
.field public static volatile e:Lcom/umeng/analytics/pro/g;


# instance fields
.field public a:Lg2/q0;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/List;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg2/r0;

    .line 5
    .line 6
    invoke-direct {v0}, Lg2/r0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/umeng/analytics/pro/g;->a:Lg2/q0;

    .line 10
    .line 11
    return-void
.end method

.method public static b()Lcom/umeng/analytics/pro/g;
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/g;->e:Lcom/umeng/analytics/pro/g;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/umeng/analytics/pro/g;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/g;->e:Lcom/umeng/analytics/pro/g;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/umeng/analytics/pro/g;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/umeng/analytics/pro/g;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/umeng/analytics/pro/g;->e:Lcom/umeng/analytics/pro/g;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lcom/umeng/analytics/pro/g;->e:Lcom/umeng/analytics/pro/g;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-wide p1, v0

    .line 13
    :goto_0
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    :cond_0
    return-wide p1
.end method

.method public c(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p1}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :try_start_0
    const-class v1, Lcom/umeng/analytics/pro/g;

    .line 13
    .line 14
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :try_start_1
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v2, "pre_session_id"

    .line 20
    .line 21
    const-string v3, ""

    .line 22
    .line 23
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    monitor-exit v1

    .line 28
    return-object v0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 32
    :catch_0
    return-object v0
.end method

.method public d(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/umeng/analytics/pro/g;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "SUB"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    new-instance p3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v0, "%0"

    .line 40
    .line 41
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    rsub-int/lit8 p1, p1, 0x20

    .line 49
    .line 50
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, "d"

    .line 54
    .line 55
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/4 p3, 0x0

    .line 63
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lcom/umeng/analytics/pro/g;->d:Ljava/lang/String;

    .line 83
    .line 84
    :cond_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/g;->d:Ljava/lang/String;

    .line 85
    .line 86
    return-object p1
.end method

.method public final e(JJJLjava/lang/String;Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->c:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, Lcom/umeng/analytics/pro/g$a;

    .line 21
    .line 22
    if-eqz p8, :cond_0

    .line 23
    .line 24
    :try_start_0
    iget-object v4, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 25
    .line 26
    move-wide v5, p1

    .line 27
    move-wide v7, p3

    .line 28
    move-wide/from16 v9, p5

    .line 29
    .line 30
    move-object/from16 v3, p7

    .line 31
    .line 32
    invoke-interface/range {v2 .. v10}, Lcom/umeng/analytics/pro/g$a;->a(Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v3, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 37
    .line 38
    move-wide v4, p1

    .line 39
    move-wide v6, p3

    .line 40
    move-wide/from16 v8, p5

    .line 41
    .line 42
    invoke-interface/range {v2 .. v9}, Lcom/umeng/analytics/pro/g$a;->b(Ljava/lang/String;JJJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public f(Lcom/umeng/analytics/pro/g$a;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->c:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/umeng/analytics/pro/g;->c:Ljava/util/List;

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    return-void
.end method

.method public declared-synchronized g(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->j(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    .line 32
    :catch_0
    :cond_1
    :try_start_3
    iget-object p1, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return-object p1

    .line 36
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 37
    throw p1
.end method

.method public h(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    :catch_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 17
    .line 18
    return-object p1
.end method

.method public i(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "session_id"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    :catch_0
    :cond_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 23
    .line 24
    return-object p1
.end method

.method public j(Landroid/content/Context;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->o(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->l(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1

    .line 38
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 39
    return p1
.end method

.method public final k(Landroid/content/Context;)Ljava/lang/String;
    .locals 12

    .line 1
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "pre_session_id"

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->m(Landroid/content/Context;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/g;->n(Landroid/content/Context;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    iget-object v10, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/umeng/analytics/pro/e;->c(Landroid/content/Context;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    const-wide/16 v2, 0x1388

    .line 36
    .line 37
    mul-long v8, v0, v2

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "--->>>*** \u8bfb\u53d6 foreground count \u503c\u5b8c\u6210\uff0ccount\u6b21\u6570\uff1a"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "MobclickRT"

    .line 57
    .line 58
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "header_foreground_count"

    .line 62
    .line 63
    invoke-static {v0}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-static {}, Ln2/c;->e()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    const-string v0, "--->>>*** \u8bfb\u53d6 foreground count druation\u503c\u5b8c\u6210\uff0c\u7ec8\u6b62checker timer."

    .line 76
    .line 77
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Ln2/c;->k()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const-string v0, "--->>>*** \u8bfb\u53d6 foreground count druation\u503c\u5b8c\u6210\uff0c\u65e0\u672a\u5904\u7406check timer\u4e8b\u4ef6\u3002"

    .line 85
    .line 86
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string v0, "--->>>*** foreground count druation\u4e91\u63a7\u53c2\u6570\u5173\u95ed\u3002"

    .line 91
    .line 92
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    const/4 v11, 0x0

    .line 96
    move-object v3, p0

    .line 97
    invoke-virtual/range {v3 .. v11}, Lcom/umeng/analytics/pro/g;->e(JJJLjava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v3, Lcom/umeng/analytics/pro/g;->a:Lg2/q0;

    .line 101
    .line 102
    invoke-interface {v0, p1}, Lg2/q0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, v3, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 107
    .line 108
    const/4 v11, 0x1

    .line 109
    invoke-virtual/range {v3 .. v11}, Lcom/umeng/analytics/pro/g;->e(JJJLjava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v3, Lcom/umeng/analytics/pro/g;->a:Lg2/q0;

    .line 113
    .line 114
    iget-object v1, v3, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 115
    .line 116
    invoke-interface {v0, p1, v1}, Lg2/q0;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v3, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 120
    .line 121
    return-object p1
.end method

.method public final l(Landroid/content/Context;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/umeng/analytics/pro/g;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/h;->a(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long p1, v2, v4

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    return v1
.end method

.method public final m(Landroid/content/Context;)J
    .locals 2

    .line 1
    const-string v0, "a_end_time"

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/pro/g;->a(Landroid/content/Context;Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final n(Landroid/content/Context;)J
    .locals 2

    .line 1
    const-string v0, "session_start_time"

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/pro/g;->a(Landroid/content/Context;Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final o(Landroid/content/Context;)Z
    .locals 10

    .line 1
    invoke-static {p1}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "a_start_time"

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    const-string v1, "a_end_time"

    .line 18
    .line 19
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-string v6, "header_foreground_count"

    .line 24
    .line 25
    invoke-static {v6}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    const-string v7, "MobclickRT"

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    cmp-long v6, v4, v2

    .line 34
    .line 35
    if-lez v6, :cond_0

    .line 36
    .line 37
    cmp-long v6, v0, v2

    .line 38
    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    :try_start_1
    invoke-static {p1}, Lcom/umeng/analytics/pro/e;->c(Landroid/content/Context;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    cmp-long p1, v8, v2

    .line 46
    .line 47
    if-lez p1, :cond_0

    .line 48
    .line 49
    const-wide/16 v0, 0x1388

    .line 50
    .line 51
    mul-long/2addr v8, v0

    .line 52
    const-string p1, "--->>> last session end time stamp = 0, reconstruct it by foreground count value."

    .line 53
    .line 54
    invoke-static {v7, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    add-long v0, v4, v8

    .line 58
    .line 59
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "--->>> interval of last session is: "

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    sub-long v2, v0, v4

    .line 70
    .line 71
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {v7, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/umeng/analytics/pro/g;->a:Lg2/q0;

    .line 82
    .line 83
    invoke-interface {p1, v4, v5, v0, v1}, Lg2/q0;->c(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    return p1

    .line 88
    :catch_0
    const/4 p1, 0x0

    .line 89
    return p1
.end method
