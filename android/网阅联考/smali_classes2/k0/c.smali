.class public abstract Lk0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lk0/a;

.field public static b:Ljava/lang/String;

.field public static c:Z

.field public static d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk0/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lk0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk0/c;->a:Lk0/a;

    .line 7
    .line 8
    const-string v0, "[XUI]"

    .line 9
    .line 10
    sput-object v0, Lk0/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    sput-boolean v0, Lk0/c;->c:Z

    .line 14
    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    sput v0, Lk0/c;->d:I

    .line 18
    .line 19
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lk0/c;->e(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lk0/c;->a:Lk0/a;

    .line 9
    .line 10
    sget-object v2, Lk0/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-interface {v1, v0, v2, p0, v3}, Lk0/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lk0/c;->e(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lk0/c;->a:Lk0/a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {v1, v0, p0, p1, v2}, Lk0/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {v0}, Lk0/c;->e(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lk0/c;->a:Lk0/a;

    .line 9
    .line 10
    sget-object v2, Lk0/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-interface {v1, v0, v2, p0, v3}, Lk0/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {v0}, Lk0/c;->e(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lk0/c;->a:Lk0/a;

    .line 9
    .line 10
    sget-object v2, Lk0/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-interface {v1, v0, v2, v3, p0}, Lk0/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static e(I)Z
    .locals 1

    .line 1
    sget-object v0, Lk0/c;->a:Lk0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lk0/c;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Lk0/c;->d:I

    .line 10
    .line 11
    if-lt p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    return p0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Lk0/c;->e(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lk0/c;->a:Lk0/a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {v1, v0, p0, p1, v2}, Lk0/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
