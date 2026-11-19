.class public abstract Lr5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lr5/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static declared-synchronized a()Lr5/l1;
    .locals 2

    .line 1
    const-class v0, Lr5/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr5/d;->a:Lr5/l1;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lr5/x0;->d()Lr5/x0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lr5/x0;->c()Lr5/l1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lr5/d;->a:Lr5/l1;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    sget-object v1, Lr5/d;->a:Lr5/l1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1
.end method

.method public static b(ILjava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 1
    invoke-static {}, Lr5/d;->a()Lr5/l1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lr5/w0;->b()Lr5/w0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lr5/w0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string p2, "Data type no longer collects range.type: "

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "hmsSdk"

    .line 41
    .line 42
    invoke-static {p1, p0}, Lr5/f1;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    :goto_0
    sget-object v0, Lr5/d;->a:Lr5/l1;

    .line 47
    .line 48
    invoke-virtual {v0, p0, p1, p2}, Lr5/l1;->b(ILjava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lr5/d;->a()Lr5/l1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lr5/d;->a:Lr5/l1;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1, p2}, Lr5/l1;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static d(ILjava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 1
    invoke-static {}, Lr5/d;->a()Lr5/l1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lr5/w0;->b()Lr5/w0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lr5/w0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string p2, "Data type no longer collects range.type: "

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "hmsSdk"

    .line 41
    .line 42
    invoke-static {p1, p0}, Lr5/f1;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    :goto_0
    sget-object v0, Lr5/d;->a:Lr5/l1;

    .line 47
    .line 48
    invoke-virtual {v0, p0, p1, p2}, Lr5/l1;->f(ILjava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public static e()Z
    .locals 1

    .line 1
    invoke-static {}, Lr5/x0;->d()Lr5/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr5/x0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public static f()V
    .locals 2

    .line 1
    invoke-static {}, Lr5/d;->a()Lr5/l1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lr5/w0;->b()Lr5/w0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lr5/w0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lr5/d;->a:Lr5/l1;

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {v0, v1}, Lr5/l1;->a(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
