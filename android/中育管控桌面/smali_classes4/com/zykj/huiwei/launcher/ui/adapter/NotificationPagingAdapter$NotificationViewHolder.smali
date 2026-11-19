.class public final Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NotificationViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;",
        "binding",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;)V",
        "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
        "item",
        "",
        "b",
        "(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V",
        "Lkotlin/Function0;",
        "callback",
        "c",
        "(Lkotlin/jvm/functions/Function0;)V",
        "a",
        "Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;",
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
.field public final a:Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;->a:Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;->d(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final b(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;->a:Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->setMessageInfo(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;->a:Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;

    .line 7
    .line 8
    new-instance v1, La4/b;

    .line 9
    .line 10
    invoke-direct {v1, p1}, La4/b;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
