.class public final synthetic Lf4/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/i0;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf4/i0;->a:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;->q(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;)V

    return-void
.end method
