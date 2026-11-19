.class Lcom/alibaba/sdk/android/emas/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/sdk/android/emas/g$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/alibaba/sdk/android/emas/g;->d:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/g;->a:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a(Lcom/alibaba/sdk/android/emas/g$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/g;->c:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/sdk/android/emas/g;->c:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/g;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/alibaba/sdk/android/emas/g;->d:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    add-int/2addr p1, v0

    .line 5
    iput p1, p0, Lcom/alibaba/sdk/android/emas/g;->d:I

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/alibaba/sdk/android/emas/g;->a:Z

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/g;->a:Z

    .line 12
    .line 13
    iget-object p1, p0, Lcom/alibaba/sdk/android/emas/g;->c:Ljava/util/List;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/alibaba/sdk/android/emas/g$a;

    .line 32
    .line 33
    invoke-interface {v0}, Lcom/alibaba/sdk/android/emas/g$a;->b()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/alibaba/sdk/android/emas/g;->d:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Lcom/alibaba/sdk/android/emas/g;->d:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/g;->a:Z

    .line 11
    .line 12
    iget-object p1, p0, Lcom/alibaba/sdk/android/emas/g;->c:Ljava/util/List;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/alibaba/sdk/android/emas/g$a;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/alibaba/sdk/android/emas/g$a;->c()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method
