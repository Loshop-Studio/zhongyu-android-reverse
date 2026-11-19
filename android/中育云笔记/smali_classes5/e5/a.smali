.class public abstract Le5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "subjectId"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Le5/b;->f(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Le5/b;->f(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Ls5/g;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Le5/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ls5/g;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "_proxy_init"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Le5/b;->d(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static f(Landroid/content/Context;)[Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "subjectId"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Le5/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    new-array p0, p0, [Ljava/lang/String;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, ","

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Ls5/d;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "main process name: "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, ", current process name: "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "BaseUtils"

    .line 37
    .line 38
    invoke-static {v2, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ls5/g;->k(Landroid/content/Context;)Ls5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Ls5/g;->n(Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method
