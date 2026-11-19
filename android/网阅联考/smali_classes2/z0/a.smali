.class public Lz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La1/b;


# static fields
.field public static volatile b:Lz0/a;


# instance fields
.field public volatile a:La1/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La1/a;

    .line 5
    .line 6
    invoke-direct {v0}, La1/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz0/a;->a:La1/b;

    .line 10
    .line 11
    return-void
.end method

.method public static e()Lz0/a;
    .locals 2

    .line 1
    sget-object v0, Lz0/a;->b:Lz0/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lz0/a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lz0/a;->b:Lz0/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lz0/a;

    .line 13
    .line 14
    invoke-direct {v1}, Lz0/a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lz0/a;->b:Lz0/a;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lz0/a;->b:Lz0/a;

    .line 25
    .line 26
    return-object v0
.end method


# virtual methods
.method public a(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;La1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a;->a:La1/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, La1/b;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;La1/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a;->a:La1/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La1/b;->b(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a;->a:La1/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La1/b;->c(Landroidx/fragment/app/Fragment;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;La1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a;->a:La1/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, La1/b;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;La1/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
