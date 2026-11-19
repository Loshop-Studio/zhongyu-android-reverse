.class public abstract Lcom/zykj/study/Hilt_MyApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lk6/b;


# instance fields
.field private final componentManager:Li6/d;

.field private injected:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/zykj/study/Hilt_MyApplication;->injected:Z

    .line 6
    .line 7
    new-instance v0, Li6/d;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/study/Hilt_MyApplication$a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/zykj/study/Hilt_MyApplication$a;-><init>(Lcom/zykj/study/Hilt_MyApplication;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Li6/d;-><init>(Li6/e;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/study/Hilt_MyApplication;->componentManager:Li6/d;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final componentManager()Li6/d;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/zykj/study/Hilt_MyApplication;->componentManager:Li6/d;

    return-object v0
.end method

.method public bridge synthetic componentManager()Lk6/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/Hilt_MyApplication;->componentManager()Li6/d;

    move-result-object v0

    return-object v0
.end method

.method public final generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/Hilt_MyApplication;->componentManager()Li6/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li6/d;->generatedComponent()Ljava/lang/Object;

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
    iget-boolean v0, p0, Lcom/zykj/study/Hilt_MyApplication;->injected:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/zykj/study/Hilt_MyApplication;->injected:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/study/Hilt_MyApplication;->generatedComponent()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lm4/c;

    .line 13
    .line 14
    invoke-static {p0}, Lk6/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/study/MyApplication;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lm4/c;->b(Lcom/zykj/study/MyApplication;)V

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
    invoke-virtual {p0}, Lcom/zykj/study/Hilt_MyApplication;->hiltInternalInject()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
