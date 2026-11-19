.class public final Lcom/zykj/satisfaction/MyApplication;
.super Landroid/app/Application;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    invoke-virtual {v0, p0}, Lb/d/a/b/b;->e(Landroid/app/Application;)V

    return-void
.end method

.method public onTerminate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    invoke-virtual {v0}, Lb/d/a/b/b;->f()V

    return-void
.end method
