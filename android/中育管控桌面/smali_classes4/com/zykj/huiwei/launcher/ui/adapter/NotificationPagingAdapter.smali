.class public final Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
        "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;",
        "Landroidx/paging/PagingDataAdapter;",
        "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
        "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;",
        "",
        "",
        "readMessageIdList",
        "<init>",
        "(Ljava/util/List;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "e",
        "(Landroid/view/ViewGroup;I)Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;",
        "holder",
        "position",
        "",
        "c",
        "(Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;I)V",
        "a",
        "Ljava/util/List;",
        "NotificationViewHolder",
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


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "readMessageIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/zykj/huiwei/launcher/callback/MessageInfoDiffCallback;

    .line 7
    .line 8
    invoke-direct {v2}, Lcom/zykj/huiwei/launcher/callback/MessageInfoDiffCallback;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-direct/range {v1 .. v6}, Landroidx/paging/PagingDataAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v1, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->a:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic b(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->d(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;)Lkotlin/Unit;
    .locals 7

    .line 1
    sget-object v0, Lf4/m0;->a:Lf4/m0$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getId()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getParameter()Lcom/zykj/huiwei/launcher/bean/resp/Parameter;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/bean/resp/Parameter;->getId()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getSenderInfo()Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;->getFullName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-nez v5, :cond_2

    .line 31
    .line 32
    :cond_1
    const-string v5, ""

    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getCreationTime()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual/range {v0 .. v6}, Lf4/m0$b;->a(JJLjava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 43
    .line 44
    const-string v1, "itemView"

    .line 45
    .line 46
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 54
    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->setRead(Z)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p1, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getId()J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_3

    .line 75
    .line 76
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->a:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getId()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0
.end method


# virtual methods
.method public c(Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;I)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;->b(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, La4/a;

    .line 18
    .line 19
    invoke-direct {v0, p2, p0, p1}, La4/a;-><init>(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;->c(Lkotlin/jvm/functions/Function0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->c(Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->e(Landroid/view/ViewGroup;I)Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
