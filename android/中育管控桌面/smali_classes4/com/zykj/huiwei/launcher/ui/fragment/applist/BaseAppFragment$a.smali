# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/chad/library/adapter/base/listener/OnItemDragListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->o(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
# RE I/O 写入 JSON（Gson.toJson）。
.method public onItemDragEnd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a;->a:Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getLabel()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/d0;->a()Lcom/blankj/utilcode/util/d0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lcom/google/gson/Gson;

    .line 55
    .line 56
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const-string v0, "SP_APP_SORT_LIST"

    .line 64
    .line 65
    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public onItemDragMoving(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    return-void
.end method

.method public onItemDragStart(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    return-void
.end method
