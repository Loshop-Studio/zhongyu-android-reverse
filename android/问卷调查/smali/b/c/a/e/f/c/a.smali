.class public Lb/c/a/e/f/c/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/e/f/c/d/b;


# static fields
.field public static volatile b:Lb/c/a/e/f/c/a;


# instance fields
.field public volatile a:Lb/c/a/e/f/c/d/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb/c/a/e/f/c/d/a;

    invoke-direct {v0}, Lb/c/a/e/f/c/d/a;-><init>()V

    iput-object v0, p0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    return-void
.end method

.method public static e()Lb/c/a/e/f/c/a;
    .locals 2

    sget-object v0, Lb/c/a/e/f/c/a;->b:Lb/c/a/e/f/c/a;

    if-nez v0, :cond_1

    const-class v0, Lb/c/a/e/f/c/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lb/c/a/e/f/c/a;->b:Lb/c/a/e/f/c/a;

    if-nez v1, :cond_0

    new-instance v1, Lb/c/a/e/f/c/a;

    invoke-direct {v1}, Lb/c/a/e/f/c/a;-><init>()V

    sput-object v1, Lb/c/a/e/f/c/a;->b:Lb/c/a/e/f/c/a;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lb/c/a/e/f/c/a;->b:Lb/c/a/e/f/c/a;

    return-object v0
.end method


# virtual methods
.method public a(La/k/b/m;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, p1}, Lb/c/a/e/f/c/d/b;->a(La/k/b/m;)V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, p1}, Lb/c/a/e/f/c/d/b;->b(Landroid/content/Context;)V

    return-void
.end method

.method public c(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lb/c/a/e/f/c/d/b;->c(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V

    return-void
.end method

.method public d(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lb/c/a/e/f/c/d/b;->d(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V

    return-void
.end method
