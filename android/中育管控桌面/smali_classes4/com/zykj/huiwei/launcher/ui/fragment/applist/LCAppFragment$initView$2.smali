.class public final Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$2;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment;->initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "com/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$2",
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        "oldItem",
        "newItem",
        "",
        "b",
        "(Lcom/zykj/huiwei/launcher/bean/resp/AppData;Lcom/zykj/huiwei/launcher/bean/resp/AppData;)Z",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/huiwei/launcher/bean/resp/AppData;Lcom/zykj/huiwei/launcher/bean/resp/AppData;)Z
    .locals 2

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getSort()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getSort()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-ne p1, p2, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$2;->a(Lcom/zykj/huiwei/launcher/bean/resp/AppData;Lcom/zykj/huiwei/launcher/bean/resp/AppData;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment$initView$2;->b(Lcom/zykj/huiwei/launcher/bean/resp/AppData;Lcom/zykj/huiwei/launcher/bean/resp/AppData;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b(Lcom/zykj/huiwei/launcher/bean/resp/AppData;Lcom/zykj/huiwei/launcher/bean/resp/AppData;)Z
    .locals 1

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method
