.class Lt0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Ls0/c$a;

.field private final d:Z

.field private final e:Ljava/lang/Object;

.field private f:Lt0/b$a;

.field private g:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ls0/c$a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt0/b;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lt0/b;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lt0/b;->c:Ls0/c$a;

    .line 5
    iput-boolean p4, p0, Lt0/b;->d:Z

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/b;->e:Ljava/lang/Object;

    return-void
.end method

.method private a()Lt0/b$a;
    .locals 6

    .line 1
    iget-object v0, p0, Lt0/b;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lt0/b;->f:Lt0/b$a;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Lt0/a;

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    iget-object v2, p0, Lt0/b;->b:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lt0/b;->d:Z

    if-eqz v2, :cond_0

    .line 4
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lt0/b;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v3

    iget-object v4, p0, Lt0/b;->b:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    new-instance v3, Lt0/b$a;

    iget-object v4, p0, Lt0/b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lt0/b;->c:Ls0/c$a;

    invoke-direct {v3, v4, v2, v1, v5}, Lt0/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lt0/a;Ls0/c$a;)V

    iput-object v3, p0, Lt0/b;->f:Lt0/b$a;

    goto :goto_0

    .line 6
    :cond_0
    new-instance v2, Lt0/b$a;

    iget-object v3, p0, Lt0/b;->a:Landroid/content/Context;

    iget-object v4, p0, Lt0/b;->b:Ljava/lang/String;

    iget-object v5, p0, Lt0/b;->c:Ls0/c$a;

    invoke-direct {v2, v3, v4, v1, v5}, Lt0/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lt0/a;Ls0/c$a;)V

    iput-object v2, p0, Lt0/b;->f:Lt0/b$a;

    .line 7
    :goto_0
    iget-object v1, p0, Lt0/b;->f:Lt0/b$a;

    iget-boolean v2, p0, Lt0/b;->g:Z

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 8
    :cond_1
    iget-object v1, p0, Lt0/b;->f:Lt0/b$a;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public F()Ls0/b;
    .locals 1

    invoke-direct {p0}, Lt0/b;->a()Lt0/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lt0/b$a;->d()Ls0/b;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    invoke-direct {p0}, Lt0/b;->a()Lt0/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lt0/b$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt0/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/b;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lt0/b;->f:Lt0/b$a;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 4
    :cond_0
    iput-boolean p1, p0, Lt0/b;->g:Z

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
