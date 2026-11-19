.class public abstract Lcom/zykj/huiwei/launcher/app/Hilt_App;
.super Lcom/zykj/base/BaseApplication;
.source "SourceFile"

# interfaces
.implements Lz4/c;


# instance fields
.field private final componentManager:Lx4/d;

.field private injected:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseApplication;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/app/Hilt_App;->injected:Z

    .line 6
    .line 7
    new-instance v0, Lx4/d;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/huiwei/launcher/app/Hilt_App$a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App$a;-><init>(Lcom/zykj/huiwei/launcher/app/Hilt_App;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lx4/d;-><init>(Lx4/f;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/app/Hilt_App;->componentManager:Lx4/d;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final componentManager()Lx4/d;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/Hilt_App;->componentManager:Lx4/d;

    return-object v0
.end method

.method public bridge synthetic componentManager()Lz4/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App;->componentManager()Lx4/d;

    move-result-object v0

    return-object v0
.end method

.method public final generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App;->componentManager()Lx4/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lx4/d;->generatedComponent()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public hiltInternalInject()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/huiwei/launcher/app/Hilt_App;->injected:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/zykj/huiwei/launcher/app/Hilt_App;->injected:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App;->generatedComponent()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lr3/b;

    .line 13
    .line 14
    invoke-static {p0}, Lz4/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/huiwei/launcher/app/App;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lr3/b;->c(Lcom/zykj/huiwei/launcher/app/App;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 0
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/Hilt_App;->hiltInternalInject()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lcom/zykj/base/BaseApplication;->onCreate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
