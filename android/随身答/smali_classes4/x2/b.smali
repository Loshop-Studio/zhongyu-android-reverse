.class public Lx2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/b$b;
    }
.end annotation


# static fields
.field public static h:Landroid/content/Context;


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:J

.field public f:J

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x36ee80

    .line 3
    iput v0, p0, Lx2/b;->a:I

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lx2/b;->f:J

    .line 5
    iput-wide v0, p0, Lx2/b;->g:J

    .line 6
    invoke-virtual {p0}, Lx2/b;->f()V

    return-void
.end method

.method public synthetic constructor <init>(Lx2/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx2/b;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lx2/b;
    .locals 1

    .line 1
    sget-object v0, Lx2/b;->h:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Lx2/b;->h:Landroid/content/Context;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "inside StatTracer. please check context. context must not be null!"

    .line 15
    .line 16
    invoke-static {p0}, Lv2/d;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    sget-object p0, Lx2/b$b;->a:Lx2/b;

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx2/b;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx2/b;->j(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx2/b;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx2/b;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f()V
    .locals 6

    .line 1
    sget-object v0, Lx2/b;->h:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "successful_request"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, p0, Lx2/b;->b:I

    .line 15
    .line 16
    const-string v1, "failed_requests "

    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Lx2/b;->c:I

    .line 23
    .line 24
    const-string v1, "last_request_spent_ms"

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, p0, Lx2/b;->d:I

    .line 31
    .line 32
    const-string v1, "last_request_time"

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iput-wide v4, p0, Lx2/b;->e:J

    .line 41
    .line 42
    const-string v1, "last_req"

    .line 43
    .line 44
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iput-wide v0, p0, Lx2/b;->f:J

    .line 49
    .line 50
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget v0, p0, Lx2/b;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lx2/b;->c:I

    .line 6
    .line 7
    return-void
.end method

.method public h()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lx2/b;->f:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    iput v0, p0, Lx2/b;->d:I

    .line 10
    .line 11
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lx2/b;->f:J

    .line 6
    .line 7
    return-void
.end method

.method public j(Z)V
    .locals 2

    .line 1
    iget v0, p0, Lx2/b;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lx2/b;->b:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lx2/b;->f:J

    .line 10
    .line 11
    iput-wide v0, p0, Lx2/b;->e:J

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public k()V
    .locals 4

    .line 1
    sget-object v0, Lx2/b;->h:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "successful_request"

    .line 12
    .line 13
    iget v2, p0, Lx2/b;->b:I

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "failed_requests "

    .line 20
    .line 21
    iget v2, p0, Lx2/b;->c:I

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "last_request_spent_ms"

    .line 28
    .line 29
    iget v2, p0, Lx2/b;->d:I

    .line 30
    .line 31
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "last_req"

    .line 36
    .line 37
    iget-wide v2, p0, Lx2/b;->f:J

    .line 38
    .line 39
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "last_request_time"

    .line 44
    .line 45
    iget-wide v2, p0, Lx2/b;->e:J

    .line 46
    .line 47
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 52
    .line 53
    .line 54
    return-void
.end method
