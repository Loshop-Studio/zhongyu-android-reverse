.class public final Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/zykj/huiwei/launcher/bean/AvatarItem;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;",
        "Lcom/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/zykj/huiwei/launcher/bean/AvatarItem;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        "<init>",
        "()V",
        "viewHolder",
        "",
        "viewType",
        "",
        "onItemViewHolderCreated",
        "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V",
        "holder",
        "item",
        "f",
        "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/zykj/huiwei/launcher/bean/AvatarItem;)V",
        "",
        "a",
        "J",
        "g",
        "()J",
        "h",
        "(J)V",
        "selectId",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAvatarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarAdapter.kt\ncom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,28:1\n257#2,2:29\n*S KotlinDebug\n*F\n+ 1 AvatarAdapter.kt\ncom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter\n*L\n25#1:29,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const v2, 0x7f0c004f

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v2, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->a:J

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/AvatarItem;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->f(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/zykj/huiwei/launcher/bean/AvatarItem;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/zykj/huiwei/launcher/bean/AvatarItem;)V
    .locals 4

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/databinding/DataBindingUtil;->getBinding(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/HwItemAvatarBinding;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p1, Lcom/zykj/huiwei/launcher/databinding/HwItemAvatarBinding;->ivAvatar:Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    .line 23
    const-string v1, "ivAvatar"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/AvatarItem;->getUrl()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const v2, 0x7f0801b8

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2, v2}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->g(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/HwItemAvatarBinding;->ivChecked:Landroidx/appcompat/widget/AppCompatImageView;

    .line 39
    .line 40
    const-string v0, "ivChecked"

    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->a:J

    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/AvatarItem;->getId()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    cmp-long p2, v0, v2

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    if-nez p2, :cond_0

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move p2, v0

    .line 59
    :goto_0
    if-eqz p2, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/16 v0, 0x8

    .line 63
    .line 64
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public onItemViewHolderCreated(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V
    .locals 0

    .line 1
    const-string p2, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    return-void
.end method
