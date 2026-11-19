.class public final synthetic La4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/a;->a:Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

    iput-object p2, p0, La4/a;->b:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    iput-object p3, p0, La4/a;->c:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La4/a;->a:Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

    iget-object v1, p0, La4/a;->b:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;

    iget-object v2, p0, La4/a;->c:Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;

    invoke-static {v0, v1, v2}, Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;->b(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter$NotificationViewHolder;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
